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

public class tpacket_bd_ts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ts_sec"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ts_usec"), Lib.C_INT.withName("ts_nsec")}).withName("$anon$187:2")}).withName("tpacket_bd_ts");
    private static final ValueLayout.OfInt ts_sec$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ts_sec")});
    private static final long ts_sec$OFFSET = 0L;
    private static final ValueLayout.OfInt ts_usec$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$187:2"), MemoryLayout.PathElement.groupElement((String)"ts_usec")});
    private static final long ts_usec$OFFSET = 4L;
    private static final ValueLayout.OfInt ts_nsec$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$187:2"), MemoryLayout.PathElement.groupElement((String)"ts_nsec")});
    private static final long ts_nsec$OFFSET = 4L;

    tpacket_bd_ts() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt ts_sec$layout() {
        return ts_sec$LAYOUT;
    }

    public static final long ts_sec$offset() {
        return 0L;
    }

    public static int ts_sec(MemorySegment struct) {
        return struct.get(ts_sec$LAYOUT, 0L);
    }

    public static void ts_sec(MemorySegment struct, int fieldValue) {
        struct.set(ts_sec$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt ts_usec$layout() {
        return ts_usec$LAYOUT;
    }

    public static final long ts_usec$offset() {
        return 4L;
    }

    public static int ts_usec(MemorySegment struct) {
        return struct.get(ts_usec$LAYOUT, 4L);
    }

    public static void ts_usec(MemorySegment struct, int fieldValue) {
        struct.set(ts_usec$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt ts_nsec$layout() {
        return ts_nsec$LAYOUT;
    }

    public static final long ts_nsec$offset() {
        return 4L;
    }

    public static int ts_nsec(MemorySegment struct) {
        return struct.get(ts_nsec$LAYOUT, 4L);
    }

    public static void ts_nsec(MemorySegment struct, int fieldValue) {
        struct.set(ts_nsec$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_bd_ts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_bd_ts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_bd_ts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_bd_ts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_bd_ts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_bd_ts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

