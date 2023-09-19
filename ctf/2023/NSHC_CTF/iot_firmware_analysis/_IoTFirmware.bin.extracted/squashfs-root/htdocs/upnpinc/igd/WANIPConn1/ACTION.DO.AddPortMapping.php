<? /* vi: set sw=4 ts=4: */
include "/htdocs/phplib/xnode.php";
include "/htdocs/phplib/trace.php";
include "/htdocs/phplib/inet.php";

function check_portfw_range($port, $port_list)
{
    if($port_list=="")
        {return 0;}
    $cnt = cut_count($port_list, ",");
    $idx = 0;
    while ($idx <= $cnt)
    {
        if($idx > 0)
            {$t_port = cut($port_list,$idx,",");}
        else
            {$t_port=$port_list;}
        if($port==$t_port)
            {return 1;}
        else if (cut_count($t_port, "-") > 1)
        {
            $t_port_s = cut($t_port,0,"-");
            $t_port_e = cut($t_port,1,"-");

            if(strtoul($port, 10) >= strtoul($t_port_s, 10))
            {
                if(strtoul($port, 10) <= strtoul($t_port_e, 10))
                    {return 1;}
            }
        }
        $idx++;
    }
    return 0;
}

function check_port_conflict($port, $protocol)  //check public_ds_port conflict with Portforward or VirtualServer
{                                                   
    $pwd_count=query("/nat/entry/portforward/entry#");
    //check port forwarding
    foreach("/nat/entry/portforward/entry")           
    {                                                 
          if(query("enable")=="1")
          {
              if($protocol=="TCP")
                  {$port_str="tport_str";}
              else
                  {$port_str="uport_str";}
              if(check_portfw_range($port, query($port_str))=="1")
              {
                  return 1;
              }
          }                
    }
    //check virtual srever
    foreach("/nat/entry/virtualserver/entry")
    {                                        
        if(query("enable")=="1")             
        {
            $vs_prot=query("protocol");
            if(query("external/start")==$port && strstr($vs_prot, $protocol) != "")
            {
                return 1;                     
            }            
        }    
    }
    if($protocol=="TCP")
    {
        //check remote management
        $infp = XNODE_getpathbytarget("", "inf", "uid", "WAN-1", 0);
        if(query($infp."/web")==$port || query($infp."/https_rport")==$port)
        {
            return 1;
        }
        //check webfileaccess
        if(query("/webaccess/httpport")==$port || query("/webaccess/httpsport")==$port)
        {
            return 1;
        }
        //check webfileaccess UPNP external port
        foreach("/runtime/webaccess/portmapping/entry")
			  {
						$externalport	= query("externalport");
						if($externalport == $port)
						{
							TRACE_debug("AddPortMapping.php: match webfileaccess externalport ".$externalport." exist");			
							return 1;
						}          
			  }
    }
    return 0;                              
}

if (query("/runtime/device/layout")!="router")
{
	$_GLOBALS["errorCode"]=501;
}
else
{
	anchor($_GLOBALS["ACTION_NODEBASE"]."/AddPortMapping");
	$NewRemoteHost				= query("NewRemoteHost");
	$NewExternalPort			= query("NewExternalPort");
	$NewProtocol				= query("NewProtocol");
	$NewInternalPort			= query("NewInternalPort");
	$NewInternalClient			= query("NewInternalClient");
	$NewEnabled					= query("NewEnabled");
	$NewPortMappingDescription	= query("NewPortMappingDescription");
	$NewLeaseDuration			= query("NewLeaseDuration");
    
	if($NewExternalPort=="" || isdigit($NewExternalPort)==0)	
	{
		$_GLOBALS["errorCode"]=716;
	}
	else if ($NewInternalPort !="" && isdigit($NewInternalPort)==0 ) 
	{
		$_GLOBALS["errorCode"]=402;
	}
	else if ($NewProtocol=="" || $NewInternalClient=="" || INET_validv4addr($NewInternalClient)==0)
	{
		$_GLOBALS["errorCode"]=402;
	}
	else if (check_port_conflict($NewExternalPort, $NewProtocol)!="0")
	{
	    $_GLOBALS["errorCode"]=715;
	}
	else
	{
		$done = 0;
		$_GLOBALS["errorCode"]=200;

		if ($NewInternalPort=="")	$NewInternalPort = $NewExternalPort;
		if ($NewProtocol=="TCP")	$proto = "TCP";
		else						$proto = "UDP";
		foreach ("/runtime/upnpigd/portmapping/entry")
		{
			/* if exist, update the description. */
			if ($NewRemoteHost == query("remotehost") && $NewExternalPort == query("externalport") && 
				$proto == query("protocol"))
			{
				$_GLOBALS["errorCode"]=718;
				$done = 1;
			}
			/* XBOX test wish us to report OK, if the reule is existing. */
			if ($proto				== query("protocol") && 
				$NewRemoteHost		== query("remotehost") && 
				$NewInternalClient	== query("internalclient") &&
				$NewInternalPort	== query("internalport") &&
				$NewExternalPort	== query("externalport"))
			{
				if ($NewPortMappingDescription != query("description"))
				{
					set("description", $NewPortMappingDescription);
				}
				$_GLOBALS["errorCode"]=200;
				$done = 1;
			}
			if ($done == 1) break;
		}
		if ($NewLeaseDuration != "" && $NewLeaseDuration > 0)
		{
			$_GLOBALS["errorCode"] = 725;
			$done = 1;
		}
		if ($done == 0)
		{
			$newentry = XNODE_add_entry("/runtime/upnpigd/portmapping", "PORTMAP");
			anchor($newentry);
			set("enable",			$NewEnabled);
			set("protocol",			$proto);
			set("remotehost",		$NewRemoteHost);
			set("externalport",		$NewExternalPort);
			set("internalport",		$NewInternalPort);
			set("internalclient",	$NewInternalClient);
			set("description",		$NewPortMappingDescription);
			set("leaseduration",	$NewLeaseDuration);

			if ($NewRemoteHost != "")	$sourceip = ' -s "'.$NewRemoteHost.'"';
			else						$sourceip = '';
			if ($proto == "TCP")		$proto = " -p tcp";
			else						$proto = " -p udp";
			if ($NewEnabled == 1)
			{
				$cmd =	'iptables -t nat -A DNAT.UPNP'.$proto.' --dport '.$NewExternalPort.
						' -j DNAT --to-destination "'.$NewInternalClient.'":'.$NewInternalPort;

				SHELL_info("a", $_GLOBALS["SHELL_FILE"], "UPNP:".$cmd);
				fwrite("a", $_GLOBALS["SHELL_FILE"], $cmd."\n");
			}
		}
	}
}
?>
