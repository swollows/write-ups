/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.RegmapDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Da9063Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9063_clear_fault_log(Ptr<da9063> da90632) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9063_device_init(Ptr<da9063> da90632, @Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9063_irq_init(Ptr<da9063> da90632) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void da9063_i2c_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9063_i2c_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int da9063_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct da9063")
    @NotUsableInJava
    public static class da9063
    extends Struct {
        public Ptr<runtime.device> dev;
        public da9063_type type;
        public char variant_code;
        public @Unsigned int flags;
        public Ptr<runtime.regmap> regmap;
        public int chip_irq;
        public @Unsigned int irq_base;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> regmap_irq;
    }

    @Type(noCCodeGeneration=true, cType="enum da9063_irqs")
    public static enum da9063_irqs implements Enum<da9063_irqs>,
    TypedEnum<da9063_irqs, Integer>
    {
        DA9063_IRQ_ONKEY,
        DA9063_IRQ_ALARM,
        DA9063_IRQ_TICK,
        DA9063_IRQ_ADC_RDY,
        DA9063_IRQ_SEQ_RDY,
        DA9063_IRQ_WAKE,
        DA9063_IRQ_TEMP,
        DA9063_IRQ_COMP_1V2,
        DA9063_IRQ_LDO_LIM,
        DA9063_IRQ_REG_UVOV,
        DA9063_IRQ_DVC_RDY,
        DA9063_IRQ_VDD_MON,
        DA9063_IRQ_WARN,
        DA9063_IRQ_GPI0,
        DA9063_IRQ_GPI1,
        DA9063_IRQ_GPI2,
        DA9063_IRQ_GPI3,
        DA9063_IRQ_GPI4,
        DA9063_IRQ_GPI5,
        DA9063_IRQ_GPI6,
        DA9063_IRQ_GPI7,
        DA9063_IRQ_GPI8,
        DA9063_IRQ_GPI9,
        DA9063_IRQ_GPI10,
        DA9063_IRQ_GPI11,
        DA9063_IRQ_GPI12,
        DA9063_IRQ_GPI13,
        DA9063_IRQ_GPI14,
        DA9063_IRQ_GPI15;

    }

    @Type(noCCodeGeneration=true, cType="enum da9063_paged_read_msgs")
    public static enum da9063_paged_read_msgs implements Enum<da9063_paged_read_msgs>,
    TypedEnum<da9063_paged_read_msgs, Integer>
    {
        DA9063_PAGED_READ_MSG_PAGE_SEL,
        DA9063_PAGED_READ_MSG_REG_SEL,
        DA9063_PAGED_READ_MSG_DATA,
        DA9063_PAGED_READ_MSG_CNT;

    }

    @Type(noCCodeGeneration=true, cType="enum da9063_page_sel_buf_fmt")
    public static enum da9063_page_sel_buf_fmt implements Enum<da9063_page_sel_buf_fmt>,
    TypedEnum<da9063_page_sel_buf_fmt, Integer>
    {
        DA9063_PAGE_SEL_BUF_PAGE_REG,
        DA9063_PAGE_SEL_BUF_PAGE_VAL,
        DA9063_PAGE_SEL_BUF_SIZE;

    }

    @Type(noCCodeGeneration=true, cType="enum da9063_variant_codes")
    public static enum da9063_variant_codes implements Enum<da9063_variant_codes>,
    TypedEnum<da9063_variant_codes, Integer>
    {
        PMIC_DA9063_AD,
        PMIC_DA9063_BB,
        PMIC_DA9063_CA,
        PMIC_DA9063_DA,
        PMIC_DA9063_EA;

    }

    @Type(noCCodeGeneration=true, cType="enum da9063_type")
    public static enum da9063_type implements Enum<da9063_type>,
    TypedEnum<da9063_type, Integer>
    {
        PMIC_TYPE_DA9063,
        PMIC_TYPE_DA9063L;

    }
}

