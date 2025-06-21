/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BgpioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_dir_in(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_dir_out(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_dir_out_dir_first(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_dir_out_err(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_dir_out_val_first(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_get(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_get_dir(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_get_multiple(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_get_multiple_be(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_get_set(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_get_set_multiple(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_init(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<runtime.device> dev, @Unsigned long sz, Ptr<?> dat, Ptr<?> set, Ptr<?> clr, Ptr<?> dirout, Ptr<?> dirin, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bgpio_line2mask(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_multiple_get_masks(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits, Ptr<@Unsigned Long> set_mask, Ptr<@Unsigned Long> clear_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_pdev_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bgpio_read16(Ptr<?> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bgpio_read16be(Ptr<?> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bgpio_read32(Ptr<?> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bgpio_read32be(Ptr<?> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bgpio_read64(Ptr<?> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bgpio_read8(Ptr<?> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_request(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int gpio_pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_set(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_set_multiple(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_set_multiple_set(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_set_multiple_single_reg(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits, Ptr<?> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_set_multiple_with_clear(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_set_none(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_set_set(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_set_with_clear(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_simple_dir_in(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bgpio_simple_dir_out(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int gpio, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_write16(Ptr<?> reg, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_write16be(Ptr<?> reg, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_write32(Ptr<?> reg, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_write32be(Ptr<?> reg, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_write64(Ptr<?> reg, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bgpio_write8(Ptr<?> reg, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct bgpio_pdata")
    @NotUsableInJava
    public static class bgpio_pdata
    extends Struct {
        public String label;
        public int base;
        public int ngpio;
    }
}

