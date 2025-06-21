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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DynDefinitions;
import me.bechberger.ebpf.runtime.FgraphDefinitions;
import me.bechberger.ebpf.runtime.FunctionDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class FtraceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ftrace_trace_stack(Ptr<TraceDefinitions.trace_buffer> buffer, @Unsigned int trace_ctx, int skip, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_arch_code_modify_post_process() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_arch_code_modify_prepare() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_boot_snapshot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_count_snapshot(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_dump(ftrace_dump_mode oops_dump_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_dump_buf(int skip_entries, long cpu_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_dump_by_param() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_dump_on_oops_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_dump_one(Ptr<TraceDefinitions.trace_array> tr, ftrace_dump_mode dump_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_exports(Ptr<RingDefinitions.ring_buffer_event> event2, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_func(@Unsigned long ip, @Unsigned long parent_ip, Ptr<ftrace_ops> op, Ptr<ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_make_call(Ptr<DynDefinitions.dyn_ftrace> rec, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_make_nop(Ptr<runtime.module> mod, Ptr<DynDefinitions.dyn_ftrace> rec, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_modify_call(Ptr<DynDefinitions.dyn_ftrace> rec, @Unsigned long old_addr, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_modify_code_direct($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int ftrace_modify_code_direct(@Unsigned long ip, String old_code, String new_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ftrace_now(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_replace_code(int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_snapshot(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_snapshot_free(Ptr<ftrace_probe_ops> ops, Ptr<TraceDefinitions.trace_array> tr, @Unsigned long ip, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_snapshot_init(Ptr<ftrace_probe_ops> ops, Ptr<TraceDefinitions.trace_array> tr, @Unsigned long ip, Ptr<?> init_data, Ptr<Ptr<?>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_snapshot_print(Ptr<SeqDefinitions.seq_file> m, @Unsigned long ip, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_trace_snapshot_callback(Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_hash> hash2, String glob, String cmd, String param2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_update_ftrace_func(@OriginalName(value="ftrace_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_verify_code($arg1, (const u8*)$arg2)")
    public static int ftrace_verify_code(@Unsigned long ip, String old_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_hash> __ftrace_hash_move(Ptr<ftrace_hash> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ftrace_hash_move_and_update_ops(Ptr<ftrace_ops> ops, Ptr<Ptr<ftrace_hash>> orig_hash, Ptr<ftrace_hash> hash2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __ftrace_hash_rec_update(Ptr<ftrace_ops> ops, boolean inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ftrace_hash_update_ipmodify(Ptr<ftrace_ops> ops, Ptr<ftrace_hash> old_hash, Ptr<ftrace_hash> new_hash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ftrace_modify_code(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ftrace_replace_code(Ptr<DynDefinitions.dyn_ftrace> rec, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __ftrace_return_to_handler(Ptr<FgraphDefinitions.fgraph_ret_regs> ret_regs, @Unsigned long frame_pointer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ftrace_vbprintk($arg1, (const u8*)$arg2, $arg3)")
    public static int __ftrace_vbprintk(@Unsigned long ip, String fmt, Ptr<misc.__va_list_tag> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ftrace_vprintk($arg1, (const u8*)$arg2, $arg3)")
    public static int __ftrace_vprintk(@Unsigned long ip, String fmt, Ptr<misc.__va_list_tag> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_page> ftrace_allocate_pages(@Unsigned long num_to_init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_avail_addrs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_avail_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_bug(int failed, Ptr<DynDefinitions.dyn_ftrace> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_caller() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_check_for_weak_functions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_check_record(Ptr<DynDefinitions.dyn_ftrace> rec, boolean enable, boolean update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_check_sync() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_check_work_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_clear_pids(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_cmp_ips((const void*)$arg1, (const void*)$arg2)")
    public static int ftrace_cmp_ips(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_cmp_recs((const void*)$arg1, (const void*)$arg2)")
    public static int ftrace_cmp_recs(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_create_filter_files(Ptr<ftrace_ops> ops, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_destroy_filter_files(Ptr<ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_disable_ftrace_graph_caller() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_dyn_arch_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_enable_ftrace_graph_caller() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_enable_sysctl((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ftrace_enable_sysctl(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_enabled_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_filter_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_filter_pid_sched_switch_probe(Ptr<?> data, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_filter_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_filter_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ftrace_find_rec_direct(@Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_ops> ftrace_find_tramp_ops_any(Ptr<DynDefinitions.dyn_ftrace> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_ops> ftrace_find_unique_ops(Ptr<DynDefinitions.dyn_ftrace> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_formats_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_free_filter(Ptr<ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_free_init_mem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_free_mem(Ptr<runtime.module> mod, Ptr<?> start_ptr, Ptr<?> end_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_free_mod_map(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_free_pages(Ptr<ftrace_page> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_func_address_lookup(Ptr<ftrace_mod_map> mod_map, @Unsigned long addr2, Ptr<@Unsigned Long> size, Ptr<@Unsigned Long> off, String sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_func_mapper_add_ip(Ptr<ftrace_func_mapper> mapper, @Unsigned long ip, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<?>> ftrace_func_mapper_find_ip(Ptr<ftrace_func_mapper> mapper, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ftrace_func_mapper_remove_ip(Ptr<ftrace_func_mapper> mapper, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ftrace_get_addr_curr(Ptr<DynDefinitions.dyn_ftrace> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ftrace_get_addr_new(Ptr<DynDefinitions.dyn_ftrace> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_enable_direct(boolean enable_branch, Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_graph_entry_stub(Ptr<ftrace_graph_ent> trace, Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_exit_task(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_ret_stack> ftrace_graph_get_ret_stack(Ptr<TaskDefinitions.task_struct> task2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_graph_time_control(boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_init_idle_task(Ptr<TaskDefinitions.task_struct> t, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_init_task(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_graph_notrace_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_graph_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_probe_sched_switch(Ptr<?> ignore, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_graph_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ftrace_graph_ret_addr(Ptr<TaskDefinitions.task_struct> task2, Ptr<Integer> idx, @Unsigned long ret, Ptr<@Unsigned Long> retp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_ret_stub(Ptr<ftrace_graph_ret> trace, Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_graph_set_hash(Ptr<ftrace_hash> hash2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_sleep_time_control(boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_graph_stop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_graph_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_graph_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_hash_move_and_update_ops(Ptr<ftrace_ops> ops, Ptr<Ptr<ftrace_hash>> orig_hash, Ptr<ftrace_hash> hash2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_hash_rec_update_modify(Ptr<ftrace_ops> ops, boolean inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_init_array_ops(Ptr<TraceDefinitions.trace_array> tr, @OriginalName(value="ftrace_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_init_global_array_ops(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_init_trace_array(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_init_tracefs(Ptr<TraceDefinitions.trace_array> tr, Ptr<runtime.dentry> d_tracer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_init_tracefs_toplevel(Ptr<TraceDefinitions.trace_array> tr, Ptr<runtime.dentry> d_tracer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_is_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_kill() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ftrace_location(@Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ftrace_location_range(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_func_entry> ftrace_lookup_ip(Ptr<ftrace_hash> hash2, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_lookup_symbols((const u8**)$arg1, $arg2, $arg3)")
    public static int ftrace_lookup_symbols(Ptr<String> sorted_syms, @Unsigned long cnt, Ptr<@Unsigned Long> addrs2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_match(String str, Ptr<ftrace_glob> g) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_match_record(Ptr<DynDefinitions.dyn_ftrace> rec, Ptr<ftrace_glob> func_g, Ptr<ftrace_glob> mod_g, int exclude_mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_mod_address_lookup(@Unsigned long addr2, Ptr<@Unsigned Long> size, Ptr<@Unsigned Long> off, Ptr<String> modname, String sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_mod_callback(Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_hash> hash2, String func_orig, String cmd, String module2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_mod_cmd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_mod_get_kallsym(@Unsigned int symnum, Ptr<@Unsigned Long> value, String type2, String name, String module_name, Ptr<Integer> exported) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_modify_all_code(int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_module_enable(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_module_init(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_no_pid_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_no_pid_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_no_pid_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_notrace_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_notrace_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_notrace_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_ops_assist_func(@Unsigned long ip, @Unsigned long parent_ip, Ptr<ftrace_ops> op, Ptr<ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ftrace_func_t") Ptr<?> ftrace_ops_get_func(Ptr<ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_ops_init(Ptr<ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_ops_set_global_filter(Ptr<ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_ops_test(Ptr<ftrace_ops> ops, @Unsigned long ip, Ptr<?> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_ops> ftrace_ops_trampoline(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_pid_follow_fork(Ptr<TraceDefinitions.trace_array> tr, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_pid_follow_sched_process_exit(Ptr<?> data, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_pid_follow_sched_process_fork(Ptr<?> data, Ptr<TaskDefinitions.task_struct> self, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_pid_func(@Unsigned long ip, @Unsigned long parent_ip, Ptr<ftrace_ops> op, Ptr<ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_pid_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_pid_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_pid_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_pid_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ftrace_pids_enabled(Ptr<ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_process_locs(Ptr<runtime.module> mod, Ptr<@Unsigned Long> start, Ptr<@Unsigned Long> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_profile_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ftrace_profile_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_profile_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_profile_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_rec_iter> ftrace_rec_iter_next(Ptr<ftrace_rec_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DynDefinitions.dyn_ftrace> ftrace_rec_iter_record(Ptr<ftrace_rec_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ftrace_rec_iter> ftrace_rec_iter_start() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_regex_open(Ptr<ftrace_ops> ops, int flag, Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_regex_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_regs_caller() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_release_mod(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_reset_array_ops(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ftrace_return_to_handler(Ptr<FgraphDefinitions.fgraph_ret_regs> ret_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_run_stop_machine(int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_set_early_filter(Ptr<ftrace_ops> ops, String buf, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_set_filter(Ptr<ftrace_ops> ops, String buf, int len, int reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_set_filter_ip(Ptr<ftrace_ops> ops, @Unsigned long ip, int remove2, int reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_set_filter_ips(Ptr<ftrace_ops> ops, Ptr<@Unsigned Long> ips, @Unsigned int cnt, int remove2, int reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_set_global_filter(String buf, int len, int reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_set_global_notrace(String buf, int len, int reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_set_hash(Ptr<ftrace_ops> ops, String buf, int len, Ptr<@Unsigned Long> ips, @Unsigned int cnt, int remove2, int reset, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_set_notrace(Ptr<ftrace_ops> ops, String buf, int len, int reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_set_regex(Ptr<ftrace_ops> ops, String buf, int len, int reset, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_shutdown(Ptr<ftrace_ops> ops, int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_shutdown_subops(Ptr<ftrace_ops> ops, Ptr<ftrace_ops> subops, int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_startup(Ptr<ftrace_ops> ops, int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_startup_subops(Ptr<ftrace_ops> ops, Ptr<ftrace_ops> subops, int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_stub() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_stub_direct_tramp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_stub_graph() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_suspend_notifier_call(Ptr<misc.notifier_block> bl, @Unsigned long state2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_sync_ipi(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_syscall_enter(Ptr<?> data, Ptr<PtDefinitions.pt_regs> regs, long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_syscall_exit(Ptr<?> data, Ptr<PtDefinitions.pt_regs> regs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_test_record(Ptr<DynDefinitions.dyn_ftrace> rec, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_text_reserved((const void*)$arg1, (const void*)$arg2)")
    public static int ftrace_text_reserved(Ptr<?> start, Ptr<?> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_touched_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_trampoline_free(Ptr<ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_update_ops(Ptr<ftrace_ops> ops, Ptr<ftrace_hash> filter_hash, Ptr<ftrace_hash> notrace_hash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_update_pid_func() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_update_record(Ptr<DynDefinitions.dyn_ftrace> rec, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_update_trampoline(Ptr<ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ftrace_function_set_filter(int filter, String buf, int len, Ptr<FunctionDefinitions.function_filter_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_allocate_ftrace_ops(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_count_free(Ptr<ftrace_probe_ops> ops, Ptr<TraceDefinitions.trace_array> tr, @Unsigned long ip, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_count_init(Ptr<ftrace_probe_ops> ops, Ptr<TraceDefinitions.trace_array> tr, @Unsigned long ip, Ptr<?> init_data, Ptr<Ptr<?>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_cpudump_callback(Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_hash> hash2, String glob, String cmd, String param2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_cpudump_print(Ptr<SeqDefinitions.seq_file> m, @Unsigned long ip, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_cpudump_probe(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_create_function_files(Ptr<TraceDefinitions.trace_array> tr, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_destroy_function_files(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_dump_callback(Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_hash> hash2, String glob, String cmd, String param2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_dump_print(Ptr<SeqDefinitions.seq_file> m, @Unsigned long ip, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_dump_probe(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ftrace_event_is_function(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_event_register(Ptr<TraceDefinitions.trace_event_call> call, TraceDefinitions.trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TraceDefinitions.trace_event> ftrace_find_event(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_free_ftrace_ops(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_profile_free_filter(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_profile_set_filter(Ptr<PerfDefinitions.perf_event> event2, int event_id, String filter_str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_stacktrace(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_stacktrace_callback(Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_hash> hash2, String glob, String cmd, String param2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_stacktrace_count(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_stacktrace_print(Ptr<SeqDefinitions.seq_file> m, @Unsigned long ip, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_trace_onoff_callback(Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_hash> hash2, String glob, String cmd, String param2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_traceoff(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_traceoff_count(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_traceoff_print(Ptr<SeqDefinitions.seq_file> m, @Unsigned long ip, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_traceon(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ftrace_traceon_count(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_traceon_print(Ptr<SeqDefinitions.seq_file> m, @Unsigned long ip, Ptr<ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ftrace_clear_event_pids(Ptr<TraceDefinitions.trace_array> tr, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ftrace_event_enable_disable(Ptr<TraceDefinitions.trace_event_file> file2, int enable, int soft_disable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ftrace_set_clr_event_nolock($arg1, (const u8*)$arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5)")
    public static int __ftrace_set_clr_event_nolock(Ptr<TraceDefinitions.trace_array> tr, String match, String sub, String event2, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_event_avail_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_event_npid_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_event_npid_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_event_pid_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_event_pid_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_event_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_event_set_npid_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_event_set_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_event_set_pid_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ftrace_event_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ftrace_event_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ftrace_set_clr_event(Ptr<TraceDefinitions.trace_array> tr, String buf, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_graph_ret_entry")
    @NotUsableInJava
    public static class ftrace_graph_ret_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public ftrace_graph_ret ret;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_graph_ent_entry")
    @NotUsableInJava
    public static class ftrace_graph_ent_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public ftrace_graph_ent graph_ent;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_init_func")
    @NotUsableInJava
    public static class ftrace_init_func
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long ip;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_mod_map")
    @NotUsableInJava
    public static class ftrace_mod_map
    extends Struct {
        public misc.callback_head rcu;
        public ListDefinitions.list_head list;
        public Ptr<runtime.module> mod;
        public @Unsigned long start_addr;
        public @Unsigned long end_addr;
        public ListDefinitions.list_head funcs;
        public @Unsigned int num_funcs;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_mod_func")
    @NotUsableInJava
    public static class ftrace_mod_func
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public @Unsigned long ip;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_graph_data")
    @NotUsableInJava
    public static class ftrace_graph_data
    extends Struct {
        public Ptr<ftrace_hash> hash;
        public Ptr<ftrace_func_entry> entry;
        public int idx;
        public misc.graph_filter_type type;
        public Ptr<ftrace_hash> new_hash;
        public Ptr<SeqDefinitions.seq_operations> seq_ops;
        public TraceDefinitions.trace_parser parser;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_func_mapper")
    @NotUsableInJava
    public static class ftrace_func_mapper
    extends Struct {
        public ftrace_hash hash;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_func_map")
    @NotUsableInJava
    public static class ftrace_func_map
    extends Struct {
        public ftrace_func_entry entry;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_glob")
    @NotUsableInJava
    public static class ftrace_glob
    extends Struct {
        public String search;
        public @Unsigned int len;
        public int type;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_iterator")
    @NotUsableInJava
    public static class ftrace_iterator
    extends Struct {
        public @OriginalName(value="loff_t") long pos;
        public @OriginalName(value="loff_t") long func_pos;
        public @OriginalName(value="loff_t") long mod_pos;
        public Ptr<ftrace_page> pg;
        public Ptr<DynDefinitions.dyn_ftrace> func;
        public Ptr<ftrace_func_probe> probe;
        public Ptr<ftrace_func_entry> probe_entry;
        public TraceDefinitions.trace_parser parser;
        public Ptr<ftrace_hash> hash;
        public Ptr<ftrace_ops> ops;
        public Ptr<TraceDefinitions.trace_array> tr;
        public Ptr<ListDefinitions.list_head> mod_list;
        public int pidx;
        public int idx;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_rec_iter")
    @NotUsableInJava
    public static class ftrace_rec_iter
    extends Struct {
        public Ptr<ftrace_page> pg;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_page")
    @NotUsableInJava
    public static class ftrace_page
    extends Struct {
        public Ptr<ftrace_page> next;
        public Ptr<DynDefinitions.dyn_ftrace> records;
        public int index;
        public int order;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_func_probe")
    @NotUsableInJava
    public static class ftrace_func_probe
    extends Struct {
        public Ptr<ftrace_probe_ops> probe_ops;
        public ftrace_ops ops;
        public Ptr<TraceDefinitions.trace_array> tr;
        public ListDefinitions.list_head list;
        public Ptr<?> data;
        public int ref;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_profile_stat")
    @NotUsableInJava
    public static class ftrace_profile_stat
    extends Struct {
        public AtomicDefinitions.atomic_t disabled;
        public Ptr<misc.hlist_head> hash;
        public Ptr<ftrace_profile_page> pages;
        public Ptr<ftrace_profile_page> start;
        public misc.tracer_stat stat;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_profile_page")
    @NotUsableInJava
    public static class ftrace_profile_page
    extends Struct {
        public Ptr<ftrace_profile_page> next;
        public @Unsigned long index;
        public ftrace_profile @Size(value=0) [] records;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_profile")
    @NotUsableInJava
    public static class ftrace_profile
    extends Struct {
        public misc.hlist_node node;
        public @Unsigned long ip;
        public @Unsigned long counter;
        public @Unsigned long time;
        public @Unsigned long time_squared;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_mod_load")
    @NotUsableInJava
    public static class ftrace_mod_load
    extends Struct {
        public ListDefinitions.list_head list;
        public String func;
        public String module;
        public int enable;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_ret_stack")
    @NotUsableInJava
    public static class ftrace_ret_stack
    extends Struct {
        public @Unsigned long ret;
        public @Unsigned long func;
        public @Unsigned long calltime;
        public @Unsigned long subtime;
        public Ptr<@Unsigned Long> retp;
    }

    @Type(noCCodeGeneration=true, cType="enum ftrace_bug_type")
    public static enum ftrace_bug_type implements Enum<ftrace_bug_type>,
    TypedEnum<ftrace_bug_type, Integer>
    {
        FTRACE_BUG_UNKNOWN,
        FTRACE_BUG_INIT,
        FTRACE_BUG_NOP,
        FTRACE_BUG_CALL,
        FTRACE_BUG_UPDATE;

    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_func_entry")
    @NotUsableInJava
    public static class ftrace_func_entry
    extends Struct {
        public misc.hlist_node hlist;
        public @Unsigned long ip;
        public @Unsigned long direct;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_buffer_info")
    @NotUsableInJava
    public static class ftrace_buffer_info
    extends Struct {
        public TraceDefinitions.trace_iterator iter;
        public Ptr<?> spare;
        public @Unsigned int spare_cpu;
        public @Unsigned int spare_size;
        public @Unsigned int read;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_stacks")
    @NotUsableInJava
    public static class ftrace_stacks
    extends Struct {
        public ftrace_stack @Size(value=4) [] stacks;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_stack")
    @NotUsableInJava
    public static class ftrace_stack
    extends Struct {
        public @Unsigned long @Size(value=1024) [] calls;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_entry")
    @NotUsableInJava
    public static class ftrace_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned long ip;
        public @Unsigned long parent_ip;
    }

    @Type(noCCodeGeneration=true, cType="enum ftrace_dump_mode")
    public static enum ftrace_dump_mode implements Enum<ftrace_dump_mode>,
    TypedEnum<ftrace_dump_mode, Integer>
    {
        DUMP_NONE,
        DUMP_ALL,
        DUMP_ORIG,
        DUMP_PARAM;

    }

    @Type(noCCodeGeneration=true, cType="union ftrace_op_code_union")
    @NotUsableInJava
    public static class ftrace_op_code_union
    extends Union {
        public char @Size(value=7) [] code;
        public AnonDefinitions.anon_member_of_ftrace_op_code_union anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_event_field")
    @NotUsableInJava
    public static class ftrace_event_field
    extends Struct {
        public ListDefinitions.list_head link;
        public String name;
        public String type;
        public int filter_type;
        public int offset;
        public int size;
        public int is_signed;
        public int len;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_probe_ops")
    @NotUsableInJava
    public static class ftrace_probe_ops
    extends Struct {
        public Ptr<?> func;
        public Ptr<?> init;
        public Ptr<?> free;
        public Ptr<?> print;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_func_command")
    @NotUsableInJava
    public static class ftrace_func_command
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public Ptr<?> func;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_graph_ret")
    @NotUsableInJava
    public static class ftrace_graph_ret
    extends Struct {
        public @Unsigned long func;
        public @Unsigned long retval;
        public int depth;
        public @Unsigned int overrun;
        public @Unsigned long calltime;
        public @Unsigned long rettime;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_graph_ent")
    @NotUsableInJava
    public static class ftrace_graph_ent
    extends Struct {
        public @Unsigned long func;
        public int depth;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_hash")
    @NotUsableInJava
    public static class ftrace_hash
    extends Struct {
        public @Unsigned long size_bits;
        public Ptr<misc.hlist_head> buckets;
        public @Unsigned long count;
        public @Unsigned long flags;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_ops_hash")
    @NotUsableInJava
    public static class ftrace_ops_hash
    extends Struct {
        public Ptr<ftrace_hash> notrace_hash;
        public Ptr<ftrace_hash> filter_hash;
        public runtime.mutex regex_lock;
    }

    @Type(noCCodeGeneration=true, cType="enum ftrace_ops_cmd")
    public static enum ftrace_ops_cmd implements Enum<ftrace_ops_cmd>,
    TypedEnum<ftrace_ops_cmd, Integer>
    {
        FTRACE_OPS_CMD_ENABLE_SHARE_IPMODIFY_SELF,
        FTRACE_OPS_CMD_ENABLE_SHARE_IPMODIFY_PEER,
        FTRACE_OPS_CMD_DISABLE_SHARE_IPMODIFY_PEER;

    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_ops")
    @NotUsableInJava
    public static class ftrace_ops
    extends Struct {
        public @OriginalName(value="ftrace_func_t") Ptr<?> func;
        public Ptr<ftrace_ops> next;
        public @Unsigned long flags;
        public Ptr<?> _private;
        public @OriginalName(value="ftrace_func_t") Ptr<?> saved_func;
        public ftrace_ops_hash local_hash;
        public Ptr<ftrace_ops_hash> func_hash;
        public ftrace_ops_hash old_hash;
        public @Unsigned long trampoline;
        public @Unsigned long trampoline_size;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head subop_list;
        public @OriginalName(value="ftrace_ops_func_t") Ptr<?> ops_func;
        public Ptr<ftrace_ops> managed;
        public @Unsigned long direct_call;
    }

    @Type(noCCodeGeneration=true, cType="struct ftrace_regs")
    @NotUsableInJava
    public static class ftrace_regs
    extends Struct {
        public PtDefinitions.pt_regs regs;
    }
}

