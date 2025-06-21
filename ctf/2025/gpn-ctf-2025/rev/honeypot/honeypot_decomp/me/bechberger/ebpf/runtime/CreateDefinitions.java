/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.ConfigDefinitions;
import me.bechberger.ebpf.runtime.ConfigfsDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FilterDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.InodeDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PowercapDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class CreateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__create_synth_event((const u8*)$arg1, (const u8*)$arg2)")
    public static int __create_synth_event(String name, String raw_fields) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_extcon_class() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_image(int platform_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_in_format_blob(Ptr<DrmDefinitions.drm_device> dev, Ptr<DrmDefinitions.drm_plane> plane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IpcDefinitions.ipc_namespace> create_ipc_ns(Ptr<UserDefinitions.user_namespace> user_ns, Ptr<IpcDefinitions.ipc_namespace> old_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_link(Ptr<ConfigDefinitions.config_item> parent_item, Ptr<ConfigDefinitions.config_item> item, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TraceDefinitions.trace_event_call> create_local_trace_kprobe(String func, Ptr<?> addr2, @Unsigned long offs, boolean is_return) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_new_entry(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<FuseDefinitions.fuse_mount> fm, Ptr<FuseDefinitions.fuse_args> args, Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nsproxy> create_new_namespaces(@Unsigned long flags, Ptr<TaskDefinitions.task_struct> tsk, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<FsDefinitions.fs_struct> new_fs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_of_modalias((const struct acpi_device*)$arg1, $arg2, $arg3)")
    public static int create_of_modalias(Ptr<AcpiDefinitions.acpi_device> acpi_dev, String modalias, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_or_delete_synth_event((const u8*)$arg1)")
    public static int create_or_delete_synth_event(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_or_delete_trace_kprobe((const u8*)$arg1)")
    public static int create_or_delete_trace_kprobe(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PidDefinitions.pid_namespace> create_pid_namespace(Ptr<UserDefinitions.user_namespace> user_ns, Ptr<PidDefinitions.pid_namespace> parent_pid_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_pnp_modalias((const struct acpi_device*)$arg1, $arg2, $arg3)")
    public static int create_pnp_modalias(Ptr<AcpiDefinitions.acpi_device> acpi_dev, String modalias, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_proc_profile() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_securityfs_measurement_lists() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_synth_event((const u8*)$arg1)")
    public static int create_synth_event(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_tlb_single_page_flush_ceiling() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void create_trace_option_files(Ptr<TraceDefinitions.trace_array> tr, Ptr<runtime.tracer> tracer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long create_trampoline(Ptr<FtraceDefinitions.ftrace_ops> ops, Ptr<@Unsigned Integer> tramp_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_altmaps_and_memory_blocks(int nid, Ptr<MemoryDefinitions.memory_group> group, @Unsigned long start, @Unsigned long size, @OriginalName(value="mhp_t") int mhp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_default_group(Ptr<ConfigDefinitions.config_group> parent_group, Ptr<ConfigDefinitions.config_group> group, Ptr<ConfigfsDefinitions.configfs_fragment> frag2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> create_empty_buffers(Ptr<runtime.folio> folio2, @Unsigned long blocksize, @Unsigned long b_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_intf_ep_devs(Ptr<UsbDefinitions.usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_io_thread((int (*)(void*))$arg1, $arg2, $arg3)")
    public static Ptr<TaskDefinitions.task_struct> create_io_thread(Ptr<?> fn, Ptr<?> arg2, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TraceDefinitions.trace_event_call> create_local_trace_uprobe(String name, @Unsigned long offs, @Unsigned long ref_ctr_offset, boolean is_return) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_or_delete_trace_uprobe((const u8*)$arg1)")
    public static int create_or_delete_trace_uprobe(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long create_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long create_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_user_ns(Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.xol_area> __create_xol_area(@Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_dyn_event((const u8*)$arg1)")
    public static int create_dyn_event(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_event_filter(Ptr<TraceDefinitions.trace_array> tr, Ptr<TraceDefinitions.trace_event_call> call, String filter_str, boolean set_str, Ptr<Ptr<EventDefinitions.event_filter>> filterp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_files($arg1, $arg2, $arg3, $arg4, (const struct attribute_group*)$arg5, $arg6)")
    public static int create_files(Ptr<KernfsDefinitions.kernfs_node> parent, Ptr<runtime.kobject> kobj, misc.kuid_t uid, misc.kgid_t gid, Ptr<AttributeDefinitions.attribute_group> grp, int update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_filter(Ptr<TraceDefinitions.trace_array> tr, Ptr<TraceDefinitions.trace_event_call> call, String filter_string, boolean set_str, Ptr<Ptr<EventDefinitions.event_filter>> filterp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_filter_start(String filter_string, boolean set_str, Ptr<Ptr<FilterDefinitions.filter_parse_error>> pse, Ptr<Ptr<EventDefinitions.event_filter>> filterp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> create_namespace_pmem(Ptr<NdDefinitions.nd_region> nd_region2, Ptr<NdDefinitions.nd_mapping> nd_mapping2, Ptr<NdDefinitions.nd_namespace_label> nd_label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_profile_file($arg1, (const u8*)$arg2, $arg3, (const struct file_operations*)$arg4)")
    public static Ptr<runtime.dentry> create_profile_file(Ptr<runtime.dentry> dir, String name, Ptr<AaDefinitions.aa_profile> profile, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_signature($arg1, (const void*)$arg2, $arg3)")
    public static int create_signature(Ptr<KernelDefinitions.kernel_pkey_params> params, Ptr<?> data, Ptr<?> enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__create_dir((const u8*)$arg1, $arg2, (const struct inode_operations*)$arg3)")
    public static Ptr<runtime.dentry> __create_dir(String name, Ptr<runtime.dentry> parent, Ptr<InodeDefinitions.inode_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __create_val_field(Ptr<HistDefinitions.hist_trigger_data> hist_data, @Unsigned int val_idx, Ptr<TraceDefinitions.trace_event_file> file2, String var_name, String field_str, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_actions(Ptr<HistDefinitions.hist_trigger_data> hist_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_basic_memory_bitmaps() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_boot_cache($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void create_boot_cache(Ptr<KmemDefinitions.kmem_cache> s2, String name, @Unsigned int size, @Unsigned @OriginalName(value="slab_flags_t") int flags, @Unsigned int useroffset, @Unsigned int usersize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_chunk(Ptr<runtime.inode> inode2, Ptr<AuditDefinitions.audit_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_constraints($arg1, $arg2, (const struct powercap_zone_constraint_ops*)$arg3)")
    public static int create_constraints(Ptr<PowercapDefinitions.powercap_zone> power_zone, int nr_constraints, Ptr<PowercapDefinitions.powercap_zone_constraint_ops> const_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_event_toplevel_files(Ptr<runtime.dentry> parent, Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.field_var> create_field_var(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TraceDefinitions.trace_event_file> file2, String field_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_field> create_field_var_hist(Ptr<HistDefinitions.hist_trigger_data> target_hist_data, String subsys_name, String event_name, String field_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_field> create_hist_field(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<FtraceDefinitions.ftrace_event_field> field, @Unsigned long flags, String var_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_init_pkru_value() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean create_io_worker(Ptr<IoDefinitions.io_wq> wq, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_key_fields(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void create_kmalloc_caches() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_mem_extents(Ptr<ListDefinitions.list_head> list, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_memory_block_devices(@Unsigned long start, @Unsigned long size, Ptr<misc.vmem_altmap> altmap, Ptr<MemoryDefinitions.memory_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void create_page_chain(Ptr<misc.size_class> _class2, Ptr<runtime.zspage> zspage2, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pinctrl> create_pinctrl(Ptr<runtime.device> dev, Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_pipe_files(Ptr<Ptr<runtime.file>> res, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_regulator($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.regulator> create_regulator(Ptr<RegulatorDefinitions.regulator_dev> rdev, Ptr<runtime.device> dev, String supply_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_sort_keys(Ptr<HistDefinitions.hist_trigger_data> hist_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_state($arg1, (const u8*)$arg2)")
    public static Ptr<PinctrlDefinitions.pinctrl_state> create_state(Ptr<runtime.pinctrl> p, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_val_fields(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="create_var($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static Ptr<HistDefinitions.hist_field> create_var(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TraceDefinitions.trace_event_file> file2, String name, int size, String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int create_var_fields(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_field> create_var_ref(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<HistDefinitions.hist_field> var_field, String system, String event_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.worker> create_worker(Ptr<misc.worker_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void create_worker_cb(Ptr<misc.callback_head> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void create_worker_cont(Ptr<misc.callback_head> cb) {
        throw new MethodIsBPFRelatedFunction();
    }
}

