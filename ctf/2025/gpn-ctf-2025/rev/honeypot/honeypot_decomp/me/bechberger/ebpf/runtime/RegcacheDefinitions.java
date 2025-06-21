/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RegmapDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RegcacheDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_flat_exit(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_flat_init(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_flat_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_flat_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_rbtree_drop(Ptr<runtime.regmap> map2, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_rbtree_exit(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_rbtree_init(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_rbtree_insert_to_block(Ptr<runtime.regmap> map2, Ptr<regcache_rbtree_node> rbnode, @Unsigned int base_reg, @Unsigned int top_reg, @Unsigned int reg, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<regcache_rbtree_node> regcache_rbtree_node_alloc(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_rbtree_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regcache_rbtree_set_register(Ptr<runtime.regmap> map2, Ptr<regcache_rbtree_node> rbnode, @Unsigned int idx, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_rbtree_sync(Ptr<runtime.regmap> map2, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_rbtree_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regcache_cache_bypass(Ptr<runtime.regmap> map2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regcache_cache_only(Ptr<runtime.regmap> map2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regcache_default_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int regcache_default_cmp(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_default_sync(Ptr<runtime.regmap> map2, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_drop_region(Ptr<runtime.regmap> map2, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regcache_exit(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regcache_get_val($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned int regcache_get_val(Ptr<runtime.regmap> map2, Ptr<?> base, @Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_hw_init(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regcache_init($arg1, (const struct regmap_config*)$arg2)")
    public static int regcache_init(Ptr<runtime.regmap> map2, Ptr<RegmapDefinitions.regmap_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_lookup_reg(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_maple_drop(Ptr<runtime.regmap> map2, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_maple_exit(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_maple_init(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_maple_insert_block(Ptr<runtime.regmap> map2, int first, int last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_maple_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_maple_sync(Ptr<runtime.regmap> map2, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_maple_sync_block(Ptr<runtime.regmap> map2, Ptr<@Unsigned Long> entry, Ptr<misc.ma_state> mas, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_maple_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regcache_mark_dirty(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regcache_reg_cached(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regcache_reg_needs_sync(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regcache_reg_present(Ptr<@Unsigned Long> cache_present, @Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regcache_set_val(Ptr<runtime.regmap> map2, Ptr<?> base, @Unsigned int idx, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_sync(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_sync_block(Ptr<runtime.regmap> map2, Ptr<?> block, Ptr<@Unsigned Long> cache_present, @Unsigned int block_base, @Unsigned int start, @Unsigned int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regcache_sync_block_raw_flush($arg1, (const void**)$arg2, $arg3, $arg4)")
    public static int regcache_sync_block_raw_flush(Ptr<runtime.regmap> map2, Ptr<Ptr<?>> data, @Unsigned int base, @Unsigned int cur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_sync_region(Ptr<runtime.regmap> map2, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_sync_val(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regcache_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct regcache_rbtree_ctx")
    @NotUsableInJava
    public static class regcache_rbtree_ctx
    extends Struct {
        public RbDefinitions.rb_root root;
        public Ptr<regcache_rbtree_node> cached_rbnode;
    }

    @Type(noCCodeGeneration=true, cType="struct regcache_rbtree_node")
    @NotUsableInJava
    public static class regcache_rbtree_node
    extends Struct {
        public Ptr<?> block;
        public Ptr<@Unsigned Long> cache_present;
        public @Unsigned int base_reg;
        public @Unsigned int blklen;
        public RbDefinitions.rb_node node;
    }

    @Type(noCCodeGeneration=true, cType="struct regcache_ops")
    @NotUsableInJava
    public static class regcache_ops
    extends Struct {
        public String name;
        public regcache_type type;
        public Ptr<?> init;
        public Ptr<?> exit;
        public Ptr<?> debugfs_init;
        public Ptr<?> read;
        public Ptr<?> write;
        public Ptr<?> sync;
        public Ptr<?> drop;
    }

    @Type(noCCodeGeneration=true, cType="enum regcache_type")
    public static enum regcache_type implements Enum<regcache_type>,
    TypedEnum<regcache_type, Integer>
    {
        REGCACHE_NONE,
        REGCACHE_RBTREE,
        REGCACHE_FLAT,
        REGCACHE_MAPLE;

    }
}

