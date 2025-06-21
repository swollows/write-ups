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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Icmpv6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmpv6_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason icmpv6_echo_reply(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmpv6_err(Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_skb_parm> opt, char type2, char code2, int offset, @Unsigned @OriginalName(value="__be32") int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmpv6_err_convert(char type2, char code2, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="icmpv6_flow_init((const struct sock*)$arg1, $arg2, $arg3, (const struct in6_addr*)$arg4, (const struct in6_addr*)$arg5, $arg6)")
    public static void icmpv6_flow_init(Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, char type2, Ptr<In6Definitions.in6_addr> saddr, Ptr<In6Definitions.in6_addr> daddr, int oif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmpv6_getfrag(Ptr<?> from, String to, int offset, int len, int odd, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean icmpv6_global_allow(Ptr<runtime.net> net2, int type2, Ptr<@OriginalName(value="bool") Boolean> apply_ratelimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmpv6_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason icmpv6_notify(Ptr<SkDefinitions.sk_buff> skb, char type2, char code2, @Unsigned @OriginalName(value="__be32") int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmpv6_param_prob_reason(Ptr<SkDefinitions.sk_buff> skb, char code2, int pos, SkbDefinitions.skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmpv6_push_pending_frames(Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, Ptr<runtime.icmp6hdr> thdr, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icmpv6_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> icmpv6_route_lookup(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icmpv6_ndo_send(Ptr<SkDefinitions.sk_buff> skb_in, char type2, char code2, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct icmpv6_msg")
    @NotUsableInJava
    public static class icmpv6_msg
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> skb;
        public int offset;
        public @OriginalName(value="uint8_t") char type;
    }

    @Type(noCCodeGeneration=true, cType="struct icmpv6_nd_ra")
    @NotUsableInJava
    public static class icmpv6_nd_ra
    extends Struct {
        public char hop_limit;
        public char reserved;
        public char router_pref;
        public char home_agent;
        public char other;
        public char managed;
        public @Unsigned @OriginalName(value="__be16") short rt_lifetime;
    }

    @Type(noCCodeGeneration=true, cType="struct icmpv6_nd_advt")
    @NotUsableInJava
    public static class icmpv6_nd_advt
    extends Struct {
        public @Unsigned int reserved;
        public @Unsigned int override;
        public @Unsigned int solicited;
        public @Unsigned int router;
        public @Unsigned int reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct icmpv6_echo")
    @NotUsableInJava
    public static class icmpv6_echo
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short identifier;
        public @Unsigned @OriginalName(value="__be16") short sequence;
    }

    @Type(noCCodeGeneration=true, cType="struct icmpv6_mib_device")
    @NotUsableInJava
    public static class icmpv6_mib_device
    extends Struct {
        public @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=7) [] mibs;
    }

    @Type(noCCodeGeneration=true, cType="struct icmpv6_mib")
    @NotUsableInJava
    public static class icmpv6_mib
    extends Struct {
        public @Unsigned long @Size(value=7) [] mibs;
    }
}

