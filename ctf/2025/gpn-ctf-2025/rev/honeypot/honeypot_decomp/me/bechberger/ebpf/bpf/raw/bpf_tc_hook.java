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

public class bpf_tc_hook {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("ifindex"), Lib.C_INT.withName("attach_point"), Lib.C_INT.withName("parent"), MemoryLayout.paddingLayout((long)4L)}).withName("bpf_tc_hook");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
    private static final long ifindex$OFFSET = 8L;
    private static final ValueLayout.OfInt attach_point$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_point")});
    private static final long attach_point$OFFSET = 12L;
    private static final ValueLayout.OfInt parent$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"parent")});
    private static final long parent$OFFSET = 16L;

    bpf_tc_hook() {
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

    public static final ValueLayout.OfInt ifindex$layout() {
        return ifindex$LAYOUT;
    }

    public static final long ifindex$offset() {
        return 8L;
    }

    public static int ifindex(MemorySegment struct) {
        return struct.get(ifindex$LAYOUT, 8L);
    }

    public static void ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ifindex$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_point$layout() {
        return attach_point$LAYOUT;
    }

    public static final long attach_point$offset() {
        return 12L;
    }

    public static int attach_point(MemorySegment struct) {
        return struct.get(attach_point$LAYOUT, 12L);
    }

    public static void attach_point(MemorySegment struct, int fieldValue) {
        struct.set(attach_point$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt parent$layout() {
        return parent$LAYOUT;
    }

    public static final long parent$offset() {
        return 16L;
    }

    public static int parent(MemorySegment struct) {
        return struct.get(parent$LAYOUT, 16L);
    }

    public static void parent(MemorySegment struct, int fieldValue) {
        struct.set(parent$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_tc_hook.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_tc_hook.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_tc_hook.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_tc_hook.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_tc_hook.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_tc_hook.layout().byteSize() * elementCount, arena, cleanup);
    }
}

