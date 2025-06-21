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
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CpciDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_hotplug_init(int debug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="irqreturn_t") runtime.irqreturn cpci_hp_intr(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_hp_register_bus(Ptr<PciDefinitions.pci_bus> bus, char first, char last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_hp_register_controller(Ptr<cpci_hp_controller> new_controller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_hp_start() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_hp_stop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_hp_unregister_bus(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_hp_unregister_controller(Ptr<cpci_hp_controller> old_controller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_check_and_clear_ins(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_check_ext(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_clear_ext(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_configure_slot(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char cpci_get_attention_status(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short cpci_get_hs_csr(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_led_off(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_led_on(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_set_attention_status(Ptr<runtime.slot> slot2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpci_unconfigure_slot(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cpci_hp_controller")
    @NotUsableInJava
    public static class cpci_hp_controller
    extends Struct {
        public @Unsigned int irq;
        public @Unsigned long irq_flags;
        public String devname;
        public Ptr<?> dev_id;
        public String name;
        public Ptr<cpci_hp_controller_ops> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct cpci_hp_controller_ops")
    @NotUsableInJava
    public static class cpci_hp_controller_ops
    extends Struct {
        public Ptr<?> query_enum;
        public Ptr<?> enable_irq;
        public Ptr<?> disable_irq;
        public Ptr<?> check_irq;
        public Ptr<?> hardware_test;
        public Ptr<?> get_power;
        public Ptr<?> set_power;
    }
}

