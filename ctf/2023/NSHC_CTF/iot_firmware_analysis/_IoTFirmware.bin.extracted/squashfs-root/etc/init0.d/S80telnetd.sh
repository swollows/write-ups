#!/bin/sh
#run telnetd if is freset or mfc mode
orig_devconfsize=`devconf dump | scut -p "Data size :" -f 1`
mfc_mode=`devdata get -e mfcmode`
echo [$0]: $1 ... > /dev/console
if [ "$1" = "start" ]; then
	if [ "$orig_devconfsize" = "0" ] || [ "$orig_devconfsize" = "" ] || [ "$mfc_mode" = "1" ]; then
		if [ -f "/usr/sbin/login" ]; then
			image_sign=`cat /etc/config/image_sign`
			telnetd -l /usr/sbin/login -u Alphanetworks:$image_sign -i br0 &
		else
			telnetd &
		fi
	fi
else
	killall telnetd
fi
