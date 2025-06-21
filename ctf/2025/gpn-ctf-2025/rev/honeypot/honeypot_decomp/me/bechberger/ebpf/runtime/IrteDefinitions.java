/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.BPFType;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class IrteDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_activate(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<?> entry, @Unsigned short devid, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_clear_allocated(Ptr<IrqDefinitions.irq_remap_table> table, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_deactivate(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<?> entry, @Unsigned short devid, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_ga_activate(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<?> entry, @Unsigned short devid, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_ga_clear_allocated(Ptr<IrqDefinitions.irq_remap_table> table, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_ga_deactivate(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<?> entry, @Unsigned short devid, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irte_ga_is_allocated(Ptr<IrqDefinitions.irq_remap_table> table, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_ga_prepare(Ptr<?> entry, @Unsigned int delivery_mode, boolean dest_mode, char vector, @Unsigned int dest_apicid, int devid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_ga_set_affinity(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<?> entry, @Unsigned short devid, @Unsigned short index2, char vector, @Unsigned int dest_apicid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_ga_set_allocated(Ptr<IrqDefinitions.irq_remap_table> table, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irte_is_allocated(Ptr<IrqDefinitions.irq_remap_table> table, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_prepare(Ptr<?> entry, @Unsigned int delivery_mode, boolean dest_mode, char vector, @Unsigned int dest_apicid, int devid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_set_affinity(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<?> entry, @Unsigned short devid, @Unsigned short index2, char vector, @Unsigned int dest_apicid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irte_set_allocated(Ptr<IrqDefinitions.irq_remap_table> table, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct irte_ga")
    @NotUsableInJava
    public static class irte_ga
    extends Struct {
        @InlineUnion(value=32090)
        public  @InlineUnion(value=32090) AnonDefinitions.anon_member_of_anon_member_of_irte_ga anon0$0;
        @InlineUnion(value=32090)
        public @Unsigned @InlineUnion(value=32090) BPFType.BPFIntType.Int128 irte;
    }

    @Type(noCCodeGeneration=true, cType="union irte_ga_hi")
    @NotUsableInJava
    public static class irte_ga_hi
    extends Union {
        public @Unsigned long val;
        public misc.fields_of_irte_ga_hi fields;
    }

    @Type(noCCodeGeneration=true, cType="union irte_ga_lo")
    @NotUsableInJava
    public static class irte_ga_lo
    extends Union {
        public @Unsigned long val;
        public misc.fields_remap_of_irte_ga_lo fields_remap;
        public misc.fields_vapic_of_irte_ga_lo fields_vapic;
    }
}

