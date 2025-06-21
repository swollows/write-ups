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
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.ZapDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class UnmapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_and_kill(Ptr<ListDefinitions.list_head> to_kill2, @Unsigned long pfn, Ptr<misc.address_space> mapping, @Unsigned long index2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unmap_and_move_huge_page(Ptr<?> get_new_folio, Ptr<?> put_new_folio, @Unsigned long _private, Ptr<runtime.folio> src, int force, MigrateDefinitions.migrate_mode mode, int reason, Ptr<ListDefinitions.list_head> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_gfn(@Unsigned long gfn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_mapping_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_mapping_pages(Ptr<misc.address_space> mapping, @Unsigned long start, @Unsigned long nr, boolean even_cows) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="unmap_mapping_range($arg1, (const long long int)$arg2, (const long long int)$arg3, $arg4)")
    public static void unmap_mapping_range(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long holebegin, @OriginalName(value="loff_t") long holelen, int even_cows) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_page_range(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @Unsigned long end, Ptr<ZapDefinitions.zap_details> details) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_poisoned_folio(Ptr<runtime.folio> folio2, misc.ttu_flags ttu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_refs_callback(int result, Ptr<misc.gntab_unmap_queue_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_single_vma(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start_addr, @Unsigned long end_addr, Ptr<ZapDefinitions.zap_details> details, boolean mm_wr_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_udmabuf(Ptr<DmaDefinitions.dma_buf_attachment> at, Ptr<SgDefinitions.sg_table> sg2, DmaDefinitions.dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_vmas(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<misc.ma_state> mas, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start_addr, @Unsigned long end_addr, @Unsigned long tree_end, boolean mm_wr_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __unmap_hugepage_range(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, Ptr<runtime.page> ref_page, @Unsigned @OriginalName(value="zap_flags_t") int zap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __unmap_pmd_range(Ptr<PudDefinitions.pud_t> pud, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_hugepage_range(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, Ptr<runtime.page> ref_page, @Unsigned @OriginalName(value="zap_flags_t") int zap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_pmd_range(Ptr<PudDefinitions.pud_t> pud, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unmap_region(Ptr<misc.ma_state> mas, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<VmDefinitions.vm_area_struct> prev, Ptr<VmDefinitions.vm_area_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean unmap_huge_pmd_locked(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PmdDefinitions.pmd_t> pmdp, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct unmap_refs_callback_data")
    @NotUsableInJava
    public static class unmap_refs_callback_data
    extends Struct {
        public runtime.completion completion;
        public int result;
    }

    @Type(noCCodeGeneration=true, cType="struct unmap_ring_hvm")
    @NotUsableInJava
    public static class unmap_ring_hvm
    extends Struct {
        public @Unsigned int idx;
        public @Unsigned long @Size(value=16) [] addrs;
    }
}

