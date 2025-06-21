/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SisDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sis_fixup(Ptr<PciDefinitions.pci_dev> pdev, Ptr<sis_chipset> sis) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sis_init_one($arg1, (const struct pci_device_id*)$arg2)")
    public static int sis_init_one(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sis_old_set_dmamode(Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sis_old_set_piomode(Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sis_pci_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sis_pci_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sis_port_base(Ptr<AtaDefinitions.ata_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sis_pre_reset(Ptr<AtaDefinitions.ata_link> link2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sis_reinit_one(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sis_router_probe(Ptr<IrqDefinitions.irq_router> r, Ptr<PciDefinitions.pci_dev> router, @Unsigned short device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sis_laptop")
    @NotUsableInJava
    public static class sis_laptop
    extends Struct {
        public @Unsigned short device;
        public @Unsigned short subvendor;
        public @Unsigned short subdevice;
    }

    @Type(noCCodeGeneration=true, cType="struct sis_chipset")
    @NotUsableInJava
    public static class sis_chipset
    extends Struct {
        public @Unsigned short device;
        public Ptr<AtaDefinitions.ata_port_info> info;
    }
}

