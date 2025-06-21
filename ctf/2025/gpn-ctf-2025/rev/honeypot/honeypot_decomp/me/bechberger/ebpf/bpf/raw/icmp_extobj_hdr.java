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

public class icmp_extobj_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("length"), Lib.C_CHAR.withName("class_num"), Lib.C_CHAR.withName("class_type")}).withName("icmp_extobj_hdr");
    private static final ValueLayout.OfShort length$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"length")});
    private static final long length$OFFSET = 0L;
    private static final ValueLayout.OfByte class_num$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"class_num")});
    private static final long class_num$OFFSET = 2L;
    private static final ValueLayout.OfByte class_type$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"class_type")});
    private static final long class_type$OFFSET = 3L;

    icmp_extobj_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort length$layout() {
        return length$LAYOUT;
    }

    public static final long length$offset() {
        return 0L;
    }

    public static short length(MemorySegment struct) {
        return struct.get(length$LAYOUT, 0L);
    }

    public static void length(MemorySegment struct, short fieldValue) {
        struct.set(length$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte class_num$layout() {
        return class_num$LAYOUT;
    }

    public static final long class_num$offset() {
        return 2L;
    }

    public static byte class_num(MemorySegment struct) {
        return struct.get(class_num$LAYOUT, 2L);
    }

    public static void class_num(MemorySegment struct, byte fieldValue) {
        struct.set(class_num$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfByte class_type$layout() {
        return class_type$LAYOUT;
    }

    public static final long class_type$offset() {
        return 3L;
    }

    public static byte class_type(MemorySegment struct) {
        return struct.get(class_type$LAYOUT, 3L);
    }

    public static void class_type(MemorySegment struct, byte fieldValue) {
        struct.set(class_type$LAYOUT, 3L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(icmp_extobj_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return icmp_extobj_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)icmp_extobj_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmp_extobj_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return icmp_extobj_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(icmp_extobj_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

