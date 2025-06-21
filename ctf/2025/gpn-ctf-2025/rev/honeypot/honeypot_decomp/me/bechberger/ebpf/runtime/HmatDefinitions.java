/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class HmatDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmat_calculate_adistance(Ptr<misc.notifier_block> self, @Unsigned long nid, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmat_callback(Ptr<misc.notifier_block> self, @Unsigned long action, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmat_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int hmat_normalize(@Unsigned short entry, @Unsigned long base, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmat_parse_cache($arg1, (const long unsigned int)$arg2)")
    public static int hmat_parse_cache(Ptr<AcpiDefinitions.acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmat_parse_locality($arg1, (const long unsigned int)$arg2)")
    public static int hmat_parse_locality(Ptr<AcpiDefinitions.acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmat_parse_proximity_domain($arg1, (const long unsigned int)$arg2)")
    public static int hmat_parse_proximity_domain(Ptr<AcpiDefinitions.acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmat_parse_subtable($arg1, (const long unsigned int)$arg2)")
    public static int hmat_parse_subtable(Ptr<AcpiDefinitions.acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hmat_register_target(Ptr<MemoryDefinitions.memory_target> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hmat_update_target_access(Ptr<MemoryDefinitions.memory_target> target, char type2, @Unsigned int value, int access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hmat_update_target_attrs(Ptr<MemoryDefinitions.memory_target> target, Ptr<@Unsigned Long> p_nodes, int access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmat_update_target_coordinates(int nid, Ptr<misc.access_coordinate> coord, misc.access_coordinate_class access2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

