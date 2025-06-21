/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.ObjDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MemcgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memcg_alloc_abort_single(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __memcg_kmem_charge_page(Ptr<runtime.page> page2, @Unsigned @OriginalName(value="gfp_t") int gfp, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __memcg_kmem_uncharge_page(Ptr<runtime.page> page2, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __memcg_slab_free_hook(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, Ptr<Ptr<?>> p, int objects, Ptr<misc.slabobj_ext> obj_exts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __memcg_slab_post_alloc_hook(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<ListDefinitions.list_lru> lru, @Unsigned @OriginalName(value="gfp_t") int flags, @Unsigned long size, Ptr<Ptr<?>> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memcg_charge_kernel_stack(Ptr<VmDefinitions.vm_struct> vm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memcg_events(Ptr<MemDefinitions.mem_cgroup> memcg, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memcg_events_local(Ptr<MemDefinitions.mem_cgroup> memcg, int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memcg_hotplug_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memcg_page_state(Ptr<MemDefinitions.mem_cgroup> memcg, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memcg_page_state_local(Ptr<MemDefinitions.mem_cgroup> memcg, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memcg_page_state_local_output(Ptr<MemDefinitions.mem_cgroup> memcg, int item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memcg_page_state_output(Ptr<MemDefinitions.mem_cgroup> memcg, int item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memcg_page_state_output_unit(int item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memcg_reparent_objcgs(Ptr<MemDefinitions.mem_cgroup> memcg, Ptr<MemDefinitions.mem_cgroup> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memcg_stat_format(Ptr<MemDefinitions.mem_cgroup> memcg, Ptr<SeqDefinitions.seq_buf> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.vmpressure> memcg_to_vmpressure(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memcg_destroy_list_lru(Ptr<ListDefinitions.list_lru> lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_lru_memcg> memcg_init_list_lru_one(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memcg_list_lru_alloc(Ptr<MemDefinitions.mem_cgroup> memcg, Ptr<ListDefinitions.list_lru> lru, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memcg_reparent_list_lrus(Ptr<MemDefinitions.mem_cgroup> memcg, Ptr<MemDefinitions.mem_cgroup> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct memcg_stock_pcp")
    @NotUsableInJava
    public static class memcg_stock_pcp
    extends Struct {
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p stock_lock;
        public Ptr<MemDefinitions.mem_cgroup> cached;
        public @Unsigned int nr_pages;
        public Ptr<ObjDefinitions.obj_cgroup> cached_objcg;
        public Ptr<misc.pglist_data> cached_pgdat;
        public @Unsigned int nr_bytes;
        public int nr_slab_reclaimable_b;
        public int nr_slab_unreclaimable_b;
        public misc.work_struct work;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct memcg_vmstats_percpu")
    @NotUsableInJava
    public static class memcg_vmstats_percpu
    extends Struct {
        public @Unsigned int stats_updates;
        public Ptr<memcg_vmstats_percpu> parent;
        public Ptr<memcg_vmstats> vmstats;
        public long @Size(value=38) [] state;
        public @Unsigned long @Size(value=25) [] events;
        public long @Size(value=38) [] state_prev;
        public @Unsigned long @Size(value=25) [] events_prev;
    }

    @Type(noCCodeGeneration=true, cType="struct memcg_vmstats")
    @NotUsableInJava
    public static class memcg_vmstats
    extends Struct {
        public long @Size(value=38) [] state;
        public @Unsigned long @Size(value=25) [] events;
        public long @Size(value=38) [] state_local;
        public @Unsigned long @Size(value=25) [] events_local;
        public long @Size(value=38) [] state_pending;
        public @Unsigned long @Size(value=25) [] events_pending;
        public misc.atomic64_t stats_updates;
    }

    @Type(noCCodeGeneration=true, cType="enum memcg_stat_item")
    public static enum memcg_stat_item implements Enum<memcg_stat_item>,
    TypedEnum<memcg_stat_item, Integer>
    {
        MEMCG_SWAP,
        MEMCG_SOCK,
        MEMCG_PERCPU_B,
        MEMCG_VMALLOC,
        MEMCG_KMEM,
        MEMCG_ZSWAP_B,
        MEMCG_ZSWAPPED,
        MEMCG_NR_STAT;

    }

    @Type(noCCodeGeneration=true, cType="enum memcg_memory_event")
    public static enum memcg_memory_event implements Enum<memcg_memory_event>,
    TypedEnum<memcg_memory_event, Integer>
    {
        MEMCG_LOW,
        MEMCG_HIGH,
        MEMCG_MAX,
        MEMCG_OOM,
        MEMCG_OOM_KILL,
        MEMCG_OOM_GROUP_KILL,
        MEMCG_SWAP_HIGH,
        MEMCG_SWAP_MAX,
        MEMCG_SWAP_FAIL,
        MEMCG_NR_MEMORY_EVENTS;

    }

    @Type(noCCodeGeneration=true, cType="struct memcg_cgwb_frn")
    @NotUsableInJava
    public static class memcg_cgwb_frn
    extends Struct {
        public @Unsigned long bdi_id;
        public int memcg_id;
        public @Unsigned long at;
        public WbDefinitions.wb_completion done;
    }
}

