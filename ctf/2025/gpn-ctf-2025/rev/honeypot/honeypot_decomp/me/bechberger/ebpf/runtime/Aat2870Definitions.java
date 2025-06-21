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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Aat2870Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __aat2870_read(Ptr<aat2870_data> aat2870, char addr2, Ptr<Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __aat2870_write(Ptr<aat2870_data> aat2870, char addr2, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aat2870_i2c_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aat2870_i2c_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aat2870_i2c_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aat2870_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aat2870_read(Ptr<aat2870_data> aat2870, char addr2, Ptr<Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aat2870_reg_read_file(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aat2870_reg_write_file($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long aat2870_reg_write_file(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aat2870_update(Ptr<aat2870_data> aat2870, char addr2, char mask, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aat2870_write(Ptr<aat2870_data> aat2870, char addr2, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct aat2870_platform_data")
    @NotUsableInJava
    public static class aat2870_platform_data
    extends Struct {
        public int en_pin;
        public Ptr<aat2870_subdev_info> subdevs;
        public int num_subdevs;
        public Ptr<?> init;
        public Ptr<?> uninit;
    }

    @Type(noCCodeGeneration=true, cType="struct aat2870_subdev_info")
    @NotUsableInJava
    public static class aat2870_subdev_info
    extends Struct {
        public int id;
        public String name;
        public Ptr<?> platform_data;
    }

    @Type(noCCodeGeneration=true, cType="struct aat2870_data")
    @NotUsableInJava
    public static class aat2870_data
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<I2cDefinitions.i2c_client> client;
        public runtime.mutex io_lock;
        public Ptr<aat2870_register> reg_cache;
        public int en_pin;
        public boolean is_enable;
        public Ptr<?> init;
        public Ptr<?> uninit;
        public Ptr<?> read;
        public Ptr<?> write;
        public Ptr<?> update;
        public Ptr<runtime.dentry> dentry_root;
    }

    @Type(noCCodeGeneration=true, cType="struct aat2870_register")
    @NotUsableInJava
    public static class aat2870_register
    extends Struct {
        public boolean readable;
        public boolean writeable;
        public char value;
    }

    @Type(noCCodeGeneration=true, cType="enum aat2870_id")
    public static enum aat2870_id implements Enum<aat2870_id>,
    TypedEnum<aat2870_id, Integer>
    {
        AAT2870_ID_BL,
        AAT2870_ID_LDOA,
        AAT2870_ID_LDOB,
        AAT2870_ID_LDOC,
        AAT2870_ID_LDOD;

    }
}

