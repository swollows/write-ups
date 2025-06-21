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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PercpuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __percpu_counter_compare(Ptr<percpu_counter> fbc, long rhs, int batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __percpu_counter_init_many(Ptr<percpu_counter> fbc, long amount, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned int nr_counters, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __percpu_counter_limited_add(Ptr<percpu_counter> fbc, long limit, long amount, int batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __percpu_counter_sum(Ptr<percpu_counter> fbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_counter_add_batch(Ptr<percpu_counter> fbc, long amount, int batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int percpu_counter_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_counter_destroy_many(Ptr<percpu_counter> fbc, @Unsigned int nr_counters) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_counter_set(Ptr<percpu_counter> fbc, long amount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int percpu_counter_startup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_counter_sync(Ptr<percpu_counter> fbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_get_many(Ptr<percpu_ref> ref, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_put_many(Ptr<percpu_ref> ref, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __percpu_down_read(Ptr<percpu_rw_semaphore> sem2, boolean _try) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__percpu_init_rwsem($arg1, (const u8*)$arg2, $arg3)")
    public static int __percpu_init_rwsem(Ptr<percpu_rw_semaphore> sem2, String name, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __percpu_rwsem_trylock(Ptr<percpu_rw_semaphore> sem2, boolean reader) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_down_write(Ptr<percpu_rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_free_defer_callback(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_free_rwsem(Ptr<percpu_rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean percpu_is_read_locked(Ptr<percpu_rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_rwsem_wait(Ptr<percpu_rw_semaphore> sem2, boolean reader) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int percpu_rwsem_wake_function(Ptr<WaitDefinitions.wait_queue_entry> wq_entry, @Unsigned int mode, int wake_flags, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_up_write(Ptr<percpu_rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int percpu_alloc_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int percpu_enable_async() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_setup_exception_stacks(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __percpu_ref_switch_mode(Ptr<percpu_ref> ref, Ptr<?> confirm_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int percpu_array_map_gen_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> percpu_array_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> percpu_array_map_lookup_percpu_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_array_map_seq_show_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="percpu_pagelist_high_fraction_sysctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int percpu_pagelist_high_fraction_sysctl_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_exit(Ptr<percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int percpu_ref_init(Ptr<percpu_ref> ref, Ptr<?> release, @Unsigned int flags, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean percpu_ref_is_zero(Ptr<percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_kill_and_confirm(Ptr<percpu_ref> ref, Ptr<?> confirm_kill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_noop_confirm_switch(Ptr<percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_reinit(Ptr<percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_resurrect(Ptr<percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_switch_to_atomic(Ptr<percpu_ref> ref, Ptr<?> confirm_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_switch_to_atomic_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_switch_to_atomic_sync(Ptr<percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void percpu_ref_switch_to_percpu(Ptr<percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct percpu_free_defer")
    @NotUsableInJava
    public static class percpu_free_defer
    extends Struct {
        public misc.callback_head rcu;
        public Ptr<?> ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct percpu_cluster")
    @NotUsableInJava
    public static class percpu_cluster
    extends Struct {
        public @Unsigned int @Size(value=10) [] next;
    }

    @Type(noCCodeGeneration=true, cType="struct percpu_ref_data")
    @NotUsableInJava
    public static class percpu_ref_data
    extends Struct {
        public  @OriginalName(value="atomic_long_t") misc.atomic64_t count;
        public Ptr<?> release;
        public Ptr<?> confirm_switch;
        public boolean force_atomic;
        public boolean allow_reinit;
        public misc.callback_head rcu;
        public Ptr<percpu_ref> ref;
    }

    @Type(noCCodeGeneration=true, cType="struct percpu_ref")
    @NotUsableInJava
    public static class percpu_ref
    extends Struct {
        public @Unsigned long percpu_count_ptr;
        public Ptr<percpu_ref_data> data;
    }

    @Type(noCCodeGeneration=true, cType="struct percpu_rw_semaphore")
    @NotUsableInJava
    public static class percpu_rw_semaphore
    extends Struct {
        public RcuDefinitions.rcu_sync rss;
        public Ptr<@Unsigned Integer> read_count;
        public runtime.rcuwait writer;
        public  @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waiters;
        public AtomicDefinitions.atomic_t block;
    }

    @Type(noCCodeGeneration=true, cType="struct percpu_counter")
    @NotUsableInJava
    public static class percpu_counter
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public long count;
        public ListDefinitions.list_head list;
        public Ptr<Integer> counters;
    }
}

