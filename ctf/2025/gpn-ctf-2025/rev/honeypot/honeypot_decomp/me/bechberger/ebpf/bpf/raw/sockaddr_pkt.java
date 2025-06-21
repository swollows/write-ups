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

public class sockaddr_pkt {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("spkt_family"), MemoryLayout.sequenceLayout((long)14L, (MemoryLayout)Lib.C_CHAR).withName("spkt_device"), Lib.C_SHORT.withName("spkt_protocol")}).withName("sockaddr_pkt");
    private static final ValueLayout.OfShort spkt_family$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"spkt_family")});
    private static final long spkt_family$OFFSET = 0L;
    private static final SequenceLayout spkt_device$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"spkt_device")});
    private static final long spkt_device$OFFSET = 2L;
    private static long[] spkt_device$DIMS = new long[]{14L};
    private static final VarHandle spkt_device$ELEM_HANDLE = spkt_device$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfShort spkt_protocol$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"spkt_protocol")});
    private static final long spkt_protocol$OFFSET = 16L;

    sockaddr_pkt() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort spkt_family$layout() {
        return spkt_family$LAYOUT;
    }

    public static final long spkt_family$offset() {
        return 0L;
    }

    public static short spkt_family(MemorySegment struct) {
        return struct.get(spkt_family$LAYOUT, 0L);
    }

    public static void spkt_family(MemorySegment struct, short fieldValue) {
        struct.set(spkt_family$LAYOUT, 0L, fieldValue);
    }

    public static final SequenceLayout spkt_device$layout() {
        return spkt_device$LAYOUT;
    }

    public static final long spkt_device$offset() {
        return 2L;
    }

    public static MemorySegment spkt_device(MemorySegment struct) {
        return struct.asSlice(2L, spkt_device$LAYOUT.byteSize());
    }

    public static void spkt_device(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)2L, (long)spkt_device$LAYOUT.byteSize());
    }

    public static long[] spkt_device$dimensions() {
        return spkt_device$DIMS;
    }

    public static byte spkt_device(MemorySegment struct, long index0) {
        return spkt_device$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void spkt_device(MemorySegment struct, long index0, byte fieldValue) {
        spkt_device$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfShort spkt_protocol$layout() {
        return spkt_protocol$LAYOUT;
    }

    public static final long spkt_protocol$offset() {
        return 16L;
    }

    public static short spkt_protocol(MemorySegment struct) {
        return struct.get(spkt_protocol$LAYOUT, 16L);
    }

    public static void spkt_protocol(MemorySegment struct, short fieldValue) {
        struct.set(spkt_protocol$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(sockaddr_pkt.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return sockaddr_pkt.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)sockaddr_pkt.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sockaddr_pkt.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return sockaddr_pkt.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(sockaddr_pkt.layout().byteSize() * elementCount, arena, cleanup);
    }
}

