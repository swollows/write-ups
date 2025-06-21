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
import me.bechberger.ebpf.bpf.raw.__kernel_sockaddr_storage;

public class group_source_req {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("gsr_interface"), MemoryLayout.paddingLayout((long)4L), __kernel_sockaddr_storage.layout().withName("gsr_group"), __kernel_sockaddr_storage.layout().withName("gsr_source")}).withName("group_source_req");
    private static final ValueLayout.OfInt gsr_interface$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"gsr_interface")});
    private static final long gsr_interface$OFFSET = 0L;
    private static final GroupLayout gsr_group$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"gsr_group")});
    private static final long gsr_group$OFFSET = 8L;
    private static final GroupLayout gsr_source$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"gsr_source")});
    private static final long gsr_source$OFFSET = 136L;

    group_source_req() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt gsr_interface$layout() {
        return gsr_interface$LAYOUT;
    }

    public static final long gsr_interface$offset() {
        return 0L;
    }

    public static int gsr_interface(MemorySegment struct) {
        return struct.get(gsr_interface$LAYOUT, 0L);
    }

    public static void gsr_interface(MemorySegment struct, int fieldValue) {
        struct.set(gsr_interface$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout gsr_group$layout() {
        return gsr_group$LAYOUT;
    }

    public static final long gsr_group$offset() {
        return 8L;
    }

    public static MemorySegment gsr_group(MemorySegment struct) {
        return struct.asSlice(8L, gsr_group$LAYOUT.byteSize());
    }

    public static void gsr_group(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)gsr_group$LAYOUT.byteSize());
    }

    public static final GroupLayout gsr_source$layout() {
        return gsr_source$LAYOUT;
    }

    public static final long gsr_source$offset() {
        return 136L;
    }

    public static MemorySegment gsr_source(MemorySegment struct) {
        return struct.asSlice(136L, gsr_source$LAYOUT.byteSize());
    }

    public static void gsr_source(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)136L, (long)gsr_source$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(group_source_req.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return group_source_req.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)group_source_req.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)group_source_req.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return group_source_req.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(group_source_req.layout().byteSize() * elementCount, arena, cleanup);
    }
}

