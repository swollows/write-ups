/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IwDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iw_handler_get_iwstats(Ptr<NetDefinitions.net_device> dev, Ptr<iw_request_info> info2, Ptr<misc.iwreq_data> wrqu, String extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iw_handler_get_spy(Ptr<NetDefinitions.net_device> dev, Ptr<iw_request_info> info2, Ptr<misc.iwreq_data> wrqu, String extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iw_handler_get_thrspy(Ptr<NetDefinitions.net_device> dev, Ptr<iw_request_info> info2, Ptr<misc.iwreq_data> wrqu, String extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iw_handler_set_spy(Ptr<NetDefinitions.net_device> dev, Ptr<iw_request_info> info2, Ptr<misc.iwreq_data> wrqu, String extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iw_handler_set_thrspy(Ptr<NetDefinitions.net_device> dev, Ptr<iw_request_info> info2, Ptr<misc.iwreq_data> wrqu, String extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iw_send_thrspy_event(Ptr<NetDefinitions.net_device> dev, Ptr<iw_spy_data> spydata, String address, Ptr<iw_quality> wstats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iw_handler_get_private(Ptr<NetDefinitions.net_device> dev, Ptr<iw_request_info> info2, Ptr<misc.iwreq_data> wrqu, String extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct iw_node_attr")
    @NotUsableInJava
    public static class iw_node_attr
    extends Struct {
        public KobjDefinitions.kobj_attribute kobj_attr;
        public int nid;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_thrspy")
    @NotUsableInJava
    public static class iw_thrspy
    extends Struct {
        public runtime.sockaddr addr;
        public iw_quality qual;
        public iw_quality low;
        public iw_quality high;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_ioctl_description")
    @NotUsableInJava
    public static class iw_ioctl_description
    extends Struct {
        public char header_type;
        public char token_type;
        public @Unsigned short token_size;
        public @Unsigned short min_tokens;
        public @Unsigned short max_tokens;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_event")
    @NotUsableInJava
    public static class iw_event
    extends Struct {
        public @Unsigned short len;
        public @Unsigned short cmd;
        public misc.iwreq_data u;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_encode_ext")
    @NotUsableInJava
    public static class iw_encode_ext
    extends Struct {
        public @Unsigned int ext_flags;
        public char @Size(value=8) [] tx_seq;
        public char @Size(value=8) [] rx_seq;
        public runtime.sockaddr addr;
        public @Unsigned short alg;
        public @Unsigned short key_len;
        public char @Size(value=0) [] key;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_spy_data")
    @NotUsableInJava
    public static class iw_spy_data
    extends Struct {
        public int spy_number;
        public @OriginalName(value="u_char") char @Size(value=48) [] spy_address;
        public iw_quality @Size(value=8) [] spy_stat;
        public iw_quality spy_thr_low;
        public iw_quality spy_thr_high;
        public @OriginalName(value="u_char") char @Size(value=8) [] spy_thr_under;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_request_info")
    @NotUsableInJava
    public static class iw_request_info
    extends Struct {
        public @Unsigned short cmd;
        public @Unsigned short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_priv_args")
    @NotUsableInJava
    public static class iw_priv_args
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned short set_args;
        public @Unsigned short get_args;
        public char @Size(value=16) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_statistics")
    @NotUsableInJava
    public static class iw_statistics
    extends Struct {
        public @Unsigned short status;
        public iw_quality qual;
        public iw_discarded discard;
        public iw_missed miss;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_missed")
    @NotUsableInJava
    public static class iw_missed
    extends Struct {
        public @Unsigned int beacon;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_discarded")
    @NotUsableInJava
    public static class iw_discarded
    extends Struct {
        public @Unsigned int nwid;
        public @Unsigned int code;
        public @Unsigned int fragment;
        public @Unsigned int retries;
        public @Unsigned int misc;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_quality")
    @NotUsableInJava
    public static class iw_quality
    extends Struct {
        public char qual;
        public char level;
        public char noise;
        public char updated;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_freq")
    @NotUsableInJava
    public static class iw_freq
    extends Struct {
        public int m;
        public short e;
        public char i;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_point")
    @NotUsableInJava
    public static class iw_point
    extends Struct {
        public Ptr<?> pointer;
        public @Unsigned short length;
        public @Unsigned short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_param")
    @NotUsableInJava
    public static class iw_param
    extends Struct {
        public int value;
        public char fixed;
        public char disabled;
        public @Unsigned short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_public_data")
    @NotUsableInJava
    public static class iw_public_data
    extends Struct {
        public Ptr<iw_spy_data> spy_data;
        public @OriginalName(value="libipw_device") Ptr<?> libipw;
    }

    @Type(noCCodeGeneration=true, cType="struct iw_handler_def")
    @NotUsableInJava
    public static class iw_handler_def
    extends Struct {
        public Ptr<@OriginalName(value="iw_handler") Ptr<?>> standard;
        public @Unsigned short num_standard;
        public @Unsigned short num_private;
        public @Unsigned short num_private_args;
        public Ptr<@OriginalName(value="iw_handler") Ptr<?>> _private;
        public Ptr<iw_priv_args> private_args;
        public Ptr<?> get_wireless_stats;
    }
}

