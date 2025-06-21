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
import me.bechberger.ebpf.runtime.IoapicDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mp_check_pin_attr(int irq, Ptr<IrqDefinitions.irq_alloc_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mp_config_acpi_legacy_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_find_ioapic(@Unsigned int gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_find_ioapic_pin(int ioapic2, @Unsigned int gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_ioapic_registered(@Unsigned int gsi_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_irqdomain_activate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> irq_data2, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_irqdomain_alloc(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_irqdomain_create(int ioapic2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mp_irqdomain_deactivate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mp_irqdomain_free(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_irqdomain_ioapic_idx(Ptr<IrqDefinitions.irq_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_map_gsi_to_irq(@Unsigned int gsi, @Unsigned int flags, Ptr<IrqDefinitions.irq_alloc_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_map_pin_to_irq(@Unsigned int gsi, int idx, int ioapic2, int pin, @Unsigned int flags, Ptr<IrqDefinitions.irq_alloc_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mp_override_legacy_irq(char bus_irq, char polarity, char trigger, @Unsigned int gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_register_ioapic(int id, @Unsigned int address, @Unsigned int gsi_base, Ptr<IoapicDefinitions.ioapic_domain_cfg> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_register_ioapic_irq(char bus_irq, char polarity, char trigger, @Unsigned int gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mp_save_irq(Ptr<misc.mpc_intsrc> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mp_unmap_irq(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_unregister_ioapic(@Unsigned int gsi_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netmem_ref") long mp_dmabuf_devmem_alloc_netmems(Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mp_dmabuf_devmem_destroy(Ptr<PageDefinitions.page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mp_dmabuf_devmem_init(Ptr<PageDefinitions.page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mp_dmabuf_devmem_release_page(Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void MP_bus_info(Ptr<misc.mpc_bus> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void MP_ioapic_info(Ptr<misc.mpc_ioapic> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void MP_lintsrc_info(Ptr<misc.mpc_lintsrc> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void MP_processor_info(Ptr<misc.mpc_cpu> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mp_should_keep_irq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mp_ioapic_gsi")
    @NotUsableInJava
    public static class mp_ioapic_gsi
    extends Struct {
        public @Unsigned int gsi_base;
        public @Unsigned int gsi_end;
    }

    @Type(noCCodeGeneration=true, cType="struct mp_chip_data")
    @NotUsableInJava
    public static class mp_chip_data
    extends Struct {
        public ListDefinitions.list_head irq_2_pin;
        public runtime.IO_APIC_route_entry entry;
        public boolean is_level;
        public boolean active_low;
        public boolean isa_irq;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="enum mp_bustype")
    public static enum mp_bustype implements Enum<mp_bustype>,
    TypedEnum<mp_bustype, Integer>
    {
        MP_BUS_ISA,
        MP_BUS_EISA,
        MP_BUS_PCI;

    }

    @Type(noCCodeGeneration=true, cType="enum mp_irq_source_types")
    public static enum mp_irq_source_types implements Enum<mp_irq_source_types>,
    TypedEnum<mp_irq_source_types, Integer>
    {
        mp_INT,
        mp_NMI,
        mp_SMI,
        mp_ExtINT;

    }
}

