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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SimpleDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KernfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kernfs_iattrs> __kernfs_iattrs(Ptr<kernfs_node> kn, int alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kernfs_setattr($arg1, (const struct iattr*)$arg2)")
    public static int __kernfs_setattr(Ptr<kernfs_node> kn, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> kernfs_get_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_iop_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int kernfs_iop_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kernfs_iop_listxattr(Ptr<runtime.dentry> dentry2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_iop_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_iop_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_refresh_inode(Ptr<kernfs_node> kn, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_setattr($arg1, (const struct iattr*)$arg2)")
    public static int kernfs_setattr(Ptr<kernfs_node> kn, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_vfs_user_xattr_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int kernfs_vfs_user_xattr_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String suffix, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_vfs_xattr_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int kernfs_vfs_xattr_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String suffix, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_vfs_xattr_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int kernfs_vfs_xattr_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String suffix, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_xattr_get($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int kernfs_xattr_get(Ptr<kernfs_node> kn, String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_xattr_set($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int kernfs_xattr_set(Ptr<kernfs_node> kn, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kernfs_new_node($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static Ptr<kernfs_node> __kernfs_new_node(Ptr<kernfs_root> root, Ptr<kernfs_node> parent, String name, @Unsigned @OriginalName(value="umode_t") short mode, misc.kuid_t uid, misc.kgid_t gid, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kernfs_remove(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_activate(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_activate_one(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_add_one(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_break_active_protection(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_create_dir_ns($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6, (const void*)$arg7)")
    public static Ptr<kernfs_node> kernfs_create_dir_ns(Ptr<kernfs_node> parent, String name, @Unsigned @OriginalName(value="umode_t") short mode, misc.kuid_t uid, misc.kgid_t gid, Ptr<?> priv, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_create_empty_dir($arg1, (const u8*)$arg2)")
    public static Ptr<kernfs_node> kernfs_create_empty_dir(Ptr<kernfs_node> parent, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kernfs_root> kernfs_create_root(Ptr<kernfs_syscall_ops> scops, @Unsigned int flags, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_destroy_root(Ptr<kernfs_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_dir_fop_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_dir_pos((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<kernfs_node> kernfs_dir_pos(Ptr<?> ns, Ptr<kernfs_node> parent, @OriginalName(value="loff_t") long hash2, Ptr<kernfs_node> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_dop_revalidate(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_drain(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kernfs_node> kernfs_find_and_get_node_by_id(Ptr<kernfs_root> root, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_find_and_get_ns($arg1, (const u8*)$arg2, (const void*)$arg3)")
    public static Ptr<kernfs_node> kernfs_find_and_get_ns(Ptr<kernfs_node> parent, String name, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_find_ns($arg1, (const u8*)$arg2, (const void*)$arg3)")
    public static Ptr<kernfs_node> kernfs_find_ns(Ptr<kernfs_node> parent, String name, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_fop_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_free_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_get(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kernfs_node> kernfs_get_active(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kernfs_node> kernfs_get_parent(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> kernfs_iop_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_iop_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_iop_rename(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_iop_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_link_sibling(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_name(Ptr<kernfs_node> kn, String buf, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_name_hash((const u8*)$arg1, (const void*)$arg2)")
    public static @Unsigned int kernfs_name_hash(String name, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_name_locked(Ptr<kernfs_node> kn, String buf, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_new_node($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<kernfs_node> kernfs_new_node(Ptr<kernfs_node> parent, String name, @Unsigned @OriginalName(value="umode_t") short mode, misc.kuid_t uid, misc.kgid_t gid, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kernfs_node> kernfs_node_from_dentry(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_path_from_node(Ptr<kernfs_node> to, Ptr<kernfs_node> from, String buf, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_path_from_node_locked(Ptr<kernfs_node> kn_to, Ptr<kernfs_node> kn_from, String buf, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_put(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_put_active(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_remove(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_remove_by_name_ns($arg1, (const u8*)$arg2, (const void*)$arg3)")
    public static int kernfs_remove_by_name_ns(Ptr<kernfs_node> parent, String name, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kernfs_remove_self(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_rename_ns($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4)")
    public static int kernfs_rename_ns(Ptr<kernfs_node> kn, Ptr<kernfs_node> new_parent, String new_name, Ptr<?> new_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kernfs_node> kernfs_root_to_node(Ptr<kernfs_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_show(Ptr<kernfs_node> kn, boolean show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_unbreak_active_protection(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kernfs_unlink_sibling(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_walk_and_get_ns($arg1, (const u8*)$arg2, (const void*)$arg3)")
    public static Ptr<kernfs_node> kernfs_walk_and_get_ns(Ptr<kernfs_node> parent, String path2, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_walk_ns($arg1, (const u8*)$arg2, (const void*)$arg3)")
    public static Ptr<kernfs_node> kernfs_walk_ns(Ptr<kernfs_node> parent, String path2, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kernfs_create_link($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<kernfs_node> kernfs_create_link(Ptr<kernfs_node> parent, String name, Ptr<kernfs_node> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_encode_fh(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> fh, Ptr<Integer> max_len, Ptr<runtime.inode> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> kernfs_fh_to_dentry(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> kernfs_fh_to_parent(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_free_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> kernfs_get_parent_dentry(Ptr<runtime.dentry> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_get_target_path(Ptr<kernfs_node> parent, Ptr<kernfs_node> target, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)kernfs_iop_get_link($arg1, $arg2, $arg3))")
    public static String kernfs_iop_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> kernfs_node_dentry(Ptr<kernfs_node> kn, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kernfs_root> kernfs_root_from_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_set_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_sop_show_options(Ptr<SeqDefinitions.seq_file> sf, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_sop_show_path(Ptr<SeqDefinitions.seq_file> sf, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_statfs(Ptr<runtime.dentry> dentry2, Ptr<runtime.kstatfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)kernfs_super_ns($arg1))")
    public static Ptr<?> kernfs_super_ns(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_test_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kernfs_create_file($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6, (const struct kernfs_ops*)$arg7, $arg8, (const void*)$arg9, $arg10)")
    public static Ptr<kernfs_node> __kernfs_create_file(Ptr<kernfs_node> parent, String name, @Unsigned @OriginalName(value="umode_t") short mode, misc.kuid_t uid, misc.kgid_t gid, @OriginalName(value="loff_t") long size, Ptr<kernfs_ops> ops, Ptr<?> priv, Ptr<?> ns, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_drain_open_files(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kernfs_file_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long kernfs_fop_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_fop_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_fop_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int kernfs_fop_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kernfs_fop_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_fop_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kernfs_fop_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int kernfs_generic_poll(Ptr<kernfs_open_file> of, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_notify(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_notify_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kernfs_seq_next(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_seq_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kernfs_seq_start(Ptr<SeqDefinitions.seq_file> sf, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_seq_stop(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kernfs_should_drain_open_files(Ptr<kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_unlink_open_file(Ptr<kernfs_node> kn, Ptr<kernfs_open_file> of, boolean open_failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kernfs_vma_access(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<?> buf, int len, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int kernfs_vma_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kernfs_vma_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int kernfs_vma_page_mkwrite(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_super_info")
    @NotUsableInJava
    public static class kernfs_super_info
    extends Struct {
        public Ptr<SuperDefinitions.super_block> sb;
        public Ptr<kernfs_root> root;
        public Ptr<?> ns;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_iattrs")
    @NotUsableInJava
    public static class kernfs_iattrs
    extends Struct {
        public misc.kuid_t ia_uid;
        public misc.kgid_t ia_gid;
        public runtime.timespec64 ia_atime;
        public runtime.timespec64 ia_mtime;
        public runtime.timespec64 ia_ctime;
        public SimpleDefinitions.simple_xattrs xattrs;
        public AtomicDefinitions.atomic_t nr_user_xattrs;
        public AtomicDefinitions.atomic_t user_xattr_size;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_open_node")
    @NotUsableInJava
    public static class kernfs_open_node
    extends Struct {
        public misc.callback_head callback_head;
        public AtomicDefinitions.atomic_t event;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head poll;
        public ListDefinitions.list_head files;
        public @Unsigned int nr_mmapped;
        public @Unsigned int nr_to_release;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_root")
    @NotUsableInJava
    public static class kernfs_root
    extends Struct {
        public Ptr<kernfs_node> kn;
        public @Unsigned int flags;
        public runtime.idr ino_idr;
        public @Unsigned int last_id_lowbits;
        public @Unsigned int id_highbits;
        public Ptr<kernfs_syscall_ops> syscall_ops;
        public ListDefinitions.list_head supers;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head deactivate_waitq;
        public misc.rw_semaphore kernfs_rwsem;
        public misc.rw_semaphore kernfs_iattr_rwsem;
        public misc.rw_semaphore kernfs_supers_rwsem;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum kernfs_node_flag")
    public static enum kernfs_node_flag implements Enum<kernfs_node_flag>,
    TypedEnum<kernfs_node_flag, Integer>
    {
        KERNFS_ACTIVATED,
        KERNFS_NS,
        KERNFS_HAS_SEQ_SHOW,
        KERNFS_HAS_MMAP,
        KERNFS_LOCKDEP,
        KERNFS_HIDDEN,
        KERNFS_SUICIDAL,
        KERNFS_SUICIDED,
        KERNFS_EMPTY_DIR,
        KERNFS_HAS_RELEASE,
        KERNFS_REMOVING;

    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_global_locks")
    @NotUsableInJava
    public static class kernfs_global_locks
    extends Struct {
        public runtime.mutex @Size(value=1024) [] open_file_mutex;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_fs_context")
    @NotUsableInJava
    public static class kernfs_fs_context
    extends Struct {
        public Ptr<kernfs_root> root;
        public Ptr<?> ns_tag;
        public @Unsigned long magic;
        public boolean new_sb_created;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_syscall_ops")
    @NotUsableInJava
    public static class kernfs_syscall_ops
    extends Struct {
        public Ptr<?> show_options;
        public Ptr<?> mkdir;
        public Ptr<?> rmdir;
        public Ptr<?> rename;
        public Ptr<?> show_path;
    }

    @Type(noCCodeGeneration=true, cType="enum kernfs_root_flag")
    public static enum kernfs_root_flag implements Enum<kernfs_root_flag>,
    TypedEnum<kernfs_root_flag, Integer>
    {
        KERNFS_ROOT_CREATE_DEACTIVATED,
        KERNFS_ROOT_EXTRA_OPEN_PERM_CHECK,
        KERNFS_ROOT_SUPPORT_EXPORTOP,
        KERNFS_ROOT_SUPPORT_USER_XATTR;

    }

    @Type(noCCodeGeneration=true, cType="enum kernfs_node_type")
    public static enum kernfs_node_type implements Enum<kernfs_node_type>,
    TypedEnum<kernfs_node_type, Integer>
    {
        KERNFS_DIR,
        KERNFS_FILE,
        KERNFS_LINK;

    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_open_file")
    @NotUsableInJava
    public static class kernfs_open_file
    extends Struct {
        public Ptr<kernfs_node> kn;
        public Ptr<runtime.file> file;
        public Ptr<SeqDefinitions.seq_file> seq_file;
        public Ptr<?> priv;
        public runtime.mutex mutex;
        public runtime.mutex prealloc_mutex;
        public int event;
        public ListDefinitions.list_head list;
        public String prealloc_buf;
        public @Unsigned long atomic_write_len;
        public boolean mmapped;
        public boolean released;
        public Ptr<VmDefinitions.vm_operations_struct> vm_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_ops")
    @NotUsableInJava
    public static class kernfs_ops
    extends Struct {
        public Ptr<?> open;
        public Ptr<?> release;
        public Ptr<?> seq_show;
        public Ptr<?> seq_start;
        public Ptr<?> seq_next;
        public Ptr<?> seq_stop;
        public Ptr<?> read;
        public @Unsigned long atomic_write_len;
        public boolean prealloc;
        public Ptr<?> write;
        public Ptr<?> poll;
        public Ptr<?> mmap;
        public Ptr<?> llseek;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_elem_attr")
    @NotUsableInJava
    public static class kernfs_elem_attr
    extends Struct {
        public Ptr<kernfs_ops> ops;
        public Ptr<kernfs_open_node> open;
        public @OriginalName(value="loff_t") long size;
        public Ptr<kernfs_node> notify_next;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_node")
    @NotUsableInJava
    public static class kernfs_node
    extends Struct {
        public AtomicDefinitions.atomic_t count;
        public AtomicDefinitions.atomic_t active;
        public Ptr<kernfs_node> parent;
        public String name;
        public RbDefinitions.rb_node rb;
        public Ptr<?> ns;
        public @Unsigned int hash;
        public @Unsigned short flags;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        @InlineUnion(value=749)
        public @InlineUnion(value=749) kernfs_elem_dir dir;
        @InlineUnion(value=749)
        public @InlineUnion(value=749) kernfs_elem_symlink symlink;
        @InlineUnion(value=749)
        public @InlineUnion(value=749) kernfs_elem_attr attr;
        public @Unsigned long id;
        public Ptr<?> priv;
        public Ptr<kernfs_iattrs> iattr;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_elem_symlink")
    @NotUsableInJava
    public static class kernfs_elem_symlink
    extends Struct {
        public Ptr<kernfs_node> target_kn;
    }

    @Type(noCCodeGeneration=true, cType="struct kernfs_elem_dir")
    @NotUsableInJava
    public static class kernfs_elem_dir
    extends Struct {
        public @Unsigned long subdirs;
        public RbDefinitions.rb_root children;
        public Ptr<kernfs_root> root;
        public @Unsigned long rev;
    }
}

