/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.KfreeDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class ScheduleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean schedule_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long schedule_timeout(long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long schedule_timeout_idle(long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long schedule_timeout_interruptible(long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long schedule_timeout_killable(long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long schedule_timeout_uninterruptible(long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __schedule_bug(Ptr<TaskDefinitions.task_struct> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __schedule_delayed_monitor_work(Ptr<KfreeDefinitions.kfree_rcu_cpu> krcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void schedule_console_callback() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void schedule_debug(Ptr<TaskDefinitions.task_struct> prev, boolean preempt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void schedule_delayed_monitor_work(Ptr<KfreeDefinitions.kfree_rcu_cpu> krcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="schedule_hrtimeout($arg1, (const enum hrtimer_mode)$arg2)")
    public static int schedule_hrtimeout(Ptr<@OriginalName(value="ktime_t") Long> expires, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="schedule_hrtimeout_range($arg1, $arg2, (const enum hrtimer_mode)$arg3)")
    public static int schedule_hrtimeout_range(Ptr<@OriginalName(value="ktime_t") Long> expires, @Unsigned long delta, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="schedule_hrtimeout_range_clock($arg1, $arg2, (const enum hrtimer_mode)$arg3, $arg4)")
    public static int schedule_hrtimeout_range_clock(Ptr<@OriginalName(value="ktime_t") Long> expires, @Unsigned long delta, HrtimerDefinitions.hrtimer_mode mode, @OriginalName(value="clockid_t") int clock_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void schedule_idle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart schedule_page_work_fn(Ptr<runtime.hrtimer> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void schedule_preempt_disabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void schedule_tail(Ptr<TaskDefinitions.task_struct> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int schedule_on_each_cpu(@OriginalName(value="work_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }
}

