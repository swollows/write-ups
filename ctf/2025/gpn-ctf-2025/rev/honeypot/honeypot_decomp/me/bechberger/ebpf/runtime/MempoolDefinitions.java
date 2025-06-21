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
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MempoolDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mempool_alloc_noprof(Ptr<@OriginalName(value="mempool_t") mempool_s> pool, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mempool_alloc_pages(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mempool_alloc_preallocated(Ptr<@OriginalName(value="mempool_t") mempool_s> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mempool_alloc_slab(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="mempool_t") mempool_s> mempool_create_node_noprof(int min_nr, Ptr<?> alloc_fn, Ptr<?> free_fn, Ptr<?> pool_data, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int node_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mempool_destroy(Ptr<@OriginalName(value="mempool_t") mempool_s> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mempool_exit(Ptr<@OriginalName(value="mempool_t") mempool_s> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mempool_free(Ptr<?> element, Ptr<@OriginalName(value="mempool_t") mempool_s> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mempool_free_pages(Ptr<?> element, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mempool_free_slab(Ptr<?> element, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mempool_init_node(Ptr<@OriginalName(value="mempool_t") mempool_s> pool, int min_nr, Ptr<?> alloc_fn, Ptr<?> free_fn, Ptr<?> pool_data, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int node_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mempool_init_noprof(Ptr<@OriginalName(value="mempool_t") mempool_s> pool, int min_nr, Ptr<?> alloc_fn, Ptr<?> free_fn, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mempool_kfree(Ptr<?> element, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mempool_kmalloc(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mempool_kvfree(Ptr<?> element, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mempool_kvmalloc(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mempool_resize(Ptr<@OriginalName(value="mempool_t") mempool_s> pool, int new_min_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mempool_s")
    @NotUsableInJava
    public static class mempool_s
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public int min_nr;
        public int curr_nr;
        public Ptr<Ptr<?>> elements;
        public Ptr<?> pool_data;
        public Ptr<?> alloc;
        public Ptr<?> free;
        public  @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
    }
}

