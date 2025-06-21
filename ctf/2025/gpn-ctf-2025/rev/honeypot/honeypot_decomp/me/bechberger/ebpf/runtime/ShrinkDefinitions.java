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
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.ReclaimDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ShrinkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long shrink_show(Ptr<KmemDefinitions.kmem_cache> s2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shrink_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long shrink_store(Ptr<KmemDefinitions.kmem_cache> s2, String buf, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_active_list(@Unsigned long nr_to_scan, Ptr<runtime.lruvec> lruvec2, Ptr<ScanDefinitions.scan_control> sc, LruDefinitions.lru_list lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shrink_all_memory(@Unsigned long nr_to_reclaim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int shrink_folio_list(Ptr<ListDefinitions.list_head> folio_list, Ptr<misc.pglist_data> pgdat, Ptr<ScanDefinitions.scan_control> sc, Ptr<ReclaimDefinitions.reclaim_stat> stat2, boolean ignore_references) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shrink_inactive_list(@Unsigned long nr_to_scan, Ptr<runtime.lruvec> lruvec2, Ptr<ScanDefinitions.scan_control> sc, LruDefinitions.lru_list lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_lruvec(Ptr<runtime.lruvec> lruvec2, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_many(Ptr<misc.pglist_data> pgdat, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_node(Ptr< @OriginalName(value="pg_data_t") misc.pglist_data> pgdat, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_node_memcgs(Ptr< @OriginalName(value="pg_data_t") misc.pglist_data> pgdat, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shrink_one(Ptr<runtime.lruvec> lruvec2, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shrink_memcg(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static LruDefinitions.lru_status shrink_memcg_cb(Ptr<ListDefinitions.list_head> item, Ptr<ListDefinitions.list_lru_one> l, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shrink_slab(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, int nid, Ptr<MemDefinitions.mem_cgroup> memcg, int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shrink_slab_memcg(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, int nid, Ptr<MemDefinitions.mem_cgroup> memcg, int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_worker(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_dcache_for_umount(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_dcache_parent(Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_dcache_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shrink_dentry_list(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shrink_huge_zero_page_count(Ptr<runtime.shrinker> shrink, Ptr<shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shrink_huge_zero_page_scan(Ptr<runtime.shrinker> shrink, Ptr<shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct shrink_control")
    @NotUsableInJava
    public static class shrink_control
    extends Struct {
        public @Unsigned @OriginalName(value="gfp_t") int gfp_mask;
        public int nid;
        public @Unsigned long nr_to_scan;
        public @Unsigned long nr_scanned;
        public Ptr<MemDefinitions.mem_cgroup> memcg;
    }
}

