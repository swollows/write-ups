/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class ClockeventsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clockevents_switch_state(Ptr<misc.clock_event_device> dev, misc.clock_event_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __clockevents_unbind(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __clockevents_update_freq(Ptr<misc.clock_event_device> dev, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_config(Ptr<misc.clock_event_device> dev, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_config_and_register(Ptr<misc.clock_event_device> dev, @Unsigned int freq, @Unsigned long min_delta, @Unsigned long max_delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_exchange_device(Ptr<misc.clock_event_device> old, Ptr<misc.clock_event_device> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_handle_noop(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clockevents_init_sysfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clockevents_program_event(Ptr<misc.clock_event_device> dev, @OriginalName(value="ktime_t") long expires, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clockevents_program_min_delta(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_register_device(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_shutdown(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clockevents_switch_state(Ptr<misc.clock_event_device> dev, misc.clock_event_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clockevents_tick_resume(Ptr<misc.clock_event_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clockevents_unbind_device(Ptr<misc.clock_event_device> ced, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clockevents_update_freq(Ptr<misc.clock_event_device> dev, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }
}

