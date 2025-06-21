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

public class timeval {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("tv_sec"), Lib.C_LONG.withName("tv_usec")}).withName("timeval");
    private static final ValueLayout.OfLong tv_sec$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tv_sec")});
    private static final long tv_sec$OFFSET = 0L;
    private static final ValueLayout.OfLong tv_usec$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tv_usec")});
    private static final long tv_usec$OFFSET = 8L;

    timeval() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong tv_sec$layout() {
        return tv_sec$LAYOUT;
    }

    public static final long tv_sec$offset() {
        return 0L;
    }

    public static long tv_sec(MemorySegment struct) {
        return struct.get(tv_sec$LAYOUT, 0L);
    }

    public static void tv_sec(MemorySegment struct, long fieldValue) {
        struct.set(tv_sec$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfLong tv_usec$layout() {
        return tv_usec$LAYOUT;
    }

    public static final long tv_usec$offset() {
        return 8L;
    }

    public static long tv_usec(MemorySegment struct) {
        return struct.get(tv_usec$LAYOUT, 8L);
    }

    public static void tv_usec(MemorySegment struct, long fieldValue) {
        struct.set(tv_usec$LAYOUT, 8L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(timeval.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return timeval.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)timeval.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)timeval.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return timeval.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(timeval.layout().byteSize() * elementCount, arena, cleanup);
    }
}

