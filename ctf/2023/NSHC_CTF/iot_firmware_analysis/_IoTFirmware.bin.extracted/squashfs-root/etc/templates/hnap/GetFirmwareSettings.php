HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<? echo "<"."?";?>xml version="1.0" encoding="utf-8"<? echo "?".">";?>
<?
	$builddaytime = get("", "/runtime/device/firmwarebuilddaytime");
	$FirmwareDate = scut($builddaytime,0,"")."-".scut($builddaytime,1,"")."-".scut($builddaytime,2,"")."T".scut($builddaytime,3,"").":".scut($builddaytime,4,"").":"."00";
?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	<soap:Body>
		<GetFirmwareSettingsResponse xmlns="http://purenetworks.com/HNAP1/">
			<GetFirmwareSettingsResult>OK</GetFirmwareSettingsResult>
			<VendorName><? echo get("", "/runtime/device/vendor");?></VendorName>
			<ModelName><? echo get("", "/runtime/device/modelname");?></ModelName>			
			<ModelRevision><? echo get("", "/runtime/device/hardwareversion");?></ModelRevision>
			<FirmwareVersion><? echo get("", "/runtime/device/firmwareversion");?>, <? echo get("", "/runtime/device/firmwarebuilddate");?></FirmwareVersion>
			<FirmwareDate><? echo $FirmwareDate;?></FirmwareDate>
			<UpdateMethods>HNAP_UPLOAD</UpdateMethods>			
		</GetFirmwareSettingsResponse>
	</soap:Body>
</soap:Envelope>
