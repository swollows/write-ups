HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<? 
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
include "/htdocs/phplib/xnode.php";
include "/htdocs/webinc/config.php";
include "/htdocs/phplib/trace.php"; 
include "/htdocs/phplib/phyinf.php";
include "/htdocs/phplib/inf.php"; 
$result = "OK";

function find_dhcps4_staticleases_info($mac, $getinfo)
{
	include "/htdocs/webinc/config.php";
	foreach("/dhcps4/entry")
	{
		$dhcps4_name = get("", "uid");
		foreach("staticleases/entry")
		{
			if(PHYINF_macnormalize($mac)==PHYINF_macnormalize(get("", "macaddr")))
			{
				if($getinfo=="nickname")	
				{return get("", "description");}
				else if($getinfo=="reserveip" && get("", "hostid")!="")
				{
					if($dhcps4_name==get("", INF_getinfpath($LAN1)."/dhcps4"))
					{return ipv4ip(INF_getcurripaddr($LAN1), INF_getcurrmask($LAN1), get("", "hostid"));}
					else
					{return	ipv4ip(INF_getcurripaddr($LAN2), INF_getcurrmask($LAN2), get("", "hostid"));}					
				}
			}
		}	
	}
	return "";
}

function get_clientpath($mac)
{
	include "/htdocs/webinc/config.php";
	$LAN=$LAN1;
	while($LAN != "")
	{		
		$path = XNODE_getpathbytarget("/runtime", "inf", "uid", $LAN, 0);
		foreach($path."/dhcps4/leases/entry")
		{
			if(PHYINF_macnormalize($mac)==PHYINF_macnormalize(get("", "macaddr")))
			{return $path."/dhcps4/leases/entry:".$InDeX;}
		}
					
		if($LAN==$LAN1)	{$LAN = $LAN2;}
		else			{$LAN = "";} 
	}
	//Find static arp.
	foreach("/runtime/mydlink/userlist/entry")
	{
		if(PHYINF_macnormalize($mac)==PHYINF_macnormalize(get("", "macaddr")))
		{return "/runtime/mydlink/userlist/entry:".$InDeX;}
	}	
	return "";
}

setattr("/runtime/getclientsinfo/brctl_show", "get", "brctl show > /var/brctl_show");
setattr("/runtime/getclientsinfo/brctl_showmacs_br1", "get", "brctl showmacs br1 > /var/brctl_showmacs_br1");
setattr("/runtime/getclientsinfo/brctl_showmacs_br0", "get", "brctl showmacs br0 > /var/brctl_showmacs_br0");
get("s", "/runtime/getclientsinfo/brctl_show");
get("s", "/runtime/getclientsinfo/brctl_showmacs_br1");
get("s", "/runtime/getclientsinfo/brctl_showmacs_br0");
$brctl_show = fread("s", "/var/brctl_show");
$brctl_showmacs_br1 = fread("s", "/var/brctl_showmacs_br1");
$brctl_showmacs_br0 = fread("s", "/var/brctl_showmacs_br0");
unlink("/var/brctl_show");
unlink("/var/brctl_showmacs_br1");
unlink("/var/brctl_showmacs_br0");
$wlan1_name		= PHYINF_getifname($WLAN1);
$wlan1_gz_name	= PHYINF_getifname($WLAN1_GZ);
$wlan2_name		= PHYINF_getifname($WLAN2);
$wlan2_gz_name	= PHYINF_getifname($WLAN2_GZ);
TRACE_debug("$wlan1_name=".$wlan1_name."\n$wlan1_gz_name=".$wlan1_gz_name."\n$wlan2_name=".$wlan2_name."\n$wlan2_gz_name=".$wlan2_gz_name);

