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

public final class MasDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_alloc_cyclic(Ptr<misc.ma_state> mas, Ptr<@Unsigned Long> startp, Ptr<?> entry, @Unsigned long range_lo, @Unsigned long range_hi, Ptr<@Unsigned Long> next, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_alloc_nodes(Ptr<misc.ma_state> mas, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mas_anode_descend(Ptr<misc.ma_state> mas, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_ascend(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char mas_data_end(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_descend(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_destroy(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_destroy_rebalance(Ptr<misc.ma_state> mas, char end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_dup_free(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_empty_area(Ptr<misc.ma_state> mas, @Unsigned long min, @Unsigned long max, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_empty_area_rev(Ptr<misc.ma_state> mas, @Unsigned long min, @Unsigned long max, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_erase(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_expected_entries(Ptr<misc.ma_state> mas, @Unsigned long nr_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_find(Ptr<misc.ma_state> mas, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_find_range(Ptr<misc.ma_state> mas, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_find_range_rev(Ptr<misc.ma_state> mas, @Unsigned long min) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_find_rev(Ptr<misc.ma_state> mas, @Unsigned long min) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mas_find_rev_setup(Ptr<misc.ma_state> mas, @Unsigned long min, Ptr<Ptr<?>> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_insert(Ptr<misc.ma_state> mas, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mas_leaf_max_gap(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_mab_cp(Ptr<misc.ma_state> mas, char mas_start, char mas_end, Ptr<MapleDefinitions.maple_big_node> b_node, char mab_start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_new_root(Ptr<misc.ma_state> mas, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_next(Ptr<misc.ma_state> mas, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_next_node(Ptr<misc.ma_state> mas, Ptr<MapleDefinitions.maple_node> node2, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_next_range(Ptr<misc.ma_state> mas, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mas_next_setup(Ptr<misc.ma_state> mas, @Unsigned long max, Ptr<Ptr<?>> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mas_next_sibling(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_next_slot(Ptr<misc.ma_state> mas, @Unsigned long max, boolean empty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_node_count_gfp(Ptr<misc.ma_state> mas, int count, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mas_nomem(Ptr<misc.ma_state> mas, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_pause(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MapleDefinitions.maple_node> mas_pop_node(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_preallocate(Ptr<misc.ma_state> mas, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_prev(Ptr<misc.ma_state> mas, @Unsigned long min) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_prev_node(Ptr<misc.ma_state> mas, @Unsigned long min) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_prev_range(Ptr<misc.ma_state> mas, @Unsigned long min) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mas_prev_setup(Ptr<misc.ma_state> mas, @Unsigned long min, Ptr<Ptr<?>> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_prev_slot(Ptr<misc.ma_state> mas, @Unsigned long min, boolean empty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mas_push_data(Ptr<misc.ma_state> mas, int height, Ptr<MapleDefinitions.maple_subtree_state> mast, boolean left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_rebalance(Ptr<misc.ma_state> mas, Ptr<MapleDefinitions.maple_big_node> b_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mas_rev_awalk(Ptr<misc.ma_state> mas, @Unsigned long size, Ptr<@Unsigned Long> gap_min, Ptr<@Unsigned Long> gap_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_root_expand(Ptr<misc.ma_state> mas, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_spanning_rebalance(Ptr<misc.ma_state> mas, Ptr<MapleDefinitions.maple_subtree_state> mast, char count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_split(Ptr<misc.ma_state> mas, Ptr<MapleDefinitions.maple_big_node> b_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_split_final_node(Ptr<MapleDefinitions.maple_subtree_state> mast, Ptr<misc.ma_state> mas, int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="maple_enode") Ptr<?> mas_start(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_state_walk(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_store(Ptr<misc.ma_state> mas, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_store_b_node(Ptr<misc.ma_wr_state> wr_mas, Ptr<MapleDefinitions.maple_big_node> b_node, char offset_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mas_store_gfp(Ptr<misc.ma_state> mas, Ptr<?> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_store_prealloc(Ptr<misc.ma_state> mas, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_topiary_replace(Ptr<misc.ma_state> mas, @OriginalName(value="maple_enode") Ptr<?> old_enode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_update_gap(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mas_walk(Ptr<misc.ma_state> mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_wr_append(Ptr<misc.ma_wr_state> wr_mas, char new_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_wr_bnode(Ptr<misc.ma_wr_state> wr_mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_wr_node_store(Ptr<misc.ma_wr_state> wr_mas, char new_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_wr_slot_store(Ptr<misc.ma_wr_state> wr_mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_wr_spanning_store(Ptr<misc.ma_wr_state> wr_mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_wr_store_entry(Ptr<misc.ma_wr_state> wr_mas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mas_wr_store_type(Ptr<misc.ma_wr_state> wr_mas) {
        throw new MethodIsBPFRelatedFunction();
    }
}

