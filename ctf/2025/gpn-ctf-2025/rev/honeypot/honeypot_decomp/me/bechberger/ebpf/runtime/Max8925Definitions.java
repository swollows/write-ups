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
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Max8925Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_bulk_read(Ptr<I2cDefinitions.i2c_client> i2c, int reg, int count, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_bulk_write(Ptr<I2cDefinitions.i2c_client> i2c, int reg, int count, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_reg_read(Ptr<I2cDefinitions.i2c_client> i2c, int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_reg_write(Ptr<I2cDefinitions.i2c_client> i2c, int reg, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8925_remove(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_set_bits(Ptr<I2cDefinitions.i2c_client> i2c, int reg, char mask, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8925_device_exit(Ptr<max8925_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_device_init(Ptr<max8925_chip> chip, Ptr<max8925_platform_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn max8925_irq(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8925_irq_disable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_irq_domain_map(Ptr<IrqDefinitions.irq_domain> d, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8925_irq_enable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8925_irq_init(Ptr<max8925_chip> chip, int irq, Ptr<max8925_platform_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8925_irq_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8925_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn max8925_tsc_irq(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct max8925_irq_data")
    @NotUsableInJava
    public static class max8925_irq_data
    extends Struct {
        public int reg;
        public int mask_reg;
        public int enable;
        public int offs;
        public int flags;
        public int tsc_irq;
    }

    @Type(noCCodeGeneration=true, cType="struct max8925_platform_data")
    @NotUsableInJava
    public static class max8925_platform_data
    extends Struct {
        public Ptr<max8925_backlight_pdata> backlight;
        public Ptr<max8925_touch_pdata> touch;
        public Ptr<max8925_power_pdata> power;
        public Ptr<RegulatorDefinitions.regulator_init_data> sd1;
        public Ptr<RegulatorDefinitions.regulator_init_data> sd2;
        public Ptr<RegulatorDefinitions.regulator_init_data> sd3;
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
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo11;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo12;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo13;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo14;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo15;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo16;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo17;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo18;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo19;
        public Ptr<RegulatorDefinitions.regulator_init_data> ldo20;
        public int irq_base;
        public int tsc_irq;
    }

    @Type(noCCodeGeneration=true, cType="struct max8925_power_pdata")
    @NotUsableInJava
    public static class max8925_power_pdata
    extends Struct {
        public Ptr<?> set_charger;
        public @Unsigned int batt_detect;
        public @Unsigned int topoff_threshold;
        public @Unsigned int fast_charge;
        public @Unsigned int no_temp_support;
        public @Unsigned int no_insert_detect;
        public Ptr<String> supplied_to;
        public int num_supplicants;
    }

    @Type(noCCodeGeneration=true, cType="struct max8925_touch_pdata")
    @NotUsableInJava
    public static class max8925_touch_pdata
    extends Struct {
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct max8925_backlight_pdata")
    @NotUsableInJava
    public static class max8925_backlight_pdata
    extends Struct {
        public int lxw_scl;
        public int lxw_freq;
        public int dual_string;
    }

    @Type(noCCodeGeneration=true, cType="struct max8925_chip")
    @NotUsableInJava
    public static class max8925_chip
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<I2cDefinitions.i2c_client> i2c;
        public Ptr<I2cDefinitions.i2c_client> adc;
        public Ptr<I2cDefinitions.i2c_client> rtc;
        public runtime.mutex io_lock;
        public runtime.mutex irq_lock;
        public int irq_base;
        public int core_irq;
        public int tsc_irq;
        public @Unsigned int wakeup_flag;
    }
}

