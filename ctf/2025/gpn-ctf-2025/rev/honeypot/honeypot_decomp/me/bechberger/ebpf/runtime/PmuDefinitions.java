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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PmuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pmu_cleanup_mapping(Ptr<IntelDefinitions.intel_uncore_type> type2, Ptr<AttributeDefinitions.attribute_group> ag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pmu_clear_mapping_attr((const struct attribute_group**)$arg1, $arg2)")
    public static void pmu_clear_mapping_attr(Ptr<Ptr<AttributeDefinitions.attribute_group>> groups, Ptr<AttributeDefinitions.attribute_group> ag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pmu_free_topology(Ptr<IntelDefinitions.intel_uncore_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pmu_iio_mapping_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int die, int zero_bus_pmu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pmu_set_mapping($arg1, $arg2, (long int (*)(struct device*, struct device_attribute*, u8*))$arg3, $arg4)")
    public static void pmu_set_mapping(Ptr<IntelDefinitions.intel_uncore_type> type2, Ptr<AttributeDefinitions.attribute_group> ag, Ptr<?> show, int topology_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmu_apic_update(@Unsigned @OriginalName(value="uint32_t") int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pmu_msr_chk_emulated(@Unsigned int msr2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val, boolean is_read, Ptr<@OriginalName(value="bool") Boolean> emul) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pmu_msr_read(@Unsigned int msr2, Ptr<@Unsigned @OriginalName(value="uint64_t") Long> val, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pmu_msr_write(@Unsigned int msr2, @Unsigned @OriginalName(value="uint32_t") int low, @Unsigned @OriginalName(value="uint32_t") int high, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pmu_ctx_sched_out(Ptr<PerfDefinitions.perf_event_pmu_context> pmu_ctx, EventDefinitions.event_type_t event_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pmu_dev_alloc(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pmu_dev_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pmu_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pmu_features_show(Ptr<misc.hyp_sysfs_attr> attr2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pmu_features_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pmu_features_store(Ptr<misc.hyp_sysfs_attr> attr2, String buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pmu_mode_show(Ptr<misc.hyp_sysfs_attr> attr2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pmu_mode_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pmu_mode_store(Ptr<misc.hyp_sysfs_attr> attr2, String buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pmu_mode")
    @NotUsableInJava
    public static class pmu_mode
    extends Struct {
        public String name;
        public @Unsigned @OriginalName(value="uint32_t") int mode;
    }

    @Type(noCCodeGeneration=true, cType="struct pmu_event_list")
    @NotUsableInJava
    public static class pmu_event_list
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public ListDefinitions.list_head list;
    }
}

