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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ZoneDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zone_device_page_init(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.zone> zone_for_pfn_range(int online_type, int nid, Ptr<MemoryDefinitions.memory_group> group, @Unsigned long start_pfn, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zone_reclaimable_pages(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zone_sizes_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __zone_set_pageset_high_and_batch(Ptr<runtime.zone> zone2, @Unsigned long high_min, @Unsigned long high_max, @Unsigned long batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __zone_watermark_ok(Ptr<runtime.zone> z, @Unsigned int order, @Unsigned long mark, int highest_zoneidx, @Unsigned int alloc_flags, long free_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zone_batchsize(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zone_highsize(Ptr<runtime.zone> zone2, int batch2, int cpu_online, int high_fraction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zone_pcp_disable(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zone_pcp_enable(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zone_pcp_init(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zone_pcp_reset(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zone_set_pageset_high_and_batch(Ptr<runtime.zone> zone2, int cpu_online) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean zone_watermark_ok(Ptr<runtime.zone> z, @Unsigned int order, @Unsigned long mark, int highest_zoneidx, @Unsigned int alloc_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean zone_watermark_ok_safe(Ptr<runtime.zone> z, @Unsigned int order, @Unsigned long mark, int highest_zoneidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct zone_report_args")
    @NotUsableInJava
    public static class zone_report_args
    extends Struct {
        public Ptr<BlkDefinitions.blk_zone> zones;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int sector; u8 status; }")
    @NotUsableInJava
    public static class zone_append_of_in_hdr_of_virtblk_req
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio64") long sector;
        public char status;
    }

    @Type(noCCodeGeneration=true, cType="enum zone_flags")
    public static enum zone_flags implements Enum<zone_flags>,
    TypedEnum<zone_flags, Integer>
    {
        ZONE_BOOSTED_WATERMARK,
        ZONE_RECLAIM_ACTIVE,
        ZONE_BELOW_HIGH;

    }

    @Type(noCCodeGeneration=true, cType="enum zone_watermarks")
    public static enum zone_watermarks implements Enum<zone_watermarks>,
    TypedEnum<zone_watermarks, Integer>
    {
        WMARK_MIN,
        WMARK_LOW,
        WMARK_HIGH,
        WMARK_PROMO,
        NR_WMARK;

    }

    @Type(noCCodeGeneration=true, cType="enum zone_stat_item")
    public static enum zone_stat_item implements Enum<zone_stat_item>,
    TypedEnum<zone_stat_item, Integer>
    {
        NR_FREE_PAGES,
        NR_ZONE_LRU_BASE,
        NR_ZONE_INACTIVE_ANON,
        NR_ZONE_ACTIVE_ANON,
        NR_ZONE_INACTIVE_FILE,
        NR_ZONE_ACTIVE_FILE,
        NR_ZONE_UNEVICTABLE,
        NR_ZONE_WRITE_PENDING,
        NR_MLOCK,
        NR_BOUNCE,
        NR_ZSPAGES,
        NR_FREE_CMA_PAGES,
        NR_UNACCEPTED,
        NR_VM_ZONE_STAT_ITEMS;

    }

    @Type(noCCodeGeneration=true, cType="enum zone_type")
    public static enum zone_type implements Enum<zone_type>,
    TypedEnum<zone_type, Integer>
    {
        ZONE_DMA,
        ZONE_DMA32,
        ZONE_NORMAL,
        ZONE_MOVABLE,
        ZONE_DEVICE,
        __MAX_NR_ZONES;

    }
}

