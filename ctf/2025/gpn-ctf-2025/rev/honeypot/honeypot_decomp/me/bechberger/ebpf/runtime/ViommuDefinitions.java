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
import me.bechberger.ebpf.runtime.IntervalDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.OfDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ViommuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __viommu_add_req(Ptr<viommu_dev> viommu, Ptr<?> buf, @Unsigned long len, boolean writeback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __viommu_sync_req(Ptr<viommu_dev> viommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int viommu_add_mapping(Ptr<viommu_domain> vdomain, @Unsigned long iova2, @Unsigned long end, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int viommu_add_req(Ptr<viommu_dev> viommu, Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int viommu_attach_dev(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean viommu_capable(Ptr<runtime.device> dev, IommuDefinitions.iommu_cap cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void viommu_config_changed(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long viommu_del_mappings(Ptr<viommu_domain> vdomain, @Unsigned long iova2, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_group> viommu_device_group(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_domain> viommu_domain_alloc(@Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void viommu_domain_free(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void viommu_event_handler(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void viommu_flush_iotlb_all(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void viommu_get_resv_regions(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void viommu_iotlb_sync(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<IommuDefinitions.iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int viommu_iotlb_sync_map(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long viommu_iova_to_phys(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned @OriginalName(value="dma_addr_t") long iova2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int viommu_map_pages(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long pgsize, @Unsigned long pgcount, int prot, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned Long> mapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="viommu_match_node($arg1, (const void*)$arg2)")
    public static int viommu_match_node(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="viommu_of_xlate($arg1, (const struct of_phandle_args*)$arg2)")
    public static int viommu_of_xlate(Ptr<runtime.device> dev, Ptr<OfDefinitions.of_phandle_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int viommu_probe(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_device> viommu_probe_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int viommu_probe_endpoint(Ptr<viommu_dev> viommu, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void viommu_release_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void viommu_remove(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int viommu_send_req_sync(Ptr<viommu_dev> viommu, Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long viommu_unmap_pages(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned long pgsize, @Unsigned long pgcount, Ptr<IommuDefinitions.iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct viommu_event")
    @NotUsableInJava
    public static class viommu_event
    extends Struct {
        @InlineUnion(value=32193)
        public @InlineUnion(value=32193) @Unsigned int head;
        @InlineUnion(value=32193)
        public @InlineUnion(value=32193) VirtioDefinitions.virtio_iommu_fault fault;
    }

    @Type(noCCodeGeneration=true, cType="struct viommu_request")
    @NotUsableInJava
    public static class viommu_request
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> writeback;
        public @Unsigned int write_offset;
        public @Unsigned int len;
        public char @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct viommu_endpoint")
    @NotUsableInJava
    public static class viommu_endpoint
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<viommu_dev> viommu;
        public Ptr<viommu_domain> vdomain;
        public ListDefinitions.list_head resv_regions;
    }

    @Type(noCCodeGeneration=true, cType="struct viommu_domain")
    @NotUsableInJava
    public static class viommu_domain
    extends Struct {
        public IommuDefinitions.iommu_domain domain;
        public Ptr<viommu_dev> viommu;
        public runtime.mutex mutex;
        public @Unsigned int id;
        public @Unsigned int map_flags;
        public @OriginalName(value="spinlock_t") runtime.spinlock mappings_lock;
        public RbDefinitions.rb_root_cached mappings;
        public @Unsigned long nr_endpoints;
        public boolean bypass;
    }

    @Type(noCCodeGeneration=true, cType="struct viommu_mapping")
    @NotUsableInJava
    public static class viommu_mapping
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long paddr;
        public IntervalDefinitions.interval_tree_node iova;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct viommu_dev")
    @NotUsableInJava
    public static class viommu_dev
    extends Struct {
        public IommuDefinitions.iommu_device iommu;
        public Ptr<runtime.device> dev;
        public Ptr<VirtioDefinitions.virtio_device> vdev;
        public runtime.ida domain_ids;
        public Ptr<runtime.virtqueue> @Size(value=2) [] vqs;
        public @OriginalName(value="spinlock_t") runtime.spinlock request_lock;
        public ListDefinitions.list_head requests;
        public Ptr<?> evts;
        public IommuDefinitions.iommu_domain_geometry geometry;
        public @Unsigned long pgsize_bitmap;
        public @Unsigned int first_domain;
        public @Unsigned int last_domain;
        public @Unsigned int map_flags;
        public @Unsigned int probe_size;
    }
}

