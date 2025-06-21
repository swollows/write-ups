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
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Max8998Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_irq_domain_map(Ptr<IrqDefinitions.irq_domain> d, @Unsigned int irq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8998_irq_exit(Ptr<max8998_dev> max8998) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_irq_init(Ptr<max8998_dev> max8998) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8998_irq_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8998_irq_mask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_irq_resume(Ptr<max8998_dev> max8998) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8998_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn max8998_irq_thread(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8998_irq_unmask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_bulk_read(Ptr<I2cDefinitions.i2c_client> i2c, char reg, int count, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_bulk_write(Ptr<I2cDefinitions.i2c_client> i2c, char reg, int count, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_read_reg(Ptr<I2cDefinitions.i2c_client> i2c, char reg, Ptr<Character> dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_update_reg(Ptr<I2cDefinitions.i2c_client> i2c, char reg, char val, char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8998_write_reg(Ptr<I2cDefinitions.i2c_client> i2c, char reg, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct max8998_reg_dump")
    @NotUsableInJava
    public static class max8998_reg_dump
    extends Struct {
        public char addr;
        public char val;
    }

    @Type(noCCodeGeneration=true, cType="struct max8998_platform_data")
    @NotUsableInJava
    public static class max8998_platform_data
    extends Struct {
        public Ptr<max8998_regulator_data> regulators;
        public int num_regulators;
        public @Unsigned int irq_base;
        public int ono;
        public boolean buck_voltage_lock;
        public int @Size(value=4) [] buck1_voltage;
        public int @Size(value=2) [] buck2_voltage;
        public int buck1_default_idx;
        public int buck2_default_idx;
        public boolean wakeup;
        public boolean rtc_delay;
        public int eoc;
        public int restart;
        public int timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct max8998_regulator_data")
    @NotUsableInJava
    public static class max8998_regulator_data
    extends Struct {
        public int id;
        public Ptr<RegulatorDefinitions.regulator_init_data> initdata;
        public Ptr<DeviceDefinitions.device_node> reg_node;
    }

    @Type(noCCodeGeneration=true, cType="struct max8998_irq_data")
    @NotUsableInJava
    public static class max8998_irq_data
    extends Struct {
        public int reg;
        public int mask;
    }

    @Type(noCCodeGeneration=true, cType="struct max8998_dev")
    @NotUsableInJava
    public static class max8998_dev
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<max8998_platform_data> pdata;
        public Ptr<I2cDefinitions.i2c_client> i2c;
        public Ptr<I2cDefinitions.i2c_client> rtc;
        public runtime.mutex iolock;
        public runtime.mutex irqlock;
        public @Unsigned int irq_base;
        public Ptr<IrqDefinitions.irq_domain> irq_domain;
        public int irq;
        public int ono;
        public char @Size(value=4) [] irq_masks_cur;
        public char @Size(value=4) [] irq_masks_cache;
        public @Unsigned long type;
        public boolean wakeup;
    }
}

