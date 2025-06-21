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

public class btf_var_secinfo {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("type"), Lib.C_INT.withName("offset"), Lib.C_INT.withName("size")}).withName("btf_var_secinfo");
    private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 0L;
    private static final ValueLayout.OfInt offset$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"offset")});
    private static final long offset$OFFSET = 4L;
    private static final ValueLayout.OfInt size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"size")});
    private static final long size$OFFSET = 8L;

    btf_var_secinfo() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 0L;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 0L);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt offset$layout() {
        return offset$LAYOUT;
    }

    public static final long offset$offset() {
        return 4L;
    }

    public static int offset(MemorySegment struct) {
        return struct.get(offset$LAYOUT, 4L);
    }

    public static void offset(MemorySegment struct, int fieldValue) {
        struct.set(offset$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt size$layout() {
        return size$LAYOUT;
    }

    public static final long size$offset() {
        return 8L;
    }

    public static int size(MemorySegment struct) {
        return struct.get(size$LAYOUT, 8L);
    }

    public static void size(MemorySegment struct, int fieldValue) {
        struct.set(size$LAYOUT, 8L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(btf_var_secinfo.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return btf_var_secinfo.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)btf_var_secinfo.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)btf_var_secinfo.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return btf_var_secinfo.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(btf_var_secinfo.layout().byteSize() * elementCount, arena, cleanup);
    }
}

