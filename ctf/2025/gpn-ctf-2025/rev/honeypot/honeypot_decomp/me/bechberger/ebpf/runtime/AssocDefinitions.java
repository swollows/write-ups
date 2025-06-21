/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class AssocDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void assoc_array_apply_edit(Ptr<assoc_array_edit> edit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void assoc_array_cancel_edit(Ptr<assoc_array_edit> edit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_clear($arg1, (const struct assoc_array_ops*)$arg2)")
    public static Ptr<assoc_array_edit> assoc_array_clear(Ptr<assoc_array> array, Ptr<assoc_array_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_delete($arg1, (const struct assoc_array_ops*)$arg2, (const void*)$arg3)")
    public static Ptr<assoc_array_edit> assoc_array_delete(Ptr<assoc_array> array, Ptr<assoc_array_ops> ops, Ptr<?> index_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_delete_collapse_iterator((const void*)$arg1, $arg2)")
    public static int assoc_array_delete_collapse_iterator(Ptr<?> leaf, Ptr<?> iterator_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_destroy($arg1, (const struct assoc_array_ops*)$arg2)")
    public static void assoc_array_destroy(Ptr<assoc_array> array, Ptr<assoc_array_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_destroy_subtree($arg1, (const struct assoc_array_ops*)$arg2)")
    public static void assoc_array_destroy_subtree(@OriginalName(value="assoc_array_ptr") Ptr<?> root, Ptr<assoc_array_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_find((const struct assoc_array*)$arg1, (const struct assoc_array_ops*)$arg2, (const void*)$arg3)")
    public static Ptr<?> assoc_array_find(Ptr<assoc_array> array, Ptr<assoc_array_ops> ops, Ptr<?> index_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_gc($arg1, (const struct assoc_array_ops*)$arg2, (_Bool (*)(void*, void*))$arg3, $arg4)")
    public static int assoc_array_gc(Ptr<assoc_array> array, Ptr<assoc_array_ops> ops, Ptr<?> iterator, Ptr<?> iterator_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_insert($arg1, (const struct assoc_array_ops*)$arg2, (const void*)$arg3, $arg4)")
    public static Ptr<assoc_array_edit> assoc_array_insert(Ptr<assoc_array> array, Ptr<assoc_array_ops> ops, Ptr<?> index_key, Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_insert_into_terminal_node($arg1, (const struct assoc_array_ops*)$arg2, (const void*)$arg3, $arg4)")
    public static boolean assoc_array_insert_into_terminal_node(Ptr<assoc_array_edit> edit, Ptr<assoc_array_ops> ops, Ptr<?> index_key, Ptr<assoc_array_walk_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void assoc_array_insert_set_object(Ptr<assoc_array_edit> edit, Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_iterate((const struct assoc_array*)$arg1, (int (*)(const void*, void*))$arg2, $arg3)")
    public static int assoc_array_iterate(Ptr<assoc_array> array, Ptr<?> iterator, Ptr<?> iterator_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void assoc_array_rcu_cleanup(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_subtree_iterate((const assoc_array_ptr*)$arg1, (const assoc_array_ptr*)$arg2, (int (*)(const void*, void*))$arg3, $arg4)")
    public static int assoc_array_subtree_iterate(@OriginalName(value="assoc_array_ptr") Ptr<?> root, @OriginalName(value="assoc_array_ptr") Ptr<?> stop, Ptr<?> iterator, Ptr<?> iterator_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="assoc_array_walk((const struct assoc_array*)$arg1, (const struct assoc_array_ops*)$arg2, (const void*)$arg3, $arg4)")
    public static assoc_array_walk_status assoc_array_walk(Ptr<assoc_array> array, Ptr<assoc_array_ops> ops, Ptr<?> index_key, Ptr<assoc_array_walk_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { assoc_array_ptr **ptr; assoc_array_ptr *to; }")
    @NotUsableInJava
    public static class AnonymousType1385140107C58
    extends Struct {
        public Ptr<@OriginalName(value="assoc_array_ptr") Ptr<?>> ptr;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> to;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 *p; u8 to; }")
    @NotUsableInJava
    public static class AnonymousType246014273C28
    extends Struct {
        public Ptr<Character> p;
        public char to;
    }

    @Type(noCCodeGeneration=true, cType="struct assoc_array_delete_collapse_context")
    @NotUsableInJava
    public static class assoc_array_delete_collapse_context
    extends Struct {
        public Ptr<assoc_array_node> node;
        public Ptr<?> skip_leaf;
        public int slot;
    }

    @Type(noCCodeGeneration=true, cType="struct assoc_array_walk_result")
    @NotUsableInJava
    public static class assoc_array_walk_result
    extends Struct {
        public misc.terminal_node_of_assoc_array_walk_result terminal_node;
        public misc.wrong_shortcut_of_assoc_array_walk_result wrong_shortcut;
    }

    @Type(noCCodeGeneration=true, cType="enum assoc_array_walk_status")
    public static enum assoc_array_walk_status implements Enum<assoc_array_walk_status>,
    TypedEnum<assoc_array_walk_status, Integer>
    {
        assoc_array_walk_tree_empty,
        assoc_array_walk_found_terminal_node,
        assoc_array_walk_found_wrong_shortcut;

    }

    @Type(noCCodeGeneration=true, cType="struct assoc_array_edit")
    @NotUsableInJava
    public static class assoc_array_edit
    extends Struct {
        public misc.callback_head rcu;
        public Ptr<assoc_array> array;
        public Ptr<assoc_array_ops> ops;
        public Ptr<assoc_array_ops> ops_for_excised_subtree;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> leaf;
        public Ptr<@OriginalName(value="assoc_array_ptr") Ptr<?>> leaf_p;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> dead_leaf;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> @Size(value=3) [] new_meta;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> @Size(value=1) [] excised_meta;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> excised_subtree;
        public Ptr<@OriginalName(value="assoc_array_ptr") Ptr<?>> @Size(value=16) [] set_backpointers;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> set_backpointers_to;
        public Ptr<assoc_array_node> adjust_count_on;
        public long adjust_count_by;
        public AnonymousType1385140107C58 @Size(value=2) [] set;
        public AnonymousType246014273C28 @Size(value=1) [] set_parent_slot;
        public char @Size(value=17) [] segment_cache;
    }

    @Type(noCCodeGeneration=true, cType="struct assoc_array_shortcut")
    @NotUsableInJava
    public static class assoc_array_shortcut
    extends Struct {
        public @OriginalName(value="assoc_array_ptr") Ptr<?> back_pointer;
        public int parent_slot;
        public int skip_to_level;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> next_node;
        public @Unsigned long @Size(value=0) [] index_key;
    }

    @Type(noCCodeGeneration=true, cType="struct assoc_array_node")
    @NotUsableInJava
    public static class assoc_array_node
    extends Struct {
        public @OriginalName(value="assoc_array_ptr") Ptr<?> back_pointer;
        public char parent_slot;
        public @OriginalName(value="assoc_array_ptr") Ptr<?> @Size(value=16) [] slots;
        public @Unsigned long nr_leaves_on_branch;
    }

    @Type(noCCodeGeneration=true, cType="struct assoc_array_ops")
    @NotUsableInJava
    public static class assoc_array_ops
    extends Struct {
        public Ptr<?> get_key_chunk;
        public Ptr<?> get_object_key_chunk;
        public Ptr<?> compare_object;
        public Ptr<?> diff_objects;
        public Ptr<?> free_object;
    }

    @Type(noCCodeGeneration=true, cType="struct assoc_array")
    @NotUsableInJava
    public static class assoc_array
    extends Struct {
        public @OriginalName(value="assoc_array_ptr") Ptr<?> root;
        public @Unsigned long nr_leaves_on_tree;
    }
}

