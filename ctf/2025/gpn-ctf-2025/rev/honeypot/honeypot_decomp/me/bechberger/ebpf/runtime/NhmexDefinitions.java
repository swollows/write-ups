/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class NhmexDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nhmex_bbox_hw_config(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_bbox_msr_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long nhmex_mbox_alter_er(Ptr<PerfDefinitions.perf_event> event2, int new_idx, boolean modify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> nhmex_mbox_get_constraint(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nhmex_mbox_get_shared_reg(Ptr<IntelDefinitions.intel_uncore_box> box, int idx, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nhmex_mbox_hw_config(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_mbox_msr_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_mbox_put_constraint(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_mbox_put_shared_reg(Ptr<IntelDefinitions.intel_uncore_box> box, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> nhmex_rbox_get_constraint(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nhmex_rbox_hw_config(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_rbox_msr_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_rbox_put_constraint(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nhmex_sbox_hw_config(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_sbox_msr_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_uncore_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_uncore_msr_disable_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_uncore_msr_disable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_uncore_msr_enable_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_uncore_msr_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_uncore_msr_exit_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nhmex_uncore_msr_init_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }
}

