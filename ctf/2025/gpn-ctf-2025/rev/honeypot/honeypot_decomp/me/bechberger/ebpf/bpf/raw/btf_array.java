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

public class btf_array {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("type"), Lib.C_INT.withName("index_type"), Lib.C_INT.withName("nelems")}).withName("btf_array");
    private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 0L;
    private static final ValueLayout.OfInt index_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"index_type")});
    private static final long index_type$OFFSET = 4L;
    private static final ValueLayout.OfInt nelems$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nelems")});
    private static final long nelems$OFFSET = 8L;

    btf_array() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 0L;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 0L);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt index_type$layout() {
        return index_type$LAYOUT;
    }

    public static final long index_type$offset() {
        return 4L;
    }

    public static int index_type(MemorySegment struct) {
        return struct.get(index_type$LAYOUT, 4L);
    }

    public static void index_type(MemorySegment struct, int fieldValue) {
        struct.set(index_type$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt nelems$layout() {
        return nelems$LAYOUT;
    }

    public static final long nelems$offset() {
        return 8L;
    }

    public static int nelems(MemorySegment struct) {
        return struct.get(nelems$LAYOUT, 8L);
    }

    public static void nelems(MemorySegment struct, int fieldValue) {
        struct.set(nelems$LAYOUT, 8L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(btf_array.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return btf_array.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)btf_array.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)btf_array.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return btf_array.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(btf_array.layout().byteSize() * elementCount, arena, cleanup);
    }
}

