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
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaengineDefinitions;
import me.bechberger.ebpf.runtime.DmarDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.GenDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.VirtDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DmaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dma_rx_complete(Ptr<runtime.uart_8250_port> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dma_tx_complete(Ptr<?> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_buf_attachment> dma_buf_attach(Ptr<dma_buf> dmabuf, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_begin_cpu_access(Ptr<dma_buf> dmabuf, dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_debug_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_debug_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_deinit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_detach(Ptr<dma_buf> dmabuf, Ptr<dma_buf_attachment> attach) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_buf_dynamic_attach($arg1, $arg2, (const struct dma_buf_attach_ops*)$arg3, $arg4)")
    public static Ptr<dma_buf_attachment> dma_buf_dynamic_attach(Ptr<dma_buf> dmabuf, Ptr<runtime.device> dev, Ptr<dma_buf_attach_ops> importer_ops, Ptr<?> importer_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_end_cpu_access(Ptr<dma_buf> dmabuf, dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_buf_export((const struct dma_buf_export_info*)$arg1)")
    public static Ptr<dma_buf> dma_buf_export(Ptr<dma_buf_export_info> exp_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_fd(Ptr<dma_buf> dmabuf, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_file_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_fs_init_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_buf> dma_buf_get(int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dma_buf_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long dma_buf_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> dma_buf_map_attachment(Ptr<dma_buf_attachment> attach, dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> dma_buf_map_attachment_unlocked(Ptr<dma_buf_attachment> attach, dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_mmap(Ptr<dma_buf> dmabuf, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long pgoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_mmap_internal(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_move_notify(Ptr<dma_buf> dmabuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_pin(Ptr<dma_buf_attachment> attach) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int dma_buf_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> poll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_buf_poll_add_cb(Ptr<dma_resv> resv, boolean write2, Ptr<dma_buf_poll_cb_t> dcb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_poll_cb(Ptr<dma_fence> fence, Ptr<dma_fence_cb> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_put(Ptr<dma_buf> dmabuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_release(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_unmap_attachment(Ptr<dma_buf_attachment> attach, Ptr<SgDefinitions.sg_table> sg_table2, dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_unmap_attachment_unlocked(Ptr<dma_buf_attachment> attach, Ptr<SgDefinitions.sg_table> sg_table2, dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_unpin(Ptr<dma_buf_attachment> attach) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_vmap(Ptr<dma_buf> dmabuf, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_buf_vmap_unlocked(Ptr<dma_buf> dmabuf, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_vunmap(Ptr<dma_buf> dmabuf, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_buf_vunmap_unlocked(Ptr<dma_buf> dmabuf, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> dma_common_alloc_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, dma_data_direction dir, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_common_free_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<runtime.page> page2, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_common_get_sgtable(Ptr<runtime.device> dev, Ptr<SgDefinitions.sg_table> sgt, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_common_mmap(Ptr<runtime.device> dev, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> dma_common_vaddr_to_page(Ptr<?> cpu_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_heap_add((const struct dma_heap_export_info*)$arg1)")
    public static Ptr<dma_heap> dma_heap_add(Ptr<dma_heap_export_info> exp_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_heap_devnode((const struct device*)$arg1, $arg2)")
    public static String dma_heap_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dma_heap_get_drvdata(Ptr<dma_heap> heap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dma_heap_get_name($arg1))")
    public static String dma_heap_get_name(Ptr<dma_heap> heap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_heap_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dma_heap_ioctl(Ptr<runtime.file> file2, @Unsigned int ucmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_heap_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dma_pool_alloc(Ptr<dma_pool> pool, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_pool_create((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<dma_pool> dma_pool_create(String name, Ptr<runtime.device> dev, @Unsigned long size, @Unsigned long align, @Unsigned long boundary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_pool_destroy(Ptr<dma_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_pool_free(Ptr<dma_pool> pool, Ptr<?> vaddr, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_pte_clear_level(Ptr<DmarDefinitions.dmar_domain> domain, int level, Ptr<dma_pte> pte, @Unsigned long pfn, @Unsigned long start_pfn, @Unsigned long last_pfn, Ptr<ListDefinitions.list_head> freelist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_pte_clear_range(Ptr<DmarDefinitions.dmar_domain> domain, @Unsigned long start_pfn, @Unsigned long last_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_pte_free_level(Ptr<DmarDefinitions.dmar_domain> domain, int level, int retain_level, Ptr<dma_pte> pte, @Unsigned long pfn, @Unsigned long start_pfn, @Unsigned long last_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_rx_complete(Ptr<?> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dma_async_device_channel_register($arg1, $arg2, (const u8*)$arg3)")
    public static int __dma_async_device_channel_register(Ptr<dma_device> device2, Ptr<dma_chan> chan, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dma_async_device_channel_unregister(Ptr<dma_device> device2, Ptr<dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> __dma_direct_alloc_pages(Ptr<runtime.device> dev, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp, boolean allow_highmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dma_request_channel((const struct {\n  long unsigned int bits[1];\n}*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<dma_chan> __dma_request_channel(Ptr<dma_cap_mask_t> mask, @OriginalName(value="dma_filter_fn") Ptr<?> fn, Ptr<?> fn_param, Ptr<DeviceDefinitions.device_node> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_async_device_channel_register($arg1, $arg2, (const u8*)$arg3)")
    public static int dma_async_device_channel_register(Ptr<dma_device> device2, Ptr<dma_chan> chan, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_async_device_channel_unregister(Ptr<dma_device> device2, Ptr<dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_async_device_register(Ptr<dma_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_async_device_unregister(Ptr<dma_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_async_tx_descriptor_init(Ptr<dma_async_tx_descriptor> tx, Ptr<dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_chan_get(Ptr<dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_chan_put(Ptr<dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_channel_rebalance() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_channel_table_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_coherent_ok(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_common_contiguous_remap($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static Ptr<?> dma_common_contiguous_remap(Ptr<runtime.page> page2, @Unsigned long size,  @OriginalName(value="pgprot_t") runtime.pgprot prot, Ptr<?> caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<runtime.page>> dma_common_find_pages(Ptr<?> cpu_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_common_free_remap(Ptr<?> cpu_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_common_pages_remap($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static Ptr<?> dma_common_pages_remap(Ptr<Ptr<runtime.page>> pages, @Unsigned long size,  @OriginalName(value="pgprot_t") runtime.pgprot prot, Ptr<?> caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_direct_all_ram_mapped(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dma_direct_alloc(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dma_direct_alloc_from_pool(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> dma_direct_alloc_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, dma_data_direction dir, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_direct_can_mmap(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_direct_free(Ptr<runtime.device> dev, @Unsigned long size, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_direct_free_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<runtime.page> page2, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dma_direct_get_required_mask(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_direct_get_sgtable(Ptr<runtime.device> dev, Ptr<SgDefinitions.sg_table> sgt, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long dma_direct_map_page(Ptr<runtime.device> dev, Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long size, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long dma_direct_map_resource(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_direct_map_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dma_direct_max_mapping_size(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_direct_mmap(Ptr<runtime.device> dev, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_direct_need_sync(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_direct_set_offset(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long cpu_start, @Unsigned @OriginalName(value="dma_addr_t") long dma_start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_direct_supported(Ptr<runtime.device> dev, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_direct_sync_sg_for_cpu(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_direct_sync_sg_for_device(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_direct_unmap_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nents, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long dma_dummy_map_page(Ptr<runtime.device> dev, Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long size, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_dummy_map_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nelems, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_dummy_mmap(Ptr<runtime.device> dev, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_dummy_supported(Ptr<runtime.device> hwdev, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_dummy_unmap_page(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, @Unsigned long size, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_dummy_unmap_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nelems, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_chain_cb(Ptr<dma_fence> f, Ptr<dma_fence_cb> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_fence_chain_enable_signaling(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_fence_chain_find_seqno(Ptr<Ptr<dma_fence>> pfence, @Unsigned @OriginalName(value="uint64_t") long seqno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dma_fence_chain_get_driver_name($arg1))")
    public static String dma_fence_chain_get_driver_name(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dma_fence_chain_get_timeline_name($arg1))")
    public static String dma_fence_chain_get_timeline_name(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_chain_init(Ptr<dma_fence_chain> chain, Ptr<dma_fence> prev, Ptr<dma_fence> fence, @Unsigned @OriginalName(value="uint64_t") long seqno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_chain_irq_work(Ptr<IrqDefinitions.irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_chain_release(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_chain_set_deadline(Ptr<dma_fence> fence, @OriginalName(value="ktime_t") long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_fence_chain_signaled(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_fence_chain_walk(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_chan> dma_find_channel(dma_transaction_type tx_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_flags(Ptr<PnpDefinitions.pnp_dev> dev, int type2, int bus_master, int transfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_chan> dma_get_any_slave_channel(Ptr<dma_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_get_slave_caps(Ptr<dma_chan> chan, Ptr<dma_slave_caps> caps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_chan> dma_get_slave_channel(Ptr<dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_issue_pending_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_release_channel(Ptr<dma_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_request_chan($arg1, (const u8*)$arg2)")
    public static Ptr<dma_chan> dma_request_chan(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_request_chan_by_mask((const struct {\n  long unsigned int bits[1];\n}*)$arg1)")
    public static Ptr<dma_chan> dma_request_chan_by_mask(Ptr<dma_cap_mask_t> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_resv_add_fence(Ptr<dma_resv> obj, Ptr<dma_fence> fence, dma_resv_usage usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_resv_copy_fences(Ptr<dma_resv> dst, Ptr<dma_resv> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_resv_describe(Ptr<dma_resv> obj, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_resv_fini(Ptr<dma_resv> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_resv_get_fences(Ptr<dma_resv> obj, dma_resv_usage usage, Ptr<@Unsigned Integer> num_fences, Ptr<Ptr<Ptr<dma_fence>>> fences) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_resv_get_singleton(Ptr<dma_resv> obj, dma_resv_usage usage, Ptr<Ptr<dma_fence>> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_resv_init(Ptr<dma_resv> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_resv_iter_first(Ptr<dma_resv_iter> cursor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_resv_iter_first_unlocked(Ptr<dma_resv_iter> cursor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_resv_iter_next(Ptr<dma_resv_iter> cursor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_resv_iter_next_unlocked(Ptr<dma_resv_iter> cursor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_resv_iter_walk_unlocked(Ptr<dma_resv_iter> cursor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_resv_list> dma_resv_list_alloc(@Unsigned int max_fences) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_resv_list_free(Ptr<dma_resv_list> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_resv_replace_fences(Ptr<dma_resv> obj, @Unsigned @OriginalName(value="uint64_t") long context2, Ptr<dma_fence> replacement, dma_resv_usage usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_resv_reserve_fences(Ptr<dma_resv> obj, @Unsigned int num_fences) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_resv_set_deadline(Ptr<dma_resv> obj, dma_resv_usage usage, @OriginalName(value="ktime_t") long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_resv_test_signaled(Ptr<dma_resv> obj, dma_resv_usage usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dma_resv_wait_timeout(Ptr<dma_resv> obj, dma_resv_usage usage, boolean intr, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_run_dependencies(Ptr<dma_async_tx_descriptor> tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static dma_status dma_sync_wait(Ptr<dma_chan> chan, @OriginalName(value="dma_cookie_t") int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static dma_status dma_wait_for_async_tx(Ptr<dma_async_tx_descriptor> tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dma_alloc_from_pool($arg1, $arg2, $arg3, $arg4, (_Bool (*)(struct device*, long long unsigned int, long unsigned int))$arg5)")
    public static Ptr<runtime.page> __dma_alloc_from_pool(Ptr<runtime.device> dev, @Unsigned long size, Ptr<GenDefinitions.gen_pool> pool, Ptr<Ptr<?>> cpu_addr, Ptr<?> phys_addr_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<GenDefinitions.gen_pool> __dma_atomic_pool_init(@Unsigned long pool_size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __dma_fence_enable_signaling(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_alloc_from_pool($arg1, $arg2, $arg3, $arg4, (_Bool (*)(struct device*, long long unsigned int, long unsigned int))$arg5)")
    public static Ptr<runtime.page> dma_alloc_from_pool(Ptr<runtime.device> dev, @Unsigned long size, Ptr<Ptr<?>> cpu_addr, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<?> phys_addr_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_atomic_pool_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_fence_add_callback(Ptr<dma_fence> fence, Ptr<dma_fence_cb> cb, @OriginalName(value="dma_fence_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_fence_allocate_private_stub(@OriginalName(value="ktime_t") long timestamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dma_fence_context_alloc(@Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dma_fence_default_wait(Ptr<dma_fence> fence, boolean intr, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_default_wait_cb(Ptr<dma_fence> fence, Ptr<dma_fence_cb> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_describe(Ptr<dma_fence> fence, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_enable_sw_signaling(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_free(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_fence_get_status(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_fence_get_stub() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dma_fence_init($arg1, (const struct dma_fence_ops*)$arg2, $arg3, $arg4, $arg5)")
    public static void dma_fence_init(Ptr<dma_fence> fence, Ptr<dma_fence_ops> ops, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock, @Unsigned long context2, @Unsigned long seqno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_fence_remove_callback(Ptr<dma_fence> fence, Ptr<dma_fence_cb> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_set_deadline(Ptr<dma_fence> fence, @OriginalName(value="ktime_t") long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_fence_signal(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_fence_signal_locked(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_fence_signal_timestamp(Ptr<dma_fence> fence, @OriginalName(value="ktime_t") long timestamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_fence_signal_timestamp_locked(Ptr<dma_fence> fence, @OriginalName(value="ktime_t") long timestamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dma_fence_stub_get_name($arg1))")
    public static String dma_fence_stub_get_name(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dma_fence_wait_any_timeout(Ptr<Ptr<dma_fence>> fences, @Unsigned @OriginalName(value="uint32_t") int count, boolean intr, long timeout, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dma_fence_wait_timeout(Ptr<dma_fence> fence, boolean intr, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_free_desc_resource(Ptr<VirtDefinitions.virt_dma_desc> vdesc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_free_from_pool(Ptr<runtime.device> dev, Ptr<?> start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn dma_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> __dma_alloc_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, dma_data_direction dir, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> __dma_fence_unwrap_merge(@Unsigned int num_fences, Ptr<Ptr<dma_fence>> fences, Ptr<dma_fence_unwrap> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dma_free_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<runtime.page> page2, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dma_map_cont(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> start, int nelems, Ptr<runtime.scatterlist> sout, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dma_map_sg_attrs(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __dma_need_sync(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dma_sync_sg_for_cpu(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nelems, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dma_sync_sg_for_device(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nelems, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dma_sync_single_for_cpu(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dma_sync_single_for_device(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_addressing_limited(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dma_alloc_attrs(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, @Unsigned @OriginalName(value="gfp_t") int flag, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> dma_alloc_noncontiguous(Ptr<runtime.device> dev, @Unsigned long size, dma_data_direction dir, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> dma_alloc_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, dma_data_direction dir, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_can_mmap(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence_array> dma_fence_array_alloc(int num_fences) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_array_cb_func(Ptr<dma_fence> f, Ptr<dma_fence_cb> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence_array> dma_fence_array_create(int num_fences, Ptr<Ptr<dma_fence>> fences, @Unsigned long context2, @Unsigned int seqno, boolean signal_on_any) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_fence_array_enable_signaling(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_fence_array_first(Ptr<dma_fence> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dma_fence_array_get_driver_name($arg1))")
    public static String dma_fence_array_get_driver_name(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dma_fence_array_get_timeline_name($arg1))")
    public static String dma_fence_array_get_timeline_name(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_array_init(Ptr<dma_fence_array> array, int num_fences, Ptr<Ptr<dma_fence>> fences, @Unsigned long context2, @Unsigned int seqno, boolean signal_on_any) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_fence_array_next(Ptr<dma_fence> head, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_array_release(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_fence_array_set_deadline(Ptr<dma_fence> fence, @OriginalName(value="ktime_t") long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_fence_array_signaled(Ptr<dma_fence> fence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_fence_match_context(Ptr<dma_fence> fence, @Unsigned long context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_fence_unwrap_first(Ptr<dma_fence> head, Ptr<dma_fence_unwrap> cursor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dma_fence> dma_fence_unwrap_next(Ptr<dma_fence_unwrap> cursor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_free_attrs(Ptr<runtime.device> dev, @Unsigned long size, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_free_noncontiguous(Ptr<runtime.device> dev, @Unsigned long size, Ptr<SgDefinitions.sg_table> sgt, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_free_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<runtime.page> page2, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dma_get_merge_boundary(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dma_get_required_mask(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_get_sgtable_attrs(Ptr<runtime.device> dev, Ptr<SgDefinitions.sg_table> sgt, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long dma_map_page_attrs(Ptr<runtime.device> dev, Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long size, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long dma_map_resource(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, @Unsigned long size, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dma_map_sg_attrs(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_map_sgtable(Ptr<runtime.device> dev, Ptr<SgDefinitions.sg_table> sgt, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dma_mask_bits_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dma_max_mapping_size(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_mmap_attrs(Ptr<runtime.device> dev, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_mmap_noncontiguous(Ptr<runtime.device> dev, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long size, Ptr<SgDefinitions.sg_table> sgt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_mmap_pages(Ptr<runtime.device> dev, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long size, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dma_opt_mapping_size(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dma_pci_p2pdma_supported(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="pgprot_t") runtime.pgprot dma_pgprot(Ptr<runtime.device> dev,  @OriginalName(value="pgprot_t") runtime.pgprot prot, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_set_coherent_mask(Ptr<runtime.device> dev, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dma_set_mask(Ptr<runtime.device> dev, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_unmap_page_attrs(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_unmap_resource(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned long size, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_unmap_sg_attrs(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dma_vmap_noncontiguous(Ptr<runtime.device> dev, @Unsigned long size, Ptr<SgDefinitions.sg_table> sgt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dma_vunmap_noncontiguous(Ptr<runtime.device> dev, Ptr<?> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dma_resv_list")
    @NotUsableInJava
    public static class dma_resv_list
    extends Struct {
        public misc.callback_head rcu;
        public @Unsigned int num_fences;
        public @Unsigned int max_fences;
        public Ptr<dma_fence> @Size(value=0) [] table;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_chan_tbl_ent")
    @NotUsableInJava
    public static class dma_chan_tbl_ent
    extends Struct {
        public Ptr<dma_chan> chan;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_heap_allocation_data")
    @NotUsableInJava
    public static class dma_heap_allocation_data
    extends Struct {
        public @Unsigned long len;
        public @Unsigned int fd;
        public @Unsigned int fd_flags;
        public @Unsigned long heap_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_heap")
    @NotUsableInJava
    public static class dma_heap
    extends Struct {
        public String name;
        public Ptr<dma_heap_ops> ops;
        public Ptr<?> priv;
        public @Unsigned @OriginalName(value="dev_t") int heap_devt;
        public ListDefinitions.list_head list;
        public runtime.cdev heap_cdev;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf_import_sync_file")
    @NotUsableInJava
    public static class dma_buf_import_sync_file
    extends Struct {
        public @Unsigned int flags;
        public int fd;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf_export_sync_file")
    @NotUsableInJava
    public static class dma_buf_export_sync_file
    extends Struct {
        public @Unsigned int flags;
        public int fd;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf_sync")
    @NotUsableInJava
    public static class dma_buf_sync
    extends Struct {
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_resv_iter")
    @NotUsableInJava
    public static class dma_resv_iter
    extends Struct {
        public Ptr<dma_resv> obj;
        public dma_resv_usage usage;
        public Ptr<dma_fence> fence;
        public dma_resv_usage fence_usage;
        public @Unsigned int index;
        public Ptr<dma_resv_list> fences;
        public @Unsigned int num_fences;
        public boolean is_restarted;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_page")
    @NotUsableInJava
    public static class dma_page
    extends Struct {
        public ListDefinitions.list_head page_list;
        public Ptr<?> vaddr;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_pool")
    @NotUsableInJava
    public static class dma_pool
    extends Struct {
        public ListDefinitions.list_head page_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<dma_block> next_block;
        public @Unsigned long nr_blocks;
        public @Unsigned long nr_active;
        public @Unsigned long nr_pages;
        public Ptr<runtime.device> dev;
        public @Unsigned int size;
        public @Unsigned int allocation;
        public @Unsigned int boundary;
        public char @Size(value=32) [] name;
        public ListDefinitions.list_head pools;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_block")
    @NotUsableInJava
    public static class dma_block
    extends Struct {
        public Ptr<dma_block> next_block;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
    }

    @Type(noCCodeGeneration=true, cType="enum dma_resv_usage")
    public static enum dma_resv_usage implements Enum<dma_resv_usage>,
    TypedEnum<dma_resv_usage, Integer>
    {
        DMA_RESV_USAGE_KERNEL,
        DMA_RESV_USAGE_WRITE,
        DMA_RESV_USAGE_READ,
        DMA_RESV_USAGE_BOOKKEEP;

    }

    @Type(noCCodeGeneration=true, cType="struct dma_resv")
    @NotUsableInJava
    public static class dma_resv
    extends Struct {
        public misc.ww_mutex lock;
        public Ptr<dma_resv_list> fences;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_heap_attachment")
    @NotUsableInJava
    public static class dma_heap_attachment
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<SgDefinitions.sg_table> table;
        public ListDefinitions.list_head list;
        public boolean mapped;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_heap_export_info")
    @NotUsableInJava
    public static class dma_heap_export_info
    extends Struct {
        public String name;
        public Ptr<dma_heap_ops> ops;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_heap_ops")
    @NotUsableInJava
    public static class dma_heap_ops
    extends Struct {
        public Ptr<?> allocate;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf_export_info")
    @NotUsableInJava
    public static class dma_buf_export_info
    extends Struct {
        public String exp_name;
        public Ptr<runtime.module> owner;
        public Ptr<dma_buf_ops> ops;
        public @Unsigned long size;
        public int flags;
        public Ptr<dma_resv> resv;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf_attach_ops")
    @NotUsableInJava
    public static class dma_buf_attach_ops
    extends Struct {
        public boolean allow_peer2peer;
        public Ptr<?> move_notify;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf_poll_cb_t")
    @NotUsableInJava
    public static class dma_buf_poll_cb_t
    extends Struct {
        public dma_fence_cb cb;
        public Ptr< @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> poll;
        public @Unsigned @OriginalName(value="__poll_t") int active;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf_attachment")
    @NotUsableInJava
    public static class dma_buf_attachment
    extends Struct {
        public Ptr<dma_buf> dmabuf;
        public Ptr<runtime.device> dev;
        public ListDefinitions.list_head node;
        public Ptr<SgDefinitions.sg_table> sgt;
        public dma_data_direction dir;
        public boolean peer2peer;
        public Ptr<dma_buf_attach_ops> importer_ops;
        public Ptr<?> importer_priv;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf")
    @NotUsableInJava
    public static class dma_buf
    extends Struct {
        public @Unsigned long size;
        public Ptr<runtime.file> file;
        public ListDefinitions.list_head attachments;
        public Ptr<dma_buf_ops> ops;
        public @Unsigned int vmapping_counter;
        public misc.iosys_map vmap_ptr;
        public String exp_name;
        public String name;
        public  @OriginalName(value="spinlock_t") runtime.spinlock name_lock;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head list_node;
        public Ptr<?> priv;
        public Ptr<dma_resv> resv;
        public  @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head poll;
        public dma_buf_poll_cb_t cb_in;
        public dma_buf_poll_cb_t cb_out;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_buf_ops")
    @NotUsableInJava
    public static class dma_buf_ops
    extends Struct {
        public boolean cache_sgt_mapping;
        public Ptr<?> attach;
        public Ptr<?> detach;
        public Ptr<?> pin;
        public Ptr<?> unpin;
        public Ptr<?> map_dma_buf;
        public Ptr<?> unmap_dma_buf;
        public Ptr<?> release;
        public Ptr<?> begin_cpu_access;
        public Ptr<?> end_cpu_access;
        public Ptr<?> mmap;
        public Ptr<?> vmap;
        public Ptr<?> vunmap;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_fence_unwrap")
    @NotUsableInJava
    public static class dma_fence_unwrap
    extends Struct {
        public Ptr<dma_fence> chain;
        public Ptr<dma_fence> array;
        public @Unsigned int index;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_fence_chain")
    @NotUsableInJava
    public static class dma_fence_chain
    extends Struct {
        public dma_fence base;
        public Ptr<dma_fence> prev;
        public @Unsigned long prev_seqno;
        public Ptr<dma_fence> fence;
        @InlineUnion(value=19453)
        public @InlineUnion(value=19453) dma_fence_cb cb;
        @InlineUnion(value=19453)
        public  @InlineUnion(value=19453) IrqDefinitions.irq_work work;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="enum dma_fence_flag_bits")
    public static enum dma_fence_flag_bits implements Enum<dma_fence_flag_bits>,
    TypedEnum<dma_fence_flag_bits, Integer>
    {
        DMA_FENCE_FLAG_SIGNALED_BIT,
        DMA_FENCE_FLAG_TIMESTAMP_BIT,
        DMA_FENCE_FLAG_ENABLE_SIGNAL_BIT,
        DMA_FENCE_FLAG_USER_BITS;

    }

    @Type(noCCodeGeneration=true, cType="struct dma_fence_array")
    @NotUsableInJava
    public static class dma_fence_array
    extends Struct {
        public dma_fence base;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int num_fences;
        public AtomicDefinitions.atomic_t num_pending;
        public Ptr<Ptr<dma_fence>> fences;
        public IrqDefinitions.irq_work work;
        public dma_fence_array_cb @Size(value=0) [] callbacks;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_fence_array_cb")
    @NotUsableInJava
    public static class dma_fence_array_cb
    extends Struct {
        public dma_fence_cb cb;
        public Ptr<dma_fence_array> array;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_fence_cb")
    @NotUsableInJava
    public static class dma_fence_cb
    extends Struct {
        public ListDefinitions.list_head node;
        public @OriginalName(value="dma_fence_func_t") Ptr<?> func;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_fence_ops")
    @NotUsableInJava
    public static class dma_fence_ops
    extends Struct {
        public boolean use_64bit_seqno;
        public Ptr<?> get_driver_name;
        public Ptr<?> get_timeline_name;
        public Ptr<?> enable_signaling;
        public Ptr<?> signaled;
        public Ptr<?> wait;
        public Ptr<?> release;
        public Ptr<?> fence_value_str;
        public Ptr<?> timeline_value_str;
        public Ptr<?> set_deadline;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_fence")
    @NotUsableInJava
    public static class dma_fence
    extends Struct {
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
        public Ptr<dma_fence_ops> ops;
        @InlineUnion(value=19423)
        public  @InlineUnion(value=19423) ListDefinitions.list_head cb_list;
        @InlineUnion(value=19423)
        public @InlineUnion(value=19423) @OriginalName(value="ktime_t") long timestamp;
        @InlineUnion(value=19423)
        public  @InlineUnion(value=19423) misc.callback_head rcu;
        public @Unsigned long context;
        public @Unsigned long seqno;
        public @Unsigned long flags;
        public runtime.kref refcount;
        public int error;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_sgt_handle")
    @NotUsableInJava
    public static class dma_sgt_handle
    extends Struct {
        public SgDefinitions.sg_table sgt;
        public Ptr<Ptr<runtime.page>> pages;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_pte")
    @NotUsableInJava
    public static class dma_pte
    extends Struct {
        public @Unsigned long val;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_filter")
    @NotUsableInJava
    public static class dma_filter
    extends Struct {
        public @OriginalName(value="dma_filter_fn") Ptr<?> fn;
        public int mapcnt;
        public Ptr<dma_slave_map> map;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_slave_map")
    @NotUsableInJava
    public static class dma_slave_map
    extends Struct {
        public String devname;
        public String slave;
        public Ptr<?> param;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_tx_state")
    @NotUsableInJava
    public static class dma_tx_state
    extends Struct {
        public @OriginalName(value="dma_cookie_t") int last;
        public @OriginalName(value="dma_cookie_t") int used;
        public @Unsigned int residue;
        public @Unsigned int in_flight_bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_async_tx_descriptor")
    @NotUsableInJava
    public static class dma_async_tx_descriptor
    extends Struct {
        public @OriginalName(value="dma_cookie_t") int cookie;
        public dma_ctrl_flags flags;
        public @Unsigned @OriginalName(value="dma_addr_t") long phys;
        public Ptr<dma_chan> chan;
        public Ptr<?> tx_submit;
        public Ptr<?> desc_free;
        public @OriginalName(value="dma_async_tx_callback") Ptr<?> callback;
        public @OriginalName(value="dma_async_tx_callback_result") Ptr<?> callback_result;
        public Ptr<?> callback_param;
        public Ptr<DmaengineDefinitions.dmaengine_unmap_data> unmap;
        public dma_desc_metadata_mode desc_metadata_mode;
        public Ptr<dma_descriptor_metadata_ops> metadata_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_descriptor_metadata_ops")
    @NotUsableInJava
    public static class dma_descriptor_metadata_ops
    extends Struct {
        public Ptr<?> attach;
        public Ptr<?> get_ptr;
        public Ptr<?> set_len;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_slave_caps")
    @NotUsableInJava
    public static class dma_slave_caps
    extends Struct {
        public @Unsigned int src_addr_widths;
        public @Unsigned int dst_addr_widths;
        public @Unsigned int directions;
        public @Unsigned int min_burst;
        public @Unsigned int max_burst;
        public @Unsigned int max_sg_burst;
        public boolean cmd_pause;
        public boolean cmd_resume;
        public boolean cmd_terminate;
        public dma_residue_granularity residue_granularity;
        public boolean descriptor_reuse;
    }

    @Type(noCCodeGeneration=true, cType="enum dma_residue_granularity")
    public static enum dma_residue_granularity implements Enum<dma_residue_granularity>,
    TypedEnum<dma_residue_granularity, Integer>
    {
        DMA_RESIDUE_GRANULARITY_DESCRIPTOR,
        DMA_RESIDUE_GRANULARITY_SEGMENT,
        DMA_RESIDUE_GRANULARITY_BURST;

    }

    @Type(noCCodeGeneration=true, cType="struct dma_slave_config")
    @NotUsableInJava
    public static class dma_slave_config
    extends Struct {
        public dma_transfer_direction direction;
        public @Unsigned @OriginalName(value="phys_addr_t") long src_addr;
        public @Unsigned @OriginalName(value="phys_addr_t") long dst_addr;
        public dma_slave_buswidth src_addr_width;
        public dma_slave_buswidth dst_addr_width;
        public @Unsigned int src_maxburst;
        public @Unsigned int dst_maxburst;
        public @Unsigned int src_port_window_size;
        public @Unsigned int dst_port_window_size;
        public boolean device_fc;
        public Ptr<?> peripheral_config;
        public @Unsigned long peripheral_size;
    }

    @Type(noCCodeGeneration=true, cType="enum dma_slave_buswidth")
    public static enum dma_slave_buswidth implements Enum<dma_slave_buswidth>,
    TypedEnum<dma_slave_buswidth, Integer>
    {
        DMA_SLAVE_BUSWIDTH_UNDEFINED,
        DMA_SLAVE_BUSWIDTH_1_BYTE,
        DMA_SLAVE_BUSWIDTH_2_BYTES,
        DMA_SLAVE_BUSWIDTH_3_BYTES,
        DMA_SLAVE_BUSWIDTH_4_BYTES,
        DMA_SLAVE_BUSWIDTH_8_BYTES,
        DMA_SLAVE_BUSWIDTH_16_BYTES,
        DMA_SLAVE_BUSWIDTH_32_BYTES,
        DMA_SLAVE_BUSWIDTH_64_BYTES,
        DMA_SLAVE_BUSWIDTH_128_BYTES;

    }

    @Type(noCCodeGeneration=true, cType="struct dma_chan_dev")
    @NotUsableInJava
    public static class dma_chan_dev
    extends Struct {
        public Ptr<dma_chan> chan;
        public runtime.device device;
        public int dev_id;
        public boolean chan_dma_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_device")
    @NotUsableInJava
    public static class dma_device
    extends Struct {
        public runtime.kref ref;
        public @Unsigned int chancnt;
        public @Unsigned int privatecnt;
        public ListDefinitions.list_head channels;
        public ListDefinitions.list_head global_node;
        public dma_filter filter;
        public dma_cap_mask_t cap_mask;
        public dma_desc_metadata_mode desc_metadata_modes;
        public @Unsigned short max_xor;
        public @Unsigned short max_pq;
        public DmaengineDefinitions.dmaengine_alignment copy_align;
        public DmaengineDefinitions.dmaengine_alignment xor_align;
        public DmaengineDefinitions.dmaengine_alignment pq_align;
        public DmaengineDefinitions.dmaengine_alignment fill_align;
        public int dev_id;
        public Ptr<runtime.device> dev;
        public Ptr<runtime.module> owner;
        public runtime.ida chan_ida;
        public @Unsigned int src_addr_widths;
        public @Unsigned int dst_addr_widths;
        public @Unsigned int directions;
        public @Unsigned int min_burst;
        public @Unsigned int max_burst;
        public @Unsigned int max_sg_burst;
        public boolean descriptor_reuse;
        public dma_residue_granularity residue_granularity;
        public Ptr<?> device_alloc_chan_resources;
        public Ptr<?> device_router_config;
        public Ptr<?> device_free_chan_resources;
        public Ptr<?> device_prep_dma_memcpy;
        public Ptr<?> device_prep_dma_xor;
        public Ptr<?> device_prep_dma_xor_val;
        public Ptr<?> device_prep_dma_pq;
        public Ptr<?> device_prep_dma_pq_val;
        public Ptr<?> device_prep_dma_memset;
        public Ptr<?> device_prep_dma_memset_sg;
        public Ptr<?> device_prep_dma_interrupt;
        public Ptr<?> device_prep_peripheral_dma_vec;
        public Ptr<?> device_prep_slave_sg;
        public Ptr<?> device_prep_dma_cyclic;
        public Ptr<?> device_prep_interleaved_dma;
        public Ptr<?> device_prep_dma_imm_data;
        public Ptr<?> device_caps;
        public Ptr<?> device_config;
        public Ptr<?> device_pause;
        public Ptr<?> device_resume;
        public Ptr<?> device_terminate_all;
        public Ptr<?> device_synchronize;
        public Ptr<?> device_tx_status;
        public Ptr<?> device_issue_pending;
        public Ptr<?> device_release;
        public Ptr<?> dbg_summary_show;
        public Ptr<runtime.dentry> dbg_dev_root;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_router")
    @NotUsableInJava
    public static class dma_router
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<?> route_free;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_chan_percpu")
    @NotUsableInJava
    public static class dma_chan_percpu
    extends Struct {
        public @Unsigned long memcpy_count;
        public @Unsigned long bytes_transferred;
    }

    @Type(noCCodeGeneration=true, cType="enum dma_desc_metadata_mode")
    public static enum dma_desc_metadata_mode implements Enum<dma_desc_metadata_mode>,
    TypedEnum<dma_desc_metadata_mode, Integer>
    {
        DESC_METADATA_NONE,
        DESC_METADATA_CLIENT,
        DESC_METADATA_ENGINE;

    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int bits[1]; }")
    @NotUsableInJava
    public static class dma_cap_mask_t
    extends Struct {
        public @Unsigned long @Size(value=1) [] bits;
    }

    @Type(noCCodeGeneration=true, cType="enum dma_ctrl_flags")
    public static enum dma_ctrl_flags implements Enum<dma_ctrl_flags>,
    TypedEnum<dma_ctrl_flags, Integer>
    {
        DMA_PREP_INTERRUPT,
        DMA_CTRL_ACK,
        DMA_PREP_PQ_DISABLE_P,
        DMA_PREP_PQ_DISABLE_Q,
        DMA_PREP_CONTINUE,
        DMA_PREP_FENCE,
        DMA_CTRL_REUSE,
        DMA_PREP_CMD,
        DMA_PREP_REPEAT,
        DMA_PREP_LOAD_EOT;

    }

    @Type(noCCodeGeneration=true, cType="struct dma_vec")
    @NotUsableInJava
    public static class dma_vec
    extends Struct {
        public @Unsigned @OriginalName(value="dma_addr_t") long addr;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_interleaved_template")
    @NotUsableInJava
    public static class dma_interleaved_template
    extends Struct {
        public @Unsigned @OriginalName(value="dma_addr_t") long src_start;
        public @Unsigned @OriginalName(value="dma_addr_t") long dst_start;
        public dma_transfer_direction dir;
        public boolean src_inc;
        public boolean dst_inc;
        public boolean src_sgl;
        public boolean dst_sgl;
        public @Unsigned long numf;
        public @Unsigned long frame_size;
        public DataDefinitions.data_chunk @Size(value=0) [] sgl;
    }

    @Type(noCCodeGeneration=true, cType="enum dma_transfer_direction")
    public static enum dma_transfer_direction implements Enum<dma_transfer_direction>,
    TypedEnum<dma_transfer_direction, Integer>
    {
        DMA_MEM_TO_MEM,
        DMA_MEM_TO_DEV,
        DMA_DEV_TO_MEM,
        DMA_DEV_TO_DEV,
        DMA_TRANS_NONE;

    }

    @Type(noCCodeGeneration=true, cType="enum dma_status")
    public static enum dma_status implements Enum<dma_status>,
    TypedEnum<dma_status, Integer>
    {
        DMA_COMPLETE,
        DMA_IN_PROGRESS,
        DMA_PAUSED,
        DMA_ERROR,
        DMA_OUT_OF_ORDER;

    }

    @Type(noCCodeGeneration=true, cType="enum dma_transaction_type")
    public static enum dma_transaction_type implements Enum<dma_transaction_type>,
    TypedEnum<dma_transaction_type, Integer>
    {
        DMA_MEMCPY,
        DMA_XOR,
        DMA_PQ,
        DMA_XOR_VAL,
        DMA_PQ_VAL,
        DMA_MEMSET,
        DMA_MEMSET_SG,
        DMA_INTERRUPT,
        DMA_PRIVATE,
        DMA_ASYNC_TX,
        DMA_SLAVE,
        DMA_CYCLIC,
        DMA_INTERLEAVE,
        DMA_COMPLETION_NO_ORDER,
        DMA_REPEAT,
        DMA_LOAD_EOT,
        DMA_TX_TYPE_END;

    }

    @Type(noCCodeGeneration=true, cType="struct dma_chan")
    @NotUsableInJava
    public static class dma_chan
    extends Struct {
        public int lock;
        public String device_id;
    }

    @Type(noCCodeGeneration=true, cType="struct dma_devres")
    @NotUsableInJava
    public static class dma_devres
    extends Struct {
        public @Unsigned long size;
        public Ptr<?> vaddr;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma_handle;
        public @Unsigned long attrs;
    }

    @Type(noCCodeGeneration=true, cType="enum dma_data_direction")
    public static enum dma_data_direction implements Enum<dma_data_direction>,
    TypedEnum<dma_data_direction, Integer>
    {
        DMA_BIDIRECTIONAL,
        DMA_TO_DEVICE,
        DMA_FROM_DEVICE,
        DMA_NONE;

    }

    @Type(noCCodeGeneration=true, cType="struct dma_map_ops")
    @NotUsableInJava
    public static class dma_map_ops
    extends Struct {
        public Ptr<?> alloc;
        public Ptr<?> free;
        public Ptr<?> alloc_pages_op;
        public Ptr<?> free_pages;
        public Ptr<?> mmap;
        public Ptr<?> get_sgtable;
        public Ptr<?> map_page;
        public Ptr<?> unmap_page;
        public Ptr<?> map_sg;
        public Ptr<?> unmap_sg;
        public Ptr<?> map_resource;
        public Ptr<?> unmap_resource;
        public Ptr<?> sync_single_for_cpu;
        public Ptr<?> sync_single_for_device;
        public Ptr<?> sync_sg_for_cpu;
        public Ptr<?> sync_sg_for_device;
        public Ptr<?> cache_sync;
        public Ptr<?> dma_supported;
        public Ptr<?> get_required_mask;
        public Ptr<?> max_mapping_size;
        public Ptr<?> opt_mapping_size;
        public Ptr<?> get_merge_boundary;
    }
}

