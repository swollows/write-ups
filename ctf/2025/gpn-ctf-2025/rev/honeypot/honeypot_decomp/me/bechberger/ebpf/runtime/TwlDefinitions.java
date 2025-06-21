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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TwlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_get_hfclk_rate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.regmap> twl_get_regmap(char mod_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_get_type() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_get_version() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_i2c_read(char mod_no, Ptr<Character> value, char reg, @Unsigned int num_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_i2c_write(char mod_no, Ptr<Character> value, char reg, @Unsigned int num_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void twl_remove(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int twl_rev() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_set_regcache_bypass(char mod_no, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int twl_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct twl_private")
    @NotUsableInJava
    public static class twl_private
    extends Struct {
        public boolean ready;
        public @Unsigned int twl_idcode;
        public @Unsigned int twl_id;
        public Ptr<twl_mapping> twl_map;
        public Ptr<twl_client> twl_modules;
    }

    @Type(noCCodeGeneration=true, cType="struct twl_mapping")
    @NotUsableInJava
    public static class twl_mapping
    extends Struct {
        public char sid;
        public char base;
    }

    @Type(noCCodeGeneration=true, cType="struct twl_client")
    @NotUsableInJava
    public static class twl_client
    extends Struct {
        public Ptr<I2cDefinitions.i2c_client> client;
        public Ptr<runtime.regmap> regmap;
    }

    @Type(noCCodeGeneration=true, cType="enum twl_module_ids")
    public static enum twl_module_ids implements Enum<twl_module_ids>,
    TypedEnum<twl_module_ids, Integer>
    {
        TWL_MODULE_USB,
        TWL_MODULE_PIH,
        TWL_MODULE_MAIN_CHARGE,
        TWL_MODULE_PM_MASTER,
        TWL_MODULE_PM_RECEIVER,
        TWL_MODULE_RTC,
        TWL_MODULE_PWM,
        TWL_MODULE_LED,
        TWL_MODULE_SECURED_REG,
        TWL_MODULE_LAST;

    }
}

