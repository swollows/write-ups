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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.IcmpDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class NfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_hook_run_bpf($arg1, $arg2, (const struct nf_hook_state*)$arg3)")
    public static @Unsigned int nf_hook_run_bpf(Ptr<?> bpf_prog2, Ptr<SkDefinitions.sk_buff> skb, Ptr<nf_hook_state> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean nf_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_log_bind_pf($arg1, $arg2, (const struct nf_logger*)$arg3)")
    public static int nf_log_bind_pf(Ptr<runtime.net> net2, @OriginalName(value="u_int8_t") char pf, Ptr<nf_logger> logger) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_log_buf_add($arg1, (const u8*)$arg2, $arg3_)")
    public static int nf_log_buf_add(Ptr<nf_log_buf> m, String f, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_log_buf_close(Ptr<nf_log_buf> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<nf_log_buf> nf_log_buf_open() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_log_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_log_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_log_packet($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, (const struct net_device*)$arg5, (const struct net_device*)$arg6, (const struct nf_loginfo*)$arg7, (const u8*)$arg8, $arg9_)")
    public static void nf_log_packet(Ptr<runtime.net> net2, @OriginalName(value="u_int8_t") char pf, @Unsigned int hooknum, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> in, Ptr<NetDefinitions.net_device> out, Ptr<nf_loginfo> loginfo, String fmt, Object ... param8) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_log_proc_dostring((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int nf_log_proc_dostring(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_log_register(@OriginalName(value="u_int8_t") char pf, Ptr<nf_logger> logger) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_log_set($arg1, $arg2, (const struct nf_logger*)$arg3)")
    public static int nf_log_set(Ptr<runtime.net> net2, @OriginalName(value="u_int8_t") char pf, Ptr<nf_logger> logger) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_log_trace($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, (const struct net_device*)$arg5, (const struct net_device*)$arg6, (const struct nf_loginfo*)$arg7, (const u8*)$arg8, $arg9_)")
    public static void nf_log_trace(Ptr<runtime.net> net2, @OriginalName(value="u_int8_t") char pf, @Unsigned int hooknum, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> in, Ptr<NetDefinitions.net_device> out, Ptr<nf_loginfo> loginfo, String fmt, Object ... param8) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_log_unbind_pf(Ptr<runtime.net> net2, @OriginalName(value="u_int8_t") char pf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_log_unregister(Ptr<nf_logger> logger) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_log_unset($arg1, (const struct nf_logger*)$arg2)")
    public static void nf_log_unset(Ptr<runtime.net> net2, Ptr<nf_logger> logger) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_logger_find_get(int pf, nf_log_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_logger_put(int pf, nf_log_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nf_queue($arg1, (const struct nf_hook_state*)$arg2, $arg3, $arg4)")
    public static int __nf_queue(Ptr<SkDefinitions.sk_buff> skb, Ptr<nf_hook_state> state2, @Unsigned int index2, @Unsigned int queuenum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> nf_hook_direct_egress(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_queue(Ptr<SkDefinitions.sk_buff> skb, Ptr<nf_hook_state> state2, @Unsigned int index2, @Unsigned int verdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_queue_entry_free(Ptr<nf_queue_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nf_queue_entry_get_refs(Ptr<nf_queue_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_queue_entry_release_refs(Ptr<nf_queue_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_queue_nf_hook_drop(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_register_queue_handler((const struct nf_queue_handler*)$arg1)")
    public static void nf_register_queue_handler(Ptr<nf_queue_handler> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_unregister_queue_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __nf_hook_entries_free(Ptr<misc.callback_head> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __nf_hook_entries_try_shrink(Ptr<nf_hook_entries> old, Ptr<Ptr<nf_hook_entries>> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nf_register_net_hook($arg1, $arg2, (const struct nf_hook_ops*)$arg3)")
    public static int __nf_register_net_hook(Ptr<runtime.net> net2, int pf, Ptr<nf_hook_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nf_unregister_net_hook($arg1, $arg2, (const struct nf_hook_ops*)$arg3)")
    public static void __nf_unregister_net_hook(Ptr<runtime.net> net2, int pf, Ptr<nf_hook_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short nf_checksum(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hook, @Unsigned int dataoff, char protocol, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short nf_checksum_partial(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hook, @Unsigned int dataoff, @Unsigned int len, char protocol, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_conntrack_destroy(Ptr<nf_conntrack> nfct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_ct_attach($arg1, (const struct sk_buff*)$arg2)")
    public static void nf_ct_attach(Ptr<SkDefinitions.sk_buff> _new, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_ct_get_tuple_skb($arg1, (const struct sk_buff*)$arg2)")
    public static boolean nf_ct_get_tuple_skb(Ptr<nf_conntrack_tuple> dst_tuple, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_ct_set_closing(Ptr<nf_conntrack> nfct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_hook_entries_delete_raw($arg1, (const struct nf_hook_ops*)$arg2)")
    public static void nf_hook_entries_delete_raw(Ptr<Ptr<nf_hook_entries>> pp, Ptr<nf_hook_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_hook_entries_grow((const struct nf_hook_entries*)$arg1, (const struct nf_hook_ops*)$arg2)")
    public static Ptr<nf_hook_entries> nf_hook_entries_grow(Ptr<nf_hook_entries> old, Ptr<nf_hook_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_hook_entries_insert_raw($arg1, (const struct nf_hook_ops*)$arg2)")
    public static int nf_hook_entries_insert_raw(Ptr<Ptr<nf_hook_entries>> pp, Ptr<nf_hook_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<nf_hook_entries>> nf_hook_entry_head(Ptr<runtime.net> net2, int pf, @Unsigned int hooknum, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_hook_slow($arg1, $arg2, (const struct nf_hook_entries*)$arg3, $arg4)")
    public static int nf_hook_slow(Ptr<SkDefinitions.sk_buff> skb, Ptr<nf_hook_state> state2, Ptr<nf_hook_entries> e, @Unsigned int s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_hook_slow_list($arg1, $arg2, (const struct nf_hook_entries*)$arg3)")
    public static void nf_hook_slow_list(Ptr<ListDefinitions.list_head> head, Ptr<nf_hook_state> state2, Ptr<nf_hook_entries> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_ip6_check_hbh_len(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> plen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short nf_ip6_checksum(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hook, @Unsigned int dataoff, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short nf_ip_checksum(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hook, @Unsigned int dataoff, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_register_net_hook($arg1, (const struct nf_hook_ops*)$arg2)")
    public static int nf_register_net_hook(Ptr<runtime.net> net2, Ptr<nf_hook_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_register_net_hooks($arg1, (const struct nf_hook_ops*)$arg2, $arg3)")
    public static int nf_register_net_hooks(Ptr<runtime.net> net2, Ptr<nf_hook_ops> reg, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_route(Ptr<runtime.net> net2, Ptr<Ptr<DstDefinitions.dst_entry>> dst, Ptr<runtime.flowi> fl, boolean strict, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_unregister_net_hook($arg1, (const struct nf_hook_ops*)$arg2)")
    public static void nf_unregister_net_hook(Ptr<runtime.net> net2, Ptr<nf_hook_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_unregister_net_hooks($arg1, (const struct nf_hook_ops*)$arg2, $arg3)")
    public static void nf_unregister_net_hooks(Ptr<runtime.net> net2, Ptr<nf_hook_ops> reg, @Unsigned int hookcount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __nf_ip6_route(Ptr<runtime.net> net2, Ptr<Ptr<DstDefinitions.dst_entry>> dst, Ptr<runtime.flowi> fl, boolean strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_getsockopt(Ptr<runtime.sock> sk, @OriginalName(value="u_int8_t") char pf, int val, String opt, Ptr<Integer> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_hooks_lwtunnel_sysctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int nf_hooks_lwtunnel_sysctl_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nf_ip6_reroute($arg1, (const struct nf_queue_entry*)$arg2)")
    public static int nf_ip6_reroute(Ptr<SkDefinitions.sk_buff> skb, Ptr<nf_queue_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_ip_route(Ptr<runtime.net> net2, Ptr<Ptr<DstDefinitions.dst_entry>> dst, Ptr<runtime.flowi> fl, boolean strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_lwtunnel_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_lwtunnel_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_register_sockopt(Ptr<nf_sockopt_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nf_setsockopt(Ptr<runtime.sock> sk, @OriginalName(value="u_int8_t") char pf, int val, misc.sockptr_t opt, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nf_unregister_sockopt(Ptr<nf_sockopt_ops> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ct_hook")
    @NotUsableInJava
    public static class nf_ct_hook
    extends Struct {
        public Ptr<?> update;
        public Ptr<?> destroy;
        public Ptr<?> get_tuple_skb;
        public Ptr<?> attach;
        public Ptr<?> set_closing;
        public Ptr<?> confirm;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_hook_entries_rcu_head")
    @NotUsableInJava
    public static class nf_hook_entries_rcu_head
    extends Struct {
        public misc.callback_head head;
        public Ptr<?> allocation;
    }

    @Type(noCCodeGeneration=true, cType="enum nf_dev_hooks")
    public static enum nf_dev_hooks implements Enum<nf_dev_hooks>,
    TypedEnum<nf_dev_hooks, Integer>
    {
        NF_NETDEV_INGRESS,
        NF_NETDEV_EGRESS,
        NF_NETDEV_NUMHOOKS;

    }

    @Type(noCCodeGeneration=true, cType="struct nf_queue_handler")
    @NotUsableInJava
    public static class nf_queue_handler
    extends Struct {
        public Ptr<?> outfn;
        public Ptr<?> nf_hook_drop;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_bridge_info")
    @NotUsableInJava
    public static class nf_bridge_info
    extends Struct {
        public misc.orig_proto_of_nf_bridge_info orig_proto;
        public char pkt_otherhost;
        public char in_prerouting;
        public char bridged_dnat;
        public char sabotage_in_done;
        public @Unsigned short frag_max_size;
        public int physinif;
        public Ptr<NetDefinitions.net_device> physoutdev;
        @InlineUnion(value=66352)
        public @InlineUnion(value=66352) @Unsigned @OriginalName(value="__be32") int ipv4_daddr;
        @InlineUnion(value=66352)
        public  @InlineUnion(value=66352) In6Definitions.in6_addr ipv6_daddr;
        @InlineUnion(value=66352)
        public @InlineUnion(value=66352) char @Size(value=8) [] neigh_header;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_nat_hook")
    @NotUsableInJava
    public static class nf_nat_hook
    extends Struct {
        public Ptr<?> parse_nat_setup;
        public Ptr<?> decode_session;
        public Ptr<?> remove_nat_bysrc;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_defrag_hook")
    @NotUsableInJava
    public static class nf_defrag_hook
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> enable;
        public Ptr<?> disable;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_log_buf")
    @NotUsableInJava
    public static class nf_log_buf
    extends Struct {
        public @Unsigned int count;
        public char @Size(value=1020) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_loginfo")
    @NotUsableInJava
    public static class nf_loginfo
    extends Struct {
        public @OriginalName(value="u_int8_t") char type;
        public UDefinitions.u_of_nf_loginfo u;
    }

    @Type(noCCodeGeneration=true, cType="enum nf_log_type")
    public static enum nf_log_type implements Enum<nf_log_type>,
    TypedEnum<nf_log_type, Integer>
    {
        NF_LOG_TYPE_LOG,
        NF_LOG_TYPE_ULOG,
        NF_LOG_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct nf_conn_labels")
    @NotUsableInJava
    public static class nf_conn_labels
    extends Struct {
        public @Unsigned long @Size(value=2) [] bits;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_exp_event")
    @NotUsableInJava
    public static class nf_exp_event
    extends Struct {
        public Ptr<nf_conntrack_expect> exp;
        public @Unsigned int portid;
        public int report;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ct_event")
    @NotUsableInJava
    public static class nf_ct_event
    extends Struct {
        public Ptr<nf_conn> ct;
        public @Unsigned int portid;
        public int report;
    }

    @Type(noCCodeGeneration=true, cType="enum nf_ct_ext_id")
    public static enum nf_ct_ext_id implements Enum<nf_ct_ext_id>,
    TypedEnum<nf_ct_ext_id, Integer>
    {
        NF_CT_EXT_HELPER,
        NF_CT_EXT_NAT,
        NF_CT_EXT_SEQADJ,
        NF_CT_EXT_ACCT,
        NF_CT_EXT_ECACHE,
        NF_CT_EXT_TSTAMP,
        NF_CT_EXT_TIMEOUT,
        NF_CT_EXT_LABELS,
        NF_CT_EXT_SYNPROXY,
        NF_CT_EXT_ACT_CT,
        NF_CT_EXT_NUM;

    }

    @Type(noCCodeGeneration=true, cType="struct nf_conntrack_expect")
    @NotUsableInJava
    public static class nf_conntrack_expect
    extends Struct {
        public misc.hlist_node lnode;
        public misc.hlist_node hnode;
        public nf_conntrack_tuple tuple;
        public nf_conntrack_tuple_mask mask;
        public @OriginalName(value="refcount_t") misc.refcount_struct use;
        public @Unsigned int flags;
        public @Unsigned int _class;
        public Ptr<?> expectfn;
        public @OriginalName(value="nf_conntrack_helper") Ptr<?> helper;
        public Ptr<nf_conn> master;
        public TimerDefinitions.timer_list timeout;
        public nf_inet_addr saved_addr;
        public nf_conntrack_man_proto saved_proto;
        public IpDefinitions.ip_conntrack_dir dir;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ct_ext")
    @NotUsableInJava
    public static class nf_ct_ext
    extends Struct {
        public char @Size(value=10) [] offset;
        public char len;
        public @Unsigned int gen_id;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_conntrack_tuple_mask")
    @NotUsableInJava
    public static class nf_conntrack_tuple_mask
    extends Struct {
        public misc.src_of_nf_conntrack_tuple_mask src;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ct_event_notifier")
    @NotUsableInJava
    public static class nf_ct_event_notifier
    extends Struct {
        public Ptr<?> ct_event;
        public Ptr<?> exp_event;
    }

    @Type(noCCodeGeneration=true, cType="enum nf_ip6_hook_priorities")
    public static enum nf_ip6_hook_priorities implements Enum<nf_ip6_hook_priorities>,
    TypedEnum<nf_ip6_hook_priorities, Integer>
    {
        NF_IP6_PRI_FIRST,
        NF_IP6_PRI_RAW_BEFORE_DEFRAG,
        NF_IP6_PRI_CONNTRACK_DEFRAG,
        NF_IP6_PRI_RAW,
        NF_IP6_PRI_SELINUX_FIRST,
        NF_IP6_PRI_CONNTRACK,
        NF_IP6_PRI_MANGLE,
        NF_IP6_PRI_NAT_DST,
        NF_IP6_PRI_FILTER,
        NF_IP6_PRI_SECURITY,
        NF_IP6_PRI_NAT_SRC,
        NF_IP6_PRI_SELINUX_LAST,
        NF_IP6_PRI_CONNTRACK_HELPER,
        NF_IP6_PRI_LAST;

    }

    @Type(noCCodeGeneration=true, cType="enum nf_ip_hook_priorities")
    public static enum nf_ip_hook_priorities implements Enum<nf_ip_hook_priorities>,
    TypedEnum<nf_ip_hook_priorities, Integer>
    {
        NF_IP_PRI_FIRST,
        NF_IP_PRI_RAW_BEFORE_DEFRAG,
        NF_IP_PRI_CONNTRACK_DEFRAG,
        NF_IP_PRI_RAW,
        NF_IP_PRI_SELINUX_FIRST,
        NF_IP_PRI_CONNTRACK,
        NF_IP_PRI_MANGLE,
        NF_IP_PRI_NAT_DST,
        NF_IP_PRI_FILTER,
        NF_IP_PRI_SECURITY,
        NF_IP_PRI_NAT_SRC,
        NF_IP_PRI_SELINUX_LAST,
        NF_IP_PRI_CONNTRACK_HELPER,
        NF_IP_PRI_CONNTRACK_CONFIRM,
        NF_IP_PRI_LAST;

    }

    @Type(noCCodeGeneration=true, cType="struct nf_hook_ops")
    @NotUsableInJava
    public static class nf_hook_ops
    extends Struct {
        public Ptr<?> hook;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<?> priv;
        public char pf;
        public nf_hook_ops_type hook_ops_type;
        public @Unsigned int hooknum;
        public int priority;
    }

    @Type(noCCodeGeneration=true, cType="enum nf_hook_ops_type")
    public static enum nf_hook_ops_type implements Enum<nf_hook_ops_type>,
    TypedEnum<nf_hook_ops_type, Integer>
    {
        NF_HOOK_OP_UNDEFINED,
        NF_HOOK_OP_NF_TABLES,
        NF_HOOK_OP_BPF;

    }

    @Type(noCCodeGeneration=true, cType="struct nf_queue_entry")
    @NotUsableInJava
    public static class nf_queue_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<SkDefinitions.sk_buff> skb;
        public @Unsigned int id;
        public @Unsigned int hook_index;
        public Ptr<NetDefinitions.net_device> physin;
        public Ptr<NetDefinitions.net_device> physout;
        public nf_hook_state state;
        public @Unsigned short size;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ipv6_ops")
    @NotUsableInJava
    public static class nf_ipv6_ops
    extends Struct {
        public Ptr<?> route_input;
        public Ptr<?> fragment;
        public Ptr<?> reroute;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_sockopt_ops")
    @NotUsableInJava
    public static class nf_sockopt_ops
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="u_int8_t") char pf;
        public int set_optmin;
        public int set_optmax;
        public Ptr<?> set;
        public int get_optmin;
        public int get_optmax;
        public Ptr<?> get;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_conn___init")
    @NotUsableInJava
    public static class nf_conn___init
    extends Struct {
        public nf_conn ct;
    }

    @Type(noCCodeGeneration=true, cType="union nf_conntrack_proto")
    @NotUsableInJava
    public static class nf_conntrack_proto
    extends Union {
        public nf_ct_dccp dccp;
        public IpDefinitions.ip_ct_sctp sctp;
        public IpDefinitions.ip_ct_tcp tcp;
        public nf_ct_udp udp;
        public nf_ct_gre gre;
        public @Unsigned int tmpl_padto;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ct_udp")
    @NotUsableInJava
    public static class nf_ct_udp
    extends Struct {
        public @Unsigned long stream_ts;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_conntrack_tuple_hash")
    @NotUsableInJava
    public static class nf_conntrack_tuple_hash
    extends Struct {
        public misc.hlist_nulls_node hnnode;
        public nf_conntrack_tuple tuple;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_conntrack_man")
    @NotUsableInJava
    public static class nf_conntrack_man
    extends Struct {
        public nf_inet_addr u3;
        public nf_conntrack_man_proto u;
        public @Unsigned @OriginalName(value="u_int16_t") short l3num;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_conntrack_tuple")
    @NotUsableInJava
    public static class nf_conntrack_tuple
    extends Struct {
        public nf_conntrack_man src;
        public DstDefinitions.dst_of_nf_conntrack_tuple dst;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_conntrack_zone")
    @NotUsableInJava
    public static class nf_conntrack_zone
    extends Struct {
        public @Unsigned short id;
        public char flags;
        public char dir;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_conn")
    @NotUsableInJava
    public static class nf_conn
    extends Struct {
        public nf_conntrack ct_general;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int timeout;
        public nf_conntrack_zone zone;
        public nf_conntrack_tuple_hash @Size(value=2) [] tuplehash;
        public @Unsigned long status;
        public misc.possible_net_t ct_net;
        public misc.hlist_node nat_bysource;
        public misc.lockdep_map_p __nfct_init_offset;
        public Ptr<nf_conn> master;
        public @Unsigned @OriginalName(value="u_int32_t") int mark;
        public @Unsigned @OriginalName(value="u_int32_t") int secmark;
        public Ptr<nf_ct_ext> ext;
        public nf_conntrack_proto proto;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_hook_entry")
    @NotUsableInJava
    public static class nf_hook_entry
    extends Struct {
        public Ptr<?> hook;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_hook_state")
    @NotUsableInJava
    public static class nf_hook_state
    extends Struct {
        public char hook;
        public char pf;
        public Ptr<NetDefinitions.net_device> in;
        public Ptr<NetDefinitions.net_device> out;
        public Ptr<runtime.sock> sk;
        public Ptr<runtime.net> net;
        public Ptr<?> okfn;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ct_gre")
    @NotUsableInJava
    public static class nf_ct_gre
    extends Struct {
        public @Unsigned int stream_timeout;
        public @Unsigned int timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ct_dccp")
    @NotUsableInJava
    public static class nf_ct_dccp
    extends Struct {
        public @OriginalName(value="u_int8_t") char @Size(value=2) [] role;
        public @OriginalName(value="u_int8_t") char state;
        public @OriginalName(value="u_int8_t") char last_pkt;
        public @OriginalName(value="u_int8_t") char last_dir;
        public @Unsigned @OriginalName(value="u_int64_t") long handshake_seq;
    }

    @Type(noCCodeGeneration=true, cType="union nf_conntrack_man_proto")
    @NotUsableInJava
    public static class nf_conntrack_man_proto
    extends Union {
        public @Unsigned @OriginalName(value="__be16") short all;
        public misc.dccp_of_nf_conntrack_man_proto_and_dccp_of_u_of_dst_of_nf_conntrack_tuple_and_sctp_of_nf_conntrack_man_proto tcp;
        public misc.dccp_of_nf_conntrack_man_proto_and_dccp_of_u_of_dst_of_nf_conntrack_tuple_and_sctp_of_nf_conntrack_man_proto udp;
        public IcmpDefinitions.icmp_of_nf_conntrack_man_proto icmp;
        public misc.dccp_of_nf_conntrack_man_proto_and_dccp_of_u_of_dst_of_nf_conntrack_tuple_and_sctp_of_nf_conntrack_man_proto dccp;
        public misc.dccp_of_nf_conntrack_man_proto_and_dccp_of_u_of_dst_of_nf_conntrack_tuple_and_sctp_of_nf_conntrack_man_proto sctp;
        public misc.gre_of_nf_conntrack_man_proto_and_gre_of_u_of_dst_of_nf_conntrack_tuple gre;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_hook_entries")
    @NotUsableInJava
    public static class nf_hook_entries
    extends Struct {
        public @Unsigned short num_hook_entries;
        public nf_hook_entry @Size(value=0) [] hooks;
    }

    @Type(noCCodeGeneration=true, cType="union nf_inet_addr")
    @NotUsableInJava
    public static class nf_inet_addr
    extends Union {
        public @Unsigned int @Size(value=4) [] all;
        public @Unsigned @OriginalName(value="__be32") int ip;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] ip6;
        public InDefinitions.in_addr in;
        public In6Definitions.in6_addr in6;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_conntrack")
    @NotUsableInJava
    public static class nf_conntrack
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct use;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_flow_table_stat")
    @NotUsableInJava
    public static class nf_flow_table_stat
    extends Struct {
        public @Unsigned int count_wq_add;
        public @Unsigned int count_wq_del;
        public @Unsigned int count_wq_stats;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_ip_net")
    @NotUsableInJava
    public static class nf_ip_net
    extends Struct {
        public nf_generic_net generic;
        public nf_tcp_net tcp;
        public nf_udp_net udp;
        public nf_icmp_net icmp;
        public nf_icmp_net icmpv6;
        public nf_dccp_net dccp;
        public nf_sctp_net sctp;
        public nf_gre_net gre;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_gre_net")
    @NotUsableInJava
    public static class nf_gre_net
    extends Struct {
        public ListDefinitions.list_head keymap_list;
        public @Unsigned int @Size(value=2) [] timeouts;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_sctp_net")
    @NotUsableInJava
    public static class nf_sctp_net
    extends Struct {
        public @Unsigned int @Size(value=10) [] timeouts;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_dccp_net")
    @NotUsableInJava
    public static class nf_dccp_net
    extends Struct {
        public char dccp_loose;
        public @Unsigned int @Size(value=10) [] dccp_timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_icmp_net")
    @NotUsableInJava
    public static class nf_icmp_net
    extends Struct {
        public @Unsigned int timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_udp_net")
    @NotUsableInJava
    public static class nf_udp_net
    extends Struct {
        public @Unsigned int @Size(value=2) [] timeouts;
        public @Unsigned int offload_timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_tcp_net")
    @NotUsableInJava
    public static class nf_tcp_net
    extends Struct {
        public @Unsigned int @Size(value=14) [] timeouts;
        public char tcp_loose;
        public char tcp_be_liberal;
        public char tcp_max_retrans;
        public char tcp_ignore_invalid_rst;
        public @Unsigned int offload_timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_generic_net")
    @NotUsableInJava
    public static class nf_generic_net
    extends Struct {
        public @Unsigned int timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct nf_logger")
    @NotUsableInJava
    public static class nf_logger
    extends Struct {
        public String name;
        public nf_log_type type;
        public Ptr<?> logfn;
        public Ptr<runtime.module> me;
    }

    @Type(noCCodeGeneration=true, cType="enum nf_inet_hooks")
    public static enum nf_inet_hooks implements Enum<nf_inet_hooks>,
    TypedEnum<nf_inet_hooks, Integer>
    {
        NF_INET_PRE_ROUTING,
        NF_INET_LOCAL_IN,
        NF_INET_FORWARD,
        NF_INET_LOCAL_OUT,
        NF_INET_POST_ROUTING,
        NF_INET_NUMHOOKS,
        NF_INET_INGRESS;

    }
}

