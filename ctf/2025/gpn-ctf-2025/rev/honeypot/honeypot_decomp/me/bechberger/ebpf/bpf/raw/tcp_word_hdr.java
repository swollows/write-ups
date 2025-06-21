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
import me.bechberger.ebpf.bpf.raw.tcphdr;

public class tcp_word_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{tcphdr.layout().withName("hdr"), MemoryLayout.sequenceLayout((long)5L, (MemoryLayout)Lib.C_INT).withName("words")}).withName("tcp_word_hdr");
    private static final GroupLayout hdr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hdr")});
    private static final long hdr$OFFSET = 0L;
    private static final SequenceLayout words$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"words")});
    private static final long words$OFFSET = 0L;
    private static long[] words$DIMS = new long[]{5L};
    private static final VarHandle words$ELEM_HANDLE = words$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    tcp_word_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout hdr$layout() {
        return hdr$LAYOUT;
    }

    public static final long hdr$offset() {
        return 0L;
    }

    public static MemorySegment hdr(MemorySegment union) {
        return union.asSlice(0L, hdr$LAYOUT.byteSize());
    }

    public static void hdr(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)hdr$LAYOUT.byteSize());
    }

    public static final SequenceLayout words$layout() {
        return words$LAYOUT;
    }

    public static final long words$offset() {
        return 0L;
    }

    public static MemorySegment words(MemorySegment union) {
        return union.asSlice(0L, words$LAYOUT.byteSize());
    }

    public static void words(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)words$LAYOUT.byteSize());
    }

    public static long[] words$dimensions() {
        return words$DIMS;
    }

    public static int words(MemorySegment union, long index0) {
        return words$ELEM_HANDLE.get(union, 0L, index0);
    }

    public static void words(MemorySegment union, long index0, int fieldValue) {
        words$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_word_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_word_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_word_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_word_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_word_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_word_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

