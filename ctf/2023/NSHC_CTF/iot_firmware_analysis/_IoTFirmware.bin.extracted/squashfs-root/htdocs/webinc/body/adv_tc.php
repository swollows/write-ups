<form id="mainform" onsubmit="return false;">
<!-- Traffic Control -->
<div class="orangebox">
	<h1><?echo I18N("h","Traffic Control");?></h1>
	<p>
		<?echo I18N("h","Traffic Control can distribute download bandwidth equally to the LAN/Wireless client. User also can setup the Traffic Control rules manually.");?>
	</p>
	<p>
		<input type="button" value="<?echo I18N("h","Save Settings");?>" onclick="BODY.OnSubmit();" />
		<input type="button" value="<?echo I18N("h","Don't Save Settings");?>" onclick="BODY.OnReload();" />
	</p>
</div>
<!-- Traffic Control Setting -->
<div class="blackbox">
	<h2><?echo I18N("h","Traffic Control Setting");?></h2>
	<div class="textinput">
		<span class="name"><?echo I18N("h","Enable Traffic Control");?></span>
		<span class="delimiter">:</span>
		<span class="value"><input type="checkbox" id="en_tc" onclick="PAGE.OnClickTCEnable();" /></span>
	</div>
	<div class="textinput">
		<span class="name"><?echo I18N("h","Automatic Distribute Bandwidth");?></span>
		<span class="delimiter">:</span>
		<span class="value"><input type="checkbox" id="en_adb" onclick="PAGE.OnClickADBEnable();" /></span>
	</div>
	<div class="textinput">
		<span class="name"><?echo I18N("h","Key in download bandwidth manually");?></span>
		<span class="delimiter">:</span>
		<span class="value">
			<input type="text" id="downstream" size="6" maxlength="7"> kbps
		</span>
	</div>
	<div class="textinput">
		<span class="name"><?echo I18N("h","Key in upload bandwidth manually");?></span>
		<span class="delimiter">:</span>
		<span class="value">
			<input type="text" id="upstream" size="6" maxlength="7"> kbps
		</span>
	</div>
	<div class="gap"></div>
	<div class="gap"></div>
</div>
<!-- Traffic Control Rule -->
<div class="blackbox" <?if ($FEARURE_UNCONFIGURABLEQOS == "1") echo ' style="display:none;"';?>>
	<h2><?=$TC_MAX_COUNT?> -- <?echo I18N("h","Traffic Control Rules");?></h2>
	<table id="qos_table" class="general">
		<col width="10px"></col>
		<col width="38px"></col>
		<col width="105px"></col>
		<col width="28px"></col>
		<col width="32px"></col>
		<tr>
			<td></td>
			<td class="centered"><?echo I18N("h","IP Range");?></td>
			<td class="centered"><?echo I18N("h","Mode");?></td>
			<td class="centered"><?echo I18N("","Bandwidth\n(kbps)");?></td>
			<td class="centered"><?echo I18N("h","Schedule");?></td>
		</tr>
		<?
			$INDEX = 1;
			while ($INDEX <= $TC_MAX_COUNT)
			{
				dophp("load", "/htdocs/webinc/body/adv_tc_list.php");
				$INDEX++;
			}
		?>
	</table>
	<div class="gap"></div>
</div>
<p>
	<input type="button" value="<?echo I18N("h","Save Settings");?>" onclick="BODY.OnSubmit();" />
	<input type="button" value="<?echo I18N("h","Don't Save Settings");?>" onclick="BODY.OnReload();" />
</p>
</form>