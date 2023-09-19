<?
include "/htdocs/phplib/xnode.php";
include "/etc/services/WIFI/function.php";
echo "#!/bin/sh\n";

$UID24G	= "BAND24G-1.1";
$UID5G	= "BAND5G-1.1"; 
$dev_24	= devname($UID24G);
$dev_5	= devname($UID5G);
setattr("/runtime/get_channel_24",	"get","cat /proc/".$dev_24."/mib_rf | grep channel_list: | cut -f2 -d: | sed  -e 's/[ ^I]/,/g' | sed 's/,$//g' | sed 's/^,//g'");
setattr("/runtime/get_channel_5",	"get","cat /proc/".$dev_5."/mib_rf | grep channel_list: | cut -f2 -d: | sed  -e 's/[ ^I]/,/g' | sed 's/,$//g' | sed 's/^,//g'");
echo "exit 0\n";
?>
