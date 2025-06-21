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
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class WalkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PmdDefinitions.pmd_t> walk_to_pmd(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __walk_page_range(@Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)walk_component($arg1, $arg2))")
    public static String walk_component(Ptr<runtime.nameidata> nd, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_iomem_res_desc($arg1, $arg2, $arg3, $arg4, $arg5, (int (*)(struct resource*, void*))$arg6)")
    public static int walk_iomem_res_desc(@Unsigned long desc, @Unsigned long flags, @Unsigned long start, @Unsigned long end, Ptr<?> arg2, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_mem_res($arg1, $arg2, $arg3, (int (*)(struct resource*, void*))$arg4)")
    public static int walk_mem_res(@Unsigned long start, @Unsigned long end, Ptr<?> arg2, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_page_mapping($arg1, $arg2, $arg3, (const struct mm_walk_ops*)$arg4, $arg5)")
    public static int walk_page_mapping(Ptr<misc.address_space> mapping, @Unsigned long first_index, @Unsigned long nr, Ptr<MmDefinitions.mm_walk_ops> ops, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_page_range($arg1, $arg2, $arg3, (const struct mm_walk_ops*)$arg4, $arg5)")
    public static int walk_page_range(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk_ops> ops, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_page_range_novma($arg1, $arg2, $arg3, (const struct mm_walk_ops*)$arg4, $arg5, $arg6)")
    public static int walk_page_range_novma(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk_ops> ops, Ptr<misc.pgd_t> pgd, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_page_range_vma($arg1, $arg2, $arg3, (const struct mm_walk_ops*)$arg4, $arg5)")
    public static int walk_page_range_vma(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk_ops> ops, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int walk_page_test(@Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_page_vma($arg1, (const struct mm_walk_ops*)$arg2, $arg3)")
    public static int walk_page_vma(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<MmDefinitions.mm_walk_ops> ops, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int walk_pgd_range(@Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void walk_pmd_range_locked(Ptr<PudDefinitions.pud_t> pud, @Unsigned long addr2, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<MmDefinitions.mm_walk> args, Ptr<@Unsigned Long> bitmap2, Ptr<@Unsigned Long> first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void walk_process_tree(Ptr<TaskDefinitions.task_struct> top, @OriginalName(value="proc_visitor") Ptr<?> visitor, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_rcec((int (*)(struct pci_dev*, void*))$arg1, $arg2)")
    public static void walk_rcec(Ptr<?> cb, Ptr<?> userdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int walk_rcec_helper(Ptr<PciDefinitions.pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_system_ram_range($arg1, $arg2, $arg3, (int (*)(long unsigned int, long unsigned int, void*))$arg4)")
    public static int walk_system_ram_range(@Unsigned long start_pfn, @Unsigned long nr_pages, Ptr<?> arg2, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_system_ram_res($arg1, $arg2, $arg3, (int (*)(struct resource*, void*))$arg4)")
    public static int walk_system_ram_res(@Unsigned long start, @Unsigned long end, Ptr<?> arg2, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="walk_system_ram_res_rev($arg1, $arg2, $arg3, (int (*)(struct resource*, void*))$arg4)")
    public static int walk_system_ram_res_rev(@Unsigned long start, @Unsigned long end, Ptr<?> arg2, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int walk_hmem_resources(Ptr<runtime.device> host, @OriginalName(value="walk_hmem_fn") Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int walk_tg_tree_from(Ptr<TaskDefinitions.task_group> from, @OriginalName(value="tg_visitor") Ptr<?> down, @OriginalName(value="tg_visitor") Ptr<?> up, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int walk_dynamic_memory_groups(int nid, @OriginalName(value="walk_memory_groups_func_t") Ptr<?> func, Ptr<MemoryDefinitions.memory_group> excluded, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int walk_memory_blocks(@Unsigned long start, @Unsigned long size, Ptr<?> arg2, @OriginalName(value="walk_memory_blocks_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NvdimmDefinitions.nvdimm_bus> walk_to_nvdimm_bus(Ptr<runtime.device> nd_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct walk_rcec_data")
    @NotUsableInJava
    public static class walk_rcec_data
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> rcec;
        public Ptr<?> user_callback;
        public Ptr<?> user_data;
    }
}

