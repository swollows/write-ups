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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BsgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bsg_complete(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bsg_exit_rq(Ptr<BlkDefinitions.blk_mq_tag_set> set, Ptr<runtime.request> req2, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bsg_init_rq(Ptr<BlkDefinitions.blk_mq_tag_set> set, Ptr<runtime.request> req2, @Unsigned int hctx_idx, @Unsigned int numa_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bsg_job_done(Ptr<bsg_job> job, int result, @Unsigned int reply_payload_rcv_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bsg_job_get(Ptr<bsg_job> job) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bsg_job_put(Ptr<bsg_job> job) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bsg_map_buffer(Ptr<bsg_buffer> buf, Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bsg_queue_rq($arg1, (const struct blk_mq_queue_data*)$arg2)")
    public static @OriginalName(value="blk_status_t") char bsg_queue_rq(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<BlkDefinitions.blk_mq_queue_data> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bsg_remove_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bsg_setup_queue($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<RequestDefinitions.request_queue> bsg_setup_queue(Ptr<runtime.device> dev, String name, Ptr<QueueDefinitions.queue_limits> lim, Ptr<?> job_fn, Ptr<?> timeout, int dd_job_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bsg_transport_sg_io_fn(Ptr<RequestDefinitions.request_queue> q, Ptr<SgDefinitions.sg_io_v4> hdr, boolean open_for_write, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bsg_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bsg_devnode((const struct device*)$arg1, $arg2)")
    public static String bsg_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bsg_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bsg_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bsg_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bsg_register_queue($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<bsg_device> bsg_register_queue(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.device> parent, String name, Ptr<?> sg_io_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bsg_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bsg_sg_io(Ptr<bsg_device> bd, boolean open_for_write, Ptr<?> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bsg_unregister_queue(Ptr<bsg_device> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct bsg_device")
    @NotUsableInJava
    public static class bsg_device
    extends Struct {
        public Ptr<RequestDefinitions.request_queue> queue;
        public runtime.device device;
        public runtime.cdev cdev;
        public int max_queue;
        public @Unsigned int timeout;
        public @Unsigned int reserved_size;
        public Ptr<?> sg_io_fn;
    }

    @Type(noCCodeGeneration=true, cType="struct bsg_set")
    @NotUsableInJava
    public static class bsg_set
    extends Struct {
        public BlkDefinitions.blk_mq_tag_set tag_set;
        public Ptr<bsg_device> bd;
        public Ptr<?> job_fn;
        public Ptr<?> timeout_fn;
    }

    @Type(noCCodeGeneration=true, cType="struct bsg_buffer")
    @NotUsableInJava
    public static class bsg_buffer
    extends Struct {
        public @Unsigned int payload_len;
        public int sg_cnt;
        public Ptr<runtime.scatterlist> sg_list;
    }

    @Type(noCCodeGeneration=true, cType="struct bsg_job")
    @NotUsableInJava
    public static class bsg_job
    extends Struct {
        public Ptr<runtime.device> dev;
        public runtime.kref kref;
        public @Unsigned int timeout;
        public Ptr<?> request;
        public Ptr<?> reply;
        public @Unsigned int request_len;
        public @Unsigned int reply_len;
        public bsg_buffer request_payload;
        public bsg_buffer reply_payload;
        public int result;
        public @Unsigned int reply_payload_rcv_len;
        public Ptr<runtime.request> bidi_rq;
        public Ptr<runtime.bio> bidi_bio;
        public Ptr<?> dd_data;
    }
}

