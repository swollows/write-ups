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
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.GnetDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="mq_permissions($arg1, (const struct ctl_table*)$arg2)")
    public static int mq_permissions(Ptr<misc.ctl_table_header> head, Ptr<misc.ctl_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mq_set_ownership(Ptr<misc.ctl_table_header> head, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mq_attach(Ptr<runtime.Qdisc> sch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mq_destroy(Ptr<runtime.Qdisc> sch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mq_dump(Ptr<runtime.Qdisc> sch, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mq_dump_class(Ptr<runtime.Qdisc> sch, @Unsigned long cl, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcmsg> tcm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mq_dump_class_stats(Ptr<runtime.Qdisc> sch, @Unsigned long cl, Ptr<GnetDefinitions.gnet_dump> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mq_find(Ptr<runtime.Qdisc> sch, @Unsigned int classid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mq_graft(Ptr<runtime.Qdisc> sch, @Unsigned long cl, Ptr<runtime.Qdisc> _new, Ptr<Ptr<runtime.Qdisc>> old, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mq_init(Ptr<runtime.Qdisc> sch, Ptr<runtime.nlattr> opt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Qdisc> mq_leaf(Ptr<runtime.Qdisc> sch, @Unsigned long cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mq_offload(Ptr<runtime.Qdisc> sch, TcDefinitions.tc_mq_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetdevDefinitions.netdev_queue> mq_select_queue(Ptr<runtime.Qdisc> sch, Ptr<runtime.tcmsg> tcm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mq_walk(Ptr<runtime.Qdisc> sch, Ptr<QdiscDefinitions.qdisc_walker> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mq_change_real_num_tx(Ptr<runtime.Qdisc> sch, @Unsigned int new_real_tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mq_clear_sbinfo(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static RqDefinitions.rq_end_io_ret mq_flush_data_end_io(Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mq_init_ns(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mq_sched")
    @NotUsableInJava
    public static class mq_sched
    extends Struct {
        public Ptr<Ptr<runtime.Qdisc>> qdiscs;
    }

    @Type(noCCodeGeneration=true, cType="struct mq_inflight")
    @NotUsableInJava
    public static class mq_inflight
    extends Struct {
        public Ptr<BlockDefinitions.block_device> part;
        public @Unsigned int @Size(value=2) [] inflight;
    }

    @Type(noCCodeGeneration=true, cType="enum mq_rq_state")
    public static enum mq_rq_state implements Enum<mq_rq_state>,
    TypedEnum<mq_rq_state, Integer>
    {
        MQ_RQ_IDLE,
        MQ_RQ_IN_FLIGHT,
        MQ_RQ_COMPLETE;

    }

    @Type(noCCodeGeneration=true, cType="struct { int oflag; short unsigned int mode; struct mq_attr attr; }")
    @NotUsableInJava
    public static class mq_open_of_anon_member_of_audit_context
    extends Struct {
        public int oflag;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public mq_attr attr;
    }

    @Type(noCCodeGeneration=true, cType="struct { int mqdes; long unsigned int msg_len; unsigned int msg_prio; struct timespec64 abs_timeout; }")
    @NotUsableInJava
    public static class mq_sendrecv_of_anon_member_of_audit_context
    extends Struct {
        public @OriginalName(value="mqd_t") int mqdes;
        public @Unsigned long msg_len;
        public @Unsigned int msg_prio;
        public runtime.timespec64 abs_timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct { int mqdes; int sigev_signo; }")
    @NotUsableInJava
    public static class mq_notify_of_anon_member_of_audit_context
    extends Struct {
        public @OriginalName(value="mqd_t") int mqdes;
        public int sigev_signo;
    }

    @Type(noCCodeGeneration=true, cType="struct { int mqdes; struct mq_attr mqstat; }")
    @NotUsableInJava
    public static class mq_getsetattr_of_anon_member_of_audit_context
    extends Struct {
        public @OriginalName(value="mqd_t") int mqdes;
        public mq_attr mqstat;
    }

    @Type(noCCodeGeneration=true, cType="struct mq_attr")
    @NotUsableInJava
    public static class mq_attr
    extends Struct {
        public @OriginalName(value="__kernel_long_t") long mq_flags;
        public @OriginalName(value="__kernel_long_t") long mq_maxmsg;
        public @OriginalName(value="__kernel_long_t") long mq_msgsize;
        public @OriginalName(value="__kernel_long_t") long mq_curmsgs;
        public @OriginalName(value="__kernel_long_t") long @Size(value=4) [] __reserved;
    }
}

