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
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PagemapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pagemap_hugetlb_category(PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_hugetlb_range(Ptr<PteDefinitions.pte_t> ptep, @Unsigned long hmask, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pagemap_page_category(Ptr<pagemap_scan_private> p, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_pmd_range(Ptr<PmdDefinitions.pmd_t> pmdp, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_pte_hole(@Unsigned long start, @Unsigned long end, int depth, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_range(Ptr<DevDefinitions.dev_pagemap> pgmap, Ptr<misc.mhp_params> params, int range_id, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pagemap_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_scan_hugetlb_entry(Ptr<PteDefinitions.pte_t> ptep, @Unsigned long hmask, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_scan_output(@Unsigned long categories, Ptr<pagemap_scan_private> p, @Unsigned long addr2, Ptr<@Unsigned Long> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_scan_pmd_entry(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_scan_pte_hole(@Unsigned long addr2, @Unsigned long end, int depth, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_scan_test_walk(@Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pagemap_scan_thp_entry(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pagemap_thp_category(Ptr<pagemap_scan_private> p, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pagemap_scan_private")
    @NotUsableInJava
    public static class pagemap_scan_private
    extends Struct {
        public PmDefinitions.pm_scan_arg arg;
        public @Unsigned long masks_of_interest;
        public @Unsigned long cur_vma_category;
        public Ptr<PageDefinitions.page_region> vec_buf;
        public @Unsigned long vec_buf_len;
        public @Unsigned long vec_buf_index;
        public @Unsigned long found_pages;
        public Ptr<PageDefinitions.page_region> vec_out;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int pme; }")
    @NotUsableInJava
    public static class pagemap_entry_t
    extends Struct {
        public @Unsigned long pme;
    }
}

