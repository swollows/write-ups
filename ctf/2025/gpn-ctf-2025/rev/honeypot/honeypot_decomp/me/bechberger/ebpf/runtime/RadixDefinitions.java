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
import me.bechberger.ebpf.runtime.XaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RadixDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __radix_tree_delete(Ptr<runtime.xarray> root, Ptr<XaDefinitions.xa_node> node2, Ptr<Ptr<?>> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__radix_tree_lookup((const struct xarray*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<?> __radix_tree_lookup(Ptr<runtime.xarray> root, @Unsigned long index2, Ptr<Ptr<XaDefinitions.xa_node>> nodep, Ptr<Ptr<Ptr<?>>> slotp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __radix_tree_preload(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __radix_tree_replace(Ptr<runtime.xarray> root, Ptr<XaDefinitions.xa_node> node2, Ptr<Ptr<?>> slot2, Ptr<?> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int radix_tree_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> radix_tree_delete(Ptr<runtime.xarray> root, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> radix_tree_delete_item(Ptr<runtime.xarray> root, @Unsigned long index2, Ptr<?> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int radix_tree_extend(Ptr<runtime.xarray> root, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long index2, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_gang_lookup((const struct xarray*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned int radix_tree_gang_lookup(Ptr<runtime.xarray> root, Ptr<Ptr<?>> results, @Unsigned long first_index, @Unsigned int max_items) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_gang_lookup_tag((const struct xarray*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int radix_tree_gang_lookup_tag(Ptr<runtime.xarray> root, Ptr<Ptr<?>> results, @Unsigned long first_index, @Unsigned int max_items, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_gang_lookup_tag_slot((const struct xarray*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int radix_tree_gang_lookup_tag_slot(Ptr<runtime.xarray> root, Ptr<Ptr<Ptr<?>>> results, @Unsigned long first_index, @Unsigned int max_items, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void radix_tree_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int radix_tree_insert(Ptr<runtime.xarray> root, @Unsigned long index2, Ptr<?> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void radix_tree_iter_delete(Ptr<runtime.xarray> root, Ptr<radix_tree_iter> iter2, Ptr<Ptr<?>> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_iter_replace($arg1, (const struct radix_tree_iter*)$arg2, $arg3, $arg4)")
    public static void radix_tree_iter_replace(Ptr<runtime.xarray> root, Ptr<radix_tree_iter> iter2, Ptr<Ptr<?>> slot2, Ptr<?> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<?>> radix_tree_iter_resume(Ptr<Ptr<?>> slot2, Ptr<radix_tree_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_iter_tag_clear($arg1, (const struct radix_tree_iter*)$arg2, $arg3)")
    public static void radix_tree_iter_tag_clear(Ptr<runtime.xarray> root, Ptr<radix_tree_iter> iter2, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_lookup((const struct xarray*)$arg1, $arg2)")
    public static Ptr<?> radix_tree_lookup(Ptr<runtime.xarray> root, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_lookup_slot((const struct xarray*)$arg1, $arg2)")
    public static Ptr<Ptr<?>> radix_tree_lookup_slot(Ptr<runtime.xarray> root, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int radix_tree_maybe_preload(@Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_next_chunk((const struct xarray*)$arg1, $arg2, $arg3)")
    public static Ptr<Ptr<?>> radix_tree_next_chunk(Ptr<runtime.xarray> root, Ptr<radix_tree_iter> iter2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<XaDefinitions.xa_node> radix_tree_node_alloc(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<XaDefinitions.xa_node> parent, Ptr<runtime.xarray> root, @Unsigned int shift, @Unsigned int offset, @Unsigned int count, @Unsigned int nr_values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void radix_tree_node_ctor(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void radix_tree_node_rcu_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void radix_tree_replace_slot(Ptr<runtime.xarray> root, Ptr<Ptr<?>> slot2, Ptr<?> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> radix_tree_tag_clear(Ptr<runtime.xarray> root, @Unsigned long index2, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_tag_get((const struct xarray*)$arg1, $arg2, $arg3)")
    public static int radix_tree_tag_get(Ptr<runtime.xarray> root, @Unsigned long index2, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> radix_tree_tag_set(Ptr<runtime.xarray> root, @Unsigned long index2, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="radix_tree_tagged((const struct xarray*)$arg1, $arg2)")
    public static int radix_tree_tagged(Ptr<runtime.xarray> root, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct radix_tree_iter")
    @NotUsableInJava
    public static class radix_tree_iter
    extends Struct {
        public @Unsigned long index;
        public @Unsigned long next_index;
        public @Unsigned long tags;
        public Ptr<XaDefinitions.xa_node> node;
    }

    @Type(noCCodeGeneration=true, cType="struct radix_tree_preload")
    @NotUsableInJava
    public static class radix_tree_preload
    extends Struct {
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p lock;
        public @Unsigned int nr;
        public Ptr<XaDefinitions.xa_node> nodes;
    }
}

