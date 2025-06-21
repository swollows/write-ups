/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LookupDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.Rt6Definitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Fib6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fib6_rule_action(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> flp, int flags, Ptr<FibDefinitions.fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_info_release(Ptr<fib6_info> f6i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_lookup(Ptr<runtime.net> net2, int oif, Ptr<runtime.flowi6> fl6, Ptr<fib6_result> res, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rule_action(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> flp, int flags, Ptr<FibDefinitions.fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rule_compare(Ptr<FibDefinitions.fib_rule> rule, Ptr<FibDefinitions.fib_rule_hdr> frh, Ptr<Ptr<runtime.nlattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rule_configure(Ptr<FibDefinitions.fib_rule> rule, Ptr<SkDefinitions.sk_buff> skb, Ptr<FibDefinitions.fib_rule_hdr> frh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_rule_default((const struct fib_rule*)$arg1)")
    public static boolean fib6_rule_default(Ptr<FibDefinitions.fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rule_delete(Ptr<FibDefinitions.fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rule_fill(Ptr<FibDefinitions.fib_rule> rule, Ptr<SkDefinitions.sk_buff> skb, Ptr<FibDefinitions.fib_rule_hdr> frh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_rule_flush_cache(Ptr<FibDefinitions.fib_rules_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_rule_lookup($arg1, $arg2, (const struct sk_buff*)$arg3, $arg4, $arg5)")
    public static Ptr<DstDefinitions.dst_entry> fib6_rule_lookup(Ptr<runtime.net> net2, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, int flags, @OriginalName(value="pol_lookup_t") Ptr<?> lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rule_match(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> fl, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fib6_rule_nlmsg_payload(Ptr<FibDefinitions.fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_rule_saddr($arg1, $arg2, $arg3, $arg4, (const struct net_device*)$arg5)")
    public static int fib6_rule_saddr(Ptr<runtime.net> net2, Ptr<FibDefinitions.fib_rule> rule, int flags, Ptr<runtime.flowi6> flp6, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fib6_rule_suppress(Ptr<FibDefinitions.fib_rule> rule, int flags, Ptr<FibDefinitions.fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_rules_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rules_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rules_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_rules_net_exit_batch(Ptr<ListDefinitions.list_head> net_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_rules_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fib6_rules_seq_read(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib6_node> fib6_backtrack(Ptr<fib6_node> fn, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_check_nexthop(Ptr<runtime.nexthop> nh, Ptr<fib6_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_check_nh_list(Ptr<runtime.nexthop> old, Ptr<runtime.nexthop> _new, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_clean_tohost(Ptr<fib6_info> rt, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_ifdown(Ptr<fib6_info> rt, Ptr<?> p_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_ifup(Ptr<fib6_info> rt, Ptr<?> p_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_info_hw_flags_set(Ptr<runtime.net> net2, Ptr<fib6_info> f6i, boolean offload, boolean trap, boolean offload_failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_info_nh_uses_dev(Ptr<fib6_nh> nh, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_nh_age_exceptions((const struct fib6_nh*)$arg1, $arg2, $arg3)")
    public static void fib6_nh_age_exceptions(Ptr<fib6_nh> nh, Ptr<fib6_gc_args> gc_args, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_nh_del_cached_rt(Ptr<fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_nh_find_match(Ptr<fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_nh_flush_exceptions(Ptr<fib6_nh> nh, Ptr<fib6_info> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_nh_init(Ptr<runtime.net> net2, Ptr<fib6_nh> fib6_nh2, Ptr<fib6_config> cfg, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_nh_mtu_change(Ptr<fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_nh_redirect_match(Ptr<fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_nh_release(Ptr<fib6_nh> fib6_nh2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_nh_release_dsts(Ptr<fib6_nh> fib6_nh2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_nh_remove_exception((const struct fib6_nh*)$arg1, $arg2, (const struct rt6_info*)$arg3)")
    public static int fib6_nh_remove_exception(Ptr<fib6_nh> nh, int plen, Ptr<Rt6Definitions.rt6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_notifier_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_notifier_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_remove_prefsrc(Ptr<fib6_info> rt, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_rt_update(Ptr<runtime.net> net2, Ptr<fib6_info> rt, Ptr<misc.nl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_select_path((const struct net*)$arg1, $arg2, $arg3, $arg4, $arg5, (const struct sk_buff*)$arg6, $arg7)")
    public static void fib6_select_path(Ptr<runtime.net> net2, Ptr<fib6_result> res, Ptr<runtime.flowi6> fl6, int oif, boolean have_oif_match, Ptr<SkDefinitions.sk_buff> skb, int strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fib6_seq_read(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_table_lookup(Ptr<runtime.net> net2, Ptr<fib6_table> table, int oif, Ptr<runtime.flowi6> fl6, Ptr<fib6_result> res, int strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__fib6_clean_all($arg1, (int (*)(struct fib6_info*, void*))$arg2, $arg3, $arg4, $arg5)")
    public static void __fib6_clean_all(Ptr<runtime.net> net2, Ptr<?> func, int sernum, Ptr<?> arg2, boolean skip_notify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__fib6_drop_pcpu_from($arg1, (const struct fib6_info*)$arg2, (const struct fib6_table*)$arg3)")
    public static void __fib6_drop_pcpu_from(Ptr<fib6_nh> fib6_nh2, Ptr<fib6_info> match, Ptr<fib6_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_add(Ptr<fib6_node> root, Ptr<fib6_info> rt, Ptr<misc.nl_info> info2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_add_rt2node(Ptr<fib6_node> fn, Ptr<fib6_info> rt, Ptr<misc.nl_info> info2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_clean_all($arg1, (int (*)(struct fib6_info*, void*))$arg2, $arg3)")
    public static void fib6_clean_all(Ptr<runtime.net> net2, Ptr<?> func, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_clean_all_skip_notify($arg1, (int (*)(struct fib6_info*, void*))$arg2, $arg3)")
    public static void fib6_clean_all_skip_notify(Ptr<runtime.net> net2, Ptr<?> func, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_clean_node(Ptr<fib6_walker> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_clean_tree($arg1, $arg2, (int (*)(struct fib6_info*, void*))$arg3, $arg4, $arg5, $arg6)")
    public static void fib6_clean_tree(Ptr<runtime.net> net2, Ptr<fib6_node> root, Ptr<?> func, int sernum, Ptr<?> arg2, boolean skip_notify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_del(Ptr<fib6_info> rt, Ptr<misc.nl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_dump_done(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_dump_node(Ptr<fib6_walker> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_flush_trees(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_force_start_gc(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_gc_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_gc_timer_cb(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib6_table> fib6_get_table(Ptr<runtime.net> net2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib6_info> fib6_info_alloc(@Unsigned @OriginalName(value="gfp_t") int gfp_flags, boolean with_fib6_nh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_info_destroy_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_locate($arg1, (const struct in6_addr*)$arg2, $arg3, (const struct in6_addr*)$arg4, $arg5, $arg6)")
    public static Ptr<fib6_node> fib6_locate(Ptr<fib6_node> root, Ptr<In6Definitions.in6_addr> daddr, int dst_len, Ptr<In6Definitions.in6_addr> saddr, int src_len, boolean exact_match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_locate_1($arg1, (const struct in6_addr*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<fib6_node> fib6_locate_1(Ptr<fib6_node> root, Ptr<In6Definitions.in6_addr> addr2, int plen, int offset, boolean exact_match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_metric_set(Ptr<fib6_info> f6i, int metric, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_new_sernum(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib6_table> fib6_new_table(Ptr<runtime.net> net2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_nh_drop_pcpu_from(Ptr<fib6_nh> nh, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_node_dump(Ptr<fib6_walker> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib6_node_lookup($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static Ptr<fib6_node> fib6_node_lookup(Ptr<fib6_node> root, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib6_node> fib6_node_lookup_1(Ptr<fib6_node> root, Ptr<LookupDefinitions.lookup_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_purge_rt(Ptr<fib6_info> rt, Ptr<fib6_node> fn, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_run_gc(@Unsigned long expires, Ptr<runtime.net> net2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_tables_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fib6_tables_seq_read(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_update_sernum(Ptr<runtime.net> net2, Ptr<fib6_info> f6i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_update_sernum_stub(Ptr<runtime.net> net2, Ptr<fib6_info> f6i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib6_update_sernum_upto_root(Ptr<runtime.net> net2, Ptr<fib6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib6_walk_continue(Ptr<fib6_walker> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_exception_dump_walker")
    @NotUsableInJava
    public static class fib6_nh_exception_dump_walker
    extends Struct {
        public Ptr<Rt6Definitions.rt6_rtnl_dump_arg> dump;
        public Ptr<fib6_info> rt;
        public @Unsigned int flags;
        public @Unsigned int skip;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_del_cached_rt_arg")
    @NotUsableInJava
    public static class fib6_nh_del_cached_rt_arg
    extends Struct {
        public Ptr<fib6_config> cfg;
        public Ptr<fib6_info> f6i;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_rd_arg")
    @NotUsableInJava
    public static class fib6_nh_rd_arg
    extends Struct {
        public Ptr<fib6_result> res;
        public Ptr<runtime.flowi6> fl6;
        public Ptr<In6Definitions.in6_addr> gw;
        public Ptr<Ptr<Rt6Definitions.rt6_info>> ret;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_age_excptn_arg")
    @NotUsableInJava
    public static class fib6_nh_age_excptn_arg
    extends Struct {
        public Ptr<fib6_gc_args> gc_args;
        public @Unsigned long now;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_match_arg")
    @NotUsableInJava
    public static class fib6_nh_match_arg
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<In6Definitions.in6_addr> gw;
        public Ptr<fib6_nh> match;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_excptn_arg")
    @NotUsableInJava
    public static class fib6_nh_excptn_arg
    extends Struct {
        public Ptr<Rt6Definitions.rt6_info> rt;
        public int plen;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_frl_arg")
    @NotUsableInJava
    public static class fib6_nh_frl_arg
    extends Struct {
        public @Unsigned int flags;
        public int oif;
        public int strict;
        public Ptr<Integer> mpri;
        public Ptr<@OriginalName(value="bool") Boolean> do_rr;
        public Ptr<fib6_nh> nh;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_dm_arg")
    @NotUsableInJava
    public static class fib6_nh_dm_arg
    extends Struct {
        public Ptr<runtime.net> net;
        public Ptr<In6Definitions.in6_addr> saddr;
        public int oif;
        public int flags;
        public Ptr<fib6_nh> nh;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_rule")
    @NotUsableInJava
    public static class fib6_rule
    extends Struct {
        public FibDefinitions.fib_rule common;
        public runtime.rt6key src;
        public runtime.rt6key dst;
        public @OriginalName(value="dscp_t") char dscp;
        public char dscp_full;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh_pcpu_arg")
    @NotUsableInJava
    public static class fib6_nh_pcpu_arg
    extends Struct {
        public Ptr<fib6_info> from;
        public Ptr<fib6_table> table;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_dump_arg")
    @NotUsableInJava
    public static class fib6_dump_arg
    extends Struct {
        public Ptr<runtime.net> net;
        public Ptr<misc.notifier_block> nb;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_cleaner")
    @NotUsableInJava
    public static class fib6_cleaner
    extends Struct {
        public fib6_walker w;
        public Ptr<runtime.net> net;
        public Ptr<?> func;
        public int sernum;
        public Ptr<?> arg;
        public boolean skip_notify;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_entry_notifier_info")
    @NotUsableInJava
    public static class fib6_entry_notifier_info
    extends Struct {
        public FibDefinitions.fib_notifier_info info;
        public Ptr<fib6_info> rt;
        public @Unsigned int nsiblings;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_walker")
    @NotUsableInJava
    public static class fib6_walker
    extends Struct {
        public ListDefinitions.list_head lh;
        public Ptr<fib6_node> root;
        public Ptr<fib6_node> node;
        public Ptr<fib6_info> leaf;
        public fib6_walk_state state;
        public @Unsigned int skip;
        public @Unsigned int count;
        public @Unsigned int skip_in_node;
        public Ptr<?> func;
        public Ptr<?> args;
    }

    @Type(noCCodeGeneration=true, cType="enum fib6_walk_state")
    public static enum fib6_walk_state implements Enum<fib6_walk_state>,
    TypedEnum<fib6_walk_state, Integer>
    {
        FWS_S,
        FWS_L,
        FWS_R,
        FWS_C,
        FWS_U;

    }

    @Type(noCCodeGeneration=true, cType="struct fib6_gc_args")
    @NotUsableInJava
    public static class fib6_gc_args
    extends Struct {
        public int timeout;
        public int more;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_node")
    @NotUsableInJava
    public static class fib6_node
    extends Struct {
        public Ptr<fib6_node> parent;
        public Ptr<fib6_node> left;
        public Ptr<fib6_node> right;
        public Ptr<fib6_node> subtree;
        public Ptr<fib6_info> leaf;
        public @Unsigned short fn_bit;
        public @Unsigned short fn_flags;
        public int fn_sernum;
        public Ptr<fib6_info> rr_ptr;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_config")
    @NotUsableInJava
    public static class fib6_config
    extends Struct {
        public @Unsigned int fc_table;
        public @Unsigned int fc_metric;
        public int fc_dst_len;
        public int fc_src_len;
        public int fc_ifindex;
        public @Unsigned int fc_flags;
        public @Unsigned int fc_protocol;
        public @Unsigned short fc_type;
        public @Unsigned short fc_delete_all_nh;
        public @Unsigned short fc_ignore_dev_down;
        public @Unsigned short __unused;
        public @Unsigned int fc_nh_id;
        public In6Definitions.in6_addr fc_dst;
        public In6Definitions.in6_addr fc_src;
        public In6Definitions.in6_addr fc_prefsrc;
        public In6Definitions.in6_addr fc_gateway;
        public @Unsigned long fc_expires;
        public Ptr<runtime.nlattr> fc_mx;
        public int fc_mx_len;
        public int fc_mp_len;
        public Ptr<runtime.nlattr> fc_mp;
        public misc.nl_info fc_nlinfo;
        public Ptr<runtime.nlattr> fc_encap;
        public @Unsigned short fc_encap_type;
        public boolean fc_is_fdb;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_nh")
    @NotUsableInJava
    public static class fib6_nh
    extends Struct {
        public FibDefinitions.fib_nh_common nh_common;
        public @Unsigned long last_probe;
        public Ptr<Ptr<Rt6Definitions.rt6_info>> rt6i_pcpu;
        public Ptr<Rt6Definitions.rt6_exception_bucket> rt6i_exception_bucket;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_result")
    @NotUsableInJava
    public static class fib6_result
    extends Struct {
        public Ptr<fib6_nh> nh;
        public Ptr<fib6_info> f6i;
        public @Unsigned int fib6_flags;
        public char fib6_type;
        public Ptr<Rt6Definitions.rt6_info> rt6;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_table")
    @NotUsableInJava
    public static class fib6_table
    extends Struct {
        public misc.hlist_node tb6_hlist;
        public @Unsigned int tb6_id;
        public  @OriginalName(value="spinlock_t") runtime.spinlock tb6_lock;
        public fib6_node tb6_root;
        public InetDefinitions.inet_peer_base tb6_peers;
        public @Unsigned int flags;
        public @Unsigned int fib_seq;
        public misc.hlist_head tb6_gc_hlist;
    }

    @Type(noCCodeGeneration=true, cType="struct fib6_info")
    @NotUsableInJava
    public static class fib6_info
    extends Struct {
        public Ptr<fib6_table> fib6_table;
        public Ptr<fib6_info> fib6_next;
        public Ptr<fib6_node> fib6_node;
        @InlineUnion(value=23808)
        public @InlineUnion(value=23808) ListDefinitions.list_head fib6_siblings;
        @InlineUnion(value=23808)
        public @InlineUnion(value=23808) ListDefinitions.list_head nh_list;
        public @Unsigned int fib6_nsiblings;
        public @OriginalName(value="refcount_t") misc.refcount_struct fib6_ref;
        public @Unsigned long expires;
        public misc.hlist_node gc_link;
        public Ptr<DstDefinitions.dst_metrics> fib6_metrics;
        public runtime.rt6key fib6_dst;
        public @Unsigned int fib6_flags;
        public runtime.rt6key fib6_src;
        public runtime.rt6key fib6_prefsrc;
        public @Unsigned int fib6_metric;
        public char fib6_protocol;
        public char fib6_type;
        public char offload;
        public char trap;
        public char offload_failed;
        public char should_flush;
        public char dst_nocount;
        public char dst_nopolicy;
        public char fib6_destroying;
        public char unused;
        public misc.callback_head rcu;
        public Ptr<runtime.nexthop> nh;
        public fib6_nh @Size(value=0) [] fib6_nh;
    }
}

