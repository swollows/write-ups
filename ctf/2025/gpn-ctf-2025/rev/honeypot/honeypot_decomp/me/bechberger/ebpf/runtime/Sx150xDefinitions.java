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
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Sx150xDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sx150x_gpio_set(Ptr<sx150x_pinctrl> pctl, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_gpio_direction_input(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_gpio_direction_output(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_gpio_get(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_gpio_get_direction(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sx150x_gpio_set(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sx150x_gpio_set_multiple(Ptr<GpioDefinitions.gpio_chip> chip, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sx150x_irq_bus_lock(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sx150x_irq_bus_sync_unlock(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sx150x_irq_mask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sx150x_irq_print_chip(Ptr<IrqDefinitions.irq_data> d, Ptr<SeqDefinitions.seq_file> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_irq_set_type(Ptr<IrqDefinitions.irq_data> d, @Unsigned int flow_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn sx150x_irq_thread_fn(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sx150x_irq_unmask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_pinconf_get(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_pinconf_set(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> configs, @Unsigned int num_configs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)sx150x_pinctrl_get_group_name($arg1, $arg2))")
    public static String sx150x_pinctrl_get_group_name(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sx150x_pinctrl_get_group_pins($arg1, $arg2, (const unsigned int**)$arg3, $arg4)")
    public static int sx150x_pinctrl_get_group_pins(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group, Ptr<Ptr<@Unsigned Integer>> pins, Ptr<@Unsigned Integer> num_pins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_pinctrl_get_groups_count(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sx150x_reg_volatile(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_regmap_reg_read(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sx150x_regmap_reg_write(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sx150x_pinctrl")
    @NotUsableInJava
    public static class sx150x_pinctrl
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<I2cDefinitions.i2c_client> client;
        public Ptr<PinctrlDefinitions.pinctrl_dev> pctldev;
        public PinctrlDefinitions.pinctrl_desc pinctrl_desc;
        public GpioDefinitions.gpio_chip gpio;
        public Ptr<runtime.regmap> regmap;
        public IrqDefinitions.irq_of_sx150x_pinctrl irq;
        public runtime.mutex lock;
        public Ptr<sx150x_device_data> data;
    }

    @Type(noCCodeGeneration=true, cType="struct sx150x_device_data")
    @NotUsableInJava
    public static class sx150x_device_data
    extends Struct {
        public char model;
        public char reg_pullup;
        public char reg_pulldn;
        public char reg_dir;
        public char reg_data;
        public char reg_irq_mask;
        public char reg_irq_src;
        public char reg_sense;
        public char ngpios;
        public misc.pri_of_sx150x_device_data pri;
        public Ptr<PinctrlDefinitions.pinctrl_pin_desc> pins;
        public @Unsigned int npins;
    }
}

