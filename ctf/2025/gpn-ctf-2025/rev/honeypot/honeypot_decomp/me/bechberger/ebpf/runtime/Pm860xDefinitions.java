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
import me.bechberger.ebpf.runtime.ChargerDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Pm860xDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_bulk_read(Ptr<I2cDefinitions.i2c_client> i2c, int reg, int count, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_bulk_write(Ptr<I2cDefinitions.i2c_client> i2c, int reg, int count, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_page_bulk_read(Ptr<I2cDefinitions.i2c_client> i2c, int reg, int count, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_page_reg_write(Ptr<I2cDefinitions.i2c_client> i2c, int reg, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_reg_read(Ptr<I2cDefinitions.i2c_client> i2c, int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_reg_write(Ptr<I2cDefinitions.i2c_client> i2c, int reg, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_set_bits(Ptr<I2cDefinitions.i2c_client> i2c, int reg, char mask, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pm860x_i2c_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn pm860x_irq(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pm860x_irq_disable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_irq_domain_map(Ptr<IrqDefinitions.irq_domain> d, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pm860x_irq_enable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pm860x_irq_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pm860x_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pm860x_remove(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pm860x_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pm860x_irq_data")
    @NotUsableInJava
    public static class pm860x_irq_data
    extends Struct {
        public int reg;
        public int mask_reg;
        public int enable;
        public int offs;
    }

    @Type(noCCodeGeneration=true, cType="struct pm860x_platform_data")
    @NotUsableInJava
    public static class pm860x_platform_data
    extends Struct {
        public Ptr<pm860x_backlight_pdata> backlight;
        public Ptr<pm860x_led_pdata> led;
        public Ptr<pm860x_rtc_pdata> rtc;
        public Ptr<pm860x_touch_pdata> touch;
        public Ptr<pm860x_power_pdata> power;
        public Ptr<RegulatorDefinitions.regulator_init_data> buck1;
        public Ptr<RegulatorDefinitions.regulator_init_data> buck2;
        public Ptr<RegulatorDefinitions.regulator_init_data> buck3;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo1;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo2;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo3;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo4;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo5;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo6;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo7;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo8;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo9;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo10;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo12;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo_vibrator;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo14;
        public Ptr<ChargerDefinitions.charger_desc> chg_desc;
        public int companion_addr;
        public int i2c_port;
        public int irq_mode;
        public int irq_base;
        public int num_leds;
        public int num_backlights;
    }

    @Type(noCCodeGeneration=true, cType="struct pm860x_power_pdata")
    @NotUsableInJava
    public static class pm860x_power_pdata
    extends Struct {
        public int max_capacity;
        public int resistor;
    }

    @Type(noCCodeGeneration=true, cType="struct pm860x_touch_pdata")
    @NotUsableInJava
    public static class pm860x_touch_pdata
    extends Struct {
        public int gpadc_prebias;
        public int slot_cycle;
        public int off_scale;
        public int sw_cal;
        public int tsi_prebias;
        public int pen_prebias;
        public int pen_prechg;
        public int res_x;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pm860x_rtc_pdata")
    @NotUsableInJava
    public static class pm860x_rtc_pdata
    extends Struct {
        public Ptr<?> sync;
        public int vrtc;
    }

    @Type(noCCodeGeneration=true, cType="struct pm860x_led_pdata")
    @NotUsableInJava
    public static class pm860x_led_pdata
    extends Struct {
        public int iset;
    }

    @Type(noCCodeGeneration=true, cType="struct pm860x_backlight_pdata")
    @NotUsableInJava
    public static class pm860x_backlight_pdata
    extends Struct {
        public int pwm;
        public int iset;
    }

    @Type(noCCodeGeneration=true, cType="struct pm860x_chip")
    @NotUsableInJava
    public static class pm860x_chip
    extends Struct {
        public Ptr<runtime.device> dev;
        public runtime.mutex irq_lock;
        public runtime.mutex osc_lock;
        public Ptr<I2cDefinitions.i2c_client> client;
        public Ptr<I2cDefinitions.i2c_client> companion;
        public Ptr<runtime.regmap> regmap;
        public Ptr<runtime.regmap> regmap_companion;
        public int buck3_double;
        public int companion_addr;
        public @Unsigned short osc_vote;
        public int id;
        public int irq_mode;
        public int irq_base;
        public int core_irq;
        public char chip_version;
        public char osc_status;
        public @Unsigned int wakeup_flag;
    }
}

