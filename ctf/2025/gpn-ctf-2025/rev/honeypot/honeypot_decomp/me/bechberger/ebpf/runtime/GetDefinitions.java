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
import me.bechberger.ebpf.runtime.AcpiphpDefinitions;
import me.bechberger.ebpf.runtime.AgpDefinitions;
import me.bechberger.ebpf.runtime.AllocDefinitions;
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.ArrayDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.ConfigfsDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.CrosDefinitions;
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DevfreqDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.FutexDefinitions;
import me.bechberger.ebpf.runtime.HashDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.IwDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KfenceDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KprobeDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.ObjDefinitions;
import me.bechberger.ebpf.runtime.OldDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.OppDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.PowerDefinitions;
import me.bechberger.ebpf.runtime.PrbDefinitions;
import me.bechberger.ebpf.runtime.PsiDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.RdmaDefinitions;
import me.bechberger.ebpf.runtime.RdmacgDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.ResctrlDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SdDefinitions;
import me.bechberger.ebpf.runtime.SeccompDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.StackDefinitions;
import me.bechberger.ebpf.runtime.SugovDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.SystemDefinitions;
import me.bechberger.ebpf.runtime.TargetDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TickDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.TypeDefinitions;
import me.bechberger.ebpf.runtime.UprobeDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.UsbdevfsDefinitions;
import me.bechberger.ebpf.runtime.UvDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.XaDefinitions;
import me.bechberger.ebpf.runtime.XenpfDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.BPFType;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class GetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> __get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __get_compat_msghdr(Ptr<runtime.msghdr> kmsg, Ptr<CompatDefinitions.compat_msghdr> msg, Ptr<Ptr<runtime.sockaddr>> save_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __get_current_cr3_fast() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__get_hash_from_flowi6((const struct flowi6*)$arg1, $arg2)")
    public static @Unsigned int __get_hash_from_flowi6(Ptr<runtime.flowi6> fl6, Ptr<FlowDefinitions.flow_keys> keys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __get_huge_page_for_hwpoison(@Unsigned long pfn, int flags, Ptr<@OriginalName(value="bool") Boolean> migratable_cleared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __get_hwpoison_page(Ptr<runtime.page> page2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> __get_locked_pte(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, Ptr<Ptr< @OriginalName(value="spinlock_t") runtime.spinlock>> ptl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __get_random_u32_below(@Unsigned int ceil) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __get_state(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<Character> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__get_type_size($arg1, $arg2, (const struct btf_type**)$arg3)")
    public static int __get_type_size(Ptr<runtime.btf> btf2, @Unsigned int btf_id, Ptr<Ptr<BtfDefinitions.btf_type>> ret_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __get_unpoison_page(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__get_vm_area_caller($arg1, $arg2, $arg3, $arg4, (const void*)$arg5)")
    public static Ptr<VmDefinitions.vm_struct> __get_vm_area_caller(@Unsigned long size, @Unsigned long flags, @Unsigned long start, @Unsigned long end, Ptr<?> caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__get_vm_area_node($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, (const void*)$arg9)")
    public static Ptr<VmDefinitions.vm_struct> __get_vm_area_node(@Unsigned long size, @Unsigned long align, @Unsigned long shift, @Unsigned long flags, @Unsigned long start, @Unsigned long end, int node2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_get_div((const struct clk_div_table*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned int _get_div(Ptr<ClkDefinitions.clk_div_table> table, @Unsigned int val, @Unsigned long flags, char width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_get_maxdiv((const struct clk_div_table*)$arg1, $arg2, $arg3)")
    public static @Unsigned int _get_maxdiv(Ptr<ClkDefinitions.clk_div_table> table, char width, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _get_random_bytes(Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_adapter_status(Ptr<misc.hotplug_slot> hotplug_slot2, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_any_page(Ptr<runtime.page> p, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.slab> get_any_partial(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<misc.partial_context> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_array_info(Ptr<runtime.mddev> mddev2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_attention_status(Ptr<misc.hotplug_slot> hotplug_slot2, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_bMaxPacketSize0(Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_device_descriptor> buf, int size, boolean first_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_bitmap_file(Ptr<runtime.mddev> mddev2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_bits(Ptr<misc.bunzip_data> bd, char bits_wanted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> get_cached_acl(Ptr<runtime.inode> inode2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> get_cached_acl_rcu(Ptr<runtime.inode> inode2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> get_cert_list(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> guid, Ptr<@Unsigned Long> size, Ptr<@Unsigned @OriginalName(value="efi_status_t") Long> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RdmacgDefinitions.rdmacg_resource_pool> get_cg_rpool_locked(Ptr<RdmaDefinitions.rdma_cgroup> cg, Ptr<RdmacgDefinitions.rdmacg_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> get_children_pid(Ptr<runtime.inode> inode2, Ptr<runtime.pid> pid_prev, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_classes_callback(Ptr<?> k, Ptr<?> d, Ptr<?> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_color(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2, @Unsigned short c, int is_fg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_compat_msghdr(Ptr<runtime.msghdr> kmsg, Ptr<CompatDefinitions.compat_msghdr> umsg, Ptr<Ptr<runtime.sockaddr>> save_addr, Ptr<Ptr<runtime.iovec>> iov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_count_order(@Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_cpu_idle_time_us(int cpu2, Ptr<@Unsigned Long> last_update_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_cpu_iowait_time_us(int cpu2, Ptr<@Unsigned Long> last_update_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_cpu_itimer($arg1, $arg2, (const struct itimerspec64*)$arg3)")
    public static void get_cpu_itimer(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned int clock_id, Ptr<runtime.itimerspec64> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_cpu_sleep_time_us(Ptr<TickDefinitions.tick_sched> ts, Ptr<@OriginalName(value="ktime_t") Long> sleeptime, boolean compute_delta, Ptr<@Unsigned Long> last_update_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_create_ext(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<FuseDefinitions.fuse_args> args, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RdtDefinitions.rdt_ctrl_domain> get_ctrl_domain_from_cpu(int cpu2, Ptr<RdtDefinitions.rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct landlock_ruleset*)get_current_fs_domain())")
    public static Ptr<LandlockDefinitions.landlock_ruleset> get_current_fs_domain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevDefinitions.dev_table_entry> get_dev_table(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_disk_info(Ptr<runtime.mddev> mddev2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_domain_id_from_scope(int cpu2, ResctrlDefinitions.resctrl_scope scope) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_flags(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_free_entries(@Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_free_entries_seq(@Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_free_seq(@Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_futex_key(Ptr<@Unsigned Integer> uaddr, @Unsigned int flags, Ptr<FutexDefinitions.futex_key> key2, FutexDefinitions.futex_access rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_handler_for_ca_keys((const struct {\n  u8 b[16];\n}*)$arg1)")
    public static @OriginalName(value="efi_element_handler_t") Ptr<?> get_handler_for_ca_keys(Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> sig_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_handler_for_code_signing_keys((const struct {\n  u8 b[16];\n}*)$arg1)")
    public static @OriginalName(value="efi_element_handler_t") Ptr<?> get_handler_for_code_signing_keys(Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> sig_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_handler_for_db((const struct {\n  u8 b[16];\n}*)$arg1)")
    public static @OriginalName(value="efi_element_handler_t") Ptr<?> get_handler_for_db(Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> sig_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_handler_for_dbx((const struct {\n  u8 b[16];\n}*)$arg1)")
    public static @OriginalName(value="efi_element_handler_t") Ptr<?> get_handler_for_dbx(Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> sig_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_handler_for_mok((const struct {\n  u8 b[16];\n}*)$arg1)")
    public static @OriginalName(value="efi_element_handler_t") Ptr<?> get_handler_for_mok(Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> sig_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_hwpoison_page(Ptr<runtime.page> p, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_ibs_caps() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_ibs_fetch_count(@Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_ibs_op_count(@Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> get_inode_acl(Ptr<runtime.inode> inode2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IpcDefinitions.ipc_namespace> get_ipc_ns_exported(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_itimerspec64($arg1, (const struct __kernel_itimerspec*)$arg2)")
    public static int get_itimerspec64(Ptr<runtime.itimerspec64> it, Ptr<KernelDefinitions.__kernel_itimerspec> uit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_itimerval($arg1, (const struct __kernel_old_itimerval*)$arg2)")
    public static int get_itimerval(Ptr<runtime.itimerspec64> o, Ptr<KernelDefinitions.__kernel_old_itimerval> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_jiffies_update(Ptr<@Unsigned Long> basej) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_kern_ctx_btf_id(Ptr<BpfDefinitions.bpf_verifier_log> log, BpfDefinitions.bpf_prog_type prog_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.kmmio_fault_page> get_kmmio_fault_page(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_latch_status(Ptr<misc.hotplug_slot> hotplug_slot2, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_mmap_base(int is_legacy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_mode_access((const short unsigned int)$arg1)")
    public static @Unsigned @OriginalName(value="access_mask_t") short get_mode_access(@Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RdtDefinitions.rdt_mon_domain> get_mon_domain_from_cpu(int cpu2, Ptr<RdtDefinitions.rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_more_blocks(Ptr<runtime.dio> dio2, Ptr<misc.dio_submit> sdio, Ptr<BufferDefinitions.buffer_head> map_bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mountpoint> get_mountpoint(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_ndd(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_next_block(Ptr<misc.bunzip_data> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_next_event(Ptr<CrosDefinitions.cros_ec_device> ec_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_next_modinfo((const struct load_info*)$arg1, (const u8*)$arg2, $arg3)")
    public static String get_next_modinfo(Ptr<LoadDefinitions.load_info> info2, String tag, String prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_nid_for_pfn(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_nr_ram_ranges_callback(Ptr<runtime.resource> res, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_oc_core_priority(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_old_itimerspec32($arg1, (const struct old_itimerspec32*)$arg2)")
    public static int get_old_itimerspec32(Ptr<runtime.itimerspec64> its, Ptr<OldDefinitions.old_itimerspec32> uits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_old_timespec32($arg1, (const void*)$arg2)")
    public static int get_old_timespec32(Ptr<runtime.timespec64> ts, Ptr<?> uts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_old_timex32($arg1, (const struct old_timex32*)$arg2)")
    public static int get_old_timex32(Ptr<KernelDefinitions.__kernel_timex> txc, Ptr<OldDefinitions.old_timex32> utp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_option(Ptr<String> str, Ptr<Integer> pint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_options((const u8*)$arg1, $arg2, $arg3)")
    public static String get_options(String str, int nints, Ptr<Integer> ints) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_page_bootmem(@Unsigned long info2, Ptr<runtime.page> page2, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.slab> get_partial_node(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<KmemDefinitions.kmem_cache_node> n, Ptr<misc.partial_context> pc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_group> get_pci_alias_group(Ptr<PciDefinitions.pci_dev> pdev, Ptr<@Unsigned Long> devfns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_pci_alias_or_group(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_group> get_pci_function_alias_group(Ptr<PciDefinitions.pci_dev> pdev, Ptr<@Unsigned Long> devfns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_permissions_callback(Ptr<?> k, Ptr<?> d, Ptr<?> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_pfn_range_for_nid(@Unsigned int nid, Ptr<@Unsigned Long> start_pfn, Ptr<@Unsigned Long> end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> get_pid(Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_port_device_capability(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_power_status(Ptr<misc.hotplug_slot> hotplug_slot2, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.net> get_proc_task_net(Ptr<runtime.inode> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct nf_defrag_hook*)get_proto_defrag_hook($arg1, (const struct nf_defrag_hook**)$arg2, (const u8*)$arg3))")
    public static Ptr<NfDefinitions.nf_defrag_hook> get_proto_defrag_hook(Ptr<BpfDefinitions.bpf_nf_link> link2, Ptr<Ptr<NfDefinitions.nf_defrag_hook>> ptr_global_hook, String mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_random_bytes(Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long get_random_bytes_user(Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short get_random_u16() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_random_u32() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_random_u32_below(@Unsigned int ceil) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_random_u64() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char get_random_u8() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_rdt_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_ro($arg1, (const struct kernel_param*)$arg2)")
    public static int get_ro(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_rr_interval_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_ruleset_from_fd((const int)$arg1, (const unsigned int)$arg2)")
    public static Ptr<LandlockDefinitions.landlock_ruleset> get_ruleset_from_fd(int fd2, @Unsigned @OriginalName(value="fmode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_security_context(Ptr<runtime.dentry> entry, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<FuseDefinitions.fuse_in_arg> ext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_sg_io_hdr($arg1, (const void*)$arg2)")
    public static int get_sg_io_hdr(Ptr<SgDefinitions.sg_io_hdr> hdr, Ptr<?> argp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_slabinfo(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<slabinfo> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> get_stack_pointer(Ptr<TaskDefinitions.task_struct> task2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_stack_skipnr((const long unsigned int*)$arg1, $arg2, (const enum kfence_error_type*)$arg3)")
    public static int get_stack_skipnr(Ptr<@Unsigned Long> stack_entries, int num_entries, Ptr<KfenceDefinitions.kfence_error_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_state_synchronize_srcu(Ptr<SrcuDefinitions.srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_symbol_offset(@Unsigned long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_symbol_pos(@Unsigned long addr2, Ptr<@Unsigned Long> symbolsize, Ptr<@Unsigned Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_taint() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_tcp4_sock(Ptr<runtime.sock> sk, Ptr<SeqDefinitions.seq_file> f, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_tcp6_sock(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.sock> sp, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_timespec64($arg1, (const struct __kernel_timespec*)$arg2)")
    public static int get_timespec64(Ptr<runtime.timespec64> ts, Ptr<KernelDefinitions.__kernel_timespec> uts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_total_entries(Ptr<ArrayDefinitions.array_buffer> buf, Ptr<@Unsigned Long> total, Ptr<@Unsigned Long> entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_total_entries_cpu(Ptr<ArrayDefinitions.array_buffer> buf, Ptr<@Unsigned Long> total, Ptr<@Unsigned Long> entries, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_trap_addr(Ptr<Ptr<?>> addr2, @Unsigned int ist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_urb32(Ptr<UsbdevfsDefinitions.usbdevfs_urb> kurb, Ptr<UsbdevfsDefinitions.usbdevfs_urb32> uurb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_user_ifreq(Ptr<runtime.ifreq> ifr, Ptr<Ptr<?>> ifrdata, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_user_shstk_addr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_struct> get_vm_area(@Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_vm_area_caller($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<VmDefinitions.vm_struct> get_vm_area_caller(@Unsigned long size, @Unsigned long flags, Ptr<?> caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IwDefinitions.iw_statistics> get_wireless_stats(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="kprobe_opcode_t") Character> __get_insn_slot(Ptr<KprobeDefinitions.kprobe_insn_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __get_next_timer_interrupt(@Unsigned long basej, @Unsigned long basem, Ptr<@OriginalName(value="bool") Boolean> idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kprobe> __get_valid_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __get_vblank_counter(Ptr<DrmDefinitions.drm_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _get_opp_count(Ptr<OppDefinitions.opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _get_opp_table_kref(Ptr<OppDefinitions.opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> get_addr_ref_16(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_avenrun(Ptr<@Unsigned Long> loads, @Unsigned long offset, int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_clock_desc((const int)$arg1, $arg2)")
    public static int get_clock_desc(@OriginalName(value="clockid_t") int id, Ptr<PosixDefinitions.posix_clock_desc> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_completed_synchronize_rcu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CpuDefinitions.cpu_cacheinfo> get_cpu_cacheinfo(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_cur_freq(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.hwrng> get_current_rng_nolock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_data_src(Ptr<PerfDefinitions.perf_event> event2, @Unsigned long aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct font_desc*)get_default_font($arg1, $arg2, $arg3, $arg4))")
    public static Ptr<misc.font_desc> get_default_font(int xres, int yres, Ptr<@Unsigned Long> font_w, Ptr<@Unsigned Long> font_h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_derived_key($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int get_derived_key(Ptr<Character> derived_key, misc.derived_key_type key_type2, Ptr<Character> master_key, @Unsigned long master_keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_desc(Ptr<DescDefinitions.desc_struct> out, @Unsigned short sel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_detailed_timing(String block, Ptr<FbDefinitions.fb_videomode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevDefinitions.dev_pagemap> get_dev_pagemap(@Unsigned long pfn, Ptr<DevDefinitions.dev_pagemap> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_eff_addr_modrm(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs, Ptr<Integer> regoff, Ptr<Long> eff_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_eff_addr_reg(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs, Ptr<Integer> regoff, Ptr<Long> eff_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_eff_addr_sib(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs, Ptr<Integer> base_offset, Ptr<Long> eff_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_eprobe_size(Ptr<TraceDefinitions.trace_probe> tp, Ptr<?> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_est_timing(String block, Ptr<FbDefinitions.fb_videomode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FbDefinitions.fb_info> get_fb_info(@Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_prog> get_filter(Ptr<SockDefinitions.sock_fprog> uprog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ConfigfsDefinitions.configfs_fragment> get_fragment(Ptr<ConfigfsDefinitions.configfs_fragment> frag2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_free_mem_region($arg1, $arg2, $arg3, (const long unsigned int)$arg4, (const u8*)$arg5, (const long unsigned int)$arg6, (const long unsigned int)$arg7)")
    public static Ptr<runtime.resource> get_free_mem_region(Ptr<runtime.device> dev, Ptr<runtime.resource> base, @Unsigned @OriginalName(value="resource_size_t") long size, @Unsigned long align, String name, @Unsigned long desc, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SchedDefinitions.sched_group> get_group(int cpu2, Ptr<SdDefinitions.sd_data> sdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_huge_page_for_hwpoison(@Unsigned long pfn, int flags, Ptr<@OriginalName(value="bool") Boolean> migratable_cleared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_hwpoison_hugetlb_folio(Ptr<runtime.folio> folio2, Ptr<@OriginalName(value="bool") Boolean> hugetlb, boolean unpoison) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_ins_imm_val(@Unsigned long ins_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_ins_mem_width(@Unsigned long ins_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_ins_reg_val(@Unsigned long ins_addr, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_ins_reg_width(@Unsigned long ins_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.reason_type get_ins_type(@Unsigned long ins_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_kcore_size(Ptr<Integer> nphdr, Ptr<@Unsigned Long> phdrs_len, Ptr<@Unsigned Long> notes_len, Ptr<@Unsigned Long> data_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_keyring_key(@Unsigned int key_id, @Unsigned int type2, Ptr<FscryptDefinitions.fscrypt_master_key_secret> secret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kprobe> get_kprobe(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_kthread_comm(String buf, @Unsigned long buf_size, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_linear_data($arg1, (const u8**)$arg2, $arg3, $arg4)")
    public static @Unsigned int get_linear_data(@Unsigned int consumed, Ptr<Ptr<Character>> dst, Ptr<misc.ts_config> conf, Ptr<misc.ts_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_max_files() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemDefinitions.mem_cgroup> get_mem_cgroup_from_current() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemDefinitions.mem_cgroup> get_mem_cgroup_from_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemDefinitions.mem_cgroup> get_mem_cgroup_from_mm(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_memmap_mode($arg1, (const struct kernel_param*)$arg2)")
    public static int get_memmap_mode(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> get_mm_exe_file(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_mm_memcg_path(Ptr<MmDefinitions.mm_struct> mm, String buf, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_mode_idx_from_str((const u8*)$arg1, $arg2)")
    public static int get_mode_idx_from_str(String str, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_monspecs(String edid2, Ptr<FbDefinitions.fb_monspecs> specs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_next_freq(Ptr<SugovDefinitions.sugov_policy> sg_policy, @Unsigned long util, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_next_timer_interrupt(@Unsigned long basej, @Unsigned long basem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_next_vma(@Unsigned long mask, @Unsigned long size, Ptr<MmDefinitions.mm_walk> args, Ptr<@Unsigned Long> vm_start, Ptr<@Unsigned Long> vm_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ObjDefinitions.obj_cgroup> get_obj_cgroup_from_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_online_mems() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_online_policy($arg1, (const struct kernel_param*)$arg2)")
    public static int get_online_policy(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kprobe> get_optimized_kprobe(Ptr<@OriginalName(value="kprobe_opcode_t") Character> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> get_pfn_folio(@Unsigned long pfn, Ptr<MemDefinitions.mem_cgroup> memcg, Ptr<misc.pglist_data> pgdat, boolean can_swap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_phys_to_machine(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_raw_hash((const u8*)$arg1, $arg2, $arg3)")
    public static String get_raw_hash(Ptr<Character> hash2, @Unsigned long hash_len, misc.blacklist_hash_type hash_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> get_rcu_tasks_gp_kthread() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> get_rcu_tasks_rude_gp_kthread() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> get_rcu_tasks_trace_gp_kthread() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_recent_times(Ptr<PsiDefinitions.psi_group> group, int cpu2, PsiDefinitions.psi_aggregators aggregator, Ptr<@Unsigned Integer> times, Ptr<@Unsigned Integer> pchanged_states) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> get_reg_w32(int no, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_scan_count(Ptr<runtime.lruvec> lruvec2, Ptr<ScanDefinitions.scan_control> sc, Ptr<@Unsigned Long> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_seg_base_limit(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs, int regoff, Ptr<@Unsigned Long> base, Ptr<@Unsigned Long> limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static short get_segment_selector(Ptr<PtDefinitions.pt_regs> regs, int seg_reg_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> get_shadow_from_swap_cache(misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_signal(Ptr<runtime.ksignal> ksig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_slot_status(Ptr<AcpiphpDefinitions.acpiphp_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_status(@Unsigned int index2, Ptr<@Unsigned @OriginalName(value="acpi_event_status") Integer> ret, Ptr<@OriginalName(value="acpi_handle") Ptr<?>> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_std_timing($arg1, $arg2, $arg3, $arg4, (const struct fb_monspecs*)$arg5)")
    public static int get_std_timing(String block, Ptr<FbDefinitions.fb_videomode> mode, int ver, int rev, Ptr<FbDefinitions.fb_monspecs> specs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_swappiness(Ptr<runtime.lruvec> lruvec2, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)get_syscall_name($arg1))")
    public static String get_syscall_name(int syscall2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> get_task_exe_file(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MmDefinitions.mm_struct> get_task_mm(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_unmapped_area_zero(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_user_session_keyring_rcu((const struct cred*)$arg1)")
    public static Ptr<runtime.key> get_user_session_keyring_rcu(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_valid_node_allowed(int nid, Ptr<misc.nodemask_t> nodes_allowed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_vma_name($arg1, (const struct path**)$arg2, (const u8**)$arg3, (const u8**)$arg4)")
    public static void get_vma_name(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<runtime.path>> path2, Ptr<String> name, Ptr<String> name_fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_cached_msi_msg(Ptr<MsiDefinitions.msi_desc> entry, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> __get_file_rcu(Ptr<Ptr<runtime.file>> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__get_name_cell((const u8*)$arg1)")
    public static Ptr<HashDefinitions.hash_cell> __get_name_cell(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __get_reqs_available(Ptr<runtime.kioctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String __get_task_comm(String buf, @Unsigned long buf_size, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __get_unmapped_area(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __get_unused_fd_flags(@Unsigned int flags, @Unsigned long nofile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __get_user_pages(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__get_uuid_cell((const u8*)$arg1)")
    public static Ptr<HashDefinitions.hash_cell> __get_uuid_cell(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mempolicy> __get_vma_policy(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<@Unsigned Long> ilx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __get_wchan(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __get_xps_queue_idx(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.xps_dev_maps> dev_maps, @Unsigned int tci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_ac_property(Ptr<PowerDefinitions.power_supply> psy, PowerDefinitions.power_supply_property psp, Ptr<PowerDefinitions.power_supply_propval> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_acpi_device(Ptr<?> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_agp_version(Ptr<AgpDefinitions.agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AmdDefinitions.amd_iommu> get_amd_iommu(@Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> get_arg_page(Ptr<LinuxDefinitions.linux_binprm> bprm, @Unsigned long pos, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_bitmap($arg1, (const long unsigned int*)$arg2, $arg3)")
    public static int get_bitmap(Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> nmask, @Unsigned long maxnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_boottime_timespec(Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_burstcount(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_cache_aps_delayed_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_cached_msi_msg(@Unsigned int irq, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_callchain_buffers(int event_max_stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_callchain_entry> get_callchain_entry(Ptr<Integer> rctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_close_on_exec(@Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_compat_ipc64_perm(Ptr<misc.ipc64_perm> to, Ptr<CompatDefinitions.compat_ipc64_perm> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_compat_ipc_perm(Ptr<misc.ipc64_perm> to, Ptr<CompatDefinitions.compat_ipc_perm> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_compat_sigevent($arg1, (const struct compat_sigevent*)$arg2)")
    public static int get_compat_sigevent(Ptr<runtime.sigevent> event2, Ptr<CompatDefinitions.compat_sigevent> u_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_compat_sigset($arg1, (const struct {\n  unsigned int sig[2];\n}*)$arg2)")
    public static int get_compat_sigset(Ptr<misc.sigset_t> set, Ptr<CompatDefinitions.compat_sigset_t> compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_completed_synchronize_rcu_full(Ptr<RcuDefinitions.rcu_gp_oldstate> rgosp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CpuDefinitions.cpu_entry_area> get_cpu_entry_area(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> get_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kobject> get_device_parent(Ptr<runtime.device> dev, Ptr<runtime.device> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> get_dump_page(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_dynptr_arg_reg($arg1, (const struct bpf_func_proto*)$arg2, $arg3)")
    public static Ptr<BpfDefinitions.bpf_reg_state> get_dynptr_arg_reg(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_proto> fn, Ptr<BpfDefinitions.bpf_reg_state> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> get_epoll_tfile_raw_ptr(Ptr<runtime.file> file2, int tfd, @Unsigned long toff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_event_name(String dest, Ptr<misc.tcpa_event> event2, String event_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_fam10h_pci_mmconf_base() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> get_file_active(Ptr<Ptr<runtime.file>> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> get_file_rcu(Ptr<Ptr<runtime.file>> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_ftrace_locations((const u8**)$arg1, $arg2)")
    public static @NotUsableInJava Ptr<@Unsigned Long> get_ftrace_locations(Ptr<String> syms, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_func_arg(@Unsigned long ctx, @Unsigned long n, @Unsigned long value, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_func_arg_cnt(@Unsigned long ctx, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3, @Unsigned long __ur_4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_func_ret(@Unsigned long ctx, @Unsigned long value, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_gate_page(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long address, @Unsigned int gup_flags, Ptr<Ptr<VmDefinitions.vm_area_struct>> vma, Ptr<Ptr<runtime.page>> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_idle_time(Ptr<KernelDefinitions.kernel_cpustat> kcs, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long get_instantiation_keyring(@OriginalName(value="key_serial_t") int ringid, Ptr<RequestDefinitions.request_key_auth> rka, Ptr<Ptr<runtime.key>> _dest_keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_iowait_time(Ptr<KernelDefinitions.kernel_cpustat> kcs, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_kfunc_ptr_arg_type($arg1, $arg2, (const struct btf_type*)$arg3, (const struct btf_type*)$arg4, (const u8*)$arg5, (const struct btf_param*)$arg6, $arg7, $arg8)")
    public static misc.kfunc_ptr_arg_type get_kfunc_ptr_arg_type(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_kfunc_call_arg_meta> meta, Ptr<BtfDefinitions.btf_type> t, Ptr<BtfDefinitions.btf_type> ref_t, String ref_tname, Ptr<BtfDefinitions.btf_param> args, int argno, int nargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_last_crashkernel($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static String get_last_crashkernel(String cmdline, String name, String suffix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_links(Ptr<misc.ctl_dir> dir, Ptr<misc.ctl_table_header> header, Ptr<misc.ctl_table_root> link_root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_lowmem_redirect(Ptr<@Unsigned Long> base, Ptr<@Unsigned Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.mapping_status get_mapping_status(Ptr<runtime.sock> ssk, Ptr<MptcpDefinitions.mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_max_inline_xattr_value_size(Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_memcg((const struct bpf_mem_cache*)$arg1)")
    public static Ptr<MemDefinitions.mem_cgroup> get_memcg(Ptr<BpfDefinitions.bpf_mem_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.microcode_intel> get_microcode_blob(Ptr<misc.ucode_cpu_info> uci, boolean save) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_mn(Ptr<mn> mnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long get_modalias(String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_modules_for_addrs(Ptr<Ptr<Ptr<runtime.module>>> mods, Ptr<@Unsigned Long> addrs2, @Unsigned int addrs_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_monitor_name((const struct drm_edid*)$arg1, $arg2)")
    public static int get_monitor_name(Ptr<DrmDefinitions.drm_edid> drm_edid2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_monitor_range((const struct detailed_timing*)$arg1, $arg2)")
    public static void get_monitor_range(Ptr<misc.detailed_timing> timing, Ptr<?> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_mpc_size(@Unsigned long physptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_msi_id_cb(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NsDefinitions.ns_common> get_net_ns(Ptr<NsDefinitions.ns_common> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.net> get_net_ns_by_fd(int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_net_ns_by_id((const struct net*)$arg1, $arg2)")
    public static Ptr<runtime.net> get_net_ns_by_id(Ptr<runtime.net> net2, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.net> get_net_ns_by_pid(@OriginalName(value="pid_t") int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_next_ino() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_nodes($arg1, (const long unsigned int*)$arg2, $arg3)")
    public static int get_nodes(Ptr<misc.nodemask_t> nodes, Ptr<@Unsigned Long> nmask, @Unsigned long maxnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_nohz_timer_target() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long get_nr_dirty_inodes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long get_nr_inodes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SeccompDefinitions.seccomp_filter> get_nth_filter(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long filter_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevfreqDefinitions.devfreq_cpu_data> get_parent_cpu_data(Ptr<DevfreqDefinitions.devfreq_passive_data> p_data, Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AmdDefinitions.amd_iommu_pci_seg> get_pci_segment(@Unsigned short id, Ptr<AcpiDefinitions.acpi_table_header> ivrs_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_callchain_entry> get_perf_callchain(Ptr<PtDefinitions.pt_regs> regs, @Unsigned int init_nr, boolean kernel, boolean user, @Unsigned int max_stack, boolean crosstask, boolean add_mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_phy_tunable(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> get_pid_task(Ptr<runtime.pid> pid2, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_rps_cpu(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<Ptr<misc.rps_dev_flow>> rflowp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_rsvd(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int end, Ptr<misc.extent_status> right_es, Ptr<misc.rsvd_count> rc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static EfiDefinitions.efi_secureboot_mode get_sb_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_seccomp_filter(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> get_sigframe(Ptr<runtime.ksignal> ksig, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long frame_size, Ptr<Ptr<?>> fpstate2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_sigframe_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="s_max") @NotUsableInJava BPFType.BPFIntType.Int128 get_signed_val(Ptr<TypeDefinitions.type_descriptor> type2, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<KmemDefinitions.kmem_cache> get_slab(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_state_synchronize_rcu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_state_synchronize_rcu_full(Ptr<RcuDefinitions.rcu_gp_oldstate> rgosp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_target_freq_by_required_opp(Ptr<runtime.device> p_dev, Ptr<OppDefinitions.opp_table> p_opp_table, Ptr<OppDefinitions.opp_table> opp_table2, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_target_freq_with_cpufreq(Ptr<runtime.devfreq> devfreq2, Ptr<@Unsigned Long> target_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_target_version(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cred*)get_task_cred($arg1))")
    public static Ptr<runtime.cred> get_task_cred(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_task_ioprio(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> get_task_pid(Ptr<TaskDefinitions.task_struct> task2, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mempolicy> get_task_policy(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_timing_level((const struct detailed_timing*)$arg1, $arg2)")
    public static void get_timing_level(Ptr<misc.detailed_timing> descriptor, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_tsc_mode(@Unsigned long adr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_tz_trend($arg1, (const struct thermal_trip*)$arg2)")
    public static int get_tz_trend(Ptr<ThermalDefinitions.thermal_zone_device> tz, Ptr<ThermalDefinitions.thermal_trip> trip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ucounts> get_ucounts(Ptr<runtime.ucounts> ucounts2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="u_max") @NotUsableInJava BPFType.BPFIntType.Int128 get_unsigned_val(Ptr<TypeDefinitions.type_descriptor> type2, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_unused_fd_flags(@Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long get_user_pages(@Unsigned long start, @Unsigned long nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_user_pages_fast(@Unsigned long start, int nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_user_pages_fast_only(@Unsigned long start, int nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long get_user_pages_remote(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long get_user_pages_unlocked(@Unsigned long start, @Unsigned long nr_pages, Ptr<Ptr<runtime.page>> pages, @Unsigned int gup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UprobeDefinitions.uprobe_task> get_utask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static UvDefinitions.uv_system_type get_uv_system_type() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mempolicy> get_vma_policy(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, int order, Ptr<@Unsigned Long> ilx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<WatchDefinitions.watch_queue> get_watch_queue(int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_wchan(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_prog> __get_filter(Ptr<SockDefinitions.sock_fprog> fprog, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__get_fs_type((const u8*)$arg1, $arg2)")
    public static Ptr<FileDefinitions.file_system_type> __get_fs_type(String name, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __get_safe_page(@Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_user_1() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_user_2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_user_4() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_user_8() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_user_nocheck_1() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_user_nocheck_2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_user_nocheck_4() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __get_user_nocheck_8() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_active_key(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long get_active_temp(Ptr<AcpiDefinitions.acpi_thermal> tz, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_align_mask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_anon_bdev(Ptr<@Unsigned @OriginalName(value="dev_t") Integer> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long get_ata_xfer_names(@Unsigned int table_key, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long get_attr_rdpmc(Ptr<runtime.device> cdev2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SuperDefinitions.super_block> get_bdev_super(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_branch_type(@Unsigned long from, @Unsigned long to, int abort, boolean fused, Ptr<Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_cache_map_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_capabilities(Ptr<ScsiDefinitions.scsi_cd> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long get_chars(@Unsigned int vtermno, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_cmdline(Ptr<TaskDefinitions.task_struct> task2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_compacted_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_connectors_for_crtc(Ptr<DrmDefinitions.drm_crtc> crtc, Ptr<Ptr<DrmDefinitions.drm_connector>> connector_list, int num_connectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_cpu_address_sizes(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_cpu_cap(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> get_cpu_device(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_cpu_idle_time(@Unsigned int cpu2, Ptr<@Unsigned Long> wall, int io_busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_cpu_vendor(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_cur_freq_on_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_cur_val((const struct cpumask*)$arg1, $arg2)")
    public static @Unsigned int get_cur_val(Ptr<runtime.cpumask> mask, Ptr<AcpiDefinitions.acpi_cpufreq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TtyDefinitions.tty_struct> get_current_tty() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)get_data($arg1, $arg2, $arg3))")
    public static String get_data(Ptr<PrbDefinitions.prb_data_ring> data_ring, Ptr<PrbDefinitions.prb_data_blk_lpos> blk_lpos, Ptr<@Unsigned Integer> data_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_device_system_crosststamp((int (*)(long long int*, struct system_counterval_t*, void*))$arg1, $arg2, $arg3, $arg4)")
    public static int get_device_system_crosststamp(Ptr<?> get_time_fn, Ptr<?> ctx, Ptr<SystemDefinitions.system_time_snapshot> history_begin, Ptr<SystemDefinitions.system_device_crosststamp> xtstamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String get_dname(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_dominating_id($arg1, (const struct path*)$arg2)")
    public static int get_dominating_id(Ptr<runtime.mount> mnt, Ptr<runtime.path> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FileDefinitions.file_system_type> get_filesystem(Ptr<FileDefinitions.file_system_type> fs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_fixed_ranges(Ptr<@OriginalName(value="mtrr_type") Character> frs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_free_pages_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_fs_type((const u8*)$arg1)")
    public static Ptr<FileDefinitions.file_system_type> get_fs_type(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> get_gate_vma(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_governor((const u8*)$arg1)")
    public static Ptr<CpufreqDefinitions.cpufreq_governor> get_governor(String str_governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kobject> get_governor_parent_kobj(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)get_hist_field_flags($arg1))")
    public static String get_hist_field_flags(Ptr<HistDefinitions.hist_field> hist_field2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_id_from_freelist(Ptr<misc.blkfront_ring_info> rinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> get_image_page(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, int safe_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.grant> get_indirect_grant(Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> gref_head, Ptr<misc.blkfront_ring_info> rinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_injectable_error_type(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_jump_table_addr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static KernelDefinitions.kernel_gp_hint get_kernel_gp_address(Ptr<PtDefinitions.pt_regs> regs, Ptr<@Unsigned Long> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_lsp_lifecycle(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_max_acpi_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_max_boost_ratio(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long get_mm_cmdline(Ptr<MmDefinitions.mm_struct> mm, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long get_mm_proctitle(Ptr<MmDefinitions.mm_struct> mm, String buf, @Unsigned long count, @Unsigned long pos, @Unsigned long arg_start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> get_monitors_root() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_msid_cpin_pin(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_mtrr_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_trigger_data> get_named_trigger_data(Ptr<EventDefinitions.event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_next_lpos(Ptr<PrbDefinitions.prb_data_ring> data_ring, @Unsigned long lpos, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PudDefinitions.pud_t> get_old_pud(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_order_from_str((const u8*)$arg1)")
    public static int get_order_from_str(String size_str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_page_from_freelist($arg1, $arg2, $arg3, (const struct alloc_context*)$arg4)")
    public static Ptr<runtime.page> get_page_from_freelist(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order, int alloc_flags, Ptr<AllocDefinitions.alloc_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short get_pci_parity_status(Ptr<PciDefinitions.pci_dev> dev, int secondary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_pfnblock_flags_mask((const struct page*)$arg1, $arg2, $arg3)")
    public static @Unsigned long get_pfnblock_flags_mask(Ptr<runtime.page> page2, @Unsigned long pfn, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_phy_c45_ids(Ptr<misc.mii_bus> bus, int addr2, Ptr<PhyDefinitions.phy_c45_device_ids> c45_ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PhyDefinitions.phy_device> get_phy_device(Ptr<misc.mii_bus> bus, int addr2, boolean is_c45) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_pi_state(Ptr<FutexDefinitions.futex_pi_state> pi_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_pinctrl_dev_from_devname((const u8*)$arg1)")
    public static Ptr<PinctrlDefinitions.pinctrl_dev> get_pinctrl_dev_from_devname(String devname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PinctrlDefinitions.pinctrl_dev> get_pinctrl_dev_from_of_node(Ptr<DeviceDefinitions.device_node> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PipeDefinitions.pipe_inode_info> get_pipe_info(Ptr<runtime.file> file2, boolean for_splice) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_pmu_ctx(Ptr<PerfDefinitions.perf_event_pmu_context> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_priv_descr_and_size($arg1, $arg2, (const struct iw_priv_args**)$arg3)")
    public static int get_priv_descr_and_size(Ptr<NetDefinitions.net_device> dev, @Unsigned int cmd, Ptr<Ptr<IwDefinitions.iw_priv_args>> descrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_ramdisk_image() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_ramdisk_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_rid_cb(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int get_root_bridge_busnr_callback(Ptr<AcpiDefinitions.acpi_resource> resource2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int get_rr_interval_rt(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void get_rtc_noop(Ptr<runtime.timespec64> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_safe_page(@Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_sample() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_scl_gpio_value(Ptr<I2cDefinitions.i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_sda_gpio_value(Ptr<I2cDefinitions.i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_secrets_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_sectorsize(Ptr<ScsiDefinitions.scsi_cd> cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_segment_base(@Unsigned int segment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_stack_info(Ptr<@Unsigned Long> stack, Ptr<TaskDefinitions.task_struct> task2, Ptr<StackDefinitions.stack_info> info2, Ptr<@Unsigned Long> visit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean get_stack_info_noinstr(Ptr<@Unsigned Long> stack, Ptr<TaskDefinitions.task_struct> task2, Ptr<StackDefinitions.stack_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SwapDefinitions.swap_info_struct> get_swap_device(misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.swp_entry_t get_swap_page_of_type(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_swap_pages(int n_goal, Ptr<misc.swp_entry_t> swp_entries, int entry_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_target_type((const u8*)$arg1)")
    public static Ptr<TargetDefinitions.target_type> get_target_type(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char get_this_hybrid_cpu_type() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_tree_bdev($arg1, (int (*)(struct super_block*, struct fs_context*))$arg2)")
    public static int get_tree_bdev(Ptr<FsDefinitions.fs_context> fc, Ptr<?> fill_super) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_tree_bdev_flags($arg1, (int (*)(struct super_block*, struct fs_context*))$arg2, $arg3)")
    public static int get_tree_bdev_flags(Ptr<FsDefinitions.fs_context> fc, Ptr<?> fill_super, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_tree_keyed($arg1, (int (*)(struct super_block*, struct fs_context*))$arg2, $arg3)")
    public static int get_tree_keyed(Ptr<FsDefinitions.fs_context> fc, Ptr<?> fill_super, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_tree_nodev($arg1, (int (*)(struct super_block*, struct fs_context*))$arg2)")
    public static int get_tree_nodev(Ptr<FsDefinitions.fs_context> fc, Ptr<?> fill_super) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_tree_single($arg1, (int (*)(struct super_block*, struct fs_context*))$arg2)")
    public static int get_tree_single(Ptr<FsDefinitions.fs_context> fc, Ptr<?> fill_super) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_unbound_pool((const struct workqueue_attrs*)$arg1)")
    public static Ptr<misc.worker_pool> get_unbound_pool(Ptr<WorkqueueDefinitions.workqueue_attrs> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> get_unlocked_entry(Ptr<XaDefinitions.xa_state> xas, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int get_user_cpu_mask(Ptr<@Unsigned Long> user_mask_ptr, @Unsigned int len, Ptr<runtime.cpumask> new_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_uv_systab_phys(boolean msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="get_vfs_caps_from_disk($arg1, (const struct dentry*)$arg2, $arg3)")
    public static int get_vfs_caps_from_disk(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<CpuDefinitions.cpu_vfs_cap_data> cpu_caps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_vtime_delta(Ptr<runtime.vtime> vtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> get_xsave_addr(Ptr<misc.xregs_state> xsave, int xfeature_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> get_xsave_addr_user(Ptr<misc.xregs_state> xsave, int xfeature_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long get_zeroed_page_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mn")
    @NotUsableInJava
    public static class mn
    extends Struct {
        public char m_val;
        public char n_val;
        public char m_shift;
        public char n_lshift;
    }

    @Type(noCCodeGeneration=true, cType="struct slabinfo")
    @NotUsableInJava
    public static class slabinfo
    extends Struct {
        public @Unsigned long active_objs;
        public @Unsigned long num_objs;
        public @Unsigned long active_slabs;
        public @Unsigned long num_slabs;
        public @Unsigned long shared_avail;
        public @Unsigned int limit;
        public @Unsigned int batchcount;
        public @Unsigned int shared;
        public @Unsigned int objects_per_slab;
        public @Unsigned int cache_order;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int size; void *name; struct xenpf_efi_guid vendor_guid; }")
    @NotUsableInJava
    public static class get_next_variable_name_of_u_of_xenpf_efi_runtime_call
    extends Struct {
        public @Unsigned @OriginalName(value="xen_ulong_t") long size;
        public @OriginalName(value="__guest_handle_void") Ptr<?> name;
        public XenpfDefinitions.xenpf_efi_guid vendor_guid;
    }

    @Type(noCCodeGeneration=true, cType="struct { void *name; long unsigned int size; void *data; struct xenpf_efi_guid vendor_guid; }")
    @NotUsableInJava
    public static class get_variable_of_u_of_xenpf_efi_runtime_call_and_set_variable_of_u_of_xenpf_efi_runtime_call
    extends Struct {
        public @OriginalName(value="__guest_handle_void") Ptr<?> name;
        public @Unsigned @OriginalName(value="xen_ulong_t") long size;
        public @OriginalName(value="__guest_handle_void") Ptr<?> data;
        public XenpfDefinitions.xenpf_efi_guid vendor_guid;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct xenpf_efi_time time; unsigned int resolution; unsigned int accuracy; }")
    @NotUsableInJava
    public static class get_time_of_u_of_xenpf_efi_runtime_call
    extends Struct {
        public XenpfDefinitions.xenpf_efi_time time;
        public @Unsigned @OriginalName(value="uint32_t") int resolution;
        public @Unsigned @OriginalName(value="uint32_t") int accuracy;
    }
}

