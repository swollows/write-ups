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
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class ip_auth_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("nexthdr"), Lib.C_CHAR.withName("hdrlen"), Lib.C_SHORT.withName("reserved"), Lib.C_INT.withName("spi"), Lib.C_INT.withName("seq_no"), MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)Lib.C_CHAR).withName("auth_data")}).withName("ip_auth_hdr");
    private static final ValueLayout.OfByte nexthdr$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nexthdr")});
    private static final long nexthdr$OFFSET = 0L;
    private static final ValueLayout.OfByte hdrlen$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hdrlen")});
    private static final long hdrlen$OFFSET = 1L;
    private static final ValueLayout.OfShort reserved$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reserved")});
    private static final long reserved$OFFSET = 2L;
    private static final ValueLayout.OfInt spi$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"spi")});
    private static final long spi$OFFSET = 4L;
    private static final ValueLayout.OfInt seq_no$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"seq_no")});
    private static final long seq_no$OFFSET = 8L;
    private static final SequenceLayout auth_data$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"auth_data")});
    private static final long auth_data$OFFSET = 12L;

    ip_auth_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte nexthdr$layout() {
        return nexthdr$LAYOUT;
    }

    public static final long nexthdr$offset() {
        return 0L;
    }

    public static byte nexthdr(MemorySegment struct) {
        return struct.get(nexthdr$LAYOUT, 0L);
    }

    public static void nexthdr(MemorySegment struct, byte fieldValue) {
        struct.set(nexthdr$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte hdrlen$layout() {
        return hdrlen$LAYOUT;
    }

    public static final long hdrlen$offset() {
        return 1L;
    }

    public static byte hdrlen(MemorySegment struct) {
        return struct.get(hdrlen$LAYOUT, 1L);
    }

    public static void hdrlen(MemorySegment struct, byte fieldValue) {
        struct.set(hdrlen$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfShort reserved$layout() {
        return reserved$LAYOUT;
    }

    public static final long reserved$offset() {
        return 2L;
    }

    public static short reserved(MemorySegment struct) {
        return struct.get(reserved$LAYOUT, 2L);
    }

    public static void reserved(MemorySegment struct, short fieldValue) {
        struct.set(reserved$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfInt spi$layout() {
        return spi$LAYOUT;
    }

    public static final long spi$offset() {
        return 4L;
    }

    public static int spi(MemorySegment struct) {
        return struct.get(spi$LAYOUT, 4L);
    }

    public static void spi(MemorySegment struct, int fieldValue) {
        struct.set(spi$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt seq_no$layout() {
        return seq_no$LAYOUT;
    }

    public static final long seq_no$offset() {
        return 8L;
    }

    public static int seq_no(MemorySegment struct) {
        return struct.get(seq_no$LAYOUT, 8L);
    }

    public static void seq_no(MemorySegment struct, int fieldValue) {
        struct.set(seq_no$LAYOUT, 8L, fieldValue);
    }

    public static final SequenceLayout auth_data$layout() {
        return auth_data$LAYOUT;
    }

    public static final long auth_data$offset() {
        return 12L;
    }

    public static MemorySegment auth_data(MemorySegment struct) {
        return struct.asSlice(12L, auth_data$LAYOUT.byteSize());
    }

    public static void auth_data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)12L, (long)auth_data$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ip_auth_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ip_auth_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ip_auth_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip_auth_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ip_auth_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ip_auth_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

