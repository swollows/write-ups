/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.OriginalNames;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CacheDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.CperDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.CrosDefinitions;
import me.bechberger.ebpf.runtime.CssDefinitions;
import me.bechberger.ebpf.runtime.DbcDefinitions;
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DevfreqDefinitions;
import me.bechberger.ebpf.runtime.DevlinkDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EnableDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FlushDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.HandshakeDefinitions;
import me.bechberger.ebpf.runtime.HidDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.HtabDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IccDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InodeDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IocDefinitions;
import me.bechberger.ebpf.runtime.IomapDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.IterDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.LinkDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.LwtunnelDefinitions;
import me.bechberger.ebpf.runtime.MapDefinitions;
import me.bechberger.ebpf.runtime.MapleDefinitions;
import me.bechberger.ebpf.runtime.MctpDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmapDefinitions;
import me.bechberger.ebpf.runtime.MmcDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.MsgDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NeighDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetkitDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NetnsDefinitions;
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.NumaDefinitions;
import me.bechberger.ebpf.runtime.ObjDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PcieDefinitions;
import me.bechberger.ebpf.runtime.PcpuDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.ProgDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.PwmDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.ReclaimDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RpmDefinitions;
import me.bechberger.ebpf.runtime.RtcDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SctpDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.SelinuxDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.StackDefinitions;
import me.bechberger.ebpf.runtime.StaticDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SyncDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TaskletDefinitions;
import me.bechberger.ebpf.runtime.TcpDefinitions;
import me.bechberger.ebpf.runtime.TestDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TmigrDefinitions;
import me.bechberger.ebpf.runtime.UdpDefinitions;
import me.bechberger.ebpf.runtime.UnixDefinitions;
import me.bechberger.ebpf.runtime.UprobeDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmaDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.WatchdogDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XenDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class BpfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_address_lookup(@Unsigned long addr2, Ptr<@Unsigned Long> size, Ptr<@Unsigned Long> off, String sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __bpf_call_base(@Unsigned long r1, @Unsigned long r2, @Unsigned long r3, @Unsigned long r4, @Unsigned long r5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_core_types_are_compat((const struct btf*)$arg1, $arg2, (const struct btf*)$arg3, $arg4, $arg5)")
    public static int __bpf_core_types_are_compat(Ptr<runtime.btf> local_btf, @Unsigned int local_id, Ptr<runtime.btf> targ_btf, @Unsigned int targ_id, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_core_types_match((const struct btf*)$arg1, $arg2, (const struct btf*)$arg3, $arg4, $arg5, $arg6)")
    public static int __bpf_core_types_match(Ptr<runtime.btf> local_btf, @Unsigned int local_id, Ptr<runtime.btf> targ_btf, @Unsigned int targ_id, boolean behind_ptr, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_free_used_btfs(Ptr<BtfDefinitions.btf_mod_pair> used_btfs, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_free_used_maps(Ptr<bpf_prog_aux> aux, Ptr<Ptr<bpf_map>> used_maps, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_array_free_sleepable_cb(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_free(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_prog_ret0_warn((const void*)$arg1, (const struct bpf_insn*)$arg2)")
    public static @Unsigned int __bpf_prog_ret0_warn(Ptr<?> ctx, Ptr<bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_prog_ret1((const void*)$arg1, (const struct bpf_insn*)$arg2)")
    public static @Unsigned int __bpf_prog_ret1(Ptr<?> ctx, Ptr<bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_test_run_raw_tp(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __bpf_task_storage_get(Ptr<bpf_map> map2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> value, @Unsigned long flags, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, boolean nobusy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ack_update_msk(Ptr<?> __data, @Unsigned long data_ack, @Unsigned long old_snd_una, @Unsigned long new_snd_una, @Unsigned long new_wnd_end, @Unsigned long msk_wnd_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_alloc_vmap_area(Ptr<?> __data, @Unsigned long addr2, @Unsigned long size, @Unsigned long align, @Unsigned long vstart, @Unsigned long vend, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_amd_pstate_perf(Ptr<?> __data, @Unsigned long min_perf, @Unsigned long target_perf, @Unsigned long capacity, @Unsigned long freq, @Unsigned long mperf, @Unsigned long aperf, @Unsigned long tsc, @Unsigned int cpu_id2, boolean changed, boolean fast_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_bpf_test_finish(Ptr<?> __data, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_bpf_trigger_tp(Ptr<?> __data, int nonce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_bpf_xdp_link_attach_failed($arg1, (const u8*)$arg2)")
    public static void __bpf_trace_bpf_xdp_link_attach_failed(Ptr<?> __data, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_contention_begin(Ptr<?> __data, Ptr<?> lock, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_contention_end(Ptr<?> __data, Ptr<?> lock, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_cpuhp_enter($arg1, $arg2, $arg3, $arg4, (int (*)(unsigned int))$arg5)")
    public static void __bpf_trace_cpuhp_enter(Ptr<?> __data, @Unsigned int cpu2, int target, int idx, Ptr<?> fun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cpuhp_exit(Ptr<?> __data, @Unsigned int cpu2, int state2, int idx, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_cpuhp_multi_enter($arg1, $arg2, $arg3, $arg4, (int (*)(unsigned int, struct hlist_node*))$arg5, $arg6)")
    public static void __bpf_trace_cpuhp_multi_enter(Ptr<?> __data, @Unsigned int cpu2, int target, int idx, Ptr<?> fun, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_drm_vblank_event(Ptr<?> __data, int crtc, @Unsigned int seq, @OriginalName(value="ktime_t") long time, boolean high_prec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_drm_vblank_event_delivered(Ptr<?> __data, Ptr<DrmDefinitions.drm_file> file2, int crtc, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_drm_vblank_event_queued(Ptr<?> __data, Ptr<DrmDefinitions.drm_file> file2, int crtc, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_free_vmap_area_noflush(Ptr<?> __data, @Unsigned long va_start, @Unsigned long nr_lazy, @Unsigned long nr_lazy_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_hwmon_attr_class($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __bpf_trace_hwmon_attr_class(Ptr<?> __data, int index2, String attr_name, long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_hwmon_attr_show_string($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void __bpf_trace_hwmon_attr_show_string(Ptr<?> __data, int index2, String attr_name, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_hyperv_mmu_flush_tlb_multi($arg1, (const struct cpumask*)$arg2, (const struct flush_tlb_info*)$arg3)")
    public static void __bpf_trace_hyperv_mmu_flush_tlb_multi(Ptr<?> __data, Ptr<runtime.cpumask> cpus, Ptr<FlushDefinitions.flush_tlb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hyperv_nested_flush_guest_mapping(Ptr<?> __data, @Unsigned long as, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hyperv_nested_flush_guest_mapping_range(Ptr<?> __data, @Unsigned long as, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_hyperv_send_ipi_mask($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static void __bpf_trace_hyperv_send_ipi_mask(Ptr<?> __data, Ptr<runtime.cpumask> cpus, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hyperv_send_ipi_one(Ptr<?> __data, int cpu2, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_icc_set_bw(Ptr<?> __data, Ptr<IccDefinitions.icc_path> p, Ptr<IccDefinitions.icc_node> n, int i, @Unsigned int avg_bw, @Unsigned int peak_bw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_icc_set_bw_end(Ptr<?> __data, Ptr<IccDefinitions.icc_path> p, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_initcall_finish(Ptr<?> __data, @OriginalName(value="initcall_t") Ptr<?> func, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_initcall_level($arg1, (const u8*)$arg2)")
    public static void __bpf_trace_initcall_level(Ptr<?> __data, String level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_initcall_start(Ptr<?> __data, @OriginalName(value="initcall_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_irq_noise($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __bpf_trace_irq_noise(Ptr<?> __data, int vector, String desc, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mdio_access(Ptr<?> __data, Ptr<misc.mii_bus> bus, char read2, char addr2, @Unsigned int regnum, @Unsigned short val, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_mem_connect($arg1, (const struct xdp_mem_allocator*)$arg2, (const struct xdp_rxq_info*)$arg3)")
    public static void __bpf_trace_mem_connect(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_allocator> xa, Ptr<XdpDefinitions.xdp_rxq_info> rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_mem_disconnect($arg1, (const struct xdp_mem_allocator*)$arg2)")
    public static void __bpf_trace_mem_disconnect(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_allocator> xa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_mem_return_failed($arg1, (const struct xdp_mem_info*)$arg2, (const struct page*)$arg3)")
    public static void __bpf_trace_mem_return_failed(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_info> mem, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_module_free(Ptr<?> __data, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_module_load(Ptr<?> __data, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_module_refcnt(Ptr<?> __data, Ptr<runtime.module> mod, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_module_request(Ptr<?> __data, String name, boolean wait, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mon_llc_occupancy_limbo(Ptr<?> __data, @Unsigned int ctrl_hw_id, @Unsigned int mon_hw_id, int domain_id, @Unsigned long llc_occupancy_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mptcp_dump_mpext(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_ext> mpext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mptcp_subflow_get_send(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_subflow_context> subflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_msr_trace_class(Ptr<?> __data, @Unsigned int msr2, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_nmi_handler(Ptr<?> __data, Ptr<?> handler, long delta_ns, int handled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_nmi_noise(Ptr<?> __data, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pseudo_lock_l2(Ptr<?> __data, @Unsigned long l2_hits, @Unsigned long l2_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pseudo_lock_l3(Ptr<?> __data, @Unsigned long l3_hits, @Unsigned long l3_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pseudo_lock_mem_latency(Ptr<?> __data, @Unsigned int latency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_purge_vmap_area_lazy(Ptr<?> __data, @Unsigned long start, @Unsigned long end, @Unsigned int npurged) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rseq_ip_fixup(Ptr<?> __data, @Unsigned long regs_ip, @Unsigned long start_ip, @Unsigned long post_commit_offset, @Unsigned long abort_ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rseq_update(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sample_threshold(Ptr<?> __data, @Unsigned long start, @Unsigned long duration, @Unsigned long interference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_selinux_audited($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static void __bpf_trace_selinux_audited(Ptr<?> __data, Ptr<SelinuxDefinitions.selinux_audit_data> sad, String scontext, String tcontext, String tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_smbus_read($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void __bpf_trace_smbus_read(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_smbus_reply($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union i2c_smbus_data*)$arg8, $arg9)")
    public static void __bpf_trace_smbus_reply(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<I2cDefinitions.i2c_smbus_data> data, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_smbus_result($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __bpf_trace_smbus_result(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_smbus_write($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union i2c_smbus_data*)$arg8)")
    public static void __bpf_trace_smbus_write(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<I2cDefinitions.i2c_smbus_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_softirq_noise(Ptr<?> __data, int vector, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_subflow_check_data_avail(Ptr<?> __data, char status, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_swiotlb_bounced(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dev_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_thermal_power_actor(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int actor_id, @Unsigned int req_power, @Unsigned int granted_power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_thermal_power_allocator(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, @Unsigned int total_req_power, @Unsigned int total_granted_power, int num_actors, @Unsigned int power_range, @Unsigned int max_allocatable_power, int current_temp, int delta_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_thermal_power_allocator_pid(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int err, int err_integral, long p, long i, long d, int output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_thread_noise(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xdp_bulk_tx($arg1, (const struct net_device*)$arg2, $arg3, $arg4, $arg5)")
    public static void __bpf_trace_xdp_bulk_tx(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, int sent, int drops, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xdp_cpumap_enqueue(Ptr<?> __data, int map_id, @Unsigned int processed, @Unsigned int drops, int to_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xdp_cpumap_kthread(Ptr<?> __data, int map_id, @Unsigned int processed, @Unsigned int drops, int sched, Ptr<XdpDefinitions.xdp_cpumap_stats> xdp_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xdp_devmap_xmit($arg1, (const struct net_device*)$arg2, (const struct net_device*)$arg3, $arg4, $arg5, $arg6)")
    public static void __bpf_trace_xdp_devmap_xmit(Ptr<?> __data, Ptr<NetDefinitions.net_device> from_dev, Ptr<NetDefinitions.net_device> to_dev, int sent, int drops, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xdp_exception($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, $arg4)")
    public static void __bpf_trace_xdp_exception(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<bpf_prog> xdp2, @Unsigned int act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xdp_redirect_template($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __bpf_trace_xdp_redirect_template(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<bpf_prog> xdp2, Ptr<?> tgt, int err, bpf_map_type map_type2, @Unsigned int map_id, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_adj_branches($arg1, $arg2, $arg3, $arg4, (const _Bool)$arg5)")
    public static int bpf_adj_branches(Ptr<bpf_prog> prog, @Unsigned int pos, int end_old, int end_new, boolean probe_pass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_arch_text_copy(Ptr<?> dst, Ptr<?> src, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_arch_text_invalidate(Ptr<?> dst, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_arch_text_poke(Ptr<?> ip, bpf_text_poke_type t, Ptr<?> addr1, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_arch_uaddress_limit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_arena_get_kern_vm_start(Ptr<bpf_arena> arena) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_arena_get_user_vm_start(Ptr<bpf_arena> arena) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_btf_find_by_name_kind(@Unsigned long name, @Unsigned long name_sz, @Unsigned long kind, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_btf_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_cgroup_iter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_add_cands($arg1, (const struct btf*)$arg2, $arg3)")
    public static Ptr<bpf_cand_cache> bpf_core_add_cands(Ptr<bpf_cand_cache> cands, Ptr<runtime.btf> targ_btf, int targ_start_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_apply($arg1, (const struct bpf_core_relo*)$arg2, $arg3, $arg4)")
    public static int bpf_core_apply(Ptr<bpf_core_ctx> ctx, Ptr<bpf_core_relo> relo, int relo_idx, Ptr<?> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_calc_field_relo((const u8*)$arg1, (const struct bpf_core_relo*)$arg2, (const struct bpf_core_spec*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int bpf_core_calc_field_relo(String prog_name, Ptr<bpf_core_relo> relo, Ptr<bpf_core_spec> spec, Ptr<@Unsigned Long> val, Ptr<@Unsigned Integer> field_sz, Ptr<@Unsigned Integer> type_id, Ptr<@OriginalName(value="bool") Boolean> validate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_calc_relo((const u8*)$arg1, (const struct bpf_core_relo*)$arg2, $arg3, (const struct bpf_core_spec*)$arg4, (const struct bpf_core_spec*)$arg5, $arg6)")
    public static int bpf_core_calc_relo(String prog_name, Ptr<bpf_core_relo> relo, int relo_idx, Ptr<bpf_core_spec> local_spec, Ptr<bpf_core_spec> targ_spec, Ptr<bpf_core_relo_res> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_calc_relo_insn((const u8*)$arg1, (const struct bpf_core_relo*)$arg2, $arg3, (const struct btf*)$arg4, $arg5, $arg6, $arg7)")
    public static int bpf_core_calc_relo_insn(String prog_name, Ptr<bpf_core_relo> relo, int relo_idx, Ptr<runtime.btf> local_btf, Ptr<bpf_core_cand_list> cands, Ptr<bpf_core_spec> specs_scratch, Ptr<bpf_core_relo_res> targ_res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_calc_type_relo((const struct bpf_core_relo*)$arg1, (const struct bpf_core_spec*)$arg2, $arg3, $arg4)")
    public static int bpf_core_calc_type_relo(Ptr<bpf_core_relo> relo, Ptr<bpf_core_spec> spec, Ptr<@Unsigned Long> val, Ptr<@OriginalName(value="bool") Boolean> validate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_essential_name_len((const u8*)$arg1)")
    public static @Unsigned long bpf_core_essential_name_len(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_fields_are_compat((const struct btf*)$arg1, $arg2, (const struct btf*)$arg3, $arg4)")
    public static int bpf_core_fields_are_compat(Ptr<runtime.btf> local_btf, @Unsigned int local_id, Ptr<runtime.btf> targ_btf, @Unsigned int targ_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_format_spec($arg1, $arg2, (const struct bpf_core_spec*)$arg3)")
    public static int bpf_core_format_spec(String buf, @Unsigned long buf_sz, Ptr<bpf_core_spec> spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_match_member((const struct btf*)$arg1, (const struct bpf_core_accessor*)$arg2, (const struct btf*)$arg3, $arg4, $arg5, $arg6)")
    public static int bpf_core_match_member(Ptr<runtime.btf> local_btf, Ptr<bpf_core_accessor> local_acc, Ptr<runtime.btf> targ_btf, @Unsigned int targ_id, Ptr<bpf_core_spec> spec, Ptr<@Unsigned Integer> next_targ_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_names_match((const struct btf*)$arg1, $arg2, (const struct btf*)$arg3, $arg4)")
    public static boolean bpf_core_names_match(Ptr<runtime.btf> local_btf, @Unsigned long local_name_off, Ptr<runtime.btf> targ_btf, @Unsigned long targ_name_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_parse_spec((const u8*)$arg1, (const struct btf*)$arg2, (const struct bpf_core_relo*)$arg3, $arg4)")
    public static int bpf_core_parse_spec(String prog_name, Ptr<runtime.btf> btf2, Ptr<bpf_core_relo> relo, Ptr<bpf_core_spec> spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_patch_insn((const u8*)$arg1, $arg2, $arg3, (const struct bpf_core_relo*)$arg4, $arg5, (const struct bpf_core_relo_res*)$arg6)")
    public static int bpf_core_patch_insn(String prog_name, Ptr<bpf_insn> insn2, int insn_idx, Ptr<bpf_core_relo> relo, int relo_idx, Ptr<bpf_core_relo_res> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_spec_match($arg1, (const struct btf*)$arg2, $arg3, $arg4)")
    public static int bpf_core_spec_match(Ptr<bpf_core_spec> local_spec, Ptr<runtime.btf> targ_btf, @Unsigned int targ_id, Ptr<bpf_core_spec> targ_spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_types_are_compat((const struct btf*)$arg1, $arg2, (const struct btf*)$arg3, $arg4)")
    public static int bpf_core_types_are_compat(Ptr<runtime.btf> local_btf, @Unsigned int local_id, Ptr<runtime.btf> targ_btf, @Unsigned int targ_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_core_types_match((const struct btf*)$arg1, $arg2, (const struct btf*)$arg3, $arg4)")
    public static int bpf_core_types_match(Ptr<runtime.btf> local_btf, @Unsigned int local_id, Ptr<runtime.btf> targ_btf, @Unsigned int targ_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_cpumask> bpf_cpumask_acquire(Ptr<bpf_cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_and($arg1, (const struct cpumask*)$arg2, (const struct cpumask*)$arg3)")
    public static boolean bpf_cpumask_and(Ptr<bpf_cpumask> dst, Ptr<runtime.cpumask> src1, Ptr<runtime.cpumask> src2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_any_and_distribute((const struct cpumask*)$arg1, (const struct cpumask*)$arg2)")
    public static @Unsigned int bpf_cpumask_any_and_distribute(Ptr<runtime.cpumask> src1, Ptr<runtime.cpumask> src2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_any_distribute((const struct cpumask*)$arg1)")
    public static @Unsigned int bpf_cpumask_any_distribute(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cpumask_clear(Ptr<bpf_cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cpumask_clear_cpu(@Unsigned int cpu2, Ptr<bpf_cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_copy($arg1, (const struct cpumask*)$arg2)")
    public static void bpf_cpumask_copy(Ptr<bpf_cpumask> dst, Ptr<runtime.cpumask> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_cpumask> bpf_cpumask_create() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_empty((const struct cpumask*)$arg1)")
    public static boolean bpf_cpumask_empty(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_equal((const struct cpumask*)$arg1, (const struct cpumask*)$arg2)")
    public static boolean bpf_cpumask_equal(Ptr<runtime.cpumask> src1, Ptr<runtime.cpumask> src2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_first((const struct cpumask*)$arg1)")
    public static @Unsigned int bpf_cpumask_first(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_first_and((const struct cpumask*)$arg1, (const struct cpumask*)$arg2)")
    public static @Unsigned int bpf_cpumask_first_and(Ptr<runtime.cpumask> src1, Ptr<runtime.cpumask> src2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_first_zero((const struct cpumask*)$arg1)")
    public static @Unsigned int bpf_cpumask_first_zero(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_full((const struct cpumask*)$arg1)")
    public static boolean bpf_cpumask_full(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_intersects((const struct cpumask*)$arg1, (const struct cpumask*)$arg2)")
    public static boolean bpf_cpumask_intersects(Ptr<runtime.cpumask> src1, Ptr<runtime.cpumask> src2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_or($arg1, (const struct cpumask*)$arg2, (const struct cpumask*)$arg3)")
    public static void bpf_cpumask_or(Ptr<bpf_cpumask> dst, Ptr<runtime.cpumask> src1, Ptr<runtime.cpumask> src2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cpumask_release(Ptr<bpf_cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cpumask_release_dtor(Ptr<?> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cpumask_set_cpu(@Unsigned int cpu2, Ptr<bpf_cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cpumask_setall(Ptr<bpf_cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_subset((const struct cpumask*)$arg1, (const struct cpumask*)$arg2)")
    public static boolean bpf_cpumask_subset(Ptr<runtime.cpumask> src1, Ptr<runtime.cpumask> src2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_cpumask_test_and_clear_cpu(@Unsigned int cpu2, Ptr<bpf_cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_cpumask_test_and_set_cpu(@Unsigned int cpu2, Ptr<bpf_cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_test_cpu($arg1, (const struct cpumask*)$arg2)")
    public static boolean bpf_cpumask_test_cpu(@Unsigned int cpu2, Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_weight((const struct cpumask*)$arg1)")
    public static @Unsigned int bpf_cpumask_weight(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cpumask_xor($arg1, (const struct cpumask*)$arg2, (const struct cpumask*)$arg3)")
    public static void bpf_cpumask_xor(Ptr<bpf_cpumask> dst, Ptr<runtime.cpumask> src1, Ptr<runtime.cpumask> src2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_ctx_init((const union bpf_attr*)$arg1, $arg2)")
    public static Ptr<?> bpf_ctx_init(Ptr<bpf_attr> kattr, @Unsigned int max_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dispatcher_nop_func((const void*)$arg1, (const struct bpf_insn*)$arg2, $arg3)")
    public static @Unsigned int bpf_dispatcher_nop_func(Ptr<?> ctx, Ptr<bpf_insn> insnsi, @OriginalName(value="bpf_func_t") Ptr<?> bpf_func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_event_output(Ptr<bpf_map> map2, @Unsigned long flags, Ptr<?> meta, @Unsigned long meta_size, Ptr<?> ctx, @Unsigned long ctx_size, @OriginalName(value="bpf_ctx_copy_t") Ptr<?> ctx_copy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_shadow_test(int a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_test1(int a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_test2(int a, @Unsigned long b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_test3(char a, int b, @Unsigned long c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_test4(Ptr<?> a, char b, int c, @Unsigned long d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_test5(@Unsigned long a, Ptr<?> b, short c, int d, @Unsigned long e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_test6(@Unsigned long a, Ptr<?> b, short c, int d, Ptr<?> e, @Unsigned long f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_test7(Ptr<bpf_fentry_test_t> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fentry_test8(Ptr<bpf_fentry_test_t> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_fentry_test9(Ptr<@Unsigned Integer> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_fentry_test_sinfo(Ptr<SkbDefinitions.skb_shared_info> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_find_btf_id((const u8*)$arg1, $arg2, $arg3)")
    public static int bpf_find_btf_id(String name, @Unsigned int kind, Ptr<Ptr<runtime.btf>> btf_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_flow_dissect(Ptr<bpf_prog> prog, Ptr<bpf_flow_dissector> ctx, @Unsigned @OriginalName(value="__be16") short proto2, int nhoff, int hlen, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_for_each_map_elem(@Unsigned long map2, @Unsigned long callback_fn, @Unsigned long callback_ctx, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_get_kallsym(@Unsigned int symnum, Ptr<@Unsigned Long> value, String type2, String sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_kprobe_info((const struct perf_event*)$arg1, $arg2, (const u8**)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int bpf_get_kprobe_info(Ptr<PerfDefinitions.perf_event> event2, Ptr<@Unsigned Integer> fd_type, Ptr<String> symbol, Ptr<@Unsigned Long> probe_offset, Ptr<@Unsigned Long> probe_addr, Ptr<@Unsigned Long> missed, boolean perf_type_tracepoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_raw_cpu_id(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_get_trace_printk_proto())")
    public static Ptr<bpf_func_proto> bpf_get_trace_printk_proto() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_get_trace_vprintk_proto())")
    public static Ptr<bpf_func_proto> bpf_get_trace_vprintk_proto() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_global_ma_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_helper_changes_pkt_data(Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_int_jit_compile(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_internal_load_pointer_neg_helper((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static Ptr<?> bpf_internal_load_pointer_neg_helper(Ptr<SkDefinitions.sk_buff> skb, int k, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_attach_cgroup(Ptr<bpf_prog> prog, Ptr<bpf_iter_link_info> linfo, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_bpf_link(Ptr<bpf_iter_meta> meta, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_cgroup(Ptr<bpf_iter_meta> meta, Ptr<runtime.cgroup> cgroup2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_cgroup_fill_link_info((const struct bpf_iter_aux_info*)$arg1, $arg2)")
    public static int bpf_iter_cgroup_fill_link_info(Ptr<bpf_iter_aux_info> aux, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_cgroup_show_fdinfo((const struct bpf_iter_aux_info*)$arg1, $arg2)")
    public static void bpf_iter_cgroup_show_fdinfo(Ptr<bpf_iter_aux_info> aux, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_css_destroy(Ptr<bpf_iter_css> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_css_new(Ptr<bpf_iter_css> it, Ptr<CgroupDefinitions.cgroup_subsys_state> start, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> bpf_iter_css_next(Ptr<bpf_iter_css> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_detach_cgroup(Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_fini_seq_net(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_fini_tcp(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_iter_get_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_iter_get_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_iter_get_info(Ptr<bpf_iter_meta> meta, boolean in_stop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_init_seq_net(Ptr<?> priv_data, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_init_tcp(Ptr<?> priv_data, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_ksym(Ptr<bpf_iter_meta> meta, Ptr<misc.kallsym_iter> ksym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_ksym_init(Ptr<?> priv_data, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_ksym_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_ksym_seq_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_link_attach((const union bpf_attr*)$arg1, $arg2, $arg3)")
    public static int bpf_iter_link_attach(Ptr<bpf_attr> attr2,  @OriginalName(value="bpfptr_t") misc.sockptr_t uattr, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_iter_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_link_replace(Ptr<bpf_link> link2, Ptr<bpf_prog> new_prog, Ptr<bpf_prog> old_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_link_show_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void bpf_iter_link_show_fdinfo(Ptr<bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_new_fd(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_num_destroy(Ptr<bpf_iter_num> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_num_new(Ptr<bpf_iter_num> it, int start, int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Integer> bpf_iter_num_next(Ptr<bpf_iter_num> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_iter_prog_supported(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_reg_target((const struct bpf_iter_reg*)$arg1)")
    public static int bpf_iter_reg_target(Ptr<bpf_iter_reg> reg_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_run_prog(Ptr<bpf_prog> prog, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_sockmap(Ptr<bpf_iter_meta> meta, Ptr<bpf_map> map2, Ptr<?> key2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_tcp(Ptr<bpf_iter_meta> meta, Ptr<SockDefinitions.sock_common> sk_common, @Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> bpf_iter_tcp_batch(Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_iter_tcp_get_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_iter_tcp_get_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_tcp_realloc_batch(Ptr<bpf_tcp_iter_state> iter2, @Unsigned int new_batch_sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_iter_tcp_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_tcp_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_iter_tcp_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_tcp_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_unreg_target((const struct bpf_iter_reg*)$arg1)")
    public static void bpf_iter_unreg_target(Ptr<bpf_iter_reg> reg_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_jit_add_poke_descriptor(Ptr<bpf_prog> prog, Ptr<bpf_jit_poke_descriptor> poke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_jit_alloc_exec(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_jit_alloc_exec_limit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_binary_header> bpf_jit_binary_alloc(@Unsigned int proglen, Ptr<Ptr<Character>> image_ptr, @Unsigned int alignment, @OriginalName(value="bpf_jit_fill_hole_t") Ptr<?> bpf_fill_ill_insns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_jit_binary_free(Ptr<bpf_binary_header> hdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_binary_header> bpf_jit_binary_pack_alloc(@Unsigned int proglen, Ptr<Ptr<Character>> image_ptr, @Unsigned int alignment, Ptr<Ptr<bpf_binary_header>> rw_header, Ptr<Ptr<Character>> rw_image, @OriginalName(value="bpf_jit_fill_hole_t") Ptr<?> bpf_fill_ill_insns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_jit_binary_pack_finalize(Ptr<bpf_binary_header> ro_header, Ptr<bpf_binary_header> rw_header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_jit_binary_pack_free(Ptr<bpf_binary_header> ro_header, Ptr<bpf_binary_header> rw_header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_jit_binary_pack_hdr((const struct bpf_prog*)$arg1)")
    public static Ptr<bpf_binary_header> bpf_jit_binary_pack_hdr(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_jit_blind_constants(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_jit_blind_insn((const struct bpf_insn*)$arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4)")
    public static int bpf_jit_blind_insn(Ptr<bpf_insn> from, Ptr<bpf_insn> aux, Ptr<bpf_insn> to_buff, boolean emit_zext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_jit_charge_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_jit_charge_modmem(@Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_jit_compile(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_jit_fill_hole_with_zero(Ptr<?> area, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_jit_free(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_jit_free_exec(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_jit_get_func_addr((const struct bpf_prog*)$arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static int bpf_jit_get_func_addr(Ptr<bpf_prog> prog, Ptr<bpf_insn> insn2, boolean extra_pass, Ptr<@Unsigned Long> func_addr, Ptr<@OriginalName(value="bool") Boolean> func_addr_fixed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_inlines_helper_call(int imm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_needs_zext() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_jit_prog_release_other(Ptr<bpf_prog> fp, Ptr<bpf_prog> fp_other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_supports_arena() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_supports_exceptions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_supports_far_kfunc_call() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_supports_insn(Ptr<bpf_insn> insn2, boolean in_arena) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_supports_kfunc_call() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_supports_percpu_insn() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_supports_ptr_xchg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_jit_supports_subprog_tailcalls() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_jit_uncharge_modmem(@Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_kfunc_call_memb_release(Ptr<ProgDefinitions.prog_test_member> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_kfunc_call_memb_release_dtor(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_kfunc_call_test_release(Ptr<ProgDefinitions.prog_test_ref_kfunc> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_kfunc_call_test_release_dtor(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_ksym_add(Ptr<bpf_ksym> ksym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_ksym_del(Ptr<bpf_ksym> ksym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_ksym> bpf_ksym_find(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_ksym_iter_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_link_is_iter(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_link_iter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_link_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_link_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_link_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_log($arg1, (const u8*)$arg2, $arg3_)")
    public static void bpf_log(Ptr<bpf_verifier_log> log, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_loop(@Unsigned long nr_loops, @Unsigned long callback_fn, @Unsigned long callback_ctx, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_map_fd_get_ptr(Ptr<bpf_map> map2, Ptr<runtime.file> map_file, int ufd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_fd_put_ptr(Ptr<bpf_map> map2, Ptr<?> ptr, boolean need_defer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_map_fd_sys_lookup_elem(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_map_meta_alloc(int inner_map_ufd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_meta_equal((const struct bpf_map*)$arg1, (const struct bpf_map*)$arg2)")
    public static boolean bpf_map_meta_equal(Ptr<bpf_map> meta0, Ptr<bpf_map> meta1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_meta_free(Ptr<bpf_map> map_meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_modify_return_test(int a, Ptr<Integer> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_modify_return_test2(int a, Ptr<Integer> b, short c, int d, Ptr<?> e, char f, int g) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_modify_return_test_tp(int nonce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_msg_redirect_hash(@Unsigned long msg, @Unsigned long map2, @Unsigned long key2, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_msg_redirect_map(@Unsigned long msg, @Unsigned long map2, @Unsigned long key2, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_netns_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_netns_link_detach(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_netns_link_fill_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_netns_link_fill_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_netns_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_netns_link_show_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void bpf_netns_link_show_fdinfo(Ptr<bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_netns_link_update_prog(Ptr<bpf_link> link2, Ptr<bpf_prog> new_prog, Ptr<bpf_prog> old_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_nf_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_nf_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_nf_link_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int bpf_nf_link_attach(Ptr<bpf_attr> attr2, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_nf_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_nf_link_detach(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_nf_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_nf_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_nf_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_nf_link_show_info((const struct bpf_link*)$arg1, $arg2)")
    public static void bpf_nf_link_show_info(Ptr<bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_nf_link_update(Ptr<bpf_link> link2, Ptr<bpf_prog> new_prog, Ptr<bpf_prog> old_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_opcode_in_insntable(char code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_patch_insn_single($arg1, $arg2, (const struct bpf_insn*)$arg3, $arg4)")
    public static Ptr<bpf_prog> bpf_patch_insn_single(Ptr<bpf_prog> prog, @Unsigned int off, Ptr<bpf_insn> patch, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_pid_task_storage_delete_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_pid_task_storage_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_pid_task_storage_update_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_alloc(@Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int gfp_extra_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_alloc_jited_linfo(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_alloc_no_stats(@Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int gfp_extra_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog_array> bpf_prog_array_alloc(@Unsigned int prog_cnt, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_array_copy(Ptr<bpf_prog_array> old_array, Ptr<bpf_prog> exclude_prog, Ptr<bpf_prog> include_prog, @Unsigned long bpf_cookie, Ptr<Ptr<bpf_prog_array>> new_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_array_copy_info(Ptr<bpf_prog_array> array, Ptr<@Unsigned Integer> prog_ids, @Unsigned int request_cnt, Ptr<@Unsigned Integer> prog_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_array_copy_to_user(Ptr<bpf_prog_array> array, Ptr<@Unsigned Integer> prog_ids, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_array_delete_safe(Ptr<bpf_prog_array> array, Ptr<bpf_prog> old_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_array_delete_safe_at(Ptr<bpf_prog_array> array, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_array_free(Ptr<bpf_prog_array> progs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_array_free_sleepable(Ptr<bpf_prog_array> progs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_prog_array_is_empty(Ptr<bpf_prog_array> array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_array_length(Ptr<bpf_prog_array> array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_array_update_at(Ptr<bpf_prog_array> array, int index2, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_calc_tag(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_clone_create(Ptr<bpf_prog> fp_other, @Unsigned @OriginalName(value="gfp_t") int gfp_extra_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_fill_jited_linfo($arg1, (const unsigned int*)$arg2)")
    public static void bpf_prog_fill_jited_linfo(Ptr<bpf_prog> prog, Ptr<@Unsigned Integer> insn_to_jit_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_free(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_free_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_get_target_btf((const struct bpf_prog*)$arg1)")
    public static Ptr<runtime.btf> bpf_prog_get_target_btf(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_jit_attempt_done(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_kallsyms_add(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_kallsyms_del(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_kallsyms_del_all(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_ksym_find(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_map_compatible($arg1, (const struct bpf_prog*)$arg2)")
    public static boolean bpf_prog_map_compatible(Ptr<bpf_map> map2, Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_prog_pack_alloc(@Unsigned int size, @OriginalName(value="bpf_jit_fill_hole_t") Ptr<?> bpf_fill_ill_insns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_pack_free(Ptr<?> ptr, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_realloc(Ptr<bpf_prog> fp_old, @Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int gfp_extra_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_select_runtime(Ptr<bpf_prog> fp, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_test_run_flow_dissector($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_prog_test_run_flow_dissector(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_test_run_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_test_run_nf($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_prog_test_run_nf(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_test_run_raw_tp($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_prog_test_run_raw_tp(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_test_run_sk_lookup($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_prog_test_run_sk_lookup(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_test_run_skb($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_prog_test_run_skb(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_test_run_syscall($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_prog_test_run_syscall(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_test_run_tracing($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_prog_test_run_tracing(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_test_run_xdp($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_prog_test_run_xdp(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_remove_insns(Ptr<bpf_prog> prog, @Unsigned int off, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_rstat_flush(Ptr<runtime.cgroup> cgrp, Ptr<runtime.cgroup> parent, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_rstat_kfunc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bpf_seq_read(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_redirect_hash(@Unsigned long skb, @Unsigned long map2, @Unsigned long key2, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_redirect_map(@Unsigned long skb, @Unsigned long map2, @Unsigned long key2, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_hash_update(@Unsigned long sops, @Unsigned long map2, @Unsigned long key2, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_map_update(@Unsigned long sops, @Unsigned long map2, @Unsigned long key2, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_sockmap_iter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_struct_ops_desc*)bpf_struct_ops_find($arg1, $arg2))")
    public static Ptr<bpf_struct_ops_desc> bpf_struct_ops_find(Ptr<runtime.btf> btf2, @Unsigned int type_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_struct_ops_desc*)bpf_struct_ops_find_value($arg1, $arg2))")
    public static Ptr<bpf_struct_ops_desc> bpf_struct_ops_find_value(Ptr<runtime.btf> btf2, @Unsigned int value_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_task_storage_delete(@Unsigned long map2, @Unsigned long task2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_task_storage_delete_recur(@Unsigned long map2, @Unsigned long task2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_task_storage_free(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_task_storage_get(@Unsigned long map2, @Unsigned long task2, @Unsigned long value, @Unsigned long flags, @Unsigned long gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_task_storage_get_recur(@Unsigned long map2, @Unsigned long task2, @Unsigned long value, @Unsigned long flags, @Unsigned long gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_test_run(Ptr<bpf_prog> prog, Ptr<?> ctx, @Unsigned int repeat, Ptr<@Unsigned Integer> retval, Ptr<@Unsigned Integer> time, boolean xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_test_run_xdp_live(Ptr<bpf_prog> prog, Ptr<XdpDefinitions.xdp_buff> ctx, @Unsigned int repeat, @Unsigned int batch_size, Ptr<@Unsigned Integer> time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_test_timer_continue(Ptr<bpf_test_timer> t, int iterations, @Unsigned int repeat, Ptr<Integer> err, Ptr<@Unsigned Integer> duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_user_rnd_init_once() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_user_rnd_u32(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_verifier_log_write($arg1, (const u8*)$arg2, $arg3_)")
    public static void bpf_verifier_log_write(Ptr<bpf_verifier_env> env, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_verifier_vlog($arg1, (const u8*)$arg2, $arg3)")
    public static void bpf_verifier_vlog(Ptr<bpf_verifier_log> log, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_vlog_finalize(Ptr<bpf_verifier_log> log, Ptr<@Unsigned Integer> log_size_actual) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_vlog_init(Ptr<bpf_verifier_log> log, @Unsigned int log_level, String log_buf, @Unsigned int log_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_vlog_reset(Ptr<bpf_verifier_log> log, @Unsigned long new_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_vlog_reverse_ubuf(Ptr<bpf_verifier_log> log, int start, int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_async_init(Ptr<bpf_async_kern> async2, Ptr<bpf_map> map2, @Unsigned long flags, bpf_async_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)__bpf_dynptr_data((const struct bpf_dynptr_kern*)$arg1, $arg2))")
    public static Ptr<?> __bpf_dynptr_data(Ptr<bpf_dynptr_kern> ptr, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_dynptr_data_rw((const struct bpf_dynptr_kern*)$arg1, $arg2)")
    public static Ptr<?> __bpf_dynptr_data_rw(Ptr<bpf_dynptr_kern> ptr, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_dynptr_is_rdonly((const struct bpf_dynptr_kern*)$arg1)")
    public static boolean __bpf_dynptr_is_rdonly(Ptr<bpf_dynptr_kern> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_dynptr_size((const struct bpf_dynptr_kern*)$arg1)")
    public static @Unsigned int __bpf_dynptr_size(Ptr<bpf_dynptr_kern> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_hash_map_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<HtabDefinitions.htab_elem> elem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_obj_drop_impl($arg1, (const struct btf_record*)$arg2, $arg3)")
    public static void __bpf_obj_drop_impl(Ptr<?> p, Ptr<BtfDefinitions.btf_record> rec, boolean percpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_prog_run_save_cb((const struct bpf_prog*)$arg1, (const void*)$arg2)")
    public static @Unsigned int __bpf_prog_run_save_cb(Ptr<bpf_prog> prog, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_spin_lock_irqsave(Ptr<bpf_spin_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_spin_unlock_irqrestore(Ptr<bpf_spin_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_strtoull((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int __bpf_strtoull(String buf, @Unsigned long buf_len, @Unsigned long flags, Ptr<@Unsigned Long> res, Ptr<@OriginalName(value="bool") Boolean> is_negative) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_aer_event($arg1, (const u8*)$arg2, (const unsigned int)$arg3, (const u8)$arg4, (const u8)$arg5, $arg6)")
    public static void __bpf_trace_aer_event(Ptr<?> __data, String dev_name, @Unsigned int status, char severity2, char tlp_header_valid, Ptr<PcieDefinitions.pcie_tlp_log> tlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_arm_event($arg1, (const struct cper_sec_proc_arm*)$arg2)")
    public static void __bpf_trace_arm_event(Ptr<?> __data, Ptr<CperDefinitions.cper_sec_proc_arm> proc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cache_tag_flush(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag, @Unsigned long start, @Unsigned long end, @Unsigned long addr2, @Unsigned long pages, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cache_tag_log(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cdev_update(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_clk(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_clk_duty_cycle(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_duty> duty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_clk_parent(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_clk_phase(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, int phase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_clk_rate(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_clk_rate_range(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long min, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_clk_rate_request(Ptr<?> __data, Ptr<ClkDefinitions.clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_clock($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_clock(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_compact_retry(Ptr<?> __data, int order, misc.compact_priority priority, misc.compact_result result, int retries, int max_retries, boolean ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_console($arg1, (const u8*)$arg2, $arg3)")
    public static void __bpf_trace_console(Ptr<?> __data, String text, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_context_tracking_user(Ptr<?> __data, int dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cpu(Ptr<?> __data, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cpu_frequency_limits(Ptr<?> __data, Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cpu_idle_miss(Ptr<?> __data, @Unsigned int cpu_id2, @Unsigned int state2, boolean below) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cpu_latency_qos_request(Ptr<?> __data, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_dev_pm_qos_request($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_dev_pm_qos_request(Ptr<?> __data, String name, DevDefinitions.dev_pm_qos_req_type type2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_device_pm_callback_end(Ptr<?> __data, Ptr<runtime.device> dev, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_device_pm_callback_start($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __bpf_trace_device_pm_callback_start(Ptr<?> __data, Ptr<runtime.device> dev, String pm_ops, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_extlog_mem_event($arg1, $arg2, $arg3, (const struct {\n  u8 b[16];\n}*)$arg4, (const u8*)$arg5, $arg6)")
    public static void __bpf_trace_extlog_mem_event(Ptr<?> __data, Ptr<CperDefinitions.cper_sec_mem_err> mem, @Unsigned int err_seq, Ptr< @OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_finish_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_guest_halt_poll_ns(Ptr<?> __data, boolean grow, @Unsigned int _new, @Unsigned int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hrtimer_class(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hrtimer_expire_entry(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, Ptr<@OriginalName(value="ktime_t") Long> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hrtimer_init(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, @OriginalName(value="clockid_t") int clockid, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hrtimer_start(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iommu_device_event(Ptr<?> __data, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iommu_error(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned long iova2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iommu_group_event(Ptr<?> __data, int group_id, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_itimer_expire(Ptr<?> __data, int which, Ptr<runtime.pid> pid2, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_itimer_state($arg1, $arg2, (const const struct itimerspec64*)$arg3, $arg4)")
    public static void __bpf_trace_itimer_state(Ptr<?> __data, int which, Ptr<runtime.itimerspec64> value, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_kcompactd_wake_template(Ptr<?> __data, int nid, int order, ZoneDefinitions.zone_type highest_zoneidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_map(Ptr<?> __data, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mark_victim(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, @Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_mc_event($arg1, (const unsigned int)$arg2, (const u8*)$arg3, (const u8*)$arg4, (const int)$arg5, (const u8)$arg6, (const s8)$arg7, (const s8)$arg8, (const s8)$arg9, $arg10, (const u8)$arg11, $arg12, (const u8*)$arg13)")
    public static void __bpf_trace_mc_event(Ptr<?> __data, @Unsigned int err_type, String error_msg, String label, int error_count, char mc_index, @OriginalName(value="s8") byte top_layer, @OriginalName(value="s8") byte mid_layer, @OriginalName(value="s8") byte low_layer, @Unsigned long address, char grain_bits, @Unsigned long syndrome, String driver_detail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mce_record(Ptr<?> __data, Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_memory_failure_event(Ptr<?> __data, @Unsigned long pfn, int type2, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_compaction_begin(Ptr<?> __data, Ptr<misc.compact_control> cc, @Unsigned long zone_start, @Unsigned long zone_end, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_compaction_defer_template(Ptr<?> __data, Ptr<runtime.zone> zone2, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_compaction_end(Ptr<?> __data, Ptr<misc.compact_control> cc, @Unsigned long zone_start, @Unsigned long zone_end, boolean sync2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_compaction_isolate_template(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long nr_scanned, @Unsigned long nr_taken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_compaction_kcompactd_sleep(Ptr<?> __data, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_compaction_migratepages(Ptr<?> __data, @Unsigned int nr_migratepages, @Unsigned int nr_succeeded) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_compaction_suitable_template(Ptr<?> __data, Ptr<runtime.zone> zone2, int order, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_compaction_try_to_compact_pages(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int prio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_shrink_slab_end(Ptr<?> __data, Ptr<runtime.shrinker> shr, int nid, int shrinker_retval, long unused_scan_cnt, long new_scan_cnt, long total_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_shrink_slab_start(Ptr<?> __data, Ptr<runtime.shrinker> shr, Ptr<ShrinkDefinitions.shrink_control> sc, long nr_objects_to_shrink, @Unsigned long cache_items, @Unsigned long delta, @Unsigned long total_scan, int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_direct_reclaim_begin_template(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_direct_reclaim_end_template(Ptr<?> __data, @Unsigned long nr_reclaimed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_kswapd_sleep(Ptr<?> __data, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_kswapd_wake(Ptr<?> __data, int nid, int zid, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_lru_isolate(Ptr<?> __data, int highest_zoneidx, int order, @Unsigned long nr_requested, @Unsigned long nr_scanned, @Unsigned long nr_skipped, @Unsigned long nr_taken, int lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_lru_shrink_active(Ptr<?> __data, int nid, @Unsigned long nr_taken, @Unsigned long nr_active, @Unsigned long nr_deactivated, @Unsigned long nr_referenced, int priority, int file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_lru_shrink_inactive(Ptr<?> __data, int nid, @Unsigned long nr_scanned, @Unsigned long nr_reclaimed, Ptr<ReclaimDefinitions.reclaim_stat> stat2, int priority, int file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_node_reclaim_begin(Ptr<?> __data, int nid, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_throttled(Ptr<?> __data, int nid, int usec_timeout, int usec_delayed, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_wakeup_kswapd(Ptr<?> __data, int nid, int zid, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_vmscan_write_folio(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_mmap_lock($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __bpf_trace_mmap_lock(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_mmap_lock_acquire_returned($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __bpf_trace_mmap_lock_acquire_returned(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2, boolean success) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mmc_request_done(Ptr<?> __data, Ptr<MmcDefinitions.mmc_host> host, Ptr<MmcDefinitions.mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mmc_request_start(Ptr<?> __data, Ptr<MmcDefinitions.mmc_host> host, Ptr<MmcDefinitions.mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_non_standard_event($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, (const struct {\n  u8 b[16];\n}*)$arg3, (const u8*)$arg4, (const u8)$arg5, (const u8*)$arg6, (const unsigned int)$arg7)")
    public static void __bpf_trace_non_standard_event(Ptr<?> __data, Ptr< @OriginalName(value="guid_t") misc.uuid_t> sec_type, Ptr< @OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev, Ptr<Character> err, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_oom_score_adj_update(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pm_qos_update(Ptr<?> __data, PmDefinitions.pm_qos_req_action action, int prev_value, int curr_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_power_domain($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_power_domain(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_powernv_throttle($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __bpf_trace_powernv_throttle(Ptr<?> __data, int chip_id, String reason, int pmax) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_prq_report(Ptr<?> __data, Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned long dw0, @Unsigned long dw1, @Unsigned long dw2, @Unsigned long dw3, @Unsigned long seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pstate_sample(Ptr<?> __data, @Unsigned int core_busy, @Unsigned int scaled_busy, @Unsigned int from, @Unsigned int to, @Unsigned long mperf, @Unsigned long aperf, @Unsigned long tsc, @Unsigned int freq, @Unsigned int io_boost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_qi_submit(Ptr<?> __data, Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned long qw0, @Unsigned long qw1, @Unsigned long qw2, @Unsigned long qw3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_rcu_stall_warning($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void __bpf_trace_rcu_stall_warning(Ptr<?> __data, String rcuname, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_rcu_utilization($arg1, (const u8*)$arg2)")
    public static void __bpf_trace_rcu_utilization(Ptr<?> __data, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_reclaim_retry_zone(Ptr<?> __data, Ptr<runtime.zoneref> zoneref2, int order, @Unsigned long reclaimable, @Unsigned long available, @Unsigned long min_wmark, int no_progress_loops, boolean wmark_check) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_regcache_drop_region(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int from, @Unsigned int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_regcache_sync($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void __bpf_trace_regcache_sync(Ptr<?> __data, Ptr<runtime.regmap> map2, String type2, String status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_regmap_async(Ptr<?> __data, Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_regmap_block(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_regmap_bool(Ptr<?> __data, Ptr<runtime.regmap> map2, boolean flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_regmap_bulk($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void __bpf_trace_regmap_bulk(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, int val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_regmap_reg(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_signal_deliver(Ptr<?> __data, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<KDefinitions.k_sigaction> ka) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_signal_generate(Ptr<?> __data, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> task2, int group, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_skip_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_start_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_suspend_resume($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_suspend_resume(Ptr<?> __data, String action, int val, boolean start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sync_timeline(Ptr<?> __data, Ptr<SyncDefinitions.sync_timeline> timeline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_task_newtask(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_task_rename($arg1, $arg2, (const u8*)$arg3)")
    public static void __bpf_trace_task_rename(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, String comm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_thermal_power_devfreq_get_power(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, Ptr<DevfreqDefinitions.devfreq_dev_status> status, @Unsigned long freq, @Unsigned int power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_thermal_power_devfreq_limit(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long freq, @Unsigned long cdev_state, @Unsigned int power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_thermal_temperature(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_thermal_zone_trip(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int trip, ThermalDefinitions.thermal_trip_type trip_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tick_stop(Ptr<?> __data, int success, int dependency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_timer_base_idle(Ptr<?> __data, boolean is_idle, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_timer_class(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_timer_expire_entry(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long baseclk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_timer_start(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long bucket_expiry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_unmap(Ptr<?> __data, @Unsigned long iova2, @Unsigned long size, @Unsigned long unmapped_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_activate(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean can_reserve, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_alloc(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, boolean reserved, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_alloc_managed(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_config(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int apicdest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_free_moved(Ptr<?> __data, @Unsigned int irq, @Unsigned int cpu2, @Unsigned int vector, boolean is_managed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_mod(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int prev_vector, @Unsigned int prev_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_reserve(Ptr<?> __data, @Unsigned int irq, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_setup(Ptr<?> __data, @Unsigned int irq, boolean is_legacy, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vector_teardown(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean has_reserved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_wake_reaper(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_wakeup_source($arg1, (const u8*)$arg2, $arg3)")
    public static void __bpf_trace_wakeup_source(Ptr<?> __data, String name, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_watchdog_set_timeout(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, @Unsigned int timeout, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_watchdog_template(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_x86_fpu(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_x86_irq_vector(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xen_cpu_load_idt($arg1, (const struct desc_ptr*)$arg2)")
    public static void __bpf_trace_xen_cpu_load_idt(Ptr<?> __data, Ptr<DescDefinitions.desc_ptr> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xen_cpu_set_ldt($arg1, (const void*)$arg2, $arg3)")
    public static void __bpf_trace_xen_cpu_set_ldt(Ptr<?> __data, Ptr<?> addr2, @Unsigned int entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xen_cpu_write_gdt_entry($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void __bpf_trace_xen_cpu_write_gdt_entry(Ptr<?> __data, Ptr<DescDefinitions.desc_struct> dt, int entrynum, Ptr<?> desc, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xen_cpu_write_idt_entry($arg1, $arg2, $arg3, (const gate_struct*)$arg4)")
    public static void __bpf_trace_xen_cpu_write_idt_entry(Ptr<?> __data, Ptr< @OriginalName(value="gate_desc") misc.gate_struct> dt, int entrynum, Ptr< @OriginalName(value="gate_desc") misc.gate_struct> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_cpu_write_ldt_entry(Ptr<?> __data, Ptr<DescDefinitions.desc_struct> dt, int entrynum, @Unsigned long desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mc__batch(Ptr<?> __data, XenDefinitions.xen_lazy_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mc_callback(Ptr<?> __data, @OriginalName(value="xen_mc_callback_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mc_entry(Ptr<?> __data, Ptr<misc.multicall_entry> mc, @Unsigned int nargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mc_entry_alloc(Ptr<?> __data, @Unsigned long args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mc_extend_args(Ptr<?> __data, @Unsigned long op, @Unsigned long args, XenDefinitions.xen_mc_extend_args res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mc_flush(Ptr<?> __data, @Unsigned int mcidx, @Unsigned int argidx, @Unsigned int cbidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mc_flush_reason(Ptr<?> __data, XenDefinitions.xen_mc_flush_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu__set_pte(Ptr<?> __data, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_alloc_ptpage(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn, @Unsigned int level, boolean pinned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_xen_mmu_flush_tlb_multi($arg1, (const struct cpumask*)$arg2, $arg3, $arg4, $arg5)")
    public static void __bpf_trace_xen_mmu_flush_tlb_multi(Ptr<?> __data, Ptr<runtime.cpumask> cpus, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_flush_tlb_one_user(Ptr<?> __data, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_pgd(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_ptep_modify_prot(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_release_ptpage(Ptr<?> __data, @Unsigned long pfn, @Unsigned int level, boolean pinned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_set_p4d(Ptr<?> __data, Ptr<misc.p4d_t> p4dp, Ptr<misc.p4d_t> user_p4dp, misc.p4d_t p4dval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_set_pmd(Ptr<?> __data, Ptr<PmdDefinitions.pmd_t> pmdp, PmdDefinitions.pmd_t pmdval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_set_pud(Ptr<?> __data, Ptr<PudDefinitions.pud_t> pudp, PudDefinitions.pud_t pudval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xen_mmu_write_cr3(Ptr<?> __data, boolean kernel, @Unsigned long cr3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_dbc_log_request(Ptr<?> __data, Ptr<DbcDefinitions.dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_ctrl_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_input_control_ctx> ctrl_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_container_ctx> ctx, @Unsigned int ep_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_doorbell(Ptr<?> __data, @Unsigned int slot2, @Unsigned int doorbell) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_ep_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ep_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_free_virt_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_msg(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_portsc(Ptr<?> __data, Ptr<XhciDefinitions.xhci_port> port2, @Unsigned int portsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_ring(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_slot_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_trb(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_urb(Ptr<?> __data, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_xhci_log_virt_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_arena_alloc_pages(Ptr<?> p__map, Ptr<?> addr__ign, @Unsigned int page_cnt, int node_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_arena_free_pages(Ptr<?> p__map, Ptr<?> ptr__ign, @Unsigned int page_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_base_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_base_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_bprintf_cleanup(Ptr<bpf_bprintf_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_bprintf_prepare($arg1, $arg2, (const long long unsigned int*)$arg3, $arg4, $arg5)")
    public static int bpf_bprintf_prepare(String fmt, @Unsigned int fmt_size, Ptr<@Unsigned Long> raw_args, @Unsigned int num_args, Ptr<bpf_bprintf_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_cast_to_kern_ctx(Ptr<?> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> bpf_cgroup_acquire(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> bpf_cgroup_ancestor(Ptr<runtime.cgroup> cgrp, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static CgroupDefinitions.cgroup_bpf_attach_type bpf_cgroup_atype_find(bpf_attach_type attach_type, @Unsigned int attach_btf_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_atype_get(@Unsigned int attach_btf_id, int cgroup_atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_atype_put(int cgroup_atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> bpf_cgroup_from_id(@Unsigned long cgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_cgroup_link_detach(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cgroup_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_cgroup_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_cgroup_link_show_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void bpf_cgroup_link_show_fdinfo(Ptr<bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_release(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_release_dtor(Ptr<?> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_cgroup_storage> bpf_cgroup_storage_alloc(Ptr<bpf_prog> prog, bpf_cgroup_storage_type stype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_cgroup_storage_assign(Ptr<bpf_prog_aux> aux, Ptr<bpf_map> _map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_storage_free(Ptr<bpf_cgroup_storage> storage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_storage_link(Ptr<bpf_cgroup_storage> storage, Ptr<runtime.cgroup> cgroup2, bpf_attach_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_storage_unlink(Ptr<bpf_cgroup_storage> storage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgroup_storages_free(Ptr<Ptr<bpf_cgroup_storage>> storages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_copy_from_user(@Unsigned long dst, @Unsigned long size, @Unsigned long user_ptr, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_copy_from_user_str($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int bpf_copy_from_user_str(Ptr<?> dst, @Unsigned int dst__sz, Ptr<?> unsafe_ptr__ign, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_copy_from_user_task(@Unsigned long dst, @Unsigned long size, @Unsigned long user_ptr, @Unsigned long tsk, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_crypt((const struct bpf_crypto_ctx*)$arg1, (const struct bpf_dynptr_kern*)$arg2, (const struct bpf_dynptr_kern*)$arg3, (const struct bpf_dynptr_kern*)$arg4, $arg5)")
    public static int bpf_crypto_crypt(Ptr<bpf_crypto_ctx> ctx, Ptr<bpf_dynptr_kern> src, Ptr<bpf_dynptr_kern> dst, Ptr<bpf_dynptr_kern> siv, boolean decrypt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_crypto_ctx> bpf_crypto_ctx_acquire(Ptr<bpf_crypto_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_ctx_create((const struct bpf_crypto_params*)$arg1, $arg2, $arg3)")
    public static Ptr<bpf_crypto_ctx> bpf_crypto_ctx_create(Ptr<bpf_crypto_params> params, @Unsigned int params__sz, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_crypto_ctx_release(Ptr<bpf_crypto_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_decrypt($arg1, (const struct bpf_dynptr*)$arg2, (const struct bpf_dynptr*)$arg3, (const struct bpf_dynptr*)$arg4)")
    public static int bpf_crypto_decrypt(Ptr<bpf_crypto_ctx> ctx, Ptr<bpf_dynptr> src, Ptr<bpf_dynptr> dst, Ptr<bpf_dynptr> siv__nullable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_encrypt($arg1, (const struct bpf_dynptr*)$arg2, (const struct bpf_dynptr*)$arg3, (const struct bpf_dynptr*)$arg4)")
    public static int bpf_crypto_encrypt(Ptr<bpf_crypto_ctx> ctx, Ptr<bpf_dynptr> src, Ptr<bpf_dynptr> dst, Ptr<bpf_dynptr> siv__nullable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_register_type((const struct bpf_crypto_type*)$arg1)")
    public static int bpf_crypto_register_type(Ptr<bpf_crypto_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_unregister_type((const struct bpf_crypto_type*)$arg1)")
    public static int bpf_crypto_unregister_type(Ptr<bpf_crypto_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_current_task_under_cgroup(@Unsigned long map2, @Unsigned long idx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dummy_init(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dummy_init_member((const struct btf_type*)$arg1, (const struct btf_member*)$arg2, $arg3, (const void*)$arg4)")
    public static int bpf_dummy_init_member(Ptr<BtfDefinitions.btf_type> t, Ptr<BtfDefinitions.btf_member> member, Ptr<?> kdata, Ptr<?> udata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dummy_ops__test_1(Ptr<bpf_dummy_ops_state> cb__nullable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dummy_ops_btf_struct_access($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int bpf_dummy_ops_btf_struct_access(Ptr<bpf_verifier_log> log, Ptr<bpf_reg_state> reg, int off, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dummy_ops_check_member((const struct btf_type*)$arg1, (const struct btf_member*)$arg2, (const struct bpf_prog*)$arg3)")
    public static int bpf_dummy_ops_check_member(Ptr<BtfDefinitions.btf_type> t, Ptr<BtfDefinitions.btf_member> member, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dummy_ops_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean bpf_dummy_ops_is_valid_access(int off, int size, bpf_access_type type2, Ptr<bpf_prog> prog, Ptr<bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dummy_reg(Ptr<?> kdata, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dummy_struct_ops_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dummy_test_2(Ptr<bpf_dummy_ops_state> cb, int a1, @Unsigned short a2, char a3, @Unsigned long a4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dummy_test_sleepable(Ptr<bpf_dummy_ops_state> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_dummy_unreg(Ptr<?> kdata, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_adjust((const struct bpf_dynptr*)$arg1, $arg2, $arg3)")
    public static int bpf_dynptr_adjust(Ptr<bpf_dynptr> p, @Unsigned int start, @Unsigned int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dynptr_check_size(@Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_clone((const struct bpf_dynptr*)$arg1, $arg2)")
    public static int bpf_dynptr_clone(Ptr<bpf_dynptr> p, Ptr<bpf_dynptr> clone__uninit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_dynptr_data(@Unsigned long ptr, @Unsigned long offset, @Unsigned long len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_dynptr_from_mem(@Unsigned long data, @Unsigned long size, @Unsigned long flags, @Unsigned long ptr, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_dynptr_init(Ptr<bpf_dynptr_kern> ptr, Ptr<?> data, bpf_dynptr_type type2, @Unsigned int offset, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_is_null((const struct bpf_dynptr*)$arg1)")
    public static boolean bpf_dynptr_is_null(Ptr<bpf_dynptr> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_is_rdonly((const struct bpf_dynptr*)$arg1)")
    public static boolean bpf_dynptr_is_rdonly(Ptr<bpf_dynptr> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_dynptr_read(@Unsigned long dst, @Unsigned long len, @Unsigned long src, @Unsigned long offset, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_dynptr_set_null(Ptr<bpf_dynptr_kern> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_dynptr_set_rdonly(Ptr<bpf_dynptr_kern> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_size((const struct bpf_dynptr*)$arg1)")
    public static @Unsigned int bpf_dynptr_size(Ptr<bpf_dynptr> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_slice((const struct bpf_dynptr*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<?> bpf_dynptr_slice(Ptr<bpf_dynptr> p, @Unsigned int offset, Ptr<?> buffer__opt, @Unsigned int buffer__szk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dynptr_slice_rdwr((const struct bpf_dynptr*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<?> bpf_dynptr_slice_rdwr(Ptr<bpf_dynptr> p, @Unsigned int offset, Ptr<?> buffer__opt, @Unsigned int buffer__szk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_dynptr_write(@Unsigned long dst, @Unsigned long offset, @Unsigned long src, @Unsigned long len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_event_output_data(@Unsigned long ctx, @Unsigned long map2, @Unsigned long flags, @Unsigned long data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fd_htab_map_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fd_htab_map_update_elem(Ptr<bpf_map> map2, Ptr<runtime.file> map_file, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_fd_inode_storage_delete_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_fd_inode_storage_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_fd_inode_storage_update_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_fd_pass((const struct file*)$arg1, $arg2)")
    public static int bpf_fd_pass(Ptr<runtime.file> file2, @Unsigned int sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_for_each_hash_elem(Ptr<bpf_map> map2, @OriginalName(value="bpf_callback_t") Ptr<?> callback_fn, Ptr<?> callback_ctx, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_free_fc(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_fs_kfuncs_filter((const struct bpf_prog*)$arg1, $arg2)")
    public static int bpf_fs_kfuncs_filter(Ptr<bpf_prog> prog, @Unsigned int kfunc_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fs_kfuncs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_ancestor_cgroup_id(@Unsigned long ancestor_level, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_cgroup_id(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_comm(@Unsigned long buf, @Unsigned long size, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_pid_tgid(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_uid_gid(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_dentry_xattr($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_get_dentry_xattr(Ptr<runtime.dentry> dentry2, String name__str, Ptr<bpf_dynptr> value_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_file_xattr($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_get_file_xattr(Ptr<runtime.file> file2, String name__str, Ptr<bpf_dynptr> value_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_inode($arg1, (const struct inode*)$arg2, $arg3)")
    public static Ptr<runtime.inode> bpf_get_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> dir, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_local_storage(@Unsigned long map2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_netns_cookie_sockopt(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_ns_current_pid_tgid(@Unsigned long dev, @Unsigned long ino, @Unsigned long nsdata, @Unsigned long size, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_numa_node_id(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_retval(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_smp_processor_id(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> bpf_get_task_exe_file(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_uprobe_info((const struct perf_event*)$arg1, $arg2, (const u8**)$arg3, $arg4, $arg5, $arg6)")
    public static int bpf_get_uprobe_info(Ptr<PerfDefinitions.perf_event> event2, Ptr<@Unsigned Integer> fd_type, Ptr<String> filename2, Ptr<@Unsigned Long> probe_offset, Ptr<@Unsigned Long> probe_addr, boolean perf_type_tracepoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HtabDefinitions.htab_elem> bpf_hash_map_seq_find_next(Ptr<bpf_iter_seq_hash_map_info> info2, Ptr<HtabDefinitions.htab_elem> prev_elem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_hash_map_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_hash_map_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_hash_map_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_hash_map_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_inode_storage_delete(@Unsigned long map2, @Unsigned long inode2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_inode_storage_free(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_inode_storage_get(@Unsigned long map2, @Unsigned long inode2, @Unsigned long value, @Unsigned long flags, @Unsigned long gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_attach_map(Ptr<bpf_prog> prog, Ptr<bpf_iter_link_info> linfo, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_bits_destroy(Ptr<bpf_iter_bits> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_bits_new($arg1, (const long long unsigned int*)$arg2, $arg3)")
    public static int bpf_iter_bits_new(Ptr<bpf_iter_bits> it, Ptr<@Unsigned Long> unsafe_ptr__ign, @Unsigned int nr_words) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Integer> bpf_iter_bits_next(Ptr<bpf_iter_bits> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_bpf_map(Ptr<bpf_iter_meta> meta, Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_bpf_map_elem(Ptr<bpf_iter_meta> meta, Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_detach_map(Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_fini_hash_map(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_init_hash_map(Ptr<?> priv_data, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_map_fill_link_info((const struct bpf_iter_aux_info*)$arg1, $arg2)")
    public static int bpf_iter_map_fill_link_info(Ptr<bpf_iter_aux_info> aux, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_map_show_fdinfo((const struct bpf_iter_aux_info*)$arg1, $arg2)")
    public static void bpf_iter_map_show_fdinfo(Ptr<bpf_iter_aux_info> aux, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_jiffies64(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_kill_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_kptr_xchg(@Unsigned long dst, @Unsigned long ptr, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ktime_get_boot_ns(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ktime_get_coarse_ns(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ktime_get_ns(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ktime_get_tai_ns(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_list_head_free((const struct btf_field*)$arg1, $arg2, $arg3)")
    public static void bpf_list_head_free(Ptr<BtfDefinitions.btf_field> field, Ptr<?> list_head2, Ptr<bpf_spin_lock> spin_lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_list_node> bpf_list_pop_back(Ptr<bpf_list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_list_node> bpf_list_pop_front(Ptr<bpf_list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_list_push_back_impl(Ptr<bpf_list_head> head, Ptr<bpf_list_node> node2, Ptr<?> meta__ign, @Unsigned long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_list_push_front_impl(Ptr<bpf_list_head> head, Ptr<bpf_list_node> node2, Ptr<?> meta__ign, @Unsigned long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> bpf_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_map_delete_elem(@Unsigned long map2, @Unsigned long key2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_iter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_map_lookup_elem(@Unsigned long map2, @Unsigned long key2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_map_lookup_percpu_elem(@Unsigned long map2, @Unsigned long key2, @Unsigned long cpu2, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_map_peek_elem(@Unsigned long map2, @Unsigned long value, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_map_pop_elem(@Unsigned long map2, @Unsigned long value, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_map_push_elem(@Unsigned long map2, @Unsigned long value, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_map_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_map_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_sum_elem_count((const struct bpf_map*)$arg1)")
    public static long bpf_map_sum_elem_count(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_map_update_elem(@Unsigned long map2, @Unsigned long key2, @Unsigned long value, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mklink(Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mkmap(Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_mkobj_ops($arg1, $arg2, $arg3, (const struct inode_operations*)$arg4, (const struct file_operations*)$arg5)")
    public static int bpf_mkobj_ops(Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<?> raw, Ptr<InodeDefinitions.inode_operations> iops, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mkprog(Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mptcp_kfunc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MptcpDefinitions.mptcp_sock> bpf_mptcp_sock_from_subflow(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_obj_drop_impl(Ptr<?> p__alloc, Ptr<?> meta__ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_obj_get_user($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_obj_get_user(int path_fd, String pathname, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_obj_memcpy(Ptr<BtfDefinitions.btf_record> rec, Ptr<?> dst, Ptr<?> src, @Unsigned int size, boolean long_memcpy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_obj_new_impl(@Unsigned long local_type_id__k, Ptr<?> meta__ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_obj_pin_user($arg1, $arg2, (const u8*)$arg3)")
    public static int bpf_obj_pin_user(@Unsigned int ufd, int path_fd, String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_path_d_path(Ptr<runtime.path> path2, String buf, @Unsigned long buf__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_per_cpu_ptr(@Unsigned long ptr, @Unsigned long cpu2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_percpu_cgroup_storage_copy(Ptr<bpf_map> _map, Ptr<?> key2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_percpu_cgroup_storage_update(Ptr<bpf_map> _map, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_percpu_hash_copy(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_percpu_hash_update(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_percpu_obj_drop_impl(Ptr<?> p__alloc, Ptr<?> meta__ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_percpu_obj_new_impl(@Unsigned long local_type_id__k, Ptr<?> meta__ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_preempt_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_preempt_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_get_type_path((const u8*)$arg1, $arg2)")
    public static Ptr<bpf_prog> bpf_prog_get_type_path(String name, bpf_prog_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_put_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_rb_root_free((const struct btf_field*)$arg1, $arg2, $arg3)")
    public static void bpf_rb_root_free(Ptr<BtfDefinitions.btf_field> field, Ptr<?> rb_root2, Ptr<bpf_spin_lock> spin_lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_rbtree_add_impl($arg1, $arg2, (_Bool (*)(struct bpf_rb_node*, const struct bpf_rb_node*))$arg3, $arg4, $arg5)")
    public static int bpf_rbtree_add_impl(Ptr<bpf_rb_root> root, Ptr<bpf_rb_node> node2, Ptr<?> less, Ptr<?> meta__ign, @Unsigned long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_rb_node> bpf_rbtree_first(Ptr<bpf_rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_rb_node> bpf_rbtree_remove(Ptr<bpf_rb_root> root, Ptr<bpf_rb_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_rcu_read_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_rcu_read_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_rdonly_cast((const void*)$arg1, $arg2)")
    public static Ptr<?> bpf_rdonly_cast(Ptr<?> obj__ign, @Unsigned int btf_id__k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_refcount_acquire_impl(Ptr<?> p__refcounted_kptr, Ptr<?> meta__ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_set_retval(@Unsigned long retval, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_sk_lookup_run_v4((const struct net*)$arg1, $arg2, (const unsigned int)$arg3, (const short unsigned int)$arg4, (const unsigned int)$arg5, (const short unsigned int)$arg6, (const int)$arg7, $arg8)")
    public static boolean bpf_sk_lookup_run_v4(Ptr<runtime.net> net2, int protocol, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned short dport, int ifindex, Ptr<Ptr<runtime.sock>> psk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_sk_lookup_run_v6((const struct net*)$arg1, $arg2, (const struct in6_addr*)$arg3, (const short unsigned int)$arg4, (const struct in6_addr*)$arg5, (const short unsigned int)$arg6, (const int)$arg7, $arg8)")
    public static boolean bpf_sk_lookup_run_v6(Ptr<runtime.net> net2, int protocol, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned short dport, int ifindex, Ptr<Ptr<runtime.sock>> psk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_skops_hdr_opt_len(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> syn_skb, TcpDefinitions.tcp_synack_type synack_type, Ptr<TcpDefinitions.tcp_out_options> opts, Ptr<@Unsigned Integer> remaining) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_skops_write_hdr_opt(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> syn_skb, TcpDefinitions.tcp_synack_type synack_type, Ptr<TcpDefinitions.tcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_snprintf(@Unsigned long str, @Unsigned long str_size, @Unsigned long fmt, @Unsigned long args, @Unsigned long data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_spin_unlock(@Unsigned long lock, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_stack_walker(Ptr<?> cookie, @Unsigned long ip, @Unsigned long sp, @Unsigned long bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_strncmp(@Unsigned long s1, @Unsigned long s1_sz, @Unsigned long s2, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_strtol(@Unsigned long buf, @Unsigned long buf_len, @Unsigned long flags, @Unsigned long res, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_strtoul(@Unsigned long buf, @Unsigned long buf_len, @Unsigned long flags, @Unsigned long res, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_struct_ops_test_run($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int bpf_struct_ops_test_run(Ptr<bpf_prog> prog, Ptr<bpf_attr> kattr, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int bpf_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sysctl_get_current_value(@Unsigned long ctx, @Unsigned long buf, @Unsigned long buf_len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sysctl_get_name(@Unsigned long ctx, @Unsigned long buf, @Unsigned long buf_len, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sysctl_get_new_value(@Unsigned long ctx, @Unsigned long buf, @Unsigned long buf_len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sysctl_set_new_value(@Unsigned long ctx, @Unsigned long buf, @Unsigned long buf_len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> bpf_task_acquire(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> bpf_task_from_pid(int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cgroup> bpf_task_get_cgroup1(Ptr<TaskDefinitions.task_struct> task2, int hierarchy_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_task_release(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_task_release_dtor(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_task_under_cgroup(Ptr<TaskDefinitions.task_struct> task2, Ptr<runtime.cgroup> ancestor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_this_cpu_ptr(@Unsigned long percpu_ptr, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_throw(@Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_timer_cancel(@Unsigned long timer, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_timer_cancel_and_free(Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart bpf_timer_cb(Ptr<runtime.hrtimer> hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_timer_delete_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_timer_init(@Unsigned long timer, @Unsigned long map2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_timer_set_callback(@Unsigned long timer, @Unsigned long callback_fn, @Unsigned long aux, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_timer_start(@Unsigned long timer, @Unsigned long nsecs, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_wq_cancel_and_free(Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_wq_delete_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_wq_init(Ptr<bpf_wq> wq, Ptr<?> p__map, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_wq_set_callback_impl($arg1, (int (*)(void*, int*, void*))$arg2, $arg3, $arg4)")
    public static int bpf_wq_set_callback_impl(Ptr<bpf_wq> wq, Ptr<?> callback_fn, @Unsigned int flags, Ptr<?> aux__ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_wq_start(Ptr<bpf_wq> wq, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_wq_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<XfrmDefinitions.xfrm_state> bpf_xdp_get_xfrm_state(Ptr<XdpDefinitions.xdp_md> ctx, Ptr<bpf_xfrm_state_opts> opts, @Unsigned int opts__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_xdp_xfrm_state_release(Ptr<XfrmDefinitions.xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __bpf_get_stack(Ptr<PtDefinitions.pt_regs> regs, Ptr<TaskDefinitions.task_struct> task2, Ptr<PerfDefinitions.perf_callchain_entry> trace_in, Ptr<?> buf, @Unsigned int size, @Unsigned long flags, boolean may_fault) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __bpf_get_stackid(Ptr<bpf_map> map2, Ptr<PerfDefinitions.perf_callchain_entry> trace, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __bpf_get_task_stack(Ptr<TaskDefinitions.task_struct> task2, Ptr<?> buf, @Unsigned int size, @Unsigned long flags, boolean may_fault) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_lru_list_rotate_active(Ptr<bpf_lru> lru, Ptr<bpf_lru_list> l) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_lru_list_rotate_inactive(Ptr<bpf_lru> lru, Ptr<bpf_lru_list> l) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __bpf_lru_list_shrink(Ptr<bpf_lru> lru, Ptr<bpf_lru_list> l, @Unsigned int tgt_nshrink, Ptr<ListDefinitions.list_head> free_list, bpf_lru_list_type tgt_free_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_lru_node_move(Ptr<bpf_lru_list> l, Ptr<bpf_lru_node> node2, bpf_lru_list_type tgt_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_lru_node_move_to_free(Ptr<bpf_lru_list> l, Ptr<bpf_lru_node> node2, Ptr<ListDefinitions.list_head> free_list, bpf_lru_list_type tgt_free_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __bpf_ringbuf_reserve(Ptr<bpf_ringbuf> rb, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_tcp_ca_init(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_tcp_ca_release(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_alarm_class(Ptr<?> __data, Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_alarmtimer_suspend(Ptr<?> __data, @OriginalName(value="ktime_t") long expires, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_bmdma_status(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, @Unsigned int host_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_eh_action_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, @Unsigned int devno, @Unsigned int eh_action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_eh_link_autopsy(Ptr<?> __data, Ptr<AtaDefinitions.ata_device> dev, @Unsigned int eh_action, @Unsigned int eh_err_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_eh_link_autopsy_qc(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ata_exec_command_template($arg1, $arg2, (const struct ata_taskfile*)$arg3, $arg4)")
    public static void __bpf_trace_ata_exec_command_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_link_reset_begin_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_link_reset_end_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_port_eh_begin_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_qc_complete_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_qc_issue_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_sff_hsm_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_sff_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ata_tf_load($arg1, $arg2, (const struct ata_taskfile*)$arg3)")
    public static void __bpf_trace_ata_tf_load(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ata_transfer_data_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, @Unsigned int offset, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_balance_dirty_pages(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long thresh, @Unsigned long bg_thresh, @Unsigned long dirty, @Unsigned long bdi_thresh, @Unsigned long bdi_dirty, @Unsigned long dirty_ratelimit, @Unsigned long task_ratelimit, @Unsigned long dirtied, @Unsigned long period, long pause2, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_bdi_dirty_ratelimit(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long dirty_rate, @Unsigned long task_ratelimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_bio(Ptr<?> __data, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_bio_complete(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_bio_remap(Ptr<?> __data, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_buffer(Ptr<?> __data, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_plug(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_rq(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_rq_completion(Ptr<?> __data, Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error, @Unsigned int nr_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_rq_remap(Ptr<?> __data, Ptr<runtime.request> rq2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_rq_requeue(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_split(Ptr<?> __data, Ptr<runtime.bio> bio2, @Unsigned int new_sector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_block_unplug(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q, @Unsigned int depth, boolean explicit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_bpf_trace_printk($arg1, (const u8*)$arg2)")
    public static void __bpf_trace_bpf_trace_printk(Ptr<?> __data, String bpf_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_csd_function(Ptr<?> __data, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr< @OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_csd_queue_cpu($arg1, (const unsigned int)$arg2, $arg3, $arg4, $arg5)")
    public static void __bpf_trace_csd_queue_cpu(Ptr<?> __data, @Unsigned int cpu2, @Unsigned long callsite, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr< @OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_devres($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void __bpf_trace_devres(Ptr<?> __data, Ptr<runtime.device> dev, String op, Ptr<?> node2, String name, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_fence(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_exit_mmap(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__es_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__es_shrink_enter(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_to_scan, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__fallocate_mode(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__folio_op(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__map_blocks_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned int len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__map_blocks_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int flags, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__mb_new_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__mballoc(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__trim(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__truncate(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__write_begin(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4__write_end(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_alloc_da_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_allocate_blocks(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_request> ar, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_allocate_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_begin_ordered_truncate(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long new_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_collapse_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_da_release_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int freed_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_da_reserve_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_resv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_da_update_reserve_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int used_blocks, int quota_claim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_da_write_pages(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long first_page, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_da_write_pages_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_discard_blocks(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long blk, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_discard_preallocations(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_drop_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int drop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ext4_error($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __bpf_trace_ext4_error(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, String function, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_es_find_extent_range_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_es_find_extent_range_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_es_insert_delayed_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es, boolean lclu_allocated, boolean end_allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_es_lookup_extent_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_es_lookup_extent_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es, int found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_es_remove_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_es_shrink(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_shrunk, @Unsigned long scan_time, int nr_skipped, int retried) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_es_shrink_scan_exit(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_shrunk, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_evict_inode(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_convert_to_initialized_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_convert_to_initialized_fastpath(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux, Ptr<Ext4Definitions.ext4_extent> ix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_handle_unwritten_extents(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, int flags, @Unsigned int allocated, @Unsigned @OriginalName(value="ext4_fsblk_t") long newblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_load_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_remove_space(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_remove_space_done(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end, int depth, Ptr<misc.partial_cluster> pc, @Unsigned @OriginalName(value="__le16") short eh_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_rm_idx(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_rm_leaf(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, Ptr<Ext4Definitions.ext4_extent> ex, Ptr<misc.partial_cluster> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_ext_show_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, @Unsigned short len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fallocate_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @Unsigned int max_blocks, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_cleanup(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int full, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_commit_start(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_commit_stop(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nblks, int reason, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_replay(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int tag, int ino, int priv1, int priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_replay_scan(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int error, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_stats(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_track_dentry(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_track_inode(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fc_track_range(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, long start, long end, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_forget(Ptr<?> __data, Ptr<runtime.inode> inode2, int is_metadata, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_free_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long block, @Unsigned long count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_free_inode(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_fsmap_class(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned int keydev, @Unsigned int agno, @Unsigned long bno, @Unsigned long len, @Unsigned long owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_get_implied_cluster_alloc_exit(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_getfsmap_class(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_fsmap> fsmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_insert_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_invalidate_folio_op(Ptr<?> __data, Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_journal_start_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int blocks, int rsv_blocks, int revoke_creds, int type2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_journal_start_reserved(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int blocks, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_journal_start_sb(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int blocks, int rsv_blocks, int revoke_creds, int type2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_lazy_itable_init(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_load_inode(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_mark_inode_dirty(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_mb_discard_preallocations(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_mb_release_group_pa(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_mb_release_inode_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_prealloc_space> pa, @Unsigned long block, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_mballoc_alloc(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_mballoc_prealloc(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_nfs_commit_metadata(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_other_inode_update_time(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ino_t") long orig_ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_prefetch_bitmaps(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @Unsigned @OriginalName(value="ext4_group_t") int next, @Unsigned int prefetch_ios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_read_block_bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group, boolean prefetch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_remove_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_extent> ex, @Unsigned @OriginalName(value="ext4_lblk_t") int from, @Unsigned @OriginalName(value="ext4_fsblk_t") long to, Ptr<misc.partial_cluster> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_request_blocks(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_request> ar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_request_inode(Ptr<?> __data, Ptr<runtime.inode> dir, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_shutdown(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_sync_file_enter(Ptr<?> __data, Ptr<runtime.file> file2, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_sync_file_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_sync_fs(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_unlink_enter(Ptr<?> __data, Ptr<runtime.inode> parent, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_unlink_exit(Ptr<?> __data, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_update_sb(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long fsblk, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_writepages(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ext4_writepages_result(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, int ret, int pages_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_fib6_table_lookup($arg1, (const struct net*)$arg2, (const struct fib6_result*)$arg3, $arg4, (const struct flowi6*)$arg5)")
    public static void __bpf_trace_fib6_table_lookup(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_result> res, Ptr<Fib6Definitions.fib6_table> table, Ptr<runtime.flowi6> flp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_flush_foreign(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned int frn_bdi_id, @Unsigned int frn_memcg_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_global_dirty_state(Ptr<?> __data, @Unsigned long background_thresh, @Unsigned long dirty_thresh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_gpio_direction(Ptr<?> __data, @Unsigned int gpio, int in, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_gpio_value(Ptr<?> __data, @Unsigned int gpio, int get, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_icmp_send($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_icmp_send(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int type2, int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_inode_foreign_history(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned int history) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_inode_switch_wbs(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<BdiDefinitions.bdi_writeback> old_wb, Ptr<BdiDefinitions.bdi_writeback> new_wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_complete(Ptr<?> __data, Ptr<?> ctx, Ptr<?> req2, @Unsigned long user_data, int res, @Unsigned int cflags, @Unsigned long extra1, @Unsigned long extra2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_cqe_overflow(Ptr<?> __data, Ptr<?> ctx, @Unsigned long user_data, int res, @Unsigned int cflags, Ptr<?> ocqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_cqring_wait(Ptr<?> __data, Ptr<?> ctx, int min_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_create(Ptr<?> __data, int fd2, Ptr<?> ctx, @Unsigned int sq_entries, @Unsigned int cq_entries, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_defer(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_fail_link(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, Ptr<IoDefinitions.io_kiocb> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_file_get(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_link(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, Ptr<IoDefinitions.io_kiocb> target_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_local_work_run(Ptr<?> __data, Ptr<?> ctx, int count, @Unsigned int loops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_poll_arm(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int mask, int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_queue_async_work(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_register(Ptr<?> __data, Ptr<?> ctx, @Unsigned int opcode, @Unsigned int nr_files, @Unsigned int nr_bufs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_io_uring_req_failed($arg1, (const struct io_uring_sqe*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_io_uring_req_failed(Ptr<?> __data, Ptr<IoDefinitions.io_uring_sqe> sqe, Ptr<IoDefinitions.io_kiocb> req2, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_short_write(Ptr<?> __data, Ptr<?> ctx, @Unsigned long fpos, @Unsigned long wanted, @Unsigned long got) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_submit_req(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_task_add(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_io_uring_task_work_run(Ptr<?> __data, Ptr<?> tctx, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_iocg_inuse_update($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __bpf_trace_iocg_inuse_update(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int old_inuse, @Unsigned int new_inuse, @Unsigned long old_hw_inuse, @Unsigned long new_hw_inuse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iocost_ioc_vrate_adj(Ptr<?> __data, Ptr<runtime.ioc> ioc2, @Unsigned long new_vrate, Ptr<@Unsigned Integer> missed_ppm, @Unsigned int rq_wait_pct, int nr_lagging, int nr_shortages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_iocost_iocg_forgive_debt($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static void __bpf_trace_iocost_iocg_forgive_debt(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int usage_pct, @Unsigned long old_debt, @Unsigned long new_debt, @Unsigned long old_delay, @Unsigned long new_delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_iocost_iocg_state($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void __bpf_trace_iocost_iocg_state(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned long last_period, @Unsigned long cur_period, @Unsigned long vtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iomap_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iomap_dio_complete(Ptr<?> __data, Ptr<runtime.kiocb> iocb2, int error, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iomap_dio_rw_begin(Ptr<?> __data, Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, @Unsigned int dio_flags, @Unsigned long done_before) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_iomap_iter($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void __bpf_trace_iomap_iter(Ptr<?> __data, Ptr<IomapDefinitions.iomap_iter> iter2, Ptr<?> ops, @Unsigned long caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iomap_range_class(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iomap_readpage_class(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_iomap_writepage_map(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long pos, @Unsigned int dirty_len, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ipi_handler($arg1, (const u8*)$arg2)")
    public static void __bpf_trace_ipi_handler(Ptr<?> __data, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ipi_raise($arg1, (const struct cpumask*)$arg2, (const u8*)$arg3)")
    public static void __bpf_trace_ipi_raise(Ptr<?> __data, Ptr<runtime.cpumask> mask, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ipi_send_cpu($arg1, (const unsigned int)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_ipi_send_cpu(Ptr<?> __data, @Unsigned int cpu2, @Unsigned long callsite, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ipi_send_cpumask($arg1, (const struct cpumask*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_ipi_send_cpumask(Ptr<?> __data, Ptr<runtime.cpumask> cpumask2, @Unsigned long callsite, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_checkpoint(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_checkpoint_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, Ptr<misc.transaction_chp_stats_s> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_commit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr< @OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_end_commit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr< @OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_handle_extend(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int buffer_credits, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_handle_start_class(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_handle_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int interval2, int sync2, int requested_blocks, int dirtied_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_journal_shrink(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_lock_buffer_stall(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned long stall_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_run_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, Ptr<misc.transaction_run_stats_s> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_shrink_checkpoint_list(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int first_tid, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned @OriginalName(value="tid_t") int last_tid, @Unsigned long nr_freed, @Unsigned @OriginalName(value="tid_t") int next_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_shrink_scan_exit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long nr_shrunk, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_submit_inode_data(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_update_log_tail(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int first_tid, @Unsigned long block_nr, @Unsigned long freed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_jbd2_write_superblock(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="blk_opf_t") int write_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ma_op($arg1, (const u8*)$arg2, $arg3)")
    public static void __bpf_trace_ma_op(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ma_read($arg1, (const u8*)$arg2, $arg3)")
    public static void __bpf_trace_ma_read(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_ma_write($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void __bpf_trace_ma_write(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas, @Unsigned long piv, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_migration_pte(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_collapse_huge_page(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int isolated, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_collapse_huge_page_isolate(Ptr<?> __data, Ptr<runtime.page> page2, int none_or_zero, int referenced, boolean writable, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_collapse_huge_page_swapin(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int swapped_in, int referenced, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_khugepaged_collapse_file(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.folio> new_folio, @Unsigned long index2, @Unsigned long addr2, boolean is_shmem, Ptr<runtime.file> file2, int nr, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_khugepaged_scan_file(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.folio> folio2, Ptr<runtime.file> file2, int present, int swap, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_khugepaged_scan_pmd(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.page> page2, boolean writable, int referenced, int none_or_zero, int status, int unmapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_migrate_pages(Ptr<?> __data, @Unsigned long succeeded, @Unsigned long failed, @Unsigned long thp_succeeded, @Unsigned long thp_failed, @Unsigned long thp_split, @Unsigned long large_folio_split, MigrateDefinitions.migrate_mode mode, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_migrate_pages_start(Ptr<?> __data, MigrateDefinitions.migrate_mode mode, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pelt_cfs_tp(Ptr<?> __data, Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pelt_dl_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pelt_hw_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pelt_irq_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pelt_rt_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_pelt_se_tp(Ptr<?> __data, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_percpu_alloc_percpu(Ptr<?> __data, @Unsigned long call_site, boolean reserved, boolean is_atomic, @Unsigned long size, @Unsigned long align, Ptr<?> base_addr, int off, Ptr<?> ptr, @Unsigned long bytes_alloc, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_percpu_alloc_percpu_fail(Ptr<?> __data, boolean reserved, boolean is_atomic, @Unsigned long size, @Unsigned long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_percpu_create_chunk(Ptr<?> __data, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_percpu_destroy_chunk(Ptr<?> __data, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_percpu_free_percpu(Ptr<?> __data, Ptr<?> base_addr, int off, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_pwm($arg1, $arg2, (const struct pwm_state*)$arg3, $arg4)")
    public static void __bpf_trace_pwm(Ptr<?> __data, Ptr<PwmDefinitions.pwm_device> pwm, Ptr<PwmDefinitions.pwm_state> state2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_compute_energy_tp(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, int dst_cpu, @Unsigned long energy, @Unsigned long max_util, @Unsigned long busy_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_cpu_capacity_tp(Ptr<?> __data, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_kthread_stop(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_kthread_stop_ret(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_kthread_work_execute_end(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_work> work, @OriginalName(value="kthread_work_func_t") Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_kthread_work_execute_start(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_kthread_work_queue_work(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_worker> worker2, Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_migrate_task(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, int dest_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_move_numa(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, int src_cpu, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_numa_pair_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> src_tsk, int src_cpu, Ptr<TaskDefinitions.task_struct> dst_tsk, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_overutilized_tp(Ptr<?> __data, Ptr<misc.root_domain> rd, boolean overutilized) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_pi_setprio(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, Ptr<TaskDefinitions.task_struct> pi_task) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_prepare_exec(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_process_exec(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, @OriginalName(value="pid_t") int old_pid, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_process_fork(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> parent, Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_process_hang(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_process_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_process_wait(Ptr<?> __data, Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_skip_vma_numa(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma, NumaDefinitions.numa_vmaskip_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_stat_runtime(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long runtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_stat_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_switch(Ptr<?> __data, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_update_nr_running_tp(Ptr<?> __data, Ptr<runtime.rq> rq2, int change) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_util_est_cfs_tp(Ptr<?> __data, Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_util_est_se_tp(Ptr<?> __data, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_wake_idle_without_ipi(Ptr<?> __data, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sched_wakeup_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_scsi_cmd_done_timeout_template(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_scsi_dispatch_cmd_error(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd, int rtn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_scsi_dispatch_cmd_start(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_scsi_eh_wakeup(Ptr<?> __data, Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_scsi_prepare_zone_append(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmnd, @Unsigned @OriginalName(value="sector_t") long lba, @Unsigned int wp_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_scsi_zone_wp_update(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmnd, @Unsigned @OriginalName(value="sector_t") long rq_sector, @Unsigned int wp_offset, @Unsigned int good_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_spi_controller(Ptr<?> __data, Ptr<SpiDefinitions.spi_controller> controller2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_spi_message(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_spi_message_done(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_spi_set_cs(Ptr<?> __data, Ptr<SpiDefinitions.spi_device> spi, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_spi_setup(Ptr<?> __data, Ptr<SpiDefinitions.spi_device> spi, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_spi_transfer(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg, Ptr<SpiDefinitions.spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tlb_flush(Ptr<?> __data, int reason, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tmigr_connect_child_parent(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tmigr_connect_cpu_parent(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tmigr_cpugroup(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tmigr_group_and_cpu(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state state2, @Unsigned int childmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tmigr_group_set(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tmigr_handle_remote(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tmigr_idle(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tmigr_update_events(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> child, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state childstate, TmigrDefinitions.tmigr_state groupstate, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_track_foreign_dirty(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vm_unmapped_area(Ptr<?> __data, @Unsigned long addr2, Ptr<VmDefinitions.vm_unmapped_area_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vma_mas_szero(Ptr<?> __data, Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_vma_store(Ptr<?> __data, Ptr<MapleDefinitions.maple_tree> mt, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_wbc_class(Ptr<?> __data, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_wbt_lat(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned long lat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_wbt_stat(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<BlkDefinitions.blk_rq_stat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_wbt_step($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void __bpf_trace_wbt_step(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, String msg, int step, @Unsigned long window, @Unsigned int bg, @Unsigned int normal, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_wbt_timer(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int status, int step, @Unsigned int inflight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_bdi_register(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_class(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_dirty_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_folio_template(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_pages_written(Ptr<?> __data, long pages_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_queue_io(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work, @Unsigned long dirtied_before, int moved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_sb_inodes_requeue(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_single_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned long nr_to_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_work_class(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_writeback_write_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_adj_linfo_after_remove(Ptr<bpf_verifier_env> env, @Unsigned int off, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_bprm_opts_set(@Unsigned long bprm, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_build_state($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int bpf_build_state(Ptr<runtime.net> net2, Ptr<runtime.nlattr> nla, @Unsigned int family, Ptr<?> cfg, Ptr<Ptr<LwtunnelDefinitions.lwtunnel_state>> ts, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_check(Ptr<Ptr<bpf_prog>> prog, Ptr<bpf_attr> attr2,  @OriginalName(value="bpfptr_t") misc.sockptr_t uattr, @Unsigned int uattr_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_check_attach_target($arg1, (const struct bpf_prog*)$arg2, (const struct bpf_prog*)$arg3, $arg4, $arg5)")
    public static int bpf_check_attach_target(Ptr<bpf_verifier_log> log, Ptr<bpf_prog> prog, Ptr<bpf_prog> tgt_prog, @Unsigned int btf_id, Ptr<bpf_attach_target_info> tgt_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_lru_node> bpf_common_lru_pop_free(Ptr<bpf_lru> lru, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_d_path(@Unsigned long path2, @Unsigned long buf, @Unsigned long sz, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_d_path_allowed((const struct bpf_prog*)$arg1)")
    public static boolean bpf_d_path_allowed(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_destroy_state(Ptr<LwtunnelDefinitions.lwtunnel_state> lwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_dev_bound_kfunc_id(@Unsigned int btf_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_encap_cmp(Ptr<LwtunnelDefinitions.lwtunnel_state> a, Ptr<LwtunnelDefinitions.lwtunnel_state> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_encap_nlsize(Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_event_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_event_notify(Ptr<misc.notifier_block> nb, @Unsigned long op, Ptr<?> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fd_reuseport_array_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fd_reuseport_array_update_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fill_encap_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<LwtunnelDefinitions.lwtunnel_state> lwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fill_lwt_prog(Ptr<SkDefinitions.sk_buff> skb, int attr2, Ptr<bpf_lwt_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_find_exception_callback_insn_off(Ptr<bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_find_vma(@Unsigned long task2, @Unsigned long start, @Unsigned long callback_fn, @Unsigned long callback_ctx, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_free_kfunc_btf_tab(Ptr<bpf_kfunc_btf_tab> tab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_attach_cookie(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_attach_cookie_kprobe_multi(@Unsigned long regs, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_attach_cookie_pe(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_attach_cookie_trace(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_attach_cookie_tracing(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_attach_cookie_uprobe_multi(@Unsigned long regs, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_branch_snapshot(@Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.btf> bpf_get_btf_vmlinux() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_task(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_current_task_btf(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_func_ip_kprobe(@Unsigned long regs, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_func_ip_kprobe_multi(@Unsigned long regs, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_func_ip_tracing(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_func_ip_uprobe_multi(@Unsigned long regs, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_kfunc_addr((const struct bpf_prog*)$arg1, $arg2, $arg3, $arg4)")
    public static int bpf_get_kfunc_addr(Ptr<bpf_prog> prog, @Unsigned int func_id, @Unsigned short btf_fd_idx, Ptr<Ptr<Character>> func_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_perf_event_info((const struct perf_event*)$arg1, $arg2, $arg3, (const u8**)$arg4, $arg5, $arg6, $arg7)")
    public static int bpf_get_perf_event_info(Ptr<PerfDefinitions.perf_event> event2, Ptr<@Unsigned Integer> prog_id, Ptr<@Unsigned Integer> fd_type, Ptr<String> buf, Ptr<@Unsigned Long> probe_offset, Ptr<@Unsigned Long> probe_addr, Ptr<@Unsigned Long> missed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_raw_tracepoint((const u8*)$arg1)")
    public static Ptr<bpf_raw_event_map> bpf_get_raw_tracepoint(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stack(@Unsigned long regs, @Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stack_pe(@Unsigned long ctx, @Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stack_raw_tp(@Unsigned long args, @Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stack_sleepable(@Unsigned long regs, @Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stack_tp(@Unsigned long tp_buff, @Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stackid(@Unsigned long regs, @Unsigned long map2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stackid_pe(@Unsigned long ctx, @Unsigned long map2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stackid_raw_tp(@Unsigned long args, @Unsigned long map2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_stackid_tp(@Unsigned long tp_buff, @Unsigned long map2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_task_stack(@Unsigned long task2, @Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_task_stack_sleepable(@Unsigned long task2, @Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ima_file_hash(@Unsigned long file2, @Unsigned long dst, @Unsigned long size, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ima_inode_hash(@Unsigned long inode2, @Unsigned long dst, @Unsigned long size, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_ima_inode_hash_allowed((const struct bpf_prog*)$arg1)")
    public static boolean bpf_ima_inode_hash_allowed(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_attach_task(Ptr<bpf_prog> prog, Ptr<bpf_iter_link_info> linfo, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_css_task_destroy(Ptr<bpf_iter_css_task> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_css_task_new(Ptr<bpf_iter_css_task> it, Ptr<CgroupDefinitions.cgroup_subsys_state> css, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> bpf_iter_css_task_next(Ptr<bpf_iter_css_task> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_fill_link_info((const struct bpf_iter_aux_info*)$arg1, $arg2)")
    public static int bpf_iter_fill_link_info(Ptr<bpf_iter_aux_info> aux, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_ipv6_route(Ptr<bpf_iter_meta> meta, Ptr<Fib6Definitions.fib6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_task_destroy(Ptr<bpf_iter_task> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_task_file(Ptr<bpf_iter_meta> meta, Ptr<TaskDefinitions.task_struct> task2, @Unsigned int fd2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_task_new(Ptr<bpf_iter_task> it, Ptr<TaskDefinitions.task_struct> task__nullable, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> bpf_iter_task_next(Ptr<bpf_iter_task> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_iter_task_show_fdinfo((const struct bpf_iter_aux_info*)$arg1, $arg2)")
    public static void bpf_iter_task_show_fdinfo(Ptr<bpf_iter_aux_info> aux, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_task_vma_destroy(Ptr<bpf_iter_task_vma> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_task_vma_new(Ptr<bpf_iter_task_vma> it, Ptr<TaskDefinitions.task_struct> task2, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> bpf_iter_task_vma_next(Ptr<bpf_iter_task_vma> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_func_model*)bpf_jit_find_kfunc_model((const struct bpf_prog*)$arg1, (const struct bpf_insn*)$arg2))")
    public static Ptr<BtfDefinitions.btf_func_model> bpf_jit_find_kfunc_model(Ptr<bpf_prog> prog, Ptr<bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_key_put(Ptr<bpf_key> bkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_key_sig_kfuncs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_kprobe_multi_addrs_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int bpf_kprobe_multi_addrs_cmp(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_kprobe_multi_cookie_cmp((const void*)$arg1, (const void*)$arg2, (const void*)$arg3)")
    public static int bpf_kprobe_multi_cookie_cmp(Ptr<?> a, Ptr<?> b, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_kprobe_multi_cookie_swap($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static void bpf_kprobe_multi_cookie_swap(Ptr<?> a, Ptr<?> b, int size, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_kprobe_multi_filter((const struct bpf_prog*)$arg1, $arg2)")
    public static int bpf_kprobe_multi_filter(Ptr<bpf_prog> prog, @Unsigned int kfunc_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_kprobe_multi_kfuncs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_kprobe_multi_link_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int bpf_kprobe_multi_link_attach(Ptr<bpf_attr> attr2, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_kprobe_multi_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_kprobe_multi_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_kprobe_multi_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_kprobe_multi_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_key> bpf_lookup_system_key(@Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_key> bpf_lookup_user_key(@Unsigned int serial, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lru_destroy(Ptr<bpf_lru> lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lru_init(Ptr<bpf_lru> lru, boolean percpu, @Unsigned int hash_offset, @OriginalName(value="del_from_htab_func") Ptr<?> del_from_htab, Ptr<?> del_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_lru_node> bpf_lru_pop_free(Ptr<bpf_lru> lru, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lru_populate(Ptr<bpf_lru> lru, Ptr<?> buf, @Unsigned int node_offset, @Unsigned int elem_size, @Unsigned int nr_elems) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lru_push_free(Ptr<bpf_lru> lru, Ptr<bpf_lru_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_audit_rule_free(Ptr<?> lsmrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_audit_rule_init(@Unsigned int field, @Unsigned int op, String rulestr, Ptr<Ptr<?>> lsmrule, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_audit_rule_known(Ptr<AuditDefinitions.audit_krule> krule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_audit_rule_match(@Unsigned int secid, @Unsigned int field, @Unsigned int op, Ptr<?> lsmrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_bdev_alloc_security(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_bdev_free_security(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_bdev_setintegrity($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int bpf_lsm_bdev_setintegrity(Ptr<BlockDefinitions.block_device> bdev, LsmDefinitions.lsm_integrity_type type2, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_binder_set_context_mgr((const struct cred*)$arg1)")
    public static int bpf_lsm_binder_set_context_mgr(Ptr<runtime.cred> mgr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_binder_transaction((const struct cred*)$arg1, (const struct cred*)$arg2)")
    public static int bpf_lsm_binder_transaction(Ptr<runtime.cred> from, Ptr<runtime.cred> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_binder_transfer_binder((const struct cred*)$arg1, (const struct cred*)$arg2)")
    public static int bpf_lsm_binder_transfer_binder(Ptr<runtime.cred> from, Ptr<runtime.cred> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_binder_transfer_file((const struct cred*)$arg1, (const struct cred*)$arg2, (const struct file*)$arg3)")
    public static int bpf_lsm_binder_transfer_file(Ptr<runtime.cred> from, Ptr<runtime.cred> to, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_bpf(int cmd, Ptr<bpf_attr> attr2, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_bpf_map(Ptr<bpf_map> map2, @Unsigned @OriginalName(value="fmode_t") int fmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_bpf_map_create(Ptr<bpf_map> map2, Ptr<bpf_attr> attr2, Ptr<bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_bpf_map_free(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_bpf_prog(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_bpf_prog_free(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_bpf_prog_load(Ptr<bpf_prog> prog, Ptr<bpf_attr> attr2, Ptr<bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_bpf_token_capable((const struct bpf_token*)$arg1, $arg2)")
    public static int bpf_lsm_bpf_token_capable(Ptr<bpf_token> token, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_bpf_token_cmd((const struct bpf_token*)$arg1, $arg2)")
    public static int bpf_lsm_bpf_token_cmd(Ptr<bpf_token> token, bpf_cmd cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_bpf_token_create($arg1, $arg2, (const struct path*)$arg3)")
    public static int bpf_lsm_bpf_token_create(Ptr<bpf_token> token, Ptr<bpf_attr> attr2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_bpf_token_free(Ptr<bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_bprm_check_security(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_bprm_committed_creds((const struct linux_binprm*)$arg1)")
    public static void bpf_lsm_bprm_committed_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_bprm_committing_creds((const struct linux_binprm*)$arg1)")
    public static void bpf_lsm_bprm_committing_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_bprm_creds_for_exec(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_bprm_creds_from_file($arg1, (const struct file*)$arg2)")
    public static int bpf_lsm_bprm_creds_from_file(Ptr<LinuxDefinitions.linux_binprm> bprm, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_capable((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int bpf_lsm_capable(Ptr<runtime.cred> cred2, Ptr<UserDefinitions.user_namespace> ns, int cap, @Unsigned int opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_capget((const struct task_struct*)$arg1, $arg2, $arg3, $arg4)")
    public static int bpf_lsm_capget(Ptr<TaskDefinitions.task_struct> target, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_capset($arg1, (const struct cred*)$arg2, (const struct {\n  long long unsigned int val;\n}*)$arg3, (const struct {\n  long long unsigned int val;\n}*)$arg4, (const struct {\n  long long unsigned int val;\n}*)$arg5)")
    public static int bpf_lsm_capset(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_cred_alloc_blank(Ptr<runtime.cred> cred2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_cred_free(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_cred_getsecid((const struct cred*)$arg1, $arg2)")
    public static void bpf_lsm_cred_getsecid(Ptr<runtime.cred> c, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_cred_prepare($arg1, (const struct cred*)$arg2, $arg3)")
    public static int bpf_lsm_cred_prepare(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_cred_transfer($arg1, (const struct cred*)$arg2)")
    public static void bpf_lsm_cred_transfer(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_current_getsecid_subj(Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_d_instantiate(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_dentry_create_files_as($arg1, $arg2, $arg3, (const struct cred*)$arg4, $arg5)")
    public static int bpf_lsm_dentry_create_files_as(Ptr<runtime.dentry> dentry2, int mode, Ptr<runtime.qstr> name, Ptr<runtime.cred> old, Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_dentry_init_security($arg1, $arg2, (const struct qstr*)$arg3, (const u8**)$arg4, $arg5, $arg6)")
    public static int bpf_lsm_dentry_init_security(Ptr<runtime.dentry> dentry2, int mode, Ptr<runtime.qstr> name, Ptr<String> xattr_name2, Ptr<Ptr<?>> ctx, Ptr<@Unsigned Integer> ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_alloc_security(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_fcntl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_file_free_security(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_ioctl_compat(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_lock(Ptr<runtime.file> file2, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_mprotect(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long reqprot, @Unsigned long prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_open(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_permission(Ptr<runtime.file> file2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_post_open(Ptr<runtime.file> file2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_receive(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_file_release(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_send_sigiotask(Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.fown_struct> fown, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_file_set_fowner(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_file_truncate(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_find_cgroup_shim((const struct bpf_prog*)$arg1, $arg2)")
    public static void bpf_lsm_find_cgroup_shim(Ptr<bpf_prog> prog, Ptr<@OriginalName(value="bpf_func_t") Ptr<?>> bpf_func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_fs_context_dup(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_context> src_sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_fs_context_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_fs_context_submount(Ptr<FsDefinitions.fs_context> fc, Ptr<SuperDefinitions.super_block> reference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_lsm_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_lsm_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_get_retval_range((const struct bpf_prog*)$arg1, $arg2)")
    public static int bpf_lsm_get_retval_range(Ptr<bpf_prog> prog, Ptr<bpf_retval_range> retval_range) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_getprocattr($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_lsm_getprocattr(Ptr<TaskDefinitions.task_struct> p, String name, Ptr<String> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_getselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> ctx, Ptr<@Unsigned Integer> size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_ib_alloc_security(Ptr<?> sec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_ib_endport_manage_subnet($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_lsm_ib_endport_manage_subnet(Ptr<?> sec, String dev_name, char port_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_ib_pkey_access(Ptr<?> sec, @Unsigned long subnet_prefix, @Unsigned short pkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_inet_conn_established(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inet_conn_request((const struct sock*)$arg1, $arg2, $arg3)")
    public static int bpf_lsm_inet_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inet_csk_clone($arg1, (const struct request_sock*)$arg2)")
    public static void bpf_lsm_inet_csk_clone(Ptr<runtime.sock> newsk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_initramfs_populated() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_alloc_security(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_copy_up(Ptr<runtime.dentry> src, Ptr<Ptr<runtime.cred>> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_copy_up_xattr($arg1, (const u8*)$arg2)")
    public static int bpf_lsm_inode_copy_up_xattr(Ptr<runtime.dentry> src, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_create(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_follow_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, boolean rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_inode_free_security(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_inode_free_security_rcu(Ptr<?> inode_security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_get_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int bpf_lsm_inode_get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_getattr((const struct path*)$arg1)")
    public static int bpf_lsm_inode_getattr(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_getsecctx(Ptr<runtime.inode> inode2, Ptr<Ptr<?>> ctx, Ptr<@Unsigned Integer> ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_inode_getsecid(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_getsecurity($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int bpf_lsm_inode_getsecurity(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, String name, Ptr<Ptr<?>> buffer, boolean alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_getxattr($arg1, (const u8*)$arg2)")
    public static int bpf_lsm_inode_getxattr(Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_init_security($arg1, $arg2, (const struct qstr*)$arg3, $arg4, $arg5)")
    public static int bpf_lsm_inode_init_security(Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> qstr2, Ptr<runtime.xattr> xattrs, Ptr<Integer> xattr_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_init_security_anon($arg1, (const struct qstr*)$arg2, (const struct inode*)$arg3)")
    public static int bpf_lsm_inode_init_security_anon(Ptr<runtime.inode> inode2, Ptr<runtime.qstr> name, Ptr<runtime.inode> context_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_inode_invalidate_secctx(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_killpriv(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_listsecurity(Ptr<runtime.inode> inode2, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_listxattr(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_mkdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_mknod(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_need_killpriv(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_notifysecctx(Ptr<runtime.inode> inode2, Ptr<?> ctx, @Unsigned int ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_permission(Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_inode_post_create_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_post_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static void bpf_lsm_inode_post_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_post_removexattr($arg1, (const u8*)$arg2)")
    public static void bpf_lsm_inode_post_removexattr(Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_post_set_acl($arg1, (const u8*)$arg2, $arg3)")
    public static void bpf_lsm_inode_post_set_acl(Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_inode_post_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, int ia_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_post_setxattr($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static void bpf_lsm_inode_post_setxattr(Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_readlink(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int bpf_lsm_inode_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int bpf_lsm_inode_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_rename(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_set_acl($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int bpf_lsm_inode_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_setintegrity((const struct inode*)$arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int bpf_lsm_inode_setintegrity(Ptr<runtime.inode> inode2, LsmDefinitions.lsm_integrity_type type2, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_setsecctx(Ptr<runtime.dentry> dentry2, Ptr<?> ctx, @Unsigned int ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_setsecurity($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int bpf_lsm_inode_setsecurity(Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_setxattr($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int bpf_lsm_inode_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_symlink($arg1, $arg2, (const u8*)$arg3)")
    public static int bpf_lsm_inode_symlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String old_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_inode_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_inode_xattr_skipcap((const u8*)$arg1)")
    public static int bpf_lsm_inode_xattr_skipcap(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_ipc_getsecid(Ptr<misc.kern_ipc_perm> ipcp, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_ipc_permission(Ptr<misc.kern_ipc_perm> ipcp, short flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_lsm_is_sleepable_hook(@Unsigned int btf_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_is_trusted((const struct bpf_prog*)$arg1)")
    public static boolean bpf_lsm_is_trusted(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_ismaclabel((const u8*)$arg1)")
    public static int bpf_lsm_ismaclabel(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_kernel_act_as(Ptr<runtime.cred> _new, @Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_kernel_create_files_as(Ptr<runtime.cred> _new, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_kernel_load_data(KernelDefinitions.kernel_load_data_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_kernel_module_request(String kmod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_kernel_post_load_data(String buf, @OriginalName(value="loff_t") long size, KernelDefinitions.kernel_load_data_id id, String description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_kernel_post_read_file(Ptr<runtime.file> file2, String buf, @OriginalName(value="loff_t") long size, KernelDefinitions.kernel_read_file_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_kernel_read_file(Ptr<runtime.file> file2, KernelDefinitions.kernel_read_file_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_kernfs_init_security(Ptr<KernfsDefinitions.kernfs_node> kn_dir, Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_key_alloc($arg1, (const struct cred*)$arg2, $arg3)")
    public static int bpf_lsm_key_alloc(Ptr<runtime.key> key2, Ptr<runtime.cred> cred2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_key_getsecurity(Ptr<runtime.key> key2, Ptr<String> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_key_permission($arg1, (const struct cred*)$arg2, $arg3)")
    public static int bpf_lsm_key_permission(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> key_ref, Ptr<runtime.cred> cred2, KeyDefinitions.key_need_perm need_perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_key_post_create_or_update($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static void bpf_lsm_key_post_create_or_update(Ptr<runtime.key> keyring, Ptr<runtime.key> key2, Ptr<?> payload, @Unsigned long payload_len, @Unsigned long flags, boolean create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_lock_kernel_down((const u8*)$arg1, $arg2)")
    public static int bpf_lsm_lock_kernel_down(String where, misc.lockdown_reason level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_locked_down(misc.lockdown_reason what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_mmap_addr(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_mmap_file(Ptr<runtime.file> file2, @Unsigned long reqprot, @Unsigned long prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_move_mount((const struct path*)$arg1, (const struct path*)$arg2)")
    public static int bpf_lsm_move_mount(Ptr<runtime.path> from_path, Ptr<runtime.path> to_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_mptcp_add_subflow(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_msg_msg_alloc_security(Ptr<MsgDefinitions.msg_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_msg_msg_free_security(Ptr<MsgDefinitions.msg_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_msg_queue_alloc_security(Ptr<misc.kern_ipc_perm> perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_msg_queue_associate(Ptr<misc.kern_ipc_perm> perm, int msqflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_msg_queue_free_security(Ptr<misc.kern_ipc_perm> perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_msg_queue_msgctl(Ptr<misc.kern_ipc_perm> perm, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_msg_queue_msgrcv(Ptr<misc.kern_ipc_perm> perm, Ptr<MsgDefinitions.msg_msg> msg, Ptr<TaskDefinitions.task_struct> target, long type2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_msg_queue_msgsnd(Ptr<misc.kern_ipc_perm> perm, Ptr<MsgDefinitions.msg_msg> msg, int msqflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_netlink_send(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_chmod((const struct path*)$arg1, $arg2)")
    public static int bpf_lsm_path_chmod(Ptr<runtime.path> path2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_chown((const struct path*)$arg1, $arg2, $arg3)")
    public static int bpf_lsm_path_chown(Ptr<runtime.path> path2, misc.kuid_t uid, misc.kgid_t gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_chroot((const struct path*)$arg1)")
    public static int bpf_lsm_path_chroot(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_link($arg1, (const struct path*)$arg2, $arg3)")
    public static int bpf_lsm_path_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_mkdir((const struct path*)$arg1, $arg2, $arg3)")
    public static int bpf_lsm_path_mkdir(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_mknod((const struct path*)$arg1, $arg2, $arg3, $arg4)")
    public static int bpf_lsm_path_mknod(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_notify((const struct path*)$arg1, $arg2, $arg3)")
    public static int bpf_lsm_path_notify(Ptr<runtime.path> path2, @Unsigned long mask, @Unsigned int obj_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_path_post_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_rename((const struct path*)$arg1, $arg2, (const struct path*)$arg3, $arg4, $arg5)")
    public static int bpf_lsm_path_rename(Ptr<runtime.path> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_rmdir((const struct path*)$arg1, $arg2)")
    public static int bpf_lsm_path_rmdir(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_symlink((const struct path*)$arg1, $arg2, (const u8*)$arg3)")
    public static int bpf_lsm_path_symlink(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, String old_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_truncate((const struct path*)$arg1)")
    public static int bpf_lsm_path_truncate(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_path_unlink((const struct path*)$arg1, $arg2)")
    public static int bpf_lsm_path_unlink(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_perf_event_alloc(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_perf_event_open(Ptr<PerfDefinitions.perf_event_attr> attr2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_perf_event_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_perf_event_write(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_post_notification((const struct cred*)$arg1, (const struct cred*)$arg2, $arg3)")
    public static int bpf_lsm_post_notification(Ptr<runtime.cred> w_cred, Ptr<runtime.cred> cred2, Ptr<WatchDefinitions.watch_notification> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_ptrace_access_check(Ptr<TaskDefinitions.task_struct> child, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_ptrace_traceme(Ptr<TaskDefinitions.task_struct> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_quota_on(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_quotactl($arg1, $arg2, $arg3, (const struct super_block*)$arg4)")
    public static int bpf_lsm_quotactl(int cmds, int type2, int id, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_release_secctx(String secdata, @Unsigned int seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_req_classify_flow((const struct request_sock*)$arg1, $arg2)")
    public static void bpf_lsm_req_classify_flow(Ptr<RequestDefinitions.request_sock> req2, Ptr<misc.flowi_common> flic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sb_alloc_security(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_sb_clone_mnt_opts((const struct super_block*)$arg1, $arg2, $arg3, $arg4)")
    public static int bpf_lsm_sb_clone_mnt_opts(Ptr<SuperDefinitions.super_block> oldsb, Ptr<SuperDefinitions.super_block> newsb, @Unsigned long kern_flags, Ptr<@Unsigned Long> set_kern_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_sb_delete(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sb_eat_lsm_opts(String orig, Ptr<Ptr<?>> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_sb_free_mnt_opts(Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_sb_free_security(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_sb_kern_mount((const struct super_block*)$arg1)")
    public static int bpf_lsm_sb_kern_mount(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sb_mnt_opts_compat(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_sb_mount((const u8*)$arg1, (const struct path*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int bpf_lsm_sb_mount(String dev_name, Ptr<runtime.path> path2, String type2, @Unsigned long flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_sb_pivotroot((const struct path*)$arg1, (const struct path*)$arg2)")
    public static int bpf_lsm_sb_pivotroot(Ptr<runtime.path> old_path, Ptr<runtime.path> new_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sb_remount(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sb_set_mnt_opts(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts, @Unsigned long kern_flags, Ptr<@Unsigned Long> set_kern_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sb_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sb_statfs(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sb_umount(Ptr<runtime.vfsmount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sctp_assoc_established(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sctp_assoc_request(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sctp_bind_connect(Ptr<runtime.sock> sk, int optname, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_sctp_sk_clone(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_secctx_to_secid((const u8*)$arg1, $arg2, $arg3)")
    public static int bpf_lsm_secctx_to_secid(String secdata, @Unsigned int seclen, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_secid_to_secctx(@Unsigned int secid, Ptr<String> secdata, Ptr<@Unsigned Integer> seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_secmark_refcount_dec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_secmark_refcount_inc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_secmark_relabel_packet(@Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sem_alloc_security(Ptr<misc.kern_ipc_perm> perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sem_associate(Ptr<misc.kern_ipc_perm> perm, int semflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_sem_free_security(Ptr<misc.kern_ipc_perm> perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sem_semctl(Ptr<misc.kern_ipc_perm> perm, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sem_semop(Ptr<misc.kern_ipc_perm> perm, Ptr<runtime.sembuf> sops, @Unsigned int nsops, int alter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_setprocattr((const u8*)$arg1, $arg2, $arg3)")
    public static int bpf_lsm_setprocattr(String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_setselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> ctx, @Unsigned int size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_settime((const struct timespec64*)$arg1, (const struct timezone*)$arg2)")
    public static int bpf_lsm_settime(Ptr<runtime.timespec64> ts, Ptr<runtime.timezone> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_shm_alloc_security(Ptr<misc.kern_ipc_perm> perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_shm_associate(Ptr<misc.kern_ipc_perm> perm, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_shm_free_security(Ptr<misc.kern_ipc_perm> perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_shm_shmat(Ptr<misc.kern_ipc_perm> perm, String shmaddr, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_shm_shmctl(Ptr<misc.kern_ipc_perm> perm, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_sk_alloc_security(Ptr<runtime.sock> sk, int family, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_sk_clone_security((const struct sock*)$arg1, $arg2)")
    public static void bpf_lsm_sk_clone_security(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_sk_free_security(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_sk_getsecid((const struct sock*)$arg1, $arg2)")
    public static void bpf_lsm_sk_getsecid(Ptr<runtime.sock> sk, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_sock_graft(Ptr<runtime.sock> sk, Ptr<runtime.socket> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_create(int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_getpeername(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_getpeersec_dgram(Ptr<runtime.socket> sock2, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_getpeersec_stream(Ptr<runtime.socket> sock2, misc.sockptr_t optval, misc.sockptr_t optlen, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_getsockname(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_getsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_post_create(Ptr<runtime.socket> sock2, int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_setsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_shutdown(Ptr<runtime.socket> sock2, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_sock_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_socket_socketpair(Ptr<runtime.socket> socka, Ptr<runtime.socket> sockb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_syslog(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_alloc(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_task_fix_setgid($arg1, (const struct cred*)$arg2, $arg3)")
    public static int bpf_lsm_task_fix_setgid(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_task_fix_setgroups($arg1, (const struct cred*)$arg2)")
    public static int bpf_lsm_task_fix_setgroups(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_task_fix_setuid($arg1, (const struct cred*)$arg2, $arg3)")
    public static int bpf_lsm_task_fix_setuid(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_task_free(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_getioprio(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_getpgid(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_getscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_task_getsecid_obj(Ptr<TaskDefinitions.task_struct> p, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_getsid(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_task_kill($arg1, $arg2, $arg3, (const struct cred*)$arg4)")
    public static int bpf_lsm_task_kill(Ptr<TaskDefinitions.task_struct> p, Ptr<KernelDefinitions.kernel_siginfo> info2, int sig, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_movememory(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_prctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_task_prlimit((const struct cred*)$arg1, (const struct cred*)$arg2, $arg3)")
    public static int bpf_lsm_task_prlimit(Ptr<runtime.cred> cred2, Ptr<runtime.cred> tcred, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_setioprio(Ptr<TaskDefinitions.task_struct> p, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_setnice(Ptr<TaskDefinitions.task_struct> p, int nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_setpgid(Ptr<TaskDefinitions.task_struct> p, @OriginalName(value="pid_t") int pgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_setrlimit(Ptr<TaskDefinitions.task_struct> p, @Unsigned int resource2, Ptr<runtime.rlimit> new_rlim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_task_setscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_task_to_inode(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_tun_dev_alloc_security(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_tun_dev_attach(Ptr<runtime.sock> sk, Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_tun_dev_attach_queue(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_tun_dev_create() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_tun_dev_open(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_unix_may_send(Ptr<runtime.socket> sock2, Ptr<runtime.socket> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_unix_stream_connect(Ptr<runtime.sock> sock2, Ptr<runtime.sock> other, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_uring_cmd(Ptr<IoDefinitions.io_uring_cmd> ioucmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_uring_override_creds((const struct cred*)$arg1)")
    public static int bpf_lsm_uring_override_creds(Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_uring_sqpoll() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_userns_create((const struct cred*)$arg1)")
    public static int bpf_lsm_userns_create(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_verify_prog($arg1, (const struct bpf_prog*)$arg2)")
    public static int bpf_lsm_verify_prog(Ptr<bpf_verifier_log> vlog, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_vm_enough_memory(Ptr<MmDefinitions.mm_struct> mm, long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_watch_key(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_xfrm_decode_session(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> secid, int ckall) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_xfrm_policy_alloc_security(Ptr<Ptr<XfrmDefinitions.xfrm_sec_ctx>> ctxp, Ptr<XfrmDefinitions.xfrm_user_sec_ctx> sec_ctx, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_xfrm_policy_clone_security(Ptr<XfrmDefinitions.xfrm_sec_ctx> old_ctx, Ptr<Ptr<XfrmDefinitions.xfrm_sec_ctx>> new_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_xfrm_policy_delete_security(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_xfrm_policy_free_security(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_xfrm_policy_lookup(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx, @Unsigned int fl_secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_xfrm_state_alloc(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_user_sec_ctx> sec_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_xfrm_state_alloc_acquire(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_sec_ctx> polsec, @Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_xfrm_state_delete_security(Ptr<XfrmDefinitions.xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_lsm_xfrm_state_free_security(Ptr<XfrmDefinitions.xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_lsm_xfrm_state_pol_flow_match($arg1, $arg2, (const struct flowi_common*)$arg3)")
    public static int bpf_lsm_xfrm_state_pol_flow_match(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_policy> xp, Ptr<misc.flowi_common> flic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lwt_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lwt_input_reroute(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lwt_push_ip_encap(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> hdr, @Unsigned int len, boolean ingress) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lwt_xmit_reroute(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mem_alloc_check_size(boolean percpu, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mem_alloc_destroy(Ptr<bpf_mem_alloc> ma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mem_alloc_init(Ptr<bpf_mem_alloc> ma, int size, boolean percpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mem_alloc_percpu_init(Ptr<bpf_mem_alloc> ma, Ptr<ObjDefinitions.obj_cgroup> objcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mem_alloc_percpu_unit_init(Ptr<bpf_mem_alloc> ma, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_mem_cache_alloc(Ptr<bpf_mem_alloc> ma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_mem_cache_alloc_flags(Ptr<bpf_mem_alloc> ma, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mem_cache_free(Ptr<bpf_mem_alloc> ma, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mem_cache_free_rcu(Ptr<bpf_mem_alloc> ma, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mem_cache_raw_free(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mem_free(Ptr<bpf_mem_alloc> ma, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mem_free_rcu(Ptr<bpf_mem_alloc> ma, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mem_refill(Ptr<IrqDefinitions.irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mprog_attach(Ptr<bpf_mprog_entry> entry, Ptr<Ptr<bpf_mprog_entry>> entry_new, Ptr<bpf_prog> prog_new, Ptr<bpf_link> link2, Ptr<bpf_prog> prog_old, @Unsigned int flags, @Unsigned int id_or_fd, @Unsigned long revision) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mprog_detach(Ptr<bpf_mprog_entry> entry, Ptr<Ptr<bpf_mprog_entry>> entry_new, Ptr<bpf_prog> prog, Ptr<bpf_link> link2, @Unsigned int flags, @Unsigned int id_or_fd, @Unsigned long revision) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mprog_entry_copy(Ptr<bpf_mprog_entry> dst, Ptr<bpf_mprog_entry> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mprog_entry_grow(Ptr<bpf_mprog_entry> entry, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_mprog_entry_shrink(Ptr<bpf_mprog_entry> entry, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mprog_pos_after(Ptr<bpf_mprog_entry> entry, Ptr<bpf_tuple> tuple) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mprog_pos_before(Ptr<bpf_mprog_entry> entry, Ptr<bpf_tuple> tuple) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_mprog_query((const union bpf_attr*)$arg1, $arg2, $arg3)")
    public static int bpf_mprog_query(Ptr<bpf_attr> attr2, Ptr<bpf_attr> uattr, Ptr<bpf_mprog_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_mprog_tuple_relative(Ptr<bpf_tuple> tuple, @Unsigned int id_or_fd, @Unsigned int flags, bpf_prog_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_override_return(@Unsigned long regs, @Unsigned long rc2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_parse_prog(Ptr<runtime.nlattr> attr2, Ptr<bpf_lwt_prog> prog, bpf_prog_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_patch_insn_data($arg1, $arg2, (const struct bpf_insn*)$arg3, $arg4)")
    public static Ptr<bpf_prog> bpf_patch_insn_data(Ptr<bpf_verifier_env> env, @Unsigned int off, Ptr<bpf_insn> patch, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_percpu_lru_populate(Ptr<bpf_lru> lru, Ptr<?> buf, @Unsigned int node_offset, @Unsigned int elem_size, @Unsigned int nr_elems) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_perf_event_output(@Unsigned long regs, @Unsigned long map2, @Unsigned long flags, @Unsigned long data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_perf_event_output_raw_tp(@Unsigned long args, @Unsigned long map2, @Unsigned long flags, @Unsigned long data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_perf_event_output_tp(@Unsigned long tp_buff, @Unsigned long map2, @Unsigned long flags, @Unsigned long data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_perf_event_read(@Unsigned long map2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_perf_event_read_value(@Unsigned long map2, @Unsigned long flags, @Unsigned long buf, @Unsigned long size, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_perf_prog_read_value(@Unsigned long ctx, @Unsigned long buf, @Unsigned long size, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_probe_read_compat(@Unsigned long dst, @Unsigned long size, @Unsigned long unsafe_ptr, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_probe_read_compat_str(@Unsigned long dst, @Unsigned long size, @Unsigned long unsafe_ptr, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_probe_read_kernel(@Unsigned long dst, @Unsigned long size, @Unsigned long unsafe_ptr, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_probe_read_kernel_str(@Unsigned long dst, @Unsigned long size, @Unsigned long unsafe_ptr, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_probe_read_user(@Unsigned long dst, @Unsigned long size, @Unsigned long unsafe_ptr, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_probe_read_user_str(@Unsigned long dst, @Unsigned long size, @Unsigned long unsafe_ptr, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_probe_register(Ptr<bpf_raw_event_map> btp, Ptr<bpf_raw_tp_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_probe_unregister(Ptr<bpf_raw_event_map> btp, Ptr<bpf_raw_tp_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_probe_write_user(@Unsigned long unsafe_ptr, @Unsigned long src, @Unsigned long size, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_has_kfunc_call((const struct bpf_prog*)$arg1)")
    public static boolean bpf_prog_has_kfunc_call(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_prog_run_generic_xdp(Ptr<SkDefinitions.sk_buff> skb, Ptr<XdpDefinitions.xdp_buff> xdp2, Ptr<bpf_prog> xdp_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_put_raw_tracepoint(Ptr<bpf_raw_event_map> btp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_read_branch_records(@Unsigned long ctx, @Unsigned long buf, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_ringbuf_commit(Ptr<?> sample2, @Unsigned long flags, boolean discard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_discard(@Unsigned long sample2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_discard_dynptr(@Unsigned long ptr, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_ringbuf_notify(Ptr<IrqDefinitions.irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_output(@Unsigned long map2, @Unsigned long data, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_query(@Unsigned long map2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_reserve(@Unsigned long map2, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_reserve_dynptr(@Unsigned long map2, @Unsigned long size, @Unsigned long flags, @Unsigned long ptr, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_submit(@Unsigned long sample2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_ringbuf_submit_dynptr(@Unsigned long ptr, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_send_signal(@Unsigned long sig, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_send_signal_common(@Unsigned int sig, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_send_signal_thread(@Unsigned long sig, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_seq_printf(@Unsigned long m, @Unsigned long fmt, @Unsigned long fmt_size, @Unsigned long args, @Unsigned long data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_seq_printf_btf(@Unsigned long m, @Unsigned long ptr, @Unsigned long btf_ptr_size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_seq_write(@Unsigned long m, @Unsigned long data, @Unsigned long len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> bpf_session_cookie() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_session_is_return() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_sk_reuseport_detach(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_snprintf_btf(@Unsigned long str, @Unsigned long str_size, @Unsigned long ptr, @Unsigned long btf_ptr_size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_stackmap_copy(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_task_pt_regs(@Unsigned long task2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_tcp_ca_btf_struct_access($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int bpf_tcp_ca_btf_struct_access(Ptr<bpf_verifier_log> log, Ptr<bpf_reg_state> reg, int off, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tcp_ca_cong_avoid(Ptr<runtime.sock> sk, @Unsigned int ack, @Unsigned int acked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_tcp_ca_cong_control($arg1, $arg2, $arg3, (const struct rate_sample*)$arg4)")
    public static void bpf_tcp_ca_cong_control(Ptr<runtime.sock> sk, @Unsigned int ack, int flag, Ptr<misc.rate_sample> rs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tcp_ca_cwnd_event(Ptr<runtime.sock> sk, TcpDefinitions.tcp_ca_event ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_tcp_ca_get_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_tcp_ca_get_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tcp_ca_in_ack_event(Ptr<runtime.sock> sk, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_tcp_ca_init(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_tcp_ca_init_member((const struct btf_type*)$arg1, (const struct btf_member*)$arg2, $arg3, (const void*)$arg4)")
    public static int bpf_tcp_ca_init_member(Ptr<BtfDefinitions.btf_type> t, Ptr<BtfDefinitions.btf_member> member, Ptr<?> kdata, Ptr<?> udata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_tcp_ca_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean bpf_tcp_ca_is_valid_access(int off, int size, bpf_access_type type2, Ptr<bpf_prog> prog, Ptr<bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_tcp_ca_kfunc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_tcp_ca_min_tso_segs(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_tcp_ca_pkts_acked($arg1, (const struct ack_sample*)$arg2)")
    public static void bpf_tcp_ca_pkts_acked(Ptr<runtime.sock> sk, Ptr<misc.ack_sample> sample2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_tcp_ca_reg(Ptr<?> kdata, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tcp_ca_set_state(Ptr<runtime.sock> sk, char new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_tcp_ca_sndbuf_expand(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_tcp_ca_ssthresh(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_tcp_ca_undo_cwnd(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tcp_ca_unreg(Ptr<?> kdata, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_tcp_ca_update(Ptr<?> kdata, Ptr<?> old_kdata, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_tcp_ca_validate(Ptr<?> kdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_tcp_ingress(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock, Ptr<SkDefinitions.sk_msg> msg, @Unsigned int apply_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tcp_send_ack(@Unsigned long tp, @Unsigned long rcv_nxt, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_trace_printk(@Unsigned long fmt, @Unsigned long fmt_size, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run1(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run10(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5, @Unsigned long arg6, @Unsigned long arg7, @Unsigned long arg8, @Unsigned long arg9) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run11(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5, @Unsigned long arg6, @Unsigned long arg7, @Unsigned long arg8, @Unsigned long arg9, @Unsigned long arg10) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run12(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5, @Unsigned long arg6, @Unsigned long arg7, @Unsigned long arg8, @Unsigned long arg9, @Unsigned long arg10, @Unsigned long arg11) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run2(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run3(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run4(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run5(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run6(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run7(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5, @Unsigned long arg6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run8(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5, @Unsigned long arg6, @Unsigned long arg7) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trace_run9(Ptr<bpf_raw_tp_link> link2, @Unsigned long arg0, @Unsigned long arg1, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5, @Unsigned long arg6, @Unsigned long arg7, @Unsigned long arg8) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_trace_vprintk(@Unsigned long fmt, @Unsigned long fmt_size, @Unsigned long args, @Unsigned long data_len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_tracing_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_tracing_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_uprobe_multi_link_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int bpf_uprobe_multi_link_attach(Ptr<bpf_attr> attr2, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_uprobe_multi_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_uprobe_multi_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_uprobe_multi_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_uprobe_multi_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_user_ringbuf_drain(@Unsigned long map2, @Unsigned long callback_fn, @Unsigned long callback_ctx, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_verify_pkcs7_signature(Ptr<bpf_dynptr> data_p, Ptr<bpf_dynptr> sig_p, Ptr<bpf_key> trusted_keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_xdp_link_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int bpf_xdp_link_attach(Ptr<bpf_attr> attr2, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_xdp_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_xdp_link_detach(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_xdp_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_xdp_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_xdp_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_xdp_link_show_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void bpf_xdp_link_show_fdinfo(Ptr<bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_xdp_link_update(Ptr<bpf_link> link2, Ptr<bpf_prog> new_prog, Ptr<bpf_prog> old_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_xdp_metadata_kfunc_id(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_xdp_metadata_rx_hash((const struct xdp_md*)$arg1, $arg2, $arg3)")
    public static int bpf_xdp_metadata_rx_hash(Ptr<XdpDefinitions.xdp_md> ctx, Ptr<@Unsigned Integer> hash2, Ptr<XdpDefinitions.xdp_rss_hash_type> rss_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_xdp_metadata_rx_timestamp((const struct xdp_md*)$arg1, $arg2)")
    public static int bpf_xdp_metadata_rx_timestamp(Ptr<XdpDefinitions.xdp_md> ctx, Ptr<@Unsigned Long> timestamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_xdp_metadata_rx_vlan_tag((const struct xdp_md*)$arg1, $arg2, $arg3)")
    public static int bpf_xdp_metadata_rx_vlan_tag(Ptr<XdpDefinitions.xdp_md> ctx, Ptr<@Unsigned @OriginalName(value="__be16") Short> vlan_proto, Ptr<@Unsigned Short> vlan_tci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_xmit(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_arch_text_poke(Ptr<?> ip, bpf_text_poke_type t, Ptr<?> old_addr, Ptr<?> new_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_array_map_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_event_entry_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_local_storage_free_trace_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_local_storage_insert_cache(Ptr<bpf_local_storage> local_storage, Ptr<bpf_local_storage_map> smap, Ptr<bpf_local_storage_elem> selem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __bpf_map_area_alloc(@Unsigned long size, int numa_node, boolean mmapable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> __bpf_map_inc_not_zero(Ptr<bpf_map> map2, boolean uref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __bpf_offload_dev_match(Ptr<bpf_prog> prog, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_offload_dev_netdev_register(Ptr<bpf_offload_dev> offdev, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_offload_dev_netdev_unregister(Ptr<bpf_offload_dev> offdev, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_prog_dev_bound_init(Ptr<bpf_prog> prog, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __bpf_prog_enter(Ptr<bpf_prog> prog, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __bpf_prog_enter_lsm_cgroup(Ptr<bpf_prog> prog, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __bpf_prog_enter_recur(Ptr<bpf_prog> prog, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __bpf_prog_enter_sleepable(Ptr<bpf_prog> prog, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __bpf_prog_enter_sleepable_recur(Ptr<bpf_prog> prog, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_exit(Ptr<bpf_prog> prog, @Unsigned long start, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_exit_lsm_cgroup(Ptr<bpf_prog> prog, @Unsigned long start, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_exit_recur(Ptr<bpf_prog> prog, @Unsigned long start, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_exit_sleepable(Ptr<bpf_prog> prog, @Unsigned long start, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_exit_sleepable_recur(Ptr<bpf_prog> prog, @Unsigned long start, Ptr<bpf_tramp_run_ctx> run_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> __bpf_prog_get(@Unsigned int ufd, Ptr<bpf_prog_type> attach_type, boolean attach_drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_offload_destroy(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_put(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_put_noref(Ptr<bpf_prog> prog, boolean deferred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_prog_put_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_redirect(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_redirect_no_mac(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_selem_free_trace_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_setsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> __bpf_sk_lookup(Ptr<SkDefinitions.sk_buff> skb, Ptr<bpf_sock_tuple> tuple, @Unsigned int len, Ptr<runtime.net> caller_net, @Unsigned int ifindex, char proto2, @Unsigned long netns_id, @Unsigned long flags, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_sk_storage_map_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<bpf_local_storage_elem> selem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_skb_change_tail(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int new_len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_skb_load_bytes((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static int __bpf_skb_load_bytes(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int offset, Ptr<?> to, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_skb_store_bytes($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int __bpf_skb_store_bytes(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int offset, Ptr<?> from, @Unsigned int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> __bpf_skc_lookup(Ptr<SkDefinitions.sk_buff> skb, Ptr<bpf_sock_tuple> tuple, @Unsigned int len, Ptr<runtime.net> caller_net, @Unsigned int ifindex, char proto2, @Unsigned long netns_id, @Unsigned long flags, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_struct_ops_map_free(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_br_fdb_add($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void __bpf_trace_br_fdb_add(Ptr<?> __data, Ptr<runtime.ndmsg> ndm, Ptr<NetDefinitions.net_device> dev, String addr2, @Unsigned short vid, @Unsigned short nlh_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_br_fdb_external_learn_add($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static void __bpf_trace_br_fdb_external_learn_add(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_port> p, String addr2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_br_fdb_update($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void __bpf_trace_br_fdb_update(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_port> source, String addr2, @Unsigned short vid, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_br_mdb_full($arg1, (const struct net_device*)$arg2, (const struct br_ip*)$arg3)")
    public static void __bpf_trace_br_mdb_full(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<misc.br_ip> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_cgroup($arg1, $arg2, (const u8*)$arg3)")
    public static void __bpf_trace_cgroup(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_cgroup_event($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __bpf_trace_cgroup_event(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_cgroup_migrate($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __bpf_trace_cgroup_migrate(Ptr<?> __data, Ptr<runtime.cgroup> dst_cgrp, String path2, Ptr<TaskDefinitions.task_struct> task2, boolean threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cgroup_root(Ptr<?> __data, Ptr<CgroupDefinitions.cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cgroup_rstat(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_consume_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cros_ec_request_done(Ptr<?> __data, Ptr<CrosDefinitions.cros_ec_command> cmd, int retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_cros_ec_request_start(Ptr<?> __data, Ptr<CrosDefinitions.cros_ec_command> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dax_insert_mapping(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dax_pmd_fault_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long max_pgoff, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dax_pmd_insert_mapping_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, long length,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dax_pmd_load_hole_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> zero_folio, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dax_pte_fault_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dax_writeback_one(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long pgoff, @Unsigned long pglen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dax_writeback_range_class(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long start_index, @Unsigned long end_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_devfreq_frequency(Ptr<?> __data, Ptr<runtime.devfreq> devfreq2, @Unsigned long freq, @Unsigned long prev_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_devfreq_monitor(Ptr<?> __data, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_devlink_health_recover_aborted($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __bpf_trace_devlink_health_recover_aborted(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, boolean health_state, @Unsigned long time_since_last_recover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_devlink_health_report($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void __bpf_trace_devlink_health_report(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_devlink_health_reporter_state_update($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4)")
    public static void __bpf_trace_devlink_health_reporter_state_update(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, boolean new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_devlink_hwerr($arg1, (const struct devlink*)$arg2, $arg3, (const u8*)$arg4)")
    public static void __bpf_trace_devlink_hwerr(Ptr<?> __data, Ptr<runtime.devlink> devlink2, int err, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_devlink_hwmsg($arg1, (const struct devlink*)$arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void __bpf_trace_devlink_hwmsg(Ptr<?> __data, Ptr<runtime.devlink> devlink2, boolean incoming, @Unsigned long type2, Ptr<Character> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_devlink_trap_report($arg1, (const struct devlink*)$arg2, $arg3, (const struct devlink_trap_metadata*)$arg4)")
    public static void __bpf_trace_devlink_trap_report(Ptr<?> __data, Ptr<runtime.devlink> devlink2, Ptr<SkDefinitions.sk_buff> skb, Ptr<DevlinkDefinitions.devlink_trap_metadata> metadata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_alloc(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<?> virt_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_free(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<?> virt_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_map(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_map_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, int ents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_sync_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_sync_single(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_unmap(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dma_unmap_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_dql_stall_detected(Ptr<?> __data, @Unsigned short thrs, @Unsigned int len, @Unsigned long last_reap, @Unsigned long hist_head, @Unsigned long now, Ptr<@Unsigned Long> hist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_emulate_vsyscall(Ptr<?> __data, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_error_da_monitor_id(Ptr<?> __data, int id, String state2, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_error_report_template(Ptr<?> __data, misc.error_detector error_detector2, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_event_da_monitor_id(Ptr<?> __data, int id, String state2, String event2, String next_state, boolean final_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_fdb_delete(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_fdb_entry> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_fib_table_lookup($arg1, $arg2, (const struct flowi4*)$arg3, (const struct fib_nh_common*)$arg4, $arg5)")
    public static void __bpf_trace_fib_table_lookup(Ptr<?> __data, @Unsigned int tb_id, Ptr<runtime.flowi4> flp, Ptr<FibDefinitions.fib_nh_common> nhc, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_file_check_and_advance_wb_err(Ptr<?> __data, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="errseq_t") int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_filelock_lease(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_filelock_lock(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> fl, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_filemap_set_wb_err(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="errseq_t") int eseq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_fuse_request_end($arg1, (const struct fuse_req*)$arg2)")
    public static void __bpf_trace_fuse_request_end(Ptr<?> __data, Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_fuse_request_send($arg1, (const struct fuse_req*)$arg2)")
    public static void __bpf_trace_fuse_request_send(Ptr<?> __data, Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_generic_add_lease(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_handshake_alert_class($arg1, (const struct sock*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_handshake_alert_class(Ptr<?> __data, Ptr<runtime.sock> sk, char level, char description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_handshake_complete($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __bpf_trace_handshake_complete(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_handshake_error_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __bpf_trace_handshake_error_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_handshake_event_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4)")
    public static void __bpf_trace_handshake_event_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_handshake_fd_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void __bpf_trace_handshake_fd_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hugepage_set(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_hugepage_update(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte, @Unsigned long clr, @Unsigned long set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_i2c_read($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void __bpf_trace_i2c_read(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_i2c_reply($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void __bpf_trace_i2c_reply(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_i2c_result($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_i2c_result(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, int num, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_i2c_write($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void __bpf_trace_i2c_write(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_inet_sk_error_report($arg1, (const struct sock*)$arg2)")
    public static void __bpf_trace_inet_sk_error_report(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_inet_sock_set_state($arg1, (const struct sock*)$arg2, (const int)$arg3, (const int)$arg4)")
    public static void __bpf_trace_inet_sock_set_state(Ptr<?> __data, Ptr<runtime.sock> sk, int oldstate, int newstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_irq_handler_entry(Ptr<?> __data, int irq, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_irq_handler_exit(Ptr<?> __data, int irq, Ptr<runtime.irqaction> action, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_irq_matrix_cpu(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_irq_matrix_global(Ptr<?> __data, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_irq_matrix_global_update(Ptr<?> __data, int bit, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_kfree($arg1, $arg2, (const void*)$arg3)")
    public static void __bpf_trace_kfree(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_kfree_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2, SkbDefinitions.skb_drop_reason reason, Ptr<runtime.sock> rx_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_kmalloc($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void __bpf_trace_kmalloc(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, @Unsigned long bytes_req, @Unsigned long bytes_alloc, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_kmem_cache_alloc($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static void __bpf_trace_kmem_cache_alloc(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_kmem_cache_free($arg1, $arg2, (const void*)$arg3, (const struct kmem_cache*)$arg4)")
    public static void __bpf_trace_kmem_cache_free(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ksm_advisor(Ptr<?> __data, long scan_time, @Unsigned long pages_to_scan, @Unsigned int cpu_percent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ksm_enter_exit_template(Ptr<?> __data, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ksm_merge_one_page(Ptr<?> __data, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ksm_merge_with_ksm_page(Ptr<?> __data, Ptr<?> ksm_page, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ksm_remove_ksm_page(Ptr<?> __data, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ksm_remove_rmap_item(Ptr<?> __data, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_ksm_scan_template(Ptr<?> __data, int seq, @Unsigned int rmap_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_leases_conflict(Ptr<?> __data, boolean conflict, Ptr<FileDefinitions.file_lease> lease, Ptr<FileDefinitions.file_lease> breaker) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_locks_get_lock_context(Ptr<?> __data, Ptr<runtime.inode> inode2, int type2, Ptr<FileDefinitions.file_lock_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_mctp_key_acquire($arg1, (const struct mctp_sk_key*)$arg2)")
    public static void __bpf_trace_mctp_key_acquire(Ptr<?> __data, Ptr<MctpDefinitions.mctp_sk_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_mctp_key_release($arg1, (const struct mctp_sk_key*)$arg2, $arg3)")
    public static void __bpf_trace_mctp_key_release(Ptr<?> __data, Ptr<MctpDefinitions.mctp_sk_key> key2, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_migration_pmd(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_alloc_contig_migrate_range_info(Ptr<?> __data, @Unsigned long start, @Unsigned long end, @Unsigned long nr_migrated, @Unsigned long nr_reclaimed, @Unsigned long nr_mapped, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_filemap_fault(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_filemap_op_page_cache(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_filemap_op_page_cache_range(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned long last_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_lru_activate(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_lru_insertion(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_page(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, int migratetype2, int percpu_refill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_page_alloc(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_page_alloc_extfrag(Ptr<?> __data, Ptr<runtime.page> page2, int alloc_order, int fallback_order, int alloc_migratetype, int fallback_migratetype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_page_free(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_page_free_batched(Ptr<?> __data, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_mm_page_pcpu_drain(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_napi_poll(Ptr<?> __data, Ptr<NapiDefinitions.napi_struct> napi, int work, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_neigh__update(Ptr<?> __data, Ptr<runtime.neighbour> n, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_neigh_create($arg1, $arg2, $arg3, (const void*)$arg4, (const struct neighbour*)$arg5, $arg6)")
    public static void __bpf_trace_neigh_create(Ptr<?> __data, Ptr<NeighDefinitions.neigh_table> tbl, Ptr<NetDefinitions.net_device> dev, Ptr<?> pkey, Ptr<runtime.neighbour> n, boolean exempt_from_gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_neigh_update($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static void __bpf_trace_neigh_update(Ptr<?> __data, Ptr<runtime.neighbour> n, Ptr<Character> lladdr, char _new, @Unsigned int flags, @Unsigned int nlmsg_pid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_net_dev_rx_exit_template(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_net_dev_rx_verbose_template($arg1, (const struct sk_buff*)$arg2)")
    public static void __bpf_trace_net_dev_rx_verbose_template(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_net_dev_start_xmit($arg1, (const struct sk_buff*)$arg2, (const struct net_device*)$arg3)")
    public static void __bpf_trace_net_dev_start_xmit(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_net_dev_template(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_net_dev_xmit(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int rc2, Ptr<NetDefinitions.net_device> dev, @Unsigned int skb_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_net_dev_xmit_timeout(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, int queue_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_netlink_extack($arg1, (const u8*)$arg2)")
    public static void __bpf_trace_netlink_extack(Ptr<?> __data, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_notifier_info(Ptr<?> __data, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_page_pool_release($arg1, (const struct page_pool*)$arg2, $arg3, $arg4, $arg5)")
    public static void __bpf_trace_page_pool_release(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, int inflight, @Unsigned int hold, @Unsigned int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_page_pool_state_hold($arg1, (const struct page_pool*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_page_pool_state_hold(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int hold) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_page_pool_state_release($arg1, (const struct page_pool*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_page_pool_state_release(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_page_pool_update_nid($arg1, (const struct page_pool*)$arg2, $arg3)")
    public static void __bpf_trace_page_pool_update_nid(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, int new_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_qdisc_create($arg1, (const struct Qdisc_ops*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_qdisc_create(Ptr<?> __data, Ptr<QdiscDefinitions.Qdisc_ops> ops, Ptr<NetDefinitions.net_device> dev, @Unsigned int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_qdisc_dequeue($arg1, $arg2, (const struct netdev_queue*)$arg3, $arg4, $arg5)")
    public static void __bpf_trace_qdisc_dequeue(Ptr<?> __data, Ptr<runtime.Qdisc> qdisc, Ptr<NetdevDefinitions.netdev_queue> txq, int packets, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_qdisc_destroy(Ptr<?> __data, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_qdisc_enqueue($arg1, $arg2, (const struct netdev_queue*)$arg3, $arg4)")
    public static void __bpf_trace_qdisc_enqueue(Ptr<?> __data, Ptr<runtime.Qdisc> qdisc, Ptr<NetdevDefinitions.netdev_queue> txq, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_qdisc_reset(Ptr<?> __data, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_regulator_basic($arg1, (const u8*)$arg2)")
    public static void __bpf_trace_regulator_basic(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_regulator_range($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __bpf_trace_regulator_range(Ptr<?> __data, String name, int min, int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_regulator_value($arg1, (const u8*)$arg2, $arg3)")
    public static void __bpf_trace_regulator_value(Ptr<?> __data, String name, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rpm_internal(Ptr<?> __data, Ptr<runtime.device> dev, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rpm_return_int(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned long ip, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rpm_status(Ptr<?> __data, Ptr<runtime.device> dev, RpmDefinitions.rpm_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rss_stat(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int member) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rtc_alarm_irq_enable(Ptr<?> __data, @Unsigned int enabled, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rtc_irq_set_freq(Ptr<?> __data, int freq, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rtc_irq_set_state(Ptr<?> __data, int enabled, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rtc_offset_class(Ptr<?> __data, long offset, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rtc_time_alarm_class(Ptr<?> __data, @OriginalName(value="time64_t") long secs, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_rtc_timer_class(Ptr<?> __data, Ptr<RtcDefinitions.rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_sched_ext_dump($arg1, (const u8*)$arg2)")
    public static void __bpf_trace_sched_ext_dump(Ptr<?> __data, String line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_sk_data_ready($arg1, (const struct sock*)$arg2)")
    public static void __bpf_trace_sk_data_ready(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_skb_copy_datagram_iovec($arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static void __bpf_trace_skb_copy_datagram_iovec(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sock_exceed_buf_limit(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<runtime.proto> prot, long allocated, int kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sock_msg_length(Ptr<?> __data, Ptr<runtime.sock> sk, int ret, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sock_rcvqueue_full(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_softirq(Ptr<?> __data, @Unsigned int vec_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sys_enter(Ptr<?> __data, Ptr<PtDefinitions.pt_regs> regs, long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_sys_exit(Ptr<?> __data, Ptr<PtDefinitions.pt_regs> regs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tasklet(Ptr<?> __data, Ptr<TaskletDefinitions.tasklet_struct> t, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_ao_event($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const u8)$arg4, (const u8)$arg5, (const u8)$arg6)")
    public static void __bpf_trace_tcp_ao_event(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, char keyid, char rnext, char maclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_ao_event_sk($arg1, (const struct sock*)$arg2, (const u8)$arg3, (const u8)$arg4)")
    public static void __bpf_trace_tcp_ao_event_sk(Ptr<?> __data, Ptr<runtime.sock> sk, char keyid, char rnext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_ao_event_sne($arg1, (const struct sock*)$arg2, $arg3)")
    public static void __bpf_trace_tcp_ao_event_sne(Ptr<?> __data, Ptr<runtime.sock> sk, @Unsigned int new_sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_cong_state_set($arg1, $arg2, (const u8)$arg3)")
    public static void __bpf_trace_tcp_cong_state_set(Ptr<?> __data, Ptr<runtime.sock> sk, char ca_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tcp_event_sk(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_event_sk_skb($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void __bpf_trace_tcp_event_sk_skb(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_event_skb($arg1, (const struct sk_buff*)$arg2)")
    public static void __bpf_trace_tcp_event_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_hash_event($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void __bpf_trace_tcp_hash_event(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_tcp_probe(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_retransmit_synack($arg1, (const struct sock*)$arg2, (const struct request_sock*)$arg3)")
    public static void __bpf_trace_tcp_retransmit_synack(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tcp_send_reset($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const enum sk_rst_reason)$arg4)")
    public static void __bpf_trace_tcp_send_reset(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb__nullable, SkDefinitions.sk_rst_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_test_pages_isolated(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long fin_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bpf_trace_tls_contenttype($arg1, (const struct sock*)$arg2, $arg3)")
    public static void __bpf_trace_tls_contenttype(Ptr<?> __data, Ptr<runtime.sock> sk, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_udp_fail_queue_rcv_skb(Ptr<?> __data, int rc2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_workqueue_activate_work(Ptr<?> __data, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_workqueue_execute_end(Ptr<?> __data, Ptr<misc.work_struct> work, @OriginalName(value="work_func_t") Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_workqueue_execute_start(Ptr<?> __data, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_workqueue_queue_work(Ptr<?> __data, int req_cpu, Ptr<misc.pool_workqueue> pwq, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_trace_x86_exceptions(Ptr<?> __data, @Unsigned long address, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_tramp_enter(Ptr<bpf_tramp_image> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_tramp_exit(Ptr<bpf_tramp_image> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_tramp_image_put_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_tramp_image_put_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_tramp_image_put_rcu_tasks(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bpf_tramp_image_release(Ptr<PercpuDefinitions.percpu_ref> pcref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_trampoline_link_prog(Ptr<bpf_tramp_link> link2, Ptr<bpf_trampoline> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_xdp_load_bytes(Ptr<XdpDefinitions.xdp_buff> xdp2, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bpf_xdp_store_bytes(Ptr<XdpDefinitions.xdp_buff> xdp2, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_arch_poke_desc_update(Ptr<bpf_jit_poke_descriptor> poke, Ptr<bpf_prog> _new, Ptr<bpf_prog> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_array_map_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_array_map_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_array_map_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_array_map_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_audit_prog((const struct bpf_prog*)$arg1, $arg2)")
    public static void bpf_audit_prog(Ptr<bpf_prog> prog, @Unsigned int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_bind(@Unsigned long ctx, @Unsigned long addr2, @Unsigned long addr_len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_cgrp_storage_delete(@Unsigned long map2, @Unsigned long cgroup2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_cgrp_storage_delete_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_cgrp_storage_free(Ptr<runtime.cgroup> cgroup2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_cgrp_storage_get(@Unsigned long map2, @Unsigned long cgroup2, @Unsigned long value, @Unsigned long flags, @Unsigned long gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_cgrp_storage_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_cgrp_storage_update_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_check_classic((const struct sock_filter*)$arg1, $arg2)")
    public static int bpf_check_classic(Ptr<SockDefinitions.sock_filter> filter, @Unsigned int flen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_check_uarg_tail_zero( @OriginalName(value="bpfptr_t") misc.sockptr_t uaddr, @Unsigned long expected_size, @Unsigned long actual_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_clone_redirect(@Unsigned long skb, @Unsigned long ifindex, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int bpf_convert_ctx_access(bpf_access_type type2, Ptr<bpf_insn> si, Ptr<bpf_insn> insn_buf, Ptr<bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_convert_filter(Ptr<SockDefinitions.sock_filter> prog, int len, Ptr<bpf_prog> new_prog, Ptr<Integer> new_len, Ptr<@OriginalName(value="bool") Boolean> seen_ld_abs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_copy_to_user($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int bpf_copy_to_user(String ubuf, String buf, @Unsigned int ulen, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_lskcipher_alloc_tfm((const u8*)$arg1)")
    public static Ptr<?> bpf_crypto_lskcipher_alloc_tfm(String algo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_lskcipher_decrypt($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int bpf_crypto_lskcipher_decrypt(Ptr<?> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> siv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_lskcipher_encrypt($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int bpf_crypto_lskcipher_encrypt(Ptr<?> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> siv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_crypto_lskcipher_free_tfm(Ptr<?> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_crypto_lskcipher_get_flags(Ptr<?> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_lskcipher_has_algo((const u8*)$arg1)")
    public static int bpf_crypto_lskcipher_has_algo(String algo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_crypto_lskcipher_ivsize(Ptr<?> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_crypto_lskcipher_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_crypto_lskcipher_setkey(Ptr<?> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bpf_crypto_lskcipher_statesize(Ptr<?> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_crypto_skcipher_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_crypto_skcipher_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_csum_diff(@Unsigned long from, @Unsigned long from_size, @Unsigned long to, @Unsigned long to_size, @Unsigned long seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_csum_level(@Unsigned long skb, @Unsigned long level, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_csum_update(@Unsigned long skb, @Unsigned long csum, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dev_bound_kfunc_check(Ptr<bpf_verifier_log> log, Ptr<bpf_prog_aux> prog_aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_dev_bound_netdev_unregister(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_dev_bound_resolve_kfunc(Ptr<bpf_prog> prog, @Unsigned int func_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_dispatcher_change_prog(Ptr<bpf_dispatcher> d, Ptr<bpf_prog> from, Ptr<bpf_prog> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dispatcher_prepare(Ptr<bpf_dispatcher> d, Ptr<?> image, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dispatcher_xdp_func((const void*)$arg1, (const struct bpf_insn*)$arg2, $arg3)")
    public static @Unsigned int bpf_dispatcher_xdp_func(Ptr<?> ctx, Ptr<bpf_insn> insnsi, @OriginalName(value="bpf_func_t") Ptr<?> bpf_func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bpf_dummy_read(Ptr<runtime.file> filp, String buf, @Unsigned long siz, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_dummy_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long bpf_dummy_write(Ptr<runtime.file> filp, String buf, @Unsigned long siz, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dynptr_from_skb(Ptr<SkDefinitions.__sk_buff> s2, @Unsigned long flags, Ptr<bpf_dynptr> ptr__uninit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dynptr_from_skb_rdonly(Ptr<SkDefinitions.__sk_buff> skb, @Unsigned long flags, Ptr<bpf_dynptr> ptr__uninit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_dynptr_from_xdp(Ptr<XdpDefinitions.xdp_md> x, @Unsigned long flags, Ptr<bpf_dynptr> ptr__uninit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fd_array_map_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_fd_array_map_update_elem(Ptr<bpf_map> map2, Ptr<runtime.file> map_file, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_fd_sk_storage_delete_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_fd_sk_storage_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_fd_sk_storage_update_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_flow_dissector_load_bytes(@Unsigned long ctx, @Unsigned long offset, @Unsigned long to, @Unsigned long len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_for_each_array_elem(Ptr<bpf_map> map2, @OriginalName(value="bpf_callback_t") Ptr<?> callback_fn, Ptr<?> callback_ctx, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_gen_ld_abs((const struct bpf_insn*)$arg1, $arg2)")
    public static int bpf_gen_ld_abs(Ptr<bpf_insn> orig, Ptr<bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_cgroup_classid(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_cgroup_classid_curr(@Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4, @Unsigned long __ur_5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_get_file_flag(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_get_fsverity_digest(Ptr<runtime.file> file2, Ptr<bpf_dynptr> digest_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_get_fsverity_digest_filter((const struct bpf_prog*)$arg1, $arg2)")
    public static int bpf_get_fsverity_digest_filter(Ptr<bpf_prog> prog, @Unsigned int kfunc_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_hash_recalc(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_listener_sock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_netns_cookie_sk_msg(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_netns_cookie_sock(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_netns_cookie_sock_addr(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_netns_cookie_sock_ops(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_route_realm(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_get_skb_set_tunnel_proto($arg1))")
    public static Ptr<bpf_func_proto> bpf_get_skb_set_tunnel_proto(bpf_func_id which) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_socket_cookie(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_socket_cookie_sock(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_socket_cookie_sock_addr(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_socket_cookie_sock_ops(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_socket_ptr_cookie(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_socket_uid(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_get_unmapped_area(Ptr<runtime.file> filp, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_image_ksym_add(Ptr<bpf_ksym> ksym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_image_ksym_del(Ptr<bpf_ksym> ksym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_image_ksym_init(Ptr<?> data, @Unsigned int size, Ptr<bpf_ksym> ksym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_insn_prepare_dump((const struct bpf_prog*)$arg1, (const struct cred*)$arg2)")
    public static Ptr<bpf_insn> bpf_insn_prepare_dump(Ptr<bpf_prog> prog, Ptr<runtime.cred> f_cred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_ipv4_fib_lookup(Ptr<runtime.net> net2, Ptr<bpf_fib_lookup> params, @Unsigned int flags, boolean check_mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_ipv6_fib_lookup(Ptr<runtime.net> net2, Ptr<bpf_fib_lookup> params, @Unsigned int flags, boolean check_mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_bpf_prog(Ptr<bpf_iter_meta> meta, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_bpf_sk_storage_map(Ptr<bpf_iter_meta> meta, Ptr<bpf_map> map2, Ptr<runtime.sock> sk, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_fini_array_map(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_fini_sk_storage_map(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_fini_udp(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_fini_unix(Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_init_array_map(Ptr<?> priv_data, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_init_sk_storage_map(Ptr<?> priv_data, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_init_udp(Ptr<?> priv_data, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_init_unix(Ptr<?> priv_data, Ptr<bpf_iter_aux_info> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_netlink(Ptr<bpf_iter_meta> meta, Ptr<NetlinkDefinitions.netlink_sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_scx_dsq_destroy(Ptr<bpf_iter_scx_dsq> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_scx_dsq_new(Ptr<bpf_iter_scx_dsq> it, @Unsigned long dsq_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> bpf_iter_scx_dsq_next(Ptr<bpf_iter_scx_dsq> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_udp(Ptr<bpf_iter_meta> meta, Ptr<UdpDefinitions.udp_sock> udp_sk, @Unsigned @OriginalName(value="uid_t") int uid, int bucket2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> bpf_iter_udp_batch(Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_udp_realloc_batch(Ptr<bpf_udp_iter_state> iter2, @Unsigned int new_batch_sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_iter_udp_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_udp_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_iter_udp_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_udp_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_unix(Ptr<bpf_iter_meta> meta, Ptr<UnixDefinitions.unix_sock> unix_sk, @Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> bpf_iter_unix_batch(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_iter_unix_get_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_iter_unix_get_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_unix_realloc_batch(Ptr<bpf_unix_iter_state> iter2, @Unsigned int new_batch_sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_iter_unix_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_iter_unix_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_iter_unix_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_iter_unix_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_kallsyms_lookup_name(@Unsigned long name, @Unsigned long name_sz, @Unsigned long flags, @Unsigned long res, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_kfunc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_l3_csum_replace(@Unsigned long skb, @Unsigned long offset, @Unsigned long from, @Unsigned long to, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_l4_csum_replace(@Unsigned long skb, @Unsigned long offset, @Unsigned long from, @Unsigned long to, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_link> bpf_link_by_id(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_cleanup(Ptr<bpf_link_primer> primer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_defer_dealloc_mult_rcu_gp(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_defer_dealloc_rcu_gp(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_free(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_link> bpf_link_get_curr_or_next(Ptr<@Unsigned Integer> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_link> bpf_link_get_from_fd(@Unsigned int ufd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_inc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_link> bpf_link_inc_not_zero(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_link_init($arg1, $arg2, (const struct bpf_link_ops*)$arg3, $arg4)")
    public static void bpf_link_init(Ptr<bpf_link> link2, bpf_link_type type2, Ptr<bpf_link_ops> ops, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_link_new_fd(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int bpf_link_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> pts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_link_prime(Ptr<bpf_link> link2, Ptr<bpf_link_primer> primer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_put(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_put_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_put_direct(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_link_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_link_settle(Ptr<bpf_link_primer> primer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_link_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_local_storage_alloc(Ptr<?> owner, Ptr<bpf_local_storage_map> smap, Ptr<bpf_local_storage_elem> first_selem, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_local_storage_destroy(Ptr<bpf_local_storage> local_storage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_local_storage_free(Ptr<bpf_local_storage> local_storage, Ptr<bpf_local_storage_map> smap, boolean bpf_ma, boolean reuse_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_local_storage_free_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_local_storage_free_trace_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_local_storage_map_alloc(Ptr<bpf_attr> attr2, Ptr<bpf_local_storage_cache> cache, boolean bpf_ma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_local_storage_map_alloc_check(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_local_storage_map_check_btf((const struct bpf_map*)$arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, (const struct btf_type*)$arg4)")
    public static int bpf_local_storage_map_check_btf(Ptr<bpf_map> map2, Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_type> key_type2, Ptr<BtfDefinitions.btf_type> value_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_local_storage_map_free(Ptr<bpf_map> map2, Ptr<bpf_local_storage_cache> cache, Ptr<Integer> busy_counter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_local_storage_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long bpf_local_storage_map_mem_usage(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_local_storage_data> bpf_local_storage_update(Ptr<?> owner, Ptr<bpf_local_storage_map> smap, Ptr<?> value, @Unsigned long map_flags, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_lsm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_lwt_in_push_encap(@Unsigned long skb, @Unsigned long type2, @Unsigned long hdr, @Unsigned long len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_lwt_seg6_action(@Unsigned long skb, @Unsigned long action, @Unsigned long param2, @Unsigned long param_len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_lwt_seg6_adjust_srh(@Unsigned long skb, @Unsigned long offset, @Unsigned long len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_lwt_seg6_store_bytes(@Unsigned long skb, @Unsigned long offset, @Unsigned long from, @Unsigned long len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_lwt_xmit_push_encap(@Unsigned long skb, @Unsigned long type2, @Unsigned long hdr, @Unsigned long len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_alloc_pages((const struct bpf_map*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int bpf_map_alloc_pages(Ptr<bpf_map> map2, @Unsigned @OriginalName(value="gfp_t") int gfp, int nid, @Unsigned long nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_alloc_percpu((const struct bpf_map*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<?> bpf_map_alloc_percpu(Ptr<bpf_map> map2, @Unsigned long size, @Unsigned long align, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_map_area_alloc(@Unsigned long size, int numa_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_area_free(Ptr<?> area) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_map_area_mmapable_alloc(@Unsigned long size, int numa_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_copy_value(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_do_batch((const union bpf_attr*)$arg1, $arg2, $arg3)")
    public static int bpf_map_do_batch(Ptr<bpf_attr> attr2, Ptr<bpf_attr> uattr, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_free_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_free_id(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_free_mult_rcu_gp(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_free_rcu_gp(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_free_record(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_map_get(@Unsigned int ufd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_map_get_curr_or_next(Ptr<@Unsigned Integer> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_get_fd_by_id((const union bpf_attr*)$arg1)")
    public static int bpf_map_get_fd_by_id(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_get_memcg((const struct bpf_map*)$arg1)")
    public static Ptr<MemDefinitions.mem_cgroup> bpf_map_get_memcg(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_map_get_with_uref(@Unsigned int ufd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_inc(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_map_inc_not_zero(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_inc_with_uref(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_init_from_attr(Ptr<bpf_map> map2, Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_kmalloc_node((const struct bpf_map*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<?> bpf_map_kmalloc_node(Ptr<bpf_map> map2, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_map_kvcalloc(Ptr<bpf_map> map2, @Unsigned long n, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_kzalloc((const struct bpf_map*)$arg1, $arg2, $arg3)")
    public static Ptr<?> bpf_map_kzalloc(Ptr<bpf_map> map2, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_mmap(Ptr<runtime.file> filp, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_mmap_close(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_mmap_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_new_fd(Ptr<bpf_map> map2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_offload_delete_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_offload_get_next_key(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_offload_info_fill(Ptr<bpf_map_info> info2, Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NsDefinitions.ns_common> bpf_map_offload_info_fill_ns(Ptr<?> private_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_offload_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_map_offload_map_alloc(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_offload_map_free(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_offload_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long bpf_map_offload_map_mem_usage(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_offload_ndo(Ptr<bpf_offloaded_map> offmap, bpf_netdev_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_offload_update_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int bpf_map_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> pts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_put(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_put_uref(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_put_with_uref(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_map_struct_ops_info_fill(Ptr<bpf_map_info> info2, Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_map_update_value(Ptr<bpf_map> map2, Ptr<runtime.file> map_file, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_value_size((const struct bpf_map*)$arg1)")
    public static @Unsigned int bpf_map_value_size(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_map_write_active((const struct bpf_map*)$arg1)")
    public static boolean bpf_map_write_active(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_msg_apply_bytes(@Unsigned long msg, @Unsigned long bytes, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_msg_cork_bytes(@Unsigned long msg, @Unsigned long bytes, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_msg_pop_data(@Unsigned long msg, @Unsigned long start, @Unsigned long len, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_msg_pull_data(@Unsigned long msg, @Unsigned long start, @Unsigned long end, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_msg_push_data(@Unsigned long msg, @Unsigned long start, @Unsigned long len, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_noop_prologue($arg1, $arg2, (const struct bpf_prog*)$arg3)")
    public static int bpf_noop_prologue(Ptr<bpf_insn> insn_buf, boolean direct_write, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_obj_free_fields((const struct btf_record*)$arg1, $arg2)")
    public static void bpf_obj_free_fields(Ptr<BtfDefinitions.btf_record> rec, Ptr<?> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_obj_free_timer((const struct btf_record*)$arg1, $arg2)")
    public static void bpf_obj_free_timer(Ptr<BtfDefinitions.btf_record> rec, Ptr<?> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_obj_free_workqueue((const struct btf_record*)$arg1, $arg2)")
    public static void bpf_obj_free_workqueue(Ptr<BtfDefinitions.btf_record> rec, Ptr<?> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_obj_get_info_by_fd((const union bpf_attr*)$arg1, $arg2)")
    public static int bpf_obj_get_info_by_fd(Ptr<bpf_attr> attr2, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_obj_get_next_id((const union bpf_attr*)$arg1, $arg2, $arg3, $arg4)")
    public static int bpf_obj_get_next_id(Ptr<bpf_attr> attr2, Ptr<bpf_attr> uattr, Ptr<runtime.idr> idr2, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_obj_name_cpy($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_obj_name_cpy(String dst, String src, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_offload_dev_create((const struct bpf_prog_offload_ops*)$arg1, $arg2)")
    public static Ptr<bpf_offload_dev> bpf_offload_dev_create(Ptr<bpf_prog_offload_ops> ops, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_offload_dev_destroy(Ptr<bpf_offload_dev> offdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_offload_dev_match(Ptr<bpf_prog> prog, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_offload_dev_netdev_register(Ptr<bpf_offload_dev> offdev, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_offload_dev_netdev_unregister(Ptr<bpf_offload_dev> offdev, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_offload_dev_priv(Ptr<bpf_offload_dev> offdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_offload_netdev> bpf_offload_find_netdev(Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_offload_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_offload_prog_map_match(Ptr<bpf_prog> prog, Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_out_neigh_v6(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<bpf_nh_params> nh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_percpu_array_copy(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_percpu_array_update(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_perf_link_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int bpf_perf_link_attach(Ptr<bpf_attr> attr2, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_perf_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_perf_link_fill_common((const struct perf_event*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int bpf_perf_link_fill_common(Ptr<PerfDefinitions.perf_event> event2, String uname, Ptr<@Unsigned Integer> ulenp, Ptr<@Unsigned Long> probe_offset, Ptr<@Unsigned Long> probe_addr, Ptr<@Unsigned Integer> fd_type, Ptr<@Unsigned Long> missed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_perf_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_perf_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_perf_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prepare_filter(Ptr<bpf_prog> fp, @OriginalName(value="bpf_aux_classic_check_t") Ptr<?> trans) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_add(Ptr<bpf_prog> prog, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_attach((const union bpf_attr*)$arg1)")
    public static int bpf_prog_attach(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_attach_check_attach_type((const struct bpf_prog*)$arg1, $arg2)")
    public static int bpf_prog_attach_check_attach_type(Ptr<bpf_prog> prog, bpf_attach_type attach_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_bind_map(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_by_id(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_change_xdp(Ptr<bpf_prog> prev_prog, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_create(Ptr<Ptr<bpf_prog>> pfp, Ptr<SockDefinitions.sock_fprog_kern> fprog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_create_from_user(Ptr<Ptr<bpf_prog>> pfp, Ptr<SockDefinitions.sock_fprog> fprog, @OriginalName(value="bpf_aux_classic_check_t") Ptr<?> trans, boolean save_orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_destroy(Ptr<bpf_prog> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_detach((const union bpf_attr*)$arg1)")
    public static int bpf_prog_detach(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_dev_bound_destroy(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_dev_bound_inherit(Ptr<bpf_prog> new_prog, Ptr<bpf_prog> old_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_dev_bound_init(Ptr<bpf_prog> prog, Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_dev_bound_match((const struct bpf_prog*)$arg1, (const struct bpf_prog*)$arg2)")
    public static boolean bpf_prog_dev_bound_match(Ptr<bpf_prog> lhs, Ptr<bpf_prog> rhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_free_id(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_get(@Unsigned int ufd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_get_curr_or_next(Ptr<@Unsigned Integer> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_get_info_by_fd($arg1, $arg2, (const union bpf_attr*)$arg3, $arg4)")
    public static int bpf_prog_get_info_by_fd(Ptr<runtime.file> file2, Ptr<bpf_prog> prog, Ptr<bpf_attr> attr2, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_prog_get_ok(Ptr<bpf_prog> prog, Ptr<bpf_prog_type> attach_type, boolean attach_drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_get_stats((const struct bpf_prog*)$arg1, $arg2)")
    public static void bpf_prog_get_stats(Ptr<bpf_prog> prog, Ptr<bpf_prog_kstats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_get_type_dev(@Unsigned int ufd, bpf_prog_type type2, boolean attach_drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_has_trampoline((const struct bpf_prog*)$arg1)")
    public static boolean bpf_prog_has_trampoline(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_inc(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_inc_misses_counter(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_prog> bpf_prog_inc_not_zero(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_iter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_load(Ptr<bpf_attr> attr2,  @OriginalName(value="bpfptr_t") misc.sockptr_t uattr, @Unsigned int uattr_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_load_check_attach(bpf_prog_type prog_type, bpf_attach_type expected_attach_type, Ptr<runtime.btf> attach_btf, @Unsigned int btf_id, Ptr<bpf_prog> dst_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_new_fd(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_offload_compile(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_offload_finalize(Ptr<bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_offload_info_fill(Ptr<bpf_prog_info> info2, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NsDefinitions.ns_common> bpf_prog_offload_info_fill_ns(Ptr<?> private_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_offload_remove_insns(Ptr<bpf_verifier_env> env, @Unsigned int off, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_offload_replace_insn(Ptr<bpf_verifier_env> env, @Unsigned int off, Ptr<bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_offload_verifier_prep(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_offload_verify_insn(Ptr<bpf_verifier_env> env, int insn_idx, int prev_insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_put(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_put_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_query((const union bpf_attr*)$arg1, $arg2)")
    public static int bpf_prog_query(Ptr<bpf_attr> attr2, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_prog_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_prog_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_prog_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_store_orig_filter($arg1, (const struct sock_fprog*)$arg2)")
    public static int bpf_prog_store_orig_filter(Ptr<bpf_prog> fp, Ptr<SockDefinitions.sock_fprog> fprog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_prog_sub(Ptr<bpf_prog> prog, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_prog_warn_on_exec((const void*)$arg1, (const struct bpf_insn*)$arg2)")
    public static @Unsigned int bpf_prog_warn_on_exec(Ptr<?> ctx, Ptr<bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_push_seg6_encap(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int type2, Ptr<?> hdr, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_raw_tp_link_attach($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_raw_tp_link_attach(Ptr<bpf_prog> prog, String user_tp_name, @Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_raw_tp_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_raw_tp_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_raw_tp_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_raw_tp_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_raw_tp_link_show_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void bpf_raw_tp_link_show_fdinfo(Ptr<bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_redirect(@Unsigned long ifindex, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_redirect_neigh(@Unsigned long ifindex, @Unsigned long params, @Unsigned long plen, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_redirect_peer(@Unsigned long ifindex, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> bpf_run_sk_reuseport(Ptr<SockDefinitions.sock_reuseport> reuse, Ptr<runtime.sock> sk, Ptr<bpf_prog> prog, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> migrating_sk, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_scx_btf_struct_access($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int bpf_scx_btf_struct_access(Ptr<bpf_verifier_log> log, Ptr<bpf_reg_state> reg, int off, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_scx_check_member((const struct btf_type*)$arg1, (const struct btf_member*)$arg2, (const struct bpf_prog*)$arg3)")
    public static int bpf_scx_check_member(Ptr<BtfDefinitions.btf_type> t, Ptr<BtfDefinitions.btf_member> member, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_scx_get_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_scx_get_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_scx_init(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_scx_init_member((const struct btf_type*)$arg1, (const struct btf_member*)$arg2, $arg3, (const void*)$arg4)")
    public static int bpf_scx_init_member(Ptr<BtfDefinitions.btf_type> t, Ptr<BtfDefinitions.btf_member> member, Ptr<?> kdata, Ptr<?> udata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_scx_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean bpf_scx_is_valid_access(int off, int size, bpf_access_type type2, Ptr<bpf_prog> prog, Ptr<bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_scx_reg(Ptr<?> kdata, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_scx_unreg(Ptr<?> kdata, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_scx_update(Ptr<?> kdata, Ptr<?> old_kdata, Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_scx_validate(Ptr<?> kdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)bpf_search_tcp_opt((const u8*)$arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5, $arg6))")
    public static Ptr<Character> bpf_search_tcp_opt(Ptr<Character> op, Ptr<Character> opend, char search_kind, Ptr<Character> magic, char magic_len, Ptr<@OriginalName(value="bool") Boolean> eol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_local_storage_elem> bpf_selem_alloc(Ptr<bpf_local_storage_map> smap, Ptr<?> owner, Ptr<?> value, boolean charge_mem, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_selem_free(Ptr<bpf_local_storage_elem> selem, Ptr<bpf_local_storage_map> smap, boolean reuse_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_selem_free_trace_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_selem_link_map(Ptr<bpf_local_storage_map> smap, Ptr<bpf_local_storage_elem> selem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_selem_link_storage_nolock(Ptr<bpf_local_storage> local_storage, Ptr<bpf_local_storage_elem> selem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_selem_unlink(Ptr<bpf_local_storage_elem> selem, boolean reuse_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_selem_unlink_map(Ptr<bpf_local_storage_elem> selem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_selem_unlink_storage(Ptr<bpf_local_storage_elem> selem, boolean reuse_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_selem_unlink_storage_nolock(Ptr<bpf_local_storage> local_storage, Ptr<bpf_local_storage_elem> selem, boolean uncharge_mem, boolean reuse_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_set_hash(@Unsigned long skb, @Unsigned long hash2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_set_hash_invalid(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_shim_tramp_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_shim_tramp_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_ancestor_cgroup_id(@Unsigned long sk, @Unsigned long ancestor_level, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_assign(@Unsigned long skb, @Unsigned long sk, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_sk_assign_tcp_reqsk(Ptr<SkDefinitions.__sk_buff> s2, Ptr<runtime.sock> sk, Ptr<bpf_tcp_req_attrs> attrs, int attrs__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)bpf_sk_base_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<bpf_func_proto> bpf_sk_base_func_proto(bpf_func_id func_id, Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_cgroup_id(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_fullsock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_getsockopt(@Unsigned long sk, @Unsigned long level, @Unsigned long optname, @Unsigned long optval, @Unsigned long optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_lookup_assign(@Unsigned long ctx, @Unsigned long sk, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_lookup_tcp(@Unsigned long skb, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_lookup_udp(@Unsigned long skb, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_release(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_setsockopt(@Unsigned long sk, @Unsigned long level, @Unsigned long optname, @Unsigned long optval, @Unsigned long optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_sk_storage_charge(Ptr<bpf_local_storage_map> smap, Ptr<?> owner, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_sk_storage_clone((const struct sock*)$arg1, $arg2)")
    public static int bpf_sk_storage_clone(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_sk_storage_del(Ptr<runtime.sock> sk, Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_storage_delete(@Unsigned long map2, @Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_storage_delete_tracing(@Unsigned long map2, @Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_sk_storage_diag_alloc((const struct nlattr*)$arg1)")
    public static Ptr<bpf_sk_storage_diag> bpf_sk_storage_diag_alloc(Ptr<runtime.nlattr> nla_stgs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_sk_storage_diag_free(Ptr<bpf_sk_storage_diag> diag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_sk_storage_diag_put(Ptr<bpf_sk_storage_diag> diag, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int stg_array_type, Ptr<@Unsigned Integer> res_diag_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_sk_storage_free(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_storage_get(@Unsigned long map2, @Unsigned long sk, @Unsigned long value, @Unsigned long flags, @Unsigned long gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sk_storage_get_tracing(@Unsigned long map2, @Unsigned long sk, @Unsigned long value, @Unsigned long flags, @Unsigned long gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_sk_storage_map_alloc(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_sk_storage_map_free(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_sk_storage_map_iter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_local_storage_elem> bpf_sk_storage_map_seq_find_next(Ptr<bpf_iter_seq_sk_storage_map_info> info2, Ptr<bpf_local_storage_elem> prev_selem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_sk_storage_map_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_sk_storage_map_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_sk_storage_map_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_sk_storage_map_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<bpf_local_storage>> bpf_sk_storage_ptr(Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_sk_storage_tracing_allowed((const struct bpf_prog*)$arg1)")
    public static boolean bpf_sk_storage_tracing_allowed(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_sk_storage_uncharge(Ptr<bpf_local_storage_map> smap, Ptr<?> owner, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_adjust_room(@Unsigned long skb, @Unsigned long len_diff, @Unsigned long mode, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_ancestor_cgroup_id(@Unsigned long skb, @Unsigned long ancestor_level, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_cgroup_classid(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_cgroup_id(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_change_head(@Unsigned long skb, @Unsigned long head_room, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_change_proto(@Unsigned long skb, @Unsigned long proto2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_change_tail(@Unsigned long skb, @Unsigned long new_len, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_change_type(@Unsigned long skb, @Unsigned long pkt_type, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_check_mtu(@Unsigned long skb, @Unsigned long ifindex, @Unsigned long mtu_len, @Unsigned long len_diff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_skb_copy($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static @Unsigned long bpf_skb_copy(Ptr<?> dst_buff, Ptr<?> skb, @Unsigned long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_ecn_set_ce(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_event_output(@Unsigned long skb, @Unsigned long map2, @Unsigned long flags, @Unsigned long meta, @Unsigned long meta_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_fib_lookup(@Unsigned long skb, @Unsigned long params, @Unsigned long plen, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_skb_generic_pop(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int off, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_skb_generic_push(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int off, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_get_nlattr(@Unsigned long skb, @Unsigned long a, @Unsigned long x, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_get_nlattr_nest(@Unsigned long skb, @Unsigned long a, @Unsigned long x, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_get_pay_offset(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_get_tunnel_key(@Unsigned long skb, @Unsigned long to, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_get_tunnel_opt(@Unsigned long skb, @Unsigned long to, @Unsigned long size, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_get_xfrm_state(@Unsigned long skb, @Unsigned long index2, @Unsigned long to, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_load_bytes(@Unsigned long skb, @Unsigned long offset, @Unsigned long to, @Unsigned long len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_load_bytes_relative(@Unsigned long skb, @Unsigned long offset, @Unsigned long to, @Unsigned long len, @Unsigned long start_header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_load_helper_16(@Unsigned long skb, @Unsigned long data, @Unsigned long headlen, @Unsigned long offset, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_load_helper_16_no_cache(@Unsigned long skb, @Unsigned long offset, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_load_helper_32(@Unsigned long skb, @Unsigned long data, @Unsigned long headlen, @Unsigned long offset, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_load_helper_32_no_cache(@Unsigned long skb, @Unsigned long offset, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_load_helper_8(@Unsigned long skb, @Unsigned long data, @Unsigned long headlen, @Unsigned long offset, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_load_helper_8_no_cache(@Unsigned long skb, @Unsigned long offset, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_skb_net_grow(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int off, @Unsigned int len_diff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_pull_data(@Unsigned long skb, @Unsigned long len, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_set_tstamp(@Unsigned long skb, @Unsigned long tstamp, @Unsigned long tstamp_type, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_set_tunnel_key(@Unsigned long skb, @Unsigned long from, @Unsigned long size, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_set_tunnel_opt(@Unsigned long skb, @Unsigned long from, @Unsigned long size, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_store_bytes(@Unsigned long skb, @Unsigned long offset, @Unsigned long from, @Unsigned long len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_under_cgroup(@Unsigned long skb, @Unsigned long map2, @Unsigned long idx, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_vlan_pop(@Unsigned long skb, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skb_vlan_push(@Unsigned long skb, @Unsigned long vlan_proto, @Unsigned long vlan_tci, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skc_lookup_tcp(@Unsigned long skb, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skc_to_mptcp_sock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skc_to_tcp6_sock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skc_to_tcp_request_sock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skc_to_tcp_sock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skc_to_tcp_timewait_sock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skc_to_udp6_sock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_skc_to_unix_sock(@Unsigned long sk, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_addr_getsockopt(@Unsigned long ctx, @Unsigned long level, @Unsigned long optname, @Unsigned long optval, @Unsigned long optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_sock_addr_set_sun_path($arg1, (const u8*)$arg2, $arg3)")
    public static int bpf_sock_addr_set_sun_path(Ptr<bpf_sock_addr_kern> sa_kern, Ptr<Character> sun_path, @Unsigned int sun_path__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_addr_setsockopt(@Unsigned long ctx, @Unsigned long level, @Unsigned long optname, @Unsigned long optval, @Unsigned long optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_addr_sk_lookup_tcp(@Unsigned long ctx, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_addr_sk_lookup_udp(@Unsigned long ctx, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_addr_skc_lookup_tcp(@Unsigned long ctx, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_sock_common_is_valid_access(int off, int size, bpf_access_type type2, Ptr<bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_sock_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int bpf_sock_convert_ctx_access(bpf_access_type type2, Ptr<bpf_insn> si, Ptr<bpf_insn> insn_buf, Ptr<bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_sock_destroy(Ptr<SockDefinitions.sock_common> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_from_file(@Unsigned long file2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_ops_cb_flags_set(@Unsigned long bpf_sock2, @Unsigned long argval, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_ops_getsockopt(@Unsigned long bpf_sock2, @Unsigned long level, @Unsigned long optname, @Unsigned long optval, @Unsigned long optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_ops_load_hdr_opt(@Unsigned long bpf_sock2, @Unsigned long search_res, @Unsigned long len, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_ops_reserve_hdr_opt(@Unsigned long bpf_sock2, @Unsigned long len, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_ops_setsockopt(@Unsigned long bpf_sock2, @Unsigned long level, @Unsigned long optname, @Unsigned long optval, @Unsigned long optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sock_ops_store_hdr_opt(@Unsigned long bpf_sock2, @Unsigned long from, @Unsigned long len, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_stats_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int bpf_stats_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_stats_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_struct_ops_desc_init(Ptr<bpf_struct_ops_desc> st_ops_desc, Ptr<runtime.btf> btf2, Ptr<bpf_verifier_log> log) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_struct_ops_desc_release(Ptr<bpf_struct_ops_desc> st_ops_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_struct_ops_get((const void*)$arg1)")
    public static boolean bpf_struct_ops_get(Ptr<?> kdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_struct_ops_image_free(Ptr<?> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_struct_ops_link_create(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_struct_ops_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_struct_ops_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_map> bpf_struct_ops_map_alloc(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_struct_ops_map_alloc_check(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_struct_ops_map_delete_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_struct_ops_map_free(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_struct_ops_map_get_next_key(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_struct_ops_map_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_struct_ops_map_link_detach(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_struct_ops_map_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_struct_ops_map_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int bpf_struct_ops_map_link_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> pts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_struct_ops_map_link_show_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void bpf_struct_ops_map_link_show_fdinfo(Ptr<bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_struct_ops_map_link_update(Ptr<bpf_link> link2, Ptr<bpf_map> new_map, Ptr<bpf_map> expected_old_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_struct_ops_map_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_struct_ops_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long bpf_struct_ops_map_mem_usage(Ptr<bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_struct_ops_map_seq_show_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_struct_ops_map_sys_lookup_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bpf_struct_ops_map_update_elem(Ptr<bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_struct_ops_prepare_trampoline($arg1, $arg2, (const struct btf_func_model*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int bpf_struct_ops_prepare_trampoline(Ptr<bpf_tramp_links> tlinks, Ptr<bpf_tramp_link> link2, Ptr<BtfDefinitions.btf_func_model> model, Ptr<?> stub_func, Ptr<Ptr<?>> _image, Ptr<@Unsigned Integer> _image_off, boolean allow_alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_struct_ops_put((const void*)$arg1)")
    public static void bpf_struct_ops_put(Ptr<?> kdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_struct_ops_supported((const struct bpf_struct_ops*)$arg1, $arg2)")
    public static int bpf_struct_ops_supported(Ptr<bpf_struct_ops> st_ops, @Unsigned int moff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sys_bpf(@Unsigned long cmd, @Unsigned long attr2, @Unsigned long attr_size, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_sys_close(@Unsigned long fd2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_syscall_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_task_fd_query((const union bpf_attr*)$arg1, $arg2)")
    public static int bpf_task_fd_query(Ptr<bpf_attr> attr2, Ptr<bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_task_fd_query_copy((const union bpf_attr*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6, $arg7)")
    public static int bpf_task_fd_query_copy(Ptr<bpf_attr> attr2, Ptr<bpf_attr> uattr, @Unsigned int prog_id, @Unsigned int fd_type, String buf, @Unsigned long probe_offset, @Unsigned long probe_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tc_sk_lookup_tcp(@Unsigned long skb, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tc_sk_lookup_udp(@Unsigned long skb, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tc_skc_lookup_tcp(@Unsigned long skb, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tcp_check_syncookie(@Unsigned long sk, @Unsigned long iph, @Unsigned long iph_len, @Unsigned long th, @Unsigned long th_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tcp_gen_syncookie(@Unsigned long sk, @Unsigned long iph, @Unsigned long iph_len, @Unsigned long th, @Unsigned long th_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tcp_raw_check_syncookie_ipv4(@Unsigned long iph, @Unsigned long th, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tcp_raw_check_syncookie_ipv6(@Unsigned long iph, @Unsigned long th, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tcp_raw_gen_syncookie_ipv4(@Unsigned long iph, @Unsigned long th, @Unsigned long th_len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_tcp_raw_gen_syncookie_ipv6(@Unsigned long iph, @Unsigned long th, @Unsigned long th_len, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_tcp_sock_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int bpf_tcp_sock_convert_ctx_access(bpf_access_type type2, Ptr<bpf_insn> si, Ptr<bpf_insn> insn_buf, Ptr<bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_tcp_sock_is_valid_access(int off, int size, bpf_access_type type2, Ptr<bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_token_allow_cmd((const struct bpf_token*)$arg1, $arg2)")
    public static boolean bpf_token_allow_cmd(Ptr<bpf_token> token, bpf_cmd cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_token_allow_map_type((const struct bpf_token*)$arg1, $arg2)")
    public static boolean bpf_token_allow_map_type(Ptr<bpf_token> token, bpf_map_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_token_allow_prog_type((const struct bpf_token*)$arg1, $arg2, $arg3)")
    public static boolean bpf_token_allow_prog_type(Ptr<bpf_token> token, bpf_prog_type prog_type, bpf_attach_type attach_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_token_capable((const struct bpf_token*)$arg1, $arg2)")
    public static boolean bpf_token_capable(Ptr<bpf_token> token, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_token_create(Ptr<bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_token_free(Ptr<bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_token> bpf_token_get_from_fd(@Unsigned int ufd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_token_inc(Ptr<bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_token_put(Ptr<bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_token_put_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_token_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_token_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tracing_link_dealloc(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_tracing_link_fill_link_info((const struct bpf_link*)$arg1, $arg2)")
    public static int bpf_tracing_link_fill_link_info(Ptr<bpf_link> link2, Ptr<bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tracing_link_release(Ptr<bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_tracing_link_show_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void bpf_tracing_link_show_fdinfo(Ptr<bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_tracing_prog_attach(Ptr<bpf_prog> prog, int tgt_prog_fd, @Unsigned int btf_id, @Unsigned long bpf_cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_tramp_ftrace_ops_func(Ptr<FtraceDefinitions.ftrace_ops> ops, FtraceDefinitions.ftrace_ops_cmd cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tramp_image_free(Ptr<bpf_tramp_image> im) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_tramp_image_put(Ptr<bpf_tramp_image> im) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_trampoline_enter((const struct bpf_prog*)$arg1)")
    public static @OriginalName(value="bpf_trampoline_enter_t") Ptr<?> bpf_trampoline_enter(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_trampoline_exit((const struct bpf_prog*)$arg1)")
    public static @OriginalName(value="bpf_trampoline_exit_t") Ptr<?> bpf_trampoline_exit(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_trampoline> bpf_trampoline_get(@Unsigned long key2, Ptr<bpf_attach_target_info> tgt_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_trampoline_link_cgroup_shim(Ptr<bpf_prog> prog, int cgroup_atype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_trampoline_link_prog(Ptr<bpf_tramp_link> link2, Ptr<bpf_trampoline> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bpf_trampoline> bpf_trampoline_lookup(@Unsigned long key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trampoline_put(Ptr<bpf_trampoline> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_trampoline_unlink_cgroup_shim(Ptr<bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_trampoline_unlink_prog(Ptr<bpf_tramp_link> link2, Ptr<bpf_trampoline> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_trampoline_update(Ptr<bpf_trampoline> tr, boolean lock_direct_mutex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_unlocked_sk_getsockopt(@Unsigned long sk, @Unsigned long level, @Unsigned long optname, @Unsigned long optval, @Unsigned long optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_unlocked_sk_setsockopt(@Unsigned long sk, @Unsigned long level, @Unsigned long optname, @Unsigned long optval, @Unsigned long optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_unpriv_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int bpf_unpriv_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_update_srh_state(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_warn_invalid_xdp_action(Ptr<NetDefinitions.net_device> dev, Ptr<bpf_prog> prog, @Unsigned int act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_adjust_head(@Unsigned long xdp2, @Unsigned long offset, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_adjust_meta(@Unsigned long xdp2, @Unsigned long offset, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_adjust_tail(@Unsigned long xdp2, @Unsigned long offset, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_check_mtu(@Unsigned long xdp2, @Unsigned long ifindex, @Unsigned long mtu_len, @Unsigned long len_diff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_xdp_copy($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static @Unsigned long bpf_xdp_copy(Ptr<?> dst, Ptr<?> ctx, @Unsigned long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bpf_xdp_copy_buf(Ptr<XdpDefinitions.xdp_buff> xdp2, @Unsigned long off, Ptr<?> buf, @Unsigned long len, boolean flush) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_event_output(@Unsigned long xdp2, @Unsigned long map2, @Unsigned long flags, @Unsigned long meta, @Unsigned long meta_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_fib_lookup(@Unsigned long ctx, @Unsigned long params, @Unsigned long plen, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bpf_xdp_frags_shrink_tail(Ptr<XdpDefinitions.xdp_buff> xdp2, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_get_buff_len(@Unsigned long xdp2, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_load_bytes(@Unsigned long xdp2, @Unsigned long offset, @Unsigned long buf, @Unsigned long len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bpf_xdp_pointer(Ptr<XdpDefinitions.xdp_buff> xdp2, @Unsigned int offset, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_redirect(@Unsigned long ifindex, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_redirect_map(@Unsigned long map2, @Unsigned long key2, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_sk_lookup_tcp(@Unsigned long ctx, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_sk_lookup_udp(@Unsigned long ctx, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_skc_lookup_tcp(@Unsigned long ctx, @Unsigned long tuple, @Unsigned long len, @Unsigned long netns_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bpf_xdp_sock_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int bpf_xdp_sock_convert_ctx_access(bpf_access_type type2, Ptr<bpf_insn> si, Ptr<bpf_insn> insn_buf, Ptr<bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bpf_xdp_sock_is_valid_access(int off, int size, bpf_access_type type2, Ptr<bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bpf_xdp_store_bytes(@Unsigned long xdp2, @Unsigned long offset, @Unsigned long buf, @Unsigned long len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { const struct btf*; unsigned int id; }")
    @NotUsableInJava
    public static class AnonymousType1881419576C48
    extends Struct {
        public Ptr<runtime.btf> btf;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_tcp_congestion_ops")
    @NotUsableInJava
    public static class bpf_struct_ops_tcp_congestion_ops
    extends Struct {
        public bpf_struct_ops_common_value common;
        public TcpDefinitions.tcp_congestion_ops data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_lwt")
    @NotUsableInJava
    public static class bpf_lwt
    extends Struct {
        public bpf_lwt_prog in;
        public bpf_lwt_prog out;
        public bpf_lwt_prog xmit;
        public int family;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_xdp_link")
    @NotUsableInJava
    public static class bpf_xdp_link
    extends Struct {
        public bpf_link link;
        public Ptr<NetDefinitions.net_device> dev;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_stack_map")
    @NotUsableInJava
    public static class bpf_stack_map
    extends Struct {
        public bpf_map map;
        public Ptr<?> elems;
        public PcpuDefinitions.pcpu_freelist freelist;
        public @Unsigned int n_buckets;
        public Ptr<StackDefinitions.stack_map_bucket> @Size(value=0) [] buckets;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_stack_build_id")
    @NotUsableInJava
    public static class bpf_stack_build_id
    extends Struct {
        public int status;
        public char @Size(value=20) [] build_id;
        @InlineUnion(value=90901)
        public @InlineUnion(value=90901) @Unsigned long offset;
        @InlineUnion(value=90901)
        public @InlineUnion(value=90901) @Unsigned long ip;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_stack_build_id_status")
    public static enum bpf_stack_build_id_status implements Enum<bpf_stack_build_id_status>,
    TypedEnum<bpf_stack_build_id_status, Integer>
    {
        BPF_STACK_BUILD_ID_EMPTY,
        BPF_STACK_BUILD_ID_VALID,
        BPF_STACK_BUILD_ID_IP;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cpu_map")
    @NotUsableInJava
    public static class bpf_cpu_map
    extends Struct {
        public bpf_map map;
        public Ptr<Ptr<bpf_cpu_map_entry>> cpu_map;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cpu_map_entry")
    @NotUsableInJava
    public static class bpf_cpu_map_entry
    extends Struct {
        public @Unsigned int cpu;
        public int map_id;
        public Ptr<XdpDefinitions.xdp_bulk_queue> bulkq;
        public Ptr<misc.ptr_ring> queue;
        public Ptr<TaskDefinitions.task_struct> kthread;
        public bpf_cpumap_val value;
        public Ptr<bpf_prog> prog;
        public runtime.completion kthread_running;
        public RcuDefinitions.rcu_work free_work;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cpumap_val")
    @NotUsableInJava
    public static class bpf_cpumap_val
    extends Struct {
        public @Unsigned int qsize;
        public bpf_prog_of_bpf_cpumap_val_and_bpf_prog_of_bpf_devmap_val bpf_prog;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_mem_cache")
    @NotUsableInJava
    public static class bpf_mem_cache
    extends Struct {
        public misc.llist_head free_llist;
        public LocalDefinitions.local_t active;
        public misc.llist_head free_llist_extra;
        public IrqDefinitions.irq_work refill_work;
        public Ptr<ObjDefinitions.obj_cgroup> objcg;
        public int unit_size;
        public int free_cnt;
        public int low_watermark;
        public int high_watermark;
        public int batch;
        public int percpu_size;
        public boolean draining;
        public Ptr<bpf_mem_cache> tgt;
        public misc.llist_head free_by_rcu;
        public Ptr<misc.llist_node> free_by_rcu_tail;
        public misc.llist_head waiting_for_gp;
        public Ptr<misc.llist_node> waiting_for_gp_tail;
        public misc.callback_head rcu;
        public AtomicDefinitions.atomic_t call_rcu_in_progress;
        public misc.llist_head free_llist_extra_rcu;
        public misc.llist_head free_by_rcu_ttrace;
        public misc.llist_head waiting_for_gp_ttrace;
        public misc.callback_head rcu_ttrace;
        public AtomicDefinitions.atomic_t call_rcu_ttrace_in_progress;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_mem_caches")
    @NotUsableInJava
    public static class bpf_mem_caches
    extends Struct {
        public bpf_mem_cache @Size(value=11) [] cache;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_ringbuf_hdr")
    @NotUsableInJava
    public static class bpf_ringbuf_hdr
    extends Struct {
        public @Unsigned int len;
        public @Unsigned int pg_off;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_ringbuf_map")
    @NotUsableInJava
    public static class bpf_ringbuf_map
    extends Struct {
        public bpf_map map;
        public Ptr<bpf_ringbuf> rb;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_ringbuf")
    @NotUsableInJava
    public static class bpf_ringbuf
    extends Struct {
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitq;
        public IrqDefinitions.irq_work work;
        public @Unsigned long mask;
        public Ptr<Ptr<runtime.page>> pages;
        public int nr_pages;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock spinlock;
        public AtomicDefinitions.atomic_t busy;
        public @Unsigned long consumer_pos;
        public @Unsigned long producer_pos;
        public @Unsigned long pending_pos;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_lpm_trie_key_u8")
    @NotUsableInJava
    public static class bpf_lpm_trie_key_u8
    extends Struct {
        @InlineUnion(value=90836)
        public @InlineUnion(value=90836) bpf_lpm_trie_key_hdr hdr;
        @InlineUnion(value=90836)
        public @InlineUnion(value=90836) @Unsigned int prefixlen;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_lpm_trie_key_hdr")
    @NotUsableInJava
    public static class bpf_lpm_trie_key_hdr
    extends Struct {
        public @Unsigned int prefixlen;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_lru_list_type")
    public static enum bpf_lru_list_type implements Enum<bpf_lru_list_type>,
    TypedEnum<bpf_lru_list_type, Integer>
    {
        BPF_LRU_LIST_T_ACTIVE,
        BPF_LRU_LIST_T_INACTIVE,
        BPF_LRU_LIST_T_FREE,
        BPF_LRU_LOCAL_LIST_T_FREE,
        BPF_LRU_LOCAL_LIST_T_PENDING;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_task_kern")
    @NotUsableInJava
    public static class bpf_iter_task_kern
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<TaskDefinitions.task_struct> pos;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_task")
    @NotUsableInJava
    public static class bpf_iter_task
    extends Struct {
        public @Unsigned long @Size(value=3) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_css_task_kern")
    @NotUsableInJava
    public static class bpf_iter_css_task_kern
    extends Struct {
        public Ptr<CssDefinitions.css_task_iter> css_it;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_css_task")
    @NotUsableInJava
    public static class bpf_iter_css_task
    extends Struct {
        public @Unsigned long @Size(value=1) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_task_vma_kern")
    @NotUsableInJava
    public static class bpf_iter_task_vma_kern
    extends Struct {
        public Ptr<bpf_iter_task_vma_kern_data> data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_task_vma")
    @NotUsableInJava
    public static class bpf_iter_task_vma
    extends Struct {
        public @Unsigned long @Size(value=1) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_task_vma_kern_data")
    @NotUsableInJava
    public static class bpf_iter_task_vma_kern_data
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<MmapDefinitions.mmap_unlock_irq_work> work;
        public VmaDefinitions.vma_iterator vmi;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__task_vma")
    @NotUsableInJava
    public static class bpf_iter__task_vma
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=90795)
        public @InlineUnion(value=90795) Ptr<TaskDefinitions.task_struct> task;
        @InlineUnion(value=90802)
        public @InlineUnion(value=90802) Ptr<VmDefinitions.vm_area_struct> vma;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_task_vma_iter_find_op")
    public static enum bpf_task_vma_iter_find_op implements Enum<bpf_task_vma_iter_find_op>,
    TypedEnum<bpf_task_vma_iter_find_op, Integer>
    {
        task_vma_iter_first_vma,
        task_vma_iter_next_vma,
        task_vma_iter_find_vma;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_task_vma_info")
    @NotUsableInJava
    public static class bpf_iter_seq_task_vma_info
    extends Struct {
        public bpf_iter_seq_task_common common;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public @Unsigned int tid;
        public @Unsigned long prev_vm_start;
        public @Unsigned long prev_vm_end;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__task_file")
    @NotUsableInJava
    public static class bpf_iter__task_file
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=90795)
        public @InlineUnion(value=90795) Ptr<TaskDefinitions.task_struct> task;
        public @Unsigned int fd;
        @InlineUnion(value=90798)
        public @InlineUnion(value=90798) Ptr<runtime.file> file;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_task_file_info")
    @NotUsableInJava
    public static class bpf_iter_seq_task_file_info
    extends Struct {
        public bpf_iter_seq_task_common common;
        public Ptr<TaskDefinitions.task_struct> task;
        public @Unsigned int tid;
        public @Unsigned int fd;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__task")
    @NotUsableInJava
    public static class bpf_iter__task
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=90795)
        public @InlineUnion(value=90795) Ptr<TaskDefinitions.task_struct> task;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_task_info")
    @NotUsableInJava
    public static class bpf_iter_seq_task_info
    extends Struct {
        public bpf_iter_seq_task_common common;
        public @Unsigned int tid;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_task_common")
    @NotUsableInJava
    public static class bpf_iter_seq_task_common
    extends Struct {
        public Ptr<PidDefinitions.pid_namespace> ns;
        public bpf_iter_task_type type;
        public @Unsigned int pid;
        public @Unsigned int pid_visiting;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sanitize_info")
    @NotUsableInJava
    public static class bpf_sanitize_info
    extends Struct {
        public bpf_insn_aux_data aux;
        public boolean mask_to_left;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_reg_types")
    @NotUsableInJava
    public static class bpf_reg_types
    extends Struct {
        public bpf_reg_type @Size(value=10) [] types;
        public Ptr<@Unsigned Integer> btf_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__task__safe_trusted")
    @NotUsableInJava
    public static class bpf_iter__task__safe_trusted
    extends Struct {
        public Ptr<bpf_iter_meta> meta;
        public Ptr<TaskDefinitions.task_struct> task;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_meta__safe_trusted")
    @NotUsableInJava
    public static class bpf_iter_meta__safe_trusted
    extends Struct {
        public Ptr<SeqDefinitions.seq_file> seq;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_access_src")
    public static enum bpf_access_src implements Enum<bpf_access_src>,
    TypedEnum<bpf_access_src, Integer>
    {
        ACCESS_DIRECT,
        ACCESS_HELPER;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_kfunc_btf")
    @NotUsableInJava
    public static class bpf_kfunc_btf
    extends Struct {
        public Ptr<runtime.btf> btf;
        public Ptr<runtime.module> module;
        public @Unsigned short offset;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_kfunc_desc")
    @NotUsableInJava
    public static class bpf_kfunc_desc
    extends Struct {
        public BtfDefinitions.btf_func_model func_model;
        public @Unsigned int func_id;
        public int imm;
        public @Unsigned short offset;
        public @Unsigned long addr;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_kfunc_call_arg_meta")
    @NotUsableInJava
    public static class bpf_kfunc_call_arg_meta
    extends Struct {
        public Ptr<runtime.btf> btf;
        public @Unsigned int func_id;
        public @Unsigned int kfunc_flags;
        public Ptr<BtfDefinitions.btf_type> func_proto;
        public String func_name;
        public @Unsigned int ref_obj_id;
        public char release_regno;
        public boolean r0_rdonly;
        public @Unsigned int ret_btf_id;
        public @Unsigned long r0_size;
        public @Unsigned int subprogno;
        public misc.arg_constant_of_bpf_kfunc_call_arg_meta arg_constant;
        public Ptr<runtime.btf> arg_btf;
        public @Unsigned int arg_btf_id;
        public boolean arg_owning_ref;
        public misc.arg_list_head_of_bpf_kfunc_call_arg_meta_and_arg_rbtree_root_of_bpf_kfunc_call_arg_meta arg_list_head;
        public misc.arg_list_head_of_bpf_kfunc_call_arg_meta_and_arg_rbtree_root_of_bpf_kfunc_call_arg_meta arg_rbtree_root;
        public misc.initialized_dynptr_of_bpf_kfunc_call_arg_meta initialized_dynptr;
        public IterDefinitions.iter_of_bpf_kfunc_call_arg_meta iter;
        public MapDefinitions.map_of_bpf_kfunc_call_arg_meta map;
        public @Unsigned long mem_size;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_call_arg_meta")
    @NotUsableInJava
    public static class bpf_call_arg_meta
    extends Struct {
        public Ptr<bpf_map> map_ptr;
        public boolean raw_mode;
        public boolean pkt_access;
        public char release_regno;
        public int regno;
        public int access_size;
        public int mem_size;
        public @Unsigned long msize_max_value;
        public int ref_obj_id;
        public int dynptr_id;
        public int map_uid;
        public int func_id;
        public Ptr<runtime.btf> btf;
        public @Unsigned int btf_id;
        public Ptr<runtime.btf> ret_btf;
        public @Unsigned int ret_btf_id;
        public @Unsigned int subprogno;
        public Ptr<BtfDefinitions.btf_field> kptr_field;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_insn_cbs")
    @NotUsableInJava
    public static class bpf_insn_cbs
    extends Struct {
        public @OriginalName(value="bpf_insn_print_t") Ptr<?> cb_print;
        public @OriginalName(value="bpf_insn_revmap_call_t") Ptr<?> cb_call;
        public @OriginalName(value="bpf_insn_print_imm_t") Ptr<?> cb_imm;
        public Ptr<?> private_data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_verifier_stack_elem")
    @NotUsableInJava
    public static class bpf_verifier_stack_elem
    extends Struct {
        public bpf_verifier_state st;
        public int insn_idx;
        public int prev_insn_idx;
        public Ptr<bpf_verifier_stack_elem> next;
        public @Unsigned int log_pos;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_kfunc_btf_tab")
    @NotUsableInJava
    public static class bpf_kfunc_btf_tab
    extends Struct {
        public bpf_kfunc_btf @Size(value=256) [] descs;
        public @Unsigned int nr_descs;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_kfunc_desc_tab")
    @NotUsableInJava
    public static class bpf_kfunc_desc_tab
    extends Struct {
        public bpf_kfunc_desc @Size(value=256) [] descs;
        public @Unsigned int nr_descs;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_cond_pseudo_jmp")
    public static enum bpf_cond_pseudo_jmp implements Enum<bpf_cond_pseudo_jmp>,
    TypedEnum<bpf_cond_pseudo_jmp, Integer>
    {
        BPF_MAY_GOTO;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_uprobe_multi_run_ctx")
    @NotUsableInJava
    public static class bpf_uprobe_multi_run_ctx
    extends Struct {
        public bpf_run_ctx run_ctx;
        public @Unsigned long entry_ip;
        public Ptr<bpf_uprobe> uprobe;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_uprobe_multi_link")
    @NotUsableInJava
    public static class bpf_uprobe_multi_link
    extends Struct {
        public runtime.path path;
        public bpf_link link;
        public @Unsigned int cnt;
        public @Unsigned int flags;
        public Ptr<bpf_uprobe> uprobes;
        public Ptr<TaskDefinitions.task_struct> task;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_uprobe")
    @NotUsableInJava
    public static class bpf_uprobe
    extends Struct {
        public Ptr<bpf_uprobe_multi_link> link;
        public @OriginalName(value="loff_t") long offset;
        public @Unsigned long ref_ctr_offset;
        public @Unsigned long cookie;
        public Ptr<runtime.uprobe> uprobe;
        public UprobeDefinitions.uprobe_consumer consumer;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_kprobe_multi_run_ctx")
    @NotUsableInJava
    public static class bpf_kprobe_multi_run_ctx
    extends Struct {
        public bpf_session_run_ctx session_ctx;
        public Ptr<bpf_kprobe_multi_link> link;
        public @Unsigned long entry_ip;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_kprobe_multi_link")
    @NotUsableInJava
    public static class bpf_kprobe_multi_link
    extends Struct {
        public bpf_link link;
        public runtime.fprobe fp;
        public Ptr<@Unsigned Long> addrs;
        public Ptr<@Unsigned Long> cookies;
        public @Unsigned int cnt;
        public @Unsigned int mods_cnt;
        public Ptr<Ptr<runtime.module>> mods;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_session_run_ctx")
    @NotUsableInJava
    public static class bpf_session_run_ctx
    extends Struct {
        public bpf_run_ctx run_ctx;
        public boolean is_return;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_raw_tp_regs")
    @NotUsableInJava
    public static class bpf_raw_tp_regs
    extends Struct {
        public PtDefinitions.pt_regs @Size(value=3) [] regs;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_nested_pt_regs")
    @NotUsableInJava
    public static class bpf_nested_pt_regs
    extends Struct {
        public PtDefinitions.pt_regs @Size(value=3) [] regs;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_trace_sample_data")
    @NotUsableInJava
    public static class bpf_trace_sample_data
    extends Struct {
        public PerfDefinitions.perf_sample_data @Size(value=3) [] sds;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_trace_module")
    @NotUsableInJava
    public static class bpf_trace_module
    extends Struct {
        public Ptr<runtime.module> module;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_key")
    @NotUsableInJava
    public static class bpf_key
    extends Struct {
        public Ptr<runtime.key> key;
        public boolean has_ref;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_perf_event_value")
    @NotUsableInJava
    public static class bpf_perf_event_value
    extends Struct {
        public @Unsigned long counter;
        public @Unsigned long enabled;
        public @Unsigned long running;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_lwt_prog")
    @NotUsableInJava
    public static class bpf_lwt_prog
    extends Struct {
        public Ptr<bpf_prog> prog;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_xfrm_state_opts")
    @NotUsableInJava
    public static class bpf_xfrm_state_opts
    extends Struct {
        public int error;
        public int netns_id;
        public @Unsigned int mark;
        public XfrmDefinitions.xfrm_address_t daddr;
        public @Unsigned @OriginalName(value="__be32") int spi;
        public char proto;
        public @Unsigned short family;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_bpf_dummy_ops")
    @NotUsableInJava
    public static class bpf_struct_ops_bpf_dummy_ops
    extends Struct {
        public bpf_struct_ops_common_value common;
        public bpf_dummy_ops data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dummy_ops_test_args")
    @NotUsableInJava
    public static class bpf_dummy_ops_test_args
    extends Struct {
        public @Unsigned long @Size(value=12) [] args;
        public bpf_dummy_ops_state state;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dummy_ops")
    @NotUsableInJava
    public static class bpf_dummy_ops
    extends Struct {
        public Ptr<?> test_1;
        public Ptr<?> test_2;
        public Ptr<?> test_sleepable;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dummy_ops_state")
    @NotUsableInJava
    public static class bpf_dummy_ops_state
    extends Struct {
        public int val;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_security_struct")
    @NotUsableInJava
    public static class bpf_security_struct
    extends Struct {
        public @Unsigned int sid;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_crypto_ctx")
    @NotUsableInJava
    public static class bpf_crypto_ctx
    extends Struct {
        public Ptr<bpf_crypto_type> type;
        public Ptr<?> tfm;
        public @Unsigned int siv_len;
        public misc.callback_head rcu;
        public  @OriginalName(value="refcount_t") misc.refcount_struct usage;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_crypto_params")
    @NotUsableInJava
    public static class bpf_crypto_params
    extends Struct {
        public char @Size(value=14) [] type;
        public char @Size(value=2) [] reserved;
        public char @Size(value=128) [] algo;
        public char @Size(value=256) [] key;
        public @Unsigned int key_len;
        public @Unsigned int authsize;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_crypto_type_list")
    @NotUsableInJava
    public static class bpf_crypto_type_list
    extends Struct {
        public Ptr<bpf_crypto_type> type;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_list")
    @NotUsableInJava
    public static class bpf_prog_list
    extends Struct {
        public misc.hlist_node node;
        public Ptr<bpf_prog> prog;
        public Ptr<bpf_cgroup_link> link;
        public Ptr<bpf_cgroup_storage> @Size(value=2) [] storage;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cgroup_link")
    @NotUsableInJava
    public static class bpf_cgroup_link
    extends Struct {
        public bpf_link link;
        public Ptr<runtime.cgroup> cgroup;
        public bpf_attach_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sockopt_buf")
    @NotUsableInJava
    public static class bpf_sockopt_buf
    extends Struct {
        public char @Size(value=32) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dtab")
    @NotUsableInJava
    public static class bpf_dtab
    extends Struct {
        public bpf_map map;
        public Ptr<Ptr<bpf_dtab_netdev>> netdev_map;
        public ListDefinitions.list_head list;
        public Ptr<misc.hlist_head> dev_index_head;
        public  @OriginalName(value="spinlock_t") runtime.spinlock index_lock;
        public @Unsigned int items;
        public @Unsigned int n_buckets;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dtab_netdev")
    @NotUsableInJava
    public static class bpf_dtab_netdev
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public misc.hlist_node index_hlist;
        public Ptr<bpf_prog> xdp_prog;
        public misc.callback_head rcu;
        public @Unsigned int idx;
        public bpf_devmap_val val;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_devmap_val")
    @NotUsableInJava
    public static class bpf_devmap_val
    extends Struct {
        public @Unsigned int ifindex;
        public bpf_prog_of_bpf_cpumap_val_and_bpf_prog_of_bpf_devmap_val bpf_prog;
    }

    @Type(noCCodeGeneration=true, cType="union { int fd; unsigned int id; }")
    @NotUsableInJava
    public static class bpf_prog_of_bpf_cpumap_val_and_bpf_prog_of_bpf_devmap_val
    extends Union {
        public int fd;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_arena")
    @NotUsableInJava
    public static class bpf_arena
    extends Struct {
        public bpf_map map;
        public @Unsigned long user_vm_start;
        public @Unsigned long user_vm_end;
        public Ptr<VmDefinitions.vm_struct> kern_vm;
        public MapleDefinitions.maple_tree mt;
        public ListDefinitions.list_head vma_list;
        public runtime.mutex lock;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_storage_blob")
    @NotUsableInJava
    public static class bpf_storage_blob
    extends Struct {
        public Ptr<bpf_local_storage> storage;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cgroup_storage_map")
    @NotUsableInJava
    public static class bpf_cgroup_storage_map
    extends Struct {
        public bpf_map map;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public RbDefinitions.rb_root root;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_hash_map_info")
    @NotUsableInJava
    public static class bpf_iter_seq_hash_map_info
    extends Struct {
        public Ptr<bpf_map> map;
        public Ptr<bpf_htab> htab;
        public Ptr<?> percpu_value_buf;
        public @Unsigned int bucket_id;
        public @Unsigned int skip_elems;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_htab")
    @NotUsableInJava
    public static class bpf_htab
    extends Struct {
        public bpf_map map;
        public bpf_mem_alloc ma;
        public bpf_mem_alloc pcpu_ma;
        public Ptr<runtime.bucket> buckets;
        public Ptr<?> elems;
        @InlineUnion(value=62103)
        public  @InlineUnion(value=62103) PcpuDefinitions.pcpu_freelist freelist;
        @InlineUnion(value=62103)
        public @InlineUnion(value=62103) bpf_lru lru;
        public Ptr<Ptr<HtabDefinitions.htab_elem>> extra_elems;
        public PercpuDefinitions.percpu_counter pcount;
        public AtomicDefinitions.atomic_t count;
        public boolean use_percpu_counter;
        public @Unsigned int n_buckets;
        public @Unsigned int elem_size;
        public @Unsigned int hashrnd;
        public LockDefinitions.lock_class_key lockdep_key;
        public Ptr<Integer> @Size(value=8) [] map_locked;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_lru")
    @NotUsableInJava
    public static class bpf_lru
    extends Struct {
        @InlineUnion(value=62099)
        public @InlineUnion(value=62099) bpf_common_lru common_lru;
        @InlineUnion(value=62099)
        public @InlineUnion(value=62099) Ptr<bpf_lru_list> percpu_lru;
        public @OriginalName(value="del_from_htab_func") Ptr<?> del_from_htab;
        public Ptr<?> del_arg;
        public @Unsigned int hash_offset;
        public @Unsigned int nr_scans;
        public boolean percpu;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_common_lru")
    @NotUsableInJava
    public static class bpf_common_lru
    extends Struct {
        public bpf_lru_list lru_list;
        public Ptr<bpf_lru_locallist> local_list;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_lru_locallist")
    @NotUsableInJava
    public static class bpf_lru_locallist
    extends Struct {
        public ListDefinitions.list_head @Size(value=2) [] lists;
        public @Unsigned short next_steal;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_lru_list")
    @NotUsableInJava
    public static class bpf_lru_list
    extends Struct {
        public ListDefinitions.list_head @Size(value=3) [] lists;
        public @Unsigned int @Size(value=2) [] counts;
        public Ptr<ListDefinitions.list_head> next_inactive_rotation;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_lru_node")
    @NotUsableInJava
    public static class bpf_lru_node
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned short cpu;
        public char type;
        public char ref;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__bpf_map")
    @NotUsableInJava
    public static class bpf_iter__bpf_map
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=8895)
        public @InlineUnion(value=8895) Ptr<bpf_map> map;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_map_info")
    @NotUsableInJava
    public static class bpf_iter_seq_map_info
    extends Struct {
        public @Unsigned int map_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_bits_kern")
    @NotUsableInJava
    public static class bpf_iter_bits_kern
    extends Struct {
        @InlineUnion(value=62055)
        public @InlineUnion(value=62055) Ptr<@Unsigned Long> bits;
        @InlineUnion(value=62055)
        public @InlineUnion(value=62055) @Unsigned long bits_copy;
        public int nr_bits;
        public int bit;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_bits")
    @NotUsableInJava
    public static class bpf_iter_bits
    extends Struct {
        public @Unsigned long @Size(value=2) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_throw_ctx")
    @NotUsableInJava
    public static class bpf_throw_ctx
    extends Struct {
        public Ptr<bpf_prog_aux> aux;
        public @Unsigned long sp;
        public @Unsigned long bp;
        public int cnt;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_async_type")
    public static enum bpf_async_type implements Enum<bpf_async_type>,
    TypedEnum<bpf_async_type, Integer>
    {
        BPF_ASYNC_TYPE_TIMER,
        BPF_ASYNC_TYPE_WQ;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_async_kern")
    @NotUsableInJava
    public static class bpf_async_kern
    extends Struct {
        @InlineUnion(value=62016)
        public @InlineUnion(value=62016) Ptr<bpf_async_cb> cb;
        @InlineUnion(value=62016)
        public @InlineUnion(value=62016) Ptr<bpf_hrtimer> timer;
        @InlineUnion(value=62016)
        public @InlineUnion(value=62016) Ptr<bpf_work> work;
        public bpf_spin_lock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_work")
    @NotUsableInJava
    public static class bpf_work
    extends Struct {
        public bpf_async_cb cb;
        public misc.work_struct work;
        public misc.work_struct delete_work;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_hrtimer")
    @NotUsableInJava
    public static class bpf_hrtimer
    extends Struct {
        public bpf_async_cb cb;
        public runtime.hrtimer timer;
        public AtomicDefinitions.atomic_t cancelling;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_async_cb")
    @NotUsableInJava
    public static class bpf_async_cb
    extends Struct {
        public Ptr<bpf_map> map;
        public Ptr<bpf_prog> prog;
        public Ptr<?> callback_fn;
        public Ptr<?> value;
        @InlineUnion(value=62012)
        public  @InlineUnion(value=62012) misc.callback_head rcu;
        @InlineUnion(value=62012)
        public  @InlineUnion(value=62012) misc.work_struct delete_work;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_bprintf_buffers")
    @NotUsableInJava
    public static class bpf_bprintf_buffers
    extends Struct {
        public char @Size(value=512) [] bin_args;
        public char @Size(value=1024) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_list_node_kern")
    @NotUsableInJava
    public static class bpf_list_node_kern
    extends Struct {
        public ListDefinitions.list_head list_head;
        public Ptr<?> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_rb_node_kern")
    @NotUsableInJava
    public static class bpf_rb_node_kern
    extends Struct {
        public RbDefinitions.rb_node rb_node;
        public Ptr<?> owner;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_kfunc_flags")
    public static enum bpf_kfunc_flags implements Enum<bpf_kfunc_flags>,
    TypedEnum<bpf_kfunc_flags, Integer>
    {
        BPF_F_PAD_ZEROS;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_pidns_info")
    @NotUsableInJava
    public static class bpf_pidns_info
    extends Struct {
        public @Unsigned int pid;
        public @Unsigned int tgid;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_refcount")
    @NotUsableInJava
    public static class bpf_refcount
    extends Struct {
        public @Unsigned int @Size(value=1) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_rb_node")
    @NotUsableInJava
    public static class bpf_rb_node
    extends Struct {
        public @Unsigned long @Size(value=4) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_rb_root")
    @NotUsableInJava
    public static class bpf_rb_root
    extends Struct {
        public @Unsigned long @Size(value=2) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_list_node")
    @NotUsableInJava
    public static class bpf_list_node
    extends Struct {
        public @Unsigned long @Size(value=3) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_list_head")
    @NotUsableInJava
    public static class bpf_list_head
    extends Struct {
        public @Unsigned long @Size(value=2) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_wq")
    @NotUsableInJava
    public static class bpf_wq
    extends Struct {
        public @Unsigned long @Size(value=2) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_timer")
    @NotUsableInJava
    public static class bpf_timer
    extends Struct {
        public @Unsigned long @Size(value=2) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_type")
    public static enum bpf_type implements Enum<bpf_type>,
    TypedEnum<bpf_type, Integer>
    {
        BPF_TYPE_UNSPEC,
        BPF_TYPE_PROG,
        BPF_TYPE_MAP,
        BPF_TYPE_LINK;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_preload_ops")
    @NotUsableInJava
    public static class bpf_preload_ops
    extends Struct {
        public Ptr<?> preload;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_preload_info")
    @NotUsableInJava
    public static class bpf_preload_info
    extends Struct {
        public char @Size(value=16) [] link_name;
        public Ptr<bpf_link> link;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__tcp")
    @NotUsableInJava
    public static class bpf_iter__tcp
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=34438)
        public @InlineUnion(value=34438) Ptr<SockDefinitions.sock_common> sk_common;
        public @Unsigned @OriginalName(value="uid_t") int uid;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tcp_iter_state")
    @NotUsableInJava
    public static class bpf_tcp_iter_state
    extends Struct {
        public TcpDefinitions.tcp_iter_state state;
        public @Unsigned int cur_sk;
        public @Unsigned int end_sk;
        public @Unsigned int max_sk;
        public Ptr<Ptr<runtime.sock>> batch;
        public boolean st_bucket_done;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_nf_link")
    @NotUsableInJava
    public static class bpf_nf_link
    extends Struct {
        public bpf_link link;
        public NfDefinitions.nf_hook_ops hook_ops;
        public  @OriginalName(value="netns_tracker") misc.lockdep_map_p ns_tracker;
        public Ptr<runtime.net> net;
        public @Unsigned int dead;
        public Ptr<NfDefinitions.nf_defrag_hook> defrag_hook;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_raw_tp_test_run_info")
    @NotUsableInJava
    public static class bpf_raw_tp_test_run_info
    extends Struct {
        public Ptr<bpf_prog> prog;
        public Ptr<?> ctx;
        public @Unsigned int retval;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_fentry_test_t")
    @NotUsableInJava
    public static class bpf_fentry_test_t
    extends Struct {
        public Ptr<bpf_fentry_test_t> a;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_test_timer")
    @NotUsableInJava
    public static class bpf_test_timer
    extends Struct {
        public misc.mode_of_bpf_test_timer mode;
        public @Unsigned int i;
        public @Unsigned long time_start;
        public @Unsigned long time_spent;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_trace_run_ctx")
    @NotUsableInJava
    public static class bpf_trace_run_ctx
    extends Struct {
        public bpf_run_ctx run_ctx;
        public @Unsigned long bpf_cookie;
        public boolean is_uprobe;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cg_run_ctx")
    @NotUsableInJava
    public static class bpf_cg_run_ctx
    extends Struct {
        public bpf_run_ctx run_ctx;
        public Ptr<bpf_prog_array_item> prog_item;
        public int retval;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_shtab")
    @NotUsableInJava
    public static class bpf_shtab
    extends Struct {
        public bpf_map map;
        public Ptr<bpf_shtab_bucket> buckets;
        public @Unsigned int buckets_num;
        public @Unsigned int elem_size;
        public SkDefinitions.sk_psock_progs progs;
        public AtomicDefinitions.atomic_t count;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_shtab_bucket")
    @NotUsableInJava
    public static class bpf_shtab_bucket
    extends Struct {
        public misc.hlist_head head;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_shtab_elem")
    @NotUsableInJava
    public static class bpf_shtab_elem
    extends Struct {
        public misc.callback_head rcu;
        public @Unsigned int hash;
        public Ptr<runtime.sock> sk;
        public misc.hlist_node node;
        public char @Size(value=0) [] key;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__sockmap")
    @NotUsableInJava
    public static class bpf_iter__sockmap
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=8895)
        public @InlineUnion(value=8895) Ptr<bpf_map> map;
        @InlineUnion(value=8896)
        public @InlineUnion(value=8896) Ptr<?> key;
        @InlineUnion(value=25047)
        public @InlineUnion(value=25047) Ptr<runtime.sock> sk;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_stab")
    @NotUsableInJava
    public static class bpf_stab
    extends Struct {
        public bpf_map map;
        public Ptr<Ptr<runtime.sock>> sks;
        public SkDefinitions.sk_psock_progs progs;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_ret_code")
    public static enum bpf_ret_code implements Enum<bpf_ret_code>,
    TypedEnum<bpf_ret_code, Integer>
    {
        BPF_OK,
        BPF_DROP,
        BPF_REDIRECT,
        BPF_LWT_REROUTE,
        BPF_FLOW_DISSECTOR_CONTINUE;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tuple")
    @NotUsableInJava
    public static class bpf_tuple
    extends Struct {
        public Ptr<bpf_prog> prog;
        public Ptr<bpf_link> link;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cpumask")
    @NotUsableInJava
    public static class bpf_cpumask
    extends Struct {
        public  @OriginalName(value="cpumask_t") runtime.cpumask cpumask;
        public  @OriginalName(value="refcount_t") misc.refcount_struct usage;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_css_kern")
    @NotUsableInJava
    public static class bpf_iter_css_kern
    extends Struct {
        public Ptr<CgroupDefinitions.cgroup_subsys_state> start;
        public Ptr<CgroupDefinitions.cgroup_subsys_state> pos;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_css")
    @NotUsableInJava
    public static class bpf_iter_css
    extends Struct {
        public @Unsigned long @Size(value=3) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__cgroup")
    @NotUsableInJava
    public static class bpf_iter__cgroup
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=29525)
        public @InlineUnion(value=29525) Ptr<runtime.cgroup> cgroup;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_netns_link")
    @NotUsableInJava
    public static class bpf_netns_link
    extends Struct {
        public bpf_link link;
        public bpf_attach_type type;
        public NetnsDefinitions.netns_bpf_attach_type netns_type;
        public Ptr<runtime.net> net;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cand_cache")
    @NotUsableInJava
    public static class bpf_cand_cache
    extends Struct {
        public String name;
        public @Unsigned int name_len;
        public @Unsigned short kind;
        public @Unsigned short cnt;
        public AnonymousType1881419576C48 @Size(value=0) [] cands;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_struct_walk_result")
    public static enum bpf_struct_walk_result implements Enum<bpf_struct_walk_result>,
    TypedEnum<bpf_struct_walk_result, Integer>
    {
        WALK_SCALAR,
        WALK_PTR,
        WALK_STRUCT;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_ctx_convert")
    @NotUsableInJava
    public static class bpf_ctx_convert
    extends Struct {
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_SOCKET_FILTER_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_SOCKET_FILTER_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_SCHED_CLS_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_SCHED_CLS_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_SCHED_ACT_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_SCHED_ACT_kern;
        public XdpDefinitions.xdp_md BPF_PROG_TYPE_XDP_prog;
        public XdpDefinitions.xdp_buff BPF_PROG_TYPE_XDP_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_CGROUP_SKB_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_CGROUP_SKB_kern;
        public bpf_sock BPF_PROG_TYPE_CGROUP_SOCK_prog;
        public runtime.sock BPF_PROG_TYPE_CGROUP_SOCK_kern;
        public bpf_sock_addr BPF_PROG_TYPE_CGROUP_SOCK_ADDR_prog;
        public bpf_sock_addr_kern BPF_PROG_TYPE_CGROUP_SOCK_ADDR_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_LWT_IN_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_LWT_IN_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_LWT_OUT_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_LWT_OUT_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_LWT_XMIT_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_LWT_XMIT_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_LWT_SEG6LOCAL_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_LWT_SEG6LOCAL_kern;
        public bpf_sock_ops BPF_PROG_TYPE_SOCK_OPS_prog;
        public bpf_sock_ops_kern BPF_PROG_TYPE_SOCK_OPS_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_SK_SKB_prog;
        public SkDefinitions.sk_buff BPF_PROG_TYPE_SK_SKB_kern;
        public SkDefinitions.sk_msg_md BPF_PROG_TYPE_SK_MSG_prog;
        public SkDefinitions.sk_msg BPF_PROG_TYPE_SK_MSG_kern;
        public SkDefinitions.__sk_buff BPF_PROG_TYPE_FLOW_DISSECTOR_prog;
        public bpf_flow_dissector BPF_PROG_TYPE_FLOW_DISSECTOR_kern;
        public  @OriginalName(value="bpf_user_pt_regs_t") PtDefinitions.pt_regs BPF_PROG_TYPE_KPROBE_prog;
        public PtDefinitions.pt_regs BPF_PROG_TYPE_KPROBE_kern;
        public @Unsigned long BPF_PROG_TYPE_TRACEPOINT_prog;
        public @Unsigned long BPF_PROG_TYPE_TRACEPOINT_kern;
        public bpf_perf_event_data BPF_PROG_TYPE_PERF_EVENT_prog;
        public bpf_perf_event_data_kern BPF_PROG_TYPE_PERF_EVENT_kern;
        public bpf_raw_tracepoint_args BPF_PROG_TYPE_RAW_TRACEPOINT_prog;
        public @Unsigned long BPF_PROG_TYPE_RAW_TRACEPOINT_kern;
        public bpf_raw_tracepoint_args BPF_PROG_TYPE_RAW_TRACEPOINT_WRITABLE_prog;
        public @Unsigned long BPF_PROG_TYPE_RAW_TRACEPOINT_WRITABLE_kern;
        public Ptr<?> BPF_PROG_TYPE_TRACING_prog;
        public Ptr<?> BPF_PROG_TYPE_TRACING_kern;
        public bpf_cgroup_dev_ctx BPF_PROG_TYPE_CGROUP_DEVICE_prog;
        public bpf_cgroup_dev_ctx BPF_PROG_TYPE_CGROUP_DEVICE_kern;
        public bpf_sysctl BPF_PROG_TYPE_CGROUP_SYSCTL_prog;
        public bpf_sysctl_kern BPF_PROG_TYPE_CGROUP_SYSCTL_kern;
        public bpf_sockopt BPF_PROG_TYPE_CGROUP_SOCKOPT_prog;
        public bpf_sockopt_kern BPF_PROG_TYPE_CGROUP_SOCKOPT_kern;
        public SkDefinitions.sk_reuseport_md BPF_PROG_TYPE_SK_REUSEPORT_prog;
        public SkDefinitions.sk_reuseport_kern BPF_PROG_TYPE_SK_REUSEPORT_kern;
        public bpf_sk_lookup BPF_PROG_TYPE_SK_LOOKUP_prog;
        public bpf_sk_lookup_kern BPF_PROG_TYPE_SK_LOOKUP_kern;
        public Ptr<?> BPF_PROG_TYPE_STRUCT_OPS_prog;
        public Ptr<?> BPF_PROG_TYPE_STRUCT_OPS_kern;
        public Ptr<?> BPF_PROG_TYPE_EXT_prog;
        public Ptr<?> BPF_PROG_TYPE_EXT_kern;
        public Ptr<?> BPF_PROG_TYPE_LSM_prog;
        public Ptr<?> BPF_PROG_TYPE_LSM_kern;
        public Ptr<?> BPF_PROG_TYPE_SYSCALL_prog;
        public Ptr<?> BPF_PROG_TYPE_SYSCALL_kern;
        public bpf_nf_ctx BPF_PROG_TYPE_NETFILTER_prog;
        public bpf_nf_ctx BPF_PROG_TYPE_NETFILTER_kern;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_core_relo_res")
    @NotUsableInJava
    public static class bpf_core_relo_res
    extends Struct {
        public @Unsigned long orig_val;
        public @Unsigned long new_val;
        public boolean poison;
        public boolean validate;
        public boolean fail_memsz_adjust;
        public @Unsigned int orig_sz;
        public @Unsigned int orig_type_id;
        public @Unsigned int new_sz;
        public @Unsigned int new_type_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_core_spec")
    @NotUsableInJava
    public static class bpf_core_spec
    extends Struct {
        public Ptr<runtime.btf> btf;
        public bpf_core_accessor @Size(value=64) [] spec;
        public @Unsigned int root_type_id;
        public bpf_core_relo_kind relo_kind;
        public int len;
        public int @Size(value=64) [] raw_spec;
        public int raw_len;
        public @Unsigned int bit_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_core_accessor")
    @NotUsableInJava
    public static class bpf_core_accessor
    extends Struct {
        public @Unsigned int type_id;
        public @Unsigned int idx;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_core_cand_list")
    @NotUsableInJava
    public static class bpf_core_cand_list
    extends Struct {
        public Ptr<bpf_core_cand> cands;
        public int len;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_core_cand")
    @NotUsableInJava
    public static class bpf_core_cand
    extends Struct {
        public Ptr<runtime.btf> btf;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_nf_ctx")
    @NotUsableInJava
    public static class bpf_nf_ctx
    extends Struct {
        public Ptr<NfDefinitions.nf_hook_state> state;
        public Ptr<SkDefinitions.sk_buff> skb;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sockopt_kern")
    @NotUsableInJava
    public static class bpf_sockopt_kern
    extends Struct {
        public Ptr<runtime.sock> sk;
        public Ptr<Character> optval;
        public Ptr<Character> optval_end;
        public int level;
        public int optname;
        public int optlen;
        public Ptr<TaskDefinitions.task_struct> current_task;
        public @Unsigned long tmp_reg;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sysctl_kern")
    @NotUsableInJava
    public static class bpf_sysctl_kern
    extends Struct {
        public Ptr<misc.ctl_table_header> head;
        public Ptr<misc.ctl_table> table;
        public Ptr<?> cur_val;
        public @Unsigned long cur_len;
        public Ptr<?> new_val;
        public @Unsigned long new_len;
        public int new_updated;
        public int write;
        public Ptr<@OriginalName(value="loff_t") Long> ppos;
        public @Unsigned long tmp_reg;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_core_ctx")
    @NotUsableInJava
    public static class bpf_core_ctx
    extends Struct {
        public Ptr<bpf_verifier_log> log;
        public Ptr<runtime.btf> btf;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_perf_event_data")
    @NotUsableInJava
    public static class bpf_perf_event_data
    extends Struct {
        public  @OriginalName(value="bpf_user_pt_regs_t") PtDefinitions.pt_regs regs;
        public @Unsigned long sample_period;
        public @Unsigned long addr;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_core_relo")
    @NotUsableInJava
    public static class bpf_core_relo
    extends Struct {
        public @Unsigned int insn_off;
        public @Unsigned int type_id;
        public @Unsigned int access_str_off;
        public bpf_core_relo_kind kind;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_core_relo_kind")
    public static enum bpf_core_relo_kind implements Enum<bpf_core_relo_kind>,
    TypedEnum<bpf_core_relo_kind, Integer>
    {
        BPF_CORE_FIELD_BYTE_OFFSET,
        BPF_CORE_FIELD_BYTE_SIZE,
        BPF_CORE_FIELD_EXISTS,
        BPF_CORE_FIELD_SIGNED,
        BPF_CORE_FIELD_LSHIFT_U64,
        BPF_CORE_FIELD_RSHIFT_U64,
        BPF_CORE_TYPE_ID_LOCAL,
        BPF_CORE_TYPE_ID_TARGET,
        BPF_CORE_TYPE_EXISTS,
        BPF_CORE_TYPE_SIZE,
        BPF_CORE_ENUMVAL_EXISTS,
        BPF_CORE_ENUMVAL_VALUE,
        BPF_CORE_TYPE_MATCHES;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sockopt")
    @NotUsableInJava
    public static class bpf_sockopt
    extends Struct {
        @InlineUnion(value=23464)
        public @InlineUnion(value=23464) Ptr<bpf_sock> sk;
        @InlineUnion(value=29389)
        public @InlineUnion(value=29389) Ptr<?> optval;
        @InlineUnion(value=29390)
        public @InlineUnion(value=29390) Ptr<?> optval_end;
        public int level;
        public int optname;
        public int optlen;
        public int retval;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sysctl")
    @NotUsableInJava
    public static class bpf_sysctl
    extends Struct {
        public @Unsigned int write;
        public @Unsigned int file_pos;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_raw_tracepoint_args")
    @NotUsableInJava
    public static class bpf_raw_tracepoint_args
    extends Struct {
        public @Unsigned long @Size(value=0) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cgroup_dev_ctx")
    @NotUsableInJava
    public static class bpf_cgroup_dev_ctx
    extends Struct {
        public @Unsigned int access_type;
        public @Unsigned int major;
        public @Unsigned int minor;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_queue_stack")
    @NotUsableInJava
    public static class bpf_queue_stack
    extends Struct {
        public bpf_map map;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned int head;
        public @Unsigned int tail;
        public @Unsigned int size;
        public char @Size(value=0) [] elements;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__bpf_link")
    @NotUsableInJava
    public static class bpf_iter__bpf_link
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=29359)
        public @InlineUnion(value=29359) Ptr<bpf_link> link;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_link_info")
    @NotUsableInJava
    public static class bpf_iter_seq_link_info
    extends Struct {
        public @Unsigned int link_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_num_kern")
    @NotUsableInJava
    public static class bpf_iter_num_kern
    extends Struct {
        public int cur;
        public int end;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_priv_data")
    @NotUsableInJava
    public static class bpf_iter_priv_data
    extends Struct {
        public Ptr<bpf_iter_target_info> tinfo;
        public Ptr<bpf_iter_seq_info> seq_info;
        public Ptr<bpf_prog> prog;
        public @Unsigned long session_id;
        public @Unsigned long seq_num;
        public boolean done_stop;
        public char @Size(value=0) [] target_private;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_link")
    @NotUsableInJava
    public static class bpf_iter_link
    extends Struct {
        public bpf_link link;
        public bpf_iter_aux_info aux;
        public Ptr<bpf_iter_target_info> tinfo;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_target_info")
    @NotUsableInJava
    public static class bpf_iter_target_info
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<bpf_iter_reg> reg_info;
        public @Unsigned int btf_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_num")
    @NotUsableInJava
    public static class bpf_iter_num
    extends Struct {
        public @Unsigned long @Size(value=1) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_stack_slot_type")
    public static enum bpf_stack_slot_type implements Enum<bpf_stack_slot_type>,
    TypedEnum<bpf_stack_slot_type, Integer>
    {
        STACK_INVALID,
        STACK_SPILL,
        STACK_MISC,
        STACK_ZERO,
        STACK_DYNPTR,
        STACK_ITER;

    }

    @Type(noCCodeGeneration=true, cType="struct _bpf_dtab_netdev")
    @NotUsableInJava
    public static class _bpf_dtab_netdev
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_dummy")
    @NotUsableInJava
    public static class bpf_prog_dummy
    extends Struct {
        public bpf_prog prog;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_pack")
    @NotUsableInJava
    public static class bpf_prog_pack
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> ptr;
        public @Unsigned long @Size(value=0) [] bitmap;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__ksym")
    @NotUsableInJava
    public static class bpf_iter__ksym
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=28905)
        public @InlineUnion(value=28905) Ptr<misc.kallsym_iter> ksym;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_iter_feature")
    public static enum bpf_iter_feature implements Enum<bpf_iter_feature>,
    TypedEnum<bpf_iter_feature, Integer>
    {
        BPF_ITER_RESCHED;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__ipv6_route")
    @NotUsableInJava
    public static class bpf_iter__ipv6_route
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=25786)
        public @InlineUnion(value=25786) Ptr<Fib6Definitions.fib6_info> rt;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__unix")
    @NotUsableInJava
    public static class bpf_iter__unix
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=25758)
        public @InlineUnion(value=25758) Ptr<UnixDefinitions.unix_sock> unix_sk;
        public @Unsigned @OriginalName(value="uid_t") int uid;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_unix_iter_state")
    @NotUsableInJava
    public static class bpf_unix_iter_state
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public @Unsigned int cur_sk;
        public @Unsigned int end_sk;
        public @Unsigned int max_sk;
        public Ptr<Ptr<runtime.sock>> batch;
        public boolean st_bucket_done;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_udp_iter_state")
    @NotUsableInJava
    public static class bpf_udp_iter_state
    extends Struct {
        public UdpDefinitions.udp_iter_state state;
        public @Unsigned int cur_sk;
        public @Unsigned int end_sk;
        public @Unsigned int max_sk;
        public int offset;
        public Ptr<Ptr<runtime.sock>> batch;
        public boolean st_bucket_done;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__udp")
    @NotUsableInJava
    public static class bpf_iter__udp
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=25559)
        public @InlineUnion(value=25559) Ptr<UdpDefinitions.udp_sock> udp_sk;
        public @Unsigned @OriginalName(value="uid_t") int uid;
        public int bucket;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__netlink")
    @NotUsableInJava
    public static class bpf_iter__netlink
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=25172)
        public @InlineUnion(value=25172) Ptr<NetlinkDefinitions.netlink_sock> sk;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__bpf_sk_storage_map")
    @NotUsableInJava
    public static class bpf_iter__bpf_sk_storage_map
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=8895)
        public @InlineUnion(value=8895) Ptr<bpf_map> map;
        @InlineUnion(value=25047)
        public @InlineUnion(value=25047) Ptr<runtime.sock> sk;
        @InlineUnion(value=8897)
        public @InlineUnion(value=8897) Ptr<?> value;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_sk_storage_map_info")
    @NotUsableInJava
    public static class bpf_iter_seq_sk_storage_map_info
    extends Struct {
        public Ptr<bpf_map> map;
        public @Unsigned int bucket_id;
        public @Unsigned int skip_elems;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sk_storage_diag")
    @NotUsableInJava
    public static class bpf_sk_storage_diag
    extends Struct {
        public @Unsigned int nr_maps;
        public Ptr<bpf_map> @Size(value=0) [] maps;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_scratchpad")
    @NotUsableInJava
    public static class bpf_scratchpad
    extends Struct {
        @InlineUnion(value=24015)
        public @InlineUnion(value=24015) @Unsigned @OriginalName(value="__be32") int @Size(value=128) [] diff;
        @InlineUnion(value=24015)
        public @InlineUnion(value=24015) char @Size(value=512) [] buff;
        public  @OriginalName(value="local_lock_t") misc.lockdep_map_p bh_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tcp_req_attrs")
    @NotUsableInJava
    public static class bpf_tcp_req_attrs
    extends Struct {
        public @Unsigned int rcv_tsval;
        public @Unsigned int rcv_tsecr;
        public @Unsigned short mss;
        public char rcv_wscale;
        public char snd_wscale;
        public char ecn_ok;
        public char wscale_ok;
        public char sack_ok;
        public char tstamp_ok;
        public char usec_ts_ok;
        public char @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sk_lookup_kern")
    @NotUsableInJava
    public static class bpf_sk_lookup_kern
    extends Struct {
        public @Unsigned short family;
        public @Unsigned short protocol;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public @Unsigned short dport;
        public misc.addrs_of_anon_member_of_iphdr_and_anon_member_of_anon_member_of_iphdr_and_v4_of_bpf_sk_lookup_kern v4;
        public misc.v6_of_bpf_sk_lookup_kern v6;
        public Ptr<runtime.sock> selected_sk;
        public @Unsigned int ingress_ifindex;
        public boolean no_reuseport;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sock_ops_kern")
    @NotUsableInJava
    public static class bpf_sock_ops_kern
    extends Struct {
        public Ptr<runtime.sock> sk;
        @InlineUnion(value=23602)
        public @InlineUnion(value=23602) @Unsigned int @Size(value=4) [] args;
        @InlineUnion(value=23602)
        public @InlineUnion(value=23602) @Unsigned int reply;
        @InlineUnion(value=23602)
        public @InlineUnion(value=23602) @Unsigned int @Size(value=4) [] replylong;
        public Ptr<SkDefinitions.sk_buff> syn_skb;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<?> skb_data_end;
        public char op;
        public char is_fullsock;
        public char remaining_opt_len;
        public @Unsigned long temp;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sock_addr_kern")
    @NotUsableInJava
    public static class bpf_sock_addr_kern
    extends Struct {
        public Ptr<runtime.sock> sk;
        public Ptr<runtime.sockaddr> uaddr;
        public @Unsigned long tmp_reg;
        public Ptr<?> t_ctx;
        public @Unsigned int uaddrlen;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_skb_data_end")
    @NotUsableInJava
    public static class bpf_skb_data_end
    extends Struct {
        public QdiscDefinitions.qdisc_skb_cb qdisc_cb;
        public Ptr<?> data_meta;
        public Ptr<?> data_end;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_flow_dissector")
    @NotUsableInJava
    public static class bpf_flow_dissector
    extends Struct {
        public Ptr<bpf_flow_keys> flow_keys;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<?> data;
        public Ptr<?> data_end;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_empty_prog_array")
    @NotUsableInJava
    public static class bpf_empty_prog_array
    extends Struct {
        public bpf_prog_array hdr;
        public Ptr<bpf_prog> null_prog;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sk_lookup")
    @NotUsableInJava
    public static class bpf_sk_lookup
    extends Struct {
        @InlineUnion(value=23514)
        public  @InlineUnion(value=23514) AnonDefinitions.anon_member_of___sk_buff_and_anon_member_of_anon_member_of_bpf_sk_lookup_and_anon_member_of_bpf_sock_addr anon0$0;
        @InlineUnion(value=23514)
        public @InlineUnion(value=23514) @Unsigned long cookie;
        public @Unsigned int family;
        public @Unsigned int protocol;
        public @Unsigned int remote_ip4;
        public @Unsigned int @Size(value=4) [] remote_ip6;
        public @Unsigned @OriginalName(value="__be16") short remote_port;
        public @Unsigned int local_ip4;
        public @Unsigned int @Size(value=4) [] local_ip6;
        public @Unsigned int local_port;
        public @Unsigned int ingress_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_check_mtu_ret")
    public static enum bpf_check_mtu_ret implements Enum<bpf_check_mtu_ret>,
    TypedEnum<bpf_check_mtu_ret, Integer>
    {
        BPF_MTU_CHK_RET_SUCCESS,
        BPF_MTU_CHK_RET_FRAG_NEEDED,
        BPF_MTU_CHK_RET_SEGS_TOOBIG;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_check_mtu_flags")
    public static enum bpf_check_mtu_flags implements Enum<bpf_check_mtu_flags>,
    TypedEnum<bpf_check_mtu_flags, Integer>
    {
        BPF_MTU_CHK_SEGS;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_redir_neigh")
    @NotUsableInJava
    public static class bpf_redir_neigh
    extends Struct {
        public @Unsigned int nh_family;
        @InlineUnion(value=23507)
        public @InlineUnion(value=23507) @Unsigned @OriginalName(value="__be32") int ipv4_nh;
        @InlineUnion(value=23507)
        public @InlineUnion(value=23507) @Unsigned int @Size(value=4) [] ipv6_nh;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_fib_lookup")
    @NotUsableInJava
    public static class bpf_fib_lookup
    extends Struct {
        public char family;
        public char l4_protocol;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public @Unsigned @OriginalName(value="__be16") short dport;
        @InlineUnion(value=23497)
        public @InlineUnion(value=23497) @Unsigned short tot_len;
        @InlineUnion(value=23497)
        public @InlineUnion(value=23497) @Unsigned short mtu_result;
        public @Unsigned int ifindex;
        @InlineUnion(value=23498)
        public @InlineUnion(value=23498) char tos;
        @InlineUnion(value=23498)
        public @InlineUnion(value=23498) @Unsigned @OriginalName(value="__be32") int flowinfo;
        @InlineUnion(value=23498)
        public @InlineUnion(value=23498) @Unsigned int rt_metric;
        @InlineUnion(value=23499)
        public @InlineUnion(value=23499) @Unsigned @OriginalName(value="__be32") int ipv4_src;
        @InlineUnion(value=23499)
        public @InlineUnion(value=23499) @Unsigned int @Size(value=4) [] ipv6_src;
        @InlineUnion(value=23500)
        public @InlineUnion(value=23500) @Unsigned @OriginalName(value="__be32") int ipv4_dst;
        @InlineUnion(value=23500)
        public @InlineUnion(value=23500) @Unsigned int @Size(value=4) [] ipv6_dst;
        @InlineUnion(value=23502)
        public  @InlineUnion(value=23502) AnonDefinitions.anon_member_of_anon_member_of_bpf_fib_lookup anon9$0;
        @InlineUnion(value=23502)
        public @InlineUnion(value=23502) @Unsigned int tbid;
        @InlineUnion(value=23505)
        public  @InlineUnion(value=23505) AnonDefinitions.anon_member_of_anon_member_of_bpf_fib_lookup anon10$0;
        @InlineUnion(value=23505)
        public  @InlineUnion(value=23505) AnonDefinitions.anon_member_of_anon_member_of_bpf_fib_lookup anon10$1;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sock_ops")
    @NotUsableInJava
    public static class bpf_sock_ops
    extends Struct {
        public @Unsigned int op;
        @InlineUnion(value=23487)
        public @InlineUnion(value=23487) @Unsigned int @Size(value=4) [] args;
        @InlineUnion(value=23487)
        public @InlineUnion(value=23487) @Unsigned int reply;
        @InlineUnion(value=23487)
        public @InlineUnion(value=23487) @Unsigned int @Size(value=4) [] replylong;
        public @Unsigned int family;
        public @Unsigned int remote_ip4;
        public @Unsigned int local_ip4;
        public @Unsigned int @Size(value=4) [] remote_ip6;
        public @Unsigned int @Size(value=4) [] local_ip6;
        public @Unsigned int remote_port;
        public @Unsigned int local_port;
        public @Unsigned int is_fullsock;
        public @Unsigned int snd_cwnd;
        public @Unsigned int srtt_us;
        public @Unsigned int bpf_sock_ops_cb_flags;
        public @Unsigned int state;
        public @Unsigned int rtt_min;
        public @Unsigned int snd_ssthresh;
        public @Unsigned int rcv_nxt;
        public @Unsigned int snd_nxt;
        public @Unsigned int snd_una;
        public @Unsigned int mss_cache;
        public @Unsigned int ecn_flags;
        public @Unsigned int rate_delivered;
        public @Unsigned int rate_interval_us;
        public @Unsigned int packets_out;
        public @Unsigned int retrans_out;
        public @Unsigned int total_retrans;
        public @Unsigned int segs_in;
        public @Unsigned int data_segs_in;
        public @Unsigned int segs_out;
        public @Unsigned int data_segs_out;
        public @Unsigned int lost_out;
        public @Unsigned int sacked_out;
        public @Unsigned int sk_txhash;
        public @Unsigned long bytes_received;
        public @Unsigned long bytes_acked;
        @InlineUnion(value=23464)
        public @InlineUnion(value=23464) Ptr<bpf_sock> sk;
        @InlineUnion(value=23488)
        public @InlineUnion(value=23488) Ptr<?> skb_data;
        @InlineUnion(value=23489)
        public @InlineUnion(value=23489) Ptr<?> skb_data_end;
        public @Unsigned int skb_len;
        public @Unsigned int skb_tcp_flags;
        public @Unsigned long skb_hwtstamp;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sock_addr")
    @NotUsableInJava
    public static class bpf_sock_addr
    extends Struct {
        public @Unsigned int user_family;
        public @Unsigned int user_ip4;
        public @Unsigned int @Size(value=4) [] user_ip6;
        public @Unsigned int user_port;
        public @Unsigned int family;
        public @Unsigned int type;
        public @Unsigned int protocol;
        public @Unsigned int msg_src_ip4;
        public @Unsigned int @Size(value=4) [] msg_src_ip6;
        @InlineUnion(value=23464)
        public @InlineUnion(value=23464) Ptr<bpf_sock> sk;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_xdp_sock")
    @NotUsableInJava
    public static class bpf_xdp_sock
    extends Struct {
        public @Unsigned int queue_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sock_tuple")
    @NotUsableInJava
    public static class bpf_sock_tuple
    extends Struct {
        @InlineUnion(value=23477)
        public  @InlineUnion(value=23477) Ipv4Definitions.ipv4_of_anon_member_of_bpf_sock_tuple ipv4;
        @InlineUnion(value=23477)
        public  @InlineUnion(value=23477) Ipv6Definitions.ipv6_of_anon_member_of_bpf_sock_tuple ipv6;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tcp_sock")
    @NotUsableInJava
    public static class bpf_tcp_sock
    extends Struct {
        public @Unsigned int snd_cwnd;
        public @Unsigned int srtt_us;
        public @Unsigned int rtt_min;
        public @Unsigned int snd_ssthresh;
        public @Unsigned int rcv_nxt;
        public @Unsigned int snd_nxt;
        public @Unsigned int snd_una;
        public @Unsigned int mss_cache;
        public @Unsigned int ecn_flags;
        public @Unsigned int rate_delivered;
        public @Unsigned int rate_interval_us;
        public @Unsigned int packets_out;
        public @Unsigned int retrans_out;
        public @Unsigned int total_retrans;
        public @Unsigned int segs_in;
        public @Unsigned int data_segs_in;
        public @Unsigned int segs_out;
        public @Unsigned int data_segs_out;
        public @Unsigned int lost_out;
        public @Unsigned int sacked_out;
        public @Unsigned long bytes_received;
        public @Unsigned long bytes_acked;
        public @Unsigned int dsack_dups;
        public @Unsigned int delivered;
        public @Unsigned int delivered_ce;
        public @Unsigned int icsk_retransmits;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_xfrm_state")
    @NotUsableInJava
    public static class bpf_xfrm_state
    extends Struct {
        public @Unsigned int reqid;
        public @Unsigned int spi;
        public @Unsigned short family;
        public @Unsigned short ext;
        @InlineUnion(value=23468)
        public @InlineUnion(value=23468) @Unsigned int remote_ipv4;
        @InlineUnion(value=23468)
        public @InlineUnion(value=23468) @Unsigned int @Size(value=4) [] remote_ipv6;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tunnel_key")
    @NotUsableInJava
    public static class bpf_tunnel_key
    extends Struct {
        public @Unsigned int tunnel_id;
        @InlineUnion(value=23468)
        public @InlineUnion(value=23468) @Unsigned int remote_ipv4;
        @InlineUnion(value=23468)
        public @InlineUnion(value=23468) @Unsigned int @Size(value=4) [] remote_ipv6;
        public char tunnel_tos;
        public char tunnel_ttl;
        @InlineUnion(value=23469)
        public @InlineUnion(value=23469) @Unsigned short tunnel_ext;
        @InlineUnion(value=23469)
        public @InlineUnion(value=23469) @Unsigned @OriginalName(value="__be16") short tunnel_flags;
        public @Unsigned int tunnel_label;
        @InlineUnion(value=23470)
        public @InlineUnion(value=23470) @Unsigned int local_ipv4;
        @InlineUnion(value=23470)
        public @InlineUnion(value=23470) @Unsigned int @Size(value=4) [] local_ipv6;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_sock")
    @NotUsableInJava
    public static class bpf_sock
    extends Struct {
        public @Unsigned int bound_dev_if;
        public @Unsigned int family;
        public @Unsigned int type;
        public @Unsigned int protocol;
        public @Unsigned int mark;
        public @Unsigned int priority;
        public @Unsigned int src_ip4;
        public @Unsigned int @Size(value=4) [] src_ip6;
        public @Unsigned int src_port;
        public @Unsigned @OriginalName(value="__be16") short dst_port;
        public @Unsigned int dst_ip4;
        public @Unsigned int @Size(value=4) [] dst_ip6;
        public @Unsigned int state;
        public int rx_queue_mapping;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_flow_keys")
    @NotUsableInJava
    public static class bpf_flow_keys
    extends Struct {
        public @Unsigned short nhoff;
        public @Unsigned short thoff;
        public @Unsigned short addr_proto;
        public char is_frag;
        public char is_first_frag;
        public char is_encap;
        public char ip_proto;
        public @Unsigned @OriginalName(value="__be16") short n_proto;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public @Unsigned @OriginalName(value="__be16") short dport;
        @InlineUnion(value=23513)
        public  @InlineUnion(value=23513) AnonDefinitions.anon_member_of_anon_member_of_bpf_flow_keys anon10$0;
        @InlineUnion(value=23513)
        public  @InlineUnion(value=23513) AnonDefinitions.anon_member_of_anon_member_of_bpf_flow_keys anon10$1;
        public @Unsigned int flags;
        public @Unsigned @OriginalName(value="__be32") int flow_label;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_lwt_encap_mode")
    public static enum bpf_lwt_encap_mode implements Enum<bpf_lwt_encap_mode>,
    TypedEnum<bpf_lwt_encap_mode, Integer>
    {
        BPF_LWT_ENCAP_SEG6,
        BPF_LWT_ENCAP_SEG6_INLINE,
        BPF_LWT_ENCAP_IP;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_hdr_start_off")
    public static enum bpf_hdr_start_off implements Enum<bpf_hdr_start_off>,
    TypedEnum<bpf_hdr_start_off, Integer>
    {
        BPF_HDR_START_MAC,
        BPF_HDR_START_NET;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_adj_room_mode")
    public static enum bpf_adj_room_mode implements Enum<bpf_adj_room_mode>,
    TypedEnum<bpf_adj_room_mode, Integer>
    {
        BPF_ADJ_ROOM_NET,
        BPF_ADJ_ROOM_MAC;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_hid_bpf_ops")
    @NotUsableInJava
    public static class bpf_struct_ops_hid_bpf_ops
    extends Struct {
        public bpf_struct_ops_common_value common;
        public HidDefinitions.hid_bpf_ops data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_crypto_type")
    @NotUsableInJava
    public static class bpf_crypto_type
    extends Struct {
        public Ptr<?> alloc_tfm;
        public Ptr<?> free_tfm;
        public Ptr<?> has_algo;
        public Ptr<?> setkey;
        public Ptr<?> setauthsize;
        public Ptr<?> encrypt;
        public Ptr<?> decrypt;
        public Ptr<?> ivsize;
        public Ptr<?> statesize;
        public Ptr<?> get_flags;
        public Ptr<runtime.module> owner;
        public char @Size(value=14) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dynptr_kern")
    @NotUsableInJava
    public static class bpf_dynptr_kern
    extends Struct {
        public Ptr<?> data;
        public @Unsigned int size;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dynptr")
    @NotUsableInJava
    public static class bpf_dynptr
    extends Struct {
        public @Unsigned long @Size(value=2) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_perf_event_data_kern")
    @NotUsableInJava
    public static class bpf_perf_event_data_kern
    extends Struct {
        public Ptr< @OriginalName(value="bpf_user_pt_regs_t") PtDefinitions.pt_regs> regs;
        public Ptr<PerfDefinitions.perf_sample_data> data;
        public Ptr<PerfDefinitions.perf_event> event;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_link")
    @NotUsableInJava
    public static class bpf_struct_ops_link
    extends Struct {
        public bpf_link link;
        public Ptr<bpf_map> map;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait_hup;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_map")
    @NotUsableInJava
    public static class bpf_struct_ops_map
    extends Struct {
        public bpf_map map;
        public misc.callback_head rcu;
        public Ptr<bpf_struct_ops_desc> st_ops_desc;
        public runtime.mutex lock;
        public Ptr<Ptr<bpf_link>> links;
        public Ptr<Ptr<bpf_ksym>> ksyms;
        public @Unsigned int funcs_cnt;
        public @Unsigned int image_pages_cnt;
        public Ptr<?> @Size(value=8) [] image_pages;
        public Ptr<runtime.btf> btf;
        public Ptr<bpf_struct_ops_value> uvalue;
        public bpf_struct_ops_value kvalue;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_value")
    @NotUsableInJava
    public static class bpf_struct_ops_value
    extends Struct {
        public bpf_struct_ops_common_value common;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_offload_netdev")
    @NotUsableInJava
    public static class bpf_offload_netdev
    extends Struct {
        public misc.rhash_head l;
        public Ptr<NetDefinitions.net_device> netdev;
        public Ptr<bpf_offload_dev> offdev;
        public ListDefinitions.list_head progs;
        public ListDefinitions.list_head maps;
        public ListDefinitions.list_head offdev_netdevs;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_offload_dev")
    @NotUsableInJava
    public static class bpf_offload_dev
    extends Struct {
        public Ptr<bpf_prog_offload_ops> ops;
        public ListDefinitions.list_head netdevs;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_offload_ops")
    @NotUsableInJava
    public static class bpf_prog_offload_ops
    extends Struct {
        public Ptr<?> insn_hook;
        public Ptr<?> finalize;
        public Ptr<?> replace_insn;
        public Ptr<?> remove_insns;
        public Ptr<?> prepare;
        public Ptr<?> translate;
        public Ptr<?> destroy;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dispatcher")
    @NotUsableInJava
    public static class bpf_dispatcher
    extends Struct {
        public runtime.mutex mutex;
        public Ptr<?> func;
        public bpf_dispatcher_prog @Size(value=48) [] progs;
        public int num_progs;
        public Ptr<?> image;
        public Ptr<?> rw_image;
        public @Unsigned int image_off;
        public bpf_ksym ksym;
        public Ptr<StaticDefinitions.static_call_key> sc_key;
        public Ptr<?> sc_tramp;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_dispatcher_prog")
    @NotUsableInJava
    public static class bpf_dispatcher_prog
    extends Struct {
        public Ptr<bpf_prog> prog;
        public  @OriginalName(value="refcount_t") misc.refcount_struct users;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_shim_tramp_link")
    @NotUsableInJava
    public static class bpf_shim_tramp_link
    extends Struct {
        public bpf_tramp_link link;
        public Ptr<bpf_trampoline> trampoline;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_local_storage_cache")
    @NotUsableInJava
    public static class bpf_local_storage_cache
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock idx_lock;
        public @Unsigned long @Size(value=16) [] idx_usage_counts;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_local_storage_elem")
    @NotUsableInJava
    public static class bpf_local_storage_elem
    extends Struct {
        public misc.hlist_node map_node;
        public misc.hlist_node snode;
        public Ptr<bpf_local_storage> local_storage;
        public misc.callback_head rcu;
        public bpf_local_storage_data sdata;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_local_storage_data")
    @NotUsableInJava
    public static class bpf_local_storage_data
    extends Struct {
        public Ptr<bpf_local_storage_map> smap;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_local_storage_map_bucket")
    @NotUsableInJava
    public static class bpf_local_storage_map_bucket
    extends Struct {
        public misc.hlist_head list;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_local_storage_map")
    @NotUsableInJava
    public static class bpf_local_storage_map
    extends Struct {
        public bpf_map map;
        public Ptr<bpf_local_storage_map_bucket> buckets;
        public @Unsigned int bucket_log;
        public @Unsigned short elem_size;
        public @Unsigned short cache_idx;
        public bpf_mem_alloc selem_ma;
        public bpf_mem_alloc storage_ma;
        public boolean bpf_ma;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_mem_alloc")
    @NotUsableInJava
    public static class bpf_mem_alloc
    extends Struct {
        public Ptr<bpf_mem_caches> caches;
        public Ptr<bpf_mem_cache> cache;
        public Ptr<ObjDefinitions.obj_cgroup> objcg;
        public boolean percpu;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_local_storage")
    @NotUsableInJava
    public static class bpf_local_storage
    extends Struct {
        public Ptr<bpf_local_storage_data> @Size(value=16) [] cache;
        public Ptr<bpf_local_storage_map> smap;
        public misc.hlist_head list;
        public Ptr<?> owner;
        public misc.callback_head rcu;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_bloom_filter")
    @NotUsableInJava
    public static class bpf_bloom_filter
    extends Struct {
        public bpf_map map;
        public @Unsigned int bitset_mask;
        public @Unsigned int hash_seed;
        public @Unsigned int nr_hash_funcs;
        public @Unsigned long @Size(value=0) [] bitset;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_array_map_info")
    @NotUsableInJava
    public static class bpf_iter_seq_array_map_info
    extends Struct {
        public Ptr<bpf_map> map;
        public Ptr<?> percpu_value_buf;
        public @Unsigned int index;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__bpf_map_elem")
    @NotUsableInJava
    public static class bpf_iter__bpf_map_elem
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=8895)
        public @InlineUnion(value=8895) Ptr<bpf_map> map;
        @InlineUnion(value=8896)
        public @InlineUnion(value=8896) Ptr<?> key;
        @InlineUnion(value=8897)
        public @InlineUnion(value=8897) Ptr<?> value;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_event_entry")
    @NotUsableInJava
    public static class bpf_event_entry
    extends Struct {
        public Ptr<PerfDefinitions.perf_event> event;
        public Ptr<runtime.file> perf_file;
        public Ptr<runtime.file> map_file;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter__bpf_prog")
    @NotUsableInJava
    public static class bpf_iter__bpf_prog
    extends Struct {
        @InlineUnion(value=8889)
        public @InlineUnion(value=8889) Ptr<bpf_iter_meta> meta;
        @InlineUnion(value=8890)
        public @InlineUnion(value=8890) Ptr<bpf_prog> prog;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_prog_info")
    @NotUsableInJava
    public static class bpf_iter_seq_prog_info
    extends Struct {
        public @Unsigned int prog_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_meta")
    @NotUsableInJava
    public static class bpf_iter_meta
    extends Struct {
        @InlineUnion(value=8885)
        public @InlineUnion(value=8885) Ptr<SeqDefinitions.seq_file> seq;
        public @Unsigned long session_id;
        public @Unsigned long seq_num;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_reg")
    @NotUsableInJava
    public static class bpf_iter_reg
    extends Struct {
        public String target;
        public @OriginalName(value="bpf_iter_attach_target_t") Ptr<?> attach_target;
        public @OriginalName(value="bpf_iter_detach_target_t") Ptr<?> detach_target;
        public @OriginalName(value="bpf_iter_show_fdinfo_t") Ptr<?> show_fdinfo;
        public @OriginalName(value="bpf_iter_fill_link_info_t") Ptr<?> fill_link_info;
        public @OriginalName(value="bpf_iter_get_func_proto_t") Ptr<?> get_func_proto;
        public @Unsigned int ctx_arg_info_size;
        public @Unsigned int feature;
        public bpf_ctx_arg_aux @Size(value=2) [] ctx_arg_info;
        public Ptr<bpf_iter_seq_info> seq_info;
    }

    @Type(noCCodeGeneration=true, cType="union bpf_iter_link_info")
    @NotUsableInJava
    public static class bpf_iter_link_info
    extends Union {
        public MapDefinitions.map_of_bpf_iter_link_info map;
        public CgroupDefinitions.cgroup_of_bpf_iter_link_info cgroup;
        public TaskDefinitions.task_of_bpf_iter_link_info task;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_mount_opts")
    @NotUsableInJava
    public static class bpf_mount_opts
    extends Struct {
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public @Unsigned long delegate_cmds;
        public @Unsigned long delegate_maps;
        public @Unsigned long delegate_progs;
        public @Unsigned long delegate_attachs;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_perf_link")
    @NotUsableInJava
    public static class bpf_perf_link
    extends Struct {
        public bpf_link link;
        public Ptr<runtime.file> perf_file;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_kstats")
    @NotUsableInJava
    public static class bpf_prog_kstats
    extends Struct {
        public @Unsigned long nsecs;
        public @Unsigned long cnt;
        public @Unsigned long misses;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_audit")
    public static enum bpf_audit implements Enum<bpf_audit>,
    TypedEnum<bpf_audit, Integer>
    {
        BPF_AUDIT_LOAD,
        BPF_AUDIT_UNLOAD,
        BPF_AUDIT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_mprog_bundle")
    @NotUsableInJava
    public static class bpf_mprog_bundle
    extends Struct {
        public bpf_mprog_entry a;
        public bpf_mprog_entry b;
        public bpf_mprog_cp @Size(value=64) [] cp_items;
        public Ptr<bpf_prog> ref;
        public misc.atomic64_t revision;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_mprog_cp")
    @NotUsableInJava
    public static class bpf_mprog_cp
    extends Struct {
        public Ptr<bpf_link> link;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_mprog_fp")
    @NotUsableInJava
    public static class bpf_mprog_fp
    extends Struct {
        public Ptr<bpf_prog> prog;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_mprog_entry")
    @NotUsableInJava
    public static class bpf_mprog_entry
    extends Struct {
        public bpf_mprog_fp @Size(value=64) [] fp_items;
        public Ptr<bpf_mprog_bundle> parent;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_link_primer")
    @NotUsableInJava
    public static class bpf_link_primer
    extends Struct {
        public Ptr<bpf_link> link;
        public Ptr<runtime.file> file;
        public int fd;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tracing_link")
    @NotUsableInJava
    public static class bpf_tracing_link
    extends Struct {
        public bpf_tramp_link link;
        public bpf_attach_type attach_type;
        public Ptr<bpf_trampoline> trampoline;
        public Ptr<bpf_prog> tgt_prog;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_attach_target_info")
    @NotUsableInJava
    public static class bpf_attach_target_info
    extends Struct {
        public BtfDefinitions.btf_func_model fmodel;
        public long tgt_addr;
        public Ptr<runtime.module> tgt_mod;
        public String tgt_name;
        public Ptr<BtfDefinitions.btf_type> tgt_type;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_spin_lock")
    @NotUsableInJava
    public static class bpf_spin_lock
    extends Struct {
        public @Unsigned int val;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_task_fd_type")
    public static enum bpf_task_fd_type implements Enum<bpf_task_fd_type>,
    TypedEnum<bpf_task_fd_type, Integer>
    {
        BPF_FD_TYPE_RAW_TRACEPOINT,
        BPF_FD_TYPE_TRACEPOINT,
        BPF_FD_TYPE_KPROBE,
        BPF_FD_TYPE_KRETPROBE,
        BPF_FD_TYPE_UPROBE,
        BPF_FD_TYPE_URETPROBE;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_btf_info")
    @NotUsableInJava
    public static class bpf_btf_info
    extends Struct {
        public @Unsigned long btf;
        public @Unsigned int btf_size;
        public @Unsigned int id;
        public @Unsigned long name;
        public @Unsigned int name_len;
        public @Unsigned int kernel_btf;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_map_info")
    @NotUsableInJava
    public static class bpf_map_info
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int id;
        public @Unsigned int key_size;
        public @Unsigned int value_size;
        public @Unsigned int max_entries;
        public @Unsigned int map_flags;
        public char @Size(value=16) [] name;
        public @Unsigned int ifindex;
        public @Unsigned int btf_vmlinux_value_type_id;
        public @Unsigned long netns_dev;
        public @Unsigned long netns_ino;
        public @Unsigned int btf_id;
        public @Unsigned int btf_key_type_id;
        public @Unsigned int btf_value_type_id;
        public @Unsigned int btf_vmlinux_id;
        public @Unsigned long map_extra;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_info")
    @NotUsableInJava
    public static class bpf_prog_info
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int id;
        public char @Size(value=8) [] tag;
        public @Unsigned int jited_prog_len;
        public @Unsigned int xlated_prog_len;
        public @Unsigned long jited_prog_insns;
        public @Unsigned long xlated_prog_insns;
        public @Unsigned long load_time;
        public @Unsigned int created_by_uid;
        public @Unsigned int nr_map_ids;
        public @Unsigned long map_ids;
        public char @Size(value=16) [] name;
        public @Unsigned int ifindex;
        public @Unsigned int gpl_compatible;
        public @Unsigned long netns_dev;
        public @Unsigned long netns_ino;
        public @Unsigned int nr_jited_ksyms;
        public @Unsigned int nr_jited_func_lens;
        public @Unsigned long jited_ksyms;
        public @Unsigned long jited_func_lens;
        public @Unsigned int btf_id;
        public @Unsigned int func_info_rec_size;
        public @Unsigned long func_info;
        public @Unsigned int nr_func_info;
        public @Unsigned int nr_line_info;
        public @Unsigned long line_info;
        public @Unsigned long jited_line_info;
        public @Unsigned int nr_jited_line_info;
        public @Unsigned int line_info_rec_size;
        public @Unsigned int jited_line_info_rec_size;
        public @Unsigned int nr_prog_tags;
        public @Unsigned long prog_tags;
        public @Unsigned long run_time_ns;
        public @Unsigned long run_cnt;
        public @Unsigned long recursion_misses;
        public @Unsigned int verified_insns;
        public @Unsigned int attach_btf_obj_id;
        public @Unsigned int attach_btf_id;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_stats_type")
    public static enum bpf_stats_type implements Enum<bpf_stats_type>,
    TypedEnum<bpf_stats_type, Integer>
    {
        BPF_STATS_RUN_TIME;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_perf_event_type")
    public static enum bpf_perf_event_type implements Enum<bpf_perf_event_type>,
    TypedEnum<bpf_perf_event_type, Integer>
    {
        BPF_PERF_EVENT_UNSPEC,
        BPF_PERF_EVENT_UPROBE,
        BPF_PERF_EVENT_URETPROBE,
        BPF_PERF_EVENT_KPROBE,
        BPF_PERF_EVENT_KRETPROBE,
        BPF_PERF_EVENT_TRACEPOINT,
        BPF_PERF_EVENT_EVENT;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_cmd")
    public static enum bpf_cmd implements Enum<bpf_cmd>,
    TypedEnum<bpf_cmd, Integer>
    {
        BPF_MAP_CREATE,
        BPF_MAP_LOOKUP_ELEM,
        BPF_MAP_UPDATE_ELEM,
        BPF_MAP_DELETE_ELEM,
        BPF_MAP_GET_NEXT_KEY,
        BPF_PROG_LOAD,
        BPF_OBJ_PIN,
        BPF_OBJ_GET,
        BPF_PROG_ATTACH,
        BPF_PROG_DETACH,
        BPF_PROG_TEST_RUN,
        BPF_PROG_RUN,
        BPF_PROG_GET_NEXT_ID,
        BPF_MAP_GET_NEXT_ID,
        BPF_PROG_GET_FD_BY_ID,
        BPF_MAP_GET_FD_BY_ID,
        BPF_OBJ_GET_INFO_BY_FD,
        BPF_PROG_QUERY,
        BPF_RAW_TRACEPOINT_OPEN,
        BPF_BTF_LOAD,
        BPF_BTF_GET_FD_BY_ID,
        BPF_TASK_FD_QUERY,
        BPF_MAP_LOOKUP_AND_DELETE_ELEM,
        BPF_MAP_FREEZE,
        BPF_BTF_GET_NEXT_ID,
        BPF_MAP_LOOKUP_BATCH,
        BPF_MAP_LOOKUP_AND_DELETE_BATCH,
        BPF_MAP_UPDATE_BATCH,
        BPF_MAP_DELETE_BATCH,
        BPF_LINK_CREATE,
        BPF_LINK_UPDATE,
        BPF_LINK_GET_FD_BY_ID,
        BPF_LINK_GET_NEXT_ID,
        BPF_ENABLE_STATS,
        BPF_ITER_CREATE,
        BPF_LINK_DETACH,
        BPF_PROG_BIND_MAP,
        BPF_TOKEN_CREATE,
        __MAX_BPF_CMD;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_storage_buffer")
    @NotUsableInJava
    public static class bpf_storage_buffer
    extends Struct {
        public misc.callback_head rcu;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_xdp_mode")
    public static enum bpf_xdp_mode implements Enum<bpf_xdp_mode>,
    TypedEnum<bpf_xdp_mode, Integer>
    {
        XDP_MODE_SKB,
        XDP_MODE_DRV,
        XDP_MODE_HW,
        __MAX_XDP_MODE;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cgroup_storage")
    @NotUsableInJava
    public static class bpf_cgroup_storage
    extends Struct {
        @InlineUnion(value=7989)
        public @InlineUnion(value=7989) Ptr<bpf_storage_buffer> buf;
        @InlineUnion(value=7989)
        public @InlineUnion(value=7989) Ptr<?> percpu_buf;
        public Ptr<bpf_cgroup_storage_map> map;
        public bpf_cgroup_storage_key key;
        public ListDefinitions.list_head list_map;
        public ListDefinitions.list_head list_cg;
        public RbDefinitions.rb_node node;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_cgroup_storage_type")
    public static enum bpf_cgroup_storage_type implements Enum<bpf_cgroup_storage_type>,
    TypedEnum<bpf_cgroup_storage_type, Integer>
    {
        BPF_CGROUP_STORAGE_SHARED,
        BPF_CGROUP_STORAGE_PERCPU,
        __BPF_CGROUP_STORAGE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_cgroup_storage_key")
    @NotUsableInJava
    public static class bpf_cgroup_storage_key
    extends Struct {
        public @Unsigned long cgroup_inode_id;
        public @Unsigned int attach_type;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_sched_ext_ops")
    @NotUsableInJava
    public static class bpf_struct_ops_sched_ext_ops
    extends Struct {
        public bpf_struct_ops_common_value common;
        public SchedDefinitions.sched_ext_ops data;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_idset")
    @NotUsableInJava
    public static class bpf_idset
    extends Struct {
        public @Unsigned int count;
        public @Unsigned int @Size(value=600) [] ids;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_idmap")
    @NotUsableInJava
    public static class bpf_idmap
    extends Struct {
        public @Unsigned int tmp_id_gen;
        public bpf_id_pair @Size(value=600) [] map;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_id_pair")
    @NotUsableInJava
    public static class bpf_id_pair
    extends Struct {
        public @Unsigned int old;
        public @Unsigned int cur;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_subprog_info")
    @NotUsableInJava
    public static class bpf_subprog_info
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int linfo_idx;
        public @Unsigned short stack_depth;
        public @Unsigned short stack_extra;
        public short fastcall_stack_off;
        public boolean has_tail_call;
        public boolean tail_call_reachable;
        public boolean has_ld_abs;
        public boolean is_cb;
        public boolean is_async_cb;
        public boolean is_exception_cb;
        public boolean args_cached;
        public boolean keep_fastcall_stack;
        public char arg_cnt;
        public bpf_subprog_arg_info @Size(value=5) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_subprog_arg_info")
    @NotUsableInJava
    public static class bpf_subprog_arg_info
    extends Struct {
        public bpf_arg_type arg_type;
        @InlineUnion(value=7223)
        public @InlineUnion(value=7223) @Unsigned int mem_size;
        @InlineUnion(value=7223)
        public @InlineUnion(value=7223) @Unsigned int btf_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_insn_aux_data")
    @NotUsableInJava
    public static class bpf_insn_aux_data
    extends Struct {
        @InlineUnion(value=7219)
        public @InlineUnion(value=7219) bpf_reg_type ptr_type;
        @InlineUnion(value=7219)
        public @InlineUnion(value=7219) bpf_map_ptr_state map_ptr_state;
        @InlineUnion(value=7219)
        public @InlineUnion(value=7219) int call_imm;
        @InlineUnion(value=7219)
        public @InlineUnion(value=7219) @Unsigned int alu_limit;
        @InlineUnion(value=7219)
        public  @InlineUnion(value=7219) AnonDefinitions.anon_member_of_anon_member_of_bpf_insn_aux_data anon0$4;
        @InlineUnion(value=7219)
        public  @InlineUnion(value=7219) BtfDefinitions.btf_var_of_anon_member_of_bpf_insn_aux_data btf_var;
        @InlineUnion(value=7219)
        public @InlineUnion(value=7219) bpf_loop_inline_state loop_inline_state;
        @InlineUnion(value=7220)
        public @InlineUnion(value=7220) @Unsigned long obj_new_size;
        @InlineUnion(value=7220)
        public @InlineUnion(value=7220) @Unsigned long insert_off;
        public Ptr<BtfDefinitions.btf_struct_meta> kptr_struct_meta;
        public @Unsigned long map_key_state;
        public int ctx_field_size;
        public @Unsigned int seen;
        public boolean sanitize_stack_spill;
        public boolean zext_dst;
        public boolean needs_zext;
        public boolean storage_get_func_atomic;
        public boolean is_iter_next;
        public boolean call_with_percpu_alloc_ptr;
        public char alu_state;
        public char fastcall_pattern;
        public char fastcall_spills_num;
        public @Unsigned int orig_idx;
        public boolean jmp_point;
        public boolean prune_point;
        public boolean force_checkpoint;
        public boolean calls_callback;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_map_ptr_state")
    @NotUsableInJava
    public static class bpf_map_ptr_state
    extends Struct {
        public Ptr<bpf_map> map_ptr;
        public boolean poison;
        public boolean unpriv;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_loop_inline_state")
    @NotUsableInJava
    public static class bpf_loop_inline_state
    extends Struct {
        public @Unsigned int initialized;
        public @Unsigned int fit_for_inline;
        public @Unsigned int callback_subprogno;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_verifier_state_list")
    @NotUsableInJava
    public static class bpf_verifier_state_list
    extends Struct {
        public bpf_verifier_state state;
        public Ptr<bpf_verifier_state_list> next;
        public int miss_cnt;
        public int hit_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_verifier_state")
    @NotUsableInJava
    public static class bpf_verifier_state
    extends Struct {
        public Ptr<bpf_func_state> @Size(value=8) [] frame;
        public Ptr<bpf_verifier_state> parent;
        public @Unsigned int branches;
        public @Unsigned int insn_idx;
        public @Unsigned int curframe;
        public bpf_active_lock active_lock;
        public boolean speculative;
        public boolean active_rcu_lock;
        public @Unsigned int active_preempt_lock;
        public boolean used_as_loop_entry;
        public boolean in_sleepable;
        public @Unsigned int first_insn_idx;
        public @Unsigned int last_insn_idx;
        public Ptr<bpf_verifier_state> loop_entry;
        public Ptr<bpf_jmp_history_entry> jmp_history;
        public @Unsigned int jmp_history_cnt;
        public @Unsigned int dfs_depth;
        public @Unsigned int callback_unroll_depth;
        public @Unsigned int may_goto_depth;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_jmp_history_entry")
    @NotUsableInJava
    public static class bpf_jmp_history_entry
    extends Struct {
        public @Unsigned int idx;
        public @Unsigned int prev_idx;
        public @Unsigned int flags;
        public @Unsigned long linked_regs;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_retval_range")
    @NotUsableInJava
    public static class bpf_retval_range
    extends Struct {
        public int minval;
        public int maxval;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_reference_state")
    @NotUsableInJava
    public static class bpf_reference_state
    extends Struct {
        public int id;
        public int insn_idx;
        public int callback_ref;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_stack_state")
    @NotUsableInJava
    public static class bpf_stack_state
    extends Struct {
        public bpf_reg_state spilled_ptr;
        public char @Size(value=8) [] slot_type;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_iter_state")
    public static enum bpf_iter_state implements Enum<bpf_iter_state>,
    TypedEnum<bpf_iter_state, Integer>
    {
        BPF_ITER_STATE_INVALID,
        BPF_ITER_STATE_ACTIVE,
        BPF_ITER_STATE_DRAINED;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_active_lock")
    @NotUsableInJava
    public static class bpf_active_lock
    extends Struct {
        public Ptr<?> ptr;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_reg_liveness")
    public static enum bpf_reg_liveness implements Enum<bpf_reg_liveness>,
    TypedEnum<bpf_reg_liveness, Integer>
    {
        REG_LIVE_NONE,
        REG_LIVE_READ32,
        REG_LIVE_READ64,
        REG_LIVE_READ,
        REG_LIVE_WRITTEN,
        REG_LIVE_DONE;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_scx_dsq")
    @NotUsableInJava
    public static class bpf_iter_scx_dsq
    extends Struct {
        public @Unsigned long @Size(value=6) [] __opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_scx_dsq_kern")
    @NotUsableInJava
    public static class bpf_iter_scx_dsq_kern
    extends Struct {
        public ScxDefinitions.scx_dsq_list_node cursor;
        public Ptr<ScxDefinitions.scx_dispatch_q> dsq;
        public @Unsigned long slice;
        public @Unsigned long vtime;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_bprintf_data")
    @NotUsableInJava
    public static class bpf_bprintf_data
    extends Struct {
        public Ptr<@Unsigned Integer> bin_args;
        public String buf;
        public boolean get_bin_args;
        public boolean get_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_common_value")
    @NotUsableInJava
    public static class bpf_struct_ops_common_value
    extends Struct {
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public bpf_struct_ops_state state;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_struct_ops_state")
    public static enum bpf_struct_ops_state implements Enum<bpf_struct_ops_state>,
    TypedEnum<bpf_struct_ops_state, Integer>
    {
        BPF_STRUCT_OPS_STATE_INIT,
        BPF_STRUCT_OPS_STATE_INUSE,
        BPF_STRUCT_OPS_STATE_TOBEFREE,
        BPF_STRUCT_OPS_STATE_READY;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_desc")
    @NotUsableInJava
    public static class bpf_struct_ops_desc
    extends Struct {
        public Ptr<bpf_struct_ops> st_ops;
        public Ptr<BtfDefinitions.btf_type> type;
        public Ptr<BtfDefinitions.btf_type> value_type;
        public @Unsigned int type_id;
        public @Unsigned int value_id;
        public Ptr<bpf_struct_ops_arg_info> arg_info;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops_arg_info")
    @NotUsableInJava
    public static class bpf_struct_ops_arg_info
    extends Struct {
        public Ptr<bpf_ctx_arg_aux> info;
        public @Unsigned int cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_struct_ops")
    @NotUsableInJava
    public static class bpf_struct_ops
    extends Struct {
        public Ptr<bpf_verifier_ops> verifier_ops;
        public Ptr<?> init;
        public Ptr<?> check_member;
        public Ptr<?> init_member;
        public Ptr<?> reg;
        public Ptr<?> unreg;
        public Ptr<?> update;
        public Ptr<?> validate;
        public Ptr<?> cfi_stubs;
        public Ptr<runtime.module> owner;
        public String name;
        public BtfDefinitions.btf_func_model @Size(value=64) [] func_models;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_dynptr_type")
    public static enum bpf_dynptr_type implements Enum<bpf_dynptr_type>,
    TypedEnum<bpf_dynptr_type, Integer>
    {
        BPF_DYNPTR_TYPE_INVALID,
        BPF_DYNPTR_TYPE_LOCAL,
        BPF_DYNPTR_TYPE_RINGBUF,
        BPF_DYNPTR_TYPE_SKB,
        BPF_DYNPTR_TYPE_XDP;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_reg_state")
    @NotUsableInJava
    public static class bpf_reg_state
    extends Struct {
        public bpf_reg_type type;
        public int off;
        @InlineUnion(value=7198)
        public @InlineUnion(value=7198) int range;
        @InlineUnion(value=7198)
        public  @InlineUnion(value=7198) AnonDefinitions.anon_member_of_anon_member_of_bpf_reg_state anon2$1;
        @InlineUnion(value=7198)
        public  @InlineUnion(value=7198) AnonDefinitions.anon_member_of_anon_member_of_bpf_insn_access_aux_and_anon_member_of_anon_member_of_bpf_reg_state_and_anon_member_of_anon_member_of_btf_var_of_anon_member_of_bpf_insn_aux_data anon2$2;
        @InlineUnion(value=7198)
        public  @InlineUnion(value=7198) AnonDefinitions.anon_member_of_anon_member_of_bpf_reg_state anon2$3;
        @InlineUnion(value=7198)
        public  @InlineUnion(value=7198) misc.dynptr_of_anon_member_of_bpf_reg_state dynptr;
        @InlineUnion(value=7198)
        public  @InlineUnion(value=7198) IterDefinitions.iter_of_anon_member_of_bpf_reg_state iter;
        @InlineUnion(value=7198)
        public  @InlineUnion(value=7198) RawDefinitions.raw_of_anon_member_of_bpf_reg_state raw;
        @InlineUnion(value=7198)
        public @InlineUnion(value=7198) @Unsigned int subprogno;
        public runtime.tnum var_off;
        public long smin_value;
        public long smax_value;
        public @Unsigned long umin_value;
        public @Unsigned long umax_value;
        public int s32_min_value;
        public int s32_max_value;
        public @Unsigned int u32_min_value;
        public @Unsigned int u32_max_value;
        public @Unsigned int id;
        public @Unsigned int ref_obj_id;
        public Ptr<bpf_reg_state> parent;
        public @Unsigned int frameno;
        public int subreg_def;
        public bpf_reg_liveness live;
        public boolean precise;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_verifier_ops")
    @NotUsableInJava
    public static class bpf_verifier_ops
    extends Struct {
        public Ptr<?> get_func_proto;
        public Ptr<?> is_valid_access;
        public Ptr<?> gen_prologue;
        public Ptr<?> gen_epilogue;
        public Ptr<?> gen_ld_abs;
        public Ptr<?> convert_ctx_access;
        public Ptr<?> btf_struct_access;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_verifier_log")
    @NotUsableInJava
    public static class bpf_verifier_log
    extends Struct {
        public @Unsigned long start_pos;
        public @Unsigned long end_pos;
        public String ubuf;
        public @Unsigned int level;
        public @Unsigned int len_total;
        public @Unsigned int len_max;
        public char @Size(value=1024) [] kbuf;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_insn_access_aux")
    @NotUsableInJava
    public static class bpf_insn_access_aux
    extends Struct {
        public bpf_reg_type reg_type;
        public boolean is_ldsx;
        @InlineUnion(value=6954)
        public @InlineUnion(value=6954) int ctx_field_size;
        @InlineUnion(value=6954)
        public  @InlineUnion(value=6954) AnonDefinitions.anon_member_of_anon_member_of_bpf_insn_access_aux_and_anon_member_of_anon_member_of_bpf_reg_state_and_anon_member_of_anon_member_of_btf_var_of_anon_member_of_bpf_insn_aux_data anon2$1;
        public Ptr<bpf_verifier_log> log;
        public boolean is_retval;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_access_type")
    public static enum bpf_access_type implements Enum<bpf_access_type>,
    TypedEnum<bpf_access_type, Integer>
    {
        BPF_READ,
        BPF_WRITE;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_func_proto")
    @NotUsableInJava
    public static class bpf_func_proto
    extends Struct {
        public Ptr<?> func;
        public boolean gpl_only;
        public boolean pkt_access;
        public boolean might_sleep;
        public boolean allow_fastcall;
        public bpf_return_type ret_type;
        @InlineUnion(value=6941)
        public  @InlineUnion(value=6941) AnonDefinitions.anon_member_of_anon_member_of_bpf_func_proto anon6$0;
        @InlineUnion(value=6941)
        public @InlineUnion(value=6941) bpf_arg_type @Size(value=5) [] arg_type;
        @InlineUnion(value=6945)
        public  @InlineUnion(value=6945) AnonDefinitions.anon_member_of_anon_member_of_bpf_func_proto anon7$0;
        @InlineUnion(value=6945)
        public @InlineUnion(value=6945) Ptr<@Unsigned Integer> @Size(value=5) [] arg_btf_id;
        @InlineUnion(value=6945)
        public  @InlineUnion(value=6945) AnonDefinitions.anon_member_of_anon_member_of_bpf_func_proto anon7$2;
        @InlineUnion(value=6945)
        public @InlineUnion(value=6945) @Unsigned long @Size(value=5) [] arg_size;
        public Ptr<Integer> ret_btf_id;
        public Ptr<?> allowed;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_return_type")
    public static enum bpf_return_type implements Enum<bpf_return_type>,
    TypedEnum<bpf_return_type, Integer>
    {
        RET_INTEGER,
        RET_VOID,
        RET_PTR_TO_MAP_VALUE,
        RET_PTR_TO_SOCKET,
        RET_PTR_TO_TCP_SOCK,
        RET_PTR_TO_SOCK_COMMON,
        RET_PTR_TO_MEM,
        RET_PTR_TO_MEM_OR_BTF_ID,
        RET_PTR_TO_BTF_ID,
        __BPF_RET_TYPE_MAX,
        RET_PTR_TO_MAP_VALUE_OR_NULL,
        RET_PTR_TO_SOCKET_OR_NULL,
        RET_PTR_TO_TCP_SOCK_OR_NULL,
        RET_PTR_TO_SOCK_COMMON_OR_NULL,
        RET_PTR_TO_RINGBUF_MEM_OR_NULL,
        RET_PTR_TO_DYNPTR_MEM_OR_NULL,
        RET_PTR_TO_BTF_ID_OR_NULL,
        RET_PTR_TO_BTF_ID_TRUSTED,
        __BPF_RET_TYPE_LIMIT;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_arg_type")
    public static enum bpf_arg_type implements Enum<bpf_arg_type>,
    TypedEnum<bpf_arg_type, Integer>
    {
        ARG_DONTCARE,
        ARG_CONST_MAP_PTR,
        ARG_PTR_TO_MAP_KEY,
        ARG_PTR_TO_MAP_VALUE,
        ARG_PTR_TO_MEM,
        ARG_PTR_TO_ARENA,
        ARG_CONST_SIZE,
        ARG_CONST_SIZE_OR_ZERO,
        ARG_PTR_TO_CTX,
        ARG_ANYTHING,
        ARG_PTR_TO_SPIN_LOCK,
        ARG_PTR_TO_SOCK_COMMON,
        ARG_PTR_TO_SOCKET,
        ARG_PTR_TO_BTF_ID,
        ARG_PTR_TO_RINGBUF_MEM,
        ARG_CONST_ALLOC_SIZE_OR_ZERO,
        ARG_PTR_TO_BTF_ID_SOCK_COMMON,
        ARG_PTR_TO_PERCPU_BTF_ID,
        ARG_PTR_TO_FUNC,
        ARG_PTR_TO_STACK,
        ARG_PTR_TO_CONST_STR,
        ARG_PTR_TO_TIMER,
        ARG_KPTR_XCHG_DEST,
        ARG_PTR_TO_DYNPTR,
        __BPF_ARG_TYPE_MAX,
        ARG_PTR_TO_MAP_VALUE_OR_NULL,
        ARG_PTR_TO_MEM_OR_NULL,
        ARG_PTR_TO_CTX_OR_NULL,
        ARG_PTR_TO_SOCKET_OR_NULL,
        ARG_PTR_TO_STACK_OR_NULL,
        ARG_PTR_TO_BTF_ID_OR_NULL,
        ARG_PTR_TO_UNINIT_MEM,
        ARG_PTR_TO_FIXED_SIZE_MEM,
        __BPF_ARG_TYPE_LIMIT;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_type_flag")
    public static enum bpf_type_flag implements Enum<bpf_type_flag>,
    TypedEnum<bpf_type_flag, Integer>
    {
        PTR_MAYBE_NULL,
        MEM_RDONLY,
        MEM_RINGBUF,
        MEM_USER,
        MEM_PERCPU,
        OBJ_RELEASE,
        PTR_UNTRUSTED,
        MEM_UNINIT,
        DYNPTR_TYPE_LOCAL,
        DYNPTR_TYPE_RINGBUF,
        MEM_FIXED_SIZE,
        MEM_ALLOC,
        PTR_TRUSTED,
        MEM_RCU,
        NON_OWN_REF,
        DYNPTR_TYPE_SKB,
        DYNPTR_TYPE_XDP,
        MEM_ALIGNED,
        MEM_WRITE,
        __BPF_TYPE_FLAG_MAX,
        __BPF_TYPE_LAST_FLAG;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_func_state")
    @NotUsableInJava
    public static class bpf_func_state
    extends Struct {
        public bpf_reg_state @Size(value=11) [] regs;
        public int callsite;
        public @Unsigned int frameno;
        public @Unsigned int subprogno;
        public @Unsigned int async_entry_cnt;
        public bpf_retval_range callback_ret_range;
        public boolean in_callback_fn;
        public boolean in_async_callback_fn;
        public boolean in_exception_callback_fn;
        public @Unsigned int callback_depth;
        public int acquired_refs;
        public Ptr<bpf_reference_state> refs;
        public Ptr<bpf_stack_state> stack;
        public int allocated_stack;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_verifier_env")
    @NotUsableInJava
    public static class bpf_verifier_env
    extends Struct {
        public @Unsigned int insn_idx;
        public @Unsigned int prev_insn_idx;
        public Ptr<bpf_prog> prog;
        public Ptr<bpf_verifier_ops> ops;
        public Ptr<runtime.module> attach_btf_mod;
        public Ptr<bpf_verifier_stack_elem> head;
        public int stack_size;
        public boolean strict_alignment;
        public boolean test_state_freq;
        public boolean test_reg_invariants;
        public Ptr<bpf_verifier_state> cur_state;
        public Ptr<Ptr<bpf_verifier_state_list>> explored_states;
        public Ptr<bpf_verifier_state_list> free_list;
        public Ptr<bpf_map> @Size(value=64) [] used_maps;
        public BtfDefinitions.btf_mod_pair @Size(value=64) [] used_btfs;
        public @Unsigned int used_map_cnt;
        public @Unsigned int used_btf_cnt;
        public @Unsigned int id_gen;
        public @Unsigned int hidden_subprog_cnt;
        public int exception_callback_subprog;
        public boolean explore_alu_limits;
        public boolean allow_ptr_leaks;
        public boolean allow_uninit_stack;
        public boolean bpf_capable;
        public boolean bypass_spec_v1;
        public boolean bypass_spec_v4;
        public boolean seen_direct_write;
        public boolean seen_exception;
        public Ptr<bpf_insn_aux_data> insn_aux_data;
        public Ptr<bpf_line_info> prev_linfo;
        public bpf_verifier_log log;
        public bpf_subprog_info @Size(value=258) [] subprog_info;
        @InlineUnion(value=7233)
        public @InlineUnion(value=7233) bpf_idmap idmap_scratch;
        @InlineUnion(value=7233)
        public @InlineUnion(value=7233) bpf_idset idset_scratch;
        public misc.cfg_of_bpf_verifier_env cfg;
        public misc.backtrack_state bt;
        public Ptr<bpf_jmp_history_entry> cur_hist_ent;
        public @Unsigned int pass_cnt;
        public @Unsigned int subprog_cnt;
        public @Unsigned int prev_insn_processed;
        public @Unsigned int insn_processed;
        public @Unsigned int prev_jmps_processed;
        public @Unsigned int jmps_processed;
        public @Unsigned long verification_time;
        public @Unsigned int max_states_per_insn;
        public @Unsigned int total_states;
        public @Unsigned int peak_states;
        public @Unsigned int longest_mark_read_walk;
        public  @OriginalName(value="bpfptr_t") misc.sockptr_t fd_array;
        public @Unsigned int scratched_regs;
        public @Unsigned long scratched_stack_slots;
        public @Unsigned long prev_log_pos;
        public @Unsigned long prev_insn_print_pos;
        public bpf_reg_state @Size(value=2) [] fake_reg;
        public char @Size(value=320) [] tmp_str_buf;
        public bpf_insn @Size(value=32) [] insn_buf;
        public bpf_insn @Size(value=32) [] epilogue_buf;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_func_id")
    public static enum bpf_func_id implements Enum<bpf_func_id>,
    TypedEnum<bpf_func_id, Integer>
    {
        BPF_FUNC_unspec,
        BPF_FUNC_map_lookup_elem,
        BPF_FUNC_map_update_elem,
        BPF_FUNC_map_delete_elem,
        BPF_FUNC_probe_read,
        BPF_FUNC_ktime_get_ns,
        BPF_FUNC_trace_printk,
        BPF_FUNC_get_prandom_u32,
        BPF_FUNC_get_smp_processor_id,
        BPF_FUNC_skb_store_bytes,
        BPF_FUNC_l3_csum_replace,
        BPF_FUNC_l4_csum_replace,
        BPF_FUNC_tail_call,
        BPF_FUNC_clone_redirect,
        BPF_FUNC_get_current_pid_tgid,
        BPF_FUNC_get_current_uid_gid,
        BPF_FUNC_get_current_comm,
        BPF_FUNC_get_cgroup_classid,
        BPF_FUNC_skb_vlan_push,
        BPF_FUNC_skb_vlan_pop,
        BPF_FUNC_skb_get_tunnel_key,
        BPF_FUNC_skb_set_tunnel_key,
        BPF_FUNC_perf_event_read,
        BPF_FUNC_redirect,
        BPF_FUNC_get_route_realm,
        BPF_FUNC_perf_event_output,
        BPF_FUNC_skb_load_bytes,
        BPF_FUNC_get_stackid,
        BPF_FUNC_csum_diff,
        BPF_FUNC_skb_get_tunnel_opt,
        BPF_FUNC_skb_set_tunnel_opt,
        BPF_FUNC_skb_change_proto,
        BPF_FUNC_skb_change_type,
        BPF_FUNC_skb_under_cgroup,
        BPF_FUNC_get_hash_recalc,
        BPF_FUNC_get_current_task,
        BPF_FUNC_probe_write_user,
        BPF_FUNC_current_task_under_cgroup,
        BPF_FUNC_skb_change_tail,
        BPF_FUNC_skb_pull_data,
        BPF_FUNC_csum_update,
        BPF_FUNC_set_hash_invalid,
        BPF_FUNC_get_numa_node_id,
        BPF_FUNC_skb_change_head,
        BPF_FUNC_xdp_adjust_head,
        BPF_FUNC_probe_read_str,
        BPF_FUNC_get_socket_cookie,
        BPF_FUNC_get_socket_uid,
        BPF_FUNC_set_hash,
        BPF_FUNC_setsockopt,
        BPF_FUNC_skb_adjust_room,
        BPF_FUNC_redirect_map,
        BPF_FUNC_sk_redirect_map,
        BPF_FUNC_sock_map_update,
        BPF_FUNC_xdp_adjust_meta,
        BPF_FUNC_perf_event_read_value,
        BPF_FUNC_perf_prog_read_value,
        BPF_FUNC_getsockopt,
        BPF_FUNC_override_return,
        BPF_FUNC_sock_ops_cb_flags_set,
        BPF_FUNC_msg_redirect_map,
        BPF_FUNC_msg_apply_bytes,
        BPF_FUNC_msg_cork_bytes,
        BPF_FUNC_msg_pull_data,
        BPF_FUNC_bind,
        BPF_FUNC_xdp_adjust_tail,
        BPF_FUNC_skb_get_xfrm_state,
        BPF_FUNC_get_stack,
        BPF_FUNC_skb_load_bytes_relative,
        BPF_FUNC_fib_lookup,
        BPF_FUNC_sock_hash_update,
        BPF_FUNC_msg_redirect_hash,
        BPF_FUNC_sk_redirect_hash,
        BPF_FUNC_lwt_push_encap,
        BPF_FUNC_lwt_seg6_store_bytes,
        BPF_FUNC_lwt_seg6_adjust_srh,
        BPF_FUNC_lwt_seg6_action,
        BPF_FUNC_rc_repeat,
        BPF_FUNC_rc_keydown,
        BPF_FUNC_skb_cgroup_id,
        BPF_FUNC_get_current_cgroup_id,
        BPF_FUNC_get_local_storage,
        BPF_FUNC_sk_select_reuseport,
        BPF_FUNC_skb_ancestor_cgroup_id,
        BPF_FUNC_sk_lookup_tcp,
        BPF_FUNC_sk_lookup_udp,
        BPF_FUNC_sk_release,
        BPF_FUNC_map_push_elem,
        BPF_FUNC_map_pop_elem,
        BPF_FUNC_map_peek_elem,
        BPF_FUNC_msg_push_data,
        BPF_FUNC_msg_pop_data,
        BPF_FUNC_rc_pointer_rel,
        BPF_FUNC_spin_lock,
        BPF_FUNC_spin_unlock,
        BPF_FUNC_sk_fullsock,
        BPF_FUNC_tcp_sock,
        BPF_FUNC_skb_ecn_set_ce,
        BPF_FUNC_get_listener_sock,
        BPF_FUNC_skc_lookup_tcp,
        BPF_FUNC_tcp_check_syncookie,
        BPF_FUNC_sysctl_get_name,
        BPF_FUNC_sysctl_get_current_value,
        BPF_FUNC_sysctl_get_new_value,
        BPF_FUNC_sysctl_set_new_value,
        BPF_FUNC_strtol,
        BPF_FUNC_strtoul,
        BPF_FUNC_sk_storage_get,
        BPF_FUNC_sk_storage_delete,
        BPF_FUNC_send_signal,
        BPF_FUNC_tcp_gen_syncookie,
        BPF_FUNC_skb_output,
        BPF_FUNC_probe_read_user,
        BPF_FUNC_probe_read_kernel,
        BPF_FUNC_probe_read_user_str,
        BPF_FUNC_probe_read_kernel_str,
        BPF_FUNC_tcp_send_ack,
        BPF_FUNC_send_signal_thread,
        BPF_FUNC_jiffies64,
        BPF_FUNC_read_branch_records,
        BPF_FUNC_get_ns_current_pid_tgid,
        BPF_FUNC_xdp_output,
        BPF_FUNC_get_netns_cookie,
        BPF_FUNC_get_current_ancestor_cgroup_id,
        BPF_FUNC_sk_assign,
        BPF_FUNC_ktime_get_boot_ns,
        BPF_FUNC_seq_printf,
        BPF_FUNC_seq_write,
        BPF_FUNC_sk_cgroup_id,
        BPF_FUNC_sk_ancestor_cgroup_id,
        BPF_FUNC_ringbuf_output,
        BPF_FUNC_ringbuf_reserve,
        BPF_FUNC_ringbuf_submit,
        BPF_FUNC_ringbuf_discard,
        BPF_FUNC_ringbuf_query,
        BPF_FUNC_csum_level,
        BPF_FUNC_skc_to_tcp6_sock,
        BPF_FUNC_skc_to_tcp_sock,
        BPF_FUNC_skc_to_tcp_timewait_sock,
        BPF_FUNC_skc_to_tcp_request_sock,
        BPF_FUNC_skc_to_udp6_sock,
        BPF_FUNC_get_task_stack,
        BPF_FUNC_load_hdr_opt,
        BPF_FUNC_store_hdr_opt,
        BPF_FUNC_reserve_hdr_opt,
        BPF_FUNC_inode_storage_get,
        BPF_FUNC_inode_storage_delete,
        BPF_FUNC_d_path,
        BPF_FUNC_copy_from_user,
        BPF_FUNC_snprintf_btf,
        BPF_FUNC_seq_printf_btf,
        BPF_FUNC_skb_cgroup_classid,
        BPF_FUNC_redirect_neigh,
        BPF_FUNC_per_cpu_ptr,
        BPF_FUNC_this_cpu_ptr,
        BPF_FUNC_redirect_peer,
        BPF_FUNC_task_storage_get,
        BPF_FUNC_task_storage_delete,
        BPF_FUNC_get_current_task_btf,
        BPF_FUNC_bprm_opts_set,
        BPF_FUNC_ktime_get_coarse_ns,
        BPF_FUNC_ima_inode_hash,
        BPF_FUNC_sock_from_file,
        BPF_FUNC_check_mtu,
        BPF_FUNC_for_each_map_elem,
        BPF_FUNC_snprintf,
        BPF_FUNC_sys_bpf,
        BPF_FUNC_btf_find_by_name_kind,
        BPF_FUNC_sys_close,
        BPF_FUNC_timer_init,
        BPF_FUNC_timer_set_callback,
        BPF_FUNC_timer_start,
        BPF_FUNC_timer_cancel,
        BPF_FUNC_get_func_ip,
        BPF_FUNC_get_attach_cookie,
        BPF_FUNC_task_pt_regs,
        BPF_FUNC_get_branch_snapshot,
        BPF_FUNC_trace_vprintk,
        BPF_FUNC_skc_to_unix_sock,
        BPF_FUNC_kallsyms_lookup_name,
        BPF_FUNC_find_vma,
        BPF_FUNC_loop,
        BPF_FUNC_strncmp,
        BPF_FUNC_get_func_arg,
        BPF_FUNC_get_func_ret,
        BPF_FUNC_get_func_arg_cnt,
        BPF_FUNC_get_retval,
        BPF_FUNC_set_retval,
        BPF_FUNC_xdp_get_buff_len,
        BPF_FUNC_xdp_load_bytes,
        BPF_FUNC_xdp_store_bytes,
        BPF_FUNC_copy_from_user_task,
        BPF_FUNC_skb_set_tstamp,
        BPF_FUNC_ima_file_hash,
        BPF_FUNC_kptr_xchg,
        BPF_FUNC_map_lookup_percpu_elem,
        BPF_FUNC_skc_to_mptcp_sock,
        BPF_FUNC_dynptr_from_mem,
        BPF_FUNC_ringbuf_reserve_dynptr,
        BPF_FUNC_ringbuf_submit_dynptr,
        BPF_FUNC_ringbuf_discard_dynptr,
        BPF_FUNC_dynptr_read,
        BPF_FUNC_dynptr_write,
        BPF_FUNC_dynptr_data,
        BPF_FUNC_tcp_raw_gen_syncookie_ipv4,
        BPF_FUNC_tcp_raw_gen_syncookie_ipv6,
        BPF_FUNC_tcp_raw_check_syncookie_ipv4,
        BPF_FUNC_tcp_raw_check_syncookie_ipv6,
        BPF_FUNC_ktime_get_tai_ns,
        BPF_FUNC_user_ringbuf_drain,
        BPF_FUNC_cgrp_storage_get,
        BPF_FUNC_cgrp_storage_delete,
        __BPF_FUNC_MAX_ID;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_redirect_info")
    @NotUsableInJava
    public static class bpf_redirect_info
    extends Struct {
        public @Unsigned long tgt_index;
        public Ptr<?> tgt_value;
        public Ptr<bpf_map> map;
        public @Unsigned int flags;
        public @Unsigned int map_id;
        public bpf_map_type map_type;
        public bpf_nh_params nh;
        public @Unsigned int kern_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_nh_params")
    @NotUsableInJava
    public static class bpf_nh_params
    extends Struct {
        public @Unsigned int nh_family;
        @InlineUnion(value=6208)
        public @InlineUnion(value=6208) @Unsigned int ipv4_nh;
        @InlineUnion(value=6208)
        public  @InlineUnion(value=6208) In6Definitions.in6_addr ipv6_nh;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_binary_header")
    @NotUsableInJava
    public static class bpf_binary_header
    extends Struct {
        public @Unsigned int size;
        public char @Size(value=0) [] image;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_xdp_entity")
    @NotUsableInJava
    public static class bpf_xdp_entity
    extends Struct {
        public Ptr<bpf_prog> prog;
        public Ptr<bpf_xdp_link> link;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_netdev_command")
    public static enum bpf_netdev_command implements Enum<bpf_netdev_command>,
    TypedEnum<bpf_netdev_command, Integer>
    {
        XDP_SETUP_PROG,
        XDP_SETUP_PROG_HW,
        BPF_OFFLOAD_MAP_ALLOC,
        BPF_OFFLOAD_MAP_FREE,
        XDP_SETUP_XSK_POOL;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_text_poke_type")
    public static enum bpf_text_poke_type implements Enum<bpf_text_poke_type>,
    TypedEnum<bpf_text_poke_type, Integer>
    {
        BPF_MOD_CALL,
        BPF_MOD_JUMP;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_array")
    @NotUsableInJava
    public static class bpf_array
    extends Struct {
        public bpf_map map;
        public @Unsigned int elem_size;
        public @Unsigned int index_mask;
        public Ptr<bpf_array_aux> aux;
        @InlineUnion(value=5649)
        public  @InlineUnion(value=5649) AnonDefinitions.anon_member_of_anon_member_of_bpf_array anon4$0;
        @InlineUnion(value=5649)
        public  @InlineUnion(value=5649) AnonDefinitions.anon_member_of_anon_member_of_bpf_array anon4$1;
        @InlineUnion(value=5649)
        public  @InlineUnion(value=5649) AnonDefinitions.anon_member_of_anon_member_of_bpf_array anon4$2;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_array_aux")
    @NotUsableInJava
    public static class bpf_array_aux
    extends Struct {
        public ListDefinitions.list_head poke_progs;
        public Ptr<bpf_map> map;
        public runtime.mutex poke_mutex;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_stats")
    @NotUsableInJava
    public static class bpf_prog_stats
    extends Struct {
        public misc.u64_stats_t cnt;
        public misc.u64_stats_t nsecs;
        public misc.u64_stats_t misses;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_jit_poke_reason")
    public static enum bpf_jit_poke_reason implements Enum<bpf_jit_poke_reason>,
    TypedEnum<bpf_jit_poke_reason, Integer>
    {
        BPF_POKE_REASON_TAIL_CALL;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_tramp_prog_type")
    public static enum bpf_tramp_prog_type implements Enum<bpf_tramp_prog_type>,
    TypedEnum<bpf_tramp_prog_type, Integer>
    {
        BPF_TRAMP_FENTRY,
        BPF_TRAMP_FEXIT,
        BPF_TRAMP_MODIFY_RETURN,
        BPF_TRAMP_MAX,
        BPF_TRAMP_REPLACE;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tramp_run_ctx")
    @NotUsableInJava
    public static class bpf_tramp_run_ctx
    extends Struct {
        public bpf_run_ctx run_ctx;
        public @Unsigned long bpf_cookie;
        public Ptr<bpf_run_ctx> saved_run_ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tramp_link")
    @NotUsableInJava
    public static class bpf_tramp_link
    extends Struct {
        public bpf_link link;
        public misc.hlist_node tramp_hlist;
        public @Unsigned long cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tramp_links")
    @NotUsableInJava
    public static class bpf_tramp_links
    extends Struct {
        public Ptr<bpf_tramp_link> @Size(value=38) [] links;
        public int nr_links;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_offloaded_map")
    @NotUsableInJava
    public static class bpf_offloaded_map
    extends Struct {
        public bpf_map map;
        public Ptr<NetDefinitions.net_device> netdev;
        public Ptr<bpf_map_dev_ops> dev_ops;
        public Ptr<?> dev_priv;
        public ListDefinitions.list_head offloads;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_map_dev_ops")
    @NotUsableInJava
    public static class bpf_map_dev_ops
    extends Struct {
        public Ptr<?> map_get_next_key;
        public Ptr<?> map_lookup_elem;
        public Ptr<?> map_update_elem;
        public Ptr<?> map_delete_elem;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_addr_space_cast")
    public static enum bpf_addr_space_cast implements Enum<bpf_addr_space_cast>,
    TypedEnum<bpf_addr_space_cast, Integer>
    {
        BPF_ADDR_SPACE_CAST;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_net_context")
    @NotUsableInJava
    public static class bpf_net_context
    extends Struct {
        public bpf_redirect_info ri;
        public ListDefinitions.list_head cpu_map_flush_list;
        public ListDefinitions.list_head dev_map_flush_list;
        public ListDefinitions.list_head xskmap_map_flush_list;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_raw_tp_link")
    @NotUsableInJava
    public static class bpf_raw_tp_link
    extends Struct {
        public bpf_link link;
        public Ptr<bpf_raw_event_map> btp;
        public @Unsigned long cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_link_ops")
    @NotUsableInJava
    public static class bpf_link_ops
    extends Struct {
        public Ptr<?> release;
        public Ptr<?> dealloc;
        public Ptr<?> dealloc_deferred;
        public Ptr<?> detach;
        public Ptr<?> update_prog;
        public Ptr<?> show_fdinfo;
        public Ptr<?> fill_link_info;
        public Ptr<?> update_map;
        public Ptr<?> poll;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_link")
    @NotUsableInJava
    public static class bpf_link
    extends Struct {
        public misc.atomic64_t refcnt;
        public @Unsigned int id;
        public bpf_link_type type;
        public Ptr<bpf_link_ops> ops;
        public Ptr<bpf_prog> prog;
        @InlineUnion(value=1993)
        public  @InlineUnion(value=1993) misc.callback_head rcu;
        @InlineUnion(value=1993)
        public  @InlineUnion(value=1993) misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_link_info")
    @NotUsableInJava
    public static class bpf_link_info
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int id;
        public @Unsigned int prog_id;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) RawDefinitions.raw_tracepoint_of_anon_member_of_bpf_link_info raw_tracepoint;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) TracingDefinitions.tracing_of_anon_member_of_bpf_link_info tracing;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) CgroupDefinitions.cgroup_of_anon_member_of_bpf_link_info cgroup;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) IterDefinitions.iter_of_anon_member_of_bpf_link_info iter;
        @InlineUnion(value=3394)
        public @InlineUnion(value=3394) NetnsDefinitions.netns_of_anon_member_of_bpf_link_info netns;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) XdpDefinitions.xdp_of_anon_member_of_bpf_link_info xdp;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) MapDefinitions.map_of_anon_member_of_iter_of_anon_member_of_bpf_link_info_and_struct_ops_of_anon_member_of_bpf_link_info struct_ops;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) misc.netfilter_of_anon_member_of_bpf_link_info_and_netfilter_of_anon_member_of_link_create_of_bpf_attr netfilter;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) KprobeDefinitions.kprobe_multi_of_anon_member_of_bpf_link_info kprobe_multi;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) UprobeDefinitions.uprobe_multi_of_anon_member_of_bpf_link_info uprobe_multi;
        @InlineUnion(value=3394)
        public @InlineUnion(value=3394) PerfDefinitions.perf_event_of_anon_member_of_bpf_link_info perf_event;
        @InlineUnion(value=3394)
        public @InlineUnion(value=3394) NetkitDefinitions.netkit_of_anon_member_of_bpf_link_info_and_tcx_of_anon_member_of_bpf_link_info tcx;
        @InlineUnion(value=3394)
        public @InlineUnion(value=3394) NetkitDefinitions.netkit_of_anon_member_of_bpf_link_info_and_tcx_of_anon_member_of_bpf_link_info netkit;
        @InlineUnion(value=3394)
        public  @InlineUnion(value=3394) misc.sockmap_of_anon_member_of_bpf_link_info sockmap;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_link_type")
    public static enum bpf_link_type implements Enum<bpf_link_type>,
    TypedEnum<bpf_link_type, Integer>
    {
        BPF_LINK_TYPE_UNSPEC,
        BPF_LINK_TYPE_RAW_TRACEPOINT,
        BPF_LINK_TYPE_TRACING,
        BPF_LINK_TYPE_CGROUP,
        BPF_LINK_TYPE_ITER,
        BPF_LINK_TYPE_NETNS,
        BPF_LINK_TYPE_XDP,
        BPF_LINK_TYPE_PERF_EVENT,
        BPF_LINK_TYPE_KPROBE_MULTI,
        BPF_LINK_TYPE_STRUCT_OPS,
        BPF_LINK_TYPE_NETFILTER,
        BPF_LINK_TYPE_TCX,
        BPF_LINK_TYPE_UPROBE_MULTI,
        BPF_LINK_TYPE_NETKIT,
        BPF_LINK_TYPE_SOCKMAP,
        __MAX_BPF_LINK_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_iter_task_type")
    public static enum bpf_iter_task_type implements Enum<bpf_iter_task_type>,
    TypedEnum<bpf_iter_task_type, Integer>
    {
        BPF_TASK_ITER_ALL,
        BPF_TASK_ITER_TID,
        BPF_TASK_ITER_TGID;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_array_item")
    @NotUsableInJava
    public static class bpf_prog_array_item
    extends Struct {
        public Ptr<bpf_prog> prog;
        @InlineUnion(value=2034)
        public @InlineUnion(value=2034) Ptr<bpf_cgroup_storage> @Size(value=2) [] cgroup_storage;
        @InlineUnion(value=2034)
        public @InlineUnion(value=2034) @Unsigned long bpf_cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_token")
    @NotUsableInJava
    public static class bpf_token
    extends Struct {
        public misc.work_struct work;
        public misc.atomic64_t refcnt;
        public Ptr<UserDefinitions.user_namespace> userns;
        public @Unsigned long allowed_cmds;
        public @Unsigned long allowed_maps;
        public @Unsigned long allowed_progs;
        public @Unsigned long allowed_attachs;
        public Ptr<?> security;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_ctx_arg_aux")
    @NotUsableInJava
    public static class bpf_ctx_arg_aux
    extends Struct {
        public @Unsigned int offset;
        public bpf_reg_type reg_type;
        public Ptr<runtime.btf> btf;
        public @Unsigned int btf_id;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_jit_poke_descriptor")
    @NotUsableInJava
    public static class bpf_jit_poke_descriptor
    extends Struct {
        public Ptr<?> tailcall_target;
        public Ptr<?> tailcall_bypass;
        public Ptr<?> bypass_addr;
        public Ptr<?> aux;
        @InlineUnion(value=2002)
        public  @InlineUnion(value=2002) misc.tail_call_of_anon_member_of_bpf_jit_poke_descriptor tail_call;
        public boolean tailcall_target_stable;
        public char adj_off;
        public @Unsigned short reason;
        public @Unsigned int insn_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_func_info_aux")
    @NotUsableInJava
    public static class bpf_func_info_aux
    extends Struct {
        public @Unsigned short linkage;
        public boolean unreliable;
        public boolean called;
        public boolean verified;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_trampoline")
    @NotUsableInJava
    public static class bpf_trampoline
    extends Struct {
        public misc.hlist_node hlist;
        public Ptr<FtraceDefinitions.ftrace_ops> fops;
        public runtime.mutex mutex;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned int flags;
        public @Unsigned long key;
        public misc.func_of_bpf_trampoline func;
        public Ptr<bpf_prog> extension_prog;
        public misc.hlist_head @Size(value=3) [] progs_hlist;
        public int @Size(value=3) [] progs_cnt;
        public Ptr<bpf_tramp_image> cur_image;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_tramp_image")
    @NotUsableInJava
    public static class bpf_tramp_image
    extends Struct {
        public Ptr<?> image;
        public int size;
        public bpf_ksym ksym;
        public PercpuDefinitions.percpu_ref pcref;
        public Ptr<?> ip_after_call;
        public Ptr<?> ip_epilogue;
        @InlineUnion(value=1993)
        public  @InlineUnion(value=1993) misc.callback_head rcu;
        @InlineUnion(value=1993)
        public  @InlineUnion(value=1993) misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_ksym")
    @NotUsableInJava
    public static class bpf_ksym
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public char @Size(value=512) [] name;
        public ListDefinitions.list_head lnode;
        public misc.latch_tree_node tnode;
        public boolean prog;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_offload")
    @NotUsableInJava
    public static class bpf_prog_offload
    extends Struct {
        public Ptr<bpf_prog> prog;
        public Ptr<NetDefinitions.net_device> netdev;
        public Ptr<bpf_offload_dev> offdev;
        public Ptr<?> dev_priv;
        public ListDefinitions.list_head offloads;
        public boolean dev_state;
        public boolean opt_failed;
        public Ptr<?> jited_image;
        public @Unsigned int jited_len;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_ops")
    @NotUsableInJava
    public static class bpf_prog_ops
    extends Struct {
        public Ptr<?> test_run;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_reg_type")
    public static enum bpf_reg_type implements Enum<bpf_reg_type>,
    TypedEnum<bpf_reg_type, Integer>
    {
        NOT_INIT,
        SCALAR_VALUE,
        PTR_TO_CTX,
        CONST_PTR_TO_MAP,
        PTR_TO_MAP_VALUE,
        PTR_TO_MAP_KEY,
        PTR_TO_STACK,
        PTR_TO_PACKET_META,
        PTR_TO_PACKET,
        PTR_TO_PACKET_END,
        PTR_TO_FLOW_KEYS,
        PTR_TO_SOCKET,
        PTR_TO_SOCK_COMMON,
        PTR_TO_TCP_SOCK,
        PTR_TO_TP_BUFFER,
        PTR_TO_XDP_SOCK,
        PTR_TO_BTF_ID,
        PTR_TO_MEM,
        PTR_TO_ARENA,
        PTR_TO_BUF,
        PTR_TO_FUNC,
        CONST_PTR_TO_DYNPTR,
        __BPF_REG_TYPE_MAX,
        PTR_TO_MAP_VALUE_OR_NULL,
        PTR_TO_SOCKET_OR_NULL,
        PTR_TO_SOCK_COMMON_OR_NULL,
        PTR_TO_TCP_SOCK_OR_NULL,
        PTR_TO_BTF_ID_OR_NULL,
        __BPF_REG_TYPE_LIMIT;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_aux")
    @NotUsableInJava
    public static class bpf_prog_aux
    extends Struct {
        public misc.atomic64_t refcnt;
        public @Unsigned int used_map_cnt;
        public @Unsigned int used_btf_cnt;
        public @Unsigned int max_ctx_offset;
        public @Unsigned int max_pkt_offset;
        public @Unsigned int max_tp_access;
        public @Unsigned int stack_depth;
        public @Unsigned int id;
        public @Unsigned int func_cnt;
        public @Unsigned int real_func_cnt;
        public @Unsigned int func_idx;
        public @Unsigned int attach_btf_id;
        public @Unsigned int ctx_arg_info_size;
        public @Unsigned int max_rdonly_access;
        public @Unsigned int max_rdwr_access;
        public Ptr<runtime.btf> attach_btf;
        public Ptr<bpf_ctx_arg_aux> ctx_arg_info;
        public runtime.mutex dst_mutex;
        public Ptr<bpf_prog> dst_prog;
        public Ptr<bpf_trampoline> dst_trampoline;
        public bpf_prog_type saved_dst_prog_type;
        public bpf_attach_type saved_dst_attach_type;
        public boolean verifier_zext;
        public boolean dev_bound;
        public boolean offload_requested;
        public boolean attach_btf_trace;
        public boolean attach_tracing_prog;
        public boolean func_proto_unreliable;
        public boolean tail_call_reachable;
        public boolean xdp_has_frags;
        public boolean exception_cb;
        public boolean exception_boundary;
        public Ptr<bpf_arena> arena;
        public Ptr<BtfDefinitions.btf_type> attach_func_proto;
        public String attach_func_name;
        public Ptr<Ptr<bpf_prog>> func;
        public Ptr<?> jit_data;
        public Ptr<bpf_jit_poke_descriptor> poke_tab;
        public Ptr<bpf_kfunc_desc_tab> kfunc_tab;
        public Ptr<bpf_kfunc_btf_tab> kfunc_btf_tab;
        public @Unsigned int size_poke_tab;
        public bpf_ksym ksym;
        public Ptr<bpf_prog_ops> ops;
        public Ptr<Ptr<bpf_map>> used_maps;
        public runtime.mutex used_maps_mutex;
        public Ptr<BtfDefinitions.btf_mod_pair> used_btfs;
        public Ptr<bpf_prog> prog;
        public Ptr<UserDefinitions.user_struct> user;
        public @Unsigned long load_time;
        public @Unsigned int verified_insns;
        public int cgroup_atype;
        public Ptr<bpf_map> @Size(value=2) [] cgroup_storage;
        public char @Size(value=16) [] name;
        public Ptr<?> bpf_exception_cb;
        public Ptr<?> security;
        public Ptr<bpf_token> token;
        public Ptr<bpf_prog_offload> offload;
        public Ptr<runtime.btf> btf;
        public Ptr<bpf_func_info> func_info;
        public Ptr<bpf_func_info_aux> func_info_aux;
        public Ptr<bpf_line_info> linfo;
        public Ptr<Ptr<?>> jited_linfo;
        public @Unsigned int func_info_cnt;
        public @Unsigned int nr_linfo;
        public @Unsigned int linfo_idx;
        public Ptr<runtime.module> mod;
        public @Unsigned int num_exentries;
        public Ptr<misc.exception_table_entry> extable;
        @InlineUnion(value=1977)
        public  @InlineUnion(value=1977) misc.work_struct work;
        @InlineUnion(value=1977)
        public  @InlineUnion(value=1977) misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_map")
    @NotUsableInJava
    public static class bpf_map
    extends Struct {
        public Ptr<bpf_map_ops> ops;
        public Ptr<bpf_map> inner_map_meta;
        public Ptr<?> security;
        public bpf_map_type map_type;
        public @Unsigned int key_size;
        public @Unsigned int value_size;
        public @Unsigned int max_entries;
        public @Unsigned long map_extra;
        public @Unsigned int map_flags;
        public @Unsigned int id;
        public Ptr<BtfDefinitions.btf_record> record;
        public int numa_node;
        public @Unsigned int btf_key_type_id;
        public @Unsigned int btf_value_type_id;
        public @Unsigned int btf_vmlinux_value_type_id;
        public Ptr<runtime.btf> btf;
        public Ptr<ObjDefinitions.obj_cgroup> objcg;
        public char @Size(value=16) [] name;
        public runtime.mutex freeze_mutex;
        public misc.atomic64_t refcnt;
        public misc.atomic64_t usercnt;
        @InlineUnion(value=1977)
        public  @InlineUnion(value=1977) misc.work_struct work;
        @InlineUnion(value=1977)
        public  @InlineUnion(value=1977) misc.callback_head rcu;
        public misc.atomic64_t writecnt;
        public misc.owner_of_bpf_map owner;
        public boolean bypass_spec_v1;
        public boolean frozen;
        public boolean free_after_mult_rcu_gp;
        public boolean free_after_rcu_gp;
        public misc.atomic64_t sleepable_refcnt;
        public Ptr<Long> elem_count;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_map_ops")
    @NotUsableInJava
    public static class bpf_map_ops
    extends Struct {
        public Ptr<?> map_alloc_check;
        public Ptr<?> map_alloc;
        public Ptr<?> map_release;
        public Ptr<?> map_free;
        public Ptr<?> map_get_next_key;
        public Ptr<?> map_release_uref;
        public Ptr<?> map_lookup_elem_sys_only;
        public Ptr<?> map_lookup_batch;
        public Ptr<?> map_lookup_and_delete_elem;
        public Ptr<?> map_lookup_and_delete_batch;
        public Ptr<?> map_update_batch;
        public Ptr<?> map_delete_batch;
        public Ptr<?> map_lookup_elem;
        public Ptr<?> map_update_elem;
        public Ptr<?> map_delete_elem;
        public Ptr<?> map_push_elem;
        public Ptr<?> map_pop_elem;
        public Ptr<?> map_peek_elem;
        public Ptr<?> map_lookup_percpu_elem;
        public Ptr<?> map_fd_get_ptr;
        public Ptr<?> map_fd_put_ptr;
        public Ptr<?> map_gen_lookup;
        public Ptr<?> map_fd_sys_lookup_elem;
        public Ptr<?> map_seq_show_elem;
        public Ptr<?> map_check_btf;
        public Ptr<?> map_poke_track;
        public Ptr<?> map_poke_untrack;
        public Ptr<?> map_poke_run;
        public Ptr<?> map_direct_value_addr;
        public Ptr<?> map_direct_value_meta;
        public Ptr<?> map_mmap;
        public Ptr<?> map_poll;
        public Ptr<?> map_get_unmapped_area;
        public Ptr<?> map_local_storage_charge;
        public Ptr<?> map_local_storage_uncharge;
        public Ptr<?> map_owner_storage_ptr;
        public Ptr<?> map_redirect;
        public Ptr<?> map_meta_equal;
        public Ptr<?> map_set_for_each_callback_args;
        public Ptr<?> map_for_each_callback;
        public Ptr<?> map_mem_usage;
        public Ptr<Integer> map_btf_id;
        public Ptr<bpf_iter_seq_info> iter_seq_info;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_seq_info")
    @NotUsableInJava
    public static class bpf_iter_seq_info
    extends Struct {
        public Ptr<SeqDefinitions.seq_operations> seq_ops;
        public @OriginalName(value="bpf_iter_init_seq_priv_t") Ptr<?> init_seq_private;
        public @OriginalName(value="bpf_iter_fini_seq_priv_t") Ptr<?> fini_seq_private;
        public @Unsigned int seq_priv_size;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_iter_aux_info")
    @NotUsableInJava
    public static class bpf_iter_aux_info
    extends Struct {
        public Ptr<bpf_map> map;
        public CgroupDefinitions.cgroup_of_bpf_iter_aux_info cgroup;
        public TaskDefinitions.task_of_bpf_iter_aux_info task;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog")
    @NotUsableInJava
    public static class bpf_prog
    extends Struct {
        public @Unsigned short pages;
        public @Unsigned short jited;
        public @Unsigned short jit_requested;
        public @Unsigned short gpl_compatible;
        public @Unsigned short cb_access;
        public @Unsigned short dst_needed;
        public @Unsigned short blinding_requested;
        public @Unsigned short blinded;
        public @Unsigned short is_func;
        public @Unsigned short kprobe_override;
        public @Unsigned short has_callchain_buf;
        public @Unsigned short enforce_expected_attach_type;
        public @Unsigned short call_get_stack;
        public @Unsigned short call_get_func_ip;
        public @Unsigned short tstamp_type_access;
        public @Unsigned short sleepable;
        public bpf_prog_type type;
        public bpf_attach_type expected_attach_type;
        public @Unsigned int len;
        public @Unsigned int jited_len;
        public char @Size(value=8) [] tag;
        public Ptr<bpf_prog_stats> stats;
        public Ptr<Integer> active;
        public Ptr<?> bpf_func;
        public Ptr<bpf_prog_aux> aux;
        public Ptr<SockDefinitions.sock_fprog_kern> orig_prog;
        @InlineUnion(value=2028)
        public  @InlineUnion(value=2028) AnonDefinitions.anon_member_of_anon_member_of_bpf_prog anon26$0;
        @InlineUnion(value=2028)
        public  @InlineUnion(value=2028) AnonDefinitions.anon_member_of_anon_member_of_bpf_prog anon26$1;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_line_info")
    @NotUsableInJava
    public static class bpf_line_info
    extends Struct {
        public @Unsigned int insn_off;
        public @Unsigned int file_name_off;
        public @Unsigned int line_off;
        public @Unsigned int line_col;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_func_info")
    @NotUsableInJava
    public static class bpf_func_info
    extends Struct {
        public @Unsigned int insn_off;
        public @Unsigned int type_id;
    }

    @Type(noCCodeGeneration=true, cType="union bpf_attr")
    @NotUsableInJava
    public static class bpf_attr
    extends Union {
        public AnonDefinitions.anon_member_of_bpf_attr anon0;
        public AnonDefinitions.anon_member_of_bpf_attr anon1;
        public misc.batch_of_bpf_attr batch;
        public AnonDefinitions.anon_member_of_bpf_attr anon3;
        public AnonDefinitions.anon_member_of_bpf_attr anon4;
        public AnonDefinitions.anon_member_of_bpf_attr anon5;
        public TestDefinitions.test_of_bpf_attr test;
        public AnonDefinitions.anon_member_of_bpf_attr anon7;
        public misc.info_of_bpf_attr info;
        public misc.query_of_bpf_attr query;
        public RawDefinitions.raw_tracepoint_of_bpf_attr raw_tracepoint;
        public AnonDefinitions.anon_member_of_bpf_attr anon11;
        public TaskDefinitions.task_fd_query_of_bpf_attr task_fd_query;
        public LinkDefinitions.link_create_of_bpf_attr link_create;
        public LinkDefinitions.link_update_of_bpf_attr link_update;
        public LinkDefinitions.link_detach_of_bpf_attr link_detach;
        public EnableDefinitions.enable_stats_of_bpf_attr enable_stats;
        public IterDefinitions.iter_create_of_bpf_attr iter_create;
        public ProgDefinitions.prog_bind_map_of_bpf_attr prog_bind_map;
        public misc.token_create_of_bpf_attr token_create;
    }

    @Type(noCCodeGeneration=true, cType="enum bpf_attach_type")
    public static enum bpf_attach_type implements Enum<bpf_attach_type>,
    TypedEnum<bpf_attach_type, Integer>
    {
        BPF_CGROUP_INET_INGRESS,
        BPF_CGROUP_INET_EGRESS,
        BPF_CGROUP_INET_SOCK_CREATE,
        BPF_CGROUP_SOCK_OPS,
        BPF_SK_SKB_STREAM_PARSER,
        BPF_SK_SKB_STREAM_VERDICT,
        BPF_CGROUP_DEVICE,
        BPF_SK_MSG_VERDICT,
        BPF_CGROUP_INET4_BIND,
        BPF_CGROUP_INET6_BIND,
        BPF_CGROUP_INET4_CONNECT,
        BPF_CGROUP_INET6_CONNECT,
        BPF_CGROUP_INET4_POST_BIND,
        BPF_CGROUP_INET6_POST_BIND,
        BPF_CGROUP_UDP4_SENDMSG,
        BPF_CGROUP_UDP6_SENDMSG,
        BPF_LIRC_MODE2,
        BPF_FLOW_DISSECTOR,
        BPF_CGROUP_SYSCTL,
        BPF_CGROUP_UDP4_RECVMSG,
        BPF_CGROUP_UDP6_RECVMSG,
        BPF_CGROUP_GETSOCKOPT,
        BPF_CGROUP_SETSOCKOPT,
        BPF_TRACE_RAW_TP,
        BPF_TRACE_FENTRY,
        BPF_TRACE_FEXIT,
        BPF_MODIFY_RETURN,
        BPF_LSM_MAC,
        BPF_TRACE_ITER,
        BPF_CGROUP_INET4_GETPEERNAME,
        BPF_CGROUP_INET6_GETPEERNAME,
        BPF_CGROUP_INET4_GETSOCKNAME,
        BPF_CGROUP_INET6_GETSOCKNAME,
        BPF_XDP_DEVMAP,
        BPF_CGROUP_INET_SOCK_RELEASE,
        BPF_XDP_CPUMAP,
        BPF_SK_LOOKUP,
        BPF_XDP,
        BPF_SK_SKB_VERDICT,
        BPF_SK_REUSEPORT_SELECT,
        BPF_SK_REUSEPORT_SELECT_OR_MIGRATE,
        BPF_PERF_EVENT,
        BPF_TRACE_KPROBE_MULTI,
        BPF_LSM_CGROUP,
        BPF_STRUCT_OPS,
        BPF_NETFILTER,
        BPF_TCX_INGRESS,
        BPF_TCX_EGRESS,
        BPF_TRACE_UPROBE_MULTI,
        BPF_CGROUP_UNIX_CONNECT,
        BPF_CGROUP_UNIX_SENDMSG,
        BPF_CGROUP_UNIX_RECVMSG,
        BPF_CGROUP_UNIX_GETPEERNAME,
        BPF_CGROUP_UNIX_GETSOCKNAME,
        BPF_NETKIT_PRIMARY,
        BPF_NETKIT_PEER,
        BPF_TRACE_KPROBE_SESSION,
        __MAX_BPF_ATTACH_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_prog_type")
    public static enum bpf_prog_type implements Enum<bpf_prog_type>,
    TypedEnum<bpf_prog_type, Integer>
    {
        BPF_PROG_TYPE_UNSPEC,
        BPF_PROG_TYPE_SOCKET_FILTER,
        BPF_PROG_TYPE_KPROBE,
        BPF_PROG_TYPE_SCHED_CLS,
        BPF_PROG_TYPE_SCHED_ACT,
        BPF_PROG_TYPE_TRACEPOINT,
        BPF_PROG_TYPE_XDP,
        BPF_PROG_TYPE_PERF_EVENT,
        BPF_PROG_TYPE_CGROUP_SKB,
        BPF_PROG_TYPE_CGROUP_SOCK,
        BPF_PROG_TYPE_LWT_IN,
        BPF_PROG_TYPE_LWT_OUT,
        BPF_PROG_TYPE_LWT_XMIT,
        BPF_PROG_TYPE_SOCK_OPS,
        BPF_PROG_TYPE_SK_SKB,
        BPF_PROG_TYPE_CGROUP_DEVICE,
        BPF_PROG_TYPE_SK_MSG,
        BPF_PROG_TYPE_RAW_TRACEPOINT,
        BPF_PROG_TYPE_CGROUP_SOCK_ADDR,
        BPF_PROG_TYPE_LWT_SEG6LOCAL,
        BPF_PROG_TYPE_LIRC_MODE2,
        BPF_PROG_TYPE_SK_REUSEPORT,
        BPF_PROG_TYPE_FLOW_DISSECTOR,
        BPF_PROG_TYPE_CGROUP_SYSCTL,
        BPF_PROG_TYPE_RAW_TRACEPOINT_WRITABLE,
        BPF_PROG_TYPE_CGROUP_SOCKOPT,
        BPF_PROG_TYPE_TRACING,
        BPF_PROG_TYPE_STRUCT_OPS,
        BPF_PROG_TYPE_EXT,
        BPF_PROG_TYPE_LSM,
        BPF_PROG_TYPE_SK_LOOKUP,
        BPF_PROG_TYPE_SYSCALL,
        BPF_PROG_TYPE_NETFILTER,
        __MAX_BPF_PROG_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_map_type")
    public static enum bpf_map_type implements Enum<bpf_map_type>,
    TypedEnum<bpf_map_type, Integer>
    {
        BPF_MAP_TYPE_UNSPEC,
        BPF_MAP_TYPE_HASH,
        BPF_MAP_TYPE_ARRAY,
        BPF_MAP_TYPE_PROG_ARRAY,
        BPF_MAP_TYPE_PERF_EVENT_ARRAY,
        BPF_MAP_TYPE_PERCPU_HASH,
        BPF_MAP_TYPE_PERCPU_ARRAY,
        BPF_MAP_TYPE_STACK_TRACE,
        BPF_MAP_TYPE_CGROUP_ARRAY,
        BPF_MAP_TYPE_LRU_HASH,
        BPF_MAP_TYPE_LRU_PERCPU_HASH,
        BPF_MAP_TYPE_LPM_TRIE,
        BPF_MAP_TYPE_ARRAY_OF_MAPS,
        BPF_MAP_TYPE_HASH_OF_MAPS,
        BPF_MAP_TYPE_DEVMAP,
        BPF_MAP_TYPE_SOCKMAP,
        BPF_MAP_TYPE_CPUMAP,
        BPF_MAP_TYPE_XSKMAP,
        BPF_MAP_TYPE_SOCKHASH,
        BPF_MAP_TYPE_CGROUP_STORAGE_DEPRECATED,
        BPF_MAP_TYPE_CGROUP_STORAGE,
        BPF_MAP_TYPE_REUSEPORT_SOCKARRAY,
        BPF_MAP_TYPE_PERCPU_CGROUP_STORAGE_DEPRECATED,
        BPF_MAP_TYPE_PERCPU_CGROUP_STORAGE,
        BPF_MAP_TYPE_QUEUE,
        BPF_MAP_TYPE_STACK,
        BPF_MAP_TYPE_SK_STORAGE,
        BPF_MAP_TYPE_DEVMAP_HASH,
        BPF_MAP_TYPE_STRUCT_OPS,
        BPF_MAP_TYPE_RINGBUF,
        BPF_MAP_TYPE_INODE_STORAGE,
        BPF_MAP_TYPE_TASK_STORAGE,
        BPF_MAP_TYPE_BLOOM_FILTER,
        BPF_MAP_TYPE_USER_RINGBUF,
        BPF_MAP_TYPE_CGRP_STORAGE,
        BPF_MAP_TYPE_ARENA,
        __MAX_BPF_MAP_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum bpf_cgroup_iter_order")
    public static enum bpf_cgroup_iter_order implements Enum<bpf_cgroup_iter_order>,
    TypedEnum<bpf_cgroup_iter_order, Integer>
    {
        BPF_CGROUP_ITER_ORDER_UNSPEC,
        BPF_CGROUP_ITER_SELF_ONLY,
        BPF_CGROUP_ITER_DESCENDANTS_PRE,
        BPF_CGROUP_ITER_DESCENDANTS_POST,
        BPF_CGROUP_ITER_ANCESTORS_UP;

    }

    @Type(noCCodeGeneration=true, cType="struct bpf_insn")
    @NotUsableInJava
    public static class bpf_insn
    extends Struct {
        public char code;
        public char dst_reg;
        public char src_reg;
        public short off;
        public int imm;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_prog_array")
    @NotUsableInJava
    public static class bpf_prog_array
    extends Struct {
        public misc.callback_head rcu;
        public bpf_prog_array_item @Size(value=0) [] items;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_raw_event_map")
    @NotUsableInJava
    public static class bpf_raw_event_map
    extends Struct {
        public Ptr<runtime.tracepoint> tp;
        public Ptr<?> bpf_func;
        public @Unsigned int num_args;
        public @Unsigned int writable_size;
    }

    @Type(noCCodeGeneration=true, cType="struct bpf_run_ctx")
    @NotUsableInJava
    public static class bpf_run_ctx
    extends Struct {
    }
}

