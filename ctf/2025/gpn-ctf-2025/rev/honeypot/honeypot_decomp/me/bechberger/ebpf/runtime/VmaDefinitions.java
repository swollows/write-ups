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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VmaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vma_is_anon_shmem(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vma_is_shmem(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_pgtable_walk_begin(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_pgtable_walk_end(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __vma_private_lock(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __vma_reservation_common(Ptr<runtime.hstate> h, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, vma_resv_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_complete(Ptr<vma_prepare> vp, Ptr<vma_iterator> vmi, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vma_dump_size(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long mm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vma_expand(Ptr<vma_merge_struct> vmg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vma_has_reserves(Ptr<VmDefinitions.vm_area_struct> vma, long chg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vma_is_secretmem(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vma_kernel_pagesize(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vma_link(Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_link_file(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_merge_existing_range(Ptr<vma_merge_struct> vmg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_merge_extend(Ptr<vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_merge_new_range(Ptr<vma_merge_struct> vmg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vma_mmu_pagesize(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_modify(Ptr<vma_merge_struct> vmg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_modify_flags(Ptr<vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> prev, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, @Unsigned long new_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_modify_flags_name(Ptr<vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> prev, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, @Unsigned long new_flags, Ptr<AnonDefinitions.anon_vma_name> new_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_modify_flags_uffd(Ptr<vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> prev, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, @Unsigned long new_flags, VmDefinitions.vm_userfaultfd_ctx new_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_modify_policy(Ptr<vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> prev, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, Ptr<runtime.mempolicy> new_pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vma_needs_dirty_tracking(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vma_ra_enabled_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vma_ra_enabled_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long vma_ra_enabled_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vma_shrink(Ptr<vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, @Unsigned long pgoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vma_wants_writenotify(Ptr<VmDefinitions.vm_area_struct> vma,  @OriginalName(value="pgprot_t") runtime.pgprot vm_page_prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> vma_alloc_folio_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, int order, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, boolean hugepage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vma_dup_policy(Ptr<VmDefinitions.vm_area_struct> src, Ptr<VmDefinitions.vm_area_struct> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vma_is_special_mapping((const struct vm_area_struct*)$arg1, (const struct vm_special_mapping*)$arg2)")
    public static boolean vma_is_special_mapping(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<VmDefinitions.vm_special_mapping> sm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vma_migratable(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vma_node_allow(Ptr<DrmDefinitions.drm_vma_offset_node> node2, Ptr<DrmDefinitions.drm_file> tag, boolean ref_counted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vma_policy_mof(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_set_page_prot(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_adjust_trans_huge(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, long adjust_next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_interval_tree_augment_rotate(Ptr<RbDefinitions.rb_node> rb_old, Ptr<RbDefinitions.rb_node> rb_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_interval_tree_insert(Ptr<VmDefinitions.vm_area_struct> node2, Ptr<RbDefinitions.rb_root_cached> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_interval_tree_insert_after(Ptr<VmDefinitions.vm_area_struct> node2, Ptr<VmDefinitions.vm_area_struct> prev, Ptr<RbDefinitions.rb_root_cached> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_interval_tree_iter_first(Ptr<RbDefinitions.rb_root_cached> root, @Unsigned long start, @Unsigned long last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_interval_tree_iter_next(Ptr<VmDefinitions.vm_area_struct> node2, @Unsigned long start, @Unsigned long last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_interval_tree_remove(Ptr<VmDefinitions.vm_area_struct> node2, Ptr<RbDefinitions.rb_root_cached> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_interval_tree_subtree_search(Ptr<VmDefinitions.vm_area_struct> node2, @Unsigned long start, @Unsigned long last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vma_is_stack_for_current(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vma_set_file(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="gfp_t") int vma_thp_gfp_mask(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> vma_to_resize(@Unsigned long addr2, @Unsigned long old_len, @Unsigned long new_len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum vma_resv_mode")
    public static enum vma_resv_mode implements Enum<vma_resv_mode>,
    TypedEnum<vma_resv_mode, Integer>
    {
        VMA_NEEDS_RESV,
        VMA_COMMIT_RESV,
        VMA_END_RESV,
        VMA_ADD_RESV,
        VMA_DEL_RESV;

    }

    @Type(noCCodeGeneration=true, cType="struct vma_merge_struct")
    @NotUsableInJava
    public static class vma_merge_struct
    extends Struct {
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<vma_iterator> vmi;
        public @Unsigned long pgoff;
        public Ptr<VmDefinitions.vm_area_struct> prev;
        public Ptr<VmDefinitions.vm_area_struct> next;
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long flags;
        public Ptr<runtime.file> file;
        public Ptr<AnonDefinitions.anon_vma> anon_vma;
        public Ptr<runtime.mempolicy> policy;
        public VmDefinitions.vm_userfaultfd_ctx uffd_ctx;
        public Ptr<AnonDefinitions.anon_vma_name> anon_name;
        public vma_merge_flags merge_flags;
        public vma_merge_state state;
    }

    @Type(noCCodeGeneration=true, cType="enum vma_merge_flags")
    public static enum vma_merge_flags implements Enum<vma_merge_flags>,
    TypedEnum<vma_merge_flags, Integer>
    {
        VMG_FLAG_DEFAULT,
        VMG_FLAG_JUST_EXPAND;

    }

    @Type(noCCodeGeneration=true, cType="enum vma_merge_state")
    public static enum vma_merge_state implements Enum<vma_merge_state>,
    TypedEnum<vma_merge_state, Integer>
    {
        VMA_MERGE_START,
        VMA_MERGE_ERROR_NOMEM,
        VMA_MERGE_NOMERGE,
        VMA_MERGE_SUCCESS;

    }

    @Type(noCCodeGeneration=true, cType="struct vma_munmap_struct")
    @NotUsableInJava
    public static class vma_munmap_struct
    extends Struct {
        public Ptr<vma_iterator> vmi;
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public Ptr<VmDefinitions.vm_area_struct> prev;
        public Ptr<VmDefinitions.vm_area_struct> next;
        public Ptr<ListDefinitions.list_head> uf;
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long unmap_start;
        public @Unsigned long unmap_end;
        public int vma_count;
        public boolean unlock;
        public boolean clear_ptes;
        public @Unsigned long nr_pages;
        public @Unsigned long locked_vm;
        public @Unsigned long nr_accounted;
        public @Unsigned long exec_vm;
        public @Unsigned long stack_vm;
        public @Unsigned long data_vm;
    }

    @Type(noCCodeGeneration=true, cType="struct vma_prepare")
    @NotUsableInJava
    public static class vma_prepare
    extends Struct {
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public Ptr<VmDefinitions.vm_area_struct> adj_next;
        public Ptr<runtime.file> file;
        public Ptr<misc.address_space> mapping;
        public Ptr<AnonDefinitions.anon_vma> anon_vma;
        public Ptr<VmDefinitions.vm_area_struct> insert;
        public Ptr<VmDefinitions.vm_area_struct> remove;
        public Ptr<VmDefinitions.vm_area_struct> remove2;
    }

    @Type(noCCodeGeneration=true, cType="struct vma_list")
    @NotUsableInJava
    public static class vma_list
    extends Struct {
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public ListDefinitions.list_head head;
        public AtomicDefinitions.atomic_t mmap_count;
    }

    @Type(noCCodeGeneration=true, cType="struct vma_iterator")
    @NotUsableInJava
    public static class vma_iterator
    extends Struct {
        public misc.ma_state mas;
    }

    @Type(noCCodeGeneration=true, cType="struct vma_numab_state")
    @NotUsableInJava
    public static class vma_numab_state
    extends Struct {
        public @Unsigned long next_scan;
        public @Unsigned long pids_active_reset;
        public @Unsigned long @Size(value=2) [] pids_active;
        public int start_scan_seq;
        public int prev_scan_seq;
    }

    @Type(noCCodeGeneration=true, cType="struct vma_lock")
    @NotUsableInJava
    public static class vma_lock
    extends Struct {
        public misc.rw_semaphore lock;
    }
}

