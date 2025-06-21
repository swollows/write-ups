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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class QdiscDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__qdisc_calculate_pkt_len($arg1, (const struct qdisc_size_table*)$arg2)")
    public static void __qdisc_calculate_pkt_len(Ptr<SkDefinitions.sk_buff> skb, Ptr<qdisc_size_table> stab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int qdisc_class_dump(Ptr<runtime.Qdisc> q, @Unsigned long cl, Ptr<qdisc_walker> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_class_hash_destroy(Ptr<Qdisc_class_hash> clhash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_class_hash_grow(Ptr<runtime.Qdisc> sch, Ptr<Qdisc_class_hash> clhash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int qdisc_class_hash_init(Ptr<Qdisc_class_hash> clhash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_class_hash_insert(Ptr<Qdisc_class_hash> clhash, Ptr<Qdisc_class_common> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_class_hash_remove(Ptr<Qdisc_class_hash> clhash, Ptr<Qdisc_class_common> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Qdisc> qdisc_create(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_queue> dev_queue, @Unsigned int parent, @Unsigned int handle, Ptr<Ptr<runtime.nlattr>> tca, Ptr<Integer> errp, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_get_default(String name, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<qdisc_rate_table> qdisc_get_rtab(Ptr<TcDefinitions.tc_ratespec> r, Ptr<runtime.nlattr> tab, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<qdisc_size_table> qdisc_get_stab(Ptr<runtime.nlattr> opt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int qdisc_graft(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.Qdisc> parent, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, @Unsigned int classid, Ptr<runtime.Qdisc> _new, Ptr<runtime.Qdisc> old, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_hash_add(Ptr<runtime.Qdisc> q, boolean invisible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_hash_del(Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Qdisc> qdisc_leaf(Ptr<runtime.Qdisc> p, @Unsigned int classid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Qdisc> qdisc_lookup(Ptr<NetDefinitions.net_device> dev, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Qdisc_ops> qdisc_lookup_ops(Ptr<runtime.nlattr> kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Qdisc> qdisc_lookup_rcu(Ptr<NetDefinitions.net_device> dev, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Qdisc> qdisc_match_from_root(Ptr<runtime.Qdisc> root, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int qdisc_notify(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> oskb, Ptr<runtime.nlmsghdr> n, @Unsigned int clid, Ptr<runtime.Qdisc> old, Ptr<runtime.Qdisc> _new, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int qdisc_offload_dump_helper(Ptr<runtime.Qdisc> sch, TcDefinitions.tc_setup_type type2, Ptr<?> type_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_offload_graft_helper(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.Qdisc> sch, Ptr<runtime.Qdisc> _new, Ptr<runtime.Qdisc> old, TcDefinitions.tc_setup_type type2, Ptr<?> type_data, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_offload_query_caps(Ptr<NetDefinitions.net_device> dev, TcDefinitions.tc_setup_type type2, Ptr<?> caps, @Unsigned long caps_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_put_rtab(Ptr<qdisc_rate_table> tab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_put_stab(Ptr<qdisc_size_table> tab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="qdisc_set_default((const u8*)$arg1)")
    public static int qdisc_set_default(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_tree_reduce_backlog(Ptr<runtime.Qdisc> sch, int n, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="qdisc_warn_nonwc((const u8*)$arg1, $arg2)")
    public static void qdisc_warn_nonwc(String txt, Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_watchdog_cancel(Ptr<qdisc_watchdog> wd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_watchdog_init(Ptr<qdisc_watchdog> wd, Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_watchdog_init_clockid(Ptr<qdisc_watchdog> wd, Ptr<runtime.Qdisc> qdisc, @OriginalName(value="clockid_t") int clockid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_watchdog_schedule_range_ns(Ptr<qdisc_watchdog> wd, @Unsigned long expires, @Unsigned long delta_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> qdisc_dequeue_head(Ptr<runtime.Qdisc> sch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> qdisc_peek_head(Ptr<runtime.Qdisc> sch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_pkt_len_init(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_reset_queue(Ptr<runtime.Qdisc> sch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __qdisc_destroy(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __qdisc_run(Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="qdisc_alloc($arg1, (const struct Qdisc_ops*)$arg2, $arg3)")
    public static Ptr<runtime.Qdisc> qdisc_alloc(Ptr<NetdevDefinitions.netdev_queue> dev_queue, Ptr<Qdisc_ops> ops, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="qdisc_create_dflt($arg1, (const struct Qdisc_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.Qdisc> qdisc_create_dflt(Ptr<NetdevDefinitions.netdev_queue> dev_queue, Ptr<Qdisc_ops> ops, @Unsigned int parentid, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_destroy(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_free(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_free_cb(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="qdisc_maybe_clear_missed($arg1, (const struct netdev_queue*)$arg2)")
    public static void qdisc_maybe_clear_missed(Ptr<runtime.Qdisc> q, Ptr<NetdevDefinitions.netdev_queue> txq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_put(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_put_unlocked(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qdisc_reset(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct qdisc_dump_args")
    @NotUsableInJava
    public static class qdisc_dump_args
    extends Struct {
        public qdisc_walker w;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<NetlinkDefinitions.netlink_callback> cb;
    }

    @Type(noCCodeGeneration=true, cType="struct qdisc_watchdog")
    @NotUsableInJava
    public static class qdisc_watchdog
    extends Struct {
        public runtime.hrtimer timer;
        public Ptr<runtime.Qdisc> qdisc;
    }

    @Type(noCCodeGeneration=true, cType="struct Qdisc_class_hash")
    @NotUsableInJava
    public static class Qdisc_class_hash
    extends Struct {
        public Ptr<misc.hlist_head> hash;
        public @Unsigned int hashsize;
        public @Unsigned int hashmask;
        public @Unsigned int hashelems;
    }

    @Type(noCCodeGeneration=true, cType="struct Qdisc_class_common")
    @NotUsableInJava
    public static class Qdisc_class_common
    extends Struct {
        public @Unsigned int classid;
        public @Unsigned int filter_cnt;
        public misc.hlist_node hnode;
    }

    @Type(noCCodeGeneration=true, cType="struct qdisc_rate_table")
    @NotUsableInJava
    public static class qdisc_rate_table
    extends Struct {
        public TcDefinitions.tc_ratespec rate;
        public @Unsigned int @Size(value=256) [] data;
        public Ptr<qdisc_rate_table> next;
        public int refcnt;
    }

    @Type(noCCodeGeneration=true, cType="enum qdisc_class_ops_flags")
    public static enum qdisc_class_ops_flags implements Enum<qdisc_class_ops_flags>,
    TypedEnum<qdisc_class_ops_flags, Integer>
    {
        QDISC_CLASS_OPS_DOIT_UNLOCKED;

    }

    @Type(noCCodeGeneration=true, cType="enum qdisc_state2_t")
    public static enum qdisc_state2_t implements Enum<qdisc_state2_t>,
    TypedEnum<qdisc_state2_t, Integer>
    {
        __QDISC_STATE2_RUNNING;

    }

    @Type(noCCodeGeneration=true, cType="enum qdisc_state_t")
    public static enum qdisc_state_t implements Enum<qdisc_state_t>,
    TypedEnum<qdisc_state_t, Integer>
    {
        __QDISC_STATE_SCHED,
        __QDISC_STATE_DEACTIVATED,
        __QDISC_STATE_MISSED,
        __QDISC_STATE_DRAINING;

    }

    @Type(noCCodeGeneration=true, cType="struct qdisc_skb_cb")
    @NotUsableInJava
    public static class qdisc_skb_cb
    extends Struct {
        public AnonDefinitions.anon_member_of_qdisc_skb_cb anon0;
        public char @Size(value=20) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct qdisc_walker")
    @NotUsableInJava
    public static class qdisc_walker
    extends Struct {
        public int stop;
        public int skip;
        public int count;
        public Ptr<?> fn;
    }

    @Type(noCCodeGeneration=true, cType="struct Qdisc_class_ops")
    @NotUsableInJava
    public static class Qdisc_class_ops
    extends Struct {
        public @Unsigned int flags;
        public Ptr<?> select_queue;
        public Ptr<?> graft;
        public Ptr<?> leaf;
        public Ptr<?> qlen_notify;
        public Ptr<?> find;
        public Ptr<?> change;
        public Ptr<?> delete;
        public Ptr<?> walk;
        public Ptr<?> tcf_block;
        public Ptr<?> bind_tcf;
        public Ptr<?> unbind_tcf;
        public Ptr<?> dump;
        public Ptr<?> dump_stats;
    }

    @Type(noCCodeGeneration=true, cType="struct Qdisc_ops")
    @NotUsableInJava
    public static class Qdisc_ops
    extends Struct {
        public Ptr<Qdisc_ops> next;
        public Ptr<Qdisc_class_ops> cl_ops;
        public char @Size(value=16) [] id;
        public int priv_size;
        public @Unsigned int static_flags;
        public Ptr<?> enqueue;
        public Ptr<?> dequeue;
        public Ptr<?> peek;
        public Ptr<?> init;
        public Ptr<?> reset;
        public Ptr<?> destroy;
        public Ptr<?> change;
        public Ptr<?> attach;
        public Ptr<?> change_tx_queue_len;
        public Ptr<?> change_real_num_tx;
        public Ptr<?> dump;
        public Ptr<?> dump_stats;
        public Ptr<?> ingress_block_set;
        public Ptr<?> egress_block_set;
        public Ptr<?> ingress_block_get;
        public Ptr<?> egress_block_get;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct qdisc_skb_head")
    @NotUsableInJava
    public static class qdisc_skb_head
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> head;
        public Ptr<SkDefinitions.sk_buff> tail;
        public @Unsigned int qlen;
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct qdisc_size_table")
    @NotUsableInJava
    public static class qdisc_size_table
    extends Struct {
        public misc.callback_head rcu;
        public ListDefinitions.list_head list;
        public TcDefinitions.tc_sizespec szopts;
        public int refcnt;
        public @Unsigned short @Size(value=0) [] data;
    }
}

