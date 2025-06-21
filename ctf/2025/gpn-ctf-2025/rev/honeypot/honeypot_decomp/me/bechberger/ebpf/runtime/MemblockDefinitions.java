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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MemblockDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_free_pages(Ptr<runtime.page> page2, @Unsigned long pfn, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_add(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_add_node(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size, int nid, memblock_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_add_range(Ptr<memblock_type> type2, @Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size, int nid, memblock_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memblock_addrs_overlap(@Unsigned @OriginalName(value="phys_addr_t") long base1, @Unsigned @OriginalName(value="phys_addr_t") long size1, @Unsigned @OriginalName(value="phys_addr_t") long base2, @Unsigned @OriginalName(value="phys_addr_t") long size2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> memblock_alloc_exact_nid_raw(@Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align, @Unsigned @OriginalName(value="phys_addr_t") long min_addr, @Unsigned @OriginalName(value="phys_addr_t") long max_addr, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> memblock_alloc_internal(@Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align, @Unsigned @OriginalName(value="phys_addr_t") long min_addr, @Unsigned @OriginalName(value="phys_addr_t") long max_addr, int nid, boolean exact_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_alloc_range_nid(@Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align, @Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long end, int nid, boolean exact_nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> memblock_alloc_try_nid(@Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align, @Unsigned @OriginalName(value="phys_addr_t") long min_addr, @Unsigned @OriginalName(value="phys_addr_t") long max_addr, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> memblock_alloc_try_nid_raw(@Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align, @Unsigned @OriginalName(value="phys_addr_t") long min_addr, @Unsigned @OriginalName(value="phys_addr_t") long max_addr, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_allow_resize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_cap_memory_range(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_clear_hotplug(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_clear_nomap(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_discard() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_double_array(Ptr<memblock_type> type2, @Unsigned @OriginalName(value="phys_addr_t") long new_area_start, @Unsigned @OriginalName(value="phys_addr_t") long new_area_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_dump(Ptr<memblock_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_dump_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_end_of_DRAM() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_enforce_memory_limit(@Unsigned @OriginalName(value="phys_addr_t") long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memblock_estimated_nr_free_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_find_in_range(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long end, @Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_find_in_range_node(@Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align, @Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long end, int nid, memblock_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_free(Ptr<?> ptr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_free_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_free_late(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_get_current_limit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean memblock_has_mirror() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_insert_region(Ptr<memblock_type> type2, int idx, @Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size, int nid, memblock_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean memblock_is_map_memory(@Unsigned @OriginalName(value="phys_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean memblock_is_memory(@Unsigned @OriginalName(value="phys_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean memblock_is_region_memory(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean memblock_is_region_reserved(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean memblock_is_reserved(@Unsigned @OriginalName(value="phys_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_isolate_range(Ptr<memblock_type> type2, @Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size, Ptr<Integer> start_rgn, Ptr<Integer> end_rgn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_mark_hotplug(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_mark_mirror(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_mark_nomap(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_mem_limit_remove_map(@Unsigned @OriginalName(value="phys_addr_t") long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_merge_regions(Ptr<memblock_type> type2, @Unsigned long start_rgn, @Unsigned long end_rgn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean memblock_overlaps_region(Ptr<memblock_type> type2, @Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_phys_alloc_range(@Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align, @Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_phys_alloc_try_nid(@Unsigned @OriginalName(value="phys_addr_t") long size, @Unsigned @OriginalName(value="phys_addr_t") long align, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_phys_free(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_phys_mem_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_remove(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_remove_range(Ptr<memblock_type> type2, @Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_remove_region(Ptr<memblock_type> type2, @Unsigned long r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_reserve(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_reserved_mark_noinit(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_reserved_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_search_pfn_nid(@Unsigned long pfn, Ptr<@Unsigned Long> start_pfn, Ptr<@Unsigned Long> end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_set_current_limit(@Unsigned @OriginalName(value="phys_addr_t") long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_set_node(@Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size, Ptr<memblock_type> type2, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memblock_setclr_flag(Ptr<memblock_type> type2, @Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned @OriginalName(value="phys_addr_t") long size, int set, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long memblock_start_of_DRAM() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memblock_trim_memory(@Unsigned @OriginalName(value="phys_addr_t") long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean memblock_validate_numa_coverage(@Unsigned long threshold_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct memblock_type")
    @NotUsableInJava
    public static class memblock_type
    extends Struct {
        public @Unsigned long cnt;
        public @Unsigned long max;
        public @Unsigned @OriginalName(value="phys_addr_t") long total_size;
        public Ptr<memblock_region> regions;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct memblock_region")
    @NotUsableInJava
    public static class memblock_region
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long base;
        public @Unsigned @OriginalName(value="phys_addr_t") long size;
        public memblock_flags flags;
        public int nid;
    }

    @Type(noCCodeGeneration=true, cType="enum memblock_flags")
    public static enum memblock_flags implements Enum<memblock_flags>,
    TypedEnum<memblock_flags, Integer>
    {
        MEMBLOCK_NONE,
        MEMBLOCK_HOTPLUG,
        MEMBLOCK_MIRROR,
        MEMBLOCK_NOMAP,
        MEMBLOCK_DRIVER_MANAGED,
        MEMBLOCK_RSRV_NOINIT;

    }
}

