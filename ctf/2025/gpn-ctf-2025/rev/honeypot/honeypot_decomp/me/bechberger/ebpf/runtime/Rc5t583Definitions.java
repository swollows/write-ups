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
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Rc5t583Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_gpio_dir_input(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_gpio_dir_output(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rc5t583_gpio_free(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_gpio_get(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_gpio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_gpio_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rc5t583_gpio_set(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_gpio_to_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rc5t583_set_ext_pwrreq1_control(Ptr<runtime.device> dev, int id, int ext_pwr, int slots) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_ext_power_req_config(Ptr<runtime.device> dev, int ds_id, int ext_pwr_req, int deepsleep_slot_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn rc5t583_irq(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_irq_init(Ptr<rc5t583> rc5t5832, int irq, int irq_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rc5t583_irq_lock(Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rc5t583_irq_mask(Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_irq_set_type(Ptr<IrqDefinitions.irq_data> irq_data2, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rc5t583_irq_set_wake(Ptr<IrqDefinitions.irq_data> irq_data2, @Unsigned int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rc5t583_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rc5t583_irq_unmask(Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rc5t583")
    @NotUsableInJava
    public static class rc5t583
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<runtime.regmap> regmap;
        public int chip_irq;
        public int irq_base;
        public runtime.mutex irq_lock;
        public @Unsigned long @Size(value=5) [] group_irq_en;
        public @OriginalName(value="uint8_t") char intc_inten_reg;
        public @OriginalName(value="uint8_t") char @Size(value=8) [] irq_en_reg;
        public @OriginalName(value="uint8_t") char @Size(value=2) [] gpedge_reg;
    }

    @Type(noCCodeGeneration=true, cType="struct rc5t583_gpio")
    @NotUsableInJava
    public static class rc5t583_gpio
    extends Struct {
        public GpioDefinitions.gpio_chip gpio_chip;
        public Ptr<rc5t583> rc5t583;
    }

    @Type(noCCodeGeneration=true, cType="struct rc5t583_platform_data")
    @NotUsableInJava
    public static class rc5t583_platform_data
    extends Struct {
        public int irq_base;
        public int gpio_base;
        public boolean enable_shutdown;
        public int @Size(value=14) [] regulator_deepsleep_slot;
        public @Unsigned long @Size(value=14) [] regulator_ext_pwr_control;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=14) [] reg_init_data;
    }

    @Type(noCCodeGeneration=true, cType="struct rc5t583_irq_data")
    @NotUsableInJava
    public static class rc5t583_irq_data
    extends Struct {
        public char int_type;
        public char master_bit;
        public char int_en_bit;
        public char mask_reg_index;
        public int grp_index;
    }
}

