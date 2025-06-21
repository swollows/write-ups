/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Twl4030Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_audio_disable_resource(twl4030_audio_res id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl4030_audio_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_audio_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_audio_enable_resource(twl4030_audio_res id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int twl4030_audio_get_mclk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_audio_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl4030_audio_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_audio_set_resource(twl4030_audio_res id, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl4030_exit_irq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="twl4030_init_chip_irq((const u8*)$arg1)")
    public static int twl4030_init_chip_irq(String chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_init_irq(Ptr<runtime.device> dev, int irq_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_init_sih_modules(@Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl4030_sih_bus_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl4030_sih_bus_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl4030_sih_mask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_sih_set_type(Ptr<IrqDefinitions.irq_data> data, @Unsigned int trigger) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl4030_sih_setup(Ptr<runtime.device> dev, int module2, int irq_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl4030_sih_unmask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct twl4030_audio")
    @NotUsableInJava
    public static class twl4030_audio
    extends Struct {
        public @Unsigned int audio_mclk;
        public runtime.mutex mutex;
        public twl4030_audio_resource @Size(value=2) [] resource;
        public misc.mfd_cell @Size(value=2) [] cells;
    }

    @Type(noCCodeGeneration=true, cType="struct twl4030_audio_resource")
    @NotUsableInJava
    public static class twl4030_audio_resource
    extends Struct {
        public int request_count;
        public char reg;
        public char mask;
    }

    @Type(noCCodeGeneration=true, cType="enum twl4030_audio_res")
    public static enum twl4030_audio_res implements Enum<twl4030_audio_res>,
    TypedEnum<twl4030_audio_res, Integer>
    {
        TWL4030_AUDIO_RES_POWER,
        TWL4030_AUDIO_RES_APLL,
        TWL4030_AUDIO_RES_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct twl4030_audio_data")
    @NotUsableInJava
    public static class twl4030_audio_data
    extends Struct {
        public @Unsigned int audio_mclk;
        public Ptr<twl4030_codec_data> codec;
        public Ptr<twl4030_vibra_data> vibra;
        public int audpwron_gpio;
        public int naudint_irq;
        public @Unsigned int irq_base;
    }

    @Type(noCCodeGeneration=true, cType="struct twl4030_vibra_data")
    @NotUsableInJava
    public static class twl4030_vibra_data
    extends Struct {
        public @Unsigned int coexist;
    }

    @Type(noCCodeGeneration=true, cType="struct twl4030_codec_data")
    @NotUsableInJava
    public static class twl4030_codec_data
    extends Struct {
        public @Unsigned int digimic_delay;
        public @Unsigned int ramp_delay_value;
        public @Unsigned int offset_cncl_path;
        public @Unsigned int hs_extmute;
        public int hs_extmute_gpio;
    }

    @Type(noCCodeGeneration=true, cType="enum twl4030_module_ids")
    public static enum twl4030_module_ids implements Enum<twl4030_module_ids>,
    TypedEnum<twl4030_module_ids, Integer>
    {
        TWL4030_MODULE_AUDIO_VOICE,
        TWL4030_MODULE_GPIO,
        TWL4030_MODULE_INTBR,
        TWL4030_MODULE_TEST,
        TWL4030_MODULE_KEYPAD,
        TWL4030_MODULE_MADC,
        TWL4030_MODULE_INTERRUPTS,
        TWL4030_MODULE_PRECHARGE,
        TWL4030_MODULE_BACKUP,
        TWL4030_MODULE_INT,
        TWL5031_MODULE_ACCESSORY,
        TWL5031_MODULE_INTERRUPTS,
        TWL4030_MODULE_LAST;

    }
}

