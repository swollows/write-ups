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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.ExtconDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RegmapDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PalmasDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_ext_control_req_config(Ptr<palmas> palmas2, palmas_external_requestor_id id, int ext_ctrl, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void palmas_i2c_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void palmas_i2c_remove(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_gpio_get(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_gpio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_gpio_input(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_gpio_output(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_gpio_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void palmas_gpio_set(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int palmas_gpio_to_irq(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct palmas")
    @NotUsableInJava
    public static class palmas
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<I2cDefinitions.i2c_client> @Size(value=3) [] i2c_clients;
        public Ptr<runtime.regmap> @Size(value=3) [] regmap;
        public int id;
        public @Unsigned int features;
        public int irq;
        public @Unsigned int irq_mask;
        public runtime.mutex irq_lock;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_data;
        public Ptr<palmas_pmic_driver_data> pmic_ddata;
        public Ptr<palmas_pmic> pmic;
        public @OriginalName(value="palmas_gpadc") Ptr<?> gpadc;
        public Ptr<palmas_resource> resource;
        public Ptr<palmas_usb> usb;
        public char gpio_muxed;
        public char led_muxed;
        public char pwm_muxed;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_device_data")
    @NotUsableInJava
    public static class palmas_device_data
    extends Struct {
        public int ngpio;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_gpio")
    @NotUsableInJava
    public static class palmas_gpio
    extends Struct {
        public GpioDefinitions.gpio_chip gpio_chip;
        public Ptr<palmas> palmas;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_driver_data")
    @NotUsableInJava
    public static class palmas_driver_data
    extends Struct {
        public @Unsigned int features;
        public Ptr<RegmapDefinitions.regmap_irq_chip> irq_chip;
    }

    @Type(noCCodeGeneration=true, cType="enum palmas_irqs")
    public static enum palmas_irqs implements Enum<palmas_irqs>,
    TypedEnum<palmas_irqs, Integer>
    {
        PALMAS_CHARG_DET_N_VBUS_OVV_IRQ,
        PALMAS_PWRON_IRQ,
        PALMAS_LONG_PRESS_KEY_IRQ,
        PALMAS_RPWRON_IRQ,
        PALMAS_PWRDOWN_IRQ,
        PALMAS_HOTDIE_IRQ,
        PALMAS_VSYS_MON_IRQ,
        PALMAS_VBAT_MON_IRQ,
        PALMAS_RTC_ALARM_IRQ,
        PALMAS_RTC_TIMER_IRQ,
        PALMAS_WDT_IRQ,
        PALMAS_BATREMOVAL_IRQ,
        PALMAS_RESET_IN_IRQ,
        PALMAS_FBI_BB_IRQ,
        PALMAS_SHORT_IRQ,
        PALMAS_VAC_ACOK_IRQ,
        PALMAS_GPADC_AUTO_0_IRQ,
        PALMAS_GPADC_AUTO_1_IRQ,
        PALMAS_GPADC_EOC_SW_IRQ,
        PALMAS_GPADC_EOC_RT_IRQ,
        PALMAS_ID_OTG_IRQ,
        PALMAS_ID_IRQ,
        PALMAS_VBUS_OTG_IRQ,
        PALMAS_VBUS_IRQ,
        PALMAS_GPIO_0_IRQ,
        PALMAS_GPIO_1_IRQ,
        PALMAS_GPIO_2_IRQ,
        PALMAS_GPIO_3_IRQ,
        PALMAS_GPIO_4_IRQ,
        PALMAS_GPIO_5_IRQ,
        PALMAS_GPIO_6_IRQ,
        PALMAS_GPIO_7_IRQ,
        PALMAS_NUM_IRQ;

    }

    @Type(noCCodeGeneration=true, cType="struct palmas_platform_data")
    @NotUsableInJava
    public static class palmas_platform_data
    extends Struct {
        public int irq_flags;
        public int gpio_base;
        public char power_ctrl;
        public int mux_from_pdata;
        public char pad1;
        public char pad2;
        public boolean pm_off;
        public Ptr<palmas_pmic_platform_data> pmic_pdata;
        public Ptr<palmas_gpadc_platform_data> gpadc_pdata;
        public Ptr<palmas_usb_platform_data> usb_pdata;
        public Ptr<palmas_resource_platform_data> resource_pdata;
        public Ptr<palmas_clk_platform_data> clk_pdata;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_clk_platform_data")
    @NotUsableInJava
    public static class palmas_clk_platform_data
    extends Struct {
        public int clk32kg_mode_sleep;
        public int clk32kgaudio_mode_sleep;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_resource_platform_data")
    @NotUsableInJava
    public static class palmas_resource_platform_data
    extends Struct {
        public int regen1_mode_sleep;
        public int regen2_mode_sleep;
        public int sysen1_mode_sleep;
        public int sysen2_mode_sleep;
        public char nsleep_res;
        public char nsleep_smps;
        public char nsleep_ldo1;
        public char nsleep_ldo2;
        public char enable1_res;
        public char enable1_smps;
        public char enable1_ldo1;
        public char enable1_ldo2;
        public char enable2_res;
        public char enable2_smps;
        public char enable2_ldo1;
        public char enable2_ldo2;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_usb_platform_data")
    @NotUsableInJava
    public static class palmas_usb_platform_data
    extends Struct {
        public int wakeup;
    }

    @Type(noCCodeGeneration=true, cType="enum palmas_external_requestor_id")
    public static enum palmas_external_requestor_id implements Enum<palmas_external_requestor_id>,
    TypedEnum<palmas_external_requestor_id, Integer>
    {
        PALMAS_EXTERNAL_REQSTR_ID_REGEN1,
        PALMAS_EXTERNAL_REQSTR_ID_REGEN2,
        PALMAS_EXTERNAL_REQSTR_ID_SYSEN1,
        PALMAS_EXTERNAL_REQSTR_ID_SYSEN2,
        PALMAS_EXTERNAL_REQSTR_ID_CLK32KG,
        PALMAS_EXTERNAL_REQSTR_ID_CLK32KGAUDIO,
        PALMAS_EXTERNAL_REQSTR_ID_REGEN3,
        PALMAS_EXTERNAL_REQSTR_ID_SMPS12,
        PALMAS_EXTERNAL_REQSTR_ID_SMPS3,
        PALMAS_EXTERNAL_REQSTR_ID_SMPS45,
        PALMAS_EXTERNAL_REQSTR_ID_SMPS6,
        PALMAS_EXTERNAL_REQSTR_ID_SMPS7,
        PALMAS_EXTERNAL_REQSTR_ID_SMPS8,
        PALMAS_EXTERNAL_REQSTR_ID_SMPS9,
        PALMAS_EXTERNAL_REQSTR_ID_SMPS10,
        PALMAS_EXTERNAL_REQSTR_ID_LDO1,
        PALMAS_EXTERNAL_REQSTR_ID_LDO2,
        PALMAS_EXTERNAL_REQSTR_ID_LDO3,
        PALMAS_EXTERNAL_REQSTR_ID_LDO4,
        PALMAS_EXTERNAL_REQSTR_ID_LDO5,
        PALMAS_EXTERNAL_REQSTR_ID_LDO6,
        PALMAS_EXTERNAL_REQSTR_ID_LDO7,
        PALMAS_EXTERNAL_REQSTR_ID_LDO8,
        PALMAS_EXTERNAL_REQSTR_ID_LDO9,
        PALMAS_EXTERNAL_REQSTR_ID_LDOLN,
        PALMAS_EXTERNAL_REQSTR_ID_LDOUSB,
        PALMAS_EXTERNAL_REQSTR_ID_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum palmas_regulators")
    public static enum palmas_regulators implements Enum<palmas_regulators>,
    TypedEnum<palmas_regulators, Integer>
    {
        PALMAS_REG_SMPS12,
        PALMAS_REG_SMPS123,
        PALMAS_REG_SMPS3,
        PALMAS_REG_SMPS45,
        PALMAS_REG_SMPS457,
        PALMAS_REG_SMPS6,
        PALMAS_REG_SMPS7,
        PALMAS_REG_SMPS8,
        PALMAS_REG_SMPS9,
        PALMAS_REG_SMPS10_OUT2,
        PALMAS_REG_SMPS10_OUT1,
        PALMAS_REG_LDO1,
        PALMAS_REG_LDO2,
        PALMAS_REG_LDO3,
        PALMAS_REG_LDO4,
        PALMAS_REG_LDO5,
        PALMAS_REG_LDO6,
        PALMAS_REG_LDO7,
        PALMAS_REG_LDO8,
        PALMAS_REG_LDO9,
        PALMAS_REG_LDOLN,
        PALMAS_REG_LDOUSB,
        PALMAS_REG_REGEN1,
        PALMAS_REG_REGEN2,
        PALMAS_REG_REGEN3,
        PALMAS_REG_SYSEN1,
        PALMAS_REG_SYSEN2,
        PALMAS_NUM_REGS;

    }

    @Type(noCCodeGeneration=true, cType="struct palmas_reg_init")
    @NotUsableInJava
    public static class palmas_reg_init
    extends Struct {
        public int warm_reset;
        public int roof_floor;
        public int mode_sleep;
        public char vsel;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_gpadc_platform_data")
    @NotUsableInJava
    public static class palmas_gpadc_platform_data
    extends Struct {
        public int ch3_current;
        public int ch0_current;
        public boolean extended_delay;
        public int bat_removal;
        public int start_polarity;
        public int auto_conversion_period_ms;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_pmic_platform_data")
    @NotUsableInJava
    public static class palmas_pmic_platform_data
    extends Struct {
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=27) [] reg_data;
        public Ptr<palmas_reg_init> @Size(value=27) [] reg_init;
        public int ldo6_vibrator;
        public boolean enable_ldo8_tracking;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_regs_info")
    @NotUsableInJava
    public static class palmas_regs_info
    extends Struct {
        public String name;
        public String sname;
        public char vsel_addr;
        public char ctrl_addr;
        public char tstep_addr;
        public int sleep_id;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_sleep_requestor_info")
    @NotUsableInJava
    public static class palmas_sleep_requestor_info
    extends Struct {
        public int id;
        public int reg_offset;
        public int bit_pos;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_usb")
    @NotUsableInJava
    public static class palmas_usb
    extends Struct {
        public Ptr<palmas> palmas;
        public Ptr<runtime.device> dev;
        public Ptr<ExtconDefinitions.extcon_dev> edev;
        public int id_otg_irq;
        public int id_irq;
        public int vbus_otg_irq;
        public int vbus_irq;
        public int gpio_id_irq;
        public int gpio_vbus_irq;
        public Ptr<GpioDefinitions.gpio_desc> id_gpiod;
        public Ptr<GpioDefinitions.gpio_desc> vbus_gpiod;
        public @Unsigned long sw_debounce_jiffies;
        public DelayedDefinitions.delayed_work wq_detectid;
        public palmas_usb_state linkstat;
        public int wakeup;
        public boolean enable_vbus_detection;
        public boolean enable_id_detection;
        public boolean enable_gpio_id_detection;
        public boolean enable_gpio_vbus_detection;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_resource")
    @NotUsableInJava
    public static class palmas_resource
    extends Struct {
        public Ptr<palmas> palmas;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_pmic")
    @NotUsableInJava
    public static class palmas_pmic
    extends Struct {
        public Ptr<palmas> palmas;
        public Ptr<runtime.device> dev;
        public RegulatorDefinitions.regulator_desc @Size(value=27) [] desc;
        public runtime.mutex mutex;
        public int smps123;
        public int smps457;
        public int smps12;
        public int @Size(value=10) [] range;
        public @Unsigned int @Size(value=10) [] ramp_delay;
        public @Unsigned int @Size(value=10) [] current_reg_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct palmas_pmic_driver_data")
    @NotUsableInJava
    public static class palmas_pmic_driver_data
    extends Struct {
        public int smps_start;
        public int smps_end;
        public int ldo_begin;
        public int ldo_end;
        public int max_reg;
        public boolean has_regen3;
        public Ptr<palmas_regs_info> palmas_regs_info;
        public @OriginalName(value="of_regulator_match") Ptr<?> palmas_matches;
        public Ptr<palmas_sleep_requestor_info> sleep_req_info;
        public Ptr<?> smps_register;
        public Ptr<?> ldo_register;
    }

    @Type(noCCodeGeneration=true, cType="enum palmas_usb_state")
    public static enum palmas_usb_state implements Enum<palmas_usb_state>,
    TypedEnum<palmas_usb_state, Integer>
    {
        PALMAS_USB_STATE_DISCONNECT,
        PALMAS_USB_STATE_VBUS,
        PALMAS_USB_STATE_ID;

    }
}

