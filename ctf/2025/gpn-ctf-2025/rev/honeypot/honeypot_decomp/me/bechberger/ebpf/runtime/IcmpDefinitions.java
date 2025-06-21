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
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IcmpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmp_put(Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__icmp_send($arg1, $arg2, $arg3, $arg4, (const struct ip_options*)$arg5)")
    public static void __icmp_send(Ptr<SkDefinitions.sk_buff> skb_in, int type2, int code2, @Unsigned @OriginalName(value="__be32") int info2, Ptr<IpDefinitions.ip_options> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean icmp_build_probe(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.icmphdr> icmphdr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason icmp_discard(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason icmp_echo(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean icmp_global_allow(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmp_global_consume(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmp_glue_bits(Ptr<?> from, String to, int offset, int len, int odd, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmp_ndo_send(Ptr<SkDefinitions.sk_buff> skb_in, int type2, int code2, @Unsigned @OriginalName(value="__be32") int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmp_out_count(Ptr<runtime.net> net2, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmp_push_reply(Ptr<runtime.sock> sk, Ptr<icmp_bxm> icmp_param, Ptr<runtime.flowi4> fl4, Ptr<misc.ipcm_cookie> ipc, Ptr<Ptr<runtime.rtable>> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmp_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason icmp_redirect(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmp_reply(Ptr<icmp_bxm> icmp_param, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="icmp_route_lookup($arg1, $arg2, $arg3, (const struct iphdr*)$arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10)")
    public static Ptr<runtime.rtable> icmp_route_lookup(Ptr<runtime.net> net2, Ptr<runtime.flowi4> fl4, Ptr<SkDefinitions.sk_buff> skb_in, Ptr<runtime.iphdr> iph, @Unsigned @OriginalName(value="__be32") int saddr, char tos, @Unsigned int mark, int type2, int code2, Ptr<icmp_bxm> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmp_sk_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmp_socket_deliver(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason icmp_timestamp(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason icmp_unreach(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_control")
    @NotUsableInJava
    public static class icmp_control
    extends Struct {
        public Ptr<?> handler;
        public short error;
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_bxm")
    @NotUsableInJava
    public static class icmp_bxm
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> skb;
        public int offset;
        public int data_len;
        public DataDefinitions.data_of_icmp_bxm data;
        public int head_len;
        public IpDefinitions.ip_options_data replyopts;
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_ext_echo_iio")
    @NotUsableInJava
    public static class icmp_ext_echo_iio
    extends Struct {
        public icmp_extobj_hdr extobj_hdr;
        public misc.ident_of_icmp_ext_echo_iio ident;
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_ext_echo_ctype3_hdr")
    @NotUsableInJava
    public static class icmp_ext_echo_ctype3_hdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short afi;
        public char addrlen;
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_extobj_hdr")
    @NotUsableInJava
    public static class icmp_extobj_hdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short length;
        public char class_num;
        public char class_type;
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_ext_hdr")
    @NotUsableInJava
    public static class icmp_ext_hdr
    extends Struct {
        public char reserved1;
        public char version;
        public char reserved2;
        public @Unsigned @OriginalName(value="__sum16") short checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_filter")
    @NotUsableInJava
    public static class icmp_filter
    extends Struct {
        public @Unsigned int data;
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_err")
    @NotUsableInJava
    public static class icmp_err
    extends Struct {
        public int errno;
        public @Unsigned int fatal;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 type; u8 code; }")
    @NotUsableInJava
    public static class icmp_of_u_of_dst_of_nf_conntrack_tuple
    extends Struct {
        public @OriginalName(value="u_int8_t") char type;
        public @OriginalName(value="u_int8_t") char code;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int id; }")
    @NotUsableInJava
    public static class icmp_of_nf_conntrack_man_proto
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short id;
    }

    @Type(noCCodeGeneration=true, cType="struct icmp_mib")
    @NotUsableInJava
    public static class icmp_mib
    extends Struct {
        public @Unsigned long @Size(value=30) [] mibs;
    }
}

