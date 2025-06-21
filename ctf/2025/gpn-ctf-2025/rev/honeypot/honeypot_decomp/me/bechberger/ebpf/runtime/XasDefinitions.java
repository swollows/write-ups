/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.XaDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class XasDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_next_entry(Ptr<XaDefinitions.xa_state> xas, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __xas_next(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __xas_nomem(Ptr<XaDefinitions.xa_state> xas, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __xas_prev(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_alloc(Ptr<XaDefinitions.xa_state> xas, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xas_clear_mark((const struct xa_state*)$arg1, $arg2)")
    public static void xas_clear_mark(Ptr<XaDefinitions.xa_state> xas, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_create(Ptr<XaDefinitions.xa_state> xas, boolean allow_root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xas_create_range(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xas_destroy(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xas_expand(Ptr<XaDefinitions.xa_state> xas, Ptr<?> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_find(Ptr<XaDefinitions.xa_state> xas, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_find_conflict(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_find_marked(Ptr<XaDefinitions.xa_state> xas, @Unsigned long max, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xas_free_nodes(Ptr<XaDefinitions.xa_state> xas, Ptr<XaDefinitions.xa_node> top) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xas_get_mark((const struct xa_state*)$arg1, $arg2)")
    public static boolean xas_get_mark(Ptr<XaDefinitions.xa_state> xas, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xas_get_order(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xas_init_marks((const struct xa_state*)$arg1)")
    public static void xas_init_marks(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_load(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xas_move_index(Ptr<XaDefinitions.xa_state> xas, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xas_nomem(Ptr<XaDefinitions.xa_state> xas, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xas_pause(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xas_set_mark((const struct xa_state*)$arg1, $arg2)")
    public static void xas_set_mark(Ptr<XaDefinitions.xa_state> xas, @Unsigned @OriginalName(value="xa_mark_t") int mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xas_split(Ptr<XaDefinitions.xa_state> xas, Ptr<?> entry, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xas_split_alloc(Ptr<XaDefinitions.xa_state> xas, Ptr<?> entry, @Unsigned int order, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xas_squash_marks((const struct xa_state*)$arg1)")
    public static void xas_squash_marks(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_start(Ptr<XaDefinitions.xa_state> xas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xas_store(Ptr<XaDefinitions.xa_state> xas, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }
}

