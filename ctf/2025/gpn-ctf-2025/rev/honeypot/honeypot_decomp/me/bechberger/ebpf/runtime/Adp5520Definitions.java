/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Adp5520Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_clr_bits(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn adp5520_irq_thread(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_read(Ptr<runtime.device> dev, int reg, Ptr<@OriginalName(value="uint8_t") Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_register_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> nb, @Unsigned int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_set_bits(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_unregister_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> nb, @Unsigned int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adp5520_write(Ptr<runtime.device> dev, int reg, @OriginalName(value="uint8_t") char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct adp5520_chip")
    @NotUsableInJava
    public static class adp5520_chip
    extends Struct {
        public Ptr<I2cDefinitions.i2c_client> client;
        public Ptr<runtime.device> dev;
        public runtime.mutex lock;
        public misc.blocking_notifier_head notifier_list;
        public int irq;
        public @Unsigned long id;
        public @OriginalName(value="uint8_t") char mode;
    }

    @Type(noCCodeGeneration=true, cType="struct adp5520_platform_data")
    @NotUsableInJava
    public static class adp5520_platform_data
    extends Struct {
        public Ptr<adp5520_keys_platform_data> keys;
        public Ptr<adp5520_gpio_platform_data> gpio;
        public Ptr<adp5520_leds_platform_data> leds;
        public Ptr<adp5520_backlight_platform_data> backlight;
    }

    @Type(noCCodeGeneration=true, cType="struct adp5520_backlight_platform_data")
    @NotUsableInJava
    public static class adp5520_backlight_platform_data
    extends Struct {
        public char fade_in;
        public char fade_out;
        public char fade_led_law;
        public char en_ambl_sens;
        public char abml_filt;
        public char l1_daylight_max;
        public char l1_daylight_dim;
        public char l2_office_max;
        public char l2_office_dim;
        public char l3_dark_max;
        public char l3_dark_dim;
        public char l2_trip;
        public char l2_hyst;
        public char l3_trip;
        public char l3_hyst;
    }

    @Type(noCCodeGeneration=true, cType="struct adp5520_leds_platform_data")
    @NotUsableInJava
    public static class adp5520_leds_platform_data
    extends Struct {
        public int num_leds;
        public @OriginalName(value="led_info") Ptr<?> leds;
        public char fade_in;
        public char fade_out;
        public char led_on_time;
    }

    @Type(noCCodeGeneration=true, cType="struct adp5520_keys_platform_data")
    @NotUsableInJava
    public static class adp5520_keys_platform_data
    extends Struct {
        public int rows_en_mask;
        public int cols_en_mask;
        public Ptr<@Unsigned Short> keymap;
        public @Unsigned short keymapsize;
        public @Unsigned int repeat;
    }

    @Type(noCCodeGeneration=true, cType="struct adp5520_gpio_platform_data")
    @NotUsableInJava
    public static class adp5520_gpio_platform_data
    extends Struct {
        public @Unsigned int gpio_start;
        public char gpio_en_mask;
        public char gpio_pullup_mask;
    }
}

