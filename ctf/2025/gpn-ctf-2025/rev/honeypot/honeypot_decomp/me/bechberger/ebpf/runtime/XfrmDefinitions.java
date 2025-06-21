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
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
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

public final class XfrmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm_decode_session(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl, @Unsigned int family, int reverse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__xfrm_dst_lookup($arg1, (const struct xfrm_dst_lookup_params*)$arg2)")
    public static Ptr<DstDefinitions.dst_entry> __xfrm_dst_lookup(int family, Ptr<xfrm_dst_lookup_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm_policy_check(Ptr<runtime.sock> sk, int dir, Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xfrm_policy_inexact_prune_bin(Ptr<xfrm_pol_inexact_bin> b, boolean net_exit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xfrm_policy_link(Ptr<xfrm_policy> pol, int dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_policy> __xfrm_policy_unlink(Ptr<xfrm_policy> pol, int dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm_route_forward(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__xfrm_sk_clone_policy($arg1, (const struct sock*)$arg2)")
    public static int __xfrm_sk_clone_policy(Ptr<runtime.sock> sk, Ptr<runtime.sock> osk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_common_policyinfo(Ptr<xfrm_policy> xp, Ptr<AuditDefinitions.audit_buffer> audit_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_policy_add(Ptr<xfrm_policy> xp, int result, boolean task_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_policy_delete(Ptr<xfrm_policy> xp, int result, boolean task_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_bundle_create($arg1, $arg2, $arg3, $arg4, (const struct flowi*)$arg5, $arg6)")
    public static Ptr<DstDefinitions.dst_entry> xfrm_bundle_create(Ptr<xfrm_policy> policy, Ptr<Ptr<xfrm_state>> xfrm, Ptr<Ptr<xfrm_dst>> bundle, int nx, Ptr<runtime.flowi> fl, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_bundle_ok(Ptr<xfrm_dst> first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_confirm_neigh((const struct dst_entry*)$arg1, (const void*)$arg2)")
    public static void xfrm_confirm_neigh(Ptr<DstDefinitions.dst_entry> dst, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_default_advmss((const struct dst_entry*)$arg1)")
    public static @Unsigned int xfrm_default_advmss(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_dev_policy_flush(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, boolean task_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> xfrm_dst_check(Ptr<DstDefinitions.dst_entry> dst, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_dst_hash_transfer(Ptr<runtime.net> net2, Ptr<misc.hlist_head> list, Ptr<misc.hlist_head> ndsttable, @Unsigned int nhashmask, int dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_dst_ifdown(Ptr<DstDefinitions.dst_entry> dst, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> xfrm_dst_lookup(Ptr<xfrm_state> x, int tos, int oif, Ptr<xfrm_address_t> prev_saddr, Ptr<xfrm_address_t> prev_daddr, int family, @Unsigned int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_flowi_addr_get((const struct flowi*)$arg1, $arg2, $arg3, $arg4)")
    public static void xfrm_flowi_addr_get(Ptr<runtime.flowi> fl, Ptr<xfrm_address_t> saddr, Ptr<xfrm_address_t> daddr, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xfrm_gen_index(Ptr<runtime.net> net2, int dir, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_hash_rebuild(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_hash_resize(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_icmp_flow_decode($arg1, $arg2, (const struct flowi*)$arg3, $arg4)")
    public static boolean xfrm_icmp_flow_decode(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<runtime.flowi> fl, Ptr<runtime.flowi> fl1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_if_register_cb((const struct xfrm_if_cb*)$arg1)")
    public static void xfrm_if_register_cb(Ptr<xfrm_if_cb> ifcb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_if_unregister_cb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_in_fwd_icmp($arg1, (const struct flowi*)$arg2, $arg3, $arg4)")
    public static Ptr<xfrm_policy> xfrm_in_fwd_icmp(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl, @Unsigned short family, @Unsigned int if_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_link_failure(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_lookup($arg1, $arg2, (const struct flowi*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static Ptr<DstDefinitions.dst_entry> xfrm_lookup(Ptr<runtime.net> net2, Ptr<DstDefinitions.dst_entry> dst_orig, Ptr<runtime.flowi> fl, Ptr<runtime.sock> sk, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_lookup_route($arg1, $arg2, (const struct flowi*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static Ptr<DstDefinitions.dst_entry> xfrm_lookup_route(Ptr<runtime.net> net2, Ptr<DstDefinitions.dst_entry> dst_orig, Ptr<runtime.flowi> fl, Ptr<runtime.sock> sk, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_lookup_with_ifid($arg1, $arg2, (const struct flowi*)$arg3, (const struct sock*)$arg4, $arg5, $arg6)")
    public static Ptr<DstDefinitions.dst_entry> xfrm_lookup_with_ifid(Ptr<runtime.net> net2, Ptr<DstDefinitions.dst_entry> dst_orig, Ptr<runtime.flowi> fl, Ptr<runtime.sock> sk, int flags, @Unsigned int if_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_mtu((const struct dst_entry*)$arg1)")
    public static @Unsigned int xfrm_mtu(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_negative_advice(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_neigh_lookup((const struct dst_entry*)$arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.neighbour> xfrm_neigh_lookup(Ptr<DstDefinitions.dst_entry> dst, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> xfrm_out_fwd_icmp(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl, @Unsigned short family, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_pol_bin_cmp($arg1, (const void*)$arg2)")
    public static int xfrm_pol_bin_cmp(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_pol_bin_key((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned int xfrm_pol_bin_key(Ptr<?> data, @Unsigned int len, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_pol_bin_obj((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned int xfrm_pol_bin_obj(Ptr<?> data, @Unsigned int len, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_pol_inexact_addr_use_any_list((const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg1, $arg2, $arg3)")
    public static boolean xfrm_pol_inexact_addr_use_any_list(Ptr<xfrm_address_t> addr2, int family, char prefixlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_addr_delta((const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg1, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg2, $arg3, $arg4)")
    public static int xfrm_policy_addr_delta(Ptr<xfrm_address_t> a, Ptr<xfrm_address_t> b, char prefixlen, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_policy> xfrm_policy_alloc(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_byid($arg1, (const struct xfrm_mark*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<xfrm_policy> xfrm_policy_byid(Ptr<runtime.net> net2, Ptr<xfrm_mark> mark, @Unsigned int if_id, char type2, int dir, @Unsigned int id, int delete, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_bysel_ctx($arg1, (const struct xfrm_mark*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<xfrm_policy> xfrm_policy_bysel_ctx(Ptr<runtime.net> net2, Ptr<xfrm_mark> mark, @Unsigned int if_id, char type2, int dir, Ptr<xfrm_selector> sel, Ptr<xfrm_sec_ctx> ctx, int delete, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_policy_delete(Ptr<xfrm_policy> pol, int dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_destroy(Ptr<xfrm_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_destroy_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_find_inexact_candidates($arg1, $arg2, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg3, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg4)")
    public static boolean xfrm_policy_find_inexact_candidates(Ptr<xfrm_pol_inexact_candidates> cand, Ptr<xfrm_pol_inexact_bin> b, Ptr<xfrm_address_t> saddr, Ptr<xfrm_address_t> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_fini(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_policy_flush(Ptr<runtime.net> net2, char type2, boolean task_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_hash_rebuild(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_inexact_alloc_bin((const struct xfrm_policy*)$arg1, $arg2)")
    public static Ptr<xfrm_pol_inexact_bin> xfrm_policy_inexact_alloc_bin(Ptr<xfrm_policy> pol, char dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_head> xfrm_policy_inexact_alloc_chain(Ptr<xfrm_pol_inexact_bin> bin, Ptr<xfrm_policy> policy, char dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_inexact_gc_tree(Ptr<RbDefinitions.rb_root> r, boolean rm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_policy> xfrm_policy_inexact_insert(Ptr<xfrm_policy> policy, char dir, int excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_pol_inexact_node> xfrm_policy_inexact_insert_node(Ptr<runtime.net> net2, Ptr<RbDefinitions.rb_root> root, Ptr<xfrm_address_t> addr2, @Unsigned short family, char prefixlen, char dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_inexact_list_reinsert(Ptr<runtime.net> net2, Ptr<xfrm_pol_inexact_node> n, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_inexact_node_merge(Ptr<runtime.net> net2, Ptr<xfrm_pol_inexact_node> v, Ptr<xfrm_pol_inexact_node> n, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_policy_insert(int dir, Ptr<xfrm_policy> policy, int excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_policy> xfrm_policy_insert_list(Ptr<misc.hlist_head> chain, Ptr<xfrm_policy> policy, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_kill(Ptr<xfrm_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_lookup_inexact_addr((const struct rb_root*)$arg1, $arg2, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg3, $arg4)")
    public static Ptr<xfrm_pol_inexact_node> xfrm_policy_lookup_inexact_addr(Ptr<RbDefinitions.rb_root> r, Ptr< @OriginalName(value="seqcount_spinlock_t") misc.seqcount_spinlock> count, Ptr<xfrm_address_t> addr2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_match((const struct xfrm_policy*)$arg1, (const struct flowi*)$arg2, $arg3, $arg4, $arg5)")
    public static int xfrm_policy_match(Ptr<xfrm_policy> pol, Ptr<runtime.flowi> fl, char type2, @Unsigned short family, @Unsigned int if_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_ok((const struct xfrm_tmpl*)$arg1, (const struct sec_path*)$arg2, $arg3, $arg4, $arg5)")
    public static int xfrm_policy_ok(Ptr<xfrm_tmpl> tmpl, Ptr<misc.sec_path> sp, int start, @Unsigned short family, @Unsigned int if_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_queue_process(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_register_afinfo((const struct xfrm_policy_afinfo*)$arg1, $arg2)")
    public static int xfrm_policy_register_afinfo(Ptr<xfrm_policy_afinfo> afinfo, int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_requeue(Ptr<xfrm_policy> old, Ptr<xfrm_policy> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_policy_unregister_afinfo((const struct xfrm_policy_afinfo*)$arg1)")
    public static void xfrm_policy_unregister_afinfo(Ptr<xfrm_policy_afinfo> afinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_walk_done(Ptr<xfrm_policy_walk> walk, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_policy_walk_init(Ptr<xfrm_policy_walk> walk, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_proc_fini(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_proc_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_resolve_and_create_bundle($arg1, $arg2, (const struct flowi*)$arg3, $arg4, $arg5)")
    public static Ptr<xfrm_dst> xfrm_resolve_and_create_bundle(Ptr<Ptr<xfrm_policy>> pols, int num_pols, Ptr<runtime.flowi> fl, @Unsigned short family, Ptr<DstDefinitions.dst_entry> dst_orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_selector_inner_icmp_match($arg1, $arg2, (const struct xfrm_selector*)$arg3, (const struct flowi*)$arg4)")
    public static boolean xfrm_selector_inner_icmp_match(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<xfrm_selector> sel, Ptr<runtime.flowi> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_selector_match((const struct xfrm_selector*)$arg1, (const struct flowi*)$arg2, $arg3)")
    public static boolean xfrm_selector_match(Ptr<xfrm_selector> sel, Ptr<runtime.flowi> fl, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_sk_policy_insert(Ptr<runtime.sock> sk, int dir, Ptr<xfrm_policy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_sk_policy_lookup((const struct sock*)$arg1, $arg2, (const struct flowi*)$arg3, $arg4, $arg5)")
    public static Ptr<xfrm_policy> xfrm_sk_policy_lookup(Ptr<runtime.sock> sk, int dir, Ptr<runtime.flowi> fl, @Unsigned short family, @Unsigned int if_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_spd_getinfo(Ptr<runtime.net> net2, Ptr<misc.xfrmk_spdinfo> si) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_statistics_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_tmpl_resolve($arg1, $arg2, (const struct flowi*)$arg3, $arg4, $arg5)")
    public static int xfrm_tmpl_resolve(Ptr<Ptr<xfrm_policy>> pols, int npols, Ptr<runtime.flowi> fl, Ptr<Ptr<xfrm_state>> xfrm, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_tmpl_resolve_one($arg1, (const struct flowi*)$arg2, $arg3, $arg4)")
    public static int xfrm_tmpl_resolve_one(Ptr<xfrm_policy> policy, Ptr<runtime.flowi> fl, Ptr<Ptr<xfrm_state>> xfrm, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xfrm_mode_beet_prep(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xfrm_mode_tunnel_prep(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xfrm_transport_prep(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_dev_backlog(Ptr<misc.softnet_data> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_dev_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xfrm_dev_offload_ok(Ptr<SkDefinitions.sk_buff> skb, Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_dev_policy_add(Ptr<runtime.net> net2, Ptr<xfrm_policy> xp, Ptr<xfrm_user_offload> xuo, char dir, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_dev_resume(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_dev_state_add(Ptr<runtime.net> net2, Ptr<xfrm_state> x, Ptr<xfrm_user_offload> xuo, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_inner_extract_output(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_local_error(Ptr<SkDefinitions.sk_buff> skb, int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_outer_mode_output(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_outer_mode_prep(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_output(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_output2(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_output_one(Ptr<SkDefinitions.sk_buff> skb, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_output_resume(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_head> xfrm_hash_alloc(@Unsigned int sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_hash_free(Ptr<misc.hlist_head> n, @Unsigned int sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_init_replay(Ptr<xfrm_state> x, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_inner_mode_input(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_input(Ptr<SkDefinitions.sk_buff> skb, int nexthdr, @Unsigned @OriginalName(value="__be32") int spi, int encap_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_input_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_input_register_afinfo((const struct xfrm_input_afinfo*)$arg1)")
    public static int xfrm_input_register_afinfo(Ptr<xfrm_input_afinfo> afinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_input_resume(Ptr<SkDefinitions.sk_buff> skb, int nexthdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_input_unregister_afinfo((const struct xfrm_input_afinfo*)$arg1)")
    public static int xfrm_input_unregister_afinfo(Ptr<xfrm_input_afinfo> afinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_parse_spi(Ptr<SkDefinitions.sk_buff> skb, char nexthdr, Ptr<@Unsigned @OriginalName(value="__be32") Integer> spi, Ptr<@Unsigned @OriginalName(value="__be32") Integer> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_prepare_input(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_rcv_cb(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int family, char protocol, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_replay_advance(Ptr<xfrm_state> x, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_replay_advance_esn(Ptr<xfrm_state> x, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_replay_check(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_replay_check_bmp(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_replay_check_esn(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_replay_check_legacy(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_replay_notify(Ptr<xfrm_state> x, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_replay_notify_bmp(Ptr<xfrm_state> x, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_replay_notify_esn(Ptr<xfrm_state> x, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_replay_overflow(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_replay_recheck(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xfrm_replay_seqhi(Ptr<xfrm_state> x, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_trans_queue($arg1, (int (*)(struct net*, struct sock*, struct sk_buff*))$arg2)")
    public static int xfrm_trans_queue(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> finish) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_trans_queue_net($arg1, $arg2, (int (*)(struct net*, struct sock*, struct sk_buff*))$arg3)")
    public static int xfrm_trans_queue_net(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> finish) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_trans_reinject(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ___xfrm_state_destroy(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm_init_state(Ptr<xfrm_state> x, boolean init_replay, boolean offload, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__xfrm_spi_hash((const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int __xfrm_spi_hash(Ptr<xfrm_address_t> daddr, @Unsigned @OriginalName(value="__be32") int spi, char proto2, @Unsigned short family, @Unsigned int hmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__xfrm_src_hash((const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg1, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg2, $arg3, $arg4)")
    public static @Unsigned int __xfrm_src_hash(Ptr<xfrm_address_t> daddr, Ptr<xfrm_address_t> saddr, @Unsigned short family, @Unsigned int hmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xfrm_state_bump_genids(Ptr<xfrm_state> xnew) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm_state_delete(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xfrm_state_destroy(Ptr<xfrm_state> x, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xfrm_state_insert(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_alloc_spi(Ptr<xfrm_state> x, @Unsigned int low, @Unsigned int high, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_helper_pktinfo(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<AuditDefinitions.audit_buffer> audit_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_helper_sainfo(Ptr<xfrm_state> x, Ptr<AuditDefinitions.audit_buffer> audit_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_state_add(Ptr<xfrm_state> x, int result, boolean task_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_state_delete(Ptr<xfrm_state> x, int result, boolean task_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_state_icvfail(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, char proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_state_notfound(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, @Unsigned @OriginalName(value="__be32") int net_spi, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_state_notfound_simple(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_state_replay(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int net_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_audit_state_replay_overflow(Ptr<xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_dev_state_delete(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_dev_state_flush(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, boolean task_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_dev_state_free(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_find_acq($arg1, (const struct xfrm_mark*)$arg2, $arg3, $arg4, $arg5, $arg6, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg7, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg8, $arg9, $arg10)")
    public static Ptr<xfrm_state> xfrm_find_acq(Ptr<runtime.net> net2, Ptr<xfrm_mark> mark, char mode, @Unsigned int reqid, @Unsigned int if_id, char proto2, Ptr<xfrm_address_t> daddr, Ptr<xfrm_address_t> saddr, int create, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_state> xfrm_find_acq_byseq(Ptr<runtime.net> net2, @Unsigned int mark, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_flush_gc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xfrm_get_acqseq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_translator> xfrm_get_translator() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_init_state(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_init_tempstate($arg1, (const struct flowi*)$arg2, (const struct xfrm_tmpl*)$arg3, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg4, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg5, $arg6)")
    public static void xfrm_init_tempstate(Ptr<xfrm_state> x, Ptr<runtime.flowi> fl, Ptr<xfrm_tmpl> tmpl, Ptr<xfrm_address_t> daddr, Ptr<xfrm_address_t> saddr, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_nat_keepalive_fini(@Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_nat_keepalive_init(@Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_nat_keepalive_net_fini(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_nat_keepalive_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_nat_keepalive_state_updated(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_put_translator(Ptr<xfrm_translator> xtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_register_km(Ptr<xfrm_mgr> km) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_register_translator(Ptr<xfrm_translator> xtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_register_type((const struct xfrm_type*)$arg1, $arg2)")
    public static int xfrm_register_type(Ptr<xfrm_type> type2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_register_type_offload((const struct xfrm_type_offload*)$arg1, $arg2)")
    public static int xfrm_register_type_offload(Ptr<xfrm_type_offload> type2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_replay_timer_handler(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_sad_getinfo(Ptr<runtime.net> net2, Ptr<misc.xfrmk_sadinfo> si) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_state_add(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_state_afinfo> xfrm_state_afinfo_get_rcu(@Unsigned int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_state> xfrm_state_alloc(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_state_check_expire(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_state_delete(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_state_delete_tunnel(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_state_find((const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg1, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg2, (const struct flowi*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<xfrm_state> xfrm_state_find(Ptr<xfrm_address_t> daddr, Ptr<xfrm_address_t> saddr, Ptr<runtime.flowi> fl, Ptr<xfrm_tmpl> tmpl, Ptr<xfrm_policy> pol, Ptr<Integer> err, @Unsigned short family, @Unsigned int if_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_state_fini(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_state_flush(Ptr<runtime.net> net2, char proto2, boolean task_valid, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_state_free(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_state_gc_task(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_state_afinfo> xfrm_state_get_afinfo(@Unsigned int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_state_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_state_insert(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_state_look_at($arg1, $arg2, (const struct flowi*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void xfrm_state_look_at(Ptr<xfrm_policy> pol, Ptr<xfrm_state> x, Ptr<runtime.flowi> fl, @Unsigned short family, Ptr<Ptr<xfrm_state>> best, Ptr<Integer> acq_in_progress, Ptr<Integer> error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_state_lookup($arg1, $arg2, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<xfrm_state> xfrm_state_lookup(Ptr<runtime.net> net2, @Unsigned int mark, Ptr<xfrm_address_t> daddr, @Unsigned @OriginalName(value="__be32") int spi, char proto2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_state_lookup_byaddr($arg1, $arg2, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg3, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg4, $arg5, $arg6)")
    public static Ptr<xfrm_state> xfrm_state_lookup_byaddr(Ptr<runtime.net> net2, @Unsigned int mark, Ptr<xfrm_address_t> daddr, Ptr<xfrm_address_t> saddr, char proto2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_state> xfrm_state_lookup_byspi(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int spi, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xfrm_state_mtu(Ptr<xfrm_state> x, int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_state_register_afinfo(Ptr<xfrm_state_afinfo> afinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_state_unregister_afinfo(Ptr<xfrm_state_afinfo> afinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_state_update(Ptr<xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_state_update_stats(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_state_walk_done(Ptr<xfrm_state_walk> walk, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_state_walk_init(Ptr<xfrm_state_walk> walk, char proto2, Ptr<xfrm_address_filter> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xfrm_state> xfrm_stateonly_find(Ptr<runtime.net> net2, @Unsigned int mark, @Unsigned int if_id, Ptr<xfrm_address_t> daddr, Ptr<xfrm_address_t> saddr, @Unsigned short family, char mode, char proto2, @Unsigned int reqid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_sysctl_fini(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_sysctl_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart xfrm_timer_handler(Ptr<runtime.hrtimer> me) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm_unregister_km(Ptr<xfrm_mgr> km) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_unregister_translator(Ptr<xfrm_translator> xtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_unregister_type((const struct xfrm_type*)$arg1, $arg2)")
    public static void xfrm_unregister_type(Ptr<xfrm_type> type2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm_unregister_type_offload((const struct xfrm_type_offload*)$arg1, $arg2)")
    public static void xfrm_unregister_type_offload(Ptr<xfrm_type_offload> type2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm_user_policy(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_trans_cb")
    @NotUsableInJava
    public static class xfrm_trans_cb
    extends Struct {
        public AnonDefinitions.anon_member_of_ipfrag_skb_cb_and_header_of_anon_member_of_tcp_skb_cb_and_header_of_sock_exterr_skb header;
        public Ptr<?> finish;
        public Ptr<runtime.net> net;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_trans_tasklet")
    @NotUsableInJava
    public static class xfrm_trans_tasklet
    extends Struct {
        public misc.work_struct work;
        public  @OriginalName(value="spinlock_t") runtime.spinlock queue_lock;
        public SkDefinitions.sk_buff_head queue;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_skb_cb")
    @NotUsableInJava
    public static class xfrm_skb_cb
    extends Struct {
        public xfrm_tunnel_skb_cb header;
        public SeqDefinitions.seq_of_xfrm_skb_cb seq;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_user_offload")
    @NotUsableInJava
    public static class xfrm_user_offload
    extends Struct {
        public int ifindex;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_mode_skb_cb")
    @NotUsableInJava
    public static class xfrm_mode_skb_cb
    extends Struct {
        public xfrm_tunnel_skb_cb header;
        public @Unsigned @OriginalName(value="__be16") short id;
        public @Unsigned @OriginalName(value="__be16") short frag_off;
        public char ihl;
        public char tos;
        public char ttl;
        public char protocol;
        public char optlen;
        public char @Size(value=3) [] flow_lbl;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_flow_keys")
    @NotUsableInJava
    public static class xfrm_flow_keys
    extends Struct {
        public FlowDefinitions.flow_dissector_key_basic basic;
        public FlowDefinitions.flow_dissector_key_control control;
        public misc.addrs_of_xfrm_flow_keys_and_anon_member_of_ethtool_rx_flow_key addrs;
        public FlowDefinitions.flow_dissector_key_ip ip;
        public FlowDefinitions.flow_dissector_key_icmp icmp;
        public FlowDefinitions.flow_dissector_key_ports ports;
        public FlowDefinitions.flow_dissector_key_keyid gre;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_pol_inexact_candidates")
    @NotUsableInJava
    public static class xfrm_pol_inexact_candidates
    extends Struct {
        public Ptr<misc.hlist_head> @Size(value=4) [] res;
    }

    @Type(noCCodeGeneration=true, cType="enum xfrm_pol_inexact_candidate_type")
    public static enum xfrm_pol_inexact_candidate_type implements Enum<xfrm_pol_inexact_candidate_type>,
    TypedEnum<xfrm_pol_inexact_candidate_type, Integer>
    {
        XFRM_POL_CAND_BOTH,
        XFRM_POL_CAND_SADDR,
        XFRM_POL_CAND_DADDR,
        XFRM_POL_CAND_ANY,
        XFRM_POL_CAND_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_pol_inexact_bin")
    @NotUsableInJava
    public static class xfrm_pol_inexact_bin
    extends Struct {
        public xfrm_pol_inexact_key k;
        public misc.rhash_head head;
        public misc.hlist_head hhead;
        public  @OriginalName(value="seqcount_spinlock_t") misc.seqcount_spinlock count;
        public RbDefinitions.rb_root root_d;
        public RbDefinitions.rb_root root_s;
        public ListDefinitions.list_head inexact_bins;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_pol_inexact_key")
    @NotUsableInJava
    public static class xfrm_pol_inexact_key
    extends Struct {
        public misc.possible_net_t net;
        public @Unsigned int if_id;
        public @Unsigned short family;
        public char dir;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_pol_inexact_node")
    @NotUsableInJava
    public static class xfrm_pol_inexact_node
    extends Struct {
        public RbDefinitions.rb_node node;
        @InlineUnion(value=34625)
        public @InlineUnion(value=34625) xfrm_address_t addr;
        @InlineUnion(value=34625)
        public  @InlineUnion(value=34625) misc.callback_head rcu;
        public char prefixlen;
        public RbDefinitions.rb_root root;
        public misc.hlist_head hhead;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_flo")
    @NotUsableInJava
    public static class xfrm_flo
    extends Struct {
        public Ptr<DstDefinitions.dst_entry> dst_orig;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_policy_walk")
    @NotUsableInJava
    public static class xfrm_policy_walk
    extends Struct {
        public xfrm_policy_walk_entry walk;
        public char type;
        public @Unsigned int seq;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_dst")
    @NotUsableInJava
    public static class xfrm_dst
    extends Struct {
        public UDefinitions.u_of_xfrm_dst u;
        public Ptr<DstDefinitions.dst_entry> route;
        public Ptr<DstDefinitions.dst_entry> child;
        public Ptr<DstDefinitions.dst_entry> path;
        public Ptr<xfrm_policy> @Size(value=2) [] pols;
        public int num_pols;
        public int num_xfrms;
        public @Unsigned int xfrm_genid;
        public @Unsigned int policy_genid;
        public @Unsigned int route_mtu_cached;
        public @Unsigned int child_mtu_cached;
        public @Unsigned int route_cookie;
        public @Unsigned int path_cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_policy_afinfo")
    @NotUsableInJava
    public static class xfrm_policy_afinfo
    extends Struct {
        public Ptr<DstDefinitions.dst_ops> dst_ops;
        public Ptr<?> dst_lookup;
        public Ptr<?> get_saddr;
        public Ptr<?> fill_dst;
        public Ptr<?> blackhole_route;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_dst_lookup_params")
    @NotUsableInJava
    public static class xfrm_dst_lookup_params
    extends Struct {
        public Ptr<runtime.net> net;
        public int tos;
        public int oif;
        public Ptr<xfrm_address_t> saddr;
        public Ptr<xfrm_address_t> daddr;
        public @Unsigned int mark;
        public char ipproto;
        public misc.flowi_uli uli;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_if_cb")
    @NotUsableInJava
    public static class xfrm_if_cb
    extends Struct {
        public Ptr<?> decode_session;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_if_decode_session_result")
    @NotUsableInJava
    public static class xfrm_if_decode_session_result
    extends Struct {
        public Ptr<runtime.net> net;
        public @Unsigned int if_id;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_translator")
    @NotUsableInJava
    public static class xfrm_translator
    extends Struct {
        public Ptr<?> alloc_compat;
        public Ptr<?> rcv_msg_compat;
        public Ptr<?> xlate_user_policy_sockptr;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_mgr")
    @NotUsableInJava
    public static class xfrm_mgr
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> notify;
        public Ptr<?> acquire;
        public Ptr<?> compile_policy;
        public Ptr<?> new_mapping;
        public Ptr<?> notify_policy;
        public Ptr<?> report;
        public Ptr<?> migrate;
        public Ptr<?> is_alive;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_migrate")
    @NotUsableInJava
    public static class xfrm_migrate
    extends Struct {
        public xfrm_address_t old_daddr;
        public xfrm_address_t old_saddr;
        public xfrm_address_t new_daddr;
        public xfrm_address_t new_saddr;
        public char proto;
        public char mode;
        public @Unsigned short reserved;
        public @Unsigned int reqid;
        public @Unsigned short old_family;
        public @Unsigned short new_family;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_kmaddress")
    @NotUsableInJava
    public static class xfrm_kmaddress
    extends Struct {
        public xfrm_address_t local;
        public xfrm_address_t remote;
        public @Unsigned int reserved;
        public @Unsigned short family;
    }

    @Type(noCCodeGeneration=true, cType="enum xfrm_nlgroups")
    public static enum xfrm_nlgroups implements Enum<xfrm_nlgroups>,
    TypedEnum<xfrm_nlgroups, Integer>
    {
        XFRMNLGRP_NONE,
        XFRMNLGRP_ACQUIRE,
        XFRMNLGRP_EXPIRE,
        XFRMNLGRP_SA,
        XFRMNLGRP_POLICY,
        XFRMNLGRP_AEVENTS,
        XFRMNLGRP_REPORT,
        XFRMNLGRP_MIGRATE,
        XFRMNLGRP_MAPPING,
        __XFRMNLGRP_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum xfrm_ae_ftype_t")
    public static enum xfrm_ae_ftype_t implements Enum<xfrm_ae_ftype_t>,
    TypedEnum<xfrm_ae_ftype_t, Integer>
    {
        XFRM_AE_UNSPEC,
        XFRM_AE_RTHR,
        XFRM_AE_RVAL,
        XFRM_AE_LVAL,
        XFRM_AE_ETHR,
        XFRM_AE_CR,
        XFRM_AE_CE,
        XFRM_AE_CU,
        __XFRM_AE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum xfrm_sa_dir")
    public static enum xfrm_sa_dir implements Enum<xfrm_sa_dir>,
    TypedEnum<xfrm_sa_dir, Integer>
    {
        XFRM_SA_DIR_IN,
        XFRM_SA_DIR_OUT;

    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_spi_skb_cb")
    @NotUsableInJava
    public static class xfrm_spi_skb_cb
    extends Struct {
        public xfrm_tunnel_skb_cb header;
        public @Unsigned int daddroff;
        public @Unsigned int family;
        public @Unsigned @OriginalName(value="__be32") int seq;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_tunnel_skb_cb")
    @NotUsableInJava
    public static class xfrm_tunnel_skb_cb
    extends Struct {
        public AnonDefinitions.anon_member_of_ipfrag_skb_cb_and_header_of_anon_member_of_tcp_skb_cb_and_header_of_sock_exterr_skb header;
        public misc.tunnel_of_xfrm_tunnel_skb_cb tunnel;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_input_afinfo")
    @NotUsableInJava
    public static class xfrm_input_afinfo
    extends Struct {
        public char family;
        public boolean is_ipip;
        public Ptr<?> callback;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_state_afinfo")
    @NotUsableInJava
    public static class xfrm_state_afinfo
    extends Struct {
        public char family;
        public char proto;
        public Ptr<xfrm_type_offload> type_offload_esp;
        public Ptr<xfrm_type> type_esp;
        public Ptr<xfrm_type> type_ipip;
        public Ptr<xfrm_type> type_ipip6;
        public Ptr<xfrm_type> type_comp;
        public Ptr<xfrm_type> type_ah;
        public Ptr<xfrm_type> type_routing;
        public Ptr<xfrm_type> type_dstopts;
        public Ptr<?> output;
        public Ptr<?> transport_finish;
        public Ptr<?> local_error;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_offload")
    @NotUsableInJava
    public static class xfrm_offload
    extends Struct {
        public misc.output_of_seq_of_xfrm_skb_cb_and_seq_of_xfrm_offload seq;
        public @Unsigned int flags;
        public @Unsigned int status;
        public @Unsigned int orig_mac_len;
        public char proto;
        public char inner_ipproto;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_policy_queue")
    @NotUsableInJava
    public static class xfrm_policy_queue
    extends Struct {
        public SkDefinitions.sk_buff_head hold_queue;
        public TimerDefinitions.timer_list hold_timer;
        public @Unsigned long timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_policy_walk_entry")
    @NotUsableInJava
    public static class xfrm_policy_walk_entry
    extends Struct {
        public ListDefinitions.list_head all;
        public char dead;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_tmpl")
    @NotUsableInJava
    public static class xfrm_tmpl
    extends Struct {
        public xfrm_id id;
        public xfrm_address_t saddr;
        public @Unsigned short encap_family;
        public @Unsigned int reqid;
        public char mode;
        public char share;
        public char optional;
        public char allalgs;
        public @Unsigned int aalgos;
        public @Unsigned int ealgos;
        public @Unsigned int calgos;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_type_offload")
    @NotUsableInJava
    public static class xfrm_type_offload
    extends Struct {
        public Ptr<runtime.module> owner;
        public char proto;
        public Ptr<?> encap;
        public Ptr<?> input_tail;
        public Ptr<?> xmit;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_type")
    @NotUsableInJava
    public static class xfrm_type
    extends Struct {
        public Ptr<runtime.module> owner;
        public char proto;
        public char flags;
        public Ptr<?> init_state;
        public Ptr<?> destructor;
        public Ptr<?> input;
        public Ptr<?> output;
        public Ptr<?> reject;
    }

    @Type(noCCodeGeneration=true, cType="enum xfrm_replay_mode")
    public static enum xfrm_replay_mode implements Enum<xfrm_replay_mode>,
    TypedEnum<xfrm_replay_mode, Integer>
    {
        XFRM_REPLAY_MODE_LEGACY,
        XFRM_REPLAY_MODE_BMP,
        XFRM_REPLAY_MODE_ESN;

    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_mode")
    @NotUsableInJava
    public static class xfrm_mode
    extends Struct {
        public char encap;
        public char family;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_dev_offload")
    @NotUsableInJava
    public static class xfrm_dev_offload
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public  @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public Ptr<NetDefinitions.net_device> real_dev;
        public @Unsigned long offload_handle;
        public char dir;
        public char type;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_state_walk")
    @NotUsableInJava
    public static class xfrm_state_walk
    extends Struct {
        public ListDefinitions.list_head all;
        public char state;
        public char dying;
        public char proto;
        public @Unsigned int seq;
        public Ptr<xfrm_address_filter> filter;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_md_info")
    @NotUsableInJava
    public static class xfrm_md_info
    extends Struct {
        public @Unsigned int if_id;
        public int link;
        public Ptr<DstDefinitions.dst_entry> dst_orig;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_policy")
    @NotUsableInJava
    public static class xfrm_policy
    extends Struct {
        public misc.possible_net_t xp_net;
        public misc.hlist_node bydst;
        public misc.hlist_node byidx;
        public misc.rwlock_t lock;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned int pos;
        public TimerDefinitions.timer_list timer;
        public AtomicDefinitions.atomic_t genid;
        public @Unsigned int priority;
        public @Unsigned int index;
        public @Unsigned int if_id;
        public xfrm_mark mark;
        public xfrm_selector selector;
        public xfrm_lifetime_cfg lft;
        public xfrm_lifetime_cur curlft;
        public xfrm_policy_walk_entry walk;
        public xfrm_policy_queue polq;
        public boolean bydst_reinsert;
        public char type;
        public char action;
        public char flags;
        public char xfrm_nr;
        public @Unsigned short family;
        public Ptr<xfrm_sec_ctx> security;
        public xfrm_tmpl @Size(value=6) [] xfrm_vec;
        public misc.callback_head rcu;
        public xfrm_dev_offload xdo;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_state")
    @NotUsableInJava
    public static class xfrm_state
    extends Struct {
        public misc.possible_net_t xs_net;
        @InlineUnion(value=23895)
        public  @InlineUnion(value=23895) misc.hlist_node gclist;
        @InlineUnion(value=23895)
        public  @InlineUnion(value=23895) misc.hlist_node bydst;
        @InlineUnion(value=23896)
        public  @InlineUnion(value=23896) misc.hlist_node dev_gclist;
        @InlineUnion(value=23896)
        public  @InlineUnion(value=23896) misc.hlist_node bysrc;
        public misc.hlist_node byspi;
        public misc.hlist_node byseq;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public xfrm_id id;
        public xfrm_selector sel;
        public xfrm_mark mark;
        public @Unsigned int if_id;
        public @Unsigned int tfcpad;
        public @Unsigned int genid;
        public xfrm_state_walk km;
        public misc.props_of_xfrm_state props;
        public xfrm_lifetime_cfg lft;
        public Ptr<xfrm_algo_auth> aalg;
        public Ptr<xfrm_algo> ealg;
        public Ptr<xfrm_algo> calg;
        public Ptr<xfrm_algo_aead> aead;
        public String geniv;
        public @Unsigned @OriginalName(value="__be16") short new_mapping_sport;
        public @Unsigned int new_mapping;
        public @Unsigned int mapping_maxage;
        public Ptr<xfrm_encap_tmpl> encap;
        public Ptr<runtime.sock> encap_sk;
        public @Unsigned int nat_keepalive_interval;
        public @OriginalName(value="time64_t") long nat_keepalive_expiration;
        public Ptr<xfrm_address_t> coaddr;
        public Ptr<xfrm_state> tunnel;
        public AtomicDefinitions.atomic_t tunnel_users;
        public xfrm_replay_state replay;
        public Ptr<xfrm_replay_state_esn> replay_esn;
        public xfrm_replay_state preplay;
        public Ptr<xfrm_replay_state_esn> preplay_esn;
        public xfrm_replay_mode repl_mode;
        public @Unsigned int xflags;
        public @Unsigned int replay_maxage;
        public @Unsigned int replay_maxdiff;
        public TimerDefinitions.timer_list rtimer;
        public xfrm_stats stats;
        public xfrm_lifetime_cur curlft;
        public runtime.hrtimer mtimer;
        public xfrm_dev_offload xso;
        public long saved_tmo;
        public @OriginalName(value="time64_t") long lastused;
        public PageDefinitions.page_frag xfrag;
        public Ptr<xfrm_type> type;
        public xfrm_mode inner_mode;
        public xfrm_mode inner_mode_iaf;
        public xfrm_mode outer_mode;
        public Ptr<xfrm_type_offload> type_offload;
        public Ptr<xfrm_sec_ctx> security;
        public Ptr<?> data;
        public char dir;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_address_filter")
    @NotUsableInJava
    public static class xfrm_address_filter
    extends Struct {
        public xfrm_address_t saddr;
        public xfrm_address_t daddr;
        public @Unsigned short family;
        public char splen;
        public char dplen;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_mark")
    @NotUsableInJava
    public static class xfrm_mark
    extends Struct {
        public @Unsigned int v;
        public @Unsigned int m;
    }

    @Type(noCCodeGeneration=true, cType="enum xfrm_attr_type_t")
    public static enum xfrm_attr_type_t implements Enum<xfrm_attr_type_t>,
    TypedEnum<xfrm_attr_type_t, Integer>
    {
        XFRMA_UNSPEC,
        XFRMA_ALG_AUTH,
        XFRMA_ALG_CRYPT,
        XFRMA_ALG_COMP,
        XFRMA_ENCAP,
        XFRMA_TMPL,
        XFRMA_SA,
        XFRMA_POLICY,
        XFRMA_SEC_CTX,
        XFRMA_LTIME_VAL,
        XFRMA_REPLAY_VAL,
        XFRMA_REPLAY_THRESH,
        XFRMA_ETIMER_THRESH,
        XFRMA_SRCADDR,
        XFRMA_COADDR,
        XFRMA_LASTUSED,
        XFRMA_POLICY_TYPE,
        XFRMA_MIGRATE,
        XFRMA_ALG_AEAD,
        XFRMA_KMADDRESS,
        XFRMA_ALG_AUTH_TRUNC,
        XFRMA_MARK,
        XFRMA_TFCPAD,
        XFRMA_REPLAY_ESN_VAL,
        XFRMA_SA_EXTRA_FLAGS,
        XFRMA_PROTO,
        XFRMA_ADDRESS_FILTER,
        XFRMA_PAD,
        XFRMA_OFFLOAD_DEV,
        XFRMA_SET_MARK,
        XFRMA_SET_MARK_MASK,
        XFRMA_IF_ID,
        XFRMA_MTIMER_THRESH,
        XFRMA_SA_DIR,
        XFRMA_NAT_KEEPALIVE_INTERVAL,
        __XFRMA_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_encap_tmpl")
    @NotUsableInJava
    public static class xfrm_encap_tmpl
    extends Struct {
        public @Unsigned short encap_type;
        public @Unsigned @OriginalName(value="__be16") short encap_sport;
        public @Unsigned @OriginalName(value="__be16") short encap_dport;
        public xfrm_address_t encap_oa;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_stats")
    @NotUsableInJava
    public static class xfrm_stats
    extends Struct {
        public @Unsigned int replay_window;
        public @Unsigned int replay;
        public @Unsigned int integrity_failed;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_algo_aead")
    @NotUsableInJava
    public static class xfrm_algo_aead
    extends Struct {
        public char @Size(value=64) [] alg_name;
        public @Unsigned int alg_key_len;
        public @Unsigned int alg_icv_len;
        public char @Size(value=0) [] alg_key;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_algo_auth")
    @NotUsableInJava
    public static class xfrm_algo_auth
    extends Struct {
        public char @Size(value=64) [] alg_name;
        public @Unsigned int alg_key_len;
        public @Unsigned int alg_trunc_len;
        public char @Size(value=0) [] alg_key;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_algo")
    @NotUsableInJava
    public static class xfrm_algo
    extends Struct {
        public char @Size(value=64) [] alg_name;
        public @Unsigned int alg_key_len;
        public char @Size(value=0) [] alg_key;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_replay_state_esn")
    @NotUsableInJava
    public static class xfrm_replay_state_esn
    extends Struct {
        public @Unsigned int bmp_len;
        public @Unsigned int oseq;
        public @Unsigned int seq;
        public @Unsigned int oseq_hi;
        public @Unsigned int seq_hi;
        public @Unsigned int replay_window;
        public @Unsigned int @Size(value=0) [] bmp;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_replay_state")
    @NotUsableInJava
    public static class xfrm_replay_state
    extends Struct {
        public @Unsigned int oseq;
        public @Unsigned int seq;
        public @Unsigned int bitmap;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_lifetime_cur")
    @NotUsableInJava
    public static class xfrm_lifetime_cur
    extends Struct {
        public @Unsigned long bytes;
        public @Unsigned long packets;
        public @Unsigned long add_time;
        public @Unsigned long use_time;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_lifetime_cfg")
    @NotUsableInJava
    public static class xfrm_lifetime_cfg
    extends Struct {
        public @Unsigned long soft_byte_limit;
        public @Unsigned long hard_byte_limit;
        public @Unsigned long soft_packet_limit;
        public @Unsigned long hard_packet_limit;
        public @Unsigned long soft_add_expires_seconds;
        public @Unsigned long hard_add_expires_seconds;
        public @Unsigned long soft_use_expires_seconds;
        public @Unsigned long hard_use_expires_seconds;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_selector")
    @NotUsableInJava
    public static class xfrm_selector
    extends Struct {
        public xfrm_address_t daddr;
        public xfrm_address_t saddr;
        public @Unsigned @OriginalName(value="__be16") short dport;
        public @Unsigned @OriginalName(value="__be16") short dport_mask;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public @Unsigned @OriginalName(value="__be16") short sport_mask;
        public @Unsigned short family;
        public char prefixlen_d;
        public char prefixlen_s;
        public char proto;
        public int ifindex;
        public @Unsigned @OriginalName(value="__kernel_uid32_t") int user;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_id")
    @NotUsableInJava
    public static class xfrm_id
    extends Struct {
        public xfrm_address_t daddr;
        public @Unsigned @OriginalName(value="__be32") int spi;
        public char proto;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int a4; unsigned int a6[4]; struct in6_addr in6; }")
    @NotUsableInJava
    public static class xfrm_address_t
    extends Union {
        public @Unsigned @OriginalName(value="__be32") int a4;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] a6;
        public In6Definitions.in6_addr in6;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_user_sec_ctx")
    @NotUsableInJava
    public static class xfrm_user_sec_ctx
    extends Struct {
        public @Unsigned short len;
        public @Unsigned short exttype;
        public char ctx_alg;
        public char ctx_doi;
        public @Unsigned short ctx_len;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_sec_ctx")
    @NotUsableInJava
    public static class xfrm_sec_ctx
    extends Struct {
        public char ctx_doi;
        public char ctx_alg;
        public @Unsigned short ctx_len;
        public @Unsigned int ctx_sid;
        public char @Size(value=0) [] ctx_str;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_policy_hthresh")
    @NotUsableInJava
    public static class xfrm_policy_hthresh
    extends Struct {
        public misc.work_struct work;
        public misc.seqlock_t lock;
        public char lbits4;
        public char rbits4;
        public char lbits6;
        public char rbits6;
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm_policy_hash")
    @NotUsableInJava
    public static class xfrm_policy_hash
    extends Struct {
        public Ptr<misc.hlist_head> table;
        public @Unsigned int hmask;
        public char dbits4;
        public char sbits4;
        public char dbits6;
        public char sbits6;
    }
}

