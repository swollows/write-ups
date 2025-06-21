/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HmmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_range_fault(Ptr<hmm_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmm_range_need_fault((const struct hmm_vma_walk*)$arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static @Unsigned int hmm_range_need_fault(Ptr<hmm_vma_walk> hmm_vma_walk2, Ptr<@Unsigned Long> hmm_pfns, @Unsigned long npages, @Unsigned long cpu_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_vma_fault(@Unsigned long addr2, @Unsigned long end, @Unsigned int required_fault, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_vma_handle_pmd(Ptr<MmDefinitions.mm_walk> walk, @Unsigned long addr2, @Unsigned long end, Ptr<@Unsigned Long> hmm_pfns, PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_vma_handle_pte(Ptr<MmDefinitions.mm_walk> walk, @Unsigned long addr2, @Unsigned long end, Ptr<PmdDefinitions.pmd_t> pmdp, Ptr<PteDefinitions.pte_t> ptep, Ptr<@Unsigned Long> hmm_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_vma_walk_hole(@Unsigned long addr2, @Unsigned long end, int depth, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_vma_walk_hugetlb_entry(Ptr<PteDefinitions.pte_t> pte, @Unsigned long hmask, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_vma_walk_pmd(Ptr<PmdDefinitions.pmd_t> pmdp, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_vma_walk_pud(Ptr<PudDefinitions.pud_t> pudp, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmm_vma_walk_test(@Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hmm_vma_walk")
    @NotUsableInJava
    public static class hmm_vma_walk
    extends Struct {
        public Ptr<hmm_range> range;
        public @Unsigned long last;
    }

    @Type(noCCodeGeneration=true, cType="struct hmm_range")
    @NotUsableInJava
    public static class hmm_range
    extends Struct {
        public Ptr<MmuDefinitions.mmu_interval_notifier> notifier;
        public @Unsigned long notifier_seq;
        public @Unsigned long start;
        public @Unsigned long end;
        public Ptr<@Unsigned Long> hmm_pfns;
        public @Unsigned long default_flags;
        public @Unsigned long pfn_flags_mask;
        public Ptr<?> dev_private_owner;
    }

    @Type(noCCodeGeneration=true, cType="enum hmm_pfn_flags")
    public static enum hmm_pfn_flags implements Enum<hmm_pfn_flags>,
    TypedEnum<hmm_pfn_flags, Long>
    {
        HMM_PFN_VALID,
        HMM_PFN_WRITE,
        HMM_PFN_ERROR,
        HMM_PFN_ORDER_SHIFT,
        HMM_PFN_REQ_FAULT,
        HMM_PFN_REQ_WRITE,
        HMM_PFN_FLAGS;

    }
}

