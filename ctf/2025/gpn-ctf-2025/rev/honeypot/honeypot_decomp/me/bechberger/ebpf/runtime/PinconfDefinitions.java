/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PinDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PinconfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="pinconf_apply_setting((const struct pinctrl_setting*)$arg1)")
    public static int pinconf_apply_setting(Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinconf_check_ops(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinconf_free_setting((const struct pinctrl_setting*)$arg1)")
    public static void pinconf_free_setting(Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinconf_groups_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinconf_groups_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinconf_init_device_debugfs(Ptr<runtime.dentry> devroot, Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinconf_map_to_setting((const struct pinctrl_map*)$arg1, $arg2)")
    public static int pinconf_map_to_setting(Ptr<PinctrlDefinitions.pinctrl_map> map2, Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinconf_pins_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinconf_pins_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinconf_set_config(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> configs, @Unsigned long nconfigs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinconf_show_config(Ptr<SeqDefinitions.seq_file> s2, Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<@Unsigned Long> configs, @Unsigned int num_configs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinconf_show_map($arg1, (const struct pinctrl_map*)$arg2)")
    public static void pinconf_show_map(Ptr<SeqDefinitions.seq_file> s2, Ptr<PinctrlDefinitions.pinctrl_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinconf_show_setting($arg1, (const struct pinctrl_setting*)$arg2)")
    public static void pinconf_show_setting(Ptr<SeqDefinitions.seq_file> s2, Ptr<PinctrlDefinitions.pinctrl_setting> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinconf_validate_map((const struct pinctrl_map*)$arg1, $arg2)")
    public static int pinconf_validate_map(Ptr<PinctrlDefinitions.pinctrl_map> map2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinconf_generic_dump_config(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<SeqDefinitions.seq_file> s2, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinconf_generic_dump_one($arg1, $arg2, (const u8*)$arg3, $arg4, (const struct pin_config_item*)$arg5, $arg6, $arg7)")
    public static void pinconf_generic_dump_one(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<SeqDefinitions.seq_file> s2, String gname, @Unsigned int pin, Ptr<PinDefinitions.pin_config_item> items, int nitems, Ptr<Integer> print_sep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinconf_generic_dump_pins($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void pinconf_generic_dump_pins(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<SeqDefinitions.seq_file> s2, String gname, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pinconf_ops")
    @NotUsableInJava
    public static class pinconf_ops
    extends Struct {
        public boolean is_generic;
        public Ptr<?> pin_config_get;
        public Ptr<?> pin_config_set;
        public Ptr<?> pin_config_group_get;
        public Ptr<?> pin_config_group_set;
        public Ptr<?> pin_config_dbg_show;
        public Ptr<?> pin_config_group_dbg_show;
        public Ptr<?> pin_config_config_dbg_show;
    }

    @Type(noCCodeGeneration=true, cType="struct pinconf_generic_params")
    @NotUsableInJava
    public static class pinconf_generic_params
    extends Struct {
        public String property;
        public PinDefinitions.pin_config_param param;
        public @Unsigned int default_value;
    }
}

