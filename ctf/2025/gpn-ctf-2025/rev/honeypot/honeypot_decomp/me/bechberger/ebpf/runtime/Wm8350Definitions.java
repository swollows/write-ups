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
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PowerDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.RtcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Wm8350Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn wm8350_irq(int irq, Ptr<?> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm8350_irq_disable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm8350_irq_enable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_irq_exit(Ptr<runtime.wm8350> wm83502) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_irq_init(Ptr<runtime.wm8350> wm83502, int irq, Ptr<wm8350_platform_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm8350_irq_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm8350_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wm8350_precious(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wm8350_readable(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wm8350_volatile(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wm8350_writeable(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn wm8350_auxadc_irq(int irq, Ptr<?> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_block_read(Ptr<runtime.wm8350> wm83502, int start_reg, int regs, Ptr<@Unsigned Short> dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_block_write(Ptr<runtime.wm8350> wm83502, int start_reg, int regs, Ptr<@Unsigned Short> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_clear_bits(Ptr<runtime.wm8350> wm83502, @Unsigned short reg, @Unsigned short mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wm8350_client_dev_register($arg1, (const u8*)$arg2, $arg3)")
    public static void wm8350_client_dev_register(Ptr<runtime.wm8350> wm83502, String name, Ptr<Ptr<PlatformDefinitions.platform_device>> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_device_init(Ptr<runtime.wm8350> wm83502, int irq, Ptr<wm8350_platform_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_read_auxadc(Ptr<runtime.wm8350> wm83502, int channel2, int scale, int vref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_reg_lock(Ptr<runtime.wm8350> wm83502) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short wm8350_reg_read(Ptr<runtime.wm8350> wm83502, int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_reg_unlock(Ptr<runtime.wm8350> wm83502) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_reg_write(Ptr<runtime.wm8350> wm83502, int reg, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_set_bits(Ptr<runtime.wm8350> wm83502, @Unsigned short reg, @Unsigned short mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm8350_gpio_config(Ptr<runtime.wm8350> wm83502, int gpio, int dir, int func, int pol, int pull, int invert, int debounce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_reg_access")
    @NotUsableInJava
    public static class wm8350_reg_access
    extends Struct {
        public @Unsigned short readable;
        public @Unsigned short writable;
        public @Unsigned short vol;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_irq_data")
    @NotUsableInJava
    public static class wm8350_irq_data
    extends Struct {
        public int primary;
        public int reg;
        public int mask;
        public int primary_only;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_platform_data")
    @NotUsableInJava
    public static class wm8350_platform_data
    extends Struct {
        public Ptr<?> init;
        public int irq_high;
        public int irq_base;
        public int gpio_base;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_hwmon")
    @NotUsableInJava
    public static class wm8350_hwmon
    extends Struct {
        public Ptr<PlatformDefinitions.platform_device> pdev;
        public Ptr<runtime.device> classdev;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_wdt")
    @NotUsableInJava
    public static class wm8350_wdt
    extends Struct {
        public Ptr<PlatformDefinitions.platform_device> pdev;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_power")
    @NotUsableInJava
    public static class wm8350_power
    extends Struct {
        public Ptr<PlatformDefinitions.platform_device> pdev;
        public Ptr<PowerDefinitions.power_supply> battery;
        public Ptr<PowerDefinitions.power_supply> usb;
        public Ptr<PowerDefinitions.power_supply> ac;
        public Ptr<wm8350_charger_policy> policy;
        public int rev_g_coeff;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_charger_policy")
    @NotUsableInJava
    public static class wm8350_charger_policy
    extends Struct {
        public int eoc_mA;
        public int charge_mV;
        public int fast_limit_mA;
        public int fast_limit_USB_mA;
        public int charge_timeout;
        public int trickle_start_mV;
        public int trickle_charge_mA;
        public int trickle_charge_USB_mA;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_rtc")
    @NotUsableInJava
    public static class wm8350_rtc
    extends Struct {
        public Ptr<PlatformDefinitions.platform_device> pdev;
        public Ptr<RtcDefinitions.rtc_device> rtc;
        public int alarm_enabled;
        public int update_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_pmic")
    @NotUsableInJava
    public static class wm8350_pmic
    extends Struct {
        public int max_dcdc;
        public int max_isink;
        public int isink_A_dcdc;
        public int isink_B_dcdc;
        public @Unsigned short dcdc1_hib_mode;
        public @Unsigned short dcdc3_hib_mode;
        public @Unsigned short dcdc4_hib_mode;
        public @Unsigned short dcdc6_hib_mode;
        public Ptr<PlatformDefinitions.platform_device> @Size(value=12) [] pdev;
        public wm8350_led @Size(value=2) [] led;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_led")
    @NotUsableInJava
    public static class wm8350_led
    extends Struct {
        public Ptr<PlatformDefinitions.platform_device> pdev;
        public misc.work_struct work;
        public  @OriginalName(value="spinlock_t") runtime.spinlock value_lock;
        public LedDefinitions.led_brightness value;
        public LedDefinitions.led_classdev cdev;
        public int max_uA_index;
        public int enabled;
        public Ptr<runtime.regulator> isink;
        public RegulatorDefinitions.regulator_consumer_supply isink_consumer;
        public RegulatorDefinitions.regulator_init_data isink_init;
        public Ptr<runtime.regulator> dcdc;
        public RegulatorDefinitions.regulator_consumer_supply dcdc_consumer;
        public RegulatorDefinitions.regulator_init_data dcdc_init;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_gpio")
    @NotUsableInJava
    public static class wm8350_gpio
    extends Struct {
        public Ptr<PlatformDefinitions.platform_device> pdev;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_codec")
    @NotUsableInJava
    public static class wm8350_codec
    extends Struct {
        public Ptr<PlatformDefinitions.platform_device> pdev;
        public Ptr<wm8350_audio_platform_data> platform_data;
    }

    @Type(noCCodeGeneration=true, cType="struct wm8350_audio_platform_data")
    @NotUsableInJava
    public static class wm8350_audio_platform_data
    extends Struct {
        public int vmid_discharge_msecs;
        public int drain_msecs;
        public int cap_discharge_msecs;
        public int vmid_charge_msecs;
        public @Unsigned int vmid_s_curve;
        public @Unsigned int dis_out4;
        public @Unsigned int dis_out3;
        public @Unsigned int dis_out2;
        public @Unsigned int dis_out1;
        public @Unsigned int vroi_out4;
        public @Unsigned int vroi_out3;
        public @Unsigned int vroi_out2;
        public @Unsigned int vroi_out1;
        public @Unsigned int vroi_enable;
        public @Unsigned int codec_current_on;
        public @Unsigned int codec_current_standby;
        public @Unsigned int codec_current_charge;
    }
}

