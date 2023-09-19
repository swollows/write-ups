HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<?
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
include "/htdocs/phplib/xnode.php";

$result="OK";

if(isfile("/mydlink/version")=="1")
{
	$SupportMyDLink = "true";
}
else
{
	$SupportMyDLink = "false";
}
?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
<soap:Body>
<GetMyDLinkSupportStatusResponse xmlns="http://purenetworks.com/HNAP1/">
	<GetMyDLinkSupportStatusResult><?=$result?></GetMyDLinkSupportStatusResult>
	<SupportMyDLink><?=$SupportMyDLink?></SupportMyDLink>
</GetMyDLinkSupportStatusResponse>
</soap:Body>
</soap:Envelope>
