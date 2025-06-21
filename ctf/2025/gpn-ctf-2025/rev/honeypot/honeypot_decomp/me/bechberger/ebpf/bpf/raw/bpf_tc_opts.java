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

public class bpf_tc_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("prog_fd"), Lib.C_INT.withName("flags"), Lib.C_INT.withName("prog_id"), Lib.C_INT.withName("handle"), Lib.C_INT.withName("priority"), MemoryLayout.paddingLayout((long)4L)}).withName("bpf_tc_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_fd")});
    private static final long prog_fd$OFFSET = 8L;
    private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 12L;
    private static final ValueLayout.OfInt prog_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_id")});
    private static final long prog_id$OFFSET = 16L;
    private static final ValueLayout.OfInt handle$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"handle")});
    private static final long handle$OFFSET = 20L;
    private static final ValueLayout.OfInt priority$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"priority")});
    private static final long priority$OFFSET = 24L;

    bpf_tc_opts() {
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

    public static final ValueLayout.OfInt prog_fd$layout() {
        return prog_fd$LAYOUT;
    }

    public static final long prog_fd$offset() {
        return 8L;
    }

    public static int prog_fd(MemorySegment struct) {
        return struct.get(prog_fd$LAYOUT, 8L);
    }

    public static void prog_fd(MemorySegment struct, int fieldValue) {
        struct.set(prog_fd$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 12L;
    }

    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 12L);
    }

    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_id$layout() {
        return prog_id$LAYOUT;
    }

    public static final long prog_id$offset() {
        return 16L;
    }

    public static int prog_id(MemorySegment struct) {
        return struct.get(prog_id$LAYOUT, 16L);
    }

    public static void prog_id(MemorySegment struct, int fieldValue) {
        struct.set(prog_id$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt handle$layout() {
        return handle$LAYOUT;
    }

    public static final long handle$offset() {
        return 20L;
    }

    public static int handle(MemorySegment struct) {
        return struct.get(handle$LAYOUT, 20L);
    }

    public static void handle(MemorySegment struct, int fieldValue) {
        struct.set(handle$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt priority$layout() {
        return priority$LAYOUT;
    }

    public static final long priority$offset() {
        return 24L;
    }

    public static int priority(MemorySegment struct) {
        return struct.get(priority$LAYOUT, 24L);
    }

    public static void priority(MemorySegment struct, int fieldValue) {
        struct.set(priority$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_tc_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_tc_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_tc_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_tc_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_tc_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_tc_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

