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

public class cpu_set_t {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_LONG).withName("__bits")}).withName("$anon$39:9");
    private static final SequenceLayout __bits$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__bits")});
    private static final long __bits$OFFSET = 0L;
    private static long[] __bits$DIMS = new long[]{16L};
    private static final VarHandle __bits$ELEM_HANDLE = __bits$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    cpu_set_t() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout __bits$layout() {
        return __bits$LAYOUT;
    }

    public static final long __bits$offset() {
        return 0L;
    }

    public static MemorySegment __bits(MemorySegment struct) {
        return struct.asSlice(0L, __bits$LAYOUT.byteSize());
    }

    public static void __bits(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)__bits$LAYOUT.byteSize());
    }

    public static long[] __bits$dimensions() {
        return __bits$DIMS;
    }

    public static long __bits(MemorySegment struct, long index0) {
        return __bits$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __bits(MemorySegment struct, long index0, long fieldValue) {
        __bits$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(cpu_set_t.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return cpu_set_t.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)cpu_set_t.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)cpu_set_t.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return cpu_set_t.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(cpu_set_t.layout().byteSize() * elementCount, arena, cleanup);
    }
}

