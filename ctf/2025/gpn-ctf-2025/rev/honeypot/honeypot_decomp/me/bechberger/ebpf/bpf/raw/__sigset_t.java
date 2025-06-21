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

public class __sigset_t {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_LONG).withName("__val")}).withName("$anon$5:9");
    private static final SequenceLayout __val$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__val")});
    private static final long __val$OFFSET = 0L;
    private static long[] __val$DIMS = new long[]{16L};
    private static final VarHandle __val$ELEM_HANDLE = __val$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    __sigset_t() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout __val$layout() {
        return __val$LAYOUT;
    }

    public static final long __val$offset() {
        return 0L;
    }

    public static MemorySegment __val(MemorySegment struct) {
        return struct.asSlice(0L, __val$LAYOUT.byteSize());
    }

    public static void __val(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)__val$LAYOUT.byteSize());
    }

    public static long[] __val$dimensions() {
        return __val$DIMS;
    }

    public static long __val(MemorySegment struct, long index0) {
        return __val$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __val(MemorySegment struct, long index0, long fieldValue) {
        __val$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__sigset_t.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __sigset_t.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__sigset_t.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__sigset_t.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __sigset_t.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__sigset_t.layout().byteSize() * elementCount, arena, cleanup);
    }
}

