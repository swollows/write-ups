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
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SlabDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ___slab_alloc(Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfpflags, int node2, @Unsigned long addr2, Ptr<KmemDefinitions.kmem_cache_cpu> c, @Unsigned int orig_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __slab_free(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, Ptr<?> head, Ptr<?> tail, int cnt, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long slab_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="slab_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long slab_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void slab_bug(Ptr<KmemDefinitions.kmem_cache> s2, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_debug_trace_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_debug_trace_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_debugfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> slab_debugfs_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_debugfs_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> slab_debugfs_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void slab_debugfs_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="slab_err($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void slab_err(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void slab_fix(Ptr<KmemDefinitions.kmem_cache> s2, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_memory_callback(Ptr<misc.notifier_block> self, @Unsigned long action, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void slab_out_of_memory(Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int gfpflags, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void slab_pad_check(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long slab_size_show(Ptr<KmemDefinitions.kmem_cache> s2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> slab_build_skb(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean slab_is_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void slab_kmem_cache_release(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> slab_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> slab_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void slab_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int slab_unmergeable(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct slab_attribute")
    @NotUsableInJava
    public static class slab_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="enum slab_stat_type")
    public static enum slab_stat_type implements Enum<slab_stat_type>,
    TypedEnum<slab_stat_type, Integer>
    {
        SL_ALL,
        SL_PARTIAL,
        SL_CPU,
        SL_OBJECTS,
        SL_TOTAL;

    }

    @Type(noCCodeGeneration=true, cType="enum slab_state")
    public static enum slab_state implements Enum<slab_state>,
    TypedEnum<slab_state, Integer>
    {
        DOWN,
        PARTIAL,
        UP,
        FULL;

    }

    @Type(noCCodeGeneration=true, cType="enum _slab_flag_bits")
    public static enum _slab_flag_bits implements Enum<_slab_flag_bits>,
    TypedEnum<_slab_flag_bits, Integer>
    {
        _SLAB_CONSISTENCY_CHECKS,
        _SLAB_RED_ZONE,
        _SLAB_POISON,
        _SLAB_KMALLOC,
        _SLAB_HWCACHE_ALIGN,
        _SLAB_CACHE_DMA,
        _SLAB_CACHE_DMA32,
        _SLAB_STORE_USER,
        _SLAB_PANIC,
        _SLAB_TYPESAFE_BY_RCU,
        _SLAB_TRACE,
        _SLAB_NOLEAKTRACE,
        _SLAB_NO_MERGE,
        _SLAB_ACCOUNT,
        _SLAB_NO_USER_FLAGS,
        _SLAB_SKIP_KFENCE,
        _SLAB_RECLAIM_ACCOUNT,
        _SLAB_OBJECT_POISON,
        _SLAB_CMPXCHG_DOUBLE,
        _SLAB_NO_OBJ_EXT,
        _SLAB_FLAGS_LAST_BIT;

    }
}

