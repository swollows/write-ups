/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class AccountDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __account_cfs_rq_runtime(Ptr<misc.cfs_rq> cfs_rq2, @Unsigned long delta_exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __account_scheduler_latency(Ptr<TaskDefinitions.task_struct> tsk, int usecs, int inter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_global_scheduler_latency(Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.latency_record> lat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_kernel_stack(Ptr<TaskDefinitions.task_struct> tsk, int account) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __account_forceidle_time(Ptr<TaskDefinitions.task_struct> p, @Unsigned long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __account_locked_vm(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pages, boolean inc, Ptr<TaskDefinitions.task_struct> task2, boolean bypass_rlim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_guest_time(Ptr<TaskDefinitions.task_struct> p, @Unsigned long cputime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_idle_ticks(@Unsigned long ticks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_idle_time(@Unsigned long cputime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int account_locked_vm(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pages, boolean inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long account_pipe_buffers(Ptr<UserDefinitions.user_struct> user, @Unsigned long old, @Unsigned long _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_process_tick(Ptr<TaskDefinitions.task_struct> p, int user_tick) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_steal_time(@Unsigned long cputime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_system_index_time(Ptr<TaskDefinitions.task_struct> p, @Unsigned long cputime, CpuDefinitions.cpu_usage_stat index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_system_time(Ptr<TaskDefinitions.task_struct> p, int hardirq_offset, @Unsigned long cputime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void account_user_time(Ptr<TaskDefinitions.task_struct> p, @Unsigned long cputime) {
        throw new MethodIsBPFRelatedFunction();
    }
}

