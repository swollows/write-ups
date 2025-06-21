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
 *  java.lang.foreign.ValueLayout$OfInt
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

public class tpacket_req3 {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("tp_block_size"), Lib.C_INT.withName("tp_block_nr"), Lib.C_INT.withName("tp_frame_size"), Lib.C_INT.withName("tp_frame_nr"), Lib.C_INT.withName("tp_retire_blk_tov"), Lib.C_INT.withName("tp_sizeof_priv"), Lib.C_INT.withName("tp_feature_req_word")}).withName("tpacket_req3");
    private static final ValueLayout.OfInt tp_block_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_block_size")});
    private static final long tp_block_size$OFFSET = 0L;
    private static final ValueLayout.OfInt tp_block_nr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_block_nr")});
    private static final long tp_block_nr$OFFSET = 4L;
    private static final ValueLayout.OfInt tp_frame_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_frame_size")});
    private static final long tp_frame_size$OFFSET = 8L;
    private static final ValueLayout.OfInt tp_frame_nr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_frame_nr")});
    private static final long tp_frame_nr$OFFSET = 12L;
    private static final ValueLayout.OfInt tp_retire_blk_tov$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_retire_blk_tov")});
    private static final long tp_retire_blk_tov$OFFSET = 16L;
    private static final ValueLayout.OfInt tp_sizeof_priv$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_sizeof_priv")});
    private static final long tp_sizeof_priv$OFFSET = 20L;
    private static final ValueLayout.OfInt tp_feature_req_word$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_feature_req_word")});
    private static final long tp_feature_req_word$OFFSET = 24L;

    tpacket_req3() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt tp_block_size$layout() {
        return tp_block_size$LAYOUT;
    }

    public static final long tp_block_size$offset() {
        return 0L;
    }

    public static int tp_block_size(MemorySegment struct) {
        return struct.get(tp_block_size$LAYOUT, 0L);
    }

    public static void tp_block_size(MemorySegment struct, int fieldValue) {
        struct.set(tp_block_size$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_block_nr$layout() {
        return tp_block_nr$LAYOUT;
    }

    public static final long tp_block_nr$offset() {
        return 4L;
    }

    public static int tp_block_nr(MemorySegment struct) {
        return struct.get(tp_block_nr$LAYOUT, 4L);
    }

    public static void tp_block_nr(MemorySegment struct, int fieldValue) {
        struct.set(tp_block_nr$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_frame_size$layout() {
        return tp_frame_size$LAYOUT;
    }

    public static final long tp_frame_size$offset() {
        return 8L;
    }

    public static int tp_frame_size(MemorySegment struct) {
        return struct.get(tp_frame_size$LAYOUT, 8L);
    }

    public static void tp_frame_size(MemorySegment struct, int fieldValue) {
        struct.set(tp_frame_size$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_frame_nr$layout() {
        return tp_frame_nr$LAYOUT;
    }

    public static final long tp_frame_nr$offset() {
        return 12L;
    }

    public static int tp_frame_nr(MemorySegment struct) {
        return struct.get(tp_frame_nr$LAYOUT, 12L);
    }

    public static void tp_frame_nr(MemorySegment struct, int fieldValue) {
        struct.set(tp_frame_nr$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_retire_blk_tov$layout() {
        return tp_retire_blk_tov$LAYOUT;
    }

    public static final long tp_retire_blk_tov$offset() {
        return 16L;
    }

    public static int tp_retire_blk_tov(MemorySegment struct) {
        return struct.get(tp_retire_blk_tov$LAYOUT, 16L);
    }

    public static void tp_retire_blk_tov(MemorySegment struct, int fieldValue) {
        struct.set(tp_retire_blk_tov$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_sizeof_priv$layout() {
        return tp_sizeof_priv$LAYOUT;
    }

    public static final long tp_sizeof_priv$offset() {
        return 20L;
    }

    public static int tp_sizeof_priv(MemorySegment struct) {
        return struct.get(tp_sizeof_priv$LAYOUT, 20L);
    }

    public static void tp_sizeof_priv(MemorySegment struct, int fieldValue) {
        struct.set(tp_sizeof_priv$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_feature_req_word$layout() {
        return tp_feature_req_word$LAYOUT;
    }

    public static final long tp_feature_req_word$offset() {
        return 24L;
    }

    public static int tp_feature_req_word(MemorySegment struct) {
        return struct.get(tp_feature_req_word$LAYOUT, 24L);
    }

    public static void tp_feature_req_word(MemorySegment struct, int fieldValue) {
        struct.set(tp_feature_req_word$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_req3.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_req3.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_req3.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_req3.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_req3.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_req3.layout().byteSize() * elementCount, arena, cleanup);
    }
}

