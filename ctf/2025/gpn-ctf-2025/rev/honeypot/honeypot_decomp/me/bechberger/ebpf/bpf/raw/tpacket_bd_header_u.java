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
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.tpacket_hdr_v1;

public class tpacket_bd_header_u {
    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{tpacket_hdr_v1.layout().withName("bh1")}).withName("tpacket_bd_header_u");
    private static final GroupLayout bh1$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bh1")});
    private static final long bh1$OFFSET = 0L;

    tpacket_bd_header_u() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout bh1$layout() {
        return bh1$LAYOUT;
    }

    public static final long bh1$offset() {
        return 0L;
    }

    public static MemorySegment bh1(MemorySegment union) {
        return union.asSlice(0L, bh1$LAYOUT.byteSize());
    }

    public static void bh1(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)bh1$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_bd_header_u.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_bd_header_u.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_bd_header_u.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_bd_header_u.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_bd_header_u.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_bd_header_u.layout().byteSize() * elementCount, arena, cleanup);
    }
}

