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

public class icmp_ext_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.paddingLayout((long)1L), Lib.C_CHAR.withName("reserved2"), Lib.C_SHORT.withName("checksum")}).withName("icmp_ext_hdr");
    private static final ValueLayout.OfByte reserved2$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reserved2")});
    private static final long reserved2$OFFSET = 1L;
    private static final ValueLayout.OfShort checksum$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"checksum")});
    private static final long checksum$OFFSET = 2L;

    icmp_ext_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte reserved2$layout() {
        return reserved2$LAYOUT;
    }

    public static final long reserved2$offset() {
        return 1L;
    }

    public static byte reserved2(MemorySegment struct) {
        return struct.get(reserved2$LAYOUT, 1L);
    }

    public static void reserved2(MemorySegment struct, byte fieldValue) {
        struct.set(reserved2$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfShort checksum$layout() {
        return checksum$LAYOUT;
    }

    public static final long checksum$offset() {
        return 2L;
    }

    public static short checksum(MemorySegment struct) {
        return struct.get(checksum$LAYOUT, 2L);
    }

    public static void checksum(MemorySegment struct, short fieldValue) {
        struct.set(checksum$LAYOUT, 2L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(icmp_ext_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return icmp_ext_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)icmp_ext_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmp_ext_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return icmp_ext_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(icmp_ext_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

