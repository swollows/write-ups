/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PhysdevDefinitions {

    @Type(noCCodeGeneration=true, cType="struct physdev_dbgp_op")
    @NotUsableInJava
    public static class physdev_dbgp_op
    extends Struct {
        public @OriginalName(value="uint8_t") char op;
        public @OriginalName(value="uint8_t") char bus;
        public UDefinitions.u_of_physdev_dbgp_op u;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_get_free_pirq")
    @NotUsableInJava
    public static class physdev_get_free_pirq
    extends Struct {
        public int type;
        public @Unsigned @OriginalName(value="uint32_t") int pirq;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_unmap_pirq")
    @NotUsableInJava
    public static class physdev_unmap_pirq
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public int pirq;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_irq")
    @NotUsableInJava
    public static class physdev_irq
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int irq;
        public @Unsigned @OriginalName(value="uint32_t") int vector;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_irq_status_query")
    @NotUsableInJava
    public static class physdev_irq_status_query
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int irq;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_pirq_eoi_gmfn")
    @NotUsableInJava
    public static class physdev_pirq_eoi_gmfn
    extends Struct {
        public @Unsigned @OriginalName(value="xen_ulong_t") long gmfn;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_eoi")
    @NotUsableInJava
    public static class physdev_eoi
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int irq;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_pci_device_add")
    @NotUsableInJava
    public static class physdev_pci_device_add
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short seg;
        public @OriginalName(value="uint8_t") char bus;
        public @OriginalName(value="uint8_t") char devfn;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public misc.physfn_of_physdev_manage_pci_ext_and_physfn_of_physdev_pci_device_add physfn;
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=0) [] optarr;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_pci_mmcfg_reserved")
    @NotUsableInJava
    public static class physdev_pci_mmcfg_reserved
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long address;
        public @Unsigned @OriginalName(value="uint16_t") short segment;
        public @OriginalName(value="uint8_t") char start_bus;
        public @OriginalName(value="uint8_t") char end_bus;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_manage_pci_ext")
    @NotUsableInJava
    public static class physdev_manage_pci_ext
    extends Struct {
        public @OriginalName(value="uint8_t") char bus;
        public @OriginalName(value="uint8_t") char devfn;
        public @Unsigned int is_extfn;
        public @Unsigned int is_virtfn;
        public misc.physfn_of_physdev_manage_pci_ext_and_physfn_of_physdev_pci_device_add physfn;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_manage_pci")
    @NotUsableInJava
    public static class physdev_manage_pci
    extends Struct {
        public @OriginalName(value="uint8_t") char bus;
        public @OriginalName(value="uint8_t") char devfn;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_set_iobitmap")
    @NotUsableInJava
    public static class physdev_set_iobitmap
    extends Struct {
        public Ptr<@OriginalName(value="uint8_t") Character> bitmap;
        public @Unsigned @OriginalName(value="uint32_t") int nr_ports;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_set_iopl")
    @NotUsableInJava
    public static class physdev_set_iopl
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int iopl;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_apic")
    @NotUsableInJava
    public static class physdev_apic
    extends Struct {
        public @Unsigned long apic_physbase;
        public @Unsigned @OriginalName(value="uint32_t") int reg;
        public @Unsigned @OriginalName(value="uint32_t") int value;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_pci_device")
    @NotUsableInJava
    public static class physdev_pci_device
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short seg;
        public @OriginalName(value="uint8_t") char bus;
        public @OriginalName(value="uint8_t") char devfn;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_setup_gsi")
    @NotUsableInJava
    public static class physdev_setup_gsi
    extends Struct {
        public int gsi;
        public @OriginalName(value="uint8_t") char triggering;
        public @OriginalName(value="uint8_t") char polarity;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_restore_msi")
    @NotUsableInJava
    public static class physdev_restore_msi
    extends Struct {
        public @OriginalName(value="uint8_t") char bus;
        public @OriginalName(value="uint8_t") char devfn;
    }

    @Type(noCCodeGeneration=true, cType="struct physdev_map_pirq")
    @NotUsableInJava
    public static class physdev_map_pirq
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public int type;
        public int index;
        public int pirq;
        public int bus;
        public int devfn;
        public int entry_nr;
        public @Unsigned @OriginalName(value="uint64_t") long table_base;
    }
}

