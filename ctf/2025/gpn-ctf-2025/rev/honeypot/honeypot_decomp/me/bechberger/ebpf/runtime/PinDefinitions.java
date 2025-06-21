/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PinDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pin_free($arg1, $arg2, $arg3))")
    public static String pin_free(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, int pin, Ptr<PinctrlDefinitions.pinctrl_gpio_range> gpio_range) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pin_request($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int pin_request(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, int pin, String owner, Ptr<PinctrlDefinitions.pinctrl_gpio_range> gpio_range) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pin_insert(Ptr<FsDefinitions.fs_pin> pin, Ptr<runtime.vfsmount> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pin_kill(Ptr<FsDefinitions.fs_pin> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pin_remove(Ptr<FsDefinitions.fs_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pin_config_get_for_pin(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pin_config_group_get((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static int pin_config_group_get(String dev_name, String pin_group, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pin_user_pages(@Unsigned long start, @Unsigned long nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pin_user_pages_fast(@Unsigned long start, int nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pin_user_pages_remote(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pin_user_pages_unlocked(@Unsigned long start, @Unsigned long nr_pages, Ptr<Ptr<runtime.page>> pages, @Unsigned int gup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pin_get_from_name($arg1, (const u8*)$arg2)")
    public static int pin_get_from_name(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pin_get_name($arg1, (const unsigned int)$arg2))")
    public static String pin_get_name(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pin_pagetable_pfn(@Unsigned int cmd, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pin_desc")
    @NotUsableInJava
    public static class pin_desc
    extends Struct {
        public Ptr<PinctrlDefinitions.pinctrl_dev> pctldev;
        public String name;
        public boolean dynamic_name;
        public Ptr<?> drv_data;
        public @Unsigned int mux_usecount;
        public String mux_owner;
        public Ptr<PinctrlDefinitions.pinctrl_setting_mux> mux_setting;
        public String gpio_owner;
    }

    @Type(noCCodeGeneration=true, cType="struct pin_config_item")
    @NotUsableInJava
    public static class pin_config_item
    extends Struct {
        public pin_config_param param;
        public String display;
        public String format;
        public boolean has_arg;
    }

    @Type(noCCodeGeneration=true, cType="enum pin_config_param")
    public static enum pin_config_param implements Enum<pin_config_param>,
    TypedEnum<pin_config_param, Integer>
    {
        PIN_CONFIG_BIAS_BUS_HOLD,
        PIN_CONFIG_BIAS_DISABLE,
        PIN_CONFIG_BIAS_HIGH_IMPEDANCE,
        PIN_CONFIG_BIAS_PULL_DOWN,
        PIN_CONFIG_BIAS_PULL_PIN_DEFAULT,
        PIN_CONFIG_BIAS_PULL_UP,
        PIN_CONFIG_DRIVE_OPEN_DRAIN,
        PIN_CONFIG_DRIVE_OPEN_SOURCE,
        PIN_CONFIG_DRIVE_PUSH_PULL,
        PIN_CONFIG_DRIVE_STRENGTH,
        PIN_CONFIG_DRIVE_STRENGTH_UA,
        PIN_CONFIG_INPUT_DEBOUNCE,
        PIN_CONFIG_INPUT_ENABLE,
        PIN_CONFIG_INPUT_SCHMITT,
        PIN_CONFIG_INPUT_SCHMITT_ENABLE,
        PIN_CONFIG_INPUT_SCHMITT_UV,
        PIN_CONFIG_MODE_LOW_POWER,
        PIN_CONFIG_MODE_PWM,
        PIN_CONFIG_OUTPUT,
        PIN_CONFIG_OUTPUT_ENABLE,
        PIN_CONFIG_OUTPUT_IMPEDANCE_OHMS,
        PIN_CONFIG_PERSIST_STATE,
        PIN_CONFIG_POWER_SOURCE,
        PIN_CONFIG_SKEW_DELAY,
        PIN_CONFIG_SLEEP_HARDWARE_STATE,
        PIN_CONFIG_SLEW_RATE,
        PIN_CONFIG_END,
        PIN_CONFIG_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct pin_cookie")
    @NotUsableInJava
    public static class pin_cookie
    extends Struct {
    }
}

