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
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ReclaimDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long reclaim_account_show(Ptr<KmemDefinitions.kmem_cache> s2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reclaim_and_purge_vmap_areas() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reclaim_list_global(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int reclaim_clean_pages_from_list(Ptr<runtime.zone> zone2, Ptr<ListDefinitions.list_head> folio_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int reclaim_folio_list(Ptr<ListDefinitions.list_head> folio_list, Ptr<misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long reclaim_high(Ptr<MemDefinitions.mem_cgroup> memcg, @Unsigned int nr_pages, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long reclaim_pages(Ptr<ListDefinitions.list_head> folio_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reclaim_throttle(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, misc.vmscan_throttle_state reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reclaim_dma_bufs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reclaim_one_dmap_locked(Ptr<runtime.inode> inode2, Ptr<FuseDefinitions.fuse_dax_mapping> dmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct reclaim_stat")
    @NotUsableInJava
    public static class reclaim_stat
    extends Struct {
        public @Unsigned int nr_dirty;
        public @Unsigned int nr_unqueued_dirty;
        public @Unsigned int nr_congested;
        public @Unsigned int nr_writeback;
        public @Unsigned int nr_immediate;
        public @Unsigned int nr_pageout;
        public @Unsigned int @Size(value=2) [] nr_activate;
        public @Unsigned int nr_ref_keep;
        public @Unsigned int nr_unmap_fail;
        public @Unsigned int nr_lazyfree_fail;
        public @Unsigned int nr_demoted;
    }

    @Type(noCCodeGeneration=true, cType="struct reclaim_state")
    @NotUsableInJava
    public static class reclaim_state
    extends Struct {
        public @Unsigned long reclaimed;
        public Ptr<LruDefinitions.lru_gen_mm_walk> mm_walk;
    }
}

