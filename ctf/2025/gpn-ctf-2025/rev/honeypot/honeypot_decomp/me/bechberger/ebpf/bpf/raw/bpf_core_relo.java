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

public class bpf_core_relo {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("insn_off"), Lib.C_INT.withName("type_id"), Lib.C_INT.withName("access_str_off"), Lib.C_INT.withName("kind")}).withName("bpf_core_relo");
    private static final ValueLayout.OfInt insn_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"insn_off")});
    private static final long insn_off$OFFSET = 0L;
    private static final ValueLayout.OfInt type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type_id")});
    private static final long type_id$OFFSET = 4L;
    private static final ValueLayout.OfInt access_str_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"access_str_off")});
    private static final long access_str_off$OFFSET = 8L;
    private static final ValueLayout.OfInt kind$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"kind")});
    private static final long kind$OFFSET = 12L;

    bpf_core_relo() {
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

    public static final ValueLayout.OfInt access_str_off$layout() {
        return access_str_off$LAYOUT;
    }

    public static final long access_str_off$offset() {
        return 8L;
    }

    public static int access_str_off(MemorySegment struct) {
        return struct.get(access_str_off$LAYOUT, 8L);
    }

    public static void access_str_off(MemorySegment struct, int fieldValue) {
        struct.set(access_str_off$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt kind$layout() {
        return kind$LAYOUT;
    }

    public static final long kind$offset() {
        return 12L;
    }

    public static int kind(MemorySegment struct) {
        return struct.get(kind$LAYOUT, 12L);
    }

    public static void kind(MemorySegment struct, int fieldValue) {
        struct.set(kind$LAYOUT, 12L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_core_relo.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_core_relo.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_core_relo.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_core_relo.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_core_relo.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_core_relo.layout().byteSize() * elementCount, arena, cleanup);
    }
}

