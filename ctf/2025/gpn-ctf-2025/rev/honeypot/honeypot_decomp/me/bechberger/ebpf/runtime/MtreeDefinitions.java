/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MapleDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class MtreeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtree_alloc_cyclic(Ptr<MapleDefinitions.maple_tree> mt, Ptr<@Unsigned Long> startp, Ptr<?> entry, @Unsigned long range_lo, @Unsigned long range_hi, Ptr<@Unsigned Long> next, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtree_alloc_range(Ptr<MapleDefinitions.maple_tree> mt, Ptr<@Unsigned Long> startp, Ptr<?> entry, @Unsigned long size, @Unsigned long min, @Unsigned long max, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtree_alloc_rrange(Ptr<MapleDefinitions.maple_tree> mt, Ptr<@Unsigned Long> startp, Ptr<?> entry, @Unsigned long size, @Unsigned long min, @Unsigned long max, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtree_destroy(Ptr<MapleDefinitions.maple_tree> mt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtree_dup(Ptr<MapleDefinitions.maple_tree> mt, Ptr<MapleDefinitions.maple_tree> _new, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mtree_erase(Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtree_insert(Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long index2, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtree_insert_range(Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long first, @Unsigned long last, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mtree_load(Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mtree_range_walk(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtree_store(Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long index2, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtree_store_range(Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long index2, @Unsigned long last, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }
}

