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
 *  java.lang.foreign.ValueLayout$OfLong
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

public class tpacket_rollover_stats {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("tp_all"), Lib.C_LONG_LONG.withName("tp_huge"), Lib.C_LONG_LONG.withName("tp_failed")}).withName("tpacket_rollover_stats");
    private static final ValueLayout.OfLong tp_all$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_all")});
    private static final long tp_all$OFFSET = 0L;
    private static final ValueLayout.OfLong tp_huge$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_huge")});
    private static final long tp_huge$OFFSET = 8L;
    private static final ValueLayout.OfLong tp_failed$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_failed")});
    private static final long tp_failed$OFFSET = 16L;

    tpacket_rollover_stats() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong tp_all$layout() {
        return tp_all$LAYOUT;
    }

    public static final long tp_all$offset() {
        return 0L;
    }

    public static long tp_all(MemorySegment struct) {
        return struct.get(tp_all$LAYOUT, 0L);
    }

    public static void tp_all(MemorySegment struct, long fieldValue) {
        struct.set(tp_all$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfLong tp_huge$layout() {
        return tp_huge$LAYOUT;
    }

    public static final long tp_huge$offset() {
        return 8L;
    }

    public static long tp_huge(MemorySegment struct) {
        return struct.get(tp_huge$LAYOUT, 8L);
    }

    public static void tp_huge(MemorySegment struct, long fieldValue) {
        struct.set(tp_huge$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfLong tp_failed$layout() {
        return tp_failed$LAYOUT;
    }

    public static final long tp_failed$offset() {
        return 16L;
    }

    public static long tp_failed(MemorySegment struct) {
        return struct.get(tp_failed$LAYOUT, 16L);
    }

    public static void tp_failed(MemorySegment struct, long fieldValue) {
        struct.set(tp_failed$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_rollover_stats.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_rollover_stats.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_rollover_stats.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_rollover_stats.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_rollover_stats.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_rollover_stats.layout().byteSize() * elementCount, arena, cleanup);
    }
}

