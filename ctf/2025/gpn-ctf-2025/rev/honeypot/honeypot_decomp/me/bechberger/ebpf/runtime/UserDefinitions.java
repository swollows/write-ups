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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DynDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MlsDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PrintDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UserDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="user_describe((const struct key*)$arg1, $arg2)")
    public static void user_describe(Ptr<runtime.key> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_free_payload_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_free_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean user_page_pipe_buf_try_steal(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_reader_timeout(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_return_notifier_register(Ptr<user_return_notifier> urn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_return_notifier_unregister(Ptr<user_return_notifier> urn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_revoke(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_single_step_report(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_update(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_bounds_sanity_check(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_dyn_field_set_string($arg1, (const u8**)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int user_dyn_field_set_string(int argc, Ptr<String> argv, Ptr<Integer> iout, String buf, int len, Ptr<@OriginalName(value="bool") Boolean> colon) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_enter_callable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_epoll_alloc(Ptr<user_struct> up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_event_create((const u8*)$arg1)")
    public static int user_event_create(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<user_event_enabler> user_event_enabler_create(Ptr<user_reg> reg, Ptr<user_event> user, Ptr<Integer> write_result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_enabler_fault_fixup(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_enabler_write(Ptr<user_event_mm> mm, Ptr<user_event_enabler> enabler, boolean fixup_fault, Ptr<Integer> attempt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_free(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_ftrace(Ptr<user_event> user, Ptr<IovDefinitions.iov_iter> i, Ptr<?> tpdata, Ptr<@OriginalName(value="bool") Boolean> faulted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> user_event_get_fields(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_group_destroy(Ptr<user_event_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean user_event_is_busy(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int user_event_key(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_event_match((const u8*)$arg1, (const u8*)$arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static boolean user_event_match(String system, String event2, int argc, Ptr<String> argv, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<user_event_mm> user_event_mm_alloc(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_mm_destroy(Ptr<user_event_mm> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_mm_dup(Ptr<TaskDefinitions.task_struct> t, Ptr<user_event_mm> old_mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_mm_fault_in(Ptr<user_event_mm> mm, @Unsigned long uaddr, int attempt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_mm_put(Ptr<user_event_mm> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_mm_remove(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_parse(Ptr<user_event_group> group, String name, String args, String flags, Ptr<Ptr<user_event>> newuser, int reg_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_parse_cmd(Ptr<user_event_group> group, String raw_command, Ptr<Ptr<user_event>> newuser, int reg_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_parse_field(String field, Ptr<user_event> user, Ptr<@Unsigned Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_perf(Ptr<user_event> user, Ptr<IovDefinitions.iov_iter> i, Ptr<?> tpdata, Ptr<@OriginalName(value="bool") Boolean> faulted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t user_event_print_trace(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_event_put(Ptr<user_event> user, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_reg(Ptr<TraceDefinitions.trace_event_call> call, TraceDefinitions.trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_set_call_visible(Ptr<user_event> user, boolean visible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_set_print_fmt(Ptr<user_event> user, String buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_show(Ptr<SeqDefinitions.seq_file> m, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_event_validate(Ptr<user_event> user, Ptr<?> data, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long user_events_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long user_events_ioctl_reg(Ptr<user_event_file_info> info2, @Unsigned long uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long user_events_ioctl_unreg(@Unsigned long uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_events_open(Ptr<runtime.inode> node2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_events_release(Ptr<runtime.inode> node2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_events_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long user_events_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long user_events_write_iter(Ptr<runtime.kiocb> kp, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_exit_callable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_field_array_size((const u8*)$arg1)")
    public static int user_field_array_size(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)user_field_format((const u8*)$arg1))")
    public static String user_field_format(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_field_match($arg1, $arg2, (const u8**)$arg3, $arg4)")
    public static boolean user_field_match(Ptr<FtraceDefinitions.ftrace_event_field> field, int argc, Ptr<String> argv, Ptr<Integer> iout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_field_set_string(Ptr<FtraceDefinitions.ftrace_event_field> field, String buf, int len, boolean colon) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_field_size((const u8*)$arg1)")
    public static int user_field_size(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_index(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_mode_thread((int (*)(void*))$arg1, $arg2, $arg3)")
    public static @OriginalName(value="pid_t") int user_mode_thread(Ptr<?> fn, Ptr<?> arg2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_namespaces_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_path_at($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int user_path_at(int dfd, String name, @Unsigned int flags, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_path_create($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.dentry> user_path_create(int dfd, String pathname, Ptr<runtime.path> path2, @Unsigned int lookup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_path_locked_at($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.dentry> user_path_locked_at(int dfd, String name, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> user_seq_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> user_seq_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_seq_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_shm_lock(@Unsigned long size, Ptr<runtime.ucounts> ucounts2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_shm_unlock(@Unsigned long size, Ptr<runtime.ucounts> ucounts2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_status_open(Ptr<runtime.inode> node2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_write(Ptr<?> vkey, Ptr<?> datum, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_disable_single_step(Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_enable_block_step(Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_enable_single_step(Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_namespace_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_space_bind(Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void user_exc_vmm_communication(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SuperDefinitions.super_block> user_get_super(@Unsigned @OriginalName(value="dev_t") int dev, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_regset_copyin($arg1, $arg2, (const void**)$arg3, (const void**)$arg4, $arg5, (const int)$arg6, (const int)$arg7)")
    public static int user_regset_copyin(Ptr<@Unsigned Integer> pos, Ptr<@Unsigned Integer> count, Ptr<Ptr<?>> kbuf, Ptr<Ptr<?>> ubuf, Ptr<?> data, int start_pos, int end_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="user_statfs((const u8*)$arg1, $arg2)")
    public static int user_statfs(String pathname, Ptr<runtime.kstatfs> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_termio_to_kernel_termios(Ptr<runtime.ktermios> termios3, Ptr<runtime.termio> termio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_termios_to_kernel_termios(Ptr<runtime.ktermios> k, Ptr<runtime.termios2> u) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int user_termios_to_kernel_termios_1(Ptr<runtime.ktermios> k, Ptr<runtime.termios> u) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct user_regs_struct")
    @NotUsableInJava
    public static class user_regs_struct
    extends Struct {
        public @Unsigned long r15;
        public @Unsigned long r14;
        public @Unsigned long r13;
        public @Unsigned long r12;
        public @Unsigned long bp;
        public @Unsigned long bx;
        public @Unsigned long r11;
        public @Unsigned long r10;
        public @Unsigned long r9;
        public @Unsigned long r8;
        public @Unsigned long ax;
        public @Unsigned long cx;
        public @Unsigned long dx;
        public @Unsigned long si;
        public @Unsigned long di;
        public @Unsigned long orig_ax;
        public @Unsigned long ip;
        public @Unsigned long cs;
        public @Unsigned long flags;
        public @Unsigned long sp;
        public @Unsigned long ss;
        public @Unsigned long fs_base;
        public @Unsigned long gs_base;
        public @Unsigned long ds;
        public @Unsigned long es;
        public @Unsigned long fs;
        public @Unsigned long gs;
    }

    @Type(noCCodeGeneration=true, cType="struct user_regs_struct32")
    @NotUsableInJava
    public static class user_regs_struct32
    extends Struct {
        public @Unsigned int ebx;
        public @Unsigned int ecx;
        public @Unsigned int edx;
        public @Unsigned int esi;
        public @Unsigned int edi;
        public @Unsigned int ebp;
        public @Unsigned int eax;
        public @Unsigned short ds;
        public @Unsigned short __ds;
        public @Unsigned short es;
        public @Unsigned short __es;
        public @Unsigned short fs;
        public @Unsigned short __fs;
        public @Unsigned short gs;
        public @Unsigned short __gs;
        public @Unsigned int orig_eax;
        public @Unsigned int eip;
        public @Unsigned short cs;
        public @Unsigned short __cs;
        public @Unsigned int eflags;
        public @Unsigned int esp;
        public @Unsigned short ss;
        public @Unsigned short __ss;
    }

    @Type(noCCodeGeneration=true, cType="struct user_arg_ptr")
    @NotUsableInJava
    public static class user_arg_ptr
    extends Struct {
        public boolean is_compat;
        public misc.ptr_of_user_arg_ptr ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct user_syms")
    @NotUsableInJava
    public static class user_syms
    extends Struct {
        public Ptr<String> syms;
        public String buf;
    }

    @Type(noCCodeGeneration=true, cType="struct user_event_validator")
    @NotUsableInJava
    public static class user_event_validator
    extends Struct {
        public ListDefinitions.list_head user_event_link;
        public int offset;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct user_event_file_info")
    @NotUsableInJava
    public static class user_event_file_info
    extends Struct {
        public Ptr<user_event_group> group;
        public Ptr<user_event_refs> refs;
    }

    @Type(noCCodeGeneration=true, cType="struct user_event_refs")
    @NotUsableInJava
    public static class user_event_refs
    extends Struct {
        public misc.callback_head rcu;
        public int count;
        public Ptr<user_event> @Size(value=0) [] events;
    }

    @Type(noCCodeGeneration=true, cType="struct user_event_enabler_fault")
    @NotUsableInJava
    public static class user_event_enabler_fault
    extends Struct {
        public misc.work_struct work;
        public Ptr<user_event_mm> mm;
        public Ptr<user_event_enabler> enabler;
        public int attempt;
    }

    @Type(noCCodeGeneration=true, cType="struct user_event_enabler")
    @NotUsableInJava
    public static class user_event_enabler
    extends Struct {
        public ListDefinitions.list_head mm_enablers_link;
        public Ptr<user_event> event;
        public @Unsigned long addr;
        public @Unsigned long values;
    }

    @Type(noCCodeGeneration=true, cType="struct user_event")
    @NotUsableInJava
    public static class user_event
    extends Struct {
        public Ptr<user_event_group> group;
        public String reg_name;
        public runtime.tracepoint tracepoint;
        public TraceDefinitions.trace_event_call call;
        public TraceDefinitions.trace_event_class _class;
        public DynDefinitions.dyn_event devent;
        public misc.hlist_node node;
        public ListDefinitions.list_head fields;
        public ListDefinitions.list_head validators;
        public misc.work_struct put_work;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public int min_size;
        public int reg_flags;
        public char status;
    }

    @Type(noCCodeGeneration=true, cType="struct user_event_group")
    @NotUsableInJava
    public static class user_event_group
    extends Struct {
        public String system_name;
        public String system_multi_name;
        public misc.hlist_node node;
        public runtime.mutex reg_mutex;
        public misc.hlist_head @Size(value=256) [] register_table;
        public @Unsigned long multi_id;
    }

    @Type(noCCodeGeneration=true, cType="struct user_unreg")
    @NotUsableInJava
    public static class user_unreg
    extends Struct {
        public @Unsigned int size;
        public char disable_bit;
        public char __reserved;
        public @Unsigned short __reserved2;
        public @Unsigned long disable_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct user_reg")
    @NotUsableInJava
    public static class user_reg
    extends Struct {
        public @Unsigned int size;
        public char enable_bit;
        public char enable_size;
        public @Unsigned short flags;
        public @Unsigned long enable_addr;
        public @Unsigned long name_args;
        public @Unsigned int write_index;
    }

    @Type(noCCodeGeneration=true, cType="enum user_reg_flag")
    public static enum user_reg_flag implements Enum<user_reg_flag>,
    TypedEnum<user_reg_flag, Integer>
    {
        USER_EVENT_REG_PERSIST,
        USER_EVENT_REG_MULTI_FORMAT,
        USER_EVENT_REG_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct user_event_mm")
    @NotUsableInJava
    public static class user_event_mm
    extends Struct {
        public ListDefinitions.list_head mms_link;
        public ListDefinitions.list_head enablers;
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<user_event_mm> next;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @OriginalName(value="refcount_t") misc.refcount_struct tasks;
        public RcuDefinitions.rcu_work put_rwork;
    }

    @Type(noCCodeGeneration=true, cType="struct user_msghdr")
    @NotUsableInJava
    public static class user_msghdr
    extends Struct {
        public Ptr<?> msg_name;
        public int msg_namelen;
        public Ptr<runtime.iovec> msg_iov;
        public @Unsigned @OriginalName(value="__kernel_size_t") long msg_iovlen;
        public Ptr<?> msg_control;
        public @Unsigned @OriginalName(value="__kernel_size_t") long msg_controllen;
        public @Unsigned int msg_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct user_return_notifier")
    @NotUsableInJava
    public static class user_return_notifier
    extends Struct {
        public Ptr<?> on_user_return;
        public misc.hlist_node link;
    }

    @Type(noCCodeGeneration=true, cType="struct __user_cap_data_struct")
    @NotUsableInJava
    public static class __user_cap_data_struct
    extends Struct {
        public @Unsigned int effective;
        public @Unsigned int permitted;
        public @Unsigned int inheritable;
    }

    @Type(noCCodeGeneration=true, cType="struct __user_cap_header_struct")
    @NotUsableInJava
    public static class __user_cap_header_struct
    extends Struct {
        public @Unsigned int version;
        public int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct user_regset_view")
    @NotUsableInJava
    public static class user_regset_view
    extends Struct {
        public String name;
        public Ptr<user_regset> regsets;
        public @Unsigned int n;
        public @Unsigned int e_flags;
        public @Unsigned short e_machine;
        public char ei_osabi;
    }

    @Type(noCCodeGeneration=true, cType="struct user_desc")
    @NotUsableInJava
    public static class user_desc
    extends Struct {
        public @Unsigned int entry_number;
        public @Unsigned int base_addr;
        public @Unsigned int limit;
        public @Unsigned int seg_32bit;
        public @Unsigned int contents;
        public @Unsigned int read_exec_only;
        public @Unsigned int limit_in_pages;
        public @Unsigned int seg_not_present;
        public @Unsigned int useable;
        public @Unsigned int lm;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct hlist_node list; long long unsigned int detach_time; unsigned int napi_id; unsigned int id; }")
    @NotUsableInJava
    public static class user_of_page_pool
    extends Struct {
        public misc.hlist_node list;
        public @Unsigned long detach_time;
        public @Unsigned int napi_id;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct user_datum")
    @NotUsableInJava
    public static class user_datum
    extends Struct {
        public @Unsigned int value;
        public @Unsigned int bounds;
        public runtime.ebitmap roles;
        public MlsDefinitions.mls_range range;
        public MlsDefinitions.mls_level dfltlevel;
    }

    @Type(noCCodeGeneration=true, cType="struct user_key_payload")
    @NotUsableInJava
    public static class user_key_payload
    extends Struct {
        public misc.callback_head rcu;
        public @Unsigned short datalen;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct user_regset")
    @NotUsableInJava
    public static class user_regset
    extends Struct {
        public Ptr<?> regset_get;
        public Ptr<?> set;
        public Ptr<?> active;
        public Ptr<?> writeback;
        public @Unsigned int n;
        public @Unsigned int size;
        public @Unsigned int align;
        public @Unsigned int bias;
        public @Unsigned int core_note_type;
    }

    @Type(noCCodeGeneration=true, cType="struct user_i387_ia32_struct")
    @NotUsableInJava
    public static class user_i387_ia32_struct
    extends Struct {
        public @Unsigned int cwd;
        public @Unsigned int swd;
        public @Unsigned int twd;
        public @Unsigned int fip;
        public @Unsigned int fcs;
        public @Unsigned int foo;
        public @Unsigned int fos;
        public @Unsigned int @Size(value=20) [] st_space;
    }

    @Type(noCCodeGeneration=true, cType="struct user_struct")
    @NotUsableInJava
    public static class user_struct
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct __count;
        public PercpuDefinitions.percpu_counter epoll_watches;
        public @Unsigned long unix_inflight;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t pipe_bufs;
        public misc.hlist_node uidhash_node;
        public misc.kuid_t uid;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t locked_vm;
        public AtomicDefinitions.atomic_t nr_watches;
        public misc.ratelimit_state ratelimit;
    }

    @Type(noCCodeGeneration=true, cType="struct user_namespace")
    @NotUsableInJava
    public static class user_namespace
    extends Struct {
        public misc.uid_gid_map uid_map;
        public misc.uid_gid_map gid_map;
        public misc.uid_gid_map projid_map;
        public Ptr<user_namespace> parent;
        public int level;
        public misc.kuid_t owner;
        public misc.kgid_t group;
        public NsDefinitions.ns_common ns;
        public @Unsigned long flags;
        public boolean parent_could_setfcap;
        public ListDefinitions.list_head keyring_name_list;
        public Ptr<runtime.key> user_keyring_register;
        public misc.rw_semaphore keyring_sem;
        public Ptr<runtime.key> persistent_keyring_register;
        public misc.work_struct work;
        public misc.ctl_table_set set;
        public Ptr<misc.ctl_table_header> sysctls;
        public Ptr<runtime.ucounts> ucounts;
        public long @Size(value=12) [] ucount_max;
        public long @Size(value=4) [] rlimit_max;
        public Ptr<misc.binfmt_misc> binfmt_misc;
    }
}

