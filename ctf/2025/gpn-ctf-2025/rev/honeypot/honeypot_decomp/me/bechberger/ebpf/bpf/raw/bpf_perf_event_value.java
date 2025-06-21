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

public class bpf_perf_event_value {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("counter"), Lib.C_LONG_LONG.withName("enabled"), Lib.C_LONG_LONG.withName("running")}).withName("bpf_perf_event_value");
    private static final ValueLayout.OfLong counter$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"counter")});
    private static final long counter$OFFSET = 0L;
    private static final ValueLayout.OfLong enabled$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"enabled")});
    private static final long enabled$OFFSET = 8L;
    private static final ValueLayout.OfLong running$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"running")});
    private static final long running$OFFSET = 16L;

    bpf_perf_event_value() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong counter$layout() {
        return counter$LAYOUT;
    }

    public static final long counter$offset() {
        return 0L;
    }

    public static long counter(MemorySegment struct) {
        return struct.get(counter$LAYOUT, 0L);
    }

    public static void counter(MemorySegment struct, long fieldValue) {
        struct.set(counter$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfLong enabled$layout() {
        return enabled$LAYOUT;
    }

    public static final long enabled$offset() {
        return 8L;
    }

    public static long enabled(MemorySegment struct) {
        return struct.get(enabled$LAYOUT, 8L);
    }

    public static void enabled(MemorySegment struct, long fieldValue) {
        struct.set(enabled$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfLong running$layout() {
        return running$LAYOUT;
    }

    public static final long running$offset() {
        return 16L;
    }

    public static long running(MemorySegment struct) {
        return struct.get(running$LAYOUT, 16L);
    }

    public static void running(MemorySegment struct, long fieldValue) {
        struct.set(running$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_perf_event_value.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_perf_event_value.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_perf_event_value.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_perf_event_value.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_perf_event_value.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_perf_event_value.layout().byteSize() * elementCount, arena, cleanup);
    }
}

