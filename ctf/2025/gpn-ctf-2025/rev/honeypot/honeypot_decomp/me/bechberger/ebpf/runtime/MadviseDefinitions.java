/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MadviseDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long madvise_cold(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<VmDefinitions.vm_area_struct>> prev, @Unsigned long start_addr, @Unsigned long end_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_cold_or_pageout_pte_range(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_collapse(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<VmDefinitions.vm_area_struct>> prev, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean madvise_dontneed_free_valid_vma(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, Ptr<@Unsigned Long> end, int behavior2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_free_pte_range(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_free_single_vma(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start_addr, @Unsigned long end_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_inject_error(int behavior2, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long madvise_pageout(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<VmDefinitions.vm_area_struct>> prev, @Unsigned long start_addr, @Unsigned long end_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_set_anon_name(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len_in, Ptr<AnonDefinitions.anon_vma_name> anon_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_update_vma(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<VmDefinitions.vm_area_struct>> prev, @Unsigned long start, @Unsigned long end, @Unsigned long new_flags, Ptr<AnonDefinitions.anon_vma_name> anon_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_vma_anon_name(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<VmDefinitions.vm_area_struct>> prev, @Unsigned long start, @Unsigned long end, @Unsigned long anon_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int madvise_vma_behavior(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<VmDefinitions.vm_area_struct>> prev, @Unsigned long start, @Unsigned long end, @Unsigned long behavior2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="madvise_walk_vmas($arg1, $arg2, $arg3, $arg4, (int (*)(struct vm_area_struct*, struct vm_area_struct**, long unsigned int, long unsigned int, long unsigned int))$arg5)")
    public static int madvise_walk_vmas(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end, @Unsigned long arg2, Ptr<?> visit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean madvise_free_huge_pmd(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct madvise_walk_private")
    @NotUsableInJava
    public static class madvise_walk_private
    extends Struct {
        public Ptr<MmuDefinitions.mmu_gather> tlb;
        public boolean pageout;
    }
}

