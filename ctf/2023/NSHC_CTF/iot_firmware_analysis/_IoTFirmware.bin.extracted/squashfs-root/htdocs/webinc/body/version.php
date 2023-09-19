<?
include "/htdocs/phplib/xnode.php";
?>
<form id="mainform" onsubmit="return false;">
<div class="orangebox">
	<h1>Version</h1>
	<div class="emptyline"></div>
	<div class="info">
		<span class="name">Firmware External Version :</span>
		<span class="value">V<?echo cut(fread("", "/etc/config/buildver"), "0", "\n");?></span>
	</div>
	<div class="info" style="display:none;">
		<span class="name">Firmware External Revision :</span>
		<span class="value"><?echo cut(fread("", "/etc/config/buildrev"), "0", "\n");?></span>
	</div>
	<div class="info">
		<span class="name">Firmware Internal Version :</span>
		<span class="value" style="text-transform:uppercase;">V<?echo cut(fread("", "/etc/config/buildver"), "0", "\n");?><?echo cut(fread("", "/etc/config/buildrev"), "0", "\n");?></span>
	</div>
<?
	if (isfile("/htdocs/webinc/body/version_3G.php")==1)
		dophp("load", "/htdocs/webinc/body/version_3G.php");
?>
	<div class="info">
		<span class="name">Language Package :</span>
		<span class="value" id="langcode"></span>
		<span class="value" <?if(query("/runtime/device/langcode") == "") echo 'style="display:none;"';?>>
			<? 
				if(i18n("langpack ver") != "langpack ver")	echo '&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; '.i18n("langpack ver");
				else echo ''; 
			?>
		</span>
	</div>
	<div class="info">
		<span class="name">Date :</span>
		<span class="value"><?echo cut(fread("", "/etc/config/builddate"), "1", " ").','.cut(fread("", "/etc/config/builddate"), "2", " ").','.cut(fread("", "/etc/config/builddate"), "3", " ");?></span>
	</div>
	<div class="info">
		<span class="name">CheckSum :</span>
		<span class="value" id="checksum"></span>
	</div>
<div class="info">
		<span class="name">WAN MAC :</span>
		<span class="value"><?echo query("/runtime/devdata/wanmac");?></span>
	</div>
	<div class="info">
		<span class="name">LAN MAC :</span>
		<span class="value"><?echo query("/runtime/devdata/lanmac");?></span>
	</div>
	<div class="info">
		<span class="name">WLAN MAC (2.4G) :</span>
		<span class="value"><?echo query("/runtime/devdata/wlanmac");?></span>
	</div>
	<div class="info">
		<span class="name">WLAN MAC (5G) :</span>
		<span class="value">
			<? if(query("/runtime/devdata/wlan5mac") != "") echo query("/runtime/devdata/wlan5mac");
			   else if(query("/runtime/devdata/wlanmac2") != "") echo query("/runtime/devdata/wlanmac2"); ?></span>
	</div>
	<div class="info">
		<span class="name">WLAN Domain (2.4G) :</span>
		<span class="value">
			<? 
			  if(query("/runtime/devdata/countrycode") == "GB" || query("/runtime/devdata/countrycode") == "EU") echo 'EU';
			  else if(query("/runtime/devdata/countrycode") == "NA" || query("/runtime/devdata/countrycode") == "US") echo 'NA'; 
			  //else if(query("/runtime/devdata/countrycode") == "BR") echo 'DI';
			  else if(query("/runtime/devdata/countrycode") == "CA") echo 'NA';
			  else if(query("/runtime/devdata/countrycode") == "LA") echo 'AU';
			  else if(query("/runtime/devdata/countrycode") == "TW") echo 'NA';
			  else if(query("/runtime/devdata/countrycode") == "CN") echo 'EU';
			  else if(query("/runtime/devdata/countrycode") == "KR") echo 'EU';
			  else if(query("/runtime/devdata/countrycode") == "FR") echo 'EU';
			  else if(query("/runtime/devdata/countrycode") == "RU") echo 'EU';
			  else if(query("/runtime/devdata/countrycode") == "IL") echo 'EU';
			  else echo query("/runtime/devdata/countrycode");
			  echo "<br>";
			  echo query("/runtime/get_channel_24");
			?>
		</span>
	</div>
	<div class="info">
		<span class="name">WLAN Domain (5G) :</span>
		<span class="value">
			<? if($FEATURE_DUAL_BAND == "1")
			{
			  if(query("/runtime/devdata/countrycode") == "GB" || query("/runtime/devdata/countrycode") == "EU") echo 'EU/GB';
			  else if(query("/runtime/devdata/countrycode") == "NA" || query("/runtime/devdata/countrycode") == "US") echo 'NA/US'; 
			  else echo query("/runtime/devdata/countrycode");
			  echo "<br>";
			  echo query("/runtime/get_channel_5");
			} ?>
		</span>
	</div>
	<div class="info">
		<span class="name">Firmware Query :</span>
		<span class="value" id="fwq"></span>
	</div>
	<div class="info">
		<span class="name">SSID (2.4G) :</span>
		<pre style="font-family:Tahoma"><span class="value"><?$path = XNODE_getpathbytarget("/wifi", "entry", "uid", "WIFI-1", "0"); echo get(h,$path."/ssid");?></span></pre>
	</div>
	<div class="info">
		<span class="name">SSID (5G) :</span>
		<pre style="font-family:Tahoma"><span class="value"><?$path = XNODE_getpathbytarget("/wifi", "entry", "uid", "WIFI-3", "0"); echo get(h,$path."/ssid");?></span></pre>
	</div>
	<div class="info">
		<span class="name">Factory Default :</span>
		<span class="value" id="configured"></span>
	</div>
	<div class="gap"></div>
	<div class="info">
		<span class="name"></span>
		<span class="value">
			<input type="button" value="Continue" onClick='self.location.href="index.php";' />
		</span>
	</div>
	<div class="emptyline"></div>
</div>
</form>
