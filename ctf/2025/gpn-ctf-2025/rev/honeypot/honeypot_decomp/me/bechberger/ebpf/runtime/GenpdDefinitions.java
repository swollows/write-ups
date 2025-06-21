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
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GenericDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class GenpdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __genpd_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _genpd_power_off(Ptr<GenericDefinitions.generic_pm_domain> genpd, boolean timed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _genpd_power_on(Ptr<GenericDefinitions.generic_pm_domain> genpd, boolean timed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _genpd_rollback_parent_state(Ptr<misc.gpd_link> link2, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _genpd_set_parent_state(Ptr<GenericDefinitions.generic_pm_domain> genpd, Ptr<misc.gpd_link> link2, @Unsigned int state2, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _genpd_set_performance_state(Ptr<GenericDefinitions.generic_pm_domain> genpd, @Unsigned int state2, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_add_device(Ptr<GenericDefinitions.generic_pm_domain> genpd, Ptr<runtime.device> dev, Ptr<runtime.device> base_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_add_subdomain(Ptr<GenericDefinitions.generic_pm_domain> genpd, Ptr<GenericDefinitions.generic_pm_domain> subdomain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_complete(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_debug_add(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_debug_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_debug_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_dev_pm_qos_notifier(Ptr<misc.notifier_block> nb, @Unsigned long val, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_dev_pm_set_performance_state(Ptr<runtime.device> dev, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_dev_pm_start(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genpd_finish_resume($arg1, (int (*)(struct device*))$arg2)")
    public static int genpd_finish_resume(Ptr<runtime.device> dev, Ptr<?> resume_noirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genpd_finish_suspend($arg1, (int (*)(struct device*))$arg2, (int (*)(struct device*))$arg3)")
    public static int genpd_finish_suspend(Ptr<runtime.device> dev, Ptr<?> suspend_noirq, Ptr<?> resume_noirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_free_default_power_state(Ptr<genpd_power_state> states, @Unsigned int state_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_freeze_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_lock_interruptible_mtx(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_lock_interruptible_raw_spin(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_lock_interruptible_spin(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_lock_mtx(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_lock_nested_mtx(Ptr<GenericDefinitions.generic_pm_domain> genpd, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_lock_nested_raw_spin(Ptr<GenericDefinitions.generic_pm_domain> genpd, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_lock_nested_spin(Ptr<GenericDefinitions.generic_pm_domain> genpd, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_lock_raw_spin(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_lock_spin(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_power_off(Ptr<GenericDefinitions.generic_pm_domain> genpd, boolean one_dev_on, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_power_off_unused() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_power_off_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_power_on(Ptr<GenericDefinitions.generic_pm_domain> genpd, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_poweroff_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_prepare(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_remove(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_remove_device(Ptr<GenericDefinitions.generic_pm_domain> genpd, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_restore_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_summary_one(Ptr<SeqDefinitions.seq_file> s2, Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_suspend_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_switch_state(Ptr<runtime.device> dev, boolean suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_sync_power_off(Ptr<GenericDefinitions.generic_pm_domain> genpd, boolean use_lock, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_sync_power_on(Ptr<GenericDefinitions.generic_pm_domain> genpd, boolean use_lock, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genpd_thaw_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_unlock_mtx(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_unlock_raw_spin(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_unlock_spin(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_update_accounting(Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genpd_update_cpumask(Ptr<GenericDefinitions.generic_pm_domain> genpd, int cpu2, boolean set, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum genpd_notication")
    public static enum genpd_notication implements Enum<genpd_notication>,
    TypedEnum<genpd_notication, Integer>
    {
        GENPD_NOTIFY_PRE_OFF,
        GENPD_NOTIFY_OFF,
        GENPD_NOTIFY_PRE_ON,
        GENPD_NOTIFY_ON;

    }

    @Type(noCCodeGeneration=true, cType="struct genpd_lock_ops")
    @NotUsableInJava
    public static class genpd_lock_ops
    extends Struct {
        public Ptr<?> lock;
        public Ptr<?> lock_nested;
        public Ptr<?> lock_interruptible;
        public Ptr<?> unlock;
    }

    @Type(noCCodeGeneration=true, cType="struct genpd_power_state")
    @NotUsableInJava
    public static class genpd_power_state
    extends Struct {
        public long power_off_latency_ns;
        public long power_on_latency_ns;
        public long residency_ns;
        public @Unsigned long usage;
        public @Unsigned long rejected;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public @Unsigned long idle_time;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct genpd_governor_data")
    @NotUsableInJava
    public static class genpd_governor_data
    extends Struct {
        public long max_off_time_ns;
        public boolean max_off_time_changed;
        public @OriginalName(value="ktime_t") long next_wakeup;
        public @OriginalName(value="ktime_t") long next_hrtimer;
        public boolean cached_power_down_ok;
        public boolean cached_power_down_state_idx;
    }
}

