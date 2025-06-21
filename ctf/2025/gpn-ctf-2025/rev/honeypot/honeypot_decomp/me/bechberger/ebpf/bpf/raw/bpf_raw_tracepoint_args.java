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

public class bpf_raw_tracepoint_args {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)Lib.C_LONG_LONG).withName("args")}).withName("bpf_raw_tracepoint_args");
    private static final SequenceLayout args$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"args")});
    private static final long args$OFFSET = 0L;
    private static long[] args$DIMS = new long[]{0L};
    private static final VarHandle args$ELEM_HANDLE = args$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    bpf_raw_tracepoint_args() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout args$layout() {
        return args$LAYOUT;
    }

    public static final long args$offset() {
        return 0L;
    }

    public static MemorySegment args(MemorySegment struct) {
        return struct.asSlice(0L, args$LAYOUT.byteSize());
    }

    public static void args(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)args$LAYOUT.byteSize());
    }

    public static long[] args$dimensions() {
        return args$DIMS;
    }

    public static long args(MemorySegment struct, long index0) {
        return args$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void args(MemorySegment struct, long index0, long fieldValue) {
        args$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_raw_tracepoint_args.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_raw_tracepoint_args.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_raw_tracepoint_args.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_raw_tracepoint_args.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_raw_tracepoint_args.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_raw_tracepoint_args.layout().byteSize() * elementCount, arena, cleanup);
    }
}

