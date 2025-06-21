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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ZpoolDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean zpool_can_sleep_mapped(Ptr<runtime.zpool> zpool2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zpool_create_pool((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.zpool> zpool_create_pool(String type2, String name, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zpool_destroy_pool(Ptr<runtime.zpool> zpool2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zpool_free(Ptr<runtime.zpool> zpool2, @Unsigned long handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zpool_get_driver((const u8*)$arg1)")
    public static Ptr<zpool_driver> zpool_get_driver(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zpool_get_total_pages(Ptr<runtime.zpool> zpool2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)zpool_get_type($arg1))")
    public static String zpool_get_type(Ptr<runtime.zpool> zpool2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean zpool_has_pool(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zpool_malloc(Ptr<runtime.zpool> zpool2, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned Long> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean zpool_malloc_support_movable(Ptr<runtime.zpool> zpool2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> zpool_map_handle(Ptr<runtime.zpool> zpool2, @Unsigned long handle, zpool_mapmode mapmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zpool_put_driver(Ptr<zpool_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zpool_register_driver(Ptr<zpool_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zpool_unmap_handle(Ptr<runtime.zpool> zpool2, @Unsigned long handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zpool_unregister_driver(Ptr<zpool_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct zpool_driver")
    @NotUsableInJava
    public static class zpool_driver
    extends Struct {
        public String type;
        public Ptr<runtime.module> owner;
        public AtomicDefinitions.atomic_t refcount;
        public ListDefinitions.list_head list;
        public Ptr<?> create;
        public Ptr<?> destroy;
        public boolean malloc_support_movable;
        public Ptr<?> malloc;
        public Ptr<?> free;
        public boolean sleep_mapped;
        public Ptr<?> map;
        public Ptr<?> unmap;
        public Ptr<?> total_pages;
    }

    @Type(noCCodeGeneration=true, cType="enum zpool_mapmode")
    public static enum zpool_mapmode implements Enum<zpool_mapmode>,
    TypedEnum<zpool_mapmode, Integer>
    {
        ZPOOL_MM_RW,
        ZPOOL_MM_RO,
        ZPOOL_MM_WO,
        ZPOOL_MM_DEFAULT;

    }
}

