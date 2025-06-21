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
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.VringDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VirtqueueDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __virtqueue_break(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __virtqueue_unbreak(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_add_inbuf(Ptr<runtime.virtqueue> vq, Ptr<runtime.scatterlist> sg2, @Unsigned int num, Ptr<?> data, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_add_inbuf_ctx(Ptr<runtime.virtqueue> vq, Ptr<runtime.scatterlist> sg2, @Unsigned int num, Ptr<?> data, Ptr<?> ctx, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_add_indirect_packed(Ptr<VringDefinitions.vring_virtqueue> vq, Ptr<Ptr<runtime.scatterlist>> sgs, @Unsigned int total_sg, @Unsigned int out_sgs, @Unsigned int in_sgs, Ptr<?> data, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_add_outbuf(Ptr<runtime.virtqueue> vq, Ptr<runtime.scatterlist> sg2, @Unsigned int num, Ptr<?> data, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_add_packed(Ptr<runtime.virtqueue> _vq, Ptr<Ptr<runtime.scatterlist>> sgs, @Unsigned int total_sg, @Unsigned int out_sgs, @Unsigned int in_sgs, Ptr<?> data, Ptr<?> ctx, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_add_sgs(Ptr<runtime.virtqueue> _vq, Ptr<Ptr<runtime.scatterlist>> sgs, @Unsigned int out_sgs, @Unsigned int in_sgs, Ptr<?> data, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_add_split(Ptr<runtime.virtqueue> _vq, Ptr<Ptr<runtime.scatterlist>> sgs, @Unsigned int total_sg, @Unsigned int out_sgs, @Unsigned int in_sgs, Ptr<?> data, Ptr<?> ctx, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> virtqueue_detach_unused_buf(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtqueue_disable_and_recycle($arg1, (void (*)(struct virtqueue*, void*))$arg2)")
    public static int virtqueue_disable_and_recycle(Ptr<runtime.virtqueue> _vq, Ptr<?> recycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtqueue_disable_cb(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> virtqueue_dma_dev(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long virtqueue_dma_map_single_attrs(Ptr<runtime.virtqueue> _vq, Ptr<?> ptr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_dma_mapping_error(Ptr<runtime.virtqueue> _vq, @Unsigned @OriginalName(value="dma_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtqueue_dma_need_sync(Ptr<runtime.virtqueue> _vq, @Unsigned @OriginalName(value="dma_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtqueue_dma_sync_single_range_for_cpu(Ptr<runtime.virtqueue> _vq, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long offset, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtqueue_dma_sync_single_range_for_device(Ptr<runtime.virtqueue> _vq, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long offset, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtqueue_dma_unmap_single_attrs(Ptr<runtime.virtqueue> _vq, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtqueue_enable_cb(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtqueue_enable_cb_delayed(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int virtqueue_enable_cb_prepare(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtqueue_get_avail_addr((const struct virtqueue*)$arg1)")
    public static @Unsigned @OriginalName(value="dma_addr_t") long virtqueue_get_avail_addr(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> virtqueue_get_buf(Ptr<runtime.virtqueue> _vq, Ptr<@Unsigned Integer> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> virtqueue_get_buf_ctx(Ptr<runtime.virtqueue> _vq, Ptr<@Unsigned Integer> len, Ptr<Ptr<?>> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> virtqueue_get_buf_ctx_packed(Ptr<runtime.virtqueue> _vq, Ptr<@Unsigned Integer> len, Ptr<Ptr<?>> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> virtqueue_get_buf_ctx_split(Ptr<runtime.virtqueue> _vq, Ptr<@Unsigned Integer> len, Ptr<Ptr<?>> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtqueue_get_desc_addr((const struct virtqueue*)$arg1)")
    public static @Unsigned @OriginalName(value="dma_addr_t") long virtqueue_get_desc_addr(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtqueue_get_used_addr((const struct virtqueue*)$arg1)")
    public static @Unsigned @OriginalName(value="dma_addr_t") long virtqueue_get_used_addr(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct vring*)virtqueue_get_vring((const struct virtqueue*)$arg1))")
    public static Ptr<runtime.vring> virtqueue_get_vring(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtqueue_get_vring_size((const struct virtqueue*)$arg1)")
    public static @Unsigned int virtqueue_get_vring_size(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtqueue_is_broken((const struct virtqueue*)$arg1)")
    public static boolean virtqueue_is_broken(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtqueue_kick(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtqueue_kick_prepare(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtqueue_notify(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtqueue_poll(Ptr<runtime.virtqueue> _vq, @Unsigned int last_used_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtqueue_reinit_packed(Ptr<VringDefinitions.vring_virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtqueue_reinit_split(Ptr<VringDefinitions.vring_virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtqueue_reset($arg1, (void (*)(struct virtqueue*, void*))$arg2)")
    public static int virtqueue_reset(Ptr<runtime.virtqueue> _vq, Ptr<?> recycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtqueue_resize($arg1, $arg2, (void (*)(struct virtqueue*, void*))$arg3)")
    public static int virtqueue_resize(Ptr<runtime.virtqueue> _vq, @Unsigned int num, Ptr<?> recycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtqueue_set_dma_premapped(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct virtqueue_info")
    @NotUsableInJava
    public static class virtqueue_info
    extends Struct {
        public String name;
        public Ptr<?> callback;
        public boolean ctx;
    }
}

