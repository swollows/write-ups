HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<?
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
include "/htdocs/webinc/config.php";

$nodebase = "/runtime/hnap/SetScheduleSettings";
$node_sch_infolists = $nodebase."/ScheduleInfoLists";
$result = "OK";

//Remove the original node.
$sch_entries = get("", "/schedule/entry#");
while($sch_entries > 0)
{
	del("/schedule/entry");
	$sch_entries--;
}
$sch_seqno = 1;
$sch_count = 0;
set("/schedule/seqno", $sch_seqno);
set("/schedule/max", 10);
set("/schedule/count", $sch_count);

foreach($node_sch_infolists)
{
	set("/schedule/entry:".$InDeX."/uid", "SCH-".$sch_seqno);
	set("/schedule/entry:".$InDeX."/description", get("", "ScheduleName"));
	set("/schedule/entry:".$InDeX."/exclude", 0);
	$sch_entry = "/schedule/entry:".$InDeX;
	$sch_seqno++;
	$sch_count++;
	set("/schedule/seqno", $sch_seqno);
	set("/schedule/count", $sch_count);
	foreach("ScheduleInfo")
	{
		$sch_day_entry = $sch_entry."/entry:".$InDeX;
		$date = get("", "ScheduleDate");
		if($date >= 1 || $date <= 7) { set($sch_day_entry."/date", $date); }
		else { $result = "ERROR_BAD_ScheduleInfo"; }

		if (get("", "ScheduleAllDay") == "True") /* all day */
		{
			if (get("", "ScheduleTimeFormat") == "True") /* 24 hours */
			{set($sch_day_entry."/format", 24);}
			else if (get("", "ScheduleTimeFormat") == "False") /* 12 hours */
			{set($sch_day_entry."/format", 12);}
			set($sch_day_entry."/start", "0:00");
			set($sch_day_entry."/end", "23:59");
		}
		else if (get("", "ScheduleAllDay") == "False")
		{
			$start_hour = get("", "ScheduleStartTimeInfo/TimeHourValue");
			$start_min = get("", "ScheduleStartTimeInfo/TimeMinuteValue");
			$end_hour = get("", "ScheduleEndTimeInfo/TimeHourValue");
			$end_min = get("", "ScheduleEndTimeInfo/TimeMinuteValue");

			if (get("", "ScheduleTimeFormat") == "True") /* 24 hours */
			{set($sch_day_entry."/format", 24);}
			else if (get("", "ScheduleTimeFormat") == "False") /* 12 hours */
			{
				set($sch_day_entry."/format", 12);

				$start_mid = get("", "ScheduleStartTimeInfo/TimeMidDateValue");
				$end_mid = get("", "ScheduleEndTimeInfo/TimeMidDateValue");
				if ($start_mid == "True") //PM
				{
					$start_hour = $start_hour + 12;
					$end_hour = $end_hour + 12;
				}
				else if ($start_mid == "False") //AM
				{
					if ($end_mid == "True") //PM
					{$end_hour = $end_hour + 12;}
				}
			}
			$start_time = $start_hour.":".$start_min;
			$end_time = $end_hour.":".$end_min;
			set($sch_day_entry."/start", $start_time);
			set($sch_day_entry."/end", $end_time);
		}
		else { $result = "ERROR_BAD_ScheduleInfo"; }
	}
}

fwrite("w",$ShellPath, "#!/bin/sh\n");
fwrite("a",$ShellPath, "echo \"[$0]-->Schedule Settings\" > /dev/console\n");
if($result == "OK")
{
	fwrite("a",$ShellPath, "/etc/scripts/dbsave.sh > /dev/console\n");
	fwrite("a",$ShellPath, "xmldbc -s /runtime/hnap/dev_status '' > /dev/console\n");
	set("/runtime/hnap/dev_status", "ERROR");
}
else
{
	fwrite("a",$ShellPath, "echo \"We got a error in setting, so we do nothing...\" > /dev/console");
}

?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	<soap:Body>
	<SetScheduleSettingsResponse xmlns="http://purenetworks.com/HNAP1/">
	<SetScheduleSettingsResult><?=$result?></SetScheduleSettingsResult>
	</SetScheduleSettingsResponse>
	</soap:Body>
</soap:Envelope>
