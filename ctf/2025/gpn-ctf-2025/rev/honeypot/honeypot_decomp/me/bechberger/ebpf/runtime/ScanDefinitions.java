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
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.CtDefinitions;
import me.bechberger.ebpf.runtime.DeflateDefinitions;
import me.bechberger.ebpf.runtime.EhciDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.KsmDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.NrDefinitions;
import me.bechberger.ebpf.runtime.ReclaimDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ScanDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long scan_shadow_nodes(Ptr<runtime.shrinker> shrinker2, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scan_folios(Ptr<runtime.lruvec> lruvec2, Ptr<scan_control> sc, int type2, int tier, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scan_movable_pages(@Unsigned long start, @Unsigned long end, Ptr<@Unsigned Long> movable_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> scan_positives(Ptr<runtime.dentry> cursor, Ptr<Ptr<misc.hlist_node>> p, @OriginalName(value="loff_t") long count, Ptr<runtime.dentry> last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scan_store((const struct bus_type*)$arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long scan_store(Ptr<BusDefinitions.bus_type> bus, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long scan_allocate(Ptr<NdDefinitions.nd_region> nd_region2, Ptr<NdDefinitions.nd_mapping> nd_mapping2, Ptr<NdDefinitions.nd_label_id> label_id, @Unsigned @OriginalName(value="resource_size_t") long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scan_free(Ptr<NdDefinitions.nd_region> nd_region2, Ptr<NdDefinitions.nd_mapping> nd_mapping2, Ptr<NdDefinitions.nd_label_id> label_id, @Unsigned @OriginalName(value="resource_size_t") long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scan_isoc(Ptr<EhciDefinitions.ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<runtime.device>> scan_labels(Ptr<NdDefinitions.nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long scan_sleep_millisecs_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scan_sleep_millisecs_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long scan_sleep_millisecs_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scan_tree(Ptr<DeflateDefinitions.deflate_state> s2, Ptr<CtDefinitions.ct_data_s> tree, int max_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scan_containers(Ptr<Character> ucode, @Unsigned long size, Ptr<misc.cont_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scan_for_dmi_ipmi() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<KsmDefinitions.ksm_rmap_item> scan_get_next_rmap_item(Ptr<Ptr<runtime.page>> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scan_swap_map_slots(Ptr<SwapDefinitions.swap_info_struct> si, char usage, int nr, Ptr<misc.swp_entry_t> slots, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scan_time_advisor() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum scan_result")
    public static enum scan_result implements Enum<scan_result>,
    TypedEnum<scan_result, Integer>
    {
        SCAN_FAIL,
        SCAN_SUCCEED,
        SCAN_PMD_NULL,
        SCAN_PMD_NONE,
        SCAN_PMD_MAPPED,
        SCAN_EXCEED_NONE_PTE,
        SCAN_EXCEED_SWAP_PTE,
        SCAN_EXCEED_SHARED_PTE,
        SCAN_PTE_NON_PRESENT,
        SCAN_PTE_UFFD_WP,
        SCAN_PTE_MAPPED_HUGEPAGE,
        SCAN_PAGE_RO,
        SCAN_LACK_REFERENCED_PAGE,
        SCAN_PAGE_NULL,
        SCAN_SCAN_ABORT,
        SCAN_PAGE_COUNT,
        SCAN_PAGE_LRU,
        SCAN_PAGE_LOCK,
        SCAN_PAGE_ANON,
        SCAN_PAGE_COMPOUND,
        SCAN_ANY_PROCESS,
        SCAN_VMA_NULL,
        SCAN_VMA_CHECK,
        SCAN_ADDRESS_RANGE,
        SCAN_DEL_PAGE_LRU,
        SCAN_ALLOC_HUGE_PAGE_FAIL,
        SCAN_CGROUP_CHARGE_FAIL,
        SCAN_TRUNCATED,
        SCAN_PAGE_HAS_PRIVATE,
        SCAN_STORE_FAILED,
        SCAN_COPY_MC,
        SCAN_PAGE_FILLED;

    }

    @Type(noCCodeGeneration=true, cType="enum scan_balance")
    public static enum scan_balance implements Enum<scan_balance>,
    TypedEnum<scan_balance, Integer>
    {
        SCAN_EQUAL,
        SCAN_FRACT,
        SCAN_ANON,
        SCAN_FILE;

    }

    @Type(noCCodeGeneration=true, cType="struct scan_control")
    @NotUsableInJava
    public static class scan_control
    extends Struct {
        public @Unsigned long nr_to_reclaim;
        public Ptr<misc.nodemask_t> nodemask;
        public Ptr<MemDefinitions.mem_cgroup> target_mem_cgroup;
        public @Unsigned long anon_cost;
        public @Unsigned long file_cost;
        public Ptr<Integer> proactive_swappiness;
        public @Unsigned int may_deactivate;
        public @Unsigned int force_deactivate;
        public @Unsigned int skipped_deactivate;
        public @Unsigned int may_writepage;
        public @Unsigned int may_unmap;
        public @Unsigned int may_swap;
        public @Unsigned int no_cache_trim_mode;
        public @Unsigned int cache_trim_mode_failed;
        public @Unsigned int proactive;
        public @Unsigned int memcg_low_reclaim;
        public @Unsigned int memcg_low_skipped;
        public @Unsigned int memcg_full_walk;
        public @Unsigned int hibernation_mode;
        public @Unsigned int compaction_ready;
        public @Unsigned int cache_trim_mode;
        public @Unsigned int file_is_tiny;
        public @Unsigned int no_demotion;
        public @OriginalName(value="s8") byte order;
        public @OriginalName(value="s8") byte priority;
        public @OriginalName(value="s8") byte reclaim_idx;
        public @Unsigned @OriginalName(value="gfp_t") int gfp_mask;
        public @Unsigned long nr_scanned;
        public @Unsigned long nr_reclaimed;
        public NrDefinitions.nr_of_scan_control nr;
        public ReclaimDefinitions.reclaim_state reclaim_state;
    }

    @Type(noCCodeGeneration=true, cType="struct scan_area")
    @NotUsableInJava
    public static class scan_area
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned long size;
    }
}

