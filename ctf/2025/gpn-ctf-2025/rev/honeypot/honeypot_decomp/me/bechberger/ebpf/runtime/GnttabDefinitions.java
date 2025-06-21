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
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class GnttabDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __gnttab_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __gnttab_unmap_refs_async(Ptr<misc.gntab_unmap_queue_data> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_add_deferred(@Unsigned @OriginalName(value="grant_ref_t") int ref, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_alloc_grant_reference_seq(@Unsigned int count, Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_alloc_grant_references(@Unsigned short count, Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_alloc_pages(int nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_batch_copy(Ptr<gnttab_copy> batch2, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_batch_map(Ptr<gnttab_map_grant_ref> batch2, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_cancel_free_callback(Ptr<gnttab_free_callback> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_claim_grant_reference(Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> private_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_dma_alloc_pages(Ptr<gnttab_dma_alloc_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_dma_free_pages(Ptr<gnttab_dma_alloc_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gnttab_empty_grant_references((const unsigned int*)$arg1)")
    public static int gnttab_empty_grant_references(Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> private_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_end_foreign_access(@Unsigned @OriginalName(value="grant_ref_t") int ref, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_end_foreign_access_ref(@Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_end_foreign_access_ref_v1(@Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_end_foreign_access_ref_v2(@Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_expand(@Unsigned int req_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_foreach_grant(Ptr<Ptr<runtime.page>> pages, @Unsigned int nr_grefs, @OriginalName(value="xen_grant_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_foreach_grant_in_range(Ptr<runtime.page> page2, @Unsigned int offset, @Unsigned int len, @OriginalName(value="xen_grant_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_free_auto_xlat_frames() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_free_grant_reference(@Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_free_grant_reference_seq(@Unsigned @OriginalName(value="grant_ref_t") int head, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_free_grant_references(@Unsigned @OriginalName(value="grant_ref_t") int head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_free_pages(int nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_grant_foreign_access(@Unsigned @OriginalName(value="domid_t") short domid, @Unsigned long frame, int readonly) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_grant_foreign_access_ref(@Unsigned @OriginalName(value="grant_ref_t") int ref, @Unsigned @OriginalName(value="domid_t") short domid, @Unsigned long frame, int readonly) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_handle_deferred(Ptr<TimerDefinitions.timer_list> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_map(@Unsigned int start_idx, @Unsigned int end_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_map_frames_v1(Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> frames, @Unsigned int nr_gframes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_map_frames_v2(Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> frames, @Unsigned int nr_gframes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_map_refs(Ptr<gnttab_map_grant_ref> map_ops, Ptr<gnttab_map_grant_ref> kmap_ops, Ptr<Ptr<runtime.page>> pages, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int gnttab_max_grant_frames() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_page_cache_get(Ptr<gnttab_page_cache> cache, Ptr<Ptr<runtime.page>> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_page_cache_init(Ptr<gnttab_page_cache> cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_page_cache_put(Ptr<gnttab_page_cache> cache, Ptr<Ptr<runtime.page>> page2, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_page_cache_shrink(Ptr<gnttab_page_cache> cache, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_pages_clear_private(int nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_pages_set_private(int nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gnttab_read_frame_v1(@Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gnttab_read_frame_v2(@Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_release_grant_reference(Ptr<@Unsigned @OriginalName(value="grant_ref_t") Integer> private_head, @Unsigned @OriginalName(value="grant_ref_t") int release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gnttab_request_free_callback($arg1, (void (*)(void*))$arg2, $arg3, $arg4)")
    public static void gnttab_request_free_callback(Ptr<gnttab_free_callback> callback2, Ptr<?> fn, Ptr<?> arg2, @Unsigned short count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_request_version() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_set_free(@Unsigned int start, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_setup_auto_xlat_frames(@Unsigned @OriginalName(value="phys_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_try_end_foreign_access(@Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_unmap_frames_v1() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_unmap_frames_v2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_unmap_refs(Ptr<gnttab_unmap_grant_ref> unmap_ops, Ptr<gnttab_unmap_grant_ref> kunmap_ops, Ptr<Ptr<runtime.page>> pages, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_unmap_refs_async(Ptr<misc.gntab_unmap_queue_data> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_unmap_refs_sync(Ptr<misc.gntab_unmap_queue_data> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_unmap_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_update_entry_v1(@Unsigned @OriginalName(value="grant_ref_t") int ref, @Unsigned @OriginalName(value="domid_t") short domid, @Unsigned long frame, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnttab_update_entry_v2(@Unsigned @OriginalName(value="grant_ref_t") int ref, @Unsigned @OriginalName(value="domid_t") short domid, @Unsigned long frame, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnttab_apply(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_vm_area")
    @NotUsableInJava
    public static class gnttab_vm_area
    extends Struct {
        public Ptr<VmDefinitions.vm_struct> area;
        public Ptr<Ptr<PteDefinitions.pte_t>> ptes;
        public int idx;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_ops")
    @NotUsableInJava
    public static class gnttab_ops
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int grefs_per_grant_frame;
        public Ptr<?> map_frames;
        public Ptr<?> unmap_frames;
        public Ptr<?> update_entry;
        public Ptr<?> end_foreign_access_ref;
        public Ptr<?> read_frame;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_dma_alloc_args")
    @NotUsableInJava
    public static class gnttab_dma_alloc_args
    extends Struct {
        public Ptr<runtime.device> dev;
        public boolean coherent;
        public int nr_pages;
        public Ptr<Ptr<runtime.page>> pages;
        public Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> frames;
        public Ptr<?> vaddr;
        public @Unsigned @OriginalName(value="dma_addr_t") long dev_bus_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_page_cache")
    @NotUsableInJava
    public static class gnttab_page_cache
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<runtime.page> pages;
        public @Unsigned int num_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_get_status_frames")
    @NotUsableInJava
    public static class gnttab_get_status_frames
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int nr_frames;
        public @Unsigned @OriginalName(value="domid_t") short dom;
        public @OriginalName(value="int16_t") short status;
        public @OriginalName(value="__guest_handle_uint64_t") Ptr<@Unsigned @OriginalName(value="uint64_t") Long> frame_list;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_set_version")
    @NotUsableInJava
    public static class gnttab_set_version
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int version;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_query_size")
    @NotUsableInJava
    public static class gnttab_query_size
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short dom;
        public @Unsigned @OriginalName(value="uint32_t") int nr_frames;
        public @Unsigned @OriginalName(value="uint32_t") int max_nr_frames;
        public @OriginalName(value="int16_t") short status;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_copy")
    @NotUsableInJava
    public static class gnttab_copy
    extends Struct {
        public gnttab_copy_ptr source;
        public gnttab_copy_ptr dest;
        public @Unsigned @OriginalName(value="uint16_t") short len;
        public @Unsigned @OriginalName(value="uint16_t") short flags;
        public @OriginalName(value="int16_t") short status;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_copy_ptr")
    @NotUsableInJava
    public static class gnttab_copy_ptr
    extends Struct {
        public UDefinitions.u_of_gnttab_copy_ptr u;
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public @Unsigned @OriginalName(value="uint16_t") short offset;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_setup_table")
    @NotUsableInJava
    public static class gnttab_setup_table
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short dom;
        public @Unsigned @OriginalName(value="uint32_t") int nr_frames;
        public @OriginalName(value="int16_t") short status;
        public @OriginalName(value="__guest_handle_xen_pfn_t") Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> frame_list;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_free_callback")
    @NotUsableInJava
    public static class gnttab_free_callback
    extends Struct {
        public Ptr<gnttab_free_callback> next;
        public Ptr<?> fn;
        public Ptr<?> arg;
        public @Unsigned short count;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_unmap_grant_ref")
    @NotUsableInJava
    public static class gnttab_unmap_grant_ref
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long host_addr;
        public @Unsigned @OriginalName(value="uint64_t") long dev_bus_addr;
        public @Unsigned @OriginalName(value="grant_handle_t") int handle;
        public @OriginalName(value="int16_t") short status;
    }

    @Type(noCCodeGeneration=true, cType="struct gnttab_map_grant_ref")
    @NotUsableInJava
    public static class gnttab_map_grant_ref
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long host_addr;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="grant_ref_t") int ref;
        public @Unsigned @OriginalName(value="domid_t") short dom;
        public @OriginalName(value="int16_t") short status;
        public @Unsigned @OriginalName(value="grant_handle_t") int handle;
        public @Unsigned @OriginalName(value="uint64_t") long dev_bus_addr;
    }
}

