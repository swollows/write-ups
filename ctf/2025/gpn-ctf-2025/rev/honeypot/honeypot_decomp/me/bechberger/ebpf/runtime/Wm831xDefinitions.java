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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Wm831xDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_irq_disable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_irq_enable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_irq_exit(Ptr<wm831x> wm831x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_irq_init(Ptr<wm831x> wm831x2, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_irq_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_irq_map(Ptr<IrqDefinitions.irq_domain> h, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_irq_set_type(Ptr<IrqDefinitions.irq_data> data, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn wm831x_irq_thread(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_spi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_spi_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_spi_probe(Ptr<SpiDefinitions.spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_spi_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_auxadc_init(Ptr<wm831x> wm831x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn wm831x_auxadc_irq(int irq, Ptr<?> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_auxadc_read(Ptr<wm831x> wm831x2, wm831x_auxadc input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_auxadc_read_irq(Ptr<wm831x> wm831x2, wm831x_auxadc input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_auxadc_read_polled(Ptr<wm831x> wm831x2, wm831x_auxadc input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_auxadc_read_uv(Ptr<wm831x> wm831x2, wm831x_auxadc input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_otp_exit(Ptr<wm831x> wm831x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_otp_init(Ptr<wm831x> wm831x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_bulk_read(Ptr<wm831x> wm831x2, @Unsigned short reg, int count, Ptr<@Unsigned Short> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_device_init(Ptr<wm831x> wm831x2, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_device_shutdown(Ptr<wm831x> wm831x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_device_suspend(Ptr<wm831x> wm831x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_i2c_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_i2c_probe(Ptr<I2cDefinitions.i2c_client> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_i2c_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wm831x_reg_lock(Ptr<wm831x> wm831x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_reg_read(Ptr<wm831x> wm831x2, @Unsigned short reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wm831x_reg_readable(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_reg_unlock(Ptr<wm831x> wm831x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wm831x_reg_volatile(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_reg_write(Ptr<wm831x> wm831x2, @Unsigned short reg, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wm831x_reg_writeable(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wm831x_set_bits(Ptr<wm831x> wm831x2, @Unsigned short reg, @Unsigned short mask, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct wm831x")
    @NotUsableInJava
    public static class wm831x
    extends Struct {
        public runtime.mutex io_lock;
        public Ptr<runtime.device> dev;
        public Ptr<runtime.regmap> regmap;
        public wm831x_pdata pdata;
        public wm831x_parent type;
        public int irq;
        public runtime.mutex irq_lock;
        public Ptr<IrqDefinitions.irq_domain> irq_domain;
        public int @Size(value=5) [] irq_masks_cur;
        public int @Size(value=5) [] irq_masks_cache;
        public boolean soft_shutdown;
        public @Unsigned int has_gpio_ena;
        public @Unsigned int has_cs_sts;
        public @Unsigned int charger_irq_wake;
        public int num_gpio;
        public int @Size(value=16) [] gpio_update;
        public boolean @Size(value=16) [] gpio_level_high;
        public boolean @Size(value=16) [] gpio_level_low;
        public runtime.mutex auxadc_lock;
        public ListDefinitions.list_head auxadc_pending;
        public @Unsigned short auxadc_active;
        public @OriginalName(value="wm831x_auxadc_read_fn") Ptr<?> auxadc_read;
        public runtime.mutex key_lock;
        public @Unsigned int locked;
    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_auxadc_req")
    @NotUsableInJava
    public static class wm831x_auxadc_req
    extends Struct {
        public ListDefinitions.list_head list;
        public wm831x_auxadc input;
        public int val;
        public runtime.completion done;
    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_irq_data")
    @NotUsableInJava
    public static class wm831x_irq_data
    extends Struct {
        public int primary;
        public int reg;
        public int mask;
    }

    @Type(noCCodeGeneration=true, cType="enum wm831x_parent")
    public static enum wm831x_parent implements Enum<wm831x_parent>,
    TypedEnum<wm831x_parent, Integer>
    {
        WM8310,
        WM8311,
        WM8312,
        WM8320,
        WM8321,
        WM8325,
        WM8326;

    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_pdata")
    @NotUsableInJava
    public static class wm831x_pdata
    extends Struct {
        public int wm831x_num;
        public Ptr<?> pre_init;
        public Ptr<?> post_init;
        public boolean irq_cmos;
        public boolean disable_touch;
        public boolean soft_shutdown;
        public int irq_base;
        public int gpio_base;
        public int @Size(value=16) [] gpio_defaults;
        public Ptr<wm831x_backlight_pdata> backlight;
        public Ptr<wm831x_backup_pdata> backup;
        public Ptr<wm831x_battery_pdata> battery;
        public Ptr<wm831x_touch_pdata> touch;
        public Ptr<wm831x_watchdog_pdata> watchdog;
        public Ptr<wm831x_status_pdata> @Size(value=2) [] status;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=4) [] dcdc;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=2) [] epe;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=11) [] ldo;
        public Ptr<RegulatorDefinitions.regulator_init_data> @Size(value=2) [] isink;
    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_watchdog_pdata")
    @NotUsableInJava
    public static class wm831x_watchdog_pdata
    extends Struct {
        public wm831x_watchdog_action primary;
        public wm831x_watchdog_action secondary;
        public @Unsigned int software;
    }

    @Type(noCCodeGeneration=true, cType="enum wm831x_watchdog_action")
    public static enum wm831x_watchdog_action implements Enum<wm831x_watchdog_action>,
    TypedEnum<wm831x_watchdog_action, Integer>
    {
        WM831X_WDOG_NONE,
        WM831X_WDOG_INTERRUPT,
        WM831X_WDOG_RESET,
        WM831X_WDOG_WAKE;

    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_touch_pdata")
    @NotUsableInJava
    public static class wm831x_touch_pdata
    extends Struct {
        public int fivewire;
        public int isel;
        public int rpu;
        public int pressure;
        public @Unsigned int data_irq;
        public int data_irqf;
        public @Unsigned int pd_irq;
        public int pd_irqf;
    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_status_pdata")
    @NotUsableInJava
    public static class wm831x_status_pdata
    extends Struct {
        public wm831x_status_src default_src;
        public String name;
        public String default_trigger;
    }

    @Type(noCCodeGeneration=true, cType="enum wm831x_status_src")
    public static enum wm831x_status_src implements Enum<wm831x_status_src>,
    TypedEnum<wm831x_status_src, Integer>
    {
        WM831X_STATUS_PRESERVE,
        WM831X_STATUS_OTP,
        WM831X_STATUS_POWER,
        WM831X_STATUS_CHARGER,
        WM831X_STATUS_MANUAL;

    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_battery_pdata")
    @NotUsableInJava
    public static class wm831x_battery_pdata
    extends Struct {
        public int enable;
        public int fast_enable;
        public int off_mask;
        public int trickle_ilim;
        public int vsel;
        public int eoc_iterm;
        public int fast_ilim;
        public int timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_backup_pdata")
    @NotUsableInJava
    public static class wm831x_backup_pdata
    extends Struct {
        public int charger_enable;
        public int no_constant_voltage;
        public int vlim;
        public int ilim;
    }

    @Type(noCCodeGeneration=true, cType="struct wm831x_backlight_pdata")
    @NotUsableInJava
    public static class wm831x_backlight_pdata
    extends Struct {
        public int isink;
        public int max_uA;
    }

    @Type(noCCodeGeneration=true, cType="enum wm831x_auxadc")
    public static enum wm831x_auxadc implements Enum<wm831x_auxadc>,
    TypedEnum<wm831x_auxadc, Integer>
    {
        WM831X_AUX_CAL,
        WM831X_AUX_BKUP_BATT,
        WM831X_AUX_WALL,
        WM831X_AUX_BATT,
        WM831X_AUX_USB,
        WM831X_AUX_SYSVDD,
        WM831X_AUX_BATT_TEMP,
        WM831X_AUX_CHIP_TEMP,
        WM831X_AUX_AUX4,
        WM831X_AUX_AUX3,
        WM831X_AUX_AUX2,
        WM831X_AUX_AUX1;

    }
}

