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
 *  java.lang.foreign.ValueLayout$OfByte
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

public class ipv6_rt_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("nexthdr"), Lib.C_CHAR.withName("hdrlen"), Lib.C_CHAR.withName("type"), Lib.C_CHAR.withName("segments_left")}).withName("ipv6_rt_hdr");
    private static final ValueLayout.OfByte nexthdr$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nexthdr")});
    private static final long nexthdr$OFFSET = 0L;
    private static final ValueLayout.OfByte hdrlen$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hdrlen")});
    private static final long hdrlen$OFFSET = 1L;
    private static final ValueLayout.OfByte type$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 2L;
    private static final ValueLayout.OfByte segments_left$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"segments_left")});
    private static final long segments_left$OFFSET = 3L;

    ipv6_rt_hdr() {
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

    public static final ValueLayout.OfByte type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 2L;
    }

    public static byte type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 2L);
    }

    public static void type(MemorySegment struct, byte fieldValue) {
        struct.set(type$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfByte segments_left$layout() {
        return segments_left$LAYOUT;
    }

    public static final long segments_left$offset() {
        return 3L;
    }

    public static byte segments_left(MemorySegment struct) {
        return struct.get(segments_left$LAYOUT, 3L);
    }

    public static void segments_left(MemorySegment struct, byte fieldValue) {
        struct.set(segments_left$LAYOUT, 3L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ipv6_rt_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ipv6_rt_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ipv6_rt_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ipv6_rt_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ipv6_rt_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ipv6_rt_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

