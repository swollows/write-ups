/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.ZapDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HugetlbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__hugetlb_vmemmap_optimize_folio((const struct hstate*)$arg1, $arg2, $arg3, $arg4)")
    public static int __hugetlb_vmemmap_optimize_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2, Ptr<ListDefinitions.list_head> vmemmap_pages, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hugetlb_vmemmap_restore_folio((const struct hstate*)$arg1, $arg2, $arg3)")
    public static int __hugetlb_vmemmap_restore_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_vmemmap_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_vmemmap_optimize_folio((const struct hstate*)$arg1, $arg2)")
    public static void hugetlb_vmemmap_optimize_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vmemmap_optimize_folios(Ptr<runtime.hstate> h, Ptr<ListDefinitions.list_head> folio_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_vmemmap_restore_folio((const struct hstate*)$arg1, $arg2)")
    public static int hugetlb_vmemmap_restore_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_vmemmap_restore_folios((const struct hstate*)$arg1, $arg2, $arg3)")
    public static long hugetlb_vmemmap_restore_folios(Ptr<runtime.hstate> h, Ptr<ListDefinitions.list_head> folio_list, Ptr<ListDefinitions.list_head> non_hvo_folios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hugetlb_zap_begin(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<@Unsigned Long> start, Ptr<@Unsigned Long> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hugetlb_zap_end(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<ZapDefinitions.zap_details> details) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_acct_memory(Ptr<runtime.hstate> h, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_add_hstate(@Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_add_to_page_cache(Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping, @Unsigned long idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long hugetlb_change_protection(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @Unsigned long end,  @OriginalName(value="pgprot_t") runtime.pgprot newprot, @Unsigned long cp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_dup_vma_private(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int hugetlb_fault(Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int hugetlb_fault_mutex_hash(Ptr<misc.address_space> mapping, @Unsigned long idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_fix_reserve_counts(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_folio_init_tail_vmemmap(Ptr<runtime.folio> folio2, @Unsigned long start_page_number, @Unsigned long end_page_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.address_space> hugetlb_folio_mapping_lock_write(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_hstate_alloc_pages(Ptr<runtime.hstate> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hugetlb_mask_last_page(Ptr<runtime.hstate> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_mempolicy_sysctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int hugetlb_mempolicy_sysctl_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_mfill_atomic_pte(Ptr<PteDefinitions.pte_t> dst_pte, Ptr<VmDefinitions.vm_area_struct> dst_vma, @Unsigned long dst_addr, @Unsigned long src_addr, @Unsigned @OriginalName(value="uffd_flags_t") int flags, Ptr<Ptr<runtime.folio>> foliop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int hugetlb_no_page(Ptr<misc.address_space> mapping, Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hugetlb_node_alloc_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_overcommit_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int hugetlb_overcommit_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_pages_alloc_boot_node(@Unsigned long start, @Unsigned long end, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_register_node(Ptr<runtime.node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_report_meminfo(Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_report_node_meminfo(String buf, int len, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_report_usage(Ptr<SeqDefinitions.seq_file> m, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hugetlb_reserve_pages(Ptr<runtime.inode> inode2, long from, long to, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_show_meminfo_node(int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_sysctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int hugetlb_sysctl_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_sysctl_handler_common($arg1, (const struct ctl_table*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int hugetlb_sysctl_handler_common(boolean obey_mempolicy, Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_sysfs_add_hstate($arg1, $arg2, $arg3, (const struct attribute_group*)$arg4)")
    public static int hugetlb_sysfs_add_hstate(Ptr<runtime.hstate> h, Ptr<runtime.kobject> parent, Ptr<Ptr<runtime.kobject>> hstate_kobjs, Ptr<AttributeDefinitions.attribute_group> hstate_attr_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hugetlb_total_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_try_dup_anon_rmap(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_unregister_node(Ptr<runtime.node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long hugetlb_unreserve_pages(Ptr<runtime.inode> inode2, long start, long end, long freed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_unshare_all_pmds(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_unshare_pmds(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vm_op_close(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int hugetlb_vm_op_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vm_op_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hugetlb_vm_op_pagesize(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_vm_op_split(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vma_assert_locked(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vma_lock_alloc(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vma_lock_free(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vma_lock_read(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vma_lock_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vma_lock_write(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_vma_trylock_write(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vma_unlock_read(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vma_unlock_write(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int hugetlb_wp(Ptr<runtime.folio> pagecache_folio, Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hugetlb_cgroup_charge_cgroup(int idx, @Unsigned long nr_pages, Ptr<Ptr<hugetlb_cgroup>> ptr, boolean rsvd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hugetlb_cgroup_uncharge_folio(int idx, @Unsigned long nr_pages, Ptr<runtime.folio> folio2, boolean rsvd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_add_anon_rmap(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @OriginalName(value="rmap_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_add_new_anon_rmap(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_cfttypes_init(Ptr<runtime.hstate> h, Ptr<runtime.cftype> cft, Ptr<runtime.cftype> tmpl, int tmpl_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_cgroup_charge_cgroup(int idx, @Unsigned long nr_pages, Ptr<Ptr<hugetlb_cgroup>> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_cgroup_charge_cgroup_rsvd(int idx, @Unsigned long nr_pages, Ptr<Ptr<hugetlb_cgroup>> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_commit_charge(int idx, @Unsigned long nr_pages, Ptr<hugetlb_cgroup> h_cg, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_commit_charge_rsvd(int idx, @Unsigned long nr_pages, Ptr<hugetlb_cgroup> h_cg, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> hugetlb_cgroup_css_alloc(Ptr<CgroupDefinitions.cgroup_subsys_state> parent_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_css_free(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_css_offline(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_file_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_free(Ptr<hugetlb_cgroup> h_cgroup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_migrate(Ptr<runtime.folio> old_folio, Ptr<runtime.folio> new_folio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_cgroup_read_numa_stat(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hugetlb_cgroup_read_u64(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_cgroup_read_u64_max(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hugetlb_cgroup_reset(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_uncharge_cgroup(int idx, @Unsigned long nr_pages, Ptr<hugetlb_cgroup> h_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_uncharge_cgroup_rsvd(int idx, @Unsigned long nr_pages, Ptr<hugetlb_cgroup> h_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_uncharge_counter(Ptr<misc.resv_map> resv, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_uncharge_file_region(Ptr<misc.resv_map> resv, Ptr<FileDefinitions.file_region> rg, @Unsigned long nr_pages, boolean region_del) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_uncharge_folio(int idx, @Unsigned long nr_pages, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_cgroup_uncharge_folio_rsvd(int idx, @Unsigned long nr_pages, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hugetlb_cgroup_write_dfl(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hugetlb_cgroup_write_legacy(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_events_local_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hugetlb_events_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hugetlb_file_setup((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<runtime.file> hugetlb_file_setup(String name, @Unsigned long size, @Unsigned @OriginalName(value="vm_flags_t") long acctflag, int creat_flags, int page_size_log) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hugetlb_get_unmapped_area(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_unmap_file_folio(Ptr<runtime.hstate> h, Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hugetlb_vma_maps_page(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hugetlb_vmdelete_list(Ptr<RbDefinitions.rb_root_cached> root, @Unsigned long start, @Unsigned long end, @Unsigned @OriginalName(value="zap_flags_t") int zap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum hugetlb_param")
    public static enum hugetlb_param implements Enum<hugetlb_param>,
    TypedEnum<hugetlb_param, Integer>
    {
        Opt_gid,
        Opt_min_size,
        Opt_mode,
        Opt_nr_inodes,
        Opt_pagesize,
        Opt_size,
        Opt_uid;

    }

    @Type(noCCodeGeneration=true, cType="struct hugetlb_cgroup")
    @NotUsableInJava
    public static class hugetlb_cgroup
    extends Struct {
        public CgroupDefinitions.cgroup_subsys_state css;
        public PageDefinitions.page_counter @Size(value=2) [] hugepage;
        public PageDefinitions.page_counter @Size(value=2) [] rsvd_hugepage;
        public  @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=2) [] events;
        public  @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=2) [] events_local;
        public CgroupDefinitions.cgroup_file @Size(value=2) [] events_file;
        public CgroupDefinitions.cgroup_file @Size(value=2) [] events_local_file;
        public Ptr<hugetlb_cgroup_per_node> @Size(value=0) [] nodeinfo;
    }

    @Type(noCCodeGeneration=true, cType="struct hugetlb_cgroup_per_node")
    @NotUsableInJava
    public static class hugetlb_cgroup_per_node
    extends Struct {
        public @Unsigned long @Size(value=2) [] usage;
    }

    @Type(noCCodeGeneration=true, cType="enum hugetlb_memory_event")
    public static enum hugetlb_memory_event implements Enum<hugetlb_memory_event>,
    TypedEnum<hugetlb_memory_event, Integer>
    {
        HUGETLB_MAX,
        HUGETLB_NR_MEMORY_EVENTS;

    }

    @Type(noCCodeGeneration=true, cType="struct hugetlb_vma_lock")
    @NotUsableInJava
    public static class hugetlb_vma_lock
    extends Struct {
        public runtime.kref refs;
        public misc.rw_semaphore rw_sema;
        public Ptr<VmDefinitions.vm_area_struct> vma;
    }

    @Type(noCCodeGeneration=true, cType="enum hugetlb_page_flags")
    public static enum hugetlb_page_flags implements Enum<hugetlb_page_flags>,
    TypedEnum<hugetlb_page_flags, Integer>
    {
        HPG_restore_reserve,
        HPG_migratable,
        HPG_temporary,
        HPG_freed,
        HPG_vmemmap_optimized,
        HPG_raw_hwp_unreliable,
        __NR_HPAGEFLAGS;

    }
}

