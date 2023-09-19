#!/bin/sh

#add wireless interface name to proc for management multicast packet data to unicast data
if [ -f "/proc/alpha/m2u" ] && [ -f "/etc/services/M2U.php" ]; then
	xmldbc -P /etc/services/M2U.php
fi