/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class SnrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_cha_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snr_cha_hw_config(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_iio_cleanup_mapping(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snr_iio_get_topology(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short snr_iio_mapping_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int die) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_iio_set_mapping(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_m2m_uncore_pci_init_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snr_pcu_hw_config(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_uncore_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_uncore_mmio_disable_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_uncore_mmio_disable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_uncore_mmio_enable_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_uncore_mmio_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_uncore_mmio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_uncore_mmio_init_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snr_uncore_mmio_map(Ptr<IntelDefinitions.intel_uncore_box> box, @Unsigned int box_ctl, int mem_offset, @Unsigned int device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snr_uncore_pci_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snr_uncore_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }
}

