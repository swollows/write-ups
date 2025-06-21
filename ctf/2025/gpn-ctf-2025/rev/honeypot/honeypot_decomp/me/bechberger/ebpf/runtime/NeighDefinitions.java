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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NeighDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="___neigh_create($arg1, (const void*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<runtime.neighbour> ___neigh_create(Ptr<neigh_table> tbl, Ptr<?> pkey, Ptr<NetDefinitions.net_device> dev, @Unsigned int flags, boolean exempt_from_gc, boolean want_ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__neigh_create($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.neighbour> __neigh_create(Ptr<neigh_table> tbl, Ptr<?> pkey, Ptr<NetDefinitions.net_device> dev, boolean want_ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__neigh_event_send($arg1, $arg2, (const _Bool)$arg3)")
    public static int __neigh_event_send(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb, boolean immediate_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__neigh_for_each_release($arg1, (int (*)(struct neighbour*))$arg2)")
    public static void __neigh_for_each_release(Ptr<neigh_table> tbl, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __neigh_ifdown(Ptr<neigh_table> tbl, Ptr<NetDefinitions.net_device> dev, boolean skip_perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __neigh_notify(Ptr<runtime.neighbour> n, int type2, int flags, @Unsigned int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __neigh_set_probe_once(Ptr<runtime.neighbour> neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__neigh_update($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int __neigh_update(Ptr<runtime.neighbour> neigh, Ptr<Character> lladdr, char _new, @Unsigned int flags, @Unsigned int nlmsg_pid, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_add(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_add_timer(Ptr<runtime.neighbour> n, @Unsigned long when) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.neighbour> neigh_alloc(Ptr<neigh_table> tbl, Ptr<NetDefinitions.net_device> dev, @Unsigned int flags, boolean exempt_from_gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_app_ns(Ptr<runtime.neighbour> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_blackhole(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_carrier_down(Ptr<neigh_table> tbl, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_changeaddr(Ptr<neigh_table> tbl, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_cleanup_and_release(Ptr<runtime.neighbour> neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_connected_output(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_del_timer(Ptr<runtime.neighbour> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_delete(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_destroy(Ptr<runtime.neighbour> neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_direct_output(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_dump_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.neighbour> neigh_event_ns(Ptr<neigh_table> tbl, Ptr<Character> lladdr, Ptr<?> saddr, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_fill_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.neighbour> neigh, @Unsigned int pid2, @Unsigned int seq, int type2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_for_each($arg1, (void (*)(struct neighbour*, void*))$arg2, $arg3)")
    public static void neigh_for_each(Ptr<neigh_table> tbl, Ptr<?> cb, Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_get(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.neighbour> neigh_get_first(Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_ha_snapshot($arg1, (const struct neighbour*)$arg2, (const struct net_device*)$arg3)")
    public static void neigh_ha_snapshot(String dst, Ptr<runtime.neighbour> n, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<neigh_hash_table> neigh_hash_alloc(@Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_hash_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_hh_output((const struct hh_cache*)$arg1, $arg2)")
    public static int neigh_hh_output(Ptr<misc.hh_cache> hh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_ifdown(Ptr<neigh_table> tbl, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_invalidate(Ptr<runtime.neighbour> neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_lookup($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<runtime.neighbour> neigh_lookup(Ptr<neigh_table> tbl, Ptr<?> pkey, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_managed_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_mark_dead(Ptr<runtime.neighbour> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<neigh_parms> neigh_parms_alloc(Ptr<NetDefinitions.net_device> dev, Ptr<neigh_table> tbl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_parms_release(Ptr<neigh_table> tbl, Ptr<neigh_parms> parms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_periodic_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_probe(Ptr<runtime.neighbour> neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_base_reachable_time((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int neigh_proc_base_reachable_time(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_dointvec((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int neigh_proc_dointvec(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_dointvec_jiffies((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int neigh_proc_dointvec_jiffies(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_dointvec_ms_jiffies((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int neigh_proc_dointvec_ms_jiffies(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_dointvec_ms_jiffies_positive((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int neigh_proc_dointvec_ms_jiffies_positive(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_dointvec_unres_qlen((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int neigh_proc_dointvec_unres_qlen(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_dointvec_userhz_jiffies((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int neigh_proc_dointvec_userhz_jiffies(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_dointvec_zero_intmax((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int neigh_proc_dointvec_zero_intmax(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_proc_update((const struct ctl_table*)$arg1, $arg2)")
    public static void neigh_proc_update(Ptr<misc.ctl_table> ctl, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_proxy_process(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long neigh_rand_reach_time(@Unsigned long base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_rcu_free_parms(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_release(Ptr<runtime.neighbour> neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean neigh_remove_one(Ptr<runtime.neighbour> ndel, Ptr<neigh_table> tbl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_resolve_output(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> neigh_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> neigh_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos, Ptr<neigh_table> tbl, @Unsigned int neigh_seq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> neigh_stat_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_stat_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> neigh_stat_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_stat_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_sysctl_register(Ptr<NetDefinitions.net_device> dev, Ptr<neigh_parms> p, Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_sysctl_unregister(Ptr<neigh_parms> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int neigh_table_clear(int index2, Ptr<neigh_table> tbl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_table_init(int index2, Ptr<neigh_table> tbl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void neigh_timer_handler(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_update($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int neigh_update(Ptr<runtime.neighbour> neigh, Ptr<Character> lladdr, char _new, @Unsigned int flags, @Unsigned int nlmsg_pid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_valid_dump_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4)")
    public static int neigh_valid_dump_req(Ptr<runtime.nlmsghdr> nlh, boolean strict_check, Ptr<neigh_dump_filter> filter, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_valid_get_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int neigh_valid_get_req(Ptr<runtime.nlmsghdr> nlh, Ptr<Ptr<neigh_table>> tbl, Ptr<Ptr<?>> dst, Ptr<Integer> dev_idx, Ptr<Character> ndm_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="neigh_xmit($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int neigh_xmit(int index2, Ptr<NetDefinitions.net_device> dev, Ptr<?> addr2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct neigh_sysctl_table")
    @NotUsableInJava
    public static class neigh_sysctl_table
    extends Struct {
        public Ptr<misc.ctl_table_header> sysctl_header;
        public misc.ctl_table @Size(value=21) [] neigh_vars;
    }

    @Type(noCCodeGeneration=true, cType="struct neigh_dump_filter")
    @NotUsableInJava
    public static class neigh_dump_filter
    extends Struct {
        public int master_idx;
        public int dev_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct neigh_seq_state")
    @NotUsableInJava
    public static class neigh_seq_state
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public Ptr<neigh_table> tbl;
        public Ptr<neigh_hash_table> nht;
        public Ptr<?> neigh_sub_iter;
        public @Unsigned int bucket;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct neigh_hash_table")
    @NotUsableInJava
    public static class neigh_hash_table
    extends Struct {
        public Ptr<Ptr<runtime.neighbour>> hash_buckets;
        public @Unsigned int hash_shift;
        public @Unsigned int @Size(value=4) [] hash_rnd;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct neigh_ops")
    @NotUsableInJava
    public static class neigh_ops
    extends Struct {
        public int family;
        public Ptr<?> solicit;
        public Ptr<?> error_report;
        public Ptr<?> output;
        public Ptr<?> connected_output;
    }

    @Type(noCCodeGeneration=true, cType="struct neigh_statistics")
    @NotUsableInJava
    public static class neigh_statistics
    extends Struct {
        public @Unsigned long allocs;
        public @Unsigned long destroys;
        public @Unsigned long hash_grows;
        public @Unsigned long res_failed;
        public @Unsigned long lookups;
        public @Unsigned long hits;
        public @Unsigned long rcv_probes_mcast;
        public @Unsigned long rcv_probes_ucast;
        public @Unsigned long periodic_gc_runs;
        public @Unsigned long forced_gc_runs;
        public @Unsigned long unres_discards;
        public @Unsigned long table_fulls;
    }

    @Type(noCCodeGeneration=true, cType="struct neigh_table")
    @NotUsableInJava
    public static class neigh_table
    extends Struct {
        public int family;
        public @Unsigned int entry_size;
        public @Unsigned int key_len;
        public @Unsigned @OriginalName(value="__be16") short protocol;
        public Ptr<?> hash;
        public Ptr<?> key_eq;
        public Ptr<?> constructor;
        public Ptr<?> pconstructor;
        public Ptr<?> pdestructor;
        public Ptr<?> proxy_redo;
        public Ptr<?> is_multicast;
        public Ptr<?> allow_add;
        public String id;
        public neigh_parms parms;
        public ListDefinitions.list_head parms_list;
        public int gc_interval;
        public int gc_thresh1;
        public int gc_thresh2;
        public int gc_thresh3;
        public @Unsigned long last_flush;
        public DelayedDefinitions.delayed_work gc_work;
        public DelayedDefinitions.delayed_work managed_work;
        public TimerDefinitions.timer_list proxy_timer;
        public SkDefinitions.sk_buff_head proxy_queue;
        public AtomicDefinitions.atomic_t entries;
        public AtomicDefinitions.atomic_t gc_entries;
        public ListDefinitions.list_head gc_list;
        public ListDefinitions.list_head managed_list;
        public misc.rwlock_t lock;
        public @Unsigned long last_rand;
        public Ptr<neigh_statistics> stats;
        public Ptr<neigh_hash_table> nht;
        public Ptr<Ptr<misc.pneigh_entry>> phash_buckets;
    }

    @Type(noCCodeGeneration=true, cType="struct neigh_parms")
    @NotUsableInJava
    public static class neigh_parms
    extends Struct {
        public misc.possible_net_t net;
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public ListDefinitions.list_head list;
        public Ptr<?> neigh_setup;
        public Ptr<neigh_table> tbl;
        public Ptr<?> sysctl_table;
        public int dead;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public misc.callback_head callback_head;
        public int reachable_time;
        public @Unsigned int qlen;
        public int @Size(value=14) [] data;
        public @Unsigned long @Size(value=1) [] data_state;
    }
}

