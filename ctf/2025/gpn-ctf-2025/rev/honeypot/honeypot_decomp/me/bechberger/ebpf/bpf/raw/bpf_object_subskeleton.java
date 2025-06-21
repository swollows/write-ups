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

public class bpf_object_subskeleton {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("obj"), Lib.C_INT.withName("map_cnt"), Lib.C_INT.withName("map_skel_sz"), Lib.C_POINTER.withName("maps"), Lib.C_INT.withName("prog_cnt"), Lib.C_INT.withName("prog_skel_sz"), Lib.C_POINTER.withName("progs"), Lib.C_INT.withName("var_cnt"), Lib.C_INT.withName("var_skel_sz"), Lib.C_POINTER.withName("vars")}).withName("bpf_object_subskeleton");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout obj$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"obj")});
    private static final long obj$OFFSET = 8L;
    private static final ValueLayout.OfInt map_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_cnt")});
    private static final long map_cnt$OFFSET = 16L;
    private static final ValueLayout.OfInt map_skel_sz$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_skel_sz")});
    private static final long map_skel_sz$OFFSET = 20L;
    private static final AddressLayout maps$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"maps")});
    private static final long maps$OFFSET = 24L;
    private static final ValueLayout.OfInt prog_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_cnt")});
    private static final long prog_cnt$OFFSET = 32L;
    private static final ValueLayout.OfInt prog_skel_sz$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_skel_sz")});
    private static final long prog_skel_sz$OFFSET = 36L;
    private static final AddressLayout progs$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"progs")});
    private static final long progs$OFFSET = 40L;
    private static final ValueLayout.OfInt var_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"var_cnt")});
    private static final long var_cnt$OFFSET = 48L;
    private static final ValueLayout.OfInt var_skel_sz$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"var_skel_sz")});
    private static final long var_skel_sz$OFFSET = 52L;
    private static final AddressLayout vars$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"vars")});
    private static final long vars$OFFSET = 56L;

    bpf_object_subskeleton() {
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

    public static final AddressLayout obj$layout() {
        return obj$LAYOUT;
    }

    public static final long obj$offset() {
        return 8L;
    }

    public static MemorySegment obj(MemorySegment struct) {
        return struct.get(obj$LAYOUT, 8L);
    }

    public static void obj(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(obj$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt map_cnt$layout() {
        return map_cnt$LAYOUT;
    }

    public static final long map_cnt$offset() {
        return 16L;
    }

    public static int map_cnt(MemorySegment struct) {
        return struct.get(map_cnt$LAYOUT, 16L);
    }

    public static void map_cnt(MemorySegment struct, int fieldValue) {
        struct.set(map_cnt$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt map_skel_sz$layout() {
        return map_skel_sz$LAYOUT;
    }

    public static final long map_skel_sz$offset() {
        return 20L;
    }

    public static int map_skel_sz(MemorySegment struct) {
        return struct.get(map_skel_sz$LAYOUT, 20L);
    }

    public static void map_skel_sz(MemorySegment struct, int fieldValue) {
        struct.set(map_skel_sz$LAYOUT, 20L, fieldValue);
    }

    public static final AddressLayout maps$layout() {
        return maps$LAYOUT;
    }

    public static final long maps$offset() {
        return 24L;
    }

    public static MemorySegment maps(MemorySegment struct) {
        return struct.get(maps$LAYOUT, 24L);
    }

    public static void maps(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(maps$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_cnt$layout() {
        return prog_cnt$LAYOUT;
    }

    public static final long prog_cnt$offset() {
        return 32L;
    }

    public static int prog_cnt(MemorySegment struct) {
        return struct.get(prog_cnt$LAYOUT, 32L);
    }

    public static void prog_cnt(MemorySegment struct, int fieldValue) {
        struct.set(prog_cnt$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_skel_sz$layout() {
        return prog_skel_sz$LAYOUT;
    }

    public static final long prog_skel_sz$offset() {
        return 36L;
    }

    public static int prog_skel_sz(MemorySegment struct) {
        return struct.get(prog_skel_sz$LAYOUT, 36L);
    }

    public static void prog_skel_sz(MemorySegment struct, int fieldValue) {
        struct.set(prog_skel_sz$LAYOUT, 36L, fieldValue);
    }

    public static final AddressLayout progs$layout() {
        return progs$LAYOUT;
    }

    public static final long progs$offset() {
        return 40L;
    }

    public static MemorySegment progs(MemorySegment struct) {
        return struct.get(progs$LAYOUT, 40L);
    }

    public static void progs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(progs$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt var_cnt$layout() {
        return var_cnt$LAYOUT;
    }

    public static final long var_cnt$offset() {
        return 48L;
    }

    public static int var_cnt(MemorySegment struct) {
        return struct.get(var_cnt$LAYOUT, 48L);
    }

    public static void var_cnt(MemorySegment struct, int fieldValue) {
        struct.set(var_cnt$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt var_skel_sz$layout() {
        return var_skel_sz$LAYOUT;
    }

    public static final long var_skel_sz$offset() {
        return 52L;
    }

    public static int var_skel_sz(MemorySegment struct) {
        return struct.get(var_skel_sz$LAYOUT, 52L);
    }

    public static void var_skel_sz(MemorySegment struct, int fieldValue) {
        struct.set(var_skel_sz$LAYOUT, 52L, fieldValue);
    }

    public static final AddressLayout vars$layout() {
        return vars$LAYOUT;
    }

    public static final long vars$offset() {
        return 56L;
    }

    public static MemorySegment vars(MemorySegment struct) {
        return struct.get(vars$LAYOUT, 56L);
    }

    public static void vars(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(vars$LAYOUT, 56L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_object_subskeleton.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_object_subskeleton.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_object_subskeleton.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_object_subskeleton.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_object_subskeleton.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_object_subskeleton.layout().byteSize() * elementCount, arena, cleanup);
    }
}

