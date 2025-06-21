/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class UsbdevfsDefinitions {

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_ioctl32")
    @NotUsableInJava
    public static class usbdevfs_ioctl32
    extends Struct {
        public int ifno;
        public int ioctl_code;
        public @Unsigned @OriginalName(value="compat_caddr_t") int data;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_urb32")
    @NotUsableInJava
    public static class usbdevfs_urb32
    extends Struct {
        public char type;
        public char endpoint;
        public @OriginalName(value="compat_int_t") int status;
        public @Unsigned @OriginalName(value="compat_uint_t") int flags;
        public @Unsigned @OriginalName(value="compat_caddr_t") int buffer;
        public @OriginalName(value="compat_int_t") int buffer_length;
        public @OriginalName(value="compat_int_t") int actual_length;
        public @OriginalName(value="compat_int_t") int start_frame;
        public @OriginalName(value="compat_int_t") int number_of_packets;
        public @OriginalName(value="compat_int_t") int error_count;
        public @Unsigned @OriginalName(value="compat_uint_t") int signr;
        public @Unsigned @OriginalName(value="compat_caddr_t") int usercontext;
        public usbdevfs_iso_packet_desc @Size(value=0) [] iso_frame_desc;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_disconnectsignal32")
    @NotUsableInJava
    public static class usbdevfs_disconnectsignal32
    extends Struct {
        public @OriginalName(value="compat_int_t") int signr;
        public @Unsigned @OriginalName(value="compat_caddr_t") int context;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_bulktransfer32")
    @NotUsableInJava
    public static class usbdevfs_bulktransfer32
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uint_t") int ep;
        public @Unsigned @OriginalName(value="compat_uint_t") int len;
        public @Unsigned @OriginalName(value="compat_uint_t") int timeout;
        public @Unsigned @OriginalName(value="compat_caddr_t") int data;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_ctrltransfer32")
    @NotUsableInJava
    public static class usbdevfs_ctrltransfer32
    extends Struct {
        public char bRequestType;
        public char bRequest;
        public @Unsigned short wValue;
        public @Unsigned short wIndex;
        public @Unsigned short wLength;
        public @Unsigned int timeout;
        public @Unsigned @OriginalName(value="compat_caddr_t") int data;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_streams")
    @NotUsableInJava
    public static class usbdevfs_streams
    extends Struct {
        public @Unsigned int num_streams;
        public @Unsigned int num_eps;
        public char @Size(value=0) [] eps;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_disconnect_claim")
    @NotUsableInJava
    public static class usbdevfs_disconnect_claim
    extends Struct {
        public @Unsigned int _interface;
        public @Unsigned int flags;
        public char @Size(value=256) [] driver;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_ioctl")
    @NotUsableInJava
    public static class usbdevfs_ioctl
    extends Struct {
        public int ifno;
        public int ioctl_code;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_urb")
    @NotUsableInJava
    public static class usbdevfs_urb
    extends Struct {
        public char type;
        public char endpoint;
        public int status;
        public @Unsigned int flags;
        public Ptr<?> buffer;
        public int buffer_length;
        public int actual_length;
        public int start_frame;
        @InlineUnion(value=32907)
        public @InlineUnion(value=32907) int number_of_packets;
        @InlineUnion(value=32907)
        public @InlineUnion(value=32907) @Unsigned int stream_id;
        public int error_count;
        public @Unsigned int signr;
        public Ptr<?> usercontext;
        public usbdevfs_iso_packet_desc @Size(value=0) [] iso_frame_desc;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_iso_packet_desc")
    @NotUsableInJava
    public static class usbdevfs_iso_packet_desc
    extends Struct {
        public @Unsigned int length;
        public @Unsigned int actual_length;
        public @Unsigned int status;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_conninfo_ex")
    @NotUsableInJava
    public static class usbdevfs_conninfo_ex
    extends Struct {
        public @Unsigned int size;
        public @Unsigned int busnum;
        public @Unsigned int devnum;
        public @Unsigned int speed;
        public char num_ports;
        public char @Size(value=7) [] ports;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_connectinfo")
    @NotUsableInJava
    public static class usbdevfs_connectinfo
    extends Struct {
        public @Unsigned int devnum;
        public char slow;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_getdriver")
    @NotUsableInJava
    public static class usbdevfs_getdriver
    extends Struct {
        public @Unsigned int _interface;
        public char @Size(value=256) [] driver;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_disconnectsignal")
    @NotUsableInJava
    public static class usbdevfs_disconnectsignal
    extends Struct {
        public @Unsigned int signr;
        public Ptr<?> context;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_setinterface")
    @NotUsableInJava
    public static class usbdevfs_setinterface
    extends Struct {
        public @Unsigned int _interface;
        public @Unsigned int altsetting;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_bulktransfer")
    @NotUsableInJava
    public static class usbdevfs_bulktransfer
    extends Struct {
        public @Unsigned int ep;
        public @Unsigned int len;
        public @Unsigned int timeout;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_ctrltransfer")
    @NotUsableInJava
    public static class usbdevfs_ctrltransfer
    extends Struct {
        public char bRequestType;
        public char bRequest;
        public @Unsigned short wValue;
        public @Unsigned short wIndex;
        public @Unsigned short wLength;
        public @Unsigned int timeout;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct usbdevfs_hub_portinfo")
    @NotUsableInJava
    public static class usbdevfs_hub_portinfo
    extends Struct {
        public char nports;
        public char @Size(value=127) [] port;
    }
}

