/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.SeccompDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class PopulateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> __populate_section_memmap(@Unsigned long pfn, @Unsigned long nr_pages, int nid, Ptr<misc.vmem_altmap> altmap, Ptr<DevDefinitions.dev_pagemap> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_cand_cache> populate_cand_cache(Ptr<BpfDefinitions.bpf_cand_cache> cands, Ptr<Ptr<BpfDefinitions.bpf_cand_cache>> cache, int cache_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PmdDefinitions.pmd_t> populate_extra_pmd(@Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> populate_extra_pte(@Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int populate_bpffs(Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int populate_cache_leaves(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int populate_pgd(Ptr<misc.cpa_data> cpa, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long populate_pmd(Ptr<misc.cpa_data> cpa, @Unsigned long start, @Unsigned long end, @Unsigned int num_pages, Ptr<PudDefinitions.pud_t> pud,  @OriginalName(value="pgprot_t") runtime.pgprot pgprot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int populate_pud(Ptr<misc.cpa_data> cpa, @Unsigned long start, Ptr<misc.p4d_t> p4d,  @OriginalName(value="pgprot_t") runtime.pgprot pgprot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void populate_seccomp_data(Ptr<SeccompDefinitions.seccomp_data> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int populate_table(Ptr<DmDefinitions.dm_table> table, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long populate_vma_page_range(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, Ptr<Integer> locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void populate_error_injection_list(Ptr<misc.error_injection_entry> start, Ptr<misc.error_injection_entry> end, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int populate_rootfs() {
        throw new MethodIsBPFRelatedFunction();
    }
}

