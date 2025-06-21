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
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HrtimerDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long __hrtimer_get_next_event(Ptr<hrtimer_cpu_base> cpu_base, @Unsigned int active_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hrtimer_get_remaining((const struct hrtimer*)$arg1, $arg2)")
    public static @OriginalName(value="ktime_t") long __hrtimer_get_remaining(Ptr<runtime.hrtimer> timer, boolean adjust) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hrtimer_init(Ptr<runtime.hrtimer> timer, @OriginalName(value="clockid_t") int clock_id, hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hrtimer_next_event_base($arg1, (const struct hrtimer*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ktime_t") long __hrtimer_next_event_base(Ptr<hrtimer_cpu_base> cpu_base, Ptr<runtime.hrtimer> exclude, @Unsigned int active, @OriginalName(value="ktime_t") long expires_next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hrtimer_run_queues(Ptr<hrtimer_cpu_base> cpu_base, @OriginalName(value="ktime_t") long now, @Unsigned long flags, @Unsigned int active_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hrtimer_start_range_ns($arg1, $arg2, $arg3, (const enum hrtimer_mode)$arg4, $arg5)")
    public static int __hrtimer_start_range_ns(Ptr<runtime.hrtimer> timer, @OriginalName(value="ktime_t") long tim, @Unsigned long delta_ns, hrtimer_mode mode, Ptr<hrtimer_clock_base> base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hrtimer_active((const struct hrtimer*)$arg1)")
    public static boolean hrtimer_active(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hrtimer_cancel(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hrtimer_forward(Ptr<runtime.hrtimer> timer, @OriginalName(value="ktime_t") long now, @OriginalName(value="ktime_t") long interval2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hrtimer_get_next_event() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hrtimer_init(Ptr<runtime.hrtimer> timer, @OriginalName(value="clockid_t") int clock_id, hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hrtimer_init_sleeper(Ptr<hrtimer_sleeper> sl, @OriginalName(value="clockid_t") int clock_id, hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hrtimer_interrupt(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hrtimer_nanosleep($arg1, (const enum hrtimer_mode)$arg2, (const int)$arg3)")
    public static long hrtimer_nanosleep(@OriginalName(value="ktime_t") long rqtp, hrtimer_mode mode, @OriginalName(value="clockid_t") int clockid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long hrtimer_nanosleep_restart(Ptr<misc.restart_block> restart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hrtimer_next_event_without((const struct hrtimer*)$arg1)")
    public static @Unsigned long hrtimer_next_event_without(Ptr<runtime.hrtimer> exclude) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hrtimer_reprogram(Ptr<runtime.hrtimer> timer, boolean reprogram) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hrtimer_run_queues() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hrtimer_run_softirq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hrtimer_sleeper_start_expires(Ptr<hrtimer_sleeper> sl, hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hrtimer_start_range_ns($arg1, $arg2, $arg3, (const enum hrtimer_mode)$arg4)")
    public static void hrtimer_start_range_ns(Ptr<runtime.hrtimer> timer, @OriginalName(value="ktime_t") long tim, @Unsigned long delta_ns, hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hrtimer_try_to_cancel(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long hrtimer_update_next_event(Ptr<hrtimer_cpu_base> cpu_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static hrtimer_restart hrtimer_wakeup(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hrtimer_sleeper")
    @NotUsableInJava
    public static class hrtimer_sleeper
    extends Struct {
        public runtime.hrtimer timer;
        public Ptr<TaskDefinitions.task_struct> task;
    }

    @Type(noCCodeGeneration=true, cType="enum hrtimer_mode")
    public static enum hrtimer_mode implements Enum<hrtimer_mode>,
    TypedEnum<hrtimer_mode, Integer>
    {
        HRTIMER_MODE_ABS,
        HRTIMER_MODE_REL,
        HRTIMER_MODE_PINNED,
        HRTIMER_MODE_SOFT,
        HRTIMER_MODE_HARD,
        HRTIMER_MODE_ABS_PINNED,
        HRTIMER_MODE_REL_PINNED,
        HRTIMER_MODE_ABS_SOFT,
        HRTIMER_MODE_REL_SOFT,
        HRTIMER_MODE_ABS_PINNED_SOFT,
        HRTIMER_MODE_REL_PINNED_SOFT,
        HRTIMER_MODE_ABS_HARD,
        HRTIMER_MODE_REL_HARD,
        HRTIMER_MODE_ABS_PINNED_HARD,
        HRTIMER_MODE_REL_PINNED_HARD;

    }

    @Type(noCCodeGeneration=true, cType="enum hrtimer_base_type")
    public static enum hrtimer_base_type implements Enum<hrtimer_base_type>,
    TypedEnum<hrtimer_base_type, Integer>
    {
        HRTIMER_BASE_MONOTONIC,
        HRTIMER_BASE_REALTIME,
        HRTIMER_BASE_BOOTTIME,
        HRTIMER_BASE_TAI,
        HRTIMER_BASE_MONOTONIC_SOFT,
        HRTIMER_BASE_REALTIME_SOFT,
        HRTIMER_BASE_BOOTTIME_SOFT,
        HRTIMER_BASE_TAI_SOFT,
        HRTIMER_MAX_CLOCK_BASES;

    }

    @Type(noCCodeGeneration=true, cType="struct hrtimer_cpu_base")
    @NotUsableInJava
    public static class hrtimer_cpu_base
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned int cpu;
        public @Unsigned int active_bases;
        public @Unsigned int clock_was_set_seq;
        public @Unsigned int hres_active;
        public @Unsigned int in_hrtirq;
        public @Unsigned int hang_detected;
        public @Unsigned int softirq_activated;
        public @Unsigned int online;
        public @Unsigned int nr_events;
        public @Unsigned short nr_retries;
        public @Unsigned short nr_hangs;
        public @Unsigned int max_hang_time;
        public @OriginalName(value="ktime_t") long expires_next;
        public Ptr<runtime.hrtimer> next_timer;
        public @OriginalName(value="ktime_t") long softirq_expires_next;
        public Ptr<runtime.hrtimer> softirq_next_timer;
        public hrtimer_clock_base @Size(value=8) [] clock_base;
    }

    @Type(noCCodeGeneration=true, cType="struct hrtimer_clock_base")
    @NotUsableInJava
    public static class hrtimer_clock_base
    extends Struct {
        public Ptr<hrtimer_cpu_base> cpu_base;
        public @Unsigned int index;
        public @OriginalName(value="clockid_t") int clockid;
        public @OriginalName(value="seqcount_raw_spinlock_t") misc.seqcount_raw_spinlock seq;
        public Ptr<runtime.hrtimer> running;
        public misc.timerqueue_head active;
        public Ptr<?> get_time;
        public @OriginalName(value="ktime_t") long offset;
    }

    @Type(noCCodeGeneration=true, cType="enum hrtimer_restart")
    public static enum hrtimer_restart implements Enum<hrtimer_restart>,
    TypedEnum<hrtimer_restart, Integer>
    {
        HRTIMER_NORESTART,
        HRTIMER_RESTART;

    }
}

