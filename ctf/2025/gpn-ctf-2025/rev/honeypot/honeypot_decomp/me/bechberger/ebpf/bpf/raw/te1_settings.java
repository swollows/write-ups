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

public class te1_settings {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("clock_rate"), Lib.C_INT.withName("clock_type"), Lib.C_SHORT.withName("loopback"), MemoryLayout.paddingLayout((long)2L), Lib.C_INT.withName("slot_map")}).withName("$anon$46:9");
    private static final ValueLayout.OfInt clock_rate$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"clock_rate")});
    private static final long clock_rate$OFFSET = 0L;
    private static final ValueLayout.OfInt clock_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"clock_type")});
    private static final long clock_type$OFFSET = 4L;
    private static final ValueLayout.OfShort loopback$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"loopback")});
    private static final long loopback$OFFSET = 8L;
    private static final ValueLayout.OfInt slot_map$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"slot_map")});
    private static final long slot_map$OFFSET = 12L;

    te1_settings() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt clock_rate$layout() {
        return clock_rate$LAYOUT;
    }

    public static final long clock_rate$offset() {
        return 0L;
    }

    public static int clock_rate(MemorySegment struct) {
        return struct.get(clock_rate$LAYOUT, 0L);
    }

    public static void clock_rate(MemorySegment struct, int fieldValue) {
        struct.set(clock_rate$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt clock_type$layout() {
        return clock_type$LAYOUT;
    }

    public static final long clock_type$offset() {
        return 4L;
    }

    public static int clock_type(MemorySegment struct) {
        return struct.get(clock_type$LAYOUT, 4L);
    }

    public static void clock_type(MemorySegment struct, int fieldValue) {
        struct.set(clock_type$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfShort loopback$layout() {
        return loopback$LAYOUT;
    }

    public static final long loopback$offset() {
        return 8L;
    }

    public static short loopback(MemorySegment struct) {
        return struct.get(loopback$LAYOUT, 8L);
    }

    public static void loopback(MemorySegment struct, short fieldValue) {
        struct.set(loopback$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt slot_map$layout() {
        return slot_map$LAYOUT;
    }

    public static final long slot_map$offset() {
        return 12L;
    }

    public static int slot_map(MemorySegment struct) {
        return struct.get(slot_map$LAYOUT, 12L);
    }

    public static void slot_map(MemorySegment struct, int fieldValue) {
        struct.set(slot_map$LAYOUT, 12L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(te1_settings.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return te1_settings.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)te1_settings.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)te1_settings.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return te1_settings.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(te1_settings.layout().byteSize() * elementCount, arena, cleanup);
    }
}

