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

public class bpf_btf_load_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("log_buf"), Lib.C_INT.withName("log_level"), Lib.C_INT.withName("log_size"), Lib.C_INT.withName("log_true_size"), Lib.C_INT.withName("btf_flags"), Lib.C_INT.withName("token_fd"), MemoryLayout.paddingLayout((long)4L)}).withName("bpf_btf_load_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout log_buf$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"log_buf")});
    private static final long log_buf$OFFSET = 8L;
    private static final ValueLayout.OfInt log_level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"log_level")});
    private static final long log_level$OFFSET = 16L;
    private static final ValueLayout.OfInt log_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"log_size")});
    private static final long log_size$OFFSET = 20L;
    private static final ValueLayout.OfInt log_true_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"log_true_size")});
    private static final long log_true_size$OFFSET = 24L;
    private static final ValueLayout.OfInt btf_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_flags")});
    private static final long btf_flags$OFFSET = 28L;
    private static final ValueLayout.OfInt token_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"token_fd")});
    private static final long token_fd$OFFSET = 32L;

    bpf_btf_load_opts() {
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

    public static final AddressLayout log_buf$layout() {
        return log_buf$LAYOUT;
    }

    public static final long log_buf$offset() {
        return 8L;
    }

    public static MemorySegment log_buf(MemorySegment struct) {
        return struct.get(log_buf$LAYOUT, 8L);
    }

    public static void log_buf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(log_buf$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt log_level$layout() {
        return log_level$LAYOUT;
    }

    public static final long log_level$offset() {
        return 16L;
    }

    public static int log_level(MemorySegment struct) {
        return struct.get(log_level$LAYOUT, 16L);
    }

    public static void log_level(MemorySegment struct, int fieldValue) {
        struct.set(log_level$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt log_size$layout() {
        return log_size$LAYOUT;
    }

    public static final long log_size$offset() {
        return 20L;
    }

    public static int log_size(MemorySegment struct) {
        return struct.get(log_size$LAYOUT, 20L);
    }

    public static void log_size(MemorySegment struct, int fieldValue) {
        struct.set(log_size$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt log_true_size$layout() {
        return log_true_size$LAYOUT;
    }

    public static final long log_true_size$offset() {
        return 24L;
    }

    public static int log_true_size(MemorySegment struct) {
        return struct.get(log_true_size$LAYOUT, 24L);
    }

    public static void log_true_size(MemorySegment struct, int fieldValue) {
        struct.set(log_true_size$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_flags$layout() {
        return btf_flags$LAYOUT;
    }

    public static final long btf_flags$offset() {
        return 28L;
    }

    public static int btf_flags(MemorySegment struct) {
        return struct.get(btf_flags$LAYOUT, 28L);
    }

    public static void btf_flags(MemorySegment struct, int fieldValue) {
        struct.set(btf_flags$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt token_fd$layout() {
        return token_fd$LAYOUT;
    }

    public static final long token_fd$offset() {
        return 32L;
    }

    public static int token_fd(MemorySegment struct) {
        return struct.get(token_fd$LAYOUT, 32L);
    }

    public static void token_fd(MemorySegment struct, int fieldValue) {
        struct.set(token_fd$LAYOUT, 32L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_btf_load_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_btf_load_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_btf_load_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_btf_load_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_btf_load_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_btf_load_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

