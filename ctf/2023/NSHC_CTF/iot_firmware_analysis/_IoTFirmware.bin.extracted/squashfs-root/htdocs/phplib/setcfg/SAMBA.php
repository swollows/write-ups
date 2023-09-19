<?
/* setcfg is used to move the validated session data to the configuration database.
 * The variable, 'SETCFG_prefix',  will indicate the path of the session data. */
//set("/samba/enable", query($SETCFG_prefix."/samba/enable"));
set("/samba/auth", query($SETCFG_prefix."/samba/auth"));
?>
