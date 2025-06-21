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

public class bpf_cgroup_dev_ctx {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("access_type"), Lib.C_INT.withName("major"), Lib.C_INT.withName("minor")}).withName("bpf_cgroup_dev_ctx");
    private static final ValueLayout.OfInt access_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"access_type")});
    private static final long access_type$OFFSET = 0L;
    private static final ValueLayout.OfInt major$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"major")});
    private static final long major$OFFSET = 4L;
    private static final ValueLayout.OfInt minor$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"minor")});
    private static final long minor$OFFSET = 8L;

    bpf_cgroup_dev_ctx() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt access_type$layout() {
        return access_type$LAYOUT;
    }

    public static final long access_type$offset() {
        return 0L;
    }

    public static int access_type(MemorySegment struct) {
        return struct.get(access_type$LAYOUT, 0L);
    }

    public static void access_type(MemorySegment struct, int fieldValue) {
        struct.set(access_type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt major$layout() {
        return major$LAYOUT;
    }

    public static final long major$offset() {
        return 4L;
    }

    public static int major(MemorySegment struct) {
        return struct.get(major$LAYOUT, 4L);
    }

    public static void major(MemorySegment struct, int fieldValue) {
        struct.set(major$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt minor$layout() {
        return minor$LAYOUT;
    }

    public static final long minor$offset() {
        return 8L;
    }

    public static int minor(MemorySegment struct) {
        return struct.get(minor$LAYOUT, 8L);
    }

    public static void minor(MemorySegment struct, int fieldValue) {
        struct.set(minor$LAYOUT, 8L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_cgroup_dev_ctx.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_cgroup_dev_ctx.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_cgroup_dev_ctx.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_cgroup_dev_ctx.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_cgroup_dev_ctx.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_cgroup_dev_ctx.layout().byteSize() * elementCount, arena, cleanup);
    }
}

