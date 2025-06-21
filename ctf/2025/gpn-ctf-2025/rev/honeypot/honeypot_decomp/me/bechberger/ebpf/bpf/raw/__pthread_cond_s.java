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
 *  java.lang.foreign.ValueLayout$OfInt
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
import me.bechberger.ebpf.bpf.raw.__atomic_wide_counter;

public class __pthread_cond_s {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{__atomic_wide_counter.layout().withName("__wseq"), __atomic_wide_counter.layout().withName("__g1_start"), MemoryLayout.sequenceLayout((long)2L, (MemoryLayout)Lib.C_INT).withName("__g_size"), Lib.C_INT.withName("__g1_orig_size"), Lib.C_INT.withName("__wrefs"), MemoryLayout.sequenceLayout((long)2L, (MemoryLayout)Lib.C_INT).withName("__g_signals")}).withName("__pthread_cond_s");
    private static final GroupLayout __wseq$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__wseq")});
    private static final long __wseq$OFFSET = 0L;
    private static final GroupLayout __g1_start$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__g1_start")});
    private static final long __g1_start$OFFSET = 8L;
    private static final SequenceLayout __g_size$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__g_size")});
    private static final long __g_size$OFFSET = 16L;
    private static long[] __g_size$DIMS = new long[]{2L};
    private static final VarHandle __g_size$ELEM_HANDLE = __g_size$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt __g1_orig_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__g1_orig_size")});
    private static final long __g1_orig_size$OFFSET = 24L;
    private static final ValueLayout.OfInt __wrefs$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__wrefs")});
    private static final long __wrefs$OFFSET = 28L;
    private static final SequenceLayout __g_signals$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__g_signals")});
    private static final long __g_signals$OFFSET = 32L;
    private static long[] __g_signals$DIMS = new long[]{2L};
    private static final VarHandle __g_signals$ELEM_HANDLE = __g_signals$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    __pthread_cond_s() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout __wseq$layout() {
        return __wseq$LAYOUT;
    }

    public static final long __wseq$offset() {
        return 0L;
    }

    public static MemorySegment __wseq(MemorySegment struct) {
        return struct.asSlice(0L, __wseq$LAYOUT.byteSize());
    }

    public static void __wseq(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)__wseq$LAYOUT.byteSize());
    }

    public static final GroupLayout __g1_start$layout() {
        return __g1_start$LAYOUT;
    }

    public static final long __g1_start$offset() {
        return 8L;
    }

    public static MemorySegment __g1_start(MemorySegment struct) {
        return struct.asSlice(8L, __g1_start$LAYOUT.byteSize());
    }

    public static void __g1_start(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)__g1_start$LAYOUT.byteSize());
    }

    public static final SequenceLayout __g_size$layout() {
        return __g_size$LAYOUT;
    }

    public static final long __g_size$offset() {
        return 16L;
    }

    public static MemorySegment __g_size(MemorySegment struct) {
        return struct.asSlice(16L, __g_size$LAYOUT.byteSize());
    }

    public static void __g_size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)__g_size$LAYOUT.byteSize());
    }

    public static long[] __g_size$dimensions() {
        return __g_size$DIMS;
    }

    public static int __g_size(MemorySegment struct, long index0) {
        return __g_size$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __g_size(MemorySegment struct, long index0, int fieldValue) {
        __g_size$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt __g1_orig_size$layout() {
        return __g1_orig_size$LAYOUT;
    }

    public static final long __g1_orig_size$offset() {
        return 24L;
    }

    public static int __g1_orig_size(MemorySegment struct) {
        return struct.get(__g1_orig_size$LAYOUT, 24L);
    }

    public static void __g1_orig_size(MemorySegment struct, int fieldValue) {
        struct.set(__g1_orig_size$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt __wrefs$layout() {
        return __wrefs$LAYOUT;
    }

    public static final long __wrefs$offset() {
        return 28L;
    }

    public static int __wrefs(MemorySegment struct) {
        return struct.get(__wrefs$LAYOUT, 28L);
    }

    public static void __wrefs(MemorySegment struct, int fieldValue) {
        struct.set(__wrefs$LAYOUT, 28L, fieldValue);
    }

    public static final SequenceLayout __g_signals$layout() {
        return __g_signals$LAYOUT;
    }

    public static final long __g_signals$offset() {
        return 32L;
    }

    public static MemorySegment __g_signals(MemorySegment struct) {
        return struct.asSlice(32L, __g_signals$LAYOUT.byteSize());
    }

    public static void __g_signals(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)__g_signals$LAYOUT.byteSize());
    }

    public static long[] __g_signals$dimensions() {
        return __g_signals$DIMS;
    }

    public static int __g_signals(MemorySegment struct, long index0) {
        return __g_signals$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __g_signals(MemorySegment struct, long index0, int fieldValue) {
        __g_signals$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__pthread_cond_s.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __pthread_cond_s.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__pthread_cond_s.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__pthread_cond_s.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __pthread_cond_s.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__pthread_cond_s.layout().byteSize() * elementCount, arena, cleanup);
    }
}

