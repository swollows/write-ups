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
 *  java.lang.foreign.ValueLayout$OfShort
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

public class icmp_ext_echo_ctype3_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("afi"), Lib.C_CHAR.withName("addrlen"), Lib.C_CHAR.withName("reserved")}).withName("icmp_ext_echo_ctype3_hdr");
    private static final ValueLayout.OfShort afi$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"afi")});
    private static final long afi$OFFSET = 0L;
    private static final ValueLayout.OfByte addrlen$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addrlen")});
    private static final long addrlen$OFFSET = 2L;
    private static final ValueLayout.OfByte reserved$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reserved")});
    private static final long reserved$OFFSET = 3L;

    icmp_ext_echo_ctype3_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort afi$layout() {
        return afi$LAYOUT;
    }

    public static final long afi$offset() {
        return 0L;
    }

    public static short afi(MemorySegment struct) {
        return struct.get(afi$LAYOUT, 0L);
    }

    public static void afi(MemorySegment struct, short fieldValue) {
        struct.set(afi$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte addrlen$layout() {
        return addrlen$LAYOUT;
    }

    public static final long addrlen$offset() {
        return 2L;
    }

    public static byte addrlen(MemorySegment struct) {
        return struct.get(addrlen$LAYOUT, 2L);
    }

    public static void addrlen(MemorySegment struct, byte fieldValue) {
        struct.set(addrlen$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfByte reserved$layout() {
        return reserved$LAYOUT;
    }

    public static final long reserved$offset() {
        return 3L;
    }

    public static byte reserved(MemorySegment struct) {
        return struct.get(reserved$LAYOUT, 3L);
    }

    public static void reserved(MemorySegment struct, byte fieldValue) {
        struct.set(reserved$LAYOUT, 3L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(icmp_ext_echo_ctype3_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return icmp_ext_echo_ctype3_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)icmp_ext_echo_ctype3_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmp_ext_echo_ctype3_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return icmp_ext_echo_ctype3_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(icmp_ext_echo_ctype3_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

