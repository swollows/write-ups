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

public class bpf_rb_node {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_LONG_LONG).withName("__opaque")}).withName("bpf_rb_node");
    private static final SequenceLayout __opaque$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__opaque")});
    private static final long __opaque$OFFSET = 0L;
    private static long[] __opaque$DIMS = new long[]{4L};
    private static final VarHandle __opaque$ELEM_HANDLE = __opaque$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    bpf_rb_node() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout __opaque$layout() {
        return __opaque$LAYOUT;
    }

    public static final long __opaque$offset() {
        return 0L;
    }

    public static MemorySegment __opaque(MemorySegment struct) {
        return struct.asSlice(0L, __opaque$LAYOUT.byteSize());
    }

    public static void __opaque(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)__opaque$LAYOUT.byteSize());
    }

    public static long[] __opaque$dimensions() {
        return __opaque$DIMS;
    }

    public static long __opaque(MemorySegment struct, long index0) {
        return __opaque$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __opaque(MemorySegment struct, long index0, long fieldValue) {
        __opaque$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_rb_node.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_rb_node.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_rb_node.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_rb_node.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_rb_node.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_rb_node.layout().byteSize() * elementCount, arena, cleanup);
    }
}

