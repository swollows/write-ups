/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ThreadDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="thread_cpu_clock_get((const int)$arg1, $arg2)")
    public static int thread_cpu_clock_get(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thread_cpu_clock_getres((const int)$arg1, $arg2)")
    public static int thread_cpu_clock_getres(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thread_cpu_timer_create(Ptr<KDefinitions.k_itimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thread_group_sample_cputime(Ptr<TaskDefinitions.task_struct> tsk, Ptr<@Unsigned Long> samples) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thread_stack_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thread_stack_free_rcu(Ptr<misc.callback_head> rh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thread_throttle_mode_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thread_group_cputime(Ptr<TaskDefinitions.task_struct> tsk, Ptr<TaskDefinitions.task_cputime> times) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thread_group_cputime_adjusted(Ptr<TaskDefinitions.task_struct> p, Ptr<@Unsigned Long> ut, Ptr<@Unsigned Long> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long thread_siblings_list_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long thread_siblings_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct thread_group_cputimer")
    @NotUsableInJava
    public static class thread_group_cputimer
    extends Struct {
        public TaskDefinitions.task_cputime_atomic cputime_atomic;
    }

    @Type(noCCodeGeneration=true, cType="struct thread_info")
    @NotUsableInJava
    public static class thread_info
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned long syscall_work;
        public @Unsigned int status;
        public @Unsigned int cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct thread_shstk")
    @NotUsableInJava
    public static class thread_shstk
    extends Struct {
        public @Unsigned long base;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct thread_struct")
    @NotUsableInJava
    public static class thread_struct
    extends Struct {
        public DescDefinitions.desc_struct @Size(value=3) [] tls_array;
        public @Unsigned long sp;
        public @Unsigned short es;
        public @Unsigned short ds;
        public @Unsigned short fsindex;
        public @Unsigned short gsindex;
        public @Unsigned long fsbase;
        public @Unsigned long gsbase;
        public Ptr<PerfDefinitions.perf_event> @Size(value=4) [] ptrace_bps;
        public @Unsigned long virtual_dr6;
        public @Unsigned long ptrace_dr7;
        public @Unsigned long cr2;
        public @Unsigned long trap_nr;
        public @Unsigned long error_code;
        public Ptr<IoDefinitions.io_bitmap> io_bitmap;
        public @Unsigned long iopl_emul;
        public @Unsigned int iopl_warn;
        public @Unsigned int pkru;
        public @Unsigned long features;
        public @Unsigned long features_locked;
        public thread_shstk shstk;
        public runtime.fpu fpu;
    }
}

