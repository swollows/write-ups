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
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfShort
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

public class bpf_insn {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("code"), MemoryLayout.paddingLayout((long)1L), Lib.C_SHORT.withName("off"), Lib.C_INT.withName("imm")}).withName("bpf_insn");
    private static final ValueLayout.OfByte code$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"code")});
    private static final long code$OFFSET = 0L;
    private static final ValueLayout.OfShort off$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"off")});
    private static final long off$OFFSET = 2L;
    private static final ValueLayout.OfInt imm$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imm")});
    private static final long imm$OFFSET = 4L;

    bpf_insn() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte code$layout() {
        return code$LAYOUT;
    }

    public static final long code$offset() {
        return 0L;
    }

    public static byte code(MemorySegment struct) {
        return struct.get(code$LAYOUT, 0L);
    }

    public static void code(MemorySegment struct, byte fieldValue) {
        struct.set(code$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort off$layout() {
        return off$LAYOUT;
    }

    public static final long off$offset() {
        return 2L;
    }

    public static short off(MemorySegment struct) {
        return struct.get(off$LAYOUT, 2L);
    }

    public static void off(MemorySegment struct, short fieldValue) {
        struct.set(off$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfInt imm$layout() {
        return imm$LAYOUT;
    }

    public static final long imm$offset() {
        return 4L;
    }

    public static int imm(MemorySegment struct) {
        return struct.get(imm$LAYOUT, 4L);
    }

    public static void imm(MemorySegment struct, int fieldValue) {
        struct.set(imm$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_insn.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_insn.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_insn.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_insn.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_insn.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_insn.layout().byteSize() * elementCount, arena, cleanup);
    }
}

