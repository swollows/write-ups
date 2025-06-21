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
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PirqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pirq_check_eoi_map(Ptr<IrqDefinitions.irq_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pirq_needs_eoi_flag(Ptr<IrqDefinitions.irq_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pirq_query_unmask(Ptr<IrqDefinitions.irq_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_ali_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_ali_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_amd756_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_amd756_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_routing_table> pirq_check_routing_table(Ptr<Character> addr2, Ptr<Character> limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_routing_table> pirq_convert_irt_table(Ptr<Character> addr2, Ptr<Character> limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_cyrix_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_cyrix_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pirq_disable_irq(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_enable_irq(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_esc_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_esc_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_finali_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_finali_lvl(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_finali_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_info> pirq_get_dev_info(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_info> pirq_get_info(Ptr<PciDefinitions.pci_dev> dev, Ptr<Character> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_ib_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_ib_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_ite_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_ite_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_opti_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_opti_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pirq_peer_trick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_pico_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_pico_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_piix_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_piix_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_serverworks_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_serverworks_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_sis497_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_sis497_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_sis503_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_sis503_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_via586_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_via586_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_via_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_via_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_vlsi_get(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pirq_vlsi_set(Ptr<PciDefinitions.pci_dev> router, Ptr<PciDefinitions.pci_dev> dev, int pirq, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int pirq; short unsigned int gsi; u8 vector; u8 flags; short unsigned int domid; }")
    @NotUsableInJava
    public static class pirq_of_u_of_irq_info
    extends Struct {
        public @Unsigned short pirq;
        public @Unsigned short gsi;
        public char vector;
        public char flags;
        public @Unsigned @OriginalName(value="uint16_t") short domid;
    }
}

