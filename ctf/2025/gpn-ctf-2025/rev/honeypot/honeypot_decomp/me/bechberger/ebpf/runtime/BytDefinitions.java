/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.LpssDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class BytDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_i2c_setup(Ptr<LpssDefinitions.lpss_private_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_pwm_setup(Ptr<LpssDefinitions.lpss_private_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_add_pin_ranges(Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_gpio_clear_triggering(Ptr<IntelDefinitions.intel_pinctrl> vg, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_gpio_dbg_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_gpio_direct_irq_check(Ptr<IntelDefinitions.intel_pinctrl> vg, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_direction_input(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_direction_output(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_gpio_disable_free(Ptr<PinctrlDefinitions.pinctrl_dev> pctl_dev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_get(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_get_direction(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_gpio_irq_handler(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_irq_init_hw(Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_request_enable(Ptr<PinctrlDefinitions.pinctrl_dev> pctl_dev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_gpio_set(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_set_direction(Ptr<PinctrlDefinitions.pinctrl_dev> pctl_dev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int offset, boolean input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_gpio_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_init_irq_valid_mask(Ptr<GpioDefinitions.gpio_chip> chip, Ptr<@Unsigned Long> valid_mask, @Unsigned int ngpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_irq_ack(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_irq_mask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_irq_type(Ptr<IrqDefinitions.irq_data> d, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void byt_irq_unmask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_pin_config_get(Ptr<PinctrlDefinitions.pinctrl_dev> pctl_dev, @Unsigned int offset, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_pin_config_set(Ptr<PinctrlDefinitions.pinctrl_dev> pctl_dev, @Unsigned int offset, Ptr<@Unsigned Long> configs, @Unsigned int num_configs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_pinctrl_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int byt_set_mux(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int func_selector, @Unsigned int group_selector) {
        throw new MethodIsBPFRelatedFunction();
    }
}

