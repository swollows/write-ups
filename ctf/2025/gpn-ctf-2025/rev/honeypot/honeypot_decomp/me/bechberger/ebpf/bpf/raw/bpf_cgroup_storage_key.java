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

public class bpf_cgroup_storage_key {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("cgroup_inode_id"), Lib.C_INT.withName("attach_type"), MemoryLayout.paddingLayout((long)4L)}).withName("bpf_cgroup_storage_key");
    private static final ValueLayout.OfLong cgroup_inode_id$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cgroup_inode_id")});
    private static final long cgroup_inode_id$OFFSET = 0L;
    private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
    private static final long attach_type$OFFSET = 8L;

    bpf_cgroup_storage_key() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong cgroup_inode_id$layout() {
        return cgroup_inode_id$LAYOUT;
    }

    public static final long cgroup_inode_id$offset() {
        return 0L;
    }

    public static long cgroup_inode_id(MemorySegment struct) {
        return struct.get(cgroup_inode_id$LAYOUT, 0L);
    }

    public static void cgroup_inode_id(MemorySegment struct, long fieldValue) {
        struct.set(cgroup_inode_id$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_type$layout() {
        return attach_type$LAYOUT;
    }

    public static final long attach_type$offset() {
        return 8L;
    }

    public static int attach_type(MemorySegment struct) {
        return struct.get(attach_type$LAYOUT, 8L);
    }

    public static void attach_type(MemorySegment struct, int fieldValue) {
        struct.set(attach_type$LAYOUT, 8L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_cgroup_storage_key.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_cgroup_storage_key.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_cgroup_storage_key.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_cgroup_storage_key.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_cgroup_storage_key.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_cgroup_storage_key.layout().byteSize() * elementCount, arena, cleanup);
    }
}

