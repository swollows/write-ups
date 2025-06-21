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
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.CacheDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.WqDefinitions;
import me.bechberger.ebpf.runtime.XaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NodeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __node_distance(int from, int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __node_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_access_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_add_cache(@Unsigned int nid, Ptr<node_cache_attrs> cache_attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_cache_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_cacheinfo_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<node_access_nodes> node_init_node_access(Ptr<runtime.node> node2, misc.access_coordinate_class access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long node_map_pfn_alignment() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long node_read_distance(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long node_read_meminfo(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long node_read_numastat(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long node_read_vmstat(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_set_perf_attrs(@Unsigned int nid, Ptr<misc.access_coordinate> coord, misc.access_coordinate_class access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_tag_clear(Ptr<runtime.xarray> root, Ptr<XaDefinitions.xa_node> node2, @Unsigned int tag, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __node_reclaim(Ptr<misc.pglist_data> pgdat, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long node_pagecache_reclaimable(Ptr<misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int node_reclaim(Ptr<misc.pglist_data> pgdat, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AmdDefinitions.amd_northbridge> node_to_amd_nb(int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int node_to_pxm(int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean node_dirty_ok(Ptr<misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_get_allowed_targets(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, Ptr<misc.nodemask_t> targets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean node_is_toptier(int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long node_page_state(Ptr<misc.pglist_data> pgdat, node_stat_item item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long node_page_state_pages(Ptr<misc.pglist_data> pgdat, node_stat_item item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long node_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="node_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long node_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_activate_pending_pwq(Ptr<WqDefinitions.wq_node_nr_active> nna, Ptr<misc.worker_pool> caller_pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void node_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct node_memory_type_map")
    @NotUsableInJava
    public static class node_memory_type_map
    extends Struct {
        public Ptr<MemoryDefinitions.memory_dev_type> memtype;
        public int map_count;
    }

    @Type(noCCodeGeneration=true, cType="struct node_hstate")
    @NotUsableInJava
    public static class node_hstate
    extends Struct {
        public Ptr<runtime.kobject> hugepages_kobj;
        public Ptr<runtime.kobject> @Size(value=2) [] hstate_kobjs;
    }

    @Type(noCCodeGeneration=true, cType="struct node_attr")
    @NotUsableInJava
    public static class node_attr
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public node_states state;
    }

    @Type(noCCodeGeneration=true, cType="struct node_cache_info")
    @NotUsableInJava
    public static class node_cache_info
    extends Struct {
        public runtime.device dev;
        public ListDefinitions.list_head node;
        public node_cache_attrs cache_attrs;
    }

    @Type(noCCodeGeneration=true, cType="struct node_access_nodes")
    @NotUsableInJava
    public static class node_access_nodes
    extends Struct {
        public runtime.device dev;
        public ListDefinitions.list_head list_node;
        public @Unsigned int access;
        public misc.access_coordinate coord;
    }

    @Type(noCCodeGeneration=true, cType="struct node_cache_attrs")
    @NotUsableInJava
    public static class node_cache_attrs
    extends Struct {
        public CacheDefinitions.cache_indexing indexing;
        public CacheDefinitions.cache_write_policy write_policy;
        public @Unsigned long size;
        public @Unsigned short line_size;
        public char level;
    }

    @Type(noCCodeGeneration=true, cType="struct node_groups")
    @NotUsableInJava
    public static class node_groups
    extends Struct {
        public @Unsigned int id;
        @InlineUnion(value=15212)
        public @InlineUnion(value=15212) @Unsigned int ngroups;
        @InlineUnion(value=15212)
        public @InlineUnion(value=15212) @Unsigned int ncpus;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int addr; unsigned int mask; }")
    @NotUsableInJava
    public static class node_of_u_of_ocontext
    extends Struct {
        public @Unsigned int addr;
        public @Unsigned int mask;
    }

    @Type(noCCodeGeneration=true, cType="enum node_stat_item")
    public static enum node_stat_item implements Enum<node_stat_item>,
    TypedEnum<node_stat_item, Integer>
    {
        NR_LRU_BASE,
        NR_INACTIVE_ANON,
        NR_ACTIVE_ANON,
        NR_INACTIVE_FILE,
        NR_ACTIVE_FILE,
        NR_UNEVICTABLE,
        NR_SLAB_RECLAIMABLE_B,
        NR_SLAB_UNRECLAIMABLE_B,
        NR_ISOLATED_ANON,
        NR_ISOLATED_FILE,
        WORKINGSET_NODES,
        WORKINGSET_REFAULT_BASE,
        WORKINGSET_REFAULT_ANON,
        WORKINGSET_REFAULT_FILE,
        WORKINGSET_ACTIVATE_BASE,
        WORKINGSET_ACTIVATE_ANON,
        WORKINGSET_ACTIVATE_FILE,
        WORKINGSET_RESTORE_BASE,
        WORKINGSET_RESTORE_ANON,
        WORKINGSET_RESTORE_FILE,
        WORKINGSET_NODERECLAIM,
        NR_ANON_MAPPED,
        NR_FILE_MAPPED,
        NR_FILE_PAGES,
        NR_FILE_DIRTY,
        NR_WRITEBACK,
        NR_WRITEBACK_TEMP,
        NR_SHMEM,
        NR_SHMEM_THPS,
        NR_SHMEM_PMDMAPPED,
        NR_FILE_THPS,
        NR_FILE_PMDMAPPED,
        NR_ANON_THPS,
        NR_VMSCAN_WRITE,
        NR_VMSCAN_IMMEDIATE,
        NR_DIRTIED,
        NR_WRITTEN,
        NR_THROTTLED_WRITTEN,
        NR_KERNEL_MISC_RECLAIMABLE,
        NR_FOLL_PIN_ACQUIRED,
        NR_FOLL_PIN_RELEASED,
        NR_KERNEL_STACK_KB,
        NR_PAGETABLE,
        NR_SECONDARY_PAGETABLE,
        NR_IOMMU_PAGES,
        NR_SWAPCACHE,
        PGPROMOTE_SUCCESS,
        PGPROMOTE_CANDIDATE,
        PGDEMOTE_KSWAPD,
        PGDEMOTE_DIRECT,
        PGDEMOTE_KHUGEPAGED,
        NR_VM_NODE_STAT_ITEMS;

    }

    @Type(noCCodeGeneration=true, cType="enum node_states")
    public static enum node_states implements Enum<node_states>,
    TypedEnum<node_states, Integer>
    {
        N_POSSIBLE,
        N_ONLINE,
        N_NORMAL_MEMORY,
        N_HIGH_MEMORY,
        N_MEMORY,
        N_CPU,
        N_GENERIC_INITIATOR,
        NR_NODE_STATES;

    }
}

