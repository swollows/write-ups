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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.CpuidleDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.SdDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SchedDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sched_group_set_shares(Ptr<TaskDefinitions.task_group> tg, @Unsigned long shares) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_balance_domains(Ptr<runtime.rq> rq2, CpuDefinitions.cpu_idle_type idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sched_group> sched_balance_find_dst_group(Ptr<sched_domain> sd, Ptr<TaskDefinitions.task_struct> p, int this_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_balance_find_dst_group_cpu(Ptr<sched_group> group, Ptr<TaskDefinitions.task_struct> p, int this_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sched_group> sched_balance_find_src_group(Ptr<misc.lb_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> sched_balance_find_src_rq(Ptr<misc.lb_env> env, Ptr<sched_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_balance_newidle(Ptr<runtime.rq> this_rq, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_balance_rq(int this_cpu, Ptr<runtime.rq> this_rq, Ptr<sched_domain> sd, CpuDefinitions.cpu_idle_type idle, Ptr<Integer> continue_balancing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_balance_softirq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_balance_trigger(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_balance_update_blocked_averages(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart sched_cfs_period_timer(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart sched_cfs_slack_timer(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sched_cpu_util(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_fair_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sched_group_cookie_match(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<sched_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_group_set_idle(Ptr<TaskDefinitions.task_group> tg, long idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_group_set_shares(Ptr<TaskDefinitions.task_group> tg, @Unsigned long shares) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_init_granularity() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_update_scaling() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sched_use_asym_prio(Ptr<sched_domain> sd, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_clock_gtod_offset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_clock_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_core_account_forceidle(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_core_set(Ptr<TaskDefinitions.task_struct> p, @Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_core_tick(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_autogroup_create_attach(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_autogroup_detach(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_autogroup_exit(Ptr<misc.signal_struct> sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_autogroup_exit_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_autogroup_fork(Ptr<misc.signal_struct> sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sched_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sched_clock_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_clock_idle_sleep_event() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_clock_idle_wakeup_event() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_clock_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_clock_init_late() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sched_clock_noinstr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_clock_stable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_clock_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_clock_tick_stable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sched_core_clone_cookie(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_fork(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_free(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_put_cookie(@Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_core_share_pid(@Unsigned int cmd, @OriginalName(value="pid_t") int pid2, PidDefinitions.pid_type type2, @Unsigned long uaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_debug_header(Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sched_debug_next(Ptr<SeqDefinitions.seq_file> file2, Ptr<?> data, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_debug_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_debug_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_debug_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sched_debug_start(Ptr<SeqDefinitions.seq_file> file2, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_debug_stop(Ptr<SeqDefinitions.seq_file> file2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_domain_debug_one(Ptr<sched_domain> sd, int cpu2, int level, Ptr<runtime.cpumask> groupmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_domains_numa_masks_clear(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_domains_numa_masks_set(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_dynamic_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_dynamic_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_dynamic_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sched_dynamic_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_energy_aware_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sched_energy_aware_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_energy_aware_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_fair_server_period_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_fair_server_period_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_fair_server_period_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sched_fair_server_period_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_fair_server_runtime_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_fair_server_runtime_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_fair_server_runtime_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sched_fair_server_runtime_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_feat_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_feat_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_feat_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sched_feat_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_get_rd(Ptr<misc.root_domain> rd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_init_debug() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_init_domains((const struct cpumask*)$arg1)")
    public static int sched_init_domains(Ptr<runtime.cpumask> cpu_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_init_numa(int offline_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_is_eas_possible((const struct cpumask*)$arg1)")
    public static boolean sched_is_eas_possible(Ptr<runtime.cpumask> cpu_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_numa_find_closest((const struct cpumask*)$arg1, $arg2)")
    public static int sched_numa_find_closest(Ptr<runtime.cpumask> cpus, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_numa_find_nth_cpu((const struct cpumask*)$arg1, $arg2, $arg3)")
    public static int sched_numa_find_nth_cpu(Ptr<runtime.cpumask> cpus, int cpu2, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)sched_numa_hop_mask($arg1, $arg2))")
    public static Ptr<runtime.cpumask> sched_numa_hop_mask(@Unsigned int node2, @Unsigned int hops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_numa_warn((const u8*)$arg1)")
    public static void sched_numa_warn(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_put_rd(Ptr<misc.root_domain> rd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_scaling_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_scaling_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_scaling_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sched_scaling_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_show_numa(Ptr<TaskDefinitions.task_struct> p, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_update_numa(int cpu2, boolean online) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_verbose_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sched_verbose_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_core_flip(boolean enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_core_put(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_dynamic_update(int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sched_fork(@Unsigned long clone_flags, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sched_can_stop_tick(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_cancel_fork(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_cgroup_fork(Ptr<TaskDefinitions.task_struct> p, Ptr<KernelDefinitions.kernel_clone_args> kargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_clear_itmt_support() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_assert_empty() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_balance(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_cpu_deactivate(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_cpu_starting(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_dequeue(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_enqueue(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> sched_core_find(Ptr<runtime.rq> rq2, @Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_get() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_lock(int cpu2, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> sched_core_next(Ptr<TaskDefinitions.task_struct> p, @Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_put() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_core_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_core_unlock(int cpu2, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_cpu_activate(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_cpu_deactivate(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_cpu_dying(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_cpu_starting(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_cpu_wait_empty(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_group> sched_create_group(Ptr<TaskDefinitions.task_group> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_deq_and_put_task(Ptr<TaskDefinitions.task_struct> p, int queue_flags, Ptr<sched_enq_and_set_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_destroy_group(Ptr<TaskDefinitions.task_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_dynamic_klp_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_dynamic_klp_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_dynamic_mode((const u8*)$arg1)")
    public static int sched_dynamic_mode(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_dynamic_update(int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_enq_and_set_task(Ptr<sched_enq_and_set_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_exec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_fork(@Unsigned long clone_flags, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_free_group_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_init_smp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_itmt_update_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sched_itmt_update_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_mm_cid_after_execve(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_mm_cid_before_execve(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_mm_cid_exit_signals(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_mm_cid_fork(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_mm_cid_migrate_from(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_mm_cid_migrate_to(Ptr<runtime.rq> dst_rq, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_mm_cid_remote_clear(Ptr<MmDefinitions.mm_struct> mm, Ptr<MmDefinitions.mm_cid> pcpu_cid, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_move_task(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_online_group(Ptr<TaskDefinitions.task_group> tg, Ptr<TaskDefinitions.task_group> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_partition_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sched_partition_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_post_fork(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_release_group(Ptr<TaskDefinitions.task_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_send_work(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_set_itmt_core_prio(int prio, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_set_itmt_support() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_set_stop_task(int cpu2, Ptr<TaskDefinitions.task_struct> stop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_setnuma(Ptr<TaskDefinitions.task_struct> p, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_show_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_smt_present_dec(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_smt_present_inc(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sched_task_on_rq(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_tick_offload_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_tick_remote(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_ttwu_pending(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_unregister_group_rcu(Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_update_worker(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sched_setaffinity(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.affinity_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__sched_setscheduler($arg1, (const struct sched_attr*)$arg2, $arg3, $arg4)")
    public static int __sched_setscheduler(Ptr<TaskDefinitions.task_struct> p, Ptr<sched_attr> attr2, boolean user, boolean pi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_attr_copy_to_user(Ptr<sched_attr> uattr, Ptr<sched_attr> kattr, @Unsigned int usize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_autogroup_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_autogroup_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_autogroup_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sched_autogroup_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_copy_attr(Ptr<sched_attr> uattr, Ptr<sched_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_core_idle_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_dl_do_global() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_dl_global_validate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_dl_overflow($arg1, $arg2, (const struct sched_attr*)$arg3)")
    public static int sched_dl_overflow(Ptr<TaskDefinitions.task_struct> p, int policy, Ptr<sched_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_dl_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_ext_free(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sched_getaffinity(@OriginalName(value="pid_t") int pid2, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_idle_set_state(Ptr<CpuidleDefinitions.cpuidle_state> idle_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_rq_cmp($arg1, (const struct list_head*)$arg2, (const struct list_head*)$arg3)")
    public static int sched_rq_cmp(Ptr<?> priv, Ptr<ListDefinitions.list_head> a, Ptr<ListDefinitions.list_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_rr_get_interval(@OriginalName(value="pid_t") int pid2, Ptr<runtime.timespec64> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_rr_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sched_rr_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_rt_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sched_rt_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_rt_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_set_fifo(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_set_fifo_low(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sched_set_normal(Ptr<TaskDefinitions.task_struct> p, int nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_setaffinity($arg1, (const struct cpumask*)$arg2)")
    public static long sched_setaffinity(@OriginalName(value="pid_t") int pid2, Ptr<runtime.cpumask> in_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_setattr($arg1, (const struct sched_attr*)$arg2)")
    public static int sched_setattr(Ptr<TaskDefinitions.task_struct> p, Ptr<sched_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_setattr_nocheck($arg1, (const struct sched_attr*)$arg2)")
    public static int sched_setattr_nocheck(Ptr<TaskDefinitions.task_struct> p, Ptr<sched_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_setscheduler($arg1, $arg2, (const struct sched_param*)$arg3)")
    public static int sched_setscheduler(Ptr<TaskDefinitions.task_struct> p, int policy, Ptr<sched_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_setscheduler_nocheck($arg1, $arg2, (const struct sched_param*)$arg3)")
    public static int sched_setscheduler_nocheck(Ptr<TaskDefinitions.task_struct> p, int policy, Ptr<sched_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sched_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sched_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sched_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sched_poll")
    @NotUsableInJava
    public static class sched_poll
    extends Struct {
        public @OriginalName(value="__guest_handle_evtchn_port_t") Ptr<@Unsigned @OriginalName(value="evtchn_port_t") Integer> ports;
        public @Unsigned int nr_ports;
        public @Unsigned @OriginalName(value="uint64_t") long timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_core_cookie")
    @NotUsableInJava
    public static class sched_core_cookie
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_clock_data")
    @NotUsableInJava
    public static class sched_clock_data
    extends Struct {
        public @Unsigned long tick_raw;
        public @Unsigned long tick_gtod;
        public @Unsigned long clock;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_domain_attr")
    @NotUsableInJava
    public static class sched_domain_attr
    extends Struct {
        public int relax_domain_level;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_domain_topology_level")
    @NotUsableInJava
    public static class sched_domain_topology_level
    extends Struct {
        public @OriginalName(value="sched_domain_mask_f") Ptr<?> mask;
        public @OriginalName(value="sched_domain_flags_f") Ptr<?> sd_flags;
        public int flags;
        public int numa_level;
        public SdDefinitions.sd_data data;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_pin_override")
    @NotUsableInJava
    public static class sched_pin_override
    extends Struct {
        public @OriginalName(value="int32_t") int pcpu;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_shutdown")
    @NotUsableInJava
    public static class sched_shutdown
    extends Struct {
        public @Unsigned int reason;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_entity_stats")
    @NotUsableInJava
    public static class sched_entity_stats
    extends Struct {
        public sched_entity se;
        public sched_statistics stats;
    }

    @Type(noCCodeGeneration=true, cType="enum sched_tunable_scaling")
    public static enum sched_tunable_scaling implements Enum<sched_tunable_scaling>,
    TypedEnum<sched_tunable_scaling, Integer>
    {
        SCHED_TUNABLESCALING_NONE,
        SCHED_TUNABLESCALING_LOG,
        SCHED_TUNABLESCALING_LINEAR,
        SCHED_TUNABLESCALING_END;

    }

    @Type(noCCodeGeneration=true, cType="struct sched_ext_ops")
    @NotUsableInJava
    public static class sched_ext_ops
    extends Struct {
        public Ptr<?> select_cpu;
        public Ptr<?> enqueue;
        public Ptr<?> dequeue;
        public Ptr<?> dispatch;
        public Ptr<?> tick;
        public Ptr<?> runnable;
        public Ptr<?> running;
        public Ptr<?> stopping;
        public Ptr<?> quiescent;
        public Ptr<?> yield;
        public Ptr<?> core_sched_before;
        public Ptr<?> set_weight;
        public Ptr<?> set_cpumask;
        public Ptr<?> update_idle;
        public Ptr<?> cpu_acquire;
        public Ptr<?> cpu_release;
        public Ptr<?> init_task;
        public Ptr<?> exit_task;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> dump;
        public Ptr<?> dump_cpu;
        public Ptr<?> dump_task;
        public Ptr<?> cgroup_init;
        public Ptr<?> cgroup_exit;
        public Ptr<?> cgroup_prep_move;
        public Ptr<?> cgroup_move;
        public Ptr<?> cgroup_cancel_move;
        public Ptr<?> cgroup_set_weight;
        public Ptr<?> cpu_online;
        public Ptr<?> cpu_offline;
        public Ptr<?> init;
        public Ptr<?> exit;
        public @Unsigned int dispatch_max_batch;
        public @Unsigned long flags;
        public @Unsigned int timeout_ms;
        public @Unsigned int exit_dump_len;
        public @Unsigned long hotplug_seq;
        public char @Size(value=128) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_enq_and_set_ctx")
    @NotUsableInJava
    public static class sched_enq_and_set_ctx
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> p;
        public int queue_flags;
        public boolean queued;
        public boolean running;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_attr")
    @NotUsableInJava
    public static class sched_attr
    extends Struct {
        public @Unsigned int size;
        public @Unsigned int sched_policy;
        public @Unsigned long sched_flags;
        public int sched_nice;
        public @Unsigned int sched_priority;
        public @Unsigned long sched_runtime;
        public @Unsigned long sched_deadline;
        public @Unsigned long sched_period;
        public @Unsigned int sched_util_min;
        public @Unsigned int sched_util_max;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_group_capacity")
    @NotUsableInJava
    public static class sched_group_capacity
    extends Struct {
        public AtomicDefinitions.atomic_t ref;
        public @Unsigned long capacity;
        public @Unsigned long min_capacity;
        public @Unsigned long max_capacity;
        public @Unsigned long next_update;
        public int imbalance;
        public int id;
        public @Unsigned long @Size(value=0) [] cpumask;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_group")
    @NotUsableInJava
    public static class sched_group
    extends Struct {
        public Ptr<sched_group> next;
        public AtomicDefinitions.atomic_t ref;
        public @Unsigned int group_weight;
        public @Unsigned int cores;
        public Ptr<sched_group_capacity> sgc;
        public int asym_prefer_cpu;
        public int flags;
        public @Unsigned long @Size(value=0) [] cpumask;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_domain")
    @NotUsableInJava
    public static class sched_domain
    extends Struct {
        public Ptr<sched_domain> parent;
        public Ptr<sched_domain> child;
        public Ptr<sched_group> groups;
        public @Unsigned long min_interval;
        public @Unsigned long max_interval;
        public @Unsigned int busy_factor;
        public @Unsigned int imbalance_pct;
        public @Unsigned int cache_nice_tries;
        public @Unsigned int imb_numa_nr;
        public int nohz_idle;
        public int flags;
        public int level;
        public @Unsigned long last_balance;
        public @Unsigned int balance_interval;
        public @Unsigned int nr_balance_failed;
        public @Unsigned long max_newidle_lb_cost;
        public @Unsigned long last_decay_max_lb_cost;
        public @Unsigned int @Size(value=3) [] lb_count;
        public @Unsigned int @Size(value=3) [] lb_failed;
        public @Unsigned int @Size(value=3) [] lb_balanced;
        public @Unsigned int @Size(value=3) [] lb_imbalance;
        public @Unsigned int @Size(value=3) [] lb_gained;
        public @Unsigned int @Size(value=3) [] lb_hot_gained;
        public @Unsigned int @Size(value=3) [] lb_nobusyg;
        public @Unsigned int @Size(value=3) [] lb_nobusyq;
        public @Unsigned int alb_count;
        public @Unsigned int alb_failed;
        public @Unsigned int alb_pushed;
        public @Unsigned int sbe_count;
        public @Unsigned int sbe_balanced;
        public @Unsigned int sbe_pushed;
        public @Unsigned int sbf_count;
        public @Unsigned int sbf_balanced;
        public @Unsigned int sbf_pushed;
        public @Unsigned int ttwu_wake_remote;
        public @Unsigned int ttwu_move_affine;
        public @Unsigned int ttwu_move_balance;
        public String name;
        @InlineUnion(value=6852)
        public @InlineUnion(value=6852) Ptr<?> _private;
        @InlineUnion(value=6852)
        public @InlineUnion(value=6852) misc.callback_head rcu;
        public Ptr<sched_domain_shared> shared;
        public @Unsigned int span_weight;
        public @Unsigned long @Size(value=0) [] span;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_domain_shared")
    @NotUsableInJava
    public static class sched_domain_shared
    extends Struct {
        public AtomicDefinitions.atomic_t ref;
        public AtomicDefinitions.atomic_t nr_busy_cpus;
        public int has_idle_cores;
        public int nr_idle_scan;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_param")
    @NotUsableInJava
    public static class sched_param
    extends Struct {
        public int sched_priority;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_state")
    @NotUsableInJava
    public static class sched_state
    extends Struct {
        public int weight;
        public int event;
        public int counter;
        public int unassigned;
        public int nr_gp;
        public @Unsigned long used;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_class")
    @NotUsableInJava
    public static class sched_class
    extends Struct {
        public int uclamp_enabled;
        public Ptr<?> enqueue_task;
        public Ptr<?> dequeue_task;
        public Ptr<?> yield_task;
        public Ptr<?> yield_to_task;
        public Ptr<?> wakeup_preempt;
        public Ptr<?> balance;
        public Ptr<?> pick_task;
        public Ptr<?> pick_next_task;
        public Ptr<?> put_prev_task;
        public Ptr<?> set_next_task;
        public Ptr<?> select_task_rq;
        public Ptr<?> migrate_task_rq;
        public Ptr<?> task_woken;
        public Ptr<?> set_cpus_allowed;
        public Ptr<?> rq_online;
        public Ptr<?> rq_offline;
        public Ptr<?> find_lock_rq;
        public Ptr<?> task_tick;
        public Ptr<?> task_fork;
        public Ptr<?> task_dead;
        public Ptr<?> switching_to;
        public Ptr<?> switched_from;
        public Ptr<?> switched_to;
        public Ptr<?> reweight_task;
        public Ptr<?> prio_changed;
        public Ptr<?> get_rr_interval;
        public Ptr<?> update_curr;
        public Ptr<?> task_change_group;
        public Ptr<?> task_is_throttled;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_dl_entity")
    @NotUsableInJava
    public static class sched_dl_entity
    extends Struct {
        public RbDefinitions.rb_node rb_node;
        public @Unsigned long dl_runtime;
        public @Unsigned long dl_deadline;
        public @Unsigned long dl_period;
        public @Unsigned long dl_bw;
        public @Unsigned long dl_density;
        public long runtime;
        public @Unsigned long deadline;
        public @Unsigned int flags;
        public @Unsigned int dl_throttled;
        public @Unsigned int dl_yielded;
        public @Unsigned int dl_non_contending;
        public @Unsigned int dl_overrun;
        public @Unsigned int dl_server;
        public @Unsigned int dl_defer;
        public @Unsigned int dl_defer_armed;
        public @Unsigned int dl_defer_running;
        public runtime.hrtimer dl_timer;
        public runtime.hrtimer inactive_timer;
        public Ptr<runtime.rq> rq;
        public @OriginalName(value="dl_server_has_tasks_f") Ptr<?> server_has_tasks;
        public @OriginalName(value="dl_server_pick_f") Ptr<?> server_pick_task;
        public Ptr<sched_dl_entity> pi_se;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_rt_entity")
    @NotUsableInJava
    public static class sched_rt_entity
    extends Struct {
        public ListDefinitions.list_head run_list;
        public @Unsigned long timeout;
        public @Unsigned long watchdog_stamp;
        public @Unsigned int time_slice;
        public @Unsigned short on_rq;
        public @Unsigned short on_list;
        public Ptr<sched_rt_entity> back;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_entity")
    @NotUsableInJava
    public static class sched_entity
    extends Struct {
        public LoadDefinitions.load_weight load;
        public RbDefinitions.rb_node run_node;
        public @Unsigned long deadline;
        public @Unsigned long min_vruntime;
        public @Unsigned long min_slice;
        public ListDefinitions.list_head group_node;
        public char on_rq;
        public char sched_delayed;
        public char rel_deadline;
        public char custom_slice;
        public @Unsigned long exec_start;
        public @Unsigned long sum_exec_runtime;
        public @Unsigned long prev_sum_exec_runtime;
        public @Unsigned long vruntime;
        public long vlag;
        public @Unsigned long slice;
        public @Unsigned long nr_migrations;
        public int depth;
        public Ptr<sched_entity> parent;
        public Ptr<misc.cfs_rq> cfs_rq;
        public Ptr<misc.cfs_rq> my_q;
        public @Unsigned long runnable_weight;
        public sched_avg avg;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_statistics")
    @NotUsableInJava
    public static class sched_statistics
    extends Struct {
        public @Unsigned long wait_start;
        public @Unsigned long wait_max;
        public @Unsigned long wait_count;
        public @Unsigned long wait_sum;
        public @Unsigned long iowait_count;
        public @Unsigned long iowait_sum;
        public @Unsigned long sleep_start;
        public @Unsigned long sleep_max;
        public long sum_sleep_runtime;
        public @Unsigned long block_start;
        public @Unsigned long block_max;
        public long sum_block_runtime;
        public long exec_max;
        public @Unsigned long slice_max;
        public @Unsigned long nr_migrations_cold;
        public @Unsigned long nr_failed_migrations_affine;
        public @Unsigned long nr_failed_migrations_running;
        public @Unsigned long nr_failed_migrations_hot;
        public @Unsigned long nr_forced_migrations;
        public @Unsigned long nr_wakeups;
        public @Unsigned long nr_wakeups_sync;
        public @Unsigned long nr_wakeups_migrate;
        public @Unsigned long nr_wakeups_local;
        public @Unsigned long nr_wakeups_remote;
        public @Unsigned long nr_wakeups_affine;
        public @Unsigned long nr_wakeups_affine_attempts;
        public @Unsigned long nr_wakeups_passive;
        public @Unsigned long nr_wakeups_idle;
        public @Unsigned long core_forceidle_sum;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_avg")
    @NotUsableInJava
    public static class sched_avg
    extends Struct {
        public @Unsigned long last_update_time;
        public @Unsigned long load_sum;
        public @Unsigned long runnable_sum;
        public @Unsigned int util_sum;
        public @Unsigned int period_contrib;
        public @Unsigned long load_avg;
        public @Unsigned long runnable_avg;
        public @Unsigned long util_avg;
        public @Unsigned int util_est;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_info")
    @NotUsableInJava
    public static class sched_info
    extends Struct {
        public @Unsigned long pcount;
        public @Unsigned long run_delay;
        public @Unsigned long last_arrival;
        public @Unsigned long last_queued;
    }

    @Type(noCCodeGeneration=true, cType="struct sched_ext_entity")
    @NotUsableInJava
    public static class sched_ext_entity
    extends Struct {
        public Ptr<ScxDefinitions.scx_dispatch_q> dsq;
        public ScxDefinitions.scx_dsq_list_node dsq_list;
        public RbDefinitions.rb_node dsq_priq;
        public @Unsigned int dsq_seq;
        public @Unsigned int dsq_flags;
        public @Unsigned int flags;
        public @Unsigned int weight;
        public int sticky_cpu;
        public int holding_cpu;
        public @Unsigned int kf_mask;
        public Ptr<TaskDefinitions.task_struct> @Size(value=2) [] kf_tasks;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t ops_state;
        public ListDefinitions.list_head runnable_node;
        public @Unsigned long runnable_at;
        public @Unsigned long core_sched_at;
        public @Unsigned long ddsp_dsq_id;
        public @Unsigned long ddsp_enq_flags;
        public @Unsigned long slice;
        public @Unsigned long dsq_vtime;
        public boolean disallow;
        public Ptr<runtime.cgroup> cgrp_moving_from;
        public ListDefinitions.list_head tasks_node;
    }
}

