/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PiixDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void piix_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="piix_init_one($arg1, (const struct pci_device_id*)$arg2)")
    public static int piix_init_one(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const int*)piix_init_sata_map($arg1, $arg2, (const struct piix_map_db*)$arg3))")
    public static Ptr<Integer> piix_init_sata_map(Ptr<PciDefinitions.pci_dev> pdev, Ptr<AtaDefinitions.ata_port_info> pinfo, Ptr<piix_map_db> map_db) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_init_sidpr(Ptr<AtaDefinitions.ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean piix_irq_check(Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_pata_prereset(Ptr<AtaDefinitions.ata_link> link2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_pci_device_resume(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_pci_device_suspend(Ptr<PciDefinitions.pci_dev> pdev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message mesg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_port_start(Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void piix_remove_one(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void piix_set_dmamode(Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void piix_set_piomode(Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void piix_set_timings(Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_device> adev, char pio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_sidpr_scr_read(Ptr<AtaDefinitions.ata_link> link2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_sidpr_scr_write(Ptr<AtaDefinitions.ata_link> link2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int piix_sidpr_set_lpm(Ptr<AtaDefinitions.ata_link> link2, AtaDefinitions.ata_lpm_policy policy, @Unsigned int hints) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char piix_vmw_bmdma_status(Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct piix_host_priv")
    @NotUsableInJava
    public static class piix_host_priv
    extends Struct {
        public Ptr<Integer> map;
        public @Unsigned int saved_iocfg;
        public Ptr<?> sidpr;
    }

    @Type(noCCodeGeneration=true, cType="struct piix_map_db")
    @NotUsableInJava
    public static class piix_map_db
    extends Struct {
        public @Unsigned int mask;
        public @Unsigned short port_enable;
        public int @Size(value=0) [] map;
    }

    @Type(noCCodeGeneration=true, cType="enum piix_controller_ids")
    public static enum piix_controller_ids implements Enum<piix_controller_ids>,
    TypedEnum<piix_controller_ids, Integer>
    {
        piix_pata_mwdma,
        piix_pata_33,
        ich_pata_33,
        ich_pata_66,
        ich_pata_100,
        ich_pata_100_nomwdma1,
        ich5_sata,
        ich6_sata,
        ich6m_sata,
        ich8_sata,
        ich8_2port_sata,
        ich8m_apple_sata,
        tolapai_sata,
        piix_pata_vmw,
        ich8_sata_snb,
        ich8_2port_sata_snb,
        ich8_2port_sata_byt;

    }
}

