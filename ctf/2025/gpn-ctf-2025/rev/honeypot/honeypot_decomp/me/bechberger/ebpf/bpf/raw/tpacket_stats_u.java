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
import me.bechberger.ebpf.bpf.raw.tpacket_stats;
import me.bechberger.ebpf.bpf.raw.tpacket_stats_v3;

public class tpacket_stats_u {
    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{tpacket_stats.layout().withName("stats1"), tpacket_stats_v3.layout().withName("stats3")}).withName("tpacket_stats_u");
    private static final GroupLayout stats1$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"stats1")});
    private static final long stats1$OFFSET = 0L;
    private static final GroupLayout stats3$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"stats3")});
    private static final long stats3$OFFSET = 0L;

    tpacket_stats_u() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout stats1$layout() {
        return stats1$LAYOUT;
    }

    public static final long stats1$offset() {
        return 0L;
    }

    public static MemorySegment stats1(MemorySegment union) {
        return union.asSlice(0L, stats1$LAYOUT.byteSize());
    }

    public static void stats1(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)stats1$LAYOUT.byteSize());
    }

    public static final GroupLayout stats3$layout() {
        return stats3$LAYOUT;
    }

    public static final long stats3$offset() {
        return 0L;
    }

    public static MemorySegment stats3(MemorySegment union) {
        return union.asSlice(0L, stats3$LAYOUT.byteSize());
    }

    public static void stats3(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)stats3$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_stats_u.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_stats_u.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_stats_u.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_stats_u.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_stats_u.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_stats_u.layout().byteSize() * elementCount, arena, cleanup);
    }
}

