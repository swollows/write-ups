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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SimpleDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ShmemDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__shmem_file_setup($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<runtime.file> __shmem_file_setup(Ptr<runtime.vfsmount> mnt, String name, @OriginalName(value="loff_t") long size, @Unsigned long flags, @Unsigned int i_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> __shmem_get_inode(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> dir, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __shmem_huge_global_enabled(Ptr<runtime.inode> inode2, @Unsigned long index2, @OriginalName(value="loff_t") long write_end, boolean shmem_huge_force, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_add_to_page_cache(Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping, @Unsigned long index2, Ptr<?> expected, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> shmem_alloc_and_add_folio(Ptr<VmDefinitions.vm_fault> vmf, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<runtime.inode> inode2, @Unsigned long index2, Ptr<MmDefinitions.mm_struct> fault_mm, @Unsigned long orders) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> shmem_alloc_folio(@Unsigned @OriginalName(value="gfp_t") int gfp, int order, Ptr<shmem_inode_info> info2, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> shmem_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shmem_allowable_huge_orders(Ptr<runtime.inode> inode2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long index2, @OriginalName(value="loff_t") long write_end, boolean shmem_huge_force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean shmem_charge(Ptr<runtime.inode> inode2, long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_create(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_destroy_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shmem_enabled_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_enabled_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long shmem_enabled_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_encode_fh(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> fh, Ptr<Integer> len, Ptr<runtime.inode> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_error_remove_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int shmem_falloc_wait(Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long shmem_fallocate(Ptr<runtime.file> file2, int mode, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int shmem_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> shmem_fh_to_dentry(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long shmem_file_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shmem_file_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_file_setup((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.file> shmem_file_setup(String name, @OriginalName(value="loff_t") long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_file_setup_with_mnt($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.file> shmem_file_setup_with_mnt(Ptr<runtime.vfsmount> mnt, String name, @OriginalName(value="loff_t") long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shmem_file_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shmem_file_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_fileattr_get(Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_fileattr_set(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_free_fc(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_free_in_core_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long shmem_free_swap(Ptr<misc.address_space> mapping, @Unsigned long index2, Ptr<?> radswap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<runtime.dquot>> shmem_get_dquots(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_get_folio(Ptr<runtime.inode> inode2, @Unsigned long index2, @OriginalName(value="loff_t") long write_end, Ptr<Ptr<runtime.folio>> foliop, misc.sgp_type sgp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_get_folio_gfp(Ptr<runtime.inode> inode2, @Unsigned long index2, @OriginalName(value="loff_t") long write_end, Ptr<Ptr<runtime.folio>> foliop, misc.sgp_type sgp, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<VmDefinitions.vm_fault> vmf, Ptr<@Unsigned @OriginalName(value="vm_fault_t") Integer> fault_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> shmem_get_inode(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> dir, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)shmem_get_link($arg1, $arg2, $arg3))")
    public static String shmem_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.offset_ctx> shmem_get_offset_ctx(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> shmem_get_parent(Ptr<runtime.dentry> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> shmem_get_partial_folio(Ptr<runtime.inode> inode2, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mempolicy> shmem_get_policy(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<@Unsigned Long> ilx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shmem_get_unmapped_area(Ptr<runtime.file> file2, @Unsigned long uaddr, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int shmem_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_init_inode(Ptr<?> foo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_initxattrs($arg1, (const struct xattr*)$arg2, $arg3)")
    public static int shmem_initxattrs(Ptr<runtime.inode> inode2, Ptr<runtime.xattr> xattr_array, Ptr<?> fs_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_inode_acct_blocks(Ptr<runtime.inode> inode2, long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_inode_unacct_blocks(Ptr<runtime.inode> inode2, long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_kernel_file_setup((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.file> shmem_kernel_file_setup(String name, @OriginalName(value="loff_t") long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shmem_listxattr(Ptr<runtime.dentry> dentry2, String buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_lock(Ptr<runtime.file> file2, int lock, Ptr<runtime.ucounts> ucounts2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean shmem_mapping(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_match(Ptr<runtime.inode> ino, Ptr<?> vfh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_mfill_atomic_pte(Ptr<PmdDefinitions.pmd_t> dst_pmd, Ptr<VmDefinitions.vm_area_struct> dst_vma, @Unsigned long dst_addr, @Unsigned long src_addr, @Unsigned @OriginalName(value="uffd_flags_t") int flags, Ptr<Ptr<runtime.folio>> foliop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_parse_one(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_parse_options(Ptr<FsDefinitions.fs_context> fc, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shmem_partial_swap_usage(Ptr<misc.address_space> mapping, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_put_link(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_put_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> shmem_read_folio_gfp(Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> shmem_read_mapping_page_gfp(Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_recalc_inode(Ptr<runtime.inode> inode2, long alloced, long swapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_reconfigure(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_rename2(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_replace_folio(Ptr<Ptr<runtime.folio>> foliop, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<shmem_inode_info> info2, @Unsigned long index2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_reserve_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<@Unsigned @OriginalName(value="ino_t") Long> inop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_set_policy(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.mempolicy> mpol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_show_options(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_statfs(Ptr<runtime.dentry> dentry2, Ptr<runtime.kstatfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shmem_swap_usage(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_swapin_folio(Ptr<runtime.inode> inode2, @Unsigned long index2, Ptr<Ptr<runtime.folio>> foliop, misc.sgp_type sgp, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<@Unsigned @OriginalName(value="vm_fault_t") Integer> fault_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int shmem_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String symname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_truncate_range(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_uncharge(Ptr<runtime.inode> inode2, long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_undo_range(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend, boolean unfalloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_unlock_mapping(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_unuse(@Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_unuse_inode(Ptr<runtime.inode> inode2, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long shmem_unused_huge_count(Ptr<SuperDefinitions.super_block> sb, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long shmem_unused_huge_scan(Ptr<SuperDefinitions.super_block> sb, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shmem_unused_huge_shrink(Ptr<shmem_sb_info> sbinfo, Ptr<ShrinkDefinitions.shrink_control> sc, @Unsigned long nr_to_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_write_begin(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_writepage(Ptr<runtime.page> page2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_xattr_handler_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int shmem_xattr_handler_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shmem_xattr_handler_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int shmem_xattr_handler_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_zero_setup(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shmem_swapin_range(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_acquire_dquot(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shmem_alloc_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_check_quota_file(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_dquot_write_info(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shmem_fallback_charge_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shmem_fallback_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_free_file_info(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_get_next_id(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.kqid> qid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_mark_dquot_dirty(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_read_file_info(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_release_dquot(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shmem_write_file_info(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum shmem_param")
    public static enum shmem_param implements Enum<shmem_param>,
    TypedEnum<shmem_param, Integer>
    {
        Opt_gid,
        Opt_huge,
        Opt_mode,
        Opt_mpol,
        Opt_nr_blocks,
        Opt_nr_inodes,
        Opt_size,
        Opt_uid,
        Opt_inode32,
        Opt_inode64,
        Opt_noswap,
        Opt_quota,
        Opt_usrquota,
        Opt_grpquota,
        Opt_usrquota_block_hardlimit,
        Opt_usrquota_inode_hardlimit,
        Opt_grpquota_block_hardlimit,
        Opt_grpquota_inode_hardlimit;

    }

    @Type(noCCodeGeneration=true, cType="struct shmem_options")
    @NotUsableInJava
    public static class shmem_options
    extends Struct {
        public @Unsigned long blocks;
        public @Unsigned long inodes;
        public Ptr<runtime.mempolicy> mpol;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public boolean full_inums;
        public int huge;
        public int seen;
        public boolean noswap;
        public @Unsigned short quota_types;
        public shmem_quota_limits qlimits;
    }

    @Type(noCCodeGeneration=true, cType="struct shmem_falloc")
    @NotUsableInJava
    public static class shmem_falloc
    extends Struct {
        public Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> waitq;
        public @Unsigned long start;
        public @Unsigned long next;
        public @Unsigned long nr_falloced;
        public @Unsigned long nr_unswapped;
    }

    @Type(noCCodeGeneration=true, cType="struct shmem_sb_info")
    @NotUsableInJava
    public static class shmem_sb_info
    extends Struct {
        public @Unsigned long max_blocks;
        public PercpuDefinitions.percpu_counter used_blocks;
        public @Unsigned long max_inodes;
        public @Unsigned long free_ispace;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock stat_lock;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public char huge;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public boolean full_inums;
        public boolean noswap;
        public @Unsigned @OriginalName(value="ino_t") long next_ino;
        public Ptr<@Unsigned @OriginalName(value="ino_t") Long> ino_batch;
        public Ptr<runtime.mempolicy> mpol;
        public  @OriginalName(value="spinlock_t") runtime.spinlock shrinklist_lock;
        public ListDefinitions.list_head shrinklist;
        public @Unsigned long shrinklist_len;
        public shmem_quota_limits qlimits;
    }

    @Type(noCCodeGeneration=true, cType="struct shmem_quota_limits")
    @NotUsableInJava
    public static class shmem_quota_limits
    extends Struct {
        public @OriginalName(value="qsize_t") long usrquota_bhardlimit;
        public @OriginalName(value="qsize_t") long usrquota_ihardlimit;
        public @OriginalName(value="qsize_t") long grpquota_bhardlimit;
        public @OriginalName(value="qsize_t") long grpquota_ihardlimit;
    }

    @Type(noCCodeGeneration=true, cType="struct shmem_inode_info")
    @NotUsableInJava
    public static class shmem_inode_info
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int seals;
        public @Unsigned long flags;
        public @Unsigned long alloced;
        public @Unsigned long swapped;
        @InlineUnion(value=9780)
        public @InlineUnion(value=9780) misc.offset_ctx dir_offsets;
        @InlineUnion(value=9780)
        public  @InlineUnion(value=9780) AnonDefinitions.anon_member_of_anon_member_of_shmem_inode_info anon5$1;
        public runtime.timespec64 i_crtime;
        public misc.shared_policy policy;
        public SimpleDefinitions.simple_xattrs xattrs;
        public @Unsigned long fallocend;
        public @Unsigned int fsflags;
        public AtomicDefinitions.atomic_t stop_eviction;
        public Ptr<runtime.dquot> @Size(value=3) [] i_dquot;
        public runtime.inode vfs_inode;
    }
}

