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
import me.bechberger.ebpf.runtime.AddrDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LwtunnelDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TrieDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FibDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_alias_hw_flags_set($arg1, (const struct fib_rt_info*)$arg2)")
    public static void fib_alias_hw_flags_set(Ptr<runtime.net> net2, Ptr<fib_rt_info> fri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_default_rule_add(Ptr<fib_rules_ops> ops, @Unsigned int pref, @Unsigned int table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib_alias> fib_find_alias(Ptr<misc.hlist_head> fah, char slen, @OriginalName(value="dscp_t") char dscp, @Unsigned int prio, @Unsigned int tb_id, boolean find_first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<KeyDefinitions.key_vector> fib_find_node(Ptr<trie> t, Ptr<Ptr<KeyDefinitions.key_vector>> tp, @Unsigned int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_free_table(Ptr<fib_table> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_info_notify_update(Ptr<runtime.net> net2, Ptr<misc.nl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_insert_alias(Ptr<trie> t, Ptr<KeyDefinitions.key_vector> tp, Ptr<KeyDefinitions.key_vector> l, Ptr<fib_alias> _new, Ptr<fib_alias> fa, @Unsigned @OriginalName(value="t_key") int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_lookup_good_nhc((const struct fib_nh_common*)$arg1, $arg2, (const struct flowi4*)$arg3)")
    public static boolean fib_lookup_good_nhc(Ptr<fib_nh_common> nhc, int fib_flags, Ptr<runtime.flowi4> flp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_nl_delrule(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_nl_dumprule(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_nl_fill_rule(Ptr<SkDefinitions.sk_buff> skb, Ptr<fib_rule> rule, @Unsigned int pid2, @Unsigned int seq, int type2, int flags, Ptr<fib_rules_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_nl_newrule(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_notifier_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_notifier_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_notifier_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_notifier_ops_register((const struct fib_notifier_ops*)$arg1, $arg2)")
    public static Ptr<fib_notifier_ops> fib_notifier_ops_register(Ptr<fib_notifier_ops> tmpl, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_notifier_ops_unregister(Ptr<fib_notifier_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_notify(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_notify_alias_delete(Ptr<runtime.net> net2, @Unsigned int key2, Ptr<misc.hlist_head> fah, Ptr<fib_alias> fa_to_delete, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_proc_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_proc_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_remove_alias(Ptr<trie> t, Ptr<KeyDefinitions.key_vector> tp, Ptr<KeyDefinitions.key_vector> l, Ptr<fib_alias> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fib_route_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_route_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fib_route_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_route_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_rule_matchall((const struct fib_rule*)$arg1)")
    public static boolean fib_rule_matchall(Ptr<fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_rules_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, int family, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_rules_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_rules_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_rules_lookup(Ptr<fib_rules_ops> ops, Ptr<runtime.flowi> fl, int flags, Ptr<fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_rules_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_rules_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_rules_register((const struct fib_rules_ops*)$arg1, $arg2)")
    public static Ptr<fib_rules_ops> fib_rules_register(Ptr<fib_rules_ops> tmpl, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fib_rules_seq_read(Ptr<runtime.net> net2, int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_rules_unregister(Ptr<fib_rules_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fib_seq_sum(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_table_delete(Ptr<runtime.net> net2, Ptr<fib_table> tb, Ptr<fib_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_table_dump(Ptr<fib_table> tb, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<fib_dump_filter> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_table_flush(Ptr<runtime.net> net2, Ptr<fib_table> tb, boolean flush_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_table_flush_external(Ptr<fib_table> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_table_insert(Ptr<runtime.net> net2, Ptr<fib_table> tb, Ptr<fib_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_table_lookup($arg1, (const struct flowi4*)$arg2, $arg3, $arg4)")
    public static int fib_table_lookup(Ptr<fib_table> tb, Ptr<runtime.flowi4> flp, Ptr<fib_result> res, int fib_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<KeyDefinitions.key_vector> fib_trie_get_next(Ptr<fib_trie_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_trie_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fib_trie_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_trie_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fib_trie_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_trie_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib_table> fib_trie_table(@Unsigned int id, Ptr<fib_table> alias) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib_table> fib_trie_unmerge(Ptr<fib_table> oldtb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_triestat_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_add_nexthop($arg1, (const struct fib_nh_common*)$arg2, $arg3, $arg4, $arg5)")
    public static int fib_add_nexthop(Ptr<SkDefinitions.sk_buff> skb, Ptr<fib_nh_common> nhc, int nh_weight, char rt_family, @Unsigned int nh_tclassid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_check_nh(Ptr<runtime.net> net2, Ptr<fib_nh> nh, @Unsigned int table, char scope, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_check_nh_v4_gw(Ptr<runtime.net> net2, Ptr<fib_nh> nh, @Unsigned int table, char scope, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_check_nh_v6_gw(Ptr<runtime.net> net2, Ptr<fib_nh> nh, @Unsigned int table, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib_info> fib_create_info(Ptr<fib_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_detect_death(Ptr<fib_info> fi, int order, Ptr<Ptr<fib_info>> last_resort, Ptr<Integer> last_idx, int dflt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_dump_info($arg1, $arg2, $arg3, $arg4, (const struct fib_rt_info*)$arg5, $arg6)")
    public static int fib_dump_info(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int seq, int event2, Ptr<fib_rt_info> fri, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib_info> fib_find_info(Ptr<fib_info> nfi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_get_nhs(Ptr<fib_info> fi, Ptr<rtnexthop> rtnh, int remaining, Ptr<fib_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_info_hash_move(Ptr<misc.hlist_head> new_info_hash, Ptr<misc.hlist_head> new_laddrhash, @Unsigned int new_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be32") int fib_info_update_nhc_saddr(Ptr<runtime.net> net2, Ptr<fib_nh_common> nhc, char scope) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fib_metrics_match(Ptr<fib_config> cfg, Ptr<fib_info> fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_nexthop_info($arg1, (const struct fib_nh_common*)$arg2, $arg3, $arg4, $arg5)")
    public static int fib_nexthop_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<fib_nh_common> nhc, char rt_family, String flags, boolean skip_oif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_nh_common_init(Ptr<runtime.net> net2, Ptr<fib_nh_common> nhc, Ptr<runtime.nlattr> encap, @Unsigned short encap_type, Ptr<?> cfg, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_nh_common_release(Ptr<fib_nh_common> nhc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_nh_init(Ptr<runtime.net> net2, Ptr<fib_nh> nh, Ptr<fib_config> cfg, int nh_weight, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_nh_match(Ptr<runtime.net> net2, Ptr<fib_config> cfg, Ptr<fib_info> fi, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_nh_release(Ptr<runtime.net> net2, Ptr<fib_nh> fib_nh2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_nhc_update_mtu(Ptr<fib_nh_common> nhc, @Unsigned int _new, @Unsigned int orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fib_nlmsg_size(Ptr<fib_info> fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_rebalance(Ptr<fib_info> fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_release_info(Ptr<fib_info> fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be32") int fib_result_prefsrc(Ptr<runtime.net> net2, Ptr<fib_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_select_default((const struct flowi4*)$arg1, $arg2)")
    public static void fib_select_default(Ptr<runtime.flowi4> flp, Ptr<fib_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_select_multipath(Ptr<fib_result> res, int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_select_path($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4)")
    public static void fib_select_path(Ptr<runtime.net> net2, Ptr<fib_result> res, Ptr<runtime.flowi4> fl4, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_sync_down_addr(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int local) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_sync_down_dev(Ptr<NetDefinitions.net_device> dev, @Unsigned long event2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_sync_mtu(Ptr<NetDefinitions.net_device> dev, @Unsigned int orig_mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_sync_up(Ptr<NetDefinitions.net_device> dev, char nh_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fib_validate_source(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int src, @Unsigned @OriginalName(value="__be32") int dst, char tos, int oif, Ptr<NetDefinitions.net_device> dev, int rpf, Ptr<InDefinitions.in_device> idev, Ptr<@Unsigned Integer> itag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_add_ifaddr(Ptr<InDefinitions.in_ifaddr> ifa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_check_nexthop(Ptr<runtime.nexthop> nh, char scope, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be32") int fib_compute_spec_dst(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_del_ifaddr(Ptr<InDefinitions.in_ifaddr> ifa, Ptr<InDefinitions.in_ifaddr> iprim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_dump_info_fnhe(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, @Unsigned int table_id, Ptr<fib_info> fi, Ptr<Integer> fa_index, int fa_start, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_flush(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib_table> fib_get_table(Ptr<runtime.net> net2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_gw_from_via(Ptr<fib_config> cfg, Ptr<runtime.nlattr> nla, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_inetaddr_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_info_nh_uses_dev($arg1, (const struct net_device*)$arg2)")
    public static boolean fib_info_nh_uses_dev(Ptr<fib_info> fi, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_magic(int cmd, int type2, @Unsigned @OriginalName(value="__be32") int dst, int dst_len, Ptr<InDefinitions.in_ifaddr> ifa, @Unsigned int rt_priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_modify_prefix_metric(Ptr<InDefinitions.in_ifaddr> ifa, @Unsigned int new_metric) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib_multipath_hash((const struct net*)$arg1, (const struct flowi4*)$arg2, (const struct sk_buff*)$arg3, $arg4)")
    public static int fib_multipath_hash(Ptr<runtime.net> net2, Ptr<runtime.flowi4> fl4, Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_keys> flkeys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib_net_exit_batch(Ptr<ListDefinitions.list_head> net_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_netdev_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fib_table> fib_new_table(Ptr<runtime.net> net2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_unmerge(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib_validate_source(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int src, @Unsigned @OriginalName(value="__be32") int dst, char tos, int oif, Ptr<NetDefinitions.net_device> dev, Ptr<InDefinitions.in_device> idev, Ptr<@Unsigned Integer> itag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fib_lookup(Ptr<runtime.net> net2, Ptr<runtime.flowi4> flp, Ptr<fib_result> res, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rtnexthop")
    @NotUsableInJava
    public static class rtnexthop
    extends Struct {
        public @Unsigned short rtnh_len;
        public char rtnh_flags;
        public char rtnh_hops;
        public int rtnh_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct trie")
    @NotUsableInJava
    public static class trie
    extends Struct {
        public KeyDefinitions.key_vector @Size(value=1) [] kv;
        public Ptr<TrieDefinitions.trie_use_stats> stats;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_result_nl")
    @NotUsableInJava
    public static class fib_result_nl
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int fl_addr;
        public @Unsigned int fl_mark;
        public char fl_tos;
        public char fl_scope;
        public char tb_id_in;
        public char tb_id;
        public char prefixlen;
        public char nh_sel;
        public char type;
        public char scope;
        public int err;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_nh_notifier_info")
    @NotUsableInJava
    public static class fib_nh_notifier_info
    extends Struct {
        public fib_notifier_info info;
        public Ptr<fib_nh> fib_nh;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_route_iter")
    @NotUsableInJava
    public static class fib_route_iter
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public Ptr<fib_table> main_tb;
        public Ptr<KeyDefinitions.key_vector> tnode;
        public @OriginalName(value="loff_t") long pos;
        public @Unsigned @OriginalName(value="t_key") int key;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_trie_iter")
    @NotUsableInJava
    public static class fib_trie_iter
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public Ptr<fib_table> tb;
        public Ptr<KeyDefinitions.key_vector> tnode;
        public @Unsigned int index;
        public @Unsigned int depth;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_prop")
    @NotUsableInJava
    public static class fib_prop
    extends Struct {
        public int error;
        public char scope;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_alias")
    @NotUsableInJava
    public static class fib_alias
    extends Struct {
        public misc.hlist_node fa_list;
        public Ptr<fib_info> fa_info;
        public @OriginalName(value="dscp_t") char fa_dscp;
        public char fa_type;
        public char fa_state;
        public char fa_slen;
        public @Unsigned int tb_id;
        public short fa_default;
        public char offload;
        public char trap;
        public char offload_failed;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_entry_notifier_info")
    @NotUsableInJava
    public static class fib_entry_notifier_info
    extends Struct {
        public fib_notifier_info info;
        public @Unsigned int dst;
        public int dst_len;
        public Ptr<fib_info> fi;
        public @OriginalName(value="dscp_t") char dscp;
        public char type;
        public @Unsigned int tb_id;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_rt_info")
    @NotUsableInJava
    public static class fib_rt_info
    extends Struct {
        public Ptr<fib_info> fi;
        public @Unsigned int tb_id;
        public @Unsigned @OriginalName(value="__be32") int dst;
        public int dst_len;
        public @OriginalName(value="dscp_t") char dscp;
        public char type;
        public char offload;
        public char trap;
        public char offload_failed;
        public char unused;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_config")
    @NotUsableInJava
    public static class fib_config
    extends Struct {
        public char fc_dst_len;
        public @OriginalName(value="dscp_t") char fc_dscp;
        public char fc_protocol;
        public char fc_scope;
        public char fc_type;
        public char fc_gw_family;
        public @Unsigned int fc_table;
        public @Unsigned @OriginalName(value="__be32") int fc_dst;
        @InlineUnion(value=34485)
        public @InlineUnion(value=34485) @Unsigned @OriginalName(value="__be32") int fc_gw4;
        @InlineUnion(value=34485)
        public  @InlineUnion(value=34485) In6Definitions.in6_addr fc_gw6;
        public int fc_oif;
        public @Unsigned int fc_flags;
        public @Unsigned int fc_priority;
        public @Unsigned @OriginalName(value="__be32") int fc_prefsrc;
        public @Unsigned int fc_nh_id;
        public Ptr<runtime.nlattr> fc_mx;
        public Ptr<rtnexthop> fc_mp;
        public int fc_mx_len;
        public int fc_mp_len;
        public @Unsigned int fc_flow;
        public @Unsigned int fc_nlflags;
        public misc.nl_info fc_nlinfo;
        public Ptr<runtime.nlattr> fc_encap;
        public @Unsigned short fc_encap_type;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_rule_notifier_info")
    @NotUsableInJava
    public static class fib_rule_notifier_info
    extends Struct {
        public fib_notifier_info info;
        public Ptr<fib_rule> rule;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_rule_uid_range")
    @NotUsableInJava
    public static class fib_rule_uid_range
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int end;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_notifier_net")
    @NotUsableInJava
    public static class fib_notifier_net
    extends Struct {
        public ListDefinitions.list_head fib_notifier_ops;
        public AtomicDefinitions.atomic_notifier_head fib_chain;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_dump_filter")
    @NotUsableInJava
    public static class fib_dump_filter
    extends Struct {
        public @Unsigned int table_id;
        public boolean filter_set;
        public boolean dump_routes;
        public boolean dump_exceptions;
        public boolean rtnl_held;
        public char protocol;
        public char rt_type;
        public @Unsigned int flags;
        public Ptr<NetDefinitions.net_device> dev;
    }

    @Type(noCCodeGeneration=true, cType="enum fib_event_type")
    public static enum fib_event_type implements Enum<fib_event_type>,
    TypedEnum<fib_event_type, Integer>
    {
        FIB_EVENT_ENTRY_REPLACE,
        FIB_EVENT_ENTRY_APPEND,
        FIB_EVENT_ENTRY_ADD,
        FIB_EVENT_ENTRY_DEL,
        FIB_EVENT_RULE_ADD,
        FIB_EVENT_RULE_DEL,
        FIB_EVENT_NH_ADD,
        FIB_EVENT_NH_DEL,
        FIB_EVENT_VIF_ADD,
        FIB_EVENT_VIF_DEL;

    }

    @Type(noCCodeGeneration=true, cType="struct fib_notifier_info")
    @NotUsableInJava
    public static class fib_notifier_info
    extends Struct {
        public int family;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_result")
    @NotUsableInJava
    public static class fib_result
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int prefix;
        public char prefixlen;
        public char nh_sel;
        public char type;
        public char scope;
        public @Unsigned int tclassid;
        public @OriginalName(value="dscp_t") char dscp;
        public Ptr<fib_nh_common> nhc;
        public Ptr<fib_info> fi;
        public Ptr<fib_table> table;
        public Ptr<misc.hlist_head> fa_head;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_info")
    @NotUsableInJava
    public static class fib_info
    extends Struct {
        public misc.hlist_node fib_hash;
        public misc.hlist_node fib_lhash;
        public ListDefinitions.list_head nh_list;
        public Ptr<runtime.net> fib_net;
        public  @OriginalName(value="refcount_t") misc.refcount_struct fib_treeref;
        public  @OriginalName(value="refcount_t") misc.refcount_struct fib_clntref;
        public @Unsigned int fib_flags;
        public char fib_dead;
        public char fib_protocol;
        public char fib_scope;
        public char fib_type;
        public @Unsigned @OriginalName(value="__be32") int fib_prefsrc;
        public @Unsigned int fib_tb_id;
        public @Unsigned int fib_priority;
        public Ptr<DstDefinitions.dst_metrics> fib_metrics;
        public int fib_nhs;
        public boolean fib_nh_is_v6;
        public boolean nh_updated;
        public boolean pfsrc_removed;
        public Ptr<runtime.nexthop> nh;
        public misc.callback_head rcu;
        public fib_nh @Size(value=0) [] fib_nh;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_nh")
    @NotUsableInJava
    public static class fib_nh
    extends Struct {
        public fib_nh_common nh_common;
        public misc.hlist_node nh_hash;
        public Ptr<fib_info> nh_parent;
        public @Unsigned int nh_tclassid;
        public @Unsigned @OriginalName(value="__be32") int nh_saddr;
        public int nh_saddr_genid;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_nh_common")
    @NotUsableInJava
    public static class fib_nh_common
    extends Struct {
        public Ptr<NetDefinitions.net_device> nhc_dev;
        public  @OriginalName(value="netdevice_tracker") misc.lockdep_map_p nhc_dev_tracker;
        public int nhc_oif;
        public char nhc_scope;
        public char nhc_family;
        public char nhc_gw_family;
        public char nhc_flags;
        public Ptr<LwtunnelDefinitions.lwtunnel_state> nhc_lwtstate;
        public AddrDefinitions.addr_of_netnode_security_struct_and_anon_member_of_nh_notifier_single_info_and_gw_of_nh_config nhc_gw;
        public int nhc_weight;
        public AtomicDefinitions.atomic_t nhc_upper_bound;
        public Ptr<Ptr<runtime.rtable>> nhc_pcpu_rth_output;
        public Ptr<runtime.rtable> nhc_rth_input;
        public Ptr<misc.fnhe_hash_bucket> nhc_exceptions;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_nh_exception")
    @NotUsableInJava
    public static class fib_nh_exception
    extends Struct {
        public Ptr<fib_nh_exception> fnhe_next;
        public int fnhe_genid;
        public @Unsigned @OriginalName(value="__be32") int fnhe_daddr;
        public @Unsigned int fnhe_pmtu;
        public boolean fnhe_mtu_locked;
        public @Unsigned @OriginalName(value="__be32") int fnhe_gw;
        public @Unsigned long fnhe_expires;
        public Ptr<runtime.rtable> fnhe_rth_input;
        public Ptr<runtime.rtable> fnhe_rth_output;
        public @Unsigned long fnhe_stamp;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_table")
    @NotUsableInJava
    public static class fib_table
    extends Struct {
        public misc.hlist_node tb_hlist;
        public @Unsigned int tb_id;
        public int tb_num_default;
        public misc.callback_head rcu;
        public Ptr<@Unsigned Long> tb_data;
        public @Unsigned long @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_lookup_arg")
    @NotUsableInJava
    public static class fib_lookup_arg
    extends Struct {
        public Ptr<?> lookup_ptr;
        public Ptr<?> lookup_data;
        public Ptr<?> result;
        public Ptr<fib_rule> rule;
        public @Unsigned int table;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_rule")
    @NotUsableInJava
    public static class fib_rule
    extends Struct {
        public ListDefinitions.list_head list;
        public int iifindex;
        public int oifindex;
        public @Unsigned int mark;
        public @Unsigned int mark_mask;
        public @Unsigned int flags;
        public @Unsigned int table;
        public char action;
        public char l3mdev;
        public char proto;
        public char ip_proto;
        public @Unsigned int target;
        public @Unsigned @OriginalName(value="__be64") long tun_id;
        public Ptr<fib_rule> ctarget;
        public Ptr<runtime.net> fr_net;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned int pref;
        public int suppress_ifgroup;
        public int suppress_prefixlen;
        public char @Size(value=16) [] iifname;
        public char @Size(value=16) [] oifname;
        public fib_kuid_range uid_range;
        public fib_rule_port_range sport_range;
        public fib_rule_port_range dport_range;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_kuid_range")
    @NotUsableInJava
    public static class fib_kuid_range
    extends Struct {
        public misc.kuid_t start;
        public misc.kuid_t end;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_rule_port_range")
    @NotUsableInJava
    public static class fib_rule_port_range
    extends Struct {
        public @Unsigned short start;
        public @Unsigned short end;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_rule_hdr")
    @NotUsableInJava
    public static class fib_rule_hdr
    extends Struct {
        public char family;
        public char dst_len;
        public char src_len;
        public char tos;
        public char table;
        public char res1;
        public char res2;
        public char action;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_notifier_ops")
    @NotUsableInJava
    public static class fib_notifier_ops
    extends Struct {
        public int family;
        public ListDefinitions.list_head list;
        public Ptr<?> fib_seq_read;
        public Ptr<?> fib_dump;
        public Ptr<runtime.module> owner;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct fib_rules_ops")
    @NotUsableInJava
    public static class fib_rules_ops
    extends Struct {
        public int family;
        public ListDefinitions.list_head list;
        public int rule_size;
        public int addr_size;
        public int unresolved_rules;
        public int nr_goto_rules;
        public @Unsigned int fib_rules_seq;
        public Ptr<?> action;
        public Ptr<?> suppress;
        public Ptr<?> match;
        public Ptr<?> configure;
        public Ptr<?> delete;
        public Ptr<?> compare;
        public Ptr<?> fill;
        public Ptr<?> nlmsg_payload;
        public Ptr<?> flush_cache;
        public int nlgroup;
        public ListDefinitions.list_head rules_list;
        public Ptr<runtime.module> owner;
        public Ptr<runtime.net> fro_net;
        public misc.callback_head rcu;
    }
}

