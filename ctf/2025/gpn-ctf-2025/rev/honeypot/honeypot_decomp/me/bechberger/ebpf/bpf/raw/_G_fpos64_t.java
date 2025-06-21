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
import me.bechberger.ebpf.bpf.raw.__mbstate_t;

public class _G_fpos64_t {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("__pos"), __mbstate_t.layout().withName("__state")}).withName("_G_fpos64_t");
    private static final ValueLayout.OfLong __pos$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__pos")});
    private static final long __pos$OFFSET = 0L;
    private static final GroupLayout __state$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__state")});
    private static final long __state$OFFSET = 8L;

    _G_fpos64_t() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong __pos$layout() {
        return __pos$LAYOUT;
    }

    public static final long __pos$offset() {
        return 0L;
    }

    public static long __pos(MemorySegment struct) {
        return struct.get(__pos$LAYOUT, 0L);
    }

    public static void __pos(MemorySegment struct, long fieldValue) {
        struct.set(__pos$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout __state$layout() {
        return __state$LAYOUT;
    }

    public static final long __state$offset() {
        return 8L;
    }

    public static MemorySegment __state(MemorySegment struct) {
        return struct.asSlice(8L, __state$LAYOUT.byteSize());
    }

    public static void __state(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)__state$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(_G_fpos64_t.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return _G_fpos64_t.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)_G_fpos64_t.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)_G_fpos64_t.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return _G_fpos64_t.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(_G_fpos64_t.layout().byteSize() * elementCount, arena, cleanup);
    }
}

