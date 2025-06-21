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
 *  java.lang.foreign.ValueLayout$OfByte
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

public class sockaddr_ll {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("sll_family"), Lib.C_SHORT.withName("sll_protocol"), Lib.C_INT.withName("sll_ifindex"), Lib.C_SHORT.withName("sll_hatype"), Lib.C_CHAR.withName("sll_pkttype"), Lib.C_CHAR.withName("sll_halen"), MemoryLayout.sequenceLayout((long)8L, (MemoryLayout)Lib.C_CHAR).withName("sll_addr")}).withName("sockaddr_ll");
    private static final ValueLayout.OfShort sll_family$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sll_family")});
    private static final long sll_family$OFFSET = 0L;
    private static final ValueLayout.OfShort sll_protocol$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sll_protocol")});
    private static final long sll_protocol$OFFSET = 2L;
    private static final ValueLayout.OfInt sll_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sll_ifindex")});
    private static final long sll_ifindex$OFFSET = 4L;
    private static final ValueLayout.OfShort sll_hatype$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sll_hatype")});
    private static final long sll_hatype$OFFSET = 8L;
    private static final ValueLayout.OfByte sll_pkttype$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sll_pkttype")});
    private static final long sll_pkttype$OFFSET = 10L;
    private static final ValueLayout.OfByte sll_halen$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sll_halen")});
    private static final long sll_halen$OFFSET = 11L;
    private static final SequenceLayout sll_addr$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sll_addr")});
    private static final long sll_addr$OFFSET = 12L;
    private static long[] sll_addr$DIMS = new long[]{8L};
    private static final VarHandle sll_addr$ELEM_HANDLE = sll_addr$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    sockaddr_ll() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort sll_family$layout() {
        return sll_family$LAYOUT;
    }

    public static final long sll_family$offset() {
        return 0L;
    }

    public static short sll_family(MemorySegment struct) {
        return struct.get(sll_family$LAYOUT, 0L);
    }

    public static void sll_family(MemorySegment struct, short fieldValue) {
        struct.set(sll_family$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort sll_protocol$layout() {
        return sll_protocol$LAYOUT;
    }

    public static final long sll_protocol$offset() {
        return 2L;
    }

    public static short sll_protocol(MemorySegment struct) {
        return struct.get(sll_protocol$LAYOUT, 2L);
    }

    public static void sll_protocol(MemorySegment struct, short fieldValue) {
        struct.set(sll_protocol$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfInt sll_ifindex$layout() {
        return sll_ifindex$LAYOUT;
    }

    public static final long sll_ifindex$offset() {
        return 4L;
    }

    public static int sll_ifindex(MemorySegment struct) {
        return struct.get(sll_ifindex$LAYOUT, 4L);
    }

    public static void sll_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(sll_ifindex$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfShort sll_hatype$layout() {
        return sll_hatype$LAYOUT;
    }

    public static final long sll_hatype$offset() {
        return 8L;
    }

    public static short sll_hatype(MemorySegment struct) {
        return struct.get(sll_hatype$LAYOUT, 8L);
    }

    public static void sll_hatype(MemorySegment struct, short fieldValue) {
        struct.set(sll_hatype$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfByte sll_pkttype$layout() {
        return sll_pkttype$LAYOUT;
    }

    public static final long sll_pkttype$offset() {
        return 10L;
    }

    public static byte sll_pkttype(MemorySegment struct) {
        return struct.get(sll_pkttype$LAYOUT, 10L);
    }

    public static void sll_pkttype(MemorySegment struct, byte fieldValue) {
        struct.set(sll_pkttype$LAYOUT, 10L, fieldValue);
    }

    public static final ValueLayout.OfByte sll_halen$layout() {
        return sll_halen$LAYOUT;
    }

    public static final long sll_halen$offset() {
        return 11L;
    }

    public static byte sll_halen(MemorySegment struct) {
        return struct.get(sll_halen$LAYOUT, 11L);
    }

    public static void sll_halen(MemorySegment struct, byte fieldValue) {
        struct.set(sll_halen$LAYOUT, 11L, fieldValue);
    }

    public static final SequenceLayout sll_addr$layout() {
        return sll_addr$LAYOUT;
    }

    public static final long sll_addr$offset() {
        return 12L;
    }

    public static MemorySegment sll_addr(MemorySegment struct) {
        return struct.asSlice(12L, sll_addr$LAYOUT.byteSize());
    }

    public static void sll_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)12L, (long)sll_addr$LAYOUT.byteSize());
    }

    public static long[] sll_addr$dimensions() {
        return sll_addr$DIMS;
    }

    public static byte sll_addr(MemorySegment struct, long index0) {
        return sll_addr$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void sll_addr(MemorySegment struct, long index0, byte fieldValue) {
        sll_addr$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(sockaddr_ll.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return sockaddr_ll.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)sockaddr_ll.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sockaddr_ll.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return sockaddr_ll.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(sockaddr_ll.layout().byteSize() * elementCount, arena, cleanup);
    }
}

