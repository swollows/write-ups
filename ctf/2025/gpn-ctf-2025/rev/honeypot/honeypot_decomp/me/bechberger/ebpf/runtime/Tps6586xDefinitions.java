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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.SysDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Tps6586xDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_clr_bits(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps6586x_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_get_version(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_i2c_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps6586x_i2c_remove(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_i2c_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_i2c_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn tps6586x_irq(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps6586x_irq_disable(Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps6586x_irq_enable(Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_irq_get_virq(Ptr<runtime.device> dev, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_irq_init(Ptr<tps6586x> tps6586x2, int irq, int irq_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps6586x_irq_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_irq_map(Ptr<IrqDefinitions.irq_domain> h, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_irq_set_wake(Ptr<IrqDefinitions.irq_data> irq_data2, @Unsigned int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps6586x_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_power_off_handler(Ptr<SysDefinitions.sys_off_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_read(Ptr<runtime.device> dev, int reg, Ptr<@OriginalName(value="uint8_t") Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_reads(Ptr<runtime.device> dev, int reg, int len, Ptr<@OriginalName(value="uint8_t") Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_restart_handler(Ptr<SysDefinitions.sys_off_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_set_bits(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_update(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char val, @OriginalName(value="uint8_t") char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_write(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_writes(Ptr<runtime.device> dev, int reg, int len, Ptr<@OriginalName(value="uint8_t") Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_gpio_get(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_gpio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_gpio_output(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_gpio_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps6586x_gpio_set(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps6586x_gpio_to_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tps6586x")
    @NotUsableInJava
    public static class tps6586x
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<I2cDefinitions.i2c_client> client;
        public Ptr<runtime.regmap> regmap;
        public int version;
        public int irq;
        public IrqDefinitions.irq_chip irq_chip;
        public runtime.mutex irq_lock;
        public int irq_base;
        public @Unsigned int irq_en;
        public char @Size(value=5) [] mask_reg;
        public Ptr<IrqDefinitions.irq_domain> irq_domain;
    }

    @Type(noCCodeGeneration=true, cType="struct tps6586x_irq_data")
    @NotUsableInJava
    public static class tps6586x_irq_data
    extends Struct {
        public char mask_reg;
        public char mask_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct tps6586x_gpio")
    @NotUsableInJava
    public static class tps6586x_gpio
    extends Struct {
        public GpioDefinitions.gpio_chip gpio_chip;
        public Ptr<runtime.device> parent;
    }

    @Type(noCCodeGeneration=true, cType="struct tps6586x_platform_data")
    @NotUsableInJava
    public static class tps6586x_platform_data
    extends Struct {
        public int num_subdevs;
        public Ptr<tps6586x_subdev_info> subdevs;
        public int gpio_base;
        public int irq_base;
        public boolean pm_off;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=15) [] reg_init_data;
    }

    @Type(noCCodeGeneration=true, cType="struct tps6586x_subdev_info")
    @NotUsableInJava
    public static class tps6586x_subdev_info
    extends Struct {
        public int id;
        public String name;
        public Ptr<?> platform_data;
        public Ptr<DeviceDefinitions.device_node> of_node;
    }
}

