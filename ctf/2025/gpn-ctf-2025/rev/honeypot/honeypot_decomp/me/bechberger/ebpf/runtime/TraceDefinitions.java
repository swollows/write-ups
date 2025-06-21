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
import me.bechberger.ebpf.runtime.ActionDefinitions;
import me.bechberger.ebpf.runtime.ArrayDefinitions;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CacheDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.CondDefinitions;
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
import me.bechberger.ebpf.runtime.DynDefinitions;
import me.bechberger.ebpf.runtime.DyneventDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.EventfsDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FgraphDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FlushDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.HandshakeDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.HwlatDefinitions;
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
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
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
import me.bechberger.ebpf.runtime.PrintDefinitions;
import me.bechberger.ebpf.runtime.ProbeDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.PwmDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.ReclaimDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.RpmDefinitions;
import me.bechberger.ebpf.runtime.RtcDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SelinuxDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SyncDefinitions;
import me.bechberger.ebpf.runtime.SynthDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TaskletDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TimerlatDefinitions;
import me.bechberger.ebpf.runtime.TmigrDefinitions;
import me.bechberger.ebpf.runtime.UprobeDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WatchdogDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XbcDefinitions;
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

public final class TraceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_array_puts($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int __trace_array_puts(Ptr<trace_array> tr, @Unsigned long ip, String str, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_array_vprintk($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int __trace_array_vprintk(Ptr<trace_buffer> buffer, @Unsigned long ip, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_bputs($arg1, (const u8*)$arg2)")
    public static int __trace_bputs(@Unsigned long ip, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __trace_find_cmdline(int pid2, String comm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_fprobe_create($arg1, (const u8**)$arg2)")
    public static int __trace_fprobe_create(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_kprobe_create($arg1, (const u8**)$arg2)")
    public static int __trace_kprobe_create(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_puts($arg1, (const u8*)$arg2, $arg3)")
    public static int __trace_puts(@Unsigned long ip, String str, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __trace_stack(Ptr<trace_array> tr, @Unsigned int trace_ctx, int skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_alloc_tgid_map() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_array_create_dir(Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_array_create_systems((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<trace_array> trace_array_create_systems(String name, String systems, @Unsigned long range_addr_start, @Unsigned long range_addr_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_array_destroy(Ptr<trace_array> this_tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_array_find((const u8*)$arg1)")
    public static Ptr<trace_array> trace_array_find(String instance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_array_find_get((const u8*)$arg1)")
    public static Ptr<trace_array> trace_array_find_get(String instance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_array_get(Ptr<trace_array> this_tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_array_get_by_name((const u8*)$arg1, (const u8*)$arg2)")
    public static Ptr<trace_array> trace_array_get_by_name(String name, String systems) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_array_init_printk(Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_array_printk($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static int trace_array_printk(Ptr<trace_array> tr, @Unsigned long ip, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_array_printk_buf($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static int trace_array_printk_buf(Ptr<trace_buffer> buffer, @Unsigned long ip, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_array_put(Ptr<trace_array> this_tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_array_vprintk($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int trace_array_vprintk(Ptr<trace_array> tr, @Unsigned long ip, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.vfsmount> trace_automount(Ptr<runtime.dentry> mntpt, Ptr<?> ingore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_boot_add_kprobe_event($arg1, (const u8*)$arg2)")
    public static int trace_boot_add_kprobe_event(Ptr<XbcDefinitions.xbc_node> node2, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_boot_add_synth_event($arg1, (const u8*)$arg2)")
    public static int trace_boot_add_synth_event(Ptr<XbcDefinitions.xbc_node> node2, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_boot_compose_hist_cmd(Ptr<XbcDefinitions.xbc_node> hnode, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_boot_enable_events(Ptr<trace_array> tr, Ptr<XbcDefinitions.xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_boot_hist_add_array($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int trace_boot_hist_add_array(Ptr<XbcDefinitions.xbc_node> hnode, Ptr<String> bufp, String end, String key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_boot_hist_add_handlers($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int trace_boot_hist_add_handlers(Ptr<XbcDefinitions.xbc_node> hnode, Ptr<String> bufp, String end, String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_boot_hist_add_one_handler($arg1, $arg2, $arg3, (const u8*)$arg4, (const u8*)$arg5)")
    public static int trace_boot_hist_add_one_handler(Ptr<XbcDefinitions.xbc_node> hnode, Ptr<String> bufp, String end, String handler, String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_boot_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_boot_init_one_event(Ptr<trace_array> tr, Ptr<XbcDefinitions.xbc_node> gnode, Ptr<XbcDefinitions.xbc_node> enode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_boot_init_one_instance(Ptr<trace_array> tr, Ptr<XbcDefinitions.xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_boot_set_ftrace_filter(Ptr<trace_array> tr, Ptr<XbcDefinitions.xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_boot_set_instance_options(Ptr<trace_array> tr, Ptr<XbcDefinitions.xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RingDefinitions.ring_buffer_event> trace_buffer_lock_reserve(Ptr<trace_buffer> buffer, int type2, @Unsigned long len, @Unsigned int trace_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_buffer_unlock_commit_nostack(Ptr<trace_buffer> buffer, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_buffer_unlock_commit_regs(Ptr<trace_array> tr, Ptr<trace_buffer> buffer, Ptr<RingDefinitions.ring_buffer_event> event2, @Unsigned int trace_ctx, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_buffered_event_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_buffered_event_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_check_vprintf($arg1, (const u8*)$arg2, $arg3)")
    public static void trace_check_vprintf(Ptr<trace_iterator> iter2, String fmt, Ptr<misc.__va_list_tag> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_clock_in_ns(Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_consume(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_create_file((const u8*)$arg1, $arg2, $arg3, $arg4, (const struct file_operations*)$arg5)")
    public static Ptr<runtime.dentry> trace_create_file(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<?> data, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_create_savedcmd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_default_header(Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_die_panic_handler(Ptr<misc.notifier_block> self, @Unsigned long ev, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_dump_stack(int skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_empty(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_eval_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_eval_sync() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_buffer_commit(Ptr<trace_event_buffer> fbuffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RingDefinitions.ring_buffer_event> trace_event_buffer_lock_reserve(Ptr<Ptr<trace_buffer>> current_rb, Ptr<trace_event_file> trace_file, int type2, @Unsigned long len, @Unsigned int trace_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)trace_event_format($arg1, (const u8*)$arg2))")
    public static String trace_event_format(Ptr<trace_iterator> iter2, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_icc_set_bw(Ptr<trace_event_data_offsets_icc_set_bw> __data_offsets, Ptr<IccDefinitions.icc_path> p, Ptr<IccDefinitions.icc_node> n, int i, @Unsigned int avg_bw, @Unsigned int peak_bw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_icc_set_bw_end(Ptr<trace_event_data_offsets_icc_set_bw_end> __data_offsets, Ptr<IccDefinitions.icc_path> p, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)trace_event_name($arg1))")
    public static String trace_event_name(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ack_update_msk(Ptr<?> __data, @Unsigned long data_ack, @Unsigned long old_snd_una, @Unsigned long new_snd_una, @Unsigned long new_wnd_end, @Unsigned long msk_wnd_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_alloc_vmap_area(Ptr<?> __data, @Unsigned long addr2, @Unsigned long size, @Unsigned long align, @Unsigned long vstart, @Unsigned long vend, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_amd_pstate_perf(Ptr<?> __data, @Unsigned long min_perf, @Unsigned long target_perf, @Unsigned long capacity, @Unsigned long freq, @Unsigned long mperf, @Unsigned long aperf, @Unsigned long tsc, @Unsigned int cpu_id2, boolean changed, boolean fast_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_bpf_test_finish(Ptr<?> __data, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_bpf_trigger_tp(Ptr<?> __data, int nonce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_bpf_xdp_link_attach_failed($arg1, (const u8*)$arg2)")
    public static void trace_event_raw_event_bpf_xdp_link_attach_failed(Ptr<?> __data, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_contention_begin(Ptr<?> __data, Ptr<?> lock, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_contention_end(Ptr<?> __data, Ptr<?> lock, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_cpuhp_enter($arg1, $arg2, $arg3, $arg4, (int (*)(unsigned int))$arg5)")
    public static void trace_event_raw_event_cpuhp_enter(Ptr<?> __data, @Unsigned int cpu2, int target, int idx, Ptr<?> fun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cpuhp_exit(Ptr<?> __data, @Unsigned int cpu2, int state2, int idx, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_cpuhp_multi_enter($arg1, $arg2, $arg3, $arg4, (int (*)(unsigned int, struct hlist_node*))$arg5, $arg6)")
    public static void trace_event_raw_event_cpuhp_multi_enter(Ptr<?> __data, @Unsigned int cpu2, int target, int idx, Ptr<?> fun, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_drm_vblank_event(Ptr<?> __data, int crtc, @Unsigned int seq, @OriginalName(value="ktime_t") long time, boolean high_prec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_drm_vblank_event_delivered(Ptr<?> __data, Ptr<DrmDefinitions.drm_file> file2, int crtc, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_drm_vblank_event_queued(Ptr<?> __data, Ptr<DrmDefinitions.drm_file> file2, int crtc, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_free_vmap_area_noflush(Ptr<?> __data, @Unsigned long va_start, @Unsigned long nr_lazy, @Unsigned long nr_lazy_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_hwmon_attr_class($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void trace_event_raw_event_hwmon_attr_class(Ptr<?> __data, int index2, String attr_name, long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_hwmon_attr_show_string($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void trace_event_raw_event_hwmon_attr_show_string(Ptr<?> __data, int index2, String attr_name, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_hyperv_mmu_flush_tlb_multi($arg1, (const struct cpumask*)$arg2, (const struct flush_tlb_info*)$arg3)")
    public static void trace_event_raw_event_hyperv_mmu_flush_tlb_multi(Ptr<?> __data, Ptr<runtime.cpumask> cpus, Ptr<FlushDefinitions.flush_tlb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hyperv_nested_flush_guest_mapping(Ptr<?> __data, @Unsigned long as, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hyperv_nested_flush_guest_mapping_range(Ptr<?> __data, @Unsigned long as, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_hyperv_send_ipi_mask($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static void trace_event_raw_event_hyperv_send_ipi_mask(Ptr<?> __data, Ptr<runtime.cpumask> cpus, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hyperv_send_ipi_one(Ptr<?> __data, int cpu2, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_icc_set_bw(Ptr<?> __data, Ptr<IccDefinitions.icc_path> p, Ptr<IccDefinitions.icc_node> n, int i, @Unsigned int avg_bw, @Unsigned int peak_bw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_icc_set_bw_end(Ptr<?> __data, Ptr<IccDefinitions.icc_path> p, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_initcall_finish(Ptr<?> __data, @OriginalName(value="initcall_t") Ptr<?> func, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_initcall_level($arg1, (const u8*)$arg2)")
    public static void trace_event_raw_event_initcall_level(Ptr<?> __data, String level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_initcall_start(Ptr<?> __data, @OriginalName(value="initcall_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_irq_noise($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_irq_noise(Ptr<?> __data, int vector, String desc, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mdio_access(Ptr<?> __data, Ptr<misc.mii_bus> bus, char read2, char addr2, @Unsigned int regnum, @Unsigned short val, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_mem_connect($arg1, (const struct xdp_mem_allocator*)$arg2, (const struct xdp_rxq_info*)$arg3)")
    public static void trace_event_raw_event_mem_connect(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_allocator> xa, Ptr<XdpDefinitions.xdp_rxq_info> rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_mem_disconnect($arg1, (const struct xdp_mem_allocator*)$arg2)")
    public static void trace_event_raw_event_mem_disconnect(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_allocator> xa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_mem_return_failed($arg1, (const struct xdp_mem_info*)$arg2, (const struct page*)$arg3)")
    public static void trace_event_raw_event_mem_return_failed(Ptr<?> __data, Ptr<XdpDefinitions.xdp_mem_info> mem, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_module_free(Ptr<?> __data, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_module_load(Ptr<?> __data, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_module_refcnt(Ptr<?> __data, Ptr<runtime.module> mod, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_module_request(Ptr<?> __data, String name, boolean wait, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mon_llc_occupancy_limbo(Ptr<?> __data, @Unsigned int ctrl_hw_id, @Unsigned int mon_hw_id, int domain_id, @Unsigned long llc_occupancy_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mptcp_dump_mpext(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_ext> mpext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mptcp_subflow_get_send(Ptr<?> __data, Ptr<MptcpDefinitions.mptcp_subflow_context> subflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_msr_trace_class(Ptr<?> __data, @Unsigned int msr2, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_nmi_handler(Ptr<?> __data, Ptr<?> handler, long delta_ns, int handled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_nmi_noise(Ptr<?> __data, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_pseudo_lock_l2(Ptr<?> __data, @Unsigned long l2_hits, @Unsigned long l2_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_pseudo_lock_l3(Ptr<?> __data, @Unsigned long l3_hits, @Unsigned long l3_miss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_pseudo_lock_mem_latency(Ptr<?> __data, @Unsigned int latency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_purge_vmap_area_lazy(Ptr<?> __data, @Unsigned long start, @Unsigned long end, @Unsigned int npurged) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rseq_ip_fixup(Ptr<?> __data, @Unsigned long regs_ip, @Unsigned long start_ip, @Unsigned long post_commit_offset, @Unsigned long abort_ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rseq_update(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sample_threshold(Ptr<?> __data, @Unsigned long start, @Unsigned long duration, @Unsigned long interference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_selinux_audited($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static void trace_event_raw_event_selinux_audited(Ptr<?> __data, Ptr<SelinuxDefinitions.selinux_audit_data> sad, String scontext, String tcontext, String tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_smbus_read($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void trace_event_raw_event_smbus_read(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_smbus_reply($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union i2c_smbus_data*)$arg8, $arg9)")
    public static void trace_event_raw_event_smbus_reply(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<I2cDefinitions.i2c_smbus_data> data, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_smbus_result($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void trace_event_raw_event_smbus_result(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_smbus_write($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union i2c_smbus_data*)$arg8)")
    public static void trace_event_raw_event_smbus_write(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<I2cDefinitions.i2c_smbus_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_softirq_noise(Ptr<?> __data, int vector, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_subflow_check_data_avail(Ptr<?> __data, char status, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_swiotlb_bounced(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dev_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_synth(Ptr<?> __data, Ptr<@Unsigned Long> var_ref_vals, Ptr<@Unsigned Integer> var_ref_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_thermal_power_actor(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int actor_id, @Unsigned int req_power, @Unsigned int granted_power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_thermal_power_allocator(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, @Unsigned int total_req_power, @Unsigned int total_granted_power, int num_actors, @Unsigned int power_range, @Unsigned int max_allocatable_power, int current_temp, int delta_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_thermal_power_allocator_pid(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int err, int err_integral, long p, long i, long d, int output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_thread_noise(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t, @Unsigned long start, @Unsigned long duration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xdp_bulk_tx($arg1, (const struct net_device*)$arg2, $arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_xdp_bulk_tx(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, int sent, int drops, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xdp_cpumap_enqueue(Ptr<?> __data, int map_id, @Unsigned int processed, @Unsigned int drops, int to_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xdp_cpumap_kthread(Ptr<?> __data, int map_id, @Unsigned int processed, @Unsigned int drops, int sched, Ptr<XdpDefinitions.xdp_cpumap_stats> xdp_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xdp_devmap_xmit($arg1, (const struct net_device*)$arg2, (const struct net_device*)$arg3, $arg4, $arg5, $arg6)")
    public static void trace_event_raw_event_xdp_devmap_xmit(Ptr<?> __data, Ptr<NetDefinitions.net_device> from_dev, Ptr<NetDefinitions.net_device> to_dev, int sent, int drops, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xdp_exception($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, $arg4)")
    public static void trace_event_raw_event_xdp_exception(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, @Unsigned int act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xdp_redirect_template($arg1, (const struct net_device*)$arg2, (const struct bpf_prog*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void trace_event_raw_event_xdp_redirect_template(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> xdp2, Ptr<?> tgt, int err, BpfDefinitions.bpf_map_type map_type2, @Unsigned int map_id, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_events_synth_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_events_synth_init_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_filter_add_remove_task(Ptr<trace_pid_list> pid_list, Ptr<TaskDefinitions.task_struct> self, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_find_cmdline(int pid2, String comm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_find_filtered_pid(Ptr<trace_pid_list> filtered_pids, @OriginalName(value="pid_t") int search_pid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<trace_entry> trace_find_next_entry(Ptr<trace_iterator> iter2, Ptr<Integer> ent_cpu, Ptr<@Unsigned Long> ent_ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> trace_find_next_entry_inc(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_find_tgid(int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_fprobe_create((const u8*)$arg1)")
    public static int trace_fprobe_create(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_fprobe_entry_handler(Ptr<runtime.fprobe> fp, @Unsigned long entry_ip, @Unsigned long ret_ip, Ptr<PtDefinitions.pt_regs> regs, Ptr<?> entry_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_fprobe_is_busy(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_fprobe_match((const u8*)$arg1, (const u8*)$arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static boolean trace_fprobe_match(String system, String event2, int argc, Ptr<String> argv, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_fprobe_release(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_fprobe_show(Ptr<SeqDefinitions.seq_file> m, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_free_saved_cmdlines_buffer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_function(Ptr<trace_array> tr, @Unsigned long ip, @Unsigned long parent_ip, @Unsigned int trace_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_get_user($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int trace_get_user(Ptr<trace_parser> parser, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_handle_return(Ptr<trace_seq> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_ignore_this_task(Ptr<trace_pid_list> filtered_pids, Ptr<trace_pid_list> filtered_no_pids, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_init_global_iter(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_init_iter(Ptr<trace_iterator> iter2, Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_initcall_finish_cb(Ptr<?> data, @OriginalName(value="initcall_t") Ptr<?> fn, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_initcall_level((const u8*)$arg1)")
    public static void trace_initcall_level(String level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_initcall_start_cb(Ptr<?> data, @OriginalName(value="initcall_t") Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_irqentry_callback(Ptr<?> data, int irq, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_irqexit_callback(Ptr<?> data, int irq, Ptr<runtime.irqaction> action, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String trace_iter_expand_format(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_keep_overwrite(Ptr<runtime.tracer> tracer2, @Unsigned int mask, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_kprobe_create((const u8*)$arg1)")
    public static int trace_kprobe_create(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_kprobe_entry_handler(Ptr<misc.kretprobe_instance> ri, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_kprobe_error_injectable(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_kprobe_is_busy(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_kprobe_match((const u8*)$arg1, (const u8*)$arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static boolean trace_kprobe_match(String system, String event2, int argc, Ptr<String> argv, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_kprobe_on_func_entry(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_kprobe_release(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_kprobe_run_command(Ptr<DyneventDefinitions.dynevent_cmd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_kprobe_show(Ptr<SeqDefinitions.seq_file> m, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_last_func_repeats(Ptr<trace_array> tr, Ptr<trace_func_repeats> last_info, @Unsigned int trace_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_latency_header(Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long trace_min_max_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_min_max_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long trace_min_max_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_module_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_note($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static void trace_note(Ptr<BlkDefinitions.blk_trace> bt, @OriginalName(value="pid_t") int pid2, int action, Ptr<?> data, @Unsigned long len, @Unsigned long cgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_note_time(Ptr<BlkDefinitions.blk_trace> bt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_ok_for_array(Ptr<runtime.tracer> t, Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long trace_options_core_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_options_core_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long trace_options_core_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> trace_options_init_dentry(Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long trace_options_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_options_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long trace_options_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_osnoise_callback(boolean enter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_parse_run_command($arg1, (const u8*)$arg2, $arg3, $arg4, (int (*)(const u8*))$arg5)")
    public static @OriginalName(value="ssize_t") long trace_parse_run_command(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<?> createfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_parser_get_init(Ptr<trace_parser> parser, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_parser_put(Ptr<trace_parser> parser) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> trace_pid_next(Ptr<trace_pid_list> pid_list, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_pid_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> trace_pid_start(Ptr<trace_pid_list> pid_list, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_pid_write($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int trace_pid_write(Ptr<trace_pid_list> filtered_pids, Ptr<Ptr<trace_pid_list>> new_pid_list, String ubuf, @Unsigned long cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_printk_init_buffers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_printk_seq(Ptr<trace_seq> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_printk_start_comm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ack_update_msk(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_alloc_vmap_area(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_amd_pstate_perf(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_bpf_test_finish(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_bpf_trigger_tp(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_bpf_xdp_link_attach_failed(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_contention_begin(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_contention_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cpuhp_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cpuhp_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cpuhp_multi_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_drm_vblank_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_drm_vblank_event_delivered(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_drm_vblank_event_queued(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_free_vmap_area_noflush(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hwmon_attr_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hwmon_attr_show_string(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hyperv_mmu_flush_tlb_multi(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hyperv_nested_flush_guest_mapping(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hyperv_nested_flush_guest_mapping_range(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hyperv_send_ipi_mask(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hyperv_send_ipi_one(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_icc_set_bw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_icc_set_bw_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_initcall_finish(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_initcall_level(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_initcall_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_irq_noise(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mdio_access(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mem_connect(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mem_disconnect(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mem_return_failed(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_module_free(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_module_load(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_module_refcnt(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_module_request(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mon_llc_occupancy_limbo(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mptcp_dump_mpext(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mptcp_subflow_get_send(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_msr_trace_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_nmi_handler(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_nmi_noise(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_pseudo_lock_l2(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_pseudo_lock_l3(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_pseudo_lock_mem_latency(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_purge_vmap_area_lazy(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rseq_ip_fixup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rseq_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sample_threshold(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_selinux_audited(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_smbus_read(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_smbus_reply(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_smbus_result(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_smbus_write(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_softirq_noise(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_subflow_check_data_avail(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_swiotlb_bounced(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_thermal_power_actor(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_thermal_power_allocator(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_thermal_power_allocator_pid(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_thread_noise(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xdp_bulk_tx(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xdp_cpumap_enqueue(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xdp_cpumap_kthread(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xdp_devmap_xmit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xdp_exception(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xdp_redirect_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_rss_stat(Ptr<MmDefinitions.mm_struct> mm, int member) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_safe_str($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static boolean trace_safe_str(Ptr<trace_iterator> iter2, String str, boolean star, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_save_cmdline(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_sched_migrate_callback(Ptr<?> data, Ptr<TaskDefinitions.task_struct> p, int dest_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_sched_switch_callback(Ptr<?> data, boolean preempt, Ptr<TaskDefinitions.task_struct> p, Ptr<TaskDefinitions.task_struct> n, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long trace_seq_to_buffer(Ptr<trace_seq> s2, Ptr<?> buf, @Unsigned long cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_set_options(Ptr<trace_array> tr, String option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_set_ring_buffer_expanded(Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_softirq_entry_callback(Ptr<?> data, @Unsigned int vec_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_softirq_exit_callback(Ptr<?> data, @Unsigned int vec_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int trace_string(Ptr<SynthDefinitions.synth_trace_event> entry, Ptr<SynthDefinitions.synth_event> event2, String str_val, boolean is_dynamic, @Unsigned int data_size, Ptr<@Unsigned Integer> n_u64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_suspend_resume((const u8*)$arg1, $arg2, $arg3)")
    public static void trace_suspend_resume(String action, int val, boolean start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_timerlat_sample(Ptr<TimerlatDefinitions.timerlat_sample> sample2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long trace_total_entries(Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long trace_total_entries_cpu(Ptr<trace_array> tr, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_vbprintk($arg1, (const u8*)$arg2, $arg3)")
    public static int trace_vbprintk(@Unsigned long ip, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_vprintk($arg1, (const u8*)$arg2, $arg3)")
    public static int trace_vprintk(@Unsigned long ip, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_xen_cpu_write_gdt_entry($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void trace_xen_cpu_write_gdt_entry(Ptr<DescDefinitions.desc_struct> dt, int entrynum, Ptr<?> desc, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_xhci_dbg_context_change(Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_xhci_dbg_init(Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_xhci_dbg_ring_expansion(Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_bprintk($arg1, (const u8*)$arg2, $arg3_)")
    public static int __trace_bprintk(@Unsigned long ip, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_eprobe_create($arg1, (const u8**)$arg2)")
    public static int __trace_eprobe_create(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_printk($arg1, (const u8*)$arg2, $arg3_)")
    public static int __trace_printk(@Unsigned long ip, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_uprobe_create($arg1, (const u8**)$arg2)")
    public static int __trace_uprobe_create(int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_clk_disable(Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_clk_disable_complete(Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_clk_unprepare(Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_clk_unprepare_complete(Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long trace_clock_x86_tsc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_eprobe_parse_filter($arg1, $arg2, (const u8**)$arg3)")
    public static int trace_eprobe_parse_filter(Ptr<trace_eprobe> ep, int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_cache_tag_flush(Ptr<trace_event_data_offsets_cache_tag_flush> __data_offsets, Ptr<CacheDefinitions.cache_tag> tag, @Unsigned long start, @Unsigned long end, @Unsigned long addr2, @Unsigned long pages, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_cache_tag_log(Ptr<trace_event_data_offsets_cache_tag_log> __data_offsets, Ptr<CacheDefinitions.cache_tag> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_clk_parent(Ptr<trace_event_data_offsets_clk_parent> __data_offsets, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_clk_rate_request(Ptr<trace_event_data_offsets_clk_rate_request> __data_offsets, Ptr<ClkDefinitions.clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_device_pm_callback_end(Ptr<trace_event_data_offsets_device_pm_callback_end> __data_offsets, Ptr<runtime.device> dev, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_get_offsets_device_pm_callback_start($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int trace_event_get_offsets_device_pm_callback_start(Ptr<trace_event_data_offsets_device_pm_callback_start> __data_offsets, Ptr<runtime.device> dev, String pm_ops, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_get_offsets_regcache_sync($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static int trace_event_get_offsets_regcache_sync(Ptr<trace_event_data_offsets_regcache_sync> __data_offsets, Ptr<runtime.regmap> map2, String type2, String status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_xhci_log_msg(Ptr<trace_event_data_offsets_xhci_log_msg> __data_offsets, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_probe_cleanup(Ptr<trace_eprobe> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_aer_event($arg1, (const u8*)$arg2, (const unsigned int)$arg3, (const u8)$arg4, (const u8)$arg5, $arg6)")
    public static void trace_event_raw_event_aer_event(Ptr<?> __data, String dev_name, @Unsigned int status, char severity2, char tlp_header_valid, Ptr<PcieDefinitions.pcie_tlp_log> tlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_arm_event($arg1, (const struct cper_sec_proc_arm*)$arg2)")
    public static void trace_event_raw_event_arm_event(Ptr<?> __data, Ptr<CperDefinitions.cper_sec_proc_arm> proc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cache_tag_flush(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag, @Unsigned long start, @Unsigned long end, @Unsigned long addr2, @Unsigned long pages, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cache_tag_log(Ptr<?> __data, Ptr<CacheDefinitions.cache_tag> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cdev_update(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_clk(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_clk_duty_cycle(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_duty> duty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_clk_parent(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, Ptr<ClkDefinitions.clk_core> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_clk_phase(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, int phase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_clk_rate(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_clk_rate_range(Ptr<?> __data, Ptr<ClkDefinitions.clk_core> core, @Unsigned long min, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_clk_rate_request(Ptr<?> __data, Ptr<ClkDefinitions.clk_rate_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_clock($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_clock(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_compact_retry(Ptr<?> __data, int order, misc.compact_priority priority, misc.compact_result result, int retries, int max_retries, boolean ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_console($arg1, (const u8*)$arg2, $arg3)")
    public static void trace_event_raw_event_console(Ptr<?> __data, String text, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_context_tracking_user(Ptr<?> __data, int dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cpu(Ptr<?> __data, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cpu_frequency_limits(Ptr<?> __data, Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cpu_idle_miss(Ptr<?> __data, @Unsigned int cpu_id2, @Unsigned int state2, boolean below) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cpu_latency_qos_request(Ptr<?> __data, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_dev_pm_qos_request($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_dev_pm_qos_request(Ptr<?> __data, String name, DevDefinitions.dev_pm_qos_req_type type2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_device_pm_callback_end(Ptr<?> __data, Ptr<runtime.device> dev, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_device_pm_callback_start($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void trace_event_raw_event_device_pm_callback_start(Ptr<?> __data, Ptr<runtime.device> dev, String pm_ops, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_extlog_mem_event($arg1, $arg2, $arg3, (const struct {\n  u8 b[16];\n}*)$arg4, (const u8*)$arg5, $arg6)")
    public static void trace_event_raw_event_extlog_mem_event(Ptr<?> __data, Ptr<CperDefinitions.cper_sec_mem_err> mem, @Unsigned int err_seq, Ptr< @OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_finish_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_guest_halt_poll_ns(Ptr<?> __data, boolean grow, @Unsigned int _new, @Unsigned int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hrtimer_class(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hrtimer_expire_entry(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, Ptr<@OriginalName(value="ktime_t") Long> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hrtimer_init(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, @OriginalName(value="clockid_t") int clockid, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hrtimer_start(Ptr<?> __data, Ptr<runtime.hrtimer> hrtimer2, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iommu_device_event(Ptr<?> __data, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iommu_error(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned long iova2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iommu_group_event(Ptr<?> __data, int group_id, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_itimer_expire(Ptr<?> __data, int which, Ptr<runtime.pid> pid2, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_itimer_state($arg1, $arg2, (const const struct itimerspec64*)$arg3, $arg4)")
    public static void trace_event_raw_event_itimer_state(Ptr<?> __data, int which, Ptr<runtime.itimerspec64> value, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_kcompactd_wake_template(Ptr<?> __data, int nid, int order, ZoneDefinitions.zone_type highest_zoneidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_map(Ptr<?> __data, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mark_victim(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, @Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_mc_event($arg1, (const unsigned int)$arg2, (const u8*)$arg3, (const u8*)$arg4, (const int)$arg5, (const u8)$arg6, (const s8)$arg7, (const s8)$arg8, (const s8)$arg9, $arg10, (const u8)$arg11, $arg12, (const u8*)$arg13)")
    public static void trace_event_raw_event_mc_event(Ptr<?> __data, @Unsigned int err_type, String error_msg, String label, int error_count, char mc_index, @OriginalName(value="s8") byte top_layer, @OriginalName(value="s8") byte mid_layer, @OriginalName(value="s8") byte low_layer, @Unsigned long address, char grain_bits, @Unsigned long syndrome, String driver_detail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mce_record(Ptr<?> __data, Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_memory_failure_event(Ptr<?> __data, @Unsigned long pfn, int type2, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_compaction_begin(Ptr<?> __data, Ptr<misc.compact_control> cc, @Unsigned long zone_start, @Unsigned long zone_end, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_compaction_defer_template(Ptr<?> __data, Ptr<runtime.zone> zone2, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_compaction_end(Ptr<?> __data, Ptr<misc.compact_control> cc, @Unsigned long zone_start, @Unsigned long zone_end, boolean sync2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_compaction_isolate_template(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long nr_scanned, @Unsigned long nr_taken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_compaction_kcompactd_sleep(Ptr<?> __data, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_compaction_migratepages(Ptr<?> __data, @Unsigned int nr_migratepages, @Unsigned int nr_succeeded) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_compaction_suitable_template(Ptr<?> __data, Ptr<runtime.zone> zone2, int order, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_compaction_try_to_compact_pages(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int prio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_shrink_slab_end(Ptr<?> __data, Ptr<runtime.shrinker> shr, int nid, int shrinker_retval, long unused_scan_cnt, long new_scan_cnt, long total_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_shrink_slab_start(Ptr<?> __data, Ptr<runtime.shrinker> shr, Ptr<ShrinkDefinitions.shrink_control> sc, long nr_objects_to_shrink, @Unsigned long cache_items, @Unsigned long delta, @Unsigned long total_scan, int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_direct_reclaim_begin_template(Ptr<?> __data, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_direct_reclaim_end_template(Ptr<?> __data, @Unsigned long nr_reclaimed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_kswapd_sleep(Ptr<?> __data, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_kswapd_wake(Ptr<?> __data, int nid, int zid, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_lru_isolate(Ptr<?> __data, int highest_zoneidx, int order, @Unsigned long nr_requested, @Unsigned long nr_scanned, @Unsigned long nr_skipped, @Unsigned long nr_taken, int lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_lru_shrink_active(Ptr<?> __data, int nid, @Unsigned long nr_taken, @Unsigned long nr_active, @Unsigned long nr_deactivated, @Unsigned long nr_referenced, int priority, int file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_lru_shrink_inactive(Ptr<?> __data, int nid, @Unsigned long nr_scanned, @Unsigned long nr_reclaimed, Ptr<ReclaimDefinitions.reclaim_stat> stat2, int priority, int file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_node_reclaim_begin(Ptr<?> __data, int nid, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_throttled(Ptr<?> __data, int nid, int usec_timeout, int usec_delayed, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_wakeup_kswapd(Ptr<?> __data, int nid, int zid, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_vmscan_write_folio(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_mmap_lock($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void trace_event_raw_event_mmap_lock(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_mmap_lock_acquire_returned($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_mmap_lock_acquire_returned(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, String memcg_path, boolean write2, boolean success) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mmc_request_done(Ptr<?> __data, Ptr<MmcDefinitions.mmc_host> host, Ptr<MmcDefinitions.mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mmc_request_start(Ptr<?> __data, Ptr<MmcDefinitions.mmc_host> host, Ptr<MmcDefinitions.mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_non_standard_event($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, (const struct {\n  u8 b[16];\n}*)$arg3, (const u8*)$arg4, (const u8)$arg5, (const u8*)$arg6, (const unsigned int)$arg7)")
    public static void trace_event_raw_event_non_standard_event(Ptr<?> __data, Ptr< @OriginalName(value="guid_t") misc.uuid_t> sec_type, Ptr< @OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev, Ptr<Character> err, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_oom_score_adj_update(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_pm_qos_update(Ptr<?> __data, PmDefinitions.pm_qos_req_action action, int prev_value, int curr_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_power_domain($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_power_domain(Ptr<?> __data, String name, @Unsigned int state2, @Unsigned int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_powernv_throttle($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void trace_event_raw_event_powernv_throttle(Ptr<?> __data, int chip_id, String reason, int pmax) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_prq_report(Ptr<?> __data, Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned long dw0, @Unsigned long dw1, @Unsigned long dw2, @Unsigned long dw3, @Unsigned long seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_pstate_sample(Ptr<?> __data, @Unsigned int core_busy, @Unsigned int scaled_busy, @Unsigned int from, @Unsigned int to, @Unsigned long mperf, @Unsigned long aperf, @Unsigned long tsc, @Unsigned int freq, @Unsigned int io_boost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_qi_submit(Ptr<?> __data, Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned long qw0, @Unsigned long qw1, @Unsigned long qw2, @Unsigned long qw3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_rcu_stall_warning($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void trace_event_raw_event_rcu_stall_warning(Ptr<?> __data, String rcuname, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_rcu_utilization($arg1, (const u8*)$arg2)")
    public static void trace_event_raw_event_rcu_utilization(Ptr<?> __data, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_reclaim_retry_zone(Ptr<?> __data, Ptr<runtime.zoneref> zoneref2, int order, @Unsigned long reclaimable, @Unsigned long available, @Unsigned long min_wmark, int no_progress_loops, boolean wmark_check) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_regcache_drop_region(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int from, @Unsigned int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_regcache_sync($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void trace_event_raw_event_regcache_sync(Ptr<?> __data, Ptr<runtime.regmap> map2, String type2, String status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_regmap_async(Ptr<?> __data, Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_regmap_block(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_regmap_bool(Ptr<?> __data, Ptr<runtime.regmap> map2, boolean flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_regmap_bulk($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void trace_event_raw_event_regmap_bulk(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, int val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_regmap_reg(Ptr<?> __data, Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_signal_deliver(Ptr<?> __data, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<KDefinitions.k_sigaction> ka) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_signal_generate(Ptr<?> __data, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> task2, int group, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_skip_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_start_task_reaping(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_suspend_resume($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_suspend_resume(Ptr<?> __data, String action, int val, boolean start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sync_timeline(Ptr<?> __data, Ptr<SyncDefinitions.sync_timeline> timeline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_task_newtask(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_task_rename($arg1, $arg2, (const u8*)$arg3)")
    public static void trace_event_raw_event_task_rename(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, String comm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_thermal_power_devfreq_get_power(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, Ptr<DevfreqDefinitions.devfreq_dev_status> status, @Unsigned long freq, @Unsigned int power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_thermal_power_devfreq_limit(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long freq, @Unsigned long cdev_state, @Unsigned int power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_thermal_temperature(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_thermal_zone_trip(Ptr<?> __data, Ptr<ThermalDefinitions.thermal_zone_device> tz, int trip, ThermalDefinitions.thermal_trip_type trip_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tick_stop(Ptr<?> __data, int success, int dependency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_timer_base_idle(Ptr<?> __data, boolean is_idle, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_timer_class(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_timer_expire_entry(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long baseclk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_timer_start(Ptr<?> __data, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long bucket_expiry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_unmap(Ptr<?> __data, @Unsigned long iova2, @Unsigned long size, @Unsigned long unmapped_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_activate(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean can_reserve, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_alloc(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, boolean reserved, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_alloc_managed(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_config(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int apicdest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_free_moved(Ptr<?> __data, @Unsigned int irq, @Unsigned int cpu2, @Unsigned int vector, boolean is_managed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_mod(Ptr<?> __data, @Unsigned int irq, @Unsigned int vector, @Unsigned int cpu2, @Unsigned int prev_vector, @Unsigned int prev_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_reserve(Ptr<?> __data, @Unsigned int irq, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_setup(Ptr<?> __data, @Unsigned int irq, boolean is_legacy, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vector_teardown(Ptr<?> __data, @Unsigned int irq, boolean is_managed, boolean has_reserved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_wake_reaper(Ptr<?> __data, int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_wakeup_source($arg1, (const u8*)$arg2, $arg3)")
    public static void trace_event_raw_event_wakeup_source(Ptr<?> __data, String name, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_watchdog_set_timeout(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, @Unsigned int timeout, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_watchdog_template(Ptr<?> __data, Ptr<WatchdogDefinitions.watchdog_device> wdd, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_x86_fpu(Ptr<?> __data, Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_x86_irq_vector(Ptr<?> __data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xen_cpu_load_idt($arg1, (const struct desc_ptr*)$arg2)")
    public static void trace_event_raw_event_xen_cpu_load_idt(Ptr<?> __data, Ptr<DescDefinitions.desc_ptr> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xen_cpu_set_ldt($arg1, (const void*)$arg2, $arg3)")
    public static void trace_event_raw_event_xen_cpu_set_ldt(Ptr<?> __data, Ptr<?> addr2, @Unsigned int entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xen_cpu_write_gdt_entry($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void trace_event_raw_event_xen_cpu_write_gdt_entry(Ptr<?> __data, Ptr<DescDefinitions.desc_struct> dt, int entrynum, Ptr<?> desc, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xen_cpu_write_idt_entry($arg1, $arg2, $arg3, (const gate_struct*)$arg4)")
    public static void trace_event_raw_event_xen_cpu_write_idt_entry(Ptr<?> __data, Ptr< @OriginalName(value="gate_desc") misc.gate_struct> dt, int entrynum, Ptr< @OriginalName(value="gate_desc") misc.gate_struct> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_cpu_write_ldt_entry(Ptr<?> __data, Ptr<DescDefinitions.desc_struct> dt, int entrynum, @Unsigned long desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mc__batch(Ptr<?> __data, XenDefinitions.xen_lazy_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mc_callback(Ptr<?> __data, @OriginalName(value="xen_mc_callback_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mc_entry(Ptr<?> __data, Ptr<misc.multicall_entry> mc, @Unsigned int nargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mc_entry_alloc(Ptr<?> __data, @Unsigned long args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mc_extend_args(Ptr<?> __data, @Unsigned long op, @Unsigned long args, XenDefinitions.xen_mc_extend_args res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mc_flush(Ptr<?> __data, @Unsigned int mcidx, @Unsigned int argidx, @Unsigned int cbidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mc_flush_reason(Ptr<?> __data, XenDefinitions.xen_mc_flush_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu__set_pte(Ptr<?> __data, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_alloc_ptpage(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn, @Unsigned int level, boolean pinned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_xen_mmu_flush_tlb_multi($arg1, (const struct cpumask*)$arg2, $arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_xen_mmu_flush_tlb_multi(Ptr<?> __data, Ptr<runtime.cpumask> cpus, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_flush_tlb_one_user(Ptr<?> __data, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_pgd(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_ptep_modify_prot(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_release_ptpage(Ptr<?> __data, @Unsigned long pfn, @Unsigned int level, boolean pinned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_set_p4d(Ptr<?> __data, Ptr<misc.p4d_t> p4dp, Ptr<misc.p4d_t> user_p4dp, misc.p4d_t p4dval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_set_pmd(Ptr<?> __data, Ptr<PmdDefinitions.pmd_t> pmdp, PmdDefinitions.pmd_t pmdval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_set_pud(Ptr<?> __data, Ptr<PudDefinitions.pud_t> pudp, PudDefinitions.pud_t pudval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xen_mmu_write_cr3(Ptr<?> __data, boolean kernel, @Unsigned long cr3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_dbc_log_request(Ptr<?> __data, Ptr<DbcDefinitions.dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_ctrl_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_input_control_ctx> ctrl_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_container_ctx> ctx, @Unsigned int ep_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_doorbell(Ptr<?> __data, @Unsigned int slot2, @Unsigned int doorbell) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_ep_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ep_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_free_virt_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_msg(Ptr<?> __data, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_portsc(Ptr<?> __data, Ptr<XhciDefinitions.xhci_port> port2, @Unsigned int portsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_ring(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_slot_ctx(Ptr<?> __data, Ptr<XhciDefinitions.xhci_slot_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_trb(Ptr<?> __data, Ptr<XhciDefinitions.xhci_ring> ring, Ptr<XhciDefinitions.xhci_generic_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_urb(Ptr<?> __data, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_xhci_log_virt_dev(Ptr<?> __data, Ptr<XhciDefinitions.xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_events_eprobe_init_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_events_user_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_init_perf_perm_irq_work_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_intel_irq_entry(Ptr<?> data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_intel_irq_exit(Ptr<?> data, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_is_tracepoint_string((const u8*)$arg1)")
    public static boolean trace_is_tracepoint_string(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_mmap_lock_reg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_mmap_lock_unreg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_module_has_bad_taint(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_printk_control(boolean enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_aer_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_arm_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cache_tag_flush(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cache_tag_log(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cdev_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_clk(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_clk_duty_cycle(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_clk_parent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_clk_phase(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_clk_rate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_clk_rate_range(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_clk_rate_request(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_clock(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_compact_retry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_console(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_context_tracking_user(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cpu(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cpu_frequency_limits(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cpu_idle_miss(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cpu_latency_qos_request(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dev_pm_qos_request(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_device_pm_callback_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_device_pm_callback_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_extlog_mem_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_finish_task_reaping(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_guest_halt_poll_ns(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hrtimer_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hrtimer_expire_entry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hrtimer_init(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hrtimer_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iommu_device_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iommu_error(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iommu_group_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_itimer_expire(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_itimer_state(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_kcompactd_wake_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_map(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mark_victim(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mc_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mce_record(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_memory_failure_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_compaction_begin(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_compaction_defer_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_compaction_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_compaction_isolate_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_compaction_kcompactd_sleep(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_compaction_migratepages(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_compaction_suitable_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_compaction_try_to_compact_pages(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_shrink_slab_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_shrink_slab_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_direct_reclaim_begin_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_direct_reclaim_end_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_kswapd_sleep(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_kswapd_wake(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_lru_isolate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_lru_shrink_active(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_lru_shrink_inactive(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_node_reclaim_begin(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_throttled(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_wakeup_kswapd(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_vmscan_write_folio(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mmap_lock(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mmap_lock_acquire_returned(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mmc_request_done(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mmc_request_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_non_standard_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_oom_score_adj_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_pm_qos_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_pm_qos_update_flags(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_power_domain(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_powernv_throttle(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_prq_report(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_pstate_sample(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_qi_submit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rcu_stall_warning(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rcu_utilization(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_reclaim_retry_zone(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regcache_drop_region(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regcache_sync(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regmap_async(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regmap_block(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regmap_bool(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regmap_bulk(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regmap_reg(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_signal_deliver(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_signal_generate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_skip_task_reaping(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_start_task_reaping(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_suspend_resume(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sync_timeline(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_task_newtask(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_task_rename(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_thermal_power_devfreq_get_power(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_thermal_power_devfreq_limit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_thermal_temperature(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_thermal_zone_trip(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tick_stop(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_timer_base_idle(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_timer_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_timer_expire_entry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_timer_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_unmap(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_activate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_alloc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_alloc_managed(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_config(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_free_moved(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_mod(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_reserve(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_setup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vector_teardown(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_wake_reaper(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_wakeup_source(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_watchdog_set_timeout(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_watchdog_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_x86_fpu(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_x86_irq_vector(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_cpu_load_idt(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_cpu_set_ldt(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_cpu_write_gdt_entry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_cpu_write_idt_entry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_cpu_write_ldt_entry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mc__batch(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mc_callback(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mc_entry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mc_entry_alloc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mc_extend_args(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mc_flush(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mc_flush_reason(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu__set_pte(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_alloc_ptpage(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_flush_tlb_multi(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_flush_tlb_one_user(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_pgd(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_ptep_modify_prot(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_release_ptpage(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_set_p4d(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_set_pmd(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_set_pud(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xen_mmu_write_cr3(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_dbc_log_request(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_ctrl_ctx(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_ctx(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_doorbell(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_ep_ctx(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_free_virt_dev(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_msg(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_portsc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_ring(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_slot_ctx(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_trb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_urb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_xhci_log_virt_dev(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_uprobe_create((const u8*)$arg1)")
    public static int trace_uprobe_create(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_uprobe_is_busy(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_uprobe_match((const u8*)$arg1, (const u8*)$arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static boolean trace_uprobe_match(String system, String event2, int argc, Ptr<String> argv, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_uprobe_match_command_head($arg1, $arg2, (const u8**)$arg3)")
    public static boolean trace_uprobe_match_command_head(Ptr<trace_uprobe> tu, int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_uprobe_register(Ptr<trace_event_call> event2, trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_uprobe_release(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_uprobe_show(Ptr<SeqDefinitions.seq_file> m, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_xhci_address_ctx(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_container_ctx> ctx, @Unsigned int ep_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_xhci_dbg_address(Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_xhci_dbg_cancel_urb(Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_xhci_dbg_quirks(Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __trace_graph_entry(Ptr<trace_array> tr, Ptr<FtraceDefinitions.ftrace_graph_ent> trace, @Unsigned int trace_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __trace_graph_return(Ptr<trace_array> tr, Ptr<FtraceDefinitions.ftrace_graph_ret> trace, @Unsigned int trace_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_aer_event((const u8*)$arg1, (const unsigned int)$arg2, (const u8)$arg3, (const u8)$arg4, $arg5)")
    public static void trace_aer_event(String dev_name, @Unsigned int status, char severity2, char tlp_header_valid, Ptr<PcieDefinitions.pcie_tlp_log> tlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> trace_alloc_entry(Ptr<trace_event_call> call, Ptr<Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_bprint_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_bprint_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_bputs_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_bputs_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int trace_call_bpf(Ptr<trace_event_call> call, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long trace_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long trace_clock_counter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long trace_clock_global() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long trace_clock_jiffies() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long trace_clock_local() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_ctx_hex(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_ctx_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_ctx_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_ctxwake_bin(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_ctxwake_hex(Ptr<trace_iterator> iter2, char S) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_ctxwake_print(Ptr<trace_iterator> iter2, String delim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_ctxwake_raw(Ptr<trace_iterator> iter2, char S) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_event_dyn_busy(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_dyn_put_ref(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_event_dyn_try_get_ref(Ptr<trace_event_call> dyn_call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_dma_fence(Ptr<trace_event_data_offsets_dma_fence> __data_offsets, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_sched_prepare_exec(Ptr<trace_event_data_offsets_sched_prepare_exec> __data_offsets, Ptr<TaskDefinitions.task_struct> task2, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static void trace_event_printf(Ptr<trace_iterator> iter2, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_alarm_class(Ptr<?> __data, Ptr<runtime.alarm> alarm2, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_alarmtimer_suspend(Ptr<?> __data, @OriginalName(value="ktime_t") long expires, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_bmdma_status(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, @Unsigned int host_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_eh_action_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, @Unsigned int devno, @Unsigned int eh_action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_eh_link_autopsy(Ptr<?> __data, Ptr<AtaDefinitions.ata_device> dev, @Unsigned int eh_action, @Unsigned int eh_err_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_eh_link_autopsy_qc(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ata_exec_command_template($arg1, $arg2, (const struct ata_taskfile*)$arg3, $arg4)")
    public static void trace_event_raw_event_ata_exec_command_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_link_reset_begin_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_link_reset_end_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_link> link2, Ptr<@Unsigned Integer> _class2, int rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_port_eh_begin_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_qc_complete_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_qc_issue_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_sff_hsm_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_sff_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ata_tf_load($arg1, $arg2, (const struct ata_taskfile*)$arg3)")
    public static void trace_event_raw_event_ata_tf_load(Ptr<?> __data, Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ata_transfer_data_template(Ptr<?> __data, Ptr<AtaDefinitions.ata_queued_cmd> qc, @Unsigned int offset, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_balance_dirty_pages(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long thresh, @Unsigned long bg_thresh, @Unsigned long dirty, @Unsigned long bdi_thresh, @Unsigned long bdi_dirty, @Unsigned long dirty_ratelimit, @Unsigned long task_ratelimit, @Unsigned long dirtied, @Unsigned long period, long pause2, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_bdi_dirty_ratelimit(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long dirty_rate, @Unsigned long task_ratelimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_bio(Ptr<?> __data, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_bio_complete(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_bio_remap(Ptr<?> __data, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_buffer(Ptr<?> __data, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_plug(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_rq(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_rq_completion(Ptr<?> __data, Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error, @Unsigned int nr_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_rq_remap(Ptr<?> __data, Ptr<runtime.request> rq2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_rq_requeue(Ptr<?> __data, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_split(Ptr<?> __data, Ptr<runtime.bio> bio2, @Unsigned int new_sector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_block_unplug(Ptr<?> __data, Ptr<RequestDefinitions.request_queue> q, @Unsigned int depth, boolean explicit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_bpf_trace_printk($arg1, (const u8*)$arg2)")
    public static void trace_event_raw_event_bpf_trace_printk(Ptr<?> __data, String bpf_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_csd_function(Ptr<?> __data, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr< @OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_csd_queue_cpu($arg1, (const unsigned int)$arg2, $arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_csd_queue_cpu(Ptr<?> __data, @Unsigned int cpu2, @Unsigned long callsite, @OriginalName(value="smp_call_func_t") Ptr<?> func, Ptr< @OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_devres($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void trace_event_raw_event_devres(Ptr<?> __data, Ptr<runtime.device> dev, String op, Ptr<?> node2, String name, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_fence(Ptr<?> __data, Ptr<DmaDefinitions.dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_exit_mmap(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__es_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__es_shrink_enter(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_to_scan, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__fallocate_mode(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__folio_op(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__map_blocks_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned int len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__map_blocks_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int flags, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__mb_new_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__mballoc(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__trim(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__truncate(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__write_begin(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4__write_end(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_alloc_da_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_allocate_blocks(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_request> ar, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_allocate_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_begin_ordered_truncate(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long new_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_collapse_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_da_release_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int freed_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_da_reserve_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_resv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_da_update_reserve_space(Ptr<?> __data, Ptr<runtime.inode> inode2, int used_blocks, int quota_claim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_da_write_pages(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long first_page, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_da_write_pages_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_discard_blocks(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long blk, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_discard_preallocations(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_drop_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int drop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ext4_error($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void trace_event_raw_event_ext4_error(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, String function, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_es_find_extent_range_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_es_find_extent_range_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_es_insert_delayed_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es, boolean lclu_allocated, boolean end_allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_es_lookup_extent_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_es_lookup_extent_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es, int found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_es_remove_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_es_shrink(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_shrunk, @Unsigned long scan_time, int nr_skipped, int retried) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_es_shrink_scan_exit(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nr_shrunk, int cache_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_evict_inode(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_convert_to_initialized_enter(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_convert_to_initialized_fastpath(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux, Ptr<Ext4Definitions.ext4_extent> ix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_handle_unwritten_extents(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, int flags, @Unsigned int allocated, @Unsigned @OriginalName(value="ext4_fsblk_t") long newblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_load_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_remove_space(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_remove_space_done(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end, int depth, Ptr<misc.partial_cluster> pc, @Unsigned @OriginalName(value="__le16") short eh_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_rm_idx(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_rm_leaf(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, Ptr<Ext4Definitions.ext4_extent> ex, Ptr<misc.partial_cluster> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_ext_show_extent(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, @Unsigned short len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fallocate_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @Unsigned int max_blocks, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_cleanup(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int full, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_commit_start(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_commit_stop(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int nblks, int reason, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_replay(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int tag, int ino, int priv1, int priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_replay_scan(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int error, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_stats(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_track_dentry(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_track_inode(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fc_track_range(Ptr<?> __data, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, long start, long end, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_forget(Ptr<?> __data, Ptr<runtime.inode> inode2, int is_metadata, @Unsigned long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_free_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long block, @Unsigned long count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_free_inode(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_fsmap_class(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned int keydev, @Unsigned int agno, @Unsigned long bno, @Unsigned long len, @Unsigned long owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_get_implied_cluster_alloc_exit(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_map_blocks> map2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_getfsmap_class(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_fsmap> fsmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_insert_range(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_invalidate_folio_op(Ptr<?> __data, Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_journal_start_inode(Ptr<?> __data, Ptr<runtime.inode> inode2, int blocks, int rsv_blocks, int revoke_creds, int type2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_journal_start_reserved(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int blocks, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_journal_start_sb(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int blocks, int rsv_blocks, int revoke_creds, int type2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_lazy_itable_init(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_load_inode(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_mark_inode_dirty(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long IP) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_mb_discard_preallocations(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_mb_release_group_pa(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_mb_release_inode_pa(Ptr<?> __data, Ptr<Ext4Definitions.ext4_prealloc_space> pa, @Unsigned long block, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_mballoc_alloc(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_mballoc_prealloc(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_nfs_commit_metadata(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_other_inode_update_time(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ino_t") long orig_ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_prefetch_bitmaps(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @Unsigned @OriginalName(value="ext4_group_t") int next, @Unsigned int prefetch_ios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_read_block_bitmap_load(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long group, boolean prefetch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_remove_blocks(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_extent> ex, @Unsigned @OriginalName(value="ext4_lblk_t") int from, @Unsigned @OriginalName(value="ext4_fsblk_t") long to, Ptr<misc.partial_cluster> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_request_blocks(Ptr<?> __data, Ptr<Ext4Definitions.ext4_allocation_request> ar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_request_inode(Ptr<?> __data, Ptr<runtime.inode> dir, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_shutdown(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_sync_file_enter(Ptr<?> __data, Ptr<runtime.file> file2, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_sync_file_exit(Ptr<?> __data, Ptr<runtime.inode> inode2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_sync_fs(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_unlink_enter(Ptr<?> __data, Ptr<runtime.inode> parent, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_unlink_exit(Ptr<?> __data, Ptr<runtime.dentry> dentry2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_update_sb(Ptr<?> __data, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long fsblk, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_writepages(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ext4_writepages_result(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, int ret, int pages_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_fib6_table_lookup($arg1, (const struct net*)$arg2, (const struct fib6_result*)$arg3, $arg4, (const struct flowi6*)$arg5)")
    public static void trace_event_raw_event_fib6_table_lookup(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_result> res, Ptr<Fib6Definitions.fib6_table> table, Ptr<runtime.flowi6> flp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_flush_foreign(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned int frn_bdi_id, @Unsigned int frn_memcg_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_global_dirty_state(Ptr<?> __data, @Unsigned long background_thresh, @Unsigned long dirty_thresh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_gpio_direction(Ptr<?> __data, @Unsigned int gpio, int in, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_gpio_value(Ptr<?> __data, @Unsigned int gpio, int get, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_icmp_send($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_icmp_send(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int type2, int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_inode_foreign_history(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned int history) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_inode_switch_wbs(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<BdiDefinitions.bdi_writeback> old_wb, Ptr<BdiDefinitions.bdi_writeback> new_wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_complete(Ptr<?> __data, Ptr<?> ctx, Ptr<?> req2, @Unsigned long user_data, int res, @Unsigned int cflags, @Unsigned long extra1, @Unsigned long extra2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_cqe_overflow(Ptr<?> __data, Ptr<?> ctx, @Unsigned long user_data, int res, @Unsigned int cflags, Ptr<?> ocqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_cqring_wait(Ptr<?> __data, Ptr<?> ctx, int min_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_create(Ptr<?> __data, int fd2, Ptr<?> ctx, @Unsigned int sq_entries, @Unsigned int cq_entries, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_defer(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_fail_link(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, Ptr<IoDefinitions.io_kiocb> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_file_get(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_link(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, Ptr<IoDefinitions.io_kiocb> target_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_local_work_run(Ptr<?> __data, Ptr<?> ctx, int count, @Unsigned int loops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_poll_arm(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int mask, int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_queue_async_work(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_register(Ptr<?> __data, Ptr<?> ctx, @Unsigned int opcode, @Unsigned int nr_files, @Unsigned int nr_bufs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_io_uring_req_failed($arg1, (const struct io_uring_sqe*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_io_uring_req_failed(Ptr<?> __data, Ptr<IoDefinitions.io_uring_sqe> sqe, Ptr<IoDefinitions.io_kiocb> req2, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_short_write(Ptr<?> __data, Ptr<?> ctx, @Unsigned long fpos, @Unsigned long wanted, @Unsigned long got) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_submit_req(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_task_add(Ptr<?> __data, Ptr<IoDefinitions.io_kiocb> req2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_io_uring_task_work_run(Ptr<?> __data, Ptr<?> tctx, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_iocg_inuse_update($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void trace_event_raw_event_iocg_inuse_update(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int old_inuse, @Unsigned int new_inuse, @Unsigned long old_hw_inuse, @Unsigned long new_hw_inuse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iocost_ioc_vrate_adj(Ptr<?> __data, Ptr<runtime.ioc> ioc2, @Unsigned long new_vrate, Ptr<@Unsigned Integer> missed_ppm, @Unsigned int rq_wait_pct, int nr_lagging, int nr_shortages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_iocost_iocg_forgive_debt($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static void trace_event_raw_event_iocost_iocg_forgive_debt(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned int usage_pct, @Unsigned long old_debt, @Unsigned long new_debt, @Unsigned long old_delay, @Unsigned long new_delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_iocost_iocg_state($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void trace_event_raw_event_iocost_iocg_state(Ptr<?> __data, Ptr<IocDefinitions.ioc_gq> iocg, String path2, Ptr<IocDefinitions.ioc_now> now, @Unsigned long last_period, @Unsigned long cur_period, @Unsigned long vtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iomap_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iomap_dio_complete(Ptr<?> __data, Ptr<runtime.kiocb> iocb2, int error, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iomap_dio_rw_begin(Ptr<?> __data, Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, @Unsigned int dio_flags, @Unsigned long done_before) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_iomap_iter($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void trace_event_raw_event_iomap_iter(Ptr<?> __data, Ptr<IomapDefinitions.iomap_iter> iter2, Ptr<?> ops, @Unsigned long caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iomap_range_class(Ptr<?> __data, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iomap_readpage_class(Ptr<?> __data, Ptr<runtime.inode> inode2, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_iomap_writepage_map(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long pos, @Unsigned int dirty_len, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ipi_handler($arg1, (const u8*)$arg2)")
    public static void trace_event_raw_event_ipi_handler(Ptr<?> __data, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ipi_raise($arg1, (const struct cpumask*)$arg2, (const u8*)$arg3)")
    public static void trace_event_raw_event_ipi_raise(Ptr<?> __data, Ptr<runtime.cpumask> mask, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ipi_send_cpu($arg1, (const unsigned int)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_ipi_send_cpu(Ptr<?> __data, @Unsigned int cpu2, @Unsigned long callsite, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ipi_send_cpumask($arg1, (const struct cpumask*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_ipi_send_cpumask(Ptr<?> __data, Ptr<runtime.cpumask> cpumask2, @Unsigned long callsite, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_checkpoint(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_checkpoint_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, Ptr<misc.transaction_chp_stats_s> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_commit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr< @OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_end_commit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr< @OriginalName(value="transaction_t") misc.transaction_s> commit_transaction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_handle_extend(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int buffer_credits, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_handle_start_class(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int requested_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_handle_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned int type2, @Unsigned int line_no, int interval2, int sync2, int requested_blocks, int dirtied_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_journal_shrink(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_lock_buffer_stall(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned long stall_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_run_stats(Ptr<?> __data, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="tid_t") int tid, Ptr<misc.transaction_run_stats_s> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_shrink_checkpoint_list(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int first_tid, @Unsigned @OriginalName(value="tid_t") int tid, @Unsigned @OriginalName(value="tid_t") int last_tid, @Unsigned long nr_freed, @Unsigned @OriginalName(value="tid_t") int next_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_shrink_scan_exit(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long nr_to_scan, @Unsigned long nr_shrunk, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_submit_inode_data(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_update_log_tail(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int first_tid, @Unsigned long block_nr, @Unsigned long freed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_jbd2_write_superblock(Ptr<?> __data, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="blk_opf_t") int write_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ma_op($arg1, (const u8*)$arg2, $arg3)")
    public static void trace_event_raw_event_ma_op(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ma_read($arg1, (const u8*)$arg2, $arg3)")
    public static void trace_event_raw_event_ma_read(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_ma_write($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_ma_write(Ptr<?> __data, String fn, Ptr<misc.ma_state> mas, @Unsigned long piv, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_migration_pte(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_collapse_huge_page(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int isolated, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_collapse_huge_page_isolate(Ptr<?> __data, Ptr<runtime.page> page2, int none_or_zero, int referenced, boolean writable, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_collapse_huge_page_swapin(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int swapped_in, int referenced, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_khugepaged_collapse_file(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.folio> new_folio, @Unsigned long index2, @Unsigned long addr2, boolean is_shmem, Ptr<runtime.file> file2, int nr, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_khugepaged_scan_file(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.folio> folio2, Ptr<runtime.file> file2, int present, int swap, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_khugepaged_scan_pmd(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.page> page2, boolean writable, int referenced, int none_or_zero, int status, int unmapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_migrate_pages(Ptr<?> __data, @Unsigned long succeeded, @Unsigned long failed, @Unsigned long thp_succeeded, @Unsigned long thp_failed, @Unsigned long thp_split, @Unsigned long large_folio_split, MigrateDefinitions.migrate_mode mode, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_migrate_pages_start(Ptr<?> __data, MigrateDefinitions.migrate_mode mode, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_percpu_alloc_percpu(Ptr<?> __data, @Unsigned long call_site, boolean reserved, boolean is_atomic, @Unsigned long size, @Unsigned long align, Ptr<?> base_addr, int off, Ptr<?> ptr, @Unsigned long bytes_alloc, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_percpu_alloc_percpu_fail(Ptr<?> __data, boolean reserved, boolean is_atomic, @Unsigned long size, @Unsigned long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_percpu_create_chunk(Ptr<?> __data, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_percpu_destroy_chunk(Ptr<?> __data, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_percpu_free_percpu(Ptr<?> __data, Ptr<?> base_addr, int off, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_pwm($arg1, $arg2, (const struct pwm_state*)$arg3, $arg4)")
    public static void trace_event_raw_event_pwm(Ptr<?> __data, Ptr<PwmDefinitions.pwm_device> pwm, Ptr<PwmDefinitions.pwm_state> state2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_kthread_stop(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_kthread_stop_ret(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_kthread_work_execute_end(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_work> work, @OriginalName(value="kthread_work_func_t") Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_kthread_work_execute_start(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_kthread_work_queue_work(Ptr<?> __data, Ptr<KthreadDefinitions.kthread_worker> worker2, Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_migrate_task(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, int dest_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_move_numa(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, int src_cpu, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_numa_pair_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> src_tsk, int src_cpu, Ptr<TaskDefinitions.task_struct> dst_tsk, int dst_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_pi_setprio(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, Ptr<TaskDefinitions.task_struct> pi_task) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_prepare_exec(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> task2, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_process_exec(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p, @OriginalName(value="pid_t") int old_pid, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_process_fork(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> parent, Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_process_hang(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_process_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_process_wait(Ptr<?> __data, Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_skip_vma_numa(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma, NumaDefinitions.numa_vmaskip_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_stat_runtime(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long runtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_stat_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_switch(Ptr<?> __data, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_wake_idle_without_ipi(Ptr<?> __data, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sched_wakeup_template(Ptr<?> __data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_scsi_cmd_done_timeout_template(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_scsi_dispatch_cmd_error(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd, int rtn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_scsi_dispatch_cmd_start(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_scsi_eh_wakeup(Ptr<?> __data, Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_scsi_prepare_zone_append(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmnd, @Unsigned @OriginalName(value="sector_t") long lba, @Unsigned int wp_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_scsi_zone_wp_update(Ptr<?> __data, Ptr<ScsiDefinitions.scsi_cmnd> cmnd, @Unsigned @OriginalName(value="sector_t") long rq_sector, @Unsigned int wp_offset, @Unsigned int good_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_spi_controller(Ptr<?> __data, Ptr<SpiDefinitions.spi_controller> controller2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_spi_message(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_spi_message_done(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_spi_set_cs(Ptr<?> __data, Ptr<SpiDefinitions.spi_device> spi, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_spi_setup(Ptr<?> __data, Ptr<SpiDefinitions.spi_device> spi, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_spi_transfer(Ptr<?> __data, Ptr<SpiDefinitions.spi_message> msg, Ptr<SpiDefinitions.spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tlb_flush(Ptr<?> __data, int reason, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tmigr_connect_child_parent(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tmigr_connect_cpu_parent(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tmigr_cpugroup(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tmigr_group_and_cpu(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state state2, @Unsigned int childmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tmigr_group_set(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tmigr_handle_remote(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tmigr_idle(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_cpu> tmc, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tmigr_update_events(Ptr<?> __data, Ptr<TmigrDefinitions.tmigr_group> child, Ptr<TmigrDefinitions.tmigr_group> group, TmigrDefinitions.tmigr_state childstate, TmigrDefinitions.tmigr_state groupstate, @Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_track_foreign_dirty(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vm_unmapped_area(Ptr<?> __data, @Unsigned long addr2, Ptr<VmDefinitions.vm_unmapped_area_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vma_mas_szero(Ptr<?> __data, Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_vma_store(Ptr<?> __data, Ptr<MapleDefinitions.maple_tree> mt, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_wbc_class(Ptr<?> __data, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_wbt_lat(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned long lat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_wbt_stat(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<BlkDefinitions.blk_rq_stat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_wbt_step($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void trace_event_raw_event_wbt_step(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, String msg, int step, @Unsigned long window, @Unsigned int bg, @Unsigned int normal, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_wbt_timer(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned int status, int step, @Unsigned int inflight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_bdi_register(Ptr<?> __data, Ptr<BackingDefinitions.backing_dev_info> bdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_class(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_dirty_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_folio_template(Ptr<?> __data, Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_pages_written(Ptr<?> __data, long pages_written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_queue_io(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work, @Unsigned long dirtied_before, int moved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_sb_inodes_requeue(Ptr<?> __data, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_single_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc, @Unsigned long nr_to_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_work_class(Ptr<?> __data, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_writeback_write_inode_template(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_read_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_read_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char trace_find_mark(@Unsigned long d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_fn_bin(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_fn_hex(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_fn_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_fn_trace(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_func_repeats_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_func_repeats_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_graph_entry(Ptr<FtraceDefinitions.ftrace_graph_ent> trace, Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_graph_function(Ptr<trace_array> tr, @Unsigned long ip, @Unsigned long parent_ip, @Unsigned int trace_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_graph_return(Ptr<FtraceDefinitions.ftrace_graph_ret> trace, Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_graph_thresh_return(Ptr<FtraceDefinitions.ftrace_graph_ret> trace, Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_hwlat_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_hwlat_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_inject_entry(Ptr<trace_event_file> file2, Ptr<?> rec, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_kfree_skb_hit(Ptr<?> ignore, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2, SkbDefinitions.skb_drop_reason reason, Ptr<runtime.sock> rx_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_napi_poll_hit(Ptr<?> ignore, Ptr<NapiDefinitions.napi_struct> napi, int work, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_nop_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_osnoise_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_osnoise_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_output_call(Ptr<trace_iterator> iter2, String name, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_pagefault_reg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_pagefault_unreg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_percpu_create_chunk(Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)trace_print_array_seq($arg1, (const void*)$arg2, $arg3, $arg4))")
    public static String trace_print_array_seq(Ptr<trace_seq> p, Ptr<?> buf, int count, @Unsigned long el_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)trace_print_bitmask_seq($arg1, $arg2, $arg3))")
    public static String trace_print_bitmask_seq(Ptr<trace_seq> p, Ptr<?> bitmask_ptr, @Unsigned int bitmask_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_print_bprintk_msg_only(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_print_bputs_msg_only(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_print_context(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)trace_print_flags_seq($arg1, (const u8*)$arg2, $arg3, (const struct trace_print_flags*)$arg4))")
    public static String trace_print_flags_seq(Ptr<trace_seq> p, String delim, @Unsigned long flags, Ptr<trace_print_flags> flag_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_print_graph_duration(@Unsigned long duration, Ptr<trace_seq> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)trace_print_hex_dump_seq($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7, $arg8))")
    public static String trace_print_hex_dump_seq(Ptr<trace_seq> p, String prefix_str, int prefix_type, int rowsize, int groupsize, Ptr<?> buf, @Unsigned long len, boolean ascii) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)trace_print_hex_seq($arg1, (const u8*)$arg2, $arg3, $arg4))")
    public static String trace_print_hex_seq(Ptr<trace_seq> p, String buf, int buf_len, boolean concatenate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_print_lat_context(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_print_lat_fmt(Ptr<trace_seq> s2, Ptr<trace_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_print_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_print_printk_msg_only(Ptr<trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_print_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_print_seq(Ptr<SeqDefinitions.seq_file> m, Ptr<trace_seq> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)trace_print_symbols_seq($arg1, $arg2, (const struct trace_print_flags*)$arg3))")
    public static String trace_print_symbols_seq(Ptr<trace_seq> p, @Unsigned long val, Ptr<trace_print_flags> symbol_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_data(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_alarm_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_alarmtimer_suspend(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_bmdma_status(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_eh_action_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_eh_link_autopsy(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_eh_link_autopsy_qc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_exec_command_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_link_reset_begin_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_link_reset_end_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_port_eh_begin_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_qc_complete_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_qc_issue_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_sff_hsm_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_sff_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_tf_load(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ata_transfer_data_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_balance_dirty_pages(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_bdi_dirty_ratelimit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_bio(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_bio_complete(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_bio_remap(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_buffer(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_plug(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_rq(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_rq_completion(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_rq_remap(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_rq_requeue(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_split(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_block_unplug(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_bpf_trace_printk(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_csd_function(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_csd_queue_cpu(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devres(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_fence(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_exit_mmap(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__bitmap_load(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__es_extent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__es_shrink_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__fallocate_mode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__folio_op(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__map_blocks_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__map_blocks_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__mb_new_pa(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__mballoc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__trim(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__truncate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__write_begin(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4__write_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_alloc_da_blocks(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_allocate_blocks(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_allocate_inode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_begin_ordered_truncate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_collapse_range(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_da_release_space(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_da_reserve_space(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_da_update_reserve_space(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_da_write_pages(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_da_write_pages_extent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_discard_blocks(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_discard_preallocations(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_drop_inode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_error(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_es_find_extent_range_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_es_find_extent_range_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_es_insert_delayed_extent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_es_lookup_extent_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_es_lookup_extent_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_es_remove_extent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_es_shrink(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_es_shrink_scan_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_evict_inode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_convert_to_initialized_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_convert_to_initialized_fastpath(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_handle_unwritten_extents(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_load_extent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_remove_space(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_remove_space_done(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_rm_idx(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_rm_leaf(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_ext_show_extent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fallocate_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_cleanup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_commit_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_commit_stop(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_replay(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_replay_scan(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_stats(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_track_dentry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_track_inode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fc_track_range(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_forget(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_free_blocks(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_free_inode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_fsmap_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_get_implied_cluster_alloc_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_getfsmap_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_insert_range(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_invalidate_folio_op(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_journal_start_inode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_journal_start_reserved(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_journal_start_sb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_lazy_itable_init(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_load_inode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_mark_inode_dirty(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_mb_discard_preallocations(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_mb_release_group_pa(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_mb_release_inode_pa(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_mballoc_alloc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_mballoc_prealloc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_nfs_commit_metadata(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_other_inode_update_time(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_prefetch_bitmaps(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_read_block_bitmap_load(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_remove_blocks(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_request_blocks(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_request_inode(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_shutdown(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_sync_file_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_sync_file_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_sync_fs(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_unlink_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_unlink_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_update_sb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_writepages(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ext4_writepages_result(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_fib6_table_lookup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_flush_foreign(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_global_dirty_state(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_gpio_direction(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_gpio_value(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_icmp_send(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_inode_foreign_history(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_inode_switch_wbs(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_complete(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_cqe_overflow(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_cqring_wait(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_create(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_defer(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_fail_link(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_file_get(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_link(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_local_work_run(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_poll_arm(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_queue_async_work(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_register(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_req_failed(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_short_write(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_submit_req(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_task_add(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_io_uring_task_work_run(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iocg_inuse_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iocost_ioc_vrate_adj(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iocost_iocg_forgive_debt(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iocost_iocg_state(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iomap_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iomap_dio_complete(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iomap_dio_rw_begin(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iomap_iter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iomap_range_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iomap_readpage_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_iomap_writepage_map(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ipi_handler(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ipi_raise(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ipi_send_cpu(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ipi_send_cpumask(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_checkpoint(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_checkpoint_stats(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_commit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_end_commit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_handle_extend(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_handle_start_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_handle_stats(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_journal_shrink(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_lock_buffer_stall(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_run_stats(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_shrink_checkpoint_list(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_shrink_scan_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_submit_inode_data(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_update_log_tail(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_jbd2_write_superblock(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ma_op(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ma_read(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ma_write(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_migration_pte(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_collapse_huge_page(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_collapse_huge_page_isolate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_collapse_huge_page_swapin(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_khugepaged_collapse_file(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_khugepaged_scan_file(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_khugepaged_scan_pmd(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_migrate_pages(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_migrate_pages_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_percpu_alloc_percpu(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_percpu_alloc_percpu_fail(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_percpu_create_chunk(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_percpu_destroy_chunk(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_percpu_free_percpu(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_raw_output_prep(Ptr<trace_iterator> iter2, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_pwm(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_kthread_stop(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_kthread_stop_ret(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_kthread_work_execute_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_kthread_work_execute_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_kthread_work_queue_work(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_migrate_task(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_move_numa(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_numa_pair_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_pi_setprio(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_prepare_exec(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_process_exec(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_process_fork(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_process_hang(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_process_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_process_wait(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_skip_vma_numa(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_stat_runtime(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_stat_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_switch(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_wake_idle_without_ipi(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_wakeup_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_scsi_cmd_done_timeout_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_scsi_dispatch_cmd_error(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_scsi_dispatch_cmd_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_scsi_eh_wakeup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_scsi_prepare_zone_append(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_scsi_zone_wp_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_spi_controller(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_spi_message(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_spi_message_done(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_spi_set_cs(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_spi_setup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_spi_transfer(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tlb_flush(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tmigr_connect_child_parent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tmigr_connect_cpu_parent(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tmigr_cpugroup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tmigr_group_and_cpu(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tmigr_group_set(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tmigr_handle_remote(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tmigr_idle(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tmigr_update_events(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_track_foreign_dirty(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vm_unmapped_area(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vma_mas_szero(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_vma_store(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_wbc_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_wbt_lat(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_wbt_stat(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_wbt_step(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_wbt_timer(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_bdi_register(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_dirty_inode_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_folio_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_inode_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_pages_written(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_queue_io(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_sb_inodes_requeue(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_single_inode_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_work_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_writeback_write_inode_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_rcu_stall_warning((const u8*)$arg1, (const u8*)$arg2)")
    public static void trace_rcu_stall_warning(String rcuname, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String trace_seq_acquire(Ptr<trace_seq> s2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_bitmask($arg1, (const long unsigned int*)$arg2, $arg3)")
    public static void trace_seq_bitmask(Ptr<trace_seq> s2, Ptr<@Unsigned Long> maskp, int nmaskbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_bprintf($arg1, (const u8*)$arg2, (const unsigned int*)$arg3)")
    public static void trace_seq_bprintf(Ptr<trace_seq> s2, String fmt, Ptr<@Unsigned Integer> binary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_hex_dump($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int trace_seq_hex_dump(Ptr<trace_seq> s2, String prefix_str, int prefix_type, int rowsize, int groupsize, Ptr<?> buf, @Unsigned long len, boolean ascii) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_path($arg1, (const struct path*)$arg2)")
    public static int trace_seq_path(Ptr<trace_seq> s2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_seq_print_sym(Ptr<trace_seq> s2, @Unsigned long address, boolean offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static void trace_seq_printf(Ptr<trace_seq> s2, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_seq_putc(Ptr<trace_seq> s2, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_putmem($arg1, (const void*)$arg2, $arg3)")
    public static void trace_seq_putmem(Ptr<trace_seq> s2, Ptr<?> mem, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_putmem_hex($arg1, (const void*)$arg2, $arg3)")
    public static void trace_seq_putmem_hex(Ptr<trace_seq> s2, Ptr<?> mem, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_puts($arg1, (const u8*)$arg2)")
    public static void trace_seq_puts(Ptr<trace_seq> s2, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_seq_to_user(Ptr<trace_seq> s2, String ubuf, int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_seq_vprintf($arg1, (const u8*)$arg2, $arg3)")
    public static void trace_seq_vprintf(Ptr<trace_seq> s2, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_stack_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_timerlat_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_timerlat_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_user_stack_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_wake_hex(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_wake_print(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_wake_raw(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_xhci_dbg_reset_ep(Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __trace_add_new_event(Ptr<trace_event_call> call, Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__trace_define_field($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int __trace_define_field(Ptr<ListDefinitions.list_head> head, String type2, String name, int offset, int size, int is_signed, int filter_type, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __trace_early_add_event_dirs(Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __trace_early_add_events(Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __trace_probe_log_err(int offset, int err_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __trace_trigger_soft_disabled(Ptr<trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_action_create(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<ActionDefinitions.action_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_add_event_call(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_array_set_clr_event($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static int trace_array_set_clr_event(Ptr<trace_array> tr, String system, String event2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<trace_event_file> trace_create_new_event(Ptr<trace_event_call> call, Ptr<trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_define_field($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int trace_define_field(Ptr<trace_event_call> call, String type2, String name, int offset, int size, int is_signed, int filter_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_define_generic_fields() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_destroy_fields(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> trace_event_buffer_reserve(Ptr<trace_event_buffer> fbuffer, Ptr<trace_event_file> trace_file, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_enable_cmd_record(boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_enable_disable(Ptr<trace_event_file> file2, int enable, int soft_disable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_enable_tgid_record(boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_eval_update(Ptr<Ptr<trace_eval_map>> map2, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_follow_fork(Ptr<trace_array> tr, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_get_offsets_devlink_health_report($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static int trace_event_get_offsets_devlink_health_report(Ptr<trace_event_data_offsets_devlink_health_report> __data_offsets, Ptr<runtime.devlink> devlink2, String reporter_name, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_get_offsets_devlink_health_reporter_state_update($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4)")
    public static int trace_event_get_offsets_devlink_health_reporter_state_update(Ptr<trace_event_data_offsets_devlink_health_reporter_state_update> __data_offsets, Ptr<runtime.devlink> devlink2, String reporter_name, boolean new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_fdb_delete(Ptr<trace_event_data_offsets_fdb_delete> __data_offsets, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_fdb_entry> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_net_dev_xmit_timeout(Ptr<trace_event_data_offsets_net_dev_xmit_timeout> __data_offsets, Ptr<NetDefinitions.net_device> dev, int queue_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_get_offsets_qdisc_create($arg1, (const struct Qdisc_ops*)$arg2, $arg3, $arg4)")
    public static int trace_event_get_offsets_qdisc_create(Ptr<trace_event_data_offsets_qdisc_create> __data_offsets, Ptr<QdiscDefinitions.Qdisc_ops> ops, Ptr<NetDefinitions.net_device> dev, @Unsigned int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_qdisc_destroy(Ptr<trace_event_data_offsets_qdisc_destroy> __data_offsets, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_get_offsets_qdisc_reset(Ptr<trace_event_data_offsets_qdisc_reset> __data_offsets, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_event_ignore_this_pid(Ptr<trace_event_file> trace_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_br_fdb_add($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void trace_event_raw_event_br_fdb_add(Ptr<?> __data, Ptr<runtime.ndmsg> ndm, Ptr<NetDefinitions.net_device> dev, String addr2, @Unsigned short vid, @Unsigned short nlh_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_br_fdb_external_learn_add($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static void trace_event_raw_event_br_fdb_external_learn_add(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_port> p, String addr2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_br_fdb_update($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void trace_event_raw_event_br_fdb_update(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_port> source, String addr2, @Unsigned short vid, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_br_mdb_full($arg1, (const struct net_device*)$arg2, (const struct br_ip*)$arg3)")
    public static void trace_event_raw_event_br_mdb_full(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, Ptr<misc.br_ip> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_cgroup($arg1, $arg2, (const u8*)$arg3)")
    public static void trace_event_raw_event_cgroup(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_cgroup_event($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void trace_event_raw_event_cgroup_event(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, String path2, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_cgroup_migrate($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_cgroup_migrate(Ptr<?> __data, Ptr<runtime.cgroup> dst_cgrp, String path2, Ptr<TaskDefinitions.task_struct> task2, boolean threadgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cgroup_root(Ptr<?> __data, Ptr<CgroupDefinitions.cgroup_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cgroup_rstat(Ptr<?> __data, Ptr<runtime.cgroup> cgrp, int cpu2, boolean contended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_consume_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cros_ec_request_done(Ptr<?> __data, Ptr<CrosDefinitions.cros_ec_command> cmd, int retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_cros_ec_request_start(Ptr<?> __data, Ptr<CrosDefinitions.cros_ec_command> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dax_insert_mapping(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dax_pmd_fault_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long max_pgoff, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dax_pmd_insert_mapping_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, long length,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dax_pmd_load_hole_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> zero_folio, Ptr<?> radix_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dax_pte_fault_class(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_fault> vmf, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dax_writeback_one(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long pgoff, @Unsigned long pglen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dax_writeback_range_class(Ptr<?> __data, Ptr<runtime.inode> inode2, @Unsigned long start_index, @Unsigned long end_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_devfreq_frequency(Ptr<?> __data, Ptr<runtime.devfreq> devfreq2, @Unsigned long freq, @Unsigned long prev_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_devfreq_monitor(Ptr<?> __data, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_devlink_health_recover_aborted($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_devlink_health_recover_aborted(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, boolean health_state, @Unsigned long time_since_last_recover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_devlink_health_report($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static void trace_event_raw_event_devlink_health_report(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_devlink_health_reporter_state_update($arg1, (const struct devlink*)$arg2, (const u8*)$arg3, $arg4)")
    public static void trace_event_raw_event_devlink_health_reporter_state_update(Ptr<?> __data, Ptr<runtime.devlink> devlink2, String reporter_name, boolean new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_devlink_hwerr($arg1, (const struct devlink*)$arg2, $arg3, (const u8*)$arg4)")
    public static void trace_event_raw_event_devlink_hwerr(Ptr<?> __data, Ptr<runtime.devlink> devlink2, int err, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_devlink_hwmsg($arg1, (const struct devlink*)$arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void trace_event_raw_event_devlink_hwmsg(Ptr<?> __data, Ptr<runtime.devlink> devlink2, boolean incoming, @Unsigned long type2, Ptr<Character> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_devlink_trap_report($arg1, (const struct devlink*)$arg2, $arg3, (const struct devlink_trap_metadata*)$arg4)")
    public static void trace_event_raw_event_devlink_trap_report(Ptr<?> __data, Ptr<runtime.devlink> devlink2, Ptr<SkDefinitions.sk_buff> skb, Ptr<DevlinkDefinitions.devlink_trap_metadata> metadata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_alloc(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<?> virt_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_free(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<?> virt_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_map(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_map_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, int ents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_sync_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_sync_single(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_unmap(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dma_unmap_sg(Ptr<?> __data, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_dql_stall_detected(Ptr<?> __data, @Unsigned short thrs, @Unsigned int len, @Unsigned long last_reap, @Unsigned long hist_head, @Unsigned long now, Ptr<@Unsigned Long> hist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_emulate_vsyscall(Ptr<?> __data, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_error_da_monitor_id(Ptr<?> __data, int id, String state2, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_error_report_template(Ptr<?> __data, misc.error_detector error_detector2, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_event_da_monitor_id(Ptr<?> __data, int id, String state2, String event2, String next_state, boolean final_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_fdb_delete(Ptr<?> __data, Ptr<NetDefinitions.net_bridge> br, Ptr<NetDefinitions.net_bridge_fdb_entry> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_fib_table_lookup($arg1, $arg2, (const struct flowi4*)$arg3, (const struct fib_nh_common*)$arg4, $arg5)")
    public static void trace_event_raw_event_fib_table_lookup(Ptr<?> __data, @Unsigned int tb_id, Ptr<runtime.flowi4> flp, Ptr<FibDefinitions.fib_nh_common> nhc, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_file_check_and_advance_wb_err(Ptr<?> __data, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="errseq_t") int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_filelock_lease(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_filelock_lock(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> fl, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_filemap_set_wb_err(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="errseq_t") int eseq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_fuse_request_end($arg1, (const struct fuse_req*)$arg2)")
    public static void trace_event_raw_event_fuse_request_end(Ptr<?> __data, Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_fuse_request_send($arg1, (const struct fuse_req*)$arg2)")
    public static void trace_event_raw_event_fuse_request_send(Ptr<?> __data, Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_generic_add_lease(Ptr<?> __data, Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_handshake_alert_class($arg1, (const struct sock*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_handshake_alert_class(Ptr<?> __data, Ptr<runtime.sock> sk, char level, char description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_handshake_complete($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void trace_event_raw_event_handshake_complete(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_handshake_error_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void trace_event_raw_event_handshake_error_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_handshake_event_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4)")
    public static void trace_event_raw_event_handshake_event_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_handshake_fd_class($arg1, (const struct net*)$arg2, (const struct handshake_req*)$arg3, (const struct sock*)$arg4, $arg5)")
    public static void trace_event_raw_event_handshake_fd_class(Ptr<?> __data, Ptr<runtime.net> net2, Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<runtime.sock> sk, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hugepage_set(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_hugepage_update(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pte, @Unsigned long clr, @Unsigned long set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_i2c_read($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void trace_event_raw_event_i2c_read(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_i2c_reply($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void trace_event_raw_event_i2c_reply(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_i2c_result($arg1, (const struct i2c_adapter*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_i2c_result(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, int num, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_i2c_write($arg1, (const struct i2c_adapter*)$arg2, (const struct i2c_msg*)$arg3, $arg4)")
    public static void trace_event_raw_event_i2c_write(Ptr<?> __data, Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_inet_sk_error_report($arg1, (const struct sock*)$arg2)")
    public static void trace_event_raw_event_inet_sk_error_report(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_inet_sock_set_state($arg1, (const struct sock*)$arg2, (const int)$arg3, (const int)$arg4)")
    public static void trace_event_raw_event_inet_sock_set_state(Ptr<?> __data, Ptr<runtime.sock> sk, int oldstate, int newstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_irq_handler_entry(Ptr<?> __data, int irq, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_irq_handler_exit(Ptr<?> __data, int irq, Ptr<runtime.irqaction> action, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_irq_matrix_cpu(Ptr<?> __data, int bit, @Unsigned int cpu2, Ptr<IrqDefinitions.irq_matrix> matrix, Ptr<runtime.cpumap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_irq_matrix_global(Ptr<?> __data, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_irq_matrix_global_update(Ptr<?> __data, int bit, Ptr<IrqDefinitions.irq_matrix> matrix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_kfree($arg1, $arg2, (const void*)$arg3)")
    public static void trace_event_raw_event_kfree(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_kfree_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2, SkbDefinitions.skb_drop_reason reason, Ptr<runtime.sock> rx_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_kmalloc($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void trace_event_raw_event_kmalloc(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, @Unsigned long bytes_req, @Unsigned long bytes_alloc, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_kmem_cache_alloc($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static void trace_event_raw_event_kmem_cache_alloc(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_kmem_cache_free($arg1, $arg2, (const void*)$arg3, (const struct kmem_cache*)$arg4)")
    public static void trace_event_raw_event_kmem_cache_free(Ptr<?> __data, @Unsigned long call_site, Ptr<?> ptr, Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ksm_advisor(Ptr<?> __data, long scan_time, @Unsigned long pages_to_scan, @Unsigned int cpu_percent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ksm_enter_exit_template(Ptr<?> __data, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ksm_merge_one_page(Ptr<?> __data, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ksm_merge_with_ksm_page(Ptr<?> __data, Ptr<?> ksm_page, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ksm_remove_ksm_page(Ptr<?> __data, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ksm_remove_rmap_item(Ptr<?> __data, @Unsigned long pfn, Ptr<?> rmap_item, Ptr<?> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_ksm_scan_template(Ptr<?> __data, int seq, @Unsigned int rmap_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_leases_conflict(Ptr<?> __data, boolean conflict, Ptr<FileDefinitions.file_lease> lease, Ptr<FileDefinitions.file_lease> breaker) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_locks_get_lock_context(Ptr<?> __data, Ptr<runtime.inode> inode2, int type2, Ptr<FileDefinitions.file_lock_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_mctp_key_acquire($arg1, (const struct mctp_sk_key*)$arg2)")
    public static void trace_event_raw_event_mctp_key_acquire(Ptr<?> __data, Ptr<MctpDefinitions.mctp_sk_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_mctp_key_release($arg1, (const struct mctp_sk_key*)$arg2, $arg3)")
    public static void trace_event_raw_event_mctp_key_release(Ptr<?> __data, Ptr<MctpDefinitions.mctp_sk_key> key2, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_migration_pmd(Ptr<?> __data, @Unsigned long addr2, @Unsigned long pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_alloc_contig_migrate_range_info(Ptr<?> __data, @Unsigned long start, @Unsigned long end, @Unsigned long nr_migrated, @Unsigned long nr_reclaimed, @Unsigned long nr_mapped, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_filemap_fault(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_filemap_op_page_cache(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_filemap_op_page_cache_range(Ptr<?> __data, Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned long last_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_lru_activate(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_lru_insertion(Ptr<?> __data, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_page(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, int migratetype2, int percpu_refill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_page_alloc(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_page_alloc_extfrag(Ptr<?> __data, Ptr<runtime.page> page2, int alloc_order, int fallback_order, int alloc_migratetype, int fallback_migratetype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_page_free(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_page_free_batched(Ptr<?> __data, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_mm_page_pcpu_drain(Ptr<?> __data, Ptr<runtime.page> page2, @Unsigned int order, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_napi_poll(Ptr<?> __data, Ptr<NapiDefinitions.napi_struct> napi, int work, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_neigh__update(Ptr<?> __data, Ptr<runtime.neighbour> n, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_neigh_create($arg1, $arg2, $arg3, (const void*)$arg4, (const struct neighbour*)$arg5, $arg6)")
    public static void trace_event_raw_event_neigh_create(Ptr<?> __data, Ptr<NeighDefinitions.neigh_table> tbl, Ptr<NetDefinitions.net_device> dev, Ptr<?> pkey, Ptr<runtime.neighbour> n, boolean exempt_from_gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_neigh_update($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static void trace_event_raw_event_neigh_update(Ptr<?> __data, Ptr<runtime.neighbour> n, Ptr<Character> lladdr, char _new, @Unsigned int flags, @Unsigned int nlmsg_pid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_net_dev_rx_exit_template(Ptr<?> __data, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_net_dev_rx_verbose_template($arg1, (const struct sk_buff*)$arg2)")
    public static void trace_event_raw_event_net_dev_rx_verbose_template(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_net_dev_start_xmit($arg1, (const struct sk_buff*)$arg2, (const struct net_device*)$arg3)")
    public static void trace_event_raw_event_net_dev_start_xmit(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_net_dev_template(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_net_dev_xmit(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int rc2, Ptr<NetDefinitions.net_device> dev, @Unsigned int skb_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_net_dev_xmit_timeout(Ptr<?> __data, Ptr<NetDefinitions.net_device> dev, int queue_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_netlink_extack($arg1, (const u8*)$arg2)")
    public static void trace_event_raw_event_netlink_extack(Ptr<?> __data, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_notifier_info(Ptr<?> __data, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_page_pool_release($arg1, (const struct page_pool*)$arg2, $arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_page_pool_release(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, int inflight, @Unsigned int hold, @Unsigned int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_page_pool_state_hold($arg1, (const struct page_pool*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_page_pool_state_hold(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int hold) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_page_pool_state_release($arg1, (const struct page_pool*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_page_pool_state_release(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_page_pool_update_nid($arg1, (const struct page_pool*)$arg2, $arg3)")
    public static void trace_event_raw_event_page_pool_update_nid(Ptr<?> __data, Ptr<PageDefinitions.page_pool> pool, int new_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_qdisc_create($arg1, (const struct Qdisc_ops*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_qdisc_create(Ptr<?> __data, Ptr<QdiscDefinitions.Qdisc_ops> ops, Ptr<NetDefinitions.net_device> dev, @Unsigned int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_qdisc_dequeue($arg1, $arg2, (const struct netdev_queue*)$arg3, $arg4, $arg5)")
    public static void trace_event_raw_event_qdisc_dequeue(Ptr<?> __data, Ptr<runtime.Qdisc> qdisc, Ptr<NetdevDefinitions.netdev_queue> txq, int packets, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_qdisc_destroy(Ptr<?> __data, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_qdisc_enqueue($arg1, $arg2, (const struct netdev_queue*)$arg3, $arg4)")
    public static void trace_event_raw_event_qdisc_enqueue(Ptr<?> __data, Ptr<runtime.Qdisc> qdisc, Ptr<NetdevDefinitions.netdev_queue> txq, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_qdisc_reset(Ptr<?> __data, Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_regulator_basic($arg1, (const u8*)$arg2)")
    public static void trace_event_raw_event_regulator_basic(Ptr<?> __data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_regulator_range($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void trace_event_raw_event_regulator_range(Ptr<?> __data, String name, int min, int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_regulator_value($arg1, (const u8*)$arg2, $arg3)")
    public static void trace_event_raw_event_regulator_value(Ptr<?> __data, String name, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rpm_internal(Ptr<?> __data, Ptr<runtime.device> dev, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rpm_return_int(Ptr<?> __data, Ptr<runtime.device> dev, @Unsigned long ip, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rpm_status(Ptr<?> __data, Ptr<runtime.device> dev, RpmDefinitions.rpm_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rss_stat(Ptr<?> __data, Ptr<MmDefinitions.mm_struct> mm, int member) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rtc_alarm_irq_enable(Ptr<?> __data, @Unsigned int enabled, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rtc_irq_set_freq(Ptr<?> __data, int freq, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rtc_irq_set_state(Ptr<?> __data, int enabled, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rtc_offset_class(Ptr<?> __data, long offset, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rtc_time_alarm_class(Ptr<?> __data, @OriginalName(value="time64_t") long secs, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_rtc_timer_class(Ptr<?> __data, Ptr<RtcDefinitions.rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_sched_ext_dump($arg1, (const u8*)$arg2)")
    public static void trace_event_raw_event_sched_ext_dump(Ptr<?> __data, String line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_sk_data_ready($arg1, (const struct sock*)$arg2)")
    public static void trace_event_raw_event_sk_data_ready(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_skb_copy_datagram_iovec($arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static void trace_event_raw_event_skb_copy_datagram_iovec(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sock_exceed_buf_limit(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<runtime.proto> prot, long allocated, int kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sock_msg_length(Ptr<?> __data, Ptr<runtime.sock> sk, int ret, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sock_rcvqueue_full(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_softirq(Ptr<?> __data, @Unsigned int vec_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sys_enter(Ptr<?> __data, Ptr<PtDefinitions.pt_regs> regs, long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_sys_exit(Ptr<?> __data, Ptr<PtDefinitions.pt_regs> regs, long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tasklet(Ptr<?> __data, Ptr<TaskletDefinitions.tasklet_struct> t, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_ao_event($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const u8)$arg4, (const u8)$arg5, (const u8)$arg6)")
    public static void trace_event_raw_event_tcp_ao_event(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, char keyid, char rnext, char maclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_ao_event_sk($arg1, (const struct sock*)$arg2, (const u8)$arg3, (const u8)$arg4)")
    public static void trace_event_raw_event_tcp_ao_event_sk(Ptr<?> __data, Ptr<runtime.sock> sk, char keyid, char rnext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_ao_event_sne($arg1, (const struct sock*)$arg2, $arg3)")
    public static void trace_event_raw_event_tcp_ao_event_sne(Ptr<?> __data, Ptr<runtime.sock> sk, @Unsigned int new_sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_cong_state_set($arg1, $arg2, (const u8)$arg3)")
    public static void trace_event_raw_event_tcp_cong_state_set(Ptr<?> __data, Ptr<runtime.sock> sk, char ca_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tcp_event_sk(Ptr<?> __data, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_event_sk_skb($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void trace_event_raw_event_tcp_event_sk_skb(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_event_skb($arg1, (const struct sk_buff*)$arg2)")
    public static void trace_event_raw_event_tcp_event_skb(Ptr<?> __data, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_hash_event($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3)")
    public static void trace_event_raw_event_tcp_hash_event(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_tcp_probe(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_retransmit_synack($arg1, (const struct sock*)$arg2, (const struct request_sock*)$arg3)")
    public static void trace_event_raw_event_tcp_retransmit_synack(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tcp_send_reset($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, (const enum sk_rst_reason)$arg4)")
    public static void trace_event_raw_event_tcp_send_reset(Ptr<?> __data, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb__nullable, SkDefinitions.sk_rst_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_test_pages_isolated(Ptr<?> __data, @Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long fin_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_event_raw_event_tls_contenttype($arg1, (const struct sock*)$arg2, $arg3)")
    public static void trace_event_raw_event_tls_contenttype(Ptr<?> __data, Ptr<runtime.sock> sk, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_udp_fail_queue_rcv_skb(Ptr<?> __data, int rc2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_workqueue_activate_work(Ptr<?> __data, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_workqueue_execute_end(Ptr<?> __data, Ptr<misc.work_struct> work, @OriginalName(value="work_func_t") Ptr<?> function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_workqueue_execute_start(Ptr<?> __data, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_workqueue_queue_work(Ptr<?> __data, int req_cpu, Ptr<misc.pool_workqueue> pwq, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_event_raw_event_x86_exceptions(Ptr<?> __data, @Unsigned long address, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_raw_init(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_reg(Ptr<trace_event_call> call, trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_event_trigger_enable_disable(Ptr<trace_event_file> file2, int trigger_enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_ext4_ext_convert_to_initialized_fastpath(Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_extent> ux, Ptr<Ext4Definitions.ext4_extent> ix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FtraceDefinitions.ftrace_event_field> trace_find_event_field(Ptr<trace_event_call> call, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_format_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_get_event_file((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static Ptr<trace_event_file> trace_get_event_file(String instance, String system, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_hwlat_callback(boolean enter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_hwlat_sample(Ptr<HwlatDefinitions.hwlat_sample> sample2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_init_flags_sys_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_init_flags_sys_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<trace_pid_list> trace_pid_list_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_pid_list_clear(Ptr<trace_pid_list> pid_list, @Unsigned int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_pid_list_first(Ptr<trace_pid_list> pid_list, Ptr<@Unsigned Integer> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_pid_list_free(Ptr<trace_pid_list> pid_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean trace_pid_list_is_set(Ptr<trace_pid_list> pid_list, @Unsigned int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_pid_list_next(Ptr<trace_pid_list> pid_list, @Unsigned int pid2, Ptr<@Unsigned Integer> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_pid_list_set(Ptr<trace_pid_list> pid_list, @Unsigned int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_probe_add_file(Ptr<trace_probe> tp, Ptr<trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_probe_append(Ptr<trace_probe> tp, Ptr<trace_probe> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_probe_cleanup(Ptr<trace_probe> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_probe_compare_arg_type(Ptr<trace_probe> a, Ptr<trace_probe> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_probe_create((const u8*)$arg1, (int (*)(int, const u8**))$arg2)")
    public static int trace_probe_create(String raw_command, Ptr<?> createfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_file_link> trace_probe_get_file_link(Ptr<trace_probe> tp, Ptr<trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_probe_init($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int trace_probe_init(Ptr<trace_probe> tp, String event2, String group, boolean alloc_filter, int nargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_probe_log_clear() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_probe_log_init((const u8*)$arg1, $arg2, (const u8**)$arg3)")
    public static void trace_probe_log_init(String subsystem, int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_probe_log_set_index(int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_probe_match_command_args($arg1, $arg2, (const u8**)$arg3)")
    public static boolean trace_probe_match_command_args(Ptr<trace_probe> tp, int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_probe_print_args(Ptr<trace_seq> s2, Ptr<ProbeDefinitions.probe_arg> args, int nr_args, Ptr<Character> data, Ptr<?> field) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_probe_register_event_call(Ptr<trace_probe> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_probe_remove_file(Ptr<trace_probe> tp, Ptr<trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_probe_unlink(Ptr<trace_probe> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trace_put_event_file(Ptr<trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_br_fdb_add(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_br_fdb_external_learn_add(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_br_fdb_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_br_mdb_full(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cgroup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cgroup_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cgroup_migrate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cgroup_root(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cgroup_rstat(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_consume_skb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cros_ec_request_done(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_cros_ec_request_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dax_insert_mapping(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dax_pmd_fault_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dax_pmd_insert_mapping_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dax_pmd_load_hole_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dax_pte_fault_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dax_writeback_one(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dax_writeback_range_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devfreq_frequency(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devfreq_monitor(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devlink_health_recover_aborted(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devlink_health_report(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devlink_health_reporter_state_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devlink_hwerr(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devlink_hwmsg(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_devlink_trap_report(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_alloc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_free(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_map(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_map_sg(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_sync_sg(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_sync_single(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_unmap(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dma_unmap_sg(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_dql_stall_detected(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_emulate_vsyscall(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_error_da_monitor_id(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_error_report_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_event_da_monitor_id(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_fdb_delete(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_fib_table_lookup(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_file_check_and_advance_wb_err(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_filelock_lease(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_filelock_lock(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_filemap_set_wb_err(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_fuse_request_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_fuse_request_send(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_generic_add_lease(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_handshake_alert_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_handshake_complete(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_handshake_error_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_handshake_event_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_handshake_fd_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hugepage_set(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_hugepage_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_i2c_read(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_i2c_reply(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_i2c_result(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_i2c_write(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_inet_sk_error_report(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_inet_sock_set_state(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_irq_handler_entry(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_irq_handler_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_irq_matrix_cpu(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_irq_matrix_global(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_irq_matrix_global_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_kfree(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_kfree_skb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_kmalloc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_kmem_cache_alloc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_kmem_cache_free(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ksm_advisor(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ksm_enter_exit_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ksm_merge_one_page(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ksm_merge_with_ksm_page(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ksm_remove_ksm_page(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ksm_remove_rmap_item(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_ksm_scan_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_leases_conflict(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_locks_get_lock_context(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mctp_key_acquire(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mctp_key_release(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_migration_pmd(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_alloc_contig_migrate_range_info(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_filemap_fault(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_filemap_op_page_cache(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_filemap_op_page_cache_range(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_lru_activate(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_lru_insertion(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_page(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_page_alloc(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_page_alloc_extfrag(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_page_free(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_page_free_batched(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_mm_page_pcpu_drain(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_napi_poll(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_neigh__update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_neigh_create(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_neigh_update(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_net_dev_rx_exit_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_net_dev_rx_verbose_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_net_dev_start_xmit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_net_dev_template(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_net_dev_xmit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_net_dev_xmit_timeout(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_netlink_extack(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_notifier_info(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_page_pool_release(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_page_pool_state_hold(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_page_pool_state_release(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_page_pool_update_nid(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_qdisc_create(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_qdisc_dequeue(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_qdisc_destroy(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_qdisc_enqueue(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_qdisc_reset(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regulator_basic(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regulator_range(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_regulator_value(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rpm_internal(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rpm_return_int(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rpm_status(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rss_stat(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rtc_alarm_irq_enable(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rtc_irq_set_freq(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rtc_irq_set_state(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rtc_offset_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rtc_time_alarm_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_rtc_timer_class(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sched_ext_dump(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sk_data_ready(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_skb_copy_datagram_iovec(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sock_exceed_buf_limit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sock_msg_length(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sock_rcvqueue_full(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_softirq(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sys_enter(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_sys_exit(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tasklet(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_ao_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_ao_event_sk(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_ao_event_sne(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_cong_state_set(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_event_sk(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_event_sk_skb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_event_skb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_hash_event(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_probe(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_retransmit_synack(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tcp_send_reset(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_test_pages_isolated(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_tls_contenttype(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_udp_fail_queue_rcv_skb(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_workqueue_activate_work(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_workqueue_execute_end(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_workqueue_execute_start(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_workqueue_queue_work(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t trace_raw_output_x86_exceptions(Ptr<trace_iterator> iter2, int flags, Ptr<trace_event> trace_event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_rb_cpu_prepare(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trace_remove_event_call(Ptr<trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trace_set_clr_event((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static int trace_set_clr_event(String system, String event2, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ma_write")
    @NotUsableInJava
    public static class trace_event_data_offsets_ma_write
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ma_read")
    @NotUsableInJava
    public static class trace_event_data_offsets_ma_read
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ma_op")
    @NotUsableInJava
    public static class trace_event_data_offsets_ma_op
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ma_write")
    @NotUsableInJava
    public static class trace_event_raw_ma_write
    extends Struct {
        public trace_entry ent;
        public String fn;
        public @Unsigned long min;
        public @Unsigned long max;
        public @Unsigned long index;
        public @Unsigned long last;
        public @Unsigned long piv;
        public Ptr<?> val;
        public Ptr<?> node;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ma_read")
    @NotUsableInJava
    public static class trace_event_raw_ma_read
    extends Struct {
        public trace_entry ent;
        public String fn;
        public @Unsigned long min;
        public @Unsigned long max;
        public @Unsigned long index;
        public @Unsigned long last;
        public Ptr<?> node;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ma_op")
    @NotUsableInJava
    public static class trace_event_raw_ma_op
    extends Struct {
        public trace_entry ent;
        public String fn;
        public @Unsigned long min;
        public @Unsigned long max;
        public @Unsigned long index;
        public @Unsigned long last;
        public Ptr<?> node;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_fib6_table_lookup")
    @NotUsableInJava
    public static class trace_event_data_offsets_fib6_table_lookup
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_fib6_table_lookup")
    @NotUsableInJava
    public static class trace_event_raw_fib6_table_lookup
    extends Struct {
        public trace_entry ent;
        public @Unsigned int tb_id;
        public int err;
        public int oif;
        public int iif;
        public char tos;
        public char scope;
        public char flags;
        public char @Size(value=16) [] src;
        public char @Size(value=16) [] dst;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public char proto;
        public char rt_type;
        public char @Size(value=16) [] name;
        public char @Size(value=16) [] gw;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_icmp_send")
    @NotUsableInJava
    public static class trace_event_data_offsets_icmp_send
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_icmp_send")
    @NotUsableInJava
    public static class trace_event_raw_icmp_send
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public int type;
        public int code;
        public char @Size(value=4) [] saddr;
        public char @Size(value=4) [] daddr;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short ulen;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_spi_transfer")
    @NotUsableInJava
    public static class trace_event_data_offsets_spi_transfer
    extends Struct {
        public @Unsigned int rx_buf;
        public Ptr<?> rx_buf_ptr_;
        public @Unsigned int tx_buf;
        public Ptr<?> tx_buf_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_spi_message_done")
    @NotUsableInJava
    public static class trace_event_data_offsets_spi_message_done
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_spi_message")
    @NotUsableInJava
    public static class trace_event_data_offsets_spi_message
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_spi_set_cs")
    @NotUsableInJava
    public static class trace_event_data_offsets_spi_set_cs
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_spi_setup")
    @NotUsableInJava
    public static class trace_event_data_offsets_spi_setup
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_spi_controller")
    @NotUsableInJava
    public static class trace_event_data_offsets_spi_controller
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_spi_transfer")
    @NotUsableInJava
    public static class trace_event_raw_spi_transfer
    extends Struct {
        public trace_entry ent;
        public int bus_num;
        public int chip_select;
        public Ptr<SpiDefinitions.spi_transfer> xfer;
        public int len;
        public @Unsigned int __data_loc_rx_buf;
        public @Unsigned int __data_loc_tx_buf;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_spi_message_done")
    @NotUsableInJava
    public static class trace_event_raw_spi_message_done
    extends Struct {
        public trace_entry ent;
        public int bus_num;
        public int chip_select;
        public Ptr<SpiDefinitions.spi_message> msg;
        public @Unsigned int frame;
        public @Unsigned int actual;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_spi_message")
    @NotUsableInJava
    public static class trace_event_raw_spi_message
    extends Struct {
        public trace_entry ent;
        public int bus_num;
        public int chip_select;
        public Ptr<SpiDefinitions.spi_message> msg;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_spi_set_cs")
    @NotUsableInJava
    public static class trace_event_raw_spi_set_cs
    extends Struct {
        public trace_entry ent;
        public int bus_num;
        public int chip_select;
        public @Unsigned long mode;
        public boolean enable;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_spi_setup")
    @NotUsableInJava
    public static class trace_event_raw_spi_setup
    extends Struct {
        public trace_entry ent;
        public int bus_num;
        public int chip_select;
        public @Unsigned long mode;
        public @Unsigned int bits_per_word;
        public @Unsigned int max_speed_hz;
        public int status;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_spi_controller")
    @NotUsableInJava
    public static class trace_event_raw_spi_controller
    extends Struct {
        public trace_entry ent;
        public int bus_num;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_sff_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_sff_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_transfer_data_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_transfer_data_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_sff_hsm_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_sff_hsm_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_port_eh_begin_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_port_eh_begin_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_link_reset_end_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_link_reset_end_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_link_reset_begin_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_link_reset_begin_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_eh_action_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_eh_action_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_eh_link_autopsy_qc")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_eh_link_autopsy_qc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_eh_link_autopsy")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_eh_link_autopsy
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_bmdma_status")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_bmdma_status
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_exec_command_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_exec_command_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_tf_load")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_tf_load
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_qc_complete_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_qc_complete_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ata_qc_issue_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ata_qc_issue_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_sff_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_sff_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public char hsm_state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_transfer_data_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_transfer_data_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int ata_dev;
        public @Unsigned int tag;
        public @Unsigned int flags;
        public @Unsigned int offset;
        public @Unsigned int bytes;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_sff_hsm_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_sff_hsm_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int ata_dev;
        public @Unsigned int tag;
        public @Unsigned int qc_flags;
        public @Unsigned int protocol;
        public @Unsigned int hsm_state;
        public char dev_state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_port_eh_begin_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_port_eh_begin_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_link_reset_end_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_link_reset_end_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int @Size(value=2) [] _class;
        public int rc;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_link_reset_begin_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_link_reset_begin_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int @Size(value=2) [] _class;
        public @Unsigned long deadline;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_eh_action_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_eh_action_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int ata_dev;
        public @Unsigned int eh_action;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_eh_link_autopsy_qc")
    @NotUsableInJava
    public static class trace_event_raw_ata_eh_link_autopsy_qc
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int ata_dev;
        public @Unsigned int tag;
        public @Unsigned int qc_flags;
        public @Unsigned int eh_err_mask;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_eh_link_autopsy")
    @NotUsableInJava
    public static class trace_event_raw_ata_eh_link_autopsy
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int ata_dev;
        public @Unsigned int eh_action;
        public @Unsigned int eh_err_mask;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_bmdma_status")
    @NotUsableInJava
    public static class trace_event_raw_ata_bmdma_status
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int tag;
        public char host_stat;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_exec_command_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_exec_command_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int tag;
        public char cmd;
        public char feature;
        public char hob_nsect;
        public char proto;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_tf_load")
    @NotUsableInJava
    public static class trace_event_raw_ata_tf_load
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public char cmd;
        public char dev;
        public char lbal;
        public char lbam;
        public char lbah;
        public char nsect;
        public char feature;
        public char hob_lbal;
        public char hob_lbam;
        public char hob_lbah;
        public char hob_nsect;
        public char hob_feature;
        public char proto;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_qc_complete_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_qc_complete_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int ata_dev;
        public @Unsigned int tag;
        public char status;
        public char dev;
        public char lbal;
        public char lbam;
        public char lbah;
        public char nsect;
        public char error;
        public char hob_lbal;
        public char hob_lbam;
        public char hob_lbah;
        public char hob_nsect;
        public char hob_feature;
        public char ctl;
        public @Unsigned long flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ata_qc_issue_template")
    @NotUsableInJava
    public static class trace_event_raw_ata_qc_issue_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ata_port;
        public @Unsigned int ata_dev;
        public @Unsigned int tag;
        public char cmd;
        public char dev;
        public char lbal;
        public char lbam;
        public char lbah;
        public char nsect;
        public char feature;
        public char hob_lbal;
        public char hob_lbam;
        public char hob_lbah;
        public char hob_nsect;
        public char hob_feature;
        public char ctl;
        public char proto;
        public @Unsigned long flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_scsi_zone_wp_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_scsi_zone_wp_update
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_scsi_prepare_zone_append")
    @NotUsableInJava
    public static class trace_event_data_offsets_scsi_prepare_zone_append
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_scsi_zone_wp_update")
    @NotUsableInJava
    public static class trace_event_raw_scsi_zone_wp_update
    extends Struct {
        public trace_entry ent;
        public @Unsigned int host_no;
        public @Unsigned int channel;
        public @Unsigned int id;
        public @Unsigned int lun;
        public @Unsigned @OriginalName(value="sector_t") long rq_sector;
        public @Unsigned int wp_offset;
        public @Unsigned int good_bytes;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_scsi_prepare_zone_append")
    @NotUsableInJava
    public static class trace_event_raw_scsi_prepare_zone_append
    extends Struct {
        public trace_entry ent;
        public @Unsigned int host_no;
        public @Unsigned int channel;
        public @Unsigned int id;
        public @Unsigned int lun;
        public @Unsigned @OriginalName(value="sector_t") long lba;
        public @Unsigned int wp_offset;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_scsi_eh_wakeup")
    @NotUsableInJava
    public static class trace_event_data_offsets_scsi_eh_wakeup
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_scsi_cmd_done_timeout_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_scsi_cmd_done_timeout_template
    extends Struct {
        public @Unsigned int cmnd;
        public Ptr<?> cmnd_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_scsi_dispatch_cmd_error")
    @NotUsableInJava
    public static class trace_event_data_offsets_scsi_dispatch_cmd_error
    extends Struct {
        public @Unsigned int cmnd;
        public Ptr<?> cmnd_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_scsi_dispatch_cmd_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_scsi_dispatch_cmd_start
    extends Struct {
        public @Unsigned int cmnd;
        public Ptr<?> cmnd_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_scsi_eh_wakeup")
    @NotUsableInJava
    public static class trace_event_raw_scsi_eh_wakeup
    extends Struct {
        public trace_entry ent;
        public @Unsigned int host_no;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_scsi_cmd_done_timeout_template")
    @NotUsableInJava
    public static class trace_event_raw_scsi_cmd_done_timeout_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int host_no;
        public @Unsigned int channel;
        public @Unsigned int id;
        public @Unsigned int lun;
        public int result;
        public @Unsigned int opcode;
        public @Unsigned int cmd_len;
        public int driver_tag;
        public int scheduler_tag;
        public @Unsigned int data_sglen;
        public @Unsigned int prot_sglen;
        public char prot_op;
        public @Unsigned int __data_loc_cmnd;
        public char sense_key;
        public char asc;
        public char ascq;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_scsi_dispatch_cmd_error")
    @NotUsableInJava
    public static class trace_event_raw_scsi_dispatch_cmd_error
    extends Struct {
        public trace_entry ent;
        public @Unsigned int host_no;
        public @Unsigned int channel;
        public @Unsigned int id;
        public @Unsigned int lun;
        public int rtn;
        public @Unsigned int opcode;
        public @Unsigned int cmd_len;
        public int driver_tag;
        public int scheduler_tag;
        public @Unsigned int data_sglen;
        public @Unsigned int prot_sglen;
        public char prot_op;
        public @Unsigned int __data_loc_cmnd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_scsi_dispatch_cmd_start")
    @NotUsableInJava
    public static class trace_event_raw_scsi_dispatch_cmd_start
    extends Struct {
        public trace_entry ent;
        public @Unsigned int host_no;
        public @Unsigned int channel;
        public @Unsigned int id;
        public @Unsigned int lun;
        public @Unsigned int opcode;
        public @Unsigned int cmd_len;
        public int driver_tag;
        public int scheduler_tag;
        public @Unsigned int data_sglen;
        public @Unsigned int prot_sglen;
        public char prot_op;
        public @Unsigned int __data_loc_cmnd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_fence")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_fence
    extends Struct {
        public @Unsigned int driver;
        public Ptr<?> driver_ptr_;
        public @Unsigned int timeline;
        public Ptr<?> timeline_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_fence")
    @NotUsableInJava
    public static class trace_event_raw_dma_fence
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_driver;
        public @Unsigned int __data_loc_timeline;
        public @Unsigned int context;
        public @Unsigned int seqno;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devres")
    @NotUsableInJava
    public static class trace_event_data_offsets_devres
    extends Struct {
        public @Unsigned int devname;
        public Ptr<?> devname_ptr_;
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devres")
    @NotUsableInJava
    public static class trace_event_raw_devres
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_devname;
        public Ptr<runtime.device> dev;
        public String op;
        public Ptr<?> node;
        public @Unsigned int __data_loc_name;
        public @Unsigned long size;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_pwm")
    @NotUsableInJava
    public static class trace_event_data_offsets_pwm
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_pwm")
    @NotUsableInJava
    public static class trace_event_raw_pwm
    extends Struct {
        public trace_entry ent;
        public @Unsigned int chipid;
        public @Unsigned int hwpwm;
        public @Unsigned long period;
        public @Unsigned long duty_cycle;
        public PwmDefinitions.pwm_polarity polarity;
        public boolean enabled;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_gpio_value")
    @NotUsableInJava
    public static class trace_event_data_offsets_gpio_value
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_gpio_direction")
    @NotUsableInJava
    public static class trace_event_data_offsets_gpio_direction
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_gpio_value")
    @NotUsableInJava
    public static class trace_event_raw_gpio_value
    extends Struct {
        public trace_entry ent;
        public @Unsigned int gpio;
        public int get;
        public int value;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_gpio_direction")
    @NotUsableInJava
    public static class trace_event_raw_gpio_direction
    extends Struct {
        public trace_entry ent;
        public @Unsigned int gpio;
        public int in;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_local_work_run")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_local_work_run
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_short_write")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_short_write
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_task_work_run")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_task_work_run
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_cqe_overflow")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_cqe_overflow
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_req_failed")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_req_failed
    extends Struct {
        public @Unsigned int op_str;
        public Ptr<?> op_str_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_task_add")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_task_add
    extends Struct {
        public @Unsigned int op_str;
        public Ptr<?> op_str_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_poll_arm")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_poll_arm
    extends Struct {
        public @Unsigned int op_str;
        public Ptr<?> op_str_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_submit_req")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_submit_req
    extends Struct {
        public @Unsigned int op_str;
        public Ptr<?> op_str_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_complete")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_complete
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_fail_link")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_fail_link
    extends Struct {
        public @Unsigned int op_str;
        public Ptr<?> op_str_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_cqring_wait")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_cqring_wait
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_link")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_link
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_defer")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_defer
    extends Struct {
        public @Unsigned int op_str;
        public Ptr<?> op_str_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_queue_async_work")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_queue_async_work
    extends Struct {
        public @Unsigned int op_str;
        public Ptr<?> op_str_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_file_get")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_file_get
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_register")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_register
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_io_uring_create")
    @NotUsableInJava
    public static class trace_event_data_offsets_io_uring_create
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_local_work_run")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_local_work_run
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public int count;
        public @Unsigned int loops;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_short_write")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_short_write
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public @Unsigned long fpos;
        public @Unsigned long wanted;
        public @Unsigned long got;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_task_work_run")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_task_work_run
    extends Struct {
        public trace_entry ent;
        public Ptr<?> tctx;
        public @Unsigned int count;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_cqe_overflow")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_cqe_overflow
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public @Unsigned long user_data;
        public int res;
        public @Unsigned int cflags;
        public Ptr<?> ocqe;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_req_failed")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_req_failed
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long user_data;
        public char opcode;
        public char flags;
        public char ioprio;
        public @Unsigned long off;
        public @Unsigned long addr;
        public @Unsigned int len;
        public @Unsigned int op_flags;
        public @Unsigned short buf_index;
        public @Unsigned short personality;
        public @Unsigned int file_index;
        public @Unsigned long pad1;
        public @Unsigned long addr3;
        public int error;
        public @Unsigned int __data_loc_op_str;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_task_add")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_task_add
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long user_data;
        public char opcode;
        public int mask;
        public @Unsigned int __data_loc_op_str;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_poll_arm")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_poll_arm
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long user_data;
        public char opcode;
        public int mask;
        public int events;
        public @Unsigned int __data_loc_op_str;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_submit_req")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_submit_req
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long user_data;
        public char opcode;
        public @Unsigned long flags;
        public boolean sq_thread;
        public @Unsigned int __data_loc_op_str;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_complete")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_complete
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long user_data;
        public int res;
        public @Unsigned int cflags;
        public @Unsigned long extra1;
        public @Unsigned long extra2;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_fail_link")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_fail_link
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long user_data;
        public char opcode;
        public Ptr<?> link;
        public @Unsigned int __data_loc_op_str;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_cqring_wait")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_cqring_wait
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public int min_events;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_link")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_link
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public Ptr<?> target_req;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_defer")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_defer
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long data;
        public char opcode;
        public @Unsigned int __data_loc_op_str;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_queue_async_work")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_queue_async_work
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long user_data;
        public char opcode;
        public @Unsigned long flags;
        public Ptr<IoDefinitions.io_wq_work> work;
        public int rw;
        public @Unsigned int __data_loc_op_str;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_file_get")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_file_get
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public Ptr<?> req;
        public @Unsigned long user_data;
        public int fd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_register")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_register
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ctx;
        public @Unsigned int opcode;
        public @Unsigned int nr_files;
        public @Unsigned int nr_bufs;
        public long ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_io_uring_create")
    @NotUsableInJava
    public static class trace_event_raw_io_uring_create
    extends Struct {
        public trace_entry ent;
        public int fd;
        public Ptr<?> ctx;
        public @Unsigned int sq_entries;
        public @Unsigned int cq_entries;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_wbt_timer")
    @NotUsableInJava
    public static class trace_event_data_offsets_wbt_timer
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_wbt_step")
    @NotUsableInJava
    public static class trace_event_data_offsets_wbt_step
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_wbt_lat")
    @NotUsableInJava
    public static class trace_event_data_offsets_wbt_lat
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_wbt_stat")
    @NotUsableInJava
    public static class trace_event_data_offsets_wbt_stat
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_wbt_timer")
    @NotUsableInJava
    public static class trace_event_raw_wbt_timer
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned int status;
        public int step;
        public @Unsigned int inflight;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_wbt_step")
    @NotUsableInJava
    public static class trace_event_raw_wbt_step
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public String msg;
        public int step;
        public @Unsigned long window;
        public @Unsigned int bg;
        public @Unsigned int normal;
        public @Unsigned int max;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_wbt_lat")
    @NotUsableInJava
    public static class trace_event_raw_wbt_lat
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned long lat;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_wbt_stat")
    @NotUsableInJava
    public static class trace_event_raw_wbt_stat
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public long rmean;
        public @Unsigned long rmin;
        public @Unsigned long rmax;
        public long rnr_samples;
        public long rtime;
        public long wmean;
        public @Unsigned long wmin;
        public @Unsigned long wmax;
        public long wnr_samples;
        public long wtime;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iocost_iocg_forgive_debt")
    @NotUsableInJava
    public static class trace_event_data_offsets_iocost_iocg_forgive_debt
    extends Struct {
        public @Unsigned int devname;
        public Ptr<?> devname_ptr_;
        public @Unsigned int cgroup;
        public Ptr<?> cgroup_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iocost_ioc_vrate_adj")
    @NotUsableInJava
    public static class trace_event_data_offsets_iocost_ioc_vrate_adj
    extends Struct {
        public @Unsigned int devname;
        public Ptr<?> devname_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iocg_inuse_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_iocg_inuse_update
    extends Struct {
        public @Unsigned int devname;
        public Ptr<?> devname_ptr_;
        public @Unsigned int cgroup;
        public Ptr<?> cgroup_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iocost_iocg_state")
    @NotUsableInJava
    public static class trace_event_data_offsets_iocost_iocg_state
    extends Struct {
        public @Unsigned int devname;
        public Ptr<?> devname_ptr_;
        public @Unsigned int cgroup;
        public Ptr<?> cgroup_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iocost_iocg_forgive_debt")
    @NotUsableInJava
    public static class trace_event_raw_iocost_iocg_forgive_debt
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_devname;
        public @Unsigned int __data_loc_cgroup;
        public @Unsigned long now;
        public @Unsigned long vnow;
        public @Unsigned int usage_pct;
        public @Unsigned long old_debt;
        public @Unsigned long new_debt;
        public @Unsigned long old_delay;
        public @Unsigned long new_delay;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iocost_ioc_vrate_adj")
    @NotUsableInJava
    public static class trace_event_raw_iocost_ioc_vrate_adj
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_devname;
        public @Unsigned long old_vrate;
        public @Unsigned long new_vrate;
        public int busy_level;
        public @Unsigned int read_missed_ppm;
        public @Unsigned int write_missed_ppm;
        public @Unsigned int rq_wait_pct;
        public int nr_lagging;
        public int nr_shortages;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iocg_inuse_update")
    @NotUsableInJava
    public static class trace_event_raw_iocg_inuse_update
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_devname;
        public @Unsigned int __data_loc_cgroup;
        public @Unsigned long now;
        public @Unsigned int old_inuse;
        public @Unsigned int new_inuse;
        public @Unsigned long old_hweight_inuse;
        public @Unsigned long new_hweight_inuse;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iocost_iocg_state")
    @NotUsableInJava
    public static class trace_event_raw_iocost_iocg_state
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_devname;
        public @Unsigned int __data_loc_cgroup;
        public @Unsigned long now;
        public @Unsigned long vnow;
        public @Unsigned long vrate;
        public @Unsigned long last_period;
        public @Unsigned long cur_period;
        public @Unsigned long vtime;
        public @Unsigned int weight;
        public @Unsigned int inuse;
        public @Unsigned long hweight_active;
        public @Unsigned long hweight_inuse;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_rq_remap")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_rq_remap
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_bio_remap")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_bio_remap
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_split")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_split
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_unplug")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_unplug
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_plug")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_plug
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_bio")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_bio
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_bio_complete")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_bio_complete
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_rq")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_rq
    extends Struct {
        public @Unsigned int cmd;
        public Ptr<?> cmd_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_rq_completion")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_rq_completion
    extends Struct {
        public @Unsigned int cmd;
        public Ptr<?> cmd_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_rq_requeue")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_rq_requeue
    extends Struct {
        public @Unsigned int cmd;
        public Ptr<?> cmd_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_block_buffer")
    @NotUsableInJava
    public static class trace_event_data_offsets_block_buffer
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_rq_remap")
    @NotUsableInJava
    public static class trace_event_raw_block_rq_remap
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned int nr_sector;
        public @Unsigned @OriginalName(value="dev_t") int old_dev;
        public @Unsigned @OriginalName(value="sector_t") long old_sector;
        public @Unsigned int nr_bios;
        public char @Size(value=8) [] rwbs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_bio_remap")
    @NotUsableInJava
    public static class trace_event_raw_block_bio_remap
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned int nr_sector;
        public @Unsigned @OriginalName(value="dev_t") int old_dev;
        public @Unsigned @OriginalName(value="sector_t") long old_sector;
        public char @Size(value=8) [] rwbs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_split")
    @NotUsableInJava
    public static class trace_event_raw_block_split
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned @OriginalName(value="sector_t") long new_sector;
        public char @Size(value=8) [] rwbs;
        public char @Size(value=16) [] comm;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_unplug")
    @NotUsableInJava
    public static class trace_event_raw_block_unplug
    extends Struct {
        public trace_entry ent;
        public int nr_rq;
        public char @Size(value=16) [] comm;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_plug")
    @NotUsableInJava
    public static class trace_event_raw_block_plug
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_bio")
    @NotUsableInJava
    public static class trace_event_raw_block_bio
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned int nr_sector;
        public char @Size(value=8) [] rwbs;
        public char @Size(value=16) [] comm;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_bio_complete")
    @NotUsableInJava
    public static class trace_event_raw_block_bio_complete
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned int nr_sector;
        public int error;
        public char @Size(value=8) [] rwbs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_rq")
    @NotUsableInJava
    public static class trace_event_raw_block_rq
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned int nr_sector;
        public @Unsigned int bytes;
        public @Unsigned short ioprio;
        public char @Size(value=8) [] rwbs;
        public char @Size(value=16) [] comm;
        public @Unsigned int __data_loc_cmd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_rq_completion")
    @NotUsableInJava
    public static class trace_event_raw_block_rq_completion
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned int nr_sector;
        public int error;
        public @Unsigned short ioprio;
        public char @Size(value=8) [] rwbs;
        public @Unsigned int __data_loc_cmd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_rq_requeue")
    @NotUsableInJava
    public static class trace_event_raw_block_rq_requeue
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned int nr_sector;
        public @Unsigned short ioprio;
        public char @Size(value=8) [] rwbs;
        public @Unsigned int __data_loc_cmd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_block_buffer")
    @NotUsableInJava
    public static class trace_event_raw_block_buffer
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned long size;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_shrink_checkpoint_list")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_shrink_checkpoint_list
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_shrink_scan_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_shrink_scan_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_journal_shrink")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_journal_shrink
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_lock_buffer_stall")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_lock_buffer_stall
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_write_superblock")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_write_superblock
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_update_log_tail")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_update_log_tail
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_checkpoint_stats")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_checkpoint_stats
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_run_stats")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_run_stats
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_handle_stats")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_handle_stats
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_handle_extend")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_handle_extend
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_handle_start_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_handle_start_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_submit_inode_data")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_submit_inode_data
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_end_commit")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_end_commit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_commit")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_commit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_jbd2_checkpoint")
    @NotUsableInJava
    public static class trace_event_data_offsets_jbd2_checkpoint
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_shrink_checkpoint_list")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_shrink_checkpoint_list
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int first_tid;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public @Unsigned @OriginalName(value="tid_t") int last_tid;
        public @Unsigned long nr_freed;
        public @Unsigned @OriginalName(value="tid_t") int next_tid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_shrink_scan_exit")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_shrink_scan_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long nr_to_scan;
        public @Unsigned long nr_shrunk;
        public @Unsigned long count;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_journal_shrink")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_journal_shrink
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long nr_to_scan;
        public @Unsigned long count;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_lock_buffer_stall")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_lock_buffer_stall
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long stall_ms;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_write_superblock")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_write_superblock
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="blk_opf_t") int write_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_update_log_tail")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_update_log_tail
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int tail_sequence;
        public @Unsigned @OriginalName(value="tid_t") int first_tid;
        public @Unsigned long block_nr;
        public @Unsigned long freed;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_checkpoint_stats")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_checkpoint_stats
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public @Unsigned long chp_time;
        public @Unsigned int forced_to_close;
        public @Unsigned int written;
        public @Unsigned int dropped;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_run_stats")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_run_stats
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public @Unsigned long wait;
        public @Unsigned long request_delay;
        public @Unsigned long running;
        public @Unsigned long locked;
        public @Unsigned long flushing;
        public @Unsigned long logging;
        public @Unsigned int handle_count;
        public @Unsigned int blocks;
        public @Unsigned int blocks_logged;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_handle_stats")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_handle_stats
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public @Unsigned int type;
        public @Unsigned int line_no;
        public int interval;
        public int sync;
        public int requested_blocks;
        public int dirtied_blocks;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_handle_extend")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_handle_extend
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public @Unsigned int type;
        public @Unsigned int line_no;
        public int buffer_credits;
        public int requested_blocks;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_handle_start_class")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_handle_start_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public @Unsigned int type;
        public @Unsigned int line_no;
        public int requested_blocks;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_submit_inode_data")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_submit_inode_data
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_end_commit")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_end_commit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public char sync_commit;
        public @Unsigned @OriginalName(value="tid_t") int transaction;
        public @Unsigned @OriginalName(value="tid_t") int head;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_commit")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_commit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public char sync_commit;
        public @Unsigned @OriginalName(value="tid_t") int transaction;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_jbd2_checkpoint")
    @NotUsableInJava
    public static class trace_event_raw_jbd2_checkpoint
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int result;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_update_sb")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_update_sb
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_cleanup")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_cleanup
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_track_range")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_track_range
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_track_inode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_track_inode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_track_dentry")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_track_dentry
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_stats")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_stats
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_commit_stop")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_commit_stop
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_commit_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_commit_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_replay")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_replay
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fc_replay_scan")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fc_replay_scan
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_lazy_itable_init")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_lazy_itable_init
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_prefetch_bitmaps")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_prefetch_bitmaps
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_error")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_error
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_shutdown")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_shutdown
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_getfsmap_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_getfsmap_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fsmap_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fsmap_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_es_insert_delayed_extent")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_es_insert_delayed_extent
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_es_shrink")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_es_shrink
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_insert_range")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_insert_range
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_collapse_range")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_collapse_range
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_es_shrink_scan_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_es_shrink_scan_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__es_shrink_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__es_shrink_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_es_lookup_extent_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_es_lookup_extent_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_es_lookup_extent_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_es_lookup_extent_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_es_find_extent_range_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_es_find_extent_range_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_es_find_extent_range_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_es_find_extent_range_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_es_remove_extent")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_es_remove_extent
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__es_extent")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__es_extent
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_remove_space_done")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_remove_space_done
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_remove_space")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_remove_space
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_rm_idx")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_rm_idx
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_rm_leaf")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_rm_leaf
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_remove_blocks")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_remove_blocks
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_show_extent")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_show_extent
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_get_implied_cluster_alloc_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_get_implied_cluster_alloc_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_handle_unwritten_extents")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_handle_unwritten_extents
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__trim")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__trim
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_journal_start_reserved")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_journal_start_reserved
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_journal_start_inode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_journal_start_inode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_journal_start_sb")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_journal_start_sb
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_load_inode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_load_inode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_load_extent")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_load_extent
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__map_blocks_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__map_blocks_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__map_blocks_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__map_blocks_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_convert_to_initialized_fastpath")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_convert_to_initialized_fastpath
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_ext_convert_to_initialized_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_ext_convert_to_initialized_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__truncate")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__truncate
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_unlink_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_unlink_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_unlink_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_unlink_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_fallocate_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_fallocate_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__fallocate_mode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__fallocate_mode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_read_block_bitmap_load")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_read_block_bitmap_load
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__bitmap_load")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__bitmap_load
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_da_release_space")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_da_release_space
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_da_reserve_space")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_da_reserve_space
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_da_update_reserve_space")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_da_update_reserve_space
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_forget")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_forget
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__mballoc")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__mballoc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_mballoc_prealloc")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_mballoc_prealloc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_mballoc_alloc")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_mballoc_alloc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_alloc_da_blocks")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_alloc_da_blocks
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_sync_fs")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_sync_fs
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_sync_file_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_sync_file_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_sync_file_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_sync_file_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_free_blocks")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_free_blocks
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_allocate_blocks")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_allocate_blocks
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_request_blocks")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_request_blocks
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_mb_discard_preallocations")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_mb_discard_preallocations
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_discard_preallocations")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_discard_preallocations
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_mb_release_group_pa")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_mb_release_group_pa
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_mb_release_inode_pa")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_mb_release_inode_pa
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__mb_new_pa")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__mb_new_pa
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_discard_blocks")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_discard_blocks
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_invalidate_folio_op")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_invalidate_folio_op
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__folio_op")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__folio_op
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_writepages_result")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_writepages_result
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_da_write_pages_extent")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_da_write_pages_extent
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_da_write_pages")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_da_write_pages
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_writepages")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_writepages
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__write_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__write_end
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4__write_begin")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4__write_begin
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_begin_ordered_truncate")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_begin_ordered_truncate
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_mark_inode_dirty")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_mark_inode_dirty
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_nfs_commit_metadata")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_nfs_commit_metadata
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_drop_inode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_drop_inode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_evict_inode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_evict_inode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_allocate_inode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_allocate_inode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_request_inode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_request_inode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_free_inode")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_free_inode
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ext4_other_inode_update_time")
    @NotUsableInJava
    public static class trace_event_data_offsets_ext4_other_inode_update_time
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_update_sb")
    @NotUsableInJava
    public static class trace_event_raw_ext4_update_sb
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long fsblk;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_cleanup")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_cleanup
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int j_fc_off;
        public int full;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_track_range")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_track_range
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int t_tid;
        public @Unsigned @OriginalName(value="ino_t") long i_ino;
        public @Unsigned @OriginalName(value="tid_t") int i_sync_tid;
        public long start;
        public long end;
        public int error;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_track_inode")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_track_inode
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int t_tid;
        public @Unsigned @OriginalName(value="ino_t") long i_ino;
        public @Unsigned @OriginalName(value="tid_t") int i_sync_tid;
        public int error;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_track_dentry")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_track_dentry
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int t_tid;
        public @Unsigned @OriginalName(value="ino_t") long i_ino;
        public @Unsigned @OriginalName(value="tid_t") int i_sync_tid;
        public int error;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_stats")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_stats
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int @Size(value=10) [] fc_ineligible_rc;
        public @Unsigned long fc_commits;
        public @Unsigned long fc_ineligible_commits;
        public @Unsigned long fc_numblks;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_commit_stop")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_commit_stop
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int nblks;
        public int reason;
        public int num_fc;
        public int num_fc_ineligible;
        public int nblks_agg;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_commit_start")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_commit_start
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="tid_t") int tid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_replay")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_replay
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int tag;
        public int ino;
        public int priv1;
        public int priv2;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fc_replay_scan")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fc_replay_scan
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int error;
        public int off;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_lazy_itable_init")
    @NotUsableInJava
    public static class trace_event_raw_ext4_lazy_itable_init
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int group;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_prefetch_bitmaps")
    @NotUsableInJava
    public static class trace_event_raw_ext4_prefetch_bitmaps
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int group;
        public @Unsigned int next;
        public @Unsigned int ios;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_error")
    @NotUsableInJava
    public static class trace_event_raw_ext4_error
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public String function;
        public @Unsigned int line;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_shutdown")
    @NotUsableInJava
    public static class trace_event_raw_ext4_shutdown
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_getfsmap_class")
    @NotUsableInJava
    public static class trace_event_raw_ext4_getfsmap_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="dev_t") int keydev;
        public @Unsigned long block;
        public @Unsigned long len;
        public @Unsigned long owner;
        public @Unsigned long flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fsmap_class")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fsmap_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="dev_t") int keydev;
        public @Unsigned int agno;
        public @Unsigned long bno;
        public @Unsigned long len;
        public @Unsigned long owner;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_es_insert_delayed_extent")
    @NotUsableInJava
    public static class trace_event_raw_ext4_es_insert_delayed_extent
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public char status;
        public boolean lclu_allocated;
        public boolean end_allocated;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_es_shrink")
    @NotUsableInJava
    public static class trace_event_raw_ext4_es_shrink
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int nr_shrunk;
        public @Unsigned long scan_time;
        public int nr_skipped;
        public int retried;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_insert_range")
    @NotUsableInJava
    public static class trace_event_raw_ext4_insert_range
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long offset;
        public @OriginalName(value="loff_t") long len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_collapse_range")
    @NotUsableInJava
    public static class trace_event_raw_ext4_collapse_range
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long offset;
        public @OriginalName(value="loff_t") long len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_es_shrink_scan_exit")
    @NotUsableInJava
    public static class trace_event_raw_ext4_es_shrink_scan_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int nr_shrunk;
        public int cache_cnt;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__es_shrink_enter")
    @NotUsableInJava
    public static class trace_event_raw_ext4__es_shrink_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int nr_to_scan;
        public int cache_cnt;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_es_lookup_extent_exit")
    @NotUsableInJava
    public static class trace_event_raw_ext4_es_lookup_extent_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public char status;
        public int found;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_es_lookup_extent_enter")
    @NotUsableInJava
    public static class trace_event_raw_ext4_es_lookup_extent_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_es_find_extent_range_exit")
    @NotUsableInJava
    public static class trace_event_raw_ext4_es_find_extent_range_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public char status;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_es_find_extent_range_enter")
    @NotUsableInJava
    public static class trace_event_raw_ext4_es_find_extent_range_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_es_remove_extent")
    @NotUsableInJava
    public static class trace_event_raw_ext4_es_remove_extent
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long lblk;
        public @OriginalName(value="loff_t") long len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__es_extent")
    @NotUsableInJava
    public static class trace_event_raw_ext4__es_extent
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public char status;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_remove_space_done")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_remove_space_done
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int start;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int end;
        public int depth;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pc_pclu;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int pc_lblk;
        public int pc_state;
        public @Unsigned short eh_entries;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_remove_space")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_remove_space
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int start;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int end;
        public int depth;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_rm_idx")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_rm_idx
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_rm_leaf")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_rm_leaf
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int start;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int ee_lblk;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long ee_pblk;
        public short ee_len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pc_pclu;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int pc_lblk;
        public int pc_state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_remove_blocks")
    @NotUsableInJava
    public static class trace_event_raw_ext4_remove_blocks
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int from;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int to;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long ee_pblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int ee_lblk;
        public @Unsigned short ee_len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pc_pclu;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int pc_lblk;
        public int pc_state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_show_extent")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_show_extent
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned short len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_get_implied_cluster_alloc_exit")
    @NotUsableInJava
    public static class trace_event_raw_ext4_get_implied_cluster_alloc_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int flags;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public @Unsigned int len;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_handle_unwritten_extents")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_handle_unwritten_extents
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public int flags;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public @Unsigned int len;
        public @Unsigned int allocated;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long newblk;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__trim")
    @NotUsableInJava
    public static class trace_event_raw_ext4__trim
    extends Struct {
        public trace_entry ent;
        public int dev_major;
        public int dev_minor;
        public @Unsigned int group;
        public int start;
        public int len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_journal_start_reserved")
    @NotUsableInJava
    public static class trace_event_raw_ext4_journal_start_reserved
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ip;
        public int blocks;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_journal_start_inode")
    @NotUsableInJava
    public static class trace_event_raw_ext4_journal_start_inode
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ino;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ip;
        public int blocks;
        public int rsv_blocks;
        public int revoke_creds;
        public int type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_journal_start_sb")
    @NotUsableInJava
    public static class trace_event_raw_ext4_journal_start_sb
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ip;
        public int blocks;
        public int rsv_blocks;
        public int revoke_creds;
        public int type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_load_inode")
    @NotUsableInJava
    public static class trace_event_raw_ext4_load_inode
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_load_extent")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_load_extent
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__map_blocks_exit")
    @NotUsableInJava
    public static class trace_event_raw_ext4__map_blocks_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned int flags;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned int len;
        public @Unsigned int mflags;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__map_blocks_enter")
    @NotUsableInJava
    public static class trace_event_raw_ext4__map_blocks_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned int len;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_convert_to_initialized_fastpath")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_convert_to_initialized_fastpath
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int m_lblk;
        public @Unsigned int m_len;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int u_lblk;
        public @Unsigned int u_len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long u_pblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int i_lblk;
        public @Unsigned int i_len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long i_pblk;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_ext_convert_to_initialized_enter")
    @NotUsableInJava
    public static class trace_event_raw_ext4_ext_convert_to_initialized_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int m_lblk;
        public @Unsigned int m_len;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int u_lblk;
        public @Unsigned int u_len;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long u_pblk;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__truncate")
    @NotUsableInJava
    public static class trace_event_raw_ext4__truncate
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long blocks;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_unlink_exit")
    @NotUsableInJava
    public static class trace_event_raw_ext4_unlink_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_unlink_enter")
    @NotUsableInJava
    public static class trace_event_raw_ext4_unlink_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ino_t") long parent;
        public @OriginalName(value="loff_t") long size;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_fallocate_exit")
    @NotUsableInJava
    public static class trace_event_raw_ext4_fallocate_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long pos;
        public @Unsigned int blocks;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__fallocate_mode")
    @NotUsableInJava
    public static class trace_event_raw_ext4__fallocate_mode
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long offset;
        public @OriginalName(value="loff_t") long len;
        public int mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_read_block_bitmap_load")
    @NotUsableInJava
    public static class trace_event_raw_ext4_read_block_bitmap_load
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int group;
        public boolean prefetch;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__bitmap_load")
    @NotUsableInJava
    public static class trace_event_raw_ext4__bitmap_load
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int group;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_da_release_space")
    @NotUsableInJava
    public static class trace_event_raw_ext4_da_release_space
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long i_blocks;
        public int freed_blocks;
        public int reserved_data_blocks;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_da_reserve_space")
    @NotUsableInJava
    public static class trace_event_raw_ext4_da_reserve_space
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long i_blocks;
        public int reserve_blocks;
        public int reserved_data_blocks;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_da_update_reserve_space")
    @NotUsableInJava
    public static class trace_event_raw_ext4_da_update_reserve_space
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long i_blocks;
        public int used_blocks;
        public int reserved_data_blocks;
        public int quota_claim;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_forget")
    @NotUsableInJava
    public static class trace_event_raw_ext4_forget
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long block;
        public int is_metadata;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__mballoc")
    @NotUsableInJava
    public static class trace_event_raw_ext4__mballoc
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public int result_start;
        public @Unsigned int result_group;
        public int result_len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_mballoc_prealloc")
    @NotUsableInJava
    public static class trace_event_raw_ext4_mballoc_prealloc
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned int orig_logical;
        public int orig_start;
        public @Unsigned int orig_group;
        public int orig_len;
        public @Unsigned int result_logical;
        public int result_start;
        public @Unsigned int result_group;
        public int result_len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_mballoc_alloc")
    @NotUsableInJava
    public static class trace_event_raw_ext4_mballoc_alloc
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned int orig_logical;
        public int orig_start;
        public @Unsigned int orig_group;
        public int orig_len;
        public @Unsigned int goal_logical;
        public int goal_start;
        public @Unsigned int goal_group;
        public int goal_len;
        public @Unsigned int result_logical;
        public int result_start;
        public @Unsigned int result_group;
        public int result_len;
        public @Unsigned short found;
        public @Unsigned short groups;
        public @Unsigned short buddy;
        public @Unsigned short flags;
        public @Unsigned short tail;
        public char cr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_alloc_da_blocks")
    @NotUsableInJava
    public static class trace_event_raw_ext4_alloc_da_blocks
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned int data_blocks;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_sync_fs")
    @NotUsableInJava
    public static class trace_event_raw_ext4_sync_fs
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int wait;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_sync_file_exit")
    @NotUsableInJava
    public static class trace_event_raw_ext4_sync_file_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_sync_file_enter")
    @NotUsableInJava
    public static class trace_event_raw_ext4_sync_file_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ino_t") long parent;
        public int datasync;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_free_blocks")
    @NotUsableInJava
    public static class trace_event_raw_ext4_free_blocks
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long block;
        public @Unsigned long count;
        public int flags;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_allocate_blocks")
    @NotUsableInJava
    public static class trace_event_raw_ext4_allocate_blocks
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long block;
        public @Unsigned int len;
        public @Unsigned int logical;
        public @Unsigned int lleft;
        public @Unsigned int lright;
        public @Unsigned long goal;
        public @Unsigned long pleft;
        public @Unsigned long pright;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_request_blocks")
    @NotUsableInJava
    public static class trace_event_raw_ext4_request_blocks
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned int len;
        public @Unsigned int logical;
        public @Unsigned int lleft;
        public @Unsigned int lright;
        public @Unsigned long goal;
        public @Unsigned long pleft;
        public @Unsigned long pright;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_mb_discard_preallocations")
    @NotUsableInJava
    public static class trace_event_raw_ext4_mb_discard_preallocations
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int needed;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_discard_preallocations")
    @NotUsableInJava
    public static class trace_event_raw_ext4_discard_preallocations
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned int len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_mb_release_group_pa")
    @NotUsableInJava
    public static class trace_event_raw_ext4_mb_release_group_pa
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long pa_pstart;
        public @Unsigned int pa_len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_mb_release_inode_pa")
    @NotUsableInJava
    public static class trace_event_raw_ext4_mb_release_inode_pa
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long block;
        public @Unsigned int count;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__mb_new_pa")
    @NotUsableInJava
    public static class trace_event_raw_ext4__mb_new_pa
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long pa_pstart;
        public @Unsigned long pa_lstart;
        public @Unsigned int pa_len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_discard_blocks")
    @NotUsableInJava
    public static class trace_event_raw_ext4_discard_blocks
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long blk;
        public @Unsigned long count;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_invalidate_folio_op")
    @NotUsableInJava
    public static class trace_event_raw_ext4_invalidate_folio_op
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long index;
        public @Unsigned long offset;
        public @Unsigned long length;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__folio_op")
    @NotUsableInJava
    public static class trace_event_raw_ext4__folio_op
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long index;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_writepages_result")
    @NotUsableInJava
    public static class trace_event_raw_ext4_writepages_result
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public int ret;
        public int pages_written;
        public long pages_skipped;
        public @Unsigned long writeback_index;
        public int sync_mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_da_write_pages_extent")
    @NotUsableInJava
    public static class trace_event_raw_ext4_da_write_pages_extent
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long lblk;
        public @Unsigned int len;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_da_write_pages")
    @NotUsableInJava
    public static class trace_event_raw_ext4_da_write_pages
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long first_page;
        public long nr_to_write;
        public int sync_mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_writepages")
    @NotUsableInJava
    public static class trace_event_raw_ext4_writepages
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public long nr_to_write;
        public long pages_skipped;
        public @OriginalName(value="loff_t") long range_start;
        public @OriginalName(value="loff_t") long range_end;
        public @Unsigned long writeback_index;
        public int sync_mode;
        public char for_kupdate;
        public char range_cyclic;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__write_end")
    @NotUsableInJava
    public static class trace_event_raw_ext4__write_end
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long pos;
        public @Unsigned int len;
        public @Unsigned int copied;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4__write_begin")
    @NotUsableInJava
    public static class trace_event_raw_ext4__write_begin
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long pos;
        public @Unsigned int len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_begin_ordered_truncate")
    @NotUsableInJava
    public static class trace_event_raw_ext4_begin_ordered_truncate
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long new_size;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_mark_inode_dirty")
    @NotUsableInJava
    public static class trace_event_raw_ext4_mark_inode_dirty
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long ip;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_nfs_commit_metadata")
    @NotUsableInJava
    public static class trace_event_raw_ext4_nfs_commit_metadata
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_drop_inode")
    @NotUsableInJava
    public static class trace_event_raw_ext4_drop_inode
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public int drop;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_evict_inode")
    @NotUsableInJava
    public static class trace_event_raw_ext4_evict_inode
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public int nlink;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_allocate_inode")
    @NotUsableInJava
    public static class trace_event_raw_ext4_allocate_inode
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ino_t") long dir;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_request_inode")
    @NotUsableInJava
    public static class trace_event_raw_ext4_request_inode
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long dir;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_free_inode")
    @NotUsableInJava
    public static class trace_event_raw_ext4_free_inode
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="uid_t") int uid;
        public @Unsigned @OriginalName(value="gid_t") int gid;
        public @Unsigned long blocks;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ext4_other_inode_update_time")
    @NotUsableInJava
    public static class trace_event_raw_ext4_other_inode_update_time
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ino_t") long orig_ino;
        public @Unsigned @OriginalName(value="uid_t") int uid;
        public @Unsigned @OriginalName(value="gid_t") int gid;
        public @Unsigned short mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iomap_dio_complete")
    @NotUsableInJava
    public static class trace_event_data_offsets_iomap_dio_complete
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iomap_dio_rw_begin")
    @NotUsableInJava
    public static class trace_event_data_offsets_iomap_dio_rw_begin
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iomap_iter")
    @NotUsableInJava
    public static class trace_event_data_offsets_iomap_iter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iomap_writepage_map")
    @NotUsableInJava
    public static class trace_event_data_offsets_iomap_writepage_map
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iomap_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_iomap_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iomap_range_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_iomap_range_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iomap_readpage_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_iomap_readpage_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iomap_dio_complete")
    @NotUsableInJava
    public static class trace_event_raw_iomap_dio_complete
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long isize;
        public @OriginalName(value="loff_t") long pos;
        public int ki_flags;
        public boolean aio;
        public int error;
        public @OriginalName(value="ssize_t") long ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iomap_dio_rw_begin")
    @NotUsableInJava
    public static class trace_event_raw_iomap_dio_rw_begin
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @OriginalName(value="loff_t") long isize;
        public @OriginalName(value="loff_t") long pos;
        public @Unsigned long count;
        public @Unsigned long done_before;
        public int ki_flags;
        public @Unsigned int dio_flags;
        public boolean aio;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iomap_iter")
    @NotUsableInJava
    public static class trace_event_raw_iomap_iter
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ino;
        public @OriginalName(value="loff_t") long pos;
        public @Unsigned long length;
        public long processed;
        public @Unsigned int flags;
        public Ptr<?> ops;
        public @Unsigned long caller;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iomap_writepage_map")
    @NotUsableInJava
    public static class trace_event_raw_iomap_writepage_map
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ino;
        public @Unsigned long pos;
        public @Unsigned long dirty_len;
        public @Unsigned long addr;
        public @OriginalName(value="loff_t") long offset;
        public @Unsigned long length;
        public @Unsigned short type;
        public @Unsigned short flags;
        public @Unsigned @OriginalName(value="dev_t") int bdev;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iomap_class")
    @NotUsableInJava
    public static class trace_event_raw_iomap_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ino;
        public @Unsigned long addr;
        public @OriginalName(value="loff_t") long offset;
        public @Unsigned long length;
        public @Unsigned short type;
        public @Unsigned short flags;
        public @Unsigned @OriginalName(value="dev_t") int bdev;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iomap_range_class")
    @NotUsableInJava
    public static class trace_event_raw_iomap_range_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ino;
        public @OriginalName(value="loff_t") long size;
        public @OriginalName(value="loff_t") long offset;
        public @Unsigned long length;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iomap_readpage_class")
    @NotUsableInJava
    public static class trace_event_raw_iomap_readpage_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ino;
        public int nr_pages;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_inode_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_inode_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_single_inode_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_single_inode_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_sb_inodes_requeue")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_sb_inodes_requeue
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_balance_dirty_pages")
    @NotUsableInJava
    public static class trace_event_data_offsets_balance_dirty_pages
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_bdi_dirty_ratelimit")
    @NotUsableInJava
    public static class trace_event_data_offsets_bdi_dirty_ratelimit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_global_dirty_state")
    @NotUsableInJava
    public static class trace_event_data_offsets_global_dirty_state
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_queue_io")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_queue_io
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_wbc_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_wbc_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_bdi_register")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_bdi_register
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_pages_written")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_pages_written
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_work_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_work_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_write_inode_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_write_inode_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_flush_foreign")
    @NotUsableInJava
    public static class trace_event_data_offsets_flush_foreign
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_track_foreign_dirty")
    @NotUsableInJava
    public static class trace_event_data_offsets_track_foreign_dirty
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_inode_switch_wbs")
    @NotUsableInJava
    public static class trace_event_data_offsets_inode_switch_wbs
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_inode_foreign_history")
    @NotUsableInJava
    public static class trace_event_data_offsets_inode_foreign_history
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_dirty_inode_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_dirty_inode_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_writeback_folio_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_writeback_folio_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_inode_template")
    @NotUsableInJava
    public static class trace_event_raw_writeback_inode_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long state;
        public @Unsigned short mode;
        public @Unsigned long dirtied_when;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_single_inode_template")
    @NotUsableInJava
    public static class trace_event_raw_writeback_single_inode_template
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long state;
        public @Unsigned long dirtied_when;
        public @Unsigned long writeback_index;
        public long nr_to_write;
        public @Unsigned long wrote;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_sb_inodes_requeue")
    @NotUsableInJava
    public static class trace_event_raw_writeback_sb_inodes_requeue
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long state;
        public @Unsigned long dirtied_when;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_balance_dirty_pages")
    @NotUsableInJava
    public static class trace_event_raw_balance_dirty_pages
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] bdi;
        public @Unsigned long limit;
        public @Unsigned long setpoint;
        public @Unsigned long dirty;
        public @Unsigned long bdi_setpoint;
        public @Unsigned long bdi_dirty;
        public @Unsigned long dirty_ratelimit;
        public @Unsigned long task_ratelimit;
        public @Unsigned int dirtied;
        public @Unsigned int dirtied_pause;
        public @Unsigned long paused;
        public long pause;
        public @Unsigned long period;
        public long think;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_bdi_dirty_ratelimit")
    @NotUsableInJava
    public static class trace_event_raw_bdi_dirty_ratelimit
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] bdi;
        public @Unsigned long write_bw;
        public @Unsigned long avg_write_bw;
        public @Unsigned long dirty_rate;
        public @Unsigned long dirty_ratelimit;
        public @Unsigned long task_ratelimit;
        public @Unsigned long balanced_dirty_ratelimit;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_global_dirty_state")
    @NotUsableInJava
    public static class trace_event_raw_global_dirty_state
    extends Struct {
        public trace_entry ent;
        public @Unsigned long nr_dirty;
        public @Unsigned long nr_writeback;
        public @Unsigned long background_thresh;
        public @Unsigned long dirty_thresh;
        public @Unsigned long dirty_limit;
        public @Unsigned long nr_dirtied;
        public @Unsigned long nr_written;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_queue_io")
    @NotUsableInJava
    public static class trace_event_raw_writeback_queue_io
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned long older;
        public long age;
        public int moved;
        public int reason;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_wbc_class")
    @NotUsableInJava
    public static class trace_event_raw_wbc_class
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public long nr_to_write;
        public long pages_skipped;
        public int sync_mode;
        public int for_kupdate;
        public int for_background;
        public int for_reclaim;
        public int range_cyclic;
        public long range_start;
        public long range_end;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_bdi_register")
    @NotUsableInJava
    public static class trace_event_raw_writeback_bdi_register
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_class")
    @NotUsableInJava
    public static class trace_event_raw_writeback_class
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_pages_written")
    @NotUsableInJava
    public static class trace_event_raw_writeback_pages_written
    extends Struct {
        public trace_entry ent;
        public long pages;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_work_class")
    @NotUsableInJava
    public static class trace_event_raw_writeback_work_class
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public long nr_pages;
        public @Unsigned @OriginalName(value="dev_t") int sb_dev;
        public int sync_mode;
        public int for_kupdate;
        public int range_cyclic;
        public int for_background;
        public int reason;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_write_inode_template")
    @NotUsableInJava
    public static class trace_event_raw_writeback_write_inode_template
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public int sync_mode;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_flush_foreign")
    @NotUsableInJava
    public static class trace_event_raw_flush_foreign
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public @Unsigned int frn_bdi_id;
        public @Unsigned int frn_memcg_id;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_track_foreign_dirty")
    @NotUsableInJava
    public static class trace_event_raw_track_foreign_dirty
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned long bdi_id;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned int memcg_id;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public @Unsigned @OriginalName(value="ino_t") long page_cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_inode_switch_wbs")
    @NotUsableInJava
    public static class trace_event_raw_inode_switch_wbs
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ino_t") long old_cgroup_ino;
        public @Unsigned @OriginalName(value="ino_t") long new_cgroup_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_inode_foreign_history")
    @NotUsableInJava
    public static class trace_event_raw_inode_foreign_history
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned @OriginalName(value="ino_t") long cgroup_ino;
        public @Unsigned int history;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_dirty_inode_template")
    @NotUsableInJava
    public static class trace_event_raw_writeback_dirty_inode_template
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long state;
        public @Unsigned long flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_writeback_folio_template")
    @NotUsableInJava
    public static class trace_event_raw_writeback_folio_template
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="ino_t") long ino;
        public @Unsigned long index;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_khugepaged_collapse_file")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_khugepaged_collapse_file
    extends Struct {
        public @Unsigned int filename;
        public Ptr<?> filename_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_khugepaged_scan_file")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_khugepaged_scan_file
    extends Struct {
        public @Unsigned int filename;
        public Ptr<?> filename_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_collapse_huge_page_swapin")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_collapse_huge_page_swapin
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_collapse_huge_page_isolate")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_collapse_huge_page_isolate
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_collapse_huge_page")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_collapse_huge_page
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_khugepaged_scan_pmd")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_khugepaged_scan_pmd
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_khugepaged_collapse_file")
    @NotUsableInJava
    public static class trace_event_raw_mm_khugepaged_collapse_file
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long hpfn;
        public @Unsigned long index;
        public @Unsigned long addr;
        public boolean is_shmem;
        public @Unsigned int __data_loc_filename;
        public int nr;
        public int result;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_khugepaged_scan_file")
    @NotUsableInJava
    public static class trace_event_raw_mm_khugepaged_scan_file
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long pfn;
        public @Unsigned int __data_loc_filename;
        public int present;
        public int swap;
        public int result;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_collapse_huge_page_swapin")
    @NotUsableInJava
    public static class trace_event_raw_mm_collapse_huge_page_swapin
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public int swapped_in;
        public int referenced;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_collapse_huge_page_isolate")
    @NotUsableInJava
    public static class trace_event_raw_mm_collapse_huge_page_isolate
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public int none_or_zero;
        public int referenced;
        public boolean writable;
        public int status;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_collapse_huge_page")
    @NotUsableInJava
    public static class trace_event_raw_mm_collapse_huge_page
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public int isolated;
        public int status;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_khugepaged_scan_pmd")
    @NotUsableInJava
    public static class trace_event_raw_mm_khugepaged_scan_pmd
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long pfn;
        public boolean writable;
        public int referenced;
        public int none_or_zero;
        public int status;
        public int unmapped;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_migration_pte")
    @NotUsableInJava
    public static class trace_event_data_offsets_migration_pte
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_migrate_pages_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_migrate_pages_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_migrate_pages")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_migrate_pages
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_migration_pte")
    @NotUsableInJava
    public static class trace_event_raw_migration_pte
    extends Struct {
        public trace_entry ent;
        public @Unsigned long addr;
        public @Unsigned long pte;
        public int order;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_migrate_pages_start")
    @NotUsableInJava
    public static class trace_event_raw_mm_migrate_pages_start
    extends Struct {
        public trace_entry ent;
        public MigrateDefinitions.migrate_mode mode;
        public int reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_migrate_pages")
    @NotUsableInJava
    public static class trace_event_raw_mm_migrate_pages
    extends Struct {
        public trace_entry ent;
        public @Unsigned long succeeded;
        public @Unsigned long failed;
        public @Unsigned long thp_succeeded;
        public @Unsigned long thp_failed;
        public @Unsigned long thp_split;
        public @Unsigned long large_folio_split;
        public MigrateDefinitions.migrate_mode mode;
        public int reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tlb_flush")
    @NotUsableInJava
    public static class trace_event_data_offsets_tlb_flush
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tlb_flush")
    @NotUsableInJava
    public static class trace_event_raw_tlb_flush
    extends Struct {
        public trace_entry ent;
        public int reason;
        public @Unsigned long pages;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_exit_mmap")
    @NotUsableInJava
    public static class trace_event_data_offsets_exit_mmap
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vma_store")
    @NotUsableInJava
    public static class trace_event_data_offsets_vma_store
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vma_mas_szero")
    @NotUsableInJava
    public static class trace_event_data_offsets_vma_mas_szero
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vm_unmapped_area")
    @NotUsableInJava
    public static class trace_event_data_offsets_vm_unmapped_area
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_exit_mmap")
    @NotUsableInJava
    public static class trace_event_raw_exit_mmap
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<MapleDefinitions.maple_tree> mt;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vma_store")
    @NotUsableInJava
    public static class trace_event_raw_vma_store
    extends Struct {
        public trace_entry ent;
        public Ptr<MapleDefinitions.maple_tree> mt;
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public @Unsigned long vm_start;
        public @Unsigned long vm_end;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vma_mas_szero")
    @NotUsableInJava
    public static class trace_event_raw_vma_mas_szero
    extends Struct {
        public trace_entry ent;
        public Ptr<MapleDefinitions.maple_tree> mt;
        public @Unsigned long start;
        public @Unsigned long end;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vm_unmapped_area")
    @NotUsableInJava
    public static class trace_event_raw_vm_unmapped_area
    extends Struct {
        public trace_entry ent;
        public @Unsigned long addr;
        public @Unsigned long total_vm;
        public @Unsigned long flags;
        public @Unsigned long length;
        public @Unsigned long low_limit;
        public @Unsigned long high_limit;
        public @Unsigned long align_mask;
        public @Unsigned long align_offset;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_percpu_destroy_chunk")
    @NotUsableInJava
    public static class trace_event_data_offsets_percpu_destroy_chunk
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_percpu_create_chunk")
    @NotUsableInJava
    public static class trace_event_data_offsets_percpu_create_chunk
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_percpu_alloc_percpu_fail")
    @NotUsableInJava
    public static class trace_event_data_offsets_percpu_alloc_percpu_fail
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_percpu_free_percpu")
    @NotUsableInJava
    public static class trace_event_data_offsets_percpu_free_percpu
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_percpu_alloc_percpu")
    @NotUsableInJava
    public static class trace_event_data_offsets_percpu_alloc_percpu
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_percpu_destroy_chunk")
    @NotUsableInJava
    public static class trace_event_raw_percpu_destroy_chunk
    extends Struct {
        public trace_entry ent;
        public Ptr<?> base_addr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_percpu_create_chunk")
    @NotUsableInJava
    public static class trace_event_raw_percpu_create_chunk
    extends Struct {
        public trace_entry ent;
        public Ptr<?> base_addr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_percpu_alloc_percpu_fail")
    @NotUsableInJava
    public static class trace_event_raw_percpu_alloc_percpu_fail
    extends Struct {
        public trace_entry ent;
        public boolean reserved;
        public boolean is_atomic;
        public @Unsigned long size;
        public @Unsigned long align;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_percpu_free_percpu")
    @NotUsableInJava
    public static class trace_event_raw_percpu_free_percpu
    extends Struct {
        public trace_entry ent;
        public Ptr<?> base_addr;
        public int off;
        public Ptr<?> ptr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_percpu_alloc_percpu")
    @NotUsableInJava
    public static class trace_event_raw_percpu_alloc_percpu
    extends Struct {
        public trace_entry ent;
        public @Unsigned long call_site;
        public boolean reserved;
        public boolean is_atomic;
        public @Unsigned long size;
        public @Unsigned long align;
        public Ptr<?> base_addr;
        public int off;
        public Ptr<?> ptr;
        public @Unsigned long bytes_alloc;
        public @Unsigned long gfp_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_bpf_trace_printk")
    @NotUsableInJava
    public static class trace_event_data_offsets_bpf_trace_printk
    extends Struct {
        public @Unsigned int bpf_string;
        public Ptr<?> bpf_string_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_bpf_trace_printk")
    @NotUsableInJava
    public static class trace_event_raw_bpf_trace_printk
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_bpf_string;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_mark")
    @NotUsableInJava
    public static class trace_mark
    extends Struct {
        public @Unsigned long val;
        public char sym;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_csd_function")
    @NotUsableInJava
    public static class trace_event_data_offsets_csd_function
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_csd_queue_cpu")
    @NotUsableInJava
    public static class trace_event_data_offsets_csd_queue_cpu
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_csd_function")
    @NotUsableInJava
    public static class trace_event_raw_csd_function
    extends Struct {
        public trace_entry ent;
        public Ptr<?> func;
        public Ptr<?> csd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_csd_queue_cpu")
    @NotUsableInJava
    public static class trace_event_raw_csd_queue_cpu
    extends Struct {
        public trace_entry ent;
        public @Unsigned int cpu;
        public Ptr<?> callsite;
        public Ptr<?> func;
        public Ptr<?> csd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tmigr_handle_remote")
    @NotUsableInJava
    public static class trace_event_data_offsets_tmigr_handle_remote
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tmigr_update_events")
    @NotUsableInJava
    public static class trace_event_data_offsets_tmigr_update_events
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tmigr_idle")
    @NotUsableInJava
    public static class trace_event_data_offsets_tmigr_idle
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tmigr_cpugroup")
    @NotUsableInJava
    public static class trace_event_data_offsets_tmigr_cpugroup
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tmigr_group_and_cpu")
    @NotUsableInJava
    public static class trace_event_data_offsets_tmigr_group_and_cpu
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tmigr_connect_cpu_parent")
    @NotUsableInJava
    public static class trace_event_data_offsets_tmigr_connect_cpu_parent
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tmigr_connect_child_parent")
    @NotUsableInJava
    public static class trace_event_data_offsets_tmigr_connect_child_parent
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tmigr_group_set")
    @NotUsableInJava
    public static class trace_event_data_offsets_tmigr_group_set
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tmigr_handle_remote")
    @NotUsableInJava
    public static class trace_event_raw_tmigr_handle_remote
    extends Struct {
        public trace_entry ent;
        public Ptr<?> group;
        public @Unsigned int lvl;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tmigr_update_events")
    @NotUsableInJava
    public static class trace_event_raw_tmigr_update_events
    extends Struct {
        public trace_entry ent;
        public Ptr<?> child;
        public Ptr<?> group;
        public @Unsigned long nextevt;
        public @Unsigned long group_next_expiry;
        public @Unsigned long child_evt_expiry;
        public @Unsigned int group_lvl;
        public @Unsigned int child_evtcpu;
        public char child_active;
        public char group_active;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tmigr_idle")
    @NotUsableInJava
    public static class trace_event_raw_tmigr_idle
    extends Struct {
        public trace_entry ent;
        public @Unsigned long nextevt;
        public @Unsigned long wakeup;
        public Ptr<?> parent;
        public @Unsigned int cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tmigr_cpugroup")
    @NotUsableInJava
    public static class trace_event_raw_tmigr_cpugroup
    extends Struct {
        public trace_entry ent;
        public @Unsigned long wakeup;
        public Ptr<?> parent;
        public @Unsigned int cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tmigr_group_and_cpu")
    @NotUsableInJava
    public static class trace_event_raw_tmigr_group_and_cpu
    extends Struct {
        public trace_entry ent;
        public Ptr<?> group;
        public Ptr<?> parent;
        public @Unsigned int lvl;
        public @Unsigned int numa_node;
        public @Unsigned int childmask;
        public char active;
        public char migrator;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tmigr_connect_cpu_parent")
    @NotUsableInJava
    public static class trace_event_raw_tmigr_connect_cpu_parent
    extends Struct {
        public trace_entry ent;
        public Ptr<?> parent;
        public @Unsigned int cpu;
        public @Unsigned int lvl;
        public @Unsigned int numa_node;
        public @Unsigned int num_children;
        public @Unsigned int groupmask;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tmigr_connect_child_parent")
    @NotUsableInJava
    public static class trace_event_raw_tmigr_connect_child_parent
    extends Struct {
        public trace_entry ent;
        public Ptr<?> child;
        public Ptr<?> parent;
        public @Unsigned int lvl;
        public @Unsigned int numa_node;
        public @Unsigned int num_children;
        public @Unsigned int groupmask;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tmigr_group_set")
    @NotUsableInJava
    public static class trace_event_raw_tmigr_group_set
    extends Struct {
        public trace_entry ent;
        public Ptr<?> group;
        public @Unsigned int lvl;
        public @Unsigned int numa_node;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_alarm_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_alarm_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_alarmtimer_suspend")
    @NotUsableInJava
    public static class trace_event_data_offsets_alarmtimer_suspend
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_alarm_class")
    @NotUsableInJava
    public static class trace_event_raw_alarm_class
    extends Struct {
        public trace_entry ent;
        public Ptr<?> alarm;
        public char alarm_type;
        public long expires;
        public long now;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_alarmtimer_suspend")
    @NotUsableInJava
    public static class trace_event_raw_alarmtimer_suspend
    extends Struct {
        public trace_entry ent;
        public long expires;
        public char alarm_type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ipi_handler")
    @NotUsableInJava
    public static class trace_event_data_offsets_ipi_handler
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ipi_send_cpumask")
    @NotUsableInJava
    public static class trace_event_data_offsets_ipi_send_cpumask
    extends Struct {
        public @Unsigned int cpumask;
        public Ptr<?> cpumask_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ipi_send_cpu")
    @NotUsableInJava
    public static class trace_event_data_offsets_ipi_send_cpu
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ipi_raise")
    @NotUsableInJava
    public static class trace_event_data_offsets_ipi_raise
    extends Struct {
        public @Unsigned int target_cpus;
        public Ptr<?> target_cpus_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ipi_handler")
    @NotUsableInJava
    public static class trace_event_raw_ipi_handler
    extends Struct {
        public trace_entry ent;
        public String reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ipi_send_cpumask")
    @NotUsableInJava
    public static class trace_event_raw_ipi_send_cpumask
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_cpumask;
        public Ptr<?> callsite;
        public Ptr<?> callback;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ipi_send_cpu")
    @NotUsableInJava
    public static class trace_event_raw_ipi_send_cpu
    extends Struct {
        public trace_entry ent;
        public @Unsigned int cpu;
        public Ptr<?> callsite;
        public Ptr<?> callback;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ipi_raise")
    @NotUsableInJava
    public static class trace_event_raw_ipi_raise
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_target_cpus;
        public String reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_wake_idle_without_ipi")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_wake_idle_without_ipi
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_skip_vma_numa")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_skip_vma_numa
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_numa_pair_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_numa_pair_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_move_numa")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_move_numa
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_process_hang")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_process_hang
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_pi_setprio")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_pi_setprio
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_stat_runtime")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_stat_runtime
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_stat_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_stat_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_prepare_exec")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_prepare_exec
    extends Struct {
        public @Unsigned int interp;
        public Ptr<?> interp_ptr_;
        public @Unsigned int filename;
        public Ptr<?> filename_ptr_;
        public @Unsigned int comm;
        public Ptr<?> comm_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_process_exec")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_process_exec
    extends Struct {
        public @Unsigned int filename;
        public Ptr<?> filename_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_process_fork")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_process_fork
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_process_wait")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_process_wait
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_process_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_process_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_migrate_task")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_migrate_task
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_switch")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_switch
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_wakeup_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_wakeup_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_kthread_work_execute_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_kthread_work_execute_end
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_kthread_work_execute_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_kthread_work_execute_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_kthread_work_queue_work")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_kthread_work_queue_work
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_kthread_stop_ret")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_kthread_stop_ret
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_kthread_stop")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_kthread_stop
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_wake_idle_without_ipi")
    @NotUsableInJava
    public static class trace_event_raw_sched_wake_idle_without_ipi
    extends Struct {
        public trace_entry ent;
        public int cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_skip_vma_numa")
    @NotUsableInJava
    public static class trace_event_raw_sched_skip_vma_numa
    extends Struct {
        public trace_entry ent;
        public @Unsigned long numa_scan_offset;
        public @Unsigned long vm_start;
        public @Unsigned long vm_end;
        public NumaDefinitions.numa_vmaskip_reason reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_numa_pair_template")
    @NotUsableInJava
    public static class trace_event_raw_sched_numa_pair_template
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="pid_t") int src_pid;
        public @OriginalName(value="pid_t") int src_tgid;
        public @OriginalName(value="pid_t") int src_ngid;
        public int src_cpu;
        public int src_nid;
        public @OriginalName(value="pid_t") int dst_pid;
        public @OriginalName(value="pid_t") int dst_tgid;
        public @OriginalName(value="pid_t") int dst_ngid;
        public int dst_cpu;
        public int dst_nid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_move_numa")
    @NotUsableInJava
    public static class trace_event_raw_sched_move_numa
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="pid_t") int pid;
        public @OriginalName(value="pid_t") int tgid;
        public @OriginalName(value="pid_t") int ngid;
        public int src_cpu;
        public int src_nid;
        public int dst_cpu;
        public int dst_nid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_process_hang")
    @NotUsableInJava
    public static class trace_event_raw_sched_process_hang
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_pi_setprio")
    @NotUsableInJava
    public static class trace_event_raw_sched_pi_setprio
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public int oldprio;
        public int newprio;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_stat_runtime")
    @NotUsableInJava
    public static class trace_event_raw_sched_stat_runtime
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public @Unsigned long runtime;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_stat_template")
    @NotUsableInJava
    public static class trace_event_raw_sched_stat_template
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public @Unsigned long delay;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_prepare_exec")
    @NotUsableInJava
    public static class trace_event_raw_sched_prepare_exec
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_interp;
        public @Unsigned int __data_loc_filename;
        public @OriginalName(value="pid_t") int pid;
        public @Unsigned int __data_loc_comm;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_process_exec")
    @NotUsableInJava
    public static class trace_event_raw_sched_process_exec
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_filename;
        public @OriginalName(value="pid_t") int pid;
        public @OriginalName(value="pid_t") int old_pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_process_fork")
    @NotUsableInJava
    public static class trace_event_raw_sched_process_fork
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] parent_comm;
        public @OriginalName(value="pid_t") int parent_pid;
        public char @Size(value=16) [] child_comm;
        public @OriginalName(value="pid_t") int child_pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_process_wait")
    @NotUsableInJava
    public static class trace_event_raw_sched_process_wait
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public int prio;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_process_template")
    @NotUsableInJava
    public static class trace_event_raw_sched_process_template
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public int prio;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_migrate_task")
    @NotUsableInJava
    public static class trace_event_raw_sched_migrate_task
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public int prio;
        public int orig_cpu;
        public int dest_cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_switch")
    @NotUsableInJava
    public static class trace_event_raw_sched_switch
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] prev_comm;
        public @OriginalName(value="pid_t") int prev_pid;
        public int prev_prio;
        public long prev_state;
        public char @Size(value=16) [] next_comm;
        public @OriginalName(value="pid_t") int next_pid;
        public int next_prio;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_wakeup_template")
    @NotUsableInJava
    public static class trace_event_raw_sched_wakeup_template
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public int prio;
        public int target_cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_kthread_work_execute_end")
    @NotUsableInJava
    public static class trace_event_raw_sched_kthread_work_execute_end
    extends Struct {
        public trace_entry ent;
        public Ptr<?> work;
        public Ptr<?> function;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_kthread_work_execute_start")
    @NotUsableInJava
    public static class trace_event_raw_sched_kthread_work_execute_start
    extends Struct {
        public trace_entry ent;
        public Ptr<?> work;
        public Ptr<?> function;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_kthread_work_queue_work")
    @NotUsableInJava
    public static class trace_event_raw_sched_kthread_work_queue_work
    extends Struct {
        public trace_entry ent;
        public Ptr<?> work;
        public Ptr<?> function;
        public Ptr<?> worker;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_kthread_stop_ret")
    @NotUsableInJava
    public static class trace_event_raw_sched_kthread_stop_ret
    extends Struct {
        public trace_entry ent;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_kthread_stop")
    @NotUsableInJava
    public static class trace_event_raw_sched_kthread_stop
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_memory_failure_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_memory_failure_event
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_aer_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_aer_event
    extends Struct {
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_non_standard_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_non_standard_event
    extends Struct {
        public @Unsigned int fru_text;
        public Ptr<?> fru_text_ptr_;
        public @Unsigned int buf;
        public Ptr<?> buf_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_arm_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_arm_event
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mc_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_mc_event
    extends Struct {
        public @Unsigned int msg;
        public Ptr<?> msg_ptr_;
        public @Unsigned int label;
        public Ptr<?> label_ptr_;
        public @Unsigned int driver_detail;
        public Ptr<?> driver_detail_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_extlog_mem_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_extlog_mem_event
    extends Struct {
        public @Unsigned int fru_text;
        public Ptr<?> fru_text_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_memory_failure_event")
    @NotUsableInJava
    public static class trace_event_raw_memory_failure_event
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public int type;
        public int result;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_aer_event")
    @NotUsableInJava
    public static class trace_event_raw_aer_event
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned int status;
        public char severity;
        public char tlp_header_valid;
        public @Unsigned int @Size(value=4) [] tlp_header;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_non_standard_event")
    @NotUsableInJava
    public static class trace_event_raw_non_standard_event
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] sec_type;
        public char @Size(value=16) [] fru_id;
        public @Unsigned int __data_loc_fru_text;
        public char sev;
        public @Unsigned int len;
        public @Unsigned int __data_loc_buf;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_arm_event")
    @NotUsableInJava
    public static class trace_event_raw_arm_event
    extends Struct {
        public trace_entry ent;
        public @Unsigned long mpidr;
        public @Unsigned long midr;
        public @Unsigned int running_state;
        public @Unsigned int psci_state;
        public char affinity;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mc_event")
    @NotUsableInJava
    public static class trace_event_raw_mc_event
    extends Struct {
        public trace_entry ent;
        public @Unsigned int error_type;
        public @Unsigned int __data_loc_msg;
        public @Unsigned int __data_loc_label;
        public @Unsigned short error_count;
        public char mc_index;
        public @OriginalName(value="s8") byte top_layer;
        public @OriginalName(value="s8") byte middle_layer;
        public @OriginalName(value="s8") byte lower_layer;
        public long address;
        public char grain_bits;
        public long syndrome;
        public @Unsigned int __data_loc_driver_detail;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_extlog_mem_event")
    @NotUsableInJava
    public static class trace_event_raw_extlog_mem_event
    extends Struct {
        public trace_entry ent;
        public @Unsigned int err_seq;
        public char etype;
        public char sev;
        public @Unsigned long pa;
        public char pa_mask_lsb;
        public  @OriginalName(value="guid_t") misc.uuid_t fru_id;
        public @Unsigned int __data_loc_fru_text;
        public CperDefinitions.cper_mem_err_compact data;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mmc_request_done")
    @NotUsableInJava
    public static class trace_event_data_offsets_mmc_request_done
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mmc_request_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_mmc_request_start
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mmc_request_done")
    @NotUsableInJava
    public static class trace_event_raw_mmc_request_done
    extends Struct {
        public trace_entry ent;
        public @Unsigned int cmd_opcode;
        public int cmd_err;
        public @Unsigned int @Size(value=4) [] cmd_resp;
        public @Unsigned int cmd_retries;
        public @Unsigned int stop_opcode;
        public int stop_err;
        public @Unsigned int @Size(value=4) [] stop_resp;
        public @Unsigned int stop_retries;
        public @Unsigned int sbc_opcode;
        public int sbc_err;
        public @Unsigned int @Size(value=4) [] sbc_resp;
        public @Unsigned int sbc_retries;
        public @Unsigned int bytes_xfered;
        public int data_err;
        public int tag;
        public @Unsigned int can_retune;
        public @Unsigned int doing_retune;
        public @Unsigned int retune_now;
        public int need_retune;
        public int hold_retune;
        public @Unsigned int retune_period;
        public Ptr<MmcDefinitions.mmc_request> mrq;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mmc_request_start")
    @NotUsableInJava
    public static class trace_event_raw_mmc_request_start
    extends Struct {
        public trace_entry ent;
        public @Unsigned int cmd_opcode;
        public @Unsigned int cmd_arg;
        public @Unsigned int cmd_flags;
        public @Unsigned int cmd_retries;
        public @Unsigned int stop_opcode;
        public @Unsigned int stop_arg;
        public @Unsigned int stop_flags;
        public @Unsigned int stop_retries;
        public @Unsigned int sbc_opcode;
        public @Unsigned int sbc_arg;
        public @Unsigned int sbc_flags;
        public @Unsigned int sbc_retries;
        public @Unsigned int blocks;
        public @Unsigned int blk_addr;
        public @Unsigned int blksz;
        public @Unsigned int data_flags;
        public int tag;
        public @Unsigned int can_retune;
        public @Unsigned int doing_retune;
        public @Unsigned int retune_now;
        public int need_retune;
        public int hold_retune;
        public @Unsigned int retune_period;
        public Ptr<MmcDefinitions.mmc_request> mrq;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_watchdog_set_timeout")
    @NotUsableInJava
    public static class trace_event_data_offsets_watchdog_set_timeout
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_watchdog_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_watchdog_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_watchdog_set_timeout")
    @NotUsableInJava
    public static class trace_event_raw_watchdog_set_timeout
    extends Struct {
        public trace_entry ent;
        public int id;
        public @Unsigned int timeout;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_watchdog_template")
    @NotUsableInJava
    public static class trace_event_raw_watchdog_template
    extends Struct {
        public trace_entry ent;
        public int id;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_thermal_power_devfreq_limit")
    @NotUsableInJava
    public static class trace_event_data_offsets_thermal_power_devfreq_limit
    extends Struct {
        public @Unsigned int type;
        public Ptr<?> type_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_thermal_power_devfreq_get_power")
    @NotUsableInJava
    public static class trace_event_data_offsets_thermal_power_devfreq_get_power
    extends Struct {
        public @Unsigned int type;
        public Ptr<?> type_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_thermal_zone_trip")
    @NotUsableInJava
    public static class trace_event_data_offsets_thermal_zone_trip
    extends Struct {
        public @Unsigned int thermal_zone;
        public Ptr<?> thermal_zone_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cdev_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_cdev_update
    extends Struct {
        public @Unsigned int type;
        public Ptr<?> type_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_thermal_temperature")
    @NotUsableInJava
    public static class trace_event_data_offsets_thermal_temperature
    extends Struct {
        public @Unsigned int thermal_zone;
        public Ptr<?> thermal_zone_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_thermal_power_devfreq_limit")
    @NotUsableInJava
    public static class trace_event_raw_thermal_power_devfreq_limit
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_type;
        public @Unsigned int freq;
        public @Unsigned long cdev_state;
        public @Unsigned int power;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_thermal_power_devfreq_get_power")
    @NotUsableInJava
    public static class trace_event_raw_thermal_power_devfreq_get_power
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_type;
        public @Unsigned long freq;
        public @Unsigned int busy_time;
        public @Unsigned int total_time;
        public @Unsigned int power;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_thermal_zone_trip")
    @NotUsableInJava
    public static class trace_event_raw_thermal_zone_trip
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_thermal_zone;
        public int id;
        public int trip;
        public ThermalDefinitions.thermal_trip_type trip_type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cdev_update")
    @NotUsableInJava
    public static class trace_event_raw_cdev_update
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_type;
        public @Unsigned long target;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_thermal_temperature")
    @NotUsableInJava
    public static class trace_event_raw_thermal_temperature
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_thermal_zone;
        public int id;
        public int temp_prev;
        public int temp;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_dbc_log_request")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_dbc_log_request
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_doorbell")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_doorbell
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_portsc")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_portsc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_ring")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_ring
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_ctrl_ctx")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_ctrl_ctx
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_slot_ctx")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_slot_ctx
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_ep_ctx")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_ep_ctx
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_urb")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_urb
    extends Struct {
        public @Unsigned int devname;
        public Ptr<?> devname_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_virt_dev")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_virt_dev
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_free_virt_dev")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_free_virt_dev
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_trb")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_trb
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_ctx")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_ctx
    extends Struct {
        public @Unsigned int ctx_data;
        public Ptr<?> ctx_data_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xhci_log_msg")
    @NotUsableInJava
    public static class trace_event_data_offsets_xhci_log_msg
    extends Struct {
        public @Unsigned int msg;
        public Ptr<?> msg_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_dbc_log_request")
    @NotUsableInJava
    public static class trace_event_raw_xhci_dbc_log_request
    extends Struct {
        public trace_entry ent;
        public Ptr<DbcDefinitions.dbc_request> req;
        public boolean dir;
        public @Unsigned int actual;
        public @Unsigned int length;
        public int status;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_doorbell")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_doorbell
    extends Struct {
        public trace_entry ent;
        public @Unsigned int slot;
        public @Unsigned int doorbell;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_portsc")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_portsc
    extends Struct {
        public trace_entry ent;
        public @Unsigned int busnum;
        public @Unsigned int portnum;
        public @Unsigned int portsc;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_ring")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_ring
    extends Struct {
        public trace_entry ent;
        public @Unsigned int type;
        public Ptr<?> ring;
        public @Unsigned @OriginalName(value="dma_addr_t") long enq;
        public @Unsigned @OriginalName(value="dma_addr_t") long deq;
        public @Unsigned @OriginalName(value="dma_addr_t") long enq_seg;
        public @Unsigned @OriginalName(value="dma_addr_t") long deq_seg;
        public @Unsigned int num_segs;
        public @Unsigned int stream_id;
        public @Unsigned int cycle_state;
        public @Unsigned int bounce_buf_len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_ctrl_ctx")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_ctrl_ctx
    extends Struct {
        public trace_entry ent;
        public @Unsigned int drop;
        public @Unsigned int add;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_slot_ctx")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_slot_ctx
    extends Struct {
        public trace_entry ent;
        public @Unsigned int info;
        public @Unsigned int info2;
        public @Unsigned int tt_info;
        public @Unsigned int state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_ep_ctx")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_ep_ctx
    extends Struct {
        public trace_entry ent;
        public @Unsigned int info;
        public @Unsigned int info2;
        public @Unsigned long deq;
        public @Unsigned int tx_info;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_urb")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_urb
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_devname;
        public Ptr<?> urb;
        public @Unsigned int pipe;
        public @Unsigned int stream;
        public int status;
        public @Unsigned int flags;
        public int num_mapped_sgs;
        public int num_sgs;
        public int length;
        public int actual;
        public int epnum;
        public int dir_in;
        public int type;
        public int slot_id;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_virt_dev")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_virt_dev
    extends Struct {
        public trace_entry ent;
        public Ptr<?> vdev;
        public @Unsigned long out_ctx;
        public @Unsigned long in_ctx;
        public int devnum;
        public int state;
        public int speed;
        public char portnum;
        public char level;
        public int slot_id;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_free_virt_dev")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_free_virt_dev
    extends Struct {
        public trace_entry ent;
        public Ptr<?> vdev;
        public @Unsigned long out_ctx;
        public @Unsigned long in_ctx;
        public int slot_id;
        public @Unsigned short current_mel;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_trb")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_trb
    extends Struct {
        public trace_entry ent;
        public @Unsigned int type;
        public @Unsigned int field0;
        public @Unsigned int field1;
        public @Unsigned int field2;
        public @Unsigned int field3;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_ctx")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_ctx
    extends Struct {
        public trace_entry ent;
        public int ctx_64;
        public @Unsigned int ctx_type;
        public @Unsigned @OriginalName(value="dma_addr_t") long ctx_dma;
        public Ptr<Character> ctx_va;
        public @Unsigned int ctx_ep_num;
        public @Unsigned int __data_loc_ctx_data;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xhci_log_msg")
    @NotUsableInJava
    public static class trace_event_raw_xhci_log_msg
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_msg;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sync_timeline")
    @NotUsableInJava
    public static class trace_event_data_offsets_sync_timeline
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sync_timeline")
    @NotUsableInJava
    public static class trace_event_raw_sync_timeline
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int value;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regcache_drop_region")
    @NotUsableInJava
    public static class trace_event_data_offsets_regcache_drop_region
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regmap_async")
    @NotUsableInJava
    public static class trace_event_data_offsets_regmap_async
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regmap_bool")
    @NotUsableInJava
    public static class trace_event_data_offsets_regmap_bool
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regcache_sync")
    @NotUsableInJava
    public static class trace_event_data_offsets_regcache_sync
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
        public @Unsigned int status;
        public Ptr<?> status_ptr_;
        public @Unsigned int type;
        public Ptr<?> type_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regmap_block")
    @NotUsableInJava
    public static class trace_event_data_offsets_regmap_block
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regmap_bulk")
    @NotUsableInJava
    public static class trace_event_data_offsets_regmap_bulk
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
        public @Unsigned int buf;
        public Ptr<?> buf_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regmap_reg")
    @NotUsableInJava
    public static class trace_event_data_offsets_regmap_reg
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regcache_drop_region")
    @NotUsableInJava
    public static class trace_event_raw_regcache_drop_region
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int from;
        public @Unsigned int to;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regmap_async")
    @NotUsableInJava
    public static class trace_event_raw_regmap_async
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regmap_bool")
    @NotUsableInJava
    public static class trace_event_raw_regmap_bool
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public int flag;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regcache_sync")
    @NotUsableInJava
    public static class trace_event_raw_regcache_sync
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int __data_loc_status;
        public @Unsigned int __data_loc_type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regmap_block")
    @NotUsableInJava
    public static class trace_event_raw_regmap_block
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int reg;
        public int count;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regmap_bulk")
    @NotUsableInJava
    public static class trace_event_raw_regmap_bulk
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int reg;
        public @Unsigned int __data_loc_buf;
        public int val_len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regmap_reg")
    @NotUsableInJava
    public static class trace_event_raw_regmap_reg
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int reg;
        public @Unsigned int val;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iommu_error")
    @NotUsableInJava
    public static class trace_event_data_offsets_iommu_error
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
        public @Unsigned int driver;
        public Ptr<?> driver_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_unmap")
    @NotUsableInJava
    public static class trace_event_data_offsets_unmap
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_map")
    @NotUsableInJava
    public static class trace_event_data_offsets_map
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iommu_device_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_iommu_device_event
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_iommu_group_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_iommu_group_event
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iommu_error")
    @NotUsableInJava
    public static class trace_event_raw_iommu_error
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned int __data_loc_driver;
        public @Unsigned long iova;
        public int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_unmap")
    @NotUsableInJava
    public static class trace_event_raw_unmap
    extends Struct {
        public trace_entry ent;
        public @Unsigned long iova;
        public @Unsigned long size;
        public @Unsigned long unmapped_size;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_map")
    @NotUsableInJava
    public static class trace_event_raw_map
    extends Struct {
        public trace_entry ent;
        public @Unsigned long iova;
        public @Unsigned long paddr;
        public @Unsigned long size;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iommu_device_event")
    @NotUsableInJava
    public static class trace_event_raw_iommu_device_event
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_iommu_group_event")
    @NotUsableInJava
    public static class trace_event_raw_iommu_group_event
    extends Struct {
        public trace_entry ent;
        public int gid;
        public @Unsigned int __data_loc_device;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cache_tag_flush")
    @NotUsableInJava
    public static class trace_event_data_offsets_cache_tag_flush
    extends Struct {
        public @Unsigned int iommu;
        public Ptr<?> iommu_ptr_;
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cache_tag_log")
    @NotUsableInJava
    public static class trace_event_data_offsets_cache_tag_log
    extends Struct {
        public @Unsigned int iommu;
        public Ptr<?> iommu_ptr_;
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_prq_report")
    @NotUsableInJava
    public static class trace_event_data_offsets_prq_report
    extends Struct {
        public @Unsigned int iommu;
        public Ptr<?> iommu_ptr_;
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
        public @Unsigned int buff;
        public Ptr<?> buff_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_qi_submit")
    @NotUsableInJava
    public static class trace_event_data_offsets_qi_submit
    extends Struct {
        public @Unsigned int iommu;
        public Ptr<?> iommu_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cache_tag_flush")
    @NotUsableInJava
    public static class trace_event_raw_cache_tag_flush
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_iommu;
        public @Unsigned int __data_loc_dev;
        public @Unsigned short type;
        public @Unsigned short domain_id;
        public @Unsigned int pasid;
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long addr;
        public @Unsigned long pages;
        public @Unsigned long mask;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cache_tag_log")
    @NotUsableInJava
    public static class trace_event_raw_cache_tag_log
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_iommu;
        public @Unsigned int __data_loc_dev;
        public @Unsigned short type;
        public @Unsigned short domain_id;
        public @Unsigned int pasid;
        public @Unsigned int users;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_prq_report")
    @NotUsableInJava
    public static class trace_event_raw_prq_report
    extends Struct {
        public trace_entry ent;
        public @Unsigned long dw0;
        public @Unsigned long dw1;
        public @Unsigned long dw2;
        public @Unsigned long dw3;
        public @Unsigned long seq;
        public @Unsigned int __data_loc_iommu;
        public @Unsigned int __data_loc_dev;
        public @Unsigned int __data_loc_buff;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_qi_submit")
    @NotUsableInJava
    public static class trace_event_raw_qi_submit
    extends Struct {
        public trace_entry ent;
        public @Unsigned long qw0;
        public @Unsigned long qw1;
        public @Unsigned long qw2;
        public @Unsigned long qw3;
        public @Unsigned int __data_loc_iommu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_clk_rate_request")
    @NotUsableInJava
    public static class trace_event_data_offsets_clk_rate_request
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
        public @Unsigned int pname;
        public Ptr<?> pname_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_clk_duty_cycle")
    @NotUsableInJava
    public static class trace_event_data_offsets_clk_duty_cycle
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_clk_phase")
    @NotUsableInJava
    public static class trace_event_data_offsets_clk_phase
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_clk_parent")
    @NotUsableInJava
    public static class trace_event_data_offsets_clk_parent
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
        public @Unsigned int pname;
        public Ptr<?> pname_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_clk_rate_range")
    @NotUsableInJava
    public static class trace_event_data_offsets_clk_rate_range
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_clk_rate")
    @NotUsableInJava
    public static class trace_event_data_offsets_clk_rate
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_clk")
    @NotUsableInJava
    public static class trace_event_data_offsets_clk
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_clk_rate_request")
    @NotUsableInJava
    public static class trace_event_raw_clk_rate_request
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int __data_loc_pname;
        public @Unsigned long min;
        public @Unsigned long max;
        public @Unsigned long prate;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_clk_duty_cycle")
    @NotUsableInJava
    public static class trace_event_raw_clk_duty_cycle
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int num;
        public @Unsigned int den;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_clk_phase")
    @NotUsableInJava
    public static class trace_event_raw_clk_phase
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public int phase;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_clk_parent")
    @NotUsableInJava
    public static class trace_event_raw_clk_parent
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int __data_loc_pname;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_clk_rate_range")
    @NotUsableInJava
    public static class trace_event_raw_clk_rate_range
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned long min;
        public @Unsigned long max;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_clk_rate")
    @NotUsableInJava
    public static class trace_event_raw_clk_rate
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned long rate;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_clk")
    @NotUsableInJava
    public static class trace_event_raw_clk
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mmap_lock_acquire_returned")
    @NotUsableInJava
    public static class trace_event_data_offsets_mmap_lock_acquire_returned
    extends Struct {
        public @Unsigned int memcg_path;
        public Ptr<?> memcg_path_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mmap_lock")
    @NotUsableInJava
    public static class trace_event_data_offsets_mmap_lock
    extends Struct {
        public @Unsigned int memcg_path;
        public Ptr<?> memcg_path_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mmap_lock_acquire_returned")
    @NotUsableInJava
    public static class trace_event_raw_mmap_lock_acquire_returned
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned int __data_loc_memcg_path;
        public boolean write;
        public boolean success;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mmap_lock")
    @NotUsableInJava
    public static class trace_event_raw_mmap_lock
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned int __data_loc_memcg_path;
        public boolean write;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_kcompactd_wake_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_kcompactd_wake_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_compaction_kcompactd_sleep")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_compaction_kcompactd_sleep
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_compaction_defer_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_compaction_defer_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_compaction_suitable_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_compaction_suitable_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_compaction_try_to_compact_pages")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_compaction_try_to_compact_pages
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_compaction_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_compaction_end
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_compaction_begin")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_compaction_begin
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_compaction_migratepages")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_compaction_migratepages
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_compaction_isolate_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_compaction_isolate_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_kcompactd_wake_template")
    @NotUsableInJava
    public static class trace_event_raw_kcompactd_wake_template
    extends Struct {
        public trace_entry ent;
        public int nid;
        public int order;
        public ZoneDefinitions.zone_type highest_zoneidx;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_compaction_kcompactd_sleep")
    @NotUsableInJava
    public static class trace_event_raw_mm_compaction_kcompactd_sleep
    extends Struct {
        public trace_entry ent;
        public int nid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_compaction_defer_template")
    @NotUsableInJava
    public static class trace_event_raw_mm_compaction_defer_template
    extends Struct {
        public trace_entry ent;
        public int nid;
        public ZoneDefinitions.zone_type idx;
        public int order;
        public @Unsigned int considered;
        public @Unsigned int defer_shift;
        public int order_failed;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_compaction_suitable_template")
    @NotUsableInJava
    public static class trace_event_raw_mm_compaction_suitable_template
    extends Struct {
        public trace_entry ent;
        public int nid;
        public ZoneDefinitions.zone_type idx;
        public int order;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_compaction_try_to_compact_pages")
    @NotUsableInJava
    public static class trace_event_raw_mm_compaction_try_to_compact_pages
    extends Struct {
        public trace_entry ent;
        public int order;
        public @Unsigned long gfp_mask;
        public int prio;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_compaction_end")
    @NotUsableInJava
    public static class trace_event_raw_mm_compaction_end
    extends Struct {
        public trace_entry ent;
        public @Unsigned long zone_start;
        public @Unsigned long migrate_pfn;
        public @Unsigned long free_pfn;
        public @Unsigned long zone_end;
        public boolean sync;
        public int status;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_compaction_begin")
    @NotUsableInJava
    public static class trace_event_raw_mm_compaction_begin
    extends Struct {
        public trace_entry ent;
        public @Unsigned long zone_start;
        public @Unsigned long migrate_pfn;
        public @Unsigned long free_pfn;
        public @Unsigned long zone_end;
        public boolean sync;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_compaction_migratepages")
    @NotUsableInJava
    public static class trace_event_raw_mm_compaction_migratepages
    extends Struct {
        public trace_entry ent;
        public @Unsigned long nr_migrated;
        public @Unsigned long nr_failed;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_compaction_isolate_template")
    @NotUsableInJava
    public static class trace_event_raw_mm_compaction_isolate_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned long start_pfn;
        public @Unsigned long end_pfn;
        public @Unsigned long nr_scanned;
        public @Unsigned long nr_taken;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_throttled")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_throttled
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_node_reclaim_begin")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_node_reclaim_begin
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_lru_shrink_active")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_lru_shrink_active
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_lru_shrink_inactive")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_lru_shrink_inactive
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_write_folio")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_write_folio
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_lru_isolate")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_lru_isolate
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_shrink_slab_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_shrink_slab_end
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_shrink_slab_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_shrink_slab_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_direct_reclaim_end_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_direct_reclaim_end_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_direct_reclaim_begin_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_direct_reclaim_begin_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_wakeup_kswapd")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_wakeup_kswapd
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_kswapd_wake")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_kswapd_wake
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_vmscan_kswapd_sleep")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_vmscan_kswapd_sleep
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_throttled")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_throttled
    extends Struct {
        public trace_entry ent;
        public int nid;
        public int usec_timeout;
        public int usec_delayed;
        public int reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_node_reclaim_begin")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_node_reclaim_begin
    extends Struct {
        public trace_entry ent;
        public int nid;
        public int order;
        public @Unsigned long gfp_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_lru_shrink_active")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_lru_shrink_active
    extends Struct {
        public trace_entry ent;
        public int nid;
        public @Unsigned long nr_taken;
        public @Unsigned long nr_active;
        public @Unsigned long nr_deactivated;
        public @Unsigned long nr_referenced;
        public int priority;
        public int reclaim_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_lru_shrink_inactive")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_lru_shrink_inactive
    extends Struct {
        public trace_entry ent;
        public int nid;
        public @Unsigned long nr_scanned;
        public @Unsigned long nr_reclaimed;
        public @Unsigned long nr_dirty;
        public @Unsigned long nr_writeback;
        public @Unsigned long nr_congested;
        public @Unsigned long nr_immediate;
        public @Unsigned int nr_activate0;
        public @Unsigned int nr_activate1;
        public @Unsigned long nr_ref_keep;
        public @Unsigned long nr_unmap_fail;
        public int priority;
        public int reclaim_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_write_folio")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_write_folio
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public int reclaim_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_lru_isolate")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_lru_isolate
    extends Struct {
        public trace_entry ent;
        public int highest_zoneidx;
        public int order;
        public @Unsigned long nr_requested;
        public @Unsigned long nr_scanned;
        public @Unsigned long nr_skipped;
        public @Unsigned long nr_taken;
        public int lru;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_shrink_slab_end")
    @NotUsableInJava
    public static class trace_event_raw_mm_shrink_slab_end
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.shrinker> shr;
        public int nid;
        public Ptr<?> shrink;
        public long unused_scan;
        public long new_scan;
        public int retval;
        public long total_scan;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_shrink_slab_start")
    @NotUsableInJava
    public static class trace_event_raw_mm_shrink_slab_start
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.shrinker> shr;
        public Ptr<?> shrink;
        public int nid;
        public long nr_objects_to_shrink;
        public @Unsigned long gfp_flags;
        public @Unsigned long cache_items;
        public @Unsigned long delta;
        public @Unsigned long total_scan;
        public int priority;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_direct_reclaim_end_template")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_direct_reclaim_end_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned long nr_reclaimed;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_direct_reclaim_begin_template")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_direct_reclaim_begin_template
    extends Struct {
        public trace_entry ent;
        public int order;
        public @Unsigned long gfp_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_wakeup_kswapd")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_wakeup_kswapd
    extends Struct {
        public trace_entry ent;
        public int nid;
        public int zid;
        public int order;
        public @Unsigned long gfp_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_kswapd_wake")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_kswapd_wake
    extends Struct {
        public trace_entry ent;
        public int nid;
        public int zid;
        public int order;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_vmscan_kswapd_sleep")
    @NotUsableInJava
    public static class trace_event_raw_mm_vmscan_kswapd_sleep
    extends Struct {
        public trace_entry ent;
        public int nid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_compact_retry")
    @NotUsableInJava
    public static class trace_event_data_offsets_compact_retry
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_skip_task_reaping")
    @NotUsableInJava
    public static class trace_event_data_offsets_skip_task_reaping
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_finish_task_reaping")
    @NotUsableInJava
    public static class trace_event_data_offsets_finish_task_reaping
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_start_task_reaping")
    @NotUsableInJava
    public static class trace_event_data_offsets_start_task_reaping
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_wake_reaper")
    @NotUsableInJava
    public static class trace_event_data_offsets_wake_reaper
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mark_victim")
    @NotUsableInJava
    public static class trace_event_data_offsets_mark_victim
    extends Struct {
        public @Unsigned int comm;
        public Ptr<?> comm_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_reclaim_retry_zone")
    @NotUsableInJava
    public static class trace_event_data_offsets_reclaim_retry_zone
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_oom_score_adj_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_oom_score_adj_update
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_compact_retry")
    @NotUsableInJava
    public static class trace_event_raw_compact_retry
    extends Struct {
        public trace_entry ent;
        public int order;
        public int priority;
        public int result;
        public int retries;
        public int max_retries;
        public boolean ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_skip_task_reaping")
    @NotUsableInJava
    public static class trace_event_raw_skip_task_reaping
    extends Struct {
        public trace_entry ent;
        public int pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_finish_task_reaping")
    @NotUsableInJava
    public static class trace_event_raw_finish_task_reaping
    extends Struct {
        public trace_entry ent;
        public int pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_start_task_reaping")
    @NotUsableInJava
    public static class trace_event_raw_start_task_reaping
    extends Struct {
        public trace_entry ent;
        public int pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_wake_reaper")
    @NotUsableInJava
    public static class trace_event_raw_wake_reaper
    extends Struct {
        public trace_entry ent;
        public int pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mark_victim")
    @NotUsableInJava
    public static class trace_event_raw_mark_victim
    extends Struct {
        public trace_entry ent;
        public int pid;
        public @Unsigned int __data_loc_comm;
        public @Unsigned long total_vm;
        public @Unsigned long anon_rss;
        public @Unsigned long file_rss;
        public @Unsigned long shmem_rss;
        public @Unsigned @OriginalName(value="uid_t") int uid;
        public @Unsigned long pgtables;
        public short oom_score_adj;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_reclaim_retry_zone")
    @NotUsableInJava
    public static class trace_event_raw_reclaim_retry_zone
    extends Struct {
        public trace_entry ent;
        public int node;
        public int zone_idx;
        public int order;
        public @Unsigned long reclaimable;
        public @Unsigned long available;
        public @Unsigned long min_wmark;
        public int no_progress_loops;
        public boolean wmark_check;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_oom_score_adj_update")
    @NotUsableInJava
    public static class trace_event_raw_oom_score_adj_update
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="pid_t") int pid;
        public char @Size(value=16) [] comm;
        public short oom_score_adj;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_context_tracking_user")
    @NotUsableInJava
    public static class trace_event_data_offsets_context_tracking_user
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_context_tracking_user")
    @NotUsableInJava
    public static class trace_event_raw_context_tracking_user
    extends Struct {
        public trace_entry ent;
        public int dummy;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_uprobe")
    @NotUsableInJava
    public static class trace_uprobe
    extends Struct {
        public DynDefinitions.dyn_event devent;
        public UprobeDefinitions.uprobe_consumer consumer;
        public runtime.path path;
        public String filename;
        public Ptr<runtime.uprobe> uprobe;
        public @Unsigned long offset;
        public @Unsigned long ref_ctr_offset;
        public Ptr<@Unsigned Long> nhits;
        public trace_probe tp;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_guest_halt_poll_ns")
    @NotUsableInJava
    public static class trace_event_data_offsets_guest_halt_poll_ns
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dev_pm_qos_request")
    @NotUsableInJava
    public static class trace_event_data_offsets_dev_pm_qos_request
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_pm_qos_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_pm_qos_update
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cpu_latency_qos_request")
    @NotUsableInJava
    public static class trace_event_data_offsets_cpu_latency_qos_request
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_power_domain")
    @NotUsableInJava
    public static class trace_event_data_offsets_power_domain
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_clock")
    @NotUsableInJava
    public static class trace_event_data_offsets_clock
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_wakeup_source")
    @NotUsableInJava
    public static class trace_event_data_offsets_wakeup_source
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_suspend_resume")
    @NotUsableInJava
    public static class trace_event_data_offsets_suspend_resume
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_device_pm_callback_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_device_pm_callback_end
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
        public @Unsigned int driver;
        public Ptr<?> driver_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_device_pm_callback_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_device_pm_callback_start
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
        public @Unsigned int driver;
        public Ptr<?> driver_ptr_;
        public @Unsigned int parent;
        public Ptr<?> parent_ptr_;
        public @Unsigned int pm_ops;
        public Ptr<?> pm_ops_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cpu_frequency_limits")
    @NotUsableInJava
    public static class trace_event_data_offsets_cpu_frequency_limits
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_pstate_sample")
    @NotUsableInJava
    public static class trace_event_data_offsets_pstate_sample
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_powernv_throttle")
    @NotUsableInJava
    public static class trace_event_data_offsets_powernv_throttle
    extends Struct {
        public @Unsigned int reason;
        public Ptr<?> reason_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cpu_idle_miss")
    @NotUsableInJava
    public static class trace_event_data_offsets_cpu_idle_miss
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cpu")
    @NotUsableInJava
    public static class trace_event_data_offsets_cpu
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_guest_halt_poll_ns")
    @NotUsableInJava
    public static class trace_event_raw_guest_halt_poll_ns
    extends Struct {
        public trace_entry ent;
        public boolean grow;
        public @Unsigned int _new;
        public @Unsigned int old;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dev_pm_qos_request")
    @NotUsableInJava
    public static class trace_event_raw_dev_pm_qos_request
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public DevDefinitions.dev_pm_qos_req_type type;
        public int new_value;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_pm_qos_update")
    @NotUsableInJava
    public static class trace_event_raw_pm_qos_update
    extends Struct {
        public trace_entry ent;
        public PmDefinitions.pm_qos_req_action action;
        public int prev_value;
        public int curr_value;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cpu_latency_qos_request")
    @NotUsableInJava
    public static class trace_event_raw_cpu_latency_qos_request
    extends Struct {
        public trace_entry ent;
        public int value;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_power_domain")
    @NotUsableInJava
    public static class trace_event_raw_power_domain
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned long state;
        public @Unsigned long cpu_id;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_clock")
    @NotUsableInJava
    public static class trace_event_raw_clock
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned long state;
        public @Unsigned long cpu_id;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_wakeup_source")
    @NotUsableInJava
    public static class trace_event_raw_wakeup_source
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned long state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_suspend_resume")
    @NotUsableInJava
    public static class trace_event_raw_suspend_resume
    extends Struct {
        public trace_entry ent;
        public String action;
        public int val;
        public boolean start;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_device_pm_callback_end")
    @NotUsableInJava
    public static class trace_event_raw_device_pm_callback_end
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned int __data_loc_driver;
        public int error;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_device_pm_callback_start")
    @NotUsableInJava
    public static class trace_event_raw_device_pm_callback_start
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned int __data_loc_driver;
        public @Unsigned int __data_loc_parent;
        public @Unsigned int __data_loc_pm_ops;
        public int event;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cpu_frequency_limits")
    @NotUsableInJava
    public static class trace_event_raw_cpu_frequency_limits
    extends Struct {
        public trace_entry ent;
        public @Unsigned int min_freq;
        public @Unsigned int max_freq;
        public @Unsigned int cpu_id;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_pstate_sample")
    @NotUsableInJava
    public static class trace_event_raw_pstate_sample
    extends Struct {
        public trace_entry ent;
        public @Unsigned int core_busy;
        public @Unsigned int scaled_busy;
        public @Unsigned int from;
        public @Unsigned int to;
        public @Unsigned long mperf;
        public @Unsigned long aperf;
        public @Unsigned long tsc;
        public @Unsigned int freq;
        public @Unsigned int io_boost;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_powernv_throttle")
    @NotUsableInJava
    public static class trace_event_raw_powernv_throttle
    extends Struct {
        public trace_entry ent;
        public int chip_id;
        public @Unsigned int __data_loc_reason;
        public int pmax;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cpu_idle_miss")
    @NotUsableInJava
    public static class trace_event_raw_cpu_idle_miss
    extends Struct {
        public trace_entry ent;
        public @Unsigned int cpu_id;
        public @Unsigned int state;
        public boolean below;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cpu")
    @NotUsableInJava
    public static class trace_event_raw_cpu
    extends Struct {
        public trace_entry ent;
        public @Unsigned int state;
        public @Unsigned int cpu_id;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_eprobe")
    @NotUsableInJava
    public static class trace_eprobe
    extends Struct {
        public String event_system;
        public String event_name;
        public String filter_str;
        public Ptr<trace_event_call> event;
        public DynDefinitions.dyn_event devent;
        public trace_probe tp;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_bprintk_fmt")
    @NotUsableInJava
    public static class trace_bprintk_fmt
    extends Struct {
        public ListDefinitions.list_head list;
        public String fmt;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tick_stop")
    @NotUsableInJava
    public static class trace_event_data_offsets_tick_stop
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_itimer_expire")
    @NotUsableInJava
    public static class trace_event_data_offsets_itimer_expire
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_itimer_state")
    @NotUsableInJava
    public static class trace_event_data_offsets_itimer_state
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hrtimer_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_hrtimer_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hrtimer_expire_entry")
    @NotUsableInJava
    public static class trace_event_data_offsets_hrtimer_expire_entry
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hrtimer_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_hrtimer_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hrtimer_init")
    @NotUsableInJava
    public static class trace_event_data_offsets_hrtimer_init
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_timer_base_idle")
    @NotUsableInJava
    public static class trace_event_data_offsets_timer_base_idle
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_timer_expire_entry")
    @NotUsableInJava
    public static class trace_event_data_offsets_timer_expire_entry
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_timer_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_timer_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_timer_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_timer_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tick_stop")
    @NotUsableInJava
    public static class trace_event_raw_tick_stop
    extends Struct {
        public trace_entry ent;
        public int success;
        public int dependency;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_itimer_expire")
    @NotUsableInJava
    public static class trace_event_raw_itimer_expire
    extends Struct {
        public trace_entry ent;
        public int which;
        public @OriginalName(value="pid_t") int pid;
        public @Unsigned long now;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_itimer_state")
    @NotUsableInJava
    public static class trace_event_raw_itimer_state
    extends Struct {
        public trace_entry ent;
        public int which;
        public @Unsigned long expires;
        public long value_sec;
        public long value_nsec;
        public long interval_sec;
        public long interval_nsec;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hrtimer_class")
    @NotUsableInJava
    public static class trace_event_raw_hrtimer_class
    extends Struct {
        public trace_entry ent;
        public Ptr<?> hrtimer;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hrtimer_expire_entry")
    @NotUsableInJava
    public static class trace_event_raw_hrtimer_expire_entry
    extends Struct {
        public trace_entry ent;
        public Ptr<?> hrtimer;
        public long now;
        public Ptr<?> function;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hrtimer_start")
    @NotUsableInJava
    public static class trace_event_raw_hrtimer_start
    extends Struct {
        public trace_entry ent;
        public Ptr<?> hrtimer;
        public Ptr<?> function;
        public long expires;
        public long softexpires;
        public HrtimerDefinitions.hrtimer_mode mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hrtimer_init")
    @NotUsableInJava
    public static class trace_event_raw_hrtimer_init
    extends Struct {
        public trace_entry ent;
        public Ptr<?> hrtimer;
        public @OriginalName(value="clockid_t") int clockid;
        public HrtimerDefinitions.hrtimer_mode mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_timer_base_idle")
    @NotUsableInJava
    public static class trace_event_raw_timer_base_idle
    extends Struct {
        public trace_entry ent;
        public boolean is_idle;
        public @Unsigned int cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_timer_expire_entry")
    @NotUsableInJava
    public static class trace_event_raw_timer_expire_entry
    extends Struct {
        public trace_entry ent;
        public Ptr<?> timer;
        public @Unsigned long now;
        public Ptr<?> function;
        public @Unsigned long baseclk;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_timer_start")
    @NotUsableInJava
    public static class trace_event_raw_timer_start
    extends Struct {
        public trace_entry ent;
        public Ptr<?> timer;
        public Ptr<?> function;
        public @Unsigned long expires;
        public @Unsigned long bucket_expiry;
        public @Unsigned long now;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_timer_class")
    @NotUsableInJava
    public static class trace_event_raw_timer_class
    extends Struct {
        public trace_entry ent;
        public Ptr<?> timer;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rcu_stall_warning")
    @NotUsableInJava
    public static class trace_event_data_offsets_rcu_stall_warning
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rcu_utilization")
    @NotUsableInJava
    public static class trace_event_data_offsets_rcu_utilization
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rcu_stall_warning")
    @NotUsableInJava
    public static class trace_event_raw_rcu_stall_warning
    extends Struct {
        public trace_entry ent;
        public String rcuname;
        public String msg;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rcu_utilization")
    @NotUsableInJava
    public static class trace_event_raw_rcu_utilization
    extends Struct {
        public trace_entry ent;
        public String s;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_console")
    @NotUsableInJava
    public static class trace_event_data_offsets_console
    extends Struct {
        public @Unsigned int msg;
        public Ptr<?> msg_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_console")
    @NotUsableInJava
    public static class trace_event_raw_console
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_msg;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_signal_deliver")
    @NotUsableInJava
    public static class trace_event_data_offsets_signal_deliver
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_signal_generate")
    @NotUsableInJava
    public static class trace_event_data_offsets_signal_generate
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_signal_deliver")
    @NotUsableInJava
    public static class trace_event_raw_signal_deliver
    extends Struct {
        public trace_entry ent;
        public int sig;
        public int errno;
        public int code;
        public @Unsigned long sa_handler;
        public @Unsigned long sa_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_signal_generate")
    @NotUsableInJava
    public static class trace_event_raw_signal_generate
    extends Struct {
        public trace_entry ent;
        public int sig;
        public int errno;
        public int code;
        public char @Size(value=16) [] comm;
        public @OriginalName(value="pid_t") int pid;
        public int group;
        public int result;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_task_rename")
    @NotUsableInJava
    public static class trace_event_data_offsets_task_rename
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_task_newtask")
    @NotUsableInJava
    public static class trace_event_data_offsets_task_newtask
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_task_rename")
    @NotUsableInJava
    public static class trace_event_raw_task_rename
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="pid_t") int pid;
        public char @Size(value=16) [] oldcomm;
        public char @Size(value=16) [] newcomm;
        public short oom_score_adj;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_task_newtask")
    @NotUsableInJava
    public static class trace_event_raw_task_newtask
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="pid_t") int pid;
        public char @Size(value=16) [] comm;
        public @Unsigned long clone_flags;
        public short oom_score_adj;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mce_record")
    @NotUsableInJava
    public static class trace_event_data_offsets_mce_record
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mce_record")
    @NotUsableInJava
    public static class trace_event_raw_mce_record
    extends Struct {
        public trace_entry ent;
        public @Unsigned long mcgcap;
        public @Unsigned long mcgstatus;
        public @Unsigned long status;
        public @Unsigned long addr;
        public @Unsigned long misc;
        public @Unsigned long synd;
        public @Unsigned long ipid;
        public @Unsigned long ip;
        public @Unsigned long tsc;
        public @Unsigned long ppin;
        public @Unsigned long walltime;
        public @Unsigned int cpu;
        public @Unsigned int cpuid;
        public @Unsigned int apicid;
        public @Unsigned int socketid;
        public char cs;
        public char bank;
        public char cpuvendor;
        public @Unsigned int microcode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_x86_fpu")
    @NotUsableInJava
    public static class trace_event_data_offsets_x86_fpu
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_x86_fpu")
    @NotUsableInJava
    public static class trace_event_raw_x86_fpu
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.fpu> fpu;
        public boolean load_fpu;
        public @Unsigned long xfeatures;
        public @Unsigned long xcomp_bv;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_free_moved")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_free_moved
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_setup")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_setup
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_teardown")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_teardown
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_activate")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_activate
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_alloc_managed")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_alloc_managed
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_alloc")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_alloc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_reserve")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_reserve
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_mod")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_mod
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_vector_config")
    @NotUsableInJava
    public static class trace_event_data_offsets_vector_config
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_x86_irq_vector")
    @NotUsableInJava
    public static class trace_event_data_offsets_x86_irq_vector
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_free_moved")
    @NotUsableInJava
    public static class trace_event_raw_vector_free_moved
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public @Unsigned int cpu;
        public @Unsigned int vector;
        public boolean is_managed;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_setup")
    @NotUsableInJava
    public static class trace_event_raw_vector_setup
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public boolean is_legacy;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_teardown")
    @NotUsableInJava
    public static class trace_event_raw_vector_teardown
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public boolean is_managed;
        public boolean has_reserved;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_activate")
    @NotUsableInJava
    public static class trace_event_raw_vector_activate
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public boolean is_managed;
        public boolean can_reserve;
        public boolean reserve;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_alloc_managed")
    @NotUsableInJava
    public static class trace_event_raw_vector_alloc_managed
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public @Unsigned int vector;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_alloc")
    @NotUsableInJava
    public static class trace_event_raw_vector_alloc
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public @Unsigned int vector;
        public boolean reserved;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_reserve")
    @NotUsableInJava
    public static class trace_event_raw_vector_reserve
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_mod")
    @NotUsableInJava
    public static class trace_event_raw_vector_mod
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public @Unsigned int vector;
        public @Unsigned int cpu;
        public @Unsigned int prev_vector;
        public @Unsigned int prev_cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_vector_config")
    @NotUsableInJava
    public static class trace_event_raw_vector_config
    extends Struct {
        public trace_entry ent;
        public @Unsigned int irq;
        public @Unsigned int vector;
        public @Unsigned int cpu;
        public @Unsigned int apicdest;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_x86_irq_vector")
    @NotUsableInJava
    public static class trace_event_raw_x86_irq_vector
    extends Struct {
        public trace_entry ent;
        public int vector;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_cpu_set_ldt")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_cpu_set_ldt
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_cpu_write_gdt_entry")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_cpu_write_gdt_entry
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_cpu_load_idt")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_cpu_load_idt
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_cpu_write_idt_entry")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_cpu_write_idt_entry
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_cpu_write_ldt_entry")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_cpu_write_ldt_entry
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_write_cr3")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_write_cr3
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_flush_tlb_multi")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_flush_tlb_multi
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_flush_tlb_one_user")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_flush_tlb_one_user
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_pgd")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_pgd
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_release_ptpage")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_release_ptpage
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_alloc_ptpage")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_alloc_ptpage
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_ptep_modify_prot")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_ptep_modify_prot
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_set_p4d")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_set_p4d
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_set_pud")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_set_pud
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu_set_pmd")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu_set_pmd
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mmu__set_pte")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mmu__set_pte
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mc_extend_args")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mc_extend_args
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mc_flush")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mc_flush
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mc_flush_reason")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mc_flush_reason
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mc_callback")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mc_callback
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mc_entry_alloc")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mc_entry_alloc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mc_entry")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mc_entry
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xen_mc__batch")
    @NotUsableInJava
    public static class trace_event_data_offsets_xen_mc__batch
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_cpu_set_ldt")
    @NotUsableInJava
    public static class trace_event_raw_xen_cpu_set_ldt
    extends Struct {
        public trace_entry ent;
        public Ptr<?> addr;
        public @Unsigned int entries;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_cpu_write_gdt_entry")
    @NotUsableInJava
    public static class trace_event_raw_xen_cpu_write_gdt_entry
    extends Struct {
        public trace_entry ent;
        public @Unsigned long desc;
        public Ptr<DescDefinitions.desc_struct> dt;
        public int entrynum;
        public int type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_cpu_load_idt")
    @NotUsableInJava
    public static class trace_event_raw_xen_cpu_load_idt
    extends Struct {
        public trace_entry ent;
        public @Unsigned long addr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_cpu_write_idt_entry")
    @NotUsableInJava
    public static class trace_event_raw_xen_cpu_write_idt_entry
    extends Struct {
        public trace_entry ent;
        public Ptr< @OriginalName(value="gate_desc") misc.gate_struct> dt;
        public int entrynum;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_cpu_write_ldt_entry")
    @NotUsableInJava
    public static class trace_event_raw_xen_cpu_write_ldt_entry
    extends Struct {
        public trace_entry ent;
        public Ptr<DescDefinitions.desc_struct> dt;
        public int entrynum;
        public @Unsigned long desc;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_write_cr3")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_write_cr3
    extends Struct {
        public trace_entry ent;
        public boolean kernel;
        public @Unsigned long cr3;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_flush_tlb_multi")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_flush_tlb_multi
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ncpus;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long addr;
        public @Unsigned long end;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_flush_tlb_one_user")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_flush_tlb_one_user
    extends Struct {
        public trace_entry ent;
        public @Unsigned long addr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_pgd")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_pgd
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<misc.pgd_t> pgd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_release_ptpage")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_release_ptpage
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public @Unsigned int level;
        public boolean pinned;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_alloc_ptpage")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_alloc_ptpage
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long pfn;
        public @Unsigned int level;
        public boolean pinned;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_ptep_modify_prot")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_ptep_modify_prot
    extends Struct {
        public trace_entry ent;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long addr;
        public Ptr<PteDefinitions.pte_t> ptep;
        public @Unsigned @OriginalName(value="pteval_t") long pteval;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_set_p4d")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_set_p4d
    extends Struct {
        public trace_entry ent;
        public Ptr<misc.p4d_t> p4dp;
        public Ptr<misc.p4d_t> user_p4dp;
        public @Unsigned @OriginalName(value="p4dval_t") long p4dval;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_set_pud")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_set_pud
    extends Struct {
        public trace_entry ent;
        public Ptr<PudDefinitions.pud_t> pudp;
        public @Unsigned @OriginalName(value="pudval_t") long pudval;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu_set_pmd")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu_set_pmd
    extends Struct {
        public trace_entry ent;
        public Ptr<PmdDefinitions.pmd_t> pmdp;
        public @Unsigned @OriginalName(value="pmdval_t") long pmdval;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mmu__set_pte")
    @NotUsableInJava
    public static class trace_event_raw_xen_mmu__set_pte
    extends Struct {
        public trace_entry ent;
        public Ptr<PteDefinitions.pte_t> ptep;
        public @Unsigned @OriginalName(value="pteval_t") long pteval;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mc_extend_args")
    @NotUsableInJava
    public static class trace_event_raw_xen_mc_extend_args
    extends Struct {
        public trace_entry ent;
        public @Unsigned int op;
        public @Unsigned long args;
        public XenDefinitions.xen_mc_extend_args res;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mc_flush")
    @NotUsableInJava
    public static class trace_event_raw_xen_mc_flush
    extends Struct {
        public trace_entry ent;
        public @Unsigned int mcidx;
        public @Unsigned int argidx;
        public @Unsigned int cbidx;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mc_flush_reason")
    @NotUsableInJava
    public static class trace_event_raw_xen_mc_flush_reason
    extends Struct {
        public trace_entry ent;
        public XenDefinitions.xen_mc_flush_reason reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mc_callback")
    @NotUsableInJava
    public static class trace_event_raw_xen_mc_callback
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="xen_mc_callback_fn_t") Ptr<?> fn;
        public Ptr<?> data;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mc_entry_alloc")
    @NotUsableInJava
    public static class trace_event_raw_xen_mc_entry_alloc
    extends Struct {
        public trace_entry ent;
        public @Unsigned long args;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mc_entry")
    @NotUsableInJava
    public static class trace_event_raw_xen_mc_entry
    extends Struct {
        public trace_entry ent;
        public @Unsigned int op;
        public @Unsigned int nargs;
        public @Unsigned long @Size(value=6) [] args;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xen_mc__batch")
    @NotUsableInJava
    public static class trace_event_raw_xen_mc__batch
    extends Struct {
        public trace_entry ent;
        public XenDefinitions.xen_lazy_mode mode;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_subflow_check_data_avail")
    @NotUsableInJava
    public static class trace_event_data_offsets_subflow_check_data_avail
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ack_update_msk")
    @NotUsableInJava
    public static class trace_event_data_offsets_ack_update_msk
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mptcp_dump_mpext")
    @NotUsableInJava
    public static class trace_event_data_offsets_mptcp_dump_mpext
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mptcp_subflow_get_send")
    @NotUsableInJava
    public static class trace_event_data_offsets_mptcp_subflow_get_send
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_subflow_check_data_avail")
    @NotUsableInJava
    public static class trace_event_raw_subflow_check_data_avail
    extends Struct {
        public trace_entry ent;
        public char status;
        public Ptr<?> skb;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ack_update_msk")
    @NotUsableInJava
    public static class trace_event_raw_ack_update_msk
    extends Struct {
        public trace_entry ent;
        public @Unsigned long data_ack;
        public @Unsigned long old_snd_una;
        public @Unsigned long new_snd_una;
        public @Unsigned long new_wnd_end;
        public @Unsigned long msk_wnd_end;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mptcp_dump_mpext")
    @NotUsableInJava
    public static class trace_event_raw_mptcp_dump_mpext
    extends Struct {
        public trace_entry ent;
        public @Unsigned long data_ack;
        public @Unsigned long data_seq;
        public @Unsigned int subflow_seq;
        public @Unsigned short data_len;
        public @Unsigned short csum;
        public char use_map;
        public char dsn64;
        public char data_fin;
        public char use_ack;
        public char ack64;
        public char mpc_map;
        public char frozen;
        public char reset_transient;
        public char reset_reason;
        public char csum_reqd;
        public char infinite_map;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mptcp_subflow_get_send")
    @NotUsableInJava
    public static class trace_event_raw_mptcp_subflow_get_send
    extends Struct {
        public trace_entry ent;
        public boolean active;
        public boolean free;
        public @Unsigned int snd_wnd;
        public @Unsigned int pace;
        public char backup;
        public @Unsigned long ratio;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_bpf_test_finish")
    @NotUsableInJava
    public static class trace_event_data_offsets_bpf_test_finish
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_bpf_trigger_tp")
    @NotUsableInJava
    public static class trace_event_data_offsets_bpf_trigger_tp
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_bpf_test_finish")
    @NotUsableInJava
    public static class trace_event_raw_bpf_test_finish
    extends Struct {
        public trace_entry ent;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_bpf_trigger_tp")
    @NotUsableInJava
    public static class trace_event_raw_bpf_trigger_tp
    extends Struct {
        public trace_entry ent;
        public int nonce;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_icc_set_bw_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_icc_set_bw_end
    extends Struct {
        public @Unsigned int path_name;
        public Ptr<?> path_name_ptr_;
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_icc_set_bw")
    @NotUsableInJava
    public static class trace_event_data_offsets_icc_set_bw
    extends Struct {
        public @Unsigned int path_name;
        public Ptr<?> path_name_ptr_;
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
        public @Unsigned int node_name;
        public Ptr<?> node_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_icc_set_bw_end")
    @NotUsableInJava
    public static class trace_event_raw_icc_set_bw_end
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_path_name;
        public @Unsigned int __data_loc_dev;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_icc_set_bw")
    @NotUsableInJava
    public static class trace_event_raw_icc_set_bw
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_path_name;
        public @Unsigned int __data_loc_dev;
        public @Unsigned int __data_loc_node_name;
        public @Unsigned int avg_bw;
        public @Unsigned int peak_bw;
        public @Unsigned int node_avg_bw;
        public @Unsigned int node_peak_bw;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_amd_pstate_perf")
    @NotUsableInJava
    public static class trace_event_data_offsets_amd_pstate_perf
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_amd_pstate_perf")
    @NotUsableInJava
    public static class trace_event_raw_amd_pstate_perf
    extends Struct {
        public trace_entry ent;
        public @Unsigned long min_perf;
        public @Unsigned long target_perf;
        public @Unsigned long capacity;
        public @Unsigned long freq;
        public @Unsigned long mperf;
        public @Unsigned long aperf;
        public @Unsigned long tsc;
        public @Unsigned int cpu_id;
        public boolean changed;
        public boolean fast_switch;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_thermal_power_allocator_pid")
    @NotUsableInJava
    public static class trace_event_data_offsets_thermal_power_allocator_pid
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_thermal_power_actor")
    @NotUsableInJava
    public static class trace_event_data_offsets_thermal_power_actor
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_thermal_power_allocator")
    @NotUsableInJava
    public static class trace_event_data_offsets_thermal_power_allocator
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_thermal_power_allocator_pid")
    @NotUsableInJava
    public static class trace_event_raw_thermal_power_allocator_pid
    extends Struct {
        public trace_entry ent;
        public int tz_id;
        public int err;
        public int err_integral;
        public long p;
        public long i;
        public long d;
        public int output;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_thermal_power_actor")
    @NotUsableInJava
    public static class trace_event_raw_thermal_power_actor
    extends Struct {
        public trace_entry ent;
        public int tz_id;
        public int actor_id;
        public @Unsigned int req_power;
        public @Unsigned int granted_power;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_thermal_power_allocator")
    @NotUsableInJava
    public static class trace_event_raw_thermal_power_allocator
    extends Struct {
        public trace_entry ent;
        public int tz_id;
        public @Unsigned int total_req_power;
        public @Unsigned int total_granted_power;
        public @Unsigned long num_actors;
        public @Unsigned int power_range;
        public @Unsigned int max_allocatable_power;
        public int current_temp;
        public int delta_temp;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hwmon_attr_show_string")
    @NotUsableInJava
    public static class trace_event_data_offsets_hwmon_attr_show_string
    extends Struct {
        public @Unsigned int attr_name;
        public Ptr<?> attr_name_ptr_;
        public @Unsigned int label;
        public Ptr<?> label_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hwmon_attr_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_hwmon_attr_class
    extends Struct {
        public @Unsigned int attr_name;
        public Ptr<?> attr_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hwmon_attr_show_string")
    @NotUsableInJava
    public static class trace_event_raw_hwmon_attr_show_string
    extends Struct {
        public trace_entry ent;
        public int index;
        public @Unsigned int __data_loc_attr_name;
        public @Unsigned int __data_loc_label;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hwmon_attr_class")
    @NotUsableInJava
    public static class trace_event_raw_hwmon_attr_class
    extends Struct {
        public trace_entry ent;
        public int index;
        public @Unsigned int __data_loc_attr_name;
        public long val;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_smbus_result")
    @NotUsableInJava
    public static class trace_event_data_offsets_smbus_result
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_smbus_reply")
    @NotUsableInJava
    public static class trace_event_data_offsets_smbus_reply
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_smbus_read")
    @NotUsableInJava
    public static class trace_event_data_offsets_smbus_read
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_smbus_write")
    @NotUsableInJava
    public static class trace_event_data_offsets_smbus_write
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_smbus_result")
    @NotUsableInJava
    public static class trace_event_raw_smbus_result
    extends Struct {
        public trace_entry ent;
        public int adapter_nr;
        public @Unsigned short addr;
        public @Unsigned short flags;
        public char read_write;
        public char command;
        public short res;
        public @Unsigned int protocol;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_smbus_reply")
    @NotUsableInJava
    public static class trace_event_raw_smbus_reply
    extends Struct {
        public trace_entry ent;
        public int adapter_nr;
        public @Unsigned short addr;
        public @Unsigned short flags;
        public char command;
        public char len;
        public @Unsigned int protocol;
        public char @Size(value=34) [] buf;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_smbus_read")
    @NotUsableInJava
    public static class trace_event_raw_smbus_read
    extends Struct {
        public trace_entry ent;
        public int adapter_nr;
        public @Unsigned short flags;
        public @Unsigned short addr;
        public char command;
        public @Unsigned int protocol;
        public char @Size(value=34) [] buf;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_smbus_write")
    @NotUsableInJava
    public static class trace_event_raw_smbus_write
    extends Struct {
        public trace_entry ent;
        public int adapter_nr;
        public @Unsigned short addr;
        public @Unsigned short flags;
        public char command;
        public char len;
        public @Unsigned int protocol;
        public char @Size(value=34) [] buf;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mdio_access")
    @NotUsableInJava
    public static class trace_event_data_offsets_mdio_access
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mdio_access")
    @NotUsableInJava
    public static class trace_event_raw_mdio_access
    extends Struct {
        public trace_entry ent;
        public char @Size(value=61) [] busid;
        public char read;
        public char addr;
        public @Unsigned short val;
        public @Unsigned int regnum;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_drm_vblank_event_delivered")
    @NotUsableInJava
    public static class trace_event_data_offsets_drm_vblank_event_delivered
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_drm_vblank_event_queued")
    @NotUsableInJava
    public static class trace_event_data_offsets_drm_vblank_event_queued
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_drm_vblank_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_drm_vblank_event
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_drm_vblank_event_delivered")
    @NotUsableInJava
    public static class trace_event_raw_drm_vblank_event_delivered
    extends Struct {
        public trace_entry ent;
        public Ptr<DrmDefinitions.drm_file> file;
        public int crtc;
        public @Unsigned int seq;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_drm_vblank_event_queued")
    @NotUsableInJava
    public static class trace_event_raw_drm_vblank_event_queued
    extends Struct {
        public trace_entry ent;
        public Ptr<DrmDefinitions.drm_file> file;
        public int crtc;
        public @Unsigned int seq;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_drm_vblank_event")
    @NotUsableInJava
    public static class trace_event_raw_drm_vblank_event
    extends Struct {
        public trace_entry ent;
        public int crtc;
        public @Unsigned int seq;
        public @OriginalName(value="ktime_t") long time;
        public boolean high_prec;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_msr_trace_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_msr_trace_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_msr_trace_class")
    @NotUsableInJava
    public static class trace_event_raw_msr_trace_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned int msr;
        public @Unsigned long val;
        public int failed;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_selinux_audited")
    @NotUsableInJava
    public static class trace_event_data_offsets_selinux_audited
    extends Struct {
        public @Unsigned int scontext;
        public Ptr<?> scontext_ptr_;
        public @Unsigned int tcontext;
        public Ptr<?> tcontext_ptr_;
        public @Unsigned int tclass;
        public Ptr<?> tclass_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_selinux_audited")
    @NotUsableInJava
    public static class trace_event_raw_selinux_audited
    extends Struct {
        public trace_entry ent;
        public @Unsigned int requested;
        public @Unsigned int denied;
        public @Unsigned int audited;
        public int result;
        public @Unsigned int __data_loc_scontext;
        public @Unsigned int __data_loc_tcontext;
        public @Unsigned int __data_loc_tclass;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_free_vmap_area_noflush")
    @NotUsableInJava
    public static class trace_event_data_offsets_free_vmap_area_noflush
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_purge_vmap_area_lazy")
    @NotUsableInJava
    public static class trace_event_data_offsets_purge_vmap_area_lazy
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_alloc_vmap_area")
    @NotUsableInJava
    public static class trace_event_data_offsets_alloc_vmap_area
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_free_vmap_area_noflush")
    @NotUsableInJava
    public static class trace_event_raw_free_vmap_area_noflush
    extends Struct {
        public trace_entry ent;
        public @Unsigned long va_start;
        public @Unsigned long nr_lazy;
        public @Unsigned long nr_lazy_max;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_purge_vmap_area_lazy")
    @NotUsableInJava
    public static class trace_event_raw_purge_vmap_area_lazy
    extends Struct {
        public trace_entry ent;
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned int npurged;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_alloc_vmap_area")
    @NotUsableInJava
    public static class trace_event_raw_alloc_vmap_area
    extends Struct {
        public trace_entry ent;
        public @Unsigned long addr;
        public @Unsigned long size;
        public @Unsigned long align;
        public @Unsigned long vstart;
        public @Unsigned long vend;
        public int failed;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rseq_ip_fixup")
    @NotUsableInJava
    public static class trace_event_data_offsets_rseq_ip_fixup
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rseq_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_rseq_update
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rseq_ip_fixup")
    @NotUsableInJava
    public static class trace_event_raw_rseq_ip_fixup
    extends Struct {
        public trace_entry ent;
        public @Unsigned long regs_ip;
        public @Unsigned long start_ip;
        public @Unsigned long post_commit_offset;
        public @Unsigned long abort_ip;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rseq_update")
    @NotUsableInJava
    public static class trace_event_raw_rseq_update
    extends Struct {
        public trace_entry ent;
        public int cpu_id;
        public int node_id;
        public int mm_cid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_bpf_xdp_link_attach_failed")
    @NotUsableInJava
    public static class trace_event_data_offsets_bpf_xdp_link_attach_failed
    extends Struct {
        public @Unsigned int msg;
        public Ptr<?> msg_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mem_return_failed")
    @NotUsableInJava
    public static class trace_event_data_offsets_mem_return_failed
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mem_connect")
    @NotUsableInJava
    public static class trace_event_data_offsets_mem_connect
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mem_disconnect")
    @NotUsableInJava
    public static class trace_event_data_offsets_mem_disconnect
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xdp_devmap_xmit")
    @NotUsableInJava
    public static class trace_event_data_offsets_xdp_devmap_xmit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xdp_cpumap_enqueue")
    @NotUsableInJava
    public static class trace_event_data_offsets_xdp_cpumap_enqueue
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xdp_cpumap_kthread")
    @NotUsableInJava
    public static class trace_event_data_offsets_xdp_cpumap_kthread
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xdp_redirect_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_xdp_redirect_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xdp_bulk_tx")
    @NotUsableInJava
    public static class trace_event_data_offsets_xdp_bulk_tx
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_xdp_exception")
    @NotUsableInJava
    public static class trace_event_data_offsets_xdp_exception
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_bpf_xdp_link_attach_failed")
    @NotUsableInJava
    public static class trace_event_raw_bpf_xdp_link_attach_failed
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_msg;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mem_return_failed")
    @NotUsableInJava
    public static class trace_event_raw_mem_return_failed
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.page> page;
        public @Unsigned int mem_id;
        public @Unsigned int mem_type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mem_connect")
    @NotUsableInJava
    public static class trace_event_raw_mem_connect
    extends Struct {
        public trace_entry ent;
        public Ptr<XdpDefinitions.xdp_mem_allocator> xa;
        public @Unsigned int mem_id;
        public @Unsigned int mem_type;
        public Ptr<?> allocator;
        public Ptr<XdpDefinitions.xdp_rxq_info> rxq;
        public int ifindex;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mem_disconnect")
    @NotUsableInJava
    public static class trace_event_raw_mem_disconnect
    extends Struct {
        public trace_entry ent;
        public Ptr<XdpDefinitions.xdp_mem_allocator> xa;
        public @Unsigned int mem_id;
        public @Unsigned int mem_type;
        public Ptr<?> allocator;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xdp_devmap_xmit")
    @NotUsableInJava
    public static class trace_event_raw_xdp_devmap_xmit
    extends Struct {
        public trace_entry ent;
        public int from_ifindex;
        public @Unsigned int act;
        public int to_ifindex;
        public int drops;
        public int sent;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xdp_cpumap_enqueue")
    @NotUsableInJava
    public static class trace_event_raw_xdp_cpumap_enqueue
    extends Struct {
        public trace_entry ent;
        public int map_id;
        public @Unsigned int act;
        public int cpu;
        public @Unsigned int drops;
        public @Unsigned int processed;
        public int to_cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xdp_cpumap_kthread")
    @NotUsableInJava
    public static class trace_event_raw_xdp_cpumap_kthread
    extends Struct {
        public trace_entry ent;
        public int map_id;
        public @Unsigned int act;
        public int cpu;
        public @Unsigned int drops;
        public @Unsigned int processed;
        public int sched;
        public @Unsigned int xdp_pass;
        public @Unsigned int xdp_drop;
        public @Unsigned int xdp_redirect;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xdp_redirect_template")
    @NotUsableInJava
    public static class trace_event_raw_xdp_redirect_template
    extends Struct {
        public trace_entry ent;
        public int prog_id;
        public @Unsigned int act;
        public int ifindex;
        public int err;
        public int to_ifindex;
        public @Unsigned int map_id;
        public int map_index;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xdp_bulk_tx")
    @NotUsableInJava
    public static class trace_event_raw_xdp_bulk_tx
    extends Struct {
        public trace_entry ent;
        public int ifindex;
        public @Unsigned int act;
        public int drops;
        public int sent;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_xdp_exception")
    @NotUsableInJava
    public static class trace_event_raw_xdp_exception
    extends Struct {
        public trace_entry ent;
        public int prog_id;
        public @Unsigned int act;
        public int ifindex;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_fprobe")
    @NotUsableInJava
    public static class trace_fprobe
    extends Struct {
        public DynDefinitions.dyn_event devent;
        public runtime.fprobe fp;
        public String symbol;
        public Ptr<runtime.tracepoint> tpoint;
        public Ptr<runtime.module> mod;
        public trace_probe tp;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_kprobe")
    @NotUsableInJava
    public static class trace_kprobe
    extends Struct {
        public DynDefinitions.dyn_event devent;
        public runtime.kretprobe rp;
        public Ptr<@Unsigned Long> nhit;
        public String symbol;
        public trace_probe tp;
    }

    @Type(noCCodeGeneration=true, cType="union trace_synth_field")
    @NotUsableInJava
    public static class trace_synth_field
    extends Union {
        public char as_u8;
        public @Unsigned short as_u16;
        public @Unsigned int as_u32;
        public @Unsigned long as_u64;
        public trace_dynamic_info as_dynamic;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_dynamic_info")
    @NotUsableInJava
    public static class trace_dynamic_info
    extends Struct {
        public @Unsigned short offset;
        public @Unsigned short len;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_stack")
    @NotUsableInJava
    public static class trace_stack
    extends Struct {
        public int stack_size;
        public int nr_entries;
        public @Unsigned long @Size(value=256) [] calls;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sample_threshold")
    @NotUsableInJava
    public static class trace_event_data_offsets_sample_threshold
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_nmi_noise")
    @NotUsableInJava
    public static class trace_event_data_offsets_nmi_noise
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_irq_noise")
    @NotUsableInJava
    public static class trace_event_data_offsets_irq_noise
    extends Struct {
        public @Unsigned int desc;
        public Ptr<?> desc_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_softirq_noise")
    @NotUsableInJava
    public static class trace_event_data_offsets_softirq_noise
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_thread_noise")
    @NotUsableInJava
    public static class trace_event_data_offsets_thread_noise
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sample_threshold")
    @NotUsableInJava
    public static class trace_event_raw_sample_threshold
    extends Struct {
        public trace_entry ent;
        public @Unsigned long start;
        public @Unsigned long duration;
        public @Unsigned long interference;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_nmi_noise")
    @NotUsableInJava
    public static class trace_event_raw_nmi_noise
    extends Struct {
        public trace_entry ent;
        public @Unsigned long start;
        public @Unsigned long duration;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_irq_noise")
    @NotUsableInJava
    public static class trace_event_raw_irq_noise
    extends Struct {
        public trace_entry ent;
        public @Unsigned long start;
        public @Unsigned long duration;
        public @Unsigned int __data_loc_desc;
        public int vector;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_softirq_noise")
    @NotUsableInJava
    public static class trace_event_raw_softirq_noise
    extends Struct {
        public trace_entry ent;
        public @Unsigned long start;
        public @Unsigned long duration;
        public int vector;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_thread_noise")
    @NotUsableInJava
    public static class trace_event_raw_thread_noise
    extends Struct {
        public trace_entry ent;
        public char @Size(value=16) [] comm;
        public @Unsigned long start;
        public @Unsigned long duration;
        public @OriginalName(value="pid_t") int pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_buffer_struct")
    @NotUsableInJava
    public static class trace_buffer_struct
    extends Struct {
        public int nesting;
        public char @Size(value=4096) [] buffer;
    }

    @Type(noCCodeGeneration=true, cType="enum trace_iter_flags")
    public static enum trace_iter_flags implements Enum<trace_iter_flags>,
    TypedEnum<trace_iter_flags, Integer>
    {
        TRACE_FILE_LAT_FMT,
        TRACE_FILE_ANNOTATE,
        TRACE_FILE_TIME_IN_NS;

    }

    @Type(noCCodeGeneration=true, cType="struct trace_export")
    @NotUsableInJava
    public static class trace_export
    extends Struct {
        public Ptr<trace_export> next;
        public Ptr<?> write;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_module_request")
    @NotUsableInJava
    public static class trace_event_data_offsets_module_request
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_module_refcnt")
    @NotUsableInJava
    public static class trace_event_data_offsets_module_refcnt
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_module_free")
    @NotUsableInJava
    public static class trace_event_data_offsets_module_free
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_module_load")
    @NotUsableInJava
    public static class trace_event_data_offsets_module_load
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_module_request")
    @NotUsableInJava
    public static class trace_event_raw_module_request
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ip;
        public boolean wait;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_module_refcnt")
    @NotUsableInJava
    public static class trace_event_raw_module_refcnt
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ip;
        public int refcnt;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_module_free")
    @NotUsableInJava
    public static class trace_event_raw_module_free
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_module_load")
    @NotUsableInJava
    public static class trace_event_raw_module_load
    extends Struct {
        public trace_entry ent;
        public @Unsigned int taints;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_swiotlb_bounced")
    @NotUsableInJava
    public static class trace_event_data_offsets_swiotlb_bounced
    extends Struct {
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_swiotlb_bounced")
    @NotUsableInJava
    public static class trace_event_raw_swiotlb_bounced
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned long dma_mask;
        public @Unsigned @OriginalName(value="dma_addr_t") long dev_addr;
        public @Unsigned long size;
        public boolean force;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_contention_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_contention_end
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_contention_begin")
    @NotUsableInJava
    public static class trace_event_data_offsets_contention_begin
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_contention_end")
    @NotUsableInJava
    public static class trace_event_raw_contention_end
    extends Struct {
        public trace_entry ent;
        public Ptr<?> lock_addr;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_contention_begin")
    @NotUsableInJava
    public static class trace_event_raw_contention_begin
    extends Struct {
        public trace_entry ent;
        public Ptr<?> lock_addr;
        public @Unsigned int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cpuhp_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_cpuhp_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cpuhp_multi_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_cpuhp_multi_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cpuhp_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_cpuhp_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cpuhp_exit")
    @NotUsableInJava
    public static class trace_event_raw_cpuhp_exit
    extends Struct {
        public trace_entry ent;
        public @Unsigned int cpu;
        public int state;
        public int idx;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cpuhp_multi_enter")
    @NotUsableInJava
    public static class trace_event_raw_cpuhp_multi_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned int cpu;
        public int target;
        public int idx;
        public Ptr<?> fun;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cpuhp_enter")
    @NotUsableInJava
    public static class trace_event_raw_cpuhp_enter
    extends Struct {
        public trace_entry ent;
        public @Unsigned int cpu;
        public int target;
        public int idx;
        public Ptr<?> fun;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mon_llc_occupancy_limbo")
    @NotUsableInJava
    public static class trace_event_data_offsets_mon_llc_occupancy_limbo
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_pseudo_lock_l3")
    @NotUsableInJava
    public static class trace_event_data_offsets_pseudo_lock_l3
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_pseudo_lock_l2")
    @NotUsableInJava
    public static class trace_event_data_offsets_pseudo_lock_l2
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_pseudo_lock_mem_latency")
    @NotUsableInJava
    public static class trace_event_data_offsets_pseudo_lock_mem_latency
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mon_llc_occupancy_limbo")
    @NotUsableInJava
    public static class trace_event_raw_mon_llc_occupancy_limbo
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ctrl_hw_id;
        public @Unsigned int mon_hw_id;
        public int domain_id;
        public @Unsigned long llc_occupancy_bytes;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_pseudo_lock_l3")
    @NotUsableInJava
    public static class trace_event_raw_pseudo_lock_l3
    extends Struct {
        public trace_entry ent;
        public @Unsigned long l3_hits;
        public @Unsigned long l3_miss;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_pseudo_lock_l2")
    @NotUsableInJava
    public static class trace_event_raw_pseudo_lock_l2
    extends Struct {
        public trace_entry ent;
        public @Unsigned long l2_hits;
        public @Unsigned long l2_miss;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_pseudo_lock_mem_latency")
    @NotUsableInJava
    public static class trace_event_raw_pseudo_lock_mem_latency
    extends Struct {
        public trace_entry ent;
        public @Unsigned int latency;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_nmi_handler")
    @NotUsableInJava
    public static class trace_event_data_offsets_nmi_handler
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_nmi_handler")
    @NotUsableInJava
    public static class trace_event_raw_nmi_handler
    extends Struct {
        public trace_entry ent;
        public Ptr<?> handler;
        public long delta_ns;
        public int handled;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hyperv_send_ipi_one")
    @NotUsableInJava
    public static class trace_event_data_offsets_hyperv_send_ipi_one
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hyperv_send_ipi_mask")
    @NotUsableInJava
    public static class trace_event_data_offsets_hyperv_send_ipi_mask
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hyperv_nested_flush_guest_mapping_range")
    @NotUsableInJava
    public static class trace_event_data_offsets_hyperv_nested_flush_guest_mapping_range
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hyperv_nested_flush_guest_mapping")
    @NotUsableInJava
    public static class trace_event_data_offsets_hyperv_nested_flush_guest_mapping
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hyperv_mmu_flush_tlb_multi")
    @NotUsableInJava
    public static class trace_event_data_offsets_hyperv_mmu_flush_tlb_multi
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hyperv_send_ipi_one")
    @NotUsableInJava
    public static class trace_event_raw_hyperv_send_ipi_one
    extends Struct {
        public trace_entry ent;
        public int cpu;
        public int vector;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hyperv_send_ipi_mask")
    @NotUsableInJava
    public static class trace_event_raw_hyperv_send_ipi_mask
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ncpus;
        public int vector;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hyperv_nested_flush_guest_mapping_range")
    @NotUsableInJava
    public static class trace_event_raw_hyperv_nested_flush_guest_mapping_range
    extends Struct {
        public trace_entry ent;
        public @Unsigned long as;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hyperv_nested_flush_guest_mapping")
    @NotUsableInJava
    public static class trace_event_raw_hyperv_nested_flush_guest_mapping
    extends Struct {
        public trace_entry ent;
        public @Unsigned long as;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hyperv_mmu_flush_tlb_multi")
    @NotUsableInJava
    public static class trace_event_raw_hyperv_mmu_flush_tlb_multi
    extends Struct {
        public trace_entry ent;
        public @Unsigned int ncpus;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long addr;
        public @Unsigned long end;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_initcall_finish")
    @NotUsableInJava
    public static class trace_event_data_offsets_initcall_finish
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_initcall_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_initcall_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_initcall_level")
    @NotUsableInJava
    public static class trace_event_data_offsets_initcall_level
    extends Struct {
        public @Unsigned int level;
        public Ptr<?> level_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_initcall_finish")
    @NotUsableInJava
    public static class trace_event_raw_initcall_finish
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="initcall_t") Ptr<?> func;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_initcall_start")
    @NotUsableInJava
    public static class trace_event_raw_initcall_start
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="initcall_t") Ptr<?> func;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_initcall_level")
    @NotUsableInJava
    public static class trace_event_raw_initcall_level
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_level;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tls_contenttype")
    @NotUsableInJava
    public static class trace_event_data_offsets_tls_contenttype
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_handshake_complete")
    @NotUsableInJava
    public static class trace_event_data_offsets_handshake_complete
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_handshake_alert_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_handshake_alert_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_handshake_error_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_handshake_error_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_handshake_fd_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_handshake_fd_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_handshake_event_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_handshake_event_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tls_contenttype")
    @NotUsableInJava
    public static class trace_event_raw_tls_contenttype
    extends Struct {
        public trace_entry ent;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public @Unsigned int netns_ino;
        public @Unsigned long type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_handshake_complete")
    @NotUsableInJava
    public static class trace_event_raw_handshake_complete
    extends Struct {
        public trace_entry ent;
        public Ptr<?> req;
        public Ptr<?> sk;
        public int status;
        public @Unsigned int netns_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_handshake_alert_class")
    @NotUsableInJava
    public static class trace_event_raw_handshake_alert_class
    extends Struct {
        public trace_entry ent;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public @Unsigned int netns_ino;
        public @Unsigned long level;
        public @Unsigned long description;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_handshake_error_class")
    @NotUsableInJava
    public static class trace_event_raw_handshake_error_class
    extends Struct {
        public trace_entry ent;
        public Ptr<?> req;
        public Ptr<?> sk;
        public int err;
        public @Unsigned int netns_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_handshake_fd_class")
    @NotUsableInJava
    public static class trace_event_raw_handshake_fd_class
    extends Struct {
        public trace_entry ent;
        public Ptr<?> req;
        public Ptr<?> sk;
        public int fd;
        public @Unsigned int netns_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_handshake_event_class")
    @NotUsableInJava
    public static class trace_event_raw_handshake_event_class
    extends Struct {
        public trace_entry ent;
        public Ptr<?> req;
        public Ptr<?> sk;
        public @Unsigned int netns_ino;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mctp_key_release")
    @NotUsableInJava
    public static class trace_event_data_offsets_mctp_key_release
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mctp_key_acquire")
    @NotUsableInJava
    public static class trace_event_data_offsets_mctp_key_acquire
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mctp_key_release")
    @NotUsableInJava
    public static class trace_event_raw_mctp_key_release
    extends Struct {
        public trace_entry ent;
        public char paddr;
        public char laddr;
        public char tag;
        public int reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mctp_key_acquire")
    @NotUsableInJava
    public static class trace_event_raw_mctp_key_acquire
    extends Struct {
        public trace_entry ent;
        public char paddr;
        public char laddr;
        public char tag;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devlink_trap_report")
    @NotUsableInJava
    public static class trace_event_data_offsets_devlink_trap_report
    extends Struct {
        public @Unsigned int bus_name;
        public Ptr<?> bus_name_ptr_;
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
        public @Unsigned int driver_name;
        public Ptr<?> driver_name_ptr_;
        public @Unsigned int trap_name;
        public Ptr<?> trap_name_ptr_;
        public @Unsigned int trap_group_name;
        public Ptr<?> trap_group_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devlink_health_reporter_state_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_devlink_health_reporter_state_update
    extends Struct {
        public @Unsigned int bus_name;
        public Ptr<?> bus_name_ptr_;
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
        public @Unsigned int driver_name;
        public Ptr<?> driver_name_ptr_;
        public @Unsigned int reporter_name;
        public Ptr<?> reporter_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devlink_health_recover_aborted")
    @NotUsableInJava
    public static class trace_event_data_offsets_devlink_health_recover_aborted
    extends Struct {
        public @Unsigned int bus_name;
        public Ptr<?> bus_name_ptr_;
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
        public @Unsigned int driver_name;
        public Ptr<?> driver_name_ptr_;
        public @Unsigned int reporter_name;
        public Ptr<?> reporter_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devlink_health_report")
    @NotUsableInJava
    public static class trace_event_data_offsets_devlink_health_report
    extends Struct {
        public @Unsigned int bus_name;
        public Ptr<?> bus_name_ptr_;
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
        public @Unsigned int driver_name;
        public Ptr<?> driver_name_ptr_;
        public @Unsigned int reporter_name;
        public Ptr<?> reporter_name_ptr_;
        public @Unsigned int msg;
        public Ptr<?> msg_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devlink_hwerr")
    @NotUsableInJava
    public static class trace_event_data_offsets_devlink_hwerr
    extends Struct {
        public @Unsigned int bus_name;
        public Ptr<?> bus_name_ptr_;
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
        public @Unsigned int driver_name;
        public Ptr<?> driver_name_ptr_;
        public @Unsigned int msg;
        public Ptr<?> msg_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devlink_hwmsg")
    @NotUsableInJava
    public static class trace_event_data_offsets_devlink_hwmsg
    extends Struct {
        public @Unsigned int bus_name;
        public Ptr<?> bus_name_ptr_;
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
        public @Unsigned int driver_name;
        public Ptr<?> driver_name_ptr_;
        public @Unsigned int buf;
        public Ptr<?> buf_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devlink_trap_report")
    @NotUsableInJava
    public static class trace_event_raw_devlink_trap_report
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_bus_name;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned int __data_loc_driver_name;
        public @Unsigned int __data_loc_trap_name;
        public @Unsigned int __data_loc_trap_group_name;
        public char @Size(value=16) [] input_dev_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devlink_health_reporter_state_update")
    @NotUsableInJava
    public static class trace_event_raw_devlink_health_reporter_state_update
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_bus_name;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned int __data_loc_driver_name;
        public @Unsigned int __data_loc_reporter_name;
        public char new_state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devlink_health_recover_aborted")
    @NotUsableInJava
    public static class trace_event_raw_devlink_health_recover_aborted
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_bus_name;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned int __data_loc_driver_name;
        public @Unsigned int __data_loc_reporter_name;
        public boolean health_state;
        public @Unsigned long time_since_last_recover;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devlink_health_report")
    @NotUsableInJava
    public static class trace_event_raw_devlink_health_report
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_bus_name;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned int __data_loc_driver_name;
        public @Unsigned int __data_loc_reporter_name;
        public @Unsigned int __data_loc_msg;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devlink_hwerr")
    @NotUsableInJava
    public static class trace_event_raw_devlink_hwerr
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_bus_name;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned int __data_loc_driver_name;
        public int err;
        public @Unsigned int __data_loc_msg;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devlink_hwmsg")
    @NotUsableInJava
    public static class trace_event_raw_devlink_hwmsg
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_bus_name;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned int __data_loc_driver_name;
        public boolean incoming;
        public @Unsigned long type;
        public @Unsigned int __data_loc_buf;
        public @Unsigned long len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_netlink_extack")
    @NotUsableInJava
    public static class trace_event_data_offsets_netlink_extack
    extends Struct {
        public @Unsigned int msg;
        public Ptr<?> msg_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_netlink_extack")
    @NotUsableInJava
    public static class trace_event_raw_netlink_extack
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_msg;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_neigh__update")
    @NotUsableInJava
    public static class trace_event_data_offsets_neigh__update
    extends Struct {
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_neigh_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_neigh_update
    extends Struct {
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_neigh_create")
    @NotUsableInJava
    public static class trace_event_data_offsets_neigh_create
    extends Struct {
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_neigh__update")
    @NotUsableInJava
    public static class trace_event_raw_neigh__update
    extends Struct {
        public trace_entry ent;
        public @Unsigned int family;
        public @Unsigned int __data_loc_dev;
        public char @Size(value=32) [] lladdr;
        public char lladdr_len;
        public char flags;
        public char nud_state;
        public char type;
        public char dead;
        public int refcnt;
        public char @Size(value=4) [] primary_key4;
        public char @Size(value=16) [] primary_key6;
        public @Unsigned long confirmed;
        public @Unsigned long updated;
        public @Unsigned long used;
        public @Unsigned int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_neigh_update")
    @NotUsableInJava
    public static class trace_event_raw_neigh_update
    extends Struct {
        public trace_entry ent;
        public @Unsigned int family;
        public @Unsigned int __data_loc_dev;
        public char @Size(value=32) [] lladdr;
        public char lladdr_len;
        public char flags;
        public char nud_state;
        public char type;
        public char dead;
        public int refcnt;
        public char @Size(value=4) [] primary_key4;
        public char @Size(value=16) [] primary_key6;
        public @Unsigned long confirmed;
        public @Unsigned long updated;
        public @Unsigned long used;
        public char @Size(value=32) [] new_lladdr;
        public char new_state;
        public @Unsigned int update_flags;
        public @Unsigned int pid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_neigh_create")
    @NotUsableInJava
    public static class trace_event_raw_neigh_create
    extends Struct {
        public trace_entry ent;
        public @Unsigned int family;
        public @Unsigned int __data_loc_dev;
        public int entries;
        public char created;
        public char gc_exempt;
        public char @Size(value=4) [] primary_key4;
        public char @Size(value=16) [] primary_key6;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_page_pool_update_nid")
    @NotUsableInJava
    public static class trace_event_data_offsets_page_pool_update_nid
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_page_pool_state_hold")
    @NotUsableInJava
    public static class trace_event_data_offsets_page_pool_state_hold
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_page_pool_state_release")
    @NotUsableInJava
    public static class trace_event_data_offsets_page_pool_state_release
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_page_pool_release")
    @NotUsableInJava
    public static class trace_event_data_offsets_page_pool_release
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_page_pool_update_nid")
    @NotUsableInJava
    public static class trace_event_raw_page_pool_update_nid
    extends Struct {
        public trace_entry ent;
        public Ptr<PageDefinitions.page_pool> pool;
        public int pool_nid;
        public int new_nid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_page_pool_state_hold")
    @NotUsableInJava
    public static class trace_event_raw_page_pool_state_hold
    extends Struct {
        public trace_entry ent;
        public Ptr<PageDefinitions.page_pool> pool;
        public @Unsigned long netmem;
        public @Unsigned int hold;
        public @Unsigned long pfn;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_page_pool_state_release")
    @NotUsableInJava
    public static class trace_event_raw_page_pool_state_release
    extends Struct {
        public trace_entry ent;
        public Ptr<PageDefinitions.page_pool> pool;
        public @Unsigned long netmem;
        public @Unsigned int release;
        public @Unsigned long pfn;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_page_pool_release")
    @NotUsableInJava
    public static class trace_event_raw_page_pool_release
    extends Struct {
        public trace_entry ent;
        public Ptr<PageDefinitions.page_pool> pool;
        public int inflight;
        public @Unsigned int hold;
        public @Unsigned int release;
        public @Unsigned long cnt;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_br_mdb_full")
    @NotUsableInJava
    public static class trace_event_data_offsets_br_mdb_full
    extends Struct {
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_br_fdb_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_br_fdb_update
    extends Struct {
        public @Unsigned int br_dev;
        public Ptr<?> br_dev_ptr_;
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_fdb_delete")
    @NotUsableInJava
    public static class trace_event_data_offsets_fdb_delete
    extends Struct {
        public @Unsigned int br_dev;
        public Ptr<?> br_dev_ptr_;
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_br_fdb_external_learn_add")
    @NotUsableInJava
    public static class trace_event_data_offsets_br_fdb_external_learn_add
    extends Struct {
        public @Unsigned int br_dev;
        public Ptr<?> br_dev_ptr_;
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_br_fdb_add")
    @NotUsableInJava
    public static class trace_event_data_offsets_br_fdb_add
    extends Struct {
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_br_mdb_full")
    @NotUsableInJava
    public static class trace_event_raw_br_mdb_full
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_dev;
        public int af;
        public @Unsigned short vid;
        public char @Size(value=16) [] src;
        public char @Size(value=16) [] grp;
        public char @Size(value=6) [] grpmac;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_br_fdb_update")
    @NotUsableInJava
    public static class trace_event_raw_br_fdb_update
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_br_dev;
        public @Unsigned int __data_loc_dev;
        public char @Size(value=6) [] addr;
        public @Unsigned short vid;
        public @Unsigned long flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_fdb_delete")
    @NotUsableInJava
    public static class trace_event_raw_fdb_delete
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_br_dev;
        public @Unsigned int __data_loc_dev;
        public char @Size(value=6) [] addr;
        public @Unsigned short vid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_br_fdb_external_learn_add")
    @NotUsableInJava
    public static class trace_event_raw_br_fdb_external_learn_add
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_br_dev;
        public @Unsigned int __data_loc_dev;
        public char @Size(value=6) [] addr;
        public @Unsigned short vid;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_br_fdb_add")
    @NotUsableInJava
    public static class trace_event_raw_br_fdb_add
    extends Struct {
        public trace_entry ent;
        public char ndm_flags;
        public @Unsigned int __data_loc_dev;
        public char @Size(value=6) [] addr;
        public @Unsigned short vid;
        public @Unsigned short nlh_flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_qdisc_create")
    @NotUsableInJava
    public static class trace_event_data_offsets_qdisc_create
    extends Struct {
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
        public @Unsigned int kind;
        public Ptr<?> kind_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_qdisc_destroy")
    @NotUsableInJava
    public static class trace_event_data_offsets_qdisc_destroy
    extends Struct {
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
        public @Unsigned int kind;
        public Ptr<?> kind_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_qdisc_reset")
    @NotUsableInJava
    public static class trace_event_data_offsets_qdisc_reset
    extends Struct {
        public @Unsigned int dev;
        public Ptr<?> dev_ptr_;
        public @Unsigned int kind;
        public Ptr<?> kind_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_qdisc_enqueue")
    @NotUsableInJava
    public static class trace_event_data_offsets_qdisc_enqueue
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_qdisc_dequeue")
    @NotUsableInJava
    public static class trace_event_data_offsets_qdisc_dequeue
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_qdisc_create")
    @NotUsableInJava
    public static class trace_event_raw_qdisc_create
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_dev;
        public @Unsigned int __data_loc_kind;
        public @Unsigned int parent;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_qdisc_destroy")
    @NotUsableInJava
    public static class trace_event_raw_qdisc_destroy
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_dev;
        public @Unsigned int __data_loc_kind;
        public @Unsigned int parent;
        public @Unsigned int handle;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_qdisc_reset")
    @NotUsableInJava
    public static class trace_event_raw_qdisc_reset
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_dev;
        public @Unsigned int __data_loc_kind;
        public @Unsigned int parent;
        public @Unsigned int handle;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_qdisc_enqueue")
    @NotUsableInJava
    public static class trace_event_raw_qdisc_enqueue
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.Qdisc> qdisc;
        public Ptr<NetdevDefinitions.netdev_queue> txq;
        public Ptr<?> skbaddr;
        public int ifindex;
        public @Unsigned int handle;
        public @Unsigned int parent;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_qdisc_dequeue")
    @NotUsableInJava
    public static class trace_event_raw_qdisc_dequeue
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.Qdisc> qdisc;
        public Ptr<NetdevDefinitions.netdev_queue> txq;
        public int packets;
        public Ptr<?> skbaddr;
        public int ifindex;
        public @Unsigned int handle;
        public @Unsigned int parent;
        public @Unsigned long txq_state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_fib_table_lookup")
    @NotUsableInJava
    public static class trace_event_data_offsets_fib_table_lookup
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_fib_table_lookup")
    @NotUsableInJava
    public static class trace_event_raw_fib_table_lookup
    extends Struct {
        public trace_entry ent;
        public @Unsigned int tb_id;
        public int err;
        public int oif;
        public int iif;
        public char proto;
        public char tos;
        public char scope;
        public char flags;
        public char @Size(value=4) [] src;
        public char @Size(value=4) [] dst;
        public char @Size(value=4) [] gw4;
        public char @Size(value=16) [] gw6;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public char @Size(value=16) [] name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_ao_event_sne")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_ao_event_sne
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_ao_event_sk")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_ao_event_sk
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_ao_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_ao_event
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_hash_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_hash_event
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_cong_state_set")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_cong_state_set
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_event_skb")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_event_skb
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_probe")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_probe
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_retransmit_synack")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_retransmit_synack
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_event_sk")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_event_sk
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_send_reset")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_send_reset
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tcp_event_sk_skb")
    @NotUsableInJava
    public static class trace_event_data_offsets_tcp_event_sk_skb
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_ao_event_sne")
    @NotUsableInJava
    public static class trace_event_raw_tcp_ao_event_sne
    extends Struct {
        public trace_entry ent;
        public @Unsigned long net_cookie;
        public Ptr<?> skaddr;
        public int state;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public @Unsigned int new_sne;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_ao_event_sk")
    @NotUsableInJava
    public static class trace_event_raw_tcp_ao_event_sk
    extends Struct {
        public trace_entry ent;
        public @Unsigned long net_cookie;
        public Ptr<?> skaddr;
        public int state;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public char keyid;
        public char rnext;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_ao_event")
    @NotUsableInJava
    public static class trace_event_raw_tcp_ao_event
    extends Struct {
        public trace_entry ent;
        public @Unsigned long net_cookie;
        public Ptr<?> skbaddr;
        public Ptr<?> skaddr;
        public int state;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public int l3index;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public boolean fin;
        public boolean syn;
        public boolean rst;
        public boolean psh;
        public boolean ack;
        public char keyid;
        public char rnext;
        public char maclen;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_hash_event")
    @NotUsableInJava
    public static class trace_event_raw_tcp_hash_event
    extends Struct {
        public trace_entry ent;
        public @Unsigned long net_cookie;
        public Ptr<?> skbaddr;
        public Ptr<?> skaddr;
        public int state;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public int l3index;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public boolean fin;
        public boolean syn;
        public boolean rst;
        public boolean psh;
        public boolean ack;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_cong_state_set")
    @NotUsableInJava
    public static class trace_event_raw_tcp_cong_state_set
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skaddr;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public char @Size(value=4) [] saddr;
        public char @Size(value=4) [] daddr;
        public char @Size(value=16) [] saddr_v6;
        public char @Size(value=16) [] daddr_v6;
        public char cong_state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_event_skb")
    @NotUsableInJava
    public static class trace_event_raw_tcp_event_skb
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_probe")
    @NotUsableInJava
    public static class trace_event_raw_tcp_probe
    extends Struct {
        public trace_entry ent;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public @Unsigned int mark;
        public @Unsigned short data_len;
        public @Unsigned int snd_nxt;
        public @Unsigned int snd_una;
        public @Unsigned int snd_cwnd;
        public @Unsigned int ssthresh;
        public @Unsigned int snd_wnd;
        public @Unsigned int srtt;
        public @Unsigned int rcv_wnd;
        public @Unsigned long sock_cookie;
        public Ptr<?> skbaddr;
        public Ptr<?> skaddr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_retransmit_synack")
    @NotUsableInJava
    public static class trace_event_raw_tcp_retransmit_synack
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skaddr;
        public Ptr<?> req;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public char @Size(value=4) [] saddr;
        public char @Size(value=4) [] daddr;
        public char @Size(value=16) [] saddr_v6;
        public char @Size(value=16) [] daddr_v6;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_event_sk")
    @NotUsableInJava
    public static class trace_event_raw_tcp_event_sk
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skaddr;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public char @Size(value=4) [] saddr;
        public char @Size(value=4) [] daddr;
        public char @Size(value=16) [] saddr_v6;
        public char @Size(value=16) [] daddr_v6;
        public @Unsigned long sock_cookie;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_send_reset")
    @NotUsableInJava
    public static class trace_event_raw_tcp_send_reset
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public Ptr<?> skaddr;
        public int state;
        public SkDefinitions.sk_rst_reason reason;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tcp_event_sk_skb")
    @NotUsableInJava
    public static class trace_event_raw_tcp_event_sk_skb
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public Ptr<?> skaddr;
        public int state;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public char @Size(value=4) [] saddr;
        public char @Size(value=4) [] daddr;
        public char @Size(value=16) [] saddr_v6;
        public char @Size(value=16) [] daddr_v6;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_udp_fail_queue_rcv_skb")
    @NotUsableInJava
    public static class trace_event_data_offsets_udp_fail_queue_rcv_skb
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_udp_fail_queue_rcv_skb")
    @NotUsableInJava
    public static class trace_event_raw_udp_fail_queue_rcv_skb
    extends Struct {
        public trace_entry ent;
        public int rc;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public char @Size(value=28) [] saddr;
        public char @Size(value=28) [] daddr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sock_msg_length")
    @NotUsableInJava
    public static class trace_event_data_offsets_sock_msg_length
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sk_data_ready")
    @NotUsableInJava
    public static class trace_event_data_offsets_sk_data_ready
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_inet_sk_error_report")
    @NotUsableInJava
    public static class trace_event_data_offsets_inet_sk_error_report
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_inet_sock_set_state")
    @NotUsableInJava
    public static class trace_event_data_offsets_inet_sock_set_state
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sock_exceed_buf_limit")
    @NotUsableInJava
    public static class trace_event_data_offsets_sock_exceed_buf_limit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sock_rcvqueue_full")
    @NotUsableInJava
    public static class trace_event_data_offsets_sock_rcvqueue_full
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sock_msg_length")
    @NotUsableInJava
    public static class trace_event_raw_sock_msg_length
    extends Struct {
        public trace_entry ent;
        public Ptr<?> sk;
        public @Unsigned short family;
        public @Unsigned short protocol;
        public int ret;
        public int flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sk_data_ready")
    @NotUsableInJava
    public static class trace_event_raw_sk_data_ready
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skaddr;
        public @Unsigned short family;
        public @Unsigned short protocol;
        public @Unsigned long ip;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_inet_sk_error_report")
    @NotUsableInJava
    public static class trace_event_raw_inet_sk_error_report
    extends Struct {
        public trace_entry ent;
        public int error;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public @Unsigned short protocol;
        public char @Size(value=4) [] saddr;
        public char @Size(value=4) [] daddr;
        public char @Size(value=16) [] saddr_v6;
        public char @Size(value=16) [] daddr_v6;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_inet_sock_set_state")
    @NotUsableInJava
    public static class trace_event_raw_inet_sock_set_state
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skaddr;
        public int oldstate;
        public int newstate;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public @Unsigned short family;
        public @Unsigned short protocol;
        public char @Size(value=4) [] saddr;
        public char @Size(value=4) [] daddr;
        public char @Size(value=16) [] saddr_v6;
        public char @Size(value=16) [] daddr_v6;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sock_exceed_buf_limit")
    @NotUsableInJava
    public static class trace_event_raw_sock_exceed_buf_limit
    extends Struct {
        public trace_entry ent;
        public char @Size(value=32) [] name;
        public long @Size(value=3) [] sysctl_mem;
        public long allocated;
        public int sysctl_rmem;
        public int rmem_alloc;
        public int sysctl_wmem;
        public int wmem_alloc;
        public int wmem_queued;
        public int kind;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sock_rcvqueue_full")
    @NotUsableInJava
    public static class trace_event_raw_sock_rcvqueue_full
    extends Struct {
        public trace_entry ent;
        public int rmem_alloc;
        public @Unsigned int truesize;
        public int sk_rcvbuf;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dql_stall_detected")
    @NotUsableInJava
    public static class trace_event_data_offsets_dql_stall_detected
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_napi_poll")
    @NotUsableInJava
    public static class trace_event_data_offsets_napi_poll
    extends Struct {
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dql_stall_detected")
    @NotUsableInJava
    public static class trace_event_raw_dql_stall_detected
    extends Struct {
        public trace_entry ent;
        public @Unsigned short thrs;
        public @Unsigned int len;
        public @Unsigned long last_reap;
        public @Unsigned long hist_head;
        public @Unsigned long now;
        public @Unsigned long @Size(value=4) [] hist;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_napi_poll")
    @NotUsableInJava
    public static class trace_event_raw_napi_poll
    extends Struct {
        public trace_entry ent;
        public Ptr<NapiDefinitions.napi_struct> napi;
        public @Unsigned int __data_loc_dev_name;
        public int work;
        public int budget;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_net_dev_rx_exit_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_net_dev_rx_exit_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_net_dev_rx_verbose_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_net_dev_rx_verbose_template
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_net_dev_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_net_dev_template
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_net_dev_xmit_timeout")
    @NotUsableInJava
    public static class trace_event_data_offsets_net_dev_xmit_timeout
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
        public @Unsigned int driver;
        public Ptr<?> driver_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_net_dev_xmit")
    @NotUsableInJava
    public static class trace_event_data_offsets_net_dev_xmit
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_net_dev_start_xmit")
    @NotUsableInJava
    public static class trace_event_data_offsets_net_dev_start_xmit
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_net_dev_rx_exit_template")
    @NotUsableInJava
    public static class trace_event_raw_net_dev_rx_exit_template
    extends Struct {
        public trace_entry ent;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_net_dev_rx_verbose_template")
    @NotUsableInJava
    public static class trace_event_raw_net_dev_rx_verbose_template
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int napi_id;
        public @Unsigned short queue_mapping;
        public Ptr<?> skbaddr;
        public boolean vlan_tagged;
        public @Unsigned short vlan_proto;
        public @Unsigned short vlan_tci;
        public @Unsigned short protocol;
        public char ip_summed;
        public @Unsigned int hash;
        public boolean l4_hash;
        public @Unsigned int len;
        public @Unsigned int data_len;
        public @Unsigned int truesize;
        public boolean mac_header_valid;
        public int mac_header;
        public char nr_frags;
        public @Unsigned short gso_size;
        public @Unsigned short gso_type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_net_dev_template")
    @NotUsableInJava
    public static class trace_event_raw_net_dev_template
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public @Unsigned int len;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_net_dev_xmit_timeout")
    @NotUsableInJava
    public static class trace_event_raw_net_dev_xmit_timeout
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int __data_loc_driver;
        public int queue_index;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_net_dev_xmit")
    @NotUsableInJava
    public static class trace_event_raw_net_dev_xmit
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public @Unsigned int len;
        public int rc;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_net_dev_start_xmit")
    @NotUsableInJava
    public static class trace_event_raw_net_dev_start_xmit
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned short queue_mapping;
        public Ptr<?> skbaddr;
        public boolean vlan_tagged;
        public @Unsigned short vlan_proto;
        public @Unsigned short vlan_tci;
        public @Unsigned short protocol;
        public char ip_summed;
        public @Unsigned int len;
        public @Unsigned int data_len;
        public int network_offset;
        public boolean transport_offset_valid;
        public int transport_offset;
        public char tx_flags;
        public @Unsigned short gso_size;
        public @Unsigned short gso_segs;
        public @Unsigned short gso_type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_skb_copy_datagram_iovec")
    @NotUsableInJava
    public static class trace_event_data_offsets_skb_copy_datagram_iovec
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_consume_skb")
    @NotUsableInJava
    public static class trace_event_data_offsets_consume_skb
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_kfree_skb")
    @NotUsableInJava
    public static class trace_event_data_offsets_kfree_skb
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_skb_copy_datagram_iovec")
    @NotUsableInJava
    public static class trace_event_raw_skb_copy_datagram_iovec
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public int len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_consume_skb")
    @NotUsableInJava
    public static class trace_event_raw_consume_skb
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public Ptr<?> location;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_kfree_skb")
    @NotUsableInJava
    public static class trace_event_raw_kfree_skb
    extends Struct {
        public trace_entry ent;
        public Ptr<?> skbaddr;
        public Ptr<?> location;
        public Ptr<?> rx_sk;
        public @Unsigned short protocol;
        public SkbDefinitions.skb_drop_reason reason;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devfreq_monitor")
    @NotUsableInJava
    public static class trace_event_data_offsets_devfreq_monitor
    extends Struct {
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_devfreq_frequency")
    @NotUsableInJava
    public static class trace_event_data_offsets_devfreq_frequency
    extends Struct {
        public @Unsigned int dev_name;
        public Ptr<?> dev_name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devfreq_monitor")
    @NotUsableInJava
    public static class trace_event_raw_devfreq_monitor
    extends Struct {
        public trace_entry ent;
        public @Unsigned long freq;
        public @Unsigned long busy_time;
        public @Unsigned long total_time;
        public @Unsigned int polling_ms;
        public @Unsigned int __data_loc_dev_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_devfreq_frequency")
    @NotUsableInJava
    public static class trace_event_raw_devfreq_frequency
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_dev_name;
        public @Unsigned long freq;
        public @Unsigned long prev_freq;
        public @Unsigned long busy_time;
        public @Unsigned long total_time;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cros_ec_request_done")
    @NotUsableInJava
    public static class trace_event_data_offsets_cros_ec_request_done
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cros_ec_request_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_cros_ec_request_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cros_ec_request_done")
    @NotUsableInJava
    public static class trace_event_raw_cros_ec_request_done
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="uint32_t") int version;
        public @Unsigned @OriginalName(value="uint32_t") int offset;
        public @Unsigned @OriginalName(value="uint32_t") int command;
        public @Unsigned @OriginalName(value="uint32_t") int outsize;
        public @Unsigned @OriginalName(value="uint32_t") int insize;
        public @Unsigned @OriginalName(value="uint32_t") int result;
        public int retval;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cros_ec_request_start")
    @NotUsableInJava
    public static class trace_event_raw_cros_ec_request_start
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="uint32_t") int version;
        public @Unsigned @OriginalName(value="uint32_t") int offset;
        public @Unsigned @OriginalName(value="uint32_t") int command;
        public @Unsigned @OriginalName(value="uint32_t") int outsize;
        public @Unsigned @OriginalName(value="uint32_t") int insize;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_i2c_result")
    @NotUsableInJava
    public static class trace_event_data_offsets_i2c_result
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_i2c_reply")
    @NotUsableInJava
    public static class trace_event_data_offsets_i2c_reply
    extends Struct {
        public @Unsigned int buf;
        public Ptr<?> buf_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_i2c_read")
    @NotUsableInJava
    public static class trace_event_data_offsets_i2c_read
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_i2c_write")
    @NotUsableInJava
    public static class trace_event_data_offsets_i2c_write
    extends Struct {
        public @Unsigned int buf;
        public Ptr<?> buf_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_i2c_result")
    @NotUsableInJava
    public static class trace_event_raw_i2c_result
    extends Struct {
        public trace_entry ent;
        public int adapter_nr;
        public @Unsigned short nr_msgs;
        public short ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_i2c_reply")
    @NotUsableInJava
    public static class trace_event_raw_i2c_reply
    extends Struct {
        public trace_entry ent;
        public int adapter_nr;
        public @Unsigned short msg_nr;
        public @Unsigned short addr;
        public @Unsigned short flags;
        public @Unsigned short len;
        public @Unsigned int __data_loc_buf;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_i2c_read")
    @NotUsableInJava
    public static class trace_event_raw_i2c_read
    extends Struct {
        public trace_entry ent;
        public int adapter_nr;
        public @Unsigned short msg_nr;
        public @Unsigned short addr;
        public @Unsigned short flags;
        public @Unsigned short len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_i2c_write")
    @NotUsableInJava
    public static class trace_event_raw_i2c_write
    extends Struct {
        public trace_entry ent;
        public int adapter_nr;
        public @Unsigned short msg_nr;
        public @Unsigned short addr;
        public @Unsigned short flags;
        public @Unsigned short len;
        public @Unsigned int __data_loc_buf;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rtc_timer_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_rtc_timer_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rtc_offset_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_rtc_offset_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rtc_alarm_irq_enable")
    @NotUsableInJava
    public static class trace_event_data_offsets_rtc_alarm_irq_enable
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rtc_irq_set_state")
    @NotUsableInJava
    public static class trace_event_data_offsets_rtc_irq_set_state
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rtc_irq_set_freq")
    @NotUsableInJava
    public static class trace_event_data_offsets_rtc_irq_set_freq
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rtc_time_alarm_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_rtc_time_alarm_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rtc_timer_class")
    @NotUsableInJava
    public static class trace_event_raw_rtc_timer_class
    extends Struct {
        public trace_entry ent;
        public Ptr<RtcDefinitions.rtc_timer> timer;
        public @OriginalName(value="ktime_t") long expires;
        public @OriginalName(value="ktime_t") long period;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rtc_offset_class")
    @NotUsableInJava
    public static class trace_event_raw_rtc_offset_class
    extends Struct {
        public trace_entry ent;
        public long offset;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rtc_alarm_irq_enable")
    @NotUsableInJava
    public static class trace_event_raw_rtc_alarm_irq_enable
    extends Struct {
        public trace_entry ent;
        public @Unsigned int enabled;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rtc_irq_set_state")
    @NotUsableInJava
    public static class trace_event_raw_rtc_irq_set_state
    extends Struct {
        public trace_entry ent;
        public int enabled;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rtc_irq_set_freq")
    @NotUsableInJava
    public static class trace_event_raw_rtc_irq_set_freq
    extends Struct {
        public trace_entry ent;
        public int freq;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rtc_time_alarm_class")
    @NotUsableInJava
    public static class trace_event_raw_rtc_time_alarm_class
    extends Struct {
        public trace_entry ent;
        public @OriginalName(value="time64_t") long secs;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regulator_value")
    @NotUsableInJava
    public static class trace_event_data_offsets_regulator_value
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regulator_range")
    @NotUsableInJava
    public static class trace_event_data_offsets_regulator_range
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_regulator_basic")
    @NotUsableInJava
    public static class trace_event_data_offsets_regulator_basic
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regulator_value")
    @NotUsableInJava
    public static class trace_event_raw_regulator_value
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned int val;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regulator_range")
    @NotUsableInJava
    public static class trace_event_raw_regulator_range
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public int min;
        public int max;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_regulator_basic")
    @NotUsableInJava
    public static class trace_event_raw_regulator_basic
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_fuse_request_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_fuse_request_end
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_fuse_request_send")
    @NotUsableInJava
    public static class trace_event_data_offsets_fuse_request_send
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_fuse_request_end")
    @NotUsableInJava
    public static class trace_event_raw_fuse_request_end
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int connection;
        public @Unsigned @OriginalName(value="uint64_t") long unique;
        public @Unsigned @OriginalName(value="uint32_t") int len;
        public @OriginalName(value="int32_t") int error;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_fuse_request_send")
    @NotUsableInJava
    public static class trace_event_raw_fuse_request_send
    extends Struct {
        public trace_entry ent;
        public @Unsigned @OriginalName(value="dev_t") int connection;
        public @Unsigned @OriginalName(value="uint64_t") long unique;
        public FuseDefinitions.fuse_opcode opcode;
        public @Unsigned @OriginalName(value="uint32_t") int len;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_leases_conflict")
    @NotUsableInJava
    public static class trace_event_data_offsets_leases_conflict
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_generic_add_lease")
    @NotUsableInJava
    public static class trace_event_data_offsets_generic_add_lease
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_filelock_lease")
    @NotUsableInJava
    public static class trace_event_data_offsets_filelock_lease
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_filelock_lock")
    @NotUsableInJava
    public static class trace_event_data_offsets_filelock_lock
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_locks_get_lock_context")
    @NotUsableInJava
    public static class trace_event_data_offsets_locks_get_lock_context
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_leases_conflict")
    @NotUsableInJava
    public static class trace_event_raw_leases_conflict
    extends Struct {
        public trace_entry ent;
        public Ptr<?> lease;
        public Ptr<?> breaker;
        public @Unsigned int l_fl_flags;
        public @Unsigned int b_fl_flags;
        public char l_fl_type;
        public char b_fl_type;
        public boolean conflict;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_generic_add_lease")
    @NotUsableInJava
    public static class trace_event_raw_generic_add_lease
    extends Struct {
        public trace_entry ent;
        public @Unsigned long i_ino;
        public int wcount;
        public int rcount;
        public int icount;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public @OriginalName(value="fl_owner_t") Ptr<?> owner;
        public @Unsigned int flags;
        public char type;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_filelock_lease")
    @NotUsableInJava
    public static class trace_event_raw_filelock_lease
    extends Struct {
        public trace_entry ent;
        public Ptr<FileDefinitions.file_lease> fl;
        public @Unsigned long i_ino;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public Ptr<FileDefinitions.file_lock_core> blocker;
        public @OriginalName(value="fl_owner_t") Ptr<?> owner;
        public @Unsigned int flags;
        public char type;
        public @Unsigned long break_time;
        public @Unsigned long downgrade_time;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_filelock_lock")
    @NotUsableInJava
    public static class trace_event_raw_filelock_lock
    extends Struct {
        public trace_entry ent;
        public Ptr<FileDefinitions.file_lock> fl;
        public @Unsigned long i_ino;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public Ptr<FileDefinitions.file_lock_core> blocker;
        public @OriginalName(value="fl_owner_t") Ptr<?> owner;
        public @Unsigned int pid;
        public @Unsigned int flags;
        public char type;
        public @OriginalName(value="loff_t") long fl_start;
        public @OriginalName(value="loff_t") long fl_end;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_locks_get_lock_context")
    @NotUsableInJava
    public static class trace_event_raw_locks_get_lock_context
    extends Struct {
        public trace_entry ent;
        public @Unsigned long i_ino;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public char type;
        public Ptr<FileDefinitions.file_lock_context> ctx;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dax_writeback_one")
    @NotUsableInJava
    public static class trace_event_data_offsets_dax_writeback_one
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dax_writeback_range_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_dax_writeback_range_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dax_insert_mapping")
    @NotUsableInJava
    public static class trace_event_data_offsets_dax_insert_mapping
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dax_pte_fault_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_dax_pte_fault_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dax_pmd_insert_mapping_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_dax_pmd_insert_mapping_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dax_pmd_load_hole_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_dax_pmd_load_hole_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dax_pmd_fault_class")
    @NotUsableInJava
    public static class trace_event_data_offsets_dax_pmd_fault_class
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dax_writeback_one")
    @NotUsableInJava
    public static class trace_event_raw_dax_writeback_one
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ino;
        public @Unsigned long pgoff;
        public @Unsigned long pglen;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dax_writeback_range_class")
    @NotUsableInJava
    public static class trace_event_raw_dax_writeback_range_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ino;
        public @Unsigned long start_index;
        public @Unsigned long end_index;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dax_insert_mapping")
    @NotUsableInJava
    public static class trace_event_raw_dax_insert_mapping
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ino;
        public @Unsigned long vm_flags;
        public @Unsigned long address;
        public Ptr<?> radix_entry;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int write;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dax_pte_fault_class")
    @NotUsableInJava
    public static class trace_event_raw_dax_pte_fault_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ino;
        public @Unsigned long vm_flags;
        public @Unsigned long address;
        public @Unsigned long pgoff;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int flags;
        public int result;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dax_pmd_insert_mapping_class")
    @NotUsableInJava
    public static class trace_event_raw_dax_pmd_insert_mapping_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ino;
        public @Unsigned long vm_flags;
        public @Unsigned long address;
        public long length;
        public @Unsigned long pfn_val;
        public Ptr<?> radix_entry;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public int write;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dax_pmd_load_hole_class")
    @NotUsableInJava
    public static class trace_event_raw_dax_pmd_load_hole_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ino;
        public @Unsigned long vm_flags;
        public @Unsigned long address;
        public Ptr<runtime.folio> zero_folio;
        public Ptr<?> radix_entry;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dax_pmd_fault_class")
    @NotUsableInJava
    public static class trace_event_raw_dax_pmd_fault_class
    extends Struct {
        public trace_entry ent;
        public @Unsigned long ino;
        public @Unsigned long vm_start;
        public @Unsigned long vm_end;
        public @Unsigned long vm_flags;
        public @Unsigned long address;
        public @Unsigned long pgoff;
        public @Unsigned long max_pgoff;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned int flags;
        public int result;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_test_pages_isolated")
    @NotUsableInJava
    public static class trace_event_data_offsets_test_pages_isolated
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_test_pages_isolated")
    @NotUsableInJava
    public static class trace_event_raw_test_pages_isolated
    extends Struct {
        public trace_entry ent;
        public @Unsigned long start_pfn;
        public @Unsigned long end_pfn;
        public @Unsigned long fin_pfn;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_migration_pmd")
    @NotUsableInJava
    public static class trace_event_data_offsets_migration_pmd
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hugepage_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_hugepage_update
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_hugepage_set")
    @NotUsableInJava
    public static class trace_event_data_offsets_hugepage_set
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_migration_pmd")
    @NotUsableInJava
    public static class trace_event_raw_migration_pmd
    extends Struct {
        public trace_entry ent;
        public @Unsigned long addr;
        public @Unsigned long pmd;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hugepage_update")
    @NotUsableInJava
    public static class trace_event_raw_hugepage_update
    extends Struct {
        public trace_entry ent;
        public @Unsigned long addr;
        public @Unsigned long pte;
        public @Unsigned long clr;
        public @Unsigned long set;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_hugepage_set")
    @NotUsableInJava
    public static class trace_event_raw_hugepage_set
    extends Struct {
        public trace_entry ent;
        public @Unsigned long addr;
        public @Unsigned long pte;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ksm_advisor")
    @NotUsableInJava
    public static class trace_event_data_offsets_ksm_advisor
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ksm_remove_rmap_item")
    @NotUsableInJava
    public static class trace_event_data_offsets_ksm_remove_rmap_item
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ksm_remove_ksm_page")
    @NotUsableInJava
    public static class trace_event_data_offsets_ksm_remove_ksm_page
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ksm_merge_with_ksm_page")
    @NotUsableInJava
    public static class trace_event_data_offsets_ksm_merge_with_ksm_page
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ksm_merge_one_page")
    @NotUsableInJava
    public static class trace_event_data_offsets_ksm_merge_one_page
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ksm_enter_exit_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ksm_enter_exit_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_ksm_scan_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_ksm_scan_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ksm_advisor")
    @NotUsableInJava
    public static class trace_event_raw_ksm_advisor
    extends Struct {
        public trace_entry ent;
        public long scan_time;
        public @Unsigned long pages_to_scan;
        public @Unsigned int cpu_percent;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ksm_remove_rmap_item")
    @NotUsableInJava
    public static class trace_event_raw_ksm_remove_rmap_item
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public Ptr<?> rmap_item;
        public Ptr<?> mm;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ksm_remove_ksm_page")
    @NotUsableInJava
    public static class trace_event_raw_ksm_remove_ksm_page
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ksm_merge_with_ksm_page")
    @NotUsableInJava
    public static class trace_event_raw_ksm_merge_with_ksm_page
    extends Struct {
        public trace_entry ent;
        public Ptr<?> ksm_page;
        public @Unsigned long pfn;
        public Ptr<?> rmap_item;
        public Ptr<?> mm;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ksm_merge_one_page")
    @NotUsableInJava
    public static class trace_event_raw_ksm_merge_one_page
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public Ptr<?> rmap_item;
        public Ptr<?> mm;
        public int err;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ksm_enter_exit_template")
    @NotUsableInJava
    public static class trace_event_raw_ksm_enter_exit_template
    extends Struct {
        public trace_entry ent;
        public Ptr<?> mm;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_ksm_scan_template")
    @NotUsableInJava
    public static class trace_event_raw_ksm_scan_template
    extends Struct {
        public trace_entry ent;
        public int seq;
        public @Unsigned int rmap_entries;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rss_stat")
    @NotUsableInJava
    public static class trace_event_data_offsets_rss_stat
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_alloc_contig_migrate_range_info")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_alloc_contig_migrate_range_info
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_page_alloc_extfrag")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_page_alloc_extfrag
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_page_pcpu_drain")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_page_pcpu_drain
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_page")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_page
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_page_alloc")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_page_alloc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_page_free_batched")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_page_free_batched
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_page_free")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_page_free
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_kmem_cache_free")
    @NotUsableInJava
    public static class trace_event_data_offsets_kmem_cache_free
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_kfree")
    @NotUsableInJava
    public static class trace_event_data_offsets_kfree
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_kmalloc")
    @NotUsableInJava
    public static class trace_event_data_offsets_kmalloc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_kmem_cache_alloc")
    @NotUsableInJava
    public static class trace_event_data_offsets_kmem_cache_alloc
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rss_stat")
    @NotUsableInJava
    public static class trace_event_raw_rss_stat
    extends Struct {
        public trace_entry ent;
        public @Unsigned int mm_id;
        public @Unsigned int curr;
        public int member;
        public long size;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_alloc_contig_migrate_range_info")
    @NotUsableInJava
    public static class trace_event_raw_mm_alloc_contig_migrate_range_info
    extends Struct {
        public trace_entry ent;
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long nr_migrated;
        public @Unsigned long nr_reclaimed;
        public @Unsigned long nr_mapped;
        public int migratetype;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_page_alloc_extfrag")
    @NotUsableInJava
    public static class trace_event_raw_mm_page_alloc_extfrag
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public int alloc_order;
        public int fallback_order;
        public int alloc_migratetype;
        public int fallback_migratetype;
        public int change_ownership;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_page_pcpu_drain")
    @NotUsableInJava
    public static class trace_event_raw_mm_page_pcpu_drain
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public @Unsigned int order;
        public int migratetype;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_page")
    @NotUsableInJava
    public static class trace_event_raw_mm_page
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public @Unsigned int order;
        public int migratetype;
        public int percpu_refill;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_page_alloc")
    @NotUsableInJava
    public static class trace_event_raw_mm_page_alloc
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public @Unsigned int order;
        public @Unsigned long gfp_flags;
        public int migratetype;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_page_free_batched")
    @NotUsableInJava
    public static class trace_event_raw_mm_page_free_batched
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_page_free")
    @NotUsableInJava
    public static class trace_event_raw_mm_page_free
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public @Unsigned int order;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_kmem_cache_free")
    @NotUsableInJava
    public static class trace_event_raw_kmem_cache_free
    extends Struct {
        public trace_entry ent;
        public @Unsigned long call_site;
        public Ptr<?> ptr;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_kfree")
    @NotUsableInJava
    public static class trace_event_raw_kfree
    extends Struct {
        public trace_entry ent;
        public @Unsigned long call_site;
        public Ptr<?> ptr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_kmalloc")
    @NotUsableInJava
    public static class trace_event_raw_kmalloc
    extends Struct {
        public trace_entry ent;
        public @Unsigned long call_site;
        public Ptr<?> ptr;
        public @Unsigned long bytes_req;
        public @Unsigned long bytes_alloc;
        public @Unsigned long gfp_flags;
        public int node;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_kmem_cache_alloc")
    @NotUsableInJava
    public static class trace_event_raw_kmem_cache_alloc
    extends Struct {
        public trace_entry ent;
        public @Unsigned long call_site;
        public Ptr<?> ptr;
        public @Unsigned long bytes_req;
        public @Unsigned long bytes_alloc;
        public @Unsigned long gfp_flags;
        public int node;
        public boolean accounted;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_lru_activate")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_lru_activate
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_lru_insertion")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_lru_insertion
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_lru_activate")
    @NotUsableInJava
    public static class trace_event_raw_mm_lru_activate
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.folio> folio;
        public @Unsigned long pfn;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_lru_insertion")
    @NotUsableInJava
    public static class trace_event_raw_mm_lru_insertion
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.folio> folio;
        public @Unsigned long pfn;
        public LruDefinitions.lru_list lru;
        public @Unsigned long flags;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_file_check_and_advance_wb_err")
    @NotUsableInJava
    public static class trace_event_data_offsets_file_check_and_advance_wb_err
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_filemap_set_wb_err")
    @NotUsableInJava
    public static class trace_event_data_offsets_filemap_set_wb_err
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_filemap_fault")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_filemap_fault
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_filemap_op_page_cache_range")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_filemap_op_page_cache_range
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_mm_filemap_op_page_cache")
    @NotUsableInJava
    public static class trace_event_data_offsets_mm_filemap_op_page_cache
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_file_check_and_advance_wb_err")
    @NotUsableInJava
    public static class trace_event_raw_file_check_and_advance_wb_err
    extends Struct {
        public trace_entry ent;
        public Ptr<runtime.file> file;
        public @Unsigned long i_ino;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public @Unsigned @OriginalName(value="errseq_t") int old;
        public @Unsigned @OriginalName(value="errseq_t") int _new;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_filemap_set_wb_err")
    @NotUsableInJava
    public static class trace_event_raw_filemap_set_wb_err
    extends Struct {
        public trace_entry ent;
        public @Unsigned long i_ino;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public @Unsigned @OriginalName(value="errseq_t") int errseq;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_filemap_fault")
    @NotUsableInJava
    public static class trace_event_raw_mm_filemap_fault
    extends Struct {
        public trace_entry ent;
        public @Unsigned long i_ino;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public @Unsigned long index;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_filemap_op_page_cache_range")
    @NotUsableInJava
    public static class trace_event_raw_mm_filemap_op_page_cache_range
    extends Struct {
        public trace_entry ent;
        public @Unsigned long i_ino;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public @Unsigned long index;
        public @Unsigned long last_index;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_mm_filemap_op_page_cache")
    @NotUsableInJava
    public static class trace_event_raw_mm_filemap_op_page_cache
    extends Struct {
        public trace_entry ent;
        public @Unsigned long pfn;
        public @Unsigned long i_ino;
        public @Unsigned long index;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public char order;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_error_da_monitor_id")
    @NotUsableInJava
    public static class trace_event_data_offsets_error_da_monitor_id
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_event_da_monitor_id")
    @NotUsableInJava
    public static class trace_event_data_offsets_event_da_monitor_id
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_error_da_monitor_id")
    @NotUsableInJava
    public static class trace_event_raw_error_da_monitor_id
    extends Struct {
        public trace_entry ent;
        public int id;
        public char @Size(value=24) [] state;
        public char @Size(value=24) [] event;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_event_da_monitor_id")
    @NotUsableInJava
    public static class trace_event_raw_event_da_monitor_id
    extends Struct {
        public trace_entry ent;
        public int id;
        public char @Size(value=24) [] state;
        public char @Size(value=24) [] event;
        public char @Size(value=24) [] next_state;
        public boolean final_state;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_probe_log")
    @NotUsableInJava
    public static class trace_probe_log
    extends Struct {
        public String subsystem;
        public Ptr<String> argv;
        public int argc;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_probe")
    @NotUsableInJava
    public static class trace_probe
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<trace_probe_event> event;
        public @OriginalName(value="ssize_t") long size;
        public @Unsigned int nr_args;
        public Ptr<ProbeDefinitions.probe_entry_arg> entry_arg;
        public ProbeDefinitions.probe_arg @Size(value=0) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_probe_event")
    @NotUsableInJava
    public static class trace_probe_event
    extends Struct {
        public @Unsigned int flags;
        public trace_event_class _class;
        public trace_event_call call;
        public ListDefinitions.list_head files;
        public ListDefinitions.list_head probes;
        public trace_uprobe_filter @Size(value=0) [] filter;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_uprobe_filter")
    @NotUsableInJava
    public static class trace_uprobe_filter
    extends Struct {
        public misc.rwlock_t rwlock;
        public int nr_systemwide;
        public ListDefinitions.list_head perf_events;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rpm_status")
    @NotUsableInJava
    public static class trace_event_data_offsets_rpm_status
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rpm_return_int")
    @NotUsableInJava
    public static class trace_event_data_offsets_rpm_return_int
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_rpm_internal")
    @NotUsableInJava
    public static class trace_event_data_offsets_rpm_internal
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rpm_status")
    @NotUsableInJava
    public static class trace_event_raw_rpm_status
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public int status;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rpm_return_int")
    @NotUsableInJava
    public static class trace_event_raw_rpm_return_int
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public @Unsigned long ip;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_rpm_internal")
    @NotUsableInJava
    public static class trace_event_raw_rpm_internal
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_name;
        public int flags;
        public int usage_count;
        public int disable_depth;
        public int runtime_auto;
        public int request_pending;
        public int irq_safe;
        public int child_count;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_error_report_template")
    @NotUsableInJava
    public static class trace_event_data_offsets_error_report_template
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_error_report_template")
    @NotUsableInJava
    public static class trace_event_raw_error_report_template
    extends Struct {
        public trace_entry ent;
        public misc.error_detector error_detector;
        public @Unsigned long id;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="enum trace_iterator_flags")
    public static enum trace_iterator_flags implements Enum<trace_iterator_flags>,
    TypedEnum<trace_iterator_flags, Integer>
    {
        TRACE_ITER_PRINT_PARENT,
        TRACE_ITER_SYM_OFFSET,
        TRACE_ITER_SYM_ADDR,
        TRACE_ITER_VERBOSE,
        TRACE_ITER_RAW,
        TRACE_ITER_HEX,
        TRACE_ITER_BIN,
        TRACE_ITER_BLOCK,
        TRACE_ITER_FIELDS,
        TRACE_ITER_PRINTK,
        TRACE_ITER_ANNOTATE,
        TRACE_ITER_USERSTACKTRACE,
        TRACE_ITER_SYM_USEROBJ,
        TRACE_ITER_PRINTK_MSGONLY,
        TRACE_ITER_CONTEXT_INFO,
        TRACE_ITER_LATENCY_FMT,
        TRACE_ITER_RECORD_CMD,
        TRACE_ITER_RECORD_TGID,
        TRACE_ITER_OVERWRITE,
        TRACE_ITER_STOP_ON_FREE,
        TRACE_ITER_IRQ_INFO,
        TRACE_ITER_MARKERS,
        TRACE_ITER_EVENT_FORK,
        TRACE_ITER_TRACE_PRINTK,
        TRACE_ITER_PAUSE_ON_TRACE,
        TRACE_ITER_HASH_PTR,
        TRACE_ITER_FUNCTION,
        TRACE_ITER_FUNC_FORK,
        TRACE_ITER_DISPLAY_GRAPH,
        TRACE_ITER_STACKTRACE;

    }

    @Type(noCCodeGeneration=true, cType="struct trace_parser")
    @NotUsableInJava
    public static class trace_parser
    extends Struct {
        public boolean cont;
        public String buffer;
        public @Unsigned int idx;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_mmiotrace_map")
    @NotUsableInJava
    public static class trace_mmiotrace_map
    extends Struct {
        public trace_entry ent;
        public misc.mmiotrace_map map;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_mmiotrace_rw")
    @NotUsableInJava
    public static class trace_mmiotrace_rw
    extends Struct {
        public trace_entry ent;
        public misc.mmiotrace_rw rw;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_min_max_param")
    @NotUsableInJava
    public static class trace_min_max_param
    extends Struct {
        public Ptr<runtime.mutex> lock;
        public Ptr<@Unsigned Long> val;
        public Ptr<@Unsigned Long> min;
        public Ptr<@Unsigned Long> max;
    }

    @Type(noCCodeGeneration=true, cType="enum trace_type")
    public static enum trace_type implements Enum<trace_type>,
    TypedEnum<trace_type, Integer>
    {
        __TRACE_FIRST_TYPE,
        TRACE_FN,
        TRACE_CTX,
        TRACE_WAKE,
        TRACE_STACK,
        TRACE_PRINT,
        TRACE_BPRINT,
        TRACE_MMIO_RW,
        TRACE_MMIO_MAP,
        TRACE_BRANCH,
        TRACE_GRAPH_RET,
        TRACE_GRAPH_ENT,
        TRACE_USER_STACK,
        TRACE_BLK,
        TRACE_BPUTS,
        TRACE_HWLAT,
        TRACE_OSNOISE,
        TRACE_TIMERLAT,
        TRACE_RAW_DATA,
        TRACE_FUNC_REPEATS,
        __TRACE_LAST_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum trace_flag_type")
    public static enum trace_flag_type implements Enum<trace_flag_type>,
    TypedEnum<trace_flag_type, Integer>
    {
        TRACE_FLAG_IRQS_OFF,
        TRACE_FLAG_IRQS_NOSUPPORT,
        TRACE_FLAG_NEED_RESCHED,
        TRACE_FLAG_HARDIRQ,
        TRACE_FLAG_SOFTIRQ,
        TRACE_FLAG_PREEMPT_RESCHED,
        TRACE_FLAG_NMI,
        TRACE_FLAG_BH_OFF;

    }

    @Type(noCCodeGeneration=true, cType="enum trace_iterator_bits")
    public static enum trace_iterator_bits implements Enum<trace_iterator_bits>,
    TypedEnum<trace_iterator_bits, Integer>
    {
        TRACE_ITER_PRINT_PARENT_BIT,
        TRACE_ITER_SYM_OFFSET_BIT,
        TRACE_ITER_SYM_ADDR_BIT,
        TRACE_ITER_VERBOSE_BIT,
        TRACE_ITER_RAW_BIT,
        TRACE_ITER_HEX_BIT,
        TRACE_ITER_BIN_BIT,
        TRACE_ITER_BLOCK_BIT,
        TRACE_ITER_FIELDS_BIT,
        TRACE_ITER_PRINTK_BIT,
        TRACE_ITER_ANNOTATE_BIT,
        TRACE_ITER_USERSTACKTRACE_BIT,
        TRACE_ITER_SYM_USEROBJ_BIT,
        TRACE_ITER_PRINTK_MSGONLY_BIT,
        TRACE_ITER_CONTEXT_INFO_BIT,
        TRACE_ITER_LATENCY_FMT_BIT,
        TRACE_ITER_RECORD_CMD_BIT,
        TRACE_ITER_RECORD_TGID_BIT,
        TRACE_ITER_OVERWRITE_BIT,
        TRACE_ITER_STOP_ON_FREE_BIT,
        TRACE_ITER_IRQ_INFO_BIT,
        TRACE_ITER_MARKERS_BIT,
        TRACE_ITER_EVENT_FORK_BIT,
        TRACE_ITER_TRACE_PRINTK_BIT,
        TRACE_ITER_PAUSE_ON_TRACE_BIT,
        TRACE_ITER_HASH_PTR_BIT,
        TRACE_ITER_FUNCTION_BIT,
        TRACE_ITER_FUNC_FORK_BIT,
        TRACE_ITER_DISPLAY_GRAPH_BIT,
        TRACE_ITER_STACKTRACE_BIT,
        TRACE_ITER_LAST_BIT;

    }

    @Type(noCCodeGeneration=true, cType="struct trace_func_repeats")
    @NotUsableInJava
    public static class trace_func_repeats
    extends Struct {
        public @Unsigned long ip;
        public @Unsigned long parent_ip;
        public @Unsigned long count;
        public @Unsigned long ts_last_call;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_option_dentry")
    @NotUsableInJava
    public static class trace_option_dentry
    extends Struct {
        public Ptr<misc.tracer_opt> opt;
        public Ptr<misc.tracer_flags> flags;
        public Ptr<trace_array> tr;
        public Ptr<runtime.dentry> entry;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_options")
    @NotUsableInJava
    public static class trace_options
    extends Struct {
        public Ptr<runtime.tracer> tracer;
        public Ptr<trace_option_dentry> topts;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_array_cpu")
    @NotUsableInJava
    public static class trace_array_cpu
    extends Struct {
        public AtomicDefinitions.atomic_t disabled;
        public Ptr<?> buffer_page;
        public @Unsigned long entries;
        public @Unsigned long saved_latency;
        public @Unsigned long critical_start;
        public @Unsigned long critical_end;
        public @Unsigned long critical_sequence;
        public @Unsigned long nice;
        public @Unsigned long policy;
        public @Unsigned long rt_priority;
        public @Unsigned long skipped_entries;
        public @Unsigned long preempt_timestamp;
        public @OriginalName(value="pid_t") int pid;
        public misc.kuid_t uid;
        public char @Size(value=16) [] comm;
        public int ftrace_ignore_pid;
        public boolean ignore_pid;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_pid_list")
    @NotUsableInJava
    public static class trace_pid_list
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public IrqDefinitions.irq_work refill_irqwork;
        public Ptr<misc.upper_chunk> @Size(value=256) [] upper;
        public Ptr<misc.upper_chunk> upper_list;
        public Ptr<misc.lower_chunk> lower_list;
        public int free_upper_chunks;
        public int free_lower_chunks;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_subsystem_dir")
    @NotUsableInJava
    public static class trace_subsystem_dir
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<EventDefinitions.event_subsystem> subsystem;
        public Ptr<trace_array> tr;
        public Ptr<EventfsDefinitions.eventfs_inode> ei;
        public int ref_count;
        public int nr_events;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_buffer")
    @NotUsableInJava
    public static class trace_buffer
    extends Struct {
        public @Unsigned int flags;
        public int cpus;
        public AtomicDefinitions.atomic_t record_disabled;
        public AtomicDefinitions.atomic_t resizing;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpumask;
        public Ptr<LockDefinitions.lock_class_key> reader_lock_key;
        public runtime.mutex mutex;
        public Ptr<Ptr<RingDefinitions.ring_buffer_per_cpu>> buffers;
        public misc.hlist_node node;
        public Ptr<?> clock;
        public RbDefinitions.rb_irq_work irq_work;
        public boolean time_stamp_abs;
        public @Unsigned long range_addr_start;
        public @Unsigned long range_addr_end;
        public long last_text_delta;
        public long last_data_delta;
        public @Unsigned int subbuf_size;
        public @Unsigned int subbuf_order;
        public @Unsigned int max_data_size;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_array")
    @NotUsableInJava
    public static class trace_array
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public ArrayDefinitions.array_buffer array_buffer;
        public ArrayDefinitions.array_buffer max_buffer;
        public boolean allocated_snapshot;
        public  @OriginalName(value="spinlock_t") runtime.spinlock snapshot_trigger_lock;
        public @Unsigned int snapshot;
        public @Unsigned long max_latency;
        public Ptr<runtime.dentry> d_max_latency;
        public misc.work_struct fsnotify_work;
        public IrqDefinitions.irq_work fsnotify_irqwork;
        public @Unsigned int mapped;
        public @Unsigned long range_addr_start;
        public @Unsigned long range_addr_size;
        public long text_delta;
        public long data_delta;
        public Ptr<trace_pid_list> filtered_pids;
        public Ptr<trace_pid_list> filtered_no_pids;
        public  @OriginalName(value="arch_spinlock_t") runtime.qspinlock max_lock;
        public int buffer_disabled;
        public int sys_refcount_enter;
        public int sys_refcount_exit;
        public Ptr<trace_event_file> @Size(value=463) [] enter_syscall_files;
        public Ptr<trace_event_file> @Size(value=463) [] exit_syscall_files;
        public int stop_count;
        public int clock_id;
        public int nr_topts;
        public boolean clear_trace;
        public int buffer_percent;
        public @Unsigned int n_err_log_entries;
        public Ptr<runtime.tracer> current_trace;
        public @Unsigned int trace_flags;
        public char @Size(value=32) [] trace_flags_index;
        public @Unsigned int flags;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock start_lock;
        public String system_names;
        public ListDefinitions.list_head err_log;
        public Ptr<runtime.dentry> dir;
        public Ptr<runtime.dentry> options;
        public Ptr<runtime.dentry> percpu_dir;
        public Ptr<EventfsDefinitions.eventfs_inode> event_dir;
        public Ptr<trace_options> topts;
        public ListDefinitions.list_head systems;
        public ListDefinitions.list_head events;
        public Ptr<trace_event_file> trace_marker_file;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> tracing_cpumask;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> pipe_cpumask;
        public int ref;
        public int trace_ref;
        public Ptr<FtraceDefinitions.ftrace_ops> ops;
        public Ptr<trace_pid_list> function_pids;
        public Ptr<trace_pid_list> function_no_pids;
        public Ptr<FgraphDefinitions.fgraph_ops> gops;
        public ListDefinitions.list_head func_probes;
        public ListDefinitions.list_head mod_trace;
        public ListDefinitions.list_head mod_notrace;
        public int function_enabled;
        public int no_filter_buffering_ref;
        public ListDefinitions.list_head hist_vars;
        public Ptr<CondDefinitions.cond_snapshot> cond_snapshot;
        public Ptr<trace_func_repeats> last_func_repeats;
        public boolean ring_buffer_expanded;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_buffer_meta")
    @NotUsableInJava
    public static class trace_buffer_meta
    extends Struct {
        public @Unsigned int meta_page_size;
        public @Unsigned int meta_struct_len;
        public @Unsigned int subbuf_size;
        public @Unsigned int nr_subbufs;
        public misc.reader_of_trace_buffer_meta reader;
        public @Unsigned long flags;
        public @Unsigned long entries;
        public @Unsigned long overrun;
        public @Unsigned long read;
        public @Unsigned long Reserved1;
        public @Unsigned long Reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cgroup_rstat")
    @NotUsableInJava
    public static class trace_event_data_offsets_cgroup_rstat
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cgroup_event")
    @NotUsableInJava
    public static class trace_event_data_offsets_cgroup_event
    extends Struct {
        public @Unsigned int path;
        public Ptr<?> path_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cgroup_migrate")
    @NotUsableInJava
    public static class trace_event_data_offsets_cgroup_migrate
    extends Struct {
        public @Unsigned int dst_path;
        public Ptr<?> dst_path_ptr_;
        public @Unsigned int comm;
        public Ptr<?> comm_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cgroup")
    @NotUsableInJava
    public static class trace_event_data_offsets_cgroup
    extends Struct {
        public @Unsigned int path;
        public Ptr<?> path_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_cgroup_root")
    @NotUsableInJava
    public static class trace_event_data_offsets_cgroup_root
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cgroup_rstat")
    @NotUsableInJava
    public static class trace_event_raw_cgroup_rstat
    extends Struct {
        public trace_entry ent;
        public int root;
        public int level;
        public @Unsigned long id;
        public int cpu;
        public boolean contended;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cgroup_event")
    @NotUsableInJava
    public static class trace_event_raw_cgroup_event
    extends Struct {
        public trace_entry ent;
        public int root;
        public int level;
        public @Unsigned long id;
        public @Unsigned int __data_loc_path;
        public int val;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cgroup_migrate")
    @NotUsableInJava
    public static class trace_event_raw_cgroup_migrate
    extends Struct {
        public trace_entry ent;
        public int dst_root;
        public int dst_level;
        public @Unsigned long dst_id;
        public int pid;
        public @Unsigned int __data_loc_dst_path;
        public @Unsigned int __data_loc_comm;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cgroup")
    @NotUsableInJava
    public static class trace_event_raw_cgroup
    extends Struct {
        public trace_entry ent;
        public int root;
        public int level;
        public @Unsigned long id;
        public @Unsigned int __data_loc_path;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_cgroup_root")
    @NotUsableInJava
    public static class trace_event_raw_cgroup_root
    extends Struct {
        public trace_entry ent;
        public int root;
        public @Unsigned short ss_mask;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sys_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_sys_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sys_enter")
    @NotUsableInJava
    public static class trace_event_data_offsets_sys_enter
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sys_exit")
    @NotUsableInJava
    public static class trace_event_raw_sys_exit
    extends Struct {
        public trace_entry ent;
        public long id;
        public long ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sys_enter")
    @NotUsableInJava
    public static class trace_event_raw_sys_enter
    extends Struct {
        public trace_entry ent;
        public long id;
        public @Unsigned long @Size(value=6) [] args;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_sync_sg")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_sync_sg
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
        public @Unsigned int dma_addrs;
        public Ptr<?> dma_addrs_ptr_;
        public @Unsigned int lengths;
        public Ptr<?> lengths_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_sync_single")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_sync_single
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_unmap_sg")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_unmap_sg
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
        public @Unsigned int addrs;
        public Ptr<?> addrs_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_map_sg")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_map_sg
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
        public @Unsigned int phys_addrs;
        public Ptr<?> phys_addrs_ptr_;
        public @Unsigned int dma_addrs;
        public Ptr<?> dma_addrs_ptr_;
        public @Unsigned int lengths;
        public Ptr<?> lengths_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_free")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_free
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_alloc")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_alloc
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_unmap")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_unmap
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_dma_map")
    @NotUsableInJava
    public static class trace_event_data_offsets_dma_map
    extends Struct {
        public @Unsigned int device;
        public Ptr<?> device_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_sync_sg")
    @NotUsableInJava
    public static class trace_event_raw_dma_sync_sg
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned int __data_loc_dma_addrs;
        public @Unsigned int __data_loc_lengths;
        public DmaDefinitions.dma_data_direction dir;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_sync_single")
    @NotUsableInJava
    public static class trace_event_raw_dma_sync_single
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned long dma_addr;
        public @Unsigned long size;
        public DmaDefinitions.dma_data_direction dir;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_unmap_sg")
    @NotUsableInJava
    public static class trace_event_raw_dma_unmap_sg
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned int __data_loc_addrs;
        public DmaDefinitions.dma_data_direction dir;
        public @Unsigned long attrs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_map_sg")
    @NotUsableInJava
    public static class trace_event_raw_dma_map_sg
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned int __data_loc_phys_addrs;
        public @Unsigned int __data_loc_dma_addrs;
        public @Unsigned int __data_loc_lengths;
        public DmaDefinitions.dma_data_direction dir;
        public @Unsigned long attrs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_free")
    @NotUsableInJava
    public static class trace_event_raw_dma_free
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public Ptr<?> virt_addr;
        public @Unsigned long dma_addr;
        public @Unsigned long size;
        public @Unsigned long attrs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_alloc")
    @NotUsableInJava
    public static class trace_event_raw_dma_alloc
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public Ptr<?> virt_addr;
        public @Unsigned long dma_addr;
        public @Unsigned long size;
        public @Unsigned @OriginalName(value="gfp_t") int flags;
        public @Unsigned long attrs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_unmap")
    @NotUsableInJava
    public static class trace_event_raw_dma_unmap
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned long addr;
        public @Unsigned long size;
        public DmaDefinitions.dma_data_direction dir;
        public @Unsigned long attrs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_dma_map")
    @NotUsableInJava
    public static class trace_event_raw_dma_map
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_device;
        public @Unsigned long phys_addr;
        public @Unsigned long dma_addr;
        public @Unsigned long size;
        public DmaDefinitions.dma_data_direction dir;
        public @Unsigned long attrs;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_irq_matrix_cpu")
    @NotUsableInJava
    public static class trace_event_data_offsets_irq_matrix_cpu
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_irq_matrix_global_update")
    @NotUsableInJava
    public static class trace_event_data_offsets_irq_matrix_global_update
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_irq_matrix_global")
    @NotUsableInJava
    public static class trace_event_data_offsets_irq_matrix_global
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_irq_matrix_cpu")
    @NotUsableInJava
    public static class trace_event_raw_irq_matrix_cpu
    extends Struct {
        public trace_entry ent;
        public int bit;
        public @Unsigned int cpu;
        public boolean online;
        public @Unsigned int available;
        public @Unsigned int allocated;
        public @Unsigned int managed;
        public @Unsigned int online_maps;
        public @Unsigned int global_available;
        public @Unsigned int global_reserved;
        public @Unsigned int total_allocated;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_irq_matrix_global_update")
    @NotUsableInJava
    public static class trace_event_raw_irq_matrix_global_update
    extends Struct {
        public trace_entry ent;
        public int bit;
        public @Unsigned int online_maps;
        public @Unsigned int global_available;
        public @Unsigned int global_reserved;
        public @Unsigned int total_allocated;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_irq_matrix_global")
    @NotUsableInJava
    public static class trace_event_raw_irq_matrix_global
    extends Struct {
        public trace_entry ent;
        public @Unsigned int online_maps;
        public @Unsigned int global_available;
        public @Unsigned int global_reserved;
        public @Unsigned int total_allocated;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_sched_ext_dump")
    @NotUsableInJava
    public static class trace_event_data_offsets_sched_ext_dump
    extends Struct {
        public @Unsigned int line;
        public Ptr<?> line_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_sched_ext_dump")
    @NotUsableInJava
    public static class trace_event_raw_sched_ext_dump
    extends Struct {
        public trace_entry ent;
        public @Unsigned int __data_loc_line;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_notifier_info")
    @NotUsableInJava
    public static class trace_event_data_offsets_notifier_info
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_notifier_info")
    @NotUsableInJava
    public static class trace_event_raw_notifier_info
    extends Struct {
        public trace_entry ent;
        public Ptr<?> cb;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_workqueue_execute_end")
    @NotUsableInJava
    public static class trace_event_data_offsets_workqueue_execute_end
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_workqueue_execute_start")
    @NotUsableInJava
    public static class trace_event_data_offsets_workqueue_execute_start
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_workqueue_activate_work")
    @NotUsableInJava
    public static class trace_event_data_offsets_workqueue_activate_work
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_workqueue_queue_work")
    @NotUsableInJava
    public static class trace_event_data_offsets_workqueue_queue_work
    extends Struct {
        public @Unsigned int workqueue;
        public Ptr<?> workqueue_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_workqueue_execute_end")
    @NotUsableInJava
    public static class trace_event_raw_workqueue_execute_end
    extends Struct {
        public trace_entry ent;
        public Ptr<?> work;
        public Ptr<?> function;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_workqueue_execute_start")
    @NotUsableInJava
    public static class trace_event_raw_workqueue_execute_start
    extends Struct {
        public trace_entry ent;
        public Ptr<?> work;
        public Ptr<?> function;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_workqueue_activate_work")
    @NotUsableInJava
    public static class trace_event_raw_workqueue_activate_work
    extends Struct {
        public trace_entry ent;
        public Ptr<?> work;
        public Ptr<?> function;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_workqueue_queue_work")
    @NotUsableInJava
    public static class trace_event_raw_workqueue_queue_work
    extends Struct {
        public trace_entry ent;
        public Ptr<?> work;
        public Ptr<?> function;
        public @Unsigned int __data_loc_workqueue;
        public int req_cpu;
        public int cpu;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_tasklet")
    @NotUsableInJava
    public static class trace_event_data_offsets_tasklet
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_softirq")
    @NotUsableInJava
    public static class trace_event_data_offsets_softirq
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_irq_handler_exit")
    @NotUsableInJava
    public static class trace_event_data_offsets_irq_handler_exit
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_irq_handler_entry")
    @NotUsableInJava
    public static class trace_event_data_offsets_irq_handler_entry
    extends Struct {
        public @Unsigned int name;
        public Ptr<?> name_ptr_;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_tasklet")
    @NotUsableInJava
    public static class trace_event_raw_tasklet
    extends Struct {
        public trace_entry ent;
        public Ptr<?> tasklet;
        public Ptr<?> func;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_softirq")
    @NotUsableInJava
    public static class trace_event_raw_softirq
    extends Struct {
        public trace_entry ent;
        public @Unsigned int vec;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_irq_handler_exit")
    @NotUsableInJava
    public static class trace_event_raw_irq_handler_exit
    extends Struct {
        public trace_entry ent;
        public int irq;
        public int ret;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_irq_handler_entry")
    @NotUsableInJava
    public static class trace_event_raw_irq_handler_entry
    extends Struct {
        public trace_entry ent;
        public int irq;
        public @Unsigned int __data_loc_name;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_print_flags")
    @NotUsableInJava
    public static class trace_print_flags
    extends Struct {
        public @Unsigned long mask;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_x86_exceptions")
    @NotUsableInJava
    public static class trace_event_data_offsets_x86_exceptions
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_x86_exceptions")
    @NotUsableInJava
    public static class trace_event_raw_x86_exceptions
    extends Struct {
        public trace_entry ent;
        public @Unsigned long address;
        public @Unsigned long ip;
        public @Unsigned long error_code;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_data_offsets_emulate_vsyscall")
    @NotUsableInJava
    public static class trace_event_data_offsets_emulate_vsyscall
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_raw_emulate_vsyscall")
    @NotUsableInJava
    public static class trace_event_raw_emulate_vsyscall
    extends Struct {
        public trace_entry ent;
        public int nr;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_file")
    @NotUsableInJava
    public static class trace_event_file
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<trace_event_call> event_call;
        public Ptr<EventDefinitions.event_filter> filter;
        public Ptr<EventfsDefinitions.eventfs_inode> ei;
        public Ptr<trace_array> tr;
        public Ptr<trace_subsystem_dir> system;
        public ListDefinitions.list_head triggers;
        public @Unsigned long flags;
        public  @OriginalName(value="refcount_t") misc.refcount_struct ref;
        public AtomicDefinitions.atomic_t sm_ref;
        public AtomicDefinitions.atomic_t tm_ref;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_buffer")
    @NotUsableInJava
    public static class trace_event_buffer
    extends Struct {
        public Ptr<trace_buffer> buffer;
        public Ptr<RingDefinitions.ring_buffer_event> event;
        public Ptr<trace_event_file> trace_file;
        public Ptr<?> entry;
        public @Unsigned int trace_ctx;
        public Ptr<PtDefinitions.pt_regs> regs;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_class")
    @NotUsableInJava
    public static class trace_event_class
    extends Struct {
        public String system;
        public Ptr<?> probe;
        public Ptr<?> perf_probe;
        public Ptr<?> reg;
        public Ptr<trace_event_fields> fields_array;
        public Ptr<?> get_fields;
        public ListDefinitions.list_head fields;
        public Ptr<?> raw_init;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_fields")
    @NotUsableInJava
    public static class trace_event_fields
    extends Struct {
        public String type;
        @InlineUnion(value=2142)
        public  @InlineUnion(value=2142) AnonDefinitions.anon_member_of_anon_member_of_trace_event_fields anon1$0;
        @InlineUnion(value=2142)
        public @InlineUnion(value=2142) Ptr<?> define_fields;
    }

    @Type(noCCodeGeneration=true, cType="enum trace_reg")
    public static enum trace_reg implements Enum<trace_reg>,
    TypedEnum<trace_reg, Integer>
    {
        TRACE_REG_REGISTER,
        TRACE_REG_UNREGISTER,
        TRACE_REG_PERF_REGISTER,
        TRACE_REG_PERF_UNREGISTER,
        TRACE_REG_PERF_OPEN,
        TRACE_REG_PERF_CLOSE,
        TRACE_REG_PERF_ADD,
        TRACE_REG_PERF_DEL;

    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_functions")
    @NotUsableInJava
    public static class trace_event_functions
    extends Struct {
        public @OriginalName(value="trace_print_func") Ptr<?> trace;
        public @OriginalName(value="trace_print_func") Ptr<?> raw;
        public @OriginalName(value="trace_print_func") Ptr<?> hex;
        public @OriginalName(value="trace_print_func") Ptr<?> binary;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event")
    @NotUsableInJava
    public static class trace_event
    extends Struct {
        public misc.hlist_node node;
        public int type;
        public Ptr<trace_event_functions> funcs;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_iterator")
    @NotUsableInJava
    public static class trace_iterator
    extends Struct {
        public Ptr<trace_array> tr;
        public Ptr<runtime.tracer> trace;
        public Ptr<ArrayDefinitions.array_buffer> array_buffer;
        public Ptr<?> _private;
        public int cpu_file;
        public runtime.mutex mutex;
        public Ptr<Ptr<RingDefinitions.ring_buffer_iter>> buffer_iter;
        public @Unsigned long iter_flags;
        public Ptr<?> temp;
        public @Unsigned int temp_size;
        public String fmt;
        public @Unsigned int fmt_size;
        public AtomicDefinitions.atomic_t wait_index;
        public trace_seq tmp_seq;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> started;
        public boolean closed;
        public boolean snapshot;
        public trace_seq seq;
        public Ptr<trace_entry> ent;
        public @Unsigned long lost_events;
        public int leftover;
        public int ent_size;
        public int cpu;
        public @Unsigned long ts;
        public @OriginalName(value="loff_t") long pos;
        public long idx;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_entry")
    @NotUsableInJava
    public static class trace_entry
    extends Struct {
        public @Unsigned short type;
        public char flags;
        public char preempt_count;
        public int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_seq")
    @NotUsableInJava
    public static class trace_seq
    extends Struct {
        public char @Size(value=8156) [] buffer;
        public SeqDefinitions.seq_buf seq;
        public @Unsigned long readpos;
        public int full;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_eval_map")
    @NotUsableInJava
    public static class trace_eval_map
    extends Struct {
        public String system;
        public String eval_string;
        public @Unsigned long eval_value;
    }

    @Type(noCCodeGeneration=true, cType="struct trace_event_call")
    @NotUsableInJava
    public static class trace_event_call
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<trace_event_class> _class;
        @InlineUnion(value=2153)
        public @InlineUnion(value=2153) String name;
        @InlineUnion(value=2153)
        public @InlineUnion(value=2153) Ptr<runtime.tracepoint> tp;
        public trace_event event;
        public String print_fmt;
        public Ptr<EventDefinitions.event_filter> filter;
        @InlineUnion(value=2154)
        public @InlineUnion(value=2154) Ptr<?> module;
        @InlineUnion(value=2154)
        public  @InlineUnion(value=2154) AtomicDefinitions.atomic_t refcnt;
        public Ptr<?> data;
        public int flags;
        public int perf_refcount;
        public Ptr<misc.hlist_head> perf_events;
        public Ptr<BpfDefinitions.bpf_prog_array> prog_array;
        public Ptr<?> perf_perm;
    }
}

