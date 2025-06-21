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
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class In6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void in6_dev_finish_destroy(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void in6_dev_finish_destroy_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="in6_dev_get((const struct net_device*)$arg1)")
    public static Ptr<Inet6Definitions.inet6_dev> in6_dev_get(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void in6_dev_put(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="in6_dump_addrs((const struct inet6_dev*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int in6_dump_addrs(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<Integer> s_ip_idx, Ptr<Inet6Definitions.inet6_fill_args> fillargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="in6_pton((const u8*)$arg1, $arg2, $arg3, $arg4, (const u8**)$arg5)")
    public static int in6_pton(String src, int srclen, Ptr<Character> dst, int delim, Ptr<String> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct in6_flowlabel_req")
    @NotUsableInJava
    public static class in6_flowlabel_req
    extends Struct {
        public in6_addr flr_dst;
        public @Unsigned @OriginalName(value="__be32") int flr_label;
        public char flr_action;
        public char flr_share;
        public @Unsigned short flr_flags;
        public @Unsigned short flr_expires;
        public @Unsigned short flr_linger;
        public @Unsigned int __flr_pad;
    }

    @Type(noCCodeGeneration=true, cType="struct in6_validator_info")
    @NotUsableInJava
    public static class in6_validator_info
    extends Struct {
        public in6_addr i6vi_addr;
        public Ptr<Inet6Definitions.inet6_dev> i6vi_dev;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
    }

    @Type(noCCodeGeneration=true, cType="struct in6_ifreq")
    @NotUsableInJava
    public static class in6_ifreq
    extends Struct {
        public in6_addr ifr6_addr;
        public @Unsigned int ifr6_prefixlen;
        public int ifr6_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="enum in6_addr_gen_mode")
    public static enum in6_addr_gen_mode implements Enum<in6_addr_gen_mode>,
    TypedEnum<in6_addr_gen_mode, Integer>
    {
        IN6_ADDR_GEN_MODE_EUI64,
        IN6_ADDR_GEN_MODE_NONE,
        IN6_ADDR_GEN_MODE_STABLE_PRIVACY,
        IN6_ADDR_GEN_MODE_RANDOM;

    }

    @Type(noCCodeGeneration=true, cType="struct in6_rtmsg")
    @NotUsableInJava
    public static class in6_rtmsg
    extends Struct {
        public in6_addr rtmsg_dst;
        public in6_addr rtmsg_src;
        public in6_addr rtmsg_gateway;
        public @Unsigned int rtmsg_type;
        public @Unsigned short rtmsg_dst_len;
        public @Unsigned short rtmsg_src_len;
        public @Unsigned int rtmsg_metric;
        public @Unsigned long rtmsg_info;
        public @Unsigned int rtmsg_flags;
        public int rtmsg_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct in6_pktinfo")
    @NotUsableInJava
    public static class in6_pktinfo
    extends Struct {
        public in6_addr ipi6_addr;
        public int ipi6_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct in6_addr")
    @NotUsableInJava
    public static class in6_addr
    extends Struct {
        public in6_u_of_in6_addr in6_u;
    }

    @Type(noCCodeGeneration=true, cType="union { u8 u6_addr8[16]; short unsigned int u6_addr16[8]; unsigned int u6_addr32[4]; }")
    @NotUsableInJava
    public static class in6_u_of_in6_addr
    extends Union {
        public char @Size(value=16) [] u6_addr8;
        public @Unsigned @OriginalName(value="__be16") short @Size(value=8) [] u6_addr16;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] u6_addr32;
    }
}

