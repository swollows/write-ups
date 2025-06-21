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

public class linger {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("l_onoff"), Lib.C_INT.withName("l_linger")}).withName("linger");
    private static final ValueLayout.OfInt l_onoff$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"l_onoff")});
    private static final long l_onoff$OFFSET = 0L;
    private static final ValueLayout.OfInt l_linger$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"l_linger")});
    private static final long l_linger$OFFSET = 4L;

    linger() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt l_onoff$layout() {
        return l_onoff$LAYOUT;
    }

    public static final long l_onoff$offset() {
        return 0L;
    }

    public static int l_onoff(MemorySegment struct) {
        return struct.get(l_onoff$LAYOUT, 0L);
    }

    public static void l_onoff(MemorySegment struct, int fieldValue) {
        struct.set(l_onoff$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt l_linger$layout() {
        return l_linger$LAYOUT;
    }

    public static final long l_linger$offset() {
        return 4L;
    }

    public static int l_linger(MemorySegment struct) {
        return struct.get(l_linger$LAYOUT, 4L);
    }

    public static void l_linger(MemorySegment struct, int fieldValue) {
        struct.set(l_linger$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(linger.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return linger.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)linger.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)linger.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return linger.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(linger.layout().byteSize() * elementCount, arena, cleanup);
    }
}

