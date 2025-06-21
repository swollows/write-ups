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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.GnetDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.TcfDefinitions;
import me.bechberger.ebpf.runtime.TcxDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tc_block_indr_cleanup(Ptr<FlowDefinitions.flow_block_cb> block_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tc_chain_fill_node((const struct tcf_proto_ops*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static int tc_chain_fill_node(Ptr<TcfDefinitions.tcf_proto_ops> tmplt_ops, Ptr<?> tmplt_priv, @Unsigned int chain_index, Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<TcfDefinitions.tcf_block> block, @Unsigned int portid, @Unsigned int seq, @Unsigned short flags, int event2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_chain_notify(Ptr<TcfDefinitions.tcf_chain> chain, Ptr<SkDefinitions.sk_buff> oskb, @Unsigned int seq, @Unsigned short flags, int event2, boolean unicast, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tc_cleanup_offload_action(Ptr<FlowDefinitions.flow_action> flow_action2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tc_cls_offload_cnt_update(Ptr<TcfDefinitions.tcf_block> block, Ptr<TcfDefinitions.tcf_proto> tp, Ptr<@Unsigned Integer> cnt, Ptr<@Unsigned Integer> flags, @Unsigned int diff, boolean add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_ctl_chain(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_del_tfilter(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_dump_chain(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_dump_tfilter(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_filter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_get_tfilter(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_new_tfilter(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_setup_action(Ptr<FlowDefinitions.flow_action> flow_action2, Ptr<Ptr<tc_action>> actions2, @Unsigned int miss_cookie_base, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_setup_cb_add(Ptr<TcfDefinitions.tcf_block> block, Ptr<TcfDefinitions.tcf_proto> tp, tc_setup_type type2, Ptr<?> type_data, boolean err_stop, Ptr<@Unsigned Integer> flags, Ptr<@Unsigned Integer> in_hw_count, boolean rtnl_held) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_setup_cb_call(Ptr<TcfDefinitions.tcf_block> block, tc_setup_type type2, Ptr<?> type_data, boolean err_stop, boolean rtnl_held) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_setup_cb_destroy(Ptr<TcfDefinitions.tcf_block> block, Ptr<TcfDefinitions.tcf_proto> tp, tc_setup_type type2, Ptr<?> type_data, boolean err_stop, Ptr<@Unsigned Integer> flags, Ptr<@Unsigned Integer> in_hw_count, boolean rtnl_held) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_setup_cb_reoffload(Ptr<TcfDefinitions.tcf_block> block, Ptr<TcfDefinitions.tcf_proto> tp, boolean add, Ptr<?> cb, tc_setup_type type2, Ptr<?> type_data, Ptr<?> cb_priv, Ptr<@Unsigned Integer> flags, Ptr<@Unsigned Integer> in_hw_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_setup_cb_replace(Ptr<TcfDefinitions.tcf_block> block, Ptr<TcfDefinitions.tcf_proto> tp, tc_setup_type type2, Ptr<?> type_data, boolean err_stop, Ptr<@Unsigned Integer> old_flags, Ptr<@Unsigned Integer> old_in_hw_count, Ptr<@Unsigned Integer> new_flags, Ptr<@Unsigned Integer> new_in_hw_count, boolean rtnl_held) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tc_setup_offload_action($arg1, (const struct tcf_exts*)$arg2, $arg3)")
    public static int tc_setup_offload_action(Ptr<FlowDefinitions.flow_action> flow_action2, Ptr<TcfDefinitions.tcf_exts> exts, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tc_skb_ext_tc_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tc_skb_ext_tc_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_bind_class_walker(Ptr<runtime.Qdisc> q, @Unsigned long cl, Ptr<QdiscDefinitions.qdisc_walker> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_ctl_tclass(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_dump_qdisc(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_dump_qdisc_root(Ptr<runtime.Qdisc> root, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<Integer> q_idx_p, int s_q_idx, boolean recur, boolean dump_invisible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_dump_tclass(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_dump_tclass_qdisc(Ptr<runtime.Qdisc> q, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcmsg> tcm, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<Integer> t_p, int s_t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_dump_tclass_root(Ptr<runtime.Qdisc> root, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcmsg> tcm, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<Integer> t_p, int s_t, boolean recur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_fill_qdisc(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.Qdisc> q, @Unsigned int clid, @Unsigned int portid, @Unsigned int seq, @Unsigned short flags, int event2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_fill_tclass(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.Qdisc> q, @Unsigned long cl, @Unsigned int portid, @Unsigned int seq, @Unsigned short flags, int event2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_get_qdisc(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_modify_qdisc(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_run(Ptr<TcxDefinitions.tcx_entry> entry, Ptr<SkDefinitions.sk_buff> skb, Ptr<SkbDefinitions.skb_drop_reason> drop_reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_action_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tc_action_ops> tc_action_load_ops(Ptr<runtime.nlattr> nla, @Unsigned int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tc_cls_act_btf_struct_access($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int tc_cls_act_btf_struct_access(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<BpfDefinitions.bpf_reg_state> reg, int off, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tc_cls_act_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int tc_cls_act_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)tc_cls_act_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> tc_cls_act_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tc_cls_act_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean tc_cls_act_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tc_cls_act_prologue($arg1, $arg2, (const struct bpf_prog*)$arg3)")
    public static int tc_cls_act_prologue(Ptr<BpfDefinitions.bpf_insn> insn_buf, boolean direct_write, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_ctl_action(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> n, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tc_dump_action(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tc_action_ops> tc_lookup_action(Ptr<runtime.nlattr> kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tc_action_ops> tc_lookup_action_n(String kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tc_fifo_qopt_offload")
    @NotUsableInJava
    public static class tc_fifo_qopt_offload
    extends Struct {
        public tc_fifo_command command;
        public @Unsigned int handle;
        public @Unsigned int parent;
        @InlineUnion(value=96010)
        public @InlineUnion(value=96010) tc_qopt_offload_stats stats;
    }

    @Type(noCCodeGeneration=true, cType="enum tc_fifo_command")
    public static enum tc_fifo_command implements Enum<tc_fifo_command>,
    TypedEnum<tc_fifo_command, Integer>
    {
        TC_FIFO_REPLACE,
        TC_FIFO_DESTROY,
        TC_FIFO_STATS;

    }

    @Type(noCCodeGeneration=true, cType="struct tc_fifo_qopt")
    @NotUsableInJava
    public static class tc_fifo_qopt
    extends Struct {
        public @Unsigned int limit;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_mq_qopt_offload")
    @NotUsableInJava
    public static class tc_mq_qopt_offload
    extends Struct {
        public tc_mq_command command;
        public @Unsigned int handle;
        @InlineUnion(value=96003)
        public @InlineUnion(value=96003) tc_qopt_offload_stats stats;
        @InlineUnion(value=96003)
        public @InlineUnion(value=96003) tc_mq_opt_offload_graft_params graft_params;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_mq_opt_offload_graft_params")
    @NotUsableInJava
    public static class tc_mq_opt_offload_graft_params
    extends Struct {
        public @Unsigned long queue;
        public @Unsigned int child_handle;
    }

    @Type(noCCodeGeneration=true, cType="enum tc_mq_command")
    public static enum tc_mq_command implements Enum<tc_mq_command>,
    TypedEnum<tc_mq_command, Integer>
    {
        TC_MQ_CREATE,
        TC_MQ_DESTROY,
        TC_MQ_STATS,
        TC_MQ_GRAFT;

    }

    @Type(noCCodeGeneration=true, cType="struct tc_qopt_offload_stats")
    @NotUsableInJava
    public static class tc_qopt_offload_stats
    extends Struct {
        public Ptr<GnetDefinitions.gnet_stats_basic_sync> bstats;
        public Ptr<GnetDefinitions.gnet_stats_queue> qstats;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_bind_class_args")
    @NotUsableInJava
    public static class tc_bind_class_args
    extends Struct {
        public QdiscDefinitions.qdisc_walker w;
        public @Unsigned long new_cl;
        public @Unsigned int portid;
        public @Unsigned int clid;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_root_qopt_offload")
    @NotUsableInJava
    public static class tc_root_qopt_offload
    extends Struct {
        public tc_root_command command;
        public @Unsigned int handle;
        public boolean ingress;
    }

    @Type(noCCodeGeneration=true, cType="enum tc_root_command")
    public static enum tc_root_command implements Enum<tc_root_command>,
    TypedEnum<tc_root_command, Integer>
    {
        TC_ROOT_GRAFT;

    }

    @Type(noCCodeGeneration=true, cType="struct tc_query_caps_base")
    @NotUsableInJava
    public static class tc_query_caps_base
    extends Struct {
        public tc_setup_type type;
        public Ptr<?> caps;
    }

    @Type(noCCodeGeneration=true, cType="enum tc_link_layer")
    public static enum tc_link_layer implements Enum<tc_link_layer>,
    TypedEnum<tc_link_layer, Integer>
    {
        TC_LINKLAYER_UNAWARE,
        TC_LINKLAYER_ETHERNET,
        TC_LINKLAYER_ATM;

    }

    @Type(noCCodeGeneration=true, cType="struct tc_skb_ext")
    @NotUsableInJava
    public static class tc_skb_ext
    extends Struct {
        @InlineUnion(value=33914)
        public @InlineUnion(value=33914) @Unsigned long act_miss_cookie;
        @InlineUnion(value=33914)
        public @InlineUnion(value=33914) @Unsigned int chain;
        public @Unsigned short mru;
        public @Unsigned short zone;
        public char post_ct;
        public char post_ct_snat;
        public char post_ct_dnat;
        public char act_miss;
        public char l2_miss;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_act_pernet_id")
    @NotUsableInJava
    public static class tc_act_pernet_id
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_pedit_key")
    @NotUsableInJava
    public static class tc_pedit_key
    extends Struct {
        public @Unsigned int mask;
        public @Unsigned int val;
        public @Unsigned int off;
        public @Unsigned int at;
        public @Unsigned int offmask;
        public @Unsigned int shift;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_action_net")
    @NotUsableInJava
    public static class tc_action_net
    extends Struct {
        public Ptr<TcfDefinitions.tcf_idrinfo> idrinfo;
        public Ptr<tc_action_ops> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_skb_cb")
    @NotUsableInJava
    public static class tc_skb_cb
    extends Struct {
        public QdiscDefinitions.qdisc_skb_cb qdisc_cb;
        public @Unsigned int drop_reason;
        public @Unsigned short zone;
        public @Unsigned short mru;
        public char post_ct;
        public char post_ct_snat;
        public char post_ct_dnat;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_prio_qopt")
    @NotUsableInJava
    public static class tc_prio_qopt
    extends Struct {
        public int bands;
        public char @Size(value=16) [] priomap;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_ratespec")
    @NotUsableInJava
    public static class tc_ratespec
    extends Struct {
        public char cell_log;
        public char linklayer;
        public @Unsigned short overhead;
        public short cell_align;
        public @Unsigned short mpu;
        public @Unsigned int rate;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_cookie")
    @NotUsableInJava
    public static class tc_cookie
    extends Struct {
        public Ptr<Character> data;
        public @Unsigned int len;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_action_ops")
    @NotUsableInJava
    public static class tc_action_ops
    extends Struct {
        public ListDefinitions.list_head head;
        public char @Size(value=16) [] kind;
        public misc.tca_id id;
        public @Unsigned int net_id;
        public @Unsigned long size;
        public Ptr<runtime.module> owner;
        public Ptr<?> act;
        public Ptr<?> dump;
        public Ptr<?> cleanup;
        public Ptr<?> lookup;
        public Ptr<?> init;
        public Ptr<?> walk;
        public Ptr<?> stats_update;
        public Ptr<?> get_fill_size;
        public Ptr<?> get_dev;
        public Ptr<?> get_psample_group;
        public Ptr<?> offload_act_setup;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_action")
    @NotUsableInJava
    public static class tc_action
    extends Struct {
        public Ptr<tc_action_ops> ops;
        public @Unsigned int type;
        public Ptr<TcfDefinitions.tcf_idrinfo> idrinfo;
        public @Unsigned int tcfa_index;
        public  @OriginalName(value="refcount_t") misc.refcount_struct tcfa_refcnt;
        public AtomicDefinitions.atomic_t tcfa_bindcnt;
        public int tcfa_action;
        public TcfDefinitions.tcf_t tcfa_tm;
        public GnetDefinitions.gnet_stats_basic_sync tcfa_bstats;
        public GnetDefinitions.gnet_stats_basic_sync tcfa_bstats_hw;
        public GnetDefinitions.gnet_stats_queue tcfa_qstats;
        public Ptr<NetDefinitions.net_rate_estimator> tcfa_rate_est;
        public  @OriginalName(value="spinlock_t") runtime.spinlock tcfa_lock;
        public Ptr<GnetDefinitions.gnet_stats_basic_sync> cpu_bstats;
        public Ptr<GnetDefinitions.gnet_stats_basic_sync> cpu_bstats_hw;
        public Ptr<GnetDefinitions.gnet_stats_queue> cpu_qstats;
        public Ptr<tc_cookie> user_cookie;
        public Ptr<TcfDefinitions.tcf_chain> goto_chain;
        public @Unsigned int tcfa_flags;
        public char hw_stats;
        public char used_hw_stats;
        public boolean used_hw_stats_valid;
        public @Unsigned int in_hw_count;
    }

    @Type(noCCodeGeneration=true, cType="enum tc_setup_type")
    public static enum tc_setup_type implements Enum<tc_setup_type>,
    TypedEnum<tc_setup_type, Integer>
    {
        TC_QUERY_CAPS,
        TC_SETUP_QDISC_MQPRIO,
        TC_SETUP_CLSU32,
        TC_SETUP_CLSFLOWER,
        TC_SETUP_CLSMATCHALL,
        TC_SETUP_CLSBPF,
        TC_SETUP_BLOCK,
        TC_SETUP_QDISC_CBS,
        TC_SETUP_QDISC_RED,
        TC_SETUP_QDISC_PRIO,
        TC_SETUP_QDISC_MQ,
        TC_SETUP_QDISC_ETF,
        TC_SETUP_ROOT_QDISC,
        TC_SETUP_QDISC_GRED,
        TC_SETUP_QDISC_TAPRIO,
        TC_SETUP_FT,
        TC_SETUP_QDISC_ETS,
        TC_SETUP_QDISC_TBF,
        TC_SETUP_QDISC_FIFO,
        TC_SETUP_QDISC_HTB,
        TC_SETUP_ACT;

    }

    @Type(noCCodeGeneration=true, cType="struct tc_sizespec")
    @NotUsableInJava
    public static class tc_sizespec
    extends Struct {
        public char cell_log;
        public char size_log;
        public short cell_align;
        public int overhead;
        public @Unsigned int linklayer;
        public @Unsigned int mpu;
        public @Unsigned int mtu;
        public @Unsigned int tsize;
    }

    @Type(noCCodeGeneration=true, cType="struct tc_stats")
    @NotUsableInJava
    public static class tc_stats
    extends Struct {
        public @Unsigned long bytes;
        public @Unsigned int packets;
        public @Unsigned int drops;
        public @Unsigned int overlimits;
        public @Unsigned int bps;
        public @Unsigned int pps;
        public @Unsigned int qlen;
        public @Unsigned int backlog;
    }
}

