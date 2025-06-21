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
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Lp8788Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lp8788_irq_bus_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lp8788_irq_bus_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lp8788_irq_disable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lp8788_irq_enable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lp8788_irq_exit(Ptr<lp8788> lp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn lp8788_irq_handler(int irq, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lp8788_irq_init(Ptr<lp8788> lp, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lp8788_irq_map(Ptr<IrqDefinitions.irq_domain> d, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lp8788_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lp8788_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lp8788_probe(Ptr<I2cDefinitions.i2c_client> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lp8788_read_byte(Ptr<lp8788> lp, char reg, Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lp8788_read_multi_bytes(Ptr<lp8788> lp, char reg, Ptr<Character> data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lp8788_remove(Ptr<I2cDefinitions.i2c_client> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lp8788_update_bits(Ptr<lp8788> lp, char reg, char mask, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lp8788_write_byte(Ptr<lp8788> lp, char reg, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788")
    @NotUsableInJava
    public static class lp8788
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<runtime.regmap> regmap;
        public Ptr<IrqDefinitions.irq_domain> irqdm;
        public int irq;
        public Ptr<lp8788_platform_data> pdata;
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788_irq_data")
    @NotUsableInJava
    public static class lp8788_irq_data
    extends Struct {
        public Ptr<lp8788> lp;
        public runtime.mutex irq_lock;
        public Ptr<IrqDefinitions.irq_domain> domain;
        public int @Size(value=24) [] enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788_platform_data")
    @NotUsableInJava
    public static class lp8788_platform_data
    extends Struct {
        public Ptr<?> init_func;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=4) [] buck_data;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=12) [] dldo_data;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=10) [] aldo_data;
        public Ptr<lp8788_buck1_dvs> buck1_dvs;
        public Ptr<lp8788_buck2_dvs> buck2_dvs;
        public Ptr<lp8788_charger_platform_data> chg_pdata;
        public lp8788_alarm_sel alarm_sel;
        public Ptr<lp8788_led_platform_data> led_pdata;
        public Ptr<lp8788_vib_platform_data> vib_pdata;
        public @OriginalName(value="iio_map") Ptr<?> adc_pdata;
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788_vib_platform_data")
    @NotUsableInJava
    public static class lp8788_vib_platform_data
    extends Struct {
        public String name;
        public lp8788_isink_scale scale;
        public lp8788_isink_number num;
        public int iout_code;
        public int pwm_code;
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788_led_platform_data")
    @NotUsableInJava
    public static class lp8788_led_platform_data
    extends Struct {
        public String name;
        public lp8788_isink_scale scale;
        public lp8788_isink_number num;
        public int iout_code;
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788_charger_platform_data")
    @NotUsableInJava
    public static class lp8788_charger_platform_data
    extends Struct {
        public String adc_vbatt;
        public String adc_batt_temp;
        public @Unsigned int max_vbatt_mv;
        public Ptr<lp8788_chg_param> chg_params;
        public int num_chg_params;
        public Ptr<?> charger_event;
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788_chg_param")
    @NotUsableInJava
    public static class lp8788_chg_param
    extends Struct {
        public char addr;
        public char val;
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788_buck2_dvs")
    @NotUsableInJava
    public static class lp8788_buck2_dvs
    extends Struct {
        public lp8788_dvs_sel vsel;
    }

    @Type(noCCodeGeneration=true, cType="struct lp8788_buck1_dvs")
    @NotUsableInJava
    public static class lp8788_buck1_dvs
    extends Struct {
        public lp8788_dvs_sel vsel;
    }

    @Type(noCCodeGeneration=true, cType="enum lp8788_alarm_sel")
    public static enum lp8788_alarm_sel implements Enum<lp8788_alarm_sel>,
    TypedEnum<lp8788_alarm_sel, Integer>
    {
        LP8788_ALARM_1,
        LP8788_ALARM_2,
        LP8788_ALARM_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum lp8788_isink_number")
    public static enum lp8788_isink_number implements Enum<lp8788_isink_number>,
    TypedEnum<lp8788_isink_number, Integer>
    {
        LP8788_ISINK_1,
        LP8788_ISINK_2,
        LP8788_ISINK_3;

    }

    @Type(noCCodeGeneration=true, cType="enum lp8788_isink_scale")
    public static enum lp8788_isink_scale implements Enum<lp8788_isink_scale>,
    TypedEnum<lp8788_isink_scale, Integer>
    {
        LP8788_ISINK_SCALE_100mA,
        LP8788_ISINK_SCALE_120mA;

    }

    @Type(noCCodeGeneration=true, cType="enum lp8788_charger_event")
    public static enum lp8788_charger_event implements Enum<lp8788_charger_event>,
    TypedEnum<lp8788_charger_event, Integer>
    {
        NO_CHARGER,
        CHARGER_DETECTED;

    }

    @Type(noCCodeGeneration=true, cType="enum lp8788_dvs_sel")
    public static enum lp8788_dvs_sel implements Enum<lp8788_dvs_sel>,
    TypedEnum<lp8788_dvs_sel, Integer>
    {
        DVS_SEL_V0,
        DVS_SEL_V1,
        DVS_SEL_V2,
        DVS_SEL_V3;

    }

    @Type(noCCodeGeneration=true, cType="enum lp8788_int_id")
    public static enum lp8788_int_id implements Enum<lp8788_int_id>,
    TypedEnum<lp8788_int_id, Integer>
    {
        LP8788_INT_TSDL,
        LP8788_INT_TSDH,
        LP8788_INT_UVLO,
        LP8788_INT_FLAGMON,
        LP8788_INT_PWRON_TIME,
        LP8788_INT_PWRON,
        LP8788_INT_COMP1,
        LP8788_INT_COMP2,
        LP8788_INT_CHG_INPUT_STATE,
        LP8788_INT_CHG_STATE,
        LP8788_INT_EOC,
        LP8788_INT_CHG_RESTART,
        LP8788_INT_RESTART_TIMEOUT,
        LP8788_INT_FULLCHG_TIMEOUT,
        LP8788_INT_PRECHG_TIMEOUT,
        LP8788_INT_RTC_ALARM1,
        LP8788_INT_RTC_ALARM2,
        LP8788_INT_ENTER_SYS_SUPPORT,
        LP8788_INT_EXIT_SYS_SUPPORT,
        LP8788_INT_BATT_LOW,
        LP8788_INT_NO_BATT,
        LP8788_INT_MAX;

    }
}

