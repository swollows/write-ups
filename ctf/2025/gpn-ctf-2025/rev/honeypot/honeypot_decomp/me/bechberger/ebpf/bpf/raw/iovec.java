/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.AddressLayout
 *  java.lang.foreign.Arena
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 *  java.lang.foreign.ValueLayout$OfLong
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class iovec {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("iov_base"), Lib.C_LONG.withName("iov_len")}).withName("iovec");
    private static final AddressLayout iov_base$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"iov_base")});
    private static final long iov_base$OFFSET = 0L;
    private static final ValueLayout.OfLong iov_len$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"iov_len")});
    private static final long iov_len$OFFSET = 8L;

    iovec() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final AddressLayout iov_base$layout() {
        return iov_base$LAYOUT;
    }

    public static final long iov_base$offset() {
        return 0L;
    }

    public static MemorySegment iov_base(MemorySegment struct) {
        return struct.get(iov_base$LAYOUT, 0L);
    }

    public static void iov_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(iov_base$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfLong iov_len$layout() {
        return iov_len$LAYOUT;
    }

    public static final long iov_len$offset() {
        return 8L;
    }

    public static long iov_len(MemorySegment struct) {
        return struct.get(iov_len$LAYOUT, 8L);
    }

    public static void iov_len(MemorySegment struct, long fieldValue) {
        struct.set(iov_len$LAYOUT, 8L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(iovec.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return iovec.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)iovec.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)iovec.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return iovec.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(iovec.layout().byteSize() * elementCount, arena, cleanup);
    }
}

