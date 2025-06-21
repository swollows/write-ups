/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GenpdDefinitions;
import me.bechberger.ebpf.runtime.IomapDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.OppDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class GenericDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_access_phys(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<?> buf, int len, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_group> generic_device_group(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_error_remove_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_fill_statx_atomic_writes(Ptr<runtime.kstat> stat2, @Unsigned int unit_min, @Unsigned int unit_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_fill_statx_attr(Ptr<runtime.inode> inode2, Ptr<runtime.kstat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_fillattr(Ptr<MntDefinitions.mnt_idmap> idmap, @Unsigned int request_mask, Ptr<runtime.inode> inode2, Ptr<runtime.kstat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_hwtstamp_get_lower(Ptr<NetDefinitions.net_device> dev, Ptr<KernelDefinitions.kernel_hwtstamp_config> kernel_cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_hwtstamp_ioctl_lower(Ptr<NetDefinitions.net_device> dev, int cmd, Ptr<KernelDefinitions.kernel_hwtstamp_config> kernel_cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_hwtstamp_set_lower(Ptr<NetDefinitions.net_device> dev, Ptr<KernelDefinitions.kernel_hwtstamp_config> kernel_cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_key_instantiate(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_set_mode(Ptr<AtaDefinitions.ata_link> link2, Ptr<Ptr<AtaDefinitions.ata_device>> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_group> generic_single_device_group(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __generic_file_fsync(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long generic_block_bmap(Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="sector_t") long block, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_buffers_fsync(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, boolean datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_buffers_fsync_noflush(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, boolean datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_bug_clear_once() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_check_addressable(@Unsigned int blocksize_bits, @Unsigned long num_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_ci_d_compare((const struct dentry*)$arg1, $arg2, (const u8*)$arg3, (const struct qstr*)$arg4)")
    public static int generic_ci_d_compare(Ptr<runtime.dentry> dentry2, @Unsigned int len, String str, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_ci_d_hash((const struct dentry*)$arg1, $arg2)")
    public static int generic_ci_d_hash(Ptr<runtime.dentry> dentry2, Ptr<runtime.qstr> str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_ci_match((const struct inode*)$arg1, (const struct qstr*)$arg2, (const struct qstr*)$arg3, (const u8*)$arg4, $arg5)")
    public static int generic_ci_match(Ptr<runtime.inode> parent, Ptr<runtime.qstr> name, Ptr<runtime.qstr> folded_name, Ptr<Character> de_name, @Unsigned int de_name_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_cont_expand_simple(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_encode_ino32_fh(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> fh, Ptr<Integer> max_len, Ptr<runtime.inode> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_fh_to_dentry($arg1, $arg2, $arg3, $arg4, (struct inode* (*)(struct super_block*, long long unsigned int, unsigned int))$arg5)")
    public static Ptr<runtime.dentry> generic_fh_to_dentry(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type, Ptr<?> get_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_fh_to_parent($arg1, $arg2, $arg3, $arg4, (struct inode* (*)(struct super_block*, long long unsigned int, unsigned int))$arg5)")
    public static Ptr<runtime.dentry> generic_fh_to_parent(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type, Ptr<?> get_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_file_fsync(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_online_page(Ptr<runtime.page> page2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_parse_monolithic(Ptr<FsDefinitions.fs_context> fc, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int generic_powersave_bias_target(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int freq_next, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long generic_read_dir(Ptr<runtime.file> filp, String buf, @Unsigned long siz, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_set_sb_d_ops(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_atomic_write_valid(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_delete_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_exec_single(int cpu2, Ptr< @OriginalName(value="call_single_data_t") CallDefinitions.__call_single_data> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_fadvise(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int advice) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long generic_file_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long generic_file_llseek_size(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence, @OriginalName(value="loff_t") long maxsize, @OriginalName(value="loff_t") long eof) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_file_rw_checks(Ptr<runtime.file> file_in, Ptr<runtime.file> file_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long generic_get_unmapped_area(Ptr<runtime.file> filp, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long generic_get_unmapped_area_topdown(Ptr<runtime.file> filp, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_handle_domain_irq(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int hwirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_handle_domain_irq_safe(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int hwirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_handle_domain_nmi(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int hwirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_handle_irq(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_handle_irq_safe(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long generic_hugetlb_get_unmapped_area(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long generic_llseek_cookie(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence, Ptr<@Unsigned Long> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_ptrace_peekdata(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long addr2, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_ptrace_pokedata(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long addr2, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_smp_call_function_single_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_update_time(Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_write_check_limits(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long pos, Ptr<@OriginalName(value="loff_t") Long> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long generic_write_checks(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_write_checks_count(Ptr<runtime.kiocb> iocb2, Ptr<@OriginalName(value="loff_t") Long> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_xdp_install(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_bpf> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_xdp_tx(Ptr<SkDefinitions.sk_buff> skb, Ptr<BpfDefinitions.bpf_prog> xdp_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __generic_file_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__generic_remap_file_range_prep($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct iomap_ops*)$arg7)")
    public static int __generic_remap_file_range_prep(Ptr<runtime.file> file_in, @OriginalName(value="loff_t") long pos_in, Ptr<runtime.file> file_out, @OriginalName(value="loff_t") long pos_out, Ptr<@OriginalName(value="loff_t") Long> len, @Unsigned int remap_flags, Ptr<IomapDefinitions.iomap_ops> dax_read_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_add_lease(Ptr<runtime.file> filp, int arg2, Ptr<Ptr<FileDefinitions.file_lease>> flp, Ptr<Ptr<?>> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_coupler_attach(Ptr<RegulatorDefinitions.regulator_coupler> coupler, Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long generic_file_direct_write(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_file_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long generic_file_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_file_readonly_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long generic_file_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_get_columns($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int generic_get_columns(Ptr<OpalDefinitions.opal_dev> dev, Ptr<Character> table, @Unsigned long start_column, @Unsigned long end_column) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_get_free_region(@Unsigned long base, @Unsigned long size, int replace_reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_get_mtrr(@Unsigned int reg, Ptr<@Unsigned Long> base, Ptr<@Unsigned Long> size, Ptr<@OriginalName(value="mtrr_type") Character> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_get_table_info($arg1, (const u8*)$arg2, $arg3)")
    public static int generic_get_table_info(Ptr<OpalDefinitions.opal_dev> dev, Ptr<Character> table_uid, @Unsigned long column) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_have_wrcomb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long generic_listxattr(Ptr<runtime.dentry> dentry2, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_lr_enable_disable(Ptr<OpalDefinitions.opal_dev> dev, Ptr<Character> uid, boolean rle, boolean wle, boolean rl, boolean wl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_map_delete_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int generic_map_delete_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_map_lookup_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int generic_map_lookup_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_map_update_batch($arg1, $arg2, (const union bpf_attr*)$arg3, $arg4)")
    public static int generic_map_update_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.file> map_file, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long generic_max_swapfile_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_nvdimm_flush(Ptr<NdDefinitions.nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_ops_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long generic_perform_write(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean generic_pipe_buf_get(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_pipe_buf_release(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean generic_pipe_buf_try_steal(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_pw_cmd(Ptr<Character> key2, @Unsigned long key_len, Ptr<Character> cpin_uid, Ptr<OpalDefinitions.opal_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_rebuild_map() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_remap_file_range_prep(Ptr<runtime.file> file_in, @OriginalName(value="loff_t") long pos_in, Ptr<runtime.file> file_out, @OriginalName(value="loff_t") long pos_out, Ptr<@OriginalName(value="loff_t") Long> len, @Unsigned int remap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_set_mtrr(@Unsigned int reg, @Unsigned long base, @Unsigned long size, @OriginalName(value="mtrr_type") char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_setlease(Ptr<runtime.file> filp, int arg2, Ptr<Ptr<FileDefinitions.file_lease>> flp, Ptr<Ptr<?>> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void generic_shutdown_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_swapfile_activate(Ptr<SwapDefinitions.swap_info_struct> sis, Ptr<runtime.file> swap_file, Ptr<@Unsigned @OriginalName(value="sector_t") Long> span) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="generic_table_write_data($arg1, (const long long unsigned int)$arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static int generic_table_write_data(Ptr<OpalDefinitions.opal_dev> dev, @Unsigned long data, @Unsigned long offset, @Unsigned long size, Ptr<Character> uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int generic_validate_add_page(@Unsigned long base, @Unsigned long size, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct generic_pm_domain_data")
    @NotUsableInJava
    public static class generic_pm_domain_data
    extends Struct {
        public PmDefinitions.pm_domain_data base;
        public Ptr<misc.gpd_timing_data> td;
        public misc.notifier_block nb;
        public Ptr<misc.notifier_block> power_nb;
        public int cpu;
        public @Unsigned int performance_state;
        public @Unsigned int default_pstate;
        public @Unsigned int rpm_pstate;
        public boolean hw_mode;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct generic_pm_domain")
    @NotUsableInJava
    public static class generic_pm_domain
    extends Struct {
        public runtime.device dev;
        public DevDefinitions.dev_pm_domain domain;
        public ListDefinitions.list_head gpd_list_node;
        public ListDefinitions.list_head parent_links;
        public ListDefinitions.list_head child_links;
        public ListDefinitions.list_head dev_list;
        public Ptr<DevDefinitions.dev_power_governor> gov;
        public Ptr<GenpdDefinitions.genpd_governor_data> gd;
        public misc.work_struct power_off_work;
        public Ptr<FwnodeDefinitions.fwnode_handle> provider;
        public boolean has_provider;
        public String name;
        public AtomicDefinitions.atomic_t sd_count;
        public misc.gpd_status status;
        public @Unsigned int device_count;
        public @Unsigned int device_id;
        public @Unsigned int suspended_count;
        public @Unsigned int prepared_count;
        public @Unsigned int performance_state;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpus;
        public boolean synced_poweroff;
        public Ptr<?> power_off;
        public Ptr<?> power_on;
        public RawDefinitions.raw_notifier_head power_notifiers;
        public Ptr<OppDefinitions.opp_table> opp_table;
        public Ptr<?> set_performance_state;
        public misc.gpd_dev_ops dev_ops;
        public Ptr<?> set_hwmode_dev;
        public Ptr<?> get_hwmode_dev;
        public Ptr<?> attach_dev;
        public Ptr<?> detach_dev;
        public @Unsigned int flags;
        public Ptr<GenpdDefinitions.genpd_power_state> states;
        public Ptr<?> free_states;
        public @Unsigned int state_count;
        public @Unsigned int state_idx;
        public @Unsigned long on_time;
        public @Unsigned long accounting_time;
        public Ptr<GenpdDefinitions.genpd_lock_ops> lock_ops;
        @InlineUnion(value=17461)
        public  @InlineUnion(value=17461) runtime.mutex mlock;
        @InlineUnion(value=17461)
        public  @InlineUnion(value=17461) AnonDefinitions.anon_member_of_anon_member_of_generic_pm_domain anon39$1;
        @InlineUnion(value=17461)
        public  @InlineUnion(value=17461) AnonDefinitions.anon_member_of_anon_member_of_generic_pm_domain anon39$2;
    }
}

