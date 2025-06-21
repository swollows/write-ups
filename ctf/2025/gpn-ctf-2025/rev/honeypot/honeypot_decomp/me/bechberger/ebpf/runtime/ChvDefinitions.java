/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class ChvDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long chv_stolen_size(int num, int slot2, int func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_config_get(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_config_group_get(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_config_group_set(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group, Ptr<@Unsigned Long> configs, @Unsigned int num_configs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_config_set(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> configs, @Unsigned int nconfigs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_config_set_oden(Ptr<IntelDefinitions.intel_pinctrl> pctrl, @Unsigned int pin, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_add_pin_ranges(Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_gpio_clear_triggering(Ptr<IntelDefinitions.intel_pinctrl> pctrl, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_direction_input(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_direction_output(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_gpio_disable_free(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_get(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_get_direction(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_gpio_irq_ack(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_gpio_irq_handler(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_irq_init_hw(Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_gpio_irq_mask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_gpio_irq_mask_unmask(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, boolean mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int chv_gpio_irq_startup(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_irq_type(Ptr<IrqDefinitions.irq_data> d, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_gpio_irq_unmask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_probe(Ptr<IntelDefinitions.intel_pinctrl> pctrl, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_request_enable(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_gpio_set(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_gpio_set_direction(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int offset, boolean input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_init_irq_valid_mask(Ptr<GpioDefinitions.gpio_chip> chip, Ptr<@Unsigned Long> valid_mask, @Unsigned int ngpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_pin_dbg_show(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<SeqDefinitions.seq_file> s2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_pinctrl_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_pinctrl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int chv_pinctrl_mmio_access_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bits, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_pinctrl_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void chv_pinctrl_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_pinctrl_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_pinctrl_suspend_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int chv_pinmux_set_mux(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int function, @Unsigned int group) {
        throw new MethodIsBPFRelatedFunction();
    }
}

