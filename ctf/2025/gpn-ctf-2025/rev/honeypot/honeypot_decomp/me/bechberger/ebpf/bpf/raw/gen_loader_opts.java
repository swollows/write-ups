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

public class gen_loader_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("data"), Lib.C_POINTER.withName("insns"), Lib.C_INT.withName("data_sz"), Lib.C_INT.withName("insns_sz")}).withName("gen_loader_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data")});
    private static final long data$OFFSET = 8L;
    private static final AddressLayout insns$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"insns")});
    private static final long insns$OFFSET = 16L;
    private static final ValueLayout.OfInt data_sz$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_sz")});
    private static final long data_sz$OFFSET = 24L;
    private static final ValueLayout.OfInt insns_sz$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"insns_sz")});
    private static final long insns_sz$OFFSET = 28L;

    gen_loader_opts() {
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

    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    public static final long data$offset() {
        return 8L;
    }

    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, 8L);
    }

    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout insns$layout() {
        return insns$LAYOUT;
    }

    public static final long insns$offset() {
        return 16L;
    }

    public static MemorySegment insns(MemorySegment struct) {
        return struct.get(insns$LAYOUT, 16L);
    }

    public static void insns(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(insns$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt data_sz$layout() {
        return data_sz$LAYOUT;
    }

    public static final long data_sz$offset() {
        return 24L;
    }

    public static int data_sz(MemorySegment struct) {
        return struct.get(data_sz$LAYOUT, 24L);
    }

    public static void data_sz(MemorySegment struct, int fieldValue) {
        struct.set(data_sz$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt insns_sz$layout() {
        return insns_sz$LAYOUT;
    }

    public static final long insns_sz$offset() {
        return 28L;
    }

    public static int insns_sz(MemorySegment struct) {
        return struct.get(insns_sz$LAYOUT, 28L);
    }

    public static void insns_sz(MemorySegment struct, int fieldValue) {
        struct.set(insns_sz$LAYOUT, 28L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(gen_loader_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return gen_loader_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)gen_loader_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)gen_loader_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return gen_loader_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(gen_loader_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

