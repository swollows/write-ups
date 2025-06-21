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
 *  java.lang.foreign.ValueLayout$OfShort
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

public class sockaddr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("sa_family"), MemoryLayout.sequenceLayout((long)14L, (MemoryLayout)Lib.C_CHAR).withName("sa_data")}).withName("sockaddr");
    private static final ValueLayout.OfShort sa_family$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sa_family")});
    private static final long sa_family$OFFSET = 0L;
    private static final SequenceLayout sa_data$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sa_data")});
    private static final long sa_data$OFFSET = 2L;
    private static long[] sa_data$DIMS = new long[]{14L};
    private static final VarHandle sa_data$ELEM_HANDLE = sa_data$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    sockaddr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort sa_family$layout() {
        return sa_family$LAYOUT;
    }

    public static final long sa_family$offset() {
        return 0L;
    }

    public static short sa_family(MemorySegment struct) {
        return struct.get(sa_family$LAYOUT, 0L);
    }

    public static void sa_family(MemorySegment struct, short fieldValue) {
        struct.set(sa_family$LAYOUT, 0L, fieldValue);
    }

    public static final SequenceLayout sa_data$layout() {
        return sa_data$LAYOUT;
    }

    public static final long sa_data$offset() {
        return 2L;
    }

    public static MemorySegment sa_data(MemorySegment struct) {
        return struct.asSlice(2L, sa_data$LAYOUT.byteSize());
    }

    public static void sa_data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)2L, (long)sa_data$LAYOUT.byteSize());
    }

    public static long[] sa_data$dimensions() {
        return sa_data$DIMS;
    }

    public static byte sa_data(MemorySegment struct, long index0) {
        return sa_data$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void sa_data(MemorySegment struct, long index0, byte fieldValue) {
        sa_data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(sockaddr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return sockaddr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)sockaddr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sockaddr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return sockaddr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(sockaddr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

