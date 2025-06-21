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

public class bpf_sysctl {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("write"), Lib.C_INT.withName("file_pos")}).withName("bpf_sysctl");
    private static final ValueLayout.OfInt write$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"write")});
    private static final long write$OFFSET = 0L;
    private static final ValueLayout.OfInt file_pos$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"file_pos")});
    private static final long file_pos$OFFSET = 4L;

    bpf_sysctl() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt write$layout() {
        return write$LAYOUT;
    }

    public static final long write$offset() {
        return 0L;
    }

    public static int write(MemorySegment struct) {
        return struct.get(write$LAYOUT, 0L);
    }

    public static void write(MemorySegment struct, int fieldValue) {
        struct.set(write$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt file_pos$layout() {
        return file_pos$LAYOUT;
    }

    public static final long file_pos$offset() {
        return 4L;
    }

    public static int file_pos(MemorySegment struct) {
        return struct.get(file_pos$LAYOUT, 4L);
    }

    public static void file_pos(MemorySegment struct, int fieldValue) {
        struct.set(file_pos$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_sysctl.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_sysctl.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_sysctl.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_sysctl.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_sysctl.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_sysctl.layout().byteSize() * elementCount, arena, cleanup);
    }
}

