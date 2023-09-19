<? include "/htdocs/webinc/body/draw_elements.php"; ?>
<tr>
	<td class="centered">
		<input id="en_<?=$INDEX?>" type="checkbox" />
	</td>
	<td class="centered">
		<?echo I18N("h","IP Address");?>
		<input id="startip_<?=$INDEX?>" type="text" maxlength="15" size="12" /> ~ 
		<input id="endip_<?=$INDEX?>" type="text" maxlength="15" size="12" />
	</td>
	<td class="centered">
		<select id="mode_<?=$INDEX?>" onclick="">
			<option value="DMIN"><?echo I18N("h","Guaranteed minimum bandwidth");?></option>
			<option value="DMAX"><?echo I18N("h","Restricted maximum download bandwidth");?></option>
			<option value="UMAX"><?echo I18N("h","Restricted maximum upload bandwidth");?></option>
		</select>
	</td>
	<td class="centered">
		<input id="bw_<?=$INDEX?>" type="text" maxlength="15" size="6" />
	</td>
	<?
	if ($FEATURE_NOSCH != "1")
	{
		echo '<td class="centered">';
		DRAW_select_sch("sch_".$INDEX, I18N("h","Always"), "-1", "", 0, "narrow");
		echo '<input id="sch_create_'.$INDEX.'" type="button" value="'.I18N("h","New").'" onclick="PAGE.OnClickNew();" />';
		echo '</td>\n';
  }
  ?>
</tr>