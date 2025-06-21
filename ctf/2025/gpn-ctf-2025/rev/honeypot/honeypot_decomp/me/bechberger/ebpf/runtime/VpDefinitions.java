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
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VirtqueueDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class VpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)vp_bus_name($arg1))")
    public static String vp_bus_name(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn vp_config_changed(int irq, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_del_vq(Ptr<runtime.virtqueue> vq, Ptr<VirtioDefinitions.virtio_pci_vq_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_del_vqs(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vp_find_one_vq_msix($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<runtime.virtqueue> vp_find_one_vq_msix(Ptr<VirtioDefinitions.virtio_device> vdev, int queue_idx, Ptr<?> callback2, String name, boolean ctx, boolean slow_path, Ptr<Integer> allocated_vectors, vp_vq_vector_policy vector_policy, Ptr<Ptr<VirtioDefinitions.virtio_pci_vq_info>> p_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_find_vqs(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int nvqs, Ptr<Ptr<runtime.virtqueue>> vqs, Ptr<VirtqueueDefinitions.virtqueue_info> vqs_info, Ptr<IrqDefinitions.irq_affinity> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_find_vqs_intx(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int nvqs, Ptr<Ptr<runtime.virtqueue>> vqs, Ptr<VirtqueueDefinitions.virtqueue_info> vqs_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_find_vqs_msix(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int nvqs, Ptr<Ptr<runtime.virtqueue>> vqs, Ptr<VirtqueueDefinitions.virtqueue_info> vqs_info, vp_vq_vector_policy vector_policy, Ptr<IrqDefinitions.irq_affinity> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)vp_get_vq_affinity($arg1, $arg2))")
    public static Ptr<runtime.cpumask> vp_get_vq_affinity(Ptr<VirtioDefinitions.virtio_device> vdev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn vp_interrupt(int irq, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vp_is_avq(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_legacy_config_vector(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev, @Unsigned short vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vp_legacy_get_driver_features(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vp_legacy_get_features(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vp_legacy_get_queue_enable(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_legacy_get_queue_size(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char vp_legacy_get_status(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_legacy_probe(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_legacy_queue_vector(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev, @Unsigned short index2, @Unsigned short vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_legacy_remove(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_legacy_set_features(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev, @Unsigned int features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_legacy_set_queue_address(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev, @Unsigned short index2, @Unsigned int queue_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_legacy_set_status(Ptr<VirtioDefinitions.virtio_pci_legacy_device> ldev, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vp_notify(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_request_msix_vectors(Ptr<VirtioDefinitions.virtio_device> vdev, int nvectors, boolean per_vq_vectors, Ptr<IrqDefinitions.irq_affinity> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vp_set_vq_affinity($arg1, (const struct cpumask*)$arg2)")
    public static int vp_set_vq_affinity(Ptr<runtime.virtqueue> vq, Ptr<runtime.cpumask> cpu_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vp_setup_vq($arg1, $arg2, (void (*)(struct virtqueue*))$arg3, (const u8*)$arg4, $arg5, $arg6, $arg7)")
    public static Ptr<runtime.virtqueue> vp_setup_vq(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int index2, Ptr<?> callback2, String name, boolean ctx, @Unsigned short msix_vec, Ptr<Ptr<VirtioDefinitions.virtio_pci_vq_info>> p_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_synchronize_vectors(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn vp_vring_interrupt(int irq, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_active_vq(Ptr<runtime.virtqueue> vq, @Unsigned short msix_vec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_avq_index(Ptr<VirtioDefinitions.virtio_device> vdev, Ptr<@Unsigned Short> index2, Ptr<@Unsigned Short> num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_config_vector(Ptr<VirtioDefinitions.virtio_pci_device> vp_dev, @Unsigned short vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_finalize_features(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int vp_generation(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_get(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vp_get_features(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vp_get_shm_region(Ptr<VirtioDefinitions.virtio_device> vdev, Ptr<VirtioDefinitions.virtio_shm_region> region2, char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char vp_get_status(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_modern_admin_cmd_exec(Ptr<VirtioDefinitions.virtio_device> vdev, Ptr<VirtioDefinitions.virtio_admin_cmd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_modern_avq_done(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_modern_avq_index(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_modern_avq_num(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_modern_config_vector(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_modern_disable_vq_and_reset(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_modern_enable_vq_after_reset(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_modern_find_vqs(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int nvqs, Ptr<Ptr<runtime.virtqueue>> vqs, Ptr<VirtqueueDefinitions.virtqueue_info> vqs_info, Ptr<IrqDefinitions.irq_affinity> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int vp_modern_generation(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vp_modern_get_driver_features(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vp_modern_get_features(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_modern_get_num_queues(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vp_modern_get_queue_enable(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_modern_get_queue_reset(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_modern_get_queue_size(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char vp_modern_get_status(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vp_modern_map_capability(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, int off, @Unsigned long minlen, @Unsigned int align, @Unsigned int start, @Unsigned int size, Ptr<@Unsigned Long> len, Ptr<@Unsigned @OriginalName(value="resource_size_t") Long> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vp_modern_map_vq_notify(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2, Ptr<@Unsigned @OriginalName(value="resource_size_t") Long> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vp_modern_probe(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_modern_queue_address(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2, @Unsigned long desc_addr, @Unsigned long driver_addr, @Unsigned long device_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vp_modern_queue_vector(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2, @Unsigned short vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_modern_remove(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_modern_set_features(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_modern_set_queue_enable(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_modern_set_queue_reset(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_modern_set_queue_size(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, @Unsigned short index2, @Unsigned short size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_modern_set_status(Ptr<VirtioDefinitions.virtio_pci_modern_device> mdev, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vp_notify_with_data(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_reset(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vp_set($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void vp_set(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vp_set_status(Ptr<VirtioDefinitions.virtio_device> vdev, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum vp_vq_vector_policy")
    public static enum vp_vq_vector_policy implements Enum<vp_vq_vector_policy>,
    TypedEnum<vp_vq_vector_policy, Integer>
    {
        VP_VQ_VECTOR_POLICY_EACH,
        VP_VQ_VECTOR_POLICY_SHARED_SLOW,
        VP_VQ_VECTOR_POLICY_SHARED;

    }
}

