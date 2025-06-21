/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
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

public final class Max77693Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max77693_i2c_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max77693_i2c_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max77693_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max77693_i2c_remove(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max77693_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max77693_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum max77693_haptic_reg")
    public static enum max77693_haptic_reg implements Enum<max77693_haptic_reg>,
    TypedEnum<max77693_haptic_reg, Integer>
    {
        MAX77693_HAPTIC_REG_STATUS,
        MAX77693_HAPTIC_REG_CONFIG1,
        MAX77693_HAPTIC_REG_CONFIG2,
        MAX77693_HAPTIC_REG_CONFIG_CHNL,
        MAX77693_HAPTIC_REG_CONFG_CYC1,
        MAX77693_HAPTIC_REG_CONFG_CYC2,
        MAX77693_HAPTIC_REG_CONFIG_PER1,
        MAX77693_HAPTIC_REG_CONFIG_PER2,
        MAX77693_HAPTIC_REG_CONFIG_PER3,
        MAX77693_HAPTIC_REG_CONFIG_PER4,
        MAX77693_HAPTIC_REG_CONFIG_DUTY1,
        MAX77693_HAPTIC_REG_CONFIG_DUTY2,
        MAX77693_HAPTIC_REG_CONFIG_PWM1,
        MAX77693_HAPTIC_REG_CONFIG_PWM2,
        MAX77693_HAPTIC_REG_CONFIG_PWM3,
        MAX77693_HAPTIC_REG_CONFIG_PWM4,
        MAX77693_HAPTIC_REG_REV,
        MAX77693_HAPTIC_REG_END;

    }

    @Type(noCCodeGeneration=true, cType="enum max77693_muic_reg")
    public static enum max77693_muic_reg implements Enum<max77693_muic_reg>,
    TypedEnum<max77693_muic_reg, Integer>
    {
        MAX77693_MUIC_REG_ID,
        MAX77693_MUIC_REG_INT1,
        MAX77693_MUIC_REG_INT2,
        MAX77693_MUIC_REG_INT3,
        MAX77693_MUIC_REG_STATUS1,
        MAX77693_MUIC_REG_STATUS2,
        MAX77693_MUIC_REG_STATUS3,
        MAX77693_MUIC_REG_INTMASK1,
        MAX77693_MUIC_REG_INTMASK2,
        MAX77693_MUIC_REG_INTMASK3,
        MAX77693_MUIC_REG_CDETCTRL1,
        MAX77693_MUIC_REG_CDETCTRL2,
        MAX77693_MUIC_REG_CTRL1,
        MAX77693_MUIC_REG_CTRL2,
        MAX77693_MUIC_REG_CTRL3,
        MAX77693_MUIC_REG_END;

    }

    @Type(noCCodeGeneration=true, cType="enum max77693_pmic_reg")
    public static enum max77693_pmic_reg implements Enum<max77693_pmic_reg>,
    TypedEnum<max77693_pmic_reg, Integer>
    {
        MAX77693_LED_REG_IFLASH1,
        MAX77693_LED_REG_IFLASH2,
        MAX77693_LED_REG_ITORCH,
        MAX77693_LED_REG_ITORCHTIMER,
        MAX77693_LED_REG_FLASH_TIMER,
        MAX77693_LED_REG_FLASH_EN,
        MAX77693_LED_REG_MAX_FLASH1,
        MAX77693_LED_REG_MAX_FLASH2,
        MAX77693_LED_REG_MAX_FLASH3,
        MAX77693_LED_REG_MAX_FLASH4,
        MAX77693_LED_REG_VOUT_CNTL,
        MAX77693_LED_REG_VOUT_FLASH1,
        MAX77693_LED_REG_VOUT_FLASH2,
        MAX77693_LED_REG_FLASH_INT,
        MAX77693_LED_REG_FLASH_INT_MASK,
        MAX77693_LED_REG_FLASH_STATUS,
        MAX77693_PMIC_REG_PMIC_ID1,
        MAX77693_PMIC_REG_PMIC_ID2,
        MAX77693_PMIC_REG_INTSRC,
        MAX77693_PMIC_REG_INTSRC_MASK,
        MAX77693_PMIC_REG_TOPSYS_INT,
        MAX77693_PMIC_REG_TOPSYS_INT_MASK,
        MAX77693_PMIC_REG_TOPSYS_STAT,
        MAX77693_PMIC_REG_MAINCTRL1,
        MAX77693_PMIC_REG_LSCNFG,
        MAX77693_CHG_REG_CHG_INT,
        MAX77693_CHG_REG_CHG_INT_MASK,
        MAX77693_CHG_REG_CHG_INT_OK,
        MAX77693_CHG_REG_CHG_DETAILS_00,
        MAX77693_CHG_REG_CHG_DETAILS_01,
        MAX77693_CHG_REG_CHG_DETAILS_02,
        MAX77693_CHG_REG_CHG_DETAILS_03,
        MAX77693_CHG_REG_CHG_CNFG_00,
        MAX77693_CHG_REG_CHG_CNFG_01,
        MAX77693_CHG_REG_CHG_CNFG_02,
        MAX77693_CHG_REG_CHG_CNFG_03,
        MAX77693_CHG_REG_CHG_CNFG_04,
        MAX77693_CHG_REG_CHG_CNFG_05,
        MAX77693_CHG_REG_CHG_CNFG_06,
        MAX77693_CHG_REG_CHG_CNFG_07,
        MAX77693_CHG_REG_CHG_CNFG_08,
        MAX77693_CHG_REG_CHG_CNFG_09,
        MAX77693_CHG_REG_CHG_CNFG_10,
        MAX77693_CHG_REG_CHG_CNFG_11,
        MAX77693_CHG_REG_CHG_CNFG_12,
        MAX77693_CHG_REG_CHG_CNFG_13,
        MAX77693_CHG_REG_CHG_CNFG_14,
        MAX77693_CHG_REG_SAFEOUT_CTRL,
        MAX77693_PMIC_REG_END;

    }

    @Type(noCCodeGeneration=true, cType="struct max77693_dev")
    @NotUsableInJava
    public static class max77693_dev
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<I2cDefinitions.i2c_client> i2c;
        public Ptr<I2cDefinitions.i2c_client> i2c_muic;
        public Ptr<I2cDefinitions.i2c_client> i2c_haptic;
        public Ptr<I2cDefinitions.i2c_client> i2c_chg;
        public max77693_types type;
        public Ptr<runtime.regmap> regmap;
        public Ptr<runtime.regmap> regmap_muic;
        public Ptr<runtime.regmap> regmap_haptic;
        public Ptr<runtime.regmap> regmap_chg;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_data_led;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_data_topsys;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_data_chg;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_data_muic;
        public int irq;
    }

    @Type(noCCodeGeneration=true, cType="enum max77693_types")
    public static enum max77693_types implements Enum<max77693_types>,
    TypedEnum<max77693_types, Integer>
    {
        TYPE_MAX77693_UNKNOWN,
        TYPE_MAX77693,
        TYPE_MAX77843,
        TYPE_MAX77693_NUM;

    }
}

