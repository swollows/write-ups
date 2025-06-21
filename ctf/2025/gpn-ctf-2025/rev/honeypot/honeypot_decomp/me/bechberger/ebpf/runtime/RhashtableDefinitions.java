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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RhashtableDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__rhashtable_lookup($arg1, (const void*)$arg2, (const struct rhashtable_params)$arg3)")
    public static Ptr<misc.rhash_head> __rhashtable_lookup(Ptr<runtime.rhashtable> ht, Ptr<?> key2, rhashtable_params params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __rhashtable_walk_find_next(Ptr<rhashtable_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rhashtable_destroy(Ptr<runtime.rhashtable> ht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rhashtable_free_and_destroy($arg1, (void (*)(void*, void*))$arg2, $arg3)")
    public static void rhashtable_free_and_destroy(Ptr<runtime.rhashtable> ht, Ptr<?> free_fn, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rhashtable_init_noprof($arg1, (const struct rhashtable_params*)$arg2)")
    public static int rhashtable_init_noprof(Ptr<runtime.rhashtable> ht, Ptr<rhashtable_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rhashtable_insert_slow($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<?> rhashtable_insert_slow(Ptr<runtime.rhashtable> ht, Ptr<?> key2, Ptr<misc.rhash_head> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rhashtable_jhash2((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned int rhashtable_jhash2(Ptr<?> key2, @Unsigned int length, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rhashtable_rehash_table(Ptr<runtime.rhashtable> ht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rhashtable_try_insert($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<?> rhashtable_try_insert(Ptr<runtime.rhashtable> ht, Ptr<?> key2, Ptr<misc.rhash_head> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rhashtable_walk_enter(Ptr<runtime.rhashtable> ht, Ptr<rhashtable_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rhashtable_walk_exit(Ptr<rhashtable_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> rhashtable_walk_next(Ptr<rhashtable_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> rhashtable_walk_peek(Ptr<rhashtable_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rhashtable_walk_start_check(Ptr<rhashtable_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rhashtable_walk_stop(Ptr<rhashtable_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rhashtable_iter")
    @NotUsableInJava
    public static class rhashtable_iter
    extends Struct {
        public Ptr<runtime.rhashtable> ht;
        public Ptr<misc.rhash_head> p;
        public Ptr<misc.rhlist_head> list;
        public rhashtable_walker walker;
        public @Unsigned int slot;
        public @Unsigned int skip;
        public boolean end_of_table;
    }

    @Type(noCCodeGeneration=true, cType="struct rhashtable_walker")
    @NotUsableInJava
    public static class rhashtable_walker
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<misc.bucket_table> tbl;
    }

    @Type(noCCodeGeneration=true, cType="struct rhashtable_params")
    @NotUsableInJava
    public static class rhashtable_params
    extends Struct {
        public @Unsigned short nelem_hint;
        public @Unsigned short key_len;
        public @Unsigned short key_offset;
        public @Unsigned short head_offset;
        public @Unsigned int max_size;
        public @Unsigned short min_size;
        public boolean automatic_shrinking;
        public @OriginalName(value="rht_hashfn_t") Ptr<?> hashfn;
        public @OriginalName(value="rht_obj_hashfn_t") Ptr<?> obj_hashfn;
        public @OriginalName(value="rht_obj_cmpfn_t") Ptr<?> obj_cmpfn;
    }

    @Type(noCCodeGeneration=true, cType="struct rhashtable_compare_arg")
    @NotUsableInJava
    public static class rhashtable_compare_arg
    extends Struct {
        public Ptr<runtime.rhashtable> ht;
        public Ptr<?> key;
    }
}

