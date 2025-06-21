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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EventfsDefinitions;
import me.bechberger.ebpf.runtime.ExitDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.ProgDefinitions;
import me.bechberger.ebpf.runtime.PtraceDefinitions;
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

public final class EventDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long event_count_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long event_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_thread(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long event_group_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long event_inject_read(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_inject_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long event_inject_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long event_channels_show(Ptr<runtime.device> _dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_create_dir(Ptr<EventfsDefinitions.eventfs_inode> parent, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_define_fields(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_enable_count_probe(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<FtraceDefinitions.ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_enable_count_trigger(Ptr<event_trigger_data> data, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_enable_free(Ptr<FtraceDefinitions.ftrace_probe_ops> ops, Ptr<TraceDefinitions.trace_array> tr, @Unsigned long ip, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_enable_func(Ptr<TraceDefinitions.trace_array> tr, Ptr<FtraceDefinitions.ftrace_hash> hash2, String glob, String cmd, String param2, int enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<event_trigger_ops> event_enable_get_trigger_ops(String cmd, String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_enable_init(Ptr<FtraceDefinitions.ftrace_probe_ops> ops, Ptr<TraceDefinitions.trace_array> tr, @Unsigned long ip, Ptr<?> init_data, Ptr<Ptr<?>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_enable_print(Ptr<SeqDefinitions.seq_file> m, @Unsigned long ip, Ptr<FtraceDefinitions.ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_enable_probe(@Unsigned long ip, @Unsigned long parent_ip, Ptr<TraceDefinitions.trace_array> tr, Ptr<FtraceDefinitions.ftrace_probe_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long event_enable_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_enable_register_trigger(String glob, Ptr<event_trigger_data> data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_enable_trigger(Ptr<event_trigger_data> data, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_enable_trigger_free(Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_enable_trigger_parse(Ptr<event_command> cmd_ops, Ptr<TraceDefinitions.trace_event_file> file2, String glob, String cmd, String param_and_filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_enable_trigger_print(Ptr<SeqDefinitions.seq_file> m, Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_enable_unregister_trigger(String glob, Ptr<event_trigger_data> test2, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_enable_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long event_enable_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_file_get(Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_file_put(Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_filter_pid_sched_process_exit(Ptr<?> data, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_filter_pid_sched_process_fork(Ptr<?> data, Ptr<TaskDefinitions.task_struct> self, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_filter_pid_sched_switch_probe_post(Ptr<?> data, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_filter_pid_sched_switch_probe_pre(Ptr<?> data, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_filter_pid_sched_wakeup_probe_post(Ptr<?> data, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_filter_pid_sched_wakeup_probe_pre(Ptr<?> data, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long event_filter_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_filter_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long event_filter_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_function(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_function_call(Ptr<PerfDefinitions.perf_event> event2, @OriginalName(value="event_f") Ptr<?> func, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<event_trigger_ops> event_hist_get_trigger_ops(String cmd, String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_hist_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_hist_trigger(Ptr<event_trigger_data> data, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> rbe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_hist_trigger_free(Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_hist_trigger_init(Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_hist_trigger_named_free(Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_hist_trigger_named_init(Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_hist_trigger_parse(Ptr<event_command> cmd_ops, Ptr<TraceDefinitions.trace_event_file> file2, String glob, String cmd, String param_and_filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_hist_trigger_print(Ptr<SeqDefinitions.seq_file> m, Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long event_id_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_init(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_release((const u8*)$arg1, $arg2)")
    public static void event_release(String name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_remove(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_sched_in(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_sched_out(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_subsystem_dir($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<EventfsDefinitions.eventfs_inode> event_subsystem_dir(Ptr<TraceDefinitions.trace_array> tr, String name, Ptr<TraceDefinitions.trace_event_file> file2, Ptr<EventfsDefinitions.eventfs_inode> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trace_add_tracer(Ptr<runtime.dentry> parent, Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trace_del_tracer(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trace_enable_again() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trace_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<event_trigger_data> event_trigger_alloc(Ptr<event_command> cmd_ops, String cmd, String param2, Ptr<?> private_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_trigger_check_remove((const u8*)$arg1)")
    public static boolean event_trigger_check_remove(String glob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_trigger_empty_param((const u8*)$arg1)")
    public static boolean event_trigger_empty_param(String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_trigger_free(Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trigger_init(Ptr<event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trigger_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trigger_parse(Ptr<event_command> cmd_ops, Ptr<TraceDefinitions.trace_event_file> file2, String glob, String cmd, String param_and_filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trigger_parse_num(String param2, Ptr<event_trigger_data> trigger_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_trigger_print((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int event_trigger_print(String name, Ptr<SeqDefinitions.seq_file> m, Ptr<?> data, String filter_str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trigger_register(Ptr<event_command> cmd_ops, Ptr<TraceDefinitions.trace_event_file> file2, String glob, Ptr<event_trigger_data> trigger_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trigger_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_trigger_reset_filter(Ptr<event_command> cmd_ops, Ptr<event_trigger_data> trigger_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trigger_separate_filter(String param_and_filter, Ptr<String> param2, Ptr<String> filter, boolean param_required) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int event_trigger_set_filter(Ptr<event_command> cmd_ops, Ptr<TraceDefinitions.trace_event_file> file2, String param2, Ptr<event_trigger_data> trigger_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_trigger_unregister(Ptr<event_command> cmd_ops, Ptr<TraceDefinitions.trace_event_file> file2, String glob, Ptr<event_trigger_data> trigger_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="event_trigger_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long event_trigger_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static event_trigger_type event_triggers_call(Ptr<TraceDefinitions.trace_event_file> file2, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void event_triggers_post_call(Ptr<TraceDefinitions.trace_event_file> file2, event_trigger_type tt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct event_counter")
    @NotUsableInJava
    public static class event_counter
    extends Struct {
        public @Unsigned int count;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { unsigned int err; } ack; struct fork_proc_event fork; struct exec_proc_event exec; struct id_proc_event id; struct sid_proc_event sid; struct ptrace_proc_event ptrace; struct comm_proc_event comm; struct coredump_proc_event coredump; struct exit_proc_event exit; }")
    @NotUsableInJava
    public static class event_data_of_proc_event
    extends Union {
        public misc.ack_of_event_data_of_proc_event ack;
        public misc.fork_proc_event fork;
        public misc.exec_proc_event exec;
        public misc.id_proc_event id;
        public misc.sid_proc_event sid;
        public PtraceDefinitions.ptrace_proc_event ptrace;
        public misc.comm_proc_event comm;
        public misc.coredump_proc_event coredump;
        public ExitDefinitions.exit_proc_event exit;
    }

    @Type(noCCodeGeneration=true, cType="struct event_info")
    @NotUsableInJava
    public static class event_info
    extends Struct {
        public @Unsigned int event_type;
        public Ptr<runtime.slot> p_slot;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="union { struct drm_event base; struct drm_event_vblank vbl; struct drm_event_crtc_sequence seq; }")
    @NotUsableInJava
    public static class event_of_drm_pending_vblank_event
    extends Union {
        public DrmDefinitions.drm_event base;
        public DrmDefinitions.drm_event_vblank vbl;
        public DrmDefinitions.drm_event_crtc_sequence seq;
    }

    @Type(noCCodeGeneration=true, cType="struct event_header")
    @NotUsableInJava
    public static class event_header
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short data_len;
        public char notification_class;
        public char reserved1;
        public char nea;
        public char supp_event_class;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; long long unsigned int addr; }")
    @NotUsableInJava
    public static class event_id_of_perf_text_poke_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned long addr;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; short unsigned int type; short unsigned int flags; unsigned int id; u8 tag[8]; }")
    @NotUsableInJava
    public static class event_id_of_perf_bpf_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned short type;
        public @Unsigned short flags;
        public @Unsigned int id;
        public char @Size(value=8) [] tag;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; long long unsigned int addr; unsigned int len; short unsigned int ksym_type; short unsigned int flags; }")
    @NotUsableInJava
    public static class event_id_of_perf_ksymbol_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned long addr;
        public @Unsigned int len;
        public @Unsigned short ksym_type;
        public @Unsigned short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; unsigned int next_prev_pid; unsigned int next_prev_tid; }")
    @NotUsableInJava
    public static class event_id_of_perf_switch_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned int next_prev_pid;
        public @Unsigned int next_prev_tid;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; unsigned int pid; unsigned int tid; long long unsigned int start; long long unsigned int len; long long unsigned int pgoff; }")
    @NotUsableInJava
    public static class event_id_of_perf_mmap_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned int pid;
        public @Unsigned int tid;
        public @Unsigned long start;
        public @Unsigned long len;
        public @Unsigned long pgoff;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; long long unsigned int id; u8 path[0]; }")
    @NotUsableInJava
    public static class event_id_of_perf_cgroup_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned long id;
        public char @Size(value=0) [] path;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; unsigned int pid; unsigned int tid; long long unsigned int nr_namespaces; struct perf_ns_link_info link_info[7]; }")
    @NotUsableInJava
    public static class event_id_of_perf_namespaces_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned int pid;
        public @Unsigned int tid;
        public @Unsigned long nr_namespaces;
        public PerfDefinitions.perf_ns_link_info @Size(value=7) [] link_info;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; unsigned int pid; unsigned int tid; }")
    @NotUsableInJava
    public static class event_id_of_perf_comm_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned int pid;
        public @Unsigned int tid;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct perf_event_header header; unsigned int pid; unsigned int ppid; unsigned int tid; unsigned int ptid; long long unsigned int time; }")
    @NotUsableInJava
    public static class event_id_of_perf_task_event
    extends Struct {
        public PerfDefinitions.perf_event_header header;
        public @Unsigned int pid;
        public @Unsigned int ppid;
        public @Unsigned int tid;
        public @Unsigned int ptid;
        public @Unsigned long time;
    }

    @Type(noCCodeGeneration=true, cType="struct event_function_struct")
    @NotUsableInJava
    public static class event_function_struct
    extends Struct {
        public Ptr<PerfDefinitions.perf_event> event;
        public @OriginalName(value="event_f") Ptr<?> func;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="enum event_type_t")
    public static enum event_type_t implements Enum<event_type_t>,
    TypedEnum<event_type_t, Integer>
    {
        EVENT_FLEXIBLE,
        EVENT_PINNED,
        EVENT_TIME,
        EVENT_FROZEN,
        EVENT_CPU,
        EVENT_CGROUP,
        EVENT_ALL,
        EVENT_TIME_FROZEN;

    }

    @Type(noCCodeGeneration=true, cType="struct event_file_link")
    @NotUsableInJava
    public static class event_file_link
    extends Struct {
        public Ptr<TraceDefinitions.trace_event_file> file;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="enum event_command_flags")
    public static enum event_command_flags implements Enum<event_command_flags>,
    TypedEnum<event_command_flags, Integer>
    {
        EVENT_CMD_FL_POST_TRIGGER,
        EVENT_CMD_FL_NEEDS_REC;

    }

    @Type(noCCodeGeneration=true, cType="struct event_command")
    @NotUsableInJava
    public static class event_command
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public event_trigger_type trigger_type;
        public int flags;
        public Ptr<?> parse;
        public Ptr<?> reg;
        public Ptr<?> unreg;
        public Ptr<?> unreg_all;
        public Ptr<?> set_filter;
        public Ptr<?> get_trigger_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct event_trigger_ops")
    @NotUsableInJava
    public static class event_trigger_ops
    extends Struct {
        public Ptr<?> trigger;
        public Ptr<?> init;
        public Ptr<?> free;
        public Ptr<?> print;
    }

    @Type(noCCodeGeneration=true, cType="struct event_trigger_data")
    @NotUsableInJava
    public static class event_trigger_data
    extends Struct {
        public @Unsigned long count;
        public int ref;
        public int flags;
        public Ptr<event_trigger_ops> ops;
        public Ptr<event_command> cmd_ops;
        public Ptr<event_filter> filter;
        public String filter_str;
        public Ptr<?> private_data;
        public boolean paused;
        public boolean paused_tmp;
        public ListDefinitions.list_head list;
        public String name;
        public ListDefinitions.list_head named_list;
        public Ptr<event_trigger_data> named_data;
    }

    @Type(noCCodeGeneration=true, cType="enum event_trigger_type")
    public static enum event_trigger_type implements Enum<event_trigger_type>,
    TypedEnum<event_trigger_type, Integer>
    {
        ETT_NONE,
        ETT_TRACE_ONOFF,
        ETT_SNAPSHOT,
        ETT_STACKTRACE,
        ETT_EVENT_ENABLE,
        ETT_EVENT_HIST,
        ETT_HIST_ENABLE,
        ETT_EVENT_EPROBE;

    }

    @Type(noCCodeGeneration=true, cType="struct event_probe_data")
    @NotUsableInJava
    public static class event_probe_data
    extends Struct {
        public Ptr<TraceDefinitions.trace_event_file> file;
        public @Unsigned long count;
        public int ref;
        public boolean enable;
    }

    @Type(noCCodeGeneration=true, cType="struct event_subsystem")
    @NotUsableInJava
    public static class event_subsystem
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public Ptr<event_filter> filter;
        public int ref_count;
    }

    @Type(noCCodeGeneration=true, cType="struct event_filter")
    @NotUsableInJava
    public static class event_filter
    extends Struct {
        public Ptr<ProgDefinitions.prog_entry> prog;
        public String filter_string;
    }

    @Type(noCCodeGeneration=true, cType="struct event_constraint")
    @NotUsableInJava
    public static class event_constraint
    extends Struct {
        @InlineUnion(value=3508)
        public @InlineUnion(value=3508) @Unsigned long @Size(value=1) [] idxmsk;
        @InlineUnion(value=3508)
        public @InlineUnion(value=3508) @Unsigned long idxmsk64;
        public @Unsigned long code;
        public @Unsigned long cmask;
        public int weight;
        public int overlap;
        public int flags;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int config; unsigned int type; long long unsigned int cookie; }")
    @NotUsableInJava
    public static class event_of_anon_member_of_perf_event_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long config;
        public @Unsigned int type;
        public @Unsigned long cookie;
    }
}

