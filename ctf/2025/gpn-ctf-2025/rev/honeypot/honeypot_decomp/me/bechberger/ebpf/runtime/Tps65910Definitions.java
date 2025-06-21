/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RegmapDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Tps65910Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps65910_gpio_get(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps65910_gpio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps65910_gpio_input(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps65910_gpio_output(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps65910_gpio_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps65910_gpio_set(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps65910_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tps65910_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tps65910_power_off() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tps65910")
    @NotUsableInJava
    public static class tps65910
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<I2cDefinitions.i2c_client> i2c_client;
        public Ptr<runtime.regmap> regmap;
        public @Unsigned long id;
        public Ptr<tps65910_board> of_plat_data;
        public int chip_irq;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_data;
    }

    @Type(noCCodeGeneration=true, cType="struct tps65910_gpio")
    @NotUsableInJava
    public static class tps65910_gpio
    extends Struct {
        public GpioDefinitions.gpio_chip gpio_chip;
        public Ptr<tps65910> tps65910;
    }

    @Type(noCCodeGeneration=true, cType="struct tps65910_platform_data")
    @NotUsableInJava
    public static class tps65910_platform_data
    extends Struct {
        public int irq;
        public int irq_base;
    }

    @Type(noCCodeGeneration=true, cType="struct tps65910_board")
    @NotUsableInJava
    public static class tps65910_board
    extends Struct {
        public int gpio_base;
        public int irq;
        public int irq_base;
        public int vmbch_threshold;
        public int vmbch2_threshold;
        public boolean en_ck32k_xtal;
        public boolean en_dev_slp;
        public boolean pm_off;
        public tps65910_sleep_keepon_data slp_keepon;
        public boolean @Size(value=9) [] en_gpio_sleep;
        public @Unsigned long @Size(value=14) [] regulator_ext_sleep_control;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=14) [] tps65910_pmic_init_data;
    }

    @Type(noCCodeGeneration=true, cType="struct tps65910_sleep_keepon_data")
    @NotUsableInJava
    public static class tps65910_sleep_keepon_data
    extends Struct {
        public @Unsigned int therm_keepon;
        public @Unsigned int clkout32k_keepon;
        public @Unsigned int i2chs_keepon;
    }
}

