/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class SkxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long skx_cha_filter_mask(int fields) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> skx_cha_get_constraint(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skx_cha_hw_config(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skx_count_chabox() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skx_iio_cleanup_mapping(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skx_iio_enable_event(Ptr<IntelDefinitions.intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skx_iio_get_topology(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long skx_iio_mapping_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short skx_iio_mapping_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int die) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skx_iio_set_mapping(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skx_iio_topology_cb(Ptr<IntelDefinitions.intel_uncore_type> type2, int segment, int die, @Unsigned long cpu_bus_msr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skx_m2m_uncore_pci_init_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skx_pmu_get_topology($arg1, (int (*)(struct intel_uncore_type*, int, int, long long unsigned int))$arg2)")
    public static int skx_pmu_get_topology(Ptr<IntelDefinitions.intel_uncore_type> type2, Ptr<?> topology_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skx_uncore_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skx_uncore_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skx_upi_cleanup_mapping(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skx_upi_get_topology(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long skx_upi_mapping_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short skx_upi_mapping_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int die) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skx_upi_set_mapping(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skx_upi_topology_cb(Ptr<IntelDefinitions.intel_uncore_type> type2, int segment, int die, @Unsigned long cpu_bus_msr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skx_upi_uncore_pci_init_box(Ptr<IntelDefinitions.intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean skx_set_max_freq_ratio(Ptr<@Unsigned Long> base_freq, Ptr<@Unsigned Long> turbo_freq, int size) {
        throw new MethodIsBPFRelatedFunction();
    }
}

