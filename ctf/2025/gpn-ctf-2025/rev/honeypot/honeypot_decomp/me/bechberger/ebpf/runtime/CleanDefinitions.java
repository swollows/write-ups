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
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.WpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CleanDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clean_bdev_aliases(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long block, @Unsigned @OriginalName(value="sector_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clean_acked_data_disable(Ptr<InetDefinitions.inet_connection_sock> icsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="clean_acked_data_enable($arg1, (void (*)(struct sock*, unsigned int))$arg2)")
    public static void clean_acked_data_enable(Ptr<InetDefinitions.inet_connection_sock> icsk, Ptr<?> cad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clean_acked_data_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clean_cache_range(Ptr<?> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clean_record_pte(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long clean_record_shared_mapping_range(Ptr<misc.address_space> mapping, @Unsigned long first_index, @Unsigned long nr, @Unsigned long bitmap_pgoff, Ptr<@Unsigned Long> bitmap2, Ptr<@Unsigned Long> start, Ptr<@Unsigned Long> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clean_xps_maps(Ptr<NetDefinitions.net_device> dev, misc.xps_map_type type2, @Unsigned short offset, @Unsigned short count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clean_opal_dev(Ptr<OpalDefinitions.opal_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void clean_path(String path2, @Unsigned @OriginalName(value="umode_t") short fmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int clean_sort_range(Ptr<runtime.range> range2, int az) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct clean_walk")
    @NotUsableInJava
    public static class clean_walk
    extends Struct {
        public WpDefinitions.wp_walk base;
        public @Unsigned long bitmap_pgoff;
        public Ptr<@Unsigned Long> bitmap;
        public @Unsigned long start;
        public @Unsigned long end;
    }
}

