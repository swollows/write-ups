HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<?
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
include "/htdocs/phplib/trace.php";
include "/htdocs/phplib/xnode.php";
include "/htdocs/webinc/config.php";

//$WLAN_supported_mode = "WirelessRouter,WirelessAp";
$WLAN_supported_mode = "WirelessRouter";
//$WLAN_supported_mode = "WirelessRouter,WirelessRepeaterExtender";

function getWLANBand ($WLANID)
{
	$path_phyinf = XNODE_getpathbytarget("", "phyinf", "uid", $WLANID, 0);
	$freq = query ($path_phyinf."/media/freq");
	if($freq=="24") $freq ="2.4";
	return $freq;
}
function echoWLANSupportedMode ($WLAN_supported_mode)
{
	echo "\t\t\t\t\<SupportedMode\>\n";

	$mode_number = cut_count($WLAN_supported_mode, ",");
	$mode_counter = 0;
	while ($mode_counter < $mode_number)
	{
		echo "\t\t\t\t\t\<string\>".cut($WLAN_supported_mode, $mode_counter, ",")."\</string\>\n";
		$mode_counter ++;
	}

	echo "\t\t\t\t\</SupportedMode\>\n";

}

$WLAN1_band = getWLANBand($WLAN1);
if ($WLAN1_band != "")
{
	$RadioID1 = "RADIO_".$WLAN1_band."GHz";
	$WirelessMode1 = "WirelessRouter";
}

$WLAN1_GZ_band = getWLANBand($WLAN1_GZ);
if ($WLAN1_GZ_band != "")
{
	$RadioID1_GZ = "RADIO_".$WLAN1_GZ_band."G_Guest";
	$WirelessMode1_GZ = "WirelessRouter";
}

$WLAN2_band = getWLANBand($WLAN2);
if ($WLAN2_band != "")
{
	$RadioID2 = "RADIO_".$WLAN2_band."GHz";
	$WirelessMode2 = "WirelessRouter";
}

$WLAN2_GZ_band = getWLANBand($WLAN2_GZ);
if ($WLAN2_GZ_band != "")
{
	$RadioID2_GZ = "RADIO_".$WLAN2_GZ_band."G_Guest";
	$WirelessMode2_GZ = "WirelessRouter";
}

?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	<soap:Body>
		<GetWirelessModeResponse xmlns="http://purenetworks.com/HNAP1/">
			<GetWirelessModeResult>OK</GetWirelessModeResult>
			<WirelessModeList>
<?
if ($RadioID1 != "")
{
	echo "\t\t\t\<WirelessModeInfo\>\n";

	echo "\t\t\t\t\<RadioID\>".$RadioID1."\</RadioID\>\n";
	echo "\t\t\t\t\<WirelessMode\>".$WirelessMode1."\</WirelessMode\>\n";

	echoWLANSupportedMode($WLAN_supported_mode);

	echo "\t\t\t\</WirelessModeInfo\>\n";
}
if ($RadioID1_GZ != "")
{
	echo "\t\t\t\<WirelessModeInfo\>\n";

	echo "\t\t\t\t\<RadioID\>".$RadioID1_GZ."\</RadioID\>\n";
	echo "\t\t\t\t\<WirelessMode\>".$WirelessMode1_GZ."\</WirelessMode\>\n";

	echoWLANSupportedMode($WLAN_supported_mode);

	echo "\t\t\t\</WirelessModeInfo\>\n";
}
if ($RadioID2 != "")
{
	echo "\t\t\t\<WirelessModeInfo\>\n";

	echo "\t\t\t\t\<RadioID\>".$RadioID2."\</RadioID\>\n";
	echo "\t\t\t\t\<WirelessMode\>".$WirelessMode2."\</WirelessMode\>\n";

	echoWLANSupportedMode($WLAN_supported_mode);

	echo "\t\t\t\</WirelessModeInfo\>\n";
}
if ($RadioID2_GZ != "")
{
	echo "\t\t\t\<WirelessModeInfo\>\n";

	echo "\t\t\t\t\<RadioID\>".$RadioID2_GZ."\</RadioID\>\n";
	echo "\t\t\t\t\<WirelessMode\>".$WirelessMode2_GZ."\</WirelessMode\>\n";

	echoWLANSupportedMode($WLAN_supported_mode);

	echo "\t\t\t\</WirelessModeInfo\>\n";
}


?>
			</WirelessModeList>
		</GetWirelessModeResponse>
	</soap:Body>
</soap:Envelope>
