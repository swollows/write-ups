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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AcpiphpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpiphp_add_context(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> data, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpiphp_check_bridge(Ptr<acpiphp_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpiphp_check_host_bridge(Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpiphp_disable_and_eject_slot(Ptr<acpiphp_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpiphp_disable_slot(Ptr<acpiphp_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpiphp_enable_slot(Ptr<acpiphp_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpiphp_enumerate_slots(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpiphp_get_adapter_status(Ptr<acpiphp_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpiphp_get_latch_status(Ptr<acpiphp_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpiphp_get_power_status(Ptr<acpiphp_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpiphp_context> acpiphp_grab_context(Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpiphp_hotplug_notify(Ptr<AcpiDefinitions.acpi_device> adev, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpiphp_post_dock_fixup(Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpiphp_put_context(Ptr<acpiphp_context> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpiphp_remove_slots(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpiphp_rescan_slot(Ptr<acpiphp_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpiphp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpiphp_register_attention(Ptr<acpiphp_attention_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpiphp_register_hotplug_slot(Ptr<acpiphp_slot> acpiphp_slot2, @Unsigned int sun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpiphp_unregister_attention(Ptr<acpiphp_attention_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpiphp_unregister_hotplug_slot(Ptr<acpiphp_slot> acpiphp_slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct acpiphp_root_context")
    @NotUsableInJava
    public static class acpiphp_root_context
    extends Struct {
        public AcpiDefinitions.acpi_hotplug_context hp;
        public Ptr<acpiphp_bridge> root_bridge;
    }

    @Type(noCCodeGeneration=true, cType="struct acpiphp_func")
    @NotUsableInJava
    public static class acpiphp_func
    extends Struct {
        public Ptr<acpiphp_bridge> parent;
        public Ptr<acpiphp_slot> slot;
        public ListDefinitions.list_head sibling;
        public char function;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpiphp_context")
    @NotUsableInJava
    public static class acpiphp_context
    extends Struct {
        public AcpiDefinitions.acpi_hotplug_context hp;
        public acpiphp_func func;
        public Ptr<acpiphp_bridge> bridge;
        public @Unsigned int refcount;
    }

    @Type(noCCodeGeneration=true, cType="struct acpiphp_bridge")
    @NotUsableInJava
    public static class acpiphp_bridge
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head slots;
        public runtime.kref ref;
        public Ptr<acpiphp_context> context;
        public int nr_slots;
        public Ptr<PciDefinitions.pci_bus> pci_bus;
        public Ptr<PciDefinitions.pci_dev> pci_dev;
        public boolean is_going_away;
    }

    @Type(noCCodeGeneration=true, cType="struct acpiphp_attention_info")
    @NotUsableInJava
    public static class acpiphp_attention_info
    extends Struct {
        public Ptr<?> set_attn;
        public Ptr<?> get_attn;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct acpiphp_slot")
    @NotUsableInJava
    public static class acpiphp_slot
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<PciDefinitions.pci_bus> bus;
        public ListDefinitions.list_head funcs;
        public Ptr<runtime.slot> slot;
        public char device;
        public @Unsigned int flags;
    }
}

