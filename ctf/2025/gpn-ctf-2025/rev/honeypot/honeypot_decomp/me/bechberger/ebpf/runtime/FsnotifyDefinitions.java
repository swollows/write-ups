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
import me.bechberger.ebpf.runtime.InotifyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FsnotifyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="fsnotify_alloc_group((const struct fsnotify_ops*)$arg1, $arg2)")
    public static Ptr<fsnotify_group> fsnotify_alloc_group(Ptr<fsnotify_ops> ops, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_destroy_group(Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsnotify_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_get_group(Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_group_stop_queueing(Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_put_group(Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __fsnotify_recalc_mask(Ptr<fsnotify_mark_connector> conn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsnotify_add_mark(Ptr<fsnotify_mark> mark, Ptr<?> obj, @Unsigned int obj_type, int add_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsnotify_add_mark_list(Ptr<fsnotify_mark> mark, Ptr<?> obj, @Unsigned int obj_type, int add_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsnotify_add_mark_locked(Ptr<fsnotify_mark> mark, Ptr<?> obj, @Unsigned int obj_type, int add_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_clear_marks_by_group(Ptr<fsnotify_group> group, @Unsigned int obj_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsnotify_compare_groups(Ptr<fsnotify_group> a, Ptr<fsnotify_group> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fsnotify_conn_mask(Ptr<fsnotify_mark_connector> conn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_connector_destroy_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_destroy_mark(Ptr<fsnotify_mark> mark, Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_destroy_marks(Ptr<@OriginalName(value="fsnotify_connp_t") Ptr<fsnotify_mark_connector>> connp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fsnotify_detach_connector_from_object(Ptr<fsnotify_mark_connector> conn, Ptr<@Unsigned Integer> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_detach_mark(Ptr<fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fsnotify_mark> fsnotify_find_mark(Ptr<?> obj, @Unsigned int obj_type, Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_finish_user_wait(Ptr<fsnotify_iter_info> iter_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_free_mark(Ptr<fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_get_mark(Ptr<fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fsnotify_mark_connector> fsnotify_grab_connector(Ptr<@OriginalName(value="fsnotify_connp_t") Ptr<fsnotify_mark_connector>> connp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_init_mark(Ptr<fsnotify_mark> mark, Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_mark_destroy_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsnotify_move($arg1, $arg2, (const struct qstr*)$arg3, $arg4, $arg5, $arg6)")
    public static void fsnotify_move(Ptr<runtime.inode> old_dir, Ptr<runtime.inode> new_dir, Ptr<runtime.qstr> old_name, int isdir, Ptr<runtime.inode> target, Ptr<runtime.dentry> moved) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fsnotify_prepare_user_wait(Ptr<fsnotify_iter_info> iter_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_put_mark(Ptr<fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_put_mark_wake(Ptr<fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_recalc_mask(Ptr<fsnotify_mark_connector> conn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_update_sb_watchers(Ptr<SuperDefinitions.super_block> sb, Ptr<fsnotify_mark_connector> conn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_wait_marks_destroyed() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fsnotify_inode_delete(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__fsnotify_parent($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int __fsnotify_parent(Ptr<runtime.dentry> dentry2, @Unsigned int mask, Ptr<?> data, int data_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fsnotify_vfsmount_delete(Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsnotify_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsnotify_open_perm(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_sb_delete(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_sb_free(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_set_children_dentry_flags(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_destroy_event(Ptr<fsnotify_group> group, Ptr<fsnotify_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_flush_notify(Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fsnotify_get_cookie() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsnotify_insert_event($arg1, $arg2, (int (*)(struct fsnotify_group*, struct fsnotify_event*))$arg3, (void (*)(struct fsnotify_group*, struct fsnotify_event*))$arg4)")
    public static int fsnotify_insert_event(Ptr<fsnotify_group> group, Ptr<fsnotify_event> event2, Ptr<?> merge, Ptr<?> insert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fsnotify_event> fsnotify_peek_first_event(Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fsnotify_event> fsnotify_remove_first_event(Ptr<fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsnotify_remove_queued_event(Ptr<fsnotify_group> group, Ptr<fsnotify_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum fsnotify_data_type")
    public static enum fsnotify_data_type implements Enum<fsnotify_data_type>,
    TypedEnum<fsnotify_data_type, Integer>
    {
        FSNOTIFY_EVENT_NONE,
        FSNOTIFY_EVENT_PATH,
        FSNOTIFY_EVENT_INODE,
        FSNOTIFY_EVENT_DENTRY,
        FSNOTIFY_EVENT_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="enum fsnotify_obj_type")
    public static enum fsnotify_obj_type implements Enum<fsnotify_obj_type>,
    TypedEnum<fsnotify_obj_type, Integer>
    {
        FSNOTIFY_OBJ_TYPE_ANY,
        FSNOTIFY_OBJ_TYPE_INODE,
        FSNOTIFY_OBJ_TYPE_VFSMOUNT,
        FSNOTIFY_OBJ_TYPE_SB,
        FSNOTIFY_OBJ_TYPE_COUNT,
        FSNOTIFY_OBJ_TYPE_DETACHED;

    }

    @Type(noCCodeGeneration=true, cType="enum fsnotify_iter_type")
    public static enum fsnotify_iter_type implements Enum<fsnotify_iter_type>,
    TypedEnum<fsnotify_iter_type, Integer>
    {
        FSNOTIFY_ITER_TYPE_INODE,
        FSNOTIFY_ITER_TYPE_VFSMOUNT,
        FSNOTIFY_ITER_TYPE_SB,
        FSNOTIFY_ITER_TYPE_PARENT,
        FSNOTIFY_ITER_TYPE_INODE2,
        FSNOTIFY_ITER_TYPE_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="enum fsnotify_group_prio")
    public static enum fsnotify_group_prio implements Enum<fsnotify_group_prio>,
    TypedEnum<fsnotify_group_prio, Integer>
    {
        FSNOTIFY_PRIO_NORMAL,
        FSNOTIFY_PRIO_CONTENT,
        FSNOTIFY_PRIO_PRE_CONTENT,
        __FSNOTIFY_PRIO_NUM;

    }

    @Type(noCCodeGeneration=true, cType="struct fsnotify_event")
    @NotUsableInJava
    public static class fsnotify_event
    extends Struct {
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct fsnotify_mark")
    @NotUsableInJava
    public static class fsnotify_mark
    extends Struct {
        public @Unsigned int mask;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public Ptr<fsnotify_group> group;
        public ListDefinitions.list_head g_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.hlist_node obj_list;
        public Ptr<fsnotify_mark_connector> connector;
        public @Unsigned int ignore_mask;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fsnotify_iter_info")
    @NotUsableInJava
    public static class fsnotify_iter_info
    extends Struct {
        public Ptr<fsnotify_mark> @Size(value=5) [] marks;
        public Ptr<fsnotify_group> current_group;
        public @Unsigned int report_mask;
        public int srcu_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct fsnotify_group")
    @NotUsableInJava
    public static class fsnotify_group
    extends Struct {
        public Ptr<fsnotify_ops> ops;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public  @OriginalName(value="spinlock_t") runtime.spinlock notification_lock;
        public ListDefinitions.list_head notification_list;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head notification_waitq;
        public @Unsigned int q_len;
        public @Unsigned int max_events;
        public fsnotify_group_prio priority;
        public boolean shutdown;
        public int flags;
        public @Unsigned int owner_flags;
        public runtime.mutex mark_mutex;
        public AtomicDefinitions.atomic_t user_waits;
        public ListDefinitions.list_head marks_list;
        public Ptr<misc.fasync_struct> fsn_fa;
        public Ptr<fsnotify_event> overflow_event;
        public Ptr<MemDefinitions.mem_cgroup> memcg;
        @InlineUnion(value=8195)
        public @InlineUnion(value=8195) Ptr<?> _private;
        @InlineUnion(value=8195)
        public @InlineUnion(value=8195) InotifyDefinitions.inotify_group_private_data inotify_data;
        @InlineUnion(value=8195)
        public  @InlineUnion(value=8195) FanotifyDefinitions.fanotify_group_private_data fanotify_data;
    }

    @Type(noCCodeGeneration=true, cType="struct fsnotify_ops")
    @NotUsableInJava
    public static class fsnotify_ops
    extends Struct {
        public Ptr<?> handle_event;
        public Ptr<?> handle_inode_event;
        public Ptr<?> free_group_priv;
        public Ptr<?> freeing_mark;
        public Ptr<?> free_event;
        public Ptr<?> free_mark;
    }

    @Type(noCCodeGeneration=true, cType="struct fsnotify_sb_info")
    @NotUsableInJava
    public static class fsnotify_sb_info
    extends Struct {
        public Ptr<fsnotify_mark_connector> sb_marks;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=3) [] watched_objects;
    }

    @Type(noCCodeGeneration=true, cType="struct fsnotify_mark_connector")
    @NotUsableInJava
    public static class fsnotify_mark_connector
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public char type;
        public char prio;
        public @Unsigned short flags;
        @InlineUnion(value=8200)
        public @InlineUnion(value=8200) Ptr<?> obj;
        @InlineUnion(value=8200)
        public @InlineUnion(value=8200) Ptr<fsnotify_mark_connector> destroy_next;
        public misc.hlist_head list;
    }
}