$tailindex	= strstr($brctl_show, "\n")+1;
$tablelen	= strlen($brctl_show);
$line		= substr($brctl_show, $tailindex, $tablelen-$tailindex);
while($line != "")
{
	$tailindex	= strstr($line, "\n")+1;
	$subline	= substr($line, 0, $tailindex);
	$interface	= scut($subline, 3, "");
	if($interface==""){$interface = scut($subline, 0, "");}	
	TRACE_debug("$interface=".$interface);
	
	if($interface == $wlan1_name)			{$br_type = "WiFi_2.4G";}
	else if($interface == $wlan1_gz_name)	{$br_type = "WiFi_2.4G_Guest";}
	else if($interface == $wlan2_name)		{$br_type = "WiFi_5G";}
	else if($interface == $wlan2_gz_name)	{$br_type = "WiFi_5G_Guest";}
	else									{$br_type = "LAN";}
	TRACE_debug("$br_type=".$br_type);
	
	if(strstr($subline, "br1")!="")						{$br1_p1_type = $br_type;$br="br1";}
	else if(strstr($subline, "br0")=="" && $br=="br1")	{$br1_p2_type = $br_type;}
	else if(strstr($subline, "br0")!="")				{$br0_p1_type = $br_type;$br="br0";}
	else if($br=="br0" && $br0_p2_type=="")				{$br0_p2_type = $br_type;}
	else if($br=="br0" && $br0_p3_type=="")				{$br0_p3_type = $br_type;}
	
	$tablelen	= strlen($line);
	$line		= substr($line, $tailindex, $tablelen-$tailindex);
}
TRACE_debug("$br1_p1_type=".$br1_p1_type."\n $br1_p2_type=".$br1_p2_type."\n $br0_p1_type=".$br0_p1_type."\n $br0_p2_type=".$br0_p2_type."\n $br0_p3_type=".$br0_p3_type);
?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
<soap:Body>
<GetClientInfoResponse xmlns="http://purenetworks.com/HNAP1/">
	<GetClientInfoResult><?=$result?></GetClientInfoResult>
		<ClientInfoLists>
		<?
		$i=0;
		while($i < 2)
		{
			if($i==0)	{$brctl_showmacs = $brctl_showmacs_br0;$br="br0";}
			else		{$brctl_showmacs = $brctl_showmacs_br1;$br="br1";}
			
			$tailindex	= strstr($brctl_showmacs, "\n")+1;
			$portindex	= 2;
			$macindex	= strstr($brctl_showmacs, "mac addr")-4;
			$maclen     = strlen("00:00:00:00:00:00");
			$tablelen	= strlen($brctl_showmacs);
			$line		= substr($brctl_showmacs, $tailindex, $tablelen-$tailindex);			
			
			while($line != "")
			{
				$tailindex	= strstr($line, "\n")+1;
				$subline	= substr($line, 0, $tailindex);
				if(strstr($subline, "no")!="") //It means not in local.
				{
					$mac			= strip(substr($subline, $macindex, $maclen));
					$client_path	= get_clientpath($mac);
					TRACE_debug("$client_path=".$client_path);
					$ipaddr			= get("", $client_path."/ipaddr");
					if($ipaddr==""){$ipaddr	= get("", $client_path."/ipv4addr");}
					$hostname		= get("x", $client_path."/hostname");
					$portnumber		= substr($subline, 2, 1);
					if($br=="br1" && $portnumber==1)		{$type=$br1_p1_type;}
					else if($br=="br1" && $portnumber==2)	{$type=$br1_p2_type;} 
					else if($br=="br0" && $portnumber==1)	{$type=$br0_p1_type;}					
					else if($br=="br0" && $portnumber==2)	{$type=$br0_p2_type;} 
					else if($br=="br0" && $portnumber==3)	{$type=$br0_p3_type;}
					$nickname = find_dhcps4_staticleases_info($mac, "nickname");
					$reserveip = find_dhcps4_staticleases_info($mac, "reserveip");					
										
					echo "	<ClientInfo>\n";
					echo "		<MacAddress>".$mac."</MacAddress>\n";
					echo "		<IPv4Address>".$ipaddr."</IPv4Address>\n";
					echo "		<IPv6Address>".""."</IPv6Address>\n"; //todo, Sammy
					echo "		<Type>".$type."</Type>\n";
					echo "		<DeviceName>".$hostname."</DeviceName>\n";
					echo "		<NickName>".$nickname."</NickName>\n";
					echo "		<ReserveIP>".$reserveip."</ReserveIP>\n";					
					echo "	</ClientInfo>\n";					
				}	
				
				$tablelen	= strlen($line);
				$line		= substr($line, $tailindex, $tablelen-$tailindex);							
			}
			$i++;
		}
		?></ClientInfoLists>
</GetClientInfoResponse>
</soap:Body>
</soap:Envelope>
