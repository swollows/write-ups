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
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PinmuxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pinmux_can_be_used_for_gpio(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_check_ops(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_disable_setting((const struct pinctrl_setting*)$arg1)")
    public static void pinmux_disable_setting(Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_enable_setting((const struct pinctrl_setting*)$arg1)")
    public static int pinmux_enable_setting(Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinmux_free_gpio(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_free_setting((const struct pinctrl_setting*)$arg1)")
    public static void pinmux_free_setting(Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_func_name_to_selector($arg1, (const u8*)$arg2)")
    public static int pinmux_func_name_to_selector(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, String function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_functions_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_functions_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_gpio_direction(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int pin, boolean input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinmux_init_device_debugfs(Ptr<runtime.dentry> devroot, Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_map_to_setting((const struct pinctrl_map*)$arg1, $arg2)")
    public static int pinmux_map_to_setting(Ptr<PinctrlDefinitions.pinctrl_map> map2, Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_pins_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_pins_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_request_gpio(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int pin, @Unsigned int gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_select_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinmux_select_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_select_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long pinmux_select_write(Ptr<runtime.file> file2, String user_buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_show_map($arg1, (const struct pinctrl_map*)$arg2)")
    public static void pinmux_show_map(Ptr<SeqDefinitions.seq_file> s2, Ptr<PinctrlDefinitions.pinctrl_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_show_setting($arg1, (const struct pinctrl_setting*)$arg2)")
    public static void pinmux_show_setting(Ptr<SeqDefinitions.seq_file> s2, Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinmux_validate_map((const struct pinctrl_map*)$arg1, $arg2)")
    public static int pinmux_validate_map(Ptr<PinctrlDefinitions.pinctrl_map> map2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pinmux_ops")
    @NotUsableInJava
    public static class pinmux_ops
    extends Struct {
        public Ptr<?> request;
        public Ptr<?> free;
        public Ptr<?> get_functions_count;
        public Ptr<?> get_function_name;
        public Ptr<?> get_function_groups;
        public Ptr<?> set_mux;
        public Ptr<?> gpio_request_enable;
        public Ptr<?> gpio_disable_free;
        public Ptr<?> gpio_set_direction;
        public boolean strict;
    }
}

