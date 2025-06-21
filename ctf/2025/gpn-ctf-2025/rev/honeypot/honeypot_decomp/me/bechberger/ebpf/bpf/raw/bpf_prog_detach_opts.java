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

public class bpf_prog_detach_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("flags"), Lib.C_INT.withName("relative_fd"), Lib.C_INT.withName("relative_id"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("expected_revision")}).withName("bpf_prog_detach_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 8L;
    private static final ValueLayout.OfInt relative_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"relative_fd")});
    private static final long relative_fd$OFFSET = 12L;
    private static final ValueLayout.OfInt relative_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"relative_id")});
    private static final long relative_id$OFFSET = 16L;
    private static final ValueLayout.OfLong expected_revision$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"expected_revision")});
    private static final long expected_revision$OFFSET = 24L;

    bpf_prog_detach_opts() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong sz$layout() {
        return sz$LAYOUT;
    }

    public static final long sz$offset() {
        return 0L;
    }

    public static long sz(MemorySegment struct) {
        return struct.get(sz$LAYOUT, 0L);
    }

    public static void sz(MemorySegment struct, long fieldValue) {
        struct.set(sz$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 8L;
    }

    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 8L);
    }

    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt relative_fd$layout() {
        return relative_fd$LAYOUT;
    }

    public static final long relative_fd$offset() {
        return 12L;
    }

    public static int relative_fd(MemorySegment struct) {
        return struct.get(relative_fd$LAYOUT, 12L);
    }

    public static void relative_fd(MemorySegment struct, int fieldValue) {
        struct.set(relative_fd$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt relative_id$layout() {
        return relative_id$LAYOUT;
    }

    public static final long relative_id$offset() {
        return 16L;
    }

    public static int relative_id(MemorySegment struct) {
        return struct.get(relative_id$LAYOUT, 16L);
    }

    public static void relative_id(MemorySegment struct, int fieldValue) {
        struct.set(relative_id$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfLong expected_revision$layout() {
        return expected_revision$LAYOUT;
    }

    public static final long expected_revision$offset() {
        return 24L;
    }

    public static long expected_revision(MemorySegment struct) {
        return struct.get(expected_revision$LAYOUT, 24L);
    }

    public static void expected_revision(MemorySegment struct, long fieldValue) {
        struct.set(expected_revision$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_prog_detach_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_prog_detach_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_prog_detach_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_prog_detach_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_prog_detach_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_prog_detach_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

