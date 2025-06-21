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
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.InodeDefinitions;
import me.bechberger.ebpf.runtime.IntervalDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WriteDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class FuseDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_access(Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_allow_current_process(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_atomic_open(Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry, Ptr<runtime.file> file2, @Unsigned int flags, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_change_entry_timeout(Ptr<runtime.dentry> entry, Ptr<fuse_entry_out> o) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_conn_abort_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long fuse_conn_abort_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_conn_congestion_threshold_read(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_conn_congestion_threshold_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long fuse_conn_congestion_threshold_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_conn_max_background_read(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_conn_max_background_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long fuse_conn_max_background_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_conn_waiting_read(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_copy_ioctl_iovec_old(Ptr<runtime.iovec> dst, Ptr<?> src, @Unsigned long transferred, @Unsigned int count, boolean is_compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_create(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry, @Unsigned @OriginalName(value="umode_t") short mode, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_create_open(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry, Ptr<runtime.file> file2, @Unsigned int flags, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_ctl_add_conn(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_ctl_add_dentry($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, (const struct inode_operations*)$arg6, (const struct file_operations*)$arg7)")
    public static Ptr<runtime.dentry> fuse_ctl_add_dentry(Ptr<runtime.dentry> parent, Ptr<fuse_conn> fc, String name, int mode, int nlink, Ptr<InodeDefinitions.inode_operations> iop, Ptr<FileDefinitions.file_operations> fop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_ctl_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_ctl_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_ctl_get_tree(Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_ctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_ctl_init_fs_context(Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_ctl_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_ctl_remove_conn(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.vfsmount> fuse_dentry_automount(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_dentry_delete((const struct dentry*)$arg1)")
    public static int fuse_dentry_delete(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dentry_revalidate(Ptr<runtime.dentry> entry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dentry_settime(Ptr<runtime.dentry> dentry2, @Unsigned long time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dir_changed(Ptr<runtime.inode> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fuse_dir_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dir_fsync(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fuse_dir_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dir_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dir_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_do_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.kstat> stat2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fuse_do_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_do_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_do_statx(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, Ptr<runtime.kstat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_entry_unlinked(Ptr<runtime.dentry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fuse_file_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fuse_file_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_fileattr_get(Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_fileattr_set(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_fillattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<fuse_attr> attr2, Ptr<runtime.kstat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_flush_time_update(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_flush_times(Ptr<runtime.inode> inode2, Ptr<fuse_file> ff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)fuse_get_link($arg1, $arg2, $arg3))")
    public static String fuse_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int fuse_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_init_common(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_init_dir(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_init_symlink(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_invalid_attr(Ptr<fuse_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_invalidate_atime(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_invalidate_attr(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_invalidate_attr_mask(Ptr<runtime.inode> inode2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_invalidate_entry_cache(Ptr<runtime.dentry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fuse_ioctl_common(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_link(Ptr<runtime.dentry> entry, Ptr<runtime.inode> newdir, Ptr<runtime.dentry> newent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fuse_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_lookup_name($arg1, $arg2, (const struct qstr*)$arg3, $arg4, $arg5)")
    public static int fuse_lookup_name(Ptr<SuperDefinitions.super_block> sb, @Unsigned long nodeid, Ptr<runtime.qstr> name, Ptr<fuse_entry_out> outarg, Ptr<Ptr<runtime.inode>> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_priv_ioctl(Ptr<runtime.inode> inode2, Ptr<fuse_file> ff, @Unsigned int cmd, Ptr<?> ptr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_file> fuse_priv_ioctl_prepare(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_readlink_page(Ptr<runtime.inode> inode2, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_release_nowrite(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_rename2(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> olddir, Ptr<runtime.dentry> oldent, Ptr<runtime.inode> newdir, Ptr<runtime.dentry> newent, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_rename_common(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> olddir, Ptr<runtime.dentry> oldent, Ptr<runtime.inode> newdir, Ptr<runtime.dentry> newent, @Unsigned int flags, int opcode, @Unsigned long argsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_reverse_inval_entry(Ptr<fuse_conn> fc, @Unsigned long parent_nodeid, @Unsigned long child_nodeid, Ptr<runtime.qstr> name, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_set_nowrite(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> entry, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_setup_enable_verity(@Unsigned long arg2, Ptr<runtime.iovec> iov, Ptr<@Unsigned Integer> in_iovs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int fuse_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry, String link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_symlink_read_folio(Ptr<runtime.file> _null, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fuse_time_to_jiffies(@Unsigned long sec, @Unsigned int nsec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_update_attributes(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_update_ctime(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_update_get_attr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_valid_type(int m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __fuse_copy_file_range(Ptr<runtime.file> file_in, @OriginalName(value="loff_t") long pos_in, Ptr<runtime.file> file_out, @OriginalName(value="loff_t") long pos_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_file> __fuse_write_file_get(Ptr<fuse_inode> fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_aio_complete(Ptr<fuse_io_priv> io2, int err, @OriginalName(value="ssize_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_aio_complete_req(Ptr<fuse_mount> fm, Ptr<fuse_args> args, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_async_req_send(Ptr<fuse_mount> fm, Ptr<fuse_io_args> ia, @Unsigned long num_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long fuse_bmap(Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_cache_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_copy_file_range(Ptr<runtime.file> src_file, @OriginalName(value="loff_t") long src_off, Ptr<runtime.file> dst_file, @OriginalName(value="loff_t") long dst_off, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_direct_IO(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_direct_io(Ptr<fuse_io_priv> io2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<@OriginalName(value="loff_t") Long> ppos, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_direct_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_do_open(Ptr<fuse_mount> fm, @Unsigned long nodeid, Ptr<runtime.file> file2, boolean isdir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_do_readpage(Ptr<runtime.file> file2, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_do_truncate(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_file> fuse_file_alloc(Ptr<fuse_mount> fm, boolean release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_file_cached_io_open(Ptr<runtime.inode> inode2, Ptr<fuse_file> ff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fuse_file_fallocate(Ptr<runtime.file> file2, int mode, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_file_flock(Ptr<runtime.file> file2, int cmd, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_file_free(Ptr<fuse_file> ff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_file_io_open(Ptr<runtime.file> file2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_file_io_release(Ptr<fuse_file> ff, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long fuse_file_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_file_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_file> fuse_file_open(Ptr<fuse_mount> fm, @Unsigned long nodeid, @Unsigned int open_flags2, boolean isdir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int fuse_file_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_file_put(Ptr<fuse_file> ff, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_file_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_file_release(Ptr<runtime.inode> inode2, Ptr<fuse_file> ff, @Unsigned int open_flags2, @OriginalName(value="fl_owner_t") Ptr<?> id, boolean isdir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_file_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_fill_write_pages(Ptr<fuse_io_args> ia, Ptr<misc.address_space> mapping, Ptr<IovDefinitions.iov_iter> ii, @OriginalName(value="loff_t") long pos, @Unsigned int max_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_finish_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_flush(Ptr<runtime.file> file2, @OriginalName(value="fl_owner_t") Ptr<?> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_flush_writepages(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_fsync(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_fsync_common(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync, int opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_get_user_pages(Ptr<fuse_args_pages> ap, Ptr<IovDefinitions.iov_iter> ii, Ptr<@Unsigned Long> nbytesp, int write2, @Unsigned int max_pages, boolean use_pages_for_kvec_io) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_getlk(Ptr<runtime.file> file2, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_getxattr($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long fuse_getxattr(Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_init_file_inode(Ptr<runtime.inode> inode2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_inode_uncached_io_end(Ptr<fuse_inode> fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_inode_uncached_io_start(Ptr<fuse_inode> fi, Ptr<fuse_backing> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_writepage_args> fuse_insert_writeback(Ptr<RbDefinitions.rb_root> root, Ptr<fuse_writepage_args> wpa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_io_args> fuse_io_alloc(Ptr<fuse_io_priv> io2, @Unsigned int npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_launder_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_listxattr(Ptr<runtime.dentry> entry, String list, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fuse_lock_owner_id(Ptr<fuse_conn> fc, @OriginalName(value="fl_owner_t") Ptr<?> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long fuse_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_notify_poll_wakeup(Ptr<fuse_conn> fc, Ptr<fuse_notify_poll_wakeup_out> outarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fuse_page_mkwrite(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_pages_realloc(Ptr<fuse_fill_wb_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_perform_write(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> ii) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_prepare_release(Ptr<fuse_inode> fi, Ptr<fuse_file> ff, @Unsigned int flags, int opcode, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_range_is_writeback(Ptr<runtime.inode> inode2, @Unsigned long idx_from, @Unsigned long idx_to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_read_args_fill(Ptr<fuse_io_args> ia, Ptr<runtime.file> file2, @OriginalName(value="loff_t") long pos, @Unsigned long count, int opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_read_folio(Ptr<runtime.file> file2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_read_update_size(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long size, @Unsigned long attr_ver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_readahead(Ptr<misc.readahead_control> rac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_readpages_end(Ptr<fuse_mount> fm, Ptr<fuse_args> args, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_release_common(Ptr<runtime.file> file2, boolean isdir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_release_end(Ptr<fuse_mount> fm, Ptr<fuse_args> args, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_removexattr($arg1, (const u8*)$arg2)")
    public static int fuse_removexattr(Ptr<runtime.inode> inode2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_send_open(Ptr<fuse_mount> fm, @Unsigned long nodeid, @Unsigned int open_flags2, int opcode, Ptr<fuse_open_out> outargp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_send_write_pages(Ptr<fuse_io_args> ia, Ptr<runtime.kiocb> iocb2, Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_send_writepage(Ptr<fuse_mount> fm, Ptr<fuse_writepage_args> wpa, @OriginalName(value="loff_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_setlk(Ptr<runtime.file> file2, Ptr<FileDefinitions.file_lock> fl, int flock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_setxattr($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static int fuse_setxattr(Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags, @Unsigned int extra_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_splice_write(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_sync_release(Ptr<fuse_inode> fi, Ptr<fuse_file> ff, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_vma_close(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_wait_on_page_writeback(Ptr<runtime.inode> inode2, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_write_begin(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fuse_write_flags(Ptr<runtime.kiocb> iocb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_write_inode(Ptr<runtime.inode> inode2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_write_update_attr(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="ssize_t") long written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_writepage_args_page_fill(Ptr<fuse_writepage_args> wpa, Ptr<runtime.folio> folio2, Ptr<runtime.folio> tmp_folio, @Unsigned @OriginalName(value="uint32_t") int page_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_writepage_args> fuse_writepage_args_setup(Ptr<runtime.folio> folio2, Ptr<fuse_file> ff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_writepage_end(Ptr<fuse_mount> fm, Ptr<fuse_args> args, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_writepage_finish_stat(Ptr<runtime.inode> inode2, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_writepage_free(Ptr<fuse_writepage_args> wpa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_writepages_fill(Ptr<runtime.folio> folio2, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<?> _data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_writepages_send(Ptr<fuse_fill_wb_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_xattr_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int fuse_xattr_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_xattr_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int fuse_xattr_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_add_dirent_to_cache(Ptr<runtime.file> file2, Ptr<fuse_dirent> dirent, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_forget_link> fuse_alloc_forget() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fuse_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_backing_close(Ptr<fuse_conn> fc, int backing_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_backing_files_free(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_backing_files_init(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_backing_free(Ptr<fuse_backing> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_backing> fuse_backing_get(Ptr<fuse_backing> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_backing_id_free(int id, Ptr<?> p, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_backing_open(Ptr<fuse_conn> fc, Ptr<fuse_backing_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_backing_put(Ptr<fuse_backing> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_change_attributes(Ptr<runtime.inode> inode2, Ptr<fuse_attr> attr2, Ptr<fuse_statx> sx, @Unsigned long attr_valid, @Unsigned long attr_version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_change_attributes_common(Ptr<runtime.inode> inode2, Ptr<fuse_attr> attr2, Ptr<fuse_statx> sx, @Unsigned long attr_valid, @Unsigned int cache_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_conn_destroy(Ptr<fuse_mount> fm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_conn> fuse_conn_get(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fuse_conn_init($arg1, $arg2, $arg3, (const struct fuse_iqueue_ops*)$arg4, $arg5)")
    public static void fuse_conn_init(Ptr<fuse_conn> fc, Ptr<fuse_mount> fm, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<fuse_iqueue_ops> fiq_ops, Ptr<?> fiq_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_conn_put(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_dev> fuse_dev_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_dev> fuse_dev_alloc_install(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dev_free(Ptr<fuse_dev> fud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dev_install(Ptr<fuse_dev> fud, Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_emit(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx, Ptr<fuse_dirent> dirent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_encode_fh(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> fh, Ptr<Integer> max_len, Ptr<runtime.inode> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fuse_fh_to_dentry(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fuse_fh_to_parent(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_file_accessed(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_fill_super_common(Ptr<SuperDefinitions.super_block> sb, Ptr<fuse_fs_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_fill_super_submount(Ptr<SuperDefinitions.super_block> sb, Ptr<fuse_inode> parent_fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_free_conn(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_free_fsc(Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_fs_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fuse_get_cache_mask(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fuse_get_dentry(Ptr<SuperDefinitions.super_block> sb, Ptr<fuse_inode_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> fuse_get_parent(Ptr<runtime.dentry> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_get_tree(Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_get_tree_submount(Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fuse_iget(Ptr<SuperDefinitions.super_block> sb, @Unsigned long nodeid, int generation, Ptr<fuse_attr> attr2, @Unsigned long attr_valid, @Unsigned long attr_version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> fuse_ilookup(Ptr<fuse_conn> fc, @Unsigned long nodeid, Ptr<Ptr<fuse_mount>> fm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_init_fs_context(Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_init_fs_context_submount(Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_init_inode(Ptr<runtime.inode> inode2, Ptr<fuse_attr> attr2, Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_inode_eq(Ptr<runtime.inode> inode2, Ptr<?> _nodeidp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_inode_init_once(Ptr<?> foo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_inode_set(Ptr<runtime.inode> inode2, Ptr<?> _nodeidp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_kill_sb_anon(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_kill_sb_blk(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_lock_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_mount_destroy(Ptr<fuse_mount> fm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_mount_remove(Ptr<fuse_mount> fm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_parse_param(Ptr<FsDefinitions.fs_context> fsc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_passthrough_end_write(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long pos, @OriginalName(value="ssize_t") long ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_passthrough_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_backing> fuse_passthrough_open(Ptr<runtime.file> file2, Ptr<runtime.inode> inode2, int backing_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_passthrough_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_passthrough_release(Ptr<fuse_file> ff, Ptr<fuse_backing> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_passthrough_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_passthrough_splice_write(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_passthrough_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_readdir_cached(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_readdir_uncached(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_reconfigure(Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_reverse_inval_inode(Ptr<fuse_conn> fc, @Unsigned long nodeid, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_send_destroy(Ptr<fuse_mount> fm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_send_init(Ptr<fuse_mount> fm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_set_no_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_statfs(Ptr<runtime.dentry> dentry2, Ptr<runtime.kstatfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_sync_bucket> fuse_sync_bucket_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_sync_fs(Ptr<SuperDefinitions.super_block> sb, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_sync_fs_writes(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_sysfs_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_test_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_umount_begin(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_unlock_inode(Ptr<runtime.inode> inode2, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int __fuse_dax_fault(Ptr<VmDefinitions.vm_fault> vmf, @Unsigned int order, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> __fuse_get_acl(Ptr<fuse_conn> fc, Ptr<runtime.inode> inode2, int type2, boolean rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __fuse_simple_request(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<fuse_mount> fm, Ptr<fuse_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_abort_conn(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_args_to_req(Ptr<fuse_req> req2, Ptr<fuse_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_copy_args(Ptr<fuse_copy_state> cs, @Unsigned int numargs, @Unsigned int argpages, Ptr<fuse_arg> args, int zeroing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_copy_do(Ptr<fuse_copy_state> cs, Ptr<Ptr<?>> val, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_copy_fill(Ptr<fuse_copy_state> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_copy_finish(Ptr<fuse_copy_state> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_copy_init(Ptr<fuse_copy_state> cs, int write2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_copy_page(Ptr<fuse_copy_state> cs, Ptr<Ptr<runtime.page>> pagep, @Unsigned int offset, @Unsigned int count, int zeroing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dax_break_layouts(Ptr<runtime.inode> inode2, @Unsigned long dmap_start, @Unsigned long dmap_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dax_cancel_work(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_dax_check_alignment(Ptr<fuse_conn> fc, @Unsigned int map_alignment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dax_conn_alloc(Ptr<fuse_conn> fc, fuse_dax_mode dax_mode, Ptr<DaxDefinitions.dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dax_conn_free(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dax_dontcache(Ptr<runtime.inode> inode2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fuse_dax_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dax_free_mem_worker(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fuse_dax_huge_fault(Ptr<VmDefinitions.vm_fault> vmf, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fuse_dax_inode_alloc(Ptr<SuperDefinitions.super_block> sb, Ptr<fuse_inode> fi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dax_inode_cleanup(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dax_inode_init(Ptr<runtime.inode> inode2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dax_mem_range_init(Ptr<fuse_conn_dax> fcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dax_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fuse_dax_page_mkwrite(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fuse_dax_pfn_mkwrite(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_dax_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_dax_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dax_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dev_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_dev_do_read(Ptr<fuse_dev> fud, Ptr<runtime.file> file2, Ptr<fuse_copy_state> cs, @Unsigned long nbytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_dev_do_write(Ptr<fuse_dev> fud, Ptr<fuse_copy_state> cs, @Unsigned long nbytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dev_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fuse_dev_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int fuse_dev_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dev_queue_forget(Ptr<fuse_iqueue> fiq, Ptr<fuse_forget_link> forget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dev_queue_interrupt(Ptr<fuse_iqueue> fiq, Ptr<fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_dev_queue_req(Ptr<fuse_iqueue> fiq, Ptr<fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_dev_read(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_dev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_dev_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_dev_splice_write(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fuse_dev_write(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_drop_waiting(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_fill_iomap(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long length, Ptr<runtime.iomap> iomap2, Ptr<fuse_dax_mapping> dmap, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_free_dax_mem_ranges(Ptr<ListDefinitions.list_head> mem_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> fuse_get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> fuse_get_inode_acl(Ptr<runtime.inode> inode2, int type2, boolean rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_req> fuse_get_req(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<fuse_mount> fm, boolean for_background) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fuse_get_unique(Ptr<fuse_iqueue> fiq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_iomap_begin(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long length, @Unsigned int flags, Ptr<runtime.iomap> iomap2, Ptr<runtime.iomap> srcmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_iomap_end(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long length, @OriginalName(value="ssize_t") long written, @Unsigned int flags, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fuse_len_args(@Unsigned int numargs, Ptr<fuse_arg> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_notify(Ptr<fuse_conn> fc, fuse_notify_code code2, @Unsigned int size, Ptr<fuse_copy_state> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_notify_delete(Ptr<fuse_conn> fc, @Unsigned int size, Ptr<fuse_copy_state> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_notify_inval_entry(Ptr<fuse_conn> fc, @Unsigned int size, Ptr<fuse_copy_state> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_notify_store(Ptr<fuse_conn> fc, @Unsigned int size, Ptr<fuse_copy_state> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_put_request(Ptr<fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_queue_forget(Ptr<fuse_conn> fc, Ptr<fuse_forget_link> forget, @Unsigned long nodeid, @Unsigned long nlookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fuse_req> fuse_request_alloc(Ptr<fuse_mount> fm, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_request_end(Ptr<fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_resend(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_retrieve(Ptr<fuse_mount> fm, Ptr<runtime.inode> inode2, Ptr<fuse_notify_retrieve_out> outarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_retrieve_end(Ptr<fuse_mount> fm, Ptr<fuse_args> args, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_send_one(Ptr<fuse_iqueue> fiq, Ptr<fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_send_removemapping(Ptr<runtime.inode> inode2, Ptr<fuse_removemapping_in> inargp, Ptr<fuse_removemapping_one> remove_one) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<PosixDefinitions.posix_acl> acl, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_set_initialized(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_setup_new_dax_mapping(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long length, @Unsigned int flags, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_setup_one_mapping(Ptr<runtime.inode> inode2, @Unsigned long start_idx, Ptr<fuse_dax_mapping> dmap, boolean writable, boolean upgrade) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_simple_background(Ptr<fuse_mount> fm, Ptr<fuse_args> args, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fuse_try_move_page(Ptr<fuse_copy_state> cs, Ptr<Ptr<runtime.page>> pagep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fuse_wait_aborted(Ptr<fuse_conn> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum fuse_parse_result")
    public static enum fuse_parse_result implements Enum<fuse_parse_result>,
    TypedEnum<fuse_parse_result, Integer>
    {
        FOUND_ERR,
        FOUND_NONE,
        FOUND_SOME,
        FOUND_ALL;

    }

    @Type(noCCodeGeneration=true, cType="struct fuse_direntplus")
    @NotUsableInJava
    public static class fuse_direntplus
    extends Struct {
        public fuse_entry_out entry_out;
        public fuse_dirent dirent;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_dirent")
    @NotUsableInJava
    public static class fuse_dirent
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long ino;
        public @Unsigned @OriginalName(value="uint64_t") long off;
        public @Unsigned @OriginalName(value="uint32_t") int namelen;
        public @Unsigned @OriginalName(value="uint32_t") int type;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_init_args")
    @NotUsableInJava
    public static class fuse_init_args
    extends Struct {
        public fuse_args args;
        public fuse_init_in in;
        public fuse_init_out out;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_inode_handle")
    @NotUsableInJava
    public static class fuse_inode_handle
    extends Struct {
        public @Unsigned long nodeid;
        public @Unsigned int generation;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_fs_context")
    @NotUsableInJava
    public static class fuse_fs_context
    extends Struct {
        public int fd;
        public Ptr<runtime.file> file;
        public @Unsigned int rootmode;
        public misc.kuid_t user_id;
        public misc.kgid_t group_id;
        public boolean is_bdev;
        public boolean fd_present;
        public boolean rootmode_present;
        public boolean user_id_present;
        public boolean group_id_present;
        public boolean default_permissions;
        public boolean allow_other;
        public boolean destroy;
        public boolean no_control;
        public boolean no_force_umount;
        public boolean legacy_opts_show;
        public fuse_dax_mode dax_mode;
        public @Unsigned int max_read;
        public @Unsigned int blksize;
        public String subtype;
        public Ptr<DaxDefinitions.dax_device> dax_dev;
        public Ptr<Ptr<?>> fudptr;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_syncfs_in")
    @NotUsableInJava
    public static class fuse_syncfs_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_init_out")
    @NotUsableInJava
    public static class fuse_init_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int major;
        public @Unsigned @OriginalName(value="uint32_t") int minor;
        public @Unsigned @OriginalName(value="uint32_t") int max_readahead;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint16_t") short max_background;
        public @Unsigned @OriginalName(value="uint16_t") short congestion_threshold;
        public @Unsigned @OriginalName(value="uint32_t") int max_write;
        public @Unsigned @OriginalName(value="uint32_t") int time_gran;
        public @Unsigned @OriginalName(value="uint16_t") short max_pages;
        public @Unsigned @OriginalName(value="uint16_t") short map_alignment;
        public @Unsigned @OriginalName(value="uint32_t") int flags2;
        public @Unsigned @OriginalName(value="uint32_t") int max_stack_depth;
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=6) [] unused;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_init_in")
    @NotUsableInJava
    public static class fuse_init_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int major;
        public @Unsigned @OriginalName(value="uint32_t") int minor;
        public @Unsigned @OriginalName(value="uint32_t") int max_readahead;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int flags2;
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=11) [] unused;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_statfs_out")
    @NotUsableInJava
    public static class fuse_statfs_out
    extends Struct {
        public fuse_kstatfs st;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_kstatfs")
    @NotUsableInJava
    public static class fuse_kstatfs
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long blocks;
        public @Unsigned @OriginalName(value="uint64_t") long bfree;
        public @Unsigned @OriginalName(value="uint64_t") long bavail;
        public @Unsigned @OriginalName(value="uint64_t") long files;
        public @Unsigned @OriginalName(value="uint64_t") long ffree;
        public @Unsigned @OriginalName(value="uint32_t") int bsize;
        public @Unsigned @OriginalName(value="uint32_t") int namelen;
        public @Unsigned @OriginalName(value="uint32_t") int frsize;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=6) [] spare;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_getxattr_out")
    @NotUsableInJava
    public static class fuse_getxattr_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_getxattr_in")
    @NotUsableInJava
    public static class fuse_getxattr_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_setxattr_in")
    @NotUsableInJava
    public static class fuse_setxattr_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int setxattr_flags;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_fill_wb_data")
    @NotUsableInJava
    public static class fuse_fill_wb_data
    extends Struct {
        public Ptr<fuse_writepage_args> wpa;
        public Ptr<fuse_file> ff;
        public Ptr<runtime.inode> inode;
        public Ptr<Ptr<runtime.page>> orig_pages;
        public @Unsigned int max_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_writepage_args")
    @NotUsableInJava
    public static class fuse_writepage_args
    extends Struct {
        public fuse_io_args ia;
        public RbDefinitions.rb_node writepages_entry;
        public ListDefinitions.list_head queue_entry;
        public Ptr<fuse_writepage_args> next;
        public Ptr<runtime.inode> inode;
        public Ptr<fuse_sync_bucket> bucket;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_io_args")
    @NotUsableInJava
    public static class fuse_io_args
    extends Struct {
        @InlineUnion(value=62936)
        public  @InlineUnion(value=62936) ReadDefinitions.read_of_anon_member_of_fuse_io_args read;
        @InlineUnion(value=62936)
        public @InlineUnion(value=62936) WriteDefinitions.write_of_anon_member_of_fuse_io_args write;
        public fuse_args_pages ap;
        public Ptr<fuse_io_priv> io;
        public Ptr<fuse_file> ff;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_copy_file_range_in")
    @NotUsableInJava
    public static class fuse_copy_file_range_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh_in;
        public @Unsigned @OriginalName(value="uint64_t") long off_in;
        public @Unsigned @OriginalName(value="uint64_t") long nodeid_out;
        public @Unsigned @OriginalName(value="uint64_t") long fh_out;
        public @Unsigned @OriginalName(value="uint64_t") long off_out;
        public @Unsigned @OriginalName(value="uint64_t") long len;
        public @Unsigned @OriginalName(value="uint64_t") long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_lseek_out")
    @NotUsableInJava
    public static class fuse_lseek_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_lseek_in")
    @NotUsableInJava
    public static class fuse_lseek_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint64_t") long offset;
        public @Unsigned @OriginalName(value="uint32_t") int whence;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_fallocate_in")
    @NotUsableInJava
    public static class fuse_fallocate_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint64_t") long offset;
        public @Unsigned @OriginalName(value="uint64_t") long length;
        public @Unsigned @OriginalName(value="uint32_t") int mode;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_poll_out")
    @NotUsableInJava
    public static class fuse_poll_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int revents;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_poll_in")
    @NotUsableInJava
    public static class fuse_poll_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint64_t") long kh;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int events;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_bmap_out")
    @NotUsableInJava
    public static class fuse_bmap_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long block;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_bmap_in")
    @NotUsableInJava
    public static class fuse_bmap_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long block;
        public @Unsigned @OriginalName(value="uint32_t") int blocksize;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_lk_out")
    @NotUsableInJava
    public static class fuse_lk_out
    extends Struct {
        public fuse_file_lock lk;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_lk_in")
    @NotUsableInJava
    public static class fuse_lk_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint64_t") long owner;
        public fuse_file_lock lk;
        public @Unsigned @OriginalName(value="uint32_t") int lk_flags;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_fsync_in")
    @NotUsableInJava
    public static class fuse_fsync_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint32_t") int fsync_flags;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_write_out")
    @NotUsableInJava
    public static class fuse_write_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_write_in")
    @NotUsableInJava
    public static class fuse_write_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint64_t") long offset;
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int write_flags;
        public @Unsigned @OriginalName(value="uint64_t") long lock_owner;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_read_in")
    @NotUsableInJava
    public static class fuse_read_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint64_t") long offset;
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int read_flags;
        public @Unsigned @OriginalName(value="uint64_t") long lock_owner;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_flush_in")
    @NotUsableInJava
    public static class fuse_flush_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint32_t") int unused;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
        public @Unsigned @OriginalName(value="uint64_t") long lock_owner;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_open_in")
    @NotUsableInJava
    public static class fuse_open_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int open_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_file_lock")
    @NotUsableInJava
    public static class fuse_file_lock
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long start;
        public @Unsigned @OriginalName(value="uint64_t") long end;
        public @Unsigned @OriginalName(value="uint32_t") int type;
        public @Unsigned @OriginalName(value="uint32_t") int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_ioctl_out")
    @NotUsableInJava
    public static class fuse_ioctl_out
    extends Struct {
        public @OriginalName(value="int32_t") int result;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int in_iovs;
        public @Unsigned @OriginalName(value="uint32_t") int out_iovs;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_ioctl_iovec")
    @NotUsableInJava
    public static class fuse_ioctl_iovec
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long base;
        public @Unsigned @OriginalName(value="uint64_t") long len;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_ioctl_in")
    @NotUsableInJava
    public static class fuse_ioctl_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int cmd;
        public @Unsigned @OriginalName(value="uint64_t") long arg;
        public @Unsigned @OriginalName(value="uint32_t") int in_size;
        public @Unsigned @OriginalName(value="uint32_t") int out_size;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_supp_groups")
    @NotUsableInJava
    public static class fuse_supp_groups
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int nr_groups;
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=0) [] groups;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_ext_header")
    @NotUsableInJava
    public static class fuse_ext_header
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int type;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_secctx_header")
    @NotUsableInJava
    public static class fuse_secctx_header
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int nr_secctx;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_secctx")
    @NotUsableInJava
    public static class fuse_secctx
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_access_in")
    @NotUsableInJava
    public static class fuse_access_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int mask;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_create_in")
    @NotUsableInJava
    public static class fuse_create_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int mode;
        public @Unsigned @OriginalName(value="uint32_t") int umask;
        public @Unsigned @OriginalName(value="uint32_t") int open_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_setattr_in")
    @NotUsableInJava
    public static class fuse_setattr_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int valid;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint64_t") long size;
        public @Unsigned @OriginalName(value="uint64_t") long lock_owner;
        public @Unsigned @OriginalName(value="uint64_t") long atime;
        public @Unsigned @OriginalName(value="uint64_t") long mtime;
        public @Unsigned @OriginalName(value="uint64_t") long ctime;
        public @Unsigned @OriginalName(value="uint32_t") int atimensec;
        public @Unsigned @OriginalName(value="uint32_t") int mtimensec;
        public @Unsigned @OriginalName(value="uint32_t") int ctimensec;
        public @Unsigned @OriginalName(value="uint32_t") int mode;
        public @Unsigned @OriginalName(value="uint32_t") int unused4;
        public @Unsigned @OriginalName(value="uint32_t") int uid;
        public @Unsigned @OriginalName(value="uint32_t") int gid;
        public @Unsigned @OriginalName(value="uint32_t") int unused5;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_link_in")
    @NotUsableInJava
    public static class fuse_link_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long oldnodeid;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_rename2_in")
    @NotUsableInJava
    public static class fuse_rename2_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long newdir;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_mkdir_in")
    @NotUsableInJava
    public static class fuse_mkdir_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int mode;
        public @Unsigned @OriginalName(value="uint32_t") int umask;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_mknod_in")
    @NotUsableInJava
    public static class fuse_mknod_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int mode;
        public @Unsigned @OriginalName(value="uint32_t") int rdev;
        public @Unsigned @OriginalName(value="uint32_t") int umask;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_statx_out")
    @NotUsableInJava
    public static class fuse_statx_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long attr_valid;
        public @Unsigned @OriginalName(value="uint32_t") int attr_valid_nsec;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=2) [] spare;
        public fuse_statx stat;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_statx_in")
    @NotUsableInJava
    public static class fuse_statx_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int getattr_flags;
        public @Unsigned @OriginalName(value="uint32_t") int reserved;
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint32_t") int sx_flags;
        public @Unsigned @OriginalName(value="uint32_t") int sx_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_attr_out")
    @NotUsableInJava
    public static class fuse_attr_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long attr_valid;
        public @Unsigned @OriginalName(value="uint32_t") int attr_valid_nsec;
        public @Unsigned @OriginalName(value="uint32_t") int dummy;
        public fuse_attr attr;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_getattr_in")
    @NotUsableInJava
    public static class fuse_getattr_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int getattr_flags;
        public @Unsigned @OriginalName(value="uint32_t") int dummy;
        public @Unsigned @OriginalName(value="uint64_t") long fh;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_entry_out")
    @NotUsableInJava
    public static class fuse_entry_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long nodeid;
        public @Unsigned @OriginalName(value="uint64_t") long generation;
        public @Unsigned @OriginalName(value="uint64_t") long entry_valid;
        public @Unsigned @OriginalName(value="uint64_t") long attr_valid;
        public @Unsigned @OriginalName(value="uint32_t") int entry_valid_nsec;
        public @Unsigned @OriginalName(value="uint32_t") int attr_valid_nsec;
        public fuse_attr attr;
    }

    @Type(noCCodeGeneration=true, cType="enum fuse_ext_type")
    public static enum fuse_ext_type implements Enum<fuse_ext_type>,
    TypedEnum<fuse_ext_type, Integer>
    {
        FUSE_MAX_NR_SECCTX,
        FUSE_EXT_GROUPS;

    }

    @Type(noCCodeGeneration=true, cType="struct fuse_statx")
    @NotUsableInJava
    public static class fuse_statx
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int mask;
        public @Unsigned @OriginalName(value="uint32_t") int blksize;
        public @Unsigned @OriginalName(value="uint64_t") long attributes;
        public @Unsigned @OriginalName(value="uint32_t") int nlink;
        public @Unsigned @OriginalName(value="uint32_t") int uid;
        public @Unsigned @OriginalName(value="uint32_t") int gid;
        public @Unsigned @OriginalName(value="uint16_t") short mode;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=1) [] __spare0;
        public @Unsigned @OriginalName(value="uint64_t") long ino;
        public @Unsigned @OriginalName(value="uint64_t") long size;
        public @Unsigned @OriginalName(value="uint64_t") long blocks;
        public @Unsigned @OriginalName(value="uint64_t") long attributes_mask;
        public fuse_sx_time atime;
        public fuse_sx_time btime;
        public fuse_sx_time ctime;
        public fuse_sx_time mtime;
        public @Unsigned @OriginalName(value="uint32_t") int rdev_major;
        public @Unsigned @OriginalName(value="uint32_t") int rdev_minor;
        public @Unsigned @OriginalName(value="uint32_t") int dev_major;
        public @Unsigned @OriginalName(value="uint32_t") int dev_minor;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=14) [] __spare2;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_sx_time")
    @NotUsableInJava
    public static class fuse_sx_time
    extends Struct {
        public @OriginalName(value="int64_t") long tv_sec;
        public @Unsigned @OriginalName(value="uint32_t") int tv_nsec;
        public @OriginalName(value="int32_t") int __reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_attr")
    @NotUsableInJava
    public static class fuse_attr
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long ino;
        public @Unsigned @OriginalName(value="uint64_t") long size;
        public @Unsigned @OriginalName(value="uint64_t") long blocks;
        public @Unsigned @OriginalName(value="uint64_t") long atime;
        public @Unsigned @OriginalName(value="uint64_t") long mtime;
        public @Unsigned @OriginalName(value="uint64_t") long ctime;
        public @Unsigned @OriginalName(value="uint32_t") int atimensec;
        public @Unsigned @OriginalName(value="uint32_t") int mtimensec;
        public @Unsigned @OriginalName(value="uint32_t") int ctimensec;
        public @Unsigned @OriginalName(value="uint32_t") int mode;
        public @Unsigned @OriginalName(value="uint32_t") int nlink;
        public @Unsigned @OriginalName(value="uint32_t") int uid;
        public @Unsigned @OriginalName(value="uint32_t") int gid;
        public @Unsigned @OriginalName(value="uint32_t") int rdev;
        public @Unsigned @OriginalName(value="uint32_t") int blksize;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_dax_mapping")
    @NotUsableInJava
    public static class fuse_dax_mapping
    extends Struct {
        public Ptr<runtime.inode> inode;
        public ListDefinitions.list_head list;
        public IntervalDefinitions.interval_tree_node itn;
        public ListDefinitions.list_head busy_list;
        public @Unsigned long window_offset;
        public @OriginalName(value="loff_t") long length;
        public boolean writable;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_conn_dax")
    @NotUsableInJava
    public static class fuse_conn_dax
    extends Struct {
        public Ptr<DaxDefinitions.dax_device> dev;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned long nr_busy_ranges;
        public ListDefinitions.list_head busy_ranges;
        public DelayedDefinitions.delayed_work free_work;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head range_waitq;
        public long nr_free_ranges;
        public ListDefinitions.list_head free_ranges;
        public @Unsigned long nr_ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_io_priv")
    @NotUsableInJava
    public static class fuse_io_priv
    extends Struct {
        public runtime.kref refcnt;
        public int async;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int reqs;
        public @OriginalName(value="ssize_t") long bytes;
        public @Unsigned long size;
        public @Unsigned long offset;
        public boolean write;
        public boolean should_dirty;
        public int err;
        public Ptr<runtime.kiocb> iocb;
        public Ptr<runtime.completion> done;
        public boolean blocking;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_inode_dax")
    @NotUsableInJava
    public static class fuse_inode_dax
    extends Struct {
        public misc.rw_semaphore sem;
        public RbDefinitions.rb_root_cached tree;
        public @Unsigned long nr;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_removemapping_one")
    @NotUsableInJava
    public static class fuse_removemapping_one
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long moffset;
        public @Unsigned @OriginalName(value="uint64_t") long len;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_removemapping_in")
    @NotUsableInJava
    public static class fuse_removemapping_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int count;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_setupmapping_in")
    @NotUsableInJava
    public static class fuse_setupmapping_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint64_t") long foffset;
        public @Unsigned @OriginalName(value="uint64_t") long len;
        public @Unsigned @OriginalName(value="uint64_t") long flags;
        public @Unsigned @OriginalName(value="uint64_t") long moffset;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_inode")
    @NotUsableInJava
    public static class fuse_inode
    extends Struct {
        public runtime.inode inode;
        public @Unsigned long nodeid;
        public @Unsigned long nlookup;
        public Ptr<fuse_forget_link> forget;
        public @Unsigned long i_time;
        public @Unsigned int inval_mask;
        public @Unsigned @OriginalName(value="umode_t") short orig_i_mode;
        public runtime.timespec64 i_btime;
        public @Unsigned long orig_ino;
        public @Unsigned long attr_version;
        @InlineUnion(value=11765)
        public  @InlineUnion(value=11765) AnonDefinitions.anon_member_of_anon_member_of_fuse_inode anon10$0;
        @InlineUnion(value=11765)
        public @InlineUnion(value=11765) misc.rdc_of_anon_member_of_fuse_inode rdc;
        public @Unsigned long state;
        public runtime.mutex mutex;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<fuse_inode_dax> dax;
        public Ptr<fuse_submount_lookup> submount_lookup;
        public Ptr<fuse_backing> fb;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_backing")
    @NotUsableInJava
    public static class fuse_backing
    extends Struct {
        public Ptr<runtime.file> file;
        public Ptr<runtime.cred> cred;
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_submount_lookup")
    @NotUsableInJava
    public static class fuse_submount_lookup
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public @Unsigned long nodeid;
        public Ptr<fuse_forget_link> forget;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_retrieve_args")
    @NotUsableInJava
    public static class fuse_retrieve_args
    extends Struct {
        public fuse_args_pages ap;
        public fuse_notify_retrieve_in inarg;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_copy_state")
    @NotUsableInJava
    public static class fuse_copy_state
    extends Struct {
        public int write;
        public Ptr<fuse_req> req;
        public Ptr<IovDefinitions.iov_iter> iter;
        public Ptr<PipeDefinitions.pipe_buffer> pipebufs;
        public Ptr<PipeDefinitions.pipe_buffer> currbuf;
        public Ptr<PipeDefinitions.pipe_inode_info> pipe;
        public @Unsigned long nr_segs;
        public Ptr<runtime.page> pg;
        public @Unsigned int len;
        public @Unsigned int offset;
        public @Unsigned int move_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_sync_bucket")
    @NotUsableInJava
    public static class fuse_sync_bucket
    extends Struct {
        public AtomicDefinitions.atomic_t count;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitq;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum fuse_dax_mode")
    public static enum fuse_dax_mode implements Enum<fuse_dax_mode>,
    TypedEnum<fuse_dax_mode, Integer>
    {
        FUSE_DAX_INODE_DEFAULT,
        FUSE_DAX_ALWAYS,
        FUSE_DAX_NEVER,
        FUSE_DAX_INODE_USER;

    }

    @Type(noCCodeGeneration=true, cType="struct fuse_conn")
    @NotUsableInJava
    public static class fuse_conn
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public AtomicDefinitions.atomic_t dev_count;
        public misc.callback_head rcu;
        public misc.kuid_t user_id;
        public misc.kgid_t group_id;
        public Ptr<PidDefinitions.pid_namespace> pid_ns;
        public Ptr<UserDefinitions.user_namespace> user_ns;
        public @Unsigned int max_read;
        public @Unsigned int max_write;
        public @Unsigned int max_pages;
        public @Unsigned int max_pages_limit;
        public fuse_iqueue iq;
        public misc.atomic64_t khctr;
        public RbDefinitions.rb_root polled_files;
        public @Unsigned int max_background;
        public @Unsigned int congestion_threshold;
        public @Unsigned int num_background;
        public @Unsigned int active_background;
        public ListDefinitions.list_head bg_queue;
        public  @OriginalName(value="spinlock_t") runtime.spinlock bg_lock;
        public int initialized;
        public int blocked;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head blocked_waitq;
        public @Unsigned int connected;
        public boolean aborted;
        public @Unsigned int conn_error;
        public @Unsigned int conn_init;
        public @Unsigned int async_read;
        public @Unsigned int abort_err;
        public @Unsigned int atomic_o_trunc;
        public @Unsigned int export_support;
        public @Unsigned int writeback_cache;
        public @Unsigned int parallel_dirops;
        public @Unsigned int handle_killpriv;
        public @Unsigned int cache_symlinks;
        public @Unsigned int legacy_opts_show;
        public @Unsigned int handle_killpriv_v2;
        public @Unsigned int no_open;
        public @Unsigned int no_opendir;
        public @Unsigned int no_fsync;
        public @Unsigned int no_fsyncdir;
        public @Unsigned int no_flush;
        public @Unsigned int no_setxattr;
        public @Unsigned int setxattr_ext;
        public @Unsigned int no_getxattr;
        public @Unsigned int no_listxattr;
        public @Unsigned int no_removexattr;
        public @Unsigned int no_lock;
        public @Unsigned int no_access;
        public @Unsigned int no_create;
        public @Unsigned int no_interrupt;
        public @Unsigned int no_bmap;
        public @Unsigned int no_poll;
        public @Unsigned int big_writes;
        public @Unsigned int dont_mask;
        public @Unsigned int no_flock;
        public @Unsigned int no_fallocate;
        public @Unsigned int no_rename2;
        public @Unsigned int auto_inval_data;
        public @Unsigned int explicit_inval_data;
        public @Unsigned int do_readdirplus;
        public @Unsigned int readdirplus_auto;
        public @Unsigned int async_dio;
        public @Unsigned int no_lseek;
        public @Unsigned int posix_acl;
        public @Unsigned int default_permissions;
        public @Unsigned int allow_other;
        public @Unsigned int no_copy_file_range;
        public @Unsigned int destroy;
        public @Unsigned int delete_stale;
        public @Unsigned int no_control;
        public @Unsigned int no_force_umount;
        public @Unsigned int auto_submounts;
        public @Unsigned int sync_fs;
        public @Unsigned int init_security;
        public @Unsigned int create_supp_group;
        public @Unsigned int inode_dax;
        public @Unsigned int no_tmpfile;
        public @Unsigned int direct_io_allow_mmap;
        public @Unsigned int no_statx;
        public @Unsigned int passthrough;
        public @Unsigned int use_pages_for_kvec_io;
        public int max_stack_depth;
        public AtomicDefinitions.atomic_t num_waiting;
        public @Unsigned int minor;
        public ListDefinitions.list_head entry;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public Ptr<runtime.dentry> @Size(value=5) [] ctl_dentry;
        public int ctl_ndents;
        public @Unsigned int @Size(value=4) [] scramble_key;
        public misc.atomic64_t attr_version;
        public Ptr<?> release;
        public misc.rw_semaphore killsb;
        public ListDefinitions.list_head devices;
        public fuse_dax_mode dax_mode;
        public Ptr<fuse_conn_dax> dax;
        public ListDefinitions.list_head mounts;
        public Ptr<fuse_sync_bucket> curr_bucket;
        public runtime.idr backing_files_map;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_dev")
    @NotUsableInJava
    public static class fuse_dev
    extends Struct {
        public Ptr<fuse_conn> fc;
        public fuse_pqueue pq;
        public ListDefinitions.list_head entry;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_pqueue")
    @NotUsableInJava
    public static class fuse_pqueue
    extends Struct {
        public @Unsigned int connected;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<ListDefinitions.list_head> processing;
        public ListDefinitions.list_head io;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_iqueue")
    @NotUsableInJava
    public static class fuse_iqueue
    extends Struct {
        public @Unsigned int connected;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitq;
        public @Unsigned long reqctr;
        public ListDefinitions.list_head pending;
        public ListDefinitions.list_head interrupts;
        public fuse_forget_link forget_list_head;
        public Ptr<fuse_forget_link> forget_list_tail;
        public int forget_batch;
        public Ptr<misc.fasync_struct> fasync;
        public Ptr<fuse_iqueue_ops> ops;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_iqueue_ops")
    @NotUsableInJava
    public static class fuse_iqueue_ops
    extends Struct {
        public Ptr<?> send_forget;
        public Ptr<?> send_interrupt;
        public Ptr<?> send_req;
        public Ptr<?> release;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_req")
    @NotUsableInJava
    public static class fuse_req
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head intr_entry;
        public Ptr<fuse_args> args;
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public @Unsigned long flags;
        public InDefinitions.in_of_fuse_req in;
        public misc.out_of_fuse_req out;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitq;
        public Ptr<?> argbuf;
        public Ptr<fuse_mount> fm;
    }

    @Type(noCCodeGeneration=true, cType="enum fuse_req_flag")
    public static enum fuse_req_flag implements Enum<fuse_req_flag>,
    TypedEnum<fuse_req_flag, Integer>
    {
        FR_ISREPLY,
        FR_FORCE,
        FR_BACKGROUND,
        FR_WAITING,
        FR_ABORTED,
        FR_INTERRUPTED,
        FR_LOCKED,
        FR_PENDING,
        FR_SENT,
        FR_FINISHED,
        FR_PRIVATE,
        FR_ASYNC;

    }

    @Type(noCCodeGeneration=true, cType="struct fuse_release_args")
    @NotUsableInJava
    public static class fuse_release_args
    extends Struct {
        public fuse_args args;
        public fuse_release_in inarg;
        public Ptr<runtime.inode> inode;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_args_pages")
    @NotUsableInJava
    public static class fuse_args_pages
    extends Struct {
        public fuse_args args;
        public Ptr<Ptr<runtime.page>> pages;
        public Ptr<fuse_page_desc> descs;
        public @Unsigned int num_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_args")
    @NotUsableInJava
    public static class fuse_args
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long nodeid;
        public @Unsigned @OriginalName(value="uint32_t") int opcode;
        public @OriginalName(value="uint8_t") char in_numargs;
        public @OriginalName(value="uint8_t") char out_numargs;
        public @OriginalName(value="uint8_t") char ext_idx;
        public boolean force;
        public boolean noreply;
        public boolean nocreds;
        public boolean in_pages;
        public boolean out_pages;
        public boolean user_pages;
        public boolean out_argvar;
        public boolean page_zeroing;
        public boolean page_replace;
        public boolean may_block;
        public boolean is_ext;
        public boolean is_pinned;
        public boolean invalidate_vmap;
        public fuse_in_arg @Size(value=3) [] in_args;
        public fuse_arg @Size(value=2) [] out_args;
        public Ptr<?> end;
        public Ptr<?> vmap_base;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_page_desc")
    @NotUsableInJava
    public static class fuse_page_desc
    extends Struct {
        public @Unsigned int length;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_arg")
    @NotUsableInJava
    public static class fuse_arg
    extends Struct {
        public @Unsigned int size;
        public Ptr<?> value;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_in_arg")
    @NotUsableInJava
    public static class fuse_in_arg
    extends Struct {
        public @Unsigned int size;
        public Ptr<?> value;
    }

    @Type(noCCodeGeneration=true, cType="union fuse_file_args")
    @NotUsableInJava
    public static class fuse_file_args
    extends Union {
        public fuse_open_out open_outarg;
        public fuse_release_args release_args;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_mount")
    @NotUsableInJava
    public static class fuse_mount
    extends Struct {
        public Ptr<fuse_conn> fc;
        public Ptr<SuperDefinitions.super_block> sb;
        public ListDefinitions.list_head fc_entry;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_file")
    @NotUsableInJava
    public static class fuse_file
    extends Struct {
        public Ptr<fuse_mount> fm;
        public Ptr<fuse_file_args> args;
        public @Unsigned long kh;
        public @Unsigned long fh;
        public @Unsigned long nodeid;
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public @Unsigned int open_flags;
        public ListDefinitions.list_head write_entry;
        public misc.readdir_of_fuse_file readdir;
        public RbDefinitions.rb_node polled_node;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head poll_wait;
        public misc.iomode_of_fuse_file iomode;
        public Ptr<runtime.file> passthrough;
        public Ptr<runtime.cred> cred;
        public boolean flock;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_forget_link")
    @NotUsableInJava
    public static class fuse_forget_link
    extends Struct {
        public fuse_forget_one forget_one;
        public Ptr<fuse_forget_link> next;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_backing_map")
    @NotUsableInJava
    public static class fuse_backing_map
    extends Struct {
        public @OriginalName(value="int32_t") int fd;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint64_t") long padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_notify_retrieve_in")
    @NotUsableInJava
    public static class fuse_notify_retrieve_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long dummy1;
        public @Unsigned @OriginalName(value="uint64_t") long offset;
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int dummy2;
        public @Unsigned @OriginalName(value="uint64_t") long dummy3;
        public @Unsigned @OriginalName(value="uint64_t") long dummy4;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_notify_retrieve_out")
    @NotUsableInJava
    public static class fuse_notify_retrieve_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long notify_unique;
        public @Unsigned @OriginalName(value="uint64_t") long nodeid;
        public @Unsigned @OriginalName(value="uint64_t") long offset;
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_notify_store_out")
    @NotUsableInJava
    public static class fuse_notify_store_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long nodeid;
        public @Unsigned @OriginalName(value="uint64_t") long offset;
        public @Unsigned @OriginalName(value="uint32_t") int size;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_notify_delete_out")
    @NotUsableInJava
    public static class fuse_notify_delete_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long parent;
        public @Unsigned @OriginalName(value="uint64_t") long child;
        public @Unsigned @OriginalName(value="uint32_t") int namelen;
        public @Unsigned @OriginalName(value="uint32_t") int padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_notify_inval_entry_out")
    @NotUsableInJava
    public static class fuse_notify_inval_entry_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long parent;
        public @Unsigned @OriginalName(value="uint32_t") int namelen;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_notify_inval_inode_out")
    @NotUsableInJava
    public static class fuse_notify_inval_inode_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long ino;
        public @OriginalName(value="int64_t") long off;
        public @OriginalName(value="int64_t") long len;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_out_header")
    @NotUsableInJava
    public static class fuse_out_header
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int len;
        public @OriginalName(value="int32_t") int error;
        public @Unsigned @OriginalName(value="uint64_t") long unique;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_in_header")
    @NotUsableInJava
    public static class fuse_in_header
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int len;
        public @Unsigned @OriginalName(value="uint32_t") int opcode;
        public @Unsigned @OriginalName(value="uint64_t") long unique;
        public @Unsigned @OriginalName(value="uint64_t") long nodeid;
        public @Unsigned @OriginalName(value="uint32_t") int uid;
        public @Unsigned @OriginalName(value="uint32_t") int gid;
        public @Unsigned @OriginalName(value="uint32_t") int pid;
        public @Unsigned @OriginalName(value="uint16_t") short total_extlen;
        public @Unsigned @OriginalName(value="uint16_t") short padding;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_notify_poll_wakeup_out")
    @NotUsableInJava
    public static class fuse_notify_poll_wakeup_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long kh;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_interrupt_in")
    @NotUsableInJava
    public static class fuse_interrupt_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long unique;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_release_in")
    @NotUsableInJava
    public static class fuse_release_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int release_flags;
        public @Unsigned @OriginalName(value="uint64_t") long lock_owner;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_open_out")
    @NotUsableInJava
    public static class fuse_open_out
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long fh;
        public @Unsigned @OriginalName(value="uint32_t") int open_flags;
        public @OriginalName(value="int32_t") int backing_id;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_batch_forget_in")
    @NotUsableInJava
    public static class fuse_batch_forget_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int count;
        public @Unsigned @OriginalName(value="uint32_t") int dummy;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_forget_one")
    @NotUsableInJava
    public static class fuse_forget_one
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long nodeid;
        public @Unsigned @OriginalName(value="uint64_t") long nlookup;
    }

    @Type(noCCodeGeneration=true, cType="struct fuse_forget_in")
    @NotUsableInJava
    public static class fuse_forget_in
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long nlookup;
    }

    @Type(noCCodeGeneration=true, cType="enum fuse_notify_code")
    public static enum fuse_notify_code implements Enum<fuse_notify_code>,
    TypedEnum<fuse_notify_code, Integer>
    {
        FUSE_NOTIFY_POLL,
        FUSE_NOTIFY_INVAL_INODE,
        FUSE_NOTIFY_INVAL_ENTRY,
        FUSE_NOTIFY_STORE,
        FUSE_NOTIFY_RETRIEVE,
        FUSE_NOTIFY_DELETE,
        FUSE_NOTIFY_RESEND,
        FUSE_NOTIFY_CODE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum fuse_opcode")
    public static enum fuse_opcode implements Enum<fuse_opcode>,
    TypedEnum<fuse_opcode, Integer>
    {
        FUSE_LOOKUP,
        FUSE_FORGET,
        FUSE_GETATTR,
        FUSE_SETATTR,
        FUSE_READLINK,
        FUSE_SYMLINK,
        FUSE_MKNOD,
        FUSE_MKDIR,
        FUSE_UNLINK,
        FUSE_RMDIR,
        FUSE_RENAME,
        FUSE_LINK,
        FUSE_OPEN,
        FUSE_READ,
        FUSE_WRITE,
        FUSE_STATFS,
        FUSE_RELEASE,
        FUSE_FSYNC,
        FUSE_SETXATTR,
        FUSE_GETXATTR,
        FUSE_LISTXATTR,
        FUSE_REMOVEXATTR,
        FUSE_FLUSH,
        FUSE_INIT,
        FUSE_OPENDIR,
        FUSE_READDIR,
        FUSE_RELEASEDIR,
        FUSE_FSYNCDIR,
        FUSE_GETLK,
        FUSE_SETLK,
        FUSE_SETLKW,
        FUSE_ACCESS,
        FUSE_CREATE,
        FUSE_INTERRUPT,
        FUSE_BMAP,
        FUSE_DESTROY,
        FUSE_IOCTL,
        FUSE_POLL,
        FUSE_NOTIFY_REPLY,
        FUSE_BATCH_FORGET,
        FUSE_FALLOCATE,
        FUSE_READDIRPLUS,
        FUSE_RENAME2,
        FUSE_LSEEK,
        FUSE_COPY_FILE_RANGE,
        FUSE_SETUPMAPPING,
        FUSE_REMOVEMAPPING,
        FUSE_SYNCFS,
        FUSE_TMPFILE,
        FUSE_STATX,
        CUSE_INIT,
        CUSE_INIT_BSWAP_RESERVED,
        FUSE_INIT_BSWAP_RESERVED;

    }
}

