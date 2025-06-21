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

public class bpf_map_skeleton {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("name"), Lib.C_POINTER.withName("map"), Lib.C_POINTER.withName("mmaped"), Lib.C_POINTER.withName("link")}).withName("bpf_map_skeleton");
    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name")});
    private static final long name$OFFSET = 0L;
    private static final AddressLayout map$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map")});
    private static final long map$OFFSET = 8L;
    private static final AddressLayout mmaped$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mmaped")});
    private static final long mmaped$OFFSET = 16L;
    private static final AddressLayout link$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link")});
    private static final long link$OFFSET = 24L;

    bpf_map_skeleton() {
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

    public static final AddressLayout map$layout() {
        return map$LAYOUT;
    }

    public static final long map$offset() {
        return 8L;
    }

    public static MemorySegment map(MemorySegment struct) {
        return struct.get(map$LAYOUT, 8L);
    }

    public static void map(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(map$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout mmaped$layout() {
        return mmaped$LAYOUT;
    }

    public static final long mmaped$offset() {
        return 16L;
    }

    public static MemorySegment mmaped(MemorySegment struct) {
        return struct.get(mmaped$LAYOUT, 16L);
    }

    public static void mmaped(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mmaped$LAYOUT, 16L, fieldValue);
    }

    public static final AddressLayout link$layout() {
        return link$LAYOUT;
    }

    public static final long link$offset() {
        return 24L;
    }

    public static MemorySegment link(MemorySegment struct) {
        return struct.get(link$LAYOUT, 24L);
    }

    public static void link(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(link$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_map_skeleton.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_map_skeleton.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_map_skeleton.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_map_skeleton.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_map_skeleton.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_map_skeleton.layout().byteSize() * elementCount, arena, cleanup);
    }
}

