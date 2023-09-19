HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8

<?
echo "\<\?xml version='1.0' encoding='utf-8'\?\>";
$result = "OK";
?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
	<GetScheduleSettingsResponse xmlns="http://purenetworks.com/HNAP1/">
		<GetScheduleSettingsResult><?=$result?></GetScheduleSettingsResult>
		<?
		foreach("/schedule/entry")
		{
			echo "		<ScheduleInfoLists>\n";
			echo "			<ScheduleName>".query("description")."</ScheduleName>\n";
			foreach("entry")
			{
				if(get("", "start")=="0:00" && get("", "end")=="23:59") {$ScheduleAllDay = "True";}
				else {$ScheduleAllDay = "False";}

				$start_hour = cut(get("", "start"), 0, ":");
				$start_min = cut(get("", "start"), 1, ":");
				$end_hour = cut(get("", "end"), 0, ":");
				$end_min = cut(get("", "end"), 1, ":");

				if(get("", "format")=="24")
				{
					$ScheduleTimeFormat = "True";
					$StartTimeMidDate = "False";
					$EndTimeMidDate = "False";
				}
				else
				{
					$ScheduleTimeFormat = "False";
					if($start_hour >= 12)
					{
						$start_hour = $start_hour -12;
						$end_hour = $end_hour -12;
						$StartTimeMidDate = "True";
						$EndTimeMidDate = "True";
					}
					else if($end_hour >= 12)
					{
						$end_hour = $end_hour -12;
						$StartTimeMidDate = "False";
						$EndTimeMidDate = "True";
					}
					else
					{
						$StartTimeMidDate = "False";
						$EndTimeMidDate = "False";
					}
				}

				echo "			<ScheduleInfo>\n";
				echo "				<ScheduleDate>".query("date")."</ScheduleDate>\n";
				echo "				<ScheduleAllDay>".$ScheduleAllDay."</ScheduleAllDay>\n";
				echo "				<ScheduleTimeFormat>".$ScheduleTimeFormat."</ScheduleTimeFormat>\n";

				echo "				<ScheduleStartTimeInfo>\n";
				echo "					<TimeHourValue>".$start_hour."</TimeHourValue>\n";
				echo "					<TimeMinuteValue>".$start_min."</TimeMinuteValue>\n";
				echo "					<TimeMidDateValue>".$StartTimeMidDate."</TimeMidDateValue>\n";
				echo "				</ScheduleStartTimeInfo>\n";

				echo "				<ScheduleEndTimeInfo>\n";
				echo "					<TimeHourValue>".$end_hour."</TimeHourValue>\n";
				echo "					<TimeMinuteValue>".$end_min."</TimeMinuteValue>\n";
				echo "					<TimeMidDateValue>".$EndTimeMidDate."</TimeMidDateValue>\n";
				echo "				</ScheduleEndTimeInfo>\n";
				echo "			</ScheduleInfo>\n";
			}
			echo "		</ScheduleInfoLists>";
		}
		?>
	</GetScheduleSettingsResponse>
  </soap:Body>
</soap:Envelope>

