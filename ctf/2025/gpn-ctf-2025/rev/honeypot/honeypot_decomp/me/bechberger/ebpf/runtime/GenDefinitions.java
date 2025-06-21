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
import me.bechberger.ebpf.runtime.CtDefinitions;
import me.bechberger.ebpf.runtime.DeflateDefinitions;
import me.bechberger.ebpf.runtime.GnetDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PcpuDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class GenDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gen_estimator_active(Ptr<Ptr<NetDefinitions.net_rate_estimator>> rate_est) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gen_estimator_read(Ptr<Ptr<NetDefinitions.net_rate_estimator>> rate_est, Ptr<GnetDefinitions.gnet_stats_rate_est64> sample2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gen_kill_estimator(Ptr<Ptr<NetDefinitions.net_rate_estimator>> rate_est) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gen_new_estimator(Ptr<GnetDefinitions.gnet_stats_basic_sync> bstats, Ptr<GnetDefinitions.gnet_stats_basic_sync> cpu_bstats, Ptr<Ptr<NetDefinitions.net_rate_estimator>> rate_est, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock, boolean running, Ptr<runtime.nlattr> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gen_replace_estimator(Ptr<GnetDefinitions.gnet_stats_basic_sync> bstats, Ptr<GnetDefinitions.gnet_stats_basic_sync> cpu_bstats, Ptr<Ptr<NetDefinitions.net_rate_estimator>> rate_est, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock, boolean running, Ptr<runtime.nlattr> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gen_bitlen(Ptr<DeflateDefinitions.deflate_state> s2, Ptr<misc.tree_desc_s> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gen_codes(Ptr<CtDefinitions.ct_data_s> tree, int max_code, Ptr<@Unsigned @OriginalName(value="ush") Short> bl_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gen_symlink_name($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static String gen_symlink_name(int depth, String dirname, String fname2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gen_key(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gen_pool_add_owner(Ptr<gen_pool> pool, @Unsigned long virt, @Unsigned @OriginalName(value="phys_addr_t") long phys, @Unsigned long size, int nid, Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gen_pool_alloc_algo_owner(Ptr<gen_pool> pool, @Unsigned long size, @OriginalName(value="genpool_algo_t") Ptr<?> algo, Ptr<?> data, Ptr<Ptr<?>> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gen_pool_avail(Ptr<gen_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gen_pool_best_fit(Ptr<@Unsigned Long> map2, @Unsigned long size, @Unsigned long start, @Unsigned int nr, Ptr<?> data, Ptr<gen_pool> pool, @Unsigned long start_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<gen_pool> gen_pool_create(int min_alloc_order, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gen_pool_destroy(Ptr<gen_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> gen_pool_dma_alloc(Ptr<gen_pool> pool, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> gen_pool_dma_alloc_algo(Ptr<gen_pool> pool, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma, @OriginalName(value="genpool_algo_t") Ptr<?> algo, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> gen_pool_dma_alloc_align(Ptr<gen_pool> pool, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma, int align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> gen_pool_dma_zalloc(Ptr<gen_pool> pool, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> gen_pool_dma_zalloc_algo(Ptr<gen_pool> pool, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma, @OriginalName(value="genpool_algo_t") Ptr<?> algo, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> gen_pool_dma_zalloc_align(Ptr<gen_pool> pool, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma, int align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gen_pool_first_fit(Ptr<@Unsigned Long> map2, @Unsigned long size, @Unsigned long start, @Unsigned int nr, Ptr<?> data, Ptr<gen_pool> pool, @Unsigned long start_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gen_pool_first_fit_align(Ptr<@Unsigned Long> map2, @Unsigned long size, @Unsigned long start, @Unsigned int nr, Ptr<?> data, Ptr<gen_pool> pool, @Unsigned long start_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gen_pool_first_fit_order_align(Ptr<@Unsigned Long> map2, @Unsigned long size, @Unsigned long start, @Unsigned int nr, Ptr<?> data, Ptr<gen_pool> pool, @Unsigned long start_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gen_pool_fixed_alloc(Ptr<@Unsigned Long> map2, @Unsigned long size, @Unsigned long start, @Unsigned int nr, Ptr<?> data, Ptr<gen_pool> pool, @Unsigned long start_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gen_pool_for_each_chunk($arg1, (void (*)(struct gen_pool*, struct gen_pool_chunk*, void*))$arg2, $arg3)")
    public static void gen_pool_for_each_chunk(Ptr<gen_pool> pool, Ptr<?> func, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gen_pool_free_owner(Ptr<gen_pool> pool, @Unsigned long addr2, @Unsigned long size, Ptr<Ptr<?>> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gen_pool_get($arg1, (const u8*)$arg2)")
    public static Ptr<gen_pool> gen_pool_get(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gen_pool_has_addr(Ptr<gen_pool> pool, @Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gen_pool_set_algo(Ptr<gen_pool> pool, @OriginalName(value="genpool_algo_t") Ptr<?> algo, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gen_pool_size(Ptr<gen_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long gen_pool_virt_to_phys(Ptr<gen_pool> pool, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct gen_cookie")
    @NotUsableInJava
    public static class gen_cookie
    extends Struct {
        public Ptr<PcpuDefinitions.pcpu_gen_cookie> local;
        public misc.atomic64_t forward_last;
        public misc.atomic64_t reverse_last;
    }

    @Type(noCCodeGeneration=true, cType="struct gen_pool_chunk")
    @NotUsableInJava
    public static class gen_pool_chunk
    extends Struct {
        public ListDefinitions.list_head next_chunk;
        public  @OriginalName(value="atomic_long_t") misc.atomic64_t avail;
        public @Unsigned @OriginalName(value="phys_addr_t") long phys_addr;
        public Ptr<?> owner;
        public @Unsigned long start_addr;
        public @Unsigned long end_addr;
        public @Unsigned long @Size(value=0) [] bits;
    }

    @Type(noCCodeGeneration=true, cType="struct gen_pool")
    @NotUsableInJava
    public static class gen_pool
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head chunks;
        public int min_alloc_order;
        public @OriginalName(value="genpool_algo_t") Ptr<?> algo;
        public Ptr<?> data;
        public String name;
    }
}

