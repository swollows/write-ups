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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IoapicDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static runtime.IO_APIC_route_entry __ioapic_read_entry(int apic2, int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ioapic_write_entry(int apic2, int pin, runtime.IO_APIC_route_entry e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_ack_level(Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_configure_entry(Ptr<IrqDefinitions.irq_data> irqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioapic_init_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_insert_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_ir_ack_level(Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioapic_irq_get_chip_state(Ptr<IrqDefinitions.irq_data> irqd, misc.irqchip_irq_state which, Ptr<@OriginalName(value="bool") Boolean> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_mask_entry(int apic2, int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static runtime.IO_APIC_route_entry ioapic_read_entry(int apic2, int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ioapic_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int ioapic_set_affinity(Ptr<IrqDefinitions.irq_data> irq_data2, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_set_alloc_attr(Ptr<IrqDefinitions.irq_alloc_info> info2, int node2, int trigger, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_write_entry(int apic2, int pin, runtime.IO_APIC_route_entry e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioapic_zap_locks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ioapic_scope")
    @NotUsableInJava
    public static class ioapic_scope
    extends Struct {
        public Ptr<IntelDefinitions.intel_iommu> iommu;
        public @Unsigned int id;
        public @Unsigned int bus;
        public @Unsigned int devfn;
    }

    @Type(noCCodeGeneration=true, cType="struct ioapic_domain_cfg")
    @NotUsableInJava
    public static class ioapic_domain_cfg
    extends Struct {
        public ioapic_domain_type type;
        public Ptr<IrqDefinitions.irq_domain_ops> ops;
        public Ptr<DeviceDefinitions.device_node> dev;
    }

    @Type(noCCodeGeneration=true, cType="enum ioapic_domain_type")
    public static enum ioapic_domain_type implements Enum<ioapic_domain_type>,
    TypedEnum<ioapic_domain_type, Integer>
    {
        IOAPIC_DOMAIN_INVALID,
        IOAPIC_DOMAIN_LEGACY,
        IOAPIC_DOMAIN_STRICT,
        IOAPIC_DOMAIN_DYNAMIC;

    }

    @Type(noCCodeGeneration=true, cType="struct { u8 ioapic_id; u8 rsvdz0; short unsigned int rsvdz1; short unsigned int rsvdz2; short unsigned int rsvdz3; short unsigned int device_type; }")
    @NotUsableInJava
    public static class ioapic_of_hv_device_id
    extends Struct {
        public char ioapic_id;
        public char rsvdz0;
        public @Unsigned short rsvdz1;
        public @Unsigned short rsvdz2;
        public @Unsigned short rsvdz3;
        public @Unsigned short device_type;
    }

    @Type(noCCodeGeneration=true, cType="struct ioapic_alloc_info")
    @NotUsableInJava
    public static class ioapic_alloc_info
    extends Struct {
        public int pin;
        public int node;
        public @Unsigned int is_level;
        public @Unsigned int active_low;
        public @Unsigned int valid;
    }
}

