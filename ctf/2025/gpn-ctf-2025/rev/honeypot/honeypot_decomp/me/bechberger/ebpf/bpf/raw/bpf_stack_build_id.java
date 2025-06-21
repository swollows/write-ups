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
 *  java.lang.foreign.ValueLayout$OfLong
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

public class bpf_stack_build_id {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("status"), MemoryLayout.sequenceLayout((long)20L, (MemoryLayout)Lib.C_CHAR).withName("build_id"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("offset"), Lib.C_LONG_LONG.withName("ip")}).withName("$anon$1454:2")}).withName("bpf_stack_build_id");
    private static final ValueLayout.OfInt status$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"status")});
    private static final long status$OFFSET = 0L;
    private static final SequenceLayout build_id$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"build_id")});
    private static final long build_id$OFFSET = 4L;
    private static long[] build_id$DIMS = new long[]{20L};
    private static final VarHandle build_id$ELEM_HANDLE = build_id$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfLong offset$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1454:2"), MemoryLayout.PathElement.groupElement((String)"offset")});
    private static final long offset$OFFSET = 24L;
    private static final ValueLayout.OfLong ip$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1454:2"), MemoryLayout.PathElement.groupElement((String)"ip")});
    private static final long ip$OFFSET = 24L;

    bpf_stack_build_id() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt status$layout() {
        return status$LAYOUT;
    }

    public static final long status$offset() {
        return 0L;
    }

    public static int status(MemorySegment struct) {
        return struct.get(status$LAYOUT, 0L);
    }

    public static void status(MemorySegment struct, int fieldValue) {
        struct.set(status$LAYOUT, 0L, fieldValue);
    }

    public static final SequenceLayout build_id$layout() {
        return build_id$LAYOUT;
    }

    public static final long build_id$offset() {
        return 4L;
    }

    public static MemorySegment build_id(MemorySegment struct) {
        return struct.asSlice(4L, build_id$LAYOUT.byteSize());
    }

    public static void build_id(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)build_id$LAYOUT.byteSize());
    }

    public static long[] build_id$dimensions() {
        return build_id$DIMS;
    }

    public static byte build_id(MemorySegment struct, long index0) {
        return build_id$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void build_id(MemorySegment struct, long index0, byte fieldValue) {
        build_id$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfLong offset$layout() {
        return offset$LAYOUT;
    }

    public static final long offset$offset() {
        return 24L;
    }

    public static long offset(MemorySegment struct) {
        return struct.get(offset$LAYOUT, 24L);
    }

    public static void offset(MemorySegment struct, long fieldValue) {
        struct.set(offset$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfLong ip$layout() {
        return ip$LAYOUT;
    }

    public static final long ip$offset() {
        return 24L;
    }

    public static long ip(MemorySegment struct) {
        return struct.get(ip$LAYOUT, 24L);
    }

    public static void ip(MemorySegment struct, long fieldValue) {
        struct.set(ip$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_stack_build_id.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_stack_build_id.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_stack_build_id.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_stack_build_id.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_stack_build_id.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_stack_build_id.layout().byteSize() * elementCount, arena, cleanup);
    }
}

