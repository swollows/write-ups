/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MboxDefinitions;
import me.bechberger.ebpf.runtime.MqueueDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MsgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msg_exit_ns(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msg_init_ns(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msg_rcu_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msg_add_dict_text($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static @OriginalName(value="ssize_t") long msg_add_dict_text(String buf, @Unsigned long size, String key2, String val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msg_add_ext_text($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long msg_add_ext_text(String buf, @Unsigned long size, String text, @Unsigned long text_len, char endc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msg_submit(Ptr<MboxDefinitions.mbox_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __msg_zerocopy_callback(Ptr<misc.ubuf_info_msgzc> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msg_zerocopy_complete(Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.ubuf_info> uarg, boolean success) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msg_zerocopy_put_abort(Ptr<misc.ubuf_info> uarg, boolean have_uref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ubuf_info> msg_zerocopy_realloc(Ptr<runtime.sock> sk, @Unsigned long size, Ptr<misc.ubuf_info> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<msg_msg> msg_get(Ptr<MqueueDefinitions.mqueue_inode_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msg_insert(Ptr<msg_msg> msg, Ptr<MqueueDefinitions.mqueue_inode_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct msg_security_struct")
    @NotUsableInJava
    public static class msg_security_struct
    extends Struct {
        public @Unsigned int sid;
    }

    @Type(noCCodeGeneration=true, cType="struct msg_sender")
    @NotUsableInJava
    public static class msg_sender
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<TaskDefinitions.task_struct> tsk;
        public @Unsigned long msgsz;
    }

    @Type(noCCodeGeneration=true, cType="struct msg_receiver")
    @NotUsableInJava
    public static class msg_receiver
    extends Struct {
        public ListDefinitions.list_head r_list;
        public Ptr<TaskDefinitions.task_struct> r_tsk;
        public int r_mode;
        public long r_msgtype;
        public long r_maxsize;
        public Ptr<msg_msg> r_msg;
    }

    @Type(noCCodeGeneration=true, cType="struct msg_queue")
    @NotUsableInJava
    public static class msg_queue
    extends Struct {
        public misc.kern_ipc_perm q_perm;
        public @OriginalName(value="time64_t") long q_stime;
        public @OriginalName(value="time64_t") long q_rtime;
        public @OriginalName(value="time64_t") long q_ctime;
        public @Unsigned long q_cbytes;
        public @Unsigned long q_qnum;
        public @Unsigned long q_qbytes;
        public Ptr<runtime.pid> q_lspid;
        public Ptr<runtime.pid> q_lrpid;
        public ListDefinitions.list_head q_messages;
        public ListDefinitions.list_head q_receivers;
        public ListDefinitions.list_head q_senders;
    }

    @Type(noCCodeGeneration=true, cType="struct msg_msgseg")
    @NotUsableInJava
    public static class msg_msgseg
    extends Struct {
        public Ptr<msg_msgseg> next;
    }

    @Type(noCCodeGeneration=true, cType="struct msg_msg")
    @NotUsableInJava
    public static class msg_msg
    extends Struct {
        public ListDefinitions.list_head m_list;
        public long m_type;
        public @Unsigned long m_ts;
        public Ptr<msg_msgseg> next;
        public Ptr<?> security;
    }
}

