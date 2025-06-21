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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class __kernel_fd_set {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_LONG).withName("fds_bits")}).withName("$anon$25:9");
    private static final SequenceLayout fds_bits$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"fds_bits")});
    private static final long fds_bits$OFFSET = 0L;
    private static long[] fds_bits$DIMS = new long[]{16L};
    private static final VarHandle fds_bits$ELEM_HANDLE = fds_bits$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    __kernel_fd_set() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout fds_bits$layout() {
        return fds_bits$LAYOUT;
    }

    public static final long fds_bits$offset() {
        return 0L;
    }

    public static MemorySegment fds_bits(MemorySegment struct) {
        return struct.asSlice(0L, fds_bits$LAYOUT.byteSize());
    }

    public static void fds_bits(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)fds_bits$LAYOUT.byteSize());
    }

    public static long[] fds_bits$dimensions() {
        return fds_bits$DIMS;
    }

    public static long fds_bits(MemorySegment struct, long index0) {
        return fds_bits$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void fds_bits(MemorySegment struct, long index0, long fieldValue) {
        fds_bits$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__kernel_fd_set.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __kernel_fd_set.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__kernel_fd_set.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__kernel_fd_set.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __kernel_fd_set.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__kernel_fd_set.layout().byteSize() * elementCount, arena, cleanup);
    }
}

