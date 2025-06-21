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
 *  java.lang.foreign.ValueLayout$OfInt
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

public class packet_mreq {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("mr_ifindex"), Lib.C_SHORT.withName("mr_type"), Lib.C_SHORT.withName("mr_alen"), MemoryLayout.sequenceLayout((long)8L, (MemoryLayout)Lib.C_CHAR).withName("mr_address")}).withName("packet_mreq");
    private static final ValueLayout.OfInt mr_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mr_ifindex")});
    private static final long mr_ifindex$OFFSET = 0L;
    private static final ValueLayout.OfShort mr_type$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mr_type")});
    private static final long mr_type$OFFSET = 4L;
    private static final ValueLayout.OfShort mr_alen$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mr_alen")});
    private static final long mr_alen$OFFSET = 6L;
    private static final SequenceLayout mr_address$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mr_address")});
    private static final long mr_address$OFFSET = 8L;
    private static long[] mr_address$DIMS = new long[]{8L};
    private static final VarHandle mr_address$ELEM_HANDLE = mr_address$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    packet_mreq() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt mr_ifindex$layout() {
        return mr_ifindex$LAYOUT;
    }

    public static final long mr_ifindex$offset() {
        return 0L;
    }

    public static int mr_ifindex(MemorySegment struct) {
        return struct.get(mr_ifindex$LAYOUT, 0L);
    }

    public static void mr_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(mr_ifindex$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort mr_type$layout() {
        return mr_type$LAYOUT;
    }

    public static final long mr_type$offset() {
        return 4L;
    }

    public static short mr_type(MemorySegment struct) {
        return struct.get(mr_type$LAYOUT, 4L);
    }

    public static void mr_type(MemorySegment struct, short fieldValue) {
        struct.set(mr_type$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfShort mr_alen$layout() {
        return mr_alen$LAYOUT;
    }

    public static final long mr_alen$offset() {
        return 6L;
    }

    public static short mr_alen(MemorySegment struct) {
        return struct.get(mr_alen$LAYOUT, 6L);
    }

    public static void mr_alen(MemorySegment struct, short fieldValue) {
        struct.set(mr_alen$LAYOUT, 6L, fieldValue);
    }

    public static final SequenceLayout mr_address$layout() {
        return mr_address$LAYOUT;
    }

    public static final long mr_address$offset() {
        return 8L;
    }

    public static MemorySegment mr_address(MemorySegment struct) {
        return struct.asSlice(8L, mr_address$LAYOUT.byteSize());
    }

    public static void mr_address(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)mr_address$LAYOUT.byteSize());
    }

    public static long[] mr_address$dimensions() {
        return mr_address$DIMS;
    }

    public static byte mr_address(MemorySegment struct, long index0) {
        return mr_address$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void mr_address(MemorySegment struct, long index0, byte fieldValue) {
        mr_address$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(packet_mreq.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return packet_mreq.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)packet_mreq.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)packet_mreq.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return packet_mreq.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(packet_mreq.layout().byteSize() * elementCount, arena, cleanup);
    }
}

