/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.AddressLayout
 *  java.lang.foreign.Arena
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 *  java.lang.foreign.ValueLayout$OfInt
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class btf_ptr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("ptr"), Lib.C_INT.withName("type_id"), Lib.C_INT.withName("flags")}).withName("btf_ptr");
    private static final AddressLayout ptr$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ptr")});
    private static final long ptr$OFFSET = 0L;
    private static final ValueLayout.OfInt type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type_id")});
    private static final long type_id$OFFSET = 8L;
    private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 12L;

    btf_ptr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final AddressLayout ptr$layout() {
        return ptr$LAYOUT;
    }

    public static final long ptr$offset() {
        return 0L;
    }

    public static MemorySegment ptr(MemorySegment struct) {
        return struct.get(ptr$LAYOUT, 0L);
    }

    public static void ptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ptr$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt type_id$layout() {
        return type_id$LAYOUT;
    }

    public static final long type_id$offset() {
        return 8L;
    }

    public static int type_id(MemorySegment struct) {
        return struct.get(type_id$LAYOUT, 8L);
    }

    public static void type_id(MemorySegment struct, int fieldValue) {
        struct.set(type_id$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 12L;
    }

    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 12L);
    }

    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, 12L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(btf_ptr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return btf_ptr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)btf_ptr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)btf_ptr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return btf_ptr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(btf_ptr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

