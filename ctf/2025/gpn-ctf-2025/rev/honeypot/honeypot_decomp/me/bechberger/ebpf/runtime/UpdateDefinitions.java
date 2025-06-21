/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.ArrayDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FreqDefinitions;
import me.bechberger.ebpf.runtime.HfiDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.NumaDefinitions;
import me.bechberger.ebpf.runtime.OhciDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PsiDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.RpmDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SdDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TracingDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.WakeDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class UpdateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __update_blocked_fair(Ptr<runtime.rq> rq2, Ptr<@OriginalName(value="bool") Boolean> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_idle_core(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_max_tr(Ptr<TraceDefinitions.trace_array> tr, Ptr<TaskDefinitions.task_struct> tsk, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_runtime_status(Ptr<runtime.device> dev, RpmDefinitions.rpm_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_array_info(Ptr<runtime.mddev> mddev2, Ptr< @OriginalName(value="mdu_array_info_t") misc.mdu_array_info_s> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_autosuspend(Ptr<runtime.device> dev, int old_delay, int old_use) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_buffer_entries(Ptr<ArrayDefinitions.array_buffer> buf, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_cfs_group(Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_children(Ptr<KeyDefinitions.key_vector> tn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_connector_routing(Ptr<DrmDefinitions.drm_atomic_state> state2, Ptr<DrmDefinitions.drm_connector> connector, Ptr<DrmDefinitions.drm_connector_state> old_connector_state, Ptr<DrmDefinitions.drm_connector_state> new_connector_state, boolean added_by_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_cpu_capacity(Ptr<SchedDefinitions.sched_domain> sd, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_curr(Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long update_curr_common(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_curr_fair(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long update_curr_se(Ptr<runtime.rq> rq2, Ptr<SchedDefinitions.sched_entity> curr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_done_list(Ptr<OhciDefinitions.ohci_hcd> ohci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_entity_lag(Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_filter(Ptr<misc.tap_filter> filter, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_gcr3(Ptr<IommuDefinitions.iommu_dev_data> dev_data, @Unsigned @OriginalName(value="ioasid_t") int pasid, @Unsigned long gcr3, boolean set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_gds_msr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_group_capacity(Ptr<SchedDefinitions.sched_domain> sd, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_iter(Ptr<misc.kallsym_iter> iter2, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_iter_mod(Ptr<misc.kallsym_iter> iter2, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_load_avg(Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> se, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_max_interval() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_max_tr(Ptr<TraceDefinitions.trace_array> tr, Ptr<TaskDefinitions.task_struct> tsk, int cpu2, Ptr<?> cond_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_max_tr_single(Ptr<TraceDefinitions.trace_array> tr, Ptr<TaskDefinitions.task_struct> tsk, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_min_vruntime(Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_netprio((const void*)$arg1, $arg2, $arg3)")
    public static int update_netprio(Ptr<?> v, Ptr<runtime.file> file2, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_numa_stats(Ptr<TaskDefinitions.task_numa_env> env, Ptr<NumaDefinitions.numa_stats> ns, int nid, boolean find_idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_persistent_clock64(runtime.timespec64 now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_port_device_state(Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_printk_trace(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_raid_disks(Ptr<runtime.mddev> mddev2, int raid_disks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_regset_xstate_info(@Unsigned int size, @Unsigned long xstate_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_res(Ptr<PciDefinitions.pci_root_info> info2, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end, @Unsigned long flags, int merge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_rlimit_cpu(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long rlim_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_saved_topdown_regs(Ptr<PerfDefinitions.perf_event> event2, @Unsigned long slots, @Unsigned long metrics, int metric_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_sd_lb_stats(Ptr<misc.lb_env> env, Ptr<SdDefinitions.sd_lb_stats> sds) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean update_sd_pick_busiest(Ptr<misc.lb_env> env, Ptr<SdDefinitions.sd_lb_stats> sds, Ptr<SchedDefinitions.sched_group> sg2, Ptr<SgDefinitions.sg_lb_stats> sgs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_sg_lb_stats(Ptr<misc.lb_env> env, Ptr<SdDefinitions.sd_lb_stats> sds, Ptr<SchedDefinitions.sched_group> group, Ptr<SgDefinitions.sg_lb_stats> sgs, Ptr<@OriginalName(value="bool") Boolean> sg_overloaded, Ptr<@OriginalName(value="bool") Boolean> sg_overutilized) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_sg_wakeup_stats(Ptr<SchedDefinitions.sched_domain> sd, Ptr<SchedDefinitions.sched_group> group, Ptr<SgDefinitions.sg_lb_stats> sgs, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_size(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long num_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_slot_info(Ptr<runtime.slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_socket_protocol(int family, int type2, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_spec_ctrl(@Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_spec_ctrl_cond(@Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_srbds_msr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_static_calls() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_stibp_msr(Ptr<?> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char update_suffix(Ptr<KeyDefinitions.key_vector> tn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_task_scan_period(Ptr<TaskDefinitions.task_struct> p, @Unsigned long shared, @Unsigned long _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_tfa_sched(Ptr<?> ignored) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_and_free_hugetlb_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_stats_enqueue_sleeper(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<SchedDefinitions.sched_statistics> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_stats_wait_end(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<SchedDefinitions.sched_statistics> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_stats_wait_start(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<SchedDefinitions.sched_statistics> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _update_task_closid_rmid(Ptr<?> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_and_free_hugetlb_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2, boolean atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_and_free_pages_bulk(Ptr<runtime.hstate> h, Ptr<ListDefinitions.list_head> folio_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long update_averages(Ptr<PsiDefinitions.psi_group> group, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_backups(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="sector_t") long blk_off, String data, int size, int meta_bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_batch_size(Ptr<LruDefinitions.lru_gen_mm_walk> walk, Ptr<runtime.folio> folio2, int old_gen, int new_gen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_bloom_filter(Ptr<LruDefinitions.lru_gen_mm_state> mm_state, @Unsigned long seq, Ptr<?> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_cache_mode_entry(@Unsigned int entry, PageDefinitions.page_cache_mode cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_cached_migrate(Ptr<misc.compact_control> cc, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_classid_sock((const void*)$arg1, $arg2, $arg3)")
    public static int update_classid_sock(Ptr<?> v, Ptr<runtime.file> file2, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_classid_task(Ptr<TaskDefinitions.task_struct> p, @Unsigned int classid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_cpu_closid_rmid(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_curr_stop(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_effective_progs(Ptr<runtime.cgroup> cgrp, CgroupDefinitions.cgroup_bpf_attach_type atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_enable_bit_for(Ptr<UserDefinitions.user_event> user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_ftrace_function() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_if_frozen(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_page_count(int level, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_per_cpu_data_slice_size(boolean cpu_online, @Unsigned int cpu2, Ptr< @OriginalName(value="cpumask_t") runtime.cpumask> cpu_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_per_cpu_data_slice_size_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_process_times(int user_tick) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_queue(Ptr<misc.sem_array> sma, int semnum, Ptr<WakeDefinitions.wake_q_head> wake_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_sched_domain_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_task_stack(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_top_cache_domain(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_triggers(Ptr<PsiDefinitions.psi_group> group, @Unsigned long now, PsiDefinitions.psi_aggregators aggregator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_user_maps() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_vmcoreinfo_note() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_vsyscall(Ptr<runtime.timekeeper> tk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_vsyscall_tz() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __update_ref_ctr(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long vaddr, short d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_reg32_bounds(Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_capabilities(Ptr<HfiDefinitions.hfi_instance> hfi_instance2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_cpumask($arg1, $arg2, (const u8*)$arg3)")
    public static int update_cpumask(Ptr<runtime.cpuset> cs, Ptr<runtime.cpuset> trialcs, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_cpumasks_hier(Ptr<runtime.cpuset> cs, Ptr<runtime.tmpmasks> tmp, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_dind_extent_range(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblock, Ptr<MigrateDefinitions.migrate_struct> lb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_display_info($arg1, (const struct drm_edid*)$arg2)")
    public static void update_display_info(Ptr<DrmDefinitions.drm_connector> connector, Ptr<DrmDefinitions.drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_domain_attr_tree(Ptr<SchedDefinitions.sched_domain_attr> dattr, Ptr<runtime.cpuset> root_cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_exclusive_cpumask($arg1, $arg2, (const u8*)$arg3)")
    public static int update_exclusive_cpumask(Ptr<runtime.cpuset> cs, Ptr<runtime.cpuset> trialcs, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_ind_extent_range(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblock, Ptr<MigrateDefinitions.migrate_struct> lb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_io_ticks(Ptr<BlockDefinitions.block_device> part, @Unsigned long now, boolean end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_loop_entry(Ptr<BpfDefinitions.bpf_verifier_state> cur, Ptr<BpfDefinitions.bpf_verifier_state> hdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_mp_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_mptable_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_nodemask($arg1, $arg2, (const u8*)$arg3)")
    public static int update_nodemask(Ptr<runtime.cpuset> cs, Ptr<runtime.cpuset> trialcs, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_nodemasks_hier(Ptr<runtime.cpuset> cs, Ptr<misc.nodemask_t> new_mems) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_or_create_fnhe(Ptr<FibDefinitions.fib_nh_common> nhc, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int gw, @Unsigned int pmtu, boolean lock, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_output_state(Ptr<DrmDefinitions.drm_atomic_state> state2, Ptr<DrmDefinitions.drm_mode_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_parent_effective_cpumask(Ptr<runtime.cpuset> cs, int cmd, Ptr<runtime.cpumask> newmask, Ptr<runtime.tmpmasks> tmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_partition_exclusive(Ptr<runtime.cpuset> cs, int new_prs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_partition_sd_lb(Ptr<runtime.cpuset> cs, int old_prs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_policy($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long update_policy(Ptr<runtime.file> f, String data, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_prstate(Ptr<runtime.cpuset> cs, int new_prs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_qos_request(FreqDefinitions.freq_qos_req_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_ref_ctr(Ptr<runtime.uprobe> uprobe2, Ptr<MmDefinitions.mm_struct> mm, short d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_ref_ctr_warn(Ptr<runtime.uprobe> uprobe2, Ptr<MmDefinitions.mm_struct> mm, short d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_region(Ptr<VcDefinitions.vc_data> vc2, @Unsigned long start, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_rq_clock(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_sibling_cpumasks(Ptr<runtime.cpuset> parent, Ptr<runtime.cpuset> cs, Ptr<runtime.tmpmasks> tmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_super_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __update_field_vars(Ptr<TracingDefinitions.tracing_map_elt> elt, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<RingDefinitions.ring_buffer_event> rbe, Ptr<?> rec, Ptr<Ptr<misc.field_var>> field_vars, @Unsigned int n_field_vars, @Unsigned int field_var_str_start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __update_load_avg_blocked_se(@Unsigned long now, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __update_load_avg_cfs_rq(@Unsigned long now, Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __update_load_avg_se(@Unsigned long now, Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_balloon_size_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int update_balloon_stats(Ptr<VirtioDefinitions.virtio_balloon> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_balloon_stats_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int update_balloon_vm_stats(Ptr<VirtioDefinitions.virtio_balloon> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_cond_flag(Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_curr_dl(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_curr_dl_se(Ptr<runtime.rq> rq2, Ptr<SchedDefinitions.sched_dl_entity> dl_se, long delta_exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_curr_idle(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_curr_rt(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_curr_scx(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_devfreq(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_dl_rq_load_avg(@Unsigned long now, Ptr<runtime.rq> rq2, int running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_efi_random_seed(Ptr<misc.notifier_block> nb, @Unsigned long code2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_event_fields(Ptr<TraceDefinitions.trace_event_call> call, Ptr<TraceDefinitions.trace_eval_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_event_printk(Ptr<TraceDefinitions.trace_event_call> call, Ptr<TraceDefinitions.trace_eval_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_event_probe(Ptr<EventDefinitions.event_probe_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_fast_timekeeper((const struct tk_read_base*)$arg1, $arg2)")
    public static void update_fast_timekeeper(Ptr<misc.tk_read_base> tkr, Ptr<misc.tk_fast> tkf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_file_ctx(Ptr<AaDefinitions.aa_file_ctx> fctx, Ptr<AaDefinitions.aa_label> label, @Unsigned int request2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_idle_stub(int cpu2, boolean idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_note_header_size_elf32((const elf32_hdr*)$arg1)")
    public static int update_note_header_size_elf32(Ptr< @OriginalName(value="Elf32_Ehdr") misc.elf32_hdr> ehdr_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="update_note_header_size_elf64((const elf64_hdr*)$arg1)")
    public static int update_note_header_size_elf64(Ptr< @OriginalName(value="Elf64_Ehdr") misc.elf64_hdr> ehdr_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean update_other_load_avgs(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_pages_handler(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_prog_stats(Ptr<BpfDefinitions.bpf_prog> prog, @Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int update_rt_rq_load_avg(@Unsigned long now, Ptr<runtime.rq> rq2, int running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean update_stack_state(Ptr<misc.unwind_state> state2, Ptr<@Unsigned Long> next_bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean update_trip_devices(Ptr<AcpiDefinitions.acpi_thermal> tz, Ptr<AcpiDefinitions.acpi_thermal_trip> acpi_trip, int index2, boolean compare) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void update_wall_time() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct update_classid_context")
    @NotUsableInJava
    public static class update_classid_context
    extends Struct {
        public @Unsigned int classid;
        public @Unsigned int batch;
    }

    @Type(noCCodeGeneration=true, cType="struct update_util_data")
    @NotUsableInJava
    public static class update_util_data
    extends Struct {
        public Ptr<?> func;
    }

    @Type(noCCodeGeneration=true, cType="struct { void *capsule_header_array; long unsigned int capsule_count; long long unsigned int sg_list; }")
    @NotUsableInJava
    public static class update_capsule_of_u_of_xenpf_efi_runtime_call
    extends Struct {
        public @OriginalName(value="__guest_handle_void") Ptr<?> capsule_header_array;
        public @Unsigned @OriginalName(value="xen_ulong_t") long capsule_count;
        public @Unsigned @OriginalName(value="uint64_t") long sg_list;
    }
}

