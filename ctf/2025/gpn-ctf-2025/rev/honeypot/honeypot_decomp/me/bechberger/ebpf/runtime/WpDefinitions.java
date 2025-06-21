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
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class WpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __wp_page_copy_user(Ptr<runtime.page> dst, Ptr<runtime.page> src, Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int wp_page_copy(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wp_page_reuse(Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wp_clean_pmd_entry(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wp_clean_post_vma(Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wp_clean_pre_vma(@Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wp_clean_pud_entry(Ptr<PudDefinitions.pud_t> pud, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wp_clean_test_walk(@Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wp_pte(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long wp_shared_mapping_range(Ptr<misc.address_space> mapping, @Unsigned long first_index, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct wp_walk")
    @NotUsableInJava
    public static class wp_walk
    extends Struct {
        public MmuDefinitions.mmu_notifier_range range;
        public @Unsigned long tlbflush_start;
        public @Unsigned long tlbflush_end;
        public @Unsigned long total;
    }
}

