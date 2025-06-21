/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.GpiodDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class GpiochipDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_sysfs_register(Ptr<GpioDefinitions.gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_sysfs_unregister(Ptr<GpioDefinitions.gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_add_data_with_key(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<?> data, Ptr<LockDefinitions.lock_class_key> lock_key, Ptr<LockDefinitions.lock_class_key> request_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_add_irqchip(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<LockDefinitions.lock_class_key> lock_key, Ptr<LockDefinitions.lock_class_key> request_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiochip_add_pin_range($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int gpiochip_add_pin_range(Ptr<GpioDefinitions.gpio_chip> gc, String pinctl_name, @Unsigned int gpio_offset, @Unsigned int pin_offset, @Unsigned int npins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiochip_add_pingroup_range($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int gpiochip_add_pingroup_range(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int gpio_offset, String pin_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> gpiochip_allocate_mask(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_apply_reserved_ranges(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int gpiochip_child_offset_to_irq_noop(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_disable_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String gpiochip_dup_line_label(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_enable_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_free_hogs(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_free_own_desc(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_generic_config(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_generic_free(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_generic_request(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> gpiochip_get_data(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<GpioDefinitions.gpio_desc> gpiochip_get_desc(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int hwnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_get_ngpios(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> gpiochip_hierarchy_create_domain(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_hierarchy_irq_domain_alloc(Ptr<IrqDefinitions.irq_domain> d, @Unsigned int irq, @Unsigned int nr_irqs, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_hierarchy_irq_domain_translate(Ptr<IrqDefinitions.irq_domain> d, Ptr<IrqDefinitions.irq_fwspec> fwspec, Ptr<@Unsigned Long> hwirq, Ptr<@Unsigned Integer> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_irq_disable(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_irq_domain_activate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> data, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_irq_domain_deactivate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_irq_enable(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_irq_map(Ptr<IrqDefinitions.irq_domain> d, @Unsigned int irq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_irq_mask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_irq_relres(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_irq_reqres(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_irq_unmap(Ptr<IrqDefinitions.irq_domain> d, @Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_irq_unmask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_irqchip_add_domain(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<IrqDefinitions.irq_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_irqchip_remove(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gpiochip_line_is_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gpiochip_line_is_open_drain(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gpiochip_line_is_open_source(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gpiochip_line_is_persistent(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiochip_line_is_valid((const struct gpio_chip*)$arg1, $arg2)")
    public static boolean gpiochip_line_is_valid(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_lock_as_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_machine_hog(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<GpiodDefinitions.gpiod_hog> hog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_populate_parent_fwspec_fourcell(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<GpioDefinitions.gpio_irq_fwspec> gfwspec, @Unsigned int parent_hwirq, @Unsigned int parent_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_populate_parent_fwspec_twocell(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<GpioDefinitions.gpio_irq_fwspec> gfwspec, @Unsigned int parent_hwirq, @Unsigned int parent_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_relres_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_remove(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_remove_pin_ranges(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_reqres_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiochip_request_own_desc($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static Ptr<GpioDefinitions.gpio_desc> gpiochip_request_own_desc(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int hwnum, String label, GpioDefinitions.gpio_lookup_flags lflags, GpiodDefinitions.gpiod_flags dflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_setup_dev(Ptr<GpioDefinitions.gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiochip_to_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiochip_unlock_as_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct gpiochip_info")
    @NotUsableInJava
    public static class gpiochip_info
    extends Struct {
        public char @Size(value=32) [] name;
        public char @Size(value=32) [] label;
        public @Unsigned int lines;
    }

    @Type(noCCodeGeneration=true, cType="struct _gpiochip_for_each_data")
    @NotUsableInJava
    public static class _gpiochip_for_each_data
    extends Struct {
        public Ptr<String> label;
        public Ptr<@Unsigned Integer> i;
    }
}

