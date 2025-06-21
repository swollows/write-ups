/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mb_cache_entry_free(Ptr<mb_cache> cache, Ptr<mb_cache_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mb_avg_fragment_size_order(Ptr<SuperDefinitions.super_block> sb, @OriginalName(value="ext4_grpblk_t") int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_buddy_mark_free(Ptr<Ext4Definitions.ext4_buddy> e4b, int first, int last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mb_cache_count(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mb_cache> mb_cache_create(int bucket_bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_cache_destroy(Ptr<mb_cache> cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mb_cache_entry_create(Ptr<mb_cache> cache, @Unsigned @OriginalName(value="gfp_t") int mask, @Unsigned int key2, @Unsigned long value, boolean reusable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mb_cache_entry> mb_cache_entry_delete_or_get(Ptr<mb_cache> cache, @Unsigned int key2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mb_cache_entry> mb_cache_entry_find_first(Ptr<mb_cache> cache, @Unsigned int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mb_cache_entry> mb_cache_entry_find_next(Ptr<mb_cache> cache, Ptr<mb_cache_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mb_cache_entry> mb_cache_entry_get(Ptr<mb_cache> cache, @Unsigned int key2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_cache_entry_put(Ptr<mb_cache> cache, Ptr<mb_cache_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_cache_entry_touch(Ptr<mb_cache> cache, Ptr<mb_cache_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_cache_entry_wait_unused(Ptr<mb_cache_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mb_cache_scan(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mb_cache_shrink(Ptr<mb_cache> cache, @Unsigned long nr_to_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_cache_shrink_worker(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_clear_bits(Ptr<?> bm, int cur, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mb_find_buddy(Ptr<Ext4Definitions.ext4_buddy> e4b, int order, Ptr<Integer> max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mb_find_extent(Ptr<Ext4Definitions.ext4_buddy> e4b, int block, int needed, Ptr<Ext4Definitions.ext4_free_extent> ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mb_find_order_for_block(Ptr<Ext4Definitions.ext4_buddy> e4b, int block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_free_blocks(Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_buddy> e4b, int first, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mb_mark_used(Ptr<Ext4Definitions.ext4_buddy> e4b, Ptr<Ext4Definitions.ext4_free_extent> ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_set_bits(Ptr<?> bm, int cur, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mb_update_avg_fragment_size(Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_group_info> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mb_cache")
    @NotUsableInJava
    public static class mb_cache
    extends Struct {
        public Ptr<misc.hlist_bl_head> c_hash;
        public int c_bucket_bits;
        public @Unsigned long c_max_entries;
        public  @OriginalName(value="spinlock_t") runtime.spinlock c_list_lock;
        public ListDefinitions.list_head c_list;
        public @Unsigned long c_entry_count;
        public Ptr<runtime.shrinker> c_shrink;
        public misc.work_struct c_shrink_work;
    }

    @Type(noCCodeGeneration=true, cType="struct mb_cache_entry")
    @NotUsableInJava
    public static class mb_cache_entry
    extends Struct {
        public ListDefinitions.list_head e_list;
        public misc.hlist_bl_node e_hash_list;
        public AtomicDefinitions.atomic_t e_refcnt;
        public @Unsigned int e_key;
        public @Unsigned long e_flags;
        public @Unsigned long e_value;
    }
}

