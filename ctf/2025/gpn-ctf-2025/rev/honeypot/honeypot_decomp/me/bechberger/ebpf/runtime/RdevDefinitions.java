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
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RdevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rdev_addable(Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rdev_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdev_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rdev_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdev_clear_badblocks(Ptr<MdDefinitions.md_rdev> rdev, @Unsigned @OriginalName(value="sector_t") long s2, int sectors, int is_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdev_free(Ptr<runtime.kobject> ko) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdev_init_serial(Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdev_need_serial(Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rdev_read_only(Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rdev_removeable(Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdev_set_badblocks(Ptr<MdDefinitions.md_rdev> rdev, @Unsigned @OriginalName(value="sector_t") long s2, int sectors, int is_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rdev_size_show(Ptr<MdDefinitions.md_rdev> rdev, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdev_size_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long rdev_size_store(Ptr<MdDefinitions.md_rdev> rdev, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> rdev_get_dev(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> rdev_get_drvdata(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdev_get_id(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)rdev_get_name($arg1))")
    public static String rdev_get_name(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.regmap> rdev_get_regmap(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdev_init_debugfs(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rdev_sysfs_entry")
    @NotUsableInJava
    public static class rdev_sysfs_entry
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }
}

