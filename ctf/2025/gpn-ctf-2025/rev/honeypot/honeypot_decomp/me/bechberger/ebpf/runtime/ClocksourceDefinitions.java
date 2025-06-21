/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ClocksourceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clocksource_register_scale(Ptr<runtime.clocksource> cs, @Unsigned int scale, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clocksource_select(boolean skipcur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clocksource_unstable(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clocksource_update_freq_scale(Ptr<runtime.clocksource> cs, @Unsigned int scale, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clocksource_watchdog_kthread() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_arch_init(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_change_rating(Ptr<runtime.clocksource> cs, int rating) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clocksource_done_booting() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_mark_unstable(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_select_watchdog(boolean fallback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_start_suspend_timing(Ptr<runtime.clocksource> cs, @Unsigned long start_cycles) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clocksource_stop_suspend_timing(Ptr<runtime.clocksource> cs, @Unsigned long cycle_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_suspend_select(boolean fallback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_touch_watchdog() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clocksource_unbind(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clocksource_unregister(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_verify_choose_cpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_verify_one_cpu(Ptr<?> csin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_verify_percpu(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_watchdog(Ptr<TimerDefinitions.timer_list> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clocksource_watchdog_kthread(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clocksource_watchdog_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.clocksource> clocksource_default_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct clocksource_base")
    @NotUsableInJava
    public static class clocksource_base
    extends Struct {
        public clocksource_ids id;
        public @Unsigned int freq_khz;
        public @Unsigned long offset;
        public @Unsigned int numerator;
        public @Unsigned int denominator;
    }

    @Type(noCCodeGeneration=true, cType="enum clocksource_ids")
    public static enum clocksource_ids implements Enum<clocksource_ids>,
    TypedEnum<clocksource_ids, Integer>
    {
        CSID_GENERIC,
        CSID_ARM_ARCH_COUNTER,
        CSID_X86_TSC_EARLY,
        CSID_X86_TSC,
        CSID_X86_KVM_CLK,
        CSID_X86_ART,
        CSID_MAX;

    }
}

