<?
/* setup defaultvalue for mfc mode, Sammy */

include "/htdocs/phplib/xnode.php";
include "/htdocs/phplib/trace.php";
include "/htdocs/webinc/config.php";

setattr("/runtime/mfcmode", "get", "devdata get -e mfcmode");
$mfcmode=get("x", "/runtime/mfcmode");
del("/runtime/mfcmode");

if($mfcmode=="1")
{
	$value="0";
	$WLAN1_CHANNEL = "6";
	$WLAN2_CHANNEL = "161";
	
	if($LAN1=="") 		$LAN1  = "LAN-1";
	if($BRIDGE1=="")	$BRIDGE1 = "BRIDGE-1";
	if($ETH1=="") 		$ETH1 = "ETH-1";
	if($WLAN1=="") 		$WLAN1 = "BAND24G-1.1";
	if($WLAN2=="") 		$WLAN2 = "BAND5G-1.1";
	
	TRACE_debug("setup defaultvalue for mfc mode-->START");
	
	anchor("/device/time");
	set("ntp/enable",$value);
	set("ntp6/enable",$value);
	
	anchor("/device/passthrough");
	set("ipv6",$value);
	set("pppoe",$value);
	set("ipsec",$value);
	set("pptp",$value);
	set("rtsp",$value);
	set("sip",$value);
	
	anchor("/device/multicast");
	set("igmpproxy",$value);
	set("wifienhance",$value);
	set("mldproxy",$value);
	set("wifienhance6",$value);
	
	set("/device/features/easysetup",$value);
	set("/device/mdnsresponder/enable",$value);
	
	//active only LAN-1 and BRIDGE-1
	foreach("/inf")
	{
		$uid=get("","uid");
		if($uid!=$LAN1 && $uid!=$BRIDGE1)
		{
			TRACE_debug("uid=".$uid." set [active] to ".$value);
			set("active",$value);
		}
		else if($uid==$LAN1)
		{
			TRACE_debug("uid=".$uid." set [hnap neap nameresolve stunnel] to ".$value);
			set("hnap",$value);		
			set("neap",$value);
			set("nameresolve",$value);
			set("stunnel",$value);		
		}
		else	{TRACE_debug("uid=".$uid." do nothing..");}
	}
	
	//active only ETH-1 and wireless
	foreach("/phyinf")
	{
		$uid=get("","uid");
		if($uid!=$ETH1 && $uid!=$WLAN1 && $uid!=$WLAN2)
		{
			TRACE_debug("uid=".$uid." set [active] to ".$value);
			set("active",$value);
		}
		else if($uid==$WLAN1) //set 2.4G channel
		{
			TRACE_debug("uid=".$uid." set [media/channel] to ".$WLAN1_CHANNEL);
			set("media/channel",$WLAN1_CHANNEL);
		}
		else if($uid==$WLAN2) //set 5G channel
		{
			TRACE_debug("uid=".$uid." set [media/channel] to ".$WLAN2_CHANNEL);
			set("media/channel",$WLAN2_CHANNEL);
		}
		else	{TRACE_debug("uid=".$uid." do nothing..");}
	}
	
	set("/upnpav/dms/active",$value);
	set("/itunes/server/active",$value);
	set("/webaccess/enable",$value);
	
	TRACE_debug("setup defaultvalue for mfc mode-->END");
}
else
{
	TRACE_error("[default_mfc.php] error not in mfc mode!");
}
?>
