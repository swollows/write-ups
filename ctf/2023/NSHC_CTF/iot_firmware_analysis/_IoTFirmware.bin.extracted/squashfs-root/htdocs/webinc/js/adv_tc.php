<?include "/htdocs/phplib/inet.php";?>
<?include "/htdocs/phplib/inf.php";?>
<?include "/htdocs/phplib/phyinf.php";?>
<script type="text/javascript">
function Page() {}
Page.prototype =
{
	services: "BWC, INET.INF",
	OnLoad: function()
	{
		if (!this.rgmode)
		{
			BODY.DisableCfgElements(true);
		}
	},
	OnUnload: function() {},
	OnSubmitCallback: function (code, result)
	{
		BODY.ShowContent();
		switch (code)
		{
			/*
			case "OK":
				Service("REBOOT");								
				break;
			*/
			case "BUSY":
				BODY.ShowAlert('<?echo I18N("j","Someone is configuring the device, please try again later.");?>');
				break;
			case "HEDWIG":
				if (result.Get("/hedwig/result")=="FAILED")
				{
					FocusObj(result);
					BODY.ShowAlert(result.Get("/hedwig/message"));
				}
				break;
			case "PIGWIDGEON":
				BODY.ShowAlert(result.Get("/pigwidgeon/message"));
				break;
		}
		return true;
	},
	InitValue: function(xml)
	{
		PXML.doc = xml;
		if (!this.Initial()) return false;
		return true;
	},
	PreSubmit: function()
	{
		if (this.activewan==="")
		{
			BODY.ShowAlert('<?echo I18N("j", "There is no interface can access the Internet!  Please check the cable, and the Internet settings!");?>');
			return null;
		}
		
		<?
			$linkstatus = get("", PHYINF_getruntimephypath("WAN-1")."/linkstatus");
			if($linkstatus=="10F") $max_wan_port_speed = 10240; //Kbps for unit.
			else if ($linkstatus=="100F") $max_wan_port_speed = 102400;
			else if ($linkstatus=="1000F") $max_wan_port_speed = 1024000;
			else $max_wan_port_speed = 1024000;
		?>
		
		var max_wan_port_speed = <?echo $max_wan_port_speed;?>;
		if (!TEMP_IsDigit(OBJ("upstream").value) || OBJ("upstream").value < 1 || OBJ("upstream").value > max_wan_port_speed)
		{			
			BODY.ShowAlert('<?echo I18N("j", "The input uplink speed is invalid.");?>');
			OBJ("upstream").focus();
			return null;
		}
		if (!TEMP_IsDigit(OBJ("downstream").value) || OBJ("downstream").value < 1 || OBJ("downstream").value > max_wan_port_speed)
		{			
			BODY.ShowAlert('<?echo I18N("j", "The input downlink speed is invalid.");?>');
			OBJ("downstream").focus();
			return null;
		}
		
		/* delete the old entries
		 * Notice: Must delte the entries from tail to head */
		var old_bwc1cnt = S2I(XG(this.bwc1p+"/rules/count"));
		var old_bwc2cnt = S2I(XG(this.bwc2p+"/rules/count"));
		
		while(old_bwc1cnt > 0)
		{
			XD(this.bwc1p+"/rules/entry:"+old_bwc1cnt);
			old_bwc1cnt -= 1;
		}
		while(old_bwc2cnt > 0)
		{
			XD(this.bwc2p+"/rules/entry:"+old_bwc2cnt);
			old_bwc2cnt -= 1;
		}
		
		XS(this.bwc1p+"/enable", OBJ("en_tc").checked===true? "1" : "0");
		XS(this.bwc1p+"/flag", OBJ("en_adb").checked===true? "TC_ADB" : "TC_CONNMARK");
		XS(this.bwc2p+"/enable", OBJ("en_tc").checked===true? "1" : "0");
		XS(this.bwc2p+"/flag", OBJ("en_adb").checked===true? "TC_ADB" : "TC_CONNMARK");
		
		if (this.bwc1link==="up")
		{	
			XS(this.bwc1p+"/bandwidth", OBJ("upstream").value); /*wan*/
			XS(this.bwc2p+"/bandwidth", OBJ("downstream").value); /*lan*/
		}
		else if (this.bwc1link==="down")
		{
			XS(this.bwc1p+"/bandwidth", OBJ("downstream").value); /*lan*/
			XS(this.bwc2p+"/bandwidth", OBJ("upstream").value); /*wan*/
		}
		
		var bwcno=0, bwc1no=0, bwc2no=0;
		this.bwcnt=0;
		this.downMin = new Array();
		if (OBJ("en_adb").checked!==true)
		{
			for (var i=1; i<=<?=$TC_MAX_COUNT?>; i++)
			{
				if (OBJ("en_"+i).checked===true)
				{
					/* error check */
					if (OBJ("startip_"+i).value==="" || OBJ("endip_"+i).value==="")
					{
						BODY.ShowAlert('<?echo I18N("j","The ip address should not be empty.");?>');
						return null;
					}
					if (OBJ("bw_"+i).value==="")
					{
						BODY.ShowAlert('<?echo I18N("j","The bandwidth should not be empty.");?>');
						return null;
					}
					
					if (!this.IPRangeCheck(i)) 	return null;
					
					bwcno++;
					XS(this.bwc+"/bwc:2/bwcf/seqno", bwcno);
					XS(this.bwc+"/bwc:2/bwcf/max", <?=$TC_MAX_COUNT?>);
					XS(this.bwc+"/bwc:2/bwcf/count", <?=$TC_MAX_COUNT?>);
					XS(this.bwc+"/bwc:2/bwcf/entry:"+bwcno+"/uid", "BWCF-"+i);
					XS(this.bwc+"/bwc:2/bwcf/entry:"+bwcno+"/ipv4/start", OBJ("startip_"+i).value);
					XS(this.bwc+"/bwc:2/bwcf/entry:"+bwcno+"/ipv4/end", OBJ("endip_"+i).value);
					
					if (!this.BandwidthCheck(i)) 	return null;
					
					if (this.bwc1link==="up")
					{	
						if (this.moedType==="upload")
						{
							bwc1no++;
							XS(this.bwc1p+"/rules/seqno", bwc1no+1);
							XS(this.bwc1p+"/rules/count", bwc1no);
							XS(this.bwc1p+"/rules/entry:"+bwc1no+"/enable","1");
							XS(this.bwc1p+"/rules/entry:"+bwc1no+"/bwcqd", "BWCQD-"+i);
							XS(this.bwc1p+"/rules/entry:"+bwc1no+"/bwcf", "BWCF-"+i);
							XS(this.bwc1p+"/rules/entry:"+bwc1no+"/schedule", OBJ("sch_"+i).value==="-1" ? "" : OBJ("sch_"+i).value);
						}
						else if (this.moedType==="download")
						{
							bwc2no++;
							XS(this.bwc2p+"/rules/seqno", bwc2no+1);
							XS(this.bwc2p+"/rules/count", bwc2no);
							XS(this.bwc2p+"/rules/entry:"+bwc2no+"/enable","1");
							XS(this.bwc2p+"/rules/entry:"+bwc2no+"/bwcqd", "BWCQD-"+i);
							XS(this.bwc2p+"/rules/entry:"+bwc2no+"/bwcf", "BWCF-"+i);
							XS(this.bwc2p+"/rules/entry:"+bwc2no+"/schedule", OBJ("sch_"+i).value==="-1" ? "" : OBJ("sch_"+i).value);
						}
					}
					else if (this.bwc1link==="down")
					{
						if (this.moedType==="upload")
						{
							bwc2no++;
							XS(this.bwc2p+"/rules/seqno", bwc2no+1);
							XS(this.bwc2p+"/rules/count", bwc2no);
							XS(this.bwc2p+"/rules/entry:"+bwc2no+"/enable","1");
							XS(this.bwc2p+"/rules/entry:"+bwc2no+"/bwcqd", "BWCQD-"+i);
							XS(this.bwc2p+"/rules/entry:"+bwc2no+"/bwcf", "BWCF-"+i);
							XS(this.bwc2p+"/rules/entry:"+bwc2no+"/schedule", OBJ("sch_"+i).value==="-1" ? "" : OBJ("sch_"+i).value);
						}
						else if (this.moedType==="download")
						{
							bwc1no++;
							XS(this.bwc1p+"/rules/seqno", bwc1no+1);
							XS(this.bwc1p+"/rules/count", bwc1no);
							XS(this.bwc1p+"/rules/entry:"+bwc1no+"/enable","1");
							XS(this.bwc1p+"/rules/entry:"+bwc1no+"/bwcqd", "BWCQD-"+i);
							XS(this.bwc1p+"/rules/entry:"+bwc1no+"/bwcf", "BWCF-"+i);
							XS(this.bwc1p+"/rules/entry:"+bwc1no+"/schedule", OBJ("sch_"+i).value==="-1" ? "" : OBJ("sch_"+i).value);
						}
					}
					
					XS(this.bwc+"/bwc:2/bwcqd/seqno", bwcno);
					XS(this.bwc+"/bwc:2/bwcqd/max", <?=$TC_MAX_COUNT?>);
					XS(this.bwc+"/bwc:2/bwcqd/count", <?=$TC_MAX_COUNT?>);
					XS(this.bwc+"/bwc:2/bwcqd/entry:"+bwcno+"/uid", "BWCQD-"+i);
					XS(this.bwc+"/bwc:2/bwcqd/entry:"+bwcno+"/bandwidth", OBJ("bw_"+i).value);
					XS(this.bwc+"/bwc:2/bwcqd/entry:"+bwcno+"/flag", this.modeLimit);
				}
			}
		}
		
		return PXML.doc;
	},
	bwc: null,
	bwc1p: null,
	bwc2p: null,
	bwc1link: null,
	moedType: null,
	modeLimit: null,
	downMin: null,
	bwcnt: 0,
	feature_china: <?
		if($FEATURE_CHINA=="1") echo "true";
		else echo "false";
	?>,
	IsDirty: null,
	Synchronize: function() {},
	// The above are MUST HAVE methods ...
	///////////////////////////////////////////////////////////////////////
	rgmode: function()
	{
		devmode = XG(bwc+"/runtime/device/layout");
		if(devmode == "bridge") return false;
		return true;
	},
	activewan: function()
	{
		wan = XG(bwc+"/runtime/device/activewan");		
		return wan;				
	},
	Initial: function()
	{
		this.bwc = PXML.FindModule("BWC");
		var inet = PXML.FindModule("INET.INF");
		PXML.IgnoreModule("INET.INF"); 
		
		if (!inet || !this.bwc)
		{
			BODY.ShowAlert("Initial() ERROR!");
			return false;
		}
		
		this.bwc1p = GPBT(this.bwc+"/bwc:2", "entry", "uid", "BWC-1", false);
		this.bwc2p = GPBT(this.bwc+"/bwc:2", "entry", "uid", "BWC-2", false);
		
		if (this.activewan==="")
		{
			BODY.ShowAlert('<?echo I18N("j", "There is no interface can access the Internet!  Please check the cable, and the Internet settings!");?>');
			return false;
		}
		
		/*initial settings*/
		OBJ("en_tc").checked = (XG(this.bwc+"/bwc:2/entry:1/enable")==="1" && XG(this.bwc+"/runtime/device/layout")==="router");
		OBJ("en_tc").disabled = (XG(this.bwc+"/runtime/device/layout")==="bridge");
		
		var tc_mode = XG(this.bwc1p+"/flag");
		OBJ("en_adb").checked = tc_mode==="TC_ADB" ? true : false;
		
		var bwc1 = XG(this.bwc1p+"/uid");
		var bwc1infp = GPBT(inet, "inf", "bwc", bwc1, false);
		var inetinf = XG(bwc1infp+"/uid");
		
		if(inetinf.substr(0,3)==="WAN") /*uplink*/
		{
			OBJ("upstream").value	= XG(this.bwc1p+"/bandwidth");
			OBJ("downstream").value	= XG(this.bwc2p+"/bandwidth");
			this.bwc1link = "up";
			this.InitBWCEntry("U", "D");
		}
		else if(inetinf.substr(0,3)==="LAN") /*downlink*/
		{
			OBJ("upstream").value	= XG(this.bwc2p+"/bandwidth");
			OBJ("downstream").value	= XG(this.bwc1p+"/bandwidth");
			this.bwc1link = "down";
			this.InitBWCEntry("D", "U");
		}
		
		this.OnClickTCEnable();
	},
	InitBWCEntry: function(s1, s2)
	{
		var bwcqdcnt = S2I(XG(this.bwc+"/bwc:2/bwcqd/count"));
		for (var i=1; i<=bwcqdcnt; i++)
		{
			var bwcqdp = this.bwc+"/bwc:2/bwcqd/entry:"+i;
			var bwcqduid = XG(bwcqdp+"/uid");
			var bwc1uid = GPBT(this.bwc1p+"/rules", "entry", "bwcqd", bwcqduid, false);
			var bwc2uid = GPBT(this.bwc2p+"/rules", "entry", "bwcqd", bwcqduid, false);
			var uidcut = bwcqduid.split("-");
			var seqbwc = uidcut[1];
			
			if (bwc1uid===null && bwc2uid===null)
			{
				OBJ("en_"+seqbwc).checked = false;
				OBJ("startip_"+seqbwc).value = "";
				OBJ("endip_"+seqbwc).value = "";
				OBJ("bw_"+seqbwc).value = "";
			}
			else if (bwc1uid!=null && bwc2uid===null)
			{
				var bwc1en = XG(bwc1uid+"/enable");
				if (bwc1en==="1")
				{
					var bwcqd_flag = XG(bwcqdp+"/flag");
					var bwcfuid = "BWCF-"+seqbwc;
					var bwcfp = GPBT(this.bwc+"/bwc:2/bwcf", "entry", "uid", bwcfuid, false);
					
					if (seqbwc<=<?=$TC_MAX_COUNT?>)
					{
						OBJ("en_"+seqbwc).checked = true;
						OBJ("startip_"+seqbwc).value = XG(bwcfp+"/ipv4/start");
						OBJ("endip_"+seqbwc).value = XG(bwcfp+"/ipv4/end");
						
						if (bwcqd_flag==="RSVBD")
							COMM_SetSelectValue(OBJ("mode_"+seqbwc), s1+"MIN");
						else if (bwcqd_flag==="MAXBD")
							COMM_SetSelectValue(OBJ("mode_"+seqbwc), s1+"MAX");
						
						COMM_SetSelectValue(OBJ("sch_"+i), (XG(bwc1uid+"/schedule")=="") ? "-1" : XG(bwc1uid+"/schedule"));
						OBJ("bw_"+seqbwc).value = XG(bwcqdp+"/bandwidth");
					}
				}
			}
			else if (bwc1uid===null && bwc2uid!=null)
			{
				var bwc2en = XG(bwc2uid+"/enable");
				if (bwc2en==="1")
				{
					var bwcqd_flag = XG(bwcqdp+"/flag");
					var bwcfuid = "BWCF-"+seqbwc;
					var bwcfp = GPBT(this.bwc+"/bwc:2/bwcf", "entry", "uid", bwcfuid, false);
					
					if (seqbwc<=<?=$TC_MAX_COUNT?>)
					{
						OBJ("en_"+seqbwc).checked = true;
						OBJ("startip_"+seqbwc).value = XG(bwcfp+"/ipv4/start");
						OBJ("endip_"+seqbwc).value = XG(bwcfp+"/ipv4/end");
						
						if (bwcqd_flag==="RSVBD")
							COMM_SetSelectValue(OBJ("mode_"+seqbwc), s2+"MIN");
						else if (bwcqd_flag==="MAXBD")
							COMM_SetSelectValue(OBJ("mode_"+seqbwc), s2+"MAX");
						
						COMM_SetSelectValue(OBJ("sch_"+i), (XG(bwc2uid+"/schedule")=="") ? "-1" : XG(bwc2uid+"/schedule"));
						OBJ("bw_"+seqbwc).value = XG(bwcqdp+"/bandwidth");
					}
				}
			}
		}
	},
	SettingsDisable: function(disable)
	{
		OBJ("en_adb").disabled = disable;
		OBJ("downstream").disabled = disable;
		OBJ("upstream").disabled = disable;
	},
	RulesDisable: function(disable)
	{
		for (var i=1; i<=<?=$TC_MAX_COUNT?>; i++)
		{
			OBJ("en_"+i).disabled = disable;
			OBJ("startip_"+i).disabled = disable;
			OBJ("endip_"+i).disabled = disable;
			OBJ("mode_"+i).disabled = disable;
			OBJ("bw_"+i).disabled = disable;
			OBJ("sch_"+i).disabled = disable;
			OBJ("sch_create_"+i).disabled = disable;
		}
	},
	OnClickTCEnable: function()
	{
		/*add a message to alert QoS Engine is already enabled, 
		  because Traffic Control and QoS Engine could not enable in the same time.*/
		if (this.feature_china && XG(this.bwc+"/bwc:1/entry:1/enable")==="1")
		{
			if (!confirm('<?echo I18N("j","The QoS Engine is already enabled, and this two function are the same. Do you want to disable QoS Engine to use Traffic Control?");?>')) 
			{	
				OBJ("en_tc").checked = false;
				OBJ("en_tc").disabled = true;
			}
			else XS(this.bwc+"/bwc:1/entry:1/enable", 0)
		}
		
		if (OBJ("en_tc").checked)
		{
      this.SettingsDisable(false);
      this.OnClickADBEnable();
    }
		else
		{
			this.SettingsDisable(true);
			this.RulesDisable(true);
		}
		
	},
	OnClickADBEnable: function()
	{
		if (OBJ("en_adb").checked)
			this.RulesDisable(true);
		else
			this.RulesDisable(false);
	},
	OnClickNew: function()
	{
		self.location.href = "./tools_sch.php";
	},
	IPRangeCheck: function(i)
	{
		var lan1ip 	= '<?$inf = XNODE_getpathbytarget("/runtime", "inf", "uid", "LAN-1", 0); echo query($inf."/inet/ipv4/ipaddr");?>';
		var lan2ip 	= '<?$inf = XNODE_getpathbytarget("/runtime", "inf", "uid", "LAN-2", 0); echo query($inf."/inet/ipv4/ipaddr");?>';
		var lan2mask = '<?$inf = XNODE_getpathbytarget("/runtime", "inf", "uid", "LAN-2", 0); echo query($inf."/inet/ipv4/mask");?>';
		var router_mode = '<?echo query("/runtime/device/router/mode");?>';
		
		if(OBJ("startip_"+i).value!=="")
		{
			if(lan1ip===OBJ("startip_"+i).value || (router_mode==="1W2L" && lan2ip===OBJ("startip_"+i).value))
			{
				BODY.ShowAlert('<?echo I18N("j", "The IP Address could not be the same as LAN IP Address.");?>');
				OBJ("startip_"+i).focus();
				return false;
			}	
			if(!TEMP_CheckNetworkAddr(OBJ("startip_"+i).value) && (router_mode==="1W2L" && !TEMP_CheckNetworkAddr(OBJ("startip_"+i).value, lan2ip, lan2mask)))
			{	
				BODY.ShowAlert('<?echo I18N("j", "IP address should be in LAN subnet.");?>');
				OBJ("startip_"+i).focus();
				return false;
			}
		}
		
		if(OBJ("endip_"+i).value !== "")
		{
			if(lan1ip===OBJ("endip_"+i).value || (router_mode==="1W2L" && lan2ip===OBJ("endip_"+i).value))
			{
				BODY.ShowAlert('<?echo I18N("j", "The IP Address could not be the same as LAN IP Address.");?>');
				OBJ("endip_"+i).focus();
				return false;
			} 
			if(!TEMP_CheckNetworkAddr(OBJ("endip_"+i).value) && (router_mode==="1W2L" && !TEMP_CheckNetworkAddr(OBJ("endip_"+i).value, lan2ip, lan2mask)))
			{	
				BODY.ShowAlert('<?echo I18N("j", "IP address should be in LAN subnet.");?>');
				OBJ("endip_"+i).focus();
				return false;
			}
		}
		
		if(OBJ("startip_"+i).value!=="" && OBJ("endip_"+i).value!=="")
		{
			if(COMM_IPv4ADDR2INT(OBJ("startip_"+i).value) > COMM_IPv4ADDR2INT(OBJ("endip_"+i).value))
			{
				BODY.ShowAlert('<?echo I18N("j", "The end IP address should be greater than the start address.");?>');
				OBJ("startip_"+i).focus();
				return false;
			}
			if(!(TEMP_CheckNetworkAddr(OBJ("startip_"+i).value) && TEMP_CheckNetworkAddr(OBJ("endip_"+i).value)) &&     
				!(TEMP_CheckNetworkAddr(OBJ("startip_"+i).value, lan2ip, lan2mask) && TEMP_CheckNetworkAddr(OBJ("endip_"+i).value, lan2ip, lan2mask)))
			{	
				BODY.ShowAlert('<?echo I18N("j", "The start IP address and the end IP address should be in the same LAN subnet.");?>');
				OBJ("startip_"+i).focus();
				return false;
			}
		}	
		return true;
	},
	BandwidthCheck: function(i)
	{
		var mode = OBJ("mode_"+i).value;
		var totalBandwidth = 0;
		
		if (mode.substr(0,1)==="U") this.moedType = "upload";
		else if (mode.substr(0,1)==="D") this.moedType = "download";
		
		if (mode.substr(1,3)==="MAX") this.modeLimit = "MAXBD";
		else if (mode.substr(1,3)==="MIN") this.modeLimit = "RSVBD";
		
		if (OBJ("bw_"+i).value!=="")
		{
			if (this.moedType==="upload" && this.modeLimit==="MAXBD")
			{
				if (S2I(OBJ("bw_"+i).value) > S2I(OBJ("upstream").value))
				{
					BODY.ShowAlert('<?echo I18N("j","The bandwidth should not big than upload bandwidth.");?>');
					return false;
				}
			}
			else if (this.moedType==="download")
			{
				if (this.modeLimit==="MAXBD")
				{
					if (S2I(OBJ("bw_"+i).value) > S2I(OBJ("downstream").value))
					{
						BODY.ShowAlert('<?echo I18N("j","The bandwidth should not big than download bandwidth.");?>');
						return false;
					}
				}
				else if (this.modeLimit==="RSVBD")
				{
					this.downMin[this.bwcnt] = OBJ("bw_"+i).value;
					
					for (var j=0; j<this.downMin.length; j++)
					{
						totalBandwidth = totalBandwidth + S2I(this.downMin[j]);
					}
					
					if (totalBandwidth > OBJ("downstream").value)
					{
						BODY.ShowAlert('<?echo I18N("j","The total bandwidth should not big than download bandwidth.");?>');
						return false;
					}
					this.bwcnt++;
				}
			}
		}
		
		return true;
	}
}
function Service(svc)
{	
	var banner = '<?echo i18n("Rebooting");?>...';
	var msgArray = ['<?echo I18N("j","Traffic Control settings changed. Reboot device to take effect.");?>',
									'<?echo I18N("j","If you changed the IP address of the router you will need to change the IP address in your browser before accessing the configuration web page again.");?>'];
	var delay = 10;
	var sec = <?echo query("/runtime/device/bootuptime");?> + delay;
	var url = null;
	var ajaxObj = GetAjaxObj("SERVICE");
	if (svc=="FRESET") url = "http://192.168.0.1/index.php";
	else if (svc=="REBOOT")	url = "http://<?echo $_SERVER["HTTP_HOST"];?>/index.php";
	else return false;
	ajaxObj.createRequest();
	ajaxObj.onCallback = function (xml)
	{
		ajaxObj.release();
		if (xml.Get("/report/result")!="OK")
			BODY.ShowAlert("Internal ERROR!\nEVENT "+svc+": "+xml.Get("/report/message"));
		else
			BODY.ShowCountdown(banner, msgArray, sec, url);
	}
	ajaxObj.setHeader("Content-Type", "application/x-www-form-urlencoded");
	ajaxObj.sendRequest("service.cgi", "EVENT="+svc);
}
</script>