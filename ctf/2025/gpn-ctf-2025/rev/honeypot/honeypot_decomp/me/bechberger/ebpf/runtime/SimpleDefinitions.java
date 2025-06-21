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
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SimpleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_acl_create(Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String simple_dname(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<PosixDefinitions.posix_acl> acl, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_strntoll((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static long simple_strntoll(String cp, Ptr<String> endp, @Unsigned int base, @Unsigned long max_chars) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_strntoull((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned long simple_strntoull(String startp, Ptr<String> endp, @Unsigned int base, @Unsigned long max_chars) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_strtol((const u8*)$arg1, $arg2, $arg3)")
    public static long simple_strtol(String cp, Ptr<String> endp, @Unsigned int base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_strtoll((const u8*)$arg1, $arg2, $arg3)")
    public static long simple_strtoll(String cp, Ptr<String> endp, @Unsigned int base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_strtoul((const u8*)$arg1, $arg2, $arg3)")
    public static @Unsigned long simple_strtoul(String cp, Ptr<String> endp, @Unsigned int base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_strtoull((const u8*)$arg1, $arg2, $arg3)")
    public static @Unsigned long simple_strtoull(String cp, Ptr<String> endp, @Unsigned int base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_attr_open($arg1, $arg2, (int (*)(void*, long long unsigned int*))$arg3, (int (*)(void*, long long unsigned int))$arg4, (const u8*)$arg5)")
    public static int simple_attr_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, Ptr<?> get, Ptr<?> set, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long simple_attr_read(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_attr_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_attr_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long simple_attr_write(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_attr_write_signed($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long simple_attr_write_signed(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_empty(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_fill_super($arg1, $arg2, (const struct tree_descr*)$arg3)")
    public static int simple_fill_super(Ptr<SuperDefinitions.super_block> s2, @Unsigned long magic, Ptr<misc.tree_descr> files) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)simple_get_link($arg1, $arg2, $arg3))")
    public static String simple_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int simple_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static runtime.timespec64 simple_inode_init_ts(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> simple_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_nosetlease(Ptr<runtime.file> filp, int arg2, Ptr<Ptr<FileDefinitions.file_lease>> flp, Ptr<Ptr<?>> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_offset_add(Ptr<misc.offset_ctx> octx, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_offset_destroy(Ptr<misc.offset_ctx> octx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_offset_empty(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_offset_init(Ptr<misc.offset_ctx> octx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_offset_remove(Ptr<misc.offset_ctx> octx, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_offset_rename(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_offset_rename_exchange(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_pin_fs(Ptr<FileDefinitions.file_system_type> type2, Ptr<Ptr<runtime.vfsmount>> mount2, Ptr<Integer> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_read_folio(Ptr<runtime.file> file2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_read_from_buffer($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long simple_read_from_buffer(Ptr<?> to, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<?> from, @Unsigned long available) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_recursive_removal($arg1, (void (*)(struct dentry*))$arg2)")
    public static void simple_recursive_removal(Ptr<runtime.dentry> dentry2, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_release_fs(Ptr<Ptr<runtime.vfsmount>> mount2, Ptr<Integer> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_rename(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_rename_exchange(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_rename_timestamp(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_statfs(Ptr<runtime.dentry> dentry2, Ptr<runtime.kstatfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_transaction_get($arg1, (const u8*)$arg2, $arg3)")
    public static String simple_transaction_get(Ptr<runtime.file> file2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long simple_transaction_read(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_transaction_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_transaction_set(Ptr<runtime.file> file2, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_write_begin(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int simple_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_write_to_buffer($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long simple_write_to_buffer(Ptr<?> to, @Unsigned long available, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<?> from, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_copy_to_iter((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned long simple_copy_to_iter(Ptr<?> addr2, @Unsigned long bytes, Ptr<?> data, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_xattr_add(Ptr<simple_xattrs> xattrs, Ptr<simple_xattr> new_xattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_xattr_alloc((const void*)$arg1, $arg2)")
    public static Ptr<simple_xattr> simple_xattr_alloc(Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_xattr_free(Ptr<simple_xattr> xattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_xattr_get($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int simple_xattr_get(Ptr<simple_xattrs> xattrs, String name, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long simple_xattr_list(Ptr<runtime.inode> inode2, Ptr<simple_xattrs> xattrs, String buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_xattr_set($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static Ptr<simple_xattr> simple_xattr_set(Ptr<simple_xattrs> xattrs, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="simple_xattr_space((const u8*)$arg1, $arg2)")
    public static @Unsigned long simple_xattr_space(String name, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_xattrs_free(Ptr<simple_xattrs> xattrs, Ptr<@Unsigned Long> freed_space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void simple_xattrs_init(Ptr<simple_xattrs> xattrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct simple_attr")
    @NotUsableInJava
    public static class simple_attr
    extends Struct {
        public Ptr<?> get;
        public Ptr<?> set;
        public char @Size(value=24) [] get_buf;
        public char @Size(value=24) [] set_buf;
        public Ptr<?> data;
        public String fmt;
        public runtime.mutex mutex;
    }

    @Type(noCCodeGeneration=true, cType="struct simple_transaction_argresp")
    @NotUsableInJava
    public static class simple_transaction_argresp
    extends Struct {
        public @OriginalName(value="ssize_t") long size;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct simple_xattr")
    @NotUsableInJava
    public static class simple_xattr
    extends Struct {
        public RbDefinitions.rb_node rb_node;
        public String name;
        public @Unsigned long size;
        public char @Size(value=0) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct simple_xattrs")
    @NotUsableInJava
    public static class simple_xattrs
    extends Struct {
        public RbDefinitions.rb_root rb_root;
        public misc.rwlock_t lock;
    }
}

