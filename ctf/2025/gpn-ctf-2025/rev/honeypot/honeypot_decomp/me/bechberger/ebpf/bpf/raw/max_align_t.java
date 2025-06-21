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

public class max_align_t {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("__clang_max_align_nonce1"), MemoryLayout.paddingLayout((long)24L)}).withName("$anon$19:9");
    private static final ValueLayout.OfLong __clang_max_align_nonce1$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__clang_max_align_nonce1")});
    private static final long __clang_max_align_nonce1$OFFSET = 0L;

    max_align_t() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong __clang_max_align_nonce1$layout() {
        return __clang_max_align_nonce1$LAYOUT;
    }

    public static final long __clang_max_align_nonce1$offset() {
        return 0L;
    }

    public static long __clang_max_align_nonce1(MemorySegment struct) {
        return struct.get(__clang_max_align_nonce1$LAYOUT, 0L);
    }

    public static void __clang_max_align_nonce1(MemorySegment struct, long fieldValue) {
        struct.set(__clang_max_align_nonce1$LAYOUT, 0L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(max_align_t.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return max_align_t.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)max_align_t.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)max_align_t.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return max_align_t.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(max_align_t.layout().byteSize() * elementCount, arena, cleanup);
    }
}

