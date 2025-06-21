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

public class btf_enum {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("name_off"), Lib.C_INT.withName("val")}).withName("btf_enum");
    private static final ValueLayout.OfInt name_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name_off")});
    private static final long name_off$OFFSET = 0L;
    private static final ValueLayout.OfInt val$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"val")});
    private static final long val$OFFSET = 4L;

    btf_enum() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt name_off$layout() {
        return name_off$LAYOUT;
    }

    public static final long name_off$offset() {
        return 0L;
    }

    public static int name_off(MemorySegment struct) {
        return struct.get(name_off$LAYOUT, 0L);
    }

    public static void name_off(MemorySegment struct, int fieldValue) {
        struct.set(name_off$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt val$layout() {
        return val$LAYOUT;
    }

    public static final long val$offset() {
        return 4L;
    }

    public static int val(MemorySegment struct) {
        return struct.get(val$LAYOUT, 4L);
    }

    public static void val(MemorySegment struct, int fieldValue) {
        struct.set(val$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(btf_enum.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return btf_enum.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)btf_enum.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)btf_enum.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return btf_enum.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(btf_enum.layout().byteSize() * elementCount, arena, cleanup);
    }
}

