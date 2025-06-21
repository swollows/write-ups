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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vfs_cleanup_quota_inode(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.vfsmount> vfs_create_mount(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_dentry_acceptable(Ptr<?> context2, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fallocate(Ptr<runtime.file> file2, int mode, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fchmod(Ptr<runtime.file> file2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fchown(Ptr<runtime.file> file2, @Unsigned @OriginalName(value="uid_t") int user, @Unsigned @OriginalName(value="gid_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fstat(int fd2, Ptr<runtime.kstat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_fstatat($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int vfs_fstatat(int dfd, String filename2, Ptr<runtime.kstat> stat2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_get_acl($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<PosixDefinitions.posix_acl> vfs_get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_getattr((const struct path*)$arg1, $arg2, $arg3, $arg4)")
    public static int vfs_getattr(Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_getattr_nosec((const struct path*)$arg1, $arg2, $arg3, $arg4)")
    public static int vfs_getattr_nosec(Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_kern_mount($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<runtime.vfsmount> vfs_kern_mount(Ptr<FileDefinitions.file_system_type> type2, int flags, String name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_open((const struct path*)$arg1, $arg2)")
    public static int vfs_open(Ptr<runtime.path> path2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int vfs_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_set_acl($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int vfs_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vfs_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_statx(int dfd, Ptr<runtime.filename> filename2, int flags, Ptr<runtime.kstat> stat2, @Unsigned int request_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_statx_path(Ptr<runtime.path> path2, int flags, Ptr<runtime.kstat> stat2, @Unsigned int request_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_submount((const struct dentry*)$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<runtime.vfsmount> vfs_submount(Ptr<runtime.dentry> mountpoint2, Ptr<FileDefinitions.file_system_type> type2, String name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_truncate((const struct path*)$arg1, $arg2)")
    public static long vfs_truncate(Ptr<runtime.path> path2, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vfs_clean_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_create(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, boolean want_excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FsDefinitions.fs_context> vfs_dup_fs_context(Ptr<FsDefinitions.fs_context> src_fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)vfs_get_link($arg1, $arg2))")
    public static String vfs_get_link(Ptr<runtime.dentry> dentry2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_link(Ptr<runtime.dentry> old_dentry, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> new_dentry, Ptr<Ptr<runtime.inode>> delegated_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_mkobj($arg1, $arg2, (int (*)(struct dentry*, short unsigned int, void*))$arg3, $arg4)")
    public static int vfs_mkobj(Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<?> f, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String vfs_parse_comma_sep(Ptr<String> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_parse_fs_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_parse_fs_param_source(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_parse_fs_string($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static int vfs_parse_fs_string(Ptr<FsDefinitions.fs_context> fc, String key2, String value, @Unsigned long v_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_parse_monolithic_sep($arg1, $arg2, (u8* (*)(u8**))$arg3)")
    public static int vfs_parse_monolithic_sep(Ptr<FsDefinitions.fs_context> fc, Ptr<?> data, Ptr<?> sep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_path_lookup($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int vfs_path_lookup(Ptr<runtime.dentry> dentry2, Ptr<runtime.vfsmount> mnt, String name, @Unsigned int flags, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_path_parent_lookup($arg1, $arg2, $arg3, $arg4, $arg5, (const struct path*)$arg6)")
    public static int vfs_path_parent_lookup(Ptr<runtime.filename> filename2, @Unsigned int flags, Ptr<runtime.path> parent, Ptr<runtime.qstr> last, Ptr<Integer> type2, Ptr<runtime.path> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_readlink(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_rename(Ptr<renamedata> rd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_rmdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int vfs_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String oldname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_tmpfile($arg1, (const struct path*)$arg2, $arg3, $arg4)")
    public static int vfs_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> parentpath, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_unlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, Ptr<Ptr<runtime.inode>> delegated_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_utimes((const struct path*)$arg1, $arg2)")
    public static int vfs_utimes(Ptr<runtime.path> path2, Ptr<runtime.timespec64> times) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vfs_copy_file_range(Ptr<runtime.file> file_in, @OriginalName(value="loff_t") long pos_in, Ptr<runtime.file> file_out, @OriginalName(value="loff_t") long pos_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fadvise(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len, int advice) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vfs_iocb_iter_read(Ptr<runtime.file> file2, Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vfs_iocb_iter_write(Ptr<runtime.file> file2, Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vfs_iter_read(Ptr<runtime.file> file2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<@OriginalName(value="loff_t") Long> ppos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vfs_iter_write(Ptr<runtime.file> file2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<@OriginalName(value="loff_t") Long> ppos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long vfs_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vfs_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_readv($arg1, (const struct iovec*)$arg2, $arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long vfs_readv(Ptr<runtime.file> file2, Ptr<runtime.iovec> vec, @Unsigned long vlen, Ptr<@OriginalName(value="loff_t") Long> pos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long vfs_setpos(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long maxsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long vfs_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_writev($arg1, (const struct iovec*)$arg2, $arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long vfs_writev(Ptr<runtime.file> file2, Ptr<runtime.iovec> vec, @Unsigned long vlen, Ptr<@OriginalName(value="loff_t") Long> pos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__vfs_getxattr($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long __vfs_getxattr(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__vfs_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int __vfs_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__vfs_removexattr_locked($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int __vfs_removexattr_locked(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<Ptr<runtime.inode>> delegated_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__vfs_setxattr($arg1, $arg2, $arg3, (const u8*)$arg4, (const void*)$arg5, $arg6, $arg7)")
    public static int __vfs_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__vfs_setxattr_locked($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static int __vfs_setxattr_locked(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags, Ptr<Ptr<runtime.inode>> delegated_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__vfs_setxattr_noperm($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int __vfs_setxattr_noperm(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vfs_caches_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vfs_caches_init_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_cancel_lock(Ptr<runtime.file> filp, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long vfs_clone_file_range(Ptr<runtime.file> file_in, @OriginalName(value="loff_t") long pos_in, Ptr<runtime.file> file_out, @OriginalName(value="loff_t") long pos_out, @OriginalName(value="loff_t") long len, @Unsigned int remap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_cmd_create(Ptr<FsDefinitions.fs_context> fc, boolean exclusive) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_dedupe_file_range(Ptr<runtime.file> file2, Ptr<FileDefinitions.file_dedupe_range> same) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_dedupe_file_range_compare(Ptr<runtime.file> src, @OriginalName(value="loff_t") long srcoff, Ptr<runtime.file> dest, @OriginalName(value="loff_t") long dstoff, @OriginalName(value="loff_t") long len, Ptr<@OriginalName(value="bool") Boolean> is_same) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long vfs_dedupe_file_range_one(Ptr<runtime.file> src_file, @OriginalName(value="loff_t") long src_pos, Ptr<runtime.file> dst_file, @OriginalName(value="loff_t") long dst_pos, @OriginalName(value="loff_t") long len, @Unsigned int remap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fileattr_get(Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fileattr_set(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fsync(Ptr<runtime.file> file2, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_fsync_range(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_get_fsid(Ptr<runtime.dentry> dentry2, Ptr<KernelDefinitions.__kernel_fsid_t> fsid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_getxattr($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long vfs_getxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_getxattr_alloc($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static int vfs_getxattr_alloc(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<String> xattr_value, @Unsigned long xattr_size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vfs_inode_has_locks(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long vfs_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vfs_listxattr(Ptr<runtime.dentry> dentry2, String list, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_lock_file(Ptr<runtime.file> filp, @Unsigned int cmd, Ptr<FileDefinitions.file_lock> fl, Ptr<FileDefinitions.file_lock> conf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int vfs_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_setlease(Ptr<runtime.file> filp, int arg2, Ptr<Ptr<FileDefinitions.file_lease>> lease, Ptr<Ptr<?>> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vfs_setxattr($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int vfs_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vfs_test_lock(Ptr<runtime.file> filp, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int permitted; unsigned int inheritable; }")
    @NotUsableInJava
    public static class AnonymousType1589214445C64
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int permitted;
        public @Unsigned @OriginalName(value="__le32") int inheritable;
    }

    @Type(noCCodeGeneration=true, cType="struct renamedata")
    @NotUsableInJava
    public static class renamedata
    extends Struct {
        public Ptr<MntDefinitions.mnt_idmap> old_mnt_idmap;
        public Ptr<runtime.inode> old_dir;
        public Ptr<runtime.dentry> old_dentry;
        public Ptr<MntDefinitions.mnt_idmap> new_mnt_idmap;
        public Ptr<runtime.inode> new_dir;
        public Ptr<runtime.dentry> new_dentry;
        public Ptr<Ptr<runtime.inode>> delegated_inode;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct vfs_ns_cap_data")
    @NotUsableInJava
    public static class vfs_ns_cap_data
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int magic_etc;
        public AnonymousType1589214445C64 @Size(value=2) [] data;
        public @Unsigned @OriginalName(value="__le32") int rootid;
    }

    @Type(noCCodeGeneration=true, cType="struct vfs_cap_data")
    @NotUsableInJava
    public static class vfs_cap_data
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int magic_etc;
        public AnonymousType1589214445C64 @Size(value=2) [] data;
    }
}

