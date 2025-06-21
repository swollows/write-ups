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
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VirtblkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_add_req(Ptr<runtime.virtqueue> vq, Ptr<virtblk_req> vbr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_add_req_batch(Ptr<VirtioDefinitions.virtio_blk_vq> vq, Ptr<Ptr<runtime.request>> rqlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short virtblk_attrs_are_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_complete_batch(Ptr<IoDefinitions.io_comp_batch> iob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_config_changed(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_config_changed_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_done(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_free_disk(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_freeze(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_get_cache_mode(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_getgeo(Ptr<BlockDefinitions.block_device> bd, Ptr<misc.hd_geometry> geo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_map_queues(Ptr<BlkDefinitions.blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_parse_zone(Ptr<VirtioDefinitions.virtio_blk> vblk2, Ptr<VirtioDefinitions.virtio_blk_zone_descriptor> entry, @Unsigned int idx, @OriginalName(value="report_zones_cb") Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_poll(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<IoDefinitions.io_comp_batch> iob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_probe(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_read_limits(Ptr<VirtioDefinitions.virtio_blk> vblk2, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_read_zoned_limits(Ptr<VirtioDefinitions.virtio_blk> vblk2, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_remove(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_report_zones(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned int nr_zones, @OriginalName(value="report_zones_cb") Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_request_done(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtblk_restore(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtblk_update_capacity(Ptr<VirtioDefinitions.virtio_blk> vblk2, boolean resize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct virtblk_req")
    @NotUsableInJava
    public static class virtblk_req
    extends Struct {
        public VirtioDefinitions.virtio_blk_outhdr out_hdr;
        public InDefinitions.in_hdr_of_virtblk_req in_hdr;
        public @Unsigned long in_hdr_len;
        public SgDefinitions.sg_table sg_table;
        public runtime.scatterlist @Size(value=0) [] sg;
    }
}

