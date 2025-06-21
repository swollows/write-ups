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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ClassDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RtnlDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NetdevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_bits($arg1, $arg2, (const void*)$arg3, $arg4, (const u8*)$arg5)")
    public static String netdev_bits(String buf, String end, Ptr<?> addr2, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)netdev_name((const struct net_device*)$arg1))")
    public static String netdev_name(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_page_pool_event((const struct page_pool*)$arg1, $arg2)")
    public static void netdev_nl_page_pool_event(Ptr<PageDefinitions.page_pool> pool, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_page_pool_get_do(Ptr<GenlDefinitions.genl_info> info2, @Unsigned int id, @OriginalName(value="pp_nl_fill_cb") Ptr<?> fill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_page_pool_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_page_pool_get_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, @OriginalName(value="pp_nl_fill_cb") Ptr<?> fill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_page_pool_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_page_pool_stats_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_page_pool_stats_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_change_owner($arg1, (const struct net*)$arg2, (const struct net*)$arg3)")
    public static int netdev_change_owner(Ptr<NetDefinitions.net_device> ndev, Ptr<runtime.net> net_old, Ptr<runtime.net> net_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_class_create_file_ns((const struct class_attribute*)$arg1, (const void*)$arg2)")
    public static int netdev_class_create_file_ns(Ptr<ClassDefinitions.class_attribute> class_attr, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_class_remove_file_ns((const struct class_attribute*)$arg1, (const void*)$arg2)")
    public static void netdev_class_remove_file_ns(Ptr<ClassDefinitions.class_attribute> class_attr, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_kobject_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long netdev_queue_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_queue_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long netdev_queue_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_queue_get_ownership((const struct kobject*)$arg1, $arg2, $arg3)")
    public static void netdev_queue_get_ownership(Ptr<runtime.kobject> kobj, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)netdev_queue_namespace((const struct kobject*)$arg1))")
    public static Ptr<?> netdev_queue_namespace(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_queue_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_queue_update_kobjects(Ptr<NetDefinitions.net_device> dev, int old_num, int new_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_register_kobject(Ptr<NetDefinitions.net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_release(Ptr<runtime.device> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_rx_queue_set_rps_mask(Ptr<netdev_rx_queue> queue, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_uevent((const struct device*)$arg1, $arg2)")
    public static int netdev_uevent(Ptr<runtime.device> d, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_unregister_kobject(Ptr<NetDefinitions.net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ____netdev_has_upper_dev(Ptr<NetDefinitions.net_device> upper_dev, Ptr<netdev_nested_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netdev_adjacent_dev_insert(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> adj_dev, Ptr<ListDefinitions.list_head> dev_list, Ptr<?> _private, boolean master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netdev_adjacent_dev_remove(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> adj_dev, @Unsigned short ref_nr, Ptr<ListDefinitions.list_head> dev_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netdev_adjacent_dev_set(Ptr<NetDefinitions.net_device> upper_dev, Ptr<NetDefinitions.net_device> lower_dev, boolean val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __netdev_alloc_frag_align(@Unsigned int fragsz, @Unsigned int align_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __netdev_alloc_skb(Ptr<NetDefinitions.net_device> dev, @Unsigned int len, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __netdev_has_upper_dev(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> upper_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char __netdev_lower_depth(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netdev_notify_peers(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__netdev_printk((const u8*)$arg1, (const struct net_device*)$arg2, $arg3)")
    public static void __netdev_printk(String level, Ptr<NetDefinitions.net_device> dev, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __netdev_tx_sent_queue(Ptr<netdev_queue> dev_queue, @Unsigned int bytes, boolean xmit_more) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netdev_update_features(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netdev_update_lower_level(Ptr<NetDefinitions.net_device> dev, Ptr<netdev_nested_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netdev_update_upper_level(Ptr<NetDefinitions.net_device> dev, Ptr<netdev_nested_priv> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char __netdev_upper_depth(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netdev_upper_dev_link(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> upper_dev, boolean master, Ptr<?> upper_priv, Ptr<?> upper_info, Ptr<netdev_nested_priv> priv, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netdev_upper_dev_unlink(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> upper_dev, Ptr<netdev_nested_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__netdev_walk_all_upper_dev($arg1, (int (*)(struct net_device*, struct netdev_nested_priv*))$arg2, $arg3)")
    public static int __netdev_walk_all_upper_dev(Ptr<NetDefinitions.net_device> dev, Ptr<?> fn, Ptr<netdev_nested_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_adjacent_change_abort(Ptr<NetDefinitions.net_device> old_dev, Ptr<NetDefinitions.net_device> new_dev, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_adjacent_change_commit(Ptr<NetDefinitions.net_device> old_dev, Ptr<NetDefinitions.net_device> new_dev, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_adjacent_change_prepare(Ptr<NetDefinitions.net_device> old_dev, Ptr<NetDefinitions.net_device> new_dev, Ptr<NetDefinitions.net_device> dev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> netdev_adjacent_get_private(Ptr<ListDefinitions.list_head> adj_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_adjacent_rename_links(Ptr<NetDefinitions.net_device> dev, String oldname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_alert((const struct net_device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void netdev_alert(Ptr<NetDefinitions.net_device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_bind_sb_channel_queue(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> sb_dev, char tc, @Unsigned short count, @Unsigned short offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_bonding_info_change(Ptr<NetDefinitions.net_device> dev, Ptr<netdev_bonding_info> bonding_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_change_features(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)netdev_cmd_to_name($arg1))")
    public static String netdev_cmd_to_name(netdev_cmd cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_copy_name(Ptr<NetDefinitions.net_device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<netdev_queue> netdev_core_pick_tx(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> sb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_core_stats_inc(Ptr<NetDefinitions.net_device> dev, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_head> netdev_create_hash() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_crit((const struct net_device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void netdev_crit(Ptr<NetDefinitions.net_device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_devres_match(Ptr<runtime.device> dev, Ptr<?> _this, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_do_alloc_pcpu_stats(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)netdev_drivername((const struct net_device*)$arg1))")
    public static String netdev_drivername(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_emerg((const struct net_device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void netdev_emerg(Ptr<NetDefinitions.net_device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_err((const struct net_device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void netdev_err(Ptr<NetDefinitions.net_device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_features_change(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netdev_features_t") long netdev_fix_features(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_for_each_tx_queue($arg1, (void (*)(struct net_device*, struct netdev_queue*, void*))$arg2, $arg3)")
    public static void netdev_for_each_tx_queue(Ptr<NetDefinitions.net_device> dev, Ptr<?> f, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netdev_get_by_index(Ptr<runtime.net> net2, int ifindex, Ptr<@OriginalName(value="netdevice_tracker") misc.lockdep_map_p> tracker, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_get_by_name($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<NetDefinitions.net_device> netdev_get_by_name(Ptr<runtime.net> net2, String name, Ptr<@OriginalName(value="netdevice_tracker") misc.lockdep_map_p> tracker, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_get_name(Ptr<runtime.net> net2, String name, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netdev_get_xmit_slave(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, boolean all_slaves) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean netdev_has_any_upper_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean netdev_has_upper_dev(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> upper_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean netdev_has_upper_dev_all_rcu(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> upper_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_hw_stats64_add($arg1, (const struct rtnl_hw_stats64*)$arg2)")
    public static void netdev_hw_stats64_add(Ptr<RtnlDefinitions.rtnl_hw_stats64> dest, Ptr<RtnlDefinitions.rtnl_hw_stats64> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netdev_features_t") long netdev_increment_features(@Unsigned @OriginalName(value="netdev_features_t") long all, @Unsigned @OriginalName(value="netdev_features_t") long one, @Unsigned @OriginalName(value="netdev_features_t") long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_info((const struct net_device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void netdev_info(Ptr<NetDefinitions.net_device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean netdev_is_rx_handler_busy(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> netdev_lower_dev_get_private(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> lower_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> netdev_lower_get_first_private_rcu(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> netdev_lower_get_next(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<ListDefinitions.list_head>> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> netdev_lower_get_next_private(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<ListDefinitions.list_head>> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> netdev_lower_get_next_private_rcu(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<ListDefinitions.list_head>> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_lower_state_changed(Ptr<NetDefinitions.net_device> lower_dev, Ptr<?> lower_state_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netdev_master_upper_dev_get(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netdev_master_upper_dev_get_rcu(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_master_upper_dev_link(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> upper_dev, Ptr<?> upper_priv, Ptr<?> upper_info, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_name_in_use($arg1, (const u8*)$arg2)")
    public static boolean netdev_name_in_use(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_name_node_alt_create($arg1, (const u8*)$arg2)")
    public static int netdev_name_node_alt_create(Ptr<NetDefinitions.net_device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_name_node_alt_destroy($arg1, (const u8*)$arg2)")
    public static int netdev_name_node_alt_destroy(Ptr<NetDefinitions.net_device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_name_node_alt_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_name_node_lookup($arg1, (const u8*)$arg2)")
    public static Ptr<netdev_name_node> netdev_name_node_lookup(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netdev_next_lower_dev_rcu(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<ListDefinitions.list_head>> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_notice((const struct net_device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void netdev_notice(Ptr<NetDefinitions.net_device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_notify_peers(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_offload_xstats_disable(Ptr<NetDefinitions.net_device> dev, netdev_offload_xstats_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_offload_xstats_enable(Ptr<NetDefinitions.net_device> dev, netdev_offload_xstats_type type2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_offload_xstats_enabled((const struct net_device*)$arg1, $arg2)")
    public static boolean netdev_offload_xstats_enabled(Ptr<NetDefinitions.net_device> dev, netdev_offload_xstats_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_offload_xstats_get(Ptr<NetDefinitions.net_device> dev, netdev_offload_xstats_type type2, Ptr<RtnlDefinitions.rtnl_hw_stats64> p_stats, Ptr<@OriginalName(value="bool") Boolean> p_used, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_offload_xstats_get_stats(Ptr<NetDefinitions.net_device> dev, netdev_offload_xstats_type type2, Ptr<RtnlDefinitions.rtnl_hw_stats64> p_stats, Ptr<@OriginalName(value="bool") Boolean> p_used, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_offload_xstats_push_delta($arg1, $arg2, (const struct rtnl_hw_stats64*)$arg3)")
    public static void netdev_offload_xstats_push_delta(Ptr<NetDefinitions.net_device> dev, netdev_offload_xstats_type type2, Ptr<RtnlDefinitions.rtnl_hw_stats64> p_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_offload_xstats_report_delta($arg1, (const struct rtnl_hw_stats64*)$arg2)")
    public static void netdev_offload_xstats_report_delta(Ptr<netdev_notifier_offload_xstats_rd> report_delta, Ptr<RtnlDefinitions.rtnl_hw_stats64> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_offload_xstats_report_used(Ptr<netdev_notifier_offload_xstats_ru> report_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short netdev_pick_tx(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> sb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean netdev_port_same_parent_id(Ptr<NetDefinitions.net_device> a, Ptr<NetDefinitions.net_device> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_printk((const u8*)$arg1, (const struct net_device*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void netdev_printk(String level, Ptr<NetDefinitions.net_device> dev, String format, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_refcnt_read((const struct net_device*)$arg1)")
    public static int netdev_refcnt_read(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_reset_tc(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_rss_key_fill(Ptr<?> buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_run_todo() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_rx_csum_fault(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_rx_handler_register(Ptr<NetDefinitions.net_device> dev, Ptr<?> rx_handler, Ptr<?> rx_handler_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_rx_handler_unregister(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_set_default_ethtool_ops($arg1, (const struct ethtool_ops*)$arg2)")
    public static void netdev_set_default_ethtool_ops(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_set_num_tc(Ptr<NetDefinitions.net_device> dev, char num_tc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_set_sb_channel(Ptr<NetDefinitions.net_device> dev, @Unsigned short channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_set_tc_queue(Ptr<NetDefinitions.net_device> dev, char tc, @Unsigned short count, @Unsigned short offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netdev_sk_get_lowest_dev(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_state_change(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_stats_to_stats64($arg1, (const struct net_device_stats*)$arg2)")
    public static void netdev_stats_to_stats64(Ptr<RtnlDefinitions.rtnl_link_stats64> stats64, Ptr<NetDefinitions.net_device_stats> netdev_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_sw_irq_coalesce_default_on(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_txq_to_tc(Ptr<NetDefinitions.net_device> dev, @Unsigned int txq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_unbind_sb_channel(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> sb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_update_features(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_upper_dev_link(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> upper_dev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_upper_dev_unlink(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> upper_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netdev_upper_get_next_dev_rcu(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<ListDefinitions.list_head>> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netdev_wait_allrefs_any(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_walk_all_lower_dev($arg1, (int (*)(struct net_device*, struct netdev_nested_priv*))$arg2, $arg3)")
    public static int netdev_walk_all_lower_dev(Ptr<NetDefinitions.net_device> dev, Ptr<?> fn, Ptr<netdev_nested_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_walk_all_lower_dev_rcu($arg1, (int (*)(struct net_device*, struct netdev_nested_priv*))$arg2, $arg3)")
    public static int netdev_walk_all_lower_dev_rcu(Ptr<NetDefinitions.net_device> dev, Ptr<?> fn, Ptr<netdev_nested_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_walk_all_upper_dev_rcu($arg1, (int (*)(struct net_device*, struct netdev_nested_priv*))$arg2, $arg3)")
    public static int netdev_walk_all_upper_dev_rcu(Ptr<NetDefinitions.net_device> dev, Ptr<?> fn, Ptr<netdev_nested_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_warn((const struct net_device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void netdev_warn(Ptr<NetDefinitions.net_device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_xmit_skip_txqueue(boolean skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netdev_watchdog_up(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_genl_dev_notify(Ptr<NetDefinitions.net_device> netdev, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_genl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_genl_netdevice_event(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_bind_rx_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_dev_fill($arg1, $arg2, (const struct genl_info*)$arg3)")
    public static int netdev_nl_dev_fill(Ptr<NetDefinitions.net_device> netdev, Ptr<SkDefinitions.sk_buff> rsp, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_dev_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_dev_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_napi_dump_one($arg1, $arg2, (const struct genl_info*)$arg3, $arg4)")
    public static int netdev_nl_napi_dump_one(Ptr<NetDefinitions.net_device> netdev, Ptr<SkDefinitions.sk_buff> rsp, Ptr<GenlDefinitions.genl_info> info2, Ptr<netdev_nl_dump_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_napi_fill_one($arg1, $arg2, (const struct genl_info*)$arg3)")
    public static int netdev_nl_napi_fill_one(Ptr<SkDefinitions.sk_buff> rsp, Ptr<NapiDefinitions.napi_struct> napi, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_napi_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_napi_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_qstats_get_dump_one($arg1, $arg2, $arg3, (const struct genl_info*)$arg4, $arg5)")
    public static int netdev_nl_qstats_get_dump_one(Ptr<NetDefinitions.net_device> netdev, @Unsigned int scope, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2, Ptr<netdev_nl_dump_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_qstats_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_queue_dump_one($arg1, $arg2, (const struct genl_info*)$arg3, $arg4)")
    public static int netdev_nl_queue_dump_one(Ptr<NetDefinitions.net_device> netdev, Ptr<SkDefinitions.sk_buff> rsp, Ptr<GenlDefinitions.genl_info> info2, Ptr<netdev_nl_dump_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_queue_fill_one($arg1, $arg2, $arg3, $arg4, (const struct genl_info*)$arg5)")
    public static int netdev_nl_queue_fill_one(Ptr<SkDefinitions.sk_buff> rsp, Ptr<NetDefinitions.net_device> netdev, @Unsigned int q_idx, @Unsigned int q_type, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_queue_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_queue_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_nl_sock_priv_destroy(Ptr<ListDefinitions.list_head> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_nl_sock_priv_init(Ptr<ListDefinitions.list_head> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_stats_by_netdev($arg1, $arg2, (const struct genl_info*)$arg3)")
    public static int netdev_nl_stats_by_netdev(Ptr<NetDefinitions.net_device> netdev, Ptr<SkDefinitions.sk_buff> rsp, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netdev_nl_stats_queue($arg1, $arg2, $arg3, $arg4, (const struct genl_info*)$arg5)")
    public static int netdev_nl_stats_queue(Ptr<NetDefinitions.net_device> netdev, Ptr<SkDefinitions.sk_buff> rsp, @Unsigned int q_type, int i, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_stats_write_rx(Ptr<SkDefinitions.sk_buff> rsp, Ptr<netdev_queue_stats_rx> rx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_nl_stats_write_tx(Ptr<SkDefinitions.sk_buff> rsp, Ptr<netdev_queue_stats_tx> tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netdev_rx_queue_restart(Ptr<NetDefinitions.net_device> dev, @Unsigned int rxq_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netdev_set_operstate(Ptr<NetDefinitions.net_device> dev, int newstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_adjacent")
    @NotUsableInJava
    public static class netdev_adjacent
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public boolean master;
        public boolean ignore;
        public @Unsigned short ref_nr;
        public Ptr<?> _private;
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_bonding_info")
    @NotUsableInJava
    public static class netdev_notifier_bonding_info
    extends Struct {
        public netdev_notifier_info info;
        public netdev_bonding_info bonding_info;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_bonding_info")
    @NotUsableInJava
    public static class netdev_bonding_info
    extends Struct {
        public runtime.ifslave slave;
        public runtime.ifbond master;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_nested_priv")
    @NotUsableInJava
    public static class netdev_nested_priv
    extends Struct {
        public char flags;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_offload_xstats_info")
    @NotUsableInJava
    public static class netdev_notifier_offload_xstats_info
    extends Struct {
        public netdev_notifier_info info;
        public netdev_offload_xstats_type type;
        @InlineUnion(value=95886)
        public @InlineUnion(value=95886) Ptr<netdev_notifier_offload_xstats_rd> report_delta;
        @InlineUnion(value=95886)
        public @InlineUnion(value=95886) Ptr<netdev_notifier_offload_xstats_ru> report_used;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_offload_xstats_ru")
    @NotUsableInJava
    public static class netdev_notifier_offload_xstats_ru
    extends Struct {
        public boolean used;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_offload_xstats_rd")
    @NotUsableInJava
    public static class netdev_notifier_offload_xstats_rd
    extends Struct {
        public RtnlDefinitions.rtnl_hw_stats64 stats;
        public boolean used;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_pre_changeaddr_info")
    @NotUsableInJava
    public static class netdev_notifier_pre_changeaddr_info
    extends Struct {
        public netdev_notifier_info info;
        public String dev_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_changelowerstate_info")
    @NotUsableInJava
    public static class netdev_notifier_changelowerstate_info
    extends Struct {
        public netdev_notifier_info info;
        public Ptr<?> lower_state_info;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_info_ext")
    @NotUsableInJava
    public static class netdev_notifier_info_ext
    extends Struct {
        public netdev_notifier_info info;
        public misc.ext_of_netdev_notifier_info_ext ext;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_net_notifier")
    @NotUsableInJava
    public static class netdev_net_notifier
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<misc.notifier_block> nb;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_queue_attribute")
    @NotUsableInJava
    public static class netdev_queue_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_change_info")
    @NotUsableInJava
    public static class netdev_notifier_change_info
    extends Struct {
        public netdev_notifier_info info;
        public @Unsigned int flags_changed;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_lag_lower_state_info")
    @NotUsableInJava
    public static class netdev_lag_lower_state_info
    extends Struct {
        public char link_up;
        public char tx_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_changeupper_info")
    @NotUsableInJava
    public static class netdev_notifier_changeupper_info
    extends Struct {
        public netdev_notifier_info info;
        public Ptr<NetDefinitions.net_device> upper_dev;
        public boolean master;
        public boolean linking;
        public Ptr<?> upper_info;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_lag_upper_info")
    @NotUsableInJava
    public static class netdev_lag_upper_info
    extends Struct {
        public netdev_lag_tx_type tx_type;
        public netdev_lag_hash hash_type;
    }

    @Type(noCCodeGeneration=true, cType="enum netdev_lag_hash")
    public static enum netdev_lag_hash implements Enum<netdev_lag_hash>,
    TypedEnum<netdev_lag_hash, Integer>
    {
        NETDEV_LAG_HASH_NONE,
        NETDEV_LAG_HASH_L2,
        NETDEV_LAG_HASH_L34,
        NETDEV_LAG_HASH_L23,
        NETDEV_LAG_HASH_E23,
        NETDEV_LAG_HASH_E34,
        NETDEV_LAG_HASH_VLAN_SRCMAC,
        NETDEV_LAG_HASH_UNKNOWN;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_lag_tx_type")
    public static enum netdev_lag_tx_type implements Enum<netdev_lag_tx_type>,
    TypedEnum<netdev_lag_tx_type, Integer>
    {
        NETDEV_LAG_TX_TYPE_UNKNOWN,
        NETDEV_LAG_TX_TYPE_RANDOM,
        NETDEV_LAG_TX_TYPE_BROADCAST,
        NETDEV_LAG_TX_TYPE_ROUNDROBIN,
        NETDEV_LAG_TX_TYPE_ACTIVEBACKUP,
        NETDEV_LAG_TX_TYPE_HASH;

    }

    @Type(noCCodeGeneration=true, cType="struct netdev_nl_dump_ctx")
    @NotUsableInJava
    public static class netdev_nl_dump_ctx
    extends Struct {
        public @Unsigned long ifindex;
        public @Unsigned int rxq_idx;
        public @Unsigned int txq_idx;
        public @Unsigned int napi_id;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_queue_stats_tx")
    @NotUsableInJava
    public static class netdev_queue_stats_tx
    extends Struct {
        public @Unsigned long bytes;
        public @Unsigned long packets;
        public @Unsigned long hw_drops;
        public @Unsigned long hw_drop_errors;
        public @Unsigned long csum_none;
        public @Unsigned long needs_csum;
        public @Unsigned long hw_gso_packets;
        public @Unsigned long hw_gso_bytes;
        public @Unsigned long hw_gso_wire_packets;
        public @Unsigned long hw_gso_wire_bytes;
        public @Unsigned long hw_drop_ratelimits;
        public @Unsigned long stop;
        public @Unsigned long wake;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_queue_stats_rx")
    @NotUsableInJava
    public static class netdev_queue_stats_rx
    extends Struct {
        public @Unsigned long bytes;
        public @Unsigned long packets;
        public @Unsigned long alloc_fail;
        public @Unsigned long hw_drops;
        public @Unsigned long hw_drop_overruns;
        public @Unsigned long csum_unnecessary;
        public @Unsigned long csum_none;
        public @Unsigned long csum_bad;
        public @Unsigned long hw_gro_packets;
        public @Unsigned long hw_gro_bytes;
        public @Unsigned long hw_gro_wire_packets;
        public @Unsigned long hw_gro_wire_bytes;
        public @Unsigned long hw_drop_ratelimits;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_rx_queue")
    @NotUsableInJava
    public static class netdev_rx_queue
    extends Struct {
        public XdpDefinitions.xdp_rxq_info xdp_rxq;
        public Ptr<misc.rps_map> rps_map;
        public Ptr<misc.rps_dev_flow_table> rps_flow_table;
        public runtime.kobject kobj;
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public Ptr<XskDefinitions.xsk_buff_pool> pool;
        public Ptr<NapiDefinitions.napi_struct> napi;
        public misc.pp_memory_provider_params mp_params;
    }

    @Type(noCCodeGeneration=true, cType="enum netdev_qstats_scope")
    public static enum netdev_qstats_scope implements Enum<netdev_qstats_scope>,
    TypedEnum<netdev_qstats_scope, Integer>
    {
        NETDEV_QSTATS_SCOPE_QUEUE;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_queue_type")
    public static enum netdev_queue_type implements Enum<netdev_queue_type>,
    TypedEnum<netdev_queue_type, Integer>
    {
        NETDEV_QUEUE_TYPE_RX,
        NETDEV_QUEUE_TYPE_TX;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_xsk_flags")
    public static enum netdev_xsk_flags implements Enum<netdev_xsk_flags>,
    TypedEnum<netdev_xsk_flags, Integer>
    {
        NETDEV_XSK_FLAGS_TX_TIMESTAMP,
        NETDEV_XSK_FLAGS_TX_CHECKSUM;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_xdp_rx_metadata")
    public static enum netdev_xdp_rx_metadata implements Enum<netdev_xdp_rx_metadata>,
    TypedEnum<netdev_xdp_rx_metadata, Integer>
    {
        NETDEV_XDP_RX_METADATA_TIMESTAMP,
        NETDEV_XDP_RX_METADATA_HASH,
        NETDEV_XDP_RX_METADATA_VLAN_TAG;

    }

    @Type(noCCodeGeneration=true, cType="struct netdev_xmit")
    @NotUsableInJava
    public static class netdev_xmit
    extends Struct {
        public @Unsigned short recursion;
        public char more;
        public char skip_txqueue;
    }

    @Type(noCCodeGeneration=true, cType="enum netdev_offload_xstats_type")
    public static enum netdev_offload_xstats_type implements Enum<netdev_offload_xstats_type>,
    TypedEnum<netdev_offload_xstats_type, Integer>
    {
        NETDEV_OFFLOAD_XSTATS_TYPE_L3;

    }

    @Type(noCCodeGeneration=true, cType="struct netdev_notifier_info")
    @NotUsableInJava
    public static class netdev_notifier_info
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
    }

    @Type(noCCodeGeneration=true, cType="enum netdev_cmd")
    public static enum netdev_cmd implements Enum<netdev_cmd>,
    TypedEnum<netdev_cmd, Integer>
    {
        NETDEV_UP,
        NETDEV_DOWN,
        NETDEV_REBOOT,
        NETDEV_CHANGE,
        NETDEV_REGISTER,
        NETDEV_UNREGISTER,
        NETDEV_CHANGEMTU,
        NETDEV_CHANGEADDR,
        NETDEV_PRE_CHANGEADDR,
        NETDEV_GOING_DOWN,
        NETDEV_CHANGENAME,
        NETDEV_FEAT_CHANGE,
        NETDEV_BONDING_FAILOVER,
        NETDEV_PRE_UP,
        NETDEV_PRE_TYPE_CHANGE,
        NETDEV_POST_TYPE_CHANGE,
        NETDEV_POST_INIT,
        NETDEV_PRE_UNINIT,
        NETDEV_RELEASE,
        NETDEV_NOTIFY_PEERS,
        NETDEV_JOIN,
        NETDEV_CHANGEUPPER,
        NETDEV_RESEND_IGMP,
        NETDEV_PRECHANGEMTU,
        NETDEV_CHANGEINFODATA,
        NETDEV_BONDING_INFO,
        NETDEV_PRECHANGEUPPER,
        NETDEV_CHANGELOWERSTATE,
        NETDEV_UDP_TUNNEL_PUSH_INFO,
        NETDEV_UDP_TUNNEL_DROP_INFO,
        NETDEV_CHANGE_TX_QUEUE_LEN,
        NETDEV_CVLAN_FILTER_PUSH_INFO,
        NETDEV_CVLAN_FILTER_DROP_INFO,
        NETDEV_SVLAN_FILTER_PUSH_INFO,
        NETDEV_SVLAN_FILTER_DROP_INFO,
        NETDEV_OFFLOAD_XSTATS_ENABLE,
        NETDEV_OFFLOAD_XSTATS_DISABLE,
        NETDEV_OFFLOAD_XSTATS_REPORT_USED,
        NETDEV_OFFLOAD_XSTATS_REPORT_DELTA,
        NETDEV_XDP_FEAT_CHANGE;

    }

    @Type(noCCodeGeneration=true, cType="struct netdev_name_node")
    @NotUsableInJava
    public static class netdev_name_node
    extends Struct {
        public misc.hlist_node hlist;
        public ListDefinitions.list_head list;
        public Ptr<NetDefinitions.net_device> dev;
        public String name;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_hw_addr")
    @NotUsableInJava
    public static class netdev_hw_addr
    extends Struct {
        public ListDefinitions.list_head list;
        public RbDefinitions.rb_node node;
        public char @Size(value=32) [] addr;
        public char type;
        public boolean global_use;
        public int sync_cnt;
        public int refcount;
        public int synced;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="enum netdev_reg_state")
    public static enum netdev_reg_state implements Enum<netdev_reg_state>,
    TypedEnum<netdev_reg_state, Integer>
    {
        NETREG_UNINITIALIZED,
        NETREG_REGISTERED,
        NETREG_UNREGISTERING,
        NETREG_UNREGISTERED,
        NETREG_RELEASED,
        NETREG_DUMMY;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_priv_flags")
    public static enum netdev_priv_flags implements Enum<netdev_priv_flags>,
    TypedEnum<netdev_priv_flags, Integer>
    {
        IFF_802_1Q_VLAN,
        IFF_EBRIDGE,
        IFF_BONDING,
        IFF_ISATAP,
        IFF_WAN_HDLC,
        IFF_XMIT_DST_RELEASE,
        IFF_DONT_BRIDGE,
        IFF_DISABLE_NETPOLL,
        IFF_MACVLAN_PORT,
        IFF_BRIDGE_PORT,
        IFF_OVS_DATAPATH,
        IFF_TX_SKB_SHARING,
        IFF_UNICAST_FLT,
        IFF_TEAM_PORT,
        IFF_SUPP_NOFCS,
        IFF_LIVE_ADDR_CHANGE,
        IFF_MACVLAN,
        IFF_XMIT_DST_RELEASE_PERM,
        IFF_L3MDEV_MASTER,
        IFF_NO_QUEUE,
        IFF_OPENVSWITCH,
        IFF_L3MDEV_SLAVE,
        IFF_TEAM,
        IFF_RXFH_CONFIGURED,
        IFF_PHONY_HEADROOM,
        IFF_MACSEC,
        IFF_NO_RX_HANDLER,
        IFF_FAILOVER,
        IFF_FAILOVER_SLAVE,
        IFF_L3MDEV_RX_HANDLER,
        IFF_NO_ADDRCONF,
        IFF_TX_SKB_NO_LINEAR;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_queue_state_t")
    public static enum netdev_queue_state_t implements Enum<netdev_queue_state_t>,
    TypedEnum<netdev_queue_state_t, Integer>
    {
        __QUEUE_STATE_DRV_XOFF,
        __QUEUE_STATE_STACK_XOFF,
        __QUEUE_STATE_FROZEN;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_state_t")
    public static enum netdev_state_t implements Enum<netdev_state_t>,
    TypedEnum<netdev_state_t, Integer>
    {
        __LINK_STATE_START,
        __LINK_STATE_PRESENT,
        __LINK_STATE_NOCARRIER,
        __LINK_STATE_LINKWATCH_PENDING,
        __LINK_STATE_DORMANT,
        __LINK_STATE_TESTING;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_xdp_act")
    public static enum netdev_xdp_act implements Enum<netdev_xdp_act>,
    TypedEnum<netdev_xdp_act, Integer>
    {
        NETDEV_XDP_ACT_BASIC,
        NETDEV_XDP_ACT_REDIRECT,
        NETDEV_XDP_ACT_NDO_XMIT,
        NETDEV_XDP_ACT_XSK_ZEROCOPY,
        NETDEV_XDP_ACT_HW_OFFLOAD,
        NETDEV_XDP_ACT_RX_SG,
        NETDEV_XDP_ACT_NDO_XMIT_SG,
        NETDEV_XDP_ACT_MASK;

    }

    @Type(noCCodeGeneration=true, cType="struct netdev_queue_mgmt_ops")
    @NotUsableInJava
    public static class netdev_queue_mgmt_ops
    extends Struct {
        public @Unsigned long ndo_queue_mem_size;
        public Ptr<?> ndo_queue_mem_alloc;
        public Ptr<?> ndo_queue_mem_free;
        public Ptr<?> ndo_queue_start;
        public Ptr<?> ndo_queue_stop;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_stat_ops")
    @NotUsableInJava
    public static class netdev_stat_ops
    extends Struct {
        public Ptr<?> get_queue_stats_rx;
        public Ptr<?> get_queue_stats_tx;
        public Ptr<?> get_base_stats;
    }

    @Type(noCCodeGeneration=true, cType="enum netdev_stat_type")
    public static enum netdev_stat_type implements Enum<netdev_stat_type>,
    TypedEnum<netdev_stat_type, Integer>
    {
        NETDEV_PCPU_STAT_NONE,
        NETDEV_PCPU_STAT_LSTATS,
        NETDEV_PCPU_STAT_TSTATS,
        NETDEV_PCPU_STAT_DSTATS;

    }

    @Type(noCCodeGeneration=true, cType="enum netdev_ml_priv_type")
    public static enum netdev_ml_priv_type implements Enum<netdev_ml_priv_type>,
    TypedEnum<netdev_ml_priv_type, Integer>
    {
        ML_PRIV_NONE,
        ML_PRIV_CAN;

    }

    @Type(noCCodeGeneration=true, cType="struct netdev_bpf")
    @NotUsableInJava
    public static class netdev_bpf
    extends Struct {
        public BpfDefinitions.bpf_netdev_command command;
        @InlineUnion(value=5772)
        public  @InlineUnion(value=5772) AnonDefinitions.anon_member_of_anon_member_of_netdev_bpf anon1$0;
        @InlineUnion(value=5772)
        public  @InlineUnion(value=5772) AnonDefinitions.anon_member_of_anon_member_of_netdev_bpf anon1$1;
        @InlineUnion(value=5772)
        public @InlineUnion(value=5772) XskDefinitions.xsk_of_anon_member_of_netdev_bpf xsk;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_phys_item_id")
    @NotUsableInJava
    public static class netdev_phys_item_id
    extends Struct {
        public char @Size(value=32) [] id;
        public char id_len;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_fcoe_hbainfo")
    @NotUsableInJava
    public static class netdev_fcoe_hbainfo
    extends Struct {
        public char @Size(value=64) [] manufacturer;
        public char @Size(value=64) [] serial_number;
        public char @Size(value=64) [] hardware_version;
        public char @Size(value=64) [] driver_version;
        public char @Size(value=64) [] optionrom_version;
        public char @Size(value=64) [] firmware_version;
        public char @Size(value=256) [] model;
        public char @Size(value=256) [] model_description;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_tc_txq")
    @NotUsableInJava
    public static class netdev_tc_txq
    extends Struct {
        public @Unsigned short count;
        public @Unsigned short offset;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_queue")
    @NotUsableInJava
    public static class netdev_queue
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public Ptr<runtime.Qdisc> qdisc;
        public Ptr<runtime.Qdisc> qdisc_sleeping;
        public runtime.kobject kobj;
        public @Unsigned long tx_maxrate;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t trans_timeout;
        public Ptr<NetDefinitions.net_device> sb_dev;
        public Ptr<XskDefinitions.xsk_buff_pool> pool;
        public runtime.dql dql;
        public  @OriginalName(value="spinlock_t") runtime.spinlock _xmit_lock;
        public int xmit_lock_owner;
        public @Unsigned long trans_start;
        public @Unsigned long state;
        public Ptr<NapiDefinitions.napi_struct> napi;
        public int numa_node;
    }

    @Type(noCCodeGeneration=true, cType="struct netdev_hw_addr_list")
    @NotUsableInJava
    public static class netdev_hw_addr_list
    extends Struct {
        public ListDefinitions.list_head list;
        public int count;
        public RbDefinitions.rb_root tree;
    }

    @Type(noCCodeGeneration=true, cType="enum netdev_tx")
    public static enum netdev_tx implements Enum<netdev_tx>,
    TypedEnum<netdev_tx, Integer>
    {
        __NETDEV_TX_MIN,
        NETDEV_TX_OK,
        NETDEV_TX_BUSY;

    }
}

