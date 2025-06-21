/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_xdp_query_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("prog_id"), Lib.C_INT.withName("drv_prog_id"), Lib.C_INT.withName("hw_prog_id"), Lib.C_INT.withName("skb_prog_id"), Lib.C_CHAR.withName("attach_mode"), MemoryLayout.paddingLayout((long)7L), Lib.C_LONG_LONG.withName("feature_flags"), Lib.C_INT.withName("xdp_zc_max_segs"), MemoryLayout.paddingLayout((long)4L)}).withName("bpf_xdp_query_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt prog_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_id")});
    private static final long prog_id$OFFSET = 8L;
    private static final ValueLayout.OfInt drv_prog_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"drv_prog_id")});
    private static final long drv_prog_id$OFFSET = 12L;
    private static final ValueLayout.OfInt hw_prog_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hw_prog_id")});
    private static final long hw_prog_id$OFFSET = 16L;
    private static final ValueLayout.OfInt skb_prog_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"skb_prog_id")});
    private static final long skb_prog_id$OFFSET = 20L;
    private static final ValueLayout.OfByte attach_mode$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_mode")});
    private static final long attach_mode$OFFSET = 24L;
    private static final ValueLayout.OfLong feature_flags$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"feature_flags")});
    private static final long feature_flags$OFFSET = 32L;
    private static final ValueLayout.OfInt xdp_zc_max_segs$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"xdp_zc_max_segs")});
    private static final long xdp_zc_max_segs$OFFSET = 40L;

    bpf_xdp_query_opts() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong sz$layout() {
        return sz$LAYOUT;
    }

    public static final long sz$offset() {
        return 0L;
    }

    public static long sz(MemorySegment struct) {
        return struct.get(sz$LAYOUT, 0L);
    }

    public static void sz(MemorySegment struct, long fieldValue) {
        struct.set(sz$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_id$layout() {
        return prog_id$LAYOUT;
    }

    public static final long prog_id$offset() {
        return 8L;
    }

    public static int prog_id(MemorySegment struct) {
        return struct.get(prog_id$LAYOUT, 8L);
    }

    public static void prog_id(MemorySegment struct, int fieldValue) {
        struct.set(prog_id$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt drv_prog_id$layout() {
        return drv_prog_id$LAYOUT;
    }

    public static final long drv_prog_id$offset() {
        return 12L;
    }

    public static int drv_prog_id(MemorySegment struct) {
        return struct.get(drv_prog_id$LAYOUT, 12L);
    }

    public static void drv_prog_id(MemorySegment struct, int fieldValue) {
        struct.set(drv_prog_id$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt hw_prog_id$layout() {
        return hw_prog_id$LAYOUT;
    }

    public static final long hw_prog_id$offset() {
        return 16L;
    }

    public static int hw_prog_id(MemorySegment struct) {
        return struct.get(hw_prog_id$LAYOUT, 16L);
    }

    public static void hw_prog_id(MemorySegment struct, int fieldValue) {
        struct.set(hw_prog_id$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt skb_prog_id$layout() {
        return skb_prog_id$LAYOUT;
    }

    public static final long skb_prog_id$offset() {
        return 20L;
    }

    public static int skb_prog_id(MemorySegment struct) {
        return struct.get(skb_prog_id$LAYOUT, 20L);
    }

    public static void skb_prog_id(MemorySegment struct, int fieldValue) {
        struct.set(skb_prog_id$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfByte attach_mode$layout() {
        return attach_mode$LAYOUT;
    }

    public static final long attach_mode$offset() {
        return 24L;
    }

    public static byte attach_mode(MemorySegment struct) {
        return struct.get(attach_mode$LAYOUT, 24L);
    }

    public static void attach_mode(MemorySegment struct, byte fieldValue) {
        struct.set(attach_mode$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfLong feature_flags$layout() {
        return feature_flags$LAYOUT;
    }

    public static final long feature_flags$offset() {
        return 32L;
    }

    public static long feature_flags(MemorySegment struct) {
        return struct.get(feature_flags$LAYOUT, 32L);
    }

    public static void feature_flags(MemorySegment struct, long fieldValue) {
        struct.set(feature_flags$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt xdp_zc_max_segs$layout() {
        return xdp_zc_max_segs$LAYOUT;
    }

    public static final long xdp_zc_max_segs$offset() {
        return 40L;
    }

    public static int xdp_zc_max_segs(MemorySegment struct) {
        return struct.get(xdp_zc_max_segs$LAYOUT, 40L);
    }

    public static void xdp_zc_max_segs(MemorySegment struct, int fieldValue) {
        struct.set(xdp_zc_max_segs$LAYOUT, 40L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_xdp_query_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_xdp_query_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_xdp_query_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_xdp_query_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_xdp_query_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_xdp_query_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

