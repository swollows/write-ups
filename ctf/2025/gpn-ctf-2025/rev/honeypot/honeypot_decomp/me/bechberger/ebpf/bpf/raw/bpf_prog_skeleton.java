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
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_prog_skeleton {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("name"), Lib.C_POINTER.withName("prog"), Lib.C_POINTER.withName("link")}).withName("bpf_prog_skeleton");
    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name")});
    private static final long name$OFFSET = 0L;
    private static final AddressLayout prog$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog")});
    private static final long prog$OFFSET = 8L;
    private static final AddressLayout link$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link")});
    private static final long link$OFFSET = 16L;

    bpf_prog_skeleton() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    public static final long name$offset() {
        return 0L;
    }

    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, 0L);
    }

    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, 0L, fieldValue);
    }

    public static final AddressLayout prog$layout() {
        return prog$LAYOUT;
    }

    public static final long prog$offset() {
        return 8L;
    }

    public static MemorySegment prog(MemorySegment struct) {
        return struct.get(prog$LAYOUT, 8L);
    }

    public static void prog(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prog$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout link$layout() {
        return link$LAYOUT;
    }

    public static final long link$offset() {
        return 16L;
    }

    public static MemorySegment link(MemorySegment struct) {
        return struct.get(link$LAYOUT, 16L);
    }

    public static void link(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(link$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_prog_skeleton.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_prog_skeleton.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_prog_skeleton.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_prog_skeleton.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_prog_skeleton.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_prog_skeleton.layout().byteSize() * elementCount, arena, cleanup);
    }
}

