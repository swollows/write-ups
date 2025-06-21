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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KmemDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__kmem_cache_alias((const u8*)$arg1, $arg2, $arg3, $arg4, (void (*)(void*))$arg5)")
    public static Ptr<kmem_cache> __kmem_cache_alias(String name, @Unsigned int size, @Unsigned int align, @Unsigned @OriginalName(value="slab_flags_t") int flags, Ptr<?> ctor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kmem_cache_alloc_bulk(Ptr<kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int flags, @Unsigned long size, Ptr<Ptr<?>> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kmem_cache_do_shrink(Ptr<kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __kmem_cache_empty(Ptr<kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kmem_cache_release(Ptr<kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kmem_cache_shrink(Ptr<kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kmem_cache_shutdown(Ptr<kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kmem_obj_info(Ptr<kmem_obj_info> kpp, Ptr<?> object, Ptr<runtime.slab> slab2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kmem_cache_alloc_bulk_noprof(Ptr<kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int flags, @Unsigned long size, Ptr<Ptr<?>> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kmem_cache_alloc_lru_noprof(Ptr<kmem_cache> s2, Ptr<ListDefinitions.list_lru> lru, @Unsigned @OriginalName(value="gfp_t") int gfpflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kmem_cache_alloc_node_noprof(Ptr<kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfpflags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kmem_cache_alloc_noprof(Ptr<kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfpflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kmem_cache_charge(Ptr<?> objp, @Unsigned @OriginalName(value="gfp_t") int gfpflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kmem_cache_flags($arg1, (const u8*)$arg2)")
    public static @Unsigned @OriginalName(value="slab_flags_t") int kmem_cache_flags(@Unsigned @OriginalName(value="slab_flags_t") int flags, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kmem_cache_free(Ptr<kmem_cache> s2, Ptr<?> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kmem_cache_free_bulk(Ptr<kmem_cache> s2, @Unsigned long size, Ptr<Ptr<?>> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kmem_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kmem_cache_init_late() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kmem_cache_create_args((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<kmem_cache> __kmem_cache_create_args(String name, @Unsigned int object_size, Ptr<kmem_cache_args> args, @Unsigned @OriginalName(value="slab_flags_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kmem_buckets_create((const u8*)$arg1, $arg2, $arg3, $arg4, (void (*)(void*))$arg5)")
    public static @NotUsableInJava Ptr<Ptr<kmem_cache> @Size(value=14) @OriginalName(value="kmem_buckets") []> kmem_buckets_create(String name, @Unsigned @OriginalName(value="slab_flags_t") int flags, @Unsigned int useroffset, @Unsigned int usersize, Ptr<?> ctor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kmem_cache_destroy(Ptr<kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kmem_cache_shrink(Ptr<kmem_cache> cachep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int kmem_cache_size(Ptr<kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kmem_dump_obj(Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kmem_cache_node")
    @NotUsableInJava
    public static class kmem_cache_node
    extends Struct {
        public @OriginalName(value="spinlock_t") runtime.spinlock list_lock;
        public @Unsigned long nr_partial;
        public ListDefinitions.list_head partial;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t nr_slabs;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t total_objects;
        public ListDefinitions.list_head full;
    }

    @Type(noCCodeGeneration=true, cType="struct kmem_cache_cpu")
    @NotUsableInJava
    public static class kmem_cache_cpu
    extends Struct {
        @InlineUnion(value=29716)
        public  @InlineUnion(value=29716) AnonDefinitions.anon_member_of_anon_member_of_kmem_cache_cpu anon0$0;
        @InlineUnion(value=29716)
        public @InlineUnion(value=29716) misc.freelist_aba_t freelist_tid;
        public Ptr<runtime.slab> slab;
        public Ptr<runtime.slab> partial;
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p lock;
    }

    @Type(noCCodeGeneration=true, cType="struct kmem_obj_info")
    @NotUsableInJava
    public static class kmem_obj_info
    extends Struct {
        public Ptr<?> kp_ptr;
        public Ptr<runtime.slab> kp_slab;
        public Ptr<?> kp_objp;
        public @Unsigned long kp_data_offset;
        public Ptr<kmem_cache> kp_slab_cache;
        public Ptr<?> kp_ret;
        public Ptr<?> @Size(value=16) [] kp_stack;
        public Ptr<?> @Size(value=16) [] kp_free_stack;
    }

    @Type(noCCodeGeneration=true, cType="struct kmem_cache_order_objects")
    @NotUsableInJava
    public static class kmem_cache_order_objects
    extends Struct {
        public @Unsigned int x;
    }

    @Type(noCCodeGeneration=true, cType="struct kmem_cache")
    @NotUsableInJava
    public static class kmem_cache
    extends Struct {
        public Ptr<kmem_cache_cpu> cpu_slab;
        public @Unsigned @OriginalName(value="slab_flags_t") int flags;
        public @Unsigned long min_partial;
        public @Unsigned int size;
        public @Unsigned int object_size;
        public misc.reciprocal_value reciprocal_size;
        public @Unsigned int offset;
        public @Unsigned int cpu_partial;
        public @Unsigned int cpu_partial_slabs;
        public kmem_cache_order_objects oo;
        public kmem_cache_order_objects min;
        public @Unsigned @OriginalName(value="gfp_t") int allocflags;
        public int refcount;
        public Ptr<?> ctor;
        public @Unsigned int inuse;
        public @Unsigned int align;
        public @Unsigned int red_left_pad;
        public String name;
        public ListDefinitions.list_head list;
        public runtime.kobject kobj;
        public @Unsigned long random;
        public @Unsigned int remote_node_defrag_ratio;
        public Ptr<@Unsigned Integer> random_seq;
        public @Unsigned int useroffset;
        public @Unsigned int usersize;
        public Ptr<kmem_cache_node> @Size(value=1024) [] node;
    }

    @Type(noCCodeGeneration=true, cType="struct kmem_cache_args")
    @NotUsableInJava
    public static class kmem_cache_args
    extends Struct {
        public @Unsigned int align;
        public @Unsigned int useroffset;
        public @Unsigned int usersize;
        public @Unsigned int freeptr_offset;
        public boolean use_freeptr_offset;
        public Ptr<?> ctor;
    }
}

