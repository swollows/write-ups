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
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NdiscDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__ndisc_fill_addr_option($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static void __ndisc_fill_addr_option(Ptr<SkDefinitions.sk_buff> skb, int type2, Ptr<?> data, int data_len, int pad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ndisc_alloc_skb(Ptr<NetDefinitions.net_device> dev, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_allow_add((const struct net_device*)$arg1, $arg2)")
    public static boolean ndisc_allow_add(Ptr<NetDefinitions.net_device> dev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ndisc_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ndisc_constructor(Ptr<runtime.neighbour> neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ndisc_error_report(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_hash((const void*)$arg1, (const struct net_device*)$arg2, $arg3)")
    public static @Unsigned int ndisc_hash(Ptr<?> pkey, Ptr<NetDefinitions.net_device> dev, Ptr<@Unsigned Integer> hash_rnd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_ifinfo_sysctl_change((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ndisc_ifinfo_sysctl_change(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ndisc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_is_multicast((const void*)$arg1)")
    public static int ndisc_is_multicast(Ptr<?> pkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_key_eq((const struct neighbour*)$arg1, (const void*)$arg2)")
    public static boolean ndisc_key_eq(Ptr<runtime.neighbour> n, Ptr<?> pkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ndisc_late_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ndisc_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_mc_map((const struct in6_addr*)$arg1, $arg2, $arg3, $arg4)")
    public static int ndisc_mc_map(Ptr<In6Definitions.in6_addr> addr2, String buf, Ptr<NetDefinitions.net_device> dev, int dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ndisc_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ndisc_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ndisc_netdev_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_opt_hdr> ndisc_next_option(Ptr<NdDefinitions.nd_opt_hdr> cur, Ptr<NdDefinitions.nd_opt_hdr> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_ns_create($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static Ptr<SkDefinitions.sk_buff> ndisc_ns_create(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> solicit, Ptr<In6Definitions.in6_addr> saddr, @Unsigned long nonce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_parse_options((const struct net_device*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<ndisc_options> ndisc_parse_options(Ptr<NetDefinitions.net_device> dev, Ptr<Character> opt, int opt_len, Ptr<ndisc_options> ndopts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ndisc_ra_useropt(Ptr<SkDefinitions.sk_buff> ra, Ptr<NdDefinitions.nd_opt_hdr> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason ndisc_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason ndisc_recv_na(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason ndisc_recv_ns(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason ndisc_recv_rs(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason ndisc_redirect_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason ndisc_router_discovery(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_send_na($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void ndisc_send_na(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> solicited_addr, boolean router, boolean solicited, boolean override, boolean inc_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_send_ns($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3, (const struct in6_addr*)$arg4, $arg5)")
    public static void ndisc_send_ns(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> solicit, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr, @Unsigned long nonce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_send_redirect($arg1, (const struct in6_addr*)$arg2)")
    public static void ndisc_send_redirect(Ptr<SkDefinitions.sk_buff> skb, Ptr<In6Definitions.in6_addr> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_send_rs($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static void ndisc_send_rs(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> saddr, Ptr<In6Definitions.in6_addr> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_send_skb($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static void ndisc_send_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ndisc_send_unsol_na(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ndisc_solicit(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_update((const struct net_device*)$arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void ndisc_update(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.neighbour> neigh, Ptr<Character> lladdr, char _new, @Unsigned int flags, char icmp6_type, Ptr<ndisc_options> ndopts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ndisc_warn_deprecated_sysctl((const struct ctl_table*)$arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void ndisc_warn_deprecated_sysctl(Ptr<misc.ctl_table> ctl, String func, String dev_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ndisc_options")
    @NotUsableInJava
    public static class ndisc_options
    extends Struct {
        public Ptr<NdDefinitions.nd_opt_hdr> @Size(value=15) [] nd_opt_array;
        public Ptr<NdDefinitions.nd_opt_hdr> nd_opts_ri;
        public Ptr<NdDefinitions.nd_opt_hdr> nd_opts_ri_end;
        public Ptr<NdDefinitions.nd_opt_hdr> nd_useropts;
        public Ptr<NdDefinitions.nd_opt_hdr> nd_useropts_end;
        public Ptr<NdDefinitions.nd_opt_hdr> @Size(value=3) [] nd_802154_opt_array;
    }

    @Type(noCCodeGeneration=true, cType="struct ndisc_ops")
    @NotUsableInJava
    public static class ndisc_ops
    extends Struct {
        public Ptr<?> parse_options;
        public Ptr<?> update;
        public Ptr<?> opt_addr_space;
        public Ptr<?> fill_addr_option;
        public Ptr<?> prefix_rcv_add_addr;
    }
}

