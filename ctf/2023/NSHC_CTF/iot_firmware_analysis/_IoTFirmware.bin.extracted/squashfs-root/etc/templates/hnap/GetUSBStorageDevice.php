HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<? 
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
include "/htdocs/webinc/config.php";
include "/htdocs/phplib/trace.php";

$dev_entry = "/runtime/webaccess/device/entry";
$result = "OK";

function volume_unit($vol)
{
	$vol_mod = "";
	if($vol > 1000000000000) $vol_mod = "1PB";
	else if ($vol > 1000000000)
	{
		if (substr($vol, strlen($vol)-9, 1) == 0) $vol_mod = substr($vol, 0, strlen($vol)-9)."TB";
		else $vol_mod = substr($vol, 0, strlen($vol)-9).".".substr($vol, strlen($vol)-9, 1)."TB";
	}
	else if ($vol > 1000000)
	{
		if (substr($vol, strlen($vol)-6, 1) == 0) $vol_mod = substr($vol, 0, strlen($vol)-6)."GB";
		else $vol_mod = substr($vol, 0, strlen($vol)-6).".".substr($vol, strlen($vol)-6, 1)."GB";
	}
	else if ($vol > 1000)
	{
		if (substr($vol, strlen($vol)-3, 1) == 0) $vol_mod = substr($vol, 0, strlen($vol)-3)."MB";
		else $vol_mod = substr($vol, 0, strlen($vol)-3).".".substr($vol, strlen($vol)-3, 1)."MB";
	}
	else if ($vol < 1000 && $vol > 1) $vol_mod = $vol."KB";
	else if ($vol < 1) $vol_mod = "<1KB";
	return $vol_mod;
}
?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"> 
	<soap:Body>
		<GetUSBStorageDeviceResponse xmlns="http://purenetworks.com/HNAP1/">
			<GetUSBStorageDeviceResult><?=$result?></GetUSBStorageDeviceResult >
			<StorageDeviceInfoLists>
				<? 
				foreach($dev_entry)
				{
					$device = get("x", "entry/uniquename");
					$space_size = get("x", "entry/space/size");
					$space_available = get("x", "entry/space/available");
					$total_space = volume_unit($space_size);
					$free_space = volume_unit($space_available);
					
					echo "				<StorageDevice> \n";
					echo "					<Device>".$device."</Device>\n";
					echo "					<TotalSpace>".$total_space."</TotalSpace>\n";
					echo "					<FreeSpace>".$free_space."</FreeSpace>\n";
					echo "				</StorageDevice>\n";
				}
				?>
			</StorageDeviceInfoLists>
		</GetUSBStorageDeviceResponse>
	</soap:Body>
</soap:Envelope>