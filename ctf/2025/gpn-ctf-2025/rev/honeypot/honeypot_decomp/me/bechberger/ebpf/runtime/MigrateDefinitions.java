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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PagesDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MigrateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __migrate_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> dst, Ptr<runtime.folio> src, Ptr<?> src_private, migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> dst, Ptr<runtime.folio> src, migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_folio_done(Ptr<runtime.folio> src, migrate_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_folio_undo_src(Ptr<runtime.folio> src, int page_was_mapped, Ptr<AnonDefinitions.anon_vma> anon_vma2, boolean locked, Ptr<ListDefinitions.list_head> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_folio_unmap(Ptr<?> get_new_folio, Ptr<?> put_new_folio, @Unsigned long _private, Ptr<runtime.folio> src, Ptr<Ptr<runtime.folio>> dstp, migrate_mode mode, migrate_reason reason, Ptr<ListDefinitions.list_head> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_huge_page_move_mapping(Ptr<misc.address_space> mapping, Ptr<runtime.folio> dst, Ptr<runtime.folio> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_hugetlbs(Ptr<ListDefinitions.list_head> from, Ptr<?> get_new_folio, Ptr<?> put_new_folio, @Unsigned long _private, migrate_mode mode, int reason, Ptr<migrate_pages_stats> stats, Ptr<ListDefinitions.list_head> ret_folios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_misplaced_folio(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_misplaced_folio_prepare(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_pages(Ptr<ListDefinitions.list_head> from, Ptr<?> get_new_folio, Ptr<?> put_new_folio, @Unsigned long _private, migrate_mode mode, int reason, Ptr<@Unsigned Integer> ret_succeeded) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_pages_batch(Ptr<ListDefinitions.list_head> from, Ptr<?> get_new_folio, Ptr<?> put_new_folio, @Unsigned long _private, migrate_mode mode, int reason, Ptr<ListDefinitions.list_head> ret_folios, Ptr<ListDefinitions.list_head> split_folios, Ptr<migrate_pages_stats> stats, int nr_pass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_pages_sync(Ptr<ListDefinitions.list_head> from, Ptr<?> get_new_folio, Ptr<?> put_new_folio, @Unsigned long _private, migrate_mode mode, int reason, Ptr<ListDefinitions.list_head> ret_folios, Ptr<ListDefinitions.list_head> split_folios, Ptr<migrate_pages_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_task_rq_fair(Ptr<TaskDefinitions.task_struct> p, int new_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __migrate_device_pages(Ptr<@Unsigned Long> src_pfns, Ptr<@Unsigned Long> dst_pfns, @Unsigned long npages, Ptr<migrate_vma> migrate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_device_coherent_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_device_finalize(Ptr<@Unsigned Long> src_pfns, Ptr<@Unsigned Long> dst_pfns, @Unsigned long npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_device_pages(Ptr<@Unsigned Long> src_pfns, Ptr<@Unsigned Long> dst_pfns, @Unsigned long npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_device_range(Ptr<@Unsigned Long> src_pfns, @Unsigned long start, @Unsigned long npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long migrate_device_unmap(Ptr<@Unsigned Long> src_pfns, @Unsigned long npages, Ptr<runtime.page> fault_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean migrate_one_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_to_reboot_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_vma_collect_hole(@Unsigned long start, @Unsigned long end, int depth, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_vma_collect_pmd(Ptr<PmdDefinitions.pmd_t> pmdp, @Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_vma_finalize(Ptr<migrate_vma> migrate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_vma_insert_page(Ptr<migrate_vma> migrate, @Unsigned long addr2, Ptr<runtime.page> page2, Ptr<@Unsigned Long> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_vma_pages(Ptr<migrate_vma> migrate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_vma_setup(Ptr<migrate_vma> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __migrate_swap_task(Ptr<TaskDefinitions.task_struct> p, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean migrate_folio_add(Ptr<runtime.folio> folio2, Ptr<ListDefinitions.list_head> foliolist, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_longterm_unpinnable_folios(Ptr<ListDefinitions.list_head> movable_folio_list, Ptr<PagesDefinitions.pages_or_folios> pofs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_swap(Ptr<TaskDefinitions.task_struct> cur, Ptr<TaskDefinitions.task_struct> p, int target_cpu, int curr_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_swap_stop(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int migrate_task_to(Ptr<TaskDefinitions.task_struct> p, int target_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long migrate_to_node(Ptr<MmDefinitions.mm_struct> mm, int source, int dest, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void migrate_task_rq_dl(Ptr<TaskDefinitions.task_struct> p, int new_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct migrate_struct")
    @NotUsableInJava
    public static class migrate_struct
    extends Struct {
        public @Unsigned @OriginalName(value="ext4_lblk_t") int first_block;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int last_block;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int curr_block;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long first_pblock;
        public @Unsigned @OriginalName(value="ext4_fsblk_t") long last_pblock;
    }

    @Type(noCCodeGeneration=true, cType="struct migrate_vma")
    @NotUsableInJava
    public static class migrate_vma
    extends Struct {
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public Ptr<@Unsigned Long> dst;
        public Ptr<@Unsigned Long> src;
        public @Unsigned long cpages;
        public @Unsigned long npages;
        public @Unsigned long start;
        public @Unsigned long end;
        public Ptr<?> pgmap_owner;
        public @Unsigned long flags;
        public Ptr<runtime.page> fault_page;
    }

    @Type(noCCodeGeneration=true, cType="enum migrate_vma_direction")
    public static enum migrate_vma_direction implements Enum<migrate_vma_direction>,
    TypedEnum<migrate_vma_direction, Integer>
    {
        MIGRATE_VMA_SELECT_SYSTEM,
        MIGRATE_VMA_SELECT_DEVICE_PRIVATE,
        MIGRATE_VMA_SELECT_DEVICE_COHERENT;

    }

    @Type(noCCodeGeneration=true, cType="struct migrate_pages_stats")
    @NotUsableInJava
    public static class migrate_pages_stats
    extends Struct {
        public int nr_succeeded;
        public int nr_failed_pages;
        public int nr_thp_succeeded;
        public int nr_thp_failed;
        public int nr_thp_split;
        public int nr_split;
    }

    @Type(noCCodeGeneration=true, cType="enum migrate_reason")
    public static enum migrate_reason implements Enum<migrate_reason>,
    TypedEnum<migrate_reason, Integer>
    {
        MR_COMPACTION,
        MR_MEMORY_FAILURE,
        MR_MEMORY_HOTPLUG,
        MR_SYSCALL,
        MR_MEMPOLICY_MBIND,
        MR_NUMA_MISPLACED,
        MR_CONTIG_RANGE,
        MR_LONGTERM_PIN,
        MR_DEMOTION,
        MR_DAMON,
        MR_TYPES;

    }

    @Type(noCCodeGeneration=true, cType="enum migrate_mode")
    public static enum migrate_mode implements Enum<migrate_mode>,
    TypedEnum<migrate_mode, Integer>
    {
        MIGRATE_ASYNC,
        MIGRATE_SYNC_LIGHT,
        MIGRATE_SYNC;

    }
}

