/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class SingleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int single_open_net(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int single_release_net(Ptr<runtime.inode> ino, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> single_next(Ptr<SeqDefinitions.seq_file> p, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="single_open($arg1, (int (*)(struct seq_file*, void*))$arg2, $arg3)")
    public static int single_open(Ptr<runtime.file> file2, Ptr<?> show, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="single_open_size($arg1, (int (*)(struct seq_file*, void*))$arg2, $arg3, $arg4)")
    public static int single_open_size(Ptr<runtime.file> file2, Ptr<?> show, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int single_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> single_start(Ptr<SeqDefinitions.seq_file> p, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void single_stop(Ptr<SeqDefinitions.seq_file> p, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean single_task_running() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long single_hugepage_flag_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, misc.transparent_hugepage_flag flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="single_hugepage_flag_store($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long single_hugepage_flag_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count, misc.transparent_hugepage_flag flag) {
        throw new MethodIsBPFRelatedFunction();
    }
}

