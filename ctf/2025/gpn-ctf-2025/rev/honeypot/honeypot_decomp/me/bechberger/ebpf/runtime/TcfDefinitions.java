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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class TcfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_block> __tcf_block_find(Ptr<runtime.net> net2, Ptr<runtime.Qdisc> q, @Unsigned long cl, int ifindex, @Unsigned int block_index, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcf_block_put(Ptr<tcf_block> block, Ptr<runtime.Qdisc> q, Ptr<tcf_block_ext_info> ei, boolean rtnl_held) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_chain> __tcf_chain_get(Ptr<tcf_block> block, @Unsigned int chain_index, boolean create, boolean by_act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcf_chain_put(Ptr<tcf_chain> chain, boolean by_act, boolean explicitly_created) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tcf_classify($arg1, (const struct tcf_proto*)$arg2, (const struct tcf_proto*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int __tcf_classify(Ptr<SkDefinitions.sk_buff> skb, Ptr<tcf_proto> tp, Ptr<tcf_proto> orig_tp, Ptr<tcf_result> res, boolean compat_mode, Ptr<tcf_exts_miss_cookie_node> n, int act_index, Ptr<@Unsigned Integer> last_executed_chain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_chain> __tcf_get_next_chain(Ptr<tcf_block> block, Ptr<tcf_chain> chain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_proto> __tcf_get_next_proto(Ptr<tcf_chain> chain, Ptr<tcf_proto> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct tcf_proto_ops*)__tcf_proto_lookup_ops((const u8*)$arg1))")
    public static Ptr<tcf_proto_ops> __tcf_proto_lookup_ops(String kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tcf_qdisc_find(Ptr<runtime.net> net2, Ptr<Ptr<runtime.Qdisc>> q, Ptr<@Unsigned Integer> parent, int ifindex, boolean rtnl_held, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_block_bind(Ptr<tcf_block> block, Ptr<FlowDefinitions.flow_block_offload> bo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_block_filter_cnt_update(Ptr<tcf_block> block, Ptr<@OriginalName(value="bool") Boolean> counted, boolean add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_block_get(Ptr<Ptr<tcf_block>> p_block, Ptr<Ptr<tcf_proto>> p_filter_chain, Ptr<runtime.Qdisc> q, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_block_get_ext(Ptr<Ptr<tcf_block>> p_block, Ptr<runtime.Qdisc> q, Ptr<tcf_block_ext_info> ei, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_block> tcf_block_lookup(Ptr<runtime.net> net2, @Unsigned int block_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_block_netif_keep_dst(Ptr<tcf_block> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_block_offload_dec(Ptr<tcf_block> block, Ptr<@Unsigned Integer> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_block_offload_unbind(Ptr<tcf_block> block, Ptr<runtime.Qdisc> q, Ptr<tcf_block_ext_info> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_block_owner_del(Ptr<tcf_block> block, Ptr<runtime.Qdisc> q, FlowDefinitions.flow_block_binder_type binder_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_block_playback_offloads(Ptr<tcf_block> block, Ptr<?> cb, Ptr<?> cb_priv, boolean add, boolean offload_in_use, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_block_put(Ptr<tcf_block> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_block_put_ext(Ptr<tcf_block> block, Ptr<runtime.Qdisc> q, Ptr<tcf_block_ext_info> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_block> tcf_block_refcnt_get(Ptr<runtime.net> net2, @Unsigned int block_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_block_unbind(Ptr<tcf_block> block, Ptr<FlowDefinitions.flow_block_offload> bo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_chain0_head_change_cb_del(Ptr<tcf_block> block, Ptr<tcf_block_ext_info> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_chain> tcf_chain_create(Ptr<tcf_block> block, @Unsigned int chain_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcf_chain_dump(Ptr<tcf_chain> chain, Ptr<runtime.Qdisc> q, @Unsigned int parent, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, long index_start, Ptr<Long> p_index, boolean terse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_chain_flush(Ptr<tcf_chain> chain, boolean rtnl_held) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_chain> tcf_chain_get_by_act(Ptr<tcf_block> block, @Unsigned int chain_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_chain_head_change_dflt(Ptr<tcf_proto> tp_head, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_chain_put_by_act(Ptr<tcf_chain> chain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_chain_tp_delete_empty(Ptr<tcf_chain> chain, Ptr<tcf_proto> tp, boolean rtnl_held, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_proto> tcf_chain_tp_find(Ptr<tcf_chain> chain, Ptr<tcf_chain_info> chain_info, @Unsigned int protocol, @Unsigned int prio, boolean prio_allocate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_proto> tcf_chain_tp_insert_unique(Ptr<tcf_chain> chain, Ptr<tcf_proto> tp_new, @Unsigned int protocol, @Unsigned int prio, boolean rtnl_held) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_classify($arg1, (const struct tcf_block*)$arg2, (const struct tcf_proto*)$arg3, $arg4, $arg5)")
    public static int tcf_classify(Ptr<SkDefinitions.sk_buff> skb, Ptr<tcf_block> block, Ptr<tcf_proto> tp, Ptr<tcf_result> res, boolean compat_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_exts_change(Ptr<tcf_exts> dst, Ptr<tcf_exts> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_exts_destroy(Ptr<tcf_exts> exts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_exts_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<tcf_exts> exts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_exts_dump_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<tcf_exts> exts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_exts_init_ex(Ptr<tcf_exts> exts, Ptr<runtime.net> net2, int action, int police, Ptr<tcf_proto> tp, @Unsigned int handle, boolean use_action_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcf_exts_num_actions(Ptr<tcf_exts> exts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_exts_terse_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<tcf_exts> exts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_exts_validate(Ptr<runtime.net> net2, Ptr<tcf_proto> tp, Ptr<Ptr<runtime.nlattr>> tb, Ptr<runtime.nlattr> rate_tlv, Ptr<tcf_exts> exts, @Unsigned int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_exts_validate_ex(Ptr<runtime.net> net2, Ptr<tcf_proto> tp, Ptr<Ptr<runtime.nlattr>> tb, Ptr<runtime.nlattr> rate_tlv, Ptr<tcf_exts> exts, @Unsigned int flags, @Unsigned int fl_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_fill_node(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcf_proto> tp, Ptr<tcf_block> block, Ptr<runtime.Qdisc> q, @Unsigned int parent, Ptr<?> fh, @Unsigned int portid, @Unsigned int seq, @Unsigned short flags, int event2, boolean terse_dump, boolean rtnl_held, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_chain> tcf_get_next_chain(Ptr<tcf_block> block, Ptr<tcf_chain> chain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_proto> tcf_get_next_proto(Ptr<tcf_chain> chain, Ptr<tcf_proto> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_node_dump(Ptr<tcf_proto> tp, Ptr<?> n, Ptr<tcf_walker> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcf_proto_check_kind(Ptr<runtime.nlattr> kind, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_proto_destroy(Ptr<tcf_proto> tp, boolean rtnl_held, boolean sig_destroy, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_proto_is_unlocked((const u8*)$arg1)")
    public static boolean tcf_proto_is_unlocked(String kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct tcf_proto_ops*)tcf_proto_lookup_ops((const u8*)$arg1, $arg2, $arg3))")
    public static Ptr<tcf_proto_ops> tcf_proto_lookup_ops(String kind, boolean rtnl_held, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_proto_put(Ptr<tcf_proto> tp, boolean rtnl_held, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_qevent_destroy(Ptr<tcf_qevent> qe, Ptr<runtime.Qdisc> sch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_qevent_dump(Ptr<SkDefinitions.sk_buff> skb, int attr_name, Ptr<tcf_qevent> qe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcf_qevent_handle(Ptr<tcf_qevent> qe, Ptr<runtime.Qdisc> sch, Ptr<SkDefinitions.sk_buff> skb, Ptr<Ptr<SkDefinitions.sk_buff>> to_free, Ptr<Integer> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_qevent_init(Ptr<tcf_qevent> qe, Ptr<runtime.Qdisc> sch, FlowDefinitions.flow_block_binder_type binder_type, Ptr<runtime.nlattr> block_index_attr, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_qevent_validate_change(Ptr<tcf_qevent> qe, Ptr<runtime.nlattr> block_index_attr, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcf_queue_work(Ptr<RcuDefinitions.rcu_work> rwork, @OriginalName(value="work_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tcf_em_tree_match(Ptr<SkDefinitions.sk_buff> skb, Ptr<tcf_ematch_tree> tree, Ptr<tcf_pkt_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_ematch_ops> tcf_em_lookup(@Unsigned short kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_em_register(Ptr<tcf_ematch_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_em_tree_destroy(Ptr<tcf_ematch_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_em_tree_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<tcf_ematch_tree> tree, int tlv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_em_tree_validate(Ptr<tcf_proto> tp, Ptr<runtime.nlattr> nla, Ptr<tcf_ematch_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_em_unregister(Ptr<tcf_ematch_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_node_bind(Ptr<tcf_proto> tp, Ptr<?> n, Ptr<tcf_walker> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tcf_action_put(Ptr<TcDefinitions.tc_action> p, boolean bind2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tcf_generic_walker($arg1, $arg2, $arg3, $arg4, (const struct tc_action_ops*)$arg5, $arg6)")
    public static int __tcf_generic_walker(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, int type2, Ptr<TcDefinitions.tc_action_ops> ops, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_add(Ptr<runtime.net> net2, Ptr<runtime.nlattr> nla, Ptr<runtime.nlmsghdr> n, @Unsigned int portid, @Unsigned int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_check_ctrlact(int action, Ptr<tcf_proto> tp, Ptr<Ptr<tcf_chain>> newchain, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_action_cleanup(Ptr<TcDefinitions.tc_action> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_copy_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<TcDefinitions.tc_action> p, int compat_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_destroy(Ptr<Ptr<TcDefinitions.tc_action>> actions2, int bind2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<Ptr<TcDefinitions.tc_action>> actions2, int bind2, int ref, boolean terse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_dump_1(Ptr<SkDefinitions.sk_buff> skb, Ptr<TcDefinitions.tc_action> a, int bind2, int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_dump_old(Ptr<SkDefinitions.sk_buff> skb, Ptr<TcDefinitions.tc_action> a, int bind2, int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_dump_terse(Ptr<SkDefinitions.sk_buff> skb, Ptr<TcDefinitions.tc_action> a, boolean from_act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_exec(Ptr<SkDefinitions.sk_buff> skb, Ptr<Ptr<TcDefinitions.tc_action>> actions2, int nr_actions, Ptr<tcf_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_action_fill_size((const struct tc_action*)$arg1)")
    public static @Unsigned long tcf_action_fill_size(Ptr<TcDefinitions.tc_action> act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_init(Ptr<runtime.net> net2, Ptr<tcf_proto> tp, Ptr<runtime.nlattr> nla, Ptr<runtime.nlattr> est, Ptr<Ptr<TcDefinitions.tc_action>> actions2, Ptr<Integer> init_res, Ptr<@Unsigned Long> attr_size, @Unsigned int flags, @Unsigned int fl_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TcDefinitions.tc_action> tcf_action_init_1(Ptr<runtime.net> net2, Ptr<tcf_proto> tp, Ptr<runtime.nlattr> nla, Ptr<runtime.nlattr> est, Ptr<TcDefinitions.tc_action_ops> a_o, Ptr<Integer> init_res, @Unsigned int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_offload_add_ex(Ptr<TcDefinitions.tc_action> action, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<?> cb, Ptr<?> cb_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_offload_cmd(Ptr<FlowDefinitions.flow_offload_action> fl_act, Ptr<@Unsigned Integer> hw_count, Ptr<?> cb, Ptr<?> cb_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_offload_del_ex(Ptr<TcDefinitions.tc_action> action, Ptr<?> cb, Ptr<?> cb_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_reoffload_cb(Ptr<?> cb, Ptr<?> cb_priv, boolean add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcf_chain> tcf_action_set_ctrlact(Ptr<TcDefinitions.tc_action> a, int action, Ptr<tcf_chain> goto_chain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_action_update_hw_stats(Ptr<TcDefinitions.tc_action> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_action_update_stats(Ptr<TcDefinitions.tc_action> a, @Unsigned long bytes, @Unsigned long packets, @Unsigned long drops, boolean hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_del_notify(Ptr<runtime.net> net2, Ptr<runtime.nlmsghdr> n, Ptr<Ptr<TcDefinitions.tc_action>> actions2, @Unsigned int portid, @Unsigned long attr_size, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_del_walker($arg1, $arg2, (const struct tc_action_ops*)$arg3, $arg4)")
    public static int tcf_del_walker(Ptr<tcf_idrinfo> idrinfo, Ptr<SkDefinitions.sk_buff> skb, Ptr<TcDefinitions.tc_action_ops> ops, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_dev_queue_xmit($arg1, (int (*)(struct sk_buff*))$arg2)")
    public static int tcf_dev_queue_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> xmit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_dump_walker(Ptr<tcf_idrinfo> idrinfo, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_free_cookie_rcu(Ptr<misc.callback_head> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_generic_walker($arg1, $arg2, $arg3, $arg4, (const struct tc_action_ops*)$arg5, $arg6)")
    public static int tcf_generic_walker(Ptr<TcDefinitions.tc_action_net> tn, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, int type2, Ptr<TcDefinitions.tc_action_ops> ops, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_idr_check_alloc(Ptr<TcDefinitions.tc_action_net> tn, Ptr<@Unsigned Integer> index2, Ptr<Ptr<TcDefinitions.tc_action>> a, int bind2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_idr_cleanup(Ptr<TcDefinitions.tc_action_net> tn, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_idr_create($arg1, $arg2, $arg3, $arg4, (const struct tc_action_ops*)$arg5, $arg6, $arg7, $arg8)")
    public static int tcf_idr_create(Ptr<TcDefinitions.tc_action_net> tn, @Unsigned int index2, Ptr<runtime.nlattr> est, Ptr<Ptr<TcDefinitions.tc_action>> a, Ptr<TcDefinitions.tc_action_ops> ops, int bind2, boolean cpustats, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_idr_create_from_flags($arg1, $arg2, $arg3, $arg4, (const struct tc_action_ops*)$arg5, $arg6, $arg7)")
    public static int tcf_idr_create_from_flags(Ptr<TcDefinitions.tc_action_net> tn, @Unsigned int index2, Ptr<runtime.nlattr> est, Ptr<Ptr<TcDefinitions.tc_action>> a, Ptr<TcDefinitions.tc_action_ops> ops, int bind2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_idr_insert_many(Ptr<Ptr<TcDefinitions.tc_action>> actions2, Ptr<Integer> init_res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_idr_release(Ptr<TcDefinitions.tc_action> a, boolean bind2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_idr_search(Ptr<TcDefinitions.tc_action_net> tn, Ptr<Ptr<TcDefinitions.tc_action>> a, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcf_idrinfo_destroy((const struct tc_action_ops*)$arg1, $arg2)")
    public static void tcf_idrinfo_destroy(Ptr<TcDefinitions.tc_action_ops> ops, Ptr<tcf_idrinfo> idrinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcf_pernet_del_id_list(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_register_action(Ptr<TcDefinitions.tc_action_ops> act, Ptr<misc.pernet_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcf_unregister_action(Ptr<TcDefinitions.tc_action_ops> act, Ptr<misc.pernet_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_ematch_tree")
    @NotUsableInJava
    public static class tcf_ematch_tree
    extends Struct {
        public tcf_ematch_tree_hdr hdr;
        public Ptr<tcf_ematch> matches;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_ematch_ops")
    @NotUsableInJava
    public static class tcf_ematch_ops
    extends Struct {
        public int kind;
        public int datalen;
        public Ptr<?> change;
        public Ptr<?> match;
        public Ptr<?> destroy;
        public Ptr<?> dump;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head link;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_ematch")
    @NotUsableInJava
    public static class tcf_ematch
    extends Struct {
        public Ptr<tcf_ematch_ops> ops;
        public @Unsigned long data;
        public @Unsigned int datalen;
        public @Unsigned short matchid;
        public @Unsigned short flags;
        public Ptr<runtime.net> net;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_pkt_info")
    @NotUsableInJava
    public static class tcf_pkt_info
    extends Struct {
        public String ptr;
        public int nexthdr;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_ematch_hdr")
    @NotUsableInJava
    public static class tcf_ematch_hdr
    extends Struct {
        public @Unsigned short matchid;
        public @Unsigned short kind;
        public @Unsigned short flags;
        public @Unsigned short pad;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_ematch_tree_hdr")
    @NotUsableInJava
    public static class tcf_ematch_tree_hdr
    extends Struct {
        public @Unsigned short nmatches;
        public @Unsigned short progid;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_bind_args")
    @NotUsableInJava
    public static class tcf_bind_args
    extends Struct {
        public tcf_walker w;
        public @Unsigned long base;
        public @Unsigned long cl;
        public @Unsigned int classid;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_dump_args")
    @NotUsableInJava
    public static class tcf_dump_args
    extends Struct {
        public tcf_walker w;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<NetlinkDefinitions.netlink_callback> cb;
        public Ptr<tcf_block> block;
        public Ptr<runtime.Qdisc> q;
        public @Unsigned int parent;
        public boolean terse_dump;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_chain_info")
    @NotUsableInJava
    public static class tcf_chain_info
    extends Struct {
        public Ptr<Ptr<tcf_proto>> pprev;
        public Ptr<tcf_proto> next;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_block_owner_item")
    @NotUsableInJava
    public static class tcf_block_owner_item
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.Qdisc> q;
        public FlowDefinitions.flow_block_binder_type binder_type;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_net")
    @NotUsableInJava
    public static class tcf_net
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock idr_lock;
        public runtime.idr idr;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_filter_chain_list_item")
    @NotUsableInJava
    public static class tcf_filter_chain_list_item
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> chain_head_change;
        public Ptr<?> chain_head_change_priv;
    }

    @Type(noCCodeGeneration=true, cType="union tcf_exts_miss_cookie")
    @NotUsableInJava
    public static class tcf_exts_miss_cookie
    extends Union {
        public AnonDefinitions.anon_member_of_tcf_exts_miss_cookie anon0;
        public @Unsigned long miss_cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_exts_miss_cookie_node")
    @NotUsableInJava
    public static class tcf_exts_miss_cookie_node
    extends Struct {
        public Ptr<tcf_chain> chain;
        public Ptr<tcf_proto> tp;
        public Ptr<tcf_exts> exts;
        public @Unsigned int chain_index;
        public @Unsigned int tp_prio;
        public @Unsigned int handle;
        public @Unsigned int miss_cookie_base;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_qevent")
    @NotUsableInJava
    public static class tcf_qevent
    extends Struct {
        public Ptr<tcf_block> block;
        public tcf_block_ext_info info;
        public Ptr<tcf_proto> filter_chain;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_block_ext_info")
    @NotUsableInJava
    public static class tcf_block_ext_info
    extends Struct {
        public FlowDefinitions.flow_block_binder_type binder_type;
        public Ptr<?> chain_head_change;
        public Ptr<?> chain_head_change_priv;
        public @Unsigned int block_index;
    }

    @Type(noCCodeGeneration=true, cType="enum tcf_proto_ops_flags")
    public static enum tcf_proto_ops_flags implements Enum<tcf_proto_ops_flags>,
    TypedEnum<tcf_proto_ops_flags, Integer>
    {
        TCF_PROTO_OPS_DOIT_UNLOCKED;

    }

    @Type(noCCodeGeneration=true, cType="struct tcf_pedit")
    @NotUsableInJava
    public static class tcf_pedit
    extends Struct {
        public TcDefinitions.tc_action common;
        public Ptr<tcf_pedit_parms> parms;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_pedit_parms")
    @NotUsableInJava
    public static class tcf_pedit_parms
    extends Struct {
        public Ptr<TcDefinitions.tc_pedit_key> tcfp_keys;
        public Ptr<tcf_pedit_key_ex> tcfp_keys_ex;
        public @Unsigned int tcfp_off_max_hint;
        public char tcfp_nkeys;
        public char tcfp_flags;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_pedit_key_ex")
    @NotUsableInJava
    public static class tcf_pedit_key_ex
    extends Struct {
        public misc.pedit_header_type htype;
        public misc.pedit_cmd cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_idrinfo")
    @NotUsableInJava
    public static class tcf_idrinfo
    extends Struct {
        public runtime.mutex lock;
        public runtime.idr action_idr;
        public Ptr<runtime.net> net;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_exts")
    @NotUsableInJava
    public static class tcf_exts
    extends Struct {
        public @Unsigned int type;
        public int nr_actions;
        public Ptr<Ptr<TcDefinitions.tc_action>> actions;
        public Ptr<runtime.net> net;
        public @OriginalName(value="netns_tracker") misc.lockdep_map_p ns_tracker;
        public Ptr<tcf_exts_miss_cookie_node> miss_cookie_node;
        public int action;
        public int police;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_walker")
    @NotUsableInJava
    public static class tcf_walker
    extends Struct {
        public int stop;
        public int skip;
        public int count;
        public boolean nonempty;
        public @Unsigned long cookie;
        public Ptr<?> fn;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_t")
    @NotUsableInJava
    public static class tcf_t
    extends Struct {
        public @Unsigned long install;
        public @Unsigned long lastuse;
        public @Unsigned long expires;
        public @Unsigned long firstuse;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_chain")
    @NotUsableInJava
    public static class tcf_chain
    extends Struct {
        public runtime.mutex filter_chain_lock;
        public Ptr<tcf_proto> filter_chain;
        public ListDefinitions.list_head list;
        public Ptr<tcf_block> block;
        public @Unsigned int index;
        public @Unsigned int refcnt;
        public @Unsigned int action_refcnt;
        public boolean explicitly_created;
        public boolean flushing;
        public Ptr<tcf_proto_ops> tmplt_ops;
        public Ptr<?> tmplt_priv;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_proto_ops")
    @NotUsableInJava
    public static class tcf_proto_ops
    extends Struct {
        public ListDefinitions.list_head head;
        public char @Size(value=16) [] kind;
        public Ptr<?> classify;
        public Ptr<?> init;
        public Ptr<?> destroy;
        public Ptr<?> get;
        public Ptr<?> put;
        public Ptr<?> change;
        public Ptr<?> delete;
        public Ptr<?> delete_empty;
        public Ptr<?> walk;
        public Ptr<?> reoffload;
        public Ptr<?> hw_add;
        public Ptr<?> hw_del;
        public Ptr<?> bind_class;
        public Ptr<?> tmplt_create;
        public Ptr<?> tmplt_destroy;
        public Ptr<?> tmplt_reoffload;
        public Ptr<?> get_exts;
        public Ptr<?> dump;
        public Ptr<?> terse_dump;
        public Ptr<?> tmplt_dump;
        public Ptr<runtime.module> owner;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_result")
    @NotUsableInJava
    public static class tcf_result
    extends Struct {
        @InlineUnion(value=6159)
        public  @InlineUnion(value=6159) AnonDefinitions.anon_member_of_anon_member_of_tcf_result anon0$0;
        @InlineUnion(value=6159)
        public @InlineUnion(value=6159) Ptr<tcf_proto> goto_tp;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_proto")
    @NotUsableInJava
    public static class tcf_proto
    extends Struct {
        public Ptr<tcf_proto> next;
        public Ptr<?> root;
        public Ptr<?> classify;
        public @Unsigned @OriginalName(value="__be16") short protocol;
        public @Unsigned int prio;
        public Ptr<?> data;
        public Ptr<tcf_proto_ops> ops;
        public Ptr<tcf_chain> chain;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public boolean deleting;
        public boolean counted;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public misc.callback_head rcu;
        public misc.hlist_node destroy_ht_node;
    }

    @Type(noCCodeGeneration=true, cType="struct tcf_block")
    @NotUsableInJava
    public static class tcf_block
    extends Struct {
        public runtime.xarray ports;
        public runtime.mutex lock;
        public ListDefinitions.list_head chain_list;
        public @Unsigned int index;
        public @Unsigned int classid;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public Ptr<runtime.net> net;
        public Ptr<runtime.Qdisc> q;
        public misc.rw_semaphore cb_lock;
        public FlowDefinitions.flow_block flow_block;
        public ListDefinitions.list_head owner_list;
        public boolean keep_dst;
        public boolean bypass_wanted;
        public AtomicDefinitions.atomic_t filtercnt;
        public AtomicDefinitions.atomic_t skipswcnt;
        public AtomicDefinitions.atomic_t offloadcnt;
        public @Unsigned int nooffloaddevcnt;
        public @Unsigned int lockeddevcnt;
        public misc.chain0_of_tcf_block chain0;
        public misc.callback_head rcu;
        public misc.hlist_head @Size(value=128) [] proto_destroy_ht;
        public runtime.mutex proto_destroy_lock;
    }
}

