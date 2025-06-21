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
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VmapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __vmap_pages_range_noflush(@Unsigned long addr2, @Unsigned long end,  @OriginalName(value="pgprot_t") runtime.pgprot prot, Ptr<Ptr<runtime.page>> pages, @Unsigned int page_shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmap_init_nodes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmap_node_shrink_count(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmap_node_shrink_scan(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmap_page_range(@Unsigned long addr2, @Unsigned long end, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr,  @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmap_pages_pud_range(Ptr<misc.p4d_t> p4d, @Unsigned long addr2, @Unsigned long end,  @OriginalName(value="pgprot_t") runtime.pgprot prot, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> nr, Ptr<@Unsigned @OriginalName(value="pgtbl_mod_mask") Integer> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmap_pages_range_noflush(@Unsigned long addr2, @Unsigned long end,  @OriginalName(value="pgprot_t") runtime.pgprot prot, Ptr<Ptr<runtime.page>> pages, @Unsigned int page_shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vmap_pfn(Ptr<@Unsigned Long> pfns, @Unsigned int count,  @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmap_pfn_apply(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vmap_ram_vread_iter($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @Unsigned long vmap_ram_vread_iter(Ptr<IovDefinitions.iov_iter> iter2, String addr2, @Unsigned long count, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmap_range_noflush(@Unsigned long addr2, @Unsigned long end, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr,  @OriginalName(value="pgprot_t") runtime.pgprot prot, @Unsigned int max_page_shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmap_small_pages_range_noflush(@Unsigned long addr2, @Unsigned long end,  @OriginalName(value="pgprot_t") runtime.pgprot prot, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmap_udmabuf(Ptr<DmaDefinitions.dma_buf> buf, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vmap_pfn_data")
    @NotUsableInJava
    public static class vmap_pfn_data
    extends Struct {
        public Ptr<@Unsigned Long> pfns;
        public  @OriginalName(value="pgprot_t") runtime.pgprot prot;
        public @Unsigned int idx;
    }

    @Type(noCCodeGeneration=true, cType="struct vmap_block")
    @NotUsableInJava
    public static class vmap_block
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<vmap_area> va;
        public @Unsigned long free;
        public @Unsigned long dirty;
        public @Unsigned long @Size(value=4) [] used_map;
        public @Unsigned long dirty_min;
        public @Unsigned long dirty_max;
        public ListDefinitions.list_head free_list;
        public misc.callback_head callback_head;
        public ListDefinitions.list_head purge;
        public @Unsigned int cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct vmap_block_queue")
    @NotUsableInJava
    public static class vmap_block_queue
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head free;
        public runtime.xarray vmap_blocks;
    }

    @Type(noCCodeGeneration=true, cType="struct vmap_node")
    @NotUsableInJava
    public static class vmap_node
    extends Struct {
        public vmap_pool @Size(value=256) [] pool;
        public  @OriginalName(value="spinlock_t") runtime.spinlock pool_lock;
        public boolean skip_populate;
        public RbDefinitions.rb_list busy;
        public RbDefinitions.rb_list lazy;
        public ListDefinitions.list_head purge_list;
        public misc.work_struct purge_work;
        public @Unsigned long nr_purged;
    }

    @Type(noCCodeGeneration=true, cType="struct vmap_pool")
    @NotUsableInJava
    public static class vmap_pool
    extends Struct {
        public ListDefinitions.list_head head;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct vmap_area")
    @NotUsableInJava
    public static class vmap_area
    extends Struct {
        public @Unsigned long va_start;
        public @Unsigned long va_end;
        public RbDefinitions.rb_node rb_node;
        public ListDefinitions.list_head list;
        @InlineUnion(value=29656)
        public @InlineUnion(value=29656) @Unsigned long subtree_max_size;
        @InlineUnion(value=29656)
        public @InlineUnion(value=29656) Ptr<VmDefinitions.vm_struct> vm;
        public @Unsigned long flags;
    }
}

