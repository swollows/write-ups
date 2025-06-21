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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IovaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iova_bitmap_advance_to(Ptr<iova_bitmap> bitmap2, @Unsigned long iova2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iova_bitmap> iova_bitmap_alloc(@Unsigned long iova2, @Unsigned long length, @Unsigned long page_size, Ptr<@Unsigned Long> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iova_bitmap_for_each(Ptr<iova_bitmap> bitmap2, Ptr<?> opaque, @OriginalName(value="iova_bitmap_fn_t") Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iova_bitmap_free(Ptr<iova_bitmap> bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iova_bitmap_set(Ptr<iova_bitmap> bitmap2, @Unsigned long iova2, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iova_cache_get() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iova_cache_put() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iova_cpuhp_dead(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iova_depot_work_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iova_domain_init_rcaches(Ptr<iova_domain> iovad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iova_magazine_free_pfns(Ptr<iova_magazine> mag, Ptr<iova_domain> iovad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iova_rcache_range() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iova_reserve_iommu_regions(Ptr<runtime.device> dev, Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iova_reserve_pci_windows(Ptr<PciDefinitions.pci_dev> dev, Ptr<iova_domain> iovad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct iova_cpu_rcache")
    @NotUsableInJava
    public static class iova_cpu_rcache
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<iova_magazine> loaded;
        public Ptr<iova_magazine> prev;
    }

    @Type(noCCodeGeneration=true, cType="struct iova_magazine")
    @NotUsableInJava
    public static class iova_magazine
    extends Struct {
        @InlineUnion(value=94295)
        public @InlineUnion(value=94295) @Unsigned long size;
        @InlineUnion(value=94295)
        public @InlineUnion(value=94295) Ptr<iova_magazine> next;
        public @Unsigned long @Size(value=127) [] pfns;
    }

    @Type(noCCodeGeneration=true, cType="struct iova_rcache")
    @NotUsableInJava
    public static class iova_rcache
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int depot_size;
        public Ptr<iova_magazine> depot;
        public Ptr<iova_cpu_rcache> cpu_rcaches;
        public Ptr<iova_domain> iovad;
        public DelayedDefinitions.delayed_work work;
    }

    @Type(noCCodeGeneration=true, cType="struct iova_bitmap_map")
    @NotUsableInJava
    public static class iova_bitmap_map
    extends Struct {
        public @Unsigned long iova;
        public @Unsigned long length;
        public @Unsigned long pgshift;
        public @Unsigned long pgoff;
        public @Unsigned long npages;
        public Ptr<Ptr<runtime.page>> pages;
    }

    @Type(noCCodeGeneration=true, cType="struct iova_bitmap")
    @NotUsableInJava
    public static class iova_bitmap
    extends Struct {
        public iova_bitmap_map mapped;
        public Ptr<Character> bitmap;
        public @Unsigned long mapped_base_index;
        public @Unsigned long mapped_total_index;
        public @Unsigned long iova;
        public @Unsigned long length;
    }

    @Type(noCCodeGeneration=true, cType="struct iova_fq_entry")
    @NotUsableInJava
    public static class iova_fq_entry
    extends Struct {
        public @Unsigned long iova_pfn;
        public @Unsigned long pages;
        public ListDefinitions.list_head freelist;
        public @Unsigned long counter;
    }

    @Type(noCCodeGeneration=true, cType="struct iova_fq")
    @NotUsableInJava
    public static class iova_fq
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int head;
        public @Unsigned int tail;
        public @Unsigned int mod_mask;
        public iova_fq_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct iova_domain")
    @NotUsableInJava
    public static class iova_domain
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock iova_rbtree_lock;
        public RbDefinitions.rb_root rbroot;
        public Ptr<RbDefinitions.rb_node> cached_node;
        public Ptr<RbDefinitions.rb_node> cached32_node;
        public @Unsigned long granule;
        public @Unsigned long start_pfn;
        public @Unsigned long dma_32bit_pfn;
        public @Unsigned long max32_alloc_size;
        public runtime.iova anchor;
        public Ptr<iova_rcache> rcaches;
        public misc.hlist_node cpuhp_dead;
    }
}

