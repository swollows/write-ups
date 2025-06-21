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
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class XaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xa_alloc(Ptr<runtime.xarray> xa, Ptr<@Unsigned Integer> id, Ptr<?> entry, xa_limit limit, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xa_alloc_cyclic(Ptr<runtime.xarray> xa, Ptr<@Unsigned Integer> id, Ptr<?> entry, xa_limit limit, Ptr<@Unsigned Integer> next, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xa_clear_mark(Ptr<runtime.xarray> xa, @Unsigned long index2, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __xa_cmpxchg(Ptr<runtime.xarray> xa, @Unsigned long index2, Ptr<?> old, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __xa_erase(Ptr<runtime.xarray> xa, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xa_insert(Ptr<runtime.xarray> xa, @Unsigned long index2, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xa_set_mark(Ptr<runtime.xarray> xa, @Unsigned long index2, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __xa_store(Ptr<runtime.xarray> xa, @Unsigned long index2, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xa_clear_mark(Ptr<runtime.xarray> xa, @Unsigned long index2, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xa_delete_node(Ptr<xa_node> node2, @OriginalName(value="xa_update_node_t") Ptr<?> update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xa_destroy(Ptr<runtime.xarray> xa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xa_erase(Ptr<runtime.xarray> xa, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xa_extract(Ptr<runtime.xarray> xa, Ptr<Ptr<?>> dst, @Unsigned long start, @Unsigned long max, @Unsigned int n, @Unsigned @OriginalName(value="xa_mark_t") int filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xa_find(Ptr<runtime.xarray> xa, Ptr<@Unsigned Long> indexp, @Unsigned long max, @Unsigned @OriginalName(value="xa_mark_t") int filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xa_find_after(Ptr<runtime.xarray> xa, Ptr<@Unsigned Long> indexp, @Unsigned long max, @Unsigned @OriginalName(value="xa_mark_t") int filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xa_get_mark(Ptr<runtime.xarray> xa, @Unsigned long index2, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xa_get_order(Ptr<runtime.xarray> xa, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xa_load(Ptr<runtime.xarray> xa, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xa_set_mark(Ptr<runtime.xarray> xa, @Unsigned long index2, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xa_store(Ptr<runtime.xarray> xa, @Unsigned long index2, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xa_store_range(Ptr<runtime.xarray> xa, @Unsigned long first, @Unsigned long last, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xa_limit")
    @NotUsableInJava
    public static class xa_limit
    extends Struct {
        public @Unsigned int max;
        public @Unsigned int min;
    }

    @Type(noCCodeGeneration=true, cType="struct xa_state")
    @NotUsableInJava
    public static class xa_state
    extends Struct {
        public Ptr<runtime.xarray> xa;
        public @Unsigned long xa_index;
        public char xa_shift;
        public char xa_sibs;
        public char xa_offset;
        public char xa_pad;
        public Ptr<xa_node> xa_node;
        public Ptr<xa_node> xa_alloc;
        public @OriginalName(value="xa_update_node_t") Ptr<?> xa_update;
        public Ptr<ListDefinitions.list_lru> xa_lru;
    }

    @Type(noCCodeGeneration=true, cType="struct xa_node")
    @NotUsableInJava
    public static class xa_node
    extends Struct {
        public char shift;
        public char offset;
        public char count;
        public char nr_values;
        public Ptr<xa_node> parent;
        public Ptr<runtime.xarray> array;
        @InlineUnion(value=7935)
        public @InlineUnion(value=7935) ListDefinitions.list_head private_list;
        @InlineUnion(value=7935)
        public @InlineUnion(value=7935) misc.callback_head callback_head;
        public Ptr<?> @Size(value=64) [] slots;
        @InlineUnion(value=7936)
        public @InlineUnion(value=7936) @Unsigned long @Size(value=3) [] tags;
        @InlineUnion(value=7936)
        public @InlineUnion(value=7936) @Unsigned long @Size(value=3) [] marks;
    }

    @Type(noCCodeGeneration=true, cType="enum xa_lock_type")
    public static enum xa_lock_type implements Enum<xa_lock_type>,
    TypedEnum<xa_lock_type, Integer>
    {
        XA_LOCK_IRQ,
        XA_LOCK_BH;

    }
}

