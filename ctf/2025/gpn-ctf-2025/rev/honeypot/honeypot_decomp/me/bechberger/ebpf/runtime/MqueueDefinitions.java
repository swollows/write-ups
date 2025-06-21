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
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MqDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MqueueDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> mqueue_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mqueue_create(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mqueue_create_attr(Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mqueue_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mqueue_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mqueue_flush_file(Ptr<runtime.file> filp, @OriginalName(value="fl_owner_t") Ptr<?> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mqueue_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mqueue_fs_context_free(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> mqueue_get_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<IpcDefinitions.ipc_namespace> ipc_ns, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<MqDefinitions.mq_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mqueue_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mqueue_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int mqueue_poll_file(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> poll_tab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mqueue_read_file(Ptr<runtime.file> filp, String u_data, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mqueue_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mqueue_inode_info")
    @NotUsableInJava
    public static class mqueue_inode_info
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public runtime.inode vfs_inode;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait_q;
        public RbDefinitions.rb_root msg_tree;
        public Ptr<RbDefinitions.rb_node> msg_tree_rightmost;
        public Ptr<PosixDefinitions.posix_msg_tree_node> node_cache;
        public MqDefinitions.mq_attr attr;
        public runtime.sigevent notify;
        public Ptr<runtime.pid> notify_owner;
        public @Unsigned int notify_self_exec_id;
        public Ptr<UserDefinitions.user_namespace> notify_user_ns;
        public Ptr<runtime.ucounts> ucounts;
        public Ptr<runtime.sock> notify_sock;
        public Ptr<SkDefinitions.sk_buff> notify_cookie;
        public misc.ext_wait_queue @Size(value=2) [] e_wait_q;
        public @Unsigned long qsize;
    }

    @Type(noCCodeGeneration=true, cType="struct mqueue_fs_context")
    @NotUsableInJava
    public static class mqueue_fs_context
    extends Struct {
        public Ptr<IpcDefinitions.ipc_namespace> ipc_ns;
        public boolean newns;
    }
}

