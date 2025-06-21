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

public class cisco_proto {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("interval"), Lib.C_INT.withName("timeout")}).withName("$anon$77:9");
    private static final ValueLayout.OfInt interval$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"interval")});
    private static final long interval$OFFSET = 0L;
    private static final ValueLayout.OfInt timeout$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"timeout")});
    private static final long timeout$OFFSET = 4L;

    cisco_proto() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt interval$layout() {
        return interval$LAYOUT;
    }

    public static final long interval$offset() {
        return 0L;
    }

    public static int interval(MemorySegment struct) {
        return struct.get(interval$LAYOUT, 0L);
    }

    public static void interval(MemorySegment struct, int fieldValue) {
        struct.set(interval$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt timeout$layout() {
        return timeout$LAYOUT;
    }

    public static final long timeout$offset() {
        return 4L;
    }

    public static int timeout(MemorySegment struct) {
        return struct.get(timeout$LAYOUT, 4L);
    }

    public static void timeout(MemorySegment struct, int fieldValue) {
        struct.set(timeout$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(cisco_proto.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return cisco_proto.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)cisco_proto.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)cisco_proto.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return cisco_proto.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(cisco_proto.layout().byteSize() * elementCount, arena, cleanup);
    }
}

