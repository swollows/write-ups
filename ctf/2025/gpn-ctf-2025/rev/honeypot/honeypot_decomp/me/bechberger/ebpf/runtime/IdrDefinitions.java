/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.RadixDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class IdrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idr_destroy(Ptr<runtime.idr> idr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<?>> idr_get_free(Ptr<runtime.xarray> root, Ptr<RadixDefinitions.radix_tree_iter> iter2, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idr_preload(@Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idr_alloc(Ptr<runtime.idr> idr2, Ptr<?> ptr, int start, int end, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idr_alloc_cyclic(Ptr<runtime.idr> idr2, Ptr<?> ptr, int start, int end, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idr_alloc_u32(Ptr<runtime.idr> idr2, Ptr<?> ptr, Ptr<@Unsigned Integer> nextid, @Unsigned long max, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="idr_find((const struct idr*)$arg1, $arg2)")
    public static Ptr<?> idr_find(Ptr<runtime.idr> idr2, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="idr_for_each((const struct idr*)$arg1, (int (*)(int, void*, void*))$arg2, $arg3)")
    public static int idr_for_each(Ptr<runtime.idr> idr2, Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> idr_get_next(Ptr<runtime.idr> idr2, Ptr<Integer> nextid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> idr_get_next_ul(Ptr<runtime.idr> idr2, Ptr<@Unsigned Long> nextid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> idr_remove(Ptr<runtime.idr> idr2, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> idr_replace(Ptr<runtime.idr> idr2, Ptr<?> ptr, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idr_callback(int id, Ptr<?> p, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }
}

