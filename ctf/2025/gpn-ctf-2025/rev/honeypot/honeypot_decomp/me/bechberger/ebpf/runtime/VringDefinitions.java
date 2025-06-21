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
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VringDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__vring_new_virtqueue($arg1, $arg2, $arg3, $arg4, $arg5, (_Bool (*)(struct virtqueue*))$arg6, (void (*)(struct virtqueue*))$arg7, (const u8*)$arg8, $arg9)")
    public static Ptr<runtime.virtqueue> __vring_new_virtqueue(@Unsigned int index2, Ptr<vring_virtqueue_split> vring_split, Ptr<VirtioDefinitions.virtio_device> vdev, boolean weak_barriers, boolean context2, Ptr<?> notify, Ptr<?> callback2, String name, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vring_desc_extra> vring_alloc_desc_extra(@Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vring_alloc_queue(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, @Unsigned @OriginalName(value="gfp_t") int flag, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vring_alloc_queue_packed(Ptr<vring_virtqueue_packed> vring_packed, Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int num, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vring_alloc_queue_split(Ptr<vring_virtqueue_split> vring_split, Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int num, @Unsigned int vring_align, boolean may_reduce_num, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vring_alloc_state_extra_packed(Ptr<vring_virtqueue_packed> vring_packed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vring_alloc_state_extra_split(Ptr<vring_virtqueue_split> vring_split) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_create_virtqueue($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (_Bool (*)(struct virtqueue*))$arg8, (void (*)(struct virtqueue*))$arg9, (const u8*)$arg10)")
    public static Ptr<runtime.virtqueue> vring_create_virtqueue(@Unsigned int index2, @Unsigned int num, @Unsigned int vring_align, Ptr<VirtioDefinitions.virtio_device> vdev, boolean weak_barriers, boolean may_reduce_num, boolean context2, Ptr<?> notify, Ptr<?> callback2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_create_virtqueue_dma($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (_Bool (*)(struct virtqueue*))$arg8, (void (*)(struct virtqueue*))$arg9, (const u8*)$arg10, $arg11)")
    public static Ptr<runtime.virtqueue> vring_create_virtqueue_dma(@Unsigned int index2, @Unsigned int num, @Unsigned int vring_align, Ptr<VirtioDefinitions.virtio_device> vdev, boolean weak_barriers, boolean may_reduce_num, boolean context2, Ptr<?> notify, Ptr<?> callback2, String name, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_create_virtqueue_split($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (_Bool (*)(struct virtqueue*))$arg8, (void (*)(struct virtqueue*))$arg9, (const u8*)$arg10, $arg11)")
    public static Ptr<runtime.virtqueue> vring_create_virtqueue_split(@Unsigned int index2, @Unsigned int num, @Unsigned int vring_align, Ptr<VirtioDefinitions.virtio_device> vdev, boolean weak_barriers, boolean may_reduce_num, boolean context2, Ptr<?> notify, Ptr<?> callback2, String name, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vring_del_virtqueue(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vring_free(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vring_free_packed(Ptr<vring_virtqueue_packed> vring_packed, Ptr<VirtioDefinitions.virtio_device> vdev, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vring_free_queue(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned long size, Ptr<?> queue, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn vring_interrupt(int irq, Ptr<?> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_map_one_sg((const struct vring_virtqueue*)$arg1, $arg2, $arg3, $arg4)")
    public static int vring_map_one_sg(Ptr<vring_virtqueue> vq, Ptr<runtime.scatterlist> sg2, DmaDefinitions.dma_data_direction direction, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_map_single((const struct vring_virtqueue*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="dma_addr_t") long vring_map_single(Ptr<vring_virtqueue> vq, Ptr<?> cpu_addr, @Unsigned long size, DmaDefinitions.dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_new_virtqueue($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (_Bool (*)(struct virtqueue*))$arg8, (void (*)(struct virtqueue*))$arg9, (const u8*)$arg10)")
    public static Ptr<runtime.virtqueue> vring_new_virtqueue(@Unsigned int index2, @Unsigned int num, @Unsigned int vring_align, Ptr<VirtioDefinitions.virtio_device> vdev, boolean weak_barriers, boolean context2, Ptr<?> pages, Ptr<?> notify, Ptr<?> callback2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int vring_notification_data(Ptr<runtime.virtqueue> _vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vring_transport_features(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_unmap_desc_packed((const struct vring_virtqueue*)$arg1, (const struct vring_packed_desc*)$arg2)")
    public static void vring_unmap_desc_packed(Ptr<vring_virtqueue> vq, Ptr<vring_packed_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_unmap_extra_packed((const struct vring_virtqueue*)$arg1, (const struct vring_desc_extra*)$arg2)")
    public static void vring_unmap_extra_packed(Ptr<vring_virtqueue> vq, Ptr<vring_desc_extra> extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_unmap_one_split((const struct vring_virtqueue*)$arg1, $arg2)")
    public static @Unsigned int vring_unmap_one_split(Ptr<vring_virtqueue> vq, @Unsigned int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vring_unmap_one_split_indirect((const struct vring_virtqueue*)$arg1, (const struct vring_desc*)$arg2)")
    public static void vring_unmap_one_split_indirect(Ptr<vring_virtqueue> vq, Ptr<vring_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vring_virtqueue")
    @NotUsableInJava
    public static class vring_virtqueue
    extends Struct {
        public runtime.virtqueue vq;
        public boolean packed_ring;
        public boolean use_dma_api;
        public boolean weak_barriers;
        public boolean broken;
        public boolean indirect;
        public boolean event;
        public boolean premapped;
        public boolean do_unmap;
        public @Unsigned int free_head;
        public @Unsigned int num_added;
        public @Unsigned short last_used_idx;
        public boolean event_triggered;
        @InlineUnion(value=17529)
        public @InlineUnion(value=17529) vring_virtqueue_split split;
        @InlineUnion(value=17529)
        public @InlineUnion(value=17529) vring_virtqueue_packed packed;
        public Ptr<?> notify;
        public boolean we_own_ring;
        public Ptr<runtime.device> dma_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_virtqueue_packed")
    @NotUsableInJava
    public static class vring_virtqueue_packed
    extends Struct {
        public vring_of_vring_virtqueue_packed vring;
        public boolean avail_wrap_counter;
        public @Unsigned short avail_used_flags;
        public @Unsigned short next_avail_idx;
        public @Unsigned short event_flags_shadow;
        public Ptr<vring_desc_state_packed> desc_state;
        public Ptr<vring_desc_extra> desc_extra;
        public @Unsigned @OriginalName(value="dma_addr_t") long ring_dma_addr;
        public @Unsigned @OriginalName(value="dma_addr_t") long driver_event_dma_addr;
        public @Unsigned @OriginalName(value="dma_addr_t") long device_event_dma_addr;
        public @Unsigned long ring_size_in_bytes;
        public @Unsigned long event_size_in_bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int num; struct vring_packed_desc *desc; struct vring_packed_desc_event *driver; struct vring_packed_desc_event *device; }")
    @NotUsableInJava
    public static class vring_of_vring_virtqueue_packed
    extends Struct {
        public @Unsigned int num;
        public Ptr<vring_packed_desc> desc;
        public Ptr<vring_packed_desc_event> driver;
        public Ptr<vring_packed_desc_event> device;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_virtqueue_split")
    @NotUsableInJava
    public static class vring_virtqueue_split
    extends Struct {
        public runtime.vring vring;
        public @Unsigned short avail_flags_shadow;
        public @Unsigned short avail_idx_shadow;
        public Ptr<vring_desc_state_split> desc_state;
        public Ptr<vring_desc_extra> desc_extra;
        public @Unsigned @OriginalName(value="dma_addr_t") long queue_dma_addr;
        public @Unsigned long queue_size_in_bytes;
        public @Unsigned int vring_align;
        public boolean may_reduce_num;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_desc_extra")
    @NotUsableInJava
    public static class vring_desc_extra
    extends Struct {
        public @Unsigned @OriginalName(value="dma_addr_t") long addr;
        public @Unsigned int len;
        public @Unsigned short flags;
        public @Unsigned short next;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_desc_state_packed")
    @NotUsableInJava
    public static class vring_desc_state_packed
    extends Struct {
        public Ptr<?> data;
        public Ptr<vring_packed_desc> indir_desc;
        public @Unsigned short num;
        public @Unsigned short last;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_desc_state_split")
    @NotUsableInJava
    public static class vring_desc_state_split
    extends Struct {
        public Ptr<?> data;
        public Ptr<vring_desc> indir_desc;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_packed_desc")
    @NotUsableInJava
    public static class vring_packed_desc
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long addr;
        public @Unsigned @OriginalName(value="__le32") int len;
        public @Unsigned @OriginalName(value="__le16") short id;
        public @Unsigned @OriginalName(value="__le16") short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_packed_desc_event")
    @NotUsableInJava
    public static class vring_packed_desc_event
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short off_wrap;
        public @Unsigned @OriginalName(value="__le16") short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_used")
    @NotUsableInJava
    public static class vring_used
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio16") short flags;
        public @Unsigned @OriginalName(value="__virtio16") short idx;
        public @OriginalName(value="vring_used_elem_t") vring_used_elem @Size(value=0) [] ring;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_used_elem")
    @NotUsableInJava
    public static class vring_used_elem
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio32") int id;
        public @Unsigned @OriginalName(value="__virtio32") int len;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_avail")
    @NotUsableInJava
    public static class vring_avail
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio16") short flags;
        public @Unsigned @OriginalName(value="__virtio16") short idx;
        public @Unsigned @OriginalName(value="__virtio16") short @Size(value=0) [] ring;
    }

    @Type(noCCodeGeneration=true, cType="struct vring_desc")
    @NotUsableInJava
    public static class vring_desc
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio64") long addr;
        public @Unsigned @OriginalName(value="__virtio32") int len;
        public @Unsigned @OriginalName(value="__virtio16") short flags;
        public @Unsigned @OriginalName(value="__virtio16") short next;
    }
}

