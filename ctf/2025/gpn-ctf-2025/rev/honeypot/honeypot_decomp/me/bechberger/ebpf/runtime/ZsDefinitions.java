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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.ZpoolDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ZsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __zs_compact(Ptr<zs_pool> pool, Ptr<misc.size_class> _class2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __zs_map_object(Ptr<misc.mapping_area> area, Ptr<Ptr<runtime.page>> pages, int off, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zs_compact(Ptr<zs_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zs_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zs_cpu_prepare(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zs_create_pool((const u8*)$arg1)")
    public static Ptr<zs_pool> zs_create_pool(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_destroy_pool(Ptr<zs_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_free(Ptr<zs_pool> pool, @Unsigned long handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zs_get_total_pages(Ptr<zs_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zs_huge_class_size(Ptr<zs_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int zs_lookup_class_index(Ptr<zs_pool> pool, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zs_malloc(Ptr<zs_pool> pool, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> zs_map_object(Ptr<zs_pool> pool, @Unsigned long handle, zs_mapmode mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_object_copy(Ptr<misc.size_class> _class2, @Unsigned long dst, @Unsigned long src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean zs_page_isolate(Ptr<runtime.page> page2, @Unsigned @OriginalName(value="isolate_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zs_page_migrate(Ptr<runtime.page> newpage, Ptr<runtime.page> page2, MigrateDefinitions.migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_page_putback(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zs_shrinker_count(Ptr<runtime.shrinker> shrinker2, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zs_shrinker_scan(Ptr<runtime.shrinker> shrinker2, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_stat_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_unmap_object(Ptr<zs_pool> pool, @Unsigned long handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zs_zpool_create((const u8*)$arg1, $arg2)")
    public static Ptr<?> zs_zpool_create(String name, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_zpool_destroy(Ptr<?> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_zpool_free(Ptr<?> pool, @Unsigned long handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zs_zpool_malloc(Ptr<?> pool, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned Long> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> zs_zpool_map(Ptr<?> pool, @Unsigned long handle, ZpoolDefinitions.zpool_mapmode mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zs_zpool_total_pages(Ptr<?> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zs_zpool_unmap(Ptr<?> pool, @Unsigned long handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct zs_pool")
    @NotUsableInJava
    public static class zs_pool
    extends Struct {
        public String name;
        public Ptr<misc.size_class> @Size(value=255) [] size_class;
        public Ptr<KmemDefinitions.kmem_cache> handle_cachep;
        public Ptr<KmemDefinitions.kmem_cache> zspage_cachep;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t pages_allocated;
        public zs_pool_stats stats;
        public Ptr<runtime.shrinker> shrinker;
        public misc.work_struct free_work;
        public misc.rwlock_t migrate_lock;
        public AtomicDefinitions.atomic_t compaction_in_progress;
    }

    @Type(noCCodeGeneration=true, cType="struct zs_size_stat")
    @NotUsableInJava
    public static class zs_size_stat
    extends Struct {
        public @Unsigned long @Size(value=14) [] objs;
    }

    @Type(noCCodeGeneration=true, cType="struct zs_pool_stats")
    @NotUsableInJava
    public static class zs_pool_stats
    extends Struct {
        public @OriginalName(value="atomic_long_t") misc.atomic64_t pages_compacted;
    }

    @Type(noCCodeGeneration=true, cType="enum zs_mapmode")
    public static enum zs_mapmode implements Enum<zs_mapmode>,
    TypedEnum<zs_mapmode, Integer>
    {
        ZS_MM_RW,
        ZS_MM_RO,
        ZS_MM_WO;

    }
}

