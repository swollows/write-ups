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
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SrcuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __srcu_read_lock(Ptr<srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __srcu_read_unlock(Ptr<srcu_struct> ssp, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_advance_state(Ptr<srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_barrier(Ptr<srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_barrier_cb(Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_barrier_one_cpu(Ptr<srcu_struct> ssp, Ptr<srcu_data> sdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long srcu_batches_completed(Ptr<srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int srcu_bootup_announce() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_delay_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_funnel_exp_start(Ptr<srcu_struct> ssp, Ptr<srcu_node> snp, @Unsigned long s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_funnel_gp_start(Ptr<srcu_struct> ssp, Ptr<srcu_data> sdp, @Unsigned long s2, boolean do_norm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long srcu_get_delay(Ptr<srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_gp_end(Ptr<srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_gp_start(Ptr<srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long srcu_gp_start_if_needed(Ptr<srcu_struct> ssp, Ptr<misc.callback_head> rhp, boolean do_norm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_invoke_callbacks(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int srcu_module_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean srcu_readers_active(Ptr<srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_reschedule(Ptr<srcu_struct> ssp, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_torture_stats_print(Ptr<srcu_struct> ssp, String tt, String tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_free_old_probes(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void srcu_init_notifier_head(Ptr<srcu_notifier_head> nh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int srcu_notifier_call_chain(Ptr<srcu_notifier_head> nh, @Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int srcu_notifier_chain_register(Ptr<srcu_notifier_head> nh, Ptr<misc.notifier_block> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int srcu_notifier_chain_unregister(Ptr<srcu_notifier_head> nh, Ptr<misc.notifier_block> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct srcu_notifier_head")
    @NotUsableInJava
    public static class srcu_notifier_head
    extends Struct {
        public runtime.mutex mutex;
        public srcu_usage srcuu;
        public srcu_struct srcu;
        public Ptr<misc.notifier_block> head;
    }

    @Type(noCCodeGeneration=true, cType="struct srcu_usage")
    @NotUsableInJava
    public static class srcu_usage
    extends Struct {
        public Ptr<srcu_node> node;
        public Ptr<srcu_node> @Size(value=4) [] level;
        public int srcu_size_state;
        public runtime.mutex srcu_cb_mutex;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public runtime.mutex srcu_gp_mutex;
        public @Unsigned long srcu_gp_seq;
        public @Unsigned long srcu_gp_seq_needed;
        public @Unsigned long srcu_gp_seq_needed_exp;
        public @Unsigned long srcu_gp_start;
        public @Unsigned long srcu_last_gp_end;
        public @Unsigned long srcu_size_jiffies;
        public @Unsigned long srcu_n_lock_retries;
        public @Unsigned long srcu_n_exp_nodelay;
        public boolean sda_is_static;
        public @Unsigned long srcu_barrier_seq;
        public runtime.mutex srcu_barrier_mutex;
        public runtime.completion srcu_barrier_completion;
        public AtomicDefinitions.atomic_t srcu_barrier_cpu_cnt;
        public @Unsigned long reschedule_jiffies;
        public @Unsigned long reschedule_count;
        public DelayedDefinitions.delayed_work work;
        public Ptr<srcu_struct> srcu_ssp;
    }

    @Type(noCCodeGeneration=true, cType="struct srcu_struct")
    @NotUsableInJava
    public static class srcu_struct
    extends Struct {
        public @Unsigned int srcu_idx;
        public Ptr<srcu_data> sda;
        public misc.lockdep_map dep_map;
        public Ptr<srcu_usage> srcu_sup;
    }

    @Type(noCCodeGeneration=true, cType="struct srcu_node")
    @NotUsableInJava
    public static class srcu_node
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned long @Size(value=4) [] srcu_have_cbs;
        public @Unsigned long @Size(value=4) [] srcu_data_have_cbs;
        public @Unsigned long srcu_gp_seq_needed_exp;
        public Ptr<srcu_node> srcu_parent;
        public int grplo;
        public int grphi;
    }

    @Type(noCCodeGeneration=true, cType="struct srcu_data")
    @NotUsableInJava
    public static class srcu_data
    extends Struct {
        public @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=2) [] srcu_lock_count;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=2) [] srcu_unlock_count;
        public int srcu_nmi_safety;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public RcuDefinitions.rcu_segcblist srcu_cblist;
        public @Unsigned long srcu_gp_seq_needed;
        public @Unsigned long srcu_gp_seq_needed_exp;
        public boolean srcu_cblist_invoking;
        public TimerDefinitions.timer_list delay_work;
        public misc.work_struct work;
        public misc.callback_head srcu_barrier_head;
        public Ptr<srcu_node> mynode;
        public @Unsigned long grpmask;
        public int cpu;
        public Ptr<srcu_struct> ssp;
    }
}

