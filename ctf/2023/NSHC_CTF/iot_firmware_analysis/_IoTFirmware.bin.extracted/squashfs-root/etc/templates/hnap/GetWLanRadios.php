HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<? 
echo "<"."?";?>xml version="1.0" encoding="utf-8"<? echo "?".">";
include "/htdocs/phplib/xnode.php"; 
include "/htdocs/webinc/config.php";
include "/htdocs/webinc/feature.php";
include "/htdocs/phplib/wifi.php";
$path_phyinf_wlan1 = XNODE_getpathbytarget("", "phyinf", "uid", $WLAN1, 0);
$path_phyinf_wlan2 = XNODE_getpathbytarget("", "phyinf", "uid", $WLAN2, 0);
?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <GetWLanRadiosResponse xmlns="http://purenetworks.com/HNAP1/">
		<GetWLanRadiosResult>OK</GetWLanRadiosResult>
		<RadioInfos>
		<?if($path_phyinf_wlan1==""){echo "<!--";}?>
			<RadioInfo>
			<RadioID>2.4GHZ</RadioID>
			<Frequency>2</Frequency>
			<SupportedModes>
				<string>802.11b</string>
				<string>802.11g</string>
				<string>802.11n</string>
				<string>802.11bg</string>
				<string>802.11gn</string>
				<string>802.11bgn</string>
			</SupportedModes>
			<Channels><?
			echo "\n";
			$clist = WIFI_getchannellist("g");
			$count = cut_count($clist, ",");
			$i = 0;
			while($i < $count)
			{
				$channel = cut($clist, $i, ',');
				echo "\t\t\t\t<int>".$channel."</int>";
				$i++;
				if($i < $count) echo "\n";
			}?>
			</Channels>
			<WideChannels>
			<?
			$bandwidth = query($path_phyinf_wlan1."/media/dot11n/bandwidth");     			
			if ($bandWidth != "20")
			{
				$startChannel = 3;
				while( $startChannel <= 9 )
				{
					echo "<WideChannel>\n";
					echo "	<Channel>".$startChannel."</Channel>\n";
					echo "	<SecondaryChannels>\n";
					$secondaryChnl = $startChannel - 2;
					echo "		<int>".$secondaryChnl."</int>\n";	
					$secondaryChnl = $startChannel + 2;
					echo "		<int>".$secondaryChnl."</int>\n";
					echo "	</SecondaryChannels>\n";
					echo "</WideChannel>\n";	
					$startChannel++;	
				}
			}
			?>
			</WideChannels>
			<SupportedSecurity>
				<SecurityInfo>
					<SecurityType>WEP-OPEN</SecurityType>
					<Encryptions>
						<string>WEP-64</string>
						<string>WEP-128</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WEP-SHARED</SecurityType>
					<Encryptions>
						<string>WEP-64</string>
						<string>WEP-128</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPA-PSK</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPA-RADIUS</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPA2-PSK</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPA2-RADIUS</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPAORWPA2-PSK</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPAORWPA2-RADIUS</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
			</SupportedSecurity>
			</RadioInfo>
			<?if($path_phyinf_wlan1==""){echo "-->";}?>
			<?if($path_phyinf_wlan2==""){echo "<!--";}?>
			<RadioInfo>
			<RadioID>5GHZ</RadioID>
			<Frequency>5</Frequency>
			<SupportedModes>
				<string>802.11a</string>
				<string>802.11n</string>
				<string>802.11an</string><?
				if($FEATURE_NOACMODE=="0")
				{
					echo "\n";
					echo "\t\t\t\t<string>802.11ac</string>\n";
					echo "\t\t\t\t<string>802.11acn</string>\n";
					echo "\t\t\t\t<string>802.11acna</string>";
				}?>
			</SupportedModes>
			<Channels><?
			echo "\n";
			$clist = WIFI_getchannellist("a");
			$count = cut_count($clist, ",");
			$i = 0;
			while($i < $count)
			{
				$channel = cut($clist, $i, ',');
				echo "\t\t\t\t<int>".$channel."</int>";
				$i++;
				if($i < $count) echo "\n";
			}?>
			</Channels>
			<WideChannels>
			<?
			$bandwidth = query($path_phyinf_wlan2."/media/dot11n/bandwidth");     			
			if ($bandWidth != "20")
			{
				$startChannel = 44;
				while( $startChannel <= 56 )
				{
					echo "<WideChannel>\n";
					echo "	<Channel>".$startChannel."</Channel>\n";
					echo "	<SecondaryChannels>\n";
					$secondaryChnl = $startChannel - 8;
					echo "		<int>".$secondaryChnl."</int>\n";	
					$secondaryChnl = $startChannel + 8;
					echo "		<int>".$secondaryChnl."</int>\n";
					echo "	</SecondaryChannels>\n";
					echo "</WideChannel>\n";	
					$startChannel=$startChannel+4;	
				}
				echo "<WideChannel>\n";
		    	echo "	<Channel>157</Channel>\n";
				echo "	<SecondaryChannels>\n";
				echo "		<int>149</int>\n";	
				echo "		<int>165</int>\n";
				echo "	</SecondaryChannels>\n";
				echo "</WideChannel>\n";
			}
			?>
			</WideChannels>
			<SupportedSecurity>
				<SecurityInfo>
					<SecurityType>WEP-OPEN</SecurityType>
					<Encryptions>
						<string>WEP-64</string>
						<string>WEP-128</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WEP-SHARED</SecurityType>
					<Encryptions>
						<string>WEP-64</string>
						<string>WEP-128</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPA-PSK</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPA-RADIUS</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPA2-PSK</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPA2-RADIUS</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPAORWPA2-PSK</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
				<SecurityInfo>
					<SecurityType>WPAORWPA2-RADIUS</SecurityType>
					<Encryptions>
						<string>TKIP</string>
						<string>AES</string>
						<string>TKIPORAES</string>
					</Encryptions>
				</SecurityInfo>
			</SupportedSecurity>
			</RadioInfo>
			<?if($path_phyinf_wlan2==""){echo "-->";}?>
		</RadioInfos>
    </GetWLanRadiosResponse>
  </soap:Body>
</soap:Envelope>
