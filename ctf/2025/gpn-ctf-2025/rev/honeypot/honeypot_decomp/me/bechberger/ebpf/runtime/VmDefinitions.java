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
import me.bechberger.ebpf.runtime.FaultDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.UserfaultfdDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VirtqueueDefinitions;
import me.bechberger.ebpf.runtime.VmaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int __vm_insert_mixed(Ptr<vm_area_struct> vma, @Unsigned long addr2, @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn, boolean mkwrite) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __vm_map_pages(Ptr<vm_area_struct> vma, Ptr<Ptr<runtime.page>> pages, @Unsigned long num, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _vm_unmap_aliases(@Unsigned long start, @Unsigned long end, int flush) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_area_add_early(Ptr<vm_struct> vm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_area_map_pages(Ptr<vm_struct> area, @Unsigned long start, @Unsigned long end, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_area_register_early(Ptr<vm_struct> vm, @Unsigned long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_area_unmap_pages(Ptr<vm_struct> area, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_get_page(Ptr<runtime.dpages> dp, Ptr<Ptr<runtime.page>> p, Ptr<@Unsigned Long> len, Ptr<@Unsigned Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_insert_page(Ptr<vm_area_struct> vma, @Unsigned long addr2, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_insert_pages(Ptr<vm_area_struct> vma, @Unsigned long addr2, Ptr<Ptr<runtime.page>> pages, Ptr<@Unsigned Long> num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_iomap_memory(Ptr<vm_area_struct> vma, @Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_map_pages(Ptr<vm_area_struct> vma, Ptr<Ptr<runtime.page>> pages, @Unsigned long num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_map_pages_zero(Ptr<vm_area_struct> vma, Ptr<Ptr<runtime.page>> pages, @Unsigned long num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vm_map_ram(Ptr<Ptr<runtime.page>> pages, @Unsigned int count, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vm_mixed_zeropage_allowed(Ptr<vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_next_page(Ptr<runtime.dpages> dp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> vm_normal_folio(Ptr<vm_area_struct> vma, @Unsigned long addr2, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> vm_normal_folio_pmd(Ptr<vm_area_struct> vma, @Unsigned long addr2, PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> vm_normal_page(Ptr<vm_area_struct> vma, @Unsigned long addr2, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> vm_normal_page_pmd(Ptr<vm_area_struct> vma, @Unsigned long addr2, PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_unmap_aliases() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vm_unmap_ram((const void*)$arg1, $arg2)")
    public static void vm_unmap_ram(Ptr<?> mem, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __vm_area_free(Ptr<vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vm_area_struct> vm_area_alloc(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vm_area_struct> vm_area_dup(Ptr<vm_area_struct> orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_area_free(Ptr<vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_area_free_rcu_cb(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)vm_bus_name($arg1))")
    public static String vm_bus_name(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vm_cmdline_get($arg1, (const struct kernel_param*)$arg2)")
    public static int vm_cmdline_get(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_cmdline_get_device(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vm_cmdline_set((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int vm_cmdline_set(String device2, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_del_vqs(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_finalize_features(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_find_vqs(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int nvqs, Ptr<Ptr<runtime.virtqueue>> vqs, Ptr<VirtqueueDefinitions.virtqueue_info> vqs_info, Ptr<IrqDefinitions.irq_affinity> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int vm_generation(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_get(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vm_get_features(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="pgprot_t") runtime.pgprot vm_get_page_prot(@Unsigned long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vm_get_shm_region(Ptr<VirtioDefinitions.virtio_device> vdev, Ptr<VirtioDefinitions.virtio_shm_region> region2, char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char vm_get_status(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn vm_interrupt(int irq, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vm_notify(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vm_notify_with_data(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_reset(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vm_set($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void vm_set(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int offset, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_set_status(Ptr<VirtioDefinitions.virtio_device> vdev, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vm_setup_vq($arg1, $arg2, (void (*)(struct virtqueue*))$arg3, (const u8*)$arg4, $arg5)")
    public static Ptr<runtime.virtqueue> vm_setup_vq(Ptr<VirtioDefinitions.virtio_device> vdev, @Unsigned int index2, Ptr<?> callback2, String name, boolean ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_synchronize_cbs(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_unregister_cmdline_device(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __vm_munmap(@Unsigned long start, @Unsigned long len, boolean unlock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_brk_flags(@Unsigned long addr2, @Unsigned long request2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_events_fold_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vm_munmap(@Unsigned long start, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vm_stat_account(Ptr<MmDefinitions.mm_struct> mm, @Unsigned @OriginalName(value="vm_flags_t") long flags, long npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vm_unmapped_area(Ptr<vm_unmapped_area_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __vm_enough_memory(Ptr<MmDefinitions.mm_struct> mm, long pages, int cap_sys_admin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vm_commit_limit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vm_memory_committed() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vm_mmap(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long prot, @Unsigned long flag, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vm_mmap_pgoff(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long prot, @Unsigned long flag, @Unsigned long pgoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum vm_stat_item")
    public static enum vm_stat_item implements Enum<vm_stat_item>,
    TypedEnum<vm_stat_item, Integer>
    {
        NR_DIRTY_THRESHOLD,
        NR_DIRTY_BG_THRESHOLD,
        NR_MEMMAP_PAGES,
        NR_MEMMAP_BOOT_PAGES,
        NR_VM_STAT_ITEMS;

    }

    @Type(noCCodeGeneration=true, cType="struct vm_stack")
    @NotUsableInJava
    public static class vm_stack
    extends Struct {
        public misc.callback_head rcu;
        public Ptr<vm_struct> stack_vm_area;
    }

    @Type(noCCodeGeneration=true, cType="struct vm_event_state")
    @NotUsableInJava
    public static class vm_event_state
    extends Struct {
        public @Unsigned long @Size(value=115) [] event;
    }

    @Type(noCCodeGeneration=true, cType="struct vm_unmapped_area_info")
    @NotUsableInJava
    public static class vm_unmapped_area_info
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned long length;
        public @Unsigned long low_limit;
        public @Unsigned long high_limit;
        public @Unsigned long align_mask;
        public @Unsigned long align_offset;
        public @Unsigned long start_gap;
    }

    @Type(noCCodeGeneration=true, cType="struct vm_struct")
    @NotUsableInJava
    public static class vm_struct
    extends Struct {
        public Ptr<vm_struct> next;
        public Ptr<?> addr;
        public @Unsigned long size;
        public @Unsigned long flags;
        public Ptr<Ptr<runtime.page>> pages;
        public @Unsigned int page_order;
        public @Unsigned int nr_pages;
        public @Unsigned @OriginalName(value="phys_addr_t") long phys_addr;
        public Ptr<?> caller;
    }

    @Type(noCCodeGeneration=true, cType="struct vm_special_mapping")
    @NotUsableInJava
    public static class vm_special_mapping
    extends Struct {
        public String name;
        public Ptr<Ptr<runtime.page>> pages;
        public Ptr<?> fault;
        public Ptr<?> mremap;
        public Ptr<?> close;
    }

    @Type(noCCodeGeneration=true, cType="enum vm_fault_reason")
    public static enum vm_fault_reason implements Enum<vm_fault_reason>,
    TypedEnum<vm_fault_reason, Integer>
    {
        VM_FAULT_OOM,
        VM_FAULT_SIGBUS,
        VM_FAULT_MAJOR,
        VM_FAULT_HWPOISON,
        VM_FAULT_HWPOISON_LARGE,
        VM_FAULT_SIGSEGV,
        VM_FAULT_NOPAGE,
        VM_FAULT_LOCKED,
        VM_FAULT_RETRY,
        VM_FAULT_FALLBACK,
        VM_FAULT_DONE_COW,
        VM_FAULT_NEEDDSYNC,
        VM_FAULT_COMPLETED,
        VM_FAULT_HINDEX_MASK;

    }

    @Type(noCCodeGeneration=true, cType="enum vm_event_item")
    public static enum vm_event_item implements Enum<vm_event_item>,
    TypedEnum<vm_event_item, Integer>
    {
        PGPGIN,
        PGPGOUT,
        PSWPIN,
        PSWPOUT,
        PGALLOC_DMA,
        PGALLOC_DMA32,
        PGALLOC_NORMAL,
        PGALLOC_MOVABLE,
        PGALLOC_DEVICE,
        ALLOCSTALL_DMA,
        ALLOCSTALL_DMA32,
        ALLOCSTALL_NORMAL,
        ALLOCSTALL_MOVABLE,
        ALLOCSTALL_DEVICE,
        PGSCAN_SKIP_DMA,
        PGSCAN_SKIP_DMA32,
        PGSCAN_SKIP_NORMAL,
        PGSCAN_SKIP_MOVABLE,
        PGSCAN_SKIP_DEVICE,
        PGFREE,
        PGACTIVATE,
        PGDEACTIVATE,
        PGLAZYFREE,
        PGFAULT,
        PGMAJFAULT,
        PGLAZYFREED,
        PGREFILL,
        PGREUSE,
        PGSTEAL_KSWAPD,
        PGSTEAL_DIRECT,
        PGSTEAL_KHUGEPAGED,
        PGSCAN_KSWAPD,
        PGSCAN_DIRECT,
        PGSCAN_KHUGEPAGED,
        PGSCAN_DIRECT_THROTTLE,
        PGSCAN_ANON,
        PGSCAN_FILE,
        PGSTEAL_ANON,
        PGSTEAL_FILE,
        PGSCAN_ZONE_RECLAIM_SUCCESS,
        PGSCAN_ZONE_RECLAIM_FAILED,
        PGINODESTEAL,
        SLABS_SCANNED,
        KSWAPD_INODESTEAL,
        KSWAPD_LOW_WMARK_HIT_QUICKLY,
        KSWAPD_HIGH_WMARK_HIT_QUICKLY,
        PAGEOUTRUN,
        PGROTATED,
        DROP_PAGECACHE,
        DROP_SLAB,
        OOM_KILL,
        NUMA_PTE_UPDATES,
        NUMA_HUGE_PTE_UPDATES,
        NUMA_HINT_FAULTS,
        NUMA_HINT_FAULTS_LOCAL,
        NUMA_PAGE_MIGRATE,
        PGMIGRATE_SUCCESS,
        PGMIGRATE_FAIL,
        THP_MIGRATION_SUCCESS,
        THP_MIGRATION_FAIL,
        THP_MIGRATION_SPLIT,
        COMPACTMIGRATE_SCANNED,
        COMPACTFREE_SCANNED,
        COMPACTISOLATED,
        COMPACTSTALL,
        COMPACTFAIL,
        COMPACTSUCCESS,
        KCOMPACTD_WAKE,
        KCOMPACTD_MIGRATE_SCANNED,
        KCOMPACTD_FREE_SCANNED,
        HTLB_BUDDY_PGALLOC,
        HTLB_BUDDY_PGALLOC_FAIL,
        UNEVICTABLE_PGCULLED,
        UNEVICTABLE_PGSCANNED,
        UNEVICTABLE_PGRESCUED,
        UNEVICTABLE_PGMLOCKED,
        UNEVICTABLE_PGMUNLOCKED,
        UNEVICTABLE_PGCLEARED,
        UNEVICTABLE_PGSTRANDED,
        THP_FAULT_ALLOC,
        THP_FAULT_FALLBACK,
        THP_FAULT_FALLBACK_CHARGE,
        THP_COLLAPSE_ALLOC,
        THP_COLLAPSE_ALLOC_FAILED,
        THP_FILE_ALLOC,
        THP_FILE_FALLBACK,
        THP_FILE_FALLBACK_CHARGE,
        THP_FILE_MAPPED,
        THP_SPLIT_PAGE,
        THP_SPLIT_PAGE_FAILED,
        THP_DEFERRED_SPLIT_PAGE,
        THP_UNDERUSED_SPLIT_PAGE,
        THP_SPLIT_PMD,
        THP_SCAN_EXCEED_NONE_PTE,
        THP_SCAN_EXCEED_SWAP_PTE,
        THP_SCAN_EXCEED_SHARED_PTE,
        THP_SPLIT_PUD,
        THP_ZERO_PAGE_ALLOC,
        THP_ZERO_PAGE_ALLOC_FAILED,
        THP_SWPOUT,
        THP_SWPOUT_FALLBACK,
        BALLOON_INFLATE,
        BALLOON_DEFLATE,
        BALLOON_MIGRATE,
        SWAP_RA,
        SWAP_RA_HIT,
        SWPIN_ZERO,
        SWPOUT_ZERO,
        KSM_SWPIN_COPY,
        COW_KSM,
        ZSWPIN,
        ZSWPOUT,
        ZSWPWB,
        DIRECT_MAP_LEVEL2_SPLIT,
        DIRECT_MAP_LEVEL3_SPLIT,
        NR_VM_EVENT_ITEMS;

    }

    @Type(noCCodeGeneration=true, cType="struct vm_fault")
    @NotUsableInJava
    public static class vm_fault
    extends Struct {
        public AnonDefinitions.anon_member_of_vm_fault anon0;
        public FaultDefinitions.fault_flag flags;
        public Ptr<PmdDefinitions.pmd_t> pmd;
        public Ptr<PudDefinitions.pud_t> pud;
        @InlineUnion(value=1606)
        public  @InlineUnion(value=1606) PteDefinitions.pte_t orig_pte;
        @InlineUnion(value=1606)
        public  @InlineUnion(value=1606) PmdDefinitions.pmd_t orig_pmd;
        public Ptr<runtime.page> cow_page;
        public Ptr<runtime.page> page;
        public Ptr<PteDefinitions.pte_t> pte;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> ptl;
        public @OriginalName(value="pgtable_t") Ptr<runtime.page> prealloc_pte;
    }

    @Type(noCCodeGeneration=true, cType="struct vm_operations_struct")
    @NotUsableInJava
    public static class vm_operations_struct
    extends Struct {
        public Ptr<?> open;
        public Ptr<?> close;
        public Ptr<?> may_split;
        public Ptr<?> mremap;
        public Ptr<?> mprotect;
        public Ptr<?> fault;
        public Ptr<?> huge_fault;
        public Ptr<?> map_pages;
        public Ptr<?> pagesize;
        public Ptr<?> page_mkwrite;
        public Ptr<?> pfn_mkwrite;
        public Ptr<?> access;
        public Ptr<?> name;
        public Ptr<?> set_policy;
        public Ptr<?> get_policy;
        public Ptr<?> find_special_page;
    }

    @Type(noCCodeGeneration=true, cType="struct vm_userfaultfd_ctx")
    @NotUsableInJava
    public static class vm_userfaultfd_ctx
    extends Struct {
        public Ptr<UserfaultfdDefinitions.userfaultfd_ctx> ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct vm_area_struct")
    @NotUsableInJava
    public static class vm_area_struct
    extends Struct {
        @InlineUnion(value=656)
        public  @InlineUnion(value=656) AnonDefinitions.anon_member_of_anon_member_of_vm_area_struct anon0$0;
        @InlineUnion(value=656)
        public @InlineUnion(value=656) misc.callback_head vm_rcu;
        public Ptr<MmDefinitions.mm_struct> vm_mm;
        public  @OriginalName(value="pgprot_t") runtime.pgprot vm_page_prot;
        @InlineUnion(value=657)
        public @InlineUnion(value=657) @Unsigned @OriginalName(value="vm_flags_t") long vm_flags;
        @InlineUnion(value=657)
        public @InlineUnion(value=657) @Unsigned @OriginalName(value="vm_flags_t") long __vm_flags;
        public boolean detached;
        public int vm_lock_seq;
        public Ptr<VmaDefinitions.vma_lock> vm_lock;
        public misc.shared_of_vm_area_struct shared;
        public ListDefinitions.list_head anon_vma_chain;
        public Ptr<AnonDefinitions.anon_vma> anon_vma;
        public Ptr<vm_operations_struct> vm_ops;
        public @Unsigned long vm_pgoff;
        public Ptr<runtime.file> vm_file;
        public Ptr<?> vm_private_data;
        public Ptr<AnonDefinitions.anon_vma_name> anon_name;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t swap_readahead_info;
        public Ptr<runtime.mempolicy> vm_policy;
        public Ptr<VmaDefinitions.vma_numab_state> numab_state;
        public vm_userfaultfd_ctx vm_userfaultfd_ctx;
    }
}

