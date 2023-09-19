#!/bin/sh
# kernel > 2.6.22, it (may)will use nf_conntrack_max
USB_STATUS=`mount | grep /tmp/storage`
MEMTOTAL=`cat /proc/meminfo | grep MemTotal | scut -f 2`

if [ "$USB_STATUS" = ""  ]; then
	if [ $MEMTOTAL -le 16384 ]; then
	    CONNTRACK_MAX=2048
	elif [ $MEMTOTAL -le 32768 ]; then
    	CONNTRACK_MAX=4096
	elif [ $MEMTOTAL -le 65536 ]; then
	    CONNTRACK_MAX=16384
	elif [ $MEMTOTAL -le 131072 ]; then
	    CONNTRACK_MAX=30000
	elif [ $MEMTOTAL -le 262144 ]; then
	    CONNTRACK_MAX=65536
	elif [ $MEMTOTAL -le 524288 ]; then
	    CONNTRACK_MAX=65536
	fi
else
    if [ $MEMTOTAL -le 16384 ]; then
		CONNTRACK_MAX=2048
	elif [ $MEMTOTAL -le 32768 ]; then
	    CONNTRACK_MAX=4096
	elif [ $MEMTOTAL -le 65536 ]; then
	    CONNTRACK_MAX=8192
	elif [ $MEMTOTAL -le 131072 ]; then
	    CONNTRACK_MAX=30000
	elif [ $MEMTOTAL -le 262144 ]; then
	    CONNTRACK_MAX=65536
	elif [ $MEMTOTAL -le 524288 ]; then
	    CONNTRACK_MAX=65536
	fi
fi	

xmldbc -s /runtime/device/conntrack_max $CONNTRACK_MAX
echo "CONNTRACK_MAX=$CONNTRACK_MAX"

CONNTRACK_MIN=`expr $CONNTRACK_MAX / 2`
xmldbc -s /runtime/device/conntrack_min $CONNTRACK_MIN
echo "CONNTRACK_MIN=$CONNTRACK_MIN"

if [ -f /proc/sys/net/netfilter/nf_conntrack_max ]; then
	echo $CONNTRACK_MAX > /proc/sys/net/netfilter/nf_conntrack_max
else
	echo $CONNTRACK_MAX > /proc/sys/net/ipv4/ip_conntrack_max
fi

qos_status=`xmldbc -w /bwc/entry:1/enable`
if [ "$qos_status" == 1 ]; then
    if [ -f /proc/sys/net/netfilter/nf_conntrack_max ]; then
	    echo $CONNTRACK_MIN > /proc/sys/net/netfilter/nf_conntrack_max
	else
		echo $CONNTRACK_MIN > /proc/sys/net/ipv4/ip_conntrack_max
	fi
fi
