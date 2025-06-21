/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SeccompDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PtraceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptrace_disable(Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_modify_breakpoint(Ptr<PerfDefinitions.perf_event> bp, int len, int type2, int disabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_event> ptrace_register_breakpoint(Ptr<TaskDefinitions.task_struct> tsk, int len, int type2, @Unsigned long addr2, boolean disabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_set_breakpoint_addr(Ptr<TaskDefinitions.task_struct> tsk, int nr, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_set_debugreg(Ptr<TaskDefinitions.task_struct> tsk, int n, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptrace_triggered(Ptr<PerfDefinitions.perf_event> bp, Ptr<PerfDefinitions.perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_do_notify(int signr, int exit_code, int why, @Unsigned long message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_notify(int exit_code, @Unsigned long message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_signal(int signr, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_stop(int exit_code, int why, @Unsigned long message, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptrace_trap_notify(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __ptrace_detach(Ptr<TaskDefinitions.task_struct> tracer2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ptrace_link($arg1, $arg2, (const struct cred*)$arg3)")
    public static void __ptrace_link(Ptr<TaskDefinitions.task_struct> child, Ptr<TaskDefinitions.task_struct> new_parent, Ptr<runtime.cred> ptracer_cred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ptrace_may_access(Ptr<TaskDefinitions.task_struct> task2, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ptrace_unlink(Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_access_vm(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long addr2, Ptr<?> buf, int len, @Unsigned int gup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_attach(Ptr<TaskDefinitions.task_struct> task2, long request2, @Unsigned long addr2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_check_attach(Ptr<TaskDefinitions.task_struct> child, boolean ignore_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_get_syscall_info(Ptr<TaskDefinitions.task_struct> child, @Unsigned long user_size, Ptr<?> datavp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ptrace_get_syscall_info_entry(Ptr<TaskDefinitions.task_struct> child, Ptr<PtDefinitions.pt_regs> regs, Ptr<ptrace_syscall_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ptrace_may_access(Ptr<TaskDefinitions.task_struct> task2, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_peek_siginfo(Ptr<TaskDefinitions.task_struct> child, @Unsigned long addr2, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_readdata(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long src, String dst, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_regset(Ptr<TaskDefinitions.task_struct> task2, int req2, @Unsigned int type2, Ptr<runtime.iovec> kiov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_request(Ptr<TaskDefinitions.task_struct> child, long request2, @Unsigned long addr2, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_traceme() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptrace_unfreeze_traced(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptrace_writedata(Ptr<TaskDefinitions.task_struct> tsk, String src, @Unsigned long dst, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ptrace_rseq_configuration")
    @NotUsableInJava
    public static class ptrace_rseq_configuration
    extends Struct {
        public @Unsigned long rseq_abi_pointer;
        public @Unsigned int rseq_abi_size;
        public @Unsigned int signature;
        public @Unsigned int flags;
        public @Unsigned int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ptrace_syscall_info")
    @NotUsableInJava
    public static class ptrace_syscall_info
    extends Struct {
        public char op;
        public char @Size(value=3) [] pad;
        public @Unsigned int arch;
        public @Unsigned long instruction_pointer;
        public @Unsigned long stack_pointer;
        @InlineUnion(value=89896)
        public @InlineUnion(value=89896) misc.entry_of_anon_member_of_ptrace_syscall_info entry;
        @InlineUnion(value=89896)
        public  @InlineUnion(value=89896) ExitDefinitions.exit_of_anon_member_of_ptrace_syscall_info exit;
        @InlineUnion(value=89896)
        public @InlineUnion(value=89896) SeccompDefinitions.seccomp_of_anon_member_of_ptrace_syscall_info seccomp;
    }

    @Type(noCCodeGeneration=true, cType="struct ptrace_peeksiginfo_args")
    @NotUsableInJava
    public static class ptrace_peeksiginfo_args
    extends Struct {
        public @Unsigned long off;
        public @Unsigned int flags;
        public int nr;
    }

    @Type(noCCodeGeneration=true, cType="struct ptrace_sud_config")
    @NotUsableInJava
    public static class ptrace_sud_config
    extends Struct {
        public @Unsigned long mode;
        public @Unsigned long selector;
        public @Unsigned long offset;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct ptrace_proc_event")
    @NotUsableInJava
    public static class ptrace_proc_event
    extends Struct {
        public @OriginalName(value="__kernel_pid_t") int process_pid;
        public @OriginalName(value="__kernel_pid_t") int process_tgid;
        public @OriginalName(value="__kernel_pid_t") int tracer_pid;
        public @OriginalName(value="__kernel_pid_t") int tracer_tgid;
    }

    @Type(noCCodeGeneration=true, cType="struct ptrace_relation")
    @NotUsableInJava
    public static class ptrace_relation
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> tracer;
        public Ptr<TaskDefinitions.task_struct> tracee;
        public boolean invalid;
        public ListDefinitions.list_head node;
        public misc.callback_head rcu;
    }
}

