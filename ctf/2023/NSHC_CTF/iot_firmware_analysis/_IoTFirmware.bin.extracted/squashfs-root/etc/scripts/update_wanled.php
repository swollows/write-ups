<?
//this script needs argument EVENT, we need this to control WAN LED

include "/htdocs/phplib/xnode.php";

echo "#!/bin/sh\n";

function wan_has_ip()
{
	$wan_inf = XNODE_getpathbytarget("/runtime", "inf", "uid", "WAN-1", 0);
	if($wan_inf == "")
		return 0;

	$addrtype = get("x", $wan_inf."/inet/addrtype");
	$ipaddr = "";

	if($addrtype == "ppp4")
	{
		$ipaddr = get("x", $wan_inf."/inet/ppp4/local");
	}

	if($addrtype == "ipv4")
	{
		$ipaddr = get("x", $wan_inf."/inet/ipv4/ipaddr");
	}

	if($ipaddr == "")
	{
		return 0;
	}
	else
	{
		return 1;
	}
}

if($EVENT == "WAN_CONNECTED")
{
	echo "wan_port_status=`psts -i 4`\n";
	echo "if [ \"$wan_port_status\" != \"\" ]; then\n";
	echo "usockc /var/gpio_ctrl INET_ON\n";
	echo "fi\n";
}

if($EVENT == "WAN_DISCONNECTED")
{
	echo "usockc /var/gpio_ctrl INET_OFF\n";
}

if($EVENT == "WAN_PPP_ONDEMAN")
{
	echo "usockc /var/gpio_ctrl INET_BLINK_SLOW\n";
}

if($EVENT == "WAN_LINKUP")
{
	if(wan_has_ip() != 0)
	{
		echo "usockc /var/gpio_ctrl INET_ON\n";
	}
}

if($EVENT == "WAN_LINKDOWN")
{
	echo "usockc /var/gpio_ctrl INET_OFF\n";
}

?>
