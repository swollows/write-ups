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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.WqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class WorkqueueDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="workqueue_apply_unbound_cpumask((const struct cpumask*)$arg1)")
    public static int workqueue_apply_unbound_cpumask(@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> unbound_cpumask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean workqueue_congested(int cpu2, Ptr<workqueue_struct> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void workqueue_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void workqueue_init_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void workqueue_init_topology() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int workqueue_offline_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int workqueue_online_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int workqueue_prepare_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void workqueue_set_max_active(Ptr<workqueue_struct> wq, int max_active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void workqueue_set_min_active(Ptr<workqueue_struct> wq, int min_active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int workqueue_set_unbound_cpumask(@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void workqueue_softirq_action(boolean highpri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void workqueue_softirq_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int workqueue_sysfs_register(Ptr<workqueue_struct> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int workqueue_unbound_cpus_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int workqueue_unbound_exclude_cpumask(@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> exclude_cpumask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct workqueue_attrs")
    @NotUsableInJava
    public static class workqueue_attrs
    extends Struct {
        public int nice;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpumask;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> __pod_cpumask;
        public boolean affn_strict;
        public WqDefinitions.wq_affn_scope affn_scope;
        public boolean ordered;
    }

    @Type(noCCodeGeneration=true, cType="struct workqueue_struct")
    @NotUsableInJava
    public static class workqueue_struct
    extends Struct {
        public ListDefinitions.list_head pwqs;
        public ListDefinitions.list_head list;
        public runtime.mutex mutex;
        public int work_color;
        public int flush_color;
        public AtomicDefinitions.atomic_t nr_pwqs_to_flush;
        public Ptr<WqDefinitions.wq_flusher> first_flusher;
        public ListDefinitions.list_head flusher_queue;
        public ListDefinitions.list_head flusher_overflow;
        public ListDefinitions.list_head maydays;
        public Ptr<runtime.worker> rescuer;
        public int nr_drainers;
        public int max_active;
        public int min_active;
        public int saved_max_active;
        public int saved_min_active;
        public Ptr<workqueue_attrs> unbound_attrs;
        public Ptr<misc.pool_workqueue> dfl_pwq;
        public Ptr<WqDefinitions.wq_device> wq_dev;
        public char @Size(value=32) [] name;
        public misc.callback_head rcu;
        public @Unsigned int flags;
        public Ptr<Ptr<misc.pool_workqueue>> cpu_pwq;
        public Ptr<WqDefinitions.wq_node_nr_active> @Size(value=0) [] node_nr_active;
    }
}

