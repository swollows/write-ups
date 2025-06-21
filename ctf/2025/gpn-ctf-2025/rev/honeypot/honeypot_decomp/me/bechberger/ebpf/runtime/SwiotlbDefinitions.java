/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class SwiotlbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IoDefinitions.io_tlb_pool> __swiotlb_find_pool(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long paddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __swiotlb_sync_single_for_cpu(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long tlb_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, Ptr<IoDefinitions.io_tlb_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __swiotlb_sync_single_for_device(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long tlb_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, Ptr<IoDefinitions.io_tlb_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __swiotlb_tbl_unmap_single(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long tlb_addr, @Unsigned long mapping_size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs, Ptr<IoDefinitions.io_tlb_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_adjust_nareas(@Unsigned int nareas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_adjust_size(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IoDefinitions.io_tlb_pool> swiotlb_alloc_pool(Ptr<runtime.device> dev, @Unsigned long minslabs, @Unsigned long nslabs, @Unsigned int nareas, @Unsigned long phys_limit, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_bounce(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long tlb_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, Ptr<IoDefinitions.io_tlb_pool> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swiotlb_create_default_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_dev_init(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_dyn_alloc(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_dyn_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swiotlb_find_slots(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long orig_addr, @Unsigned long alloc_size, @Unsigned int alloc_align_mask, Ptr<Ptr<IoDefinitions.io_tlb_pool>> retpool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_free_tlb(Ptr<?> vaddr, @Unsigned long bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_init(boolean addressing_limit, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_init_io_tlb_pool(Ptr<IoDefinitions.io_tlb_pool> mem, @Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned long nslabs, boolean late_alloc, @Unsigned int nareas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="swiotlb_init_late($arg1, $arg2, (int (*)(void*, long unsigned int))$arg3)")
    public static int swiotlb_init_late(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> remap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="swiotlb_init_remap($arg1, $arg2, (int (*)(void*, long unsigned int))$arg3)")
    public static void swiotlb_init_remap(boolean addressing_limit, @Unsigned int flags, Ptr<?> remap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long swiotlb_map(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long swiotlb_max_mapping_size(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_print_info() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_release_slots(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long tlb_addr, Ptr<IoDefinitions.io_tlb_pool> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swiotlb_search_pool_area(Ptr<runtime.device> dev, Ptr<IoDefinitions.io_tlb_pool> pool, int area_index, @Unsigned @OriginalName(value="phys_addr_t") long orig_addr, @Unsigned long alloc_size, @Unsigned int alloc_align_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long swiotlb_size_or_default() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long swiotlb_tbl_map_single(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long orig_addr, @Unsigned long mapping_size, @Unsigned int alloc_align_mask, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swiotlb_update_mem_attributes() {
        throw new MethodIsBPFRelatedFunction();
    }
}

