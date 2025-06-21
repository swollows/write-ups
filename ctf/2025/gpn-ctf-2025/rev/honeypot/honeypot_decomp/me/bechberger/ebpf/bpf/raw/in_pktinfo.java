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
 *  java.lang.foreign.ValueLayout$OfInt
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
import me.bechberger.ebpf.bpf.raw.in_addr;

public class in_pktinfo {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ipi_ifindex"), in_addr.layout().withName("ipi_spec_dst"), in_addr.layout().withName("ipi_addr")}).withName("in_pktinfo");
    private static final ValueLayout.OfInt ipi_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipi_ifindex")});
    private static final long ipi_ifindex$OFFSET = 0L;
    private static final GroupLayout ipi_spec_dst$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipi_spec_dst")});
    private static final long ipi_spec_dst$OFFSET = 4L;
    private static final GroupLayout ipi_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipi_addr")});
    private static final long ipi_addr$OFFSET = 8L;

    in_pktinfo() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt ipi_ifindex$layout() {
        return ipi_ifindex$LAYOUT;
    }

    public static final long ipi_ifindex$offset() {
        return 0L;
    }

    public static int ipi_ifindex(MemorySegment struct) {
        return struct.get(ipi_ifindex$LAYOUT, 0L);
    }

    public static void ipi_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ipi_ifindex$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout ipi_spec_dst$layout() {
        return ipi_spec_dst$LAYOUT;
    }

    public static final long ipi_spec_dst$offset() {
        return 4L;
    }

    public static MemorySegment ipi_spec_dst(MemorySegment struct) {
        return struct.asSlice(4L, ipi_spec_dst$LAYOUT.byteSize());
    }

    public static void ipi_spec_dst(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)ipi_spec_dst$LAYOUT.byteSize());
    }

    public static final GroupLayout ipi_addr$layout() {
        return ipi_addr$LAYOUT;
    }

    public static final long ipi_addr$offset() {
        return 8L;
    }

    public static MemorySegment ipi_addr(MemorySegment struct) {
        return struct.asSlice(8L, ipi_addr$LAYOUT.byteSize());
    }

    public static void ipi_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)ipi_addr$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(in_pktinfo.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return in_pktinfo.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)in_pktinfo.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)in_pktinfo.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return in_pktinfo.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(in_pktinfo.layout().byteSize() * elementCount, arena, cleanup);
    }
}

