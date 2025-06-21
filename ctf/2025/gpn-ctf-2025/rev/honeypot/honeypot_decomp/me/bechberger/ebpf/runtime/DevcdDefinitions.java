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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DevcdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long devcd_data_read(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buffer, @OriginalName(value="loff_t") long offset, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long devcd_data_write(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buffer, @OriginalName(value="loff_t") long offset, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devcd_del(Ptr<misc.work_struct> wk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devcd_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devcd_free(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devcd_free_sgtable(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devcd_freev(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devcd_match_failing($arg1, (const void*)$arg2)")
    public static int devcd_match_failing(Ptr<runtime.device> dev, Ptr<?> failing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long devcd_read_from_sgtable(String buffer, @OriginalName(value="loff_t") long offset, @Unsigned long buf_len, Ptr<?> data, @Unsigned long data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long devcd_readv(String buffer, @OriginalName(value="loff_t") long offset, @Unsigned long count, Ptr<?> data, @Unsigned long datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct devcd_entry")
    @NotUsableInJava
    public static class devcd_entry
    extends Struct {
        public runtime.device devcd_dev;
        public Ptr<?> data;
        public @Unsigned long datalen;
        public runtime.mutex mutex;
        public boolean delete_work;
        public Ptr<runtime.module> owner;
        public Ptr<?> read;
        public Ptr<?> free;
        public DelayedDefinitions.delayed_work del_wk;
        public Ptr<runtime.device> failing_dev;
    }
}

