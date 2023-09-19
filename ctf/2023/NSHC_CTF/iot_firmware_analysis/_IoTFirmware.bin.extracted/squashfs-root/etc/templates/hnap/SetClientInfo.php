HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<?
include "/htdocs/phplib/xnode.php";
include "/htdocs/phplib/trace.php";
include "/htdocs/phplib/inf.php";
include "/htdocs/phplib/phyinf.php";
include "/htdocs/webinc/config.php";
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
$nodebase="/runtime/hnap/SetClientInfo/";
$result="OK";

$dhcps4_lan1 = get("", INF_getinfpath($LAN1)."/dhcps4");
$dhcps4_lan2 = get("", INF_getinfpath($LAN2)."/dhcps4");
$dhcps4_lan1_path = XNODE_getpathbytarget("/dhcps4", "entry", "uid", $dhcps4_lan1, "0");
$dhcps4_lan2_path = XNODE_getpathbytarget("/dhcps4", "entry", "uid", $dhcps4_lan2, "0");
$max_dhcps4_lan1_staticleases = get("", $dhcps4_lan1_path."/staticleases/max");
$max_dhcps4_lan2_staticleases = get("", $dhcps4_lan2_path."/staticleases/max");
$networkid_lan1 = ipv4networkid(INF_getcurripaddr($LAN1), INF_getcurrmask($LAN1));
$networkid_lan2 = ipv4networkid(INF_getcurripaddr($LAN2), INF_getcurrmask($LAN2));
//Remove the original node.
del($dhcps4_lan1_path."/staticleases");
del($dhcps4_lan2_path."/staticleases");
set($dhcps4_lan1_path."/staticleases/max", $max_dhcps4_lan1_staticleases);
set($dhcps4_lan2_path."/staticleases/max", $max_dhcps4_lan2_staticleases);

foreach($nodebase."ClientInfoLists/ClientInfo")
{
	$MacAddr	= get("", "MacAddress");
	$NickName	= get("", "NickName");
	$ReserveIP	= get("", "ReserveIP");
	if($NickName=="" && $ReserveIP=="") continue;
	foreach("/runtime/mydlink/userlist/entry")
	{
		if(PHYINF_macnormalize($MacAddr)==PHYINF_macnormalize(get("", "macaddr")))
		{
			$HostName = get("", "hostname");
			$ipv4addr = get("", "ipv4addr");
			break;
		}	
	}
	$InLAN1 = 0;
	$InLAN2 = 0;
 	if(ipv4networkid($ipv4addr, INF_getcurrmask($LAN1))==$networkid_lan1) $InLAN1=1;
	if(ipv4networkid($ipv4addr, INF_getcurrmask($LAN2))==$networkid_lan2) $InLAN2=2;
	if($InLAN1==1)
	{
		anchor($dhcps4_lan1_path."/staticleases");
		$hostid = ipv4hostid($ReserveIP, INF_getcurrmask($LAN1));
	}
	else if($InLAN2==1)
	{
		anchor($dhcps4_lan2_path."/staticleases");
		$hostid = ipv4hostid($ReserveIP, INF_getcurrmask($LAN2));
	}
	
	if($InLAN1==1 || $InLAN2==1)
	{
		$count = get("", "count");
		if($count == "")$count=1;
		else			$count++;
		if($count <= get("", "max"))
		{
			set("entry:".$count."/uid", "STIP-".$count);
			set("entry:".$count."/macaddr", $MacAddr);
			if($NickName!="" && $ReserveIP!="")
			{
				set("entry:".$count."/enable", "1");
				set("entry:".$count."/description", $NickName);
				set("entry:".$count."/hostname", $HostName);
				set("entry:".$count."/hostid", $hostid);
			}	
			else if($NickName!="")
			{
				set("entry:".$count."/enable", "0");
				set("entry:".$count."/description", $NickName);
			}	
			else if($ReserveIP!="")
			{
				set("entry:".$count."/enable", "1");
				set("entry:".$count."/hostname", $HostName);
				set("entry:".$count."/hostid", $hostid);				
			}
			set("count", $count);
			set("seqno", $count+1);		
		}
	}				
}

fwrite("w",$ShellPath, "#!/bin/sh\n");
fwrite("a",$ShellPath, "echo \"[$0]-->Client Info Changed\" > /dev/console\n");
if($result == "OK")
{

	fwrite("a",$ShellPath, "/etc/scripts/dbsave.sh > /dev/console\n");
	fwrite("a",$ShellPath, "service DHCPS4.LAN-1 restart\n");
	fwrite("a",$ShellPath, "service DHCPS4.LAN-2 restart\n");	
	fwrite("a",$ShellPath, "xmldbc -s /runtime/hnap/dev_status '' > /dev/console\n");
	set("/runtime/hnap/dev_status", "ERROR");
}
else
{
	fwrite("a",$ShellPath, "echo \"We got a error in setting, so we do nothing...\" > /dev/console\n");	
}
?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <SetClientInfoResponse xmlns="http://purenetworks.com/HNAP1/">
      <SetClientInfoResult><?=$result?></SetClientInfoResult>
    </SetClientInfoResponse>
  </soap:Body>
</soap:Envelope>