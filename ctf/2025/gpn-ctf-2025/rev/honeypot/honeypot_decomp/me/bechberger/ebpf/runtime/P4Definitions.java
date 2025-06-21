/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class P4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __p4_pmu_enable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int p4_hw_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void p4_pmu_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void p4_pmu_disable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void p4_pmu_enable_all(int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void p4_pmu_enable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long p4_pmu_event_map(int hw_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int p4_pmu_handle_irq(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int p4_pmu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int p4_pmu_schedule_events(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int n, Ptr<Integer> assign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int p4_pmu_set_period(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct p4_event_alias")
    @NotUsableInJava
    public static class p4_event_alias
    extends Struct {
        public @Unsigned long original;
        public @Unsigned long alternative;
    }

    @Type(noCCodeGeneration=true, cType="struct p4_pebs_bind")
    @NotUsableInJava
    public static class p4_pebs_bind
    extends Struct {
        public @Unsigned int metric_pebs;
        public @Unsigned int metric_vert;
    }

    @Type(noCCodeGeneration=true, cType="struct p4_event_bind")
    @NotUsableInJava
    public static class p4_event_bind
    extends Struct {
        public @Unsigned int opcode;
        public @Unsigned int @Size(value=2) [] escr_msr;
        public @Unsigned int escr_emask;
        public @Unsigned int shared;
        public byte @Size(value=6) [] cntr;
    }
}

