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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DebugfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_atomic_t_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_atomic_t_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long debugfs_attr_read(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_attr_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long debugfs_attr_write(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_attr_write_signed($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long debugfs_attr_write_signed(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_atomic_t((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_atomic_t(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<AtomicDefinitions.atomic_t> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_blob((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<runtime.dentry> debugfs_create_blob(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<debugfs_blob_wrapper> blob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_bool((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_bool(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@OriginalName(value="bool") Boolean> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_devm_seqfile($arg1, (const u8*)$arg2, $arg3, (int (*)(struct seq_file*, void*))$arg4)")
    public static void debugfs_create_devm_seqfile(Ptr<runtime.device> dev, String name, Ptr<runtime.dentry> parent, Ptr<?> read_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_regset32((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_regset32(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<debugfs_regset32> regset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_size_t((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_size_t(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_str((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_str(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<String> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_u16((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_u16(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@Unsigned Short> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_u32((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_u32(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_u32_array((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_u32_array(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<debugfs_u32_array> array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_u64((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_u64(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_u8((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_u8(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_ulong((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_ulong(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_x16((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_x16(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@Unsigned Short> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_x32((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_x32(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_x64((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_x64(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_x8((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void debugfs_create_x8(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_devm_entry_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_enter_cancellation(Ptr<runtime.file> file2, Ptr<debugfs_cancellation> cancellation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_file_get(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_file_put(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_leave_cancellation(Ptr<runtime.file> file2, Ptr<debugfs_cancellation> cancellation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_print_regs32($arg1, (const struct debugfs_reg32*)$arg2, $arg3, $arg4, $arg5)")
    public static void debugfs_print_regs32(Ptr<SeqDefinitions.seq_file> s2, Ptr<debugfs_reg32> regs, int nregs, Ptr<?> base, String prefix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long debugfs_read_file_bool(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long debugfs_read_file_str(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct file_operations*)debugfs_real_fops((const struct file*)$arg1))")
    public static Ptr<FileDefinitions.file_operations> debugfs_real_fops(Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_regset32_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_regset32_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_size_t_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_size_t_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_slab_add(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_slab_release(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_u16_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_u16_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_u32_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_u32_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_u64_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_u64_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_u8_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_u8_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_ulong_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_ulong_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_write_file_bool($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long debugfs_write_file_bool(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_write_file_str($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long debugfs_write_file_str(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__debugfs_create_file((const u8*)$arg1, $arg2, $arg3, $arg4, (const struct file_operations*)$arg5, (const struct file_operations*)$arg6)")
    public static Ptr<runtime.dentry> __debugfs_create_file(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<?> data, Ptr<FileDefinitions.file_operations> proxy_fops, Ptr<FileDefinitions.file_operations> real_fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.vfsmount> debugfs_automount(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_automount((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<runtime.dentry> debugfs_create_automount(String name, Ptr<runtime.dentry> parent, @OriginalName(value="debugfs_automount_t") Ptr<?> f, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_dir((const u8*)$arg1, $arg2)")
    public static Ptr<runtime.dentry> debugfs_create_dir(String name, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_file((const u8*)$arg1, $arg2, $arg3, $arg4, (const struct file_operations*)$arg5)")
    public static Ptr<runtime.dentry> debugfs_create_file(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<?> data, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_file_size((const u8*)$arg1, $arg2, $arg3, $arg4, (const struct file_operations*)$arg5, $arg6)")
    public static void debugfs_create_file_size(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<?> data, Ptr<FileDefinitions.file_operations> fops, @OriginalName(value="loff_t") long file_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_file_unsafe((const u8*)$arg1, $arg2, $arg3, $arg4, (const struct file_operations*)$arg5)")
    public static Ptr<runtime.dentry> debugfs_create_file_unsafe(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<?> data, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_create_symlink((const u8*)$arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.dentry> debugfs_create_symlink(String name, Ptr<runtime.dentry> parent, String target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_free_fc(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean debugfs_initialized() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_kernel(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_kprobe_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_lookup((const u8*)$arg1, $arg2)")
    public static Ptr<runtime.dentry> debugfs_lookup(String name, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_lookup_and_remove((const u8*)$arg1, $arg2)")
    public static void debugfs_lookup_and_remove(String name, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_reconfigure(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_release_dentry(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void debugfs_remove(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debugfs_rename($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<runtime.dentry> debugfs_rename(Ptr<runtime.dentry> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.dentry> new_dir, String new_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> ia) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debugfs_get_total_size(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct debugfs_fs_info")
    @NotUsableInJava
    public static class debugfs_fs_info
    extends Struct {
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public @Unsigned int opts;
    }

    @Type(noCCodeGeneration=true, cType="struct debugfs_devm_entry")
    @NotUsableInJava
    public static class debugfs_devm_entry
    extends Struct {
        public Ptr<?> read;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct debugfs_fsdata")
    @NotUsableInJava
    public static class debugfs_fsdata
    extends Struct {
        public Ptr<FileDefinitions.file_operations> real_fops;
        @InlineUnion(value=30347)
        public @InlineUnion(value=30347) @OriginalName(value="debugfs_automount_t") Ptr<?> automount;
        @InlineUnion(value=30347)
        public  @InlineUnion(value=30347) AnonDefinitions.anon_member_of_anon_member_of_debugfs_fsdata anon1$1;
    }

    @Type(noCCodeGeneration=true, cType="struct debugfs_cancellation")
    @NotUsableInJava
    public static class debugfs_cancellation
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> cancel;
        public Ptr<?> cancel_data;
    }

    @Type(noCCodeGeneration=true, cType="struct debugfs_blob_wrapper")
    @NotUsableInJava
    public static class debugfs_blob_wrapper
    extends Struct {
        public Ptr<?> data;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct debugfs_u32_array")
    @NotUsableInJava
    public static class debugfs_u32_array
    extends Struct {
        public Ptr<@Unsigned Integer> array;
        public @Unsigned int n_elements;
    }

    @Type(noCCodeGeneration=true, cType="struct debugfs_regset32")
    @NotUsableInJava
    public static class debugfs_regset32
    extends Struct {
        public Ptr<debugfs_reg32> regs;
        public int nregs;
        public Ptr<?> base;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct debugfs_reg32")
    @NotUsableInJava
    public static class debugfs_reg32
    extends Struct {
        public String name;
        public @Unsigned long offset;
    }
}

