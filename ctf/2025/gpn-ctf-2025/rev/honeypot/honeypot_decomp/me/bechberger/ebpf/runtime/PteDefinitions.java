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
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.PagemapDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PteDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pte_alloc(Ptr<MmDefinitions.mm_struct> mm, Ptr<PmdDefinitions.pmd_t> pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pte_alloc_kernel(Ptr<PmdDefinitions.pmd_t> pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static pte_t pte_advance_pfn(pte_t pte, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static pte_t pte_move_swp_offset(pte_t pte, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pte_none_mostly(pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pte_pfn(pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pte_swp_uffd_wp_any(pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.swp_entry_t pte_to_swp_entry(pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pteval_t") long pte_val(pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pte_write(pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PagemapDefinitions.pagemap_entry_t pte_to_pagemap_entry(Ptr<pagemapread> pm, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ___pte_free_tlb(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<runtime.page> pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pte_t> __pte_offset_map(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, Ptr<PmdDefinitions.pmd_t> pmdvalp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pte_t> __pte_offset_map_lock(Ptr<MmDefinitions.mm_struct> mm, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, Ptr<Ptr< @OriginalName(value="spinlock_t") runtime.spinlock>> ptlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pgtable_t") Ptr<runtime.page> pte_alloc_one(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pte_free_defer(Ptr<MmDefinitions.mm_struct> mm, @OriginalName(value="pgtable_t") Ptr<runtime.page> pgtable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pte_free_now(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static pte_t pte_mkwrite(pte_t pte, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pte_t> pte_offset_map_nolock(Ptr<MmDefinitions.mm_struct> mm, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, Ptr<Ptr< @OriginalName(value="spinlock_t") runtime.spinlock>> ptlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pteval_t") long pte_pfn_to_mfn(@Unsigned @OriginalName(value="pteval_t") long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pagemapread")
    @NotUsableInJava
    public static class pagemapread
    extends Struct {
        public int pos;
        public int len;
        public Ptr<PagemapDefinitions.pagemap_entry_t> buffer;
        public boolean show_pfn;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int pte; }")
    @NotUsableInJava
    public static class pte_t
    extends Struct {
        public @Unsigned @OriginalName(value="pteval_t") long pte;
    }
}

