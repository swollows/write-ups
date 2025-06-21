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
import me.bechberger.ebpf.bpf.raw.tpacket_bd_ts;

public class tpacket_hdr_v1 {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("block_status"), Lib.C_INT.withName("num_pkts"), Lib.C_INT.withName("offset_to_first_pkt"), Lib.C_INT.withName("blk_len"), Lib.C_LONG_LONG.withName("seq_num"), tpacket_bd_ts.layout().withName("ts_first_pkt"), tpacket_bd_ts.layout().withName("ts_last_pkt")}).withName("tpacket_hdr_v1");
    private static final ValueLayout.OfInt block_status$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"block_status")});
    private static final long block_status$OFFSET = 0L;
    private static final ValueLayout.OfInt num_pkts$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"num_pkts")});
    private static final long num_pkts$OFFSET = 4L;
    private static final ValueLayout.OfInt offset_to_first_pkt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"offset_to_first_pkt")});
    private static final long offset_to_first_pkt$OFFSET = 8L;
    private static final ValueLayout.OfInt blk_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"blk_len")});
    private static final long blk_len$OFFSET = 12L;
    private static final ValueLayout.OfLong seq_num$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"seq_num")});
    private static final long seq_num$OFFSET = 16L;
    private static final GroupLayout ts_first_pkt$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ts_first_pkt")});
    private static final long ts_first_pkt$OFFSET = 24L;
    private static final GroupLayout ts_last_pkt$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ts_last_pkt")});
    private static final long ts_last_pkt$OFFSET = 32L;

    tpacket_hdr_v1() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt block_status$layout() {
        return block_status$LAYOUT;
    }

    public static final long block_status$offset() {
        return 0L;
    }

    public static int block_status(MemorySegment struct) {
        return struct.get(block_status$LAYOUT, 0L);
    }

    public static void block_status(MemorySegment struct, int fieldValue) {
        struct.set(block_status$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt num_pkts$layout() {
        return num_pkts$LAYOUT;
    }

    public static final long num_pkts$offset() {
        return 4L;
    }

    public static int num_pkts(MemorySegment struct) {
        return struct.get(num_pkts$LAYOUT, 4L);
    }

    public static void num_pkts(MemorySegment struct, int fieldValue) {
        struct.set(num_pkts$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt offset_to_first_pkt$layout() {
        return offset_to_first_pkt$LAYOUT;
    }

    public static final long offset_to_first_pkt$offset() {
        return 8L;
    }

    public static int offset_to_first_pkt(MemorySegment struct) {
        return struct.get(offset_to_first_pkt$LAYOUT, 8L);
    }

    public static void offset_to_first_pkt(MemorySegment struct, int fieldValue) {
        struct.set(offset_to_first_pkt$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt blk_len$layout() {
        return blk_len$LAYOUT;
    }

    public static final long blk_len$offset() {
        return 12L;
    }

    public static int blk_len(MemorySegment struct) {
        return struct.get(blk_len$LAYOUT, 12L);
    }

    public static void blk_len(MemorySegment struct, int fieldValue) {
        struct.set(blk_len$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfLong seq_num$layout() {
        return seq_num$LAYOUT;
    }

    public static final long seq_num$offset() {
        return 16L;
    }

    public static long seq_num(MemorySegment struct) {
        return struct.get(seq_num$LAYOUT, 16L);
    }

    public static void seq_num(MemorySegment struct, long fieldValue) {
        struct.set(seq_num$LAYOUT, 16L, fieldValue);
    }

    public static final GroupLayout ts_first_pkt$layout() {
        return ts_first_pkt$LAYOUT;
    }

    public static final long ts_first_pkt$offset() {
        return 24L;
    }

    public static MemorySegment ts_first_pkt(MemorySegment struct) {
        return struct.asSlice(24L, ts_first_pkt$LAYOUT.byteSize());
    }

    public static void ts_first_pkt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)24L, (long)ts_first_pkt$LAYOUT.byteSize());
    }

    public static final GroupLayout ts_last_pkt$layout() {
        return ts_last_pkt$LAYOUT;
    }

    public static final long ts_last_pkt$offset() {
        return 32L;
    }

    public static MemorySegment ts_last_pkt(MemorySegment struct) {
        return struct.asSlice(32L, ts_last_pkt$LAYOUT.byteSize());
    }

    public static void ts_last_pkt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)ts_last_pkt$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_hdr_v1.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_hdr_v1.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_hdr_v1.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_hdr_v1.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_hdr_v1.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_hdr_v1.layout().byteSize() * elementCount, arena, cleanup);
    }
}

