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
import me.bechberger.ebpf.bpf.raw.in6_addr;

public class in6_pktinfo {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in6_addr.layout().withName("ipi6_addr"), Lib.C_INT.withName("ipi6_ifindex")}).withName("in6_pktinfo");
    private static final GroupLayout ipi6_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipi6_addr")});
    private static final long ipi6_addr$OFFSET = 0L;
    private static final ValueLayout.OfInt ipi6_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipi6_ifindex")});
    private static final long ipi6_ifindex$OFFSET = 16L;

    in6_pktinfo() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout ipi6_addr$layout() {
        return ipi6_addr$LAYOUT;
    }

    public static final long ipi6_addr$offset() {
        return 0L;
    }

    public static MemorySegment ipi6_addr(MemorySegment struct) {
        return struct.asSlice(0L, ipi6_addr$LAYOUT.byteSize());
    }

    public static void ipi6_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)ipi6_addr$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt ipi6_ifindex$layout() {
        return ipi6_ifindex$LAYOUT;
    }

    public static final long ipi6_ifindex$offset() {
        return 16L;
    }

    public static int ipi6_ifindex(MemorySegment struct) {
        return struct.get(ipi6_ifindex$LAYOUT, 16L);
    }

    public static void ipi6_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ipi6_ifindex$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(in6_pktinfo.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return in6_pktinfo.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)in6_pktinfo.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)in6_pktinfo.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return in6_pktinfo.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(in6_pktinfo.layout().byteSize() * elementCount, arena, cleanup);
    }
}

