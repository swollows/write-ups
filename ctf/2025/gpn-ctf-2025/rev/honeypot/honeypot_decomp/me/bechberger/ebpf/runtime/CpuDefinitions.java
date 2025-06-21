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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CeaDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.CpuhpDefinitions;
import me.bechberger.ebpf.runtime.DebugDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.PolicyDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UpdateDefinitions;
import me.bechberger.ebpf.runtime.X86Definitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CpuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __cpu_down_maps_locked(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cpu_hotplug_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _cpu_down(@Unsigned int cpu2, int tasks_frozen, CpuhpDefinitions.cpuhp_state target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _cpu_up(@Unsigned int cpu2, int tasks_frozen, CpuhpDefinitions.cpuhp_state target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_bugs_smt_update() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_clock_sample((const int)$arg1, $arg2)")
    public static @Unsigned long cpu_clock_sample(@OriginalName(value="clockid_t") int clkid, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_clock_sample_group((const int)$arg1, $arg2, $arg3)")
    public static @Unsigned long cpu_clock_sample_group(@OriginalName(value="clockid_t") int clkid, Ptr<TaskDefinitions.task_struct> p, boolean start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_device_down(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_device_up(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_down_maps_locked(@Unsigned int cpu2, CpuhpDefinitions.cpuhp_state target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_emergency_stop_pt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_hotplug_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_hotplug_disable_offlining() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_hotplug_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_hotplug_pm_callback(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_hotplug_pm_sync_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_is_lazy(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_maps_update_begin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_maps_update_done() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_mitigations_auto_nosmt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_mitigations_off() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_parse_topology_ext(Ptr<misc.topo_scan> tscan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_partial_show(Ptr<KmemDefinitions.kmem_cache> s2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_partial_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long cpu_partial_store(Ptr<KmemDefinitions.kmem_cache> s2, String buf, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_select_mitigations() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_gds(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_itlb_multihit(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_l1tf(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_mds(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_meltdown(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_mmio_stale_data(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_reg_file_data_sampling(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_retbleed(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_spec_rstack_overflow(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_spec_store_bypass(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_spectre_v1(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_spectre_v2(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_srbds(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_tsx_async_abort(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_slabs_show(Ptr<KmemDefinitions.kmem_cache> s2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_smt_disable(boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)cpu_smt_mask($arg1))")
    public static Ptr<runtime.cpumask> cpu_smt_mask(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_smt_possible() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_smt_set_num_threads(@Unsigned int num_threads, @Unsigned int max_threads) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_timer_fire(Ptr<KDefinitions.k_itimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_up(@Unsigned int cpu2, CpuhpDefinitions.cpuhp_state target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpu_util(int cpu2, Ptr<TaskDefinitions.task_struct> p, int dst_cpu, int boost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpu_util_cfs(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpu_util_cfs_boost(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_attach_domain(Ptr<SchedDefinitions.sched_domain> sd, Ptr<misc.root_domain> rd, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_byteorder_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_cache_has_invalidate_memregion() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cache_invalidate_memregion(int res_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_cache_sysfs_exit(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cluster_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)cpu_clustergroup_mask($arg1))")
    public static Ptr<runtime.cpumask> cpu_clustergroup_mask(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_core_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)cpu_coregroup_mask($arg1))")
    public static Ptr<runtime.cpumask> cpu_coregroup_mask(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)cpu_cpu_mask($arg1))")
    public static Ptr<runtime.cpumask> cpu_cpu_mask(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_detect_tlb_hygon(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_disable_common() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_init_fred_exceptions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_init_fred_rsps() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_init_udelay(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_is_self(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpu_map_shared_cache(boolean online, @Unsigned int cpu2, Ptr<Ptr< @OriginalName(value="cpumask_t") runtime.cpumask>> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_numa_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_parse_topology_amd(Ptr<misc.topo_scan> tscan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_rmap_add(Ptr<cpu_rmap> rmap, Ptr<?> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_rmap_copy_neigh($arg1, $arg2, (const struct cpumask*)$arg3, $arg4)")
    public static boolean cpu_rmap_copy_neigh(Ptr<cpu_rmap> rmap, @Unsigned int cpu2, Ptr<runtime.cpumask> mask, @Unsigned short dist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_rmap_put(Ptr<cpu_rmap> rmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_rmap_update($arg1, $arg2, (const struct cpumask*)$arg3)")
    public static int cpu_rmap_update(Ptr<cpu_rmap> rmap, @Unsigned short index2, Ptr<runtime.cpumask> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_smt_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long cpu_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_topology_fixup_amd(Ptr<misc.topo_scan> tscan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_cpu_map_entry> __cpu_map_entry_alloc(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_cpumap_val> value, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cpu_map_entry_free(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cpu_map_flush(Ptr<ListDefinitions.list_head> flush_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_bringup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_bringup_and_idle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpu_cfs_burst_read_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cfs_burst_write_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cftype2, @Unsigned long cfs_burst_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cfs_local_stat_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpu_cfs_period_read_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cfs_period_write_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cftype2, @Unsigned long cfs_period_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cpu_cfs_quota_read_s64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cfs_quota_write_s64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cftype2, long cfs_quota_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cfs_stat_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_cgroup_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cgroup_can_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_cgroup_cancel_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> cpu_cgroup_css_alloc(Ptr<CgroupDefinitions.cgroup_subsys_state> parent_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_cgroup_css_free(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_cgroup_css_offline(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_cgroup_css_online(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_cgroup_css_released(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> cpu_curr_snapshot(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_detect_tlb_amd(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_extra_stat_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpu_from_evtchn(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cpu_idle_read_s64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_idle_write_s64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft, long idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_initialize_context(@Unsigned int cpu2, Ptr<TaskDefinitions.task_struct> idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_latency_qos_add_request(Ptr<PmDefinitions.pm_qos_request> req2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_latency_qos_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_latency_qos_limit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_latency_qos_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_latency_qos_read(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> f_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_latency_qos_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_latency_qos_remove_request(Ptr<PmDefinitions.pm_qos_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_latency_qos_request_active(Ptr<PmDefinitions.pm_qos_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_latency_qos_update_request(Ptr<PmDefinitions.pm_qos_request> req2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_latency_qos_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long cpu_latency_qos_write(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> f_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> cpu_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_map_bpf_prog_run(Ptr<BpfDefinitions.bpf_cpu_map_entry> rcpu, Ptr<Ptr<?>> frames, int xdp_n, Ptr<XdpDefinitions.xdp_cpumap_stats> stats, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_map_bpf_prog_run_skb(Ptr<BpfDefinitions.bpf_cpu_map_entry> rcpu, Ptr<ListDefinitions.list_head> listp, Ptr<XdpDefinitions.xdp_cpumap_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_map_bpf_prog_run_xdp(Ptr<BpfDefinitions.bpf_cpu_map_entry> rcpu, Ptr<Ptr<?>> frames, int n, Ptr<XdpDefinitions.xdp_cpumap_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cpu_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_map_enqueue(Ptr<BpfDefinitions.bpf_cpu_map_entry> rcpu, Ptr<XdpDefinitions.xdp_frame> xdpf, Ptr<NetDefinitions.net_device> dev_rx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_map_generic_redirect(Ptr<BpfDefinitions.bpf_cpu_map_entry> rcpu, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_map_kthread_run(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cpu_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long cpu_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cpu_map_redirect(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned long index2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cpu_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_mark_primary_thread(@Unsigned int cpu2, @Unsigned int apicid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_max_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_max_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpu_shares_read_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_shares_write_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cftype2, @Unsigned long shareval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_uclamp_max_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_uclamp_max_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_uclamp_min_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_uclamp_min_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_util_update_eff(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_vm_stats_fold(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cpu_weight_nice_read_s64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_weight_nice_write_s64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft, long nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpu_weight_read_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_weight_write_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft, @Unsigned long cgrp_weight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_acquire_stub(int cpu2, Ptr<ScxDefinitions.scx_cpu_acquire_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_clock_event_add(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_clock_event_del(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_clock_event_init(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_clock_event_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_clock_event_start(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_clock_event_stop(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_debug_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_debug_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_detect(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_detect_cache_sizes(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_device_create($arg1, $arg2, (const struct attribute_group**)$arg3, (const u8*)$arg4, $arg5_)")
    public static Ptr<runtime.device> cpu_device_create(Ptr<runtime.device> parent, Ptr<?> drvdata, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_emergency_disable_virtualization() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_emergency_register_virt_callback(Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_emergency_unregister_virt_callback(Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpu_freq_read_amd(Ptr<AcpiDefinitions.acpi_pct_register> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpu_freq_read_intel(Ptr<AcpiDefinitions.acpi_pct_register> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpu_freq_read_io(Ptr<AcpiDefinitions.acpi_pct_register> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_freq_write_amd(Ptr<AcpiDefinitions.acpi_pct_register> not_used, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_freq_write_intel(Ptr<AcpiDefinitions.acpi_pct_register> not_used, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_freq_write_io(Ptr<AcpiDefinitions.acpi_pct_register> reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_has_xfeatures($arg1, (const u8**)$arg2)")
    public static int cpu_has_xfeatures(@Unsigned long xfeatures_needed, Ptr<String> feature_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_idle_poll() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_idle_poll_ctrl(boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_in_idle(@Unsigned long pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_init_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_init_exception_handling(boolean boot_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_init_replace_early_idt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_init_topology(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_is_hotpluggable(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpu_khz_from_msr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_matches((const struct x86_cpu_id*)$arg1, $arg2)")
    public static boolean cpu_matches(Ptr<X86Definitions.x86_cpu_id> table, @Unsigned long which) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_offline_stub(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_online_stub(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_parse_early_param() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_parse_topology(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_power_down_ok(Ptr<DevDefinitions.dev_pm_domain> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_release_stub(int cpu2, Ptr<ScxDefinitions.scx_cpu_release_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_set_bug_bits(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpu_show_not_affected(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_startup_entry(CpuhpDefinitions.cpuhp_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_stat_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_stop_create(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_stop_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_stop_init_done(Ptr<cpu_stop_done> done, @Unsigned int nr_todo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_stop_park(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_stop_queue_two_works(int cpu1, Ptr<cpu_stop_work> work1, int cpu2, Ptr<cpu_stop_work> work2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpu_stop_queue_work(@Unsigned int cpu2, Ptr<cpu_stop_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_stop_should_run(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpu_stopper_thread(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_subsys_match($arg1, (const struct device_driver*)$arg2)")
    public static int cpu_subsys_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_subsys_offline(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpu_subsys_online(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpu_uevent((const struct device*)$arg1, $arg2)")
    public static int cpu_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int index; short unsigned int dist; }")
    @NotUsableInJava
    public static class AnonymousType1682031750C65
    extends Struct {
        public @Unsigned short index;
        public @Unsigned short dist;
    }

    @Type(noCCodeGeneration=true, cType="enum cpu_led_event")
    public static enum cpu_led_event implements Enum<cpu_led_event>,
    TypedEnum<cpu_led_event, Integer>
    {
        CPU_LED_IDLE_START,
        CPU_LED_IDLE_END,
        CPU_LED_START,
        CPU_LED_STOP,
        CPU_LED_HALTED;

    }

    @Type(noCCodeGeneration=true, cType="struct cpu_user_regs")
    @NotUsableInJava
    public static class cpu_user_regs
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long r15;
        public @Unsigned @OriginalName(value="uint64_t") long r14;
        public @Unsigned @OriginalName(value="uint64_t") long r13;
        public @Unsigned @OriginalName(value="uint64_t") long r12;
        @InlineUnion(value=89552)
        public @InlineUnion(value=89552) @Unsigned @OriginalName(value="uint64_t") long rbp;
        @InlineUnion(value=89552)
        public @InlineUnion(value=89552) @Unsigned @OriginalName(value="uint64_t") long ebp;
        @InlineUnion(value=89552)
        public @InlineUnion(value=89552) @Unsigned @OriginalName(value="uint32_t") int _ebp;
        @InlineUnion(value=89553)
        public @InlineUnion(value=89553) @Unsigned @OriginalName(value="uint64_t") long rbx;
        @InlineUnion(value=89553)
        public @InlineUnion(value=89553) @Unsigned @OriginalName(value="uint64_t") long ebx;
        @InlineUnion(value=89553)
        public @InlineUnion(value=89553) @Unsigned @OriginalName(value="uint32_t") int _ebx;
        public @Unsigned @OriginalName(value="uint64_t") long r11;
        public @Unsigned @OriginalName(value="uint64_t") long r10;
        public @Unsigned @OriginalName(value="uint64_t") long r9;
        public @Unsigned @OriginalName(value="uint64_t") long r8;
        @InlineUnion(value=89554)
        public @InlineUnion(value=89554) @Unsigned @OriginalName(value="uint64_t") long rax;
        @InlineUnion(value=89554)
        public @InlineUnion(value=89554) @Unsigned @OriginalName(value="uint64_t") long eax;
        @InlineUnion(value=89554)
        public @InlineUnion(value=89554) @Unsigned @OriginalName(value="uint32_t") int _eax;
        @InlineUnion(value=89555)
        public @InlineUnion(value=89555) @Unsigned @OriginalName(value="uint64_t") long rcx;
        @InlineUnion(value=89555)
        public @InlineUnion(value=89555) @Unsigned @OriginalName(value="uint64_t") long ecx;
        @InlineUnion(value=89555)
        public @InlineUnion(value=89555) @Unsigned @OriginalName(value="uint32_t") int _ecx;
        @InlineUnion(value=89556)
        public @InlineUnion(value=89556) @Unsigned @OriginalName(value="uint64_t") long rdx;
        @InlineUnion(value=89556)
        public @InlineUnion(value=89556) @Unsigned @OriginalName(value="uint64_t") long edx;
        @InlineUnion(value=89556)
        public @InlineUnion(value=89556) @Unsigned @OriginalName(value="uint32_t") int _edx;
        @InlineUnion(value=89557)
        public @InlineUnion(value=89557) @Unsigned @OriginalName(value="uint64_t") long rsi;
        @InlineUnion(value=89557)
        public @InlineUnion(value=89557) @Unsigned @OriginalName(value="uint64_t") long esi;
        @InlineUnion(value=89557)
        public @InlineUnion(value=89557) @Unsigned @OriginalName(value="uint32_t") int _esi;
        @InlineUnion(value=89558)
        public @InlineUnion(value=89558) @Unsigned @OriginalName(value="uint64_t") long rdi;
        @InlineUnion(value=89558)
        public @InlineUnion(value=89558) @Unsigned @OriginalName(value="uint64_t") long edi;
        @InlineUnion(value=89558)
        public @InlineUnion(value=89558) @Unsigned @OriginalName(value="uint32_t") int _edi;
        public @Unsigned @OriginalName(value="uint32_t") int error_code;
        public @Unsigned @OriginalName(value="uint32_t") int entry_vector;
        @InlineUnion(value=89559)
        public @InlineUnion(value=89559) @Unsigned @OriginalName(value="uint64_t") long rip;
        @InlineUnion(value=89559)
        public @InlineUnion(value=89559) @Unsigned @OriginalName(value="uint64_t") long eip;
        @InlineUnion(value=89559)
        public @InlineUnion(value=89559) @Unsigned @OriginalName(value="uint32_t") int _eip;
        public @Unsigned @OriginalName(value="uint16_t") short cs;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=1) [] _pad0;
        public @OriginalName(value="uint8_t") char saved_upcall_mask;
        public @OriginalName(value="uint8_t") char @Size(value=3) [] _pad1;
        @InlineUnion(value=89560)
        public @InlineUnion(value=89560) @Unsigned @OriginalName(value="uint64_t") long rflags;
        @InlineUnion(value=89560)
        public @InlineUnion(value=89560) @Unsigned @OriginalName(value="uint64_t") long eflags;
        @InlineUnion(value=89560)
        public @InlineUnion(value=89560) @Unsigned @OriginalName(value="uint32_t") int _eflags;
        @InlineUnion(value=89561)
        public @InlineUnion(value=89561) @Unsigned @OriginalName(value="uint64_t") long rsp;
        @InlineUnion(value=89561)
        public @InlineUnion(value=89561) @Unsigned @OriginalName(value="uint64_t") long esp;
        @InlineUnion(value=89561)
        public @InlineUnion(value=89561) @Unsigned @OriginalName(value="uint32_t") int _esp;
        public @Unsigned @OriginalName(value="uint16_t") short ss;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=3) [] _pad2;
        public @Unsigned @OriginalName(value="uint16_t") short es;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=3) [] _pad3;
        public @Unsigned @OriginalName(value="uint16_t") short ds;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=3) [] _pad4;
        public @Unsigned @OriginalName(value="uint16_t") short fs;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=3) [] _pad5;
        public @Unsigned @OriginalName(value="uint16_t") short gs;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=3) [] _pad6;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_model")
    @NotUsableInJava
    public static class cpu_model
    extends Struct {
        public Ptr<cpu_id> cpu_id;
        public String model_name;
        public @Unsigned int max_freq;
        public Ptr<CpufreqDefinitions.cpufreq_frequency_table> op_points;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_id")
    @NotUsableInJava
    public static class cpu_id
    extends Struct {
        public char x86;
        public char x86_model;
        public char x86_stepping;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_rmap")
    @NotUsableInJava
    public static class cpu_rmap
    extends Struct {
        public runtime.kref refcount;
        public @Unsigned short size;
        public Ptr<Ptr<?>> obj;
        public AnonymousType1682031750C65 @Size(value=0) [] near;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_dbs_info")
    @NotUsableInJava
    public static class cpu_dbs_info
    extends Struct {
        public @Unsigned long prev_cpu_idle;
        public @Unsigned long prev_update_time;
        public @Unsigned long prev_cpu_nice;
        public @Unsigned int prev_load;
        public UpdateDefinitions.update_util_data update_util;
        public Ptr<PolicyDefinitions.policy_dbs_info> policy_dbs;
    }

    @Type(noCCodeGeneration=true, cType="enum cpu_mitigations")
    public static enum cpu_mitigations implements Enum<cpu_mitigations>,
    TypedEnum<cpu_mitigations, Integer>
    {
        CPU_MITIGATIONS_OFF,
        CPU_MITIGATIONS_AUTO,
        CPU_MITIGATIONS_AUTO_NOSMT;

    }

    @Type(noCCodeGeneration=true, cType="struct cpu_down_work")
    @NotUsableInJava
    public static class cpu_down_work
    extends Struct {
        public @Unsigned int cpu;
        public CpuhpDefinitions.cpuhp_state target;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_perf_ibs")
    @NotUsableInJava
    public static class cpu_perf_ibs
    extends Struct {
        public Ptr<PerfDefinitions.perf_event> event;
        public @Unsigned long @Size(value=1) [] state;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_attr")
    @NotUsableInJava
    public static class cpu_attr
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public Ptr<runtime.cpumask> map;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_vfs_cap_data")
    @NotUsableInJava
    public static class cpu_vfs_cap_data
    extends Struct {
        public @Unsigned int magic_etc;
        public misc.kuid_t rootid;
        public KernelDefinitions.kernel_cap_t permitted;
        public KernelDefinitions.kernel_cap_t inheritable;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_cacheinfo")
    @NotUsableInJava
    public static class cpu_cacheinfo
    extends Struct {
        public Ptr<runtime.cacheinfo> info_list;
        public @Unsigned int per_cpu_data_slice_size;
        public @Unsigned int num_levels;
        public @Unsigned int num_leaves;
        public boolean cpu_map_populated;
        public boolean early_ci_levels;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_fbatches")
    @NotUsableInJava
    public static class cpu_fbatches
    extends Struct {
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p lock;
        public FolioDefinitions.folio_batch lru_add;
        public FolioDefinitions.folio_batch lru_deactivate_file;
        public FolioDefinitions.folio_batch lru_deactivate;
        public FolioDefinitions.folio_batch lru_lazyfree;
        public FolioDefinitions.folio_batch lru_activate;
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p lock_irq;
        public FolioDefinitions.folio_batch lru_move_tail;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_stopper")
    @NotUsableInJava
    public static class cpu_stopper
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> thread;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public boolean enabled;
        public ListDefinitions.list_head works;
        public cpu_stop_work stop_work;
        public @Unsigned long caller;
        public @OriginalName(value="cpu_stop_fn_t") Ptr<?> fn;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_stop_done")
    @NotUsableInJava
    public static class cpu_stop_done
    extends Struct {
        public AtomicDefinitions.atomic_t nr_todo;
        public int ret;
        public runtime.completion completion;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_timer")
    @NotUsableInJava
    public static class cpu_timer
    extends Struct {
        public misc.timerqueue_node node;
        public Ptr<misc.timerqueue_head> head;
        public Ptr<runtime.pid> pid;
        public ListDefinitions.list_head elist;
        public int firing;
        public Ptr<TaskDefinitions.task_struct> handling;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_stop_work")
    @NotUsableInJava
    public static class cpu_stop_work
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="cpu_stop_fn_t") Ptr<?> fn;
        public @Unsigned long caller;
        public Ptr<?> arg;
        public Ptr<cpu_stop_done> done;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_signature")
    @NotUsableInJava
    public static class cpu_signature
    extends Struct {
        public @Unsigned int sig;
        public @Unsigned int pf;
        public @Unsigned int rev;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_dev")
    @NotUsableInJava
    public static class cpu_dev
    extends Struct {
        public String c_vendor;
        public String @Size(value=2) [] c_ident;
        public Ptr<?> c_early_init;
        public Ptr<?> c_bsp_init;
        public Ptr<?> c_init;
        public Ptr<?> c_identify;
        public Ptr<?> c_detect_tlb;
        public int c_x86_vendor;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_entry_area")
    @NotUsableInJava
    public static class cpu_entry_area
    extends Struct {
        public char @Size(value=4096) [] gdt;
        public misc.entry_stack_page entry_stack_page;
        public misc.tss_struct tss;
        public CeaDefinitions.cea_exception_stacks estacks;
        public DebugDefinitions.debug_store cpu_debug_store;
        public DebugDefinitions.debug_store_buffers cpu_debug_buffers;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_hw_events")
    @NotUsableInJava
    public static class cpu_hw_events
    extends Struct {
        public Ptr<PerfDefinitions.perf_event> @Size(value=64) [] events;
        public @Unsigned long @Size(value=1) [] active_mask;
        public @Unsigned long @Size(value=1) [] dirty;
        public int enabled;
        public int n_events;
        public int n_added;
        public int n_txn;
        public int n_txn_pair;
        public int n_txn_metric;
        public int @Size(value=64) [] assign;
        public @Unsigned long @Size(value=64) [] tags;
        public Ptr<PerfDefinitions.perf_event> @Size(value=64) [] event_list;
        public Ptr<EventDefinitions.event_constraint> @Size(value=64) [] event_constraint;
        public int n_excl;
        public @Unsigned int txn_flags;
        public int is_fake;
        public Ptr<DebugDefinitions.debug_store> ds;
        public Ptr<?> ds_pebs_vaddr;
        public Ptr<?> ds_bts_vaddr;
        public @Unsigned long pebs_enabled;
        public int n_pebs;
        public int n_large_pebs;
        public int n_pebs_via_pt;
        public int pebs_output;
        public @Unsigned long pebs_data_cfg;
        public @Unsigned long active_pebs_data_cfg;
        public int pebs_record_size;
        public @Unsigned long fixed_ctrl_val;
        public @Unsigned long active_fixed_ctrl_val;
        public int lbr_users;
        public int lbr_pebs_users;
        public PerfDefinitions.perf_branch_stack lbr_stack;
        public PerfDefinitions.perf_branch_entry @Size(value=32) [] lbr_entries;
        public @Unsigned long @Size(value=32) [] lbr_counters;
        @InlineUnion(value=3525)
        public @InlineUnion(value=3525) Ptr<misc.er_account> lbr_sel;
        @InlineUnion(value=3525)
        public @InlineUnion(value=3525) Ptr<misc.er_account> lbr_ctl;
        public @Unsigned long br_sel;
        public Ptr<?> last_task_ctx;
        public int last_log_id;
        public int lbr_select;
        public Ptr<?> lbr_xsave;
        public @Unsigned long intel_ctrl_guest_mask;
        public @Unsigned long intel_ctrl_host_mask;
        public PerfDefinitions.perf_guest_switch_msr @Size(value=64) [] guest_switch_msrs;
        public @Unsigned long intel_cp_status;
        public Ptr<IntelDefinitions.intel_shared_regs> shared_regs;
        public Ptr<EventDefinitions.event_constraint> constraint_list;
        public Ptr<IntelDefinitions.intel_excl_cntrs> excl_cntrs;
        public int excl_thread_id;
        public @Unsigned long tfa_shadow;
        public int n_metric;
        public Ptr<AmdDefinitions.amd_nb> amd_nb;
        public int brs_active;
        public @Unsigned long perf_ctr_virt_mask;
        public int n_pair;
        public Ptr<?> @Size(value=2) [] kfree_on_online;
        public Ptr<runtime.pmu> pmu;
    }

    @Type(noCCodeGeneration=true, cType="enum cpu_usage_stat")
    public static enum cpu_usage_stat implements Enum<cpu_usage_stat>,
    TypedEnum<cpu_usage_stat, Integer>
    {
        CPUTIME_USER,
        CPUTIME_NICE,
        CPUTIME_SYSTEM,
        CPUTIME_SOFTIRQ,
        CPUTIME_IRQ,
        CPUTIME_IDLE,
        CPUTIME_IOWAIT,
        CPUTIME_STEAL,
        CPUTIME_GUEST,
        CPUTIME_GUEST_NICE,
        CPUTIME_FORCEIDLE,
        NR_STATS;

    }

    @Type(noCCodeGeneration=true, cType="enum cpu_idle_type")
    public static enum cpu_idle_type implements Enum<cpu_idle_type>,
    TypedEnum<cpu_idle_type, Integer>
    {
        __CPU_NOT_IDLE,
        CPU_IDLE,
        CPU_NEWLY_IDLE,
        CPU_MAX_IDLE_TYPES;

    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int cpu; unsigned int reserved; }")
    @NotUsableInJava
    public static class cpu_entry_of_perf_sample_data
    extends Struct {
        public @Unsigned int cpu;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct cpu_itimer")
    @NotUsableInJava
    public static class cpu_itimer
    extends Struct {
        public @Unsigned long expires;
        public @Unsigned long incr;
    }
}

