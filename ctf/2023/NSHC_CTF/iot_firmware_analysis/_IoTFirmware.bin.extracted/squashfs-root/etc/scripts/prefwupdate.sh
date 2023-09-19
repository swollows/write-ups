#!/bin/sh
echo "[$0] ...." > /dev/console
services="IPT.WAN-1 IPT.WAN-1 IP6T.WAN-1 IPTDMZ IPTPORTT IPTPFWD IPTVSVR IPTMASQ WAN WIFI LAN UPNPAV ITUNES WEBACCESS SAMBA"
for service in $services; do
	[ -f /var/servd/${service}_stop.sh ] && sh /var/servd/${service}_stop.sh
done

event STATUS.CRITICAL
event HTTP.DOWN add /etc/events/FWUPDATER.sh
service HTTP stop
umount /var/tmp/storage/*
exit 0

