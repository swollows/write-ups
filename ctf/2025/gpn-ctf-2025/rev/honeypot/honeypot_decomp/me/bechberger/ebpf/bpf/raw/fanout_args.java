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

public class fanout_args {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("id"), Lib.C_SHORT.withName("type_flags"), Lib.C_INT.withName("max_num_members")}).withName("fanout_args");
    private static final ValueLayout.OfShort id$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"id")});
    private static final long id$OFFSET = 0L;
    private static final ValueLayout.OfShort type_flags$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type_flags")});
    private static final long type_flags$OFFSET = 2L;
    private static final ValueLayout.OfInt max_num_members$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"max_num_members")});
    private static final long max_num_members$OFFSET = 4L;

    fanout_args() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort id$layout() {
        return id$LAYOUT;
    }

    public static final long id$offset() {
        return 0L;
    }

    public static short id(MemorySegment struct) {
        return struct.get(id$LAYOUT, 0L);
    }

    public static void id(MemorySegment struct, short fieldValue) {
        struct.set(id$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort type_flags$layout() {
        return type_flags$LAYOUT;
    }

    public static final long type_flags$offset() {
        return 2L;
    }

    public static short type_flags(MemorySegment struct) {
        return struct.get(type_flags$LAYOUT, 2L);
    }

    public static void type_flags(MemorySegment struct, short fieldValue) {
        struct.set(type_flags$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfInt max_num_members$layout() {
        return max_num_members$LAYOUT;
    }

    public static final long max_num_members$offset() {
        return 4L;
    }

    public static int max_num_members(MemorySegment struct) {
        return struct.get(max_num_members$LAYOUT, 4L);
    }

    public static void max_num_members(MemorySegment struct, int fieldValue) {
        struct.set(max_num_members$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(fanout_args.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return fanout_args.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)fanout_args.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)fanout_args.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return fanout_args.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(fanout_args.layout().byteSize() * elementCount, arena, cleanup);
    }
}

