/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class ShpchpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_check_cmd_status(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_disable_slot(Ptr<runtime.slot> p_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_enable_slot(Ptr<runtime.slot> p_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_get_adapter_speed(Ptr<runtime.slot> slot2, Ptr<PciDefinitions.pci_bus_speed> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_get_adapter_status(Ptr<runtime.slot> slot2, Ptr<Character> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_get_attention_status(Ptr<runtime.slot> slot2, Ptr<Character> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_get_latch_status(Ptr<runtime.slot> slot2, Ptr<Character> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_get_power_status(Ptr<runtime.slot> slot2, Ptr<Character> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_get_prog_int(Ptr<runtime.slot> slot2, Ptr<Character> prog_int) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shpchp_green_led_blink(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shpchp_green_led_off(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shpchp_green_led_on(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char shpchp_handle_attention_button(char hp_slot, Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char shpchp_handle_power_fault(char hp_slot, Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char shpchp_handle_presence_change(char hp_slot, Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char shpchp_handle_switch_change(char hp_slot, Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean shpchp_is_native(Ptr<PciDefinitions.pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_power_on_slot(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shpchp_pushbutton_thread(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_query_power_fault(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shpchp_queue_pushbutton_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shpchp_release_ctlr(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_set_attention_status(Ptr<runtime.slot> slot2, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_set_bus_speed_mode(Ptr<runtime.slot> slot2, PciDefinitions.pci_bus_speed value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_slot_disable(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_slot_enable(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_sysfs_disable_slot(Ptr<runtime.slot> p_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_sysfs_enable_slot(Ptr<runtime.slot> p_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_configure_device(Ptr<runtime.slot> p_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shpchp_unconfigure_device(Ptr<runtime.slot> p_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shpchp_create_ctrl_files(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shpchp_remove_ctrl_files(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }
}

