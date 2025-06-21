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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FirmwareDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.FwDefinitions;
import me.bechberger.ebpf.runtime.HtabDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IovaDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.KsmDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NodeDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PortDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.SynthDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmapDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.ZsDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class AllocDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.gendisk> __alloc_disk_node(Ptr<RequestDefinitions.request_queue> q, int node_id, Ptr<LockDefinitions.lock_class_key> lkclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_remap_table> __alloc_irq_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_anon_folio(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alloc_bootmem_cpumask_var(Ptr<@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask>> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_buffers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean alloc_cpumask_var_node(Ptr<@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask>> mask, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean alloc_debug_processing(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, Ptr<?> object, int orig_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_fair_sched_group(Ptr<TaskDefinitions.task_group> tg, Ptr<TaskDefinitions.task_group> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_frozen_cpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IoDefinitions.io_context> alloc_io_context(@Unsigned @OriginalName(value="gfp_t") int gfp_flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IoDefinitions.io_pgtable_ops> alloc_io_pgtable_ops(IoDefinitions.io_pgtable_fmt fmt, Ptr<IoDefinitions.io_pgtable_cfg> cfg, Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alloc_ioapic_saved_registers(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_irq_index(Ptr<AmdDefinitions.amd_iommu> iommu, @Unsigned short devid, int count, boolean align, Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_remap_table> alloc_irq_table(Ptr<AmdDefinitions.amd_iommu> iommu, @Unsigned short devid, Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_large_system_hash((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<?> alloc_large_system_hash(String tablename, @Unsigned long bucketsize, @Unsigned long numentries, int scale, int flags, Ptr<@Unsigned Integer> _hash_shift, Ptr<@Unsigned Integer> _hash_mask, @Unsigned long low_limit, @Unsigned long high_limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_loc_track(Ptr<misc.loc_track> t, @Unsigned long max, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_migration_target(Ptr<runtime.folio> src, @Unsigned long _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_misplaced_dst_folio(Ptr<runtime.folio> src, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MntDefinitions.mnt_namespace> alloc_mnt_ns(Ptr<UserDefinitions.user_namespace> user_ns, boolean anon) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_prog_pack> alloc_new_pack(@OriginalName(value="bpf_jit_fill_hole_t") Ptr<?> bpf_fill_ill_insns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PciDefinitions.pci_root_info> alloc_pci_root_info(int bus_min, int bus_max, int node2, int link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long alloc_shstk(@Unsigned long addr2, @Unsigned long size, @Unsigned long token_offset, boolean set_res_tok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_slab_obj_exts(Ptr<runtime.slab> slab2, Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfp, boolean new_slab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_swap_folio(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_synth_event((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<SynthDefinitions.synth_event> alloc_synth_event(String name, int n_fields, Ptr<Ptr<SynthDefinitions.synth_field>> fields) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_trace_fprobe((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<TraceDefinitions.trace_fprobe> alloc_trace_fprobe(String group, String event2, String symbol, Ptr<runtime.tracepoint> tpoint, Ptr<runtime.module> mod, int maxactive, int nargs, boolean is_return) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_trace_kprobe((const u8*)$arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<TraceDefinitions.trace_kprobe> alloc_trace_kprobe(String group, String event2, Ptr<?> addr2, String symbol, @Unsigned long offs, int maxactive, int nargs, boolean is_return) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_vfsmnt((const u8*)$arg1)")
    public static Ptr<runtime.mount> alloc_vfsmnt(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmapDefinitions.vmap_area> alloc_vmap_area(@Unsigned long size, @Unsigned long align, @Unsigned long vstart, @Unsigned long vend, int node2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned long va_flags, Ptr<VmDefinitions.vm_struct> vm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __alloc_bootmem_huge_page(Ptr<runtime.hstate> h, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kprobe> alloc_aggr_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FtraceDefinitions.ftrace_hash> alloc_and_copy_ftrace_hash(int size_bits, Ptr<FtraceDefinitions.ftrace_hash> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_and_dissolve_hugetlb_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> old_folio, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> alloc_anon_inode(Ptr<SuperDefinitions.super_block> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> alloc_buffer_head(@Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_chrdev_region($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int alloc_chrdev_region(Ptr<@Unsigned @OriginalName(value="dev_t") Integer> dev, @Unsigned int baseminor, @Unsigned int count, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_clk($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static Ptr<runtime.clk> alloc_clk(Ptr<ClkDefinitions.clk_core> core, String dev_id, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CpuDefinitions.cpu_rmap> alloc_cpu_rmap(@Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alloc_crs_csi2_swnodes(Ptr<misc.crs_csi2> csi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DaxDefinitions.dax_region> alloc_dax_region(Ptr<runtime.device> parent, int region_id, Ptr<runtime.range> range2, int target_node, @Unsigned int align, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_dev_dax_range(Ptr<DevDefinitions.dev_dax> dev_dax2, @Unsigned long start, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_empty_backing_file($arg1, (const struct cred*)$arg2)")
    public static Ptr<runtime.file> alloc_empty_backing_file(int flags, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_empty_file($arg1, (const struct cred*)$arg2)")
    public static Ptr<runtime.file> alloc_empty_file(int flags, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_empty_file_noaccount($arg1, (const struct cred*)$arg2)")
    public static Ptr<runtime.file> alloc_empty_file_noaccount(int flags, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> alloc_etherdev_mqs(int sizeof_priv, @Unsigned int txqs, @Unsigned int rxqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_file_clone($arg1, $arg2, (const struct file_operations*)$arg3)")
    public static Ptr<runtime.file> alloc_file_clone(Ptr<runtime.file> base, int flags, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_file_pseudo($arg1, $arg2, (const u8*)$arg3, $arg4, (const struct file_operations*)$arg5)")
    public static Ptr<runtime.file> alloc_file_pseudo(Ptr<runtime.inode> inode2, Ptr<runtime.vfsmount> mnt, String name, int flags, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_file_pseudo_noaccount($arg1, $arg2, (const u8*)$arg3, $arg4, (const struct file_operations*)$arg5)")
    public static Ptr<runtime.file> alloc_file_pseudo_noaccount(Ptr<runtime.inode> inode2, Ptr<runtime.vfsmount> mnt, String name, int flags, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ext4Definitions.ext4_new_flex_group_data> alloc_flex_gd(@Unsigned int flexbg_size, @Unsigned @OriginalName(value="ext4_group_t") int o_group, @Unsigned @OriginalName(value="ext4_group_t") int n_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_free_mem_region($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<runtime.resource> alloc_free_mem_region(Ptr<runtime.resource> base, @Unsigned long size, @Unsigned long align, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_fresh_hugetlb_folio(Ptr<runtime.hstate> h, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int nid, Ptr<misc.nodemask_t> nmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FsDefinitions.fs_context> alloc_fs_context(Ptr<FileDefinitions.file_system_type> fs_type, Ptr<runtime.dentry> reference, @Unsigned int sb_flags, @Unsigned int sb_flags_mask, FsDefinitions.fs_context_purpose purpose) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FtraceDefinitions.ftrace_hash> alloc_ftrace_hash(int size_bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HtabDefinitions.htab_elem> alloc_htab_elem(Ptr<BpfDefinitions.bpf_htab> htab, Ptr<?> key2, Ptr<?> value, @Unsigned int key_size, @Unsigned int hash2, boolean percpu, boolean onallcpus, Ptr<HtabDefinitions.htab_elem> old_elem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_hugetlb_folio(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, int avoid_reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_hugetlb_folio_nodemask(Ptr<runtime.hstate> h, int preferred_nid, Ptr<misc.nodemask_t> nmask, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, boolean allow_alloc_fallback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_hugetlb_folio_reserve(Ptr<runtime.hstate> h, int preferred_nid, Ptr<misc.nodemask_t> nmask, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> alloc_insn_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> alloc_low_pages(@Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_migrate_folio(Ptr<runtime.folio> src, @Unsigned long _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MntDefinitions.mnt_idmap> alloc_mnt_idmap(Ptr<UserDefinitions.user_namespace> mnt_userns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alloc_node_data(int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alloc_offline_node_data(int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> alloc_optinsn_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> alloc_p2m_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> alloc_p2m_pmd(@Unsigned long addr2, Ptr<PteDefinitions.pte_t> pte_pg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> alloc_page_buffers(Ptr<runtime.page> page2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> alloc_pgt_page(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PageDefinitions.page_list> alloc_pl(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_pmd_page(Ptr<PudDefinitions.pud_t> pud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_pool_huge_folio(Ptr<runtime.hstate> h, Ptr<misc.nodemask_t> nodes_allowed, Ptr<misc.nodemask_t> node_alloc_noretry, Ptr<Integer> next_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_pte_page(Ptr<PmdDefinitions.pmd_t> pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask>> alloc_sched_domains(@Unsigned int ndoms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_surplus_hugetlb_folio(Ptr<runtime.hstate> h, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int nid, Ptr<misc.nodemask_t> nmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_swap_slot_cache(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long alloc_swapdev_block(int swap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_thread_stack_node(Ptr<TaskDefinitions.task_struct> tsk, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_trace_uprobe((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<TraceDefinitions.trace_uprobe> alloc_trace_uprobe(String group, String event2, int nargs, boolean is_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_uevent_skb($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static Ptr<SkDefinitions.sk_buff> alloc_uevent_skb(Ptr<KobjDefinitions.kobj_uevent_env> env, String action_string, String devpath) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UserDefinitions.user_struct> alloc_uid(misc.kuid_t uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __alloc_and_insert_iova_range(Ptr<IovaDefinitions.iova_domain> iovad, @Unsigned long size, @Unsigned long limit_pfn, Ptr<runtime.iova> _new, boolean size_aligned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__alloc_bucket_spinlocks($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, $arg7)")
    public static int __alloc_bucket_spinlocks(Ptr<Ptr< @OriginalName(value="spinlock_t") runtime.spinlock>> locks, Ptr<@Unsigned Integer> locks_mask, @Unsigned long max_size, @Unsigned int cpu_mult, @Unsigned @OriginalName(value="gfp_t") int gfp, String name, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __alloc_skb(@Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<LinuxDefinitions.linux_binprm> alloc_bprm(int fd2, Ptr<runtime.filename> filename2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alloc_bulk(Ptr<BpfDefinitions.bpf_mem_cache> c, int cnt, int node2, boolean atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_callchain_buffers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_charge_folio(Ptr<Ptr<runtime.folio>> foliop, Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.collapse_control> cc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_conv_table(int num_elem, Ptr<Ptr<@Unsigned Short>> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_desc($arg1, $arg2, $arg3, (const struct cpumask*)$arg4, $arg5)")
    public static Ptr<IrqDefinitions.irq_desc> alloc_desc(int irq, int node2, @Unsigned int flags, Ptr<runtime.cpumask> affinity, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_descs($arg1, $arg2, $arg3, (const struct irq_affinity_desc*)$arg4, $arg5)")
    public static int alloc_descs(@Unsigned int start, @Unsigned int cnt, int node2, Ptr<IrqDefinitions.irq_affinity_desc> affinity, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.mapped_device> alloc_dev(int minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_fd(@Unsigned int start, @Unsigned int end, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> alloc_fddidev(int sizeof_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.fdtable> alloc_fdtable(@Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_fw_cache_entry((const u8*)$arg1)")
    public static Ptr<FwDefinitions.fw_cache_entry> alloc_fw_cache_entry(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alloc_genport_target(@Unsigned int mem_pxm, Ptr<Character> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmDefinitions.dm_io> alloc_io(Ptr<misc.mapped_device> md, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_iommu_pmu(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.iova> alloc_iova(Ptr<IovaDefinitions.iova_domain> iovad, @Unsigned long size, @Unsigned long limit_pfn, boolean size_aligned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long alloc_iova_fast(Ptr<IovaDefinitions.iova_domain> iovad, @Unsigned long size, @Unsigned long limit_pfn, boolean flush_rcache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ldt_struct> alloc_ldt_struct(@Unsigned int num_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_lookup_fw_priv((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int alloc_lookup_fw_priv(String fw_name, Ptr<FirmwareDefinitions.firmware_cache> fwc, Ptr<Ptr<FwDefinitions.fw_priv>> fw_priv2, Ptr<?> dbuf, @Unsigned long size, @Unsigned long offset, @Unsigned int opt_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemoryDefinitions.memory_dev_type> alloc_memory_type(int adistance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> alloc_migration_target_by_mpol(Ptr<runtime.folio> src, @Unsigned long _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void alloc_multiple_bios(Ptr<BioDefinitions.bio_list> blist, Ptr<misc.clone_info> ci, Ptr<DmDefinitions.dm_target> ti, @Unsigned int num_bios, Ptr<@Unsigned Integer> len, @Unsigned @OriginalName(value="gfp_t") int gfp_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> alloc_netdev_dummy(int sizeof_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_netdev_mqs($arg1, (const u8*)$arg2, $arg3, (void (*)(struct net_device*))$arg4, $arg5, $arg6)")
    public static Ptr<NetDefinitions.net_device> alloc_netdev_mqs(int sizeof_priv, String name, char name_assign_type, Ptr<?> setup, @Unsigned int txqs, @Unsigned int rxqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_ns((const u8*)$arg1, (const u8*)$arg2)")
    public static Ptr<AaDefinitions.aa_ns> alloc_ns(String prefix, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NvdimmDefinitions.nvdimm_map> alloc_nvdimm_map(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long alloc_pages_bulk_array_mempolicy_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long nr_pages, Ptr<Ptr<runtime.page>> page_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long alloc_pages_bulk_array_weighted_interleave(@Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<runtime.mempolicy> pol, @Unsigned long nr_pages, Ptr<Ptr<runtime.page>> page_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> alloc_pages_mpol_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned int order, Ptr<runtime.mempolicy> pol, @Unsigned long ilx, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> alloc_pages_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AmdDefinitions.amd_iommu_pci_seg> alloc_pci_segment(@Unsigned short id, Ptr<AcpiDefinitions.acpi_table_header> ivrs_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> alloc_pid(Ptr<PidDefinitions.pid_namespace> ns, Ptr<@OriginalName(value="pid_t") Integer> set_tid, @Unsigned long set_tid_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_rmid(@Unsigned int closid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_shrinker_info(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_msg> alloc_sk_msg(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> alloc_skb_for_msg(Ptr<SkDefinitions.sk_buff> first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> alloc_skb_with_frags(@Unsigned long header_len, @Unsigned long data_len, int order, Ptr<Integer> errcode, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long alloc_sleep_millisecs_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_sleep_millisecs_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long alloc_sleep_millisecs_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemoryDefinitions.memory_target> alloc_target(@Unsigned int mem_pxm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> alloc_tio(Ptr<misc.clone_info> ci, Ptr<DmDefinitions.dm_target> ti, @Unsigned int target_bio_nr, Ptr<@Unsigned Integer> len, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cpuset> alloc_trial_cpuset(Ptr<runtime.cpuset> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TtyDefinitions.tty_struct> alloc_tty_struct(Ptr<TtyDefinitions.tty_driver> driver, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ucounts> alloc_ucounts(Ptr<UserDefinitions.user_namespace> ns, misc.kuid_t uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_unconfined((const u8*)$arg1)")
    public static Ptr<AaDefinitions.aa_profile> alloc_unconfined(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.uprobe> alloc_uprobe(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long ref_ctr_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __alloc_contig_migrate_range(Ptr<misc.compact_control> cc, @Unsigned long start, @Unsigned long end, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__alloc_pages_direct_compact($arg1, $arg2, $arg3, (const struct alloc_context*)$arg4, $arg5, $arg6)")
    public static Ptr<runtime.page> __alloc_pages_direct_compact(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order, @Unsigned int alloc_flags, Ptr<alloc_context> ac, misc.compact_priority prio, Ptr<misc.compact_result> compact_result2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__alloc_pages_may_oom($arg1, $arg2, (const struct alloc_context*)$arg3, $arg4)")
    public static Ptr<runtime.page> __alloc_pages_may_oom(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order, Ptr<alloc_context> ac, Ptr<@Unsigned Long> did_some_progress) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> __alloc_pages_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned int order, int preferred_nid, Ptr<misc.nodemask_t> nodemask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> __alloc_pages_slowpath(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order, Ptr<alloc_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__alloc_workqueue((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<WorkqueueDefinitions.workqueue_struct> __alloc_workqueue(String fmt, @Unsigned int flags, int max_active, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_and_link_pwqs(Ptr<WorkqueueDefinitions.workqueue_struct> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PortDefinitions.port_buffer> alloc_buf(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned long buf_size, int pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AuditDefinitions.audit_chunk> alloc_chunk(int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_clustermask(@Unsigned int cpu2, @Unsigned int cluster, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> alloc_contig_pages_noprof(@Unsigned long nr_pages, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int nid, Ptr<misc.nodemask_t> nodemask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_contig_range_noprof(@Unsigned long start, @Unsigned long end, @Unsigned int migratetype2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_dax($arg1, (const struct dax_operations*)$arg2)")
    public static Ptr<DaxDefinitions.dax_device> alloc_dax(Ptr<?> _private, Ptr<DaxDefinitions.dax_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FuseDefinitions.fuse_dax_mapping> alloc_dax_mapping(Ptr<FuseDefinitions.fuse_conn_dax> fcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ScxDefinitions.scx_exit_info> alloc_exit_info(@Unsigned long exit_dump_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> alloc_fcdev(int sizeof_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> alloc_image_page(@Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_irte(Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<runtime.irq_2_iommu> irq_iommu, @Unsigned short count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_nodes_groups($arg1, $arg2, (const struct cpumask*)$arg3, (const struct {\n  long unsigned int bits[16];\n})$arg4, $arg5, $arg6)")
    public static void alloc_nodes_groups(@Unsigned int numgrps, Ptr<@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask>> node_to_cpumask, Ptr<runtime.cpumask> cpu_mask, misc.nodemask_t nodemsk, Ptr<runtime.cpumask> nmsk, Ptr<NodeDefinitions.node_groups> node_groups2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long alloc_pages_bulk_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, int preferred_nid, Ptr<misc.nodemask_t> nodemask, int nr_pages, Ptr<ListDefinitions.list_head> page_list2, Ptr<Ptr<runtime.page>> page_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> alloc_pages_exact_nid_noprof(int nid, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> alloc_pages_exact_noprof(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_event_context> alloc_perf_context(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PipeDefinitions.pipe_inode_info> alloc_pipe_info() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int alloc_rt_sched_group(Ptr<TaskDefinitions.task_group> tg, Ptr<TaskDefinitions.task_group> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<KsmDefinitions.ksm_stable_node> alloc_stable_node_chain(Ptr<KsmDefinitions.ksm_stable_node> dup3, Ptr<RbDefinitions.rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SuperDefinitions.super_block> alloc_super(Ptr<FileDefinitions.file_system_type> type2, int flags, Ptr<UserDefinitions.user_namespace> user_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SwapDefinitions.swap_info_struct> alloc_swap_info() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int alloc_swap_scan_cluster(Ptr<SwapDefinitions.swap_info_struct> si, @Unsigned long offset, Ptr<@Unsigned Integer> foundp, @Unsigned int order, char usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_tree((const u8*)$arg1)")
    public static Ptr<AuditDefinitions.audit_tree> alloc_tree(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_unbound_pwq($arg1, (const struct workqueue_attrs*)$arg2)")
    public static Ptr<misc.pool_workqueue> alloc_unbound_pwq(Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<WorkqueueDefinitions.workqueue_attrs> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.worker> alloc_worker(int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="alloc_workqueue((const u8*)$arg1, $arg2, $arg3, $arg4_)")
    public static Ptr<WorkqueueDefinitions.workqueue_struct> alloc_workqueue(String fmt, @Unsigned int flags, int max_active, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<WorkqueueDefinitions.workqueue_attrs> alloc_workqueue_attrs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.zspage> alloc_zspage(Ptr<ZsDefinitions.zs_pool> pool, Ptr<misc.size_class> _class2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct codetag")
    @NotUsableInJava
    public static class codetag
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int lineno;
        public String modname;
        public String function;
        public String filename;
    }

    @Type(noCCodeGeneration=true, cType="enum alloc_loc")
    public static enum alloc_loc implements Enum<alloc_loc>,
    TypedEnum<alloc_loc, Integer>
    {
        ALLOC_ERR,
        ALLOC_BEFORE,
        ALLOC_MID,
        ALLOC_AFTER;

    }

    @Type(noCCodeGeneration=true, cType="struct alloc_context")
    @NotUsableInJava
    public static class alloc_context
    extends Struct {
        public Ptr<runtime.zonelist> zonelist;
        public Ptr<misc.nodemask_t> nodemask;
        public Ptr<runtime.zoneref> preferred_zoneref;
        public int migratetype;
        public ZoneDefinitions.zone_type highest_zoneidx;
        public boolean spread_dirty_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct alloc_tag")
    @NotUsableInJava
    public static class alloc_tag
    extends Struct {
        public codetag ct;
        public Ptr<alloc_tag_counters> counters;
    }

    @Type(noCCodeGeneration=true, cType="struct alloc_tag_counters")
    @NotUsableInJava
    public static class alloc_tag_counters
    extends Struct {
        public @Unsigned long bytes;
        public @Unsigned long calls;
    }
}

