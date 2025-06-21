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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DyneventDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KprobeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kprobe_event_add_fields(Ptr<DyneventDefinitions.dynevent_cmd> cmd, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kprobe_event_gen_cmd_start($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5_)")
    public static int __kprobe_event_gen_cmd_start(Ptr<DyneventDefinitions.dynevent_cmd> cmd, boolean kretprobe2, String name, String loc, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_dispatcher(Ptr<runtime.kprobe> kp, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_event_cmd_init(Ptr<DyneventDefinitions.dynevent_cmd> cmd, String buf, int maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_event_define_fields(Ptr<TraceDefinitions.trace_event_call> event_call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kprobe_event_delete((const u8*)$arg1)")
    public static int kprobe_event_delete(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_ftrace_handler(@Unsigned long ip, @Unsigned long parent_ip, Ptr<FtraceDefinitions.ftrace_ops> ops, Ptr<FtraceDefinitions.ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_perf_func(Ptr<TraceDefinitions.trace_kprobe> tk, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_register(Ptr<TraceDefinitions.trace_event_call> event2, TraceDefinitions.trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_trace_func(Ptr<TraceDefinitions.trace_kprobe> tk, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_kprobe_addr($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @NotUsableInJava Ptr<@OriginalName(value="kprobe_opcode_t") Character> _kprobe_addr(Ptr<@OriginalName(value="kprobe_opcode_t") Character> addr2, String symbol_name, @Unsigned long offset, Ptr<@OriginalName(value="bool") Boolean> on_func_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_add_area_blacklist(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_add_ksym_blacklist(@Unsigned long entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_blacklist_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kprobe_blacklist_seq_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_blacklist_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kprobe_blacklist_seq_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_blacklist_seq_stop(Ptr<SeqDefinitions.seq_file> f, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_busy_begin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_busy_end() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_cache_get_kallsym(Ptr<kprobe_insn_cache> c, Ptr<@Unsigned Integer> symnum, Ptr<@Unsigned Long> value, String type2, String sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kprobe_disarmed(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_exceptions_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_free_init_mem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_ftrace_kill() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_get_kallsym(@Unsigned int symnum, Ptr<@Unsigned Long> value, String type2, String sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kprobe_lookup_name((const u8*)$arg1, $arg2)")
    public static @NotUsableInJava Ptr<@OriginalName(value="kprobe_opcode_t") Character> kprobe_lookup_name(String name, @Unsigned int __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kprobe_on_func_entry($arg1, (const u8*)$arg2, $arg3)")
    public static int kprobe_on_func_entry(Ptr<@OriginalName(value="kprobe_opcode_t") Character> addr2, String sym, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_optimizer(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_remove_area_blacklist(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kprobe_seq_next(Ptr<SeqDefinitions.seq_file> f, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kprobe_seq_start(Ptr<SeqDefinitions.seq_file> f, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_seq_stop(Ptr<SeqDefinitions.seq_file> f, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_multi_link_exit_handler(Ptr<runtime.fprobe> fp, @Unsigned long fentry_ip, @Unsigned long ret_ip, Ptr<PtDefinitions.pt_regs> regs, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_multi_link_handler(Ptr<runtime.fprobe> fp, @Unsigned long fentry_ip, @Unsigned long ret_ip, Ptr<PtDefinitions.pt_regs> regs, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_multi_link_prog_run(Ptr<BpfDefinitions.bpf_kprobe_multi_link> link2, @Unsigned long entry_ip, Ptr<PtDefinitions.pt_regs> regs, boolean is_return, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)kprobe_prog_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> kprobe_prog_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kprobe_prog_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean kprobe_prog_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_emulate_call(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_emulate_call_indirect(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_emulate_ifmodifiers(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_emulate_jcc(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_emulate_jmp(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_emulate_jmp_indirect(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_emulate_loop(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_emulate_ret(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_fault_handler(Ptr<PtDefinitions.pt_regs> regs, int trapnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kprobe_int3_handler(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kprobe_post_process(Ptr<runtime.kprobe> cur, Ptr<PtDefinitions.pt_regs> regs, Ptr<kprobe_ctlblk> kcb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum kprobe_slot_state")
    public static enum kprobe_slot_state implements Enum<kprobe_slot_state>,
    TypedEnum<kprobe_slot_state, Integer>
    {
        SLOT_CLEAN,
        SLOT_DIRTY,
        SLOT_USED;

    }

    @Type(noCCodeGeneration=true, cType="struct kprobe_insn_page")
    @NotUsableInJava
    public static class kprobe_insn_page
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<@OriginalName(value="kprobe_opcode_t") Character> insns;
        public Ptr<kprobe_insn_cache> cache;
        public int nused;
        public int ngarbage;
        public char @Size(value=0) [] slot_used;
    }

    @Type(noCCodeGeneration=true, cType="struct kprobe_blacklist_entry")
    @NotUsableInJava
    public static class kprobe_blacklist_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long start_addr;
        public @Unsigned long end_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct kprobe_trace_entry_head")
    @NotUsableInJava
    public static class kprobe_trace_entry_head
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned long ip;
    }

    @Type(noCCodeGeneration=true, cType="struct kprobe_insn_cache")
    @NotUsableInJava
    public static class kprobe_insn_cache
    extends Struct {
        public runtime.mutex mutex;
        public Ptr<?> alloc;
        public Ptr<?> free;
        public String sym;
        public ListDefinitions.list_head pages;
        public @Unsigned long insn_size;
        public int nr_garbage;
    }

    @Type(noCCodeGeneration=true, cType="struct kprobe_ctlblk")
    @NotUsableInJava
    public static class kprobe_ctlblk
    extends Struct {
        public @Unsigned long kprobe_status;
        public @Unsigned long kprobe_old_flags;
        public @Unsigned long kprobe_saved_flags;
        public misc.prev_kprobe prev_kprobe;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int func_name; unsigned int name_len; unsigned int offset; long long unsigned int addr; long long unsigned int missed; long long unsigned int cookie; }")
    @NotUsableInJava
    public static class kprobe_of_anon_member_of_perf_event_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long func_name;
        public @Unsigned int name_len;
        public @Unsigned int offset;
        public @Unsigned long addr;
        public @Unsigned long missed;
        public @Unsigned long cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int addrs; unsigned int count; unsigned int flags; long long unsigned int missed; long long unsigned int cookies; }")
    @NotUsableInJava
    public static class kprobe_multi_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long addrs;
        public @Unsigned int count;
        public @Unsigned int flags;
        public @Unsigned long missed;
        public @Unsigned long cookies;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int flags; unsigned int cnt; long long unsigned int syms; long long unsigned int addrs; long long unsigned int cookies; }")
    @NotUsableInJava
    public static class kprobe_multi_of_anon_member_of_link_create_of_bpf_attr
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int cnt;
        public @Unsigned long syms;
        public @Unsigned long addrs;
        public @Unsigned long cookies;
    }
}

