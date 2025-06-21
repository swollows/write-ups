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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FatDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> __fat_nfs_get_inode(Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino, @Unsigned int generation, @OriginalName(value="loff_t") long i_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_alloc_clusters(Ptr<runtime.inode> inode2, Ptr<Integer> cluster, int nr_cluster) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_collect_bhs(Ptr<Ptr<BufferDefinitions.buffer_head>> bhs, Ptr<Integer> nr_bhs, Ptr<fat_entry> fatent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_count_free_clusters(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fat_dget(Ptr<SuperDefinitions.super_block> sb, int i_logstart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_encode_fh_nostale(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> fh, Ptr<Integer> lenp, Ptr<runtime.inode> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_ent_access_init(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_ent_blocknr(Ptr<SuperDefinitions.super_block> sb, int entry, Ptr<Integer> offset, Ptr<@Unsigned @OriginalName(value="sector_t") Long> blocknr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_ent_bread(Ptr<SuperDefinitions.super_block> sb, Ptr<fat_entry> fatent, int offset, @Unsigned @OriginalName(value="sector_t") long blocknr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_ent_read(Ptr<runtime.inode> inode2, Ptr<fat_entry> fatent, int entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_ent_reada(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.fatent_ra> ra, Ptr<fat_entry> fatent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_ent_write(Ptr<runtime.inode> inode2, Ptr<fat_entry> fatent, int _new, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fat_fh_to_dentry(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fat_fh_to_dentry_nostale(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fh, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fat_fh_to_parent(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fat_fh_to_parent_nostale(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fh, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_free_clusters(Ptr<runtime.inode> inode2, int cluster) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fat_get_parent(Ptr<runtime.dentry> child_dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_mirror_bhs(Ptr<SuperDefinitions.super_block> sb, Ptr<Ptr<BufferDefinitions.buffer_head>> bhs, int nr_bhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fat_nfs_get_inode(Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino, @Unsigned int generation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_ra_init(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.fatent_ra> ra, Ptr<fat_entry> fatent, int ent_limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fat_rebuild_parent(Ptr<SuperDefinitions.super_block> sb, int parent_logstart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_trim_fs(Ptr<runtime.inode> inode2, Ptr<misc.fstrim_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__fat_fs_error($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void __fat_fs_error(Ptr<SuperDefinitions.super_block> sb, int report, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fat_readdir(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx, int short_only, Ptr<fat_ioctl_filldir_callback> both) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fat_remove_entries(Ptr<runtime.inode> dir, @OriginalName(value="loff_t") long pos, int nr_slots) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_fat_msg($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void _fat_msg(Ptr<SuperDefinitions.super_block> sb, String level, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_add_entries(Ptr<runtime.inode> dir, Ptr<?> slots, int nr_slots, Ptr<fat_slot_info> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_add_new_entries(Ptr<runtime.inode> dir, Ptr<?> slots, int nr_slots, Ptr<Integer> nr_cluster, Ptr<Ptr<misc.msdos_dir_entry>> de, Ptr<Ptr<BufferDefinitions.buffer_head>> bh, Ptr<@OriginalName(value="loff_t") Long> i_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_alloc_new_dir(Ptr<runtime.inode> dir, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_chain_add(Ptr<runtime.inode> inode2, int new_dclus, int nr_cluster) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_clusters_flush(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fat_compat_dir_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_compat_ioctl_filldir($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static boolean fat_compat_ioctl_filldir(Ptr<misc.dir_context> ctx, String name, int name_len, @OriginalName(value="loff_t") long offset, @Unsigned long ino, @Unsigned int d_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_dir_empty(Ptr<runtime.inode> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fat_dir_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_get_dotdot_entry(Ptr<runtime.inode> dir, Ptr<Ptr<BufferDefinitions.buffer_head>> bh, Ptr<Ptr<misc.msdos_dir_entry>> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_get_short_entry(Ptr<runtime.inode> dir, Ptr<@OriginalName(value="loff_t") Long> pos, Ptr<Ptr<BufferDefinitions.buffer_head>> bh, Ptr<Ptr<misc.msdos_dir_entry>> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_ioctl_filldir($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static boolean fat_ioctl_filldir(Ptr<misc.dir_context> ctx, String name, int name_len, @OriginalName(value="loff_t") long offset, @Unsigned long ino, @Unsigned int d_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_ioctl_readdir(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, Ptr<?> dirent, @OriginalName(value="filldir_t") Ptr<?> filldir, int short_only, int both) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_parse_long(Ptr<runtime.inode> dir, Ptr<@OriginalName(value="loff_t") Long> pos, Ptr<Ptr<BufferDefinitions.buffer_head>> bh, Ptr<Ptr<misc.msdos_dir_entry>> de, Ptr<Ptr<@Unsigned @OriginalName(value="wchar_t") Short>> unicode, String nr_slots) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_parse_short($arg1, (const struct msdos_dir_entry*)$arg2, $arg3, $arg4)")
    public static int fat_parse_short(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.msdos_dir_entry> de, String name, int dot_hidden) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_remove_entries(Ptr<runtime.inode> dir, Ptr<fat_slot_info> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_scan($arg1, (const u8*)$arg2, $arg3)")
    public static int fat_scan(Ptr<runtime.inode> dir, String name, Ptr<fat_slot_info> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_scan_logstart(Ptr<runtime.inode> dir, int i_logstart, Ptr<fat_slot_info> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_search_long($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int fat_search_long(Ptr<runtime.inode> inode2, String name, int name_len, Ptr<fat_slot_info> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_subdirs(Ptr<runtime.inode> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_sync_bhs(Ptr<Ptr<BufferDefinitions.buffer_head>> bhs, int nr_bhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_time_fat2unix(Ptr<misc.msdos_sb_info> sbi, Ptr<runtime.timespec64> ts, @Unsigned @OriginalName(value="__le16") short __time, @Unsigned @OriginalName(value="__le16") short __date, char time_cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_time_unix2fat(Ptr<misc.msdos_sb_info> sbi, Ptr<runtime.timespec64> ts, Ptr<@Unsigned @OriginalName(value="__le16") Short> time, Ptr<@Unsigned @OriginalName(value="__le16") Short> date, Ptr<Character> time_cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_truncate_atime((const struct msdos_sb_info*)$arg1, (const struct timespec64*)$arg2)")
    public static runtime.timespec64 fat_truncate_atime(Ptr<misc.msdos_sb_info> sbi, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_truncate_mtime((const struct msdos_sb_info*)$arg1, (const struct timespec64*)$arg2)")
    public static runtime.timespec64 fat_truncate_mtime(Ptr<misc.msdos_sb_info> sbi, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_truncate_time(Ptr<runtime.inode> inode2, Ptr<runtime.timespec64> now, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_update_time(Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_zeroed_cluster(Ptr<runtime.inode> dir, @Unsigned @OriginalName(value="sector_t") long blknr, int nr_used, Ptr<Ptr<BufferDefinitions.buffer_head>> bhs, int nr_bhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_cont_expand(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fat_fallocate(Ptr<runtime.file> file2, int mode, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_file_fsync(Ptr<runtime.file> filp, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_file_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_free(Ptr<runtime.inode> inode2, int skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fat_generic_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int fat_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_ioctl_set_attributes(Ptr<runtime.file> file2, Ptr<@Unsigned Integer> user_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_truncate_blocks(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fat_get_block(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long iblock, Ptr<@Unsigned Long> max_blocks, Ptr<BufferDefinitions.buffer_head> bh_result, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fat_write_inode(Ptr<runtime.inode> inode2, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long _fat_bmap(Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_add_cluster(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fat_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_attach(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long i_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_block_truncate_page(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_bmap(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long sector, Ptr<@Unsigned @OriginalName(value="sector_t") Long> phys, Ptr<@Unsigned Long> mapped_blocks, int create, boolean from_bmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fat_build_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.msdos_dir_entry> de, @OriginalName(value="loff_t") long i_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_cache_add(Ptr<runtime.inode> inode2, Ptr<fat_cache_id> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_cache_destroy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_cache_inval_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_calc_dir_size(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_destroy_inodecache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_detach(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fat_direct_IO(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_fill_inode(Ptr<runtime.inode> inode2, Ptr<misc.msdos_dir_entry> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fat_fill_super($arg1, $arg2, (void (*)(struct super_block*))$arg3)")
    public static int fat_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc, Ptr<?> setup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_flush_inodes(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> i1, Ptr<runtime.inode> i2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_free_fc(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_get_block(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long iblock, Ptr<BufferDefinitions.buffer_head> bh_result, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_get_block_bmap(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long iblock, Ptr<BufferDefinitions.buffer_head> bh_result, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_get_cluster(Ptr<runtime.inode> inode2, int cluster, Ptr<Integer> fclus, Ptr<Integer> dclus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_get_mapped_cluster(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long last_block, Ptr<@Unsigned Long> mapped_blocks, Ptr<@Unsigned @OriginalName(value="sector_t") Long> bmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fat_iget(Ptr<SuperDefinitions.super_block> sb, @OriginalName(value="loff_t") long i_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_init_fs_context(Ptr<FsDefinitions.fs_context> fc, boolean is_vfat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2, boolean is_vfat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_put_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_read_bpb(Ptr<SuperDefinitions.super_block> sb, Ptr<fat_boot_sector> b, int silent, Ptr<fat_bios_param_block> bpb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_read_folio(Ptr<runtime.file> file2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_read_static_bpb(Ptr<SuperDefinitions.super_block> sb, Ptr<fat_boot_sector> b, int silent, Ptr<fat_bios_param_block> bpb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_readahead(Ptr<misc.readahead_control> rac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_reconfigure(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fat_set_state(Ptr<SuperDefinitions.super_block> sb, @Unsigned int set, @Unsigned int force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_statfs(Ptr<runtime.dentry> dentry2, Ptr<runtime.kstatfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_sync_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_write_begin(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_write_inode(Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fat_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fat_ioctl_filldir_callback")
    @NotUsableInJava
    public static class fat_ioctl_filldir_callback
    extends Struct {
        public misc.dir_context ctx;
        public Ptr<?> dirent;
        public int result;
        public String longname;
        public int long_len;
        public String shortname;
        public int short_len;
    }

    @Type(noCCodeGeneration=true, cType="struct __fat_dirent")
    @NotUsableInJava
    public static class __fat_dirent
    extends Struct {
        public long d_ino;
        public @OriginalName(value="__kernel_off_t") long d_off;
        public @Unsigned short d_reclen;
        public char @Size(value=256) [] d_name;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_fid")
    @NotUsableInJava
    public static class fat_fid
    extends Struct {
        public @Unsigned int i_gen;
        public @Unsigned int i_pos_low;
        public @Unsigned short i_pos_hi;
        public @Unsigned short parent_i_pos_hi;
        public @Unsigned int parent_i_pos_low;
        public @Unsigned int parent_i_gen;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_slot_info")
    @NotUsableInJava
    public static class fat_slot_info
    extends Struct {
        public @OriginalName(value="loff_t") long i_pos;
        public @OriginalName(value="loff_t") long slot_off;
        public int nr_slots;
        public Ptr<misc.msdos_dir_entry> de;
        public Ptr<BufferDefinitions.buffer_head> bh;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_floppy_defaults")
    @NotUsableInJava
    public static class fat_floppy_defaults
    extends Struct {
        public @Unsigned int nr_sectors;
        public @Unsigned int sec_per_clus;
        public @Unsigned int dir_entries;
        public @Unsigned int media;
        public @Unsigned int fat_length;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_bios_param_block")
    @NotUsableInJava
    public static class fat_bios_param_block
    extends Struct {
        public @Unsigned short fat_sector_size;
        public char fat_sec_per_clus;
        public @Unsigned short fat_reserved;
        public char fat_fats;
        public @Unsigned short fat_dir_entries;
        public @Unsigned short fat_sectors;
        public @Unsigned short fat_fat_length;
        public @Unsigned int fat_total_sect;
        public char fat16_state;
        public @Unsigned int fat16_vol_id;
        public @Unsigned int fat32_length;
        public @Unsigned int fat32_root_cluster;
        public @Unsigned short fat32_info_sector;
        public char fat32_state;
        public @Unsigned int fat32_vol_id;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_boot_fsinfo")
    @NotUsableInJava
    public static class fat_boot_fsinfo
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int signature1;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=120) [] reserved1;
        public @Unsigned @OriginalName(value="__le32") int signature2;
        public @Unsigned @OriginalName(value="__le32") int free_clusters;
        public @Unsigned @OriginalName(value="__le32") int next_cluster;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=4) [] reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_boot_sector")
    @NotUsableInJava
    public static class fat_boot_sector
    extends Struct {
        public char @Size(value=3) [] ignored;
        public char @Size(value=8) [] system_id;
        public char @Size(value=2) [] sector_size;
        public char sec_per_clus;
        public @Unsigned @OriginalName(value="__le16") short reserved;
        public char fats;
        public char @Size(value=2) [] dir_entries;
        public char @Size(value=2) [] sectors;
        public char media;
        public @Unsigned @OriginalName(value="__le16") short fat_length;
        public @Unsigned @OriginalName(value="__le16") short secs_track;
        public @Unsigned @OriginalName(value="__le16") short heads;
        public @Unsigned @OriginalName(value="__le32") int hidden;
        public @Unsigned @OriginalName(value="__le32") int total_sect;
        @InlineUnion(value=11590)
        public @InlineUnion(value=11590) misc.fat16_of_anon_member_of_fat_boot_sector fat16;
        @InlineUnion(value=11590)
        public @InlineUnion(value=11590) misc.fat32_of_anon_member_of_fat_boot_sector fat32;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_cache_id")
    @NotUsableInJava
    public static class fat_cache_id
    extends Struct {
        public @Unsigned int id;
        public int nr_contig;
        public int fcluster;
        public int dcluster;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_cache")
    @NotUsableInJava
    public static class fat_cache
    extends Struct {
        public ListDefinitions.list_head cache_list;
        public int nr_contig;
        public int fcluster;
        public int dcluster;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_entry")
    @NotUsableInJava
    public static class fat_entry
    extends Struct {
        public int entry;
        public UDefinitions.u_of_fat_entry u;
        public int nr_bhs;
        public Ptr<BufferDefinitions.buffer_head> @Size(value=2) [] bhs;
        public Ptr<runtime.inode> fat_inode;
    }

    @Type(noCCodeGeneration=true, cType="struct fat_mount_options")
    @NotUsableInJava
    public static class fat_mount_options
    extends Struct {
        public misc.kuid_t fs_uid;
        public misc.kgid_t fs_gid;
        public @Unsigned short fs_fmask;
        public @Unsigned short fs_dmask;
        public @Unsigned short codepage;
        public int time_offset;
        public String iocharset;
        public @Unsigned short shortname;
        public char name_check;
        public char errors;
        public char nfs;
        public @Unsigned short allow_utime;
        public @Unsigned int quiet;
        public @Unsigned int showexec;
        public @Unsigned int sys_immutable;
        public @Unsigned int dotsOK;
        public @Unsigned int isvfat;
        public @Unsigned int utf8;
        public @Unsigned int unicode_xlate;
        public @Unsigned int numtail;
        public @Unsigned int flush;
        public @Unsigned int nocase;
        public @Unsigned int usefree;
        public @Unsigned int tz_set;
        public @Unsigned int rodir;
        public @Unsigned int discard;
        public @Unsigned int dos1xfloppy;
        public @Unsigned int debug;
    }
}

