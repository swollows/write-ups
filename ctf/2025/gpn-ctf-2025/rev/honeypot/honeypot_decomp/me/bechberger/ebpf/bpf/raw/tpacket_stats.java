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

public class tpacket_stats {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("tp_packets"), Lib.C_INT.withName("tp_drops")}).withName("tpacket_stats");
    private static final ValueLayout.OfInt tp_packets$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_packets")});
    private static final long tp_packets$OFFSET = 0L;
    private static final ValueLayout.OfInt tp_drops$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_drops")});
    private static final long tp_drops$OFFSET = 4L;

    tpacket_stats() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt tp_packets$layout() {
        return tp_packets$LAYOUT;
    }

    public static final long tp_packets$offset() {
        return 0L;
    }

    public static int tp_packets(MemorySegment struct) {
        return struct.get(tp_packets$LAYOUT, 0L);
    }

    public static void tp_packets(MemorySegment struct, int fieldValue) {
        struct.set(tp_packets$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_drops$layout() {
        return tp_drops$LAYOUT;
    }

    public static final long tp_drops$offset() {
        return 4L;
    }

    public static int tp_drops(MemorySegment struct) {
        return struct.get(tp_drops$LAYOUT, 4L);
    }

    public static void tp_drops(MemorySegment struct, int fieldValue) {
        struct.set(tp_drops$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_stats.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_stats.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_stats.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_stats.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_stats.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_stats.layout().byteSize() * elementCount, arena, cleanup);
    }
}

