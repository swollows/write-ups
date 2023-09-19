HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<?
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
include "/htdocs/phplib/xnode.php";
include "/htdocs/phplib/trace.php";
include "/htdocs/webinc/config.php";

$result = "OK";

$default_language = query ("/device/features/language");

?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	<soap:Body>
		<GetLanguageDefaultSettingResponse xmlns="http://purenetworks.com/HNAP1/">
			<GetLanguageDefaultSettingResult><? echo $result; ?></GetLanguageDefaultSettingResult>
			<GetLanguageDefaultSetting><? echo $default_language;  ?></GetLanguageDefaultSetting>
		</GetLanguageDefaultSettingResponse>
	</soap:Body>
</soap:Envelope>
