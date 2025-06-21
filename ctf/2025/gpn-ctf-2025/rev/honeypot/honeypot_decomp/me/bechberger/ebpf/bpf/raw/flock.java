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
 *  java.lang.foreign.ValueLayout$OfLong
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

public class flock {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("l_type"), Lib.C_SHORT.withName("l_whence"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG.withName("l_start"), Lib.C_LONG.withName("l_len"), Lib.C_INT.withName("l_pid"), MemoryLayout.paddingLayout((long)4L)}).withName("flock");
    private static final ValueLayout.OfShort l_type$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"l_type")});
    private static final long l_type$OFFSET = 0L;
    private static final ValueLayout.OfShort l_whence$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"l_whence")});
    private static final long l_whence$OFFSET = 2L;
    private static final ValueLayout.OfLong l_start$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"l_start")});
    private static final long l_start$OFFSET = 8L;
    private static final ValueLayout.OfLong l_len$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"l_len")});
    private static final long l_len$OFFSET = 16L;
    private static final ValueLayout.OfInt l_pid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"l_pid")});
    private static final long l_pid$OFFSET = 24L;

    flock() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort l_type$layout() {
        return l_type$LAYOUT;
    }

    public static final long l_type$offset() {
        return 0L;
    }

    public static short l_type(MemorySegment struct) {
        return struct.get(l_type$LAYOUT, 0L);
    }

    public static void l_type(MemorySegment struct, short fieldValue) {
        struct.set(l_type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort l_whence$layout() {
        return l_whence$LAYOUT;
    }

    public static final long l_whence$offset() {
        return 2L;
    }

    public static short l_whence(MemorySegment struct) {
        return struct.get(l_whence$LAYOUT, 2L);
    }

    public static void l_whence(MemorySegment struct, short fieldValue) {
        struct.set(l_whence$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfLong l_start$layout() {
        return l_start$LAYOUT;
    }

    public static final long l_start$offset() {
        return 8L;
    }

    public static long l_start(MemorySegment struct) {
        return struct.get(l_start$LAYOUT, 8L);
    }

    public static void l_start(MemorySegment struct, long fieldValue) {
        struct.set(l_start$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfLong l_len$layout() {
        return l_len$LAYOUT;
    }

    public static final long l_len$offset() {
        return 16L;
    }

    public static long l_len(MemorySegment struct) {
        return struct.get(l_len$LAYOUT, 16L);
    }

    public static void l_len(MemorySegment struct, long fieldValue) {
        struct.set(l_len$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt l_pid$layout() {
        return l_pid$LAYOUT;
    }

    public static final long l_pid$offset() {
        return 24L;
    }

    public static int l_pid(MemorySegment struct) {
        return struct.get(l_pid$LAYOUT, 24L);
    }

    public static void l_pid(MemorySegment struct, int fieldValue) {
        struct.set(l_pid$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(flock.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return flock.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)flock.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)flock.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return flock.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(flock.layout().byteSize() * elementCount, arena, cleanup);
    }
}

