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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IntervalDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_augment_rotate(Ptr<RbDefinitions.rb_node> rb_old, Ptr<RbDefinitions.rb_node> rb_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_insert(Ptr<runtime.memtype> node2, Ptr<RbDefinitions.rb_root_cached> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.memtype> interval_iter_next(Ptr<runtime.memtype> node2, @Unsigned long start, @Unsigned long last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_remove(Ptr<runtime.memtype> node2, Ptr<RbDefinitions.rb_root_cached> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.memtype> interval_subtree_search(Ptr<runtime.memtype> node2, @Unsigned long start, @Unsigned long last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_tree_augment_rotate(Ptr<RbDefinitions.rb_node> rb_old, Ptr<RbDefinitions.rb_node> rb_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_tree_insert(Ptr<interval_tree_node> node2, Ptr<RbDefinitions.rb_root_cached> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<interval_tree_node> interval_tree_iter_first(Ptr<RbDefinitions.rb_root_cached> root, @Unsigned long start, @Unsigned long last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<interval_tree_node> interval_tree_iter_next(Ptr<interval_tree_node> node2, @Unsigned long start, @Unsigned long last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_tree_remove(Ptr<interval_tree_node> node2, Ptr<RbDefinitions.rb_root_cached> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_tree_span_iter_advance(Ptr<interval_tree_span_iter> iter2, Ptr<RbDefinitions.rb_root_cached> itree, @Unsigned long new_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_tree_span_iter_first(Ptr<interval_tree_span_iter> iter2, Ptr<RbDefinitions.rb_root_cached> itree, @Unsigned long first_index, @Unsigned long last_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_tree_span_iter_next(Ptr<interval_tree_span_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void interval_tree_span_iter_next_gap(Ptr<interval_tree_span_iter> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long interval_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct interval_tree_span_iter")
    @NotUsableInJava
    public static class interval_tree_span_iter
    extends Struct {
        public Ptr<interval_tree_node> @Size(value=2) [] nodes;
        public @Unsigned long first_index;
        public @Unsigned long last_index;
        @InlineUnion(value=93443)
        public @InlineUnion(value=93443) @Unsigned long start_hole;
        @InlineUnion(value=93443)
        public @InlineUnion(value=93443) @Unsigned long start_used;
        @InlineUnion(value=93444)
        public @InlineUnion(value=93444) @Unsigned long last_hole;
        @InlineUnion(value=93444)
        public @InlineUnion(value=93444) @Unsigned long last_used;
        public int is_hole;
    }

    @Type(noCCodeGeneration=true, cType="struct interval_tree_node")
    @NotUsableInJava
    public static class interval_tree_node
    extends Struct {
        public RbDefinitions.rb_node rb;
        public @Unsigned long start;
        public @Unsigned long last;
        public @Unsigned long __subtree_last;
    }
}

