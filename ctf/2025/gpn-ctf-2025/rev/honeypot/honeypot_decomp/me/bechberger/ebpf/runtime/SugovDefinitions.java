/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UpdateDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SugovDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_clear_global_tunables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sugov_effective_cpu_perf(int cpu2, @Unsigned long actual, @Unsigned long min, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_exit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_get_util(Ptr<sugov_cpu> sg_cpu, @Unsigned long boost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sugov_hold_freq(Ptr<sugov_cpu> sg_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sugov_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sugov_iowait_apply(Ptr<sugov_cpu> sg_cpu, @Unsigned long time, @Unsigned long max_cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_iowait_boost(Ptr<sugov_cpu> sg_cpu, @Unsigned long time, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_irq_work(Ptr<IrqDefinitions.irq_work> irq_work2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sugov_kthread_create(Ptr<sugov_policy> sg_policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_limits(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sugov_start(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_stop(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_tunables_free(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_update_shared(Ptr<UpdateDefinitions.update_util_data> hook, @Unsigned long time, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_update_single_freq(Ptr<UpdateDefinitions.update_util_data> hook, @Unsigned long time, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_update_single_perf(Ptr<UpdateDefinitions.update_util_data> hook, @Unsigned long time, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sugov_work(Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sugov_cpu")
    @NotUsableInJava
    public static class sugov_cpu
    extends Struct {
        public UpdateDefinitions.update_util_data update_util;
        public Ptr<sugov_policy> sg_policy;
        public @Unsigned int cpu;
        public boolean iowait_boost_pending;
        public @Unsigned int iowait_boost;
        public @Unsigned long last_update;
        public @Unsigned long util;
        public @Unsigned long bw_min;
        public @Unsigned long saved_idle_calls;
    }

    @Type(noCCodeGeneration=true, cType="struct sugov_policy")
    @NotUsableInJava
    public static class sugov_policy
    extends Struct {
        public Ptr<CpufreqDefinitions.cpufreq_policy> policy;
        public Ptr<sugov_tunables> tunables;
        public ListDefinitions.list_head tunables_hook;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock update_lock;
        public @Unsigned long last_freq_update_time;
        public long freq_update_delay_ns;
        public @Unsigned int next_freq;
        public @Unsigned int cached_raw_freq;
        public IrqDefinitions.irq_work irq_work;
        public KthreadDefinitions.kthread_work work;
        public runtime.mutex work_lock;
        public KthreadDefinitions.kthread_worker worker;
        public Ptr<TaskDefinitions.task_struct> thread;
        public boolean work_in_progress;
        public boolean limits_changed;
        public boolean need_freq_update;
    }

    @Type(noCCodeGeneration=true, cType="struct sugov_tunables")
    @NotUsableInJava
    public static class sugov_tunables
    extends Struct {
        public misc.gov_attr_set attr_set;
        public @Unsigned int rate_limit_us;
    }
}

