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

public class group_req {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("gr_interface"), MemoryLayout.paddingLayout((long)4L), __kernel_sockaddr_storage.layout().withName("gr_group")}).withName("group_req");
    private static final ValueLayout.OfInt gr_interface$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"gr_interface")});
    private static final long gr_interface$OFFSET = 0L;
    private static final GroupLayout gr_group$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"gr_group")});
    private static final long gr_group$OFFSET = 8L;

    group_req() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt gr_interface$layout() {
        return gr_interface$LAYOUT;
    }

    public static final long gr_interface$offset() {
        return 0L;
    }

    public static int gr_interface(MemorySegment struct) {
        return struct.get(gr_interface$LAYOUT, 0L);
    }

    public static void gr_interface(MemorySegment struct, int fieldValue) {
        struct.set(gr_interface$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout gr_group$layout() {
        return gr_group$LAYOUT;
    }

    public static final long gr_group$offset() {
        return 8L;
    }

    public static MemorySegment gr_group(MemorySegment struct) {
        return struct.asSlice(8L, gr_group$LAYOUT.byteSize());
    }

    public static void gr_group(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)gr_group$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(group_req.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return group_req.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)group_req.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)group_req.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return group_req.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(group_req.layout().byteSize() * elementCount, arena, cleanup);
    }
}

