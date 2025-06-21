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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VirtnetDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PageDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __page_handle_poison(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_alloc_init_late() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_cache_pipe_buf_confirm(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_cache_pipe_buf_release(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean page_cache_pipe_buf_try_steal(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_cache_sync_readahead(Ptr<misc.address_space> mapping, Ptr<FileDefinitions.file_ra_state> ra, Ptr<runtime.file> file2, @Unsigned long index2, @Unsigned long req_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_count((const struct page*)$arg1)")
    public static int page_count(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_flip_common(Ptr<DrmDefinitions.drm_atomic_state> state2, Ptr<DrmDefinitions.drm_crtc> crtc, Ptr<DrmDefinitions.drm_framebuffer> fb, Ptr<DrmDefinitions.drm_pending_vblank_event> event2, @Unsigned @OriginalName(value="uint32_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean page_handle_poison(Ptr<runtime.page> page2, boolean hugepage_or_freepage, boolean release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long page_level_size(misc.pg_level level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long page_mapped_in_vma(Ptr<runtime.page> page2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_pool_check_memory_provider(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_rx_queue> rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_detached(Ptr<page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_pool_list(Ptr<page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_pool_netdevice_event(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_nl_fill($arg1, (const struct page_pool*)$arg2, (const struct genl_info*)$arg3)")
    public static int page_pool_nl_fill(Ptr<SkDefinitions.sk_buff> rsp, Ptr<page_pool> pool, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_nl_stats_fill($arg1, (const struct page_pool*)$arg2, (const struct genl_info*)$arg3)")
    public static int page_pool_nl_stats_fill(Ptr<SkDefinitions.sk_buff> rsp, Ptr<page_pool> pool, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_unlist(Ptr<page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_pool_user_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.swp_entry_t page_swap_entry(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __page_reporting_notify() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_cache_async_ra(Ptr<misc.readahead_control> ractl, Ptr<runtime.folio> folio2, @Unsigned long req_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_cache_ra_order(Ptr<misc.readahead_control> ractl, Ptr<FileDefinitions.file_ra_state> ra, @Unsigned int new_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_cache_ra_unbounded(Ptr<misc.readahead_control> ractl, @Unsigned long nr_to_read, @Unsigned long lookahead_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_cache_sync_ra(Ptr<misc.readahead_control> ractl, @Unsigned long req_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ino_t") long page_cgroup_ino(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_counter_calculate_protection(Ptr<page_counter> root, Ptr<page_counter> counter, boolean recursive_protection) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_counter_cancel(Ptr<page_counter> counter, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_counter_charge(Ptr<page_counter> counter, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_counter_memparse((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static int page_counter_memparse(String buf, String max, Ptr<@Unsigned Long> nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_counter_set_low(Ptr<page_counter> counter, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_counter_set_max(Ptr<page_counter> counter, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_counter_set_min(Ptr<page_counter> counter, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean page_counter_try_charge(Ptr<page_counter> counter, @Unsigned long nr_pages, Ptr<Ptr<page_counter>> fail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_counter_uncharge(Ptr<page_counter> counter, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)page_get_link($arg1, $arg2, $arg3))")
    public static String page_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_is_ram(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_order_update_notify((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int page_order_update_notify(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_put_link(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_readlink(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_reporting_cycle(Ptr<page_reporting_dev_info> prdev, Ptr<runtime.zone> zone2, @Unsigned int order, @Unsigned int mt, Ptr<runtime.scatterlist> sgl, Ptr<@Unsigned Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_reporting_process(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_reporting_register(Ptr<page_reporting_dev_info> prdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_reporting_unregister(Ptr<page_reporting_dev_info> prdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_symlink($arg1, (const u8*)$arg2, $arg3)")
    public static int page_symlink(Ptr<runtime.inode> inode2, String symname, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netmem_ref") long __page_pool_alloc_pages_slow(Ptr<page_pool> pool, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long page_address_in_vma(Ptr<runtime.page> page2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean page_make_device_exclusive_one(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean page_mkclean_one(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> page_pool_alloc_frag(Ptr<page_pool> pool, Ptr<@Unsigned Integer> offset, @Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netmem_ref") long page_pool_alloc_frag_netmem(Ptr<page_pool> pool, Ptr<@Unsigned Integer> offset, @Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netmem_ref") long page_pool_alloc_netmem(Ptr<page_pool> pool, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> page_pool_alloc_pages(Ptr<page_pool> pool, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_clear_pp_info(@Unsigned @OriginalName(value="netmem_ref") long netmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_create((const struct page_pool_params*)$arg1)")
    public static Ptr<page_pool> page_pool_create(Ptr<page_pool_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_create_percpu((const struct page_pool_params*)$arg1, $arg2)")
    public static Ptr<page_pool> page_pool_create_percpu(Ptr<page_pool_params> params, int cpuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_destroy(Ptr<page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_disable_direct_recycling(Ptr<page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean page_pool_dma_map(Ptr<page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_ethtool_stats_get($arg1, (const void*)$arg2)")
    public static @NotUsableInJava Ptr<@Unsigned Long> page_pool_ethtool_stats_get(Ptr<@Unsigned Long> data, Ptr<?> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_pool_ethtool_stats_get_count() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> page_pool_ethtool_stats_get_strings(Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_get_stats((const struct page_pool*)$arg1, $arg2)")
    public static boolean page_pool_get_stats(Ptr<page_pool> pool, Ptr<page_pool_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_inflight((const struct page_pool*)$arg1, $arg2)")
    public static int page_pool_inflight(Ptr<page_pool> pool, boolean strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_init($arg1, (const struct page_pool_params*)$arg2, $arg3)")
    public static int page_pool_init(Ptr<page_pool> pool, Ptr<page_pool_params> params, int cpuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_put_page_bulk(Ptr<page_pool> pool, Ptr<Ptr<?>> data, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_put_unrefed_netmem(Ptr<page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem, @Unsigned int dma_sync_size, boolean allow_direct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_put_unrefed_page(Ptr<page_pool> pool, Ptr<runtime.page> page2, @Unsigned int dma_sync_size, boolean allow_direct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netmem_ref") long page_pool_refill_alloc_cache(Ptr<page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_pool_release(Ptr<page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_release_retry(Ptr<misc.work_struct> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_return_page(Ptr<page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_set_pp_info(Ptr<page_pool> pool, @Unsigned @OriginalName(value="netmem_ref") long netmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_uninit(Ptr<page_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_pool_update_nid(Ptr<page_pool> pool, int new_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="page_pool_use_xdp_mem($arg1, (void (*)(void*))$arg2, (const struct xdp_mem_info*)$arg3)")
    public static void page_pool_use_xdp_mem(Ptr<page_pool> pool, Ptr<?> disconnect, Ptr<XdpDefinitions.xdp_mem_info> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> page_to_skb(Ptr<VirtnetDefinitions.virtnet_info> vi, Ptr<misc.receive_queue> rq2, Ptr<runtime.page> page2, @Unsigned int offset, @Unsigned int len, @Unsigned int truesize, @Unsigned int headroom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_vma_mkclean_one(Ptr<page_vma_mapped_walk> pvmw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_writeback_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_writeback_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __page_cache_release(Ptr<runtime.folio> folio2, Ptr<Ptr<runtime.lruvec>> lruvecp, Ptr<@Unsigned Long> flagsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __page_frag_alloc_align(Ptr<page_frag_cache> nc, @Unsigned int fragsz, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int align_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __page_frag_cache_drain(Ptr<runtime.page> page2, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> __page_frag_cache_refill(Ptr<page_frag_cache> nc, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_alloc_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_alloc_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_alloc_init_cpuhp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_alloc_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long page_cache_next_miss(Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned long max_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long page_cache_prev_miss(Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned long max_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_fault_oops(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_frag_cache_drain(Ptr<page_frag_cache> nc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_frag_free(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long page_idle_bitmap_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long page_idle_bitmap_write(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_idle_clear_pte_refs(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean page_idle_clear_pte_refs_one(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> page_idle_get_folio(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int page_idle_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_offline_begin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_offline_end() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_offline_freeze() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void page_offline_thaw() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct page_frag_1k")
    @NotUsableInJava
    public static class page_frag_1k
    extends Struct {
        public Ptr<?> va;
        public @Unsigned short offset;
        public boolean pfmemalloc;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int additional_pages; long long unsigned int largepage; long long unsigned int basepfn; }")
    @NotUsableInJava
    public static class page_of_hv_gpa_page_range
    extends Struct {
        public @Unsigned long additional_pages;
        public @Unsigned long largepage;
        public @Unsigned long basepfn;
    }

    @Type(noCCodeGeneration=true, cType="struct page_region")
    @NotUsableInJava
    public static class page_region
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long categories;
    }

    @Type(noCCodeGeneration=true, cType="struct page_flags_fields")
    @NotUsableInJava
    public static class page_flags_fields
    extends Struct {
        public int width;
        public int shift;
        public int mask;
        public Ptr<misc.printf_spec> spec;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct page_pool_dump_cb")
    @NotUsableInJava
    public static class page_pool_dump_cb
    extends Struct {
        public @Unsigned long ifindex;
        public @Unsigned int pp_id;
    }

    @Type(noCCodeGeneration=true, cType="struct page_pool_stats")
    @NotUsableInJava
    public static class page_pool_stats
    extends Struct {
        public page_pool_alloc_stats alloc_stats;
        public page_pool_recycle_stats recycle_stats;
    }

    @Type(noCCodeGeneration=true, cType="struct page_list")
    @NotUsableInJava
    public static class page_list
    extends Struct {
        public Ptr<page_list> next;
        public Ptr<runtime.page> page;
    }

    @Type(noCCodeGeneration=true, cType="struct page_req_dsc")
    @NotUsableInJava
    public static class page_req_dsc
    extends Struct {
        @InlineUnion(value=32134)
        public  @InlineUnion(value=32134) AnonDefinitions.anon_member_of_anon_member_of_page_req_dsc anon0$0;
        @InlineUnion(value=32134)
        public @InlineUnion(value=32134) @Unsigned long qw_0;
        @InlineUnion(value=32136)
        public  @InlineUnion(value=32136) AnonDefinitions.anon_member_of_anon_member_of_page_req_dsc anon1$0;
        @InlineUnion(value=32136)
        public @InlineUnion(value=32136) @Unsigned long qw_1;
        public @Unsigned long qw_2;
        public @Unsigned long qw_3;
    }

    @Type(noCCodeGeneration=true, cType="struct page_state")
    @NotUsableInJava
    public static class page_state
    extends Struct {
        public @Unsigned long mask;
        public @Unsigned long res;
        public misc.mf_action_page_type type;
        public Ptr<?> action;
    }

    @Type(noCCodeGeneration=true, cType="enum page_size_enum")
    public static enum page_size_enum implements Enum<page_size_enum>,
    TypedEnum<page_size_enum, Integer>
    {
        __PAGE_SIZE;

    }

    @Type(noCCodeGeneration=true, cType="struct page_pool_recycle_stats")
    @NotUsableInJava
    public static class page_pool_recycle_stats
    extends Struct {
        public @Unsigned long cached;
        public @Unsigned long cache_full;
        public @Unsigned long ring;
        public @Unsigned long ring_full;
        public @Unsigned long released_refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct page_pool_alloc_stats")
    @NotUsableInJava
    public static class page_pool_alloc_stats
    extends Struct {
        public @Unsigned long fast;
        public @Unsigned long slow;
        public @Unsigned long slow_high_order;
        public @Unsigned long empty;
        public @Unsigned long refill;
        public @Unsigned long waive;
    }

    @Type(noCCodeGeneration=true, cType="struct page_pool_params")
    @NotUsableInJava
    public static class page_pool_params
    extends Struct {
        @InlineUnion(value=21231)
        public  @InlineUnion(value=21231) AnonDefinitions.anon_member_of_anon_member_of_page_pool_params anon0$0;
        @InlineUnion(value=21231)
        public @InlineUnion(value=21231) page_pool_params_fast fast;
        @InlineUnion(value=21236)
        public  @InlineUnion(value=21236) AnonDefinitions.anon_member_of_anon_member_of_page_pool_params anon1$0;
        @InlineUnion(value=21236)
        public @InlineUnion(value=21236) page_pool_params_slow slow;
    }

    @Type(noCCodeGeneration=true, cType="struct page_pool_params_slow")
    @NotUsableInJava
    public static class page_pool_params_slow
    extends Struct {
        public Ptr<NetDefinitions.net_device> netdev;
        public @Unsigned int queue_idx;
        public @Unsigned int flags;
        public Ptr<?> init_callback;
        public Ptr<?> init_arg;
    }

    @Type(noCCodeGeneration=true, cType="struct page_pool_params_fast")
    @NotUsableInJava
    public static class page_pool_params_fast
    extends Struct {
        public @Unsigned int order;
        public @Unsigned int pool_size;
        public int nid;
        public Ptr<runtime.device> dev;
        public Ptr<NapiDefinitions.napi_struct> napi;
        public DmaDefinitions.dma_data_direction dma_dir;
        public @Unsigned int max_len;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct page_pool")
    @NotUsableInJava
    public static class page_pool
    extends Struct {
        public page_pool_params_fast p;
        public int cpuid;
        public @Unsigned int pages_state_hold_cnt;
        public boolean has_init_callback;
        public boolean dma_map;
        public boolean dma_sync;
        public boolean system;
        public char @Size(value=0) [] __cacheline_group_begin__frag;
        public long frag_users;
        public @Unsigned @OriginalName(value="netmem_ref") long frag_page;
        public @Unsigned int frag_offset;
        public char @Size(value=0) [] __cacheline_group_end__frag;
        public misc.lockdep_map_p __cacheline_group_pad__frag;
        public DelayedDefinitions.delayed_work release_dw;
        public Ptr<?> disconnect;
        public @Unsigned long defer_start;
        public @Unsigned long defer_warn;
        public page_pool_alloc_stats alloc_stats;
        public @Unsigned int xdp_mem_id;
        public misc.pp_alloc_cache alloc;
        public misc.ptr_ring ring;
        public Ptr<?> mp_priv;
        public Ptr<page_pool_recycle_stats> recycle_stats;
        public AtomicDefinitions.atomic_t pages_state_release_cnt;
        public @OriginalName(value="refcount_t") misc.refcount_struct user_cnt;
        public @Unsigned long destroy_cnt;
        public page_pool_params_slow slow;
        public UserDefinitions.user_of_page_pool user;
    }

    @Type(noCCodeGeneration=true, cType="struct page_reporting_dev_info")
    @NotUsableInJava
    public static class page_reporting_dev_info
    extends Struct {
        public Ptr<?> report;
        public DelayedDefinitions.delayed_work work;
        public AtomicDefinitions.atomic_t state;
        public @Unsigned int order;
    }

    @Type(noCCodeGeneration=true, cType="struct page_vma_mapped_walk")
    @NotUsableInJava
    public static class page_vma_mapped_walk
    extends Struct {
        public @Unsigned long pfn;
        public @Unsigned long nr_pages;
        public @Unsigned long pgoff;
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public @Unsigned long address;
        public Ptr<PmdDefinitions.pmd_t> pmd;
        public Ptr<PteDefinitions.pte_t> pte;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> ptl;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct page_frag_cache")
    @NotUsableInJava
    public static class page_frag_cache
    extends Struct {
        public Ptr<?> va;
        public @Unsigned short offset;
        public @Unsigned short size;
        public @Unsigned int pagecnt_bias;
        public boolean pfmemalloc;
    }

    @Type(noCCodeGeneration=true, cType="enum page_walk_action")
    public static enum page_walk_action implements Enum<page_walk_action>,
    TypedEnum<page_walk_action, Integer>
    {
        ACTION_SUBTREE,
        ACTION_CONTINUE,
        ACTION_AGAIN;

    }

    @Type(noCCodeGeneration=true, cType="enum page_walk_lock")
    public static enum page_walk_lock implements Enum<page_walk_lock>,
    TypedEnum<page_walk_lock, Integer>
    {
        PGWALK_RDLOCK,
        PGWALK_WRLOCK,
        PGWALK_WRLOCK_VERIFY;

    }

    @Type(noCCodeGeneration=true, cType="enum page_cache_mode")
    public static enum page_cache_mode implements Enum<page_cache_mode>,
    TypedEnum<page_cache_mode, Integer>
    {
        _PAGE_CACHE_MODE_WB,
        _PAGE_CACHE_MODE_WC,
        _PAGE_CACHE_MODE_UC_MINUS,
        _PAGE_CACHE_MODE_UC,
        _PAGE_CACHE_MODE_WT,
        _PAGE_CACHE_MODE_WP,
        _PAGE_CACHE_MODE_NUM;

    }

    @Type(noCCodeGeneration=true, cType="enum page_memcg_data_flags")
    public static enum page_memcg_data_flags implements Enum<page_memcg_data_flags>,
    TypedEnum<page_memcg_data_flags, Integer>
    {
        MEMCG_DATA_OBJEXTS,
        MEMCG_DATA_KMEM,
        __NR_MEMCG_DATA_FLAGS;

    }

    @Type(noCCodeGeneration=true, cType="struct page_counter")
    @NotUsableInJava
    public static class page_counter
    extends Struct {
        public @OriginalName(value="atomic_long_t") misc.atomic64_t usage;
        public misc.cacheline_padding _pad1_;
        public @Unsigned long emin;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t min_usage;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t children_min_usage;
        public @Unsigned long elow;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t low_usage;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t children_low_usage;
        public @Unsigned long watermark;
        public @Unsigned long local_watermark;
        public @Unsigned long failcnt;
        public misc.cacheline_padding _pad2_;
        public boolean protection_support;
        public @Unsigned long min;
        public @Unsigned long low;
        public @Unsigned long high;
        public @Unsigned long max;
        public Ptr<page_counter> parent;
    }

    @Type(noCCodeGeneration=true, cType="struct page_frag")
    @NotUsableInJava
    public static class page_frag
    extends Struct {
        public Ptr<runtime.page> page;
        public @Unsigned int offset;
        public @Unsigned int size;
    }
}

