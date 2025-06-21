/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class GupDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __gup_longterm_locked(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long nr_pages, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> locked, @Unsigned int gup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gup_fast(@Unsigned long start, @Unsigned long end, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gup_fast_devmap_leaf(@Unsigned long pfn, @Unsigned long addr2, @Unsigned long end, @Unsigned int flags, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gup_fast_fallback(@Unsigned long start, @Unsigned long nr_pages, @Unsigned int gup_flags, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gup_fast_folio_allowed(Ptr<runtime.folio> folio2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gup_fast_pgd_range(@Unsigned long addr2, @Unsigned long end, @Unsigned int flags, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gup_fast_pmd_leaf(PmdDefinitions.pmd_t orig, Ptr<PmdDefinitions.pmd_t> pmdp, @Unsigned long addr2, @Unsigned long end, @Unsigned int flags, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gup_fast_pte_range(PmdDefinitions.pmd_t pmd, Ptr<PmdDefinitions.pmd_t> pmdp, @Unsigned long addr2, @Unsigned long end, @Unsigned int flags, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gup_fast_pud_leaf(PudDefinitions.pud_t orig, Ptr<PudDefinitions.pud_t> pudp, @Unsigned long addr2, @Unsigned long end, @Unsigned int flags, Ptr<Ptr<runtime.page>> pages, Ptr<Integer> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gup_fast_undo_dev_pagemap(Ptr<Integer> nr, int nr_start, @Unsigned int flags, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gup_put_folio(Ptr<runtime.folio> folio2, int refs, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gup_signal_pending(@Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> gup_vma_lookup(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

