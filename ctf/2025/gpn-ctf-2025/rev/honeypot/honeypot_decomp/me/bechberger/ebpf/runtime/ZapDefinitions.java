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
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ZapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zap_page_range_single(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @Unsigned long size, Ptr<zap_details> details) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zap_pid_ns_processes(Ptr<PidDefinitions.pid_namespace> pid_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zap_present_ptes(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PteDefinitions.pte_t> pte, PteDefinitions.pte_t ptent, @Unsigned int max_nr, @Unsigned long addr2, Ptr<zap_details> details, Ptr<Integer> rss, Ptr<@OriginalName(value="bool") Boolean> force_flush, Ptr<@OriginalName(value="bool") Boolean> force_break) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zap_pte_range(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end, Ptr<zap_details> details) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zap_vma_ptes(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zap_completion_queue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zap_modalias_env(Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zap_other_threads(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zap_huge_pmd(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zap_huge_pud(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PudDefinitions.pud_t> pud, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct zap_details")
    @NotUsableInJava
    public static class zap_details
    extends Struct {
        public Ptr<runtime.folio> single_folio;
        public boolean even_cows;
        public @Unsigned @OriginalName(value="zap_flags_t") int zap_flags;
    }
}

