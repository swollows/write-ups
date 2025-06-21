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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfShort
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
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

public class __kernel_sockaddr_storage {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("ss_family"), MemoryLayout.sequenceLayout((long)126L, (MemoryLayout)Lib.C_CHAR).withName("__data")}).withName("$anon$18:3"), Lib.C_POINTER.withName("__align")}).withName("$anon$17:2")}).withName("__kernel_sockaddr_storage");
    private static final ValueLayout.OfShort ss_family$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$17:2"), MemoryLayout.PathElement.groupElement((String)"$anon$18:3"), MemoryLayout.PathElement.groupElement((String)"ss_family")});
    private static final long ss_family$OFFSET = 0L;
    private static final SequenceLayout __data$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$17:2"), MemoryLayout.PathElement.groupElement((String)"$anon$18:3"), MemoryLayout.PathElement.groupElement((String)"__data")});
    private static final long __data$OFFSET = 2L;
    private static long[] __data$DIMS = new long[]{126L};
    private static final VarHandle __data$ELEM_HANDLE = __data$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final AddressLayout __align$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$17:2"), MemoryLayout.PathElement.groupElement((String)"__align")});
    private static final long __align$OFFSET = 0L;

    __kernel_sockaddr_storage() {
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

    public static final SequenceLayout __data$layout() {
        return __data$LAYOUT;
    }

    public static final long __data$offset() {
        return 2L;
    }

    public static MemorySegment __data(MemorySegment struct) {
        return struct.asSlice(2L, __data$LAYOUT.byteSize());
    }

    public static void __data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)2L, (long)__data$LAYOUT.byteSize());
    }

    public static long[] __data$dimensions() {
        return __data$DIMS;
    }

    public static byte __data(MemorySegment struct, long index0) {
        return __data$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __data(MemorySegment struct, long index0, byte fieldValue) {
        __data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final AddressLayout __align$layout() {
        return __align$LAYOUT;
    }

    public static final long __align$offset() {
        return 0L;
    }

    public static MemorySegment __align(MemorySegment struct) {
        return struct.get(__align$LAYOUT, 0L);
    }

    public static void __align(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__align$LAYOUT, 0L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__kernel_sockaddr_storage.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __kernel_sockaddr_storage.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__kernel_sockaddr_storage.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__kernel_sockaddr_storage.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __kernel_sockaddr_storage.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__kernel_sockaddr_storage.layout().byteSize() * elementCount, arena, cleanup);
    }
}

