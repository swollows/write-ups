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
import me.bechberger.ebpf.bpf.raw.in6_addr;
import me.bechberger.ebpf.bpf.raw.ipv6_rt_hdr;

public class rt0_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{ipv6_rt_hdr.layout().withName("rt_hdr"), Lib.C_INT.withName("reserved"), MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)in6_addr.layout()).withName("addr")}).withName("rt0_hdr");
    private static final GroupLayout rt_hdr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rt_hdr")});
    private static final long rt_hdr$OFFSET = 0L;
    private static final ValueLayout.OfInt reserved$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reserved")});
    private static final long reserved$OFFSET = 4L;
    private static final SequenceLayout addr$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addr")});
    private static final long addr$OFFSET = 8L;

    rt0_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout rt_hdr$layout() {
        return rt_hdr$LAYOUT;
    }

    public static final long rt_hdr$offset() {
        return 0L;
    }

    public static MemorySegment rt_hdr(MemorySegment struct) {
        return struct.asSlice(0L, rt_hdr$LAYOUT.byteSize());
    }

    public static void rt_hdr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)rt_hdr$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt reserved$layout() {
        return reserved$LAYOUT;
    }

    public static final long reserved$offset() {
        return 4L;
    }

    public static int reserved(MemorySegment struct) {
        return struct.get(reserved$LAYOUT, 4L);
    }

    public static void reserved(MemorySegment struct, int fieldValue) {
        struct.set(reserved$LAYOUT, 4L, fieldValue);
    }

    public static final SequenceLayout addr$layout() {
        return addr$LAYOUT;
    }

    public static final long addr$offset() {
        return 8L;
    }

    public static MemorySegment addr(MemorySegment struct) {
        return struct.asSlice(8L, addr$LAYOUT.byteSize());
    }

    public static void addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)addr$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(rt0_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return rt0_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)rt0_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)rt0_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return rt0_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(rt0_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

