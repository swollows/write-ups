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
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CallDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.CssDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FutexDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.NumaDefinitions;
import me.bechberger.ebpf.runtime.ObjDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.ReclaimDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.RtDefinitions;
import me.bechberger.ebpf.runtime.RvDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.SeccompDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SmackDefinitions;
import me.bechberger.ebpf.runtime.SyscallDefinitions;
import me.bechberger.ebpf.runtime.ThreadDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TomoyoDefinitions;
import me.bechberger.ebpf.runtime.UprobeDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WakeDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TaskDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_change_group_fair(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_dead_fair(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<task_struct> task_early_kill(Ptr<task_struct> tsk, int force_early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_fork_fair(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long task_h_load(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_hot(Ptr<task_struct> p, Ptr<misc.lb_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_is_throttled_fair(Ptr<task_struct> p, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int task_nr_scan_windows(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_numa_assign(Ptr<task_numa_env> env, Ptr<task_struct> p, long imp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean task_numa_compare(Ptr<task_numa_env> env, long taskimp, long groupimp, boolean maymove) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_numa_fault(int last_cpupid, int mem_node, int pages, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_numa_find_cpu(Ptr<task_numa_env> env, long taskimp, long groupimp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_numa_free(Ptr<task_struct> p, boolean _final) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_numa_group(Ptr<task_struct> p, int cpupid, int flags, Ptr<Integer> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pid_t") int task_numa_group_id(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_numa_migrate(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_numa_placement(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_numa_work(Ptr<misc.callback_head> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int task_scan_max(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int task_scan_start(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_seccomp(Ptr<SeqDefinitions.seq_file> m, Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long task_size_32bit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long task_size_64bit(int full_addr_space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_state(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char task_state_to_char(Ptr<task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> task_storage_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_storage_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<BpfDefinitions.bpf_local_storage>> task_storage_ptr(Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_tick_fair(Ptr<runtime.rq> rq2, Ptr<task_struct> curr, int queued) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct user_regset_view*)task_user_regset_view($arg1))")
    public static Ptr<UserDefinitions.user_regset_view> task_user_regset_view(Ptr<task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_vruntime_update(Ptr<runtime.rq> rq2, Ptr<task_struct> p, boolean in_fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_bp_pinned(int cpu2, Ptr<PerfDefinitions.perf_event> bp, misc.bp_type_idx type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_clear_jobctl_pending(Ptr<task_struct> task2, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_clear_jobctl_trapping(Ptr<task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_cls_state> task_cls_state(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_current_syscall(Ptr<task_struct> target, Ptr<SyscallDefinitions.syscall_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_group_path(Ptr<task_group> tg, String path2, int plen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="task_is_scoped((const const struct task_struct*)$arg1, (const const struct task_struct*)$arg2)")
    public static boolean task_is_scoped(Ptr<task_struct> parent, Ptr<task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_join_group_stop(Ptr<task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_mem(Ptr<SeqDefinitions.seq_file> m, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="task_on_scx((const struct task_struct*)$arg1)")
    public static boolean task_on_scx(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean task_participate_group_stop(Ptr<task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean task_set_jobctl_pending(Ptr<task_struct> task2, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_set_syscall_user_dispatch(Ptr<task_struct> task2, @Unsigned long mode, @Unsigned long offset, @Unsigned long len, String selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long task_statm(Ptr<MmDefinitions.mm_struct> mm, Ptr<@Unsigned Long> shared, Ptr<@Unsigned Long> text, Ptr<@Unsigned Long> data, Ptr<@Unsigned Long> resident) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_tick_stop(Ptr<runtime.rq> rq2, Ptr<task_struct> curr, int queued) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long task_vsize(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean task_wants_autogroup(Ptr<task_struct> p, Ptr<task_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean task_will_free_mem(Ptr<task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_work_add(Ptr<task_struct> task2, Ptr<misc.callback_head> work, task_work_notify_mode notify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean task_work_cancel(Ptr<task_struct> task2, Ptr<misc.callback_head> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.callback_head> task_work_cancel_func(Ptr<task_struct> task2, @OriginalName(value="task_work_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="task_work_cancel_match($arg1, (_Bool (*)(struct callback_head*, void*))$arg2, $arg3)")
    public static Ptr<misc.callback_head> task_work_cancel_match(Ptr<task_struct> task2, Ptr<?> match, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_work_run() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_work_set_notify_irq(Ptr<IrqDefinitions.irq_work> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pid_t") int __task_pid_nr_ns(Ptr<task_struct> task2, PidDefinitions.pid_type type2, Ptr<PidDefinitions.pid_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> __task_rq_lock(Ptr<task_struct> p, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PidDefinitions.pid_namespace> task_active_pid_ns(Ptr<task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_call_func(Ptr<task_struct> p, @OriginalName(value="task_call_f") Ptr<?> func, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_can_attach(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="task_curr((const struct task_struct*)$arg1)")
    public static int task_curr(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> task_file_seq_get_next(Ptr<BpfDefinitions.bpf_iter_seq_task_file_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> task_file_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_file_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> task_file_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_file_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> task_get_cgroup1(Ptr<task_struct> tsk, int hierarchy_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_iter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> task_lookup_fdget_rcu(Ptr<task_struct> task2, @Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> task_lookup_next_fdget_rcu(Ptr<task_struct> task2, Ptr<@Unsigned Integer> ret_fd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_mm_cid_work(Ptr<misc.callback_head> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> task_rq_lock(Ptr<task_struct> p, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long task_sched_runtime(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<task_struct> task_seq_get_next(Ptr<BpfDefinitions.bpf_iter_seq_task_common> common, Ptr<@Unsigned Integer> tid, boolean skip_if_dup_files) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> task_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> task_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_tick_mm_cid(Ptr<runtime.rq> rq2, Ptr<task_struct> curr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> task_vma_seq_get_next(Ptr<BpfDefinitions.bpf_iter_seq_task_vma_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> task_vma_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_vma_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> task_vma_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_vma_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean task_can_run_on_remote_rq(Ptr<task_struct> p, Ptr<runtime.rq> rq2, boolean trigger_error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> task_cgroup_from_root(Ptr<task_struct> task2, Ptr<CgroupDefinitions.cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_clock_event_add(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_clock_event_del(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_clock_event_init(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_clock_event_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_clock_event_start(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_clock_event_stop(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_contending(Ptr<SchedDefinitions.sched_dl_entity> dl_se, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_cputime_adjusted(Ptr<task_struct> p, Ptr<@Unsigned Long> ut, Ptr<@Unsigned Long> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_dump_owner(Ptr<task_struct> task2, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<misc.kuid_t> ruid, Ptr<misc.kgid_t> rgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_fork_dl(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long task_gtime(Ptr<task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_is_descendant(Ptr<task_struct> parent, Ptr<task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_is_throttled_dl(Ptr<task_struct> p, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int task_is_throttled_rt(Ptr<task_struct> p, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_non_contending(Ptr<SchedDefinitions.sched_dl_entity> dl_se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="task_prio((const struct task_struct*)$arg1)")
    public static int task_prio(Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean task_should_scx(int policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_tick_dl(Ptr<runtime.rq> rq2, Ptr<task_struct> p, int queued) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_tick_idle(Ptr<runtime.rq> rq2, Ptr<task_struct> curr, int queued) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_tick_rt(Ptr<runtime.rq> rq2, Ptr<task_struct> p, int queued) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_tick_scx(Ptr<runtime.rq> rq2, Ptr<task_struct> curr, int queued) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_unlink_from_dsq(Ptr<task_struct> p, Ptr<ScxDefinitions.scx_dispatch_q> dsq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_update_io_bitmap(Ptr<task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_woken_dl(Ptr<runtime.rq> rq2, Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_woken_rt(Ptr<runtime.rq> rq2, Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void task_woken_scx(Ptr<runtime.rq> rq2, Ptr<task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct seccomp")
    @NotUsableInJava
    public static class seccomp
    extends Struct {
        public int mode;
        public AtomicDefinitions.atomic_t filter_count;
        public Ptr<SeccompDefinitions.seccomp_filter> filter;
    }

    @Type(noCCodeGeneration=true, cType="struct rseq")
    @NotUsableInJava
    public static class rseq
    extends Struct {
        public @Unsigned int cpu_id_start;
        public @Unsigned int cpu_id;
        public @Unsigned long rseq_cs;
        public @Unsigned int flags;
        public @Unsigned int node_id;
        public @Unsigned int mm_cid;
        public char @Size(value=0) [] end;
    }

    @Type(noCCodeGeneration=true, cType="struct task_struct__safe_rcu")
    @NotUsableInJava
    public static class task_struct__safe_rcu
    extends Struct {
        public Ptr< @OriginalName(value="cpumask_t") runtime.cpumask> cpus_ptr;
        public Ptr<CssDefinitions.css_set> cgroups;
        public Ptr<task_struct> real_parent;
        public Ptr<task_struct> group_leader;
    }

    @Type(noCCodeGeneration=true, cType="struct task_numa_env")
    @NotUsableInJava
    public static class task_numa_env
    extends Struct {
        public Ptr<task_struct> p;
        public int src_cpu;
        public int src_nid;
        public int dst_cpu;
        public int dst_nid;
        public int imb_numa_nr;
        public NumaDefinitions.numa_stats src_stats;
        public NumaDefinitions.numa_stats dst_stats;
        public int imbalance_pct;
        public int dist;
        public Ptr<task_struct> best_task;
        public long best_imp;
        public int best_cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct { const struct tomoyo_path_info*; }")
    @NotUsableInJava
    public static class task_of_param_of_tomoyo_request_info
    extends Struct {
        public Ptr<TomoyoDefinitions.tomoyo_path_info> domainname;
    }

    @Type(noCCodeGeneration=true, cType="struct task_smack")
    @NotUsableInJava
    public static class task_smack
    extends Struct {
        public Ptr<SmackDefinitions.smack_known> smk_task;
        public Ptr<SmackDefinitions.smack_known> smk_forked;
        public Ptr<SmackDefinitions.smack_known> smk_transmuted;
        public ListDefinitions.list_head smk_rules;
        public runtime.mutex smk_rules_lock;
        public ListDefinitions.list_head smk_relabel;
    }

    @Type(noCCodeGeneration=true, cType="struct task_security_struct")
    @NotUsableInJava
    public static class task_security_struct
    extends Struct {
        public @Unsigned int osid;
        public @Unsigned int sid;
        public @Unsigned int exec_sid;
        public @Unsigned int create_sid;
        public @Unsigned int keycreate_sid;
        public @Unsigned int sockcreate_sid;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int tid; unsigned int pid; unsigned int pid_fd; }")
    @NotUsableInJava
    public static class task_of_bpf_iter_link_info
    extends Struct {
        public @Unsigned int tid;
        public @Unsigned int pid;
        public @Unsigned int pid_fd;
    }

    @Type(noCCodeGeneration=true, cType="enum task_work_notify_mode")
    public static enum task_work_notify_mode implements Enum<task_work_notify_mode>,
    TypedEnum<task_work_notify_mode, Integer>
    {
        TWA_NONE,
        TWA_RESUME,
        TWA_SIGNAL,
        TWA_SIGNAL_NO_IPI,
        TWA_NMI_CURRENT,
        TWA_FLAGS,
        TWAF_NO_ALLOC;

    }

    @Type(noCCodeGeneration=true, cType="struct task_delay_info")
    @NotUsableInJava
    public static class task_delay_info
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned long blkio_start;
        public @Unsigned long blkio_delay;
        public @Unsigned long swapin_start;
        public @Unsigned long swapin_delay;
        public @Unsigned int blkio_count;
        public @Unsigned int swapin_count;
        public @Unsigned long freepages_start;
        public @Unsigned long freepages_delay;
        public @Unsigned long thrashing_start;
        public @Unsigned long thrashing_delay;
        public @Unsigned long compact_start;
        public @Unsigned long compact_delay;
        public @Unsigned long wpcopy_start;
        public @Unsigned long wpcopy_delay;
        public @Unsigned long irq_delay;
        public @Unsigned int freepages_count;
        public @Unsigned int thrashing_count;
        public @Unsigned int compact_count;
        public @Unsigned int wpcopy_count;
        public @Unsigned int irq_count;
    }

    @Type(noCCodeGeneration=true, cType="struct task_group")
    @NotUsableInJava
    public static class task_group
    extends Struct {
        public CgroupDefinitions.cgroup_subsys_state css;
        public int idle;
        public Ptr<Ptr<SchedDefinitions.sched_entity>> se;
        public Ptr<Ptr<misc.cfs_rq>> cfs_rq;
        public @Unsigned long shares;
        public  @OriginalName(value="atomic_long_t") misc.atomic64_t load_avg;
        public @Unsigned int scx_flags;
        public @Unsigned int scx_weight;
        public misc.callback_head rcu;
        public ListDefinitions.list_head list;
        public Ptr<task_group> parent;
        public ListDefinitions.list_head siblings;
        public ListDefinitions.list_head children;
        public Ptr<runtime.autogroup> autogroup;
        public misc.cfs_bandwidth cfs_bandwidth;
        public @Unsigned int @Size(value=2) [] uclamp_pct;
        public misc.uclamp_se @Size(value=2) [] uclamp_req;
        public misc.uclamp_se @Size(value=2) [] uclamp;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int tid; unsigned int pid; }")
    @NotUsableInJava
    public static class task_of_anon_member_of_iter_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned int tid;
        public @Unsigned int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct { enum bpf_iter_task_type type; unsigned int pid; }")
    @NotUsableInJava
    public static class task_of_bpf_iter_aux_info
    extends Struct {
        public BpfDefinitions.bpf_iter_task_type type;
        public @Unsigned int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int pid; unsigned int fd; unsigned int flags; unsigned int buf_len; long long unsigned int buf; unsigned int prog_id; unsigned int fd_type; long long unsigned int probe_offset; long long unsigned int probe_addr; }")
    @NotUsableInJava
    public static class task_fd_query_of_bpf_attr
    extends Struct {
        public @Unsigned int pid;
        public @Unsigned int fd;
        public @Unsigned int flags;
        public @Unsigned int buf_len;
        public @Unsigned long buf;
        public @Unsigned int prog_id;
        public @Unsigned int fd_type;
        public @Unsigned long probe_offset;
        public @Unsigned long probe_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct task_cputime_atomic")
    @NotUsableInJava
    public static class task_cputime_atomic
    extends Struct {
        public misc.atomic64_t utime;
        public misc.atomic64_t stime;
        public misc.atomic64_t sum_exec_runtime;
    }

    @Type(noCCodeGeneration=true, cType="struct task_cputime")
    @NotUsableInJava
    public static class task_cputime
    extends Struct {
        public @Unsigned long stime;
        public @Unsigned long utime;
        public @Unsigned long sum_exec_runtime;
    }

    @Type(noCCodeGeneration=true, cType="struct task_io_accounting")
    @NotUsableInJava
    public static class task_io_accounting
    extends Struct {
        public @Unsigned long rchar;
        public @Unsigned long wchar;
        public @Unsigned long syscr;
        public @Unsigned long syscw;
        public @Unsigned long read_bytes;
        public @Unsigned long write_bytes;
        public @Unsigned long cancelled_write_bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct task_struct")
    @NotUsableInJava
    public static class task_struct
    extends Struct {
        public ThreadDefinitions.thread_info thread_info;
        public @Unsigned int __state;
        public @Unsigned int saved_state;
        public Ptr<?> stack;
        public  @OriginalName(value="refcount_t") misc.refcount_struct usage;
        public @Unsigned int flags;
        public @Unsigned int ptrace;
        public int on_cpu;
        public CallDefinitions.__call_single_node wake_entry;
        public @Unsigned int wakee_flips;
        public @Unsigned long wakee_flip_decay_ts;
        public Ptr<task_struct> last_wakee;
        public int recent_used_cpu;
        public int wake_cpu;
        public int on_rq;
        public int prio;
        public int static_prio;
        public int normal_prio;
        public @Unsigned int rt_priority;
        public SchedDefinitions.sched_entity se;
        public SchedDefinitions.sched_rt_entity rt;
        public SchedDefinitions.sched_dl_entity dl;
        public Ptr<SchedDefinitions.sched_dl_entity> dl_server;
        public SchedDefinitions.sched_ext_entity scx;
        public Ptr<SchedDefinitions.sched_class> sched_class;
        public RbDefinitions.rb_node core_node;
        public @Unsigned long core_cookie;
        public @Unsigned int core_occupation;
        public Ptr<task_group> sched_task_group;
        public misc.uclamp_se @Size(value=2) [] uclamp_req;
        public misc.uclamp_se @Size(value=2) [] uclamp;
        public SchedDefinitions.sched_statistics stats;
        public misc.hlist_head preempt_notifiers;
        public @Unsigned int btrace_seq;
        public @Unsigned int policy;
        public @Unsigned long max_allowed_capacity;
        public int nr_cpus_allowed;
        public Ptr< @OriginalName(value="cpumask_t") runtime.cpumask> cpus_ptr;
        public Ptr< @OriginalName(value="cpumask_t") runtime.cpumask> user_cpus_ptr;
        public  @OriginalName(value="cpumask_t") runtime.cpumask cpus_mask;
        public Ptr<?> migration_pending;
        public @Unsigned short migration_disabled;
        public @Unsigned short migration_flags;
        public int rcu_read_lock_nesting;
        public RcuDefinitions.rcu_special rcu_read_unlock_special;
        public ListDefinitions.list_head rcu_node_entry;
        public Ptr<RcuDefinitions.rcu_node> rcu_blocked_node;
        public @Unsigned long rcu_tasks_nvcsw;
        public char rcu_tasks_holdout;
        public char rcu_tasks_idx;
        public int rcu_tasks_idle_cpu;
        public ListDefinitions.list_head rcu_tasks_holdout_list;
        public int rcu_tasks_exit_cpu;
        public ListDefinitions.list_head rcu_tasks_exit_list;
        public int trc_reader_nesting;
        public int trc_ipi_to_cpu;
        public RcuDefinitions.rcu_special trc_reader_special;
        public ListDefinitions.list_head trc_holdout_list;
        public ListDefinitions.list_head trc_blkd_node;
        public int trc_blkd_cpu;
        public SchedDefinitions.sched_info sched_info;
        public ListDefinitions.list_head tasks;
        public misc.plist_node pushable_tasks;
        public RbDefinitions.rb_node pushable_dl_tasks;
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<MmDefinitions.mm_struct> active_mm;
        public Ptr<misc.address_space> faults_disabled_mapping;
        public int exit_state;
        public int exit_code;
        public int exit_signal;
        public int pdeath_signal;
        public @Unsigned long jobctl;
        public @Unsigned int personality;
        public @Unsigned int sched_reset_on_fork;
        public @Unsigned int sched_contributes_to_load;
        public @Unsigned int sched_migrated;
        public @Unsigned int sched_remote_wakeup;
        public @Unsigned int sched_rt_mutex;
        public @Unsigned int in_execve;
        public @Unsigned int in_iowait;
        public @Unsigned int restore_sigmask;
        public @Unsigned int in_lru_fault;
        public @Unsigned int no_cgroup_migration;
        public @Unsigned int frozen;
        public @Unsigned int use_memdelay;
        public @Unsigned int in_memstall;
        public @Unsigned int in_eventfd;
        public @Unsigned int pasid_activated;
        public @Unsigned int reported_split_lock;
        public @Unsigned int in_thrashing;
        public @Unsigned long atomic_flags;
        public misc.restart_block restart_block;
        public @OriginalName(value="pid_t") int pid;
        public @OriginalName(value="pid_t") int tgid;
        public @Unsigned long stack_canary;
        public Ptr<task_struct> real_parent;
        public Ptr<task_struct> parent;
        public ListDefinitions.list_head children;
        public ListDefinitions.list_head sibling;
        public Ptr<task_struct> group_leader;
        public ListDefinitions.list_head ptraced;
        public ListDefinitions.list_head ptrace_entry;
        public Ptr<runtime.pid> thread_pid;
        public misc.hlist_node @Size(value=4) [] pid_links;
        public ListDefinitions.list_head thread_node;
        public Ptr<runtime.completion> vfork_done;
        public Ptr<Integer> set_child_tid;
        public Ptr<Integer> clear_child_tid;
        public Ptr<?> worker_private;
        public @Unsigned long utime;
        public @Unsigned long stime;
        public @Unsigned long gtime;
        public misc.prev_cputime prev_cputime;
        public runtime.vtime vtime;
        public AtomicDefinitions.atomic_t tick_dep_mask;
        public @Unsigned long nvcsw;
        public @Unsigned long nivcsw;
        public @Unsigned long start_time;
        public @Unsigned long start_boottime;
        public @Unsigned long min_flt;
        public @Unsigned long maj_flt;
        public PosixDefinitions.posix_cputimers posix_cputimers;
        public PosixDefinitions.posix_cputimers_work posix_cputimers_work;
        public Ptr<runtime.cred> ptracer_cred;
        public Ptr<runtime.cred> real_cred;
        public Ptr<runtime.cred> cred;
        public Ptr<runtime.key> cached_requested_key;
        public char @Size(value=16) [] comm;
        public Ptr<runtime.nameidata> nameidata;
        public misc.sysv_sem sysvsem;
        public misc.sysv_shm sysvshm;
        public @Unsigned long last_switch_count;
        public @Unsigned long last_switch_time;
        public Ptr<FsDefinitions.fs_struct> fs;
        public Ptr<misc.files_struct> files;
        public Ptr<IoDefinitions.io_uring_task> io_uring;
        public Ptr<runtime.nsproxy> nsproxy;
        public Ptr<misc.signal_struct> signal;
        public Ptr<misc.sighand_struct> sighand;
        public misc.sigset_t blocked;
        public misc.sigset_t real_blocked;
        public misc.sigset_t saved_sigmask;
        public runtime.sigpending pending;
        public @Unsigned long sas_ss_sp;
        public @Unsigned long sas_ss_size;
        public @Unsigned int sas_ss_flags;
        public Ptr<misc.callback_head> task_works;
        public Ptr<AuditDefinitions.audit_context> audit_context;
        public misc.kuid_t loginuid;
        public @Unsigned int sessionid;
        public seccomp seccomp;
        public SyscallDefinitions.syscall_user_dispatch syscall_dispatch;
        public @Unsigned long parent_exec_id;
        public @Unsigned long self_exec_id;
        public  @OriginalName(value="spinlock_t") runtime.spinlock alloc_lock;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock pi_lock;
        public WakeDefinitions.wake_q_node wake_q;
        public RbDefinitions.rb_root_cached pi_waiters;
        public Ptr<task_struct> pi_top_task;
        public Ptr<RtDefinitions.rt_mutex_waiter> pi_blocked_on;
        public @Unsigned int in_ubsan;
        public Ptr<?> journal_info;
        public Ptr<BioDefinitions.bio_list> bio_list;
        public Ptr<BlkDefinitions.blk_plug> plug;
        public Ptr<ReclaimDefinitions.reclaim_state> reclaim_state;
        public Ptr<IoDefinitions.io_context> io_context;
        public Ptr<misc.capture_control> capture_control;
        public @Unsigned long ptrace_message;
        public Ptr< @OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> last_siginfo;
        public task_io_accounting ioac;
        public @Unsigned int psi_flags;
        public @Unsigned long acct_rss_mem1;
        public @Unsigned long acct_vm_mem1;
        public @Unsigned long acct_timexpd;
        public misc.nodemask_t mems_allowed;
        public  @OriginalName(value="seqcount_spinlock_t") misc.seqcount_spinlock mems_allowed_seq;
        public int cpuset_mem_spread_rotor;
        public Ptr<CssDefinitions.css_set> cgroups;
        public ListDefinitions.list_head cg_list;
        public @Unsigned int closid;
        public @Unsigned int rmid;
        public Ptr<misc.robust_list_head> robust_list;
        public Ptr<CompatDefinitions.compat_robust_list_head> compat_robust_list;
        public ListDefinitions.list_head pi_state_list;
        public Ptr<FutexDefinitions.futex_pi_state> pi_state_cache;
        public runtime.mutex futex_exit_mutex;
        public @Unsigned int futex_state;
        public char @Size(value=4) [] perf_recursion;
        public Ptr<PerfDefinitions.perf_event_context> perf_event_ctxp;
        public runtime.mutex perf_event_mutex;
        public ListDefinitions.list_head perf_event_list;
        public Ptr<runtime.mempolicy> mempolicy;
        public short il_prev;
        public char il_weight;
        public short pref_node_fork;
        public int numa_scan_seq;
        public @Unsigned int numa_scan_period;
        public @Unsigned int numa_scan_period_max;
        public int numa_preferred_nid;
        public @Unsigned long numa_migrate_retry;
        public @Unsigned long node_stamp;
        public @Unsigned long last_task_numa_placement;
        public @Unsigned long last_sum_exec_runtime;
        public misc.callback_head numa_work;
        public Ptr<NumaDefinitions.numa_group> numa_group;
        public Ptr<@Unsigned Long> numa_faults;
        public @Unsigned long total_numa_faults;
        public @Unsigned long @Size(value=3) [] numa_faults_locality;
        public @Unsigned long numa_pages_migrated;
        public Ptr<rseq> rseq;
        public @Unsigned int rseq_len;
        public @Unsigned int rseq_sig;
        public @Unsigned long rseq_event_mask;
        public int mm_cid;
        public int last_mm_cid;
        public int migrate_from_cpu;
        public int mm_cid_active;
        public misc.callback_head cid_work;
        public misc.tlbflush_unmap_batch tlb_ubc;
        public Ptr<PipeDefinitions.pipe_inode_info> splice_pipe;
        public PageDefinitions.page_frag task_frag;
        public Ptr<task_delay_info> delays;
        public int nr_dirtied;
        public int nr_dirtied_pause;
        public @Unsigned long dirty_paused_when;
        public int latency_record_count;
        public misc.latency_record @Size(value=32) [] latency_record;
        public @Unsigned long timer_slack_ns;
        public @Unsigned long default_timer_slack_ns;
        public int curr_ret_stack;
        public int curr_ret_depth;
        public Ptr<@Unsigned Long> ret_stack;
        public @Unsigned long ftrace_timestamp;
        public AtomicDefinitions.atomic_t trace_overrun;
        public AtomicDefinitions.atomic_t tracing_graph_pause;
        public @Unsigned long trace_recursion;
        public @Unsigned int memcg_nr_pages_over_high;
        public Ptr<MemDefinitions.mem_cgroup> active_memcg;
        public Ptr<ObjDefinitions.obj_cgroup> objcg;
        public Ptr<runtime.gendisk> throttle_disk;
        public Ptr<UprobeDefinitions.uprobe_task> utask;
        public @Unsigned int sequential_io;
        public @Unsigned int sequential_io_avg;
        public misc.kmap_ctrl kmap_ctrl;
        public misc.callback_head rcu;
        public  @OriginalName(value="refcount_t") misc.refcount_struct rcu_users;
        public int pagefault_disabled;
        public Ptr<task_struct> oom_reaper_list;
        public TimerDefinitions.timer_list oom_reaper_timer;
        public Ptr<VmDefinitions.vm_struct> stack_vm_area;
        public  @OriginalName(value="refcount_t") misc.refcount_struct stack_refcount;
        public int patch_state;
        public Ptr<?> security;
        public Ptr<BpfDefinitions.bpf_local_storage> bpf_storage;
        public Ptr<BpfDefinitions.bpf_run_ctx> bpf_ctx;
        public Ptr<BpfDefinitions.bpf_net_context> bpf_net_context;
        public Ptr<?> mce_vaddr;
        public @Unsigned long mce_kflags;
        public @Unsigned long mce_addr;
        public @Unsigned long mce_ripv;
        public @Unsigned long mce_whole_page;
        public @Unsigned long __mce_reserved;
        public misc.callback_head mce_kill_me;
        public int mce_count;
        public misc.llist_head kretprobe_instances;
        public misc.llist_head rethooks;
        public misc.callback_head l1d_flush_kill;
        public RvDefinitions.rv_task_monitor @Size(value=1) [] rv;
        public Ptr<UserDefinitions.user_event_mm> user_event_mm;
        public ThreadDefinitions.thread_struct thread;
    }
}

