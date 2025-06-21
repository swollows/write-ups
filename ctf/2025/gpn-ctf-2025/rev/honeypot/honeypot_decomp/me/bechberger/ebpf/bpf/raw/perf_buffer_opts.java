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

public class perf_buffer_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("sample_period"), MemoryLayout.paddingLayout((long)4L)}).withName("perf_buffer_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt sample_period$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sample_period")});
    private static final long sample_period$OFFSET = 8L;

    perf_buffer_opts() {
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

    public static final ValueLayout.OfInt sample_period$layout() {
        return sample_period$LAYOUT;
    }

    public static final long sample_period$offset() {
        return 8L;
    }

    public static int sample_period(MemorySegment struct) {
        return struct.get(sample_period$LAYOUT, 8L);
    }

    public static void sample_period(MemorySegment struct, int fieldValue) {
        struct.set(sample_period$LAYOUT, 8L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(perf_buffer_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return perf_buffer_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)perf_buffer_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)perf_buffer_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return perf_buffer_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(perf_buffer_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

