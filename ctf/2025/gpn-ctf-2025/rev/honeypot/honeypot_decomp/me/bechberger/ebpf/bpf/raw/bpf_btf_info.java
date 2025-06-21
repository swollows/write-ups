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

public class bpf_btf_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("btf"), Lib.C_INT.withName("btf_size"), Lib.C_INT.withName("id"), Lib.C_LONG_LONG.withName("name"), Lib.C_INT.withName("name_len"), Lib.C_INT.withName("kernel_btf")}).withName("bpf_btf_info");
    private static final ValueLayout.OfLong btf$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf")});
    private static final long btf$OFFSET = 0L;
    private static final ValueLayout.OfInt btf_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_size")});
    private static final long btf_size$OFFSET = 8L;
    private static final ValueLayout.OfInt id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"id")});
    private static final long id$OFFSET = 12L;
    private static final ValueLayout.OfLong name$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name")});
    private static final long name$OFFSET = 16L;
    private static final ValueLayout.OfInt name_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name_len")});
    private static final long name_len$OFFSET = 24L;
    private static final ValueLayout.OfInt kernel_btf$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"kernel_btf")});
    private static final long kernel_btf$OFFSET = 28L;

    bpf_btf_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong btf$layout() {
        return btf$LAYOUT;
    }

    public static final long btf$offset() {
        return 0L;
    }

    public static long btf(MemorySegment struct) {
        return struct.get(btf$LAYOUT, 0L);
    }

    public static void btf(MemorySegment struct, long fieldValue) {
        struct.set(btf$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_size$layout() {
        return btf_size$LAYOUT;
    }

    public static final long btf_size$offset() {
        return 8L;
    }

    public static int btf_size(MemorySegment struct) {
        return struct.get(btf_size$LAYOUT, 8L);
    }

    public static void btf_size(MemorySegment struct, int fieldValue) {
        struct.set(btf_size$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt id$layout() {
        return id$LAYOUT;
    }

    public static final long id$offset() {
        return 12L;
    }

    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, 12L);
    }

    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfLong name$layout() {
        return name$LAYOUT;
    }

    public static final long name$offset() {
        return 16L;
    }

    public static long name(MemorySegment struct) {
        return struct.get(name$LAYOUT, 16L);
    }

    public static void name(MemorySegment struct, long fieldValue) {
        struct.set(name$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt name_len$layout() {
        return name_len$LAYOUT;
    }

    public static final long name_len$offset() {
        return 24L;
    }

    public static int name_len(MemorySegment struct) {
        return struct.get(name_len$LAYOUT, 24L);
    }

    public static void name_len(MemorySegment struct, int fieldValue) {
        struct.set(name_len$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt kernel_btf$layout() {
        return kernel_btf$LAYOUT;
    }

    public static final long kernel_btf$offset() {
        return 28L;
    }

    public static int kernel_btf(MemorySegment struct) {
        return struct.get(kernel_btf$LAYOUT, 28L);
    }

    public static void kernel_btf(MemorySegment struct, int fieldValue) {
        struct.set(kernel_btf$LAYOUT, 28L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_btf_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_btf_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_btf_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_btf_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_btf_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_btf_info.layout().byteSize() * elementCount, arena, cleanup);
    }
}

