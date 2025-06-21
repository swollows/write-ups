/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MapleDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class MtDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mt_destroy(Ptr<MapleDefinitions.maple_tree> mt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mt_dup(Ptr<MapleDefinitions.maple_tree> mt, Ptr<MapleDefinitions.maple_tree> _new, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mt_calc_adistance(int node2, Ptr<Integer> adist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mt_find(Ptr<MapleDefinitions.maple_tree> mt, Ptr<@Unsigned Long> index2, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mt_find_after(Ptr<MapleDefinitions.maple_tree> mt, Ptr<@Unsigned Long> index2, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemoryDefinitions.memory_dev_type> mt_find_alloc_memory_type(int adist, Ptr<ListDefinitions.list_head> memory_types) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mt_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mt_free_walk(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mt_next(Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long index2, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mt_perf_to_adistance(Ptr<misc.access_coordinate> perf, Ptr<Integer> adist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mt_prev(Ptr<MapleDefinitions.maple_tree> mt, @Unsigned long index2, @Unsigned long min) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mt_put_memory_types(Ptr<ListDefinitions.list_head> memory_types) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mt_set_default_dram_perf($arg1, $arg2, (const u8*)$arg3)")
    public static int mt_set_default_dram_perf(int nid, Ptr<misc.access_coordinate> perf, String source) {
        throw new MethodIsBPFRelatedFunction();
    }
}

