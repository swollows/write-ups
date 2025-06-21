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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class pthread_barrier_t {
    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)32L, (MemoryLayout)Lib.C_CHAR).withName("__size"), Lib.C_LONG.withName("__align")}).withName("$anon$108:9");
    private static final SequenceLayout __size$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__size")});
    private static final long __size$OFFSET = 0L;
    private static long[] __size$DIMS = new long[]{32L};
    private static final VarHandle __size$ELEM_HANDLE = __size$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfLong __align$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__align")});
    private static final long __align$OFFSET = 0L;

    pthread_barrier_t() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout __size$layout() {
        return __size$LAYOUT;
    }

    public static final long __size$offset() {
        return 0L;
    }

    public static MemorySegment __size(MemorySegment union) {
        return union.asSlice(0L, __size$LAYOUT.byteSize());
    }

    public static void __size(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)__size$LAYOUT.byteSize());
    }

    public static long[] __size$dimensions() {
        return __size$DIMS;
    }

    public static byte __size(MemorySegment union, long index0) {
        return __size$ELEM_HANDLE.get(union, 0L, index0);
    }

    public static void __size(MemorySegment union, long index0, byte fieldValue) {
        __size$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfLong __align$layout() {
        return __align$LAYOUT;
    }

    public static final long __align$offset() {
        return 0L;
    }

    public static long __align(MemorySegment union) {
        return union.get(__align$LAYOUT, 0L);
    }

    public static void __align(MemorySegment union, long fieldValue) {
        union.set(__align$LAYOUT, 0L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(pthread_barrier_t.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return pthread_barrier_t.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)pthread_barrier_t.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)pthread_barrier_t.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return pthread_barrier_t.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(pthread_barrier_t.layout().byteSize() * elementCount, arena, cleanup);
    }
}

