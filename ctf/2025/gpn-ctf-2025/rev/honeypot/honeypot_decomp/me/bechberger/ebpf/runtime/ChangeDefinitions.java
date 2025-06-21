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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ChangeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int change_bus_speed(Ptr<runtime.controller> ctrl, Ptr<runtime.slot> p_slot, PciDefinitions.pci_bus_speed speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="change_hat((const struct cred*)$arg1, $arg2, (const u8**)$arg3, $arg4, $arg5)")
    public static Ptr<AaDefinitions.aa_label> change_hat(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_label> label, Ptr<String> hats, int count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __change_page_attr(Ptr<misc.cpa_data> cpa, int primary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __change_page_attr_set_clr(Ptr<misc.cpa_data> cpa, int primary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int change_page_attr_set_clr(Ptr<@Unsigned Long> addr2, int numpages,  @OriginalName(value="pgprot_t") runtime.pgprot mask_set,  @OriginalName(value="pgprot_t") runtime.pgprot mask_clr, int force_split, int in_flag, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long change_protection(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, @Unsigned long cp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long change_protection_range(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @Unsigned long end,  @OriginalName(value="pgprot_t") runtime.pgprot newprot, @Unsigned long cp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long change_pte_range(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end,  @OriginalName(value="pgprot_t") runtime.pgprot newprot, @Unsigned long cp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __change_pid(Ptr<TaskDefinitions.task_struct> task2, PidDefinitions.pid_type type2, Ptr<runtime.pid> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void change_pid(Ptr<TaskDefinitions.task_struct> task2, PidDefinitions.pid_type type2, Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long change_prot_numa(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int change_clocksource(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void change_console(Ptr<VcDefinitions.vc_data> new_vc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int change_huge_pmd(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2,  @OriginalName(value="pgprot_t") runtime.pgprot newprot, @Unsigned long cp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int change_huge_pud(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PudDefinitions.pud_t> pudp, @Unsigned long addr2,  @OriginalName(value="pgprot_t") runtime.pgprot newprot, @Unsigned long cp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void change_mnt_propagation(Ptr<runtime.mount> mnt, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void change_pageblock_range(Ptr<runtime.page> pageblock_page, int start_order, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct change_member")
    @NotUsableInJava
    public static class change_member
    extends Struct {
        public Ptr<misc.e820_entry> entry;
        public @Unsigned long addr;
    }
}

