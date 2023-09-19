<?
$FEATURE_NOSCH = 0;			/* if this model doesn't support scheudle, set it as 1. */
$FEATURE_NOPPTP = 0;		/* if this model doesn't support PPTP, set it as 1. */
$FEATURE_NOL2TP = 0;		/* if this model doesn't support L2TP, set it as 1.*/

if(query("/runtime/devdata/countrycode")=="RU")
{
	$FEATURE_NORUSSIAPPTP = 0;	/* if this model doesn't support Russia PPTP, set it as 1.*/
	$FEATURE_NORUSSIAPPPOE = 0;	/* if this model doesn't support Russia PPPoE, set it as 1. */
	$FEATURE_NORUSSIAL2TP = 0; 	/* if this model doesn't support Russia L2TP, set it as 1. */		
}
else
{
	$FEATURE_NORUSSIAPPTP = 1;	/* if this model doesn't support Russia PPTP, set it as 1.*/
	$FEATURE_NORUSSIAPPPOE = 1;	/* if this model doesn't support Russia PPPoE, set it as 1. */
	$FEATURE_NORUSSIAL2TP = 1; 	/* if this model doesn't support Russia L2TP, set it as 1. */
}

if(query("/runtime/devdata/countrycode") == "CN")
{       
	 $FEATURE_DLINK_COM_CN = 1; /* if this model supports dlink.com.cn, set it as 1. */
	 $FEATURE_ORAY = 1; /* if this model supports ORAY, set it as 1. */
	 $FEATURE_CHINA_SPECIAL_WAN = 1; /* if this model supports China special wan, set it as 1. */
	 $FEATURE_DHCPPLUS = 1; /* if this model supports DHCP+, set it as 1. */
	 $FEATURE_CHINA = 1;
}
else
{
	 $FEATURE_DLINK_COM_CN = 0;
	 $FEATURE_ORAY= 0;
	 $FEATURE_CHINA_SPECIAL_WAN = 0;
	 $FEATURE_DHCPPLUS = 0;
	 $FEATURE_CHINA = 0;
}

$FEATURE_NOEASYSETUP = 0;	/* if this model has no easy setup page, set it as 1. */
$FEATURE_NOIPV6 = 0;	/* if this model has no IPv6, set it as 1. */
$FEATURE_NOAPMODE = 1; /* if this model has no access point mode, set it as 1. */
$FEATURE_HAVEBGMODE = 0; /* if this model has bridge mode, set it as 1.*/
$FEATURE_INBOUNDFILTER = 1;	/* if this model has inbound filter, set it as 1.*/
$FEATURE_DUAL_BAND = 1;		/* if this model has 5 Ghz, set it as 1.*/
$FEATURE_NOACMODE = 0; /* if this model has no wireless ac mode, set it as 1.*/
$FEATURE_NOGUESTZONE = 0;
$FEATURE_NODSLITE = 0; /* if this model has no DS-Lite, set it as 1.*/
$FEATURE_NATENDPOINT = 0; /* if this model has NAT Endpoint, set it as 1.*/
$FEATURE_ANTENNA_24G = 2T2R; /* Set 2.4G antenna type */
$FEATURE_ANTENNA_5G = 1T1R;	/* Set 5G antenna type */
?>
