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
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.RegmapDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Da9052Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da9052_spi_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_spi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_spi_probe(Ptr<SpiDefinitions.spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da9052_spi_remove(Ptr<SpiDefinitions.spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da9052_i2c_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_i2c_fix(Ptr<da9052> da90522, char reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_i2c_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da9052_i2c_remove(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_adc_manual_read(Ptr<da9052> da90522, char channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_adc_read_temp(Ptr<da9052> da90522) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_clear_fault_log(Ptr<da9052> da90522) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da9052_device_exit(Ptr<da9052> da90522) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_device_init(Ptr<da9052> da90522, char chip_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean da9052_reg_readable(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean da9052_reg_volatile(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean da9052_reg_writeable(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn da9052_auxadc_irq(int irq, Ptr<?> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_disable_irq(Ptr<da9052> da90522, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_disable_irq_nosync(Ptr<da9052> da90522, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_enable_irq(Ptr<da9052> da90522, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da9052_free_irq(Ptr<da9052> da90522, int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_irq_exit(Ptr<da9052> da90522) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_irq_init(Ptr<da9052> da90522) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9052_request_irq(Ptr<da9052> da90522, int irq, String name, @OriginalName(value="irq_handler_t") Ptr<?> handler, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct da9052")
    @NotUsableInJava
    public static class da9052
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<runtime.regmap> regmap;
        public runtime.mutex auxadc_lock;
        public runtime.completion done;
        public int irq_base;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_data;
        public char chip_id;
        public int chip_irq;
        public Ptr<?> fix_io;
    }

    @Type(noCCodeGeneration=true, cType="struct da9052_pdata")
    @NotUsableInJava
    public static class da9052_pdata
    extends Struct {
        public @OriginalName(value="led_platform_data") Ptr<?> pled;
        public Ptr<?> init;
        public int irq_base;
        public int gpio_base;
        public int use_for_apm;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=14) [] regulators;
    }

    @Type(noCCodeGeneration=true, cType="enum da9052_chip_id")
    public static enum da9052_chip_id implements Enum<da9052_chip_id>,
    TypedEnum<da9052_chip_id, Integer>
    {
        DA9052,
        DA9053_AA,
        DA9053_BA,
        DA9053_BB,
        DA9053_BC;

    }
}

