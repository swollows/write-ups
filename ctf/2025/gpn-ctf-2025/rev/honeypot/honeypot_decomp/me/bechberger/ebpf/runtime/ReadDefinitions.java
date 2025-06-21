/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ReadDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __read_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int read_apic_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_bandwidth_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_blocklist(Ptr<runtime.inode> inode2, int index2, Ptr<@Unsigned Long> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_file_blob(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_hpet(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_hv_clock_msr_cs(Ptr<runtime.clocksource> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_hv_clock_tsc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_hv_clock_tsc_cs(Ptr<runtime.clocksource> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_hv_sched_clock_tsc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long read_indexes(Ptr<SuperDefinitions.super_block> sb, int n, Ptr<@Unsigned Long> start_block, Ptr<Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_latency_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void read_persistent_clock64(Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_prioidx(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_priomap(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_profile(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_rdev(Ptr<runtime.mddev> mddev2, Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> __read_swap_cache_async(misc.swp_entry_t entry, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<runtime.mempolicy> mpol, @Unsigned long ilx, Ptr<@OriginalName(value="bool") Boolean> new_page_allocated, boolean skip_if_exists) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _read_bw(Ptr<DevDefinitions.dev_pm_opp> opp, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _read_freq(Ptr<DevDefinitions.dev_pm_opp> opp, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _read_level(Ptr<DevDefinitions.dev_pm_opp> opp, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_capacity_10(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<ScsiDefinitions.scsi_device> sdp, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_capacity_16(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<ScsiDefinitions.scsi_device> sdp, Ptr<QueueDefinitions.queue_limits> lim, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void read_capacity_error(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<ScsiDefinitions.scsi_device> sdp, Ptr<ScsiDefinitions.scsi_sense_hdr> sshdr, int sense_valid, int the_result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_classid(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_cons_helper(Ptr<runtime.policydb> p, Ptr<Ptr<misc.constraint_node>> nodep, @Unsigned int ncons, int allowxtarget, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_current_timer(Ptr<@Unsigned Long> timer_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="read_dmi_type_b1((const struct dmi_header*)$arg1, $arg2)")
    public static void read_dmi_type_b1(Ptr<DmiDefinitions.dmi_header> dm, Ptr<?> private_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_enabled_file_bool(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_frontend_details(Ptr<XenbusDefinitions.xenbus_device> xendev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_iter_null(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_iter_zero(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_kcore_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_lba(Ptr<misc.parsed_partitions> state2, @Unsigned long lba, Ptr<Character> buffer, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_mem(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_null(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void read_pages(Ptr<misc.readahead_control> rac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> read_part_sector(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long n, Ptr<runtime.Sector> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_port(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_sb_page(Ptr<runtime.mddev> mddev2, @OriginalName(value="loff_t") long offset, Ptr<runtime.page> page2, @Unsigned long index2, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> read_swap_cache_async(misc.swp_entry_t entry, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<Ptr<SwapDefinitions.swap_iocb>> plug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_tsc(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_zero(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __read_overflow2_field(@Unsigned long avail, @Unsigned long wanted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="read_actions_logged((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4)")
    public static int read_actions_logged(Ptr<misc.ctl_table> ro_table, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int read_agp(int bus, int slot2, int func, int cap, Ptr<@Unsigned Integer> order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_cr3_pa() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_default_ldt(Ptr<?> ptr, @Unsigned long bytecount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long read_events(Ptr<runtime.kioctx> ctx, long min_nr, long nr, Ptr<IoDefinitions.io_event> event2, @OriginalName(value="ktime_t") long until) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long read_int(String ptr, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_ldt(Ptr<?> ptr, @Unsigned long bytecount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_name(Ptr<runtime.file> f, String data, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int read_once_policy_nodemask(Ptr<runtime.mempolicy> pol, Ptr<misc.nodemask_t> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int read_pci_config(char bus, char slot2, char func, char offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short read_pci_config_16(char bus, char slot2, char func, char offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char read_pci_config_byte(char bus, char slot2, char func, char offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_pkcs7(Ptr<runtime.file> f, String data, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_policy(Ptr<runtime.file> f, String data, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_version(Ptr<runtime.file> f, String data, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__read_extent_tree_block((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<BufferDefinitions.buffer_head> __read_extent_tree_block(String function, @Unsigned int line2, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_extent_idx> idx, int depth, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __read_vmcore(Ptr<IovDefinitions.iov_iter> iter2, Ptr<@OriginalName(value="loff_t") Long> fpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int read_acpi_id(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_ahead_kb_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="read_ahead_kb_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long read_ahead_kb_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_backend_details(Ptr<XenbusDefinitions.xenbus_device> xendev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> read_cache_folio(Ptr<misc.address_space> mapping, @Unsigned long index2, Ptr<?> filler, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> read_cache_page(Ptr<misc.address_space> mapping, @Unsigned long index2, Ptr<?> filler, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> read_cache_page_gfp(Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_from_oldmem(Ptr<IovDefinitions.iov_iter> iter2, @Unsigned long count, Ptr<@Unsigned Long> ppos, boolean encrypted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void read_into(String buf, @Unsigned int size, state next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_mmp_block(Ptr<SuperDefinitions.super_block> sb, Ptr<Ptr<BufferDefinitions.buffer_head>> bh, @Unsigned @OriginalName(value="ext4_fsblk_t") long mmp_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_msr(Ptr<PtDefinitions.pt_regs> regs, Ptr<misc.ve_info> ve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_only_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="read_only_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long read_only_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void read_persistent_wall_and_boot_offset(Ptr<runtime.timespec64> wall_time, Ptr<runtime.timespec64> boot_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long read_swap_header(Ptr<SwapDefinitions.swap_info_struct> si, Ptr<SwapDefinitions.swap_header> swap_header2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_table_data(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int read_table_data_cont(Ptr<OpalDefinitions.opal_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_verify_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="read_verify_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long read_verify_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long read_vmcore(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum state")
    public static enum state implements Enum<state>,
    TypedEnum<state, Integer>
    {
        Start,
        Collect,
        GotHeader,
        SkipIt,
        GotName,
        CopyFile,
        GotSymlink,
        Reset;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct fuse_read_in in; long long unsigned int attr_ver; }")
    @NotUsableInJava
    public static class read_of_anon_member_of_fuse_io_args
    extends Struct {
        public FuseDefinitions.fuse_read_in in;
        public @Unsigned long attr_ver;
    }

    @Type(noCCodeGeneration=true, cType="struct read_buffer")
    @NotUsableInJava
    public static class read_buffer
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned int cons;
        public @Unsigned int len;
        public char @Size(value=0) [] msg;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int written; long unsigned int count; union { u8 *buf; void *data; }; int error; }")
    @NotUsableInJava
    public static class read_descriptor_t
    extends Struct {
        public @Unsigned long written;
        public @Unsigned long count;
        public misc.arg_of_read_descriptor_t arg;
        public int error;
    }
}

