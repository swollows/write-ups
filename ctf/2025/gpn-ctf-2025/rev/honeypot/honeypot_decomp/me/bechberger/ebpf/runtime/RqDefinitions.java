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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.PinDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_offline_fair(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_online_fair(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_attach_root(Ptr<runtime.rq> rq2, Ptr<misc.root_domain> rd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_cleanup(Ptr<rq_qos> rqos, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_done(Ptr<rq_qos> rqos, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_done_bio(Ptr<rq_qos> rqos, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_issue(Ptr<rq_qos> rqos, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_merge(Ptr<rq_qos> rqos, Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_queue_depth_changed(Ptr<rq_qos> rqos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_requeue(Ptr<rq_qos> rqos, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_throttle(Ptr<rq_qos> rqos, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rq_qos_track(Ptr<rq_qos> rqos, Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rq_depth_calc_max_depth(Ptr<rq_depth> rqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rq_depth_scale_down(Ptr<rq_depth> rqd, boolean hard_throttle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rq_depth_scale_up(Ptr<rq_depth> rqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rq_qos_add($arg1, $arg2, $arg3, (const struct rq_qos_ops*)$arg4)")
    public static int rq_qos_add(Ptr<rq_qos> rqos, Ptr<runtime.gendisk> disk, rq_qos_id id, Ptr<rq_qos_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_qos_del(Ptr<rq_qos> rqos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_qos_exit(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_qos_wait(Ptr<rq_wait> rqw, Ptr<?> private_data, Ptr<?> acquire_inflight_cb, Ptr<?> cleanup_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rq_qos_wake_function(Ptr<WaitDefinitions.wait_queue_entry> curr, @Unsigned int mode, int wake_flags, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rq_wait_inc_below(Ptr<rq_wait> rq_wait2, @Unsigned int limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_offline_dl(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_offline_rt(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_offline_scx(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_online_dl(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_online_rt(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rq_online_scx(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rq_wb")
    @NotUsableInJava
    public static class rq_wb
    extends Struct {
        public @Unsigned int wb_background;
        public @Unsigned int wb_normal;
        public short enable_state;
        public @Unsigned int unknown_cnt;
        public @Unsigned long win_nsec;
        public @Unsigned long cur_win_nsec;
        public Ptr<BlkDefinitions.blk_stat_callback> cb;
        public @Unsigned long sync_issue;
        public Ptr<?> sync_cookie;
        public @Unsigned long last_issue;
        public @Unsigned long last_comp;
        public @Unsigned long min_lat_nsec;
        public rq_qos rqos;
        public rq_wait @Size(value=3) [] rq_wait;
        public rq_depth rq_depth;
    }

    @Type(noCCodeGeneration=true, cType="struct rq_qos_wait_data")
    @NotUsableInJava
    public static class rq_qos_wait_data
    extends Struct {
        public WaitDefinitions.wait_queue_entry wq;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<rq_wait> rqw;
        public Ptr<?> cb;
        public Ptr<?> private_data;
        public boolean got_token;
    }

    @Type(noCCodeGeneration=true, cType="struct rq_depth")
    @NotUsableInJava
    public static class rq_depth
    extends Struct {
        public @Unsigned int max_depth;
        public int scale_step;
        public boolean scaled_max;
        public @Unsigned int queue_depth;
        public @Unsigned int default_depth;
    }

    @Type(noCCodeGeneration=true, cType="struct rq_wait")
    @NotUsableInJava
    public static class rq_wait
    extends Struct {
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public AtomicDefinitions.atomic_t inflight;
    }

    @Type(noCCodeGeneration=true, cType="struct rq_iter_data")
    @NotUsableInJava
    public static class rq_iter_data
    extends Struct {
        public Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx;
        public boolean has_rq;
    }

    @Type(noCCodeGeneration=true, cType="struct rq_qos_ops")
    @NotUsableInJava
    public static class rq_qos_ops
    extends Struct {
        public Ptr<?> throttle;
        public Ptr<?> track;
        public Ptr<?> merge;
        public Ptr<?> issue;
        public Ptr<?> requeue;
        public Ptr<?> done;
        public Ptr<?> done_bio;
        public Ptr<?> cleanup;
        public Ptr<?> queue_depth_changed;
        public Ptr<?> exit;
        public Ptr<BlkDefinitions.blk_mq_debugfs_attr> debugfs_attrs;
    }

    @Type(noCCodeGeneration=true, cType="enum rq_qos_id")
    public static enum rq_qos_id implements Enum<rq_qos_id>,
    TypedEnum<rq_qos_id, Integer>
    {
        RQ_QOS_WBT,
        RQ_QOS_LATENCY,
        RQ_QOS_COST;

    }

    @Type(noCCodeGeneration=true, cType="struct rq_qos")
    @NotUsableInJava
    public static class rq_qos
    extends Struct {
        public Ptr<rq_qos_ops> ops;
        public Ptr<runtime.gendisk> disk;
        public rq_qos_id id;
        public Ptr<rq_qos> next;
        public Ptr<runtime.dentry> debugfs_dir;
    }

    @Type(noCCodeGeneration=true, cType="struct rq_map_data")
    @NotUsableInJava
    public static class rq_map_data
    extends Struct {
        public Ptr<Ptr<runtime.page>> pages;
        public @Unsigned long offset;
        public @Unsigned short page_order;
        public @Unsigned short nr_entries;
        public boolean null_mapped;
        public boolean from_user;
    }

    @Type(noCCodeGeneration=true, cType="enum rq_end_io_ret")
    public static enum rq_end_io_ret implements Enum<rq_end_io_ret>,
    TypedEnum<rq_end_io_ret, Integer>
    {
        RQ_END_IO_NONE,
        RQ_END_IO_FREE;

    }

    @Type(noCCodeGeneration=true, cType="struct rq_flags")
    @NotUsableInJava
    public static class rq_flags
    extends Struct {
        public @Unsigned long flags;
        public PinDefinitions.pin_cookie cookie;
        public @Unsigned int clock_update_flags;
    }
}

