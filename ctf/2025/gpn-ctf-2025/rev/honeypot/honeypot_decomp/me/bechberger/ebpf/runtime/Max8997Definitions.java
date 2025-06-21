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
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Max8997Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_irq_domain_map(Ptr<IrqDefinitions.irq_domain> d, @Unsigned int irq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8997_irq_exit(Ptr<max8997_dev> max8997) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_irq_init(Ptr<max8997_dev> max8997) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8997_irq_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8997_irq_mask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_irq_resume(Ptr<max8997_dev> max8997) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8997_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn max8997_irq_thread(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max8997_irq_unmask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_bulk_read(Ptr<I2cDefinitions.i2c_client> i2c, char reg, int count, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_bulk_write(Ptr<I2cDefinitions.i2c_client> i2c, char reg, int count, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_read_reg(Ptr<I2cDefinitions.i2c_client> i2c, char reg, Ptr<Character> dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_update_reg(Ptr<I2cDefinitions.i2c_client> i2c, char reg, char val, char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max8997_write_reg(Ptr<I2cDefinitions.i2c_client> i2c, char reg, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct max8997_irq_data")
    @NotUsableInJava
    public static class max8997_irq_data
    extends Struct {
        public int mask;
        public max8997_irq_source group;
    }

    @Type(noCCodeGeneration=true, cType="enum max8997_irq")
    public static enum max8997_irq implements Enum<max8997_irq>,
    TypedEnum<max8997_irq, Integer>
    {
        MAX8997_PMICIRQ_PWRONR,
        MAX8997_PMICIRQ_PWRONF,
        MAX8997_PMICIRQ_PWRON1SEC,
        MAX8997_PMICIRQ_JIGONR,
        MAX8997_PMICIRQ_JIGONF,
        MAX8997_PMICIRQ_LOWBAT2,
        MAX8997_PMICIRQ_LOWBAT1,
        MAX8997_PMICIRQ_JIGR,
        MAX8997_PMICIRQ_JIGF,
        MAX8997_PMICIRQ_MR,
        MAX8997_PMICIRQ_DVS1OK,
        MAX8997_PMICIRQ_DVS2OK,
        MAX8997_PMICIRQ_DVS3OK,
        MAX8997_PMICIRQ_DVS4OK,
        MAX8997_PMICIRQ_CHGINS,
        MAX8997_PMICIRQ_CHGRM,
        MAX8997_PMICIRQ_DCINOVP,
        MAX8997_PMICIRQ_TOPOFFR,
        MAX8997_PMICIRQ_CHGRSTF,
        MAX8997_PMICIRQ_MBCHGTMEXPD,
        MAX8997_PMICIRQ_RTC60S,
        MAX8997_PMICIRQ_RTCA1,
        MAX8997_PMICIRQ_RTCA2,
        MAX8997_PMICIRQ_SMPL_INT,
        MAX8997_PMICIRQ_RTC1S,
        MAX8997_PMICIRQ_WTSR,
        MAX8997_MUICIRQ_ADCError,
        MAX8997_MUICIRQ_ADCLow,
        MAX8997_MUICIRQ_ADC,
        MAX8997_MUICIRQ_VBVolt,
        MAX8997_MUICIRQ_DBChg,
        MAX8997_MUICIRQ_DCDTmr,
        MAX8997_MUICIRQ_ChgDetRun,
        MAX8997_MUICIRQ_ChgTyp,
        MAX8997_MUICIRQ_OVP,
        MAX8997_IRQ_NR;

    }

    @Type(noCCodeGeneration=true, cType="enum max8997_types")
    public static enum max8997_types implements Enum<max8997_types>,
    TypedEnum<max8997_types, Integer>
    {
        TYPE_MAX8997,
        TYPE_MAX8966;

    }

    @Type(noCCodeGeneration=true, cType="struct max8997_dev")
    @NotUsableInJava
    public static class max8997_dev
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<max8997_platform_data> pdata;
        public Ptr<I2cDefinitions.i2c_client> i2c;
        public Ptr<I2cDefinitions.i2c_client> rtc;
        public Ptr<I2cDefinitions.i2c_client> haptic;
        public Ptr<I2cDefinitions.i2c_client> muic;
        public runtime.mutex iolock;
        public @Unsigned long type;
        public Ptr<PlatformDefinitions.platform_device> battery;
        public int irq;
        public int ono;
        public Ptr<IrqDefinitions.irq_domain> irq_domain;
        public runtime.mutex irqlock;
        public int @Size(value=11) [] irq_masks_cur;
        public int @Size(value=11) [] irq_masks_cache;
        public char @Size(value=187) [] reg_dump;
        public boolean @Size(value=12) [] gpio_status;
    }

    @Type(noCCodeGeneration=true, cType="enum max8997_irq_source")
    public static enum max8997_irq_source implements Enum<max8997_irq_source>,
    TypedEnum<max8997_irq_source, Integer>
    {
        PMIC_INT1,
        PMIC_INT2,
        PMIC_INT3,
        PMIC_INT4,
        FUEL_GAUGE,
        MUIC_INT1,
        MUIC_INT2,
        MUIC_INT3,
        GPIO_LOW,
        GPIO_HI,
        FLASH_STATUS,
        MAX8997_IRQ_GROUP_NR;

    }

    @Type(noCCodeGeneration=true, cType="enum max8997_haptic_reg")
    public static enum max8997_haptic_reg implements Enum<max8997_haptic_reg>,
    TypedEnum<max8997_haptic_reg, Integer>
    {
        MAX8997_HAPTIC_REG_GENERAL,
        MAX8997_HAPTIC_REG_CONF1,
        MAX8997_HAPTIC_REG_CONF2,
        MAX8997_HAPTIC_REG_DRVCONF,
        MAX8997_HAPTIC_REG_CYCLECONF1,
        MAX8997_HAPTIC_REG_CYCLECONF2,
        MAX8997_HAPTIC_REG_SIGCONF1,
        MAX8997_HAPTIC_REG_SIGCONF2,
        MAX8997_HAPTIC_REG_SIGCONF3,
        MAX8997_HAPTIC_REG_SIGCONF4,
        MAX8997_HAPTIC_REG_SIGDC1,
        MAX8997_HAPTIC_REG_SIGDC2,
        MAX8997_HAPTIC_REG_SIGPWMDC1,
        MAX8997_HAPTIC_REG_SIGPWMDC2,
        MAX8997_HAPTIC_REG_SIGPWMDC3,
        MAX8997_HAPTIC_REG_SIGPWMDC4,
        MAX8997_HAPTIC_REG_MTR_REV,
        MAX8997_HAPTIC_REG_END;

    }

    @Type(noCCodeGeneration=true, cType="enum max8997_muic_reg")
    public static enum max8997_muic_reg implements Enum<max8997_muic_reg>,
    TypedEnum<max8997_muic_reg, Integer>
    {
        MAX8997_MUIC_REG_ID,
        MAX8997_MUIC_REG_INT1,
        MAX8997_MUIC_REG_INT2,
        MAX8997_MUIC_REG_INT3,
        MAX8997_MUIC_REG_STATUS1,
        MAX8997_MUIC_REG_STATUS2,
        MAX8997_MUIC_REG_STATUS3,
        MAX8997_MUIC_REG_INTMASK1,
        MAX8997_MUIC_REG_INTMASK2,
        MAX8997_MUIC_REG_INTMASK3,
        MAX8997_MUIC_REG_CDETCTRL,
        MAX8997_MUIC_REG_CONTROL1,
        MAX8997_MUIC_REG_CONTROL2,
        MAX8997_MUIC_REG_CONTROL3,
        MAX8997_MUIC_REG_END;

    }

    @Type(noCCodeGeneration=true, cType="enum max8997_pmic_reg")
    public static enum max8997_pmic_reg implements Enum<max8997_pmic_reg>,
    TypedEnum<max8997_pmic_reg, Integer>
    {
        MAX8997_REG_PMIC_ID0,
        MAX8997_REG_PMIC_ID1,
        MAX8997_REG_INTSRC,
        MAX8997_REG_INT1,
        MAX8997_REG_INT2,
        MAX8997_REG_INT3,
        MAX8997_REG_INT4,
        MAX8997_REG_INT1MSK,
        MAX8997_REG_INT2MSK,
        MAX8997_REG_INT3MSK,
        MAX8997_REG_INT4MSK,
        MAX8997_REG_STATUS1,
        MAX8997_REG_STATUS2,
        MAX8997_REG_STATUS3,
        MAX8997_REG_STATUS4,
        MAX8997_REG_MAINCON1,
        MAX8997_REG_MAINCON2,
        MAX8997_REG_BUCKRAMP,
        MAX8997_REG_BUCK1CTRL,
        MAX8997_REG_BUCK1DVS1,
        MAX8997_REG_BUCK1DVS2,
        MAX8997_REG_BUCK1DVS3,
        MAX8997_REG_BUCK1DVS4,
        MAX8997_REG_BUCK1DVS5,
        MAX8997_REG_BUCK1DVS6,
        MAX8997_REG_BUCK1DVS7,
        MAX8997_REG_BUCK1DVS8,
        MAX8997_REG_BUCK2CTRL,
        MAX8997_REG_BUCK2DVS1,
        MAX8997_REG_BUCK2DVS2,
        MAX8997_REG_BUCK2DVS3,
        MAX8997_REG_BUCK2DVS4,
        MAX8997_REG_BUCK2DVS5,
        MAX8997_REG_BUCK2DVS6,
        MAX8997_REG_BUCK2DVS7,
        MAX8997_REG_BUCK2DVS8,
        MAX8997_REG_BUCK3CTRL,
        MAX8997_REG_BUCK3DVS,
        MAX8997_REG_BUCK4CTRL,
        MAX8997_REG_BUCK4DVS,
        MAX8997_REG_BUCK5CTRL,
        MAX8997_REG_BUCK5DVS1,
        MAX8997_REG_BUCK5DVS2,
        MAX8997_REG_BUCK5DVS3,
        MAX8997_REG_BUCK5DVS4,
        MAX8997_REG_BUCK5DVS5,
        MAX8997_REG_BUCK5DVS6,
        MAX8997_REG_BUCK5DVS7,
        MAX8997_REG_BUCK5DVS8,
        MAX8997_REG_BUCK6CTRL,
        MAX8997_REG_BUCK6BPSKIPCTRL,
        MAX8997_REG_BUCK7CTRL,
        MAX8997_REG_BUCK7DVS,
        MAX8997_REG_LDO1CTRL,
        MAX8997_REG_LDO2CTRL,
        MAX8997_REG_LDO3CTRL,
        MAX8997_REG_LDO4CTRL,
        MAX8997_REG_LDO5CTRL,
        MAX8997_REG_LDO6CTRL,
        MAX8997_REG_LDO7CTRL,
        MAX8997_REG_LDO8CTRL,
        MAX8997_REG_LDO9CTRL,
        MAX8997_REG_LDO10CTRL,
        MAX8997_REG_LDO11CTRL,
        MAX8997_REG_LDO12CTRL,
        MAX8997_REG_LDO13CTRL,
        MAX8997_REG_LDO14CTRL,
        MAX8997_REG_LDO15CTRL,
        MAX8997_REG_LDO16CTRL,
        MAX8997_REG_LDO17CTRL,
        MAX8997_REG_LDO18CTRL,
        MAX8997_REG_LDO21CTRL,
        MAX8997_REG_MBCCTRL1,
        MAX8997_REG_MBCCTRL2,
        MAX8997_REG_MBCCTRL3,
        MAX8997_REG_MBCCTRL4,
        MAX8997_REG_MBCCTRL5,
        MAX8997_REG_MBCCTRL6,
        MAX8997_REG_OTPCGHCVS,
        MAX8997_REG_SAFEOUTCTRL,
        MAX8997_REG_LBCNFG1,
        MAX8997_REG_LBCNFG2,
        MAX8997_REG_BBCCTRL,
        MAX8997_REG_FLASH1_CUR,
        MAX8997_REG_FLASH2_CUR,
        MAX8997_REG_MOVIE_CUR,
        MAX8997_REG_GSMB_CUR,
        MAX8997_REG_BOOST_CNTL,
        MAX8997_REG_LEN_CNTL,
        MAX8997_REG_FLASH_CNTL,
        MAX8997_REG_WDT_CNTL,
        MAX8997_REG_MAXFLASH1,
        MAX8997_REG_MAXFLASH2,
        MAX8997_REG_FLASHSTATUS,
        MAX8997_REG_FLASHSTATUSMASK,
        MAX8997_REG_GPIOCNTL1,
        MAX8997_REG_GPIOCNTL2,
        MAX8997_REG_GPIOCNTL3,
        MAX8997_REG_GPIOCNTL4,
        MAX8997_REG_GPIOCNTL5,
        MAX8997_REG_GPIOCNTL6,
        MAX8997_REG_GPIOCNTL7,
        MAX8997_REG_GPIOCNTL8,
        MAX8997_REG_GPIOCNTL9,
        MAX8997_REG_GPIOCNTL10,
        MAX8997_REG_GPIOCNTL11,
        MAX8997_REG_GPIOCNTL12,
        MAX8997_REG_LDO1CONFIG,
        MAX8997_REG_LDO2CONFIG,
        MAX8997_REG_LDO3CONFIG,
        MAX8997_REG_LDO4CONFIG,
        MAX8997_REG_LDO5CONFIG,
        MAX8997_REG_LDO6CONFIG,
        MAX8997_REG_LDO7CONFIG,
        MAX8997_REG_LDO8CONFIG,
        MAX8997_REG_LDO9CONFIG,
        MAX8997_REG_LDO10CONFIG,
        MAX8997_REG_LDO11CONFIG,
        MAX8997_REG_LDO12CONFIG,
        MAX8997_REG_LDO13CONFIG,
        MAX8997_REG_LDO14CONFIG,
        MAX8997_REG_LDO15CONFIG,
        MAX8997_REG_LDO16CONFIG,
        MAX8997_REG_LDO17CONFIG,
        MAX8997_REG_LDO18CONFIG,
        MAX8997_REG_LDO21CONFIG,
        MAX8997_REG_DVSOKTIMER1,
        MAX8997_REG_DVSOKTIMER2,
        MAX8997_REG_DVSOKTIMER4,
        MAX8997_REG_DVSOKTIMER5,
        MAX8997_REG_PMIC_END;

    }

    @Type(noCCodeGeneration=true, cType="struct max8997_platform_data")
    @NotUsableInJava
    public static class max8997_platform_data
    extends Struct {
        public int ono;
        public Ptr<max8997_regulator_data> regulators;
        public int num_regulators;
        public boolean ignore_gpiodvs_side_effect;
        public int buck125_default_idx;
        public @Unsigned int @Size(value=8) [] buck1_voltage;
        public boolean buck1_gpiodvs;
        public @Unsigned int @Size(value=8) [] buck2_voltage;
        public boolean buck2_gpiodvs;
        public @Unsigned int @Size(value=8) [] buck5_voltage;
        public boolean buck5_gpiodvs;
        public int eoc_mA;
        public int timeout;
        public Ptr<max8997_muic_platform_data> muic_pdata;
        public Ptr<max8997_haptic_platform_data> haptic_pdata;
        public Ptr<max8997_led_platform_data> led_pdata;
    }

    @Type(noCCodeGeneration=true, cType="struct max8997_led_platform_data")
    @NotUsableInJava
    public static class max8997_led_platform_data
    extends Struct {
        public max8997_led_mode @Size(value=2) [] mode;
        public char @Size(value=2) [] brightness;
    }

    @Type(noCCodeGeneration=true, cType="enum max8997_led_mode")
    public static enum max8997_led_mode implements Enum<max8997_led_mode>,
    TypedEnum<max8997_led_mode, Integer>
    {
        MAX8997_NONE,
        MAX8997_FLASH_MODE,
        MAX8997_MOVIE_MODE,
        MAX8997_FLASH_PIN_CONTROL_MODE,
        MAX8997_MOVIE_PIN_CONTROL_MODE;

    }

    @Type(noCCodeGeneration=true, cType="struct max8997_haptic_platform_data")
    @NotUsableInJava
    public static class max8997_haptic_platform_data
    extends Struct {
        public @Unsigned int pwm_period;
        public max8997_haptic_motor_type type;
        public max8997_haptic_pulse_mode mode;
        public max8997_haptic_pwm_divisor pwm_divisor;
        public @Unsigned int internal_mode_pattern;
        public @Unsigned int pattern_cycle;
        public @Unsigned int pattern_signal_period;
    }

    @Type(noCCodeGeneration=true, cType="enum max8997_haptic_pwm_divisor")
    public static enum max8997_haptic_pwm_divisor implements Enum<max8997_haptic_pwm_divisor>,
    TypedEnum<max8997_haptic_pwm_divisor, Integer>
    {
        MAX8997_PWM_DIVISOR_32,
        MAX8997_PWM_DIVISOR_64,
        MAX8997_PWM_DIVISOR_128,
        MAX8997_PWM_DIVISOR_256;

    }

    @Type(noCCodeGeneration=true, cType="enum max8997_haptic_pulse_mode")
    public static enum max8997_haptic_pulse_mode implements Enum<max8997_haptic_pulse_mode>,
    TypedEnum<max8997_haptic_pulse_mode, Integer>
    {
        MAX8997_EXTERNAL_MODE,
        MAX8997_INTERNAL_MODE;

    }

    @Type(noCCodeGeneration=true, cType="enum max8997_haptic_motor_type")
    public static enum max8997_haptic_motor_type implements Enum<max8997_haptic_motor_type>,
    TypedEnum<max8997_haptic_motor_type, Integer>
    {
        MAX8997_HAPTIC_ERM,
        MAX8997_HAPTIC_LRA;

    }

    @Type(noCCodeGeneration=true, cType="struct max8997_muic_platform_data")
    @NotUsableInJava
    public static class max8997_muic_platform_data
    extends Struct {
        public Ptr<max8997_muic_reg_data> init_data;
        public int num_init_data;
        public int detcable_delay_ms;
        public int path_usb;
        public int path_uart;
    }

    @Type(noCCodeGeneration=true, cType="struct max8997_muic_reg_data")
    @NotUsableInJava
    public static class max8997_muic_reg_data
    extends Struct {
        public char addr;
        public char data;
    }

    @Type(noCCodeGeneration=true, cType="struct max8997_regulator_data")
    @NotUsableInJava
    public static class max8997_regulator_data
    extends Struct {
        public int id;
        public Ptr<RegulatorDefinitions.regulator_init_data> initdata;
        public Ptr<DeviceDefinitions.device_node> reg_node;
    }
}

