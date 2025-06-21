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

public class bpf_pidns_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("pid"), Lib.C_INT.withName("tgid")}).withName("bpf_pidns_info");
    private static final ValueLayout.OfInt pid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pid")});
    private static final long pid$OFFSET = 0L;
    private static final ValueLayout.OfInt tgid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tgid")});
    private static final long tgid$OFFSET = 4L;

    bpf_pidns_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt pid$layout() {
        return pid$LAYOUT;
    }

    public static final long pid$offset() {
        return 0L;
    }

    public static int pid(MemorySegment struct) {
        return struct.get(pid$LAYOUT, 0L);
    }

    public static void pid(MemorySegment struct, int fieldValue) {
        struct.set(pid$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt tgid$layout() {
        return tgid$LAYOUT;
    }

    public static final long tgid$offset() {
        return 4L;
    }

    public static int tgid(MemorySegment struct) {
        return struct.get(tgid$LAYOUT, 4L);
    }

    public static void tgid(MemorySegment struct, int fieldValue) {
        struct.set(tgid$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_pidns_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_pidns_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_pidns_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_pidns_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_pidns_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_pidns_info.layout().byteSize() * elementCount, arena, cleanup);
    }
}

