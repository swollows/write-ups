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
import me.bechberger.ebpf.runtime.BalanceDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ScxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __scx_update_idle(Ptr<runtime.rq> rq2, boolean idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long scx_attr_enable_seq_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> ka, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long scx_attr_hotplug_seq_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> ka, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long scx_attr_nr_rejected_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> ka, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long scx_attr_ops_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> ka, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long scx_attr_state_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> ka, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long scx_attr_switch_all_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> ka, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scx_bpf_consume(@Unsigned long dsq_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> scx_bpf_cpu_rq(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int scx_bpf_cpuperf_cap(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int scx_bpf_cpuperf_cur(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_cpuperf_set(int cpu2, @Unsigned int perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_bpf_create_dsq(@Unsigned long dsq_id, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_destroy_dsq(@Unsigned long dsq_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_dispatch(Ptr<TaskDefinitions.task_struct> p, @Unsigned long dsq_id, @Unsigned long slice2, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_dispatch_cancel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scx_bpf_dispatch_from_dsq(Ptr<BpfDefinitions.bpf_iter_scx_dsq> it__iter, Ptr<TaskDefinitions.task_struct> p, @Unsigned long dsq_id, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_dispatch_from_dsq_set_slice(Ptr<BpfDefinitions.bpf_iter_scx_dsq> it__iter, @Unsigned long slice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_dispatch_from_dsq_set_vtime(Ptr<BpfDefinitions.bpf_iter_scx_dsq> it__iter, @Unsigned long vtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int scx_bpf_dispatch_nr_slots() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_dispatch_vtime(Ptr<TaskDefinitions.task_struct> p, @Unsigned long dsq_id, @Unsigned long slice2, @Unsigned long vtime2, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scx_bpf_dispatch_vtime_from_dsq(Ptr<BpfDefinitions.bpf_iter_scx_dsq> it__iter, Ptr<TaskDefinitions.task_struct> p, @Unsigned long dsq_id, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_bpf_dsq_nr_queued(@Unsigned long dsq_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_dump_bstr(String fmt, Ptr<@Unsigned Long> data, @Unsigned int data__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_error_bstr(String fmt, Ptr<@Unsigned Long> data, @Unsigned int data__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_exit_bstr(long exit_code, String fmt, Ptr<@Unsigned Long> data, @Unsigned int data__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)scx_bpf_get_idle_cpumask())")
    public static Ptr<runtime.cpumask> scx_bpf_get_idle_cpumask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)scx_bpf_get_idle_smtmask())")
    public static Ptr<runtime.cpumask> scx_bpf_get_idle_smtmask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)scx_bpf_get_online_cpumask())")
    public static Ptr<runtime.cpumask> scx_bpf_get_online_cpumask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)scx_bpf_get_possible_cpumask())")
    public static Ptr<runtime.cpumask> scx_bpf_get_possible_cpumask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_bpf_kick_cpu(int cpu2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int scx_bpf_nr_cpu_ids() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_bpf_pick_any_cpu((const struct cpumask*)$arg1, $arg2)")
    public static int scx_bpf_pick_any_cpu(Ptr<runtime.cpumask> cpus_allowed, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_bpf_pick_idle_cpu((const struct cpumask*)$arg1, $arg2)")
    public static int scx_bpf_pick_idle_cpu(Ptr<runtime.cpumask> cpus_allowed, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_bpf_put_cpumask((const struct cpumask*)$arg1)")
    public static void scx_bpf_put_cpumask(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_bpf_put_idle_cpumask((const struct cpumask*)$arg1)")
    public static void scx_bpf_put_idle_cpumask(Ptr<runtime.cpumask> idle_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int scx_bpf_reenqueue_local() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_bpf_select_cpu_dfl(Ptr<TaskDefinitions.task_struct> p, int prev_cpu, @Unsigned long wake_flags, Ptr<@OriginalName(value="bool") Boolean> is_idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> scx_bpf_task_cgroup(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_bpf_task_cpu((const struct task_struct*)$arg1)")
    public static int scx_bpf_task_cpu(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_bpf_task_running((const struct task_struct*)$arg1)")
    public static boolean scx_bpf_task_running(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scx_bpf_test_and_clear_cpu_idle(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scx_can_stop_tick(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_cancel_fork(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_cgroup_can_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_cgroup_cancel_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_cgroup_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_cgroup_finish_attach() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_cgroup_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_cgroup_warn_missing_idle(Ptr<TaskDefinitions.task_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_cgroup_warn_missing_weight(Ptr<TaskDefinitions.task_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_check_setscheduler(Ptr<TaskDefinitions.task_struct> p, int policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_dispatch_commit(Ptr<TaskDefinitions.task_struct> p, @Unsigned long dsq_id, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scx_dispatch_from_dsq(Ptr<BpfDefinitions.bpf_iter_scx_dsq_kern> kit, Ptr<TaskDefinitions.task_struct> p, @Unsigned long dsq_id, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_dump_state(Ptr<scx_exit_info> ei, @Unsigned long dump_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_dump_task(Ptr<SeqDefinitions.seq_buf> s2, Ptr<scx_dump_ctx> dctx, Ptr<TaskDefinitions.task_struct> p, char marker) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_fork(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_group_set_idle(Ptr<TaskDefinitions.task_group> tg, boolean idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_group_set_weight(Ptr<TaskDefinitions.task_group> tg, @Unsigned long weight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_kobj_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_move_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_ops_bypass(boolean bypass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_ops_disable_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_ops_disable_workfn(Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_ops_enable(Ptr<SchedDefinitions.sched_ext_ops> ops, Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_ops_enable_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_ops_error_irq_workfn(Ptr<IrqDefinitions.irq_work> irq_work2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_ops_exit_kind($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void scx_ops_exit_kind(scx_exit_kind kind, long exit_code, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_ops_exit_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_ops_init_task(Ptr<TaskDefinitions.task_struct> p, Ptr<TaskDefinitions.task_group> tg, boolean fork2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_pick_idle_cpu((const struct cpumask*)$arg1, $arg2)")
    public static int scx_pick_idle_cpu(Ptr<runtime.cpumask> cpus_allowed, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_pm_handler(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_post_fork(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_pre_fork(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_prio_less((const struct task_struct*)$arg1, (const struct task_struct*)$arg2, $arg3)")
    public static boolean scx_prio_less(Ptr<TaskDefinitions.task_struct> a, Ptr<TaskDefinitions.task_struct> b, boolean in_fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_rq_activate(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_rq_deactivate(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_select_cpu_dfl(Ptr<TaskDefinitions.task_struct> p, int prev_cpu, @Unsigned long wake_flags, Ptr<@OriginalName(value="bool") Boolean> found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_set_task_state(Ptr<TaskDefinitions.task_struct> p, scx_task_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> scx_task_iter_next_locked(Ptr<scx_task_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_tg_offline(Ptr<TaskDefinitions.task_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scx_tg_online(Ptr<TaskDefinitions.task_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_tick(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scx_uevent((const struct kobject*)$arg1, $arg2)")
    public static int scx_uevent(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scx_watchdog_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct scx_task_iter")
    @NotUsableInJava
    public static class scx_task_iter
    extends Struct {
        public SchedDefinitions.sched_ext_entity cursor;
        public Ptr<TaskDefinitions.task_struct> locked;
        public Ptr<runtime.rq> rq;
        public RqDefinitions.rq_flags rf;
        public @Unsigned int cnt;
    }

    @Type(noCCodeGeneration=true, cType="enum scx_dsq_iter_flags")
    public static enum scx_dsq_iter_flags implements Enum<scx_dsq_iter_flags>,
    TypedEnum<scx_dsq_iter_flags, Integer>
    {
        SCX_DSQ_ITER_REV,
        __SCX_DSQ_ITER_HAS_SLICE,
        __SCX_DSQ_ITER_HAS_VTIME,
        __SCX_DSQ_ITER_USER_FLAGS,
        __SCX_DSQ_ITER_ALL_FLAGS;

    }

    @Type(noCCodeGeneration=true, cType="struct scx_dump_data")
    @NotUsableInJava
    public static class scx_dump_data
    extends Struct {
        public int cpu;
        public boolean first;
        public int cursor;
        public Ptr<SeqDefinitions.seq_buf> s;
        public String prefix;
        public scx_bstr_buf buf;
    }

    @Type(noCCodeGeneration=true, cType="struct scx_bstr_buf")
    @NotUsableInJava
    public static class scx_bstr_buf
    extends Struct {
        public @Unsigned long @Size(value=12) [] data;
        public char @Size(value=1024) [] line;
    }

    @Type(noCCodeGeneration=true, cType="struct scx_dsp_ctx")
    @NotUsableInJava
    public static class scx_dsp_ctx
    extends Struct {
        public Ptr<runtime.rq> rq;
        public @Unsigned int cursor;
        public @Unsigned int nr_tasks;
        public scx_dsp_buf_ent @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct scx_dsp_buf_ent")
    @NotUsableInJava
    public static class scx_dsp_buf_ent
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public @Unsigned long qseq;
        public @Unsigned long dsq_id;
        public @Unsigned long enq_flags;
    }

    @Type(noCCodeGeneration=true, cType="enum scx_ops_state")
    public static enum scx_ops_state implements Enum<scx_ops_state>,
    TypedEnum<scx_ops_state, Integer>
    {
        SCX_OPSS_NONE,
        SCX_OPSS_QUEUEING,
        SCX_OPSS_QUEUED,
        SCX_OPSS_DISPATCHING,
        SCX_OPSS_QSEQ_SHIFT;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_ops_enable_state")
    public static enum scx_ops_enable_state implements Enum<scx_ops_enable_state>,
    TypedEnum<scx_ops_enable_state, Integer>
    {
        SCX_OPS_ENABLING,
        SCX_OPS_ENABLED,
        SCX_OPS_DISABLING,
        SCX_OPS_DISABLED;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_tg_flags")
    public static enum scx_tg_flags implements Enum<scx_tg_flags>,
    TypedEnum<scx_tg_flags, Integer>
    {
        SCX_TG_ONLINE,
        SCX_TG_INITED;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_kick_flags")
    public static enum scx_kick_flags implements Enum<scx_kick_flags>,
    TypedEnum<scx_kick_flags, Integer>
    {
        SCX_KICK_IDLE,
        SCX_KICK_PREEMPT,
        SCX_KICK_WAIT;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_pick_idle_cpu_flags")
    public static enum scx_pick_idle_cpu_flags implements Enum<scx_pick_idle_cpu_flags>,
    TypedEnum<scx_pick_idle_cpu_flags, Integer>
    {
        SCX_PICK_IDLE_CORE;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_deq_flags")
    public static enum scx_deq_flags implements Enum<scx_deq_flags>,
    TypedEnum<scx_deq_flags, Long>
    {
        SCX_DEQ_SLEEP,
        SCX_DEQ_CORE_SCHED_EXEC;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_enq_flags")
    public static enum scx_enq_flags implements Enum<scx_enq_flags>,
    TypedEnum<scx_enq_flags, Long>
    {
        SCX_ENQ_WAKEUP,
        SCX_ENQ_HEAD,
        SCX_ENQ_CPU_SELECTED,
        SCX_ENQ_PREEMPT,
        SCX_ENQ_REENQ,
        SCX_ENQ_LAST,
        __SCX_ENQ_INTERNAL_MASK,
        SCX_ENQ_CLEAR_OPSS,
        SCX_ENQ_DSQ_PRIQ;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_wake_flags")
    public static enum scx_wake_flags implements Enum<scx_wake_flags>,
    TypedEnum<scx_wake_flags, Integer>
    {
        SCX_WAKE_FORK,
        SCX_WAKE_TTWU,
        SCX_WAKE_SYNC;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_opi")
    public static enum scx_opi implements Enum<scx_opi>,
    TypedEnum<scx_opi, Integer>
    {
        SCX_OPI_BEGIN,
        SCX_OPI_NORMAL_BEGIN,
        SCX_OPI_NORMAL_END,
        SCX_OPI_CPU_HOTPLUG_BEGIN,
        SCX_OPI_CPU_HOTPLUG_END,
        SCX_OPI_END;

    }

    @Type(noCCodeGeneration=true, cType="struct scx_dump_ctx")
    @NotUsableInJava
    public static class scx_dump_ctx
    extends Struct {
        public scx_exit_kind kind;
        public long exit_code;
        public String reason;
        public @Unsigned long at_ns;
        public @Unsigned long at_jiffies;
    }

    @Type(noCCodeGeneration=true, cType="struct scx_cpu_release_args")
    @NotUsableInJava
    public static class scx_cpu_release_args
    extends Struct {
        public scx_cpu_preempt_reason reason;
        public Ptr<TaskDefinitions.task_struct> task;
    }

    @Type(noCCodeGeneration=true, cType="struct scx_cpu_acquire_args")
    @NotUsableInJava
    public static class scx_cpu_acquire_args
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="enum scx_cpu_preempt_reason")
    public static enum scx_cpu_preempt_reason implements Enum<scx_cpu_preempt_reason>,
    TypedEnum<scx_cpu_preempt_reason, Integer>
    {
        SCX_CPU_PREEMPT_RT,
        SCX_CPU_PREEMPT_DL,
        SCX_CPU_PREEMPT_STOP,
        SCX_CPU_PREEMPT_UNKNOWN;

    }

    @Type(noCCodeGeneration=true, cType="struct scx_cgroup_init_args")
    @NotUsableInJava
    public static class scx_cgroup_init_args
    extends Struct {
        public @Unsigned int weight;
    }

    @Type(noCCodeGeneration=true, cType="struct scx_exit_task_args")
    @NotUsableInJava
    public static class scx_exit_task_args
    extends Struct {
        public boolean cancelled;
    }

    @Type(noCCodeGeneration=true, cType="struct scx_init_task_args")
    @NotUsableInJava
    public static class scx_init_task_args
    extends Struct {
        public boolean fork;
        public Ptr<runtime.cgroup> cgroup;
    }

    @Type(noCCodeGeneration=true, cType="enum scx_ops_flags")
    public static enum scx_ops_flags implements Enum<scx_ops_flags>,
    TypedEnum<scx_ops_flags, Integer>
    {
        SCX_OPS_KEEP_BUILTIN_IDLE,
        SCX_OPS_ENQ_LAST,
        SCX_OPS_ENQ_EXITING,
        SCX_OPS_SWITCH_PARTIAL,
        SCX_OPS_HAS_CGROUP_WEIGHT,
        SCX_OPS_ALL_FLAGS;

    }

    @Type(noCCodeGeneration=true, cType="struct scx_exit_info")
    @NotUsableInJava
    public static class scx_exit_info
    extends Struct {
        public scx_exit_kind kind;
        public long exit_code;
        public String reason;
        public Ptr<@Unsigned Long> bt;
        public @Unsigned int bt_len;
        public String msg;
        public String dump;
    }

    @Type(noCCodeGeneration=true, cType="enum scx_exit_code")
    public static enum scx_exit_code implements Enum<scx_exit_code>,
    TypedEnum<scx_exit_code, Long>
    {
        SCX_ECODE_RSN_HOTPLUG,
        SCX_ECODE_ACT_RESTART;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_exit_kind")
    public static enum scx_exit_kind implements Enum<scx_exit_kind>,
    TypedEnum<scx_exit_kind, Integer>
    {
        SCX_EXIT_NONE,
        SCX_EXIT_DONE,
        SCX_EXIT_UNREG,
        SCX_EXIT_UNREG_BPF,
        SCX_EXIT_UNREG_KERN,
        SCX_EXIT_SYSRQ,
        SCX_EXIT_ERROR,
        SCX_EXIT_ERROR_BPF,
        SCX_EXIT_ERROR_STALL;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_consts")
    public static enum scx_consts implements Enum<scx_consts>,
    TypedEnum<scx_consts, Integer>
    {
        SCX_DSP_DFL_MAX_BATCH,
        SCX_DSP_MAX_LOOPS,
        SCX_WATCHDOG_MAX_TIMEOUT,
        SCX_EXIT_BT_LEN,
        SCX_EXIT_MSG_LEN,
        SCX_EXIT_DUMP_DFL_LEN,
        SCX_CPUPERF_ONE,
        SCX_OPS_TASK_ITER_BATCH;

    }

    @Type(noCCodeGeneration=true, cType="struct scx_rq")
    @NotUsableInJava
    public static class scx_rq
    extends Struct {
        public scx_dispatch_q local_dsq;
        public ListDefinitions.list_head runnable_list;
        public ListDefinitions.list_head ddsp_deferred_locals;
        public @Unsigned long ops_qseq;
        public @Unsigned long extra_enq_flags;
        public @Unsigned int nr_running;
        public @Unsigned int flags;
        public @Unsigned int cpuperf_target;
        public boolean cpu_released;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpus_to_kick;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpus_to_kick_if_idle;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpus_to_preempt;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpus_to_wait;
        public @Unsigned long pnt_seq;
        public BalanceDefinitions.balance_callback deferred_bal_cb;
        public IrqDefinitions.irq_work deferred_irq_work;
        public IrqDefinitions.irq_work kick_cpus_irq_work;
    }

    @Type(noCCodeGeneration=true, cType="enum scx_rq_flags")
    public static enum scx_rq_flags implements Enum<scx_rq_flags>,
    TypedEnum<scx_rq_flags, Integer>
    {
        SCX_RQ_ONLINE,
        SCX_RQ_CAN_STOP_TICK,
        SCX_RQ_BAL_PENDING,
        SCX_RQ_BAL_KEEP,
        SCX_RQ_BYPASSING,
        SCX_RQ_IN_WAKEUP,
        SCX_RQ_IN_BALANCE;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_dsq_lnode_flags")
    public static enum scx_dsq_lnode_flags implements Enum<scx_dsq_lnode_flags>,
    TypedEnum<scx_dsq_lnode_flags, Integer>
    {
        SCX_DSQ_LNODE_ITER_CURSOR,
        __SCX_DSQ_LNODE_PRIV_SHIFT;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_kf_mask")
    public static enum scx_kf_mask implements Enum<scx_kf_mask>,
    TypedEnum<scx_kf_mask, Integer>
    {
        SCX_KF_UNLOCKED,
        SCX_KF_CPU_RELEASE,
        SCX_KF_DISPATCH,
        SCX_KF_ENQUEUE,
        SCX_KF_SELECT_CPU,
        SCX_KF_REST,
        __SCX_KF_RQ_LOCKED,
        __SCX_KF_TERMINAL;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_ent_dsq_flags")
    public static enum scx_ent_dsq_flags implements Enum<scx_ent_dsq_flags>,
    TypedEnum<scx_ent_dsq_flags, Integer>
    {
        SCX_TASK_DSQ_ON_PRIQ;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_task_state")
    public static enum scx_task_state implements Enum<scx_task_state>,
    TypedEnum<scx_task_state, Integer>
    {
        SCX_TASK_NONE,
        SCX_TASK_INIT,
        SCX_TASK_READY,
        SCX_TASK_ENABLED,
        SCX_TASK_NR_STATES;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_ent_flags")
    public static enum scx_ent_flags implements Enum<scx_ent_flags>,
    TypedEnum<scx_ent_flags, Integer>
    {
        SCX_TASK_QUEUED,
        SCX_TASK_RESET_RUNNABLE_AT,
        SCX_TASK_DEQD_FOR_SLEEP,
        SCX_TASK_STATE_SHIFT,
        SCX_TASK_STATE_BITS,
        SCX_TASK_STATE_MASK,
        SCX_TASK_CURSOR;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_dsq_id_flags")
    public static enum scx_dsq_id_flags implements Enum<scx_dsq_id_flags>,
    TypedEnum<scx_dsq_id_flags, Long>
    {
        SCX_DSQ_FLAG_BUILTIN,
        SCX_DSQ_FLAG_LOCAL_ON,
        SCX_DSQ_INVALID,
        SCX_DSQ_GLOBAL,
        SCX_DSQ_LOCAL,
        SCX_DSQ_LOCAL_ON,
        SCX_DSQ_LOCAL_CPU_MASK;

    }

    @Type(noCCodeGeneration=true, cType="enum scx_public_consts")
    public static enum scx_public_consts implements Enum<scx_public_consts>,
    TypedEnum<scx_public_consts, Long>
    {
        SCX_OPS_NAME_LEN,
        SCX_SLICE_DFL,
        SCX_SLICE_INF;

    }

    @Type(noCCodeGeneration=true, cType="struct scx_dsq_list_node")
    @NotUsableInJava
    public static class scx_dsq_list_node
    extends Struct {
        public ListDefinitions.list_head node;
        public @Unsigned int flags;
        public @Unsigned int priv;
    }

    @Type(noCCodeGeneration=true, cType="struct scx_dispatch_q")
    @NotUsableInJava
    public static class scx_dispatch_q
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public ListDefinitions.list_head list;
        public RbDefinitions.rb_root priq;
        public @Unsigned int nr;
        public @Unsigned int seq;
        public @Unsigned long id;
        public misc.rhash_head hash_node;
        public misc.llist_node free_node;
        public misc.callback_head rcu;
    }
}

