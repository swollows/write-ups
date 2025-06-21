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
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RtDefinitions;
import me.bechberger.ebpf.runtime.SrDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class RcuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_free_kmmio_fault_pages(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_free_slab(Ptr<misc.callback_head> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sync_dtor(Ptr<rcu_sync> rsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sync_enter(Ptr<rcu_sync> rsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sync_exit(Ptr<rcu_sync> rsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sync_func(Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sync_init(Ptr<rcu_sync> rsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_async_hurry() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_async_relax() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_async_should_hurry() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_barrier_tasks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_barrier_tasks_generic(Ptr<rcu_tasks> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_barrier_tasks_generic_cb(Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_barrier_tasks_trace() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cleanup_netpoll_info(Ptr<misc.callback_head> callback_head2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_early_boot_tests() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_end_inkernel_boot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_expedite_gp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rcu_expedited_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rcu_expedited_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rcu_expedited_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_free_old_probes(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_gp_is_expedited() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_gp_is_normal() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_guarded_free(Ptr<misc.callback_head> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_init_tasks_generic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_inkernel_boot_has_ended() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rcu_normal_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rcu_normal_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rcu_normal_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_read_unlock_trace_special(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_set_runtime_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_spawn_tasks_kthread_generic(Ptr<rcu_tasks> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_be_rude(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_get_gp_data(Ptr<Integer> flags, Ptr<@Unsigned Long> gp_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_invoke_cbs(Ptr<rcu_tasks> rtp, Ptr<rcu_tasks_percpu> rtpcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_invoke_cbs_wq(Ptr<misc.work_struct> wp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_tasks_kthread(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_tasks_need_gpcb(Ptr<rcu_tasks> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_one_gp(Ptr<rcu_tasks> rtp, boolean midboot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_pertask(Ptr<TaskDefinitions.task_struct> t, Ptr<ListDefinitions.list_head> hop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_postgp(Ptr<rcu_tasks> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_postscan(Ptr<ListDefinitions.list_head> hop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_pregp_step(Ptr<ListDefinitions.list_head> hop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_rude_get_gp_data(Ptr<Integer> flags, Ptr<@Unsigned Long> gp_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_rude_torture_stats_print(String tt, String tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_rude_wait_gp(Ptr<rcu_tasks> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_torture_stats_print(String tt, String tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_torture_stats_print_generic(Ptr<rcu_tasks> rtp, String tt, String tf, String tst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_trace_empty_fn(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_trace_get_gp_data(Ptr<Integer> flags, Ptr<@Unsigned Long> gp_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_trace_postgp(Ptr<rcu_tasks> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_trace_postscan(Ptr<ListDefinitions.list_head> hop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_trace_pregp_step(Ptr<ListDefinitions.list_head> hop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_trace_qs_blkd(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_trace_torture_stats_print(String tt, String tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_tasks_wait_gp(Ptr<rcu_tasks> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_test_sync_prims() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char rcu_trc_cmpxchg_need_qs(Ptr<TaskDefinitions.task_struct> t, char old, char _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_unexpedite_gp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rcu_irq_enter_check_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rcu_read_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rcu_read_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rcu_report_exp_rnp(Ptr<rcu_node> rnp, boolean wake, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_accelerate_cbs(Ptr<rcu_node> rnp, Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_accelerate_cbs_unlocked(Ptr<rcu_node> rnp, Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_advance_cbs_nowake(Ptr<rcu_node> rnp, Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_barrier() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_barrier_callback(Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_barrier_entrain(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_barrier_handler(Ptr<?> cpu_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_bind_current_to_nocb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_bootup_announce_oddness() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_check_boost_fail(@Unsigned long gp_state, Ptr<Integer> cpup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_check_gp_kthread_expired_fqs_timer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_check_gp_kthread_starvation() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cleanup_dead_rnp(Ptr<rcu_node> rnp_leaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_core() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_core_si() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_cpu_beenfullyonline(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cpu_kthread(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cpu_kthread_park(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cpu_kthread_setup(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_cpu_kthread_should_run(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_cpu_online(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cpu_stall_reset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_disable_urgency_upon_qs(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_do_batch(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_dump_cpu_stacks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long rcu_exp_batches_completed() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_exp_handler(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_exp_jiffies_till_stall_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_exp_wait_wake(@Unsigned long s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_force_quiescent_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_fwd_progress_check(@Unsigned long j) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_get_gp_kthreads_prio() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long rcu_get_gp_seq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long rcu_get_jiffies_lazy_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_gp_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_gp_fqs_loop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_gp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_gp_kthread(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_gp_kthread_wake() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_gp_might_be_stalled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_gp_set_torture_wait(int duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_gp_slow(int delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_gp_slow_register(Ptr<AtomicDefinitions.atomic_t> rgssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_gp_slow_unregister(Ptr<AtomicDefinitions.atomic_t> rgssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_init_geometry() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_init_nohz() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_init_one() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_is_watching() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_iw_handler(Ptr<IrqDefinitions.irq_work> iwp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_jiffies_till_stall_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_momentary_eqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_needs_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_nocb_cb_kthread(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_nocb_cpu_deoffload(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_nocb_cpu_offload(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_nocb_flush_bypass(Ptr<rcu_data> rdp, Ptr<misc.callback_head> rhp, @Unsigned long j, boolean lazy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_nocb_flush_deferred_wakeup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_nocb_gp_kthread(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_nocb_queue_toggle_rdp(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_nocb_rdp_deoffload(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_nocb_rdp_deoffload_wait_cond(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_nocb_rdp_offload_wait_cond(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_nocb_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_nocb_try_bypass(Ptr<rcu_data> rdp, Ptr<misc.callback_head> rhp, Ptr<@OriginalName(value="bool") Boolean> was_alldone, @Unsigned long flags, boolean lazy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_nocb_try_flush_bypass(Ptr<rcu_data> rdp, @Unsigned long j) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_note_context_switch(boolean preempt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_organize_nocb_kthreads() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_panic(Ptr<misc.notifier_block> _this, @Unsigned long ev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_pending(int user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_pm_notify(Ptr<misc.notifier_block> self, @Unsigned long action, Ptr<?> hcpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_poll_gp_seq_end_unlocked(Ptr<@Unsigned Long> snap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_poll_gp_seq_start_unlocked(Ptr<@Unsigned Long> snap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_preempt_ctxt_queue(Ptr<rcu_node> rnp, Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_preempt_deferred_qs(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_preempt_deferred_qs_handler(Ptr<IrqDefinitions.irq_work> iwp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_preempt_deferred_qs_irqrestore(Ptr<TaskDefinitions.task_struct> t, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_print_task_stall(Ptr<rcu_node> rnp, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_read_unlock_special(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_report_exp_cpu_mult(Ptr<rcu_node> rnp, @Unsigned long mask, boolean wake) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_report_qs_rnp(@Unsigned long mask, Ptr<rcu_node> rnp, @Unsigned long gps, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_request_urgent_qs_task(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sched_clock_irq(int user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_scheduler_starting() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_set_jiffies_lazy_flush(@Unsigned long jif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_softirq_qs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_spawn_cpu_nocb_kthread(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_spawn_gp_kthread() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_spawn_rnp_kthreads(Ptr<rcu_node> rnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sr_normal_gp_cleanup_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_stall_kick_kthreads() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_start_this_gp(Ptr<rcu_node> rnp_start, Ptr<rcu_data> rdp, @Unsigned long gp_seq_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sysrq_end() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_sysrq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_sysrq_start() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_watching_snap_recheck(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rcu_watching_snap_save(Ptr<rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_watching_zero_in_eqs(int cpu2, Ptr<Integer> vp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.callback_head> rcu_cblist_dequeue(Ptr<rcu_cblist> rclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cblist_enqueue(Ptr<rcu_cblist> rclp, Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cblist_flush_enqueue(Ptr<rcu_cblist> drclp, Ptr<rcu_cblist> srclp, Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_cblist_init(Ptr<rcu_cblist> rclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_free_pool(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_free_wq(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_segcblist_accelerate(Ptr<rcu_segcblist> rsclp, @Unsigned long seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_add_len(Ptr<rcu_segcblist> rsclp, long v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_advance(Ptr<rcu_segcblist> rsclp, @Unsigned long seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_disable(Ptr<rcu_segcblist> rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_enqueue(Ptr<rcu_segcblist> rsclp, Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_segcblist_entrain(Ptr<rcu_segcblist> rsclp, Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_extract_done_cbs(Ptr<rcu_segcblist> rsclp, Ptr<rcu_cblist> rclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_extract_pend_cbs(Ptr<rcu_segcblist> rsclp, Ptr<rcu_cblist> rclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.callback_head> rcu_segcblist_first_cb(Ptr<rcu_segcblist> rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.callback_head> rcu_segcblist_first_pend_cb(Ptr<rcu_segcblist> rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long rcu_segcblist_get_seglen(Ptr<rcu_segcblist> rsclp, int seg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_inc_len(Ptr<rcu_segcblist> rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_init(Ptr<rcu_segcblist> rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_insert_count(Ptr<rcu_segcblist> rsclp, Ptr<rcu_cblist> rclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_insert_done_cbs(Ptr<rcu_segcblist> rsclp, Ptr<rcu_cblist> rclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_insert_pend_cbs(Ptr<rcu_segcblist> rsclp, Ptr<rcu_cblist> rclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_segcblist_merge(Ptr<rcu_segcblist> dst_rsclp, Ptr<rcu_segcblist> src_rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long rcu_segcblist_n_segment_cbs(Ptr<rcu_segcblist> rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_segcblist_nextgp(Ptr<rcu_segcblist> rsclp, Ptr<@Unsigned Long> lp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_segcblist_pend_cbs(Ptr<rcu_segcblist> rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rcu_segcblist_ready_cbs(Ptr<rcu_segcblist> rsclp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rcu_work_rcufn(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_stall_chk_rdr")
    @NotUsableInJava
    public static class rcu_stall_chk_rdr
    extends Struct {
        public int nesting;
        public rcu_special rs;
        public boolean on_blkd_list;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_state")
    @NotUsableInJava
    public static class rcu_state
    extends Struct {
        public rcu_node @Size(value=521) [] node;
        public Ptr<rcu_node> @Size(value=4) [] level;
        public int ncpus;
        public int n_online_cpus;
        public @Unsigned long gp_seq;
        public @Unsigned long gp_max;
        public Ptr<TaskDefinitions.task_struct> gp_kthread;
        public misc.swait_queue_head gp_wq;
        public short gp_flags;
        public short gp_state;
        public @Unsigned long gp_wake_time;
        public @Unsigned long gp_wake_seq;
        public @Unsigned long gp_seq_polled;
        public @Unsigned long gp_seq_polled_snap;
        public @Unsigned long gp_seq_polled_exp_snap;
        public runtime.mutex barrier_mutex;
        public AtomicDefinitions.atomic_t barrier_cpu_count;
        public runtime.completion barrier_completion;
        public @Unsigned long barrier_sequence;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock barrier_lock;
        public runtime.mutex exp_mutex;
        public runtime.mutex exp_wake_mutex;
        public @Unsigned long expedited_sequence;
        public AtomicDefinitions.atomic_t expedited_need_qs;
        public misc.swait_queue_head expedited_wq;
        public int ncpus_snap;
        public char cbovld;
        public char cbovldnext;
        public @Unsigned long jiffies_force_qs;
        public @Unsigned long jiffies_kick_kthreads;
        public @Unsigned long n_force_qs;
        public @Unsigned long gp_start;
        public @Unsigned long gp_end;
        public @Unsigned long gp_activity;
        public @Unsigned long gp_req_activity;
        public @Unsigned long jiffies_stall;
        public int nr_fqs_jiffies_stall;
        public @Unsigned long jiffies_resched;
        public @Unsigned long n_force_qs_gpstart;
        public String name;
        public char abbr;
        public  @OriginalName(value="arch_spinlock_t") runtime.qspinlock ofl_lock;
        public misc.llist_head srs_next;
        public Ptr<misc.llist_node> srs_wait_tail;
        public Ptr<misc.llist_node> srs_done_tail;
        public SrDefinitions.sr_wait_node @Size(value=5) [] srs_wait_nodes;
        public misc.work_struct srs_cleanup_work;
        public AtomicDefinitions.atomic_t srs_cleanups_pending;
        public runtime.mutex nocb_mutex;
        public int nocb_is_setup;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_data")
    @NotUsableInJava
    public static class rcu_data
    extends Struct {
        public @Unsigned long gp_seq;
        public @Unsigned long gp_seq_needed;
        public rcu_noqs cpu_no_qs;
        public boolean core_needs_qs;
        public boolean beenonline;
        public boolean gpwrap;
        public boolean cpu_started;
        public Ptr<rcu_node> mynode;
        public @Unsigned long grpmask;
        public @Unsigned long ticks_this_gp;
        public IrqDefinitions.irq_work defer_qs_iw;
        public boolean defer_qs_iw_pending;
        public misc.work_struct strict_work;
        public rcu_segcblist cblist;
        public long qlen_last_fqs_check;
        public @Unsigned long n_cbs_invoked;
        public @Unsigned long n_force_qs_snap;
        public long blimit;
        public int watching_snap;
        public boolean rcu_need_heavy_qs;
        public boolean rcu_urgent_qs;
        public boolean rcu_forced_tick;
        public boolean rcu_forced_tick_exp;
        public @Unsigned long barrier_seq_snap;
        public misc.callback_head barrier_head;
        public int exp_watching_snap;
        public misc.swait_queue_head nocb_cb_wq;
        public misc.swait_queue_head nocb_state_wq;
        public Ptr<TaskDefinitions.task_struct> nocb_gp_kthread;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock nocb_lock;
        public int nocb_defer_wakeup;
        public TimerDefinitions.timer_list nocb_timer;
        public @Unsigned long nocb_gp_adv_time;
        public runtime.mutex nocb_gp_kthread_mutex;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock nocb_bypass_lock;
        public rcu_cblist nocb_bypass;
        public @Unsigned long nocb_bypass_first;
        public @Unsigned long nocb_nobypass_last;
        public int nocb_nobypass_count;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock nocb_gp_lock;
        public char nocb_gp_sleep;
        public char nocb_gp_bypass;
        public char nocb_gp_gp;
        public @Unsigned long nocb_gp_seq;
        public @Unsigned long nocb_gp_loops;
        public misc.swait_queue_head nocb_gp_wq;
        public boolean nocb_cb_sleep;
        public Ptr<TaskDefinitions.task_struct> nocb_cb_kthread;
        public ListDefinitions.list_head nocb_head_rdp;
        public ListDefinitions.list_head nocb_entry_rdp;
        public Ptr<rcu_data> nocb_toggling_rdp;
        public Ptr<rcu_data> nocb_gp_rdp;
        public Ptr<TaskDefinitions.task_struct> rcu_cpu_kthread_task;
        public @Unsigned int rcu_cpu_kthread_status;
        public char rcu_cpu_has_work;
        public @Unsigned long rcuc_activity;
        public @Unsigned int softirq_snap;
        public IrqDefinitions.irq_work rcu_iw;
        public boolean rcu_iw_pending;
        public @Unsigned long rcu_iw_gp_seq;
        public @Unsigned long rcu_ofl_gp_seq;
        public short rcu_ofl_gp_state;
        public @Unsigned long rcu_onl_gp_seq;
        public short rcu_onl_gp_state;
        public @Unsigned long last_fqs_resched;
        public @Unsigned long last_sched_clock;
        public rcu_snap_record snap_record;
        public long lazy_len;
        public int cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_snap_record")
    @NotUsableInJava
    public static class rcu_snap_record
    extends Struct {
        public @Unsigned long gp_seq;
        public @Unsigned long cputime_irq;
        public @Unsigned long cputime_softirq;
        public @Unsigned long cputime_system;
        public @Unsigned long nr_hardirqs;
        public @Unsigned int nr_softirqs;
        public @Unsigned long nr_csw;
        public @Unsigned long jiffies;
    }

    @Type(noCCodeGeneration=true, cType="union rcu_noqs")
    @NotUsableInJava
    public static class rcu_noqs
    extends Union {
        public misc.b_of_rcu_noqs b;
        public @Unsigned short s;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_exp_work")
    @NotUsableInJava
    public static class rcu_exp_work
    extends Struct {
        public @Unsigned long rew_s;
        public KthreadDefinitions.kthread_work rew_work;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_node")
    @NotUsableInJava
    public static class rcu_node
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned long gp_seq;
        public @Unsigned long gp_seq_needed;
        public @Unsigned long completedqs;
        public @Unsigned long qsmask;
        public @Unsigned long rcu_gp_init_mask;
        public @Unsigned long qsmaskinit;
        public @Unsigned long qsmaskinitnext;
        public @Unsigned long expmask;
        public @Unsigned long expmaskinit;
        public @Unsigned long expmaskinitnext;
        public Ptr<KthreadDefinitions.kthread_worker> exp_kworker;
        public @Unsigned long cbovldmask;
        public @Unsigned long ffmask;
        public @Unsigned long grpmask;
        public int grplo;
        public int grphi;
        public char grpnum;
        public char level;
        public boolean wait_blkd_tasks;
        public Ptr<rcu_node> parent;
        public ListDefinitions.list_head blkd_tasks;
        public Ptr<ListDefinitions.list_head> gp_tasks;
        public Ptr<ListDefinitions.list_head> exp_tasks;
        public Ptr<ListDefinitions.list_head> boost_tasks;
        public RtDefinitions.rt_mutex boost_mtx;
        public @Unsigned long boost_time;
        public runtime.mutex kthread_mutex;
        public Ptr<TaskDefinitions.task_struct> boost_kthread_task;
        public @Unsigned int boost_kthread_status;
        public @Unsigned long n_boosts;
        public misc.swait_queue_head @Size(value=2) [] nocb_gp_wq;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock fqslock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock exp_lock;
        public @Unsigned long exp_seq_rq;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head @Size(value=4) [] exp_wq;
        public rcu_exp_work rew;
        public boolean exp_need_flush;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock exp_poll_lock;
        public @Unsigned long exp_seq_poll_rq;
        public misc.work_struct exp_poll_wq;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_gp_oldstate")
    @NotUsableInJava
    public static class rcu_gp_oldstate
    extends Struct {
        public @Unsigned long rgos_norm;
        public @Unsigned long rgos_exp;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_tasks_percpu")
    @NotUsableInJava
    public static class rcu_tasks_percpu
    extends Struct {
        public rcu_segcblist cblist;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned long rtp_jiffies;
        public @Unsigned long rtp_n_lock_retries;
        public TimerDefinitions.timer_list lazy_timer;
        public @Unsigned int urgent_gp;
        public misc.work_struct rtp_work;
        public IrqDefinitions.irq_work rtp_irq_work;
        public misc.callback_head barrier_q_head;
        public ListDefinitions.list_head rtp_blkd_tasks;
        public ListDefinitions.list_head rtp_exit_list;
        public int cpu;
        public int index;
        public Ptr<rcu_tasks> rtpp;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_tasks")
    @NotUsableInJava
    public static class rcu_tasks
    extends Struct {
        public runtime.rcuwait cbs_wait;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock cbs_gbl_lock;
        public runtime.mutex tasks_gp_mutex;
        public int gp_state;
        public int gp_sleep;
        public int init_fract;
        public @Unsigned long gp_jiffies;
        public @Unsigned long gp_start;
        public @Unsigned long tasks_gp_seq;
        public @Unsigned long n_ipis;
        public @Unsigned long n_ipis_fails;
        public Ptr<TaskDefinitions.task_struct> kthread_ptr;
        public @Unsigned long lazy_jiffies;
        public @OriginalName(value="rcu_tasks_gp_func_t") Ptr<?> gp_func;
        public @OriginalName(value="pregp_func_t") Ptr<?> pregp_func;
        public @OriginalName(value="pertask_func_t") Ptr<?> pertask_func;
        public @OriginalName(value="postscan_func_t") Ptr<?> postscan_func;
        public @OriginalName(value="holdouts_func_t") Ptr<?> holdouts_func;
        public @OriginalName(value="postgp_func_t") Ptr<?> postgp_func;
        public @OriginalName(value="call_rcu_func_t") Ptr<?> call_func;
        public @Unsigned int wait_state;
        public Ptr<rcu_tasks_percpu> rtpcpu;
        public Ptr<Ptr<rcu_tasks_percpu>> rtpcp_array;
        public int percpu_enqueue_shift;
        public int percpu_enqueue_lim;
        public int percpu_dequeue_lim;
        public @Unsigned long percpu_dequeue_gpseq;
        public runtime.mutex barrier_q_mutex;
        public AtomicDefinitions.atomic_t barrier_q_count;
        public runtime.completion barrier_q_completion;
        public @Unsigned long barrier_q_seq;
        public @Unsigned long barrier_q_start;
        public String name;
        public String kname;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_synchronize")
    @NotUsableInJava
    public static class rcu_synchronize
    extends Struct {
        public misc.callback_head head;
        public runtime.completion completion;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_cblist")
    @NotUsableInJava
    public static class rcu_cblist
    extends Struct {
        public Ptr<misc.callback_head> head;
        public Ptr<Ptr<misc.callback_head>> tail;
        public long len;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_sync")
    @NotUsableInJava
    public static class rcu_sync
    extends Struct {
        public int gp_state;
        public int gp_count;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head gp_wait;
        public misc.callback_head cb_head;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_segcblist")
    @NotUsableInJava
    public static class rcu_segcblist
    extends Struct {
        public Ptr<misc.callback_head> head;
        public Ptr<Ptr<misc.callback_head>> @Size(value=4) [] tails;
        public @Unsigned long @Size(value=4) [] gp_seq;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t len;
        public long @Size(value=4) [] seglen;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct rcu_work")
    @NotUsableInJava
    public static class rcu_work
    extends Struct {
        public misc.work_struct work;
        public misc.callback_head rcu;
        public Ptr<WorkqueueDefinitions.workqueue_struct> wq;
    }

    @Type(noCCodeGeneration=true, cType="union rcu_special")
    @NotUsableInJava
    public static class rcu_special
    extends Union {
        public misc.b_of_rcu_special b;
        public @Unsigned int s;
    }
}

