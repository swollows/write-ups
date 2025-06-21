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
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FollowDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void follow_pfnmap_end(Ptr<follow_pfnmap_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int follow_pfnmap_start(Ptr<follow_pfnmap_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> follow_dotdot_rcu(Ptr<runtime.nameidata> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int follow_down(Ptr<runtime.path> path2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int follow_down_one(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int follow_up(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> follow_huge_pmd(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned int flags, Ptr<follow_page_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> follow_huge_pud(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PudDefinitions.pud_t> pudp, int flags, Ptr<follow_page_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> follow_page_mask(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @Unsigned int flags, Ptr<follow_page_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> follow_page_pte(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned int flags, Ptr<Ptr<DevDefinitions.dev_pagemap>> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> follow_devmap_pmd(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PmdDefinitions.pmd_t> pmd, int flags, Ptr<Ptr<DevDefinitions.dev_pagemap>> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int follow_phys(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<@Unsigned Long> prot, Ptr<@Unsigned @OriginalName(value="resource_size_t") Long> phys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct follow_page_context")
    @NotUsableInJava
    public static class follow_page_context
    extends Struct {
        public Ptr<DevDefinitions.dev_pagemap> pgmap;
        public @Unsigned int page_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct follow_pfnmap_args")
    @NotUsableInJava
    public static class follow_pfnmap_args
    extends Struct {
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public @Unsigned long address;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
        public Ptr<PteDefinitions.pte_t> ptep;
        public @Unsigned long pfn;
        public  @OriginalName(value="pgprot_t") runtime.pgprot pgprot;
        public boolean writable;
        public boolean special;
    }
}

