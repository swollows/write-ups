/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FolioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __folio_free_raw_hwp(Ptr<runtime.folio> folio2, boolean move_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __folio_migrate_mapping(Ptr<misc.address_space> mapping, Ptr<runtime.folio> newfolio, Ptr<runtime.folio> folio2, int expected_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_clear_hugetlb_hwpoison(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long folio_free_raw_hwp(Ptr<runtime.folio> folio2, boolean move_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_invalidate(Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="folio_mapcount((const struct folio*)$arg1)")
    public static int folio_mapcount(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_migrate_flags(Ptr<runtime.folio> newfolio, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_migrate_mapping(Ptr<misc.address_space> mapping, Ptr<runtime.folio> newfolio, Ptr<runtime.folio> folio2, int extra_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> folio_prealloc(Ptr<MmDefinitions.mm_struct> src_mm, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, boolean need_zero) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_put(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="folio_size((const struct folio*)$arg1)")
    public static @Unsigned long folio_size(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_try_dup_anon_rmap_ptes(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, int nr_pages, Ptr<VmDefinitions.vm_area_struct> src_vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_zero_user(Ptr<runtime.folio> folio2, @Unsigned long addr_hint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> folio_alloc_buffers(Ptr<runtime.folio> folio2, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.swp_entry_t folio_alloc_swap(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> folio_create_buffers(Ptr<runtime.folio> folio2, Ptr<runtime.inode> inode2, @Unsigned int b_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_inc_gen(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2, boolean reclaiming) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long folio_init_buffers(Ptr<runtime.folio> folio2, Ptr<BlockDefinitions.block_device> bdev, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean folio_isolate_lru(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.lruvec> folio_lruvec_lock(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.lruvec> folio_lruvec_lock_irq(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.lruvec> folio_lruvec_lock_irqsave(Ptr<runtime.folio> folio2, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_putback_active_hugetlb(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_putback_lru(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_set_bh(Ptr<BufferDefinitions.buffer_head> bh, Ptr<runtime.folio> folio2, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_update_gen(Ptr<runtime.folio> folio2, int gen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> folio_walk_start(Ptr<folio_walk> fw, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @OriginalName(value="folio_walk_flags_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_zero_new_buffers(Ptr<runtime.folio> folio2, @Unsigned long from, @Unsigned long to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_cancel_dirty(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __folio_end_writeback(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_mark_dirty(Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping, int warn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_mod_stat(Ptr<runtime.folio> folio2, int nr, int nr_pmdmapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_start_writeback(Ptr<runtime.folio> folio2, boolean keep_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_account_cleaned(Ptr<runtime.folio> folio2, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_account_dirtied(Ptr<runtime.folio> folio2, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_anon_rmap_pmd(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @OriginalName(value="rmap_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_anon_rmap_ptes(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, int nr_pages, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @OriginalName(value="rmap_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_file_rmap_pmd(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_file_rmap_ptes(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, int nr_pages, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_new_anon_rmap(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @OriginalName(value="rmap_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_pin(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> folio_alloc_mpol_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned int order, Ptr<runtime.mempolicy> pol, @Unsigned long ilx, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> folio_alloc_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean folio_clear_dirty_for_io(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AnonDefinitions.anon_vma> folio_get_anon_vma(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AnonDefinitions.anon_vma> folio_lock_anon_vma_read(Ptr<runtime.folio> folio2, Ptr<misc.rmap_walk_control> rwc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean folio_mark_dirty(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_mkclean(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_move_anon_rmap(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_not_mapped(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean folio_redirty_for_writepage(Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_referenced(Ptr<runtime.folio> folio2, int is_locked, Ptr<MemDefinitions.mem_cgroup> memcg, Ptr<@Unsigned Long> vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean folio_referenced_one(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_remove_rmap_pmd(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_remove_rmap_ptes(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, int nr_pages, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean folio_use_access_time(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_wait_stable(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_wait_writeback(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_wait_writeback_killable(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_xchg_last_cpupid(Ptr<runtime.folio> folio2, int cpupid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> __folio_alloc_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned int order, int preferred_nid, Ptr<misc.nodemask_t> nodemask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_batch_add_and_move(Ptr<folio_batch> fbatch, Ptr<runtime.folio> folio2, @OriginalName(value="move_fn_t") Ptr<?> move_fn, boolean on_lru, boolean disable_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_batch_release(Ptr<folio_batch> fbatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_lock(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __folio_lock_killable(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int __folio_lock_or_retry(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_put(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __folio_swap_cache_index(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __folio_throttle_swaprate(Ptr<runtime.folio> folio2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __folio_unqueue_deferred_split(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_activate(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_lru(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_lru_vma(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_add_wait_queue(Ptr<runtime.folio> folio2, Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> waiter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AnonDefinitions.anon_vma> folio_anon_vma(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_batch_move_lru(Ptr<folio_batch> fbatch, @OriginalName(value="move_fn_t") Ptr<?> move_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_batch_remove_exceptionals(Ptr<folio_batch> fbatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_copy(Ptr<runtime.folio> dst, Ptr<runtime.folio> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_deactivate(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_end_private_2(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_end_read(Ptr<runtime.folio> folio2, boolean success) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_end_writeback(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean folio_free_swap(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.address_space> folio_mapping(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_mark_accessed(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_mark_lazyfree(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_mc_copy(Ptr<runtime.folio> dst, Ptr<runtime.folio> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_migrate_ksm(Ptr<runtime.folio> newfolio, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_rotate_reclaimable(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_try_dup_anon_rmap_pmd(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, Ptr<VmDefinitions.vm_area_struct> src_vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_unlock(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_wait_bit(Ptr<runtime.folio> folio2, int bit_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_wait_bit_common(Ptr<runtime.folio> folio2, int bit_nr, int state2, behavior behavior2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_wait_bit_killable(Ptr<runtime.folio> folio2, int bit_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_wait_private_2(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int folio_wait_private_2_killable(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void folio_wake_bit(Ptr<runtime.folio> folio2, int bit_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum behavior")
    public static enum behavior implements Enum<behavior>,
    TypedEnum<behavior, Integer>
    {
        EXCLUSIVE,
        SHARED,
        DROP;

    }

    @Type(noCCodeGeneration=true, cType="struct folio_referenced_arg")
    @NotUsableInJava
    public static class folio_referenced_arg
    extends Struct {
        public int mapcount;
        public int referenced;
        public @Unsigned long vm_flags;
        public Ptr<MemDefinitions.mem_cgroup> memcg;
    }

    @Type(noCCodeGeneration=true, cType="enum folio_references")
    public static enum folio_references implements Enum<folio_references>,
    TypedEnum<folio_references, Integer>
    {
        FOLIOREF_RECLAIM,
        FOLIOREF_RECLAIM_CLEAN,
        FOLIOREF_KEEP,
        FOLIOREF_ACTIVATE;

    }

    @Type(noCCodeGeneration=true, cType="struct folio_iter")
    @NotUsableInJava
    public static class folio_iter
    extends Struct {
        public Ptr<runtime.folio> folio;
        public @Unsigned long offset;
        public @Unsigned long length;
        public Ptr<runtime.folio> _next;
        public @Unsigned long _seg_count;
        public int _i;
    }

    @Type(noCCodeGeneration=true, cType="struct folio_walk")
    @NotUsableInJava
    public static class folio_walk
    extends Struct {
        public Ptr<runtime.page> page;
        public folio_walk_level level;
        @InlineUnion(value=9681)
        public @InlineUnion(value=9681) Ptr<PteDefinitions.pte_t> ptep;
        @InlineUnion(value=9681)
        public @InlineUnion(value=9681) Ptr<PudDefinitions.pud_t> pudp;
        @InlineUnion(value=9681)
        public @InlineUnion(value=9681) Ptr<PmdDefinitions.pmd_t> pmdp;
        @InlineUnion(value=9682)
        public @InlineUnion(value=9682) PteDefinitions.pte_t pte;
        @InlineUnion(value=9682)
        public @InlineUnion(value=9682) PudDefinitions.pud_t pud;
        @InlineUnion(value=9682)
        public  @InlineUnion(value=9682) PmdDefinitions.pmd_t pmd;
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public Ptr<@OriginalName(value="spinlock_t") runtime.spinlock> ptl;
    }

    @Type(noCCodeGeneration=true, cType="enum folio_walk_level")
    public static enum folio_walk_level implements Enum<folio_walk_level>,
    TypedEnum<folio_walk_level, Integer>
    {
        FW_LEVEL_PTE,
        FW_LEVEL_PMD,
        FW_LEVEL_PUD;

    }

    @Type(noCCodeGeneration=true, cType="struct folio_batch")
    @NotUsableInJava
    public static class folio_batch
    extends Struct {
        public char nr;
        public char i;
        public boolean percpu_pvec_drained;
        public Ptr<runtime.folio> @Size(value=31) [] folios;
    }

    @Type(noCCodeGeneration=true, cType="struct folio_queue")
    @NotUsableInJava
    public static class folio_queue
    extends Struct {
        public folio_batch vec;
        public char @Size(value=31) [] orders;
        public Ptr<folio_queue> next;
        public Ptr<folio_queue> prev;
        public @Unsigned long marks;
        public @Unsigned long marks2;
        public @Unsigned long marks3;
    }
}

