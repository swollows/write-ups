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
import me.bechberger.ebpf.bpf.raw.in_addr;

public class sockaddr_in {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("sin_family"), Lib.C_SHORT.withName("sin_port"), in_addr.layout().withName("sin_addr"), MemoryLayout.sequenceLayout((long)8L, (MemoryLayout)Lib.C_CHAR).withName("__pad")}).withName("sockaddr_in");
    private static final ValueLayout.OfShort sin_family$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sin_family")});
    private static final long sin_family$OFFSET = 0L;
    private static final ValueLayout.OfShort sin_port$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sin_port")});
    private static final long sin_port$OFFSET = 2L;
    private static final GroupLayout sin_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sin_addr")});
    private static final long sin_addr$OFFSET = 4L;
    private static final SequenceLayout __pad$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__pad")});
    private static final long __pad$OFFSET = 8L;
    private static long[] __pad$DIMS = new long[]{8L};
    private static final VarHandle __pad$ELEM_HANDLE = __pad$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    sockaddr_in() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort sin_family$layout() {
        return sin_family$LAYOUT;
    }

    public static final long sin_family$offset() {
        return 0L;
    }

    public static short sin_family(MemorySegment struct) {
        return struct.get(sin_family$LAYOUT, 0L);
    }

    public static void sin_family(MemorySegment struct, short fieldValue) {
        struct.set(sin_family$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort sin_port$layout() {
        return sin_port$LAYOUT;
    }

    public static final long sin_port$offset() {
        return 2L;
    }

    public static short sin_port(MemorySegment struct) {
        return struct.get(sin_port$LAYOUT, 2L);
    }

    public static void sin_port(MemorySegment struct, short fieldValue) {
        struct.set(sin_port$LAYOUT, 2L, fieldValue);
    }

    public static final GroupLayout sin_addr$layout() {
        return sin_addr$LAYOUT;
    }

    public static final long sin_addr$offset() {
        return 4L;
    }

    public static MemorySegment sin_addr(MemorySegment struct) {
        return struct.asSlice(4L, sin_addr$LAYOUT.byteSize());
    }

    public static void sin_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)sin_addr$LAYOUT.byteSize());
    }

    public static final SequenceLayout __pad$layout() {
        return __pad$LAYOUT;
    }

    public static final long __pad$offset() {
        return 8L;
    }

    public static MemorySegment __pad(MemorySegment struct) {
        return struct.asSlice(8L, __pad$LAYOUT.byteSize());
    }

    public static void __pad(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)__pad$LAYOUT.byteSize());
    }

    public static long[] __pad$dimensions() {
        return __pad$DIMS;
    }

    public static byte __pad(MemorySegment struct, long index0) {
        return __pad$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __pad(MemorySegment struct, long index0, byte fieldValue) {
        __pad$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(sockaddr_in.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return sockaddr_in.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)sockaddr_in.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sockaddr_in.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return sockaddr_in.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(sockaddr_in.layout().byteSize() * elementCount, arena, cleanup);
    }
}

