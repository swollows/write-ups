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

public class bpf_line_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("insn_off"), Lib.C_INT.withName("file_name_off"), Lib.C_INT.withName("line_off"), Lib.C_INT.withName("line_col")}).withName("bpf_line_info");
    private static final ValueLayout.OfInt insn_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"insn_off")});
    private static final long insn_off$OFFSET = 0L;
    private static final ValueLayout.OfInt file_name_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"file_name_off")});
    private static final long file_name_off$OFFSET = 4L;
    private static final ValueLayout.OfInt line_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"line_off")});
    private static final long line_off$OFFSET = 8L;
    private static final ValueLayout.OfInt line_col$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"line_col")});
    private static final long line_col$OFFSET = 12L;

    bpf_line_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt insn_off$layout() {
        return insn_off$LAYOUT;
    }

    public static final long insn_off$offset() {
        return 0L;
    }

    public static int insn_off(MemorySegment struct) {
        return struct.get(insn_off$LAYOUT, 0L);
    }

    public static void insn_off(MemorySegment struct, int fieldValue) {
        struct.set(insn_off$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt file_name_off$layout() {
        return file_name_off$LAYOUT;
    }

    public static final long file_name_off$offset() {
        return 4L;
    }

    public static int file_name_off(MemorySegment struct) {
        return struct.get(file_name_off$LAYOUT, 4L);
    }

    public static void file_name_off(MemorySegment struct, int fieldValue) {
        struct.set(file_name_off$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt line_off$layout() {
        return line_off$LAYOUT;
    }

    public static final long line_off$offset() {
        return 8L;
    }

    public static int line_off(MemorySegment struct) {
        return struct.get(line_off$LAYOUT, 8L);
    }

    public static void line_off(MemorySegment struct, int fieldValue) {
        struct.set(line_off$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt line_col$layout() {
        return line_col$LAYOUT;
    }

    public static final long line_col$offset() {
        return 12L;
    }

    public static int line_col(MemorySegment struct) {
        return struct.get(line_col$LAYOUT, 12L);
    }

    public static void line_col(MemorySegment struct, int fieldValue) {
        struct.set(line_col$LAYOUT, 12L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_line_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_line_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_line_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_line_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_line_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_line_info.layout().byteSize() * elementCount, arena, cleanup);
    }
}

