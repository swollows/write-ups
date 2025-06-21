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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.GnttabDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ClearDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_itimer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean clear_page_dirty_for_io(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clear_page_presence(Ptr<misc.kmmio_fault_page> f, boolean clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_pmd_presence(Ptr<PmdDefinitions.pmd_t> pmd, boolean clear, Ptr<@Unsigned @OriginalName(value="pmdval_t") Long> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_posix_cputimers_work(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_pte_presence(Ptr<PteDefinitions.pte_t> pte, boolean clear, Ptr<@Unsigned @OriginalName(value="pteval_t") Long> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_shadow_entries(Ptr<misc.address_space> mapping, Ptr<FolioDefinitions.folio_batch> fbatch, Ptr<@Unsigned Long> indices) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long clear_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_tasks_mm_cpumask(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_tracing_err_log(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_tsk_latency_tracing(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clear_warn_once_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clear_warn_once_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_cpu_cap(Ptr<misc.cpuinfo_x86> c, @Unsigned int feature) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clear_foreign_p2m_mapping(Ptr<GnttabDefinitions.gnttab_unmap_grant_ref> unmap_ops, Ptr<GnttabDefinitions.gnttab_unmap_grant_ref> kunmap_ops, Ptr<Ptr<runtime.page>> pages, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_ftrace_function_probes(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_ftrace_pids(Ptr<TraceDefinitions.trace_array> tr, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_gpe_and_advance_transaction(Ptr<AcpiDefinitions.acpi_ec> ec, boolean interrupt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_hv_tscchange_cb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_local_APIC() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clear_mce_nospec(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_mod_from_hash(Ptr<FtraceDefinitions.ftrace_page> pg, Ptr<FtraceDefinitions.ftrace_hash> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_page_erms() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_page_orig() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_page_rep() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clear_refs_pte_range(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clear_refs_test_walk(@Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clear_refs_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long clear_refs_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clear_relocate_add($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void clear_relocate_add(Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, String strtab, @Unsigned int symindex, @Unsigned int relsec, Ptr<runtime.module> me) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_sched_clock_stable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_shadow_from_swap_cache(int type2, @Unsigned long begin, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_soft_dirty(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_vma_resv_huge_pages(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_all_pkt_pointers(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_buffer_attributes(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_eld(Ptr<DrmDefinitions.drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_irq_resend(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_irq_vector(Ptr<IrqDefinitions.irq_data> irqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_nlink(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_node_memory_type(int node2, Ptr<MemoryDefinitions.memory_dev_type> memtype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_rdrand_cpuid_bit(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_selection() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_bhb_loop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_bss() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clear_entries(Ptr<runtime.irq_2_iommu> irq_iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_event_triggers(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_opal_cmd(Ptr<OpalDefinitions.opal_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clear_or_poison_free_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean clear_pending_if_disabled(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct clear_refs_private")
    @NotUsableInJava
    public static class clear_refs_private
    extends Struct {
        public clear_refs_types type;
    }

    @Type(noCCodeGeneration=true, cType="enum clear_refs_types")
    public static enum clear_refs_types implements Enum<clear_refs_types>,
    TypedEnum<clear_refs_types, Integer>
    {
        CLEAR_REFS_ALL,
        CLEAR_REFS_ANON,
        CLEAR_REFS_MAPPED,
        CLEAR_REFS_SOFT_DIRTY,
        CLEAR_REFS_MM_HIWATER_RSS,
        CLEAR_REFS_LAST;

    }

    @Type(noCCodeGeneration=true, cType="struct clear_badblocks_context")
    @NotUsableInJava
    public static class clear_badblocks_context
    extends Struct {
        public @Unsigned @OriginalName(value="resource_size_t") long phys;
        public @Unsigned @OriginalName(value="resource_size_t") long cleared;
    }
}

