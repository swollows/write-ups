/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AllocDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ChargerDefinitions;
import me.bechberger.ebpf.runtime.DevfreqDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KsmDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.RtDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.VirtnetDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class TryDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_check_zero(Ptr<SrcuDefinitions.srcu_struct> ssp, int idx, int trycount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_memory_failure_hugetlb(@Unsigned long pfn, int flags, Ptr<Integer> hugetlb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_module_get(Ptr<runtime.module> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_one_irq(Ptr<IrqDefinitions.irq_desc> desc, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="try_to_force_load($arg1, (const u8*)$arg2)")
    public static int try_to_force_load(Ptr<runtime.module> mod, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void try_to_generate_entropy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_map_unused_to_zeropage(Ptr<PageDefinitions.page_vma_mapped_walk> pvmw, Ptr<runtime.folio> folio2, @Unsigned long idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="try_to_run_init_process((const u8*)$arg1)")
    public static int try_to_run_init_process(String init_filename) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_split_thp_page(Ptr<runtime.page> page2, boolean release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_take_rt_mutex(Ptr<RtDefinitions.rt_mutex_base> lock, Ptr<TaskDefinitions.task_struct> task2, Ptr<RtDefinitions.rt_mutex_waiter> waiter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __try_online_node(int nid, boolean set_node_online) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __try_to_del_timer_sync(Ptr<TimerDefinitions.timer_list> timer, boolean shutdown2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_charge_memcg(Ptr<MemDefinitions.mem_cgroup> memcg, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_enable_preferred_console(Ptr<runtime.console> newcon, boolean user_specified) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="try_lookup_one_len((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.dentry> try_lookup_one_len(String name, Ptr<runtime.dentry> base, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_offline_memory_block(Ptr<MemoryDefinitions.memory_block> mem, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void try_offline_node(int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_online_node(int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_remove_memory(@Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_reonline_memory_block(Ptr<MemoryDefinitions.memory_block> mem, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="try_to_compact_pages($arg1, $arg2, $arg3, (const struct alloc_context*)$arg4, $arg5, $arg6)")
    public static misc.compact_result try_to_compact_pages(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order, @Unsigned int alloc_flags, Ptr<AllocDefinitions.alloc_context> ac, misc.compact_priority prio, Ptr<Ptr<runtime.page>> capture) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_del_timer_sync(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_free_buffers(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long try_to_free_mem_cgroup_pages(Ptr<MemDefinitions.mem_cgroup> memcg, @Unsigned long nr_pages, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int reclaim_options, Ptr<Integer> swappiness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long try_to_free_pages(Ptr<runtime.zonelist> zonelist2, int order, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<misc.nodemask_t> nodemask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_inc_max_seq(Ptr<runtime.lruvec> lruvec2, @Unsigned long seq, boolean can_swap, boolean force_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_lock_encrypted_files(Ptr<SuperDefinitions.super_block> sb, Ptr<FscryptDefinitions.fscrypt_master_key> mk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_shrink_lruvec(Ptr<runtime.lruvec> lruvec2, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_unlazy(Ptr<runtime.nameidata> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_unlazy_next(Ptr<runtime.nameidata> nd, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_wait_for_completion(Ptr<runtime.completion> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_fill_recv(Ptr<VirtnetDefinitions.virtnet_info> vi, Ptr<misc.receive_queue> rq2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> try_get_folio(Ptr<runtime.page> page2, int refs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.uprobe> try_get_uprobe(Ptr<runtime.uprobe> uprobe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_grab_folio(Ptr<runtime.folio> folio2, int refs, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> try_grab_folio_fast(Ptr<runtime.page> page2, int refs, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="try_match_pkt_pointers((const struct bpf_insn*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static boolean try_match_pkt_pointers(Ptr<BpfDefinitions.bpf_insn> insn2, Ptr<BpfDefinitions.bpf_reg_state> dst_reg, Ptr<BpfDefinitions.bpf_reg_state> src_reg, Ptr<BpfDefinitions.bpf_verifier_state> this_branch, Ptr<BpfDefinitions.bpf_verifier_state> other_branch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> try_ram_remap(@Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_steal_cookie(int _this, int that) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_bring_up_aggregate_device(Ptr<misc.aggregate_device> adev, Ptr<runtime.component> component2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void try_to_migrate(Ptr<runtime.folio> folio2, misc.ttu_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_migrate_one(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_set_owner(Ptr<TaskDefinitions.task_struct> g, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void try_to_unmap(Ptr<runtime.folio> folio2, misc.ttu_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void try_to_unmap_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void try_to_unmap_flush_dirty() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean try_to_unmap_one(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_wake_up(Ptr<TaskDefinitions.task_struct> p, @Unsigned int state2, int wake_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void try_to_writeback_inodes_sb(Ptr<SuperDefinitions.super_block> sb, WbDefinitions.wb_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __try_to_reclaim_swap(Ptr<SwapDefinitions.swap_info_struct> si, @Unsigned long offset, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long try_accept_one(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned long len, misc.pg_level pg_level2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_charger_enable(Ptr<ChargerDefinitions.charger_manager> cm, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="try_then_request_governor((const u8*)$arg1)")
    public static Ptr<DevfreqDefinitions.devfreq_governor> try_then_request_governor(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_free_dmap_chunks(Ptr<FuseDefinitions.fuse_conn_dax> fcd, @Unsigned long nr_to_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_freeze_tasks(boolean user_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_grab_pending(Ptr<misc.work_struct> work, @Unsigned int cflags, Ptr<@Unsigned Long> irq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_merge_one_page(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.page> page2, Ptr<runtime.page> kpage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_merge_with_ksm_page(Ptr<KsmDefinitions.ksm_rmap_item> rmap_item, Ptr<runtime.page> page2, Ptr<runtime.page> kpage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_merge_with_zero_page(Ptr<KsmDefinitions.ksm_rmap_item> rmap_item, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int try_to_unuse(@Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

