/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.HybridDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class AdlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> adl_get_event_constraints(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HybridDefinitions.hybrid_cpu_type adl_get_hybrid_cpu_type() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adl_hw_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_imc_freerunning_init_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_imc_init_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_mmio_disable_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_mmio_enable_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_mmio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_msr_disable_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_msr_enable_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_msr_exit_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adl_uncore_msr_init_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }
}

