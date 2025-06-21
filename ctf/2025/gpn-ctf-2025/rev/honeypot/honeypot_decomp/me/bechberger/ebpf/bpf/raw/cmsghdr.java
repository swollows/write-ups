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
 *  java.lang.foreign.ValueLayout$OfLong
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

public class cmsghdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("cmsg_len"), Lib.C_INT.withName("cmsg_level"), Lib.C_INT.withName("cmsg_type"), MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)Lib.C_CHAR).withName("__cmsg_data")}).withName("cmsghdr");
    private static final ValueLayout.OfLong cmsg_len$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cmsg_len")});
    private static final long cmsg_len$OFFSET = 0L;
    private static final ValueLayout.OfInt cmsg_level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cmsg_level")});
    private static final long cmsg_level$OFFSET = 8L;
    private static final ValueLayout.OfInt cmsg_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cmsg_type")});
    private static final long cmsg_type$OFFSET = 12L;
    private static final SequenceLayout __cmsg_data$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__cmsg_data")});
    private static final long __cmsg_data$OFFSET = 16L;

    cmsghdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong cmsg_len$layout() {
        return cmsg_len$LAYOUT;
    }

    public static final long cmsg_len$offset() {
        return 0L;
    }

    public static long cmsg_len(MemorySegment struct) {
        return struct.get(cmsg_len$LAYOUT, 0L);
    }

    public static void cmsg_len(MemorySegment struct, long fieldValue) {
        struct.set(cmsg_len$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt cmsg_level$layout() {
        return cmsg_level$LAYOUT;
    }

    public static final long cmsg_level$offset() {
        return 8L;
    }

    public static int cmsg_level(MemorySegment struct) {
        return struct.get(cmsg_level$LAYOUT, 8L);
    }

    public static void cmsg_level(MemorySegment struct, int fieldValue) {
        struct.set(cmsg_level$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt cmsg_type$layout() {
        return cmsg_type$LAYOUT;
    }

    public static final long cmsg_type$offset() {
        return 12L;
    }

    public static int cmsg_type(MemorySegment struct) {
        return struct.get(cmsg_type$LAYOUT, 12L);
    }

    public static void cmsg_type(MemorySegment struct, int fieldValue) {
        struct.set(cmsg_type$LAYOUT, 12L, fieldValue);
    }

    public static final SequenceLayout __cmsg_data$layout() {
        return __cmsg_data$LAYOUT;
    }

    public static final long __cmsg_data$offset() {
        return 16L;
    }

    public static MemorySegment __cmsg_data(MemorySegment struct) {
        return struct.asSlice(16L, __cmsg_data$LAYOUT.byteSize());
    }

    public static void __cmsg_data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)__cmsg_data$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(cmsghdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return cmsghdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)cmsghdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)cmsghdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return cmsghdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(cmsghdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

