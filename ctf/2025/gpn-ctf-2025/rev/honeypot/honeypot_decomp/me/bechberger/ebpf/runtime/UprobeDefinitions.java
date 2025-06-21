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
import me.bechberger.ebpf.runtime.ArchDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UprobeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __uprobe_perf_func(Ptr<TraceDefinitions.trace_uprobe> tu, @Unsigned long func, Ptr<PtDefinitions.pt_regs> regs, Ptr<Ptr<uprobe_cpu_buffer>> ucbp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __uprobe_trace_func(Ptr<TraceDefinitions.trace_uprobe> tu, @Unsigned long func, Ptr<PtDefinitions.pt_regs> regs, Ptr<uprobe_cpu_buffer> ucb, Ptr<TraceDefinitions.trace_event_file> trace_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_buffer_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_buffer_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_dispatcher(Ptr<uprobe_consumer> con, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_event_define_fields(Ptr<TraceDefinitions.trace_event_call> event_call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_init_insn(Ptr<ArchDefinitions.arch_uprobe> auprobe, Ptr<runtime.insn> insn2, boolean x86_64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_perf_close(Ptr<TraceDefinitions.trace_event_call> call, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean uprobe_perf_filter(Ptr<uprobe_consumer> uc, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_apply(Ptr<runtime.uprobe> uprobe2, Ptr<uprobe_consumer> uc, boolean add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_clear_state(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_copy_process(Ptr<TaskDefinitions.task_struct> t, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean uprobe_deny_signal() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_dup_mmap(Ptr<MmDefinitions.mm_struct> oldmm, Ptr<MmDefinitions.mm_struct> newmm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_end_dup_mmap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_free_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_free_utask(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long uprobe_get_swbp_addr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long uprobe_get_trampoline_vaddr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long uprobe_get_trap_addr(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_handle_trampoline(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_mmap(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean uprobe_multi_link_filter(Ptr<uprobe_consumer> con, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_multi_link_handler(Ptr<uprobe_consumer> con, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_multi_link_ret_handler(Ptr<uprobe_consumer> con, @Unsigned long func, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_munmap(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_notify_resume(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_post_sstep_notifier(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_pre_sstep_notifier(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_prog_run(Ptr<BpfDefinitions.bpf_uprobe> uprobe2, @Unsigned long entry_ip, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.uprobe> uprobe_register(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long ref_ctr_offset, Ptr<uprobe_consumer> uc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_start_dup_mmap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_unregister_nosync(Ptr<runtime.uprobe> uprobe2, Ptr<uprobe_consumer> uc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uprobe_unregister_sync() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uprobe_write_opcode(Ptr<ArchDefinitions.arch_uprobe> auprobe, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long vaddr, @OriginalName(value="uprobe_opcode_t") char opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct __uprobe_key")
    @NotUsableInJava
    public static class __uprobe_key
    extends Struct {
        public Ptr<runtime.inode> inode;
        public @OriginalName(value="loff_t") long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct uprobe_cpu_buffer")
    @NotUsableInJava
    public static class uprobe_cpu_buffer
    extends Struct {
        public runtime.mutex mutex;
        public Ptr<?> buf;
        public int dsize;
    }

    @Type(noCCodeGeneration=true, cType="struct uprobe_trace_entry_head")
    @NotUsableInJava
    public static class uprobe_trace_entry_head
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned long @Size(value=0) [] vaddr;
    }

    @Type(noCCodeGeneration=true, cType="struct uprobe_dispatch_data")
    @NotUsableInJava
    public static class uprobe_dispatch_data
    extends Struct {
        public Ptr<TraceDefinitions.trace_uprobe> tu;
        public @Unsigned long bp_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct uprobe_consumer")
    @NotUsableInJava
    public static class uprobe_consumer
    extends Struct {
        public Ptr<?> handler;
        public Ptr<?> ret_handler;
        public Ptr<?> filter;
        public ListDefinitions.list_head cons_node;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int file_name; unsigned int name_len; unsigned int offset; long long unsigned int cookie; }")
    @NotUsableInJava
    public static class uprobe_of_anon_member_of_perf_event_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long file_name;
        public @Unsigned int name_len;
        public @Unsigned int offset;
        public @Unsigned long cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int path; long long unsigned int offsets; long long unsigned int ref_ctr_offsets; long long unsigned int cookies; unsigned int path_size; unsigned int count; unsigned int flags; unsigned int pid; }")
    @NotUsableInJava
    public static class uprobe_multi_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long path;
        public @Unsigned long offsets;
        public @Unsigned long ref_ctr_offsets;
        public @Unsigned long cookies;
        public @Unsigned int path_size;
        public @Unsigned int count;
        public @Unsigned int flags;
        public @Unsigned int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int path; long long unsigned int offsets; long long unsigned int ref_ctr_offsets; long long unsigned int cookies; unsigned int cnt; unsigned int flags; unsigned int pid; }")
    @NotUsableInJava
    public static class uprobe_multi_of_anon_member_of_link_create_of_bpf_attr
    extends Struct {
        public @Unsigned long path;
        public @Unsigned long offsets;
        public @Unsigned long ref_ctr_offsets;
        public @Unsigned long cookies;
        public @Unsigned int cnt;
        public @Unsigned int flags;
        public @Unsigned int pid;
    }

    @Type(noCCodeGeneration=true, cType="enum uprobe_task_state")
    public static enum uprobe_task_state implements Enum<uprobe_task_state>,
    TypedEnum<uprobe_task_state, Integer>
    {
        UTASK_RUNNING,
        UTASK_SSTEP,
        UTASK_SSTEP_ACK,
        UTASK_SSTEP_TRAPPED;

    }

    @Type(noCCodeGeneration=true, cType="struct uprobe_xol_ops")
    @NotUsableInJava
    public static class uprobe_xol_ops
    extends Struct {
        public Ptr<?> emulate;
        public Ptr<?> pre_xol;
        public Ptr<?> post_xol;
        public Ptr<?> abort;
    }

    @Type(noCCodeGeneration=true, cType="struct uprobe_task")
    @NotUsableInJava
    public static class uprobe_task
    extends Struct {
        public uprobe_task_state state;
        @InlineUnion(value=607)
        public  @InlineUnion(value=607) AnonDefinitions.anon_member_of_anon_member_of_uprobe_task anon1$0;
        @InlineUnion(value=607)
        public  @InlineUnion(value=607) AnonDefinitions.anon_member_of_anon_member_of_uprobe_task anon1$1;
        public Ptr<runtime.uprobe> active_uprobe;
        public @Unsigned long xol_vaddr;
        public Ptr<ArchDefinitions.arch_uprobe> auprobe;
        public Ptr<misc.return_instance> return_instances;
        public @Unsigned int depth;
    }
}

