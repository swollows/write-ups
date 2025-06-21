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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class LruDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> lru_gen_eviction(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_refault(Ptr<runtime.folio> folio2, Ptr<?> shadow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean lru_gen_add_folio(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2, boolean reclaiming) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_add_mm(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_age_node(Ptr<misc.pglist_data> pgdat, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_change_state(boolean enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean lru_gen_del_folio(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2, boolean reclaiming) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_del_mm(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_exit_memcg(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_init_lruvec(Ptr<runtime.lruvec> lruvec2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_init_memcg(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_init_pgdat(Ptr<misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean lru_gen_look_around(Ptr<PageDefinitions.page_vma_mapped_walk> pvmw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_migrate_mm(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_offline_memcg(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_online_memcg(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_release_memcg(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_rotate_memcg(Ptr<runtime.lruvec> lruvec2, int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> lru_gen_seq_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lru_gen_seq_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lru_gen_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> lru_gen_seq_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_seq_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lru_gen_seq_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long lru_gen_seq_write(Ptr<runtime.file> file2, String src, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_gen_soft_reclaim(Ptr<MemDefinitions.mem_cgroup> memcg, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __lru_add_drain_all(boolean force_all_cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_activate(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_add(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_add_drain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_add_drain_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_add_drain_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_add_drain_cpu_zone(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_add_drain_per_cpu(Ptr<misc.work_struct> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_cache_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_deactivate(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_deactivate_file(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_lazyfree(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_move_tail(Ptr<runtime.lruvec> lruvec2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_note_cost(Ptr<runtime.lruvec> lruvec2, boolean file2, @Unsigned int nr_io, @Unsigned int nr_rotated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lru_note_cost_refault(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum lru_status")
    public static enum lru_status implements Enum<lru_status>,
    TypedEnum<lru_status, Integer>
    {
        LRU_REMOVED,
        LRU_REMOVED_RETRY,
        LRU_ROTATE,
        LRU_SKIP,
        LRU_RETRY,
        LRU_STOP;

    }

    @Type(noCCodeGeneration=true, cType="enum lru_list")
    public static enum lru_list implements Enum<lru_list>,
    TypedEnum<lru_list, Integer>
    {
        LRU_INACTIVE_ANON,
        LRU_ACTIVE_ANON,
        LRU_INACTIVE_FILE,
        LRU_ACTIVE_FILE,
        LRU_UNEVICTABLE,
        NR_LRU_LISTS;

    }

    @Type(noCCodeGeneration=true, cType="struct lru_gen_memcg")
    @NotUsableInJava
    public static class lru_gen_memcg
    extends Struct {
        public @Unsigned long seq;
        public @Unsigned long @Size(value=3) [] nr_memcgs;
        public misc.hlist_nulls_head @Size(value=24) [] fifo;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct lru_gen_mm_walk")
    @NotUsableInJava
    public static class lru_gen_mm_walk
    extends Struct {
        public Ptr<runtime.lruvec> lruvec;
        public @Unsigned long seq;
        public @Unsigned long next_addr;
        public int @Size(value=40) [] nr_pages;
        public int @Size(value=4) [] mm_stats;
        public int batched;
        public boolean can_swap;
        public boolean force_scan;
    }

    @Type(noCCodeGeneration=true, cType="struct lru_gen_mm_state")
    @NotUsableInJava
    public static class lru_gen_mm_state
    extends Struct {
        public @Unsigned long seq;
        public Ptr<ListDefinitions.list_head> head;
        public Ptr<ListDefinitions.list_head> tail;
        public Ptr<@Unsigned Long> @Size(value=2) [] filters;
        public @Unsigned long @Size(value=4) [] stats;
    }

    @Type(noCCodeGeneration=true, cType="struct lru_gen_folio")
    @NotUsableInJava
    public static class lru_gen_folio
    extends Struct {
        public @Unsigned long max_seq;
        public @Unsigned long @Size(value=2) [] min_seq;
        public @Unsigned long @Size(value=4) [] timestamps;
        public ListDefinitions.list_head @Size(value=40) [] folios;
        public long @Size(value=40) [] nr_pages;
        public @Unsigned long @Size(value=8) [] avg_refaulted;
        public @Unsigned long @Size(value=8) [] avg_total;
        public @Unsigned long @Size(value=6) [] _protected;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=8) [] evicted;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=8) [] refaulted;
        public boolean enabled;
        public char gen;
        public char seg;
        public misc.hlist_nulls_node list;
    }

    @Type(noCCodeGeneration=true, cType="struct lru_gen_mm_list")
    @NotUsableInJava
    public static class lru_gen_mm_list
    extends Struct {
        public ListDefinitions.list_head fifo;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct list_head list; long unsigned int bitmap; struct mem_cgroup *memcg; }")
    @NotUsableInJava
    public static class lru_gen_of_anon_member_of_mm_struct
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long bitmap;
        public Ptr<MemDefinitions.mem_cgroup> memcg;
    }
}

