HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<?
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
include "/htdocs/phplib/xnode.php";
include "/htdocs/phplib/trace.php";
include "/htdocs/webinc/config.php";

$wait_time = "2";
$retry_number = 10;

$result = "OK";

$action = query ("/runtime/hnap/GetCurrentInternetStatus/InternetStatus");

if ($action == "true")
{
	$action = "trigger";
}
else if ($action == "false")
{
	$action = "get";
}
else
{
	$action = "";
	$result = "ERROR";
}

$path_inf_wan1 = XNODE_getpathbytarget("", "inf", "uid", $WAN1, 0);
$wan1_phyinf = query($path_inf_wan1."/phyinf");
$path_run_phyinf_wan1 = XNODE_getpathbytarget("/runtime", "phyinf", "uid", $wan1_phyinf, 0);
$status = get("",$path_run_phyinf_wan1."/linkstatus");
if( $status != "0" && $status != "")
{ $statusStr = "CONNECTED"; }
else 
{
	$statusStr = "DISCONNECTED";
	$result = "OK_NOTCONNECTED";
}

if ($result == "OK")
{
	if ($action == "trigger")
	{
		$cmd = "dnsquery -p -t 2 -d mydlink.com -d dlink.com -d dlink.com.cn -d dlink.com.tw -d google.com -d www.mydlink.com -d www.dlink.com -d www.dlink.com.cn -d www.dlink.com.tw -d www.google.com";
		setattr("/runtime/command", "get", $cmd ." > /var/cmd.result &");
		unlink("/var/cmd.result");
		get("x", "/runtime/command");

		$result = "OK_DETECTING_".$wait_time;
	}
	else
	{
		if (isfile("/var/cmd.result") == 1)
		{
			// make sure the file is existed.
			$ping_result = fread("","/var/cmd.result");

			if (strstr($ping_result, "Internet detected.") == "")
			{
				$retry_count = query ("/runtime/hnap1/retryCount");
				if ($retry_count == "") { $retry_count = 0; }
				$retry_count ++;
				if ($retry_count < $retry_number) 
				{ 
					$result = "OK_DETECTING_".$wait_time;
					set ("/runtime/hnap1/retryCount", $retry_count);
				}
				else 
				{
					$result = "OK_NOTCONNECTED";
					del("/runtime/hnap1/retryCount");
					unlink("/var/cmd.result");
				}
			}
			else
			{
				$result = "OK_CONNECTED";
				del("/runtime/hnap1/retryCount");
				unlink("/var/cmd.result");
			}
		}
		else
		{
			//if the file is not existed, it should return an error.
			$result = "ERROR";
		}
	}
}

?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	<soap:Body>
		<GetCurrentInternetStatusResponse xmlns="http://purenetworks.com/HNAP1/">
			<GetCurrentInternetStatusResult><?=$result?></GetCurrentInternetStatusResult>
		</GetCurrentInternetStatusResponse>
	</soap:Body>
</soap:Envelope>
