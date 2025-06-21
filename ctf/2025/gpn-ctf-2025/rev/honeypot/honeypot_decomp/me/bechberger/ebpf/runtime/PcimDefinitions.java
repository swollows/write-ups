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
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PcimDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pcim_clear_mwi(Ptr<?> pdev_raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pcim_intx(Ptr<PciDefinitions.pci_dev> pdev, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pcim_release_region(Ptr<PciDefinitions.pci_dev> pdev, int bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_pcim_request_region($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int _pcim_request_region(Ptr<PciDefinitions.pci_dev> pdev, int bar, String name, int request_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_addr_resource_release(Ptr<runtime.device> dev, Ptr<?> resource_raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcim_addr_resources_match(Ptr<runtime.device> dev, Ptr<?> a_raw, Ptr<?> b_raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_disable_device(Ptr<?> pdev_raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcim_enable_device(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcim_intx(Ptr<PciDefinitions.pci_dev> pdev, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_intx_restore(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pcim_iomap(Ptr<PciDefinitions.pci_dev> pdev, int bar, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pcim_iomap_range(Ptr<PciDefinitions.pci_dev> pdev, int bar, @Unsigned long offset, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcim_iomap_region($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<?> pcim_iomap_region(Ptr<PciDefinitions.pci_dev> pdev, int bar, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcim_iomap_regions($arg1, $arg2, (const u8*)$arg3)")
    public static int pcim_iomap_regions(Ptr<PciDefinitions.pci_dev> pdev, int mask, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcim_iomap_regions_request_all($arg1, $arg2, (const u8*)$arg3)")
    public static int pcim_iomap_regions_request_all(Ptr<PciDefinitions.pci_dev> pdev, int mask, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_iomap_release(Ptr<runtime.device> gendev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void**)pcim_iomap_table($arg1))")
    public static Ptr<Ptr<?>> pcim_iomap_table(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_iounmap(Ptr<PciDefinitions.pci_dev> pdev, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_iounmap_regions(Ptr<PciDefinitions.pci_dev> pdev, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_msi_release(Ptr<?> pcidev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_pin_device(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcim_release_region(Ptr<PciDefinitions.pci_dev> pdev, int bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcim_request_region($arg1, $arg2, (const u8*)$arg3)")
    public static int pcim_request_region(Ptr<PciDefinitions.pci_dev> pdev, int bar, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcim_request_region_exclusive($arg1, $arg2, (const u8*)$arg3)")
    public static int pcim_request_region_exclusive(Ptr<PciDefinitions.pci_dev> pdev, int bar, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcim_set_mwi(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pcim_addr_devres")
    @NotUsableInJava
    public static class pcim_addr_devres
    extends Struct {
        public pcim_addr_devres_type type;
        public Ptr<?> baseaddr;
        public @Unsigned long offset;
        public @Unsigned long len;
        public int bar;
    }

    @Type(noCCodeGeneration=true, cType="enum pcim_addr_devres_type")
    public static enum pcim_addr_devres_type implements Enum<pcim_addr_devres_type>,
    TypedEnum<pcim_addr_devres_type, Integer>
    {
        PCIM_ADDR_DEVRES_TYPE_INVALID,
        PCIM_ADDR_DEVRES_TYPE_REGION,
        PCIM_ADDR_DEVRES_TYPE_REGION_MAPPING,
        PCIM_ADDR_DEVRES_TYPE_MAPPING;

    }

    @Type(noCCodeGeneration=true, cType="struct pcim_intx_devres")
    @NotUsableInJava
    public static class pcim_intx_devres
    extends Struct {
        public int orig_intx;
    }

    @Type(noCCodeGeneration=true, cType="struct pcim_iomap_devres")
    @NotUsableInJava
    public static class pcim_iomap_devres
    extends Struct {
        public Ptr<?> @Size(value=6) [] table;
    }
}

