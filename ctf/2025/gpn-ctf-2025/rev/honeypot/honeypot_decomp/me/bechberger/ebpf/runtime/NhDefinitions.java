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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NhDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__nh_notifier_single_info_init($arg1, (const struct nh_info*)$arg2)")
    public static void __nh_notifier_single_info_init(Ptr<nh_notifier_single_info> nh_info2, Ptr<nh_info> nhi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nh_valid_dump_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4)")
    public static int __nh_valid_dump_req(Ptr<runtime.nlmsghdr> nlh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<nh_dump_filter> filter, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nh_create_ipv4(Ptr<runtime.net> net2, Ptr<runtime.nexthop> nh, Ptr<nh_info> nhi, Ptr<nh_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nh_create_ipv6(Ptr<runtime.net> net2, Ptr<runtime.nexthop> nh, Ptr<nh_info> nhi, Ptr<nh_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nh_dump_filtered(Ptr<runtime.nexthop> nh, Ptr<nh_dump_filter> filter, char family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nh_fill_node(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nexthop> nh, int event2, @Unsigned int portid, @Unsigned int seq, @Unsigned int nlflags, @Unsigned int op_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nh_grp_hw_stats_report_delta(Ptr<nh_notifier_grp_hw_stats_info> info2, @Unsigned int nh_idx, @Unsigned long delta_packets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nh_grp_hw_stats_update(Ptr<runtime.nexthop> nh, Ptr<@OriginalName(value="bool") Boolean> hw_stats_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nh_hthr_group_rebalance(Ptr<nh_group> nhg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nh_netdev_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nh_notifier_info_fini($arg1, (const struct nexthop*)$arg2)")
    public static void nh_notifier_info_fini(Ptr<nh_notifier_info> info2, Ptr<runtime.nexthop> nh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nh_notifier_info_init($arg1, (const struct nexthop*)$arg2)")
    public static int nh_notifier_info_init(Ptr<nh_notifier_info> info2, Ptr<runtime.nexthop> nh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nh_notifier_mpath_info_init(Ptr<nh_notifier_info> info2, Ptr<nh_group> nhg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nh_res_bucket_migrate(Ptr<nh_res_table> res_table, @Unsigned short bucket_index, boolean notify, boolean notify_nl, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nh_res_group_rebalance(Ptr<nh_group> nhg, Ptr<nh_res_table> res_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nh_res_table_upkeep(Ptr<nh_res_table> res_table, boolean notify, boolean notify_nl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nh_res_table_upkeep_dw(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nh_valid_dump_bucket_req((const struct nlmsghdr*)$arg1, $arg2, $arg3)")
    public static int nh_valid_dump_bucket_req(Ptr<runtime.nlmsghdr> nlh, Ptr<nh_dump_filter> filter, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nh_valid_dump_req((const struct nlmsghdr*)$arg1, $arg2, $arg3)")
    public static int nh_valid_dump_req(Ptr<runtime.nlmsghdr> nlh, Ptr<nh_dump_filter> filter, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nh_valid_get_bucket_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4)")
    public static int nh_valid_get_bucket_req(Ptr<runtime.nlmsghdr> nlh, Ptr<@Unsigned Integer> id, Ptr<@Unsigned Short> bucket_index, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nh_valid_get_del_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int nh_valid_get_del_req(Ptr<runtime.nlmsghdr> nlh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<@Unsigned Integer> id, Ptr<@Unsigned Integer> op_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct nh_dump_filter")
    @NotUsableInJava
    public static class nh_dump_filter
    extends Struct {
        public @Unsigned int nh_id;
        public int dev_idx;
        public int master_idx;
        public boolean group_filter;
        public boolean fdb_filter;
        public @Unsigned int res_bucket_nh_id;
        public @Unsigned int op_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_notifier_info")
    @NotUsableInJava
    public static class nh_notifier_info
    extends Struct {
        public Ptr<runtime.net> net;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
        public @Unsigned int id;
        public nh_notifier_info_type type;
        @InlineUnion(value=96285)
        public @InlineUnion(value=96285) Ptr<nh_notifier_single_info> nh;
        @InlineUnion(value=96285)
        public @InlineUnion(value=96285) Ptr<nh_notifier_grp_info> nh_grp;
        @InlineUnion(value=96285)
        public @InlineUnion(value=96285) Ptr<nh_notifier_res_table_info> nh_res_table;
        @InlineUnion(value=96285)
        public @InlineUnion(value=96285) Ptr<nh_notifier_res_bucket_info> nh_res_bucket;
        @InlineUnion(value=96285)
        public @InlineUnion(value=96285) Ptr<nh_notifier_grp_hw_stats_info> nh_grp_hw_stats;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_notifier_grp_hw_stats_info")
    @NotUsableInJava
    public static class nh_notifier_grp_hw_stats_info
    extends Struct {
        public @Unsigned short num_nh;
        public boolean hw_stats_used;
        public nh_notifier_grp_hw_stats_entry_info @Size(value=0) [] stats;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_notifier_grp_hw_stats_entry_info")
    @NotUsableInJava
    public static class nh_notifier_grp_hw_stats_entry_info
    extends Struct {
        public @Unsigned int id;
        public @Unsigned long packets;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_notifier_res_table_info")
    @NotUsableInJava
    public static class nh_notifier_res_table_info
    extends Struct {
        public @Unsigned short num_nh_buckets;
        public boolean hw_stats;
        public nh_notifier_single_info @Size(value=0) [] nhs;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_notifier_res_bucket_info")
    @NotUsableInJava
    public static class nh_notifier_res_bucket_info
    extends Struct {
        public @Unsigned short bucket_index;
        public @Unsigned int idle_timer_ms;
        public boolean force;
        public nh_notifier_single_info old_nh;
        public nh_notifier_single_info new_nh;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_notifier_grp_info")
    @NotUsableInJava
    public static class nh_notifier_grp_info
    extends Struct {
        public @Unsigned short num_nh;
        public boolean is_fdb;
        public boolean hw_stats;
        public nh_notifier_grp_entry_info @Size(value=0) [] nh_entries;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_notifier_grp_entry_info")
    @NotUsableInJava
    public static class nh_notifier_grp_entry_info
    extends Struct {
        public @Unsigned short weight;
        public nh_notifier_single_info nh;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_notifier_single_info")
    @NotUsableInJava
    public static class nh_notifier_single_info
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public char gw_family;
        @InlineUnion(value=12670)
        public @InlineUnion(value=12670) @Unsigned @OriginalName(value="__be32") int ipv4;
        @InlineUnion(value=12670)
        public  @InlineUnion(value=12670) In6Definitions.in6_addr ipv6;
        public @Unsigned int id;
        public char is_reject;
        public char is_fdb;
        public char has_encap;
    }

    @Type(noCCodeGeneration=true, cType="enum nh_notifier_info_type")
    public static enum nh_notifier_info_type implements Enum<nh_notifier_info_type>,
    TypedEnum<nh_notifier_info_type, Integer>
    {
        NH_NOTIFIER_INFO_TYPE_SINGLE,
        NH_NOTIFIER_INFO_TYPE_GRP,
        NH_NOTIFIER_INFO_TYPE_RES_TABLE,
        NH_NOTIFIER_INFO_TYPE_RES_BUCKET,
        NH_NOTIFIER_INFO_TYPE_GRP_HW_STATS;

    }

    @Type(noCCodeGeneration=true, cType="struct nh_config")
    @NotUsableInJava
    public static class nh_config
    extends Struct {
        public @Unsigned int nh_id;
        public char nh_family;
        public char nh_protocol;
        public char nh_blackhole;
        public char nh_fdb;
        public @Unsigned int nh_flags;
        public int nh_ifindex;
        public Ptr<NetDefinitions.net_device> dev;
        public AddrDefinitions.addr_of_netnode_security_struct_and_anon_member_of_nh_notifier_single_info_and_gw_of_nh_config gw;
        public Ptr<runtime.nlattr> nh_grp;
        public @Unsigned short nh_grp_type;
        public @Unsigned short nh_grp_res_num_buckets;
        public @Unsigned long nh_grp_res_idle_timer;
        public @Unsigned long nh_grp_res_unbalanced_timer;
        public boolean nh_grp_res_has_num_buckets;
        public boolean nh_grp_res_has_idle_timer;
        public boolean nh_grp_res_has_unbalanced_timer;
        public boolean nh_hw_stats;
        public Ptr<runtime.nlattr> nh_encap;
        public @Unsigned short nh_encap_type;
        public @Unsigned int nlflags;
        public misc.nl_info nlinfo;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_group")
    @NotUsableInJava
    public static class nh_group
    extends Struct {
        public Ptr<nh_group> spare;
        public @Unsigned short num_nh;
        public boolean is_multipath;
        public boolean hash_threshold;
        public boolean resilient;
        public boolean fdb_nh;
        public boolean has_v4;
        public boolean hw_stats;
        public Ptr<nh_res_table> res_table;
        public nh_grp_entry @Size(value=0) [] nh_entries;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_grp_entry_stats")
    @NotUsableInJava
    public static class nh_grp_entry_stats
    extends Struct {
        public misc.u64_stats_t packets;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_res_table")
    @NotUsableInJava
    public static class nh_res_table
    extends Struct {
        public Ptr<runtime.net> net;
        public @Unsigned int nhg_id;
        public DelayedDefinitions.delayed_work upkeep_dw;
        public ListDefinitions.list_head uw_nh_entries;
        public @Unsigned long unbalanced_since;
        public @Unsigned int idle_timer;
        public @Unsigned int unbalanced_timer;
        public @Unsigned short num_nh_buckets;
        public nh_res_bucket @Size(value=0) [] nh_buckets;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_grp_entry")
    @NotUsableInJava
    public static class nh_grp_entry
    extends Struct {
        public Ptr<runtime.nexthop> nh;
        public Ptr<nh_grp_entry_stats> stats;
        public @Unsigned short weight;
        @InlineUnion(value=23822)
        public @InlineUnion(value=23822) misc.hthr_of_anon_member_of_nh_grp_entry hthr;
        @InlineUnion(value=23822)
        public @InlineUnion(value=23822) misc.res_of_anon_member_of_nh_grp_entry res;
        public ListDefinitions.list_head nh_list;
        public Ptr<runtime.nexthop> nh_parent;
        public @Unsigned long packets_hw;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_res_bucket")
    @NotUsableInJava
    public static class nh_res_bucket
    extends Struct {
        public Ptr<nh_grp_entry> nh_entry;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t used_time;
        public @Unsigned long migrated_time;
        public boolean occupied;
        public char nh_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct nh_info")
    @NotUsableInJava
    public static class nh_info
    extends Struct {
        public misc.hlist_node dev_hash;
        public Ptr<runtime.nexthop> nh_parent;
        public char family;
        public boolean reject_nh;
        public boolean fdb_nh;
        @InlineUnion(value=23812)
        public @InlineUnion(value=23812) FibDefinitions.fib_nh_common fib_nhc;
        @InlineUnion(value=23812)
        public @InlineUnion(value=23812) FibDefinitions.fib_nh fib_nh;
        @InlineUnion(value=23812)
        public  @InlineUnion(value=23812) Fib6Definitions.fib6_nh fib6_nh;
    }
}

