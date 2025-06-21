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
import me.bechberger.ebpf.runtime.ConfigDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ConfigfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_get_target_path(Ptr<ConfigDefinitions.config_item> item, Ptr<ConfigDefinitions.config_item> target, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="configfs_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int configfs_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String symname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_create_dir(Ptr<ConfigDefinitions.config_item> item, Ptr<runtime.dentry> dentry2, Ptr<configfs_fragment> frag2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_create_link(Ptr<configfs_dirent> target, Ptr<runtime.dentry> parent, Ptr<runtime.dentry> dentry2, String body) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_d_iput(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_depend_item(Ptr<configfs_subsystem> subsys, Ptr<ConfigDefinitions.config_item> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_depend_item_unlocked(Ptr<configfs_subsystem> caller_subsys, Ptr<ConfigDefinitions.config_item> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_depend_prep(Ptr<runtime.dentry> origin, Ptr<ConfigDefinitions.config_item> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_detach_rollback(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_dir_close(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long configfs_dir_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_dir_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_dir_set_ready(Ptr<configfs_dirent> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_dirent_is_ready(Ptr<configfs_dirent> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> configfs_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_make_dirent(Ptr<configfs_dirent> parent_sd, Ptr<runtime.dentry> dentry2, Ptr<?> element, @Unsigned @OriginalName(value="umode_t") short mode, int type2, Ptr<configfs_fragment> frag2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<configfs_dirent> configfs_new_dirent(Ptr<configfs_dirent> parent_sd, Ptr<?> element, int type2, Ptr<configfs_fragment> frag2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="configfs_register_default_group($arg1, (const u8*)$arg2, (const struct config_item_type*)$arg3)")
    public static Ptr<ConfigDefinitions.config_group> configfs_register_default_group(Ptr<ConfigDefinitions.config_group> parent_group, String name, Ptr<ConfigDefinitions.config_item_type> item_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_register_group(Ptr<ConfigDefinitions.config_group> parent_group, Ptr<ConfigDefinitions.config_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_register_subsystem(Ptr<configfs_subsystem> subsys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_remove_default_groups(Ptr<ConfigDefinitions.config_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_remove_dir(Ptr<ConfigDefinitions.config_item> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_remove_dirent(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_undepend_item(Ptr<ConfigDefinitions.config_item> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_unregister_default_group(Ptr<ConfigDefinitions.config_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_unregister_group(Ptr<ConfigDefinitions.config_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_unregister_subsystem(Ptr<configfs_subsystem> subsys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __configfs_open_file(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long configfs_bin_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long configfs_bin_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="configfs_create_bin_file($arg1, (const struct configfs_bin_attribute*)$arg2)")
    public static int configfs_create_bin_file(Ptr<ConfigDefinitions.config_item> item, Ptr<configfs_bin_attribute> bin_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="configfs_create_file($arg1, (const struct configfs_attribute*)$arg2)")
    public static int configfs_create_file(Ptr<ConfigDefinitions.config_item> item, Ptr<configfs_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_open_bin_file(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_open_file(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long configfs_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_release_bin_file(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long configfs_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> configfs_create(Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_drop_dentry(Ptr<configfs_dirent> sd, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)configfs_get_name($arg1))")
    public static String configfs_get_name(Ptr<configfs_dirent> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="configfs_hash_and_remove($arg1, (const u8*)$arg2)")
    public static void configfs_hash_and_remove(Ptr<runtime.dentry> dir, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_is_root(Ptr<ConfigDefinitions.config_item> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> configfs_new_inode(@Unsigned @OriginalName(value="umode_t") short mode, Ptr<configfs_dirent> sd, Ptr<SuperDefinitions.super_block> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> configfs_pin_fs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void configfs_release_fs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int configfs_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct configfs_buffer")
    @NotUsableInJava
    public static class configfs_buffer
    extends Struct {
        public @Unsigned long count;
        public @OriginalName(value="loff_t") long pos;
        public String page;
        public Ptr<configfs_item_operations> ops;
        public runtime.mutex mutex;
        public int needs_read_fill;
        public boolean read_in_progress;
        public boolean write_in_progress;
        public String bin_buffer;
        public int bin_buffer_size;
        public int cb_max_size;
        public Ptr<ConfigDefinitions.config_item> item;
        public Ptr<runtime.module> owner;
        @InlineUnion(value=91730)
        public @InlineUnion(value=91730) Ptr<configfs_attribute> attr;
        @InlineUnion(value=91730)
        public @InlineUnion(value=91730) Ptr<configfs_bin_attribute> bin_attr;
    }

    @Type(noCCodeGeneration=true, cType="struct configfs_dirent")
    @NotUsableInJava
    public static class configfs_dirent
    extends Struct {
        public AtomicDefinitions.atomic_t s_count;
        public int s_dependent_count;
        public ListDefinitions.list_head s_sibling;
        public ListDefinitions.list_head s_children;
        public int s_links;
        public Ptr<?> s_element;
        public int s_type;
        public @Unsigned @OriginalName(value="umode_t") short s_mode;
        public Ptr<runtime.dentry> s_dentry;
        public Ptr<runtime.iattr> s_iattr;
        public Ptr<configfs_fragment> s_frag;
    }

    @Type(noCCodeGeneration=true, cType="struct configfs_fragment")
    @NotUsableInJava
    public static class configfs_fragment
    extends Struct {
        public AtomicDefinitions.atomic_t frag_count;
        public misc.rw_semaphore frag_sem;
        public boolean frag_dead;
    }

    @Type(noCCodeGeneration=true, cType="struct configfs_subsystem")
    @NotUsableInJava
    public static class configfs_subsystem
    extends Struct {
        public ConfigDefinitions.config_group su_group;
        public runtime.mutex su_mutex;
    }

    @Type(noCCodeGeneration=true, cType="struct configfs_bin_attribute")
    @NotUsableInJava
    public static class configfs_bin_attribute
    extends Struct {
        public configfs_attribute cb_attr;
        public Ptr<?> cb_private;
        public @Unsigned long cb_max_size;
        public Ptr<?> read;
        public Ptr<?> write;
    }

    @Type(noCCodeGeneration=true, cType="struct configfs_attribute")
    @NotUsableInJava
    public static class configfs_attribute
    extends Struct {
        public String ca_name;
        public Ptr<runtime.module> ca_owner;
        public @Unsigned @OriginalName(value="umode_t") short ca_mode;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct configfs_group_operations")
    @NotUsableInJava
    public static class configfs_group_operations
    extends Struct {
        public Ptr<?> make_item;
        public Ptr<?> make_group;
        public Ptr<?> disconnect_notify;
        public Ptr<?> drop_item;
        public Ptr<?> is_visible;
        public Ptr<?> is_bin_visible;
    }

    @Type(noCCodeGeneration=true, cType="struct configfs_item_operations")
    @NotUsableInJava
    public static class configfs_item_operations
    extends Struct {
        public Ptr<?> release;
        public Ptr<?> allow_link;
        public Ptr<?> drop_link;
    }
}

