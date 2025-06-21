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
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CacheDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.CperDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.CrosDefinitions;
import me.bechberger.ebpf.runtime.DbcDefinitions;
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DevfreqDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DevlinkDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EmDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FlushDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.HandshakeDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.HwDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IccDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IocDefinitions;
import me.bechberger.ebpf.runtime.IomapDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
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
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.PwmDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.ReclaimDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RpmDefinitions;
import me.bechberger.ebpf.runtime.RtcDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SelinuxDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SyncDefinitions;
import me.bechberger.ebpf.runtime.SyscallDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TaskletDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TmigrDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WatchdogDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.X86Definitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XenDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class PerfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> perf_aux_output_begin(Ptr<perf_output_handle> handle, Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_aux_output_end(Ptr<perf_output_handle> handle, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_aux_output_flag(Ptr<perf_output_handle> handle, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_aux_output_skip(Ptr<perf_output_handle> handle, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_ibs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_ftrace_event_register(Ptr<TraceDefinitions.trace_event_call> call, TraceDefinitions.trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ftrace_function_call(@Unsigned long ip, @Unsigned long parent_ip, Ptr<FtraceDefinitions.ftrace_ops> ops, Ptr<FtraceDefinitions.ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> perf_get_aux(Ptr<perf_output_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_get_regs_user(Ptr<perf_regs> regs_user, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_ibs_add(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ibs_del(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ibs_event_update(Ptr<perf_ibs> perf_ibs2, Ptr<perf_event> event2, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_ibs_handle_irq(Ptr<perf_ibs> perf_ibs2, Ptr<PtDefinitions.pt_regs> iregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_ibs_init(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_ibs_nmi_handler(@Unsigned int cmd, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_ibs_pmu_init(Ptr<perf_ibs> perf_ibs2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ibs_read(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ibs_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ibs_start(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ibs_stop(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_ibs_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_kprobe_destroy(Ptr<perf_event> p_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_kprobe_init(Ptr<perf_event> p_event, boolean is_retprobe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> perf_mmap_alloc_page(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> perf_mmap_to_page(Ptr<perf_buffer> rb, @Unsigned long pgoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_output_begin(Ptr<perf_output_handle> handle, Ptr<perf_sample_data> data, Ptr<perf_event> event2, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_output_begin_backward(Ptr<perf_output_handle> handle, Ptr<perf_sample_data> data, Ptr<perf_event> event2, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_output_begin_forward(Ptr<perf_output_handle> handle, Ptr<perf_sample_data> data, Ptr<perf_event> event2, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_output_copy($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned int perf_output_copy(Ptr<perf_output_handle> handle, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long perf_output_copy_aux(Ptr<perf_output_handle> aux_handle, Ptr<perf_output_handle> handle, @Unsigned long from, @Unsigned long to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_output_end(Ptr<perf_output_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_output_put_handle(Ptr<perf_output_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int perf_output_skip(Ptr<perf_output_handle> handle, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_reg_abi(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_reg_validate(@Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_reg_value(Ptr<PtDefinitions.pt_regs> regs, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_state_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_state_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ack_update_msk(Ptr<?> __data, @Unsigned long data_ack, @Unsigned long old_snd_una, @Unsigned long new_snd_una, @Unsigned long new_wnd_end, @Unsigned long msk_wnd_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_trace_add(Ptr<perf_event> p_event, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_alloc_vmap_area(Ptr<?> __data, @Unsigned long addr2, @Unsigned long size, @Unsigned long align, @Unsigned long vstart, @Unsigned long vend, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_amd_pstate_perf(Ptr<?> __data, @Unsigned long min_perf, @Unsigned long target_perf, @Unsigned long capacity, @Unsigned long freq, @Unsigned long mperf, @Unsigned long aperf, @Unsigned long tsc, @Unsigned int cpu_id2, boolean changed, boolean fast_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_bpf_test_finish(Ptr<?> __data, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_bpf_trigger_tp(Ptr<?> __data, int nonce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_bpf_xdp_link_attach_failed($arg1, (const u8*)$arg2)")
    public static void perf_trace_bpf_xdp_link_attach_failed(Ptr<?> __data, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> perf_trace_buf_alloc(int size, Ptr<Ptr<PtDefinitions.pt_regs>> regs, Ptr<Integer> rctxp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_buf_update(Ptr<?> record, @Unsigned short type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_contention_begin(Ptr<?> __data, Ptr<?> lock, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_contention_end(Ptr<?> __data, Ptr<?> lock, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_cpuhp_enter($arg1, $arg2, $arg3, $arg4, (int (*)(unsigned int))$arg5)")
    public static void perf_trace_cpuhp_enter(Ptr<?> __data, @Unsigned int cpu2, int target, int idx, Ptr<?> fun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cpuhp_exit(Ptr<?> __data, @Unsigned int cpu2, int state2, int idx, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_cpuhp_multi_enter($arg1, $arg2, $arg3, $arg4, (int (*)(unsigned int, struct hlist_node*))$arg5, $arg6)")
    public static void perf_trace_cpuhp_multi_enter(Ptr<?> __data, @Unsigned int cpu2, int target, int idx, Ptr<?> fun, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_del(Ptr<perf_event> p_event, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_destroy(Ptr<perf_event> p_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_drm_vblank_event(Ptr<?> __data, int crtc, @Unsigned int seq, @OriginalName(value="ktime_t") long time, boolean high_prec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_drm_vblank_event_delivered(Ptr<?> __data, Ptr<DrmDefinitions.drm_file> file2, int crtc, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_drm_vblank_event_queued(Ptr<?> __data, Ptr<DrmDefinitions.drm_file> file2, int crtc, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_trace_event_init(Ptr<TraceDefinitions.trace_event_call> tp_event, Ptr<perf_event> p_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_trace_event_reg(Ptr<TraceDefinitions.trace_event_call> tp_event, Ptr<perf_event> p_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_event_unreg(Ptr<perf_event> p_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_free_vmap_area_noflush(Ptr<?> __data, @Unsigned long va_start, @Unsigned long nr_lazy, @Unsigned long nr_lazy_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_hwmon_attr_class($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void perf_trace_hwmon_attr_class(Ptr<?> __data, int index2, String attr_name, long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_hwmon_attr_show_string($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void perf_trace_hwmon_attr_show_string(Ptr<?> __data, int index2, String attr_name, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_hyperv_mmu_flush_tlb_multi($arg1, (const struct cpumask*)$arg2, (const struct flush_tlb_info*)$arg3)")
    public static void perf_trace_hyperv_mmu_flush_tlb_multi(Ptr<?> __data, Ptr<runtime.cpumask> cpus, Ptr<FlushDefinitions.flush_tlb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hyperv_nested_flush_guest_mapping(Ptr<?> __data, @Unsigned long as, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hyperv_nested_flush_guest_mapping_range(Ptr<?> __data, @Unsigned long as, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_hyperv_send_ipi_mask($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static void perf_trace_hyperv_send_ipi_mask(Ptr<?> __data, Ptr<runtime.cpumask> cpus, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hyperv_send_ipi_one(Ptr<?> __data, int cpu2, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_icc_set_bw(Ptr<?> __data, Ptr<IccDefinitions.icc_path> p, Ptr<IccDefinitions.icc_node> n, int i, @Unsigned int avg_bw, @Unsigned int peak_bw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_icc_set_bw_end(Ptr<?> __data, Ptr<IccDefinitions.icc_path> p, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_trace_init(Ptr<perf_event> p_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_initcall_finish(Ptr<?> __data, @OriginalName(value="initcall_t") Ptr<?> func, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_initcall_level($arg1, (const u8*)$arg2)")
    public static void perf_trace_initcall_level(Ptr<?> __data, String level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_initcall_start(Ptr<?> __data, @OriginalName(value="initcall_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_irq_noise($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void perf_trace_irq_noise(Ptr<?> __data, int vector, String desc, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mdio_access(Ptr<?> __data, Ptr<misc.mii_bus> bus, char read2, char addr2, @Unsigned int regnum, @Unsigned short val, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_mem_connect($arg1, (const struct xdp_mem_allocator*)$arg2, (const struct xdp_rxq_info*)$arg3)")
    public static void perf_trace_mem_connect(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_allocator> xa, Ptr<XdpDefinitions.xdp_rxq_info> rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_mem_disconnect($arg1, (const struct xdp_mem_allocator*)$arg2)")
    public static void perf_trace_mem_disconnect(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_allocator> xa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_mem_return_failed($arg1, (const struct xdp_mem_info*)$arg2, (const struct page*)$arg3)")
    public static void perf_trace_mem_return_failed(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_info> mem, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_module_free(Ptr<?> __data, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_module_load(Ptr<?> __data, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_module_refcnt(Ptr<?> __data, Ptr<runtime.module> mod, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_module_request(Ptr<?> __data, String name, boolean wait, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mon_llc_occupancy_limbo(Ptr<?> __data, @Unsigned int ctrl_hw_id, @Unsigned int mon_hw_id, int domain_id, @Unsigned long llc_occupancy_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mptcp_dump_mpext(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_ext> mpext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mptcp_subflow_get_send(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_subflow_context> subflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_msr_trace_class(Ptr<?> __data, @Unsigned int msr2, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_nmi_handler(Ptr<?> __data, Ptr<?> handler, long delta_ns, int handled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_nmi_noise(Ptr<?> __data, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_pseudo_lock_l2(Ptr<?> __data, @Unsigned long l2_hits, @Unsigned long l2_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_pseudo_lock_l3(Ptr<?> __data, @Unsigned long l3_hits, @Unsigned long l3_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_pseudo_lock_mem_latency(Ptr<?> __data, @Unsigned int latency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_purge_vmap_area_lazy(Ptr<?> __data, @Unsigned long start, @Unsigned long end, @Unsigned int npurged) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rseq_ip_fixup(Ptr<?> __data, @Unsigned long regs_ip, @Unsigned long start_ip, @Unsigned long post_commit_offset, @Unsigned long abort_ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rseq_update(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sample_threshold(Ptr<?> __data, @Unsigned long start, @Unsigned long duration, @Unsigned long interference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_selinux_audited($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static void perf_trace_selinux_audited(Ptr<?> __data, Ptr<SelinuxDefinitions.selinux_audit_data> sad, String scontext, String tcontext, String tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_smbus_read($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void perf_trace_smbus_read(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_smbus_reply($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union i2c_smbus_data*)$arg8, $arg9)")
    public static void perf_trace_smbus_reply(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<I2cDefinitions.i2c_smbus_data> data, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_smbus_result($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void perf_trace_smbus_result(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_smbus_write($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union i2c_smbus_data*)$arg8)")
    public static void perf_trace_smbus_write(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<I2cDefinitions.i2c_smbus_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_softirq_noise(Ptr<?> __data, int vector, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_subflow_check_data_avail(Ptr<?> __data, char status, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_swiotlb_bounced(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dev_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_thermal_power_actor(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int actor_id, @Unsigned int req_power, @Unsigned int granted_power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_thermal_power_allocator(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, @Unsigned int total_req_power, @Unsigned int total_granted_power, int num_actors, @Unsigned int power_range, @Unsigned int max_allocatable_power, int current_temp, int delta_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_thermal_power_allocator_pid(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int err, int err_integral, long p, long i, long d, int output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_thread_noise(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xdp_bulk_tx($arg1, (const struct net_device*)$arg2, $arg3, $arg4, $arg5)")
    public static void perf_trace_xdp_bulk_tx(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, int sent, int drops, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xdp_cpumap_enqueue(Ptr<?> __data, int map_id, @Unsigned int processed, @Unsigned int drops, int to_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xdp_cpumap_kthread(Ptr<?> __data, int map_id, @Unsigned int processed, @Unsigned int drops, int sched, Ptr<XdpDefinitions.xdp_cpumap_stats> xdp_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xdp_devmap_xmit($arg1, (const struct net_device*)$arg2, (const struct net_device*)$arg3, $arg4, $arg5, $arg6)")
    public static void perf_trace_xdp_devmap_xmit(Ptr<?> __data, Ptr<NetDefinitions.net_device> from_dev, Ptr<NetDefinitions.net_device> to_dev, int sent, int drops, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xdp_exception($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, $arg4)")
    public static void perf_trace_xdp_exception(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, @Unsigned int act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xdp_redirect_template($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void perf_trace_xdp_redirect_template(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, Ptr<?> tgt, int err, BpfDefinitions.bpf_map_type map_type2, @Unsigned int map_id, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_uprobe_destroy(Ptr<perf_event> p_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_uprobe_init(Ptr<perf_event> p_event, @Unsigned long ref_ctr_offset, boolean is_retprobe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_call_bpf_enter(Ptr<TraceDefinitions.trace_event_call> call, Ptr<PtDefinitions.pt_regs> regs, Ptr<SyscallDefinitions.syscall_metadata> sys_data, Ptr<SyscallDefinitions.syscall_trace_enter> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_iommu_add(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_iommu_del(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_iommu_event_init(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_iommu_read(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_iommu_start(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_iommu_stop(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_perm_irq_work_exit(Ptr<TraceDefinitions.trace_event_call> tp_event, Ptr<perf_event> p_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_restore_debug_store() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_syscall_enter(Ptr<?> ignore, Ptr<PtDefinitions.pt_regs> regs, long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_syscall_exit(Ptr<?> ignore, Ptr<PtDefinitions.pt_regs> regs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_aer_event($arg1, (const u8*)$arg2, (const unsigned int)$arg3, (const u8)$arg4, (const u8)$arg5, $arg6)")
    public static void perf_trace_aer_event(Ptr<?> __data, String dev_name, @Unsigned int status, char severity2, char tlp_header_valid, Ptr<PcieDefinitions.pcie_tlp_log> tlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_arm_event($arg1, (const struct cper_sec_proc_arm*)$arg2)")
    public static void perf_trace_arm_event(Ptr<?> __data, Ptr<CperDefinitions.cper_sec_proc_arm> proc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cache_tag_flush(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag, @Unsigned long start, @Unsigned long end, @Unsigned long addr2, @Unsigned long pages, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cache_tag_log(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cdev_update(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_clk(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_clk_duty_cycle(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_duty> duty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_clk_parent(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_clk_phase(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, int phase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_clk_rate(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_clk_rate_range(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long min, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_clk_rate_request(Ptr<?> __data, Ptr<ClkDefinitions.clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_clock($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void perf_trace_clock(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_compact_retry(Ptr<?> __data, int order, misc.compact_priority priority, misc.compact_result result, int retries, int max_retries, boolean ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_console($arg1, (const u8*)$arg2, $arg3)")
    public static void perf_trace_console(Ptr<?> __data, String text, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_context_tracking_user(Ptr<?> __data, int dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cpu(Ptr<?> __data, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cpu_frequency_limits(Ptr<?> __data, Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cpu_idle_miss(Ptr<?> __data, @Unsigned int cpu_id2, @Unsigned int state2, boolean below) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cpu_latency_qos_request(Ptr<?> __data, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_dev_pm_qos_request($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void perf_trace_dev_pm_qos_request(Ptr<?> __data, String name, DevDefinitions.dev_pm_qos_req_type type2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_device_pm_callback_end(Ptr<?> __data, Ptr<runtime.device> dev, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_device_pm_callback_start($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void perf_trace_device_pm_callback_start(Ptr<?> __data, Ptr<runtime.device> dev, String pm_ops, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_extlog_mem_event($arg1, $arg2, $arg3, (const struct {\n  u8 b[16];\n}*)$arg4, (const u8*)$arg5, $arg6)")
    public static void perf_trace_extlog_mem_event(Ptr<?> __data, Ptr<CperDefinitions.cper_sec_mem_err> mem, @Unsigned int err_seq, Ptr< @OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_finish_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_guest_halt_poll_ns(Ptr<?> __data, boolean grow, @Unsigned int _new, @Unsigned int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hrtimer_class(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hrtimer_expire_entry(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, Ptr<@OriginalName(value="ktime_t") Long> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hrtimer_init(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, @OriginalName(value="clockid_t") int clockid, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hrtimer_start(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iommu_device_event(Ptr<?> __data, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iommu_error(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned long iova2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iommu_group_event(Ptr<?> __data, int group_id, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_itimer_expire(Ptr<?> __data, int which, Ptr<runtime.pid> pid2, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_itimer_state($arg1, $arg2, (const const struct itimerspec64*)$arg3, $arg4)")
    public static void perf_trace_itimer_state(Ptr<?> __data, int which, Ptr<runtime.itimerspec64> value, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_kcompactd_wake_template(Ptr<?> __data, int nid, int order, ZoneDefinitions.zone_type highest_zoneidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_map(Ptr<?> __data, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mark_victim(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, @Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_mc_event($arg1, (const unsigned int)$arg2, (const u8*)$arg3, (const u8*)$arg4, (const int)$arg5, (const u8)$arg6, (const s8)$arg7, (const s8)$arg8, (const s8)$arg9, $arg10, (const u8)$arg11, $arg12, (const u8*)$arg13)")
    public static void perf_trace_mc_event(Ptr<?> __data, @Unsigned int err_type, String error_msg, String label, int error_count, char mc_index, @OriginalName(value="s8") byte top_layer, @OriginalName(value="s8") byte mid_layer, @OriginalName(value="s8") byte low_layer, @Unsigned long address, char grain_bits, @Unsigned long syndrome, String driver_detail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mce_record(Ptr<?> __data, Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_memory_failure_event(Ptr<?> __data, @Unsigned long pfn, int type2, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_compaction_begin(Ptr<?> __data, Ptr<misc.compact_control> cc, @Unsigned long zone_start, @Unsigned long zone_end, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_compaction_defer_template(Ptr<?> __data, Ptr<runtime.zone> zone2, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_compaction_end(Ptr<?> __data, Ptr<misc.compact_control> cc, @Unsigned long zone_start, @Unsigned long zone_end, boolean sync2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_compaction_isolate_template(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long nr_scanned, @Unsigned long nr_taken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_compaction_kcompactd_sleep(Ptr<?> __data, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_compaction_migratepages(Ptr<?> __data, @Unsigned int nr_migratepages, @Unsigned int nr_succeeded) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_compaction_suitable_template(Ptr<?> __data, Ptr<runtime.zone> zone2, int order, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_compaction_try_to_compact_pages(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int prio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_shrink_slab_end(Ptr<?> __data, Ptr<runtime.shrinker> shr, int nid, int shrinker_retval, long unused_scan_cnt, long new_scan_cnt, long total_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_shrink_slab_start(Ptr<?> __data, Ptr<runtime.shrinker> shr, Ptr<ShrinkDefinitions.shrink_control> sc, long nr_objects_to_shrink, @Unsigned long cache_items, @Unsigned long delta, @Unsigned long total_scan, int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_direct_reclaim_begin_template(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_direct_reclaim_end_template(Ptr<?> __data, @Unsigned long nr_reclaimed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_kswapd_sleep(Ptr<?> __data, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_kswapd_wake(Ptr<?> __data, int nid, int zid, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_lru_isolate(Ptr<?> __data, int highest_zoneidx, int order, @Unsigned long nr_requested, @Unsigned long nr_scanned, @Unsigned long nr_skipped, @Unsigned long nr_taken, int lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_lru_shrink_active(Ptr<?> __data, int nid, @Unsigned long nr_taken, @Unsigned long nr_active, @Unsigned long nr_deactivated, @Unsigned long nr_referenced, int priority, int file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_lru_shrink_inactive(Ptr<?> __data, int nid, @Unsigned long nr_scanned, @Unsigned long nr_reclaimed, Ptr<ReclaimDefinitions.reclaim_stat> stat2, int priority, int file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_node_reclaim_begin(Ptr<?> __data, int nid, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_throttled(Ptr<?> __data, int nid, int usec_timeout, int usec_delayed, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_wakeup_kswapd(Ptr<?> __data, int nid, int zid, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_vmscan_write_folio(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_mmap_lock($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void perf_trace_mmap_lock(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_mmap_lock_acquire_returned($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void perf_trace_mmap_lock_acquire_returned(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2, boolean success) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mmc_request_done(Ptr<?> __data, Ptr<MmcDefinitions.mmc_host> host, Ptr<MmcDefinitions.mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mmc_request_start(Ptr<?> __data, Ptr<MmcDefinitions.mmc_host> host, Ptr<MmcDefinitions.mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_non_standard_event($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, (const struct {\n  u8 b[16];\n}*)$arg3, (const u8*)$arg4, (const u8)$arg5, (const u8*)$arg6, (const unsigned int)$arg7)")
    public static void perf_trace_non_standard_event(Ptr<?> __data, Ptr< @OriginalName(value="guid_t") misc.uuid_t> sec_type, Ptr< @OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev, Ptr<Character> err, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_oom_score_adj_update(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_pm_qos_update(Ptr<?> __data, PmDefinitions.pm_qos_req_action action, int prev_value, int curr_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_power_domain($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void perf_trace_power_domain(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_powernv_throttle($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void perf_trace_powernv_throttle(Ptr<?> __data, int chip_id, String reason, int pmax) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_prq_report(Ptr<?> __data, Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned long dw0, @Unsigned long dw1, @Unsigned long dw2, @Unsigned long dw3, @Unsigned long seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_pstate_sample(Ptr<?> __data, @Unsigned int core_busy, @Unsigned int scaled_busy, @Unsigned int from, @Unsigned int to, @Unsigned long mperf, @Unsigned long aperf, @Unsigned long tsc, @Unsigned int freq, @Unsigned int io_boost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_qi_submit(Ptr<?> __data, Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned long qw0, @Unsigned long qw1, @Unsigned long qw2, @Unsigned long qw3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_rcu_stall_warning($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void perf_trace_rcu_stall_warning(Ptr<?> __data, String rcuname, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_rcu_utilization($arg1, (const u8*)$arg2)")
    public static void perf_trace_rcu_utilization(Ptr<?> __data, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_reclaim_retry_zone(Ptr<?> __data, Ptr<runtime.zoneref> zoneref2, int order, @Unsigned long reclaimable, @Unsigned long available, @Unsigned long min_wmark, int no_progress_loops, boolean wmark_check) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_regcache_drop_region(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int from, @Unsigned int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_regcache_sync($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void perf_trace_regcache_sync(Ptr<?> __data, Ptr<runtime.regmap> map2, String type2, String status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_regmap_async(Ptr<?> __data, Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_regmap_block(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_regmap_bool(Ptr<?> __data, Ptr<runtime.regmap> map2, boolean flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_regmap_bulk($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void perf_trace_regmap_bulk(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, int val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_regmap_reg(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_signal_deliver(Ptr<?> __data, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<KDefinitions.k_sigaction> ka) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_signal_generate(Ptr<?> __data, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> task2, int group, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_skip_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_start_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_suspend_resume($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void perf_trace_suspend_resume(Ptr<?> __data, String action, int val, boolean start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sync_timeline(Ptr<?> __data, Ptr<SyncDefinitions.sync_timeline> timeline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_task_newtask(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_task_rename($arg1, $arg2, (const u8*)$arg3)")
    public static void perf_trace_task_rename(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, String comm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_thermal_power_devfreq_get_power(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, Ptr<DevfreqDefinitions.devfreq_dev_status> status, @Unsigned long freq, @Unsigned int power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_thermal_power_devfreq_limit(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long freq, @Unsigned long cdev_state, @Unsigned int power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_thermal_temperature(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_thermal_zone_trip(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int trip, ThermalDefinitions.thermal_trip_type trip_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tick_stop(Ptr<?> __data, int success, int dependency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_timer_base_idle(Ptr<?> __data, boolean is_idle, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_timer_class(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_timer_expire_entry(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long baseclk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_timer_start(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long bucket_expiry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_unmap(Ptr<?> __data, @Unsigned long iova2, @Unsigned long size, @Unsigned long unmapped_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_activate(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean can_reserve, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_alloc(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, boolean reserved, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_alloc_managed(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_config(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int apicdest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_free_moved(Ptr<?> __data, @Unsigned int irq, @Unsigned int cpu2, @Unsigned int vector, boolean is_managed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_mod(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int prev_vector, @Unsigned int prev_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_reserve(Ptr<?> __data, @Unsigned int irq, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_setup(Ptr<?> __data, @Unsigned int irq, boolean is_legacy, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vector_teardown(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean has_reserved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_wake_reaper(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_wakeup_source($arg1, (const u8*)$arg2, $arg3)")
    public static void perf_trace_wakeup_source(Ptr<?> __data, String name, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_watchdog_set_timeout(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, @Unsigned int timeout, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_watchdog_template(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_x86_fpu(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_x86_irq_vector(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xen_cpu_load_idt($arg1, (const struct desc_ptr*)$arg2)")
    public static void perf_trace_xen_cpu_load_idt(Ptr<?> __data, Ptr<DescDefinitions.desc_ptr> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xen_cpu_set_ldt($arg1, (const void*)$arg2, $arg3)")
    public static void perf_trace_xen_cpu_set_ldt(Ptr<?> __data, Ptr<?> addr2, @Unsigned int entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xen_cpu_write_gdt_entry($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void perf_trace_xen_cpu_write_gdt_entry(Ptr<?> __data, Ptr<DescDefinitions.desc_struct> dt, int entrynum, Ptr<?> desc, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xen_cpu_write_idt_entry($arg1, $arg2, $arg3, (const gate_struct*)$arg4)")
    public static void perf_trace_xen_cpu_write_idt_entry(Ptr<?> __data, Ptr< @OriginalName(value="gate_desc") misc.gate_struct> dt, int entrynum, Ptr< @OriginalName(value="gate_desc") misc.gate_struct> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_cpu_write_ldt_entry(Ptr<?> __data, Ptr<DescDefinitions.desc_struct> dt, int entrynum, @Unsigned long desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mc__batch(Ptr<?> __data, XenDefinitions.xen_lazy_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mc_callback(Ptr<?> __data, @OriginalName(value="xen_mc_callback_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mc_entry(Ptr<?> __data, Ptr<misc.multicall_entry> mc, @Unsigned int nargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mc_entry_alloc(Ptr<?> __data, @Unsigned long args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mc_extend_args(Ptr<?> __data, @Unsigned long op, @Unsigned long args, XenDefinitions.xen_mc_extend_args res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mc_flush(Ptr<?> __data, @Unsigned int mcidx, @Unsigned int argidx, @Unsigned int cbidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mc_flush_reason(Ptr<?> __data, XenDefinitions.xen_mc_flush_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu__set_pte(Ptr<?> __data, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_alloc_ptpage(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn, @Unsigned int level, boolean pinned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_xen_mmu_flush_tlb_multi($arg1, (const struct cpumask*)$arg2, $arg3, $arg4, $arg5)")
    public static void perf_trace_xen_mmu_flush_tlb_multi(Ptr<?> __data, Ptr<runtime.cpumask> cpus, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_flush_tlb_one_user(Ptr<?> __data, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_pgd(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_ptep_modify_prot(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_release_ptpage(Ptr<?> __data, @Unsigned long pfn, @Unsigned int level, boolean pinned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_set_p4d(Ptr<?> __data, Ptr<misc.p4d_t> p4dp, Ptr<misc.p4d_t> user_p4dp, misc.p4d_t p4dval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_set_pmd(Ptr<?> __data, Ptr<PmdDefinitions.pmd_t> pmdp, PmdDefinitions.pmd_t pmdval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_set_pud(Ptr<?> __data, Ptr<PudDefinitions.pud_t> pudp, PudDefinitions.pud_t pudval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xen_mmu_write_cr3(Ptr<?> __data, boolean kernel, @Unsigned long cr3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_dbc_log_request(Ptr<?> __data, Ptr<DbcDefinitions.dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_ctrl_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_input_control_ctx> ctrl_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_container_ctx> ctx, @Unsigned int ep_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_doorbell(Ptr<?> __data, @Unsigned int slot2, @Unsigned int doorbell) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_ep_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ep_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_free_virt_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_msg(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_portsc(Ptr<?> __data, Ptr<XhciDefinitions.xhci_port> port2, @Unsigned int portsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_ring(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_slot_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_trb(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_urb(Ptr<?> __data, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_xhci_log_virt_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_callchain_kernel(Ptr<perf_callchain_entry_ctx> entry, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_callchain_user(Ptr<perf_callchain_entry_ctx> entry, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_attach_bpf_prog(Ptr<perf_event> event2, Ptr<BpfDefinitions.bpf_prog> prog, @Unsigned long bpf_cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_detach_bpf_prog(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_event_max_stack_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int perf_event_max_stack_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_query_prog_array(Ptr<perf_event> event2, Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_alarm_class(Ptr<?> __data, Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_alarmtimer_suspend(Ptr<?> __data, @OriginalName(value="ktime_t") long expires, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_bmdma_status(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, @Unsigned int host_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_eh_action_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, @Unsigned int devno, @Unsigned int eh_action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_eh_link_autopsy(Ptr<?> __data, Ptr<AtaDefinitions.ata_device> dev, @Unsigned int eh_action, @Unsigned int eh_err_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_eh_link_autopsy_qc(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ata_exec_command_template($arg1, $arg2, (const struct ata_taskfile*)$arg3, $arg4)")
    public static void perf_trace_ata_exec_command_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_link_reset_begin_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_link_reset_end_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_port_eh_begin_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_qc_complete_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_qc_issue_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_sff_hsm_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_sff_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ata_tf_load($arg1, $arg2, (const struct ata_taskfile*)$arg3)")
    public static void perf_trace_ata_tf_load(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ata_transfer_data_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, @Unsigned int offset, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_balance_dirty_pages(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long thresh, @Unsigned long bg_thresh, @Unsigned long dirty, @Unsigned long bdi_thresh, @Unsigned long bdi_dirty, @Unsigned long dirty_ratelimit, @Unsigned long task_ratelimit, @Unsigned long dirtied, @Unsigned long period, long pause2, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_bdi_dirty_ratelimit(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long dirty_rate, @Unsigned long task_ratelimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_bio(Ptr<?> __data, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_bio_complete(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_bio_remap(Ptr<?> __data, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_buffer(Ptr<?> __data, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_plug(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_rq(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_rq_completion(Ptr<?> __data, Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error, @Unsigned int nr_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_rq_remap(Ptr<?> __data, Ptr<runtime.request> rq2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_rq_requeue(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_split(Ptr<?> __data, Ptr<runtime.bio> bio2, @Unsigned int new_sector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_block_unplug(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q, @Unsigned int depth, boolean explicit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_bpf_trace_printk($arg1, (const u8*)$arg2)")
    public static void perf_trace_bpf_trace_printk(Ptr<?> __data, String bpf_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_csd_function(Ptr<?> __data, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr< @OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_csd_queue_cpu($arg1, (const unsigned int)$arg2, $arg3, $arg4, $arg5)")
    public static void perf_trace_csd_queue_cpu(Ptr<?> __data, @Unsigned int cpu2, @Unsigned long callsite, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr< @OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_devres($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void perf_trace_devres(Ptr<?> __data, Ptr<runtime.device> dev, String op, Ptr<?> node2, String name, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_fence(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_exit_mmap(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__es_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__es_shrink_enter(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_to_scan, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__fallocate_mode(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__folio_op(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__map_blocks_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned int len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__map_blocks_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int flags, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__mb_new_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__mballoc(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__trim(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__truncate(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__write_begin(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4__write_end(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_alloc_da_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_allocate_blocks(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_request> ar, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_allocate_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_begin_ordered_truncate(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long new_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_collapse_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_da_release_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int freed_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_da_reserve_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_resv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_da_update_reserve_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int used_blocks, int quota_claim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_da_write_pages(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long first_page, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_da_write_pages_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_discard_blocks(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long blk, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_discard_preallocations(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_drop_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int drop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ext4_error($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void perf_trace_ext4_error(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, String function, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_es_find_extent_range_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_es_find_extent_range_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_es_insert_delayed_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es, boolean lclu_allocated, boolean end_allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_es_lookup_extent_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_es_lookup_extent_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es, int found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_es_remove_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_es_shrink(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_shrunk, @Unsigned long scan_time, int nr_skipped, int retried) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_es_shrink_scan_exit(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_shrunk, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_evict_inode(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_convert_to_initialized_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_convert_to_initialized_fastpath(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux, Ptr<Ext4Definitions.ext4_extent> ix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_handle_unwritten_extents(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, int flags, @Unsigned int allocated, @Unsigned @OriginalName(value="ext4_fsblk_t") long newblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_load_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_remove_space(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_remove_space_done(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end, int depth, Ptr<misc.partial_cluster> pc, @Unsigned @OriginalName(value="__le16") short eh_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_rm_idx(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_rm_leaf(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, Ptr<Ext4Definitions.ext4_extent> ex, Ptr<misc.partial_cluster> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_ext_show_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, @Unsigned short len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fallocate_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @Unsigned int max_blocks, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_cleanup(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int full, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_commit_start(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_commit_stop(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nblks, int reason, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_replay(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int tag, int ino, int priv1, int priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_replay_scan(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int error, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_stats(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_track_dentry(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_track_inode(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fc_track_range(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, long start, long end, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_forget(Ptr<?> __data, Ptr<runtime.inode> inode2, int is_metadata, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_free_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long block, @Unsigned long count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_free_inode(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_fsmap_class(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned int keydev, @Unsigned int agno, @Unsigned long bno, @Unsigned long len, @Unsigned long owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_get_implied_cluster_alloc_exit(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_getfsmap_class(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_fsmap> fsmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_insert_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_invalidate_folio_op(Ptr<?> __data, Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_journal_start_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int blocks, int rsv_blocks, int revoke_creds, int type2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_journal_start_reserved(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int blocks, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_journal_start_sb(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int blocks, int rsv_blocks, int revoke_creds, int type2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_lazy_itable_init(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_load_inode(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_mark_inode_dirty(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_mb_discard_preallocations(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_mb_release_group_pa(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_mb_release_inode_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_prealloc_space> pa, @Unsigned long block, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_mballoc_alloc(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_mballoc_prealloc(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_nfs_commit_metadata(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_other_inode_update_time(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ino_t") long orig_ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_prefetch_bitmaps(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @Unsigned @OriginalName(value="ext4_group_t") int next, @Unsigned int prefetch_ios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_read_block_bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group, boolean prefetch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_remove_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_extent> ex, @Unsigned @OriginalName(value="ext4_lblk_t") int from, @Unsigned @OriginalName(value="ext4_fsblk_t") long to, Ptr<misc.partial_cluster> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_request_blocks(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_request> ar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_request_inode(Ptr<?> __data, Ptr<runtime.inode> dir, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_shutdown(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_sync_file_enter(Ptr<?> __data, Ptr<runtime.file> file2, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_sync_file_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_sync_fs(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_unlink_enter(Ptr<?> __data, Ptr<runtime.inode> parent, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_unlink_exit(Ptr<?> __data, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_update_sb(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long fsblk, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_writepages(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ext4_writepages_result(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, int ret, int pages_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_fib6_table_lookup($arg1, (const struct net*)$arg2, (const struct fib6_result*)$arg3, $arg4, (const struct flowi6*)$arg5)")
    public static void perf_trace_fib6_table_lookup(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_result> res, Ptr<Fib6Definitions.fib6_table> table, Ptr<runtime.flowi6> flp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_flush_foreign(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned int frn_bdi_id, @Unsigned int frn_memcg_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_global_dirty_state(Ptr<?> __data, @Unsigned long background_thresh, @Unsigned long dirty_thresh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_gpio_direction(Ptr<?> __data, @Unsigned int gpio, int in, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_gpio_value(Ptr<?> __data, @Unsigned int gpio, int get, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_icmp_send($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4)")
    public static void perf_trace_icmp_send(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int type2, int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_inode_foreign_history(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned int history) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_inode_switch_wbs(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<BdiDefinitions.bdi_writeback> old_wb, Ptr<BdiDefinitions.bdi_writeback> new_wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_complete(Ptr<?> __data, Ptr<?> ctx, Ptr<?> req2, @Unsigned long user_data, int res, @Unsigned int cflags, @Unsigned long extra1, @Unsigned long extra2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_cqe_overflow(Ptr<?> __data, Ptr<?> ctx, @Unsigned long user_data, int res, @Unsigned int cflags, Ptr<?> ocqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_cqring_wait(Ptr<?> __data, Ptr<?> ctx, int min_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_create(Ptr<?> __data, int fd2, Ptr<?> ctx, @Unsigned int sq_entries, @Unsigned int cq_entries, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_defer(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_fail_link(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, Ptr<IoDefinitions.io_kiocb> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_file_get(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_link(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, Ptr<IoDefinitions.io_kiocb> target_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_local_work_run(Ptr<?> __data, Ptr<?> ctx, int count, @Unsigned int loops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_poll_arm(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int mask, int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_queue_async_work(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_register(Ptr<?> __data, Ptr<?> ctx, @Unsigned int opcode, @Unsigned int nr_files, @Unsigned int nr_bufs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_io_uring_req_failed($arg1, (const struct io_uring_sqe*)$arg2, $arg3, $arg4)")
    public static void perf_trace_io_uring_req_failed(Ptr<?> __data, Ptr<IoDefinitions.io_uring_sqe> sqe, Ptr<IoDefinitions.io_kiocb> req2, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_short_write(Ptr<?> __data, Ptr<?> ctx, @Unsigned long fpos, @Unsigned long wanted, @Unsigned long got) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_submit_req(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_task_add(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_io_uring_task_work_run(Ptr<?> __data, Ptr<?> tctx, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_iocg_inuse_update($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void perf_trace_iocg_inuse_update(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int old_inuse, @Unsigned int new_inuse, @Unsigned long old_hw_inuse, @Unsigned long new_hw_inuse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iocost_ioc_vrate_adj(Ptr<?> __data, Ptr<runtime.ioc> ioc2, @Unsigned long new_vrate, Ptr<@Unsigned Integer> missed_ppm, @Unsigned int rq_wait_pct, int nr_lagging, int nr_shortages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_iocost_iocg_forgive_debt($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static void perf_trace_iocost_iocg_forgive_debt(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int usage_pct, @Unsigned long old_debt, @Unsigned long new_debt, @Unsigned long old_delay, @Unsigned long new_delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_iocost_iocg_state($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void perf_trace_iocost_iocg_state(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned long last_period, @Unsigned long cur_period, @Unsigned long vtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iomap_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iomap_dio_complete(Ptr<?> __data, Ptr<runtime.kiocb> iocb2, int error, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iomap_dio_rw_begin(Ptr<?> __data, Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, @Unsigned int dio_flags, @Unsigned long done_before) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_iomap_iter($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void perf_trace_iomap_iter(Ptr<?> __data, Ptr<IomapDefinitions.iomap_iter> iter2, Ptr<?> ops, @Unsigned long caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iomap_range_class(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iomap_readpage_class(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_iomap_writepage_map(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long pos, @Unsigned int dirty_len, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ipi_handler($arg1, (const u8*)$arg2)")
    public static void perf_trace_ipi_handler(Ptr<?> __data, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ipi_raise($arg1, (const struct cpumask*)$arg2, (const u8*)$arg3)")
    public static void perf_trace_ipi_raise(Ptr<?> __data, Ptr<runtime.cpumask> mask, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ipi_send_cpu($arg1, (const unsigned int)$arg2, $arg3, $arg4)")
    public static void perf_trace_ipi_send_cpu(Ptr<?> __data, @Unsigned int cpu2, @Unsigned long callsite, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ipi_send_cpumask($arg1, (const struct cpumask*)$arg2, $arg3, $arg4)")
    public static void perf_trace_ipi_send_cpumask(Ptr<?> __data, Ptr<runtime.cpumask> cpumask2, @Unsigned long callsite, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_checkpoint(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_checkpoint_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, Ptr<misc.transaction_chp_stats_s> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_commit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr< @OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_end_commit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr< @OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_handle_extend(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int buffer_credits, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_handle_start_class(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_handle_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int interval2, int sync2, int requested_blocks, int dirtied_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_journal_shrink(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_lock_buffer_stall(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned long stall_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_run_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, Ptr<misc.transaction_run_stats_s> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_shrink_checkpoint_list(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int first_tid, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned @OriginalName(value="tid_t") int last_tid, @Unsigned long nr_freed, @Unsigned @OriginalName(value="tid_t") int next_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_shrink_scan_exit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long nr_shrunk, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_submit_inode_data(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_update_log_tail(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int first_tid, @Unsigned long block_nr, @Unsigned long freed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_jbd2_write_superblock(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="blk_opf_t") int write_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ma_op($arg1, (const u8*)$arg2, $arg3)")
    public static void perf_trace_ma_op(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ma_read($arg1, (const u8*)$arg2, $arg3)")
    public static void perf_trace_ma_read(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_ma_write($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void perf_trace_ma_write(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas, @Unsigned long piv, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_migration_pte(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_collapse_huge_page(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int isolated, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_collapse_huge_page_isolate(Ptr<?> __data, Ptr<runtime.page> page2, int none_or_zero, int referenced, boolean writable, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_collapse_huge_page_swapin(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int swapped_in, int referenced, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_khugepaged_collapse_file(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.folio> new_folio, @Unsigned long index2, @Unsigned long addr2, boolean is_shmem, Ptr<runtime.file> file2, int nr, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_khugepaged_scan_file(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.folio> folio2, Ptr<runtime.file> file2, int present, int swap, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_khugepaged_scan_pmd(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.page> page2, boolean writable, int referenced, int none_or_zero, int status, int unmapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_migrate_pages(Ptr<?> __data, @Unsigned long succeeded, @Unsigned long failed, @Unsigned long thp_succeeded, @Unsigned long thp_failed, @Unsigned long thp_split, @Unsigned long large_folio_split, MigrateDefinitions.migrate_mode mode, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_migrate_pages_start(Ptr<?> __data, MigrateDefinitions.migrate_mode mode, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_percpu_alloc_percpu(Ptr<?> __data, @Unsigned long call_site, boolean reserved, boolean is_atomic, @Unsigned long size, @Unsigned long align, Ptr<?> base_addr, int off, Ptr<?> ptr, @Unsigned long bytes_alloc, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_percpu_alloc_percpu_fail(Ptr<?> __data, boolean reserved, boolean is_atomic, @Unsigned long size, @Unsigned long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_percpu_create_chunk(Ptr<?> __data, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_percpu_destroy_chunk(Ptr<?> __data, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_percpu_free_percpu(Ptr<?> __data, Ptr<?> base_addr, int off, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_pwm($arg1, $arg2, (const struct pwm_state*)$arg3, $arg4)")
    public static void perf_trace_pwm(Ptr<?> __data, Ptr<PwmDefinitions.pwm_device> pwm, Ptr<PwmDefinitions.pwm_state> state2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_kthread_stop(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_kthread_stop_ret(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_kthread_work_execute_end(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_work> work, @OriginalName(value="kthread_work_func_t") Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_kthread_work_execute_start(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_kthread_work_queue_work(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_worker> worker2, Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_migrate_task(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, int dest_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_move_numa(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, int src_cpu, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_numa_pair_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> src_tsk, int src_cpu, Ptr<TaskDefinitions.task_struct> dst_tsk, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_pi_setprio(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, Ptr<TaskDefinitions.task_struct> pi_task) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_prepare_exec(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_process_exec(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, @OriginalName(value="pid_t") int old_pid, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_process_fork(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> parent, Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_process_hang(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_process_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_process_wait(Ptr<?> __data, Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_skip_vma_numa(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma, NumaDefinitions.numa_vmaskip_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_stat_runtime(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long runtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_stat_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_switch(Ptr<?> __data, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_wake_idle_without_ipi(Ptr<?> __data, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sched_wakeup_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_scsi_cmd_done_timeout_template(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_scsi_dispatch_cmd_error(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd, int rtn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_scsi_dispatch_cmd_start(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_scsi_eh_wakeup(Ptr<?> __data, Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_scsi_prepare_zone_append(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmnd, @Unsigned @OriginalName(value="sector_t") long lba, @Unsigned int wp_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_scsi_zone_wp_update(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmnd, @Unsigned @OriginalName(value="sector_t") long rq_sector, @Unsigned int wp_offset, @Unsigned int good_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_spi_controller(Ptr<?> __data, Ptr<SpiDefinitions.spi_controller> controller2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_spi_message(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_spi_message_done(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_spi_set_cs(Ptr<?> __data, Ptr<SpiDefinitions.spi_device> spi, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_spi_setup(Ptr<?> __data, Ptr<SpiDefinitions.spi_device> spi, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_spi_transfer(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg, Ptr<SpiDefinitions.spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tlb_flush(Ptr<?> __data, int reason, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tmigr_connect_child_parent(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tmigr_connect_cpu_parent(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tmigr_cpugroup(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tmigr_group_and_cpu(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state state2, @Unsigned int childmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tmigr_group_set(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tmigr_handle_remote(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tmigr_idle(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tmigr_update_events(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> child, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state childstate, TmigrDefinitions.tmigr_state groupstate, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_track_foreign_dirty(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vm_unmapped_area(Ptr<?> __data, @Unsigned long addr2, Ptr<VmDefinitions.vm_unmapped_area_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vma_mas_szero(Ptr<?> __data, Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_vma_store(Ptr<?> __data, Ptr<MapleDefinitions.maple_tree> mt, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_wbc_class(Ptr<?> __data, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_wbt_lat(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned long lat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_wbt_stat(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<BlkDefinitions.blk_rq_stat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_wbt_step($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void perf_trace_wbt_step(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, String msg, int step, @Unsigned long window, @Unsigned int bg, @Unsigned int normal, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_wbt_timer(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int status, int step, @Unsigned int inflight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_bdi_register(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_class(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_dirty_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_folio_template(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_pages_written(Ptr<?> __data, long pages_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_queue_io(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work, @Unsigned long dirtied_before, int moved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_sb_inodes_requeue(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_single_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned long nr_to_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_work_class(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_writeback_write_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ___perf_sw_event(@Unsigned int event_id, @Unsigned long nr, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_addr_filters_adjust(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_cgroup_move(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event__output_id_sample(Ptr<perf_output_handle> handle, Ptr<perf_sample_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_event_account_interrupt(Ptr<perf_event> event2, int throttle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event_enable(Ptr<perf_event> event2, Ptr<perf_cpu_context> cpuctx, Ptr<perf_event_context> ctx, Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event_exit_context(Ptr<?> __info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event_header__init_id(Ptr<perf_sample_data> data, Ptr<perf_event> event2, @Unsigned long sample_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event_output_stop(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_event_overflow(Ptr<perf_event> event2, int throttle, Ptr<perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event_period(Ptr<perf_event> event2, Ptr<perf_cpu_context> cpuctx, Ptr<perf_event_context> ctx, Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event_read(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_event_read_cpu(Ptr<perf_event> event2, int event_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_event_read_size(@Unsigned long read_format, int nr_siblings) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __perf_event_read_value(Ptr<perf_event> event2, Ptr<@Unsigned Long> enabled, Ptr<@Unsigned Long> running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_event_stop(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event_task_sched_in(Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_event_task_sched_out(Ptr<TaskDefinitions.task_struct> task2, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_install_in_context(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_pmu_install_event(Ptr<runtime.pmu> pmu2, Ptr<perf_event_context> ctx, int cpu2, Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_pmu_output_stop(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __perf_read_group_add(Ptr<perf_event> leader, @Unsigned long read_format, Ptr<@Unsigned Long> values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_remove_from_context(Ptr<perf_event> event2, Ptr<perf_cpu_context> cpuctx, Ptr<perf_event_context> ctx, Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __perf_sched_find_counter(Ptr<perf_sched> sched) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __perf_sw_event(@Unsigned int event_id, @Unsigned long nr, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _perf_event_disable(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _perf_event_enable(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _perf_event_period(Ptr<perf_event> event2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _perf_event_reset(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long _perf_ioctl(Ptr<perf_event> event2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean perf_addr_filter_vma_adjust(Ptr<perf_addr_filter> filter, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<perf_addr_filter_range> fr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_addr_filters_splice(Ptr<perf_event> event2, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_adjust_freq_unthr_context(Ptr<perf_event_context> ctx, boolean unthrottle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_adjust_freq_unthr_events(Ptr<ListDefinitions.list_head> event_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_adjust_period(Ptr<perf_event> event2, @Unsigned long nsec, @Unsigned long count, boolean disable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_allow_kernel(Ptr<perf_event_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_amd_brs_lopwr_cb(boolean lopwr_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_assign_events(Ptr<Ptr<EventDefinitions.event_constraint>> constraints, int n, int wmin, int wmax, int gpmax, Ptr<Integer> assign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_bp_event(Ptr<perf_event> bp, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_callchain_entry> perf_callchain(Ptr<perf_event> event2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_cgroup_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> perf_cgroup_css_alloc(Ptr<CgroupDefinitions.cgroup_subsys_state> parent_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_cgroup_css_free(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_cgroup_css_online(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_cgroup_switch(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_check_microcode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_clear_dirty_counters() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long perf_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_copy_attr(Ptr<perf_event_attr> uattr, Ptr<perf_event_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_event_context> perf_cpu_task_ctx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_cpu_time_max_percent_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int perf_cpu_time_max_percent_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ctx_disable(Ptr<perf_event_context> ctx, boolean cgroup2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ctx_enable(Ptr<perf_event_context> ctx, boolean cgroup2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ctx_sched_task_cb(Ptr<perf_event_context> ctx, boolean sched_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_ctx_unlock(Ptr<perf_cpu_context> cpuctx, Ptr<perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_duration_warn(Ptr<IrqDefinitions.irq_work> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event__header_size(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event__id_header_size(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event__output_id_sample(Ptr<perf_event> event2, Ptr<perf_output_handle> handle, Ptr<perf_sample_data> sample2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_account_interrupt(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_addr_filters_apply(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_addr_filters_exec(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_addr_filters_sync(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_event> perf_event_alloc(Ptr<perf_event_attr> attr2, int cpu2, Ptr<TaskDefinitions.task_struct> task2, Ptr<perf_event> group_leader, Ptr<perf_event> parent_event, @OriginalName(value="perf_overflow_handler_t") Ptr<?> overflow_handler, Ptr<?> context2, int cgroup_fd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct perf_event_attr*)perf_event_attrs($arg1))")
    public static Ptr<perf_event_attr> perf_event_attrs(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_aux_event(Ptr<perf_event> event2, @Unsigned long head, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_bpf_event(Ptr<BpfDefinitions.bpf_prog> prog, perf_bpf_event_type type2, @Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_bpf_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_cgroup(Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_cgroup_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_clear_cpumask(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_comm(Ptr<TaskDefinitions.task_struct> task2, boolean exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_comm_event(Ptr<perf_comm_event> comm_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_comm_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_context_sched_out(Ptr<TaskDefinitions.task_struct> task2, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_event> perf_event_create_kernel_counter(Ptr<perf_event_attr> attr2, int cpu2, Ptr<TaskDefinitions.task_struct> task2, @OriginalName(value="perf_overflow_handler_t") Ptr<?> overflow_handler, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_event_context> perf_event_ctx_lock_nested(Ptr<perf_event> event2, int nesting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_delayed_put(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_disable(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_disable_inatomic(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_disable_local(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_enable(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_enable_on_exec(Ptr<perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_exec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_exit_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_exit_cpu_context(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_exit_event(Ptr<perf_event> event2, Ptr<perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_exit_task(Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> perf_event_fd_array_get_ptr(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.file> map_file, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_fd_array_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_fd_array_put_ptr(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> ptr, boolean need_defer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_fd_array_release(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.file> map_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_event_for_each_child($arg1, (void (*)(struct perf_event*))$arg2)")
    public static void perf_event_for_each_child(Ptr<perf_event> event2, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_fork(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_free_bpf_prog(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_free_task(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> perf_event_get(@Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_event> perf_event_groups_first(Ptr<perf_event_groups> groups, int cpu2, Ptr<runtime.pmu> pmu2, Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_groups_insert(Ptr<perf_event_groups> groups, Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_event> perf_event_groups_next(Ptr<perf_event> event2, Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_header__init_id(Ptr<perf_event_header> header, Ptr<perf_sample_data> data, Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_idx_default(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_init_all_cpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_init_context(Ptr<TaskDefinitions.task_struct> child, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_init_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_init_task(Ptr<TaskDefinitions.task_struct> child, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_itrace_started(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_event_ksymbol($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static void perf_event_ksymbol(@Unsigned short ksym_type, @Unsigned long addr2, @Unsigned int len, boolean unregister, String sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_ksymbol_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_event_max_sample_rate_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int perf_event_max_sample_rate_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_mmap(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_mmap_event(Ptr<perf_mmap_event> mmap_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_mmap_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long perf_event_mux_interval_ms_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_event_mux_interval_ms_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long perf_event_mux_interval_ms_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_namespaces(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_namespaces_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_nmi_handler(@Unsigned int cmd, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_nop_int(Ptr<perf_event> event2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_output(Ptr<perf_event> event2, Ptr<perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_output_backward(Ptr<perf_event> event2, Ptr<perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_output_forward(Ptr<perf_event> event2, Ptr<perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_overflow(Ptr<perf_event> event2, Ptr<perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_parse_addr_filter(Ptr<perf_event> event2, String fstr, Ptr<ListDefinitions.list_head> filters) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_event_pause(Ptr<perf_event> event2, boolean reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_period(Ptr<perf_event> event2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_print_debug() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_read(Ptr<perf_event> event2, boolean group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_read_event(Ptr<perf_event> event2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_read_local(Ptr<perf_event> event2, Ptr<@Unsigned Long> value, Ptr<@Unsigned Long> enabled, Ptr<@Unsigned Long> running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_event_read_value(Ptr<perf_event> event2, Ptr<@Unsigned Long> enabled, Ptr<@Unsigned Long> running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_refresh(Ptr<perf_event> event2, int refresh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_release_kernel(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_sched_in(Ptr<perf_cpu_context> cpuctx, Ptr<perf_event_context> ctx, Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_set_bpf_prog(Ptr<perf_event> event2, Ptr<BpfDefinitions.bpf_prog> prog, @Unsigned long bpf_cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_set_output(Ptr<perf_event> event2, Ptr<perf_event> output_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_setup_cpumask(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_stop(Ptr<perf_event> event2, int restart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_switch_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long perf_event_sysfs_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_task(Ptr<TaskDefinitions.task_struct> task2, Ptr<perf_event_context> task_ctx, int _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_task_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_event_task_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_task_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_task_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_event_text_poke((const void*)$arg1, (const void*)$arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void perf_event_text_poke(Ptr<?> addr2, Ptr<?> old_bytes, @Unsigned long old_len, Ptr<?> new_bytes, @Unsigned long new_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_text_poke_output(Ptr<perf_event> event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_update_time(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_update_userpage(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_event_wakeup(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_events_lapic_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_exclude_event(Ptr<perf_event> event2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_fasync(int fd2, Ptr<runtime.file> filp, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_fill_ns_link_info($arg1, $arg2, (const struct proc_ns_operations*)$arg3)")
    public static void perf_fill_ns_link_info(Ptr<perf_ns_link_info> ns_link_info, Ptr<TaskDefinitions.task_struct> task2, Ptr<ProcDefinitions.proc_ns_operations> ns_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_get_aux_event(Ptr<perf_event> event2, Ptr<perf_event> group_leader) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct perf_event*)perf_get_event($arg1))")
    public static Ptr<perf_event> perf_get_event(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_get_hw_event_config(int hw_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_get_page_size(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_get_pgtable_size(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_get_x86_pmu_capability(Ptr<X86Definitions.x86_pmu_capability> cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_group_attach(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_group_detach(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_guest_switch_msr> perf_guest_get_msrs(Ptr<Integer> nr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pmu> perf_init_event(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_install_in_context(Ptr<perf_event_context> ctx, Ptr<perf_event> event2, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_instruction_pointer(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long perf_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_iterate_ctx(Ptr<perf_event_context> ctx, Ptr<?> output, Ptr<?> data, boolean all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_iterate_sb(Ptr<?> output, Ptr<?> data, Ptr<perf_event_context> task_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_kprobe_event_init(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<perf_event_context> perf_lock_task_context(Ptr<TaskDefinitions.task_struct> task2, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_log_itrace_start(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_log_lost_samples(Ptr<perf_event> event2, @Unsigned long lost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_log_throttle(Ptr<perf_event> event2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_misc_flags(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_mmap_close(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int perf_mmap_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_mmap_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_msr_probe(Ptr<perf_msr> msr2, int cnt, boolean zero, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart perf_mux_hrtimer_handler(Ptr<runtime.hrtimer> hr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_mux_hrtimer_restart(Ptr<perf_cpu_pmu_context> cpc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_mux_hrtimer_restart_ipi(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_output_read(Ptr<perf_output_handle> handle, Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_output_read_group(Ptr<perf_output_handle> handle, Ptr<perf_event> event2, @Unsigned long enabled, @Unsigned long running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_output_sample(Ptr<perf_output_handle> handle, Ptr<perf_event_header> header, Ptr<perf_sample_data> data, Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_output_sample_regs(Ptr<perf_output_handle> handle, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pending_disable(Ptr<IrqDefinitions.irq_work> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pending_irq(Ptr<IrqDefinitions.irq_work> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pending_task(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_cancel_txn(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_pmu_commit_txn(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_disable(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_enable(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_migrate_context(Ptr<runtime.pmu> pmu2, int src_cpu, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_pmu_nop_int(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_nop_txn(Ptr<runtime.pmu> pmu2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_nop_void(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_pmu_register($arg1, (const u8*)$arg2, $arg3)")
    public static int perf_pmu_register(Ptr<runtime.pmu> pmu2, String name, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_resched(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_sched_task(Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, boolean sched_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long perf_pmu_snapshot_aux(Ptr<perf_buffer> rb, Ptr<perf_event> event2, Ptr<perf_output_handle> handle, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_start_txn(Ptr<runtime.pmu> pmu2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_pmu_unregister(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int perf_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_prepare_header(Ptr<perf_event_header> header, Ptr<perf_sample_data> data, Ptr<perf_event> event2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_prepare_sample(Ptr<perf_sample_data> data, Ptr<perf_event> event2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long perf_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_reboot(Ptr<misc.notifier_block> notifier, @Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_register_guest_info_callbacks(Ptr<perf_guest_info_callbacks> cbs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_remove_from_context(Ptr<perf_event> event2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_remove_from_owner(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_report_aux_output_id(Ptr<perf_event> event2, @Unsigned long hw_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean perf_rotate_context(Ptr<perf_cpu_pmu_context> cpc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_sample_event_took(@Unsigned long sample_len_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_sched_cb_dec(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_sched_cb_inc(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_sched_delayed(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_swevent_add(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_swevent_del(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_swevent_event(Ptr<perf_event> event2, @Unsigned long nr, Ptr<perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_swevent_get_recursion_context() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart perf_swevent_hrtimer(Ptr<runtime.hrtimer> hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_swevent_init(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_swevent_put_recursion_context(int rctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_swevent_read(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_swevent_set_period(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_swevent_start(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_swevent_stop(Ptr<perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_tp_event(@Unsigned short event_type, @Unsigned long count, Ptr<?> record, int entry_size, Ptr<PtDefinitions.pt_regs> regs, Ptr<misc.hlist_head> head, int rctx, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_tp_event_init(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_tp_event_match(Ptr<perf_event> event2, Ptr<perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_tp_event_target_task(@Unsigned long count, Ptr<?> record, Ptr<PtDefinitions.pt_regs> regs, Ptr<perf_sample_data> data, Ptr<perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_br_fdb_add($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void perf_trace_br_fdb_add(Ptr<?> __data, Ptr<runtime.ndmsg> ndm, Ptr<NetDefinitions.net_device> dev, String addr2, @Unsigned short vid, @Unsigned short nlh_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_br_fdb_external_learn_add($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static void perf_trace_br_fdb_external_learn_add(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_port> p, String addr2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_br_fdb_update($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void perf_trace_br_fdb_update(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_port> source, String addr2, @Unsigned short vid, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_br_mdb_full($arg1, (const struct net_device*)$arg2, (const struct br_ip*)$arg3)")
    public static void perf_trace_br_mdb_full(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<misc.br_ip> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_cgroup($arg1, $arg2, (const u8*)$arg3)")
    public static void perf_trace_cgroup(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_cgroup_event($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void perf_trace_cgroup_event(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_cgroup_migrate($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void perf_trace_cgroup_migrate(Ptr<?> __data, Ptr<runtime.cgroup> dst_cgrp, String path2, Ptr<TaskDefinitions.task_struct> task2, boolean threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cgroup_root(Ptr<?> __data, Ptr<CgroupDefinitions.cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cgroup_rstat(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_consume_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cros_ec_request_done(Ptr<?> __data, Ptr<CrosDefinitions.cros_ec_command> cmd, int retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_cros_ec_request_start(Ptr<?> __data, Ptr<CrosDefinitions.cros_ec_command> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dax_insert_mapping(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dax_pmd_fault_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long max_pgoff, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dax_pmd_insert_mapping_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, long length,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dax_pmd_load_hole_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> zero_folio, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dax_pte_fault_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dax_writeback_one(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long pgoff, @Unsigned long pglen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dax_writeback_range_class(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long start_index, @Unsigned long end_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_devfreq_frequency(Ptr<?> __data, Ptr<runtime.devfreq> devfreq2, @Unsigned long freq, @Unsigned long prev_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_devfreq_monitor(Ptr<?> __data, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_devlink_health_recover_aborted($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void perf_trace_devlink_health_recover_aborted(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, boolean health_state, @Unsigned long time_since_last_recover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_devlink_health_report($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void perf_trace_devlink_health_report(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_devlink_health_reporter_state_update($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4)")
    public static void perf_trace_devlink_health_reporter_state_update(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, boolean new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_devlink_hwerr($arg1, (const struct devlink*)$arg2, $arg3, (const u8*)$arg4)")
    public static void perf_trace_devlink_hwerr(Ptr<?> __data, Ptr<runtime.devlink> devlink2, int err, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_devlink_hwmsg($arg1, (const struct devlink*)$arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void perf_trace_devlink_hwmsg(Ptr<?> __data, Ptr<runtime.devlink> devlink2, boolean incoming, @Unsigned long type2, Ptr<Character> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_devlink_trap_report($arg1, (const struct devlink*)$arg2, $arg3, (const struct devlink_trap_metadata*)$arg4)")
    public static void perf_trace_devlink_trap_report(Ptr<?> __data, Ptr<runtime.devlink> devlink2, Ptr<SkDefinitions.sk_buff> skb, Ptr<DevlinkDefinitions.devlink_trap_metadata> metadata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_alloc(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<?> virt_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_free(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<?> virt_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_map(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_map_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, int ents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_sync_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_sync_single(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_unmap(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dma_unmap_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_dql_stall_detected(Ptr<?> __data, @Unsigned short thrs, @Unsigned int len, @Unsigned long last_reap, @Unsigned long hist_head, @Unsigned long now, Ptr<@Unsigned Long> hist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_emulate_vsyscall(Ptr<?> __data, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_error_da_monitor_id(Ptr<?> __data, int id, String state2, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_error_report_template(Ptr<?> __data, misc.error_detector error_detector2, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_event_da_monitor_id(Ptr<?> __data, int id, String state2, String event2, String next_state, boolean final_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_fdb_delete(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_fdb_entry> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_fib_table_lookup($arg1, $arg2, (const struct flowi4*)$arg3, (const struct fib_nh_common*)$arg4, $arg5)")
    public static void perf_trace_fib_table_lookup(Ptr<?> __data, @Unsigned int tb_id, Ptr<runtime.flowi4> flp, Ptr<FibDefinitions.fib_nh_common> nhc, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_file_check_and_advance_wb_err(Ptr<?> __data, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="errseq_t") int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_filelock_lease(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_filelock_lock(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> fl, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_filemap_set_wb_err(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="errseq_t") int eseq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_fuse_request_end($arg1, (const struct fuse_req*)$arg2)")
    public static void perf_trace_fuse_request_end(Ptr<?> __data, Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_fuse_request_send($arg1, (const struct fuse_req*)$arg2)")
    public static void perf_trace_fuse_request_send(Ptr<?> __data, Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_generic_add_lease(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_handshake_alert_class($arg1, (const struct sock*)$arg2, $arg3, $arg4)")
    public static void perf_trace_handshake_alert_class(Ptr<?> __data, Ptr<runtime.sock> sk, char level, char description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_handshake_complete($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void perf_trace_handshake_complete(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_handshake_error_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void perf_trace_handshake_error_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_handshake_event_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4)")
    public static void perf_trace_handshake_event_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_handshake_fd_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void perf_trace_handshake_fd_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hugepage_set(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_hugepage_update(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte, @Unsigned long clr, @Unsigned long set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_i2c_read($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void perf_trace_i2c_read(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_i2c_reply($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void perf_trace_i2c_reply(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_i2c_result($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4)")
    public static void perf_trace_i2c_result(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, int num, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_i2c_write($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void perf_trace_i2c_write(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_inet_sk_error_report($arg1, (const struct sock*)$arg2)")
    public static void perf_trace_inet_sk_error_report(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_inet_sock_set_state($arg1, (const struct sock*)$arg2, (const int)$arg3, (const int)$arg4)")
    public static void perf_trace_inet_sock_set_state(Ptr<?> __data, Ptr<runtime.sock> sk, int oldstate, int newstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_irq_handler_entry(Ptr<?> __data, int irq, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_irq_handler_exit(Ptr<?> __data, int irq, Ptr<runtime.irqaction> action, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_irq_matrix_cpu(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_irq_matrix_global(Ptr<?> __data, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_irq_matrix_global_update(Ptr<?> __data, int bit, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_kfree($arg1, $arg2, (const void*)$arg3)")
    public static void perf_trace_kfree(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_kfree_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2, SkbDefinitions.skb_drop_reason reason, Ptr<runtime.sock> rx_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_kmalloc($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void perf_trace_kmalloc(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, @Unsigned long bytes_req, @Unsigned long bytes_alloc, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_kmem_cache_alloc($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static void perf_trace_kmem_cache_alloc(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_kmem_cache_free($arg1, $arg2, (const void*)$arg3, (const struct kmem_cache*)$arg4)")
    public static void perf_trace_kmem_cache_free(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ksm_advisor(Ptr<?> __data, long scan_time, @Unsigned long pages_to_scan, @Unsigned int cpu_percent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ksm_enter_exit_template(Ptr<?> __data, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ksm_merge_one_page(Ptr<?> __data, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ksm_merge_with_ksm_page(Ptr<?> __data, Ptr<?> ksm_page, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ksm_remove_ksm_page(Ptr<?> __data, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ksm_remove_rmap_item(Ptr<?> __data, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_ksm_scan_template(Ptr<?> __data, int seq, @Unsigned int rmap_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_leases_conflict(Ptr<?> __data, boolean conflict, Ptr<FileDefinitions.file_lease> lease, Ptr<FileDefinitions.file_lease> breaker) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_locks_get_lock_context(Ptr<?> __data, Ptr<runtime.inode> inode2, int type2, Ptr<FileDefinitions.file_lock_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_mctp_key_acquire($arg1, (const struct mctp_sk_key*)$arg2)")
    public static void perf_trace_mctp_key_acquire(Ptr<?> __data, Ptr<MctpDefinitions.mctp_sk_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_mctp_key_release($arg1, (const struct mctp_sk_key*)$arg2, $arg3)")
    public static void perf_trace_mctp_key_release(Ptr<?> __data, Ptr<MctpDefinitions.mctp_sk_key> key2, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_migration_pmd(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_alloc_contig_migrate_range_info(Ptr<?> __data, @Unsigned long start, @Unsigned long end, @Unsigned long nr_migrated, @Unsigned long nr_reclaimed, @Unsigned long nr_mapped, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_filemap_fault(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_filemap_op_page_cache(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_filemap_op_page_cache_range(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned long last_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_lru_activate(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_lru_insertion(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_page(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, int migratetype2, int percpu_refill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_page_alloc(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_page_alloc_extfrag(Ptr<?> __data, Ptr<runtime.page> page2, int alloc_order, int fallback_order, int alloc_migratetype, int fallback_migratetype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_page_free(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_page_free_batched(Ptr<?> __data, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_mm_page_pcpu_drain(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_napi_poll(Ptr<?> __data, Ptr<NapiDefinitions.napi_struct> napi, int work, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_neigh__update(Ptr<?> __data, Ptr<runtime.neighbour> n, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_neigh_create($arg1, $arg2, $arg3, (const void*)$arg4, (const struct neighbour*)$arg5, $arg6)")
    public static void perf_trace_neigh_create(Ptr<?> __data, Ptr<NeighDefinitions.neigh_table> tbl, Ptr<NetDefinitions.net_device> dev, Ptr<?> pkey, Ptr<runtime.neighbour> n, boolean exempt_from_gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_neigh_update($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static void perf_trace_neigh_update(Ptr<?> __data, Ptr<runtime.neighbour> n, Ptr<Character> lladdr, char _new, @Unsigned int flags, @Unsigned int nlmsg_pid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_net_dev_rx_exit_template(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_net_dev_rx_verbose_template($arg1, (const struct sk_buff*)$arg2)")
    public static void perf_trace_net_dev_rx_verbose_template(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_net_dev_start_xmit($arg1, (const struct sk_buff*)$arg2, (const struct net_device*)$arg3)")
    public static void perf_trace_net_dev_start_xmit(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_net_dev_template(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_net_dev_xmit(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int rc2, Ptr<NetDefinitions.net_device> dev, @Unsigned int skb_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_net_dev_xmit_timeout(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, int queue_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_netlink_extack($arg1, (const u8*)$arg2)")
    public static void perf_trace_netlink_extack(Ptr<?> __data, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_notifier_info(Ptr<?> __data, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_page_pool_release($arg1, (const struct page_pool*)$arg2, $arg3, $arg4, $arg5)")
    public static void perf_trace_page_pool_release(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, int inflight, @Unsigned int hold, @Unsigned int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_page_pool_state_hold($arg1, (const struct page_pool*)$arg2, $arg3, $arg4)")
    public static void perf_trace_page_pool_state_hold(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int hold) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_page_pool_state_release($arg1, (const struct page_pool*)$arg2, $arg3, $arg4)")
    public static void perf_trace_page_pool_state_release(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_page_pool_update_nid($arg1, (const struct page_pool*)$arg2, $arg3)")
    public static void perf_trace_page_pool_update_nid(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, int new_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_qdisc_create($arg1, (const struct Qdisc_ops*)$arg2, $arg3, $arg4)")
    public static void perf_trace_qdisc_create(Ptr<?> __data, Ptr<QdiscDefinitions.Qdisc_ops> ops, Ptr<NetDefinitions.net_device> dev, @Unsigned int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_qdisc_dequeue($arg1, $arg2, (const struct netdev_queue*)$arg3, $arg4, $arg5)")
    public static void perf_trace_qdisc_dequeue(Ptr<?> __data, Ptr<runtime.Qdisc> qdisc, Ptr<NetdevDefinitions.netdev_queue> txq, int packets, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_qdisc_destroy(Ptr<?> __data, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_qdisc_enqueue($arg1, $arg2, (const struct netdev_queue*)$arg3, $arg4)")
    public static void perf_trace_qdisc_enqueue(Ptr<?> __data, Ptr<runtime.Qdisc> qdisc, Ptr<NetdevDefinitions.netdev_queue> txq, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_qdisc_reset(Ptr<?> __data, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_regulator_basic($arg1, (const u8*)$arg2)")
    public static void perf_trace_regulator_basic(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_regulator_range($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void perf_trace_regulator_range(Ptr<?> __data, String name, int min, int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_regulator_value($arg1, (const u8*)$arg2, $arg3)")
    public static void perf_trace_regulator_value(Ptr<?> __data, String name, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rpm_internal(Ptr<?> __data, Ptr<runtime.device> dev, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rpm_return_int(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned long ip, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rpm_status(Ptr<?> __data, Ptr<runtime.device> dev, RpmDefinitions.rpm_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rss_stat(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int member) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rtc_alarm_irq_enable(Ptr<?> __data, @Unsigned int enabled, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rtc_irq_set_freq(Ptr<?> __data, int freq, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rtc_irq_set_state(Ptr<?> __data, int enabled, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rtc_offset_class(Ptr<?> __data, long offset, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rtc_time_alarm_class(Ptr<?> __data, @OriginalName(value="time64_t") long secs, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_rtc_timer_class(Ptr<?> __data, Ptr<RtcDefinitions.rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_run_bpf_submit(Ptr<?> raw_data, int size, int rctx, Ptr<TraceDefinitions.trace_event_call> call, @Unsigned long count, Ptr<PtDefinitions.pt_regs> regs, Ptr<misc.hlist_head> head, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_sched_ext_dump($arg1, (const u8*)$arg2)")
    public static void perf_trace_sched_ext_dump(Ptr<?> __data, String line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_sk_data_ready($arg1, (const struct sock*)$arg2)")
    public static void perf_trace_sk_data_ready(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_skb_copy_datagram_iovec($arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static void perf_trace_skb_copy_datagram_iovec(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sock_exceed_buf_limit(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<runtime.proto> prot, long allocated, int kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sock_msg_length(Ptr<?> __data, Ptr<runtime.sock> sk, int ret, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sock_rcvqueue_full(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_softirq(Ptr<?> __data, @Unsigned int vec_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sys_enter(Ptr<?> __data, Ptr<PtDefinitions.pt_regs> regs, long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_sys_exit(Ptr<?> __data, Ptr<PtDefinitions.pt_regs> regs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tasklet(Ptr<?> __data, Ptr<TaskletDefinitions.tasklet_struct> t, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_ao_event($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const u8)$arg4, (const u8)$arg5, (const u8)$arg6)")
    public static void perf_trace_tcp_ao_event(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, char keyid, char rnext, char maclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_ao_event_sk($arg1, (const struct sock*)$arg2, (const u8)$arg3, (const u8)$arg4)")
    public static void perf_trace_tcp_ao_event_sk(Ptr<?> __data, Ptr<runtime.sock> sk, char keyid, char rnext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_ao_event_sne($arg1, (const struct sock*)$arg2, $arg3)")
    public static void perf_trace_tcp_ao_event_sne(Ptr<?> __data, Ptr<runtime.sock> sk, @Unsigned int new_sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_cong_state_set($arg1, $arg2, (const u8)$arg3)")
    public static void perf_trace_tcp_cong_state_set(Ptr<?> __data, Ptr<runtime.sock> sk, char ca_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tcp_event_sk(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_event_sk_skb($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void perf_trace_tcp_event_sk_skb(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_event_skb($arg1, (const struct sk_buff*)$arg2)")
    public static void perf_trace_tcp_event_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_hash_event($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void perf_trace_tcp_hash_event(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_tcp_probe(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_retransmit_synack($arg1, (const struct sock*)$arg2, (const struct request_sock*)$arg3)")
    public static void perf_trace_tcp_retransmit_synack(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tcp_send_reset($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const enum sk_rst_reason)$arg4)")
    public static void perf_trace_tcp_send_reset(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb__nullable, SkDefinitions.sk_rst_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_test_pages_isolated(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long fin_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="perf_trace_tls_contenttype($arg1, (const struct sock*)$arg2, $arg3)")
    public static void perf_trace_tls_contenttype(Ptr<?> __data, Ptr<runtime.sock> sk, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_udp_fail_queue_rcv_skb(Ptr<?> __data, int rc2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_workqueue_activate_work(Ptr<?> __data, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_workqueue_execute_end(Ptr<?> __data, Ptr<misc.work_struct> work, @OriginalName(value="work_func_t") Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_workqueue_execute_start(Ptr<?> __data, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_workqueue_queue_work(Ptr<?> __data, int req_cpu, Ptr<misc.pool_workqueue> pwq, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_trace_x86_exceptions(Ptr<?> __data, @Unsigned long address, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_try_init_event(Ptr<runtime.pmu> pmu2, Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_unpin_context(Ptr<perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void perf_unregister_guest_info_callbacks(Ptr<perf_guest_info_callbacks> cbs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int perf_uprobe_event_init(Ptr<perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long perf_virt_to_phys(@Unsigned long virt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum perf_callchain_context")
    public static enum perf_callchain_context implements Enum<perf_callchain_context>,
    TypedEnum<perf_callchain_context, Long>
    {
        PERF_CONTEXT_HV,
        PERF_CONTEXT_KERNEL,
        PERF_CONTEXT_USER,
        PERF_CONTEXT_GUEST,
        PERF_CONTEXT_GUEST_KERNEL,
        PERF_CONTEXT_GUEST_USER,
        PERF_CONTEXT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_query_bpf")
    @NotUsableInJava
    public static class perf_event_query_bpf
    extends Struct {
        public @Unsigned int ids_len;
        public @Unsigned int prog_cnt;
        public @Unsigned int @Size(value=0) [] ids;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_security_struct")
    @NotUsableInJava
    public static class perf_event_security_struct
    extends Struct {
        public @Unsigned int sid;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_adl_uncore_imc_freerunning_types")
    public static enum perf_adl_uncore_imc_freerunning_types implements Enum<perf_adl_uncore_imc_freerunning_types>,
    TypedEnum<perf_adl_uncore_imc_freerunning_types, Integer>
    {
        ADL_MMIO_UNCORE_IMC_DATA_TOTAL,
        ADL_MMIO_UNCORE_IMC_DATA_READ,
        ADL_MMIO_UNCORE_IMC_DATA_WRITE,
        ADL_MMIO_UNCORE_IMC_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_tgl_uncore_imc_freerunning_types")
    public static enum perf_tgl_uncore_imc_freerunning_types implements Enum<perf_tgl_uncore_imc_freerunning_types>,
    TypedEnum<perf_tgl_uncore_imc_freerunning_types, Integer>
    {
        TGL_MMIO_UNCORE_IMC_DATA_TOTAL,
        TGL_MMIO_UNCORE_IMC_DATA_READ,
        TGL_MMIO_UNCORE_IMC_DATA_WRITE,
        TGL_MMIO_UNCORE_IMC_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_snb_uncore_imc_freerunning_types")
    public static enum perf_snb_uncore_imc_freerunning_types implements Enum<perf_snb_uncore_imc_freerunning_types>,
    TypedEnum<perf_snb_uncore_imc_freerunning_types, Integer>
    {
        SNB_PCI_UNCORE_IMC_DATA_READS,
        SNB_PCI_UNCORE_IMC_DATA_WRITES,
        SNB_PCI_UNCORE_IMC_GT_REQUESTS,
        SNB_PCI_UNCORE_IMC_IA_REQUESTS,
        SNB_PCI_UNCORE_IMC_IO_REQUESTS,
        SNB_PCI_UNCORE_IMC_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_amd_iommu")
    @NotUsableInJava
    public static class perf_amd_iommu
    extends Struct {
        public ListDefinitions.list_head list;
        public runtime.pmu pmu;
        public Ptr<AmdDefinitions.amd_iommu> iommu;
        public char @Size(value=16) [] name;
        public char max_banks;
        public char max_counters;
        public @Unsigned long cntr_assign_mask;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_uncore_spr_imc_freerunning_type_id")
    public static enum perf_uncore_spr_imc_freerunning_type_id implements Enum<perf_uncore_spr_imc_freerunning_type_id>,
    TypedEnum<perf_uncore_spr_imc_freerunning_type_id, Integer>
    {
        SPR_IMC_DCLK,
        SPR_IMC_PQ_CYCLES,
        SPR_IMC_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_uncore_spr_iio_freerunning_type_id")
    public static enum perf_uncore_spr_iio_freerunning_type_id implements Enum<perf_uncore_spr_iio_freerunning_type_id>,
    TypedEnum<perf_uncore_spr_iio_freerunning_type_id, Integer>
    {
        SPR_IIO_MSR_IOCLK,
        SPR_IIO_MSR_BW_IN,
        SPR_IIO_MSR_BW_OUT,
        SPR_IIO_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_uncore_icx_imc_freerunning_type_id")
    public static enum perf_uncore_icx_imc_freerunning_type_id implements Enum<perf_uncore_icx_imc_freerunning_type_id>,
    TypedEnum<perf_uncore_icx_imc_freerunning_type_id, Integer>
    {
        ICX_IMC_DCLK,
        ICX_IMC_DDR,
        ICX_IMC_DDRT,
        ICX_IMC_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_uncore_icx_iio_freerunning_type_id")
    public static enum perf_uncore_icx_iio_freerunning_type_id implements Enum<perf_uncore_icx_iio_freerunning_type_id>,
    TypedEnum<perf_uncore_icx_iio_freerunning_type_id, Integer>
    {
        ICX_IIO_MSR_IOCLK,
        ICX_IIO_MSR_BW_IN,
        ICX_IIO_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_uncore_snr_imc_freerunning_type_id")
    public static enum perf_uncore_snr_imc_freerunning_type_id implements Enum<perf_uncore_snr_imc_freerunning_type_id>,
    TypedEnum<perf_uncore_snr_imc_freerunning_type_id, Integer>
    {
        SNR_IMC_DCLK,
        SNR_IMC_DDR,
        SNR_IMC_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_uncore_snr_iio_freerunning_type_id")
    public static enum perf_uncore_snr_iio_freerunning_type_id implements Enum<perf_uncore_snr_iio_freerunning_type_id>,
    TypedEnum<perf_uncore_snr_iio_freerunning_type_id, Integer>
    {
        SNR_IIO_MSR_IOCLK,
        SNR_IIO_MSR_BW_IN,
        SNR_IIO_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_uncore_iio_freerunning_type_id")
    public static enum perf_uncore_iio_freerunning_type_id implements Enum<perf_uncore_iio_freerunning_type_id>,
    TypedEnum<perf_uncore_iio_freerunning_type_id, Integer>
    {
        SKX_IIO_MSR_IOCLK,
        SKX_IIO_MSR_BW,
        SKX_IIO_MSR_UTIL,
        SKX_IIO_FREERUNNING_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_pmu_format_hybrid_attr")
    @NotUsableInJava
    public static class perf_pmu_format_hybrid_attr
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public @Unsigned long pmu_type;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_ibs")
    @NotUsableInJava
    public static class perf_ibs
    extends Struct {
        public runtime.pmu pmu;
        public @Unsigned int msr;
        public @Unsigned long config_mask;
        public @Unsigned long cnt_mask;
        public @Unsigned long enable_mask;
        public @Unsigned long valid_mask;
        public @Unsigned long max_period;
        public @Unsigned long @Size(value=1) [] offset_mask;
        public int offset_max;
        public @Unsigned int fetch_count_reset_broken;
        public @Unsigned int fetch_ignore_if_zero_rip;
        public Ptr<CpuDefinitions.cpu_perf_ibs> pcpu;
        public Ptr<?> get_count;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_ibs_data")
    @NotUsableInJava
    public static class perf_ibs_data
    extends Struct {
        public @Unsigned int size;
        @InlineUnion(value=27491)
        public @InlineUnion(value=27491) @Unsigned int @Size(value=0) [] data;
        @InlineUnion(value=27491)
        public @InlineUnion(value=27491) @Unsigned int caps;
        public @Unsigned long @Size(value=8) [] regs;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int _data; unsigned int _type; unsigned int _flags; }")
    @NotUsableInJava
    public static class _perf_of_anon_member_of__sigfault_of__sifields_of_compat_siginfo_and__sifields_of_compat_siginfo_t
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int _data;
        public @Unsigned int _type;
        public @Unsigned int _flags;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_aux_event")
    @NotUsableInJava
    public static class perf_aux_event
    extends Struct {
        public perf_event_header header;
        public @Unsigned long hw_id;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_probe_config")
    public static enum perf_probe_config implements Enum<perf_probe_config>,
    TypedEnum<perf_probe_config, Integer>
    {
        PERF_PROBE_CONFIG_IS_RETPROBE,
        PERF_UPROBE_REF_CTR_OFFSET_BITS,
        PERF_UPROBE_REF_CTR_OFFSET_SHIFT;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_text_poke_event")
    @NotUsableInJava
    public static class perf_text_poke_event
    extends Struct {
        public Ptr<?> old_bytes;
        public Ptr<?> new_bytes;
        public @Unsigned long pad;
        public @Unsigned short old_len;
        public @Unsigned short new_len;
        public EventDefinitions.event_id_of_perf_text_poke_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_bpf_event")
    @NotUsableInJava
    public static class perf_bpf_event
    extends Struct {
        public Ptr<BpfDefinitions.bpf_prog> prog;
        public EventDefinitions.event_id_of_perf_bpf_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_ksymbol_event")
    @NotUsableInJava
    public static class perf_ksymbol_event
    extends Struct {
        public String name;
        public int name_len;
        public EventDefinitions.event_id_of_perf_ksymbol_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_switch_event")
    @NotUsableInJava
    public static class perf_switch_event
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<TaskDefinitions.task_struct> next_prev;
        public EventDefinitions.event_id_of_perf_switch_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_mmap_event")
    @NotUsableInJava
    public static class perf_mmap_event
    extends Struct {
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public String file_name;
        public int file_size;
        public int maj;
        public int min;
        public @Unsigned long ino;
        public @Unsigned long ino_generation;
        public @Unsigned int prot;
        public @Unsigned int flags;
        public char @Size(value=20) [] build_id;
        public @Unsigned int build_id_size;
        public EventDefinitions.event_id_of_perf_mmap_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_cgroup_event")
    @NotUsableInJava
    public static class perf_cgroup_event
    extends Struct {
        public String path;
        public int path_size;
        public EventDefinitions.event_id_of_perf_cgroup_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_namespaces_event")
    @NotUsableInJava
    public static class perf_namespaces_event
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public EventDefinitions.event_id_of_perf_namespaces_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_comm_event")
    @NotUsableInJava
    public static class perf_comm_event
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public String comm;
        public int comm_size;
        public EventDefinitions.event_id_of_perf_comm_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_task_event")
    @NotUsableInJava
    public static class perf_task_event
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<perf_event_context> task_ctx;
        public EventDefinitions.event_id_of_perf_task_event event_id;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_read_event")
    @NotUsableInJava
    public static class perf_read_event
    extends Struct {
        public perf_event_header header;
        public @Unsigned int pid;
        public @Unsigned int tid;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_read_data")
    @NotUsableInJava
    public static class perf_read_data
    extends Struct {
        public Ptr<perf_event> event;
        public boolean group;
        public int ret;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_min_heap")
    @NotUsableInJava
    public static class perf_event_min_heap
    extends Struct {
        public int nr;
        public int size;
        public Ptr<Ptr<perf_event>> data;
        public Ptr<perf_event> @Size(value=0) [] preallocated;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_cpu_context")
    @NotUsableInJava
    public static class perf_cpu_context
    extends Struct {
        public perf_event_context ctx;
        public Ptr<perf_event_context> task_ctx;
        public int online;
        public Ptr<perf_cgroup> cgrp;
        public int heap_size;
        public Ptr<Ptr<perf_event>> heap;
        public Ptr<perf_event> @Size(value=2) [] heap_default;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_buffer")
    @NotUsableInJava
    public static class perf_buffer
    extends Struct {
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public misc.callback_head callback_head;
        public int nr_pages;
        public int overwrite;
        public int paused;
        public AtomicDefinitions.atomic_t poll;
        public LocalDefinitions.local_t head;
        public @Unsigned int nest;
        public LocalDefinitions.local_t events;
        public LocalDefinitions.local_t wakeup;
        public LocalDefinitions.local_t lost;
        public long watermark;
        public long aux_watermark;
        public  @OriginalName(value="spinlock_t") runtime.spinlock event_lock;
        public ListDefinitions.list_head event_list;
        public AtomicDefinitions.atomic_t mmap_count;
        public @Unsigned long mmap_locked;
        public Ptr<UserDefinitions.user_struct> mmap_user;
        public runtime.mutex aux_mutex;
        public long aux_head;
        public @Unsigned int aux_nest;
        public long aux_wakeup;
        public @Unsigned long aux_pgoff;
        public int aux_nr_pages;
        public int aux_overwrite;
        public AtomicDefinitions.atomic_t aux_mmap_count;
        public @Unsigned long aux_mmap_locked;
        public Ptr<?> free_aux;
        public  @OriginalName(value="refcount_t") misc.refcount_struct aux_refcount;
        public int aux_in_sampling;
        public Ptr<Ptr<?>> aux_pages;
        public Ptr<?> aux_priv;
        public Ptr<perf_event_mmap_page> user_page;
        public Ptr<?> @Size(value=0) [] data_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_addr_filter")
    @NotUsableInJava
    public static class perf_addr_filter
    extends Struct {
        public ListDefinitions.list_head entry;
        public runtime.path path;
        public @Unsigned long offset;
        public @Unsigned long size;
        public perf_addr_filter_action_t action;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_addr_filter_action_t")
    public static enum perf_addr_filter_action_t implements Enum<perf_addr_filter_action_t>,
    TypedEnum<perf_addr_filter_action_t, Integer>
    {
        PERF_ADDR_FILTER_ACTION_STOP,
        PERF_ADDR_FILTER_ACTION_START,
        PERF_ADDR_FILTER_ACTION_FILTER;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_pmu_scope")
    public static enum perf_pmu_scope implements Enum<perf_pmu_scope>,
    TypedEnum<perf_pmu_scope, Integer>
    {
        PERF_PMU_SCOPE_NONE,
        PERF_PMU_SCOPE_CORE,
        PERF_PMU_SCOPE_DIE,
        PERF_PMU_SCOPE_CLUSTER,
        PERF_PMU_SCOPE_PKG,
        PERF_PMU_SCOPE_SYS_WIDE,
        PERF_PMU_MAX_SCOPE;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_guest_info_callbacks")
    @NotUsableInJava
    public static class perf_guest_info_callbacks
    extends Struct {
        public Ptr<?> state;
        public Ptr<?> get_ip;
        public Ptr<?> handle_intel_pt_intr;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_event_type")
    public static enum perf_event_type implements Enum<perf_event_type>,
    TypedEnum<perf_event_type, Integer>
    {
        PERF_RECORD_MMAP,
        PERF_RECORD_LOST,
        PERF_RECORD_COMM,
        PERF_RECORD_EXIT,
        PERF_RECORD_THROTTLE,
        PERF_RECORD_UNTHROTTLE,
        PERF_RECORD_FORK,
        PERF_RECORD_READ,
        PERF_RECORD_SAMPLE,
        PERF_RECORD_MMAP2,
        PERF_RECORD_AUX,
        PERF_RECORD_ITRACE_START,
        PERF_RECORD_LOST_SAMPLES,
        PERF_RECORD_SWITCH,
        PERF_RECORD_SWITCH_CPU_WIDE,
        PERF_RECORD_NAMESPACES,
        PERF_RECORD_KSYMBOL,
        PERF_RECORD_BPF_EVENT,
        PERF_RECORD_CGROUP,
        PERF_RECORD_TEXT_POKE,
        PERF_RECORD_AUX_OUTPUT_HW_ID,
        PERF_RECORD_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_ns_link_info")
    @NotUsableInJava
    public static class perf_ns_link_info
    extends Struct {
        public @Unsigned long dev;
        public @Unsigned long ino;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_header")
    @NotUsableInJava
    public static class perf_event_header
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short misc;
        public @Unsigned short size;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_event_ioc_flags")
    public static enum perf_event_ioc_flags implements Enum<perf_event_ioc_flags>,
    TypedEnum<perf_event_ioc_flags, Integer>
    {
        PERF_IOC_FLAG_GROUP;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_event_read_format")
    public static enum perf_event_read_format implements Enum<perf_event_read_format>,
    TypedEnum<perf_event_read_format, Integer>
    {
        PERF_FORMAT_TOTAL_TIME_ENABLED,
        PERF_FORMAT_TOTAL_TIME_RUNNING,
        PERF_FORMAT_ID,
        PERF_FORMAT_GROUP,
        PERF_FORMAT_LOST,
        PERF_FORMAT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_sample_regs_abi")
    public static enum perf_sample_regs_abi implements Enum<perf_sample_regs_abi>,
    TypedEnum<perf_sample_regs_abi, Integer>
    {
        PERF_SAMPLE_REGS_ABI_NONE,
        PERF_SAMPLE_REGS_ABI_32,
        PERF_SAMPLE_REGS_ABI_64;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_record_ksymbol_type")
    public static enum perf_record_ksymbol_type implements Enum<perf_record_ksymbol_type>,
    TypedEnum<perf_record_ksymbol_type, Integer>
    {
        PERF_RECORD_KSYMBOL_TYPE_UNKNOWN,
        PERF_RECORD_KSYMBOL_TYPE_BPF,
        PERF_RECORD_KSYMBOL_TYPE_OOL,
        PERF_RECORD_KSYMBOL_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_bpf_event_type")
    public static enum perf_bpf_event_type implements Enum<perf_bpf_event_type>,
    TypedEnum<perf_bpf_event_type, Integer>
    {
        PERF_BPF_EVENT_UNKNOWN,
        PERF_BPF_EVENT_PROG_LOAD,
        PERF_BPF_EVENT_PROG_UNLOAD,
        PERF_BPF_EVENT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_domain")
    @NotUsableInJava
    public static class perf_domain
    extends Struct {
        public Ptr<EmDefinitions.em_perf_domain> em_pd;
        public Ptr<perf_domain> next;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_msr_id")
    public static enum perf_msr_id implements Enum<perf_msr_id>,
    TypedEnum<perf_msr_id, Integer>
    {
        PERF_MSR_TSC,
        PERF_MSR_APERF,
        PERF_MSR_MPERF,
        PERF_MSR_PPERF,
        PERF_MSR_SMI,
        PERF_MSR_PTSC,
        PERF_MSR_IRPERF,
        PERF_MSR_THERM,
        PERF_MSR_EVENT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_event_task_context")
    public static enum perf_event_task_context implements Enum<perf_event_task_context>,
    TypedEnum<perf_event_task_context, Integer>
    {
        perf_invalid_context,
        perf_hw_context,
        perf_sw_context,
        perf_nr_task_contexts;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_msr")
    @NotUsableInJava
    public static class perf_msr
    extends Struct {
        public @Unsigned long msr;
        public Ptr<AttributeDefinitions.attribute_group> grp;
        public Ptr<?> test;
        public boolean no_check;
        public @Unsigned long mask;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_sched")
    @NotUsableInJava
    public static class perf_sched
    extends Struct {
        public int max_weight;
        public int max_events;
        public int max_gp;
        public int saved_states;
        public Ptr<Ptr<EventDefinitions.event_constraint>> constraints;
        public SchedDefinitions.sched_state state;
        public SchedDefinitions.sched_state @Size(value=2) [] saved;
    }

    @Type(noCCodeGeneration=true, cType="union perf_capabilities")
    @NotUsableInJava
    public static class perf_capabilities
    extends Union {
        public AnonDefinitions.anon_member_of_perf_capabilities anon0;
        public @Unsigned long capabilities;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_pmu_events_hybrid_attr")
    @NotUsableInJava
    public static class perf_pmu_events_hybrid_attr
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public @Unsigned long id;
        public String event_str;
        public @Unsigned long pmu_type;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_pmu_events_ht_attr")
    @NotUsableInJava
    public static class perf_pmu_events_ht_attr
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public @Unsigned long id;
        public String event_str_ht;
        public String event_str_noht;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_pmu_events_attr")
    @NotUsableInJava
    public static class perf_pmu_events_attr
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public @Unsigned long id;
        public String event_str;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_callchain_entry_ctx")
    @NotUsableInJava
    public static class perf_callchain_entry_ctx
    extends Struct {
        public Ptr<perf_callchain_entry> entry;
        public @Unsigned int max_stack;
        public @Unsigned int nr;
        public short contexts;
        public boolean contexts_maxed;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_event_x86_regs")
    public static enum perf_event_x86_regs implements Enum<perf_event_x86_regs>,
    TypedEnum<perf_event_x86_regs, Integer>
    {
        PERF_REG_X86_AX,
        PERF_REG_X86_BX,
        PERF_REG_X86_CX,
        PERF_REG_X86_DX,
        PERF_REG_X86_SI,
        PERF_REG_X86_DI,
        PERF_REG_X86_BP,
        PERF_REG_X86_SP,
        PERF_REG_X86_IP,
        PERF_REG_X86_FLAGS,
        PERF_REG_X86_CS,
        PERF_REG_X86_SS,
        PERF_REG_X86_DS,
        PERF_REG_X86_ES,
        PERF_REG_X86_FS,
        PERF_REG_X86_GS,
        PERF_REG_X86_R8,
        PERF_REG_X86_R9,
        PERF_REG_X86_R10,
        PERF_REG_X86_R11,
        PERF_REG_X86_R12,
        PERF_REG_X86_R13,
        PERF_REG_X86_R14,
        PERF_REG_X86_R15,
        PERF_REG_X86_32_MAX,
        PERF_REG_X86_64_MAX,
        PERF_REG_X86_XMM0,
        PERF_REG_X86_XMM1,
        PERF_REG_X86_XMM2,
        PERF_REG_X86_XMM3,
        PERF_REG_X86_XMM4,
        PERF_REG_X86_XMM5,
        PERF_REG_X86_XMM6,
        PERF_REG_X86_XMM7,
        PERF_REG_X86_XMM8,
        PERF_REG_X86_XMM9,
        PERF_REG_X86_XMM10,
        PERF_REG_X86_XMM11,
        PERF_REG_X86_XMM12,
        PERF_REG_X86_XMM13,
        PERF_REG_X86_XMM14,
        PERF_REG_X86_XMM15,
        PERF_REG_X86_XMM_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_guest_switch_msr")
    @NotUsableInJava
    public static class perf_guest_switch_msr
    extends Struct {
        public @Unsigned int msr;
        public @Unsigned long host;
        public @Unsigned long guest;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_mmap_page")
    @NotUsableInJava
    public static class perf_event_mmap_page
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int compat_version;
        public @Unsigned int lock;
        public @Unsigned int index;
        public long offset;
        public @Unsigned long time_enabled;
        public @Unsigned long time_running;
        @InlineUnion(value=3465)
        public @InlineUnion(value=3465) @Unsigned long capabilities;
        @InlineUnion(value=3465)
        public  @InlineUnion(value=3465) AnonDefinitions.anon_member_of_anon_member_of_perf_event_mmap_page anon7$1;
        public @Unsigned short pmc_width;
        public @Unsigned short time_shift;
        public @Unsigned int time_mult;
        public @Unsigned long time_offset;
        public @Unsigned long time_zero;
        public @Unsigned int size;
        public @Unsigned int __reserved_1;
        public @Unsigned long time_cycles;
        public @Unsigned long time_mask;
        public char @Size(value=928) [] __reserved;
        public @Unsigned long data_head;
        public @Unsigned long data_tail;
        public @Unsigned long data_offset;
        public @Unsigned long data_size;
        public @Unsigned long aux_head;
        public @Unsigned long aux_tail;
        public @Unsigned long aux_offset;
        public @Unsigned long aux_size;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_branch_sample_type")
    public static enum perf_branch_sample_type implements Enum<perf_branch_sample_type>,
    TypedEnum<perf_branch_sample_type, Integer>
    {
        PERF_SAMPLE_BRANCH_USER,
        PERF_SAMPLE_BRANCH_KERNEL,
        PERF_SAMPLE_BRANCH_HV,
        PERF_SAMPLE_BRANCH_ANY,
        PERF_SAMPLE_BRANCH_ANY_CALL,
        PERF_SAMPLE_BRANCH_ANY_RETURN,
        PERF_SAMPLE_BRANCH_IND_CALL,
        PERF_SAMPLE_BRANCH_ABORT_TX,
        PERF_SAMPLE_BRANCH_IN_TX,
        PERF_SAMPLE_BRANCH_NO_TX,
        PERF_SAMPLE_BRANCH_COND,
        PERF_SAMPLE_BRANCH_CALL_STACK,
        PERF_SAMPLE_BRANCH_IND_JUMP,
        PERF_SAMPLE_BRANCH_CALL,
        PERF_SAMPLE_BRANCH_NO_FLAGS,
        PERF_SAMPLE_BRANCH_NO_CYCLES,
        PERF_SAMPLE_BRANCH_TYPE_SAVE,
        PERF_SAMPLE_BRANCH_HW_INDEX,
        PERF_SAMPLE_BRANCH_PRIV_SAVE,
        PERF_SAMPLE_BRANCH_COUNTERS,
        PERF_SAMPLE_BRANCH_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_branch_sample_type_shift")
    public static enum perf_branch_sample_type_shift implements Enum<perf_branch_sample_type_shift>,
    TypedEnum<perf_branch_sample_type_shift, Integer>
    {
        PERF_SAMPLE_BRANCH_USER_SHIFT,
        PERF_SAMPLE_BRANCH_KERNEL_SHIFT,
        PERF_SAMPLE_BRANCH_HV_SHIFT,
        PERF_SAMPLE_BRANCH_ANY_SHIFT,
        PERF_SAMPLE_BRANCH_ANY_CALL_SHIFT,
        PERF_SAMPLE_BRANCH_ANY_RETURN_SHIFT,
        PERF_SAMPLE_BRANCH_IND_CALL_SHIFT,
        PERF_SAMPLE_BRANCH_ABORT_TX_SHIFT,
        PERF_SAMPLE_BRANCH_IN_TX_SHIFT,
        PERF_SAMPLE_BRANCH_NO_TX_SHIFT,
        PERF_SAMPLE_BRANCH_COND_SHIFT,
        PERF_SAMPLE_BRANCH_CALL_STACK_SHIFT,
        PERF_SAMPLE_BRANCH_IND_JUMP_SHIFT,
        PERF_SAMPLE_BRANCH_CALL_SHIFT,
        PERF_SAMPLE_BRANCH_NO_FLAGS_SHIFT,
        PERF_SAMPLE_BRANCH_NO_CYCLES_SHIFT,
        PERF_SAMPLE_BRANCH_TYPE_SAVE_SHIFT,
        PERF_SAMPLE_BRANCH_HW_INDEX_SHIFT,
        PERF_SAMPLE_BRANCH_PRIV_SAVE_SHIFT,
        PERF_SAMPLE_BRANCH_COUNTERS_SHIFT,
        PERF_SAMPLE_BRANCH_MAX_SHIFT;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_event_sample_format")
    public static enum perf_event_sample_format implements Enum<perf_event_sample_format>,
    TypedEnum<perf_event_sample_format, Integer>
    {
        PERF_SAMPLE_IP,
        PERF_SAMPLE_TID,
        PERF_SAMPLE_TIME,
        PERF_SAMPLE_ADDR,
        PERF_SAMPLE_READ,
        PERF_SAMPLE_CALLCHAIN,
        PERF_SAMPLE_ID,
        PERF_SAMPLE_CPU,
        PERF_SAMPLE_PERIOD,
        PERF_SAMPLE_STREAM_ID,
        PERF_SAMPLE_RAW,
        PERF_SAMPLE_BRANCH_STACK,
        PERF_SAMPLE_REGS_USER,
        PERF_SAMPLE_STACK_USER,
        PERF_SAMPLE_WEIGHT,
        PERF_SAMPLE_DATA_SRC,
        PERF_SAMPLE_IDENTIFIER,
        PERF_SAMPLE_TRANSACTION,
        PERF_SAMPLE_REGS_INTR,
        PERF_SAMPLE_PHYS_ADDR,
        PERF_SAMPLE_AUX,
        PERF_SAMPLE_CGROUP,
        PERF_SAMPLE_DATA_PAGE_SIZE,
        PERF_SAMPLE_CODE_PAGE_SIZE,
        PERF_SAMPLE_WEIGHT_STRUCT,
        PERF_SAMPLE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_hw_cache_op_result_id")
    public static enum perf_hw_cache_op_result_id implements Enum<perf_hw_cache_op_result_id>,
    TypedEnum<perf_hw_cache_op_result_id, Integer>
    {
        PERF_COUNT_HW_CACHE_RESULT_ACCESS,
        PERF_COUNT_HW_CACHE_RESULT_MISS,
        PERF_COUNT_HW_CACHE_RESULT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_hw_cache_op_id")
    public static enum perf_hw_cache_op_id implements Enum<perf_hw_cache_op_id>,
    TypedEnum<perf_hw_cache_op_id, Integer>
    {
        PERF_COUNT_HW_CACHE_OP_READ,
        PERF_COUNT_HW_CACHE_OP_WRITE,
        PERF_COUNT_HW_CACHE_OP_PREFETCH,
        PERF_COUNT_HW_CACHE_OP_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_hw_cache_id")
    public static enum perf_hw_cache_id implements Enum<perf_hw_cache_id>,
    TypedEnum<perf_hw_cache_id, Integer>
    {
        PERF_COUNT_HW_CACHE_L1D,
        PERF_COUNT_HW_CACHE_L1I,
        PERF_COUNT_HW_CACHE_LL,
        PERF_COUNT_HW_CACHE_DTLB,
        PERF_COUNT_HW_CACHE_ITLB,
        PERF_COUNT_HW_CACHE_BPU,
        PERF_COUNT_HW_CACHE_NODE,
        PERF_COUNT_HW_CACHE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_hw_id")
    public static enum perf_hw_id implements Enum<perf_hw_id>,
    TypedEnum<perf_hw_id, Integer>
    {
        PERF_COUNT_HW_CPU_CYCLES,
        PERF_COUNT_HW_INSTRUCTIONS,
        PERF_COUNT_HW_CACHE_REFERENCES,
        PERF_COUNT_HW_CACHE_MISSES,
        PERF_COUNT_HW_BRANCH_INSTRUCTIONS,
        PERF_COUNT_HW_BRANCH_MISSES,
        PERF_COUNT_HW_BUS_CYCLES,
        PERF_COUNT_HW_STALLED_CYCLES_FRONTEND,
        PERF_COUNT_HW_STALLED_CYCLES_BACKEND,
        PERF_COUNT_HW_REF_CPU_CYCLES,
        PERF_COUNT_HW_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum perf_type_id")
    public static enum perf_type_id implements Enum<perf_type_id>,
    TypedEnum<perf_type_id, Integer>
    {
        PERF_TYPE_HARDWARE,
        PERF_TYPE_SOFTWARE,
        PERF_TYPE_TRACEPOINT,
        PERF_TYPE_HW_CACHE,
        PERF_TYPE_RAW,
        PERF_TYPE_BREAKPOINT,
        PERF_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int type; union { struct { long long unsigned int file_name; unsigned int name_len; unsigned int offset; long long unsigned int cookie; } uprobe; struct { long long unsigned int func_name; unsigned int name_len; unsigned int offset; long long unsigned int addr; long long unsigned int missed; long long unsigned int cookie; } kprobe; struct { long long unsigned int tp_name; unsigned int name_len; long long unsigned int cookie; } tracepoint; struct { long long unsigned int config; unsigned int type; long long unsigned int cookie; } event; }; }")
    @NotUsableInJava
    public static class perf_event_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned int type;
        @InlineUnion(value=3390)
        public  @InlineUnion(value=3390) UprobeDefinitions.uprobe_of_anon_member_of_perf_event_of_anon_member_of_bpf_link_info uprobe;
        @InlineUnion(value=3390)
        public  @InlineUnion(value=3390) KprobeDefinitions.kprobe_of_anon_member_of_perf_event_of_anon_member_of_bpf_link_info kprobe;
        @InlineUnion(value=3390)
        public  @InlineUnion(value=3390) misc.tracepoint_of_anon_member_of_perf_event_of_anon_member_of_bpf_link_info tracepoint;
        @InlineUnion(value=3390)
        public  @InlineUnion(value=3390) EventDefinitions.event_of_anon_member_of_perf_event_of_anon_member_of_bpf_link_info event;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_cgroup_info")
    @NotUsableInJava
    public static class perf_cgroup_info
    extends Struct {
        public @Unsigned long time;
        public @Unsigned long timestamp;
        public @Unsigned long timeoffset;
        public int active;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_groups")
    @NotUsableInJava
    public static class perf_event_groups
    extends Struct {
        public RbDefinitions.rb_root tree;
        public @Unsigned long index;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_cgroup")
    @NotUsableInJava
    public static class perf_cgroup
    extends Struct {
        public CgroupDefinitions.cgroup_subsys_state css;
        public Ptr<perf_cgroup_info> info;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_sample_data")
    @NotUsableInJava
    public static class perf_sample_data
    extends Struct {
        public @Unsigned long sample_flags;
        public @Unsigned long period;
        public @Unsigned long dyn_size;
        public @Unsigned long type;
        public misc.tid_entry_of_perf_sample_data tid_entry;
        public @Unsigned long time;
        public @Unsigned long id;
        public CpuDefinitions.cpu_entry_of_perf_sample_data cpu_entry;
        public @Unsigned long ip;
        public Ptr<perf_callchain_entry> callchain;
        public Ptr<perf_raw_record> raw;
        public Ptr<perf_branch_stack> br_stack;
        public Ptr<@Unsigned Long> br_stack_cntr;
        public perf_sample_weight weight;
        public perf_mem_data_src data_src;
        public @Unsigned long txn;
        public perf_regs regs_user;
        public perf_regs regs_intr;
        public @Unsigned long stack_user_size;
        public @Unsigned long stream_id;
        public @Unsigned long cgroup;
        public @Unsigned long addr;
        public @Unsigned long phys_addr;
        public @Unsigned long data_page_size;
        public @Unsigned long code_page_size;
        public @Unsigned long aux_size;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_event_state")
    public static enum perf_event_state implements Enum<perf_event_state>,
    TypedEnum<perf_event_state, Integer>
    {
        PERF_EVENT_STATE_DEAD,
        PERF_EVENT_STATE_EXIT,
        PERF_EVENT_STATE_ERROR,
        PERF_EVENT_STATE_OFF,
        PERF_EVENT_STATE_INACTIVE,
        PERF_EVENT_STATE_ACTIVE;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_addr_filter_range")
    @NotUsableInJava
    public static class perf_addr_filter_range
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_addr_filters_head")
    @NotUsableInJava
    public static class perf_addr_filters_head
    extends Struct {
        public ListDefinitions.list_head list;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned int nr_file_filters;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_output_handle")
    @NotUsableInJava
    public static class perf_output_handle
    extends Struct {
        public Ptr<perf_event> event;
        public Ptr<perf_buffer> rb;
        public @Unsigned long wakeup;
        public @Unsigned long size;
        public @Unsigned long aux_flags;
        @InlineUnion(value=2116)
        public @InlineUnion(value=2116) Ptr<?> addr;
        @InlineUnion(value=2116)
        public @InlineUnion(value=2116) @Unsigned long head;
        public int page;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_pmu_context")
    @NotUsableInJava
    public static class perf_event_pmu_context
    extends Struct {
        public Ptr<runtime.pmu> pmu;
        public Ptr<perf_event_context> ctx;
        public ListDefinitions.list_head pmu_ctx_entry;
        public ListDefinitions.list_head pinned_active;
        public ListDefinitions.list_head flexible_active;
        public @Unsigned int embedded;
        public @Unsigned int nr_events;
        public @Unsigned int nr_cgroups;
        public @Unsigned int nr_freq;
        public AtomicDefinitions.atomic_t refcount;
        public misc.callback_head callback_head;
        public Ptr<?> task_ctx_data;
        public int rotate_necessary;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_cpu_pmu_context")
    @NotUsableInJava
    public static class perf_cpu_pmu_context
    extends Struct {
        public perf_event_pmu_context epc;
        public Ptr<perf_event_pmu_context> task_epc;
        public ListDefinitions.list_head sched_cb_entry;
        public int sched_cb_usage;
        public int active_oncpu;
        public int exclusive;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock hrtimer_lock;
        public runtime.hrtimer hrtimer;
        public @OriginalName(value="ktime_t") long hrtimer_interval;
        public @Unsigned int hrtimer_active;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_branch_stack")
    @NotUsableInJava
    public static class perf_branch_stack
    extends Struct {
        public @Unsigned long nr;
        public @Unsigned long hw_idx;
        public perf_branch_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_raw_record")
    @NotUsableInJava
    public static class perf_raw_record
    extends Struct {
        public perf_raw_frag frag;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_raw_frag")
    @NotUsableInJava
    public static class perf_raw_frag
    extends Struct {
        @InlineUnion(value=2046)
        public @InlineUnion(value=2046) Ptr<perf_raw_frag> next;
        @InlineUnion(value=2046)
        public @InlineUnion(value=2046) @Unsigned long pad;
        public @OriginalName(value="perf_copy_f") Ptr<?> copy;
        public Ptr<?> data;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_callchain_entry")
    @NotUsableInJava
    public static class perf_callchain_entry
    extends Struct {
        public @Unsigned long nr;
        public @Unsigned long @Size(value=0) [] ip;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int bpf_cookie; }")
    @NotUsableInJava
    public static class perf_event_of_anon_member_of_link_create_of_bpf_attr
    extends Struct {
        public @Unsigned long bpf_cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_regs")
    @NotUsableInJava
    public static class perf_regs
    extends Struct {
        public @Unsigned long abi;
        public Ptr<PtDefinitions.pt_regs> regs;
    }

    @Type(noCCodeGeneration=true, cType="union perf_sample_weight")
    @NotUsableInJava
    public static class perf_sample_weight
    extends Union {
        public @Unsigned long full;
        public AnonDefinitions.anon_member_of_perf_sample_weight anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_branch_entry")
    @NotUsableInJava
    public static class perf_branch_entry
    extends Struct {
        public @Unsigned long from;
        public @Unsigned long to;
        public @Unsigned long mispred;
        public @Unsigned long predicted;
        public @Unsigned long in_tx;
        public @Unsigned long abort;
        public @Unsigned long cycles;
        public @Unsigned long type;
        public @Unsigned long spec;
        public @Unsigned long new_type;
        public @Unsigned long priv;
        public @Unsigned long reserved;
    }

    @Type(noCCodeGeneration=true, cType="union perf_mem_data_src")
    @NotUsableInJava
    public static class perf_mem_data_src
    extends Union {
        public @Unsigned long val;
        public AnonDefinitions.anon_member_of_perf_mem_data_src anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_attr")
    @NotUsableInJava
    public static class perf_event_attr
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int size;
        public @Unsigned long config;
        @InlineUnion(value=1640)
        public @InlineUnion(value=1640) @Unsigned long sample_period;
        @InlineUnion(value=1640)
        public @InlineUnion(value=1640) @Unsigned long sample_freq;
        public @Unsigned long sample_type;
        public @Unsigned long read_format;
        public @Unsigned long disabled;
        public @Unsigned long inherit;
        public @Unsigned long pinned;
        public @Unsigned long exclusive;
        public @Unsigned long exclude_user;
        public @Unsigned long exclude_kernel;
        public @Unsigned long exclude_hv;
        public @Unsigned long exclude_idle;
        public @Unsigned long mmap;
        public @Unsigned long comm;
        public @Unsigned long freq;
        public @Unsigned long inherit_stat;
        public @Unsigned long enable_on_exec;
        public @Unsigned long task;
        public @Unsigned long watermark;
        public @Unsigned long precise_ip;
        public @Unsigned long mmap_data;
        public @Unsigned long sample_id_all;
        public @Unsigned long exclude_host;
        public @Unsigned long exclude_guest;
        public @Unsigned long exclude_callchain_kernel;
        public @Unsigned long exclude_callchain_user;
        public @Unsigned long mmap2;
        public @Unsigned long comm_exec;
        public @Unsigned long use_clockid;
        public @Unsigned long context_switch;
        public @Unsigned long write_backward;
        public @Unsigned long namespaces;
        public @Unsigned long ksymbol;
        public @Unsigned long bpf_event;
        public @Unsigned long aux_output;
        public @Unsigned long cgroup;
        public @Unsigned long text_poke;
        public @Unsigned long build_id;
        public @Unsigned long inherit_thread;
        public @Unsigned long remove_on_exec;
        public @Unsigned long sigtrap;
        public @Unsigned long __reserved_1;
        @InlineUnion(value=1641)
        public @InlineUnion(value=1641) @Unsigned int wakeup_events;
        @InlineUnion(value=1641)
        public @InlineUnion(value=1641) @Unsigned int wakeup_watermark;
        public @Unsigned int bp_type;
        @InlineUnion(value=1642)
        public @InlineUnion(value=1642) @Unsigned long bp_addr;
        @InlineUnion(value=1642)
        public @InlineUnion(value=1642) @Unsigned long kprobe_func;
        @InlineUnion(value=1642)
        public @InlineUnion(value=1642) @Unsigned long uprobe_path;
        @InlineUnion(value=1642)
        public @InlineUnion(value=1642) @Unsigned long config1;
        @InlineUnion(value=1643)
        public @InlineUnion(value=1643) @Unsigned long bp_len;
        @InlineUnion(value=1643)
        public @InlineUnion(value=1643) @Unsigned long kprobe_addr;
        @InlineUnion(value=1643)
        public @InlineUnion(value=1643) @Unsigned long probe_offset;
        @InlineUnion(value=1643)
        public @InlineUnion(value=1643) @Unsigned long config2;
        public @Unsigned long branch_sample_type;
        public @Unsigned long sample_regs_user;
        public @Unsigned int sample_stack_user;
        public int clockid;
        public @Unsigned long sample_regs_intr;
        public @Unsigned int aux_watermark;
        public @Unsigned short sample_max_stack;
        public @Unsigned short __reserved_2;
        public @Unsigned int aux_sample_size;
        public @Unsigned int __reserved_3;
        public @Unsigned long sig_data;
        public @Unsigned long config3;
    }

    @Type(noCCodeGeneration=true, cType="enum perf_sw_ids")
    public static enum perf_sw_ids implements Enum<perf_sw_ids>,
    TypedEnum<perf_sw_ids, Integer>
    {
        PERF_COUNT_SW_CPU_CLOCK,
        PERF_COUNT_SW_TASK_CLOCK,
        PERF_COUNT_SW_PAGE_FAULTS,
        PERF_COUNT_SW_CONTEXT_SWITCHES,
        PERF_COUNT_SW_CPU_MIGRATIONS,
        PERF_COUNT_SW_PAGE_FAULTS_MIN,
        PERF_COUNT_SW_PAGE_FAULTS_MAJ,
        PERF_COUNT_SW_ALIGNMENT_FAULTS,
        PERF_COUNT_SW_EMULATION_FAULTS,
        PERF_COUNT_SW_DUMMY,
        PERF_COUNT_SW_BPF_OUTPUT,
        PERF_COUNT_SW_CGROUP_SWITCHES,
        PERF_COUNT_SW_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct perf_event_context")
    @NotUsableInJava
    public static class perf_event_context
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public runtime.mutex mutex;
        public ListDefinitions.list_head pmu_ctx_list;
        public perf_event_groups pinned_groups;
        public perf_event_groups flexible_groups;
        public ListDefinitions.list_head event_list;
        public int nr_events;
        public int nr_user;
        public int is_active;
        public int nr_task_data;
        public int nr_stat;
        public int nr_freq;
        public int rotate_disable;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public Ptr<TaskDefinitions.task_struct> task;
        public @Unsigned long time;
        public @Unsigned long timestamp;
        public @Unsigned long timeoffset;
        public Ptr<perf_event_context> parent_ctx;
        public @Unsigned long parent_gen;
        public @Unsigned long generation;
        public int pin_count;
        public int nr_cgroups;
        public misc.callback_head callback_head;
        public LocalDefinitions.local_t nr_no_switch_fast;
    }

    @Type(noCCodeGeneration=true, cType="struct perf_event")
    @NotUsableInJava
    public static class perf_event
    extends Struct {
        public ListDefinitions.list_head event_entry;
        public ListDefinitions.list_head sibling_list;
        public ListDefinitions.list_head active_list;
        public RbDefinitions.rb_node group_node;
        public @Unsigned long group_index;
        public ListDefinitions.list_head migrate_entry;
        public misc.hlist_node hlist_entry;
        public ListDefinitions.list_head active_entry;
        public int nr_siblings;
        public int event_caps;
        public int group_caps;
        public @Unsigned int group_generation;
        public Ptr<perf_event> group_leader;
        public Ptr<runtime.pmu> pmu;
        public Ptr<?> pmu_private;
        public perf_event_state state;
        public @Unsigned int attach_state;
        public misc.local64_t count;
        public misc.atomic64_t child_count;
        public @Unsigned long total_time_enabled;
        public @Unsigned long total_time_running;
        public @Unsigned long tstamp;
        public perf_event_attr attr;
        public @Unsigned short header_size;
        public @Unsigned short id_header_size;
        public @Unsigned short read_size;
        public HwDefinitions.hw_perf_event hw;
        public Ptr<perf_event_context> ctx;
        public Ptr<perf_event_pmu_context> pmu_ctx;
        public  @OriginalName(value="atomic_long_t") misc.atomic64_t refcount;
        public misc.atomic64_t child_total_time_enabled;
        public misc.atomic64_t child_total_time_running;
        public runtime.mutex child_mutex;
        public ListDefinitions.list_head child_list;
        public Ptr<perf_event> parent;
        public int oncpu;
        public int cpu;
        public ListDefinitions.list_head owner_entry;
        public Ptr<TaskDefinitions.task_struct> owner;
        public runtime.mutex mmap_mutex;
        public AtomicDefinitions.atomic_t mmap_count;
        public Ptr<perf_buffer> rb;
        public ListDefinitions.list_head rb_entry;
        public @Unsigned long rcu_batches;
        public int rcu_pending;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitq;
        public Ptr<misc.fasync_struct> fasync;
        public @Unsigned int pending_wakeup;
        public @Unsigned int pending_kill;
        public @Unsigned int pending_disable;
        public @Unsigned long pending_addr;
        public IrqDefinitions.irq_work pending_irq;
        public IrqDefinitions.irq_work pending_disable_irq;
        public misc.callback_head pending_task;
        public @Unsigned int pending_work;
        public runtime.rcuwait pending_work_wait;
        public AtomicDefinitions.atomic_t event_limit;
        public perf_addr_filters_head addr_filters;
        public Ptr<perf_addr_filter_range> addr_filter_ranges;
        public @Unsigned long addr_filters_gen;
        public Ptr<perf_event> aux_event;
        public Ptr<?> destroy;
        public misc.callback_head callback_head;
        public Ptr<PidDefinitions.pid_namespace> ns;
        public @Unsigned long id;
        public misc.atomic64_t lost_samples;
        public Ptr<?> clock;
        public @OriginalName(value="perf_overflow_handler_t") Ptr<?> overflow_handler;
        public Ptr<?> overflow_handler_context;
        public Ptr<BpfDefinitions.bpf_prog> prog;
        public @Unsigned long bpf_cookie;
        public Ptr<TraceDefinitions.trace_event_call> tp_event;
        public Ptr<EventDefinitions.event_filter> filter;
        public FtraceDefinitions.ftrace_ops ftrace_ops;
        public Ptr<perf_cgroup> cgrp;
        public Ptr<?> security;
        public ListDefinitions.list_head sb_list;
        public @Unsigned int orig_type;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int _data; unsigned int _type; unsigned int _flags; }")
    @NotUsableInJava
    public static class _perf_of_anon_member_of__sigfault_of___sifields
    extends Struct {
        public @Unsigned long _data;
        public @Unsigned int _type;
        public @Unsigned int _flags;
    }
}

