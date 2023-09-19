<?
include "/htdocs/phplib/trace.php";
include "/htdocs/phplib/xnode.php";
include "/htdocs/phplib/phyinf.php";

fwrite("w",$START, "#!/bin/sh\n");
fwrite("w", $STOP, "#!/bin/sh\n");
function starspeed($name)
{
	/* Get the interface */
	$infp = XNODE_getpathbytarget("", "inf", "uid", $name, 0);
	if ($infp == "") return;

	$inet	= query($infp."/inet");
	$inetp	= XNODE_getpathbytarget("/inet", "entry", "uid", $inet, 0);
	$phyinf = query($infp."/phyinf");

	$user	= get("s", $inetp."/ppp4/username");
	$pass	= get("s", $inetp."/ppp4/password");
	$ifname = PHYINF_getifname($phyinf);
	$starspeed_en = query($inetp."/ppp4/pppoe/starspeed/enable");
	$pppoeplus_en = query($inetp."/ppp4/pppoe/pppoeplus/enable"); /* PPPoE+ is one of Starspeed */
	$region = get("s", $inetp."/ppp4/pppoe/starspeed/region");
	
	if ($starspeed_en==1)
	{
		$mode = get("s", $inetp."/ppp4/pppoe/starspeed/mode");
		if ($mode=="auto") /* if mode is auto, need to take turns to dial up Starspeed */
		{
			$region_list = "peermac,nullmac,hubei,henan,nanchang1,nanchang2";
			$num = cut_count($region_list, ",");
			if ($num != 6) return 0;
			
			if ($region!="")
			{
				$index=0;
				while ($num >= 0)
				{
					$tmpregion = cut($region_list, $index, ",");
					if($region==$tmpregion)
					{
						$current_indx = $index+1;
						if ($current_indx==$num) $current_indx = 0;
						break;
					}
					$index++;
				}
				$region = cut($region_list, $current_indx, ",");
				set($inetp."/ppp4/pppoe/starspeed/region", $region);
			}
			else
			{
				$region = cut($region_list, 0, ",");
				set($inetp."/ppp4/pppoe/starspeed/region", $region);
			}
		}
	}
	else if ($pppoeplus_en==1) $region = "henan";
	
	if ($starspeed_en==1 || $pppoeplus_en==1)
		fwrite("a",$_GLOBALS["START"], "/etc/scripts/starspeed.sh \"".$user."\" \"".$pass."\" \"".$ifname."\" \"".$region."\"\n");
}
starspeed("WAN-1");
fwrite("a",$START, "exit 0\n");
fwrite("a", $STOP, "exit 0\n");
?>
