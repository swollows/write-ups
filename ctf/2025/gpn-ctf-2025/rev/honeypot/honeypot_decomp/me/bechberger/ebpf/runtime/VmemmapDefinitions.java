/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VmemmapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __vmemmap_use_sub_pmd(@Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vmemmap_alloc_block(@Unsigned long size, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vmemmap_alloc_block_buf(@Unsigned long size, int node2, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_check_pmd(Ptr<PmdDefinitions.pmd_t> pmd, int node2, @Unsigned long addr2, @Unsigned long next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmemmap_flush_unused_pmd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmemmap_free(@Unsigned long start, @Unsigned long end, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.p4d_t> vmemmap_p4d_populate(Ptr<misc.pgd_t> pgd, @Unsigned long addr2, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.pgd_t> vmemmap_pgd_populate(@Unsigned long addr2, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_pmd_entry(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long next, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PmdDefinitions.pmd_t> vmemmap_pmd_populate(Ptr<PudDefinitions.pud_t> pud, @Unsigned long addr2, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_populate(@Unsigned long start, @Unsigned long end, int node2, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> vmemmap_populate_address(@Unsigned long addr2, int node2, Ptr<misc.vmem_altmap> altmap, Ptr<runtime.page> reuse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_populate_basepages(@Unsigned long start, @Unsigned long end, int node2, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_populate_compound_pages(@Unsigned long start_pfn, @Unsigned long start, @Unsigned long end, int node2, Ptr<DevDefinitions.dev_pagemap> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_populate_hugepages(@Unsigned long start, @Unsigned long end, int node2, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmemmap_populate_print_last() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_pte_entry(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, @Unsigned long next, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> vmemmap_pte_populate(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, int node2, Ptr<misc.vmem_altmap> altmap, Ptr<runtime.page> reuse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PudDefinitions.pud_t> vmemmap_pud_populate(Ptr<misc.p4d_t> p4d, @Unsigned long addr2, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmemmap_remap_pte(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, Ptr<vmemmap_remap_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_remap_range(@Unsigned long start, @Unsigned long end, Ptr<vmemmap_remap_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmemmap_restore_pte(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, Ptr<vmemmap_remap_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmemmap_set_pmd(Ptr<PmdDefinitions.pmd_t> pmd, Ptr<?> p, int node2, @Unsigned long addr2, @Unsigned long next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vmemmap_should_optimize_folio((const struct hstate*)$arg1, $arg2)")
    public static boolean vmemmap_should_optimize_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmemmap_split_pmd(Ptr<PmdDefinitions.pmd_t> pmd, Ptr<runtime.page> head, @Unsigned long start, Ptr<vmemmap_remap_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmemmap_verify(Ptr<PteDefinitions.pte_t> pte, int node2, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vmemmap_remap_walk")
    @NotUsableInJava
    public static class vmemmap_remap_walk
    extends Struct {
        public Ptr<?> remap_pte;
        public @Unsigned long nr_walked;
        public Ptr<runtime.page> reuse_page;
        public @Unsigned long reuse_addr;
        public Ptr<ListDefinitions.list_head> vmemmap_pages;
        public @Unsigned long flags;
    }
}

