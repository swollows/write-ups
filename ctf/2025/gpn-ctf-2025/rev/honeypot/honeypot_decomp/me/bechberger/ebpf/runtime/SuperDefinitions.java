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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.DentryDefinitions;
import me.bechberger.ebpf.runtime.DquotDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.FsnotifyDefinitions;
import me.bechberger.ebpf.runtime.FsverityDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.QuotaDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SuperDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="super_set_uuid($arg1, (const u8*)$arg2, $arg3)")
    public static void super_set_uuid(Ptr<super_block> sb, Ptr<Character> uuid, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void super_written(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long super_cache_count(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long super_cache_scan(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean super_lock(Ptr<super_block> sb, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int super_s_dev_set(Ptr<super_block> s2, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int super_s_dev_test(Ptr<super_block> s2, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int super_setup_bdi(Ptr<super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int super_setup_bdi_name(Ptr<super_block> sb, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean super_trylock_shared(Ptr<super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct super_type")
    @NotUsableInJava
    public static class super_type
    extends Struct {
        public String name;
        public Ptr<runtime.module> owner;
        public Ptr<?> load_super;
        public Ptr<?> validate_super;
        public Ptr<?> sync_super;
        public Ptr<?> rdev_size_change;
        public Ptr<?> allow_new_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct super_operations")
    @NotUsableInJava
    public static class super_operations
    extends Struct {
        public Ptr<?> alloc_inode;
        public Ptr<?> destroy_inode;
        public Ptr<?> free_inode;
        public Ptr<?> dirty_inode;
        public Ptr<?> write_inode;
        public Ptr<?> drop_inode;
        public Ptr<?> evict_inode;
        public Ptr<?> put_super;
        public Ptr<?> sync_fs;
        public Ptr<?> freeze_super;
        public Ptr<?> freeze_fs;
        public Ptr<?> thaw_super;
        public Ptr<?> unfreeze_fs;
        public Ptr<?> statfs;
        public Ptr<?> remount_fs;
        public Ptr<?> umount_begin;
        public Ptr<?> show_options;
        public Ptr<?> show_devname;
        public Ptr<?> show_path;
        public Ptr<?> show_stats;
        public Ptr<?> quota_read;
        public Ptr<?> quota_write;
        public Ptr<?> get_dquots;
        public Ptr<?> nr_cached_objects;
        public Ptr<?> free_cached_objects;
        public Ptr<?> shutdown;
    }

    @Type(noCCodeGeneration=true, cType="struct super_block")
    @NotUsableInJava
    public static class super_block
    extends Struct {
        public ListDefinitions.list_head s_list;
        public @Unsigned @OriginalName(value="dev_t") int s_dev;
        public char s_blocksize_bits;
        public @Unsigned long s_blocksize;
        public @OriginalName(value="loff_t") long s_maxbytes;
        public Ptr<FileDefinitions.file_system_type> s_type;
        public Ptr<super_operations> s_op;
        public Ptr<DquotDefinitions.dquot_operations> dq_op;
        public Ptr<misc.quotactl_ops> s_qcop;
        public Ptr<misc.export_operations> s_export_op;
        public @Unsigned long s_flags;
        public @Unsigned long s_iflags;
        public @Unsigned long s_magic;
        public Ptr<runtime.dentry> s_root;
        public misc.rw_semaphore s_umount;
        public int s_count;
        public AtomicDefinitions.atomic_t s_active;
        public Ptr<?> s_security;
        public Ptr<Ptr<XattrDefinitions.xattr_handler>> s_xattr;
        public Ptr<FscryptDefinitions.fscrypt_operations> s_cop;
        public Ptr<FscryptDefinitions.fscrypt_keyring> s_master_keys;
        public Ptr<FsverityDefinitions.fsverity_operations> s_vop;
        public Ptr<misc.unicode_map> s_encoding;
        public @Unsigned short s_encoding_flags;
        public misc.hlist_bl_head s_roots;
        public ListDefinitions.list_head s_mounts;
        public Ptr<BlockDefinitions.block_device> s_bdev;
        public Ptr<runtime.file> s_bdev_file;
        public Ptr<BackingDefinitions.backing_dev_info> s_bdi;
        public @OriginalName(value="mtd_info") Ptr<?> s_mtd;
        public misc.hlist_node s_instances;
        public @Unsigned int s_quota_types;
        public QuotaDefinitions.quota_info s_dquot;
        public misc.sb_writers s_writers;
        public Ptr<?> s_fs_info;
        public @Unsigned int s_time_gran;
        public @OriginalName(value="time64_t") long s_time_min;
        public @OriginalName(value="time64_t") long s_time_max;
        public @Unsigned int s_fsnotify_mask;
        public Ptr<FsnotifyDefinitions.fsnotify_sb_info> s_fsnotify_info;
        public char @Size(value=32) [] s_id;
        public misc.uuid_t s_uuid;
        public char s_uuid_len;
        public char @Size(value=37) [] s_sysfs_name;
        public @Unsigned int s_max_links;
        public runtime.mutex s_vfs_rename_mutex;
        public String s_subtype;
        public Ptr<DentryDefinitions.dentry_operations> s_d_op;
        public Ptr<runtime.shrinker> s_shrink;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t s_remove_count;
        public int s_readonly_remount;
        public @Unsigned @OriginalName(value="errseq_t") int s_wb_err;
        public Ptr<WorkqueueDefinitions.workqueue_struct> s_dio_done_wq;
        public misc.hlist_head s_pins;
        public Ptr<UserDefinitions.user_namespace> s_user_ns;
        public ListDefinitions.list_lru s_dentry_lru;
        public ListDefinitions.list_lru s_inode_lru;
        public misc.callback_head rcu;
        public misc.work_struct destroy_work;
        public runtime.mutex s_sync_lock;
        public int s_stack_depth;
        public  @OriginalName(value="spinlock_t") runtime.spinlock s_inode_list_lock;
        public ListDefinitions.list_head s_inodes;
        public  @OriginalName(value="spinlock_t") runtime.spinlock s_inode_wblist_lock;
        public ListDefinitions.list_head s_inodes_wb;
    }
}

