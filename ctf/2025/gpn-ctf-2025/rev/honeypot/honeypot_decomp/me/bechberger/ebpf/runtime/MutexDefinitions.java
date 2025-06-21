/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MutexDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__mutex_init($arg1, (const u8*)$arg2, $arg3)")
    public static void __mutex_init(Ptr<runtime.mutex> lock, String name, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mutex_lock_interruptible_slowpath(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mutex_lock_killable_slowpath(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mutex_lock_slowpath(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mutex_unlock_slowpath(Ptr<runtime.mutex> lock, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mutex_is_locked(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mutex_lock(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mutex_lock_interruptible(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mutex_lock_io(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mutex_lock_killable(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mutex_spin_on_owner(Ptr<runtime.mutex> lock, Ptr<TaskDefinitions.task_struct> owner, Ptr<misc.ww_acquire_ctx> ww_ctx, Ptr<mutex_waiter> waiter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mutex_trylock(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mutex_unlock(Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mutex_waiter")
    @NotUsableInJava
    public static class mutex_waiter
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<misc.ww_acquire_ctx> ww_ctx;
    }
}

