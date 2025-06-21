/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Rt6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__rt6_find_exception_rcu($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static Ptr<rt6_exception> __rt6_find_exception_rcu(Ptr<Ptr<rt6_exception_bucket>> bucket2, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__rt6_find_exception_spinlock($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static Ptr<rt6_exception> __rt6_find_exception_spinlock(Ptr<Ptr<rt6_exception_bucket>> bucket2, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rt6_nh_dev_match(Ptr<Fib6Definitions.fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_add_dflt_router($arg1, (const struct in6_addr*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<Fib6Definitions.fib6_info> rt6_add_dflt_router(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> gwaddr, Ptr<NetDefinitions.net_device> dev, @Unsigned int pref, @Unsigned int defrtr_usr_metric, int lifetime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_add_route_info($arg1, (const struct in6_addr*)$arg2, $arg3, (const struct in6_addr*)$arg4, $arg5, $arg6)")
    public static Ptr<Fib6Definitions.fib6_info> rt6_add_route_info(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> prefix, int prefixlen, Ptr<In6Definitions.in6_addr> gwaddr, Ptr<NetDefinitions.net_device> dev, @Unsigned int pref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_age_examine_exception(Ptr<rt6_exception_bucket> bucket2, Ptr<rt6_exception> rt6_ex, Ptr<Fib6Definitions.fib6_gc_args> gc_args, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_age_exceptions(Ptr<Fib6Definitions.fib6_info> f6i, Ptr<Fib6Definitions.fib6_gc_args> gc_args, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_check_expired((const struct rt6_info*)$arg1)")
    public static boolean rt6_check_expired(Ptr<rt6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_clean_tohost(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> gateway) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_device_match($arg1, $arg2, (const struct in6_addr*)$arg3, $arg4, $arg5)")
    public static void rt6_device_match(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_result> res, Ptr<In6Definitions.in6_addr> saddr, int oif, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_disable_ip(Ptr<NetDefinitions.net_device> dev, @Unsigned long event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_do_redirect(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_do_update_pmtu(Ptr<rt6_info> rt, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_dump_route(Ptr<Fib6Definitions.fib6_info> rt, Ptr<?> p_arg, @Unsigned int skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_fill_node(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<Fib6Definitions.fib6_info> rt, Ptr<DstDefinitions.dst_entry> dst, Ptr<In6Definitions.in6_addr> dest, Ptr<In6Definitions.in6_addr> src, int iif, int type2, @Unsigned int portid, @Unsigned int seq, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_find_cached_rt((const struct fib6_result*)$arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static Ptr<rt6_info> rt6_find_cached_rt(Ptr<Fib6Definitions.fib6_result> res, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_flush_exceptions(Ptr<Fib6Definitions.fib6_info> f6i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_get_dflt_router($arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static Ptr<Fib6Definitions.fib6_info> rt6_get_dflt_router(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_get_route_info($arg1, (const struct in6_addr*)$arg2, $arg3, (const struct in6_addr*)$arg4, $arg5)")
    public static Ptr<Fib6Definitions.fib6_info> rt6_get_route_info(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> prefix, int prefixlen, Ptr<In6Definitions.in6_addr> gwaddr, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_info_init(Ptr<rt6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_insert_exception($arg1, (const struct fib6_result*)$arg2)")
    public static int rt6_insert_exception(Ptr<rt6_info> nrt, Ptr<Fib6Definitions.fib6_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_lookup($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3, $arg4, (const struct sk_buff*)$arg5, $arg6)")
    public static Ptr<rt6_info> rt6_lookup(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr, int oif, Ptr<SkDefinitions.sk_buff> skb, int strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_mtu_change(Ptr<NetDefinitions.net_device> dev, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_mtu_change_route(Ptr<Fib6Definitions.fib6_info> f6i, Ptr<?> p_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_multipath_hash((const struct net*)$arg1, (const struct flowi6*)$arg2, (const struct sk_buff*)$arg3, $arg4)")
    public static @Unsigned int rt6_multipath_hash(Ptr<runtime.net> net2, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_keys> flkeys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_multipath_rebalance(Ptr<Fib6Definitions.fib6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_nh_age_exceptions(Ptr<Fib6Definitions.fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_nh_dump_exceptions(Ptr<Fib6Definitions.fib6_nh> nh, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_nh_find_match(Ptr<Fib6Definitions.fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_nh_flush_exceptions(Ptr<Fib6Definitions.fib6_nh> nh, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_nh_nlmsg_size(Ptr<Fib6Definitions.fib6_nh> nh, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_nh_remove_exception_rt(Ptr<Fib6Definitions.fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long rt6_nlmsg_size(Ptr<Fib6Definitions.fib6_info> f6i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_probe(Ptr<Fib6Definitions.fib6_nh> fib6_nh2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_probe_deferred(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_purge_dflt_routers(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_remove_exception(Ptr<rt6_exception_bucket> bucket2, Ptr<rt6_exception> rt6_ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_remove_exception_rt(Ptr<rt6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_remove_prefsrc(Ptr<Inet6Definitions.inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_route_rcv($arg1, $arg2, $arg3, (const struct in6_addr*)$arg4)")
    public static int rt6_route_rcv(Ptr<NetDefinitions.net_device> dev, Ptr<Character> opt, int len, Ptr<In6Definitions.in6_addr> gwaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rt6_score_route((const struct fib6_nh*)$arg1, $arg2, $arg3, $arg4)")
    public static int rt6_score_route(Ptr<Fib6Definitions.fib6_nh> nh, @Unsigned int fib6_flags, int oif, int strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt6_stats_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_sync_down_dev(Ptr<NetDefinitions.net_device> dev, @Unsigned long event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_sync_up(Ptr<NetDefinitions.net_device> dev, char nh_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_uncached_list_add(Ptr<rt6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_uncached_list_del(Ptr<rt6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt6_uncached_list_flush_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rt6_nh")
    @NotUsableInJava
    public static class rt6_nh
    extends Struct {
        public Ptr<Fib6Definitions.fib6_info> fib6_info;
        public Fib6Definitions.fib6_config r_cfg;
        public ListDefinitions.list_head next;
    }

    @Type(noCCodeGeneration=true, cType="struct rt6_mtu_change_arg")
    @NotUsableInJava
    public static class rt6_mtu_change_arg
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned int mtu;
        public Ptr<Fib6Definitions.fib6_info> f6i;
    }

    @Type(noCCodeGeneration=true, cType="struct __rt6_probe_work")
    @NotUsableInJava
    public static class __rt6_probe_work
    extends Struct {
        public misc.work_struct work;
        public In6Definitions.in6_addr target;
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
    }

    @Type(noCCodeGeneration=true, cType="enum rt6_nud_state")
    public static enum rt6_nud_state implements Enum<rt6_nud_state>,
    TypedEnum<rt6_nud_state, Integer>
    {
        RT6_NUD_FAIL_HARD,
        RT6_NUD_FAIL_PROBE,
        RT6_NUD_FAIL_DO_RR,
        RT6_NUD_SUCCEED;

    }

    @Type(noCCodeGeneration=true, cType="struct rt6_exception")
    @NotUsableInJava
    public static class rt6_exception
    extends Struct {
        public misc.hlist_node hlist;
        public Ptr<rt6_info> rt6i;
        public @Unsigned long stamp;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct rt6_rtnl_dump_arg")
    @NotUsableInJava
    public static class rt6_rtnl_dump_arg
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<NetlinkDefinitions.netlink_callback> cb;
        public Ptr<runtime.net> net;
        public FibDefinitions.fib_dump_filter filter;
    }

    @Type(noCCodeGeneration=true, cType="struct rt6_exception_bucket")
    @NotUsableInJava
    public static class rt6_exception_bucket
    extends Struct {
        public misc.hlist_head chain;
        public int depth;
    }

    @Type(noCCodeGeneration=true, cType="struct rt6_statistics")
    @NotUsableInJava
    public static class rt6_statistics
    extends Struct {
        public @Unsigned int fib_nodes;
        public @Unsigned int fib_route_nodes;
        public @Unsigned int fib_rt_entries;
        public @Unsigned int fib_rt_cache;
        public @Unsigned int fib_discarded_routes;
        public AtomicDefinitions.atomic_t fib_rt_alloc;
    }

    @Type(noCCodeGeneration=true, cType="struct rt6_info")
    @NotUsableInJava
    public static class rt6_info
    extends Struct {
        public DstDefinitions.dst_entry dst;
        public Ptr<Fib6Definitions.fib6_info> from;
        public int sernum;
        public runtime.rt6key rt6i_dst;
        public runtime.rt6key rt6i_src;
        public In6Definitions.in6_addr rt6i_gateway;
        public Ptr<Inet6Definitions.inet6_dev> rt6i_idev;
        public @Unsigned int rt6i_flags;
        public @Unsigned short rt6i_nfheader_len;
    }
}

