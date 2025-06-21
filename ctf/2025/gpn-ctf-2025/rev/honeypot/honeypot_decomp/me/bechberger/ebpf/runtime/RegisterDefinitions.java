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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AsymmetricDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.CdromDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.FgraphDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LpssDefinitions;
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.QuotaDefinitions;
import me.bechberger.ebpf.runtime.SynthDefinitions;
import me.bechberger.ebpf.runtime.SysDefinitions;
import me.bechberger.ebpf.runtime.SysrqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TcfDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.UprobeDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.VgaDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RegisterDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__register_blkdev($arg1, (const u8*)$arg2, (void (*)(unsigned int))$arg3)")
    public static int __register_blkdev(@Unsigned int major, String name, Ptr<?> probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_bpf_struct_ops(Ptr<BpfDefinitions.bpf_struct_ops> st_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__register_btf_kfunc_id_set($arg1, (const struct btf_kfunc_id_set*)$arg2)")
    public static int __register_btf_kfunc_id_set(BtfDefinitions.btf_kfunc_hook hook, Ptr<BtfDefinitions.btf_kfunc_id_set> kset2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_nls(Ptr<misc.nls_table> nls, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_nmi_handler(@Unsigned int type2, Ptr<nmiaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_one_node(int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_trace_fprobe(Ptr<TraceDefinitions.trace_fprobe> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_trace_kprobe(Ptr<TraceDefinitions.trace_kprobe> tk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_btf_fmodret_id_set((const struct btf_kfunc_id_set*)$arg1)")
    public static int register_btf_fmodret_id_set(Ptr<BtfDefinitions.btf_kfunc_id_set> kset2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_btf_id_dtor_kfuncs((const struct btf_id_dtor_kfunc*)$arg1, $arg2, $arg3)")
    public static int register_btf_id_dtor_kfuncs(Ptr<BtfDefinitions.btf_id_dtor_kfunc> dtors, @Unsigned int add_cnt, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_btf_kfunc_id_set($arg1, (const struct btf_kfunc_id_set*)$arg2)")
    public static int register_btf_kfunc_id_set(BpfDefinitions.bpf_prog_type prog_type, Ptr<BtfDefinitions.btf_kfunc_id_set> kset2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_client($arg1, (const struct vga_switcheroo_client_ops*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int register_client(Ptr<PciDefinitions.pci_dev> pdev, Ptr<VgaDefinitions.vga_switcheroo_client_ops> ops, VgaDefinitions.vga_switcheroo_client_id id, Ptr<PciDefinitions.pci_dev> vga_dev, boolean active, boolean driver_power_control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_cpu_under_node(@Unsigned int cpu2, @Unsigned int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_dock_dependent_device(Ptr<AcpiDefinitions.acpi_device> adev, @OriginalName(value="acpi_handle") Ptr<?> dshandle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_fib_notifier($arg1, $arg2, (void (*)(struct notifier_block*))$arg3, $arg4)")
    public static int register_fib_notifier(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<?> cb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_ftrace_export(Ptr<TraceDefinitions.trace_export> export) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_inet6addr_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_inet6addr_validator_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_key_type(Ptr<KeyDefinitions.key_type> ktype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_kmmio_probe(Ptr<misc.kmmio_probe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_md_cluster_operations((const struct md_cluster_operations*)$arg1, $arg2)")
    public static int register_md_cluster_operations(Ptr<MdDefinitions.md_cluster_operations> ops, Ptr<runtime.module> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_md_personality(Ptr<MdDefinitions.md_personality> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_mem_block_under_node_early(Ptr<MemoryDefinitions.memory_block> mem_blk, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_mem_block_under_node_hotplug(Ptr<MemoryDefinitions.memory_block> mem_blk, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_memory_blocks_under_node(int nid, @Unsigned long start_pfn, @Unsigned long end_pfn, misc.meminit_context context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_memory_node_under_compute_node(@Unsigned int mem_nid, @Unsigned int cpu_nid, misc.access_coordinate_class access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_module_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_netevent_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_page_bootmem_info_node(Ptr<misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_page_bootmem_memmap(@Unsigned long section_nr, Ptr<runtime.page> start_page, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_quota_format(Ptr<QuotaDefinitions.quota_format_type> fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_random_vmfork_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_react_printk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int register_slot(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_synth_event(Ptr<SynthDefinitions.synth_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_sysrq_key($arg1, (const struct sysrq_key_op*)$arg2)")
    public static int register_sysrq_key(char key2, Ptr<SysrqDefinitions.sysrq_key_op> op_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_tcf_proto_ops(Ptr<TcfDefinitions.tcf_proto_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_trace_fprobe(Ptr<TraceDefinitions.trace_fprobe> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_trace_kprobe(Ptr<TraceDefinitions.trace_kprobe> tk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_tracer(Ptr<runtime.tracer> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_vmap_purge_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_warn_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_xenbus_watch(Ptr<XenbusDefinitions.xenbus_watch> watch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__register_chrdev($arg1, $arg2, $arg3, (const u8*)$arg4, (const struct file_operations*)$arg5)")
    public static int __register_chrdev(@Unsigned int major, @Unsigned int baseminor, @Unsigned int count, String name, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__register_chrdev_region($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<misc.char_device_struct> __register_chrdev_region(@Unsigned int major, @Unsigned int baseminor, int minorct, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_ftrace_function(Ptr<FtraceDefinitions.ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __register_prot_hook(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_virtio_driver(Ptr<VirtioDefinitions.virtio_driver> driver, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_aggr_kprobe(Ptr<runtime.kprobe> orig_p, Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_chrdev_region($arg1, $arg2, (const u8*)$arg3)")
    public static int register_chrdev_region(@Unsigned @OriginalName(value="dev_t") int from, @Unsigned int count, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_console(Ptr<runtime.console> newcon) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_dcbevent_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_device_clock(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<LpssDefinitions.lpss_private_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_framebuffer(Ptr<FbDefinitions.fb_info> fb_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_ftrace_command(Ptr<FtraceDefinitions.ftrace_func_command> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_ftrace_direct(Ptr<FtraceDefinitions.ftrace_ops> ops, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_ftrace_direct_cb(Ptr<misc.callback_head> rhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_ftrace_function(Ptr<FtraceDefinitions.ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_ftrace_function_nolock(Ptr<FtraceDefinitions.ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_ftrace_function_probe(String glob, Ptr<TraceDefinitions.trace_array> tr, Ptr<FtraceDefinitions.ftrace_probe_ops> probe_ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_ftrace_graph(Ptr<FgraphDefinitions.fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_inetaddr_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_inetaddr_validator_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_kprobes(Ptr<Ptr<runtime.kprobe>> kps, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_kretprobe(Ptr<runtime.kretprobe> rp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_kretprobes(Ptr<Ptr<runtime.kretprobe>> rps, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_lapic_address(@Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_mem_pfn_is_ram((int (*)(long unsigned int))$arg1)")
    public static int register_mem_pfn_is_ram(Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_memory_resource($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.resource> register_memory_resource(@Unsigned long start, @Unsigned long size, String resource_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_net_sysctl_sz($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<misc.ctl_table_header> register_net_sysctl_sz(Ptr<runtime.net> net2, String path2, Ptr<misc.ctl_table> table, @Unsigned long table_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_oom_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_perf_hw_breakpoint(Ptr<PerfDefinitions.perf_event> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_platform_power_off((void (*)())$arg1)")
    public static int register_platform_power_off(Ptr<?> power_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_pm_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_qdisc(Ptr<QdiscDefinitions.Qdisc_ops> qops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_react_panic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_reboot_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_restart_handler(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_sys_off_handler($arg1, $arg2, (int (*)(struct sys_off_data*))$arg3, $arg4)")
    public static Ptr<SysDefinitions.sys_off_handler> register_sys_off_handler(SysDefinitions.sys_off_mode mode, int priority, Ptr<?> callback2, Ptr<?> cb_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_syscore_ops(Ptr<misc.syscore_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_trace_uprobe(Ptr<TraceDefinitions.trace_uprobe> tu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_tracepoint_module_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_event> register_user_hw_breakpoint(Ptr<PerfDefinitions.perf_event_attr> attr2, @OriginalName(value="perf_overflow_handler_t") Ptr<?> triggered, Ptr<?> context2, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_virtio_device(Ptr<VirtioDefinitions.virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<PerfDefinitions.perf_event>> register_wide_hw_breakpoint(Ptr<PerfDefinitions.perf_event_attr> attr2, @OriginalName(value="perf_overflow_handler_t") Ptr<?> triggered, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_wwnr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_xen_pci_notifier() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_xfrm_state_bpf() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __register_binfmt(Ptr<LinuxDefinitions.linux_binfmt> fmt, int insert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __register_netdevice_notifier_net(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, boolean ignore_call_fail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__register_sysctl_init((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void __register_sysctl_init(String path2, Ptr<misc.ctl_table> table, String table_name, @Unsigned long table_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__register_sysctl_table($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<misc.ctl_table_header> __register_sysctl_table(Ptr<misc.ctl_table_set> set, String path2, Ptr<misc.ctl_table> table, @Unsigned long table_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_acpi_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_blocking_lsm_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_cdrom(Ptr<runtime.gendisk> disk, Ptr<CdromDefinitions.cdrom_device_info> cdi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_e820_pmem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_earlycon($arg1, (const struct earlycon_id*)$arg2)")
    public static int register_earlycon(String buf, Ptr<misc.earlycon_id> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_firmware_config_sysctl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_for_each_vma(Ptr<runtime.uprobe> uprobe2, Ptr<UprobeDefinitions.uprobe_consumer> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_fprobe($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int register_fprobe(Ptr<runtime.fprobe> fp, String filter, String notfilter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_fprobe_ips(Ptr<runtime.fprobe> fp, Ptr<@Unsigned Long> addrs2, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_fprobe_syms($arg1, (const u8**)$arg2, $arg3)")
    public static int register_fprobe_syms(Ptr<runtime.fprobe> fp, Ptr<String> syms, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_handler_proc(@Unsigned int irq, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_irq_proc(@Unsigned int irq, Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_mt_adistance_algorithm(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_netdev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_netdevice(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_netdevice_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_netdevice_notifier_dev_net(Ptr<NetDefinitions.net_device> dev, Ptr<misc.notifier_block> nb, Ptr<NetdevDefinitions.netdev_net_notifier> nn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_netdevice_notifier_net(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_nexthop_notifier(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_nvdimm_pmu(Ptr<NvdimmDefinitions.nvdimm_pmu> nd_pmu, Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_pernet_device(Ptr<misc.pernet_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_pernet_operations(Ptr<ListDefinitions.list_head> list, Ptr<misc.pernet_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_pernet_subsys(Ptr<misc.pernet_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_refined_jiffies(long cycles_per_second) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_stat_tracer(Ptr<misc.tracer_stat> trace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_switchdev_blocking_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_switchdev_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_sysctl_mount_point((const u8*)$arg1)")
    public static Ptr<misc.ctl_table_header> register_sysctl_mount_point(String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="register_sysctl_sz((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<misc.ctl_table_header> register_sysctl_sz(String path2, Ptr<misc.ctl_table> table, @Unsigned long table_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_trace_event(Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_vt_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_acpi_bus_type(Ptr<AcpiDefinitions.acpi_bus_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_acpi_hed_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_asymmetric_key_parser(Ptr<AsymmetricDefinitions.asymmetric_key_parser> parser) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_cpu(Ptr<runtime.cpu> cpu2, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_die_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_event_command(Ptr<EventDefinitions.event_command> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_filesystem(Ptr<FileDefinitions.file_system_type> fs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_kernel_offset_dumper() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_keyboard_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_memory_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.mii_timestamper> register_mii_timestamper(Ptr<DeviceDefinitions.device_node> node2, @Unsigned int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_mii_tstamp_controller(Ptr<runtime.device> device2, Ptr<misc.mii_timestamping_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_nmi_cpu_backtrace_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_nosave_region(@Unsigned long start_pfn, @Unsigned long end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_root_hub(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_snapshot_trigger(String glob, Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_sysfs_loader() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_trigger(String glob, Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_trigger_cmds() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_trigger_hist_cmd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_trigger_hist_enable_disable_cmds() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_update_efi_random_seed() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void register_vmcore_cb(Ptr<misc.vmcore_cb> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int register_xenstore_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct nmiaction")
    @NotUsableInJava
    public static class nmiaction
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="nmi_handler_t") Ptr<?> handler;
        public @Unsigned long max_duration;
        public @Unsigned long flags;
        public String name;
    }
}

