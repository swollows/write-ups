#!/bin/sh
echo [$0]: $1 ... > /dev/console
case "$1" in
start|stop)
	service PHYINF.WIFI $1
	;;
*)
	echo [$0]: invalid argument - $1 > /dev/console
	;;
esac
phpsh etc/scripts/wlan_get_chanlist.php
exit 0
