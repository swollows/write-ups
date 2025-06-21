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
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.foreign.ValueLayout$OfShort
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class sockaddr_storage {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("ss_family"), MemoryLayout.sequenceLayout((long)118L, (MemoryLayout)Lib.C_CHAR).withName("__ss_padding"), Lib.C_LONG.withName("__ss_align")}).withName("sockaddr_storage");
    private static final ValueLayout.OfShort ss_family$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ss_family")});
    private static final long ss_family$OFFSET = 0L;
    private static final SequenceLayout __ss_padding$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__ss_padding")});
    private static final long __ss_padding$OFFSET = 2L;
    private static long[] __ss_padding$DIMS = new long[]{118L};
    private static final VarHandle __ss_padding$ELEM_HANDLE = __ss_padding$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfLong __ss_align$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__ss_align")});
    private static final long __ss_align$OFFSET = 120L;

    sockaddr_storage() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort ss_family$layout() {
        return ss_family$LAYOUT;
    }

    public static final long ss_family$offset() {
        return 0L;
    }

    public static short ss_family(MemorySegment struct) {
        return struct.get(ss_family$LAYOUT, 0L);
    }

    public static void ss_family(MemorySegment struct, short fieldValue) {
        struct.set(ss_family$LAYOUT, 0L, fieldValue);
    }

    public static final SequenceLayout __ss_padding$layout() {
        return __ss_padding$LAYOUT;
    }

    public static final long __ss_padding$offset() {
        return 2L;
    }

    public static MemorySegment __ss_padding(MemorySegment struct) {
        return struct.asSlice(2L, __ss_padding$LAYOUT.byteSize());
    }

    public static void __ss_padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)2L, (long)__ss_padding$LAYOUT.byteSize());
    }

    public static long[] __ss_padding$dimensions() {
        return __ss_padding$DIMS;
    }

    public static byte __ss_padding(MemorySegment struct, long index0) {
        return __ss_padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __ss_padding(MemorySegment struct, long index0, byte fieldValue) {
        __ss_padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfLong __ss_align$layout() {
        return __ss_align$LAYOUT;
    }

    public static final long __ss_align$offset() {
        return 120L;
    }

    public static long __ss_align(MemorySegment struct) {
        return struct.get(__ss_align$LAYOUT, 120L);
    }

    public static void __ss_align(MemorySegment struct, long fieldValue) {
        struct.set(__ss_align$LAYOUT, 120L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(sockaddr_storage.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return sockaddr_storage.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)sockaddr_storage.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sockaddr_storage.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return sockaddr_storage.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(sockaddr_storage.layout().byteSize() * elementCount, arena, cleanup);
    }
}

