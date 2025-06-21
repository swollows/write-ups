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
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CommonDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SmackDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class InodeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __inode_add_bytes(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __inode_sub_bytes(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_add_bytes(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long inode_get_bytes(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_set_bytes(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_sub_bytes(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inode_security_revalidate(Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, boolean may_sleep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_doinit_use_xattr(Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, @Unsigned int def_sid, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_doinit_with_dentry(Ptr<runtime.inode> inode2, Ptr<runtime.dentry> opt_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_has_buffers(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inode_has_perm((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int inode_has_perm(Ptr<runtime.cred> cred2, Ptr<runtime.inode> inode2, @Unsigned int perms, Ptr<CommonDefinitions.common_audit_data> adp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_info_init_once(Ptr<?> vptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inode_maybe_inc_iversion(Ptr<runtime.inode> inode2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inode_newsize_ok((const struct inode*)$arg1, $arg2)")
    public static int inode_newsize_ok(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long inode_query_iversion(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<inode_security_struct> inode_security(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> inode_storage_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_storage_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<BpfDefinitions.bpf_local_storage>> inode_storage_ptr(Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __inode_attach_wb(Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_add_lru(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<WaitDefinitions.wait_queue_head> inode_bit_waitqueue(Ptr<WaitDefinitions.wait_bit_queue_entry> wqe, Ptr<runtime.inode> inode2, @Unsigned int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_cgwb_move_to_attached(Ptr<runtime.inode> inode2, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inode_dio_finished((const struct inode*)$arg1)")
    public static boolean inode_dio_finished(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_dio_wait(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_dio_wait_interruptible(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inode_do_switch_wbs(Ptr<runtime.inode> inode2, Ptr<BdiDefinitions.bdi_writeback> old_wb, Ptr<BdiDefinitions.bdi_writeback> new_wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_free_by_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_init_always_gfp(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_init_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_init_once(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inode_init_owner($arg1, $arg2, (const struct inode*)$arg3, $arg4)")
    public static void inode_init_owner(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inode_insert5($arg1, $arg2, (int (*)(struct inode*, void*))$arg3, (int (*)(struct inode*, void*))$arg4, $arg5)")
    public static Ptr<runtime.inode> inode_insert5(Ptr<runtime.inode> inode2, @Unsigned long hashval, Ptr<?> test2, Ptr<?> set, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_io_list_del(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inode_io_list_move_locked(Ptr<runtime.inode> inode2, Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static LruDefinitions.lru_status inode_lru_isolate(Ptr<ListDefinitions.list_head> item, Ptr<ListDefinitions.list_lru_one> lru, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lru_lock, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_needs_sync(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_needs_update_time(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_nohighmem(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inode_owner_or_capable($arg1, (const struct inode*)$arg2)")
    public static boolean inode_owner_or_capable(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inode_prepare_wbs_switch(Ptr<runtime.inode> inode2, Ptr<BdiDefinitions.bdi_writeback> new_wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_sb_list_add(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static runtime.timespec64 inode_set_ctime_current(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_set_flags(Ptr<runtime.inode> inode2, @Unsigned int flags, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_sleep_on_writeback(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_switch_wbs(Ptr<runtime.inode> inode2, int new_wb_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_switch_wbs_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_update_time(Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inode_update_timestamps(Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inode_wait_for_writeback(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DaxDefinitions.dax_device> inode_dax(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FuseDefinitions.fuse_dax_mapping> inode_inline_reclaim_one_dmap(Ptr<FuseDefinitions.fuse_conn_dax> fcd, Ptr<runtime.inode> inode2, Ptr<@OriginalName(value="bool") Boolean> retry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BackingDefinitions.backing_dev_info> inode_to_bdi(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct inode_switch_wbs_context")
    @NotUsableInJava
    public static class inode_switch_wbs_context
    extends Struct {
        public RcuDefinitions.rcu_work work;
        public Ptr<BdiDefinitions.bdi_writeback> new_wb;
        public Ptr<runtime.inode> @Size(value=0) [] inodes;
    }

    @Type(noCCodeGeneration=true, cType="struct inode_smack")
    @NotUsableInJava
    public static class inode_smack
    extends Struct {
        public Ptr<SmackDefinitions.smack_known> smk_inode;
        public Ptr<SmackDefinitions.smack_known> smk_task;
        public Ptr<SmackDefinitions.smack_known> smk_mmap;
        public int smk_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct inode_security_struct")
    @NotUsableInJava
    public static class inode_security_struct
    extends Struct {
        public Ptr<runtime.inode> inode;
        public ListDefinitions.list_head list;
        public @Unsigned int task_sid;
        public @Unsigned int sid;
        public @Unsigned short sclass;
        public char initialized;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="enum inode_i_mutex_lock_class")
    public static enum inode_i_mutex_lock_class implements Enum<inode_i_mutex_lock_class>,
    TypedEnum<inode_i_mutex_lock_class, Integer>
    {
        I_MUTEX_NORMAL,
        I_MUTEX_PARENT,
        I_MUTEX_CHILD,
        I_MUTEX_XATTR,
        I_MUTEX_NONDIR2,
        I_MUTEX_PARENT2;

    }

    @Type(noCCodeGeneration=true, cType="struct inode_operations")
    @NotUsableInJava
    public static class inode_operations
    extends Struct {
        public Ptr<?> lookup;
        public Ptr<?> get_link;
        public Ptr<?> permission;
        public Ptr<?> get_inode_acl;
        public Ptr<?> readlink;
        public Ptr<?> create;
        public Ptr<?> link;
        public Ptr<?> unlink;
        public Ptr<?> symlink;
        public Ptr<?> mkdir;
        public Ptr<?> rmdir;
        public Ptr<?> mknod;
        public Ptr<?> rename;
        public Ptr<?> setattr;
        public Ptr<?> getattr;
        public Ptr<?> listxattr;
        public Ptr<?> fiemap;
        public Ptr<?> update_time;
        public Ptr<?> atomic_open;
        public Ptr<?> tmpfile;
        public Ptr<?> get_acl;
        public Ptr<?> set_acl;
        public Ptr<?> fileattr_set;
        public Ptr<?> fileattr_get;
        public Ptr<?> get_offset_ctx;
    }
}

