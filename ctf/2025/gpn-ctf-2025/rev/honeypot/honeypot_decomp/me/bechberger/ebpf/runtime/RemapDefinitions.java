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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RemapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_pfn_fn(Ptr<PteDefinitions.pte_t> ptep, @Unsigned long addr2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_pfn_range(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @Unsigned long pfn, @Unsigned long size, @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_pfn_range_internal(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @Unsigned long pfn, @Unsigned long size, @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_pfn_range_notrack(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @Unsigned long pfn, @Unsigned long size, @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_pte_fn(Ptr<PteDefinitions.pte_t> ptep, @Unsigned long addr2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_vmalloc_range(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<?> addr2, @Unsigned long pgoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_vmalloc_range_partial(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long uaddr, Ptr<?> kaddr, @Unsigned long pgoff, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_area_pfn_pte_fn(Ptr<PteDefinitions.pte_t> ptep, @Unsigned long addr2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_oldmem_pfn_range(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long from, @Unsigned long pfn, @Unsigned long size, @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remap_page(Ptr<runtime.folio> folio2, @Unsigned long nr, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remap_verify_area(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long len, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct remap_trace")
    @NotUsableInJava
    public static class remap_trace
    extends Struct {
        public ListDefinitions.list_head list;
        public misc.kmmio_probe probe;
        public @Unsigned @OriginalName(value="resource_size_t") long phys;
        public @Unsigned long id;
    }

    @Type(noCCodeGeneration=true, cType="struct remap_pfn")
    @NotUsableInJava
    public static class remap_pfn
    extends Struct {
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<Ptr<runtime.page>> pages;
        public @OriginalName(value="pgprot_t") runtime.pgprot prot;
        public @Unsigned long i;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int from; long long unsigned int to; long long unsigned int len; }")
    @NotUsableInJava
    public static class remap_of_arg_of_uffd_msg
    extends Struct {
        public @Unsigned long from;
        public @Unsigned long to;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct remap_data")
    @NotUsableInJava
    public static class remap_data
    extends Struct {
        public Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> pfn;
        public boolean contiguous;
        public boolean no_translate;
        public @OriginalName(value="pgprot_t") runtime.pgprot prot;
        public Ptr<MmuDefinitions.mmu_update> mmu_update;
    }
}

