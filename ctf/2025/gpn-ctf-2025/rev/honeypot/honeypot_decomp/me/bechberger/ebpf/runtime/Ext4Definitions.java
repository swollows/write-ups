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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DxDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.JournalDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MbDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MpageDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Ext4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_block_zero_page_range(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long from, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_check_dir_entry((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static int __ext4_check_dir_entry(String function, @Unsigned int line2, Ptr<runtime.inode> dir, Ptr<runtime.file> filp, Ptr<ext4_dir_entry_2> de, Ptr<BufferDefinitions.buffer_head> bh, String buf, int size, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_expand_extra_isize(Ptr<runtime.inode> inode2, @Unsigned int new_extra_isize, Ptr<ext4_iloc> iloc, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<Integer> no_expand) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_get_inode_loc(Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino, Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc, Ptr<@Unsigned @OriginalName(value="ext4_fsblk_t") Long> ret_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_get_inode_loc_noinmem(Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_iget($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static Ptr<runtime.inode> __ext4_iget(Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino,  @OriginalName(value="ext4_iget_flags") runtime.EXT4_IGET flags, String function, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_journalled_invalidate_folio(Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_mark_inode_dirty($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int __ext4_mark_inode_dirty(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, String func, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_set_acl(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, int type2, Ptr<PosixDefinitions.posix_acl> acl, int xattr_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ext4_update_other_inode_time(Ptr<SuperDefinitions.super_block> sb, @Unsigned long orig_ino, @Unsigned long ino, Ptr<ext4_inode> raw_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _ext4_get_block(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long iblock, Ptr<BufferDefinitions.buffer_head> bh, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_acl_from_disk((const void*)$arg1, $arg2)")
    public static Ptr<PosixDefinitions.posix_acl> ext4_acl_from_disk(Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_acl_to_disk((const struct posix_acl*)$arg1, $arg2)")
    public static Ptr<?> ext4_acl_to_disk(Ptr<PosixDefinitions.posix_acl> acl, Ptr<@Unsigned Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_alloc_da_blocks(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_block_write_begin(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.folio> folio2, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_block_zero_page_range(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long from, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long ext4_bmap(Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_bread(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int block, int map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_bread_batch(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int block, int bh_count, boolean wait, Ptr<Ptr<BufferDefinitions.buffer_head>> bhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_break_layouts(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_buffered_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_can_truncate(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_change_inode_journal_flag(Ptr<runtime.inode> inode2, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_check_all_de(Ptr<runtime.inode> dir, Ptr<BufferDefinitions.buffer_head> bh, Ptr<?> buf, int buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_chunk_trans_blocks(Ptr<runtime.inode> inode2, int nrblocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_clu_alloc_state(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_da_get_block_prep(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long iblock, Ptr<BufferDefinitions.buffer_head> bh, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_da_map_blocks(Ptr<runtime.inode> inode2, Ptr<ext4_map_blocks> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_da_release_space(Ptr<runtime.inode> inode2, int to_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_da_reserve_space(Ptr<runtime.inode> inode2, int nr_resv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_da_update_reserve_space(Ptr<runtime.inode> inode2, int used, int quota_claim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_da_write_begin(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_da_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int ext4_dax_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int ext4_dax_huge_fault(Ptr<VmDefinitions.vm_fault> vmf, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_dax_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_dax_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_dio_alignment(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_dio_write_checks(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from, Ptr<@OriginalName(value="bool") Boolean> ilock_shared, Ptr<@OriginalName(value="bool") Boolean> extend, Ptr<@OriginalName(value="bool") Boolean> unwritten, Ptr<Integer> dio_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_dio_write_end_io(Ptr<runtime.kiocb> iocb2, @OriginalName(value="ssize_t") long size, int error, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_dio_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long ext4_dir_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_dir_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_dirty_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_dirty_inode(Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_do_update_inode(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_do_writepages(Ptr<MpageDefinitions.mpage_da_data> mpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_double_down_write_data_sem(Ptr<runtime.inode> first, Ptr<runtime.inode> second) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_double_up_write_data_sem(Ptr<runtime.inode> orig_inode, Ptr<runtime.inode> donor_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_dx_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ext4_encrypted_get_link($arg1, $arg2, $arg3))")
    public static String ext4_encrypted_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_encrypted_symlink_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int ext4_encrypted_symlink_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_es_is_delayed(Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_es_is_mapped(Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_exit_post_read_processing() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_expand_extra_isize(Ptr<runtime.inode> inode2, @Unsigned int new_extra_isize, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_file_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int ext4_file_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_file_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_file_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_file_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_file_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fill_raw_inode(Ptr<runtime.inode> inode2, Ptr<ext4_inode> raw_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_free_link(Ptr<?> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_generic_write_checks(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> ext4_get_acl(Ptr<runtime.inode> inode2, int type2, boolean rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_block(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long iblock, Ptr<BufferDefinitions.buffer_head> bh, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_block_unwritten(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long iblock, Ptr<BufferDefinitions.buffer_head> bh_result, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_fc_inode_loc(Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_inode_loc(Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ext4_get_link($arg1, $arg2, $arg3))")
    public static String ext4_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_projid(Ptr<runtime.inode> inode2, Ptr<misc.kprojid_t> projid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="qsize_t") Long> ext4_get_reserved_space(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int ext4_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_getblk(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int block, int map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_handle_inode_extension(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="ssize_t") long written, @OriginalName(value="ssize_t") long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_has_group_desc_csum(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_htree_free_dir_info(Ptr<misc.dir_private_info> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_htree_store_dirent(Ptr<runtime.file> dir_file, @Unsigned int hash2, @Unsigned int minor_hash, Ptr<ext4_dir_entry_2> dirent, Ptr<FscryptDefinitions.fscrypt_str> ent_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_acl(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_post_read_processing() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_init_security($arg1, $arg2, $arg3, (const struct qstr*)$arg4)")
    public static int ext4_init_security(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> qstr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_initxattrs($arg1, (const struct xattr*)$arg2, $arg3)")
    public static int ext4_initxattrs(Ptr<runtime.inode> inode2, Ptr<runtime.xattr> xattr_array, Ptr<?> fs_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_inode_attach_jinode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_inode_csum(Ptr<runtime.inode> inode2, Ptr<ext4_inode> raw, Ptr<ext4_inode_info> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_inode_csum_set(Ptr<runtime.inode> inode2, Ptr<ext4_inode> raw, Ptr<ext4_inode_info> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_inode_extension_cleanup(Ptr<runtime.inode> inode2, boolean need_trunc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_inode_is_fast_symlink(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_insert_delayed_blocks(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_invalidate_folio(Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_iomap_begin(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length, @Unsigned int flags, Ptr<runtime.iomap> iomap2, Ptr<runtime.iomap> srcmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_iomap_begin_report(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length, @Unsigned int flags, Ptr<runtime.iomap> iomap2, Ptr<runtime.iomap> srcmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_iomap_end(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length, @OriginalName(value="ssize_t") long written, @Unsigned int flags, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_iomap_overwrite_begin(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length, @Unsigned int flags, Ptr<runtime.iomap> iomap2, Ptr<runtime.iomap> srcmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_iomap_swap_activate(Ptr<SwapDefinitions.swap_info_struct> sis, Ptr<runtime.file> file2, Ptr<@Unsigned @OriginalName(value="sector_t") Long> span) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_issue_zeroout(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_jbd2_inode_add_write(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_journal_folio_buffers(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.folio> folio2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_journalled_dirty_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_journalled_invalidate_folio(Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_journalled_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_journalled_zero_new_buffers(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2, @Unsigned int from, @Unsigned int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long ext4_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_map_create_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_map_blocks> map2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_map_query_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_map_blocks> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mark_iloc_dirty(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_meta_trans_blocks(Ptr<runtime.inode> inode2, int lblocks, int pextents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_move_extents(Ptr<runtime.file> o_filp, Ptr<runtime.file> d_filp, @Unsigned long orig_blk, @Unsigned long donor_blk, @Unsigned long len, Ptr<@Unsigned Long> moved_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mpage_readpages(Ptr<runtime.inode> inode2, Ptr<misc.readahead_control> rac, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_nonda_switch(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_normal_submit_inode_data_buffers(Ptr<Jbd2Definitions.jbd2_inode> jinode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int ext4_page_mkwrite(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_punch_hole(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_read_folio(Ptr<runtime.file> file2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_readahead(Ptr<misc.readahead_control> rac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_release_dir(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_release_file(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_release_folio(Ptr<runtime.folio> folio2, @Unsigned @OriginalName(value="gfp_t") int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_reserve_inode_write(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_sample_last_mounted(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<PosixDefinitions.posix_acl> acl, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_set_aops(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_set_inode_flags(Ptr<runtime.inode> inode2, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_set_iomap(Ptr<runtime.inode> inode2, Ptr<runtime.iomap> iomap2, Ptr<ext4_map_blocks> map2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_truncate(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_update_bh_state(Ptr<BufferDefinitions.buffer_head> bh, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_update_disksize_before_punch(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_wait_for_tail_page_commit(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_walk_page_buffers($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (int (*)(jbd2_journal_handle*, struct inode*, struct buffer_head*))$arg7)")
    public static int ext4_walk_page_buffers(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> head, @Unsigned int from, @Unsigned int to, Ptr<Integer> partial, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_write_begin(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_write_inode(Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_writepage_trans_blocks(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_hurd_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int ext4_xattr_hurd_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_xattr_hurd_list(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_hurd_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int ext4_xattr_hurd_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_security_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int ext4_xattr_security_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_security_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int ext4_xattr_security_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_user_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int ext4_xattr_user_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_xattr_user_list(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_user_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int ext4_xattr_user_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_zero_partial_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ext4_fc_track_create(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ext4_fc_track_link(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ext4_fc_track_unlink(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_forget((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int __ext4_forget(String where, @Unsigned int line2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, int is_metadata, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="ext4_fsblk_t") long blocknr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_handle_dirty_metadata((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int __ext4_handle_dirty_metadata(String where, @Unsigned int line2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_journal_ensure_credits(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, int check_cred, int extend_cred, int revoke_cred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_journal_get_create_access((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int __ext4_journal_get_create_access(String where, @Unsigned int line2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<SuperDefinitions.super_block> sb, Ptr<BufferDefinitions.buffer_head> bh, ext4_journal_trigger_type trigger_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_journal_get_write_access((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int __ext4_journal_get_write_access(String where, @Unsigned int line2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<SuperDefinitions.super_block> sb, Ptr<BufferDefinitions.buffer_head> bh, ext4_journal_trigger_type trigger_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> __ext4_journal_start_reserved(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, @Unsigned int line2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> __ext4_journal_start_sb(Ptr<runtime.inode> inode2, Ptr<SuperDefinitions.super_block> sb, @Unsigned int line2, int type2, int blocks, int rsv_blocks, int revoke_creds) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_journal_stop((const u8*)$arg1, $arg2, $arg3)")
    public static int __ext4_journal_stop(String where, @Unsigned int line2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_xattr_set_credits(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> block_bh, @Unsigned long value_len, boolean is_create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_alloc_branch(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_allocation_request> ar, int indirect_blks, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> offsets, Ptr<runtime.Indirect> branch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_alloc_group_tables(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_new_flex_group_data> flex_gd, @Unsigned int flexbg_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_block_bitmap_csum_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> gdp, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_block_bitmap_csum_verify(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> gdp, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_block_to_path(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int i_block, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> offsets, Ptr<Integer> boundary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_clear_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="ext4_fsblk_t") long block_to_free, @Unsigned long count, Ptr<@Unsigned @OriginalName(value="__le32") Integer> first, Ptr<@Unsigned @OriginalName(value="__le32") Integer> last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_convert_meta_bg(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_count_free(String bitmap2, @Unsigned int numchars) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_discard_allocated_blocks(Ptr<ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_discard_preallocations(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_discard_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_end_buffer_io_sync(Ptr<BufferDefinitions.buffer_head> bh, int uptodate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_evict_ea_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_exit_mballoc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_expand_extra_isize_ea(Ptr<runtime.inode> inode2, int new_extra_isize, Ptr<ext4_inode> raw_inode, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_expand_inode_array(Ptr<Ptr<ext4_xattr_inode_array>> ea_inode_array, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_fc_add_dentry_tlv(Ptr<SuperDefinitions.super_block> sb, Ptr<@Unsigned Integer> crc, Ptr<ext4_fc_dentry_update> fc_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_fc_add_tlv(Ptr<SuperDefinitions.super_block> sb, @Unsigned short tag, @Unsigned short len, Ptr<Character> val, Ptr<@Unsigned Integer> crc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_cleanup(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int full, @Unsigned @OriginalName(value="tid_t") int tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_del(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_destroy_dentry_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_info_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_init(Ptr<SuperDefinitions.super_block> sb, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_init_dentry_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_init_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_mark_ineligible(Ptr<SuperDefinitions.super_block> sb, int reason, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_perform_commit(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_record_regions(Ptr<SuperDefinitions.super_block> sb, int ino, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, int len, int replay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_replay(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<BufferDefinitions.buffer_head> bh, passtype pass, int off, @Unsigned @OriginalName(value="tid_t") int expected_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_fc_replay_check_excluded(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long blk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_replay_cleanup(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_replay_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_fc_tl_mem> tl, Ptr<Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> ext4_fc_reserve_space(Ptr<SuperDefinitions.super_block> sb, int len, Ptr<@Unsigned Integer> crc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_set_bitmaps_and_counters(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_start_update(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_stop_update(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_submit_bh(Ptr<SuperDefinitions.super_block> sb, boolean is_tail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_track_create(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_track_inode(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_track_link(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_track_range(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_track_unlink(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_update_stats(Ptr<SuperDefinitions.super_block> sb, int status, @Unsigned long commit_time, int nblks, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_wait_committing_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_write_inode(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> crc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_write_inode_data(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> crc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fc_write_tail(Ptr<SuperDefinitions.super_block> sb, @Unsigned int crc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Indirect> ext4_find_shared(Ptr<runtime.inode> inode2, int depth, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> offsets, Ptr<runtime.Indirect> chain, Ptr<@Unsigned @OriginalName(value="__le32") Integer> top) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_flex_group_add(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> resize_inode, Ptr<ext4_new_flex_group_data> flex_gd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fname_free_filename(Ptr<ext4_filename> fname2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_fname_from_fscrypt_name($arg1, (const struct fscrypt_name*)$arg2)")
    public static void ext4_fname_from_fscrypt_name(Ptr<ext4_filename> dst, Ptr<FscryptDefinitions.fscrypt_name> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fname_prepare_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, Ptr<ext4_filename> fname2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_fname_setup_filename($arg1, (const struct qstr*)$arg2, $arg3, $arg4)")
    public static int ext4_fname_setup_filename(Ptr<runtime.inode> dir, Ptr<runtime.qstr> iname, int lookup, Ptr<ext4_filename> fname2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_free_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="ext4_fsblk_t") long block, @Unsigned long count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_free_branches(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> parent_bh, Ptr<@Unsigned @OriginalName(value="__le32") Integer> first, Ptr<@Unsigned @OriginalName(value="__le32") Integer> last, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fsmap_from_internal(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fsmap> dest, Ptr<ext4_fsmap> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fsmap_to_internal(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_fsmap> dest, Ptr<runtime.fsmap> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Indirect> ext4_get_branch(Ptr<runtime.inode> inode2, int depth, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> offsets, Ptr<runtime.Indirect> chain, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_context(Ptr<runtime.inode> inode2, Ptr<?> ctx, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const union fscrypt_policy*)ext4_get_dummy_policy($arg1))")
    public static Ptr<FscryptDefinitions.fscrypt_policy> ext4_get_dummy_policy(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_inode_usage(Ptr<runtime.inode> inode2, Ptr<@OriginalName(value="qsize_t") Long> usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_getfsmap(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_fsmap_head> head, @OriginalName(value="ext4_fsmap_format_t") Ptr<?> formatter, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_getfsmap_compare($arg1, (const struct list_head*)$arg2, (const struct list_head*)$arg3)")
    public static int ext4_getfsmap_compare(Ptr<?> priv, Ptr<ListDefinitions.list_head> a, Ptr<ListDefinitions.list_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_getfsmap_datadev(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_fsmap> keys, Ptr<ext4_getfsmap_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_getfsmap_datadev_helper(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int agno, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_getfsmap_dev_compare((const void*)$arg1, (const void*)$arg2)")
    public static int ext4_getfsmap_dev_compare(Ptr<?> p1, Ptr<?> p2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_getfsmap_find_fixed_metadata(Ptr<SuperDefinitions.super_block> sb, Ptr<ListDefinitions.list_head> meta_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_getfsmap_helper(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_getfsmap_info> info2, Ptr<ext4_fsmap> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_getfsmap_is_valid_device(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_fsmap> fm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_getfsmap_logdev(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_fsmap> keys, Ptr<ext4_getfsmap_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_getfsmap_meta_helper(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int agno, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int len, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_group_add(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_new_group_data> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_group_add_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long block, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_group_extend(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es, @Unsigned @OriginalName(value="ext4_fsblk_t") long n_blocks_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_group_extend_no_check(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long o_blocks_count, @OriginalName(value="ext4_grpblk_t") int add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_has_stable_inodes(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ind_map_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_map_blocks> map2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ind_remove_space(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ind_trans_blocks(Ptr<runtime.inode> inode2, int nrblocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_ind_truncate(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ind_truncate_ensure_credits(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh, int revoke_creds) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_mballoc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_inode_bitmap_csum_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> gdp, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_inode_bitmap_csum_verify(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> gdp, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_inode_journal_mode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ioctl_get_encryption_pwsalt(Ptr<runtime.file> filp, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_issue_discard(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group, @OriginalName(value="ext4_grpblk_t") int cluster, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_journal_check_start(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_kvfree_array_rcu(Ptr<?> to_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_list_backups(Ptr<SuperDefinitions.super_block> sb, Ptr<@Unsigned Integer> three, Ptr<@Unsigned Integer> five, Ptr<@Unsigned Integer> seven) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_listxattr(Ptr<runtime.dentry> dentry2, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_lock_group(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_add_groupinfo(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, Ptr<ext4_group_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_alloc_groupinfo(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int ngroups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_check_limits(Ptr<ext4_allocation_context> ac, Ptr<ext4_buddy> e4b, int finish_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_choose_next_group_best_avail(Ptr<ext4_allocation_context> ac, Ptr<criteria> new_cr, Ptr<@Unsigned @OriginalName(value="ext4_group_t") Integer> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_choose_next_group_p2_aligned(Ptr<ext4_allocation_context> ac, Ptr<criteria> new_cr, Ptr<@Unsigned @OriginalName(value="ext4_group_t") Integer> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_clear_bb(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long block, @Unsigned long count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_collect_stats(Ptr<ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_complex_scan_group(Ptr<ext4_allocation_context> ac, Ptr<ext4_buddy> e4b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_discard_group_preallocations(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, Ptr<Integer> busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_discard_lg_preallocations(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_locality_group> lg, int order, int total_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_mb_discard_preallocations_should_retry(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_allocation_context> ac, Ptr<@Unsigned Long> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_find_by_goal(Ptr<ext4_allocation_context> ac, Ptr<ext4_buddy> e4b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_group_info> ext4_mb_find_good_group_avg_frag_lists(Ptr<ext4_allocation_context> ac, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_free_metadata(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_buddy> e4b, Ptr<ext4_free_data> new_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_generate_buddy(Ptr<SuperDefinitions.super_block> sb, Ptr<?> buddy2, Ptr<?> bitmap2, @Unsigned @OriginalName(value="ext4_group_t") int group, Ptr<ext4_group_info> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_generate_from_pa(Ptr<SuperDefinitions.super_block> sb, Ptr<?> bitmap2, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_mb_good_group(Ptr<ext4_allocation_context> ac, @Unsigned @OriginalName(value="ext4_group_t") int group, criteria cr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_good_group_nolock(Ptr<ext4_allocation_context> ac, @Unsigned @OriginalName(value="ext4_group_t") int group, criteria cr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_init(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_init_backend(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_init_cache(Ptr<runtime.folio> folio2, String incore, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_init_group(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_initialize_context(Ptr<ext4_allocation_context> ac, Ptr<ext4_allocation_request> ar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_load_buddy_gfp(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, Ptr<ext4_buddy> e4b, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_mark_bb(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long block, int len, boolean state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_mark_context(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<SuperDefinitions.super_block> sb, boolean state2, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int blkoff, @OriginalName(value="ext4_grpblk_t") int len, int flags, Ptr<@OriginalName(value="ext4_grpblk_t") Integer> ret_changed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_mark_diskspace_used(Ptr<ext4_allocation_context> ac, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, @Unsigned int reserv_clstrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_mark_pa_deleted(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_mb_new_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_allocation_request> ar, Ptr<Integer> errp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_mb_new_blocks_simple(Ptr<ext4_allocation_request> ar, Ptr<Integer> errp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_new_group_pa(Ptr<ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_new_inode_pa(Ptr<ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_normalize_request(Ptr<ext4_allocation_context> ac, Ptr<ext4_allocation_request> ar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_pa_adjust_overlap(Ptr<ext4_allocation_context> ac, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> start, Ptr<@OriginalName(value="loff_t") Long> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_pa_callback(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_pa_put_free(Ptr<ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_group_t") int ext4_mb_prefetch(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @Unsigned int nr, Ptr<Integer> cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_prefetch_fini(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_regular_allocator(Ptr<ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_release(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_release_context(Ptr<ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_release_group_pa(Ptr<ext4_buddy> e4b, Ptr<ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_release_inode_pa(Ptr<ext4_buddy> e4b, Ptr<BufferDefinitions.buffer_head> bitmap_bh, Ptr<ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_scan_aligned(Ptr<ext4_allocation_context> ac, Ptr<ext4_buddy> e4b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ext4_mb_seq_groups_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_seq_groups_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ext4_mb_seq_groups_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_seq_groups_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ext4_mb_seq_structs_summary_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mb_seq_structs_summary_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ext4_mb_seq_structs_summary_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_seq_structs_summary_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_simple_scan_group(Ptr<ext4_allocation_context> ac, Ptr<ext4_buddy> e4b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_try_best_found(Ptr<ext4_allocation_context> ac, Ptr<ext4_buddy> e4b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_unload_buddy(Ptr<ext4_buddy> e4b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_use_best_found(Ptr<ext4_allocation_context> ac, Ptr<ext4_buddy> e4b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mb_use_inode_pa(Ptr<ext4_allocation_context> ac, Ptr<ext4_prealloc_space> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_mb_use_preallocated(Ptr<ext4_allocation_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mballoc_query_range(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int first, @OriginalName(value="ext4_grpblk_t") int end, @OriginalName(value="ext4_mballoc_query_range_fn") Ptr<?> meta_formatter, @OriginalName(value="ext4_mballoc_query_range_fn") Ptr<?> formatter, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_process_freed_data(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="tid_t") int commit_tid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_rcu_ptr_callback(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_resize_begin(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_resize_end(Ptr<SuperDefinitions.super_block> sb, boolean update_backups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_resize_fs(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long n_blocks_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_seq_mb_stats_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_set_context($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int ext4_set_context(Ptr<runtime.inode> inode2, Ptr<?> ctx, @Unsigned long len, Ptr<?> fs_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_setup_new_descs(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_new_flex_group_data> flex_gd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_setup_next_flex_gd(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_new_flex_group_data> flex_gd, @Unsigned @OriginalName(value="ext4_fsblk_t") long n_blocks_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ext4_grpblk_t") int ext4_trim_all_free(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int max, @OriginalName(value="ext4_grpblk_t") int minblocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_trim_fs(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.fstrim_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_trim_interrupted() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_try_merge_freed_extent(Ptr<ext4_sb_info> sbi, Ptr<ext4_free_data> entry, Ptr<ext4_free_data> new_entry, Ptr<RbDefinitions.rb_root> entry_rb_root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_try_to_trim_range(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_buddy> e4b, @OriginalName(value="ext4_grpblk_t") int start, @OriginalName(value="ext4_grpblk_t") int max, @OriginalName(value="ext4_grpblk_t") int minblocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__le32") int ext4_xattr_block_csum(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long block_nr, Ptr<ext4_xattr_header> hdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_xattr_block_csum_set(Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_block_get($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int ext4_xattr_block_get(Ptr<runtime.inode> inode2, int name_index, String name, Ptr<?> buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_block_set(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_xattr_info> i, Ptr<ext4_xattr_block_find> bs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_cmp(Ptr<ext4_xattr_header> header1, Ptr<ext4_xattr_header> header2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MbDefinitions.mb_cache> ext4_xattr_create_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_delete_inode(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<Ptr<ext4_xattr_inode_array>> ea_inode_array, int extra_credits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_xattr_destroy_cache(Ptr<MbDefinitions.mb_cache> cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ext4_xattr_free_space(Ptr<ext4_xattr_entry> last, Ptr<@Unsigned Long> min_offs, Ptr<?> base, Ptr<Integer> total) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_get($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int ext4_xattr_get(Ptr<runtime.inode> inode2, int name_index, String name, Ptr<?> buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_xattr_get_block(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_ibody_get($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int ext4_xattr_ibody_get(Ptr<runtime.inode> inode2, int name_index, String name, Ptr<?> buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_ibody_set(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_xattr_info> i, Ptr<ext4_xattr_ibody_find> is) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_xattr_inode_array_free(Ptr<ext4_xattr_inode_array> ea_inode_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_inode_cache_find($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.inode> ext4_xattr_inode_cache_find(Ptr<runtime.inode> inode2, Ptr<?> value, @Unsigned long value_len, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> ext4_xattr_inode_create(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_xattr_inode_dec_ref_all(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> parent, Ptr<BufferDefinitions.buffer_head> bh, Ptr<ext4_xattr_entry> first, boolean block_csum, Ptr<Ptr<ext4_xattr_inode_array>> ea_inode_array, int extra_credits, boolean skip_quota) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_xattr_inode_free_quota(Ptr<runtime.inode> parent, Ptr<runtime.inode> ea_inode, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_inode_get(Ptr<runtime.inode> inode2, Ptr<ext4_xattr_entry> entry, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_inode_iget(Ptr<runtime.inode> parent, @Unsigned long ea_ino, @Unsigned int ea_inode_hash, Ptr<Ptr<runtime.inode>> ea_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_inode_inc_ref_all(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> parent, Ptr<ext4_xattr_entry> first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_inode_lookup_create($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static Ptr<runtime.inode> ext4_xattr_inode_lookup_create(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<?> value, @Unsigned long value_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_inode_read(Ptr<runtime.inode> ea_inode, Ptr<?> buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_inode_update_ref(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> ea_inode, int ref_change) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_inode_write($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int ext4_xattr_inode_write(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> ea_inode, Ptr<?> buf, int bufsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_list_entries(Ptr<runtime.dentry> dentry2, Ptr<ext4_xattr_entry> entry, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_move_to_block(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_inode> raw_inode, Ptr<ext4_xattr_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_xattr_release_block(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh, Ptr<Ptr<ext4_xattr_inode_array>> ea_inode_array, int extra_credits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_set($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int ext4_xattr_set(Ptr<runtime.inode> inode2, int name_index, String name, Ptr<?> value, @Unsigned long value_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_set_credits(Ptr<runtime.inode> inode2, @Unsigned long value_len, boolean is_create, Ptr<Integer> credits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_xattr_set_entry(Ptr<ext4_xattr_info> i, Ptr<ext4_xattr_search> s2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.inode> new_ea_inode, boolean is_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_set_handle($arg1, $arg2, $arg3, (const u8*)$arg4, (const void*)$arg5, $arg6, $arg7)")
    public static int ext4_xattr_set_handle(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, int name_index, String name, Ptr<?> value, @Unsigned long value_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_xattr_shift_entries(Ptr<ext4_xattr_entry> entry, int value_offs_shift, Ptr<?> to, Ptr<?> from, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_error($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6, (const u8*)$arg7, $arg8_)")
    public static void __ext4_error(Ptr<SuperDefinitions.super_block> sb, String function, @Unsigned int line2, boolean force_ro, int error, @Unsigned long block, String fmt, Object ... param7) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_error_file($arg1, (const u8*)$arg2, $arg3, $arg4, (const u8*)$arg5, $arg6_)")
    public static void __ext4_error_file(Ptr<runtime.file> file2, String function, @Unsigned int line2, @Unsigned @OriginalName(value="ext4_fsblk_t") long block, String fmt, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_error_inode($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, $arg7_)")
    public static void __ext4_error_inode(Ptr<runtime.inode> inode2, String function, @Unsigned int line2, @Unsigned @OriginalName(value="ext4_fsblk_t") long block, int error, String fmt, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_fill_super(Ptr<FsDefinitions.fs_context> fc, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> __ext4_find_entry(Ptr<runtime.inode> dir, Ptr<ext4_filename> fname2, Ptr<Ptr<ext4_dir_entry_2>> res_dir, Ptr<Integer> inlined) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_grp_locked_error((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const u8*)$arg7, $arg8_)")
    public static void __ext4_grp_locked_error(String function, @Unsigned int line2, Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int grp, @Unsigned long ino, @Unsigned @OriginalName(value="ext4_fsblk_t") long block, String fmt, Object ... param7) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_link(Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_msg($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void __ext4_msg(Ptr<SuperDefinitions.super_block> sb, String prefix, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_read_dirblock($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static Ptr<BufferDefinitions.buffer_head> __ext4_read_dirblock(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int block, misc.dirblock_type_t type2, String func, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ext4_remount(Ptr<FsDefinitions.fs_context> fc, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_std_error($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void __ext4_std_error(Ptr<SuperDefinitions.super_block> sb, String function, @Unsigned int line2, int errno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_unlink($arg1, (const struct qstr*)$arg2, $arg3, $arg4)")
    public static int __ext4_unlink(Ptr<runtime.inode> dir, Ptr<runtime.qstr> d_name, Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_warning($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static void __ext4_warning(Ptr<SuperDefinitions.super_block> sb, String function, @Unsigned int line2, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_warning_inode((const struct inode*)$arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static void __ext4_warning_inode(Ptr<runtime.inode> inode2, String function, @Unsigned int line2, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _ext4_show_options(Ptr<SeqDefinitions.seq_file> seq, Ptr<SuperDefinitions.super_block> sb, int nodefs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_acquire_dquot(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_add_dirent_to_inline(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_filename> fname2, Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc, Ptr<?> inline_start, int inline_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_add_entry(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_add_nondir(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.dentry> dentry2, Ptr<Ptr<runtime.inode>> inodep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_alloc_flex_bg_array(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int ngroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> ext4_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_append(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_apply_options(Ptr<FsDefinitions.fs_context> fc, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_bg_has_super(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ext4_bg_num_gdb(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_block_bitmap(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_block_bitmap_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg, @Unsigned @OriginalName(value="ext4_fsblk_t") long blk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_block_group_meta_init(Ptr<SuperDefinitions.super_block> sb, int silent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_calculate_overhead(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_check_descriptors(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long sb_block, Ptr<@Unsigned @OriginalName(value="ext4_group_t") Integer> first_not_zeroed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_check_feature_compatibility(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es, int silent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_check_geometry(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_check_opt_consistency(Ptr<FsDefinitions.fs_context> fc, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_claim_free_clusters(Ptr<ext4_sb_info> sbi, long nclusters, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_clear_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_clear_inode_es(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_clear_journal_err(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_clear_request_list() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_commit_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_convert_inline_data(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_convert_inline_data_nolock(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_convert_inline_data_to_extent(Ptr<misc.address_space> mapping, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_count_free_clusters(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_create(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_create_inline_data(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_cross_rename(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_da_convert_inline_data_to_extent(Ptr<misc.address_space> mapping, Ptr<runtime.inode> inode2, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_da_write_inline_data_begin(Ptr<misc.address_space> mapping, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ext4_decode_error($arg1, $arg2, $arg3))")
    public static String ext4_decode_error(Ptr<SuperDefinitions.super_block> sb, int errno, String nbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_delete_entry(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> dir, Ptr<ext4_dir_entry_2> de_del, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_delete_inline_entry(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> dir, Ptr<ext4_dir_entry_2> de_del, Ptr<BufferDefinitions.buffer_head> bh, Ptr<Integer> has_inline_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_destroy_inline_data(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_destroy_inline_data_nolock(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_destroy_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_dirblock_csum_verify(Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_drop_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_dx_add_entry(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_filename> fname2, Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__le32") int ext4_dx_csum(Ptr<runtime.inode> inode2, Ptr<ext4_dir_entry> dirent, int count_offset, int count, Ptr<DxDefinitions.dx_tail> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_dx_find_entry(Ptr<runtime.inode> dir, Ptr<ext4_filename> fname2, Ptr<Ptr<ext4_dir_entry_2>> res_dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_empty_dir(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_enable_quotas(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_es_cache_extent(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, @Unsigned int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_es_can_be_merged(Ptr<misc.extent_status> es1, Ptr<misc.extent_status> es2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ext4_es_count(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_es_find_extent_range($arg1, (int (*)(struct extent_status*))$arg2, $arg3, $arg4, $arg5)")
    public static void ext4_es_find_extent_range(Ptr<runtime.inode> inode2, Ptr<?> matching_fn, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int end, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_es_free_extent(Ptr<runtime.inode> inode2, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_es_init_tree(Ptr<ext4_es_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_es_insert_delayed_extent(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len, boolean lclu_allocated, boolean end_allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_es_insert_extent(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, @Unsigned int status, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_es_lookup_extent(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> next_lblk, Ptr<misc.extent_status> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_es_register_shrinker(Ptr<ext4_sb_info> sbi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_es_remove_extent(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ext4_es_scan(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_es_scan_clu($arg1, (int (*)(struct extent_status*))$arg2, $arg3)")
    public static boolean ext4_es_scan_clu(Ptr<runtime.inode> inode2, Ptr<?> matching_fn, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_es_scan_range($arg1, (int (*)(struct extent_status*))$arg2, $arg3, $arg4)")
    public static boolean ext4_es_scan_range(Ptr<runtime.inode> inode2, Ptr<?> matching_fn, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, @Unsigned @OriginalName(value="ext4_lblk_t") int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_es_unregister_shrinker(Ptr<ext4_sb_info> sbi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_exit_es() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_exit_fs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_exit_pending() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_migrate(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_swap_inode_data(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<runtime.inode> tmp_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_fc_free(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_feature_set_ok(Ptr<SuperDefinitions.super_block> sb, int readonly) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> ext4_fh_to_dentry(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> ext4_fh_to_parent(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fill_flex_info(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_find_delete_entry($arg1, $arg2, (const struct qstr*)$arg3)")
    public static int ext4_find_delete_entry(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> dir, Ptr<runtime.qstr> d_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_find_dest_de(Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh, Ptr<?> buf, int buf_size, Ptr<ext4_filename> fname2, Ptr<Ptr<ext4_dir_entry_2>> dest_de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_find_entry($arg1, (const struct qstr*)$arg2, $arg3, $arg4)")
    public static Ptr<BufferDefinitions.buffer_head> ext4_find_entry(Ptr<runtime.inode> dir, Ptr<runtime.qstr> d_name, Ptr<Ptr<ext4_dir_entry_2>> res_dir, Ptr<Integer> inlined) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_find_inline_data_nolock(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_find_inline_entry(Ptr<runtime.inode> dir, Ptr<ext4_filename> fname2, Ptr<Ptr<ext4_dir_entry_2>> res_dir, Ptr<Integer> has_inline_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_finish_convert_inline_dir(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> dir_block, Ptr<?> buf, int inline_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_flex_groups_free(Ptr<ext4_sb_info> sbi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_fname_setup_ci_filename($arg1, (const struct qstr*)$arg2, $arg3)")
    public static int ext4_fname_setup_ci_filename(Ptr<runtime.inode> dir, Ptr<runtime.qstr> iname, Ptr<ext4_filename> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_force_commit(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_free_clusters_after_init(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group, Ptr<ext4_group_desc> gdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_free_group_clusters(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_free_group_clusters_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_free_in_core_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_free_inodes_count(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_free_inodes_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_freeze(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_generic_delete_entry(Ptr<runtime.inode> dir, Ptr<ext4_dir_entry_2> de_del, Ptr<BufferDefinitions.buffer_head> bh, Ptr<?> entry_buf, int buf_size, int csum_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<runtime.dquot>> ext4_get_dquots(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_get_first_inline_block(Ptr<runtime.inode> inode2, Ptr<Ptr<ext4_dir_entry_2>> parent_de, Ptr<Integer> retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_group_desc> ext4_get_group_desc(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group, Ptr<Ptr<BufferDefinitions.buffer_head>> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_group_info> ext4_get_group_info(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_get_group_no_and_offset(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long blocknr, Ptr<@Unsigned @OriginalName(value="ext4_group_t") Integer> blockgrpp, Ptr<@OriginalName(value="ext4_grpblk_t") Integer> offsetp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_group_t") int ext4_get_group_number(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> ext4_get_journal_blkdev(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="dev_t") int j_dev, Ptr<@Unsigned @OriginalName(value="ext4_fsblk_t") Long> j_start, Ptr<@Unsigned @OriginalName(value="ext4_fsblk_t") Long> j_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> ext4_get_journal_inode(Ptr<SuperDefinitions.super_block> sb, @Unsigned int journal_inum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_max_inline_size(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> ext4_get_parent(Ptr<runtime.dentry> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__le16") short ext4_group_desc_csum(Ptr<SuperDefinitions.super_block> sb, @Unsigned int block_group, Ptr<ext4_group_desc> gdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_group_desc_csum_set(Ptr<SuperDefinitions.super_block> sb, @Unsigned int block_group, Ptr<ext4_group_desc> gdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_group_desc_csum_verify(Ptr<SuperDefinitions.super_block> sb, @Unsigned int block_group, Ptr<ext4_group_desc> gdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_group_desc_free(Ptr<ext4_sb_info> sbi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_group_desc_init(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es, @Unsigned @OriginalName(value="ext4_fsblk_t") long logical_sb_block, Ptr<@Unsigned @OriginalName(value="ext4_group_t") Integer> first_not_zeroed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_handle_clustersize(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_handle_dirty_dirblock(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_handle_error($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, $arg7)")
    public static void ext4_handle_error(Ptr<SuperDefinitions.super_block> sb, boolean force_ro, int error, @Unsigned int ino, @Unsigned long block, String func, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_has_free_clusters(Ptr<ext4_sb_info> sbi, long nclusters, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_htree_fill_tree(Ptr<runtime.file> dir_file, @Unsigned int start_hash, @Unsigned int start_minor_hash, Ptr<@Unsigned Integer> next_hash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_htree_next_block(Ptr<runtime.inode> dir, @Unsigned int hash2, Ptr<DxDefinitions.dx_frame> frame, Ptr<DxDefinitions.dx_frame> frames, Ptr<@Unsigned Integer> start_hash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_inc_count(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ind_migrate(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_block_bitmap(Ptr<SuperDefinitions.super_block> sb, Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="ext4_group_t") int block_group, Ptr<ext4_group_desc> gdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_dir_entry_2> ext4_init_dot_dotdot(Ptr<runtime.inode> inode2, Ptr<ext4_dir_entry_2> de, int blocksize, int csum_size, @Unsigned int parent_ino, int dotdot_real_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_es() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_fs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_init_journal_params(Ptr<SuperDefinitions.super_block> sb, Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_metadata_csum(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_new_dir(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_pending() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_init_pending_tree(Ptr<ext4_pending_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_symlink_block(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<FscryptDefinitions.fscrypt_str> disk_link) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_initialize_dirent_tail(Ptr<BufferDefinitions.buffer_head> bh, @Unsigned int blocksize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_inline_data_iomap(Ptr<runtime.inode> inode2, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_inline_data_truncate(Ptr<runtime.inode> inode2, Ptr<Integer> has_inline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_inlinedir_to_tree(Ptr<runtime.file> dir_file, Ptr<runtime.inode> dir, @Unsigned @OriginalName(value="ext4_lblk_t") int block, Ptr<DxDefinitions.dx_hash_info> hinfo, @Unsigned int start_hash, @Unsigned int start_minor_hash, Ptr<Integer> has_inline_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_inode_bitmap(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_inode_bitmap_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg, @Unsigned @OriginalName(value="ext4_fsblk_t") long blk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_inode_table(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_inode_table_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg, @Unsigned @OriginalName(value="ext4_fsblk_t") long blk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_inode_to_goal_block(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_insert_dentry(Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2, Ptr<ext4_dir_entry_2> de, int buf_size, Ptr<ext4_filename> fname2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_is_pending(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_itable_unused_count(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_itable_unused_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_journal_bmap(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr<@Unsigned @OriginalName(value="sector_t") Long> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_journal_commit_callback(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, Ptr< @OriginalName(value="transaction_t") misc.transaction_s> txn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_journal_finish_inode_data_buffers(Ptr<Jbd2Definitions.jbd2_inode> jinode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_journal_submit_inode_data_buffers(Ptr<Jbd2Definitions.jbd2_inode> jinode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_journalled_submit_inode_data_buffers(Ptr<Jbd2Definitions.jbd2_inode> jinode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_journalled_writepage_callback(Ptr<runtime.folio> folio2, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_lazyinit_thread(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_load_and_init_journal(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es, Ptr<ext4_fs_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_load_journal(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es, @Unsigned long journal_devnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_load_super(Ptr<SuperDefinitions.super_block> sb, Ptr<@Unsigned @OriginalName(value="ext4_fsblk_t") Long> lsb, int silent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> ext4_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mark_dquot_dirty(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mark_group_bitmap_corrupted(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mark_recovery_complete(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_match($arg1, (const struct ext4_filename*)$arg2, $arg3)")
    public static boolean ext4_match(Ptr<runtime.inode> parent, Ptr<ext4_filename> fname2, Ptr<ext4_dir_entry_2> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_new_meta_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long goal, @Unsigned int flags, Ptr<@Unsigned Long> count, Ptr<Integer> errp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_nfs_commit_metadata(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> ext4_nfs_get_inode(Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino, @Unsigned int generation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_num_base_meta_blocks(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_num_overhead_clusters(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group, Ptr<ext4_group_desc> gdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_percpu_param_destroy(Ptr<ext4_sb_info> sbi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_percpu_param_init(Ptr<ext4_sb_info> sbi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_prepare_inline_data(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_put_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_quota_off(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_quota_on($arg1, $arg2, $arg3, (const struct path*)$arg4)")
    public static int ext4_quota_on(Ptr<SuperDefinitions.super_block> sb, int type2, int format_id, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_quota_read(Ptr<SuperDefinitions.super_block> sb, int type2, String data, @Unsigned long len, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_quota_write($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long ext4_quota_write(Ptr<SuperDefinitions.super_block> sb, int type2, String data, @Unsigned long len, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_read_bh(Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="blk_opf_t") int op_flags, Ptr<?> end_io, boolean simu_fail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_read_bh_lock(Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="blk_opf_t") int op_flags, boolean wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_read_bh_nowait(Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="blk_opf_t") int op_flags, Ptr<?> end_io, boolean simu_fail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_read_block_bitmap(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_read_block_bitmap_nowait(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group, boolean ignore_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_read_inline_data(Ptr<runtime.inode> inode2, Ptr<?> buffer, @Unsigned int len, Ptr<ext4_iloc> iloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_read_inline_dir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx, Ptr<Integer> has_inline_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_read_inline_folio(Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ext4_read_inline_link(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_readpage_inline(Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_reconfigure(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_register_li_request(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int first_not_zeroed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_release_dquot(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_remove_pending(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_rename(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_rename2(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_rename_dir_finish(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_renament> ent, @Unsigned int dir_ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_rename_dir_prepare(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_renament> ent, boolean is_cross) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_resetent(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_renament> ent, @Unsigned int ino, @Unsigned int file_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_run_li_request(Ptr<ext4_li_request> elr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_sb_bread(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="sector_t") long block, @Unsigned @OriginalName(value="blk_opf_t") int op_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_sb_bread_unmovable(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_sb_breadahead_unmovable(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_search_dir(Ptr<BufferDefinitions.buffer_head> bh, String search_buf, int buf_size, Ptr<runtime.inode> dir, Ptr<ext4_filename> fname2, @Unsigned int offset, Ptr<Ptr<ext4_dir_entry_2>> res_dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_seq_es_shrinker_info_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_seq_options_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_set_def_opts(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_setent(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_renament> ent, @Unsigned int ino, @Unsigned int file_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_setup_super(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es, int read_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_should_retry_alloc(Ptr<SuperDefinitions.super_block> sb, Ptr<Integer> retries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_show_options(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_shutdown(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_statfs(Ptr<runtime.dentry> dentry2, Ptr<runtime.kstatfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__le32") int ext4_superblock_csum(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_superblock_csum_set(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int ext4_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String symname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_sync_file(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_sync_fs(Ptr<SuperDefinitions.super_block> sb, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_try_add_inline_entry(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_filename> fname2, Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_try_create_inline_dir(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> parent, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_try_to_write_inline_data(Ptr<misc.address_space> mapping, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_unfreeze(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_unregister_li_request(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_update_dir_count(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<ext4_renament> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_update_dx_flag(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_update_dynamic_rev(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_update_final_de(Ptr<?> de_buf, int old_size, int new_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_update_inline_data(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ext4_used_dirs_count(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_used_dirs_set(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> bg, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_valid_block_bitmap(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> desc, @Unsigned @OriginalName(value="ext4_group_t") int block_group, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_validate_block_bitmap(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> desc, @Unsigned @OriginalName(value="ext4_group_t") int block_group, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_wait_block_bitmap(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_write_dquot(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_write_info(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_write_inline_data(Ptr<runtime.inode> inode2, Ptr<ext4_iloc> iloc, Ptr<?> buffer, @OriginalName(value="loff_t") long pos, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_write_inline_data_end(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_ext_check((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int __ext4_ext_check(String function, @Unsigned int line2, Ptr<runtime.inode> inode2, Ptr<ext4_extent_header> eh, int depth, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_ext_dirty((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int __ext4_ext_dirty(String where, @Unsigned int line2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __ext4_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ext4_new_inode($arg1, $arg2, $arg3, $arg4, (const struct qstr*)$arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static Ptr<runtime.inode> __ext4_new_inode(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> dir, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.qstr> qstr2, @Unsigned int goal, Ptr<@Unsigned @OriginalName(value="uid_t") Integer> owner, @Unsigned int i_flags, int handle_type, @Unsigned int line_no, int nblocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_io_end_vec> ext4_alloc_io_end_vec(Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> io_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ext4_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_begin_enable_verity(Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_bio_write_folio(Ptr<ext4_io_submit> io2, Ptr<runtime.folio> folio2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_cache_extents(Ptr<runtime.inode> inode2, Ptr<ext4_extent_header> eh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_check_blockref((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ext4_check_blockref(String function, @Unsigned int line2, Ptr<runtime.inode> inode2, Ptr<@Unsigned @OriginalName(value="__le32") Integer> p, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_clu_mapped(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lclu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_collapse_range(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ext4_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_convert_unwritten_extents(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="ssize_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_convert_unwritten_io_end_vec(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> io_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ext4_count_dirs(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ext4_count_free_inodes(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_datasem_ensure_credits(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, int check_cred, int restart_cred, int revoke_cred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_destroy_system_zone(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_end_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_end_bitmap_read(Ptr<BufferDefinitions.buffer_head> bh, int uptodate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_end_enable_verity($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int ext4_end_enable_verity(Ptr<runtime.file> filp, Ptr<?> desc, @Unsigned long desc_size, @Unsigned long merkle_tree_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_end_io_rsv_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_exit_pageio() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_exit_sysfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_exit_system_zone() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_calc_credits_for_single_extent(Ptr<runtime.inode> inode2, int nrblocks, Ptr<ext4_ext_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_check_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_clear_bb(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_ext_path> ext4_ext_convert_to_initialized(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_map_blocks> map2, Ptr<ext4_ext_path> path2, int flags, Ptr<@Unsigned Integer> allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_correct_indexes(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_lblk_t") int ext4_ext_determine_insert_hole(Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_fsblk_t") long ext4_ext_find_goal(Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, @Unsigned @OriginalName(value="ext4_lblk_t") int block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_get_access(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_grow_indepth(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_ext_path> ext4_ext_handle_unwritten_extents(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_map_blocks> map2, Ptr<ext4_ext_path> path2, int flags, Ptr<@Unsigned Integer> allocated, @Unsigned @OriginalName(value="ext4_fsblk_t") long newblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_index_trans_blocks(Ptr<runtime.inode> inode2, int extents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_ext_init(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_ext_path> ext4_ext_insert_extent(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, Ptr<ext4_extent> newext, int gb_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_insert_index(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> curp, int logical, @Unsigned @OriginalName(value="ext4_fsblk_t") long ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_map_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_map_blocks> map2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ext4_lblk_t") int ext4_ext_next_allocated_block(Ptr<ext4_ext_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_precache(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_ext_release(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_remove_space(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_replay_set_iblocks(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_ext_replay_shrink_inode(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_replay_update_ex(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int start, int len, int unwritten, @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_rm_idx(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_rm_leaf(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, Ptr<misc.partial_cluster> partial, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_search_left(Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> logical, Ptr<@Unsigned @OriginalName(value="ext4_fsblk_t") Long> phys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_search_right(Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> logical, Ptr<@Unsigned @OriginalName(value="ext4_fsblk_t") Long> phys, Ptr<ext4_extent> ret_ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_shift_extents(Ptr<runtime.inode> inode2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, @Unsigned @OriginalName(value="ext4_lblk_t") int start, @Unsigned @OriginalName(value="ext4_lblk_t") int shift, SHIFT_DIRECTION SHIFT) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_shift_path_extents(Ptr<ext4_ext_path> path2, @Unsigned @OriginalName(value="ext4_lblk_t") int shift, Ptr<runtime.inode> inode2, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, SHIFT_DIRECTION SHIFT) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_split(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned int flags, Ptr<ext4_ext_path> path2, Ptr<ext4_extent> newext, int at) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_ext_tree_init(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_truncate(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_ext_try_to_merge(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, Ptr<ext4_extent> ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ext_try_to_merge_right(Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, Ptr<ext4_extent> ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_ext_try_to_merge_up(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_extent_block_csum_set(Ptr<runtime.inode> inode2, Ptr<ext4_extent_header> eh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ext4_fallocate(Ptr<runtime.file> file2, int mode, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_feat_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fiemap(Ptr<runtime.inode> inode2, Ptr<misc.fiemap_extent_info> fieinfo, @Unsigned long start, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fileattr_get(Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fileattr_set(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_fill_es_cache_info(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int block, @Unsigned @OriginalName(value="ext4_lblk_t") int num, Ptr<misc.fiemap_extent_info> fieinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_ext_path> ext4_find_extent(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int block, Ptr<ext4_ext_path> path2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_finish_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_force_shutdown(Ptr<SuperDefinitions.super_block> sb, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_free_ext_path(Ptr<ext4_ext_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_free_inode(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ext4_generic_attr_show(Ptr<ext4_attr> a, Ptr<ext4_sb_info> sbi, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_generic_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ext4_generic_attr_store(Ptr<ext4_attr> a, Ptr<ext4_sb_info> sbi, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_es_cache(Ptr<runtime.inode> inode2, Ptr<misc.fiemap_extent_info> fieinfo, @Unsigned long start, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> ext4_get_io_end(Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> io_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_verity_descriptor(Ptr<runtime.inode> inode2, Ptr<?> buf, @Unsigned long buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_get_verity_descriptor_location(Ptr<runtime.inode> inode2, Ptr<@Unsigned Long> desc_size_ret, Ptr<@Unsigned Long> desc_pos_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_getfsmap_format(Ptr<ext4_fsmap> xfm, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_inode_table(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, int barrier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> ext4_init_io_end(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_orphan_info(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_pageio() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_sysfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_init_system_zone() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_inode_block_valid(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long start_blk, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_insert_range(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_io_submit_init(Ptr<ext4_io_submit> io2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ioc_getfsmap(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.fsmap_head> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ext4_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ioctl_getlabel(Ptr<ext4_sb_info> sbi, String user_label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ioctl_getuuid(Ptr<ext4_sb_info> sbi, Ptr<fsuuid> ufsuuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ext4_ioctl_group_add(Ptr<runtime.file> file2, Ptr<ext4_new_group_data> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ioctl_setflags(Ptr<runtime.inode> inode2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_ioctl_setlabel($arg1, (const u8*)$arg2)")
    public static int ext4_ioctl_setlabel(Ptr<runtime.file> filp, String user_label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_ioctl_setproject(Ptr<runtime.inode> inode2, @Unsigned int projid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_iomap_xattr_begin(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length, @Unsigned int flags, Ptr<runtime.iomap> iomap2, Ptr<runtime.iomap> srcmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_io_end_vec> ext4_last_io_end_vec(Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> io_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_mark_bitmap_end(int start_bit, int end_bit, String bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_mark_inode_used(Ptr<SuperDefinitions.super_block> sb, int ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_multi_mount_protect(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_fsblk_t") long mmp_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_notify_error_sysfs(Ptr<ext4_sb_info> sbi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_orphan_add(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_orphan_cleanup(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_super_block> es) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_orphan_del(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_orphan_file_add(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_orphan_file_block_trigger(Ptr<Jbd2Definitions.jbd2_buffer_trigger_type> triggers, Ptr<BufferDefinitions.buffer_head> bh, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_orphan_file_empty(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> ext4_orphan_get(Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_process_orphan(Ptr<runtime.inode> inode2, Ptr<Integer> nr_truncates, Ptr<Integer> nr_orphans) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_put_io_end(Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> io_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_put_io_end_defer(Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> io_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> ext4_read_inode_bitmap(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int block_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> ext4_read_merkle_tree_page(Ptr<runtime.inode> inode2, @Unsigned long index2, @Unsigned long num_ra_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_register_sysfs(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_release_io_end(Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> io_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_release_orphan_info(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_release_system_zone(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_remove_blocks(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_extent> ex, Ptr<misc.partial_cluster> partial, @Unsigned @OriginalName(value="ext4_lblk_t") int from, @Unsigned @OriginalName(value="ext4_lblk_t") int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_rereserve_cluster(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_reset_inode_seed(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_sb_block_valid(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_fsblk_t") long start_blk, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_sb_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_sb_setlabel($arg1, (const void*)$arg2)")
    public static void ext4_sb_setlabel(Ptr<ext4_super_block> es, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_sb_setuuid($arg1, (const void*)$arg2)")
    public static void ext4_sb_setuuid(Ptr<ext4_super_block> es, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_setup_system_zone(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_ext_path> ext4_split_convert_extents(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_map_blocks> map2, Ptr<ext4_ext_path> path2, int flags, Ptr<@Unsigned Integer> allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_ext_path> ext4_split_extent(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, Ptr<ext4_map_blocks> map2, int split_flag, int flags, Ptr<@Unsigned Integer> allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ext4_ext_path> ext4_split_extent_at(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<ext4_ext_path> path2, @Unsigned @OriginalName(value="ext4_lblk_t") int split, int split_flag, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_stop_mmpd(Ptr<ext4_sb_info> sbi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_swap_extents(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode1, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk1, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk2, @Unsigned @OriginalName(value="ext4_lblk_t") int count, int unwritten, Ptr<Integer> erp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_unregister_sysfs(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_update_backup_sb($arg1, $arg2, $arg3, $arg4, (const void*)$arg5)")
    public static int ext4_update_backup_sb(Ptr<SuperDefinitions.super_block> sb, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, @Unsigned @OriginalName(value="ext4_group_t") int grp, Ptr<?> func, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_update_overhead(Ptr<SuperDefinitions.super_block> sb, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_update_primary_sb($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static int ext4_update_primary_sb(Ptr<SuperDefinitions.super_block> sb, Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<?> func, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_update_superblocks_fn($arg1, $arg2, (const void*)$arg3)")
    public static int ext4_update_superblocks_fn(Ptr<SuperDefinitions.super_block> sb, Ptr<?> func, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ext4_validate_inode_bitmap(Ptr<SuperDefinitions.super_block> sb, Ptr<ext4_group_desc> desc, @Unsigned @OriginalName(value="ext4_group_t") int block_group, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_write_merkle_tree_block($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int ext4_write_merkle_tree_block(Ptr<runtime.inode> inode2, Ptr<?> buf, @Unsigned long pos, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_trusted_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int ext4_xattr_trusted_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ext4_xattr_trusted_list(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ext4_xattr_trusted_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int ext4_xattr_trusted_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ext4_zero_range(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ext4_zeroout_es(Ptr<runtime.inode> inode2, Ptr<ext4_extent> ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum SHIFT_DIRECTION")
    public static enum SHIFT_DIRECTION implements Enum<SHIFT_DIRECTION>,
    TypedEnum<SHIFT_DIRECTION, Integer>
    {
        SHIFT_LEFT,
        SHIFT_RIGHT;

    }

    @Type(noCCodeGeneration=true, cType="enum passtype")
    public static enum passtype implements Enum<passtype>,
    TypedEnum<passtype, Integer>
    {
        PASS_SCAN,
        PASS_REVOKE,
        PASS_REPLAY;

    }

    @Type(noCCodeGeneration=true, cType="enum criteria")
    public static enum criteria implements Enum<criteria>,
    TypedEnum<criteria, Integer>
    {
        CR_POWER2_ALIGNED,
        CR_GOAL_LEN_FAST,
        CR_BEST_AVAIL_LEN,
        CR_GOAL_LEN_SLOW,
        CR_ANY_FREE,
        EXT4_MB_NUM_CRS;

    }

    @Type(noCCodeGeneration=true, cType="struct fsuuid")
    @NotUsableInJava
    public static class fsuuid
    extends Struct {
        public @Unsigned int fsu_len;
        public @Unsigned int fsu_flags;
        public char @Size(value=0) [] fsu_uuid;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_mount_options")
    @NotUsableInJava
    public static class ext4_mount_options
    extends Struct {
        public @Unsigned long s_mount_opt;
        public @Unsigned long s_mount_opt2;
        public misc.kuid_t s_resuid;
        public misc.kgid_t s_resgid;
        public @Unsigned long s_commit_interval;
        public @Unsigned int s_min_batch_time;
        public @Unsigned int s_max_batch_time;
        public int s_jquota_fmt;
        public String @Size(value=3) [] s_qf_names;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fs_context")
    @NotUsableInJava
    public static class ext4_fs_context
    extends Struct {
        public String @Size(value=3) [] s_qf_names;
        public FscryptDefinitions.fscrypt_dummy_policy dummy_enc_policy;
        public int s_jquota_fmt;
        public @Unsigned short qname_spec;
        public @Unsigned long vals_s_flags;
        public @Unsigned long mask_s_flags;
        public @Unsigned long journal_devnum;
        public @Unsigned long s_commit_interval;
        public @Unsigned long s_stripe;
        public @Unsigned int s_inode_readahead_blks;
        public @Unsigned int s_want_extra_isize;
        public @Unsigned int s_li_wait_mult;
        public @Unsigned int s_max_dir_size_kb;
        public @Unsigned int journal_ioprio;
        public @Unsigned int vals_s_mount_opt;
        public @Unsigned int mask_s_mount_opt;
        public @Unsigned int vals_s_mount_opt2;
        public @Unsigned int mask_s_mount_opt2;
        public @Unsigned int opt_flags;
        public @Unsigned int spec;
        public @Unsigned int s_max_batch_time;
        public @Unsigned int s_min_batch_time;
        public misc.kuid_t s_resuid;
        public misc.kgid_t s_resgid;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long s_sb_block;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_sb_encodings")
    @NotUsableInJava
    public static class ext4_sb_encodings
    extends Struct {
        public @Unsigned short magic;
        public String name;
        public @Unsigned int version;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_err_translation")
    @NotUsableInJava
    public static class ext4_err_translation
    extends Struct {
        public int code;
        public int errno;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_journal_cb_entry")
    @NotUsableInJava
    public static class ext4_journal_cb_entry
    extends Struct {
        public ListDefinitions.list_head jce_list;
        public Ptr<?> jce_func;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_lazy_init")
    @NotUsableInJava
    public static class ext4_lazy_init
    extends Struct {
        public @Unsigned long li_state;
        public ListDefinitions.list_head li_request_list;
        public runtime.mutex li_list_mtx;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_renament")
    @NotUsableInJava
    public static class ext4_renament
    extends Struct {
        public Ptr<runtime.inode> dir;
        public Ptr<runtime.dentry> dentry;
        public Ptr<runtime.inode> inode;
        public boolean is_dir;
        public int dir_nlink_delta;
        public Ptr<BufferDefinitions.buffer_head> bh;
        public Ptr<ext4_dir_entry_2> de;
        public int inlined;
        public Ptr<BufferDefinitions.buffer_head> dir_bh;
        public Ptr<ext4_dir_entry_2> parent_de;
        public int dir_inlined;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_dir_entry_tail")
    @NotUsableInJava
    public static class ext4_dir_entry_tail
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int det_reserved_zero1;
        public @Unsigned @OriginalName(value="__le16") short det_rec_len;
        public char det_reserved_zero2;
        public char det_reserved_ft;
        public @Unsigned @OriginalName(value="__le32") int det_checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_dir_entry")
    @NotUsableInJava
    public static class ext4_dir_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int inode;
        public @Unsigned @OriginalName(value="__le16") short rec_len;
        public @Unsigned @OriginalName(value="__le16") short name_len;
        public char @Size(value=255) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_filename")
    @NotUsableInJava
    public static class ext4_filename
    extends Struct {
        public Ptr<runtime.qstr> usr_fname;
        public FscryptDefinitions.fscrypt_str disk_name;
        public DxDefinitions.dx_hash_info hinfo;
        public FscryptDefinitions.fscrypt_str crypto_buf;
        public runtime.qstr cf_name;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_tl_mem")
    @NotUsableInJava
    public static class ext4_fc_tl_mem
    extends Struct {
        public @Unsigned short fc_tag;
        public @Unsigned short fc_len;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_dentry_update")
    @NotUsableInJava
    public static class ext4_fc_dentry_update
    extends Struct {
        public int fcd_op;
        public int fcd_parent;
        public int fcd_ino;
        public runtime.qstr fcd_name;
        public char @Size(value=40) [] fcd_iname;
        public ListDefinitions.list_head fcd_list;
        public ListDefinitions.list_head fcd_dilist;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_tail")
    @NotUsableInJava
    public static class ext4_fc_tail
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int fc_tid;
        public @Unsigned @OriginalName(value="__le32") int fc_crc;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_inode")
    @NotUsableInJava
    public static class ext4_fc_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int fc_ino;
        public char @Size(value=0) [] fc_raw_inode;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_dentry_info")
    @NotUsableInJava
    public static class ext4_fc_dentry_info
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int fc_parent_ino;
        public @Unsigned @OriginalName(value="__le32") int fc_ino;
        public char @Size(value=0) [] fc_dname;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_del_range")
    @NotUsableInJava
    public static class ext4_fc_del_range
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int fc_ino;
        public @Unsigned @OriginalName(value="__le32") int fc_lblk;
        public @Unsigned @OriginalName(value="__le32") int fc_len;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_add_range")
    @NotUsableInJava
    public static class ext4_fc_add_range
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int fc_ino;
        public char @Size(value=12) [] fc_ex;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_head")
    @NotUsableInJava
    public static class ext4_fc_head
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int fc_features;
        public @Unsigned @OriginalName(value="__le32") int fc_tid;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_tl")
    @NotUsableInJava
    public static class ext4_fc_tl
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short fc_tag;
        public @Unsigned @OriginalName(value="__le16") short fc_len;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_xattr_block_find")
    @NotUsableInJava
    public static class ext4_xattr_block_find
    extends Struct {
        public ext4_xattr_search s;
        public Ptr<BufferDefinitions.buffer_head> bh;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_xattr_ibody_find")
    @NotUsableInJava
    public static class ext4_xattr_ibody_find
    extends Struct {
        public ext4_xattr_search s;
        public ext4_iloc iloc;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_xattr_search")
    @NotUsableInJava
    public static class ext4_xattr_search
    extends Struct {
        public Ptr<ext4_xattr_entry> first;
        public Ptr<?> base;
        public Ptr<?> end;
        public Ptr<ext4_xattr_entry> here;
        public int not_found;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_xattr_info")
    @NotUsableInJava
    public static class ext4_xattr_info
    extends Struct {
        public String name;
        public Ptr<?> value;
        public @Unsigned long value_len;
        public int name_index;
        public int in_inode;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_xattr_entry")
    @NotUsableInJava
    public static class ext4_xattr_entry
    extends Struct {
        public char e_name_len;
        public char e_name_index;
        public @Unsigned @OriginalName(value="__le16") short e_value_offs;
        public @Unsigned @OriginalName(value="__le32") int e_value_inum;
        public @Unsigned @OriginalName(value="__le32") int e_value_size;
        public @Unsigned @OriginalName(value="__le32") int e_hash;
        public char @Size(value=0) [] e_name;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_xattr_header")
    @NotUsableInJava
    public static class ext4_xattr_header
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int h_magic;
        public @Unsigned @OriginalName(value="__le32") int h_refcount;
        public @Unsigned @OriginalName(value="__le32") int h_blocks;
        public @Unsigned @OriginalName(value="__le32") int h_hash;
        public @Unsigned @OriginalName(value="__le32") int h_checksum;
        public @Unsigned int @Size(value=3) [] h_reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_new_flex_group_data")
    @NotUsableInJava
    public static class ext4_new_flex_group_data
    extends Struct {
        public Ptr<ext4_new_group_data> groups;
        public Ptr<@Unsigned Short> bg_flags;
        public @Unsigned @OriginalName(value="ext4_group_t") int resize_bg;
        public @Unsigned @OriginalName(value="ext4_group_t") int count;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_rcu_ptr")
    @NotUsableInJava
    public static class ext4_rcu_ptr
    extends Struct {
        public misc.callback_head rcu;
        public Ptr<?> ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_buddy")
    @NotUsableInJava
    public static class ext4_buddy
    extends Struct {
        public Ptr<runtime.folio> bd_buddy_folio;
        public Ptr<?> bd_buddy;
        public Ptr<runtime.folio> bd_bitmap_folio;
        public Ptr<?> bd_bitmap;
        public Ptr<ext4_group_info> bd_info;
        public Ptr<SuperDefinitions.super_block> bd_sb;
        public @Unsigned short bd_blkbits;
        public @Unsigned @OriginalName(value="ext4_group_t") int bd_group;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_allocation_context")
    @NotUsableInJava
    public static class ext4_allocation_context
    extends Struct {
        public Ptr<runtime.inode> ac_inode;
        public Ptr<SuperDefinitions.super_block> ac_sb;
        public ext4_free_extent ac_o_ex;
        public ext4_free_extent ac_g_ex;
        public ext4_free_extent ac_b_ex;
        public ext4_free_extent ac_f_ex;
        public @OriginalName(value="ext4_grpblk_t") int ac_orig_goal_len;
        public @Unsigned int ac_flags;
        public @Unsigned int ac_groups_linear_remaining;
        public @Unsigned short ac_groups_scanned;
        public @Unsigned short ac_found;
        public @Unsigned short @Size(value=5) [] ac_cX_found;
        public @Unsigned short ac_tail;
        public @Unsigned short ac_buddy;
        public char ac_status;
        public char ac_criteria;
        public char ac_2order;
        public char ac_op;
        public Ptr<runtime.folio> ac_bitmap_folio;
        public Ptr<runtime.folio> ac_buddy_folio;
        public Ptr<ext4_prealloc_space> ac_pa;
        public Ptr<ext4_locality_group> ac_lg;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_free_extent")
    @NotUsableInJava
    public static class ext4_free_extent
    extends Struct {
        public @Unsigned @OriginalName(value="ext4_lblk_t") int fe_logical;
        public @OriginalName(value="ext4_grpblk_t") int fe_start;
        public @Unsigned @OriginalName(value="ext4_group_t") int fe_group;
        public @OriginalName(value="ext4_grpblk_t") int fe_len;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_prealloc_space")
    @NotUsableInJava
    public static class ext4_prealloc_space
    extends Struct {
        public misc.pa_node_of_ext4_prealloc_space pa_node;
        public ListDefinitions.list_head pa_group_list;
        public UDefinitions.u_of_ext4_prealloc_space u;
        public  @OriginalName(value="spinlock_t") runtime.spinlock pa_lock;
        public AtomicDefinitions.atomic_t pa_count;
        public @Unsigned int pa_deleted;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pa_pstart;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int pa_lstart;
        public @OriginalName(value="ext4_grpblk_t") int pa_len;
        public @OriginalName(value="ext4_grpblk_t") int pa_free;
        public @Unsigned short pa_type;
        public misc.pa_node_lock_of_ext4_prealloc_space pa_node_lock;
        public Ptr<runtime.inode> pa_inode;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_free_data")
    @NotUsableInJava
    public static class ext4_free_data
    extends Struct {
        public ListDefinitions.list_head efd_list;
        public RbDefinitions.rb_node efd_node;
        public @Unsigned @OriginalName(value="ext4_group_t") int efd_group;
        public @OriginalName(value="ext4_grpblk_t") int efd_start_cluster;
        public @OriginalName(value="ext4_grpblk_t") int efd_count;
        public @Unsigned @OriginalName(value="tid_t") int efd_tid;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_getfsmap_dev")
    @NotUsableInJava
    public static class ext4_getfsmap_dev
    extends Struct {
        public Ptr<?> gfd_fn;
        public @Unsigned int gfd_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_getfsmap_info")
    @NotUsableInJava
    public static class ext4_getfsmap_info
    extends Struct {
        public Ptr<ext4_fsmap_head> gfi_head;
        public @OriginalName(value="ext4_fsmap_format_t") Ptr<?> gfi_formatter;
        public Ptr<?> gfi_format_arg;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long gfi_next_fsblk;
        public @Unsigned int gfi_dev;
        public @Unsigned @OriginalName(value="ext4_group_t") int gfi_agno;
        public ext4_fsmap gfi_low;
        public ext4_fsmap gfi_high;
        public ext4_fsmap gfi_lastfree;
        public ListDefinitions.list_head gfi_meta_list;
        public boolean gfi_last;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_locality_group")
    @NotUsableInJava
    public static class ext4_locality_group
    extends Struct {
        public runtime.mutex lg_mutex;
        public ListDefinitions.list_head @Size(value=10) [] lg_prealloc_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lg_prealloc_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int a_version; }")
    @NotUsableInJava
    public static class ext4_acl_header
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int a_version;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int e_tag; short unsigned int e_perm; unsigned int e_id; }")
    @NotUsableInJava
    public static class ext4_acl_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short e_tag;
        public @Unsigned @OriginalName(value="__le16") short e_perm;
        public @Unsigned @OriginalName(value="__le32") int e_id;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_xattr_inode_array")
    @NotUsableInJava
    public static class ext4_xattr_inode_array
    extends Struct {
        public @Unsigned int count;
        public Ptr<runtime.inode> @Size(value=0) [] inodes;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_xattr_ibody_header")
    @NotUsableInJava
    public static class ext4_xattr_ibody_header
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int h_magic;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_dir_entry_2")
    @NotUsableInJava
    public static class ext4_dir_entry_2
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int inode;
        public @Unsigned @OriginalName(value="__le16") short rec_len;
        public char name_len;
        public char file_type;
        public char @Size(value=255) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_dir_entry_hash")
    @NotUsableInJava
    public static class ext4_dir_entry_hash
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int hash;
        public @Unsigned @OriginalName(value="__le32") int minor_hash;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_orphan_block_tail")
    @NotUsableInJava
    public static class ext4_orphan_block_tail
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int ob_magic;
        public @Unsigned @OriginalName(value="__le32") int ob_checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_attr")
    @NotUsableInJava
    public static class ext4_attr
    extends Struct {
        public runtime.attribute attr;
        public short attr_id;
        public short attr_ptr;
        public @Unsigned short attr_size;
        public UDefinitions.u_of_ext4_attr u;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_io_submit")
    @NotUsableInJava
    public static class ext4_io_submit
    extends Struct {
        public Ptr<WritebackDefinitions.writeback_control> io_wbc;
        public Ptr<runtime.bio> io_bio;
        public Ptr<@OriginalName(value="ext4_io_end_t") ext4_io_end> io_end;
        public @Unsigned @OriginalName(value="sector_t") long io_next_block;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fsmap_head")
    @NotUsableInJava
    public static class ext4_fsmap_head
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int fmh_iflags;
        public @Unsigned @OriginalName(value="uint32_t") int fmh_oflags;
        public @Unsigned int fmh_count;
        public @Unsigned int fmh_entries;
        public ext4_fsmap @Size(value=2) [] fmh_keys;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fsmap")
    @NotUsableInJava
    public static class ext4_fsmap
    extends Struct {
        public ListDefinitions.list_head fmr_list;
        public @Unsigned @OriginalName(value="dev_t") int fmr_device;
        public @Unsigned @OriginalName(value="uint32_t") int fmr_flags;
        public @Unsigned @OriginalName(value="uint64_t") long fmr_physical;
        public @Unsigned @OriginalName(value="uint64_t") long fmr_owner;
        public @Unsigned @OriginalName(value="uint64_t") long fmr_length;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_new_group_data")
    @NotUsableInJava
    public static class ext4_new_group_data
    extends Struct {
        public @Unsigned int group;
        public @Unsigned long block_bitmap;
        public @Unsigned long inode_bitmap;
        public @Unsigned long inode_table;
        public @Unsigned int blocks_count;
        public @Unsigned short reserved_blocks;
        public @Unsigned short mdata_blocks;
        public @Unsigned int free_clusters_count;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_new_group_input")
    @NotUsableInJava
    public static class ext4_new_group_input
    extends Struct {
        public @Unsigned int group;
        public @Unsigned long block_bitmap;
        public @Unsigned long inode_bitmap;
        public @Unsigned long inode_table;
        public @Unsigned int blocks_count;
        public @Unsigned short reserved_blocks;
        public @Unsigned short unused;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_inode")
    @NotUsableInJava
    public static class ext4_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short i_mode;
        public @Unsigned @OriginalName(value="__le16") short i_uid;
        public @Unsigned @OriginalName(value="__le32") int i_size_lo;
        public @Unsigned @OriginalName(value="__le32") int i_atime;
        public @Unsigned @OriginalName(value="__le32") int i_ctime;
        public @Unsigned @OriginalName(value="__le32") int i_mtime;
        public @Unsigned @OriginalName(value="__le32") int i_dtime;
        public @Unsigned @OriginalName(value="__le16") short i_gid;
        public @Unsigned @OriginalName(value="__le16") short i_links_count;
        public @Unsigned @OriginalName(value="__le32") int i_blocks_lo;
        public @Unsigned @OriginalName(value="__le32") int i_flags;
        public misc.osd1_of_ext4_inode osd1;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=15) [] i_block;
        public @Unsigned @OriginalName(value="__le32") int i_generation;
        public @Unsigned @OriginalName(value="__le32") int i_file_acl_lo;
        public @Unsigned @OriginalName(value="__le32") int i_size_high;
        public @Unsigned @OriginalName(value="__le32") int i_obso_faddr;
        public misc.osd2_of_ext4_inode osd2;
        public @Unsigned @OriginalName(value="__le16") short i_extra_isize;
        public @Unsigned @OriginalName(value="__le16") short i_checksum_hi;
        public @Unsigned @OriginalName(value="__le32") int i_ctime_extra;
        public @Unsigned @OriginalName(value="__le32") int i_mtime_extra;
        public @Unsigned @OriginalName(value="__le32") int i_atime_extra;
        public @Unsigned @OriginalName(value="__le32") int i_crtime;
        public @Unsigned @OriginalName(value="__le32") int i_crtime_extra;
        public @Unsigned @OriginalName(value="__le32") int i_version_hi;
        public @Unsigned @OriginalName(value="__le32") int i_projid;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_ext_path")
    @NotUsableInJava
    public static class ext4_ext_path
    extends Struct {
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long p_block;
        public @Unsigned short p_depth;
        public @Unsigned short p_maxdepth;
        public Ptr<ext4_extent> p_ext;
        public Ptr<ext4_extent_idx> p_idx;
        public Ptr<ext4_extent_header> p_hdr;
        public Ptr<BufferDefinitions.buffer_head> p_bh;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_extent_header")
    @NotUsableInJava
    public static class ext4_extent_header
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short eh_magic;
        public @Unsigned @OriginalName(value="__le16") short eh_entries;
        public @Unsigned @OriginalName(value="__le16") short eh_max;
        public @Unsigned @OriginalName(value="__le16") short eh_depth;
        public @Unsigned @OriginalName(value="__le32") int eh_generation;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_extent_idx")
    @NotUsableInJava
    public static class ext4_extent_idx
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int ei_block;
        public @Unsigned @OriginalName(value="__le32") int ei_leaf_lo;
        public @Unsigned @OriginalName(value="__le16") short ei_leaf_hi;
        public @Unsigned short ei_unused;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_extent")
    @NotUsableInJava
    public static class ext4_extent
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int ee_block;
        public @Unsigned @OriginalName(value="__le16") short ee_len;
        public @Unsigned @OriginalName(value="__le16") short ee_start_hi;
        public @Unsigned @OriginalName(value="__le32") int ee_start_lo;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_extent_tail")
    @NotUsableInJava
    public static class ext4_extent_tail
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int et_checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_iloc")
    @NotUsableInJava
    public static class ext4_iloc
    extends Struct {
        public Ptr<BufferDefinitions.buffer_head> bh;
        public @Unsigned long offset;
        public @Unsigned @OriginalName(value="ext4_group_t") int block_group;
    }

    @Type(noCCodeGeneration=true, cType="enum ext4_journal_trigger_type")
    public static enum ext4_journal_trigger_type implements Enum<ext4_journal_trigger_type>,
    TypedEnum<ext4_journal_trigger_type, Integer>
    {
        EXT4_JTR_ORPHAN_FILE,
        EXT4_JTR_NONE;

    }

    @Type(noCCodeGeneration=true, cType="struct ext4_inode_info")
    @NotUsableInJava
    public static class ext4_inode_info
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int @Size(value=15) [] i_data;
        public @Unsigned int i_dtime;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long i_file_acl;
        public @Unsigned @OriginalName(value="ext4_group_t") int i_block_group;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int i_dir_start_lookup;
        public @Unsigned long i_flags;
        public misc.rw_semaphore xattr_sem;
        @InlineUnion(value=11359)
        public  @InlineUnion(value=11359) ListDefinitions.list_head i_orphan;
        @InlineUnion(value=11359)
        public @InlineUnion(value=11359) @Unsigned int i_orphan_idx;
        public ListDefinitions.list_head i_fc_dilist;
        public ListDefinitions.list_head i_fc_list;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int i_fc_lblk_start;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int i_fc_lblk_len;
        public AtomicDefinitions.atomic_t i_fc_updates;
        public AtomicDefinitions.atomic_t i_unwritten;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head i_fc_wait;
        public runtime.mutex i_fc_lock;
        public @OriginalName(value="loff_t") long i_disksize;
        public misc.rw_semaphore i_data_sem;
        public runtime.inode vfs_inode;
        public Ptr<Jbd2Definitions.jbd2_inode> jinode;
        public  @OriginalName(value="spinlock_t") runtime.spinlock i_raw_lock;
        public runtime.timespec64 i_crtime;
        public AtomicDefinitions.atomic_t i_prealloc_active;
        public @Unsigned int i_reserved_data_blocks;
        public RbDefinitions.rb_root i_prealloc_node;
        public misc.rwlock_t i_prealloc_lock;
        public ext4_es_tree i_es_tree;
        public misc.rwlock_t i_es_lock;
        public ListDefinitions.list_head i_es_list;
        public @Unsigned int i_es_all_nr;
        public @Unsigned int i_es_shk_nr;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int i_es_shrink_lblk;
        public @Unsigned @OriginalName(value="ext4_group_t") int i_last_alloc_group;
        public ext4_pending_tree i_pending_tree;
        public @Unsigned short i_extra_isize;
        public @Unsigned short i_inline_off;
        public @Unsigned short i_inline_size;
        public @OriginalName(value="qsize_t") long i_reserved_quota;
        public  @OriginalName(value="spinlock_t") runtime.spinlock i_completed_io_lock;
        public ListDefinitions.list_head i_rsv_conversion_list;
        public misc.work_struct i_rsv_conversion_work;
        public  @OriginalName(value="spinlock_t") runtime.spinlock i_block_reservation_lock;
        public @Unsigned @OriginalName(value="tid_t") int i_sync_tid;
        public @Unsigned @OriginalName(value="tid_t") int i_datasync_tid;
        public Ptr<runtime.dquot> @Size(value=3) [] i_dquot;
        public @Unsigned int i_csum_seed;
        public misc.kprojid_t i_projid;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_pending_tree")
    @NotUsableInJava
    public static class ext4_pending_tree
    extends Struct {
        public RbDefinitions.rb_root root;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_es_tree")
    @NotUsableInJava
    public static class ext4_es_tree
    extends Struct {
        public RbDefinitions.rb_root root;
        public Ptr<misc.extent_status> cache_es;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_io_end")
    @NotUsableInJava
    public static class ext4_io_end
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle;
        public Ptr<runtime.inode> inode;
        public Ptr<runtime.bio> bio;
        public @Unsigned int flag;
        public  @OriginalName(value="refcount_t") misc.refcount_struct count;
        public ListDefinitions.list_head list_vec;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_io_end_vec")
    @NotUsableInJava
    public static class ext4_io_end_vec
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="loff_t") long offset;
        public @OriginalName(value="ssize_t") long size;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_allocation_request")
    @NotUsableInJava
    public static class ext4_allocation_request
    extends Struct {
        public Ptr<runtime.inode> inode;
        public @Unsigned int len;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int logical;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lleft;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lright;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long goal;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pleft;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pright;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_system_zone")
    @NotUsableInJava
    public static class ext4_system_zone
    extends Struct {
        public RbDefinitions.rb_node node;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long start_blk;
        public @Unsigned int count;
        public @Unsigned int ino;
    }

    @Type(noCCodeGeneration=true, cType="enum ext4_li_mode")
    public static enum ext4_li_mode implements Enum<ext4_li_mode>,
    TypedEnum<ext4_li_mode, Integer>
    {
        EXT4_LI_MODE_PREFETCH_BBITMAP,
        EXT4_LI_MODE_ITABLE;

    }

    @Type(noCCodeGeneration=true, cType="struct ext4_li_request")
    @NotUsableInJava
    public static class ext4_li_request
    extends Struct {
        public Ptr<SuperDefinitions.super_block> lr_super;
        public ext4_li_mode lr_mode;
        public @Unsigned @OriginalName(value="ext4_group_t") int lr_first_not_zeroed;
        public @Unsigned @OriginalName(value="ext4_group_t") int lr_next_group;
        public ListDefinitions.list_head lr_request;
        public @Unsigned long lr_next_sched;
        public @Unsigned long lr_timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_group_info")
    @NotUsableInJava
    public static class ext4_group_info
    extends Struct {
        public @Unsigned long bb_state;
        public RbDefinitions.rb_root bb_free_root;
        public @OriginalName(value="ext4_grpblk_t") int bb_first_free;
        public @OriginalName(value="ext4_grpblk_t") int bb_free;
        public @OriginalName(value="ext4_grpblk_t") int bb_fragments;
        public int bb_avg_fragment_size_order;
        public @OriginalName(value="ext4_grpblk_t") int bb_largest_free_order;
        public @Unsigned @OriginalName(value="ext4_group_t") int bb_group;
        public ListDefinitions.list_head bb_prealloc_list;
        public misc.rw_semaphore alloc_sem;
        public ListDefinitions.list_head bb_avg_fragment_size_node;
        public ListDefinitions.list_head bb_largest_free_order_node;
        public @OriginalName(value="ext4_grpblk_t") int @Size(value=0) [] bb_counters;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_sb_info")
    @NotUsableInJava
    public static class ext4_sb_info
    extends Struct {
        public @Unsigned long s_desc_size;
        public @Unsigned long s_inodes_per_block;
        public @Unsigned long s_blocks_per_group;
        public @Unsigned long s_clusters_per_group;
        public @Unsigned long s_inodes_per_group;
        public @Unsigned long s_itb_per_group;
        public @Unsigned long s_gdb_count;
        public @Unsigned long s_desc_per_block;
        public @Unsigned @OriginalName(value="ext4_group_t") int s_groups_count;
        public @Unsigned @OriginalName(value="ext4_group_t") int s_blockfile_groups;
        public @Unsigned long s_overhead;
        public @Unsigned int s_cluster_ratio;
        public @Unsigned int s_cluster_bits;
        public @OriginalName(value="loff_t") long s_bitmap_maxbytes;
        public Ptr<BufferDefinitions.buffer_head> s_sbh;
        public Ptr<ext4_super_block> s_es;
        public Ptr<Ptr<BufferDefinitions.buffer_head>> s_group_desc;
        public @Unsigned int s_mount_opt;
        public @Unsigned int s_mount_opt2;
        public @Unsigned long s_mount_flags;
        public @Unsigned int s_def_mount_opt;
        public @Unsigned int s_def_mount_opt2;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long s_sb_block;
        public misc.atomic64_t s_resv_clusters;
        public misc.kuid_t s_resuid;
        public misc.kgid_t s_resgid;
        public @Unsigned short s_mount_state;
        public @Unsigned short s_pad;
        public int s_addr_per_block_bits;
        public int s_desc_per_block_bits;
        public int s_inode_size;
        public int s_first_ino;
        public @Unsigned int s_inode_readahead_blks;
        public @Unsigned int s_inode_goal;
        public @Unsigned int @Size(value=4) [] s_hash_seed;
        public int s_def_hash_version;
        public int s_hash_unsigned;
        public PercpuDefinitions.percpu_counter s_freeclusters_counter;
        public PercpuDefinitions.percpu_counter s_freeinodes_counter;
        public PercpuDefinitions.percpu_counter s_dirs_counter;
        public PercpuDefinitions.percpu_counter s_dirtyclusters_counter;
        public PercpuDefinitions.percpu_counter s_sra_exceeded_retry_limit;
        public Ptr<misc.blockgroup_lock> s_blockgroup_lock;
        public Ptr<ProcDefinitions.proc_dir_entry> s_proc;
        public runtime.kobject s_kobj;
        public runtime.completion s_kobj_unregister;
        public Ptr<SuperDefinitions.super_block> s_sb;
        public Ptr<BufferDefinitions.buffer_head> s_mmp_bh;
        public Ptr<JournalDefinitions.journal_s> s_journal;
        public @Unsigned long s_ext4_flags;
        public runtime.mutex s_orphan_lock;
        public ListDefinitions.list_head s_orphan;
        public ext4_orphan_info s_orphan_info;
        public @Unsigned long s_commit_interval;
        public @Unsigned int s_max_batch_time;
        public @Unsigned int s_min_batch_time;
        public Ptr<runtime.file> s_journal_bdev_file;
        public String @Size(value=3) [] s_qf_names;
        public int s_jquota_fmt;
        public @Unsigned int s_want_extra_isize;
        public Ptr<ext4_system_blocks> s_system_blks;
        public Ptr<Ptr<Ptr<ext4_group_info>>> s_group_info;
        public Ptr<runtime.inode> s_buddy_cache;
        public  @OriginalName(value="spinlock_t") runtime.spinlock s_md_lock;
        public Ptr<@Unsigned Short> s_mb_offsets;
        public Ptr<@Unsigned Integer> s_mb_maxs;
        public @Unsigned int s_group_info_size;
        public @Unsigned int s_mb_free_pending;
        public ListDefinitions.list_head @Size(value=2) [] s_freed_data_list;
        public ListDefinitions.list_head s_discard_list;
        public misc.work_struct s_discard_work;
        public AtomicDefinitions.atomic_t s_retry_alloc_pending;
        public Ptr<ListDefinitions.list_head> s_mb_avg_fragment_size;
        public Ptr<misc.rwlock_t> s_mb_avg_fragment_size_locks;
        public Ptr<ListDefinitions.list_head> s_mb_largest_free_orders;
        public Ptr<misc.rwlock_t> s_mb_largest_free_orders_locks;
        public @Unsigned long s_stripe;
        public @Unsigned int s_mb_max_linear_groups;
        public @Unsigned int s_mb_stream_request;
        public @Unsigned int s_mb_max_to_scan;
        public @Unsigned int s_mb_min_to_scan;
        public @Unsigned int s_mb_stats;
        public @Unsigned int s_mb_order2_reqs;
        public @Unsigned int s_mb_group_prealloc;
        public @Unsigned int s_max_dir_size_kb;
        public @Unsigned long s_mb_last_group;
        public @Unsigned long s_mb_last_start;
        public @Unsigned int s_mb_prefetch;
        public @Unsigned int s_mb_prefetch_limit;
        public @Unsigned int s_mb_best_avail_max_trim_order;
        public AtomicDefinitions.atomic_t s_bal_reqs;
        public AtomicDefinitions.atomic_t s_bal_success;
        public AtomicDefinitions.atomic_t s_bal_allocated;
        public AtomicDefinitions.atomic_t s_bal_ex_scanned;
        public AtomicDefinitions.atomic_t @Size(value=5) [] s_bal_cX_ex_scanned;
        public AtomicDefinitions.atomic_t s_bal_groups_scanned;
        public AtomicDefinitions.atomic_t s_bal_goals;
        public AtomicDefinitions.atomic_t s_bal_len_goals;
        public AtomicDefinitions.atomic_t s_bal_breaks;
        public AtomicDefinitions.atomic_t s_bal_2orders;
        public AtomicDefinitions.atomic_t s_bal_p2_aligned_bad_suggestions;
        public AtomicDefinitions.atomic_t s_bal_goal_fast_bad_suggestions;
        public AtomicDefinitions.atomic_t s_bal_best_avail_bad_suggestions;
        public misc.atomic64_t @Size(value=5) [] s_bal_cX_groups_considered;
        public misc.atomic64_t @Size(value=5) [] s_bal_cX_hits;
        public misc.atomic64_t @Size(value=5) [] s_bal_cX_failed;
        public AtomicDefinitions.atomic_t s_mb_buddies_generated;
        public misc.atomic64_t s_mb_generation_time;
        public AtomicDefinitions.atomic_t s_mb_lost_chunks;
        public AtomicDefinitions.atomic_t s_mb_preallocated;
        public AtomicDefinitions.atomic_t s_mb_discarded;
        public AtomicDefinitions.atomic_t s_lock_busy;
        public Ptr<ext4_locality_group> s_locality_groups;
        public @Unsigned long s_sectors_written_start;
        public @Unsigned long s_kbytes_written;
        public @Unsigned int s_extent_max_zeroout_kb;
        public @Unsigned int s_log_groups_per_flex;
        public Ptr<Ptr<misc.flex_groups>> s_flex_groups;
        public @Unsigned @OriginalName(value="ext4_group_t") int s_flex_groups_allocated;
        public Ptr<WorkqueueDefinitions.workqueue_struct> rsv_conversion_wq;
        public TimerDefinitions.timer_list s_err_report;
        public Ptr<ext4_li_request> s_li_request;
        public @Unsigned int s_li_wait_mult;
        public Ptr<TaskDefinitions.task_struct> s_mmp_tsk;
        public @Unsigned long s_last_trim_minblks;
        public Ptr<CryptoDefinitions.crypto_shash> s_chksum_driver;
        public @Unsigned int s_csum_seed;
        public Ptr<runtime.shrinker> s_es_shrinker;
        public ListDefinitions.list_head s_es_list;
        public long s_es_nr_inode;
        public ext4_es_stats s_es_stats;
        public Ptr<MbDefinitions.mb_cache> s_ea_block_cache;
        public Ptr<MbDefinitions.mb_cache> s_ea_inode_cache;
        public  @OriginalName(value="spinlock_t") runtime.spinlock s_es_lock;
        public ext4_journal_trigger @Size(value=1) [] s_journal_triggers;
        public misc.ratelimit_state s_err_ratelimit_state;
        public misc.ratelimit_state s_warning_ratelimit_state;
        public misc.ratelimit_state s_msg_ratelimit_state;
        public AtomicDefinitions.atomic_t s_warning_count;
        public AtomicDefinitions.atomic_t s_msg_count;
        public FscryptDefinitions.fscrypt_dummy_policy s_dummy_enc_policy;
        public PercpuDefinitions.percpu_rw_semaphore s_writepages_rwsem;
        public Ptr<DaxDefinitions.dax_device> s_daxdev;
        public @Unsigned long s_dax_part_off;
        public @Unsigned @OriginalName(value="errseq_t") int s_bdev_wb_err;
        public  @OriginalName(value="spinlock_t") runtime.spinlock s_bdev_wb_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock s_error_lock;
        public int s_add_error_count;
        public int s_first_error_code;
        public @Unsigned int s_first_error_line;
        public @Unsigned int s_first_error_ino;
        public @Unsigned long s_first_error_block;
        public String s_first_error_func;
        public @OriginalName(value="time64_t") long s_first_error_time;
        public int s_last_error_code;
        public @Unsigned int s_last_error_line;
        public @Unsigned int s_last_error_ino;
        public @Unsigned long s_last_error_block;
        public String s_last_error_func;
        public @OriginalName(value="time64_t") long s_last_error_time;
        public misc.work_struct s_sb_upd_work;
        public AtomicDefinitions.atomic_t s_fc_subtid;
        public ListDefinitions.list_head @Size(value=2) [] s_fc_q;
        public ListDefinitions.list_head @Size(value=2) [] s_fc_dentry_q;
        public @Unsigned int s_fc_bytes;
        public  @OriginalName(value="spinlock_t") runtime.spinlock s_fc_lock;
        public Ptr<BufferDefinitions.buffer_head> s_fc_bh;
        public ext4_fc_stats s_fc_stats;
        public @Unsigned @OriginalName(value="tid_t") int s_fc_ineligible_tid;
        public ext4_fc_replay_state s_fc_replay_state;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_orphan_info")
    @NotUsableInJava
    public static class ext4_orphan_info
    extends Struct {
        public int of_blocks;
        public @Unsigned int of_csum_seed;
        public Ptr<ext4_orphan_block> of_binfo;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_orphan_block")
    @NotUsableInJava
    public static class ext4_orphan_block
    extends Struct {
        public AtomicDefinitions.atomic_t ob_free_entries;
        public Ptr<BufferDefinitions.buffer_head> ob_bh;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_journal_trigger")
    @NotUsableInJava
    public static class ext4_journal_trigger
    extends Struct {
        public Jbd2Definitions.jbd2_buffer_trigger_type tr_triggers;
        public Ptr<SuperDefinitions.super_block> sb;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_super_block")
    @NotUsableInJava
    public static class ext4_super_block
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int s_inodes_count;
        public @Unsigned @OriginalName(value="__le32") int s_blocks_count_lo;
        public @Unsigned @OriginalName(value="__le32") int s_r_blocks_count_lo;
        public @Unsigned @OriginalName(value="__le32") int s_free_blocks_count_lo;
        public @Unsigned @OriginalName(value="__le32") int s_free_inodes_count;
        public @Unsigned @OriginalName(value="__le32") int s_first_data_block;
        public @Unsigned @OriginalName(value="__le32") int s_log_block_size;
        public @Unsigned @OriginalName(value="__le32") int s_log_cluster_size;
        public @Unsigned @OriginalName(value="__le32") int s_blocks_per_group;
        public @Unsigned @OriginalName(value="__le32") int s_clusters_per_group;
        public @Unsigned @OriginalName(value="__le32") int s_inodes_per_group;
        public @Unsigned @OriginalName(value="__le32") int s_mtime;
        public @Unsigned @OriginalName(value="__le32") int s_wtime;
        public @Unsigned @OriginalName(value="__le16") short s_mnt_count;
        public @Unsigned @OriginalName(value="__le16") short s_max_mnt_count;
        public @Unsigned @OriginalName(value="__le16") short s_magic;
        public @Unsigned @OriginalName(value="__le16") short s_state;
        public @Unsigned @OriginalName(value="__le16") short s_errors;
        public @Unsigned @OriginalName(value="__le16") short s_minor_rev_level;
        public @Unsigned @OriginalName(value="__le32") int s_lastcheck;
        public @Unsigned @OriginalName(value="__le32") int s_checkinterval;
        public @Unsigned @OriginalName(value="__le32") int s_creator_os;
        public @Unsigned @OriginalName(value="__le32") int s_rev_level;
        public @Unsigned @OriginalName(value="__le16") short s_def_resuid;
        public @Unsigned @OriginalName(value="__le16") short s_def_resgid;
        public @Unsigned @OriginalName(value="__le32") int s_first_ino;
        public @Unsigned @OriginalName(value="__le16") short s_inode_size;
        public @Unsigned @OriginalName(value="__le16") short s_block_group_nr;
        public @Unsigned @OriginalName(value="__le32") int s_feature_compat;
        public @Unsigned @OriginalName(value="__le32") int s_feature_incompat;
        public @Unsigned @OriginalName(value="__le32") int s_feature_ro_compat;
        public char @Size(value=16) [] s_uuid;
        public char @Size(value=16) [] s_volume_name;
        public char @Size(value=64) [] s_last_mounted;
        public @Unsigned @OriginalName(value="__le32") int s_algorithm_usage_bitmap;
        public char s_prealloc_blocks;
        public char s_prealloc_dir_blocks;
        public @Unsigned @OriginalName(value="__le16") short s_reserved_gdt_blocks;
        public char @Size(value=16) [] s_journal_uuid;
        public @Unsigned @OriginalName(value="__le32") int s_journal_inum;
        public @Unsigned @OriginalName(value="__le32") int s_journal_dev;
        public @Unsigned @OriginalName(value="__le32") int s_last_orphan;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=4) [] s_hash_seed;
        public char s_def_hash_version;
        public char s_jnl_backup_type;
        public @Unsigned @OriginalName(value="__le16") short s_desc_size;
        public @Unsigned @OriginalName(value="__le32") int s_default_mount_opts;
        public @Unsigned @OriginalName(value="__le32") int s_first_meta_bg;
        public @Unsigned @OriginalName(value="__le32") int s_mkfs_time;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=17) [] s_jnl_blocks;
        public @Unsigned @OriginalName(value="__le32") int s_blocks_count_hi;
        public @Unsigned @OriginalName(value="__le32") int s_r_blocks_count_hi;
        public @Unsigned @OriginalName(value="__le32") int s_free_blocks_count_hi;
        public @Unsigned @OriginalName(value="__le16") short s_min_extra_isize;
        public @Unsigned @OriginalName(value="__le16") short s_want_extra_isize;
        public @Unsigned @OriginalName(value="__le32") int s_flags;
        public @Unsigned @OriginalName(value="__le16") short s_raid_stride;
        public @Unsigned @OriginalName(value="__le16") short s_mmp_update_interval;
        public @Unsigned @OriginalName(value="__le64") long s_mmp_block;
        public @Unsigned @OriginalName(value="__le32") int s_raid_stripe_width;
        public char s_log_groups_per_flex;
        public char s_checksum_type;
        public char s_encryption_level;
        public char s_reserved_pad;
        public @Unsigned @OriginalName(value="__le64") long s_kbytes_written;
        public @Unsigned @OriginalName(value="__le32") int s_snapshot_inum;
        public @Unsigned @OriginalName(value="__le32") int s_snapshot_id;
        public @Unsigned @OriginalName(value="__le64") long s_snapshot_r_blocks_count;
        public @Unsigned @OriginalName(value="__le32") int s_snapshot_list;
        public @Unsigned @OriginalName(value="__le32") int s_error_count;
        public @Unsigned @OriginalName(value="__le32") int s_first_error_time;
        public @Unsigned @OriginalName(value="__le32") int s_first_error_ino;
        public @Unsigned @OriginalName(value="__le64") long s_first_error_block;
        public char @Size(value=32) [] s_first_error_func;
        public @Unsigned @OriginalName(value="__le32") int s_first_error_line;
        public @Unsigned @OriginalName(value="__le32") int s_last_error_time;
        public @Unsigned @OriginalName(value="__le32") int s_last_error_ino;
        public @Unsigned @OriginalName(value="__le32") int s_last_error_line;
        public @Unsigned @OriginalName(value="__le64") long s_last_error_block;
        public char @Size(value=32) [] s_last_error_func;
        public char @Size(value=64) [] s_mount_opts;
        public @Unsigned @OriginalName(value="__le32") int s_usr_quota_inum;
        public @Unsigned @OriginalName(value="__le32") int s_grp_quota_inum;
        public @Unsigned @OriginalName(value="__le32") int s_overhead_clusters;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=2) [] s_backup_bgs;
        public char @Size(value=4) [] s_encrypt_algos;
        public char @Size(value=16) [] s_encrypt_pw_salt;
        public @Unsigned @OriginalName(value="__le32") int s_lpf_ino;
        public @Unsigned @OriginalName(value="__le32") int s_prj_quota_inum;
        public @Unsigned @OriginalName(value="__le32") int s_checksum_seed;
        public char s_wtime_hi;
        public char s_mtime_hi;
        public char s_mkfs_time_hi;
        public char s_lastcheck_hi;
        public char s_first_error_time_hi;
        public char s_last_error_time_hi;
        public char s_first_error_errcode;
        public char s_last_error_errcode;
        public @Unsigned @OriginalName(value="__le16") short s_encoding;
        public @Unsigned @OriginalName(value="__le16") short s_encoding_flags;
        public @Unsigned @OriginalName(value="__le32") int s_orphan_file_inum;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=94) [] s_reserved;
        public @Unsigned @OriginalName(value="__le32") int s_checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_replay_state")
    @NotUsableInJava
    public static class ext4_fc_replay_state
    extends Struct {
        public int fc_replay_num_tags;
        public int fc_replay_expected_off;
        public int fc_current_pass;
        public int fc_cur_tag;
        public int fc_crc;
        public Ptr<ext4_fc_alloc_region> fc_regions;
        public int fc_regions_size;
        public int fc_regions_used;
        public int fc_regions_valid;
        public Ptr<Integer> fc_modified_inodes;
        public int fc_modified_inodes_used;
        public int fc_modified_inodes_size;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_alloc_region")
    @NotUsableInJava
    public static class ext4_fc_alloc_region
    extends Struct {
        public @Unsigned @OriginalName(value="ext4_lblk_t") int lblk;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long pblk;
        public int ino;
        public int len;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_fc_stats")
    @NotUsableInJava
    public static class ext4_fc_stats
    extends Struct {
        public @Unsigned int @Size(value=10) [] fc_ineligible_reason_count;
        public @Unsigned long fc_num_commits;
        public @Unsigned long fc_ineligible_commits;
        public @Unsigned long fc_failed_commits;
        public @Unsigned long fc_skipped_commits;
        public @Unsigned long fc_numblks;
        public @Unsigned long s_fc_avg_commit_time;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_es_stats")
    @NotUsableInJava
    public static class ext4_es_stats
    extends Struct {
        public @Unsigned long es_stats_shrunk;
        public PercpuDefinitions.percpu_counter es_stats_cache_hits;
        public PercpuDefinitions.percpu_counter es_stats_cache_misses;
        public @Unsigned long es_stats_scan_time;
        public @Unsigned long es_stats_max_scan_time;
        public PercpuDefinitions.percpu_counter es_stats_all_cnt;
        public PercpuDefinitions.percpu_counter es_stats_shk_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_group_desc")
    @NotUsableInJava
    public static class ext4_group_desc
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int bg_block_bitmap_lo;
        public @Unsigned @OriginalName(value="__le32") int bg_inode_bitmap_lo;
        public @Unsigned @OriginalName(value="__le32") int bg_inode_table_lo;
        public @Unsigned @OriginalName(value="__le16") short bg_free_blocks_count_lo;
        public @Unsigned @OriginalName(value="__le16") short bg_free_inodes_count_lo;
        public @Unsigned @OriginalName(value="__le16") short bg_used_dirs_count_lo;
        public @Unsigned @OriginalName(value="__le16") short bg_flags;
        public @Unsigned @OriginalName(value="__le32") int bg_exclude_bitmap_lo;
        public @Unsigned @OriginalName(value="__le16") short bg_block_bitmap_csum_lo;
        public @Unsigned @OriginalName(value="__le16") short bg_inode_bitmap_csum_lo;
        public @Unsigned @OriginalName(value="__le16") short bg_itable_unused_lo;
        public @Unsigned @OriginalName(value="__le16") short bg_checksum;
        public @Unsigned @OriginalName(value="__le32") int bg_block_bitmap_hi;
        public @Unsigned @OriginalName(value="__le32") int bg_inode_bitmap_hi;
        public @Unsigned @OriginalName(value="__le32") int bg_inode_table_hi;
        public @Unsigned @OriginalName(value="__le16") short bg_free_blocks_count_hi;
        public @Unsigned @OriginalName(value="__le16") short bg_free_inodes_count_hi;
        public @Unsigned @OriginalName(value="__le16") short bg_used_dirs_count_hi;
        public @Unsigned @OriginalName(value="__le16") short bg_itable_unused_hi;
        public @Unsigned @OriginalName(value="__le32") int bg_exclude_bitmap_hi;
        public @Unsigned @OriginalName(value="__le16") short bg_block_bitmap_csum_hi;
        public @Unsigned @OriginalName(value="__le16") short bg_inode_bitmap_csum_hi;
        public @Unsigned int bg_reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_system_blocks")
    @NotUsableInJava
    public static class ext4_system_blocks
    extends Struct {
        public RbDefinitions.rb_root root;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ext4_map_blocks")
    @NotUsableInJava
    public static class ext4_map_blocks
    extends Struct {
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long m_pblk;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int m_lblk;
        public @Unsigned int m_len;
        public @Unsigned int m_flags;
    }
}

