/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SeccompDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SyscallDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int syscall_enter_define_fields(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int syscall_enter_register(Ptr<TraceDefinitions.trace_event_call> event2, TraceDefinitions.trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int syscall_exit_register(Ptr<TraceDefinitions.trace_event_call> event2, TraceDefinitions.trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> syscall_get_enter_fields(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int syscall_regfunc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void syscall_unregfunc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int syscall_user_dispatch_get_config(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int syscall_user_dispatch_set_config(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void syscall_enter_from_user_mode_prepare(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void syscall_exit_to_user_mode(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void syscall_exit_to_user_mode_prepare(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void syscall_exit_to_user_mode_work(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void syscall_exit_work(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void syscall_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)syscall_prog_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> syscall_prog_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="syscall_prog_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean syscall_prog_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct syscall_tp_t")
    @NotUsableInJava
    public static class syscall_tp_t
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public int syscall_nr;
        public @Unsigned long ret;
    }

    @Type(noCCodeGeneration=true, cType="struct syscall_trace_exit")
    @NotUsableInJava
    public static class syscall_trace_exit
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public int nr;
        public long ret;
    }

    @Type(noCCodeGeneration=true, cType="struct syscall_trace_enter")
    @NotUsableInJava
    public static class syscall_trace_enter
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public int nr;
        public @Unsigned long @Size(value=0) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct syscall_info")
    @NotUsableInJava
    public static class syscall_info
    extends Struct {
        public @Unsigned long sp;
        public SeccompDefinitions.seccomp_data data;
    }

    @Type(noCCodeGeneration=true, cType="struct syscall_metadata")
    @NotUsableInJava
    public static class syscall_metadata
    extends Struct {
        public String name;
        public int syscall_nr;
        public int nb_args;
        public Ptr<String> types;
        public Ptr<String> args;
        public ListDefinitions.list_head enter_fields;
        public Ptr<TraceDefinitions.trace_event_call> enter_event;
        public Ptr<TraceDefinitions.trace_event_call> exit_event;
    }

    @Type(noCCodeGeneration=true, cType="enum syscall_work_bit")
    public static enum syscall_work_bit implements Enum<syscall_work_bit>,
    TypedEnum<syscall_work_bit, Integer>
    {
        SYSCALL_WORK_BIT_SECCOMP,
        SYSCALL_WORK_BIT_SYSCALL_TRACEPOINT,
        SYSCALL_WORK_BIT_SYSCALL_TRACE,
        SYSCALL_WORK_BIT_SYSCALL_EMU,
        SYSCALL_WORK_BIT_SYSCALL_AUDIT,
        SYSCALL_WORK_BIT_SYSCALL_USER_DISPATCH,
        SYSCALL_WORK_BIT_SYSCALL_EXIT_TRAP;

    }

    @Type(noCCodeGeneration=true, cType="struct syscall_user_dispatch")
    @NotUsableInJava
    public static class syscall_user_dispatch
    extends Struct {
        public String selector;
        public @Unsigned long offset;
        public @Unsigned long len;
        public boolean on_dispatch;
    }
}

