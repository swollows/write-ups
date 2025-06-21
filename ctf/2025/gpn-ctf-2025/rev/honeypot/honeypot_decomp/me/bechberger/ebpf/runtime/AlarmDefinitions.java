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
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AlarmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alarm_cancel(Ptr<runtime.alarm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long alarm_clock_get_ktime(@OriginalName(value="clockid_t") int which_clock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alarm_clock_get_timespec(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alarm_clock_getres((const int)$arg1, $arg2)")
    public static int alarm_clock_getres(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alarm_expires_remaining((const struct alarm*)$arg1)")
    public static @OriginalName(value="ktime_t") long alarm_expires_remaining(Ptr<runtime.alarm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long alarm_forward(Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long now, @OriginalName(value="ktime_t") long interval2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long alarm_forward_now(Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long interval2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.alarmtimer_restart alarm_handle_timer(Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alarm_init($arg1, $arg2, (enum alarmtimer_restart (*)(struct alarm*, long long int))$arg3)")
    public static void alarm_init(Ptr<runtime.alarm> alarm2, misc.alarmtimer_type type2, Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alarm_restart(Ptr<runtime.alarm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alarm_start(Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alarm_start_relative(Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alarm_timer_arm(Ptr<KDefinitions.k_itimer> timr, @OriginalName(value="ktime_t") long expires, boolean absolute, boolean sigev_none) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alarm_timer_create(Ptr<KDefinitions.k_itimer> new_timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long alarm_timer_forward(Ptr<KDefinitions.k_itimer> timr, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alarm_timer_nsleep((const int)$arg1, $arg2, (const struct timespec64*)$arg3)")
    public static int alarm_timer_nsleep(@OriginalName(value="clockid_t") int which_clock, int flags, Ptr<runtime.timespec64> tsreq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long alarm_timer_nsleep_restart(Ptr<misc.restart_block> restart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alarm_timer_rearm(Ptr<KDefinitions.k_itimer> timr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long alarm_timer_remaining(Ptr<KDefinitions.k_itimer> timr, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alarm_timer_try_to_cancel(Ptr<KDefinitions.k_itimer> timr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alarm_timer_wait_running(Ptr<KDefinitions.k_itimer> timr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alarm_try_to_cancel(Ptr<runtime.alarm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct alarm_base")
    @NotUsableInJava
    public static class alarm_base
    extends Struct {
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.timerqueue_head timerqueue;
        public Ptr<?> get_ktime;
        public Ptr<?> get_timespec;
        public @OriginalName(value="clockid_t") int base_clockid;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct alarm alarmtimer; }")
    @NotUsableInJava
    public static class alarm_of_it_of_k_itimer
    extends Struct {
        public runtime.alarm alarmtimer;
    }
}

