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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.HandleDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PcpuDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class StackDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __stack_chk_fail() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __stack_map_get(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> value, boolean delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long stack_map_peek_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long stack_map_pop_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long stack_max_size_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stack_max_size_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long stack_max_size_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stack_trace_call(@Unsigned long ip, @Unsigned long parent_ip, Ptr<FtraceDefinitions.ftrace_ops> op, Ptr<FtraceDefinitions.ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stack_trace_filter_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stack_trace_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stack_trace_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stack_trace_sysctl((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int stack_trace_sysctl(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> stack_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long stack_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stack_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stack_map_get_build_id_offset(Ptr<BpfDefinitions.bpf_stack_build_id> id_offs, @Unsigned int trace_nr, boolean user, boolean may_fault) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stack_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> stack_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stack_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long stack_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long stack_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stack_slot_obj_get_spi($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int stack_slot_obj_get_spi(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, String obj_kind, int nr_slots) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<stack_record> __stack_depot_get_stack_record(@Unsigned @OriginalName(value="depot_stack_handle_t") int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stack_depot_early_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int stack_depot_fetch(@Unsigned @OriginalName(value="depot_stack_handle_t") int handle, Ptr<Ptr<@Unsigned Long>> entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int stack_depot_get_extra_bits(@Unsigned @OriginalName(value="depot_stack_handle_t") int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stack_depot_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stack_depot_print(@Unsigned @OriginalName(value="depot_stack_handle_t") int stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stack_depot_put(@Unsigned @OriginalName(value="depot_stack_handle_t") int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stack_depot_request_early_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="depot_stack_handle_t") int stack_depot_save(Ptr<@Unsigned Long> entries, @Unsigned int nr_entries, @Unsigned @OriginalName(value="gfp_t") int alloc_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="depot_stack_handle_t") int stack_depot_save_flags(Ptr<@Unsigned Long> entries, @Unsigned int nr_entries, @Unsigned @OriginalName(value="gfp_t") int alloc_flags, @Unsigned @OriginalName(value="depot_flags_t") int depot_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="depot_stack_handle_t") int stack_depot_set_extra_bits(@Unsigned @OriginalName(value="depot_stack_handle_t") int handle, @Unsigned int extra_bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stack_depot_snprint(@Unsigned @OriginalName(value="depot_stack_handle_t") int handle, String buf, @Unsigned long size, int spaces) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean stack_trace_consume_entry(Ptr<?> cookie, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean stack_trace_consume_entry_nosched(Ptr<?> cookie, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stack_trace_print((const long unsigned int*)$arg1, $arg2, $arg3)")
    public static void stack_trace_print(Ptr<@Unsigned Long> entries, @Unsigned int nr_entries, int spaces) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int stack_trace_save(Ptr<@Unsigned Long> store, @Unsigned int size, @Unsigned int skipnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int stack_trace_save_regs(Ptr<PtDefinitions.pt_regs> regs, Ptr<@Unsigned Long> store, @Unsigned int size, @Unsigned int skipnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int stack_trace_save_tsk(Ptr<TaskDefinitions.task_struct> tsk, Ptr<@Unsigned Long> store, @Unsigned int size, @Unsigned int skipnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stack_trace_save_tsk_reliable(Ptr<TaskDefinitions.task_struct> tsk, Ptr<@Unsigned Long> store, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int stack_trace_save_user(Ptr<@Unsigned Long> store, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stack_trace_snprint($arg1, $arg2, (const long unsigned int*)$arg3, $arg4, $arg5)")
    public static int stack_trace_snprint(String buf, @Unsigned long size, Ptr<@Unsigned Long> entries, @Unsigned int nr_entries, int spaces) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)stack_type_name($arg1))")
    public static String stack_type_name(stack_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct stack_map_bucket")
    @NotUsableInJava
    public static class stack_map_bucket
    extends Struct {
        public PcpuDefinitions.pcpu_freelist_node fnode;
        public @Unsigned int hash;
        public @Unsigned int nr;
        public @Unsigned long @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct stack_entry")
    @NotUsableInJava
    public static class stack_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public int size;
        public @Unsigned long @Size(value=0) [] caller;
    }

    @Type(noCCodeGeneration=true, cType="struct stack_frame_user")
    @NotUsableInJava
    public static class stack_frame_user
    extends Struct {
        public Ptr<?> next_fp;
        public @Unsigned long ret_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct stack_record")
    @NotUsableInJava
    public static class stack_record
    extends Struct {
        public ListDefinitions.list_head hash_list;
        public @Unsigned int hash;
        public @Unsigned int size;
        public HandleDefinitions.handle_parts handle;
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        @InlineUnion(value=15206)
        public @InlineUnion(value=15206) @Unsigned long @Size(value=64) [] entries;
        @InlineUnion(value=15206)
        public  @InlineUnion(value=15206) AnonDefinitions.anon_member_of_anon_member_of_stack_record anon5$1;
    }

    @Type(noCCodeGeneration=true, cType="struct stack_frame_ia32")
    @NotUsableInJava
    public static class stack_frame_ia32
    extends Struct {
        public @Unsigned int next_frame;
        public @Unsigned int return_address;
    }

    @Type(noCCodeGeneration=true, cType="struct stack_frame")
    @NotUsableInJava
    public static class stack_frame
    extends Struct {
        public Ptr<stack_frame> next_frame;
        public @Unsigned long return_address;
    }

    @Type(noCCodeGeneration=true, cType="struct stack_info")
    @NotUsableInJava
    public static class stack_info
    extends Struct {
        public stack_type type;
        public Ptr<@Unsigned Long> begin;
        public Ptr<@Unsigned Long> end;
        public Ptr<@Unsigned Long> next_sp;
    }

    @Type(noCCodeGeneration=true, cType="enum stack_type")
    public static enum stack_type implements Enum<stack_type>,
    TypedEnum<stack_type, Integer>
    {
        STACK_TYPE_UNKNOWN,
        STACK_TYPE_TASK,
        STACK_TYPE_IRQ,
        STACK_TYPE_SOFTIRQ,
        STACK_TYPE_ENTRY,
        STACK_TYPE_EXCEPTION,
        STACK_TYPE_EXCEPTION_LAST;

    }
}

