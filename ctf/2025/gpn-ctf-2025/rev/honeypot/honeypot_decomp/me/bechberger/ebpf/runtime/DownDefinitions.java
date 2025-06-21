/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class DownDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ___down_common(Ptr<runtime.semaphore> sem2, long state2, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __down_common(Ptr<runtime.semaphore> sem2, long state2, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __down_interruptible(Ptr<runtime.semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __down_killable(Ptr<runtime.semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __down_timeout(Ptr<runtime.semaphore> sem2, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __down_trylock_console_sem(@Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_interruptible(Ptr<runtime.semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_killable(Ptr<runtime.semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ld_semaphore> down_read_failed(Ptr<misc.ld_semaphore> sem2, long count, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_timeout(Ptr<runtime.semaphore> sem2, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_trylock(Ptr<runtime.semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ld_semaphore> down_write_failed(Ptr<misc.ld_semaphore> sem2, long count, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void down_read(Ptr<misc.rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_read_interruptible(Ptr<misc.rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_read_killable(Ptr<misc.rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_read_trylock(Ptr<misc.rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void down_write(Ptr<misc.rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_write_killable(Ptr<misc.rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int down_write_trylock(Ptr<misc.rw_semaphore> sem2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long down_threshold_show(Ptr<misc.gov_attr_set> attr_set, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="down_threshold_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long down_threshold_store(Ptr<misc.gov_attr_set> attr_set, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }
}

