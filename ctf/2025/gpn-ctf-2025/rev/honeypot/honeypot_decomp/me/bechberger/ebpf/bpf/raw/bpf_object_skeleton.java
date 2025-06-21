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
 *  java.lang.foreign.ValueLayout$OfLong
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

public class bpf_object_skeleton {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("name"), Lib.C_POINTER.withName("data"), Lib.C_LONG.withName("data_sz"), Lib.C_POINTER.withName("obj"), Lib.C_INT.withName("map_cnt"), Lib.C_INT.withName("map_skel_sz"), Lib.C_POINTER.withName("maps"), Lib.C_INT.withName("prog_cnt"), Lib.C_INT.withName("prog_skel_sz"), Lib.C_POINTER.withName("progs")}).withName("bpf_object_skeleton");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name")});
    private static final long name$OFFSET = 8L;
    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data")});
    private static final long data$OFFSET = 16L;
    private static final ValueLayout.OfLong data_sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_sz")});
    private static final long data_sz$OFFSET = 24L;
    private static final AddressLayout obj$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"obj")});
    private static final long obj$OFFSET = 32L;
    private static final ValueLayout.OfInt map_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_cnt")});
    private static final long map_cnt$OFFSET = 40L;
    private static final ValueLayout.OfInt map_skel_sz$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_skel_sz")});
    private static final long map_skel_sz$OFFSET = 44L;
    private static final AddressLayout maps$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"maps")});
    private static final long maps$OFFSET = 48L;
    private static final ValueLayout.OfInt prog_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_cnt")});
    private static final long prog_cnt$OFFSET = 56L;
    private static final ValueLayout.OfInt prog_skel_sz$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_skel_sz")});
    private static final long prog_skel_sz$OFFSET = 60L;
    private static final AddressLayout progs$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"progs")});
    private static final long progs$OFFSET = 64L;

    bpf_object_skeleton() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong sz$layout() {
        return sz$LAYOUT;
    }

    public static final long sz$offset() {
        return 0L;
    }

    public static long sz(MemorySegment struct) {
        return struct.get(sz$LAYOUT, 0L);
    }

    public static void sz(MemorySegment struct, long fieldValue) {
        struct.set(sz$LAYOUT, 0L, fieldValue);
    }

    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    public static final long name$offset() {
        return 8L;
    }

    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, 8L);
    }

    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    public static final long data$offset() {
        return 16L;
    }

    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, 16L);
    }

    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfLong data_sz$layout() {
        return data_sz$LAYOUT;
    }

    public static final long data_sz$offset() {
        return 24L;
    }

    public static long data_sz(MemorySegment struct) {
        return struct.get(data_sz$LAYOUT, 24L);
    }

    public static void data_sz(MemorySegment struct, long fieldValue) {
        struct.set(data_sz$LAYOUT, 24L, fieldValue);
    }

    public static final AddressLayout obj$layout() {
        return obj$LAYOUT;
    }

    public static final long obj$offset() {
        return 32L;
    }

    public static MemorySegment obj(MemorySegment struct) {
        return struct.get(obj$LAYOUT, 32L);
    }

    public static void obj(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(obj$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt map_cnt$layout() {
        return map_cnt$LAYOUT;
    }

    public static final long map_cnt$offset() {
        return 40L;
    }

    public static int map_cnt(MemorySegment struct) {
        return struct.get(map_cnt$LAYOUT, 40L);
    }

    public static void map_cnt(MemorySegment struct, int fieldValue) {
        struct.set(map_cnt$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt map_skel_sz$layout() {
        return map_skel_sz$LAYOUT;
    }

    public static final long map_skel_sz$offset() {
        return 44L;
    }

    public static int map_skel_sz(MemorySegment struct) {
        return struct.get(map_skel_sz$LAYOUT, 44L);
    }

    public static void map_skel_sz(MemorySegment struct, int fieldValue) {
        struct.set(map_skel_sz$LAYOUT, 44L, fieldValue);
    }

    public static final AddressLayout maps$layout() {
        return maps$LAYOUT;
    }

    public static final long maps$offset() {
        return 48L;
    }

    public static MemorySegment maps(MemorySegment struct) {
        return struct.get(maps$LAYOUT, 48L);
    }

    public static void maps(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(maps$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_cnt$layout() {
        return prog_cnt$LAYOUT;
    }

    public static final long prog_cnt$offset() {
        return 56L;
    }

    public static int prog_cnt(MemorySegment struct) {
        return struct.get(prog_cnt$LAYOUT, 56L);
    }

    public static void prog_cnt(MemorySegment struct, int fieldValue) {
        struct.set(prog_cnt$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_skel_sz$layout() {
        return prog_skel_sz$LAYOUT;
    }

    public static final long prog_skel_sz$offset() {
        return 60L;
    }

    public static int prog_skel_sz(MemorySegment struct) {
        return struct.get(prog_skel_sz$LAYOUT, 60L);
    }

    public static void prog_skel_sz(MemorySegment struct, int fieldValue) {
        struct.set(prog_skel_sz$LAYOUT, 60L, fieldValue);
    }

    public static final AddressLayout progs$layout() {
        return progs$LAYOUT;
    }

    public static final long progs$offset() {
        return 64L;
    }

    public static MemorySegment progs(MemorySegment struct) {
        return struct.get(progs$LAYOUT, 64L);
    }

    public static void progs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(progs$LAYOUT, 64L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_object_skeleton.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_object_skeleton.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_object_skeleton.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_object_skeleton.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_object_skeleton.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_object_skeleton.layout().byteSize() * elementCount, arena, cleanup);
    }
}

