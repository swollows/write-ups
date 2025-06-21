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

public class bpf_test_run_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("data_in"), Lib.C_POINTER.withName("data_out"), Lib.C_INT.withName("data_size_in"), Lib.C_INT.withName("data_size_out"), Lib.C_POINTER.withName("ctx_in"), Lib.C_POINTER.withName("ctx_out"), Lib.C_INT.withName("ctx_size_in"), Lib.C_INT.withName("ctx_size_out"), Lib.C_INT.withName("retval"), Lib.C_INT.withName("repeat"), Lib.C_INT.withName("duration"), Lib.C_INT.withName("flags"), Lib.C_INT.withName("cpu"), Lib.C_INT.withName("batch_size")}).withName("bpf_test_run_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout data_in$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_in")});
    private static final long data_in$OFFSET = 8L;
    private static final AddressLayout data_out$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_out")});
    private static final long data_out$OFFSET = 16L;
    private static final ValueLayout.OfInt data_size_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_size_in")});
    private static final long data_size_in$OFFSET = 24L;
    private static final ValueLayout.OfInt data_size_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_size_out")});
    private static final long data_size_out$OFFSET = 28L;
    private static final AddressLayout ctx_in$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctx_in")});
    private static final long ctx_in$OFFSET = 32L;
    private static final AddressLayout ctx_out$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctx_out")});
    private static final long ctx_out$OFFSET = 40L;
    private static final ValueLayout.OfInt ctx_size_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctx_size_in")});
    private static final long ctx_size_in$OFFSET = 48L;
    private static final ValueLayout.OfInt ctx_size_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctx_size_out")});
    private static final long ctx_size_out$OFFSET = 52L;
    private static final ValueLayout.OfInt retval$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"retval")});
    private static final long retval$OFFSET = 56L;
    private static final ValueLayout.OfInt repeat$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"repeat")});
    private static final long repeat$OFFSET = 60L;
    private static final ValueLayout.OfInt duration$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"duration")});
    private static final long duration$OFFSET = 64L;
    private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 68L;
    private static final ValueLayout.OfInt cpu$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cpu")});
    private static final long cpu$OFFSET = 72L;
    private static final ValueLayout.OfInt batch_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"batch_size")});
    private static final long batch_size$OFFSET = 76L;

    bpf_test_run_opts() {
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

    public static final AddressLayout data_in$layout() {
        return data_in$LAYOUT;
    }

    public static final long data_in$offset() {
        return 8L;
    }

    public static MemorySegment data_in(MemorySegment struct) {
        return struct.get(data_in$LAYOUT, 8L);
    }

    public static void data_in(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data_in$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout data_out$layout() {
        return data_out$LAYOUT;
    }

    public static final long data_out$offset() {
        return 16L;
    }

    public static MemorySegment data_out(MemorySegment struct) {
        return struct.get(data_out$LAYOUT, 16L);
    }

    public static void data_out(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data_out$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt data_size_in$layout() {
        return data_size_in$LAYOUT;
    }

    public static final long data_size_in$offset() {
        return 24L;
    }

    public static int data_size_in(MemorySegment struct) {
        return struct.get(data_size_in$LAYOUT, 24L);
    }

    public static void data_size_in(MemorySegment struct, int fieldValue) {
        struct.set(data_size_in$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt data_size_out$layout() {
        return data_size_out$LAYOUT;
    }

    public static final long data_size_out$offset() {
        return 28L;
    }

    public static int data_size_out(MemorySegment struct) {
        return struct.get(data_size_out$LAYOUT, 28L);
    }

    public static void data_size_out(MemorySegment struct, int fieldValue) {
        struct.set(data_size_out$LAYOUT, 28L, fieldValue);
    }

    public static final AddressLayout ctx_in$layout() {
        return ctx_in$LAYOUT;
    }

    public static final long ctx_in$offset() {
        return 32L;
    }

    public static MemorySegment ctx_in(MemorySegment struct) {
        return struct.get(ctx_in$LAYOUT, 32L);
    }

    public static void ctx_in(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ctx_in$LAYOUT, 32L, fieldValue);
    }

    public static final AddressLayout ctx_out$layout() {
        return ctx_out$LAYOUT;
    }

    public static final long ctx_out$offset() {
        return 40L;
    }

    public static MemorySegment ctx_out(MemorySegment struct) {
        return struct.get(ctx_out$LAYOUT, 40L);
    }

    public static void ctx_out(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ctx_out$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt ctx_size_in$layout() {
        return ctx_size_in$LAYOUT;
    }

    public static final long ctx_size_in$offset() {
        return 48L;
    }

    public static int ctx_size_in(MemorySegment struct) {
        return struct.get(ctx_size_in$LAYOUT, 48L);
    }

    public static void ctx_size_in(MemorySegment struct, int fieldValue) {
        struct.set(ctx_size_in$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt ctx_size_out$layout() {
        return ctx_size_out$LAYOUT;
    }

    public static final long ctx_size_out$offset() {
        return 52L;
    }

    public static int ctx_size_out(MemorySegment struct) {
        return struct.get(ctx_size_out$LAYOUT, 52L);
    }

    public static void ctx_size_out(MemorySegment struct, int fieldValue) {
        struct.set(ctx_size_out$LAYOUT, 52L, fieldValue);
    }

    public static final ValueLayout.OfInt retval$layout() {
        return retval$LAYOUT;
    }

    public static final long retval$offset() {
        return 56L;
    }

    public static int retval(MemorySegment struct) {
        return struct.get(retval$LAYOUT, 56L);
    }

    public static void retval(MemorySegment struct, int fieldValue) {
        struct.set(retval$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfInt repeat$layout() {
        return repeat$LAYOUT;
    }

    public static final long repeat$offset() {
        return 60L;
    }

    public static int repeat(MemorySegment struct) {
        return struct.get(repeat$LAYOUT, 60L);
    }

    public static void repeat(MemorySegment struct, int fieldValue) {
        struct.set(repeat$LAYOUT, 60L, fieldValue);
    }

    public static final ValueLayout.OfInt duration$layout() {
        return duration$LAYOUT;
    }

    public static final long duration$offset() {
        return 64L;
    }

    public static int duration(MemorySegment struct) {
        return struct.get(duration$LAYOUT, 64L);
    }

    public static void duration(MemorySegment struct, int fieldValue) {
        struct.set(duration$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 68L;
    }

    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 68L);
    }

    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, 68L, fieldValue);
    }

    public static final ValueLayout.OfInt cpu$layout() {
        return cpu$LAYOUT;
    }

    public static final long cpu$offset() {
        return 72L;
    }

    public static int cpu(MemorySegment struct) {
        return struct.get(cpu$LAYOUT, 72L);
    }

    public static void cpu(MemorySegment struct, int fieldValue) {
        struct.set(cpu$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt batch_size$layout() {
        return batch_size$LAYOUT;
    }

    public static final long batch_size$offset() {
        return 76L;
    }

    public static int batch_size(MemorySegment struct) {
        return struct.get(batch_size$LAYOUT, 76L);
    }

    public static void batch_size(MemorySegment struct, int fieldValue) {
        struct.set(batch_size$LAYOUT, 76L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_test_run_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_test_run_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_test_run_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_test_run_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_test_run_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_test_run_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

