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
import me.bechberger.ebpf.runtime.MempoolDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BtreeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__btree_for_each($arg1, $arg2, $arg3, $arg4, (void (*)(void*, long unsigned int, long unsigned int*, long unsigned int, void*))$arg5, $arg6, $arg7, $arg8, $arg9)")
    public static @Unsigned long __btree_for_each(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> node2, @Unsigned long opaque, Ptr<?> func, Ptr<?> func2, int reap, int height, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> btree_alloc(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btree_destroy(Ptr<btree_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btree_free(Ptr<?> element, Ptr<?> pool_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> btree_get_prev(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> __key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btree_grim_visitor($arg1, $arg2, $arg3, (void (*)(void*, long unsigned int, long unsigned int*, long unsigned int, void*))$arg4, $arg5)")
    public static @Unsigned long btree_grim_visitor(Ptr<btree_head> head, Ptr<btree_geo> geo, @Unsigned long opaque, Ptr<?> func, Ptr<?> func2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btree_init(Ptr<btree_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btree_init_mempool(Ptr<btree_head> head, Ptr<@OriginalName(value="mempool_t") MempoolDefinitions.mempool_s> mempool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btree_insert(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> key2, Ptr<?> val, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btree_insert_level(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> key2, Ptr<?> val, int level, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> btree_last(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> btree_lookup(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btree_merge(Ptr<btree_head> target, Ptr<btree_head> victim, Ptr<btree_geo> geo, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btree_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btree_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> btree_remove(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> btree_remove_level(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> key2, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btree_update(Ptr<btree_head> head, Ptr<btree_geo> geo, Ptr<@Unsigned Long> key2, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btree_visitor($arg1, $arg2, $arg3, (void (*)(void*, long unsigned int, long unsigned int*, long unsigned int, void*))$arg4, $arg5)")
    public static @Unsigned long btree_visitor(Ptr<btree_head> head, Ptr<btree_geo> geo, @Unsigned long opaque, Ptr<?> func, Ptr<?> func2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct btree_geo")
    @NotUsableInJava
    public static class btree_geo
    extends Struct {
        public int keylen;
        public int no_pairs;
        public int no_longs;
    }

    @Type(noCCodeGeneration=true, cType="struct btree_head")
    @NotUsableInJava
    public static class btree_head
    extends Struct {
        public Ptr<@Unsigned Long> node;
        public Ptr<@OriginalName(value="mempool_t") MempoolDefinitions.mempool_s> mempool;
        public int height;
    }
}

