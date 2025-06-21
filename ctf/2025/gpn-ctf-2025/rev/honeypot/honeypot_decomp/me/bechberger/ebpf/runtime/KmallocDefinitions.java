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
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KmallocDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ___kmalloc_large_node(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __kmalloc_cache_node_noprof(Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfpflags, int node2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __kmalloc_cache_noprof(Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfpflags, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __kmalloc_large_node_noprof(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __kmalloc_large_noprof(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __kmalloc_node_noprof(@Unsigned long size, Ptr<Ptr<KmemDefinitions.kmem_cache> @Size(value=14) @OriginalName(value="kmem_buckets") []> b, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __kmalloc_node_track_caller_noprof(@Unsigned long size, Ptr<Ptr<KmemDefinitions.kmem_cache> @Size(value=14) @OriginalName(value="kmem_buckets") []> b, @Unsigned @OriginalName(value="gfp_t") int flags, int node2, @Unsigned long caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __kmalloc_noprof(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kmalloc_reserve(Ptr<@Unsigned Integer> size, @Unsigned @OriginalName(value="gfp_t") int flags, int node2, Ptr<@OriginalName(value="bool") Boolean> pfmemalloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="gfp_t") int kmalloc_fix_flags(@Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kmalloc_size_roundup(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kmalloc_info_struct")
    @NotUsableInJava
    public static class kmalloc_info_struct
    extends Struct {
        public String @Size(value=19) [] name;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="enum kmalloc_cache_type")
    public static enum kmalloc_cache_type implements Enum<kmalloc_cache_type>,
    TypedEnum<kmalloc_cache_type, Integer>
    {
        KMALLOC_NORMAL,
        KMALLOC_RANDOM_START,
        KMALLOC_RANDOM_END,
        KMALLOC_RECLAIM,
        KMALLOC_DMA,
        KMALLOC_CGROUP,
        NR_KMALLOC_TYPES;

    }
}

