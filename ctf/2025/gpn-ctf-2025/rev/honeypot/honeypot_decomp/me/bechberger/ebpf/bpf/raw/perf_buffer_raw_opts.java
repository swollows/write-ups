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

public class perf_buffer_raw_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("cpu_cnt"), MemoryLayout.paddingLayout((long)4L), Lib.C_POINTER.withName("cpus"), Lib.C_POINTER.withName("map_keys")}).withName("perf_buffer_raw_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt cpu_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cpu_cnt")});
    private static final long cpu_cnt$OFFSET = 8L;
    private static final AddressLayout cpus$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cpus")});
    private static final long cpus$OFFSET = 16L;
    private static final AddressLayout map_keys$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_keys")});
    private static final long map_keys$OFFSET = 24L;

    perf_buffer_raw_opts() {
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

    public static final ValueLayout.OfInt cpu_cnt$layout() {
        return cpu_cnt$LAYOUT;
    }

    public static final long cpu_cnt$offset() {
        return 8L;
    }

    public static int cpu_cnt(MemorySegment struct) {
        return struct.get(cpu_cnt$LAYOUT, 8L);
    }

    public static void cpu_cnt(MemorySegment struct, int fieldValue) {
        struct.set(cpu_cnt$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout cpus$layout() {
        return cpus$LAYOUT;
    }

    public static final long cpus$offset() {
        return 16L;
    }

    public static MemorySegment cpus(MemorySegment struct) {
        return struct.get(cpus$LAYOUT, 16L);
    }

    public static void cpus(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(cpus$LAYOUT, 16L, fieldValue);
    }

    public static final AddressLayout map_keys$layout() {
        return map_keys$LAYOUT;
    }

    public static final long map_keys$offset() {
        return 24L;
    }

    public static MemorySegment map_keys(MemorySegment struct) {
        return struct.get(map_keys$LAYOUT, 24L);
    }

    public static void map_keys(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(map_keys$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(perf_buffer_raw_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return perf_buffer_raw_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)perf_buffer_raw_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)perf_buffer_raw_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return perf_buffer_raw_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(perf_buffer_raw_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

