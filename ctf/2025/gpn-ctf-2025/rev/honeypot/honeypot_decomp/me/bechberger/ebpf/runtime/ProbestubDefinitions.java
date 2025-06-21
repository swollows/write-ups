/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CacheDefinitions;
import me.bechberger.ebpf.runtime.CallDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.CperDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.CrosDefinitions;
import me.bechberger.ebpf.runtime.DbcDefinitions;
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DevfreqDefinitions;
import me.bechberger.ebpf.runtime.DevlinkDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FlushDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.HandshakeDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IccDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IocDefinitions;
import me.bechberger.ebpf.runtime.IomapDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.MapleDefinitions;
import me.bechberger.ebpf.runtime.MctpDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmcDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NeighDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NumaDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PcieDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.PwmDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.ReclaimDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RpmDefinitions;
import me.bechberger.ebpf.runtime.RtcDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SelinuxDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SyncDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TaskletDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TmigrDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WatchdogDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XenDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class ProbestubDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ack_update_msk(Ptr<?> __data, @Unsigned long data_ack, @Unsigned long old_snd_una, @Unsigned long new_snd_una, @Unsigned long new_wnd_end, @Unsigned long msk_wnd_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_alloc_vmap_area(Ptr<?> __data, @Unsigned long addr2, @Unsigned long size, @Unsigned long align, @Unsigned long vstart, @Unsigned long vend, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_amd_pstate_perf(Ptr<?> __data, @Unsigned long min_perf, @Unsigned long target_perf, @Unsigned long capacity, @Unsigned long freq, @Unsigned long mperf, @Unsigned long aperf, @Unsigned long tsc, @Unsigned int cpu_id2, boolean changed, boolean fast_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_bpf_test_finish(Ptr<?> __data, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_bpf_trigger_tp(Ptr<?> __data, int nonce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_bpf_xdp_link_attach_failed($arg1, (const u8*)$arg2)")
    public static void __probestub_bpf_xdp_link_attach_failed(Ptr<?> __data, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_contention_begin(Ptr<?> __data, Ptr<?> lock, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_contention_end(Ptr<?> __data, Ptr<?> lock, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cpuhp_enter($arg1, $arg2, $arg3, $arg4, (int (*)(unsigned int))$arg5)")
    public static void __probestub_cpuhp_enter(Ptr<?> __data, @Unsigned int cpu2, int target, int idx, Ptr<?> fun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cpuhp_exit(Ptr<?> __data, @Unsigned int cpu2, int state2, int idx, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cpuhp_multi_enter($arg1, $arg2, $arg3, $arg4, (int (*)(unsigned int, struct hlist_node*))$arg5, $arg6)")
    public static void __probestub_cpuhp_multi_enter(Ptr<?> __data, @Unsigned int cpu2, int target, int idx, Ptr<?> fun, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_drm_vblank_event(Ptr<?> __data, int crtc, @Unsigned int seq, @OriginalName(value="ktime_t") long time, boolean high_prec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_drm_vblank_event_delivered(Ptr<?> __data, Ptr<DrmDefinitions.drm_file> file2, int crtc, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_drm_vblank_event_queued(Ptr<?> __data, Ptr<DrmDefinitions.drm_file> file2, int crtc, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_free_vmap_area_noflush(Ptr<?> __data, @Unsigned long va_start, @Unsigned long nr_lazy, @Unsigned long nr_lazy_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_get_mapping_status(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_ext> mpext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_hwmon_attr_show($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_hwmon_attr_show(Ptr<?> __data, int index2, String attr_name, long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_hwmon_attr_show_string($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void __probestub_hwmon_attr_show_string(Ptr<?> __data, int index2, String attr_name, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_hwmon_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_hwmon_attr_store(Ptr<?> __data, int index2, String attr_name, long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_hyperv_mmu_flush_tlb_multi($arg1, (const struct cpumask*)$arg2, (const struct flush_tlb_info*)$arg3)")
    public static void __probestub_hyperv_mmu_flush_tlb_multi(Ptr<?> __data, Ptr<runtime.cpumask> cpus, Ptr<FlushDefinitions.flush_tlb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hyperv_nested_flush_guest_mapping(Ptr<?> __data, @Unsigned long as, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hyperv_nested_flush_guest_mapping_range(Ptr<?> __data, @Unsigned long as, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_hyperv_send_ipi_mask($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static void __probestub_hyperv_send_ipi_mask(Ptr<?> __data, Ptr<runtime.cpumask> cpus, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hyperv_send_ipi_one(Ptr<?> __data, int cpu2, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_icc_set_bw(Ptr<?> __data, Ptr<IccDefinitions.icc_path> p, Ptr<IccDefinitions.icc_node> n, int i, @Unsigned int avg_bw, @Unsigned int peak_bw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_icc_set_bw_end(Ptr<?> __data, Ptr<IccDefinitions.icc_path> p, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_initcall_finish(Ptr<?> __data, @OriginalName(value="initcall_t") Ptr<?> func, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_initcall_level($arg1, (const u8*)$arg2)")
    public static void __probestub_initcall_level(Ptr<?> __data, String level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_initcall_start(Ptr<?> __data, @OriginalName(value="initcall_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_irq_noise($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __probestub_irq_noise(Ptr<?> __data, int vector, String desc, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mdio_access(Ptr<?> __data, Ptr<misc.mii_bus> bus, char read2, char addr2, @Unsigned int regnum, @Unsigned short val, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mem_connect($arg1, (const struct xdp_mem_allocator*)$arg2, (const struct xdp_rxq_info*)$arg3)")
    public static void __probestub_mem_connect(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_allocator> xa, Ptr<XdpDefinitions.xdp_rxq_info> rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mem_disconnect($arg1, (const struct xdp_mem_allocator*)$arg2)")
    public static void __probestub_mem_disconnect(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_allocator> xa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mem_return_failed($arg1, (const struct xdp_mem_info*)$arg2, (const struct page*)$arg3)")
    public static void __probestub_mem_return_failed(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_info> mem, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_module_free(Ptr<?> __data, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_module_get(Ptr<?> __data, Ptr<runtime.module> mod, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_module_load(Ptr<?> __data, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_module_put(Ptr<?> __data, Ptr<runtime.module> mod, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_module_request(Ptr<?> __data, String name, boolean wait, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mon_llc_occupancy_limbo(Ptr<?> __data, @Unsigned int ctrl_hw_id, @Unsigned int mon_hw_id, int domain_id, @Unsigned long llc_occupancy_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mptcp_sendmsg_frag(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_ext> mpext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mptcp_subflow_get_send(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_subflow_context> subflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_nmi_handler(Ptr<?> __data, Ptr<?> handler, long delta_ns, int handled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_nmi_noise(Ptr<?> __data, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pseudo_lock_l2(Ptr<?> __data, @Unsigned long l2_hits, @Unsigned long l2_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pseudo_lock_l3(Ptr<?> __data, @Unsigned long l3_hits, @Unsigned long l3_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pseudo_lock_mem_latency(Ptr<?> __data, @Unsigned int latency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_purge_vmap_area_lazy(Ptr<?> __data, @Unsigned long start, @Unsigned long end, @Unsigned int npurged) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rdpmc(Ptr<?> __data, @Unsigned int msr2, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_read_msr(Ptr<?> __data, @Unsigned int msr2, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rseq_ip_fixup(Ptr<?> __data, @Unsigned long regs_ip, @Unsigned long start_ip, @Unsigned long post_commit_offset, @Unsigned long abort_ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rseq_update(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sample_threshold(Ptr<?> __data, @Unsigned long start, @Unsigned long duration, @Unsigned long interference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_selinux_audited($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static void __probestub_selinux_audited(Ptr<?> __data, Ptr<SelinuxDefinitions.selinux_audit_data> sad, String scontext, String tcontext, String tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_smbus_read($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void __probestub_smbus_read(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_smbus_reply($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union i2c_smbus_data*)$arg8, $arg9)")
    public static void __probestub_smbus_reply(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<I2cDefinitions.i2c_smbus_data> data, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_smbus_result($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_smbus_result(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_smbus_write($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union i2c_smbus_data*)$arg8)")
    public static void __probestub_smbus_write(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<I2cDefinitions.i2c_smbus_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_softirq_noise(Ptr<?> __data, int vector, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_subflow_check_data_avail(Ptr<?> __data, char status, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_swiotlb_bounced(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dev_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_power_actor(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int actor_id, @Unsigned int req_power, @Unsigned int granted_power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_power_allocator(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, @Unsigned int total_req_power, @Unsigned int total_granted_power, int num_actors, @Unsigned int power_range, @Unsigned int max_allocatable_power, int current_temp, int delta_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_power_allocator_pid(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int err, int err_integral, long p, long i, long d, int output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thread_noise(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_write_msr(Ptr<?> __data, @Unsigned int msr2, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xdp_bulk_tx($arg1, (const struct net_device*)$arg2, $arg3, $arg4, $arg5)")
    public static void __probestub_xdp_bulk_tx(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, int sent, int drops, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xdp_cpumap_enqueue(Ptr<?> __data, int map_id, @Unsigned int processed, @Unsigned int drops, int to_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xdp_cpumap_kthread(Ptr<?> __data, int map_id, @Unsigned int processed, @Unsigned int drops, int sched, Ptr<XdpDefinitions.xdp_cpumap_stats> xdp_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xdp_devmap_xmit($arg1, (const struct net_device*)$arg2, (const struct net_device*)$arg3, $arg4, $arg5, $arg6)")
    public static void __probestub_xdp_devmap_xmit(Ptr<?> __data, Ptr<NetDefinitions.net_device> from_dev, Ptr<NetDefinitions.net_device> to_dev, int sent, int drops, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xdp_exception($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, $arg4)")
    public static void __probestub_xdp_exception(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, @Unsigned int act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xdp_redirect($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_xdp_redirect(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, Ptr<?> tgt, int err, BpfDefinitions.bpf_map_type map_type2, @Unsigned int map_id, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xdp_redirect_err($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_xdp_redirect_err(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, Ptr<?> tgt, int err, BpfDefinitions.bpf_map_type map_type2, @Unsigned int map_id, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xdp_redirect_map($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_xdp_redirect_map(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, Ptr<?> tgt, int err, BpfDefinitions.bpf_map_type map_type2, @Unsigned int map_id, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xdp_redirect_map_err($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_xdp_redirect_map_err(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, Ptr<?> tgt, int err, BpfDefinitions.bpf_map_type map_type2, @Unsigned int map_id, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_add_device_to_group(Ptr<?> __data, int group_id, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_aer_event($arg1, (const u8*)$arg2, (const unsigned int)$arg3, (const u8)$arg4, (const u8)$arg5, $arg6)")
    public static void __probestub_aer_event(Ptr<?> __data, String dev_name, @Unsigned int status, char severity2, char tlp_header_valid, Ptr<PcieDefinitions.pcie_tlp_log> tlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_arm_event($arg1, (const struct cper_sec_proc_arm*)$arg2)")
    public static void __probestub_arm_event(Ptr<?> __data, Ptr<CperDefinitions.cper_sec_proc_arm> proc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_attach_device_to_domain(Ptr<?> __data, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cache_tag_assign(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cache_tag_flush_all(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cache_tag_flush_range(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag, @Unsigned long start, @Unsigned long end, @Unsigned long addr2, @Unsigned long pages, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cache_tag_flush_range_np(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag, @Unsigned long start, @Unsigned long end, @Unsigned long addr2, @Unsigned long pages, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cache_tag_unassign(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_call_function_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_call_function_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_call_function_single_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_call_function_single_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cdev_update(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_disable(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_disable_complete(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_enable(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_enable_complete(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_prepare(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_prepare_complete(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_rate_request_done(Ptr<?> __data, Ptr<ClkDefinitions.clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_rate_request_start(Ptr<?> __data, Ptr<ClkDefinitions.clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_duty_cycle(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_duty> duty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_duty_cycle_complete(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_duty> duty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_max_rate(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_min_rate(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_parent(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_parent_complete(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_phase(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, int phase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_phase_complete(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, int phase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_rate(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_rate_complete(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_set_rate_range(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long min, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_unprepare(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_clk_unprepare_complete(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_clock_disable($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_clock_disable(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_clock_enable($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_clock_enable(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_clock_set_rate($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_clock_set_rate(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_compact_retry(Ptr<?> __data, int order, misc.compact_priority priority, misc.compact_result result, int retries, int max_retries, boolean ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_console($arg1, (const u8*)$arg2, $arg3)")
    public static void __probestub_console(Ptr<?> __data, String text, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cpu_frequency(Ptr<?> __data, @Unsigned int frequency, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cpu_frequency_limits(Ptr<?> __data, Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cpu_idle(Ptr<?> __data, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cpu_idle_miss(Ptr<?> __data, @Unsigned int cpu_id2, @Unsigned int state2, boolean below) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_deferred_error_apic_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_deferred_error_apic_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_dev_pm_qos_add_request($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_dev_pm_qos_add_request(Ptr<?> __data, String name, DevDefinitions.dev_pm_qos_req_type type2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_dev_pm_qos_remove_request($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_dev_pm_qos_remove_request(Ptr<?> __data, String name, DevDefinitions.dev_pm_qos_req_type type2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_dev_pm_qos_update_request($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_dev_pm_qos_update_request(Ptr<?> __data, String name, DevDefinitions.dev_pm_qos_req_type type2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_device_pm_callback_end(Ptr<?> __data, Ptr<runtime.device> dev, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_device_pm_callback_start($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_device_pm_callback_start(Ptr<?> __data, Ptr<runtime.device> dev, String pm_ops, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_error_apic_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_error_apic_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_extlog_mem_event($arg1, $arg2, $arg3, (const struct {\n  u8 b[16];\n}*)$arg4, (const u8*)$arg5, $arg6)")
    public static void __probestub_extlog_mem_event(Ptr<?> __data, Ptr<CperDefinitions.cper_sec_mem_err> mem, @Unsigned int err_seq, Ptr<@OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_finish_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_guest_halt_poll_ns(Ptr<?> __data, boolean grow, @Unsigned int _new, @Unsigned int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hrtimer_cancel(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hrtimer_expire_entry(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, Ptr<@OriginalName(value="ktime_t") Long> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hrtimer_expire_exit(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hrtimer_init(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, @OriginalName(value="clockid_t") int clockid, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hrtimer_start(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_page_fault(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned long iova2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_work_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_work_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_itimer_expire(Ptr<?> __data, int which, Ptr<runtime.pid> pid2, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_itimer_state($arg1, $arg2, (const const struct itimerspec64*)$arg3, $arg4)")
    public static void __probestub_itimer_state(Ptr<?> __data, int which, Ptr<runtime.itimerspec64> value, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_local_timer_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_local_timer_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_map(Ptr<?> __data, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mark_victim(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, @Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mc_event($arg1, (const unsigned int)$arg2, (const u8*)$arg3, (const u8*)$arg4, (const int)$arg5, (const u8)$arg6, (const s8)$arg7, (const s8)$arg8, (const s8)$arg9, $arg10, (const u8)$arg11, $arg12, (const u8*)$arg13)")
    public static void __probestub_mc_event(Ptr<?> __data, @Unsigned int err_type, String error_msg, String label, int error_count, char mc_index, @OriginalName(value="s8") byte top_layer, @OriginalName(value="s8") byte mid_layer, @OriginalName(value="s8") byte low_layer, @Unsigned long address, char grain_bits, @Unsigned long syndrome, String driver_detail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mce_record(Ptr<?> __data, Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_memory_failure_event(Ptr<?> __data, @Unsigned long pfn, int type2, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_begin(Ptr<?> __data, Ptr<misc.compact_control> cc, @Unsigned long zone_start, @Unsigned long zone_end, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_defer_compaction(Ptr<?> __data, Ptr<runtime.zone> zone2, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_defer_reset(Ptr<?> __data, Ptr<runtime.zone> zone2, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_deferred(Ptr<?> __data, Ptr<runtime.zone> zone2, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_end(Ptr<?> __data, Ptr<misc.compact_control> cc, @Unsigned long zone_start, @Unsigned long zone_end, boolean sync2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_fast_isolate_freepages(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long nr_scanned, @Unsigned long nr_taken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_finished(Ptr<?> __data, Ptr<runtime.zone> zone2, int order, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_isolate_freepages(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long nr_scanned, @Unsigned long nr_taken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_isolate_migratepages(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long nr_scanned, @Unsigned long nr_taken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_kcompactd_sleep(Ptr<?> __data, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_kcompactd_wake(Ptr<?> __data, int nid, int order, ZoneDefinitions.zone_type highest_zoneidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_migratepages(Ptr<?> __data, @Unsigned int nr_migratepages, @Unsigned int nr_succeeded) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_suitable(Ptr<?> __data, Ptr<runtime.zone> zone2, int order, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_try_to_compact_pages(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int prio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_compaction_wakeup_kcompactd(Ptr<?> __data, int nid, int order, ZoneDefinitions.zone_type highest_zoneidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_shrink_slab_end(Ptr<?> __data, Ptr<runtime.shrinker> shr, int nid, int shrinker_retval, long unused_scan_cnt, long new_scan_cnt, long total_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_shrink_slab_start(Ptr<?> __data, Ptr<runtime.shrinker> shr, Ptr<ShrinkDefinitions.shrink_control> sc, long nr_objects_to_shrink, @Unsigned long cache_items, @Unsigned long delta, @Unsigned long total_scan, int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_direct_reclaim_begin(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_direct_reclaim_end(Ptr<?> __data, @Unsigned long nr_reclaimed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_kswapd_sleep(Ptr<?> __data, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_kswapd_wake(Ptr<?> __data, int nid, int zid, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_lru_isolate(Ptr<?> __data, int highest_zoneidx, int order, @Unsigned long nr_requested, @Unsigned long nr_scanned, @Unsigned long nr_skipped, @Unsigned long nr_taken, int lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_lru_shrink_active(Ptr<?> __data, int nid, @Unsigned long nr_taken, @Unsigned long nr_active, @Unsigned long nr_deactivated, @Unsigned long nr_referenced, int priority, int file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_lru_shrink_inactive(Ptr<?> __data, int nid, @Unsigned long nr_scanned, @Unsigned long nr_reclaimed, Ptr<ReclaimDefinitions.reclaim_stat> stat2, int priority, int file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_memcg_reclaim_begin(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_memcg_reclaim_end(Ptr<?> __data, @Unsigned long nr_reclaimed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_memcg_softlimit_reclaim_begin(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_memcg_softlimit_reclaim_end(Ptr<?> __data, @Unsigned long nr_reclaimed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_node_reclaim_begin(Ptr<?> __data, int nid, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_node_reclaim_end(Ptr<?> __data, @Unsigned long nr_reclaimed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_throttled(Ptr<?> __data, int nid, int usec_timeout, int usec_delayed, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_wakeup_kswapd(Ptr<?> __data, int nid, int zid, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_vmscan_write_folio(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mmap_lock_acquire_returned($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __probestub_mmap_lock_acquire_returned(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2, boolean success) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mmap_lock_released($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_mmap_lock_released(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mmap_lock_start_locking($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_mmap_lock_start_locking(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mmc_request_done(Ptr<?> __data, Ptr<MmcDefinitions.mmc_host> host, Ptr<MmcDefinitions.mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mmc_request_start(Ptr<?> __data, Ptr<MmcDefinitions.mmc_host> host, Ptr<MmcDefinitions.mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_non_standard_event($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, (const struct {\n  u8 b[16];\n}*)$arg3, (const u8*)$arg4, (const u8)$arg5, (const u8*)$arg6, (const unsigned int)$arg7)")
    public static void __probestub_non_standard_event(Ptr<?> __data, Ptr<@OriginalName(value="guid_t") misc.uuid_t> sec_type, Ptr<@OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev, Ptr<Character> err, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_oom_score_adj_update(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pm_qos_add_request(Ptr<?> __data, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pm_qos_remove_request(Ptr<?> __data, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pm_qos_update_flags(Ptr<?> __data, PmDefinitions.pm_qos_req_action action, int prev_value, int curr_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pm_qos_update_request(Ptr<?> __data, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pm_qos_update_target(Ptr<?> __data, PmDefinitions.pm_qos_req_action action, int prev_value, int curr_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_power_domain_target($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_power_domain_target(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_powernv_throttle($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_powernv_throttle(Ptr<?> __data, int chip_id, String reason, int pmax) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_prq_report(Ptr<?> __data, Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned long dw0, @Unsigned long dw1, @Unsigned long dw2, @Unsigned long dw3, @Unsigned long seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pstate_sample(Ptr<?> __data, @Unsigned int core_busy, @Unsigned int scaled_busy, @Unsigned int from, @Unsigned int to, @Unsigned long mperf, @Unsigned long aperf, @Unsigned long tsc, @Unsigned int freq, @Unsigned int io_boost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_qi_submit(Ptr<?> __data, Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned long qw0, @Unsigned long qw1, @Unsigned long qw2, @Unsigned long qw3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_rcu_stall_warning($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void __probestub_rcu_stall_warning(Ptr<?> __data, String rcuname, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_rcu_utilization($arg1, (const u8*)$arg2)")
    public static void __probestub_rcu_utilization(Ptr<?> __data, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_reclaim_retry_zone(Ptr<?> __data, Ptr<runtime.zoneref> zoneref2, int order, @Unsigned long reclaimable, @Unsigned long available, @Unsigned long min_wmark, int no_progress_loops, boolean wmark_check) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regcache_drop_region(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int from, @Unsigned int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regcache_sync($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void __probestub_regcache_sync(Ptr<?> __data, Ptr<runtime.regmap> map2, String type2, String status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_async_complete_done(Ptr<?> __data, Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_async_complete_start(Ptr<?> __data, Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_async_io_complete(Ptr<?> __data, Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_async_write_start(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regmap_bulk_read($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void __probestub_regmap_bulk_read(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, int val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regmap_bulk_write($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void __probestub_regmap_bulk_write(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, int val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_cache_bypass(Ptr<?> __data, Ptr<runtime.regmap> map2, boolean flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_cache_only(Ptr<?> __data, Ptr<runtime.regmap> map2, boolean flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_hw_read_done(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_hw_read_start(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_hw_write_done(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_hw_write_start(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_reg_read(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_reg_read_cache(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_regmap_reg_write(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_remove_device_from_group(Ptr<?> __data, int group_id, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_reschedule_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_reschedule_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_signal_deliver(Ptr<?> __data, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<KDefinitions.k_sigaction> ka) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_signal_generate(Ptr<?> __data, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> task2, int group, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_skip_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spurious_apic_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spurious_apic_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_start_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_suspend_resume($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_suspend_resume(Ptr<?> __data, String action, int val, boolean start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sync_timeline(Ptr<?> __data, Ptr<SyncDefinitions.sync_timeline> timeline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_task_newtask(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_task_rename($arg1, $arg2, (const u8*)$arg3)")
    public static void __probestub_task_rename(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, String comm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_apic_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_apic_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_power_devfreq_get_power(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, Ptr<DevfreqDefinitions.devfreq_dev_status> status, @Unsigned long freq, @Unsigned int power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_power_devfreq_limit(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long freq, @Unsigned long cdev_state, @Unsigned int power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_temperature(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_thermal_zone_trip(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int trip, ThermalDefinitions.thermal_trip_type trip_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_threshold_apic_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_threshold_apic_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tick_stop(Ptr<?> __data, int success, int dependency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_timer_base_idle(Ptr<?> __data, boolean is_idle, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_timer_cancel(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_timer_expire_entry(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long baseclk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_timer_expire_exit(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_timer_init(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_timer_start(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long bucket_expiry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_unmap(Ptr<?> __data, @Unsigned long iova2, @Unsigned long size, @Unsigned long unmapped_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_user_enter(Ptr<?> __data, int dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_user_exit(Ptr<?> __data, int dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_activate(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean can_reserve, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_alloc(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, boolean reserved, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_alloc_managed(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_clear(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int prev_vector, @Unsigned int prev_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_config(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int apicdest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_deactivate(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean can_reserve, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_free_moved(Ptr<?> __data, @Unsigned int irq, @Unsigned int cpu2, @Unsigned int vector, boolean is_managed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_reserve(Ptr<?> __data, @Unsigned int irq, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_reserve_managed(Ptr<?> __data, @Unsigned int irq, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_setup(Ptr<?> __data, @Unsigned int irq, boolean is_legacy, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_teardown(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean has_reserved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vector_update(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int prev_vector, @Unsigned int prev_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_wake_reaper(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_wakeup_source_activate($arg1, (const u8*)$arg2, $arg3)")
    public static void __probestub_wakeup_source_activate(Ptr<?> __data, String name, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_wakeup_source_deactivate($arg1, (const u8*)$arg2, $arg3)")
    public static void __probestub_wakeup_source_deactivate(Ptr<?> __data, String name, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_watchdog_ping(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_watchdog_set_timeout(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, @Unsigned int timeout, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_watchdog_start(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_watchdog_stop(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_after_restore(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_after_save(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_before_restore(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_before_save(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_copy_dst(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_copy_src(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_dropped(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_init_state(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_regs_activated(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_regs_deactivated(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_fpu_xstate_check_failed(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_platform_ipi_entry(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_x86_platform_ipi_exit(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xen_cpu_load_idt($arg1, (const struct desc_ptr*)$arg2)")
    public static void __probestub_xen_cpu_load_idt(Ptr<?> __data, Ptr<DescDefinitions.desc_ptr> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xen_cpu_set_ldt($arg1, (const void*)$arg2, $arg3)")
    public static void __probestub_xen_cpu_set_ldt(Ptr<?> __data, Ptr<?> addr2, @Unsigned int entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xen_cpu_write_gdt_entry($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void __probestub_xen_cpu_write_gdt_entry(Ptr<?> __data, Ptr<DescDefinitions.desc_struct> dt, int entrynum, Ptr<?> desc, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xen_cpu_write_idt_entry($arg1, $arg2, $arg3, (const gate_struct*)$arg4)")
    public static void __probestub_xen_cpu_write_idt_entry(Ptr<?> __data, Ptr<@OriginalName(value="gate_desc") misc.gate_struct> dt, int entrynum, Ptr<@OriginalName(value="gate_desc") misc.gate_struct> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_cpu_write_ldt_entry(Ptr<?> __data, Ptr<DescDefinitions.desc_struct> dt, int entrynum, @Unsigned long desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mc_batch(Ptr<?> __data, XenDefinitions.xen_lazy_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mc_callback(Ptr<?> __data, @OriginalName(value="xen_mc_callback_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mc_entry(Ptr<?> __data, Ptr<misc.multicall_entry> mc, @Unsigned int nargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mc_entry_alloc(Ptr<?> __data, @Unsigned long args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mc_extend_args(Ptr<?> __data, @Unsigned long op, @Unsigned long args, XenDefinitions.xen_mc_extend_args res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mc_flush(Ptr<?> __data, @Unsigned int mcidx, @Unsigned int argidx, @Unsigned int cbidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mc_flush_reason(Ptr<?> __data, XenDefinitions.xen_mc_flush_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mc_issue(Ptr<?> __data, XenDefinitions.xen_lazy_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_alloc_ptpage(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn, @Unsigned int level, boolean pinned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_xen_mmu_flush_tlb_multi($arg1, (const struct cpumask*)$arg2, $arg3, $arg4, $arg5)")
    public static void __probestub_xen_mmu_flush_tlb_multi(Ptr<?> __data, Ptr<runtime.cpumask> cpus, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_flush_tlb_one_user(Ptr<?> __data, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_pgd_pin(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_pgd_unpin(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_ptep_modify_prot_commit(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_ptep_modify_prot_start(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_release_ptpage(Ptr<?> __data, @Unsigned long pfn, @Unsigned int level, boolean pinned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_set_p4d(Ptr<?> __data, Ptr<misc.p4d_t> p4dp, Ptr<misc.p4d_t> user_p4dp, misc.p4d_t p4dval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_set_pmd(Ptr<?> __data, Ptr<PmdDefinitions.pmd_t> pmdp, PmdDefinitions.pmd_t pmdval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_set_pte(Ptr<?> __data, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_set_pud(Ptr<?> __data, Ptr<PudDefinitions.pud_t> pudp, PudDefinitions.pud_t pudval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xen_mmu_write_cr3(Ptr<?> __data, boolean kernel, @Unsigned long cr3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_add_endpoint(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ep_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_address_ctrl_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_input_control_ctx> ctrl_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_address_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_container_ctx> ctx, @Unsigned int ep_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_alloc_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_alloc_virt_device(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_configure_endpoint(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_configure_endpoint_ctrl_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_input_control_ctx> ctrl_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbc_alloc_request(Ptr<?> __data, Ptr<DbcDefinitions.dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbc_free_request(Ptr<?> __data, Ptr<DbcDefinitions.dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbc_gadget_ep_queue(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbc_giveback_request(Ptr<?> __data, Ptr<DbcDefinitions.dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbc_handle_event(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbc_handle_transfer(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbc_queue_request(Ptr<?> __data, Ptr<DbcDefinitions.dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbg_address(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbg_cancel_urb(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbg_context_change(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbg_init(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbg_quirks(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbg_reset_ep(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_dbg_ring_expansion(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_discover_or_reset_device(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_free_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_free_virt_device(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_get_port_status(Ptr<?> __data, Ptr<XhciDefinitions.xhci_port> port2, @Unsigned int portsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_cmd_addr_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_cmd_config_ep(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ep_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_cmd_disable_slot(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_cmd_reset_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_cmd_reset_ep(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ep_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_cmd_set_deq(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_cmd_set_deq_ep(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ep_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_cmd_stop_ep(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ep_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_command(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_event(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_port_status(Ptr<?> __data, Ptr<XhciDefinitions.xhci_port> port2, @Unsigned int portsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_handle_transfer(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_hub_status_data(Ptr<?> __data, Ptr<XhciDefinitions.xhci_port> port2, @Unsigned int portsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_inc_deq(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_inc_enq(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_queue_trb(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_ring_alloc(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_ring_ep_doorbell(Ptr<?> __data, @Unsigned int slot2, @Unsigned int doorbell) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_ring_expansion(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_ring_free(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_ring_host_doorbell(Ptr<?> __data, @Unsigned int slot2, @Unsigned int doorbell) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_setup_addressable_virt_device(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_setup_device(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_setup_device_slot(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_stop_device(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_urb_dequeue(Ptr<?> __data, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_urb_enqueue(Ptr<?> __data, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_xhci_urb_giveback(Ptr<?> __data, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_alarmtimer_cancel(Ptr<?> __data, Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_alarmtimer_fired(Ptr<?> __data, Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_alarmtimer_start(Ptr<?> __data, Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_alarmtimer_suspend(Ptr<?> __data, @OriginalName(value="ktime_t") long expires, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ata_bmdma_setup($arg1, $arg2, (const struct ata_taskfile*)$arg3, $arg4)")
    public static void __probestub_ata_bmdma_setup(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ata_bmdma_start($arg1, $arg2, (const struct ata_taskfile*)$arg3, $arg4)")
    public static void __probestub_ata_bmdma_start(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_bmdma_status(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, @Unsigned int host_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ata_bmdma_stop($arg1, $arg2, (const struct ata_taskfile*)$arg3, $arg4)")
    public static void __probestub_ata_bmdma_stop(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_eh_about_to_do(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, @Unsigned int devno, @Unsigned int eh_action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_eh_done(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, @Unsigned int devno, @Unsigned int eh_action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_eh_link_autopsy(Ptr<?> __data, Ptr<AtaDefinitions.ata_device> dev, @Unsigned int eh_action, @Unsigned int eh_err_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_eh_link_autopsy_qc(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ata_exec_command($arg1, $arg2, (const struct ata_taskfile*)$arg3, $arg4)")
    public static void __probestub_ata_exec_command(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_link_hardreset_begin(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_link_hardreset_end(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_link_postreset(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_link_softreset_begin(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_link_softreset_end(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_port_freeze(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_port_thaw(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_qc_complete_done(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_qc_complete_failed(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_qc_complete_internal(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_qc_issue(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_qc_prep(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_sff_flush_pio_task(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_sff_hsm_command_complete(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, char state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_sff_hsm_state(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, char state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_sff_pio_transfer_data(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, @Unsigned int offset, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_sff_port_intr(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, char state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_slave_hardreset_begin(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_slave_hardreset_end(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_slave_postreset(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ata_std_sched_eh(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ata_tf_load($arg1, $arg2, (const struct ata_taskfile*)$arg3)")
    public static void __probestub_ata_tf_load(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_atapi_pio_transfer_data(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, @Unsigned int offset, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_atapi_send_cdb(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, @Unsigned int offset, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_balance_dirty_pages(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long thresh, @Unsigned long bg_thresh, @Unsigned long dirty, @Unsigned long bdi_thresh, @Unsigned long bdi_dirty, @Unsigned long dirty_ratelimit, @Unsigned long task_ratelimit, @Unsigned long dirtied, @Unsigned long period, long pause2, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_bdi_dirty_ratelimit(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long dirty_rate, @Unsigned long task_ratelimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_bio_backmerge(Ptr<?> __data, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_bio_bounce(Ptr<?> __data, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_bio_complete(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_bio_frontmerge(Ptr<?> __data, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_bio_queue(Ptr<?> __data, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_bio_remap(Ptr<?> __data, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_dirty_buffer(Ptr<?> __data, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_getrq(Ptr<?> __data, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_io_done(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_io_start(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_plug(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_rq_complete(Ptr<?> __data, Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error, @Unsigned int nr_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_rq_error(Ptr<?> __data, Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error, @Unsigned int nr_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_rq_insert(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_rq_issue(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_rq_merge(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_rq_remap(Ptr<?> __data, Ptr<runtime.request> rq2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_rq_requeue(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_split(Ptr<?> __data, Ptr<runtime.bio> bio2, @Unsigned int new_sector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_touch_buffer(Ptr<?> __data, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_block_unplug(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q, @Unsigned int depth, boolean explicit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_bpf_trace_printk($arg1, (const u8*)$arg2)")
    public static void __probestub_bpf_trace_printk(Ptr<?> __data, String bpf_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_csd_function_entry(Ptr<?> __data, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr<@OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_csd_function_exit(Ptr<?> __data, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr<@OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_csd_queue_cpu($arg1, (const unsigned int)$arg2, $arg3, $arg4, $arg5)")
    public static void __probestub_csd_queue_cpu(Ptr<?> __data, @Unsigned int cpu2, @Unsigned long callsite, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr<@OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_devres_log($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void __probestub_devres_log(Ptr<?> __data, Ptr<runtime.device> dev, String op, Ptr<?> node2, String name, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_fence_destroy(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_fence_emit(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_fence_enable_signal(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_fence_init(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_fence_signaled(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_fence_wait_end(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_fence_wait_start(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_exit_mmap(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_alloc_da_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_allocate_blocks(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_request> ar, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_allocate_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_begin_ordered_truncate(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long new_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_collapse_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_da_release_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int freed_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_da_reserve_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_resv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_da_update_reserve_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int used_blocks, int quota_claim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_da_write_begin(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_da_write_end(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_da_write_pages(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long first_page, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_da_write_pages_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_discard_blocks(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long blk, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_discard_preallocations(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_drop_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int drop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ext4_error($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_ext4_error(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, String function, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_cache_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_find_extent_range_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_find_extent_range_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_insert_delayed_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es, boolean lclu_allocated, boolean end_allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_insert_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_lookup_extent_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_lookup_extent_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es, int found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_remove_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_shrink(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_shrunk, @Unsigned long scan_time, int nr_skipped, int retried) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_shrink_count(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_to_scan, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_shrink_scan_enter(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_to_scan, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_es_shrink_scan_exit(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_shrunk, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_evict_inode(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_convert_to_initialized_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_convert_to_initialized_fastpath(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux, Ptr<Ext4Definitions.ext4_extent> ix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_handle_unwritten_extents(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, int flags, @Unsigned int allocated, @Unsigned @OriginalName(value="ext4_fsblk_t") long newblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_load_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_map_blocks_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned int len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_map_blocks_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int flags, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_remove_space(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_remove_space_done(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end, int depth, Ptr<misc.partial_cluster> pc, @Unsigned @OriginalName(value="__le16") short eh_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_rm_idx(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_rm_leaf(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, Ptr<Ext4Definitions.ext4_extent> ex, Ptr<misc.partial_cluster> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ext_show_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, @Unsigned short len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fallocate_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fallocate_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @Unsigned int max_blocks, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_cleanup(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int full, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_commit_start(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_commit_stop(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nblks, int reason, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_replay(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int tag, int ino, int priv1, int priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_replay_scan(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int error, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_stats(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_track_create(Ptr<?> __data, Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_track_inode(Ptr<?> __data, Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_track_link(Ptr<?> __data, Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_track_range(Ptr<?> __data, Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, long start, long end, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fc_track_unlink(Ptr<?> __data, Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_forget(Ptr<?> __data, Ptr<runtime.inode> inode2, int is_metadata, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_free_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long block, @Unsigned long count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_free_inode(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fsmap_high_key(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned int keydev, @Unsigned int agno, @Unsigned long bno, @Unsigned long len, @Unsigned long owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fsmap_low_key(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned int keydev, @Unsigned int agno, @Unsigned long bno, @Unsigned long len, @Unsigned long owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_fsmap_mapping(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned int keydev, @Unsigned int agno, @Unsigned long bno, @Unsigned long len, @Unsigned long owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_get_implied_cluster_alloc_exit(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_getfsmap_high_key(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_fsmap> fsmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_getfsmap_low_key(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_fsmap> fsmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_getfsmap_mapping(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_fsmap> fsmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ind_map_blocks_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned int len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_ind_map_blocks_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int flags, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_insert_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_invalidate_folio(Ptr<?> __data, Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_journal_start_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int blocks, int rsv_blocks, int revoke_creds, int type2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_journal_start_reserved(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int blocks, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_journal_start_sb(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int blocks, int rsv_blocks, int revoke_creds, int type2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_journalled_invalidate_folio(Ptr<?> __data, Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_journalled_write_end(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_lazy_itable_init(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_load_inode(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_load_inode_bitmap(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mark_inode_dirty(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mb_bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mb_buddy_bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mb_discard_preallocations(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mb_new_group_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mb_new_inode_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mb_release_group_pa(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mb_release_inode_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_prealloc_space> pa, @Unsigned long block, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mballoc_alloc(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mballoc_discard(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mballoc_free(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_mballoc_prealloc(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_nfs_commit_metadata(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_other_inode_update_time(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ino_t") long orig_ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_prefetch_bitmaps(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @Unsigned @OriginalName(value="ext4_group_t") int next, @Unsigned int prefetch_ios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_punch_hole(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_read_block_bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group, boolean prefetch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_read_folio(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_release_folio(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_remove_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_extent> ex, @Unsigned @OriginalName(value="ext4_lblk_t") int from, @Unsigned @OriginalName(value="ext4_fsblk_t") long to, Ptr<misc.partial_cluster> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_request_blocks(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_request> ar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_request_inode(Ptr<?> __data, Ptr<runtime.inode> dir, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_shutdown(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_sync_file_enter(Ptr<?> __data, Ptr<runtime.file> file2, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_sync_file_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_sync_fs(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_trim_all_free(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_trim_extent(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_truncate_enter(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_truncate_exit(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_unlink_enter(Ptr<?> __data, Ptr<runtime.inode> parent, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_unlink_exit(Ptr<?> __data, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_update_sb(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long fsblk, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_write_begin(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_write_end(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_writepages(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_writepages_result(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, int ret, int pages_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ext4_zero_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_fib6_table_lookup($arg1, (const struct net*)$arg2, (const struct fib6_result*)$arg3, $arg4, (const struct flowi6*)$arg5)")
    public static void __probestub_fib6_table_lookup(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_result> res, Ptr<Fib6Definitions.fib6_table> table, Ptr<runtime.flowi6> flp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_flush_foreign(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned int frn_bdi_id, @Unsigned int frn_memcg_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_folio_wait_writeback(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_global_dirty_state(Ptr<?> __data, @Unsigned long background_thresh, @Unsigned long dirty_thresh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_gpio_direction(Ptr<?> __data, @Unsigned int gpio, int in, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_gpio_value(Ptr<?> __data, @Unsigned int gpio, int get, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_icmp_send($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4)")
    public static void __probestub_icmp_send(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int type2, int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_inode_foreign_history(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned int history) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_inode_switch_wbs(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<BdiDefinitions.bdi_writeback> old_wb, Ptr<BdiDefinitions.bdi_writeback> new_wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_complete(Ptr<?> __data, Ptr<?> ctx, Ptr<?> req2, @Unsigned long user_data, int res, @Unsigned int cflags, @Unsigned long extra1, @Unsigned long extra2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_cqe_overflow(Ptr<?> __data, Ptr<?> ctx, @Unsigned long user_data, int res, @Unsigned int cflags, Ptr<?> ocqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_cqring_wait(Ptr<?> __data, Ptr<?> ctx, int min_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_create(Ptr<?> __data, int fd2, Ptr<?> ctx, @Unsigned int sq_entries, @Unsigned int cq_entries, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_defer(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_fail_link(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, Ptr<IoDefinitions.io_kiocb> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_file_get(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_link(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, Ptr<IoDefinitions.io_kiocb> target_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_local_work_run(Ptr<?> __data, Ptr<?> ctx, int count, @Unsigned int loops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_poll_arm(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int mask, int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_queue_async_work(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_register(Ptr<?> __data, Ptr<?> ctx, @Unsigned int opcode, @Unsigned int nr_files, @Unsigned int nr_bufs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_io_uring_req_failed($arg1, (const struct io_uring_sqe*)$arg2, $arg3, $arg4)")
    public static void __probestub_io_uring_req_failed(Ptr<?> __data, Ptr<IoDefinitions.io_uring_sqe> sqe, Ptr<IoDefinitions.io_kiocb> req2, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_short_write(Ptr<?> __data, Ptr<?> ctx, @Unsigned long fpos, @Unsigned long wanted, @Unsigned long got) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_submit_req(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_task_add(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_io_uring_task_work_run(Ptr<?> __data, Ptr<?> tctx, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_iocost_inuse_adjust($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_iocost_inuse_adjust(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int old_inuse, @Unsigned int new_inuse, @Unsigned long old_hw_inuse, @Unsigned long new_hw_inuse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_iocost_inuse_shortage($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_iocost_inuse_shortage(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int old_inuse, @Unsigned int new_inuse, @Unsigned long old_hw_inuse, @Unsigned long new_hw_inuse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_iocost_inuse_transfer($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_iocost_inuse_transfer(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int old_inuse, @Unsigned int new_inuse, @Unsigned long old_hw_inuse, @Unsigned long new_hw_inuse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iocost_ioc_vrate_adj(Ptr<?> __data, Ptr<runtime.ioc> ioc2, @Unsigned long new_vrate, Ptr<@Unsigned Integer> missed_ppm, @Unsigned int rq_wait_pct, int nr_lagging, int nr_shortages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_iocost_iocg_activate($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void __probestub_iocost_iocg_activate(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned long last_period, @Unsigned long cur_period, @Unsigned long vtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_iocost_iocg_forgive_debt($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static void __probestub_iocost_iocg_forgive_debt(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int usage_pct, @Unsigned long old_debt, @Unsigned long new_debt, @Unsigned long old_delay, @Unsigned long new_delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_iocost_iocg_idle($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void __probestub_iocost_iocg_idle(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned long last_period, @Unsigned long cur_period, @Unsigned long vtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_dio_complete(Ptr<?> __data, Ptr<runtime.kiocb> iocb2, int error, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_dio_invalidate_fail(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_dio_rw_begin(Ptr<?> __data, Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, @Unsigned int dio_flags, @Unsigned long done_before) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_dio_rw_queued(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_invalidate_folio(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_iomap_iter($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void __probestub_iomap_iter(Ptr<?> __data, Ptr<IomapDefinitions.iomap_iter> iter2, Ptr<?> ops, @Unsigned long caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_iter_dstmap(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_iter_srcmap(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_readahead(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_readpage(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_release_folio(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_writepage(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_iomap_writepage_map(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long pos, @Unsigned int dirty_len, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ipi_entry($arg1, (const u8*)$arg2)")
    public static void __probestub_ipi_entry(Ptr<?> __data, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ipi_exit($arg1, (const u8*)$arg2)")
    public static void __probestub_ipi_exit(Ptr<?> __data, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ipi_raise($arg1, (const struct cpumask*)$arg2, (const u8*)$arg3)")
    public static void __probestub_ipi_raise(Ptr<?> __data, Ptr<runtime.cpumask> mask, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ipi_send_cpu($arg1, (const unsigned int)$arg2, $arg3, $arg4)")
    public static void __probestub_ipi_send_cpu(Ptr<?> __data, @Unsigned int cpu2, @Unsigned long callsite, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ipi_send_cpumask($arg1, (const struct cpumask*)$arg2, $arg3, $arg4)")
    public static void __probestub_ipi_send_cpumask(Ptr<?> __data, Ptr<runtime.cpumask> cpumask2, @Unsigned long callsite, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_checkpoint(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_checkpoint_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, Ptr<misc.transaction_chp_stats_s> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_commit_flushing(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_commit_locking(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_commit_logging(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_drop_transaction(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_end_commit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_handle_extend(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int buffer_credits, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_handle_restart(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_handle_start(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_handle_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int interval2, int sync2, int requested_blocks, int dirtied_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_lock_buffer_stall(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned long stall_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_run_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, Ptr<misc.transaction_run_stats_s> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_shrink_checkpoint_list(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int first_tid, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned @OriginalName(value="tid_t") int last_tid, @Unsigned long nr_freed, @Unsigned @OriginalName(value="tid_t") int next_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_shrink_count(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_shrink_scan_enter(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_shrink_scan_exit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long nr_shrunk, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_start_commit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_submit_inode_data(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_update_log_tail(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int first_tid, @Unsigned long block_nr, @Unsigned long freed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_jbd2_write_superblock(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="blk_opf_t") int write_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ma_op($arg1, (const u8*)$arg2, $arg3)")
    public static void __probestub_ma_op(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ma_read($arg1, (const u8*)$arg2, $arg3)")
    public static void __probestub_ma_read(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_ma_write($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void __probestub_ma_write(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas, @Unsigned long piv, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_collapse_huge_page(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int isolated, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_collapse_huge_page_isolate(Ptr<?> __data, Ptr<runtime.page> page2, int none_or_zero, int referenced, boolean writable, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_collapse_huge_page_swapin(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int swapped_in, int referenced, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_khugepaged_collapse_file(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.folio> new_folio, @Unsigned long index2, @Unsigned long addr2, boolean is_shmem, Ptr<runtime.file> file2, int nr, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_khugepaged_scan_file(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.folio> folio2, Ptr<runtime.file> file2, int present, int swap, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_khugepaged_scan_pmd(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.page> page2, boolean writable, int referenced, int none_or_zero, int status, int unmapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_migrate_pages(Ptr<?> __data, @Unsigned long succeeded, @Unsigned long failed, @Unsigned long thp_succeeded, @Unsigned long thp_failed, @Unsigned long thp_split, @Unsigned long large_folio_split, MigrateDefinitions.migrate_mode mode, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_migrate_pages_start(Ptr<?> __data, MigrateDefinitions.migrate_mode mode, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pelt_cfs_tp(Ptr<?> __data, Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pelt_dl_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pelt_hw_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pelt_irq_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pelt_rt_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_pelt_se_tp(Ptr<?> __data, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_percpu_alloc_percpu(Ptr<?> __data, @Unsigned long call_site, boolean reserved, boolean is_atomic, @Unsigned long size, @Unsigned long align, Ptr<?> base_addr, int off, Ptr<?> ptr, @Unsigned long bytes_alloc, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_percpu_alloc_percpu_fail(Ptr<?> __data, boolean reserved, boolean is_atomic, @Unsigned long size, @Unsigned long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_percpu_create_chunk(Ptr<?> __data, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_percpu_destroy_chunk(Ptr<?> __data, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_percpu_free_percpu(Ptr<?> __data, Ptr<?> base_addr, int off, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_pwm_apply($arg1, $arg2, (const struct pwm_state*)$arg3, $arg4)")
    public static void __probestub_pwm_apply(Ptr<?> __data, Ptr<PwmDefinitions.pwm_device> pwm, Ptr<PwmDefinitions.pwm_state> state2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_pwm_get($arg1, $arg2, (const struct pwm_state*)$arg3, $arg4)")
    public static void __probestub_pwm_get(Ptr<?> __data, Ptr<PwmDefinitions.pwm_device> pwm, Ptr<PwmDefinitions.pwm_state> state2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_remove_migration_pte(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sb_clear_inode_writeback(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sb_mark_inode_writeback(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_compute_energy_tp(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, int dst_cpu, @Unsigned long energy, @Unsigned long max_util, @Unsigned long busy_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_cpu_capacity_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_kthread_stop(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_kthread_stop_ret(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_kthread_work_execute_end(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_work> work, @OriginalName(value="kthread_work_func_t") Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_kthread_work_execute_start(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_kthread_work_queue_work(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_worker> worker2, Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_migrate_task(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, int dest_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_move_numa(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, int src_cpu, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_overutilized_tp(Ptr<?> __data, Ptr<misc.root_domain> rd, boolean overutilized) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_pi_setprio(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, Ptr<TaskDefinitions.task_struct> pi_task) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_prepare_exec(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_process_exec(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, @OriginalName(value="pid_t") int old_pid, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_process_exit(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_process_fork(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> parent, Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_process_free(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_process_hang(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_process_wait(Ptr<?> __data, Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_skip_vma_numa(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma, NumaDefinitions.numa_vmaskip_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_stat_blocked(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_stat_iowait(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_stat_runtime(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long runtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_stat_sleep(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_stat_wait(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_stick_numa(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> src_tsk, int src_cpu, Ptr<TaskDefinitions.task_struct> dst_tsk, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_swap_numa(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> src_tsk, int src_cpu, Ptr<TaskDefinitions.task_struct> dst_tsk, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_switch(Ptr<?> __data, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_update_nr_running_tp(Ptr<?> __data, Ptr<runtime.rq> rq2, int change) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_util_est_cfs_tp(Ptr<?> __data, Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_util_est_se_tp(Ptr<?> __data, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_wait_task(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_wake_idle_without_ipi(Ptr<?> __data, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_wakeup(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_wakeup_new(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sched_waking(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_scsi_dispatch_cmd_done(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_scsi_dispatch_cmd_error(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd, int rtn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_scsi_dispatch_cmd_start(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_scsi_dispatch_cmd_timeout(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_scsi_eh_wakeup(Ptr<?> __data, Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_scsi_prepare_zone_append(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmnd, @Unsigned @OriginalName(value="sector_t") long lba, @Unsigned int wp_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_scsi_zone_wp_update(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmnd, @Unsigned @OriginalName(value="sector_t") long rq_sector, @Unsigned int wp_offset, @Unsigned int good_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_set_migration_pte(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_controller_busy(Ptr<?> __data, Ptr<SpiDefinitions.spi_controller> controller2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_controller_idle(Ptr<?> __data, Ptr<SpiDefinitions.spi_controller> controller2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_message_done(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_message_start(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_message_submit(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_set_cs(Ptr<?> __data, Ptr<SpiDefinitions.spi_device> spi, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_setup(Ptr<?> __data, Ptr<SpiDefinitions.spi_device> spi, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_transfer_start(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg, Ptr<SpiDefinitions.spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_spi_transfer_stop(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg, Ptr<SpiDefinitions.spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tlb_flush(Ptr<?> __data, int reason, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_connect_child_parent(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_connect_cpu_parent(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_cpu_active(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_cpu_idle(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_cpu_new_timer(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_cpu_new_timer_idle(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_cpu_offline(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_cpu_online(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_group_set(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_group_set_cpu_active(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state state2, @Unsigned int childmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_group_set_cpu_inactive(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state state2, @Unsigned int childmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_handle_remote(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_handle_remote_cpu(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tmigr_update_events(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> child, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state childstate, TmigrDefinitions.tmigr_state groupstate, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_track_foreign_dirty(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vm_unmapped_area(Ptr<?> __data, @Unsigned long addr2, Ptr<VmDefinitions.vm_unmapped_area_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vma_mas_szero(Ptr<?> __data, Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_vma_store(Ptr<?> __data, Ptr<MapleDefinitions.maple_tree> mt, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_wbc_writepage(Ptr<?> __data, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_wbt_lat(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned long lat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_wbt_stat(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<BlkDefinitions.blk_rq_stat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_wbt_step($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __probestub_wbt_step(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, String msg, int step, @Unsigned long window, @Unsigned int bg, @Unsigned int normal, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_wbt_timer(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int status, int step, @Unsigned int inflight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_bdi_register(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_dirty_folio(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_dirty_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_dirty_inode_enqueue(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_dirty_inode_start(Ptr<?> __data, Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_exec(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_lazytime(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_lazytime_iput(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_mark_inode_dirty(Ptr<?> __data, Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_pages_written(Ptr<?> __data, long pages_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_queue(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_queue_io(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work, @Unsigned long dirtied_before, int moved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_sb_inodes_requeue(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_single_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned long nr_to_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_single_inode_start(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned long nr_to_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_start(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_wait(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_wake_background(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_write_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_write_inode_start(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_writeback_written(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_br_fdb_add($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void __probestub_br_fdb_add(Ptr<?> __data, Ptr<runtime.ndmsg> ndm, Ptr<NetDefinitions.net_device> dev, String addr2, @Unsigned short vid, @Unsigned short nlh_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_br_fdb_external_learn_add($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static void __probestub_br_fdb_external_learn_add(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_port> p, String addr2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_br_fdb_update($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void __probestub_br_fdb_update(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_port> source, String addr2, @Unsigned short vid, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_br_mdb_full($arg1, (const struct net_device*)$arg2, (const struct br_ip*)$arg3)")
    public static void __probestub_br_mdb_full(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<misc.br_ip> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_break_lease_block(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_break_lease_noblock(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_break_lease_unblock(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_attach_task($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __probestub_cgroup_attach_task(Ptr<?> __data, Ptr<runtime.cgroup> dst_cgrp, String path2, Ptr<TaskDefinitions.task_struct> task2, boolean threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_destroy_root(Ptr<?> __data, Ptr<CgroupDefinitions.cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_freeze($arg1, $arg2, (const u8*)$arg3)")
    public static void __probestub_cgroup_freeze(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_mkdir($arg1, $arg2, (const u8*)$arg3)")
    public static void __probestub_cgroup_mkdir(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_notify_frozen($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_cgroup_notify_frozen(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_notify_populated($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_cgroup_notify_populated(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_release($arg1, $arg2, (const u8*)$arg3)")
    public static void __probestub_cgroup_release(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_remount(Ptr<?> __data, Ptr<CgroupDefinitions.cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_rename($arg1, $arg2, (const u8*)$arg3)")
    public static void __probestub_cgroup_rename(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_rmdir($arg1, $arg2, (const u8*)$arg3)")
    public static void __probestub_cgroup_rmdir(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_cpu_lock_contended(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_cpu_lock_contended_fastpath(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_cpu_locked(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_cpu_locked_fastpath(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_cpu_unlock(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_cpu_unlock_fastpath(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_lock_contended(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_locked(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_rstat_unlock(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cgroup_setup_root(Ptr<?> __data, Ptr<CgroupDefinitions.cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_transfer_tasks($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __probestub_cgroup_transfer_tasks(Ptr<?> __data, Ptr<runtime.cgroup> dst_cgrp, String path2, Ptr<TaskDefinitions.task_struct> task2, boolean threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_cgroup_unfreeze($arg1, $arg2, (const u8*)$arg3)")
    public static void __probestub_cgroup_unfreeze(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_consume_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cros_ec_request_done(Ptr<?> __data, Ptr<CrosDefinitions.cros_ec_command> cmd, int retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_cros_ec_request_start(Ptr<?> __data, Ptr<CrosDefinitions.cros_ec_command> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_insert_mapping(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_insert_pfn_mkwrite(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_insert_pfn_mkwrite_no_entry(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_load_hole(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_pmd_fault(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long max_pgoff, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_pmd_fault_done(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long max_pgoff, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_pmd_insert_mapping(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, long length, @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_pmd_load_hole(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> zero_folio, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_pmd_load_hole_fallback(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> zero_folio, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_pte_fault(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_pte_fault_done(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_writeback_one(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long pgoff, @Unsigned long pglen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_writeback_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long start_index, @Unsigned long end_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dax_writeback_range_done(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long start_index, @Unsigned long end_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_devfreq_frequency(Ptr<?> __data, Ptr<runtime.devfreq> devfreq2, @Unsigned long freq, @Unsigned long prev_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_devfreq_monitor(Ptr<?> __data, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_devlink_health_recover_aborted($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __probestub_devlink_health_recover_aborted(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, boolean health_state, @Unsigned long time_since_last_recover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_devlink_health_report($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void __probestub_devlink_health_report(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_devlink_health_reporter_state_update($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4)")
    public static void __probestub_devlink_health_reporter_state_update(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, boolean new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_devlink_hwerr($arg1, (const struct devlink*)$arg2, $arg3, (const u8*)$arg4)")
    public static void __probestub_devlink_hwerr(Ptr<?> __data, Ptr<runtime.devlink> devlink2, int err, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_devlink_hwmsg($arg1, (const struct devlink*)$arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void __probestub_devlink_hwmsg(Ptr<?> __data, Ptr<runtime.devlink> devlink2, boolean incoming, @Unsigned long type2, Ptr<Character> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_devlink_trap_report($arg1, (const struct devlink*)$arg2, $arg3, (const struct devlink_trap_metadata*)$arg4)")
    public static void __probestub_devlink_trap_report(Ptr<?> __data, Ptr<runtime.devlink> devlink2, Ptr<SkDefinitions.sk_buff> skb, Ptr<DevlinkDefinitions.devlink_trap_metadata> metadata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_alloc(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<?> virt_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_free(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<?> virt_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_map_page(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_map_resource(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_map_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, int ents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_sync_sg_for_cpu(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_sync_sg_for_device(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_sync_single_for_cpu(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_sync_single_for_device(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_unmap_page(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_unmap_resource(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dma_unmap_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_dql_stall_detected(Ptr<?> __data, @Unsigned short thrs, @Unsigned int len, @Unsigned long last_reap, @Unsigned long hist_head, @Unsigned long now, Ptr<@Unsigned Long> hist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_emulate_vsyscall(Ptr<?> __data, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_error_report_end(Ptr<?> __data, misc.error_detector error_detector2, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_error_wwnr(Ptr<?> __data, int id, String state2, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_event_wwnr(Ptr<?> __data, int id, String state2, String event2, String next_state, boolean final_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_fcntl_setlk(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> fl, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_fdb_delete(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_fdb_entry> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_fib_table_lookup($arg1, $arg2, (const struct flowi4*)$arg3, (const struct fib_nh_common*)$arg4, $arg5)")
    public static void __probestub_fib_table_lookup(Ptr<?> __data, @Unsigned int tb_id, Ptr<runtime.flowi4> flp, Ptr<FibDefinitions.fib_nh_common> nhc, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_file_check_and_advance_wb_err(Ptr<?> __data, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="errseq_t") int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_filemap_set_wb_err(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="errseq_t") int eseq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_flock_lock_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> fl, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_fuse_request_end($arg1, (const struct fuse_req*)$arg2)")
    public static void __probestub_fuse_request_end(Ptr<?> __data, Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_fuse_request_send($arg1, (const struct fuse_req*)$arg2)")
    public static void __probestub_fuse_request_send(Ptr<?> __data, Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_generic_add_lease(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_generic_delete_lease(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_cancel($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4)")
    public static void __probestub_handshake_cancel(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_cancel_busy($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4)")
    public static void __probestub_handshake_cancel_busy(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_cancel_none($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4)")
    public static void __probestub_handshake_cancel_none(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_cmd_accept($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __probestub_handshake_cmd_accept(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_cmd_accept_err($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __probestub_handshake_cmd_accept_err(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_cmd_done($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __probestub_handshake_cmd_done(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_cmd_done_err($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __probestub_handshake_cmd_done_err(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_complete($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __probestub_handshake_complete(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_destruct($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4)")
    public static void __probestub_handshake_destruct(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_notify_err($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __probestub_handshake_notify_err(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_submit($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4)")
    public static void __probestub_handshake_submit(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_handshake_submit_err($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __probestub_handshake_submit_err(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hugepage_set_pmd(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hugepage_set_pud(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hugepage_update_pmd(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pmd, @Unsigned long clr, @Unsigned long set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_hugepage_update_pud(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pud, @Unsigned long clr, @Unsigned long set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_i2c_read($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void __probestub_i2c_read(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_i2c_reply($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void __probestub_i2c_reply(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_i2c_result($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4)")
    public static void __probestub_i2c_result(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, int num, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_i2c_write($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void __probestub_i2c_write(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_inet_sk_error_report($arg1, (const struct sock*)$arg2)")
    public static void __probestub_inet_sk_error_report(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_inet_sock_set_state($arg1, (const struct sock*)$arg2, (const int)$arg3, (const int)$arg4)")
    public static void __probestub_inet_sock_set_state(Ptr<?> __data, Ptr<runtime.sock> sk, int oldstate, int newstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_handler_entry(Ptr<?> __data, int irq, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_handler_exit(Ptr<?> __data, int irq, Ptr<runtime.irqaction> action, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_alloc(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_alloc_managed(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_alloc_reserved(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_assign(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_assign_system(Ptr<?> __data, int bit, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_free(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_offline(Ptr<?> __data, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_online(Ptr<?> __data, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_remove_managed(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_remove_reserved(Ptr<?> __data, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_reserve(Ptr<?> __data, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_irq_matrix_reserve_managed(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_kfree($arg1, $arg2, (const void*)$arg3)")
    public static void __probestub_kfree(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_kfree_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2, SkbDefinitions.skb_drop_reason reason, Ptr<runtime.sock> rx_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_kmalloc($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void __probestub_kmalloc(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, @Unsigned long bytes_req, @Unsigned long bytes_alloc, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_kmem_cache_alloc($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static void __probestub_kmem_cache_alloc(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_kmem_cache_free($arg1, $arg2, (const void*)$arg3, (const struct kmem_cache*)$arg4)")
    public static void __probestub_kmem_cache_free(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_advisor(Ptr<?> __data, long scan_time, @Unsigned long pages_to_scan, @Unsigned int cpu_percent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_enter(Ptr<?> __data, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_exit(Ptr<?> __data, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_merge_one_page(Ptr<?> __data, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_merge_with_ksm_page(Ptr<?> __data, Ptr<?> ksm_page, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_remove_ksm_page(Ptr<?> __data, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_remove_rmap_item(Ptr<?> __data, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_start_scan(Ptr<?> __data, int seq, @Unsigned int rmap_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_ksm_stop_scan(Ptr<?> __data, int seq, @Unsigned int rmap_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_leases_conflict(Ptr<?> __data, boolean conflict, Ptr<FileDefinitions.file_lease> lease, Ptr<FileDefinitions.file_lease> breaker) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_locks_get_lock_context(Ptr<?> __data, Ptr<runtime.inode> inode2, int type2, Ptr<FileDefinitions.file_lock_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_locks_remove_posix(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> fl, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mctp_key_acquire($arg1, (const struct mctp_sk_key*)$arg2)")
    public static void __probestub_mctp_key_acquire(Ptr<?> __data, Ptr<MctpDefinitions.mctp_sk_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_mctp_key_release($arg1, (const struct mctp_sk_key*)$arg2, $arg3)")
    public static void __probestub_mctp_key_release(Ptr<?> __data, Ptr<MctpDefinitions.mctp_sk_key> key2, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_alloc_contig_migrate_range_info(Ptr<?> __data, @Unsigned long start, @Unsigned long end, @Unsigned long nr_migrated, @Unsigned long nr_reclaimed, @Unsigned long nr_mapped, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_filemap_add_to_page_cache(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_filemap_delete_from_page_cache(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_filemap_fault(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_filemap_get_pages(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned long last_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_filemap_map_pages(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned long last_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_lru_activate(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_lru_insertion(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_page_alloc(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_page_alloc_extfrag(Ptr<?> __data, Ptr<runtime.page> page2, int alloc_order, int fallback_order, int alloc_migratetype, int fallback_migratetype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_page_alloc_zone_locked(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, int migratetype2, int percpu_refill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_page_free(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_page_free_batched(Ptr<?> __data, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_mm_page_pcpu_drain(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_napi_gro_frags_entry($arg1, (const struct sk_buff*)$arg2)")
    public static void __probestub_napi_gro_frags_entry(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_napi_gro_frags_exit(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_napi_gro_receive_entry($arg1, (const struct sk_buff*)$arg2)")
    public static void __probestub_napi_gro_receive_entry(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_napi_gro_receive_exit(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_napi_poll(Ptr<?> __data, Ptr<NapiDefinitions.napi_struct> napi, int work, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_neigh_cleanup_and_release(Ptr<?> __data, Ptr<runtime.neighbour> neigh, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_neigh_create($arg1, $arg2, $arg3, (const void*)$arg4, (const struct neighbour*)$arg5, $arg6)")
    public static void __probestub_neigh_create(Ptr<?> __data, Ptr<NeighDefinitions.neigh_table> tbl, Ptr<NetDefinitions.net_device> dev, Ptr<?> pkey, Ptr<runtime.neighbour> n, boolean exempt_from_gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_neigh_event_send_dead(Ptr<?> __data, Ptr<runtime.neighbour> neigh, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_neigh_event_send_done(Ptr<?> __data, Ptr<runtime.neighbour> neigh, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_neigh_timer_handler(Ptr<?> __data, Ptr<runtime.neighbour> neigh, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_neigh_update($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static void __probestub_neigh_update(Ptr<?> __data, Ptr<runtime.neighbour> n, Ptr<Character> lladdr, char _new, @Unsigned int flags, @Unsigned int nlmsg_pid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_neigh_update_done(Ptr<?> __data, Ptr<runtime.neighbour> neigh, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_net_dev_queue(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_net_dev_start_xmit($arg1, (const struct sk_buff*)$arg2, (const struct net_device*)$arg3)")
    public static void __probestub_net_dev_start_xmit(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_net_dev_xmit(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int rc2, Ptr<NetDefinitions.net_device> dev, @Unsigned int skb_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_net_dev_xmit_timeout(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, int queue_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_netif_receive_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_netif_receive_skb_entry($arg1, (const struct sk_buff*)$arg2)")
    public static void __probestub_netif_receive_skb_entry(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_netif_receive_skb_exit(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_netif_receive_skb_list_entry($arg1, (const struct sk_buff*)$arg2)")
    public static void __probestub_netif_receive_skb_list_entry(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_netif_receive_skb_list_exit(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_netif_rx(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_netif_rx_entry($arg1, (const struct sk_buff*)$arg2)")
    public static void __probestub_netif_rx_entry(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_netif_rx_exit(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_netlink_extack($arg1, (const u8*)$arg2)")
    public static void __probestub_netlink_extack(Ptr<?> __data, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_notifier_register(Ptr<?> __data, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_notifier_run(Ptr<?> __data, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_notifier_unregister(Ptr<?> __data, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_page_fault_kernel(Ptr<?> __data, @Unsigned long address, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_page_fault_user(Ptr<?> __data, @Unsigned long address, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_page_pool_release($arg1, (const struct page_pool*)$arg2, $arg3, $arg4, $arg5)")
    public static void __probestub_page_pool_release(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, int inflight, @Unsigned int hold, @Unsigned int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_page_pool_state_hold($arg1, (const struct page_pool*)$arg2, $arg3, $arg4)")
    public static void __probestub_page_pool_state_hold(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int hold) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_page_pool_state_release($arg1, (const struct page_pool*)$arg2, $arg3, $arg4)")
    public static void __probestub_page_pool_state_release(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_page_pool_update_nid($arg1, (const struct page_pool*)$arg2, $arg3)")
    public static void __probestub_page_pool_update_nid(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, int new_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_posix_lock_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> fl, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_qdisc_create($arg1, (const struct Qdisc_ops*)$arg2, $arg3, $arg4)")
    public static void __probestub_qdisc_create(Ptr<?> __data, Ptr<QdiscDefinitions.Qdisc_ops> ops, Ptr<NetDefinitions.net_device> dev, @Unsigned int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_qdisc_dequeue($arg1, $arg2, (const struct netdev_queue*)$arg3, $arg4, $arg5)")
    public static void __probestub_qdisc_dequeue(Ptr<?> __data, Ptr<runtime.Qdisc> qdisc, Ptr<NetdevDefinitions.netdev_queue> txq, int packets, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_qdisc_destroy(Ptr<?> __data, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_qdisc_enqueue($arg1, $arg2, (const struct netdev_queue*)$arg3, $arg4)")
    public static void __probestub_qdisc_enqueue(Ptr<?> __data, Ptr<runtime.Qdisc> qdisc, Ptr<NetdevDefinitions.netdev_queue> txq, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_qdisc_reset(Ptr<?> __data, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_bypass_disable($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_bypass_disable(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_bypass_disable_complete($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_bypass_disable_complete(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_bypass_enable($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_bypass_enable(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_bypass_enable_complete($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_bypass_enable_complete(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_disable($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_disable(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_disable_complete($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_disable_complete(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_enable($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_enable(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_enable_complete($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_enable_complete(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_enable_delay($arg1, (const u8*)$arg2)")
    public static void __probestub_regulator_enable_delay(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_set_voltage($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __probestub_regulator_set_voltage(Ptr<?> __data, String name, int min, int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_regulator_set_voltage_complete($arg1, (const u8*)$arg2, $arg3)")
    public static void __probestub_regulator_set_voltage_complete(Ptr<?> __data, String name, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_remove_migration_pmd(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rpm_idle(Ptr<?> __data, Ptr<runtime.device> dev, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rpm_resume(Ptr<?> __data, Ptr<runtime.device> dev, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rpm_return_int(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned long ip, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rpm_status(Ptr<?> __data, Ptr<runtime.device> dev, RpmDefinitions.rpm_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rpm_suspend(Ptr<?> __data, Ptr<runtime.device> dev, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rpm_usage(Ptr<?> __data, Ptr<runtime.device> dev, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rss_stat(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int member) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_alarm_irq_enable(Ptr<?> __data, @Unsigned int enabled, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_irq_set_freq(Ptr<?> __data, int freq, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_irq_set_state(Ptr<?> __data, int enabled, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_read_alarm(Ptr<?> __data, @OriginalName(value="time64_t") long secs, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_read_offset(Ptr<?> __data, long offset, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_read_time(Ptr<?> __data, @OriginalName(value="time64_t") long secs, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_set_alarm(Ptr<?> __data, @OriginalName(value="time64_t") long secs, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_set_offset(Ptr<?> __data, long offset, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_set_time(Ptr<?> __data, @OriginalName(value="time64_t") long secs, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_timer_dequeue(Ptr<?> __data, Ptr<RtcDefinitions.rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_timer_enqueue(Ptr<?> __data, Ptr<RtcDefinitions.rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_rtc_timer_fired(Ptr<?> __data, Ptr<RtcDefinitions.rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_sched_ext_dump($arg1, (const u8*)$arg2)")
    public static void __probestub_sched_ext_dump(Ptr<?> __data, String line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_set_migration_pmd(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_sk_data_ready($arg1, (const struct sock*)$arg2)")
    public static void __probestub_sk_data_ready(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_skb_copy_datagram_iovec($arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static void __probestub_skb_copy_datagram_iovec(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sock_exceed_buf_limit(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<runtime.proto> prot, long allocated, int kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sock_rcvqueue_full(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sock_recv_length(Ptr<?> __data, Ptr<runtime.sock> sk, int ret, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sock_send_length(Ptr<?> __data, Ptr<runtime.sock> sk, int ret, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_softirq_entry(Ptr<?> __data, @Unsigned int vec_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_softirq_exit(Ptr<?> __data, @Unsigned int vec_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_softirq_raise(Ptr<?> __data, @Unsigned int vec_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sys_enter(Ptr<?> __data, Ptr<PtDefinitions.pt_regs> regs, long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_sys_exit(Ptr<?> __data, Ptr<PtDefinitions.pt_regs> regs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tasklet_entry(Ptr<?> __data, Ptr<TaskletDefinitions.tasklet_struct> t, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tasklet_exit(Ptr<?> __data, Ptr<TaskletDefinitions.tasklet_struct> t, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_ao_handshake_failure($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const u8)$arg4, (const u8)$arg5, (const u8)$arg6)")
    public static void __probestub_tcp_ao_handshake_failure(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, char keyid, char rnext, char maclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_ao_key_not_found($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const u8)$arg4, (const u8)$arg5, (const u8)$arg6)")
    public static void __probestub_tcp_ao_key_not_found(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, char keyid, char rnext, char maclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_ao_mismatch($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const u8)$arg4, (const u8)$arg5, (const u8)$arg6)")
    public static void __probestub_tcp_ao_mismatch(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, char keyid, char rnext, char maclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_ao_rcv_sne_update($arg1, (const struct sock*)$arg2, $arg3)")
    public static void __probestub_tcp_ao_rcv_sne_update(Ptr<?> __data, Ptr<runtime.sock> sk, @Unsigned int new_sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_ao_rnext_request($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const u8)$arg4, (const u8)$arg5, (const u8)$arg6)")
    public static void __probestub_tcp_ao_rnext_request(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, char keyid, char rnext, char maclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_ao_snd_sne_update($arg1, (const struct sock*)$arg2, $arg3)")
    public static void __probestub_tcp_ao_snd_sne_update(Ptr<?> __data, Ptr<runtime.sock> sk, @Unsigned int new_sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_ao_synack_no_key($arg1, (const struct sock*)$arg2, (const u8)$arg3, (const u8)$arg4)")
    public static void __probestub_tcp_ao_synack_no_key(Ptr<?> __data, Ptr<runtime.sock> sk, char keyid, char rnext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_ao_wrong_maclen($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const u8)$arg4, (const u8)$arg5, (const u8)$arg6)")
    public static void __probestub_tcp_ao_wrong_maclen(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, char keyid, char rnext, char maclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_bad_csum($arg1, (const struct sk_buff*)$arg2)")
    public static void __probestub_tcp_bad_csum(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_cong_state_set($arg1, $arg2, (const u8)$arg3)")
    public static void __probestub_tcp_cong_state_set(Ptr<?> __data, Ptr<runtime.sock> sk, char ca_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tcp_destroy_sock(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_hash_ao_required($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void __probestub_tcp_hash_ao_required(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_hash_bad_header($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void __probestub_tcp_hash_bad_header(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_hash_md5_mismatch($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void __probestub_tcp_hash_md5_mismatch(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_hash_md5_required($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void __probestub_tcp_hash_md5_required(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_hash_md5_unexpected($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void __probestub_tcp_hash_md5_unexpected(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tcp_probe(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tcp_rcv_space_adjust(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_tcp_receive_reset(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_retransmit_skb($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void __probestub_tcp_retransmit_skb(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_retransmit_synack($arg1, (const struct sock*)$arg2, (const struct request_sock*)$arg3)")
    public static void __probestub_tcp_retransmit_synack(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tcp_send_reset($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const enum sk_rst_reason)$arg4)")
    public static void __probestub_tcp_send_reset(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb__nullable, SkDefinitions.sk_rst_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_test_pages_isolated(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long fin_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_time_out_leases(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tls_alert_recv($arg1, (const struct sock*)$arg2, $arg3, $arg4)")
    public static void __probestub_tls_alert_recv(Ptr<?> __data, Ptr<runtime.sock> sk, char level, char description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tls_alert_send($arg1, (const struct sock*)$arg2, $arg3, $arg4)")
    public static void __probestub_tls_alert_send(Ptr<?> __data, Ptr<runtime.sock> sk, char level, char description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__probestub_tls_contenttype($arg1, (const struct sock*)$arg2, $arg3)")
    public static void __probestub_tls_contenttype(Ptr<?> __data, Ptr<runtime.sock> sk, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_udp_fail_queue_rcv_skb(Ptr<?> __data, int rc2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_workqueue_activate_work(Ptr<?> __data, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_workqueue_execute_end(Ptr<?> __data, Ptr<misc.work_struct> work, @OriginalName(value="work_func_t") Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_workqueue_execute_start(Ptr<?> __data, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probestub_workqueue_queue_work(Ptr<?> __data, int req_cpu, Ptr<misc.pool_workqueue> pwq, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }
}

