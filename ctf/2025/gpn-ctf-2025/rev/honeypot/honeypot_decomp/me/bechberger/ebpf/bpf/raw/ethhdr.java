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

public class ethhdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)6L, (MemoryLayout)Lib.C_CHAR).withName("h_dest"), MemoryLayout.sequenceLayout((long)6L, (MemoryLayout)Lib.C_CHAR).withName("h_source"), Lib.align((MemoryLayout)Lib.C_SHORT, 1L).withName("h_proto")}).withName("ethhdr");
    private static final SequenceLayout h_dest$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"h_dest")});
    private static final long h_dest$OFFSET = 0L;
    private static long[] h_dest$DIMS = new long[]{6L};
    private static final VarHandle h_dest$ELEM_HANDLE = h_dest$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final SequenceLayout h_source$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"h_source")});
    private static final long h_source$OFFSET = 6L;
    private static long[] h_source$DIMS = new long[]{6L};
    private static final VarHandle h_source$ELEM_HANDLE = h_source$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfShort h_proto$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"h_proto")});
    private static final long h_proto$OFFSET = 12L;

    ethhdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout h_dest$layout() {
        return h_dest$LAYOUT;
    }

    public static final long h_dest$offset() {
        return 0L;
    }

    public static MemorySegment h_dest(MemorySegment struct) {
        return struct.asSlice(0L, h_dest$LAYOUT.byteSize());
    }

    public static void h_dest(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)h_dest$LAYOUT.byteSize());
    }

    public static long[] h_dest$dimensions() {
        return h_dest$DIMS;
    }

    public static byte h_dest(MemorySegment struct, long index0) {
        return h_dest$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void h_dest(MemorySegment struct, long index0, byte fieldValue) {
        h_dest$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final SequenceLayout h_source$layout() {
        return h_source$LAYOUT;
    }

    public static final long h_source$offset() {
        return 6L;
    }

    public static MemorySegment h_source(MemorySegment struct) {
        return struct.asSlice(6L, h_source$LAYOUT.byteSize());
    }

    public static void h_source(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)6L, (long)h_source$LAYOUT.byteSize());
    }

    public static long[] h_source$dimensions() {
        return h_source$DIMS;
    }

    public static byte h_source(MemorySegment struct, long index0) {
        return h_source$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void h_source(MemorySegment struct, long index0, byte fieldValue) {
        h_source$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfShort h_proto$layout() {
        return h_proto$LAYOUT;
    }

    public static final long h_proto$offset() {
        return 12L;
    }

    public static short h_proto(MemorySegment struct) {
        return struct.get(h_proto$LAYOUT, 12L);
    }

    public static void h_proto(MemorySegment struct, short fieldValue) {
        struct.set(h_proto$LAYOUT, 12L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ethhdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ethhdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ethhdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ethhdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ethhdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ethhdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

