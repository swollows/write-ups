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
 *  java.lang.foreign.ValueLayout$OfInt
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_func_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("insn_off"), Lib.C_INT.withName("type_id")}).withName("bpf_func_info");
    private static final ValueLayout.OfInt insn_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"insn_off")});
    private static final long insn_off$OFFSET = 0L;
    private static final ValueLayout.OfInt type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type_id")});
    private static final long type_id$OFFSET = 4L;

    bpf_func_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt insn_off$layout() {
        return insn_off$LAYOUT;
    }

    public static final long insn_off$offset() {
        return 0L;
    }

    public static int insn_off(MemorySegment struct) {
        return struct.get(insn_off$LAYOUT, 0L);
    }

    public static void insn_off(MemorySegment struct, int fieldValue) {
        struct.set(insn_off$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt type_id$layout() {
        return type_id$LAYOUT;
    }

    public static final long type_id$offset() {
        return 4L;
    }

    public static int type_id(MemorySegment struct) {
        return struct.get(type_id$LAYOUT, 4L);
    }

    public static void type_id(MemorySegment struct, int fieldValue) {
        struct.set(type_id$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_func_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_func_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_func_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_func_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_func_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_func_info.layout().byteSize() * elementCount, arena, cleanup);
    }
}

