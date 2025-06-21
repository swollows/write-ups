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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MapleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void maple_tree_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct maple_subtree_state")
    @NotUsableInJava
    public static class maple_subtree_state
    extends Struct {
        public Ptr<misc.ma_state> orig_l;
        public Ptr<misc.ma_state> orig_r;
        public Ptr<misc.ma_state> l;
        public Ptr<misc.ma_state> m;
        public Ptr<misc.ma_state> r;
        public Ptr<misc.ma_topiary> free;
        public Ptr<misc.ma_topiary> destroy;
        public Ptr<maple_big_node> bn;
    }

    @Type(noCCodeGeneration=true, cType="struct maple_big_node")
    @NotUsableInJava
    public static class maple_big_node
    extends Struct {
        public @OriginalName(value="maple_pnode") Ptr<?> parent;
        public @Unsigned long @Size(value=33) [] pivot;
        @InlineUnion(value=96640)
        public @InlineUnion(value=96640) @OriginalName(value="maple_enode") Ptr<?> @Size(value=34) [] slot;
        @InlineUnion(value=96640)
        public  @InlineUnion(value=96640) AnonDefinitions.anon_member_of_anon_member_of_maple_big_node anon2$1;
        public char b_end;
        public maple_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct maple_node")
    @NotUsableInJava
    public static class maple_node
    extends Struct {
        @InlineUnion(value=96614)
        public  @InlineUnion(value=96614) AnonDefinitions.anon_member_of_anon_member_of_maple_node anon0$0;
        @InlineUnion(value=96614)
        public  @InlineUnion(value=96614) AnonDefinitions.anon_member_of_anon_member_of_maple_node anon0$1;
        @InlineUnion(value=96614)
        public @InlineUnion(value=96614) maple_range_64 mr64;
        @InlineUnion(value=96614)
        public @InlineUnion(value=96614) maple_arange_64 ma64;
        @InlineUnion(value=96614)
        public @InlineUnion(value=96614) maple_alloc alloc;
    }

    @Type(noCCodeGeneration=true, cType="enum maple_type")
    public static enum maple_type implements Enum<maple_type>,
    TypedEnum<maple_type, Integer>
    {
        maple_dense,
        maple_leaf_64,
        maple_range_64,
        maple_arange_64;

    }

    @Type(noCCodeGeneration=true, cType="struct maple_topiary")
    @NotUsableInJava
    public static class maple_topiary
    extends Struct {
        public @OriginalName(value="maple_pnode") Ptr<?> parent;
        public @OriginalName(value="maple_enode") Ptr<?> next;
    }

    @Type(noCCodeGeneration=true, cType="struct maple_arange_64")
    @NotUsableInJava
    public static class maple_arange_64
    extends Struct {
        public @OriginalName(value="maple_pnode") Ptr<?> parent;
        public @Unsigned long @Size(value=9) [] pivot;
        public Ptr<?> @Size(value=10) [] slot;
        public @Unsigned long @Size(value=10) [] gap;
        public maple_metadata meta;
    }

    @Type(noCCodeGeneration=true, cType="struct maple_range_64")
    @NotUsableInJava
    public static class maple_range_64
    extends Struct {
        public @OriginalName(value="maple_pnode") Ptr<?> parent;
        public @Unsigned long @Size(value=15) [] pivot;
        @InlineUnion(value=96601)
        public @InlineUnion(value=96601) Ptr<?> @Size(value=16) [] slot;
        @InlineUnion(value=96601)
        public  @InlineUnion(value=96601) AnonDefinitions.anon_member_of_anon_member_of_maple_range_64 anon2$1;
    }

    @Type(noCCodeGeneration=true, cType="struct maple_metadata")
    @NotUsableInJava
    public static class maple_metadata
    extends Struct {
        public char end;
        public char gap;
    }

    @Type(noCCodeGeneration=true, cType="enum maple_status")
    public static enum maple_status implements Enum<maple_status>,
    TypedEnum<maple_status, Integer>
    {
        ma_active,
        ma_start,
        ma_root,
        ma_none,
        ma_pause,
        ma_overflow,
        ma_underflow,
        ma_error;

    }

    @Type(noCCodeGeneration=true, cType="struct maple_alloc")
    @NotUsableInJava
    public static class maple_alloc
    extends Struct {
        public @Unsigned long total;
        public char node_count;
        public @Unsigned int request_count;
        public Ptr<maple_alloc> @Size(value=30) [] slot;
    }

    @Type(noCCodeGeneration=true, cType="struct maple_tree")
    @NotUsableInJava
    public static class maple_tree
    extends Struct {
        @InlineUnion(value=562)
        public  @InlineUnion(value=562) @OriginalName(value="spinlock_t") runtime.spinlock ma_lock;
        @InlineUnion(value=562)
        public @InlineUnion(value=562) misc.lockdep_map_p ma_external_lock;
        public @Unsigned int ma_flags;
        public Ptr<?> ma_root;
    }
}

