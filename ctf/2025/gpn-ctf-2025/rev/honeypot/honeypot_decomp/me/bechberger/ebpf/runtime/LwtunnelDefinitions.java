/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class LwtunnelDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="lwtunnel_build_state($arg1, $arg2, $arg3, $arg4, (const void*)$arg5, $arg6, $arg7)")
    public static int lwtunnel_build_state(Ptr<runtime.net> net2, @Unsigned short encap_type, Ptr<runtime.nlattr> encap, @Unsigned int family, Ptr<?> cfg, Ptr<Ptr<lwtunnel_state>> lws, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lwtunnel_cmp_encap(Ptr<lwtunnel_state> a, Ptr<lwtunnel_state> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lwtunnel_encap_add_ops((const struct lwtunnel_encap_ops*)$arg1, $arg2)")
    public static int lwtunnel_encap_add_ops(Ptr<lwtunnel_encap_ops> ops, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lwtunnel_encap_del_ops((const struct lwtunnel_encap_ops*)$arg1, $arg2)")
    public static int lwtunnel_encap_del_ops(Ptr<lwtunnel_encap_ops> ops, @Unsigned int encap_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lwtunnel_fill_encap(Ptr<SkDefinitions.sk_buff> skb, Ptr<lwtunnel_state> lwtstate, int encap_attr, int encap_type_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lwtunnel_get_encap_size(Ptr<lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lwtunnel_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lwtunnel_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<lwtunnel_state> lwtunnel_state_alloc(int encap_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lwtunnel_valid_encap_type(@Unsigned short encap_type, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lwtunnel_valid_encap_type_attr(Ptr<runtime.nlattr> attr2, int remaining, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lwtunnel_xmit(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum lwtunnel_ip6_t")
    public static enum lwtunnel_ip6_t implements Enum<lwtunnel_ip6_t>,
    TypedEnum<lwtunnel_ip6_t, Integer>
    {
        LWTUNNEL_IP6_UNSPEC,
        LWTUNNEL_IP6_ID,
        LWTUNNEL_IP6_DST,
        LWTUNNEL_IP6_SRC,
        LWTUNNEL_IP6_HOPLIMIT,
        LWTUNNEL_IP6_TC,
        LWTUNNEL_IP6_FLAGS,
        LWTUNNEL_IP6_PAD,
        LWTUNNEL_IP6_OPTS,
        __LWTUNNEL_IP6_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum lwtunnel_ip_t")
    public static enum lwtunnel_ip_t implements Enum<lwtunnel_ip_t>,
    TypedEnum<lwtunnel_ip_t, Integer>
    {
        LWTUNNEL_IP_UNSPEC,
        LWTUNNEL_IP_ID,
        LWTUNNEL_IP_DST,
        LWTUNNEL_IP_SRC,
        LWTUNNEL_IP_TTL,
        LWTUNNEL_IP_TOS,
        LWTUNNEL_IP_FLAGS,
        LWTUNNEL_IP_PAD,
        LWTUNNEL_IP_OPTS,
        __LWTUNNEL_IP_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct lwtunnel_encap_ops")
    @NotUsableInJava
    public static class lwtunnel_encap_ops
    extends Struct {
        public Ptr<?> build_state;
        public Ptr<?> destroy_state;
        public Ptr<?> output;
        public Ptr<?> input;
        public Ptr<?> fill_encap;
        public Ptr<?> get_encap_size;
        public Ptr<?> cmp_encap;
        public Ptr<?> xmit;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="enum lwtunnel_encap_types")
    public static enum lwtunnel_encap_types implements Enum<lwtunnel_encap_types>,
    TypedEnum<lwtunnel_encap_types, Integer>
    {
        LWTUNNEL_ENCAP_NONE,
        LWTUNNEL_ENCAP_MPLS,
        LWTUNNEL_ENCAP_IP,
        LWTUNNEL_ENCAP_ILA,
        LWTUNNEL_ENCAP_IP6,
        LWTUNNEL_ENCAP_SEG6,
        LWTUNNEL_ENCAP_BPF,
        LWTUNNEL_ENCAP_SEG6_LOCAL,
        LWTUNNEL_ENCAP_RPL,
        LWTUNNEL_ENCAP_IOAM6,
        LWTUNNEL_ENCAP_XFRM,
        __LWTUNNEL_ENCAP_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct lwtunnel_state")
    @NotUsableInJava
    public static class lwtunnel_state
    extends Struct {
        public @Unsigned short type;
        public @Unsigned short flags;
        public @Unsigned short headroom;
        public AtomicDefinitions.atomic_t refcnt;
        public Ptr<?> orig_output;
        public Ptr<?> orig_input;
        public misc.callback_head rcu;
        public char @Size(value=0) [] data;
    }
}

