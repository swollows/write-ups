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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class BlkifDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkif_complete_rq(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkif_completion(Ptr<@Unsigned Long> id, Ptr<misc.blkfront_ring_info> rinfo, Ptr<blkif_response> bret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkif_copy_from_grant(@Unsigned long gfn, @Unsigned int offset, @Unsigned int len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkif_free(Ptr<misc.blkfront_info> info2, int suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkif_free_ring(Ptr<misc.blkfront_ring_info> rinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkif_getgeo(Ptr<BlockDefinitions.block_device> bd, Ptr<misc.hd_geometry> hg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn blkif_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkif_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int command, @Unsigned long argument) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blkif_queue_rq($arg1, (const struct blk_mq_queue_data*)$arg2)")
    public static @OriginalName(value="blk_status_t") char blkif_queue_rq(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<BlkDefinitions.blk_mq_queue_data> qd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkif_queue_rw_req(Ptr<runtime.request> req2, Ptr<misc.blkfront_ring_info> rinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkif_recover(Ptr<misc.blkfront_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkif_restart_queue(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkif_restart_queue_callback(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blkif_set_queue_limits((const struct blkfront_info*)$arg1, $arg2)")
    public static void blkif_set_queue_limits(Ptr<misc.blkfront_info> info2, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkif_setup_rw_req_grant(@Unsigned long gfn, @Unsigned int offset, @Unsigned int len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_req")
    @NotUsableInJava
    public static class blkif_req
    extends Struct {
        public @OriginalName(value="blk_status_t") char error;
    }

    @Type(noCCodeGeneration=true, cType="enum blkif_state")
    public static enum blkif_state implements Enum<blkif_state>,
    TypedEnum<blkif_state, Integer>
    {
        BLKIF_STATE_DISCONNECTED,
        BLKIF_STATE_CONNECTED,
        BLKIF_STATE_SUSPENDED,
        BLKIF_STATE_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="struct blkif_front_ring")
    @NotUsableInJava
    public static class blkif_front_ring
    extends Struct {
        public @Unsigned @OriginalName(value="RING_IDX") int req_prod_pvt;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_cons;
        public @Unsigned int nr_ents;
        public Ptr<blkif_sring> sring;
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_sring")
    @NotUsableInJava
    public static class blkif_sring
    extends Struct {
        public @Unsigned @OriginalName(value="RING_IDX") int req_prod;
        public @Unsigned @OriginalName(value="RING_IDX") int req_event;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_prod;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_event;
        public @OriginalName(value="uint8_t") char @Size(value=48) [] __pad;
        public blkif_sring_entry @Size(value=0) [] ring;
    }

    @Type(noCCodeGeneration=true, cType="union blkif_sring_entry")
    @NotUsableInJava
    public static class blkif_sring_entry
    extends Union {
        public blkif_request req;
        public blkif_response rsp;
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_response")
    @NotUsableInJava
    public static class blkif_response
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long id;
        public @OriginalName(value="uint8_t") char operation;
        public @OriginalName(value="int16_t") short status;
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_request")
    @NotUsableInJava
    public static class blkif_request
    extends Struct {
        public @OriginalName(value="uint8_t") char operation;
        public UDefinitions.u_of_blkif_request u;
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_request_indirect")
    @NotUsableInJava
    public static class blkif_request_indirect
    extends Struct {
        public @OriginalName(value="uint8_t") char indirect_op;
        public @Unsigned @OriginalName(value="uint16_t") short nr_segments;
        public @Unsigned @OriginalName(value="uint32_t") int _pad1;
        public @Unsigned @OriginalName(value="uint64_t") long id;
        public @Unsigned @OriginalName(value="blkif_sector_t") long sector_number;
        public @Unsigned @OriginalName(value="blkif_vdev_t") short handle;
        public @Unsigned @OriginalName(value="uint16_t") short _pad2;
        public @Unsigned @OriginalName(value="grant_ref_t") int @Size(value=8) [] indirect_grefs;
        public @Unsigned @OriginalName(value="uint32_t") int _pad3;
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_request_other")
    @NotUsableInJava
    public static class blkif_request_other
    extends Struct {
        public @OriginalName(value="uint8_t") char _pad1;
        public @Unsigned @OriginalName(value="blkif_vdev_t") short _pad2;
        public @Unsigned @OriginalName(value="uint32_t") int _pad3;
        public @Unsigned @OriginalName(value="uint64_t") long id;
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_request_discard")
    @NotUsableInJava
    public static class blkif_request_discard
    extends Struct {
        public @OriginalName(value="uint8_t") char flag;
        public @Unsigned @OriginalName(value="blkif_vdev_t") short _pad1;
        public @Unsigned @OriginalName(value="uint32_t") int _pad2;
        public @Unsigned @OriginalName(value="uint64_t") long id;
        public @Unsigned @OriginalName(value="blkif_sector_t") long sector_number;
        public @Unsigned @OriginalName(value="uint64_t") long nr_sectors;
        public @OriginalName(value="uint8_t") char _pad3;
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_request_rw")
    @NotUsableInJava
    public static class blkif_request_rw
    extends Struct {
        public @OriginalName(value="uint8_t") char nr_segments;
        public @Unsigned @OriginalName(value="blkif_vdev_t") short handle;
        public @Unsigned @OriginalName(value="uint32_t") int _pad1;
        public @Unsigned @OriginalName(value="uint64_t") long id;
        public @Unsigned @OriginalName(value="blkif_sector_t") long sector_number;
        public blkif_request_segment @Size(value=11) [] seg;
    }

    @Type(noCCodeGeneration=true, cType="struct blkif_request_segment")
    @NotUsableInJava
    public static class blkif_request_segment
    extends Struct {
        public @Unsigned @OriginalName(value="grant_ref_t") int gref;
        public @OriginalName(value="uint8_t") char first_sect;
        public @OriginalName(value="uint8_t") char last_sect;
    }
}

