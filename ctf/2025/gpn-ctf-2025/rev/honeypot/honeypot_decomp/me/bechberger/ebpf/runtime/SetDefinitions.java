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
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.ArchDefinitions;
import me.bechberger.ebpf.runtime.ArrayDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EhciDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GnttabDefinitions;
import me.bechberger.ebpf.runtime.GroupDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NcsiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.OppDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.ProbeDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SnpDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.SynthDefinitions;
import me.bechberger.ebpf.runtime.SyscallDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ThreadDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.UartDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VgaDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __set_clr_pte_enc(Ptr<PteDefinitions.pte_t> kpte, int level, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __set_linkmode_max_speed(@Unsigned int max_speed, Ptr<@Unsigned Long> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __set_next_task_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, boolean first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __set_pgd(Ptr<misc.pgd_t> pgdp, misc.pgd_t pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_synth_event_print_fmt(Ptr<SynthDefinitions.synth_event> event2, String buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_tracer_option(Ptr<TraceDefinitions.trace_array> tr, Ptr<misc.tracer_flags> tracer_flags2, Ptr<misc.tracer_opt> opts, int neg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_aliased_prot(Ptr<?> v, @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_attention_status(Ptr<misc.hotplug_slot> hotplug_slot2, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_audio_state(VgaDefinitions.vga_switcheroo_client_id id, VgaDefinitions.vga_switcheroo_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_badblock(Ptr<runtime.badblocks> bb, @Unsigned @OriginalName(value="sector_t") long s2, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_best_encoder(Ptr<DrmDefinitions.drm_atomic_state> state2, Ptr<DrmDefinitions.drm_connector_state> conn_state, Ptr<DrmDefinitions.drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_bitmap_file(Ptr<runtime.mddev> mddev2, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_blitting_type(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_blocksize(Ptr<runtime.file> file2, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_buf_size(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_buffer_entries(Ptr<ArrayDefinitions.array_buffer> buf, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cached_acl(Ptr<runtime.inode> inode2, int type2, Ptr<PosixDefinitions.posix_acl> acl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_capacity(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="sector_t") long sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean set_capacity_and_notify(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="sector_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_cmdline_ftrace(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_con2fb_map(int unit, int newidx, int user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_copy_dsdt((const struct dmi_system_id*)$arg1)")
    public static int set_copy_dsdt(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_cpu_itimer($arg1, $arg2, (const const struct itimerspec64*)$arg3, (const struct itimerspec64*)$arg4)")
    public static void set_cpu_itimer(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned int clock_id, Ptr<runtime.itimerspec64> value, Ptr<runtime.itimerspec64> ovalue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cpu_online(@Unsigned int cpu2, boolean online) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cpus_allowed_fair(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.affinity_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_debug_rodata(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_disk_ro(Ptr<runtime.gendisk> disk, boolean read_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_dte_entry(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<IommuDefinitions.iommu_dev_data> dev_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_field_width(Ptr<misc.printf_spec> spec, int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_flags(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_ftrace_dump_on_oops(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_ftrace_ops_ro() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_hardened_usercopy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_hashdist(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_imstt_regvals(Ptr<FbDefinitions.fb_info> info2, @Unsigned @OriginalName(value="u_int") int bpp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean set_in_sync(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_init_arg($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int set_init_arg(String param2, String val, String unused, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_init_blocksize(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_kprobe_boot_events(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_block_size_order(@Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_mems_allowed(misc.nodemask_t nodemask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_mhash_entries(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_mphash_entries(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_next_buddy(Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_next_entity(Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_next_task_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, boolean first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_nohugeiomap(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_nohugevmalloc(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_normalized_timespec64(Ptr<runtime.timespec64> ts, @OriginalName(value="time64_t") long sec, long nsec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_one_prio(Ptr<TaskDefinitions.task_struct> p, int niceval, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_p4d(Ptr<misc.p4d_t> p4dp, misc.p4d_t p4d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean set_page_dirty(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_page_writeback(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pageblock_order() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_pkcs7_data($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int set_pkcs7_data(Ptr<?> ctx, Ptr<?> data, @Unsigned long len, @Unsigned long asn1hdrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pmd(Ptr<PmdDefinitions.pmd_t> pmdp, PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_posix_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, int type2, Ptr<PosixDefinitions.posix_acl> acl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_precision(Ptr<misc.printf_spec> spec, int prec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_process_cpu_timer(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned int clkid, Ptr<@Unsigned Long> newval, Ptr<@Unsigned Long> oldval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pte(Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pte_range(Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, @Unsigned int nr, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pte_vaddr(@Unsigned long vaddr, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pte_vaddr_p4d(Ptr<misc.p4d_t> p4d_page, @Unsigned long vaddr, PteDefinitions.pte_t new_pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pte_vaddr_pud(Ptr<PudDefinitions.pud_t> pud_page, @Unsigned long vaddr, PteDefinitions.pte_t new_pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pud(Ptr<PudDefinitions.pud_t> pudp, PudDefinitions.pud_t pud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_rdt_options(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_remap_table_entry_alias(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_reset_devices(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_ro((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int set_ro(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_segment_reg(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long offset, @Unsigned short value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_sysctl_tfa($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long set_sysctl_tfa(Ptr<runtime.device> cdev2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_task_ioprio(Ptr<TaskDefinitions.task_struct> task2, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_task_max_allowed_capacity(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_task_rq(Ptr<TaskDefinitions.task_struct> p, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_task_rq_fair(Ptr<SchedDefinitions.sched_entity> se, Ptr<misc.cfs_rq> prev, Ptr<misc.cfs_rq> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_thash_entries(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_ti_thread_flag(Ptr<ThreadDefinitions.thread_info> ti, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_trace_boot_clock(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_trace_boot_options(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_tracepoint_printk(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_tracepoint_printk_stop(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_tracer_flag(Ptr<TraceDefinitions.trace_array> tr, @Unsigned int mask, int enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_tracing_thresh(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="depot_stack_handle_t") int set_track_prepare() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_tun_src(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_var_mtrr_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_vc_hi_font(Ptr<VcDefinitions.vc_data> vc2, boolean set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_zone_contiguous(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__set_current_blocked((const struct {\n  long unsigned int sig[1];\n}*)$arg1)")
    public static void __set_current_blocked(Ptr<misc.sigset_t> newset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __set_cyc2ns_scale(@Unsigned long khz, int cpu2, @Unsigned long tsc_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_enter_print_fmt(Ptr<SyscallDefinitions.syscall_metadata> entry, String buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_memory_enc_pgtable(@Unsigned long addr2, int numpages, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_memory_prot(@Unsigned long addr2, int numpages, @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __set_phys_to_machine(@Unsigned long pfn, @Unsigned long mfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __set_sched_clock_stable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__set_task_blocked($arg1, (const struct {\n  long unsigned int sig[1];\n}*)$arg2)")
    public static void __set_task_blocked(Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.sigset_t> newset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _set_memory_uc(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _set_memory_wb(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _set_memory_wc(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _set_memory_wt(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _set_opp(Ptr<runtime.device> dev, Ptr<OppDefinitions.opp_table> opp_table2, Ptr<DevDefinitions.dev_pm_opp> opp, Ptr<?> clk_data, boolean forced) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_set_opp_bw((const struct opp_table*)$arg1, $arg2, $arg3)")
    public static int _set_opp_bw(Ptr<OppDefinitions.opp_table> opp_table2, Ptr<DevDefinitions.dev_pm_opp> opp, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _set_pages_array(Ptr<Ptr<runtime.page>> pages, int numpages, PageDefinitions.page_cache_mode new_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_access(String acc, short access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_bank($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long set_bank(Ptr<runtime.device> s2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_bf_sort((const struct dmi_system_id*)$arg1)")
    public static int set_bf_sort(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_cache_qos_cfg(int level, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_cmci_disabled($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long set_cmci_disabled(Ptr<runtime.device> s2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_compat_user_sigmask((const struct {\n  unsigned int sig[2];\n}*)$arg1, $arg2)")
    public static int set_compat_user_sigmask(Ptr<CompatDefinitions.compat_sigset_t> umask, @Unsigned long sigsetsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_corruption_check(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_corruption_check_period(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_corruption_check_size(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cpu_sibling_map(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_current_blocked(Ptr<misc.sigset_t> newset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_current_groups(Ptr<GroupDefinitions.group_info> group_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_current_rng(Ptr<runtime.hwrng> rng) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cyc2ns_scale(@Unsigned long khz, int cpu2, @Unsigned long tsc_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_default_qdisc((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int set_default_qdisc(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_direct_map_default_noflush(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_direct_map_invalid_noflush(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_flexbg_block_bitmap(Ptr<SuperDefinitions.super_block> sb, Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<Ext4Definitions.ext4_new_flex_group_data> flex_gd, @Unsigned @OriginalName(value="ext4_fsblk_t") long first_cluster, @Unsigned @OriginalName(value="ext4_fsblk_t") long last_cluster) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_foreign_p2m_mapping(Ptr<GnttabDefinitions.gnttab_map_grant_ref> map_ops, Ptr<GnttabDefinitions.gnttab_map_grant_ref> kmap_ops, Ptr<Ptr<runtime.page>> pages, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long set_freq_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_freq_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long set_freq_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_ftrace_early_graph(String buf, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_ftrace_filter(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_ftrace_notrace(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_graph_function(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_graph_max_depth_function(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_graph_notrace_function(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_groups(Ptr<runtime.cred> _new, Ptr<GroupDefinitions.group_info> group_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_hv_tscchange_cb((void (*)())$arg1)")
    public static void set_hv_tscchange_cb(Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_ignore_ce($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long set_ignore_ce(Ptr<runtime.device> s2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_initial_priority(Ptr<misc.pglist_data> pgdat, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_inverse_trans_unicode(Ptr<misc.uni_pagedict> dict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_inverse_transl(Ptr<VcDefinitions.vc_data> conp, Ptr<misc.uni_pagedict> dict, misc.translation_map m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_io_from_upio(Ptr<UartDefinitions.uart_port> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_is_seen(Ptr<misc.ctl_table_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_kexec_sig_enforced() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean set_kthread_struct(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ctl_table_set> set_lookup(Ptr<misc.ctl_table_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_majmin(String str, @Unsigned int m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_max_huge_pages(Ptr<runtime.hstate> h, @Unsigned long count, int nid, Ptr<misc.nodemask_t> nodes_allowed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_max_user_events_sysctl((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int set_max_user_events_sysctl(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_mba_sc(boolean mba_sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_mce_nospec(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_memmap_mode((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int set_memmap_mode(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_4k(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_decrypted(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean set_memory_enc_stop_conversion() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_encrypted(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_global(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_nonglobal(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_np(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_np_noalias(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_nx(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_p(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_ro(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_rox(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_rw(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_uc(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_wb(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_wc(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_memory_x(@Unsigned long addr2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_mm_exe_file(Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.file> new_exe_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<LruDefinitions.lru_gen_mm_walk> set_mm_walk(Ptr<misc.pglist_data> pgdat, boolean force_alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_multi((const struct dmi_system_id*)$arg1)")
    public static int set_multi(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_next_task_stop(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> stop, boolean first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_online_page_callback(@OriginalName(value="online_page_callback_t") Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_online_policy((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int set_online_policy(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_pages_array_uc(Ptr<Ptr<runtime.page>> pages, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_pages_array_wb(Ptr<Ptr<runtime.page>> pages, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_pages_array_wc(Ptr<Ptr<runtime.page>> pages, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_pages_ro(Ptr<runtime.page> page2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_pages_rw(Ptr<runtime.page> page2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_pages_uc(Ptr<runtime.page> page2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_pages_wb(Ptr<runtime.page> page2, int numpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_personality_64bit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_personality_ia32(boolean x32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long set_phys_range_identity(@Unsigned long pfn_s, @Unsigned long pfn_e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean set_phys_to_machine(@Unsigned long pfn, @Unsigned long mfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_root(Ptr<runtime.nameidata> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_scan_all((const struct dmi_system_id*)$arg1)")
    public static int set_scan_all(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_sched_topology(Ptr<SchedDefinitions.sched_domain_topology_level> tl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_syscall_user_dispatch(@Unsigned long mode, @Unsigned long offset, @Unsigned long len, String selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_task_stack_end_magic(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_tls_desc($arg1, $arg2, (const struct user_desc*)$arg3, $arg4)")
    public static void set_tls_desc(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> info2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Short> set_translate(misc.translation_map m, Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_user_sigmask((const struct {\n  long unsigned int sig[1];\n}*)$arg1, $arg2)")
    public static int set_user_sigmask(Ptr<misc.sigset_t> umask, @Unsigned long sigsetsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_x2apic_phys_mode(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_cpus_allowed_ptr(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.affinity_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_cpus_allowed_ptr_locked(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.affinity_context> ctx, Ptr<runtime.rq> rq2, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __set_swap_bios_limit(Ptr<misc.mapped_device> md, int latch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__set_task_comm($arg1, (const u8*)$arg2, $arg3)")
    public static void __set_task_comm(Ptr<TaskDefinitions.task_struct> tsk, String buf, boolean exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_task_frozen(Ptr<TaskDefinitions.task_struct> p, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_affinity_irq($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int set_affinity_irq(Ptr<IrqDefinitions.irq_data> data, Ptr<runtime.cpumask> dest, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_binfmt(Ptr<LinuxDefinitions.linux_binfmt> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_block_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cache_aps_delayed_init(boolean val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_callee_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> caller, Ptr<BpfDefinitions.bpf_func_state> callee, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_check_enable_amd_mmconf((const struct dmi_system_id*)$arg1)")
    public static int set_check_enable_amd_mmconf(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_close_on_exec(@Unsigned int fd2, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_console(int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cpus_allowed_common(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.affinity_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_cpus_allowed_ptr($arg1, (const struct cpumask*)$arg2)")
    public static int set_cpus_allowed_ptr(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.cpumask> new_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_create_files_as(Ptr<runtime.cred> _new, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_cred_ucounts(Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cursor(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_dev_entry_bit(Ptr<AmdDefinitions.amd_iommu> iommu, @Unsigned short devid, char bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_dev_entry_from_acpi(Ptr<AmdDefinitions.amd_iommu> iommu, @Unsigned short devid, @Unsigned int flags, @Unsigned int ext_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_dev_info((const struct device*)$arg1, $arg2)")
    public static void set_dev_info(Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_printk_info> dev_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_dumpable(Ptr<MmDefinitions.mm_struct> mm, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_enabled(Ptr<LsmDefinitions.lsm_info> lsm, boolean enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_encryption_policy($arg1, (const union fscrypt_policy*)$arg2)")
    public static int set_encryption_policy(Ptr<runtime.inode> inode2, Ptr<FscryptDefinitions.fscrypt_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_evtchn_to_irq(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn, @Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_find_vma_callback_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> caller, Ptr<BpfDefinitions.bpf_func_state> callee, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean set_freezable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_fs_pwd($arg1, (const struct path*)$arg2)")
    public static void set_fs_pwd(Ptr<FsDefinitions.fs_struct> fs, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_fs_root($arg1, (const struct path*)$arg2)")
    public static void set_fs_root(Ptr<FsDefinitions.fs_struct> fs, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_global_limit((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int set_global_limit(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_huge_pmd(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PmdDefinitions.pmd_t> pmdp, Ptr<runtime.page> hpage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_ignore_seg((const struct dmi_system_id*)$arg1)")
    public static int set_ignore_seg(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_ihash_entries(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_intr_gate($arg1, (const void*)$arg2)")
    public static void set_intr_gate(@Unsigned int n, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_irq_remapping_broken() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_load_weight(Ptr<TaskDefinitions.task_struct> p, boolean update_load) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_loop_callback_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> caller, Ptr<BpfDefinitions.bpf_func_state> callee, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_map_elem_callback_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> caller, Ptr<BpfDefinitions.bpf_func_state> callee, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_max_cstate((const struct dmi_system_id*)$arg1)")
    public static int set_max_cstate(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_module_sig_enforced() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_nlink(Ptr<runtime.inode> inode2, @Unsigned int nlink) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_no_e820((const struct dmi_system_id*)$arg1)")
    public static int set_no_e820(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemoryDefinitions.memory_tier> set_node_memory_tier(int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_nouse_crs((const struct dmi_system_id*)$arg1)")
    public static int set_nouse_crs(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_numabalancing_state(boolean enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_one_vid(Ptr<NcsiDefinitions.ncsi_dev_priv> ndp, Ptr<NcsiDefinitions.ncsi_channel> nc, Ptr<NcsiDefinitions.ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_orig_insn(Ptr<ArchDefinitions.arch_uprobe> auprobe, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_origin(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_owner(Ptr<EhciDefinitions.ehci_hcd> ehci, int portnum, int new_owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_page_dirty_lock(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_palette(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pcie_hotplug_bridge(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pcie_port_type(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_permissions($arg1, (const struct ctl_table*)$arg2)")
    public static int set_permissions(Ptr<misc.ctl_table_header> head, Ptr<misc.ctl_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_pgdat_percpu_threshold($arg1, (int (*)(struct zone*))$arg2)")
    public static void set_pgdat_percpu_threshold(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, Ptr<?> calculate_pressure) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_power_ctl_ee_state(boolean input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_primary_fwnode(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_rbtree_add_callback_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> caller, Ptr<BpfDefinitions.bpf_func_state> callee, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_recommended_min_free_kbytes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_rq_offline(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_rq_online(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_secondary_fwnode(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_security_override(Ptr<runtime.cred> _new, @Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_security_override_from_ctx($arg1, (const u8*)$arg2)")
    public static int set_security_override_from_ctx(Ptr<runtime.cred> _new, String secctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_selection_kernel(Ptr<misc.tiocl_selection> v, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_selection_user((const struct tiocl_selection*)$arg1, $arg2)")
    public static int set_selection_user(Ptr<misc.tiocl_selection> sel, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_shrinker_bit(Ptr<MemDefinitions.mem_cgroup> memcg, int nid, int shrinker_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_swbp(Ptr<ArchDefinitions.arch_uprobe> auprobe, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_task_blockstep(Ptr<TaskDefinitions.task_struct> task2, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_task_cpu(Ptr<TaskDefinitions.task_struct> p, @Unsigned int new_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_timer_callback_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> caller, Ptr<BpfDefinitions.bpf_func_state> callee, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_tlb_ubc_flush_pending(Ptr<MmDefinitions.mm_struct> mm, PteDefinitions.pte_t pteval, @Unsigned long uaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_trace_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_trigger($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long set_trigger(Ptr<runtime.device> s2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long siz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_tsc_mode(@Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_use_crs((const struct dmi_system_id*)$arg1)")
    public static int set_use_crs(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_user_ringbuf_callback_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> caller, Ptr<BpfDefinitions.bpf_func_state> callee, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __set_pages_state(Ptr<SnpDefinitions.snp_psc_desc> data, @Unsigned long vaddr, @Unsigned long vaddr_end, int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __set_print_fmt(Ptr<TraceDefinitions.trace_probe> tp, String buf, int len, ProbeDefinitions.probe_print_type ptype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_acpi_reboot((const struct dmi_system_id*)$arg1)")
    public static int set_acpi_reboot(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_anon_super(Ptr<SuperDefinitions.super_block> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_anon_super_fc(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_attr_rdpmc($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long set_attr_rdpmc(Ptr<runtime.device> cdev2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_bdev_super(Ptr<SuperDefinitions.super_block> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_bios_reboot((const struct dmi_system_id*)$arg1)")
    public static int set_bios_reboot(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_boost(Ptr<CpufreqDefinitions.cpufreq_policy> policy, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_brightness_delayed(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_brightness_delayed_set_brightness(Ptr<LedDefinitions.led_classdev> led_cdev, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cluster_next(Ptr<SwapDefinitions.swap_info_struct> si, @Unsigned long next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_consumer_device_supply($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int set_consumer_device_supply(Ptr<RegulatorDefinitions.regulator_dev> rdev, String consumer_dev_name, String supply) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long set_cookie_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_cpumask_stub($arg1, (const struct cpumask*)$arg2)")
    public static void set_cpumask_stub(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cpus_allowed_dl(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.affinity_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_cpus_allowed_scx(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.affinity_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_current_cr3(Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_dax_nocache(Ptr<DaxDefinitions.dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_dax_nomc(Ptr<DaxDefinitions.dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_dax_synchronous(Ptr<DaxDefinitions.dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_dhash_entries(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_efi_reboot((const struct dmi_system_id*)$arg1)")
    public static int set_efi_reboot(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_irq_posting_cap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_kbd_reboot((const struct dmi_system_id*)$arg1)")
    public static int set_kbd_reboot(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_lr_boolean_ace($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int set_lr_boolean_ace(Ptr<OpalDefinitions.opal_dev> dev, @Unsigned int opal_uid2, char lr, Ptr<Character> users, @Unsigned long users_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_machine_constraints(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_machine_trusted_keys(Ptr<runtime.key> keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_mbr_done(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_mbr_enable_disable(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_mcast_msfilter(Ptr<runtime.sock> sk, int ifindex, int numsrc, int fmode, Ptr<KernelDefinitions.__kernel_sockaddr_storage> group, Ptr<KernelDefinitions.__kernel_sockaddr_storage> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_msi_sid_cb(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long set_mtrr_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_named_trigger_data(Ptr<EventDefinitions.event_trigger_data> data, Ptr<EventDefinitions.event_trigger_data> named_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_new_pw(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_next_task_dl(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, boolean first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_next_task_idle(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> next, boolean first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_next_task_rt(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, boolean first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_next_task_scx(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, boolean first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_operstate(Ptr<NetDefinitions.net_device> dev, char transition) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_overhead($arg1, (const void*)$arg2)")
    public static void set_overhead(Ptr<Ext4Definitions.ext4_super_block> es, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_page_prot(Ptr<?> addr2, @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_page_prot_flags(Ptr<?> addr2, @OriginalName(value="pgprot_t") runtime.pgprot prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pageblock_migratetype(Ptr<runtime.page> page2, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pages_state(@Unsigned long vaddr, @Unsigned long npages, int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_pci_reboot((const struct dmi_system_id*)$arg1)")
    public static int set_pci_reboot(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pfnblock_flags_mask(Ptr<runtime.page> page2, @Unsigned long flags, @Unsigned long pfn, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_platform_trusted_keys(Ptr<runtime.key> keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_pmd_migration_entry(Ptr<PageDefinitions.page_vma_mapped_walk> pvmw, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_proc_pid_nlink() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_pte_mfn(@Unsigned long vaddr, @Unsigned long mfn, @OriginalName(value="pgprot_t") runtime.pgprot flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_rtc_noop((const struct timespec64*)$arg1)")
    public static int set_rtc_noop(Ptr<runtime.timespec64> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_scl_gpio_value(Ptr<I2cDefinitions.i2c_adapter> adap, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_sda_gpio_value(Ptr<I2cDefinitions.i2c_adapter> adap, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_sid_cpin_pin(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_tcpmhash_entries(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_termios(Ptr<TtyDefinitions.tty_struct> tty, Ptr<?> arg2, int opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_tracefs_inode_owner(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_trigger_filter(String filter_str, Ptr<EventDefinitions.event_trigger_data> trigger_data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_uhash_entries(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_up_gart_resume(@Unsigned int aper_order, @Unsigned int aper_alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int set_up_temporary_text_mapping(Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_user_nice(Ptr<TaskDefinitions.task_struct> p, long nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_vsyscall_pgtable_user_bits(Ptr<misc.pgd_t> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_weight_stub(Ptr<TaskDefinitions.task_struct> p, @Unsigned int weight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_work_pool_and_clear_pending(Ptr<misc.work_struct> work, int pool_id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="set_worker_desc((const u8*)$arg1, $arg2_)")
    public static void set_worker_desc(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void set_worker_dying(Ptr<runtime.worker> worker2, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct set_affinity_pending")
    @NotUsableInJava
    public static class set_affinity_pending
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public @Unsigned int stop_pending;
        public runtime.completion done;
        public CpuDefinitions.cpu_stop_work stop_work;
        public misc.migration_arg arg;
    }

    @Type(noCCodeGeneration=true, cType="struct set_config_request")
    @NotUsableInJava
    public static class set_config_request
    extends Struct {
        public Ptr<UsbDefinitions.usb_device> udev;
        public int config;
        public misc.work_struct work;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct set_mtrr_data")
    @NotUsableInJava
    public static class set_mtrr_data
    extends Struct {
        public @Unsigned long smp_base;
        public @Unsigned long smp_size;
        public @Unsigned int smp_reg;
        public @OriginalName(value="mtrr_type") char smp_type;
    }

    @Type(noCCodeGeneration=true, cType="struct set_msi_sid_data")
    @NotUsableInJava
    public static class set_msi_sid_data
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> pdev;
        public @Unsigned short alias;
        public int count;
        public int busmatch_count;
    }
}

