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
 *  java.lang.foreign.ValueLayout$OfBoolean
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

public class btf_dump_type_data_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("indent_str"), Lib.C_INT.withName("indent_level"), Lib.C_BOOL.withName("compact"), Lib.C_BOOL.withName("skip_names"), Lib.C_BOOL.withName("emit_zeroes"), MemoryLayout.paddingLayout((long)1L)}).withName("btf_dump_type_data_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout indent_str$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"indent_str")});
    private static final long indent_str$OFFSET = 8L;
    private static final ValueLayout.OfInt indent_level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"indent_level")});
    private static final long indent_level$OFFSET = 16L;
    private static final ValueLayout.OfBoolean compact$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"compact")});
    private static final long compact$OFFSET = 20L;
    private static final ValueLayout.OfBoolean skip_names$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"skip_names")});
    private static final long skip_names$OFFSET = 21L;
    private static final ValueLayout.OfBoolean emit_zeroes$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"emit_zeroes")});
    private static final long emit_zeroes$OFFSET = 22L;

    btf_dump_type_data_opts() {
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

    public static final AddressLayout indent_str$layout() {
        return indent_str$LAYOUT;
    }

    public static final long indent_str$offset() {
        return 8L;
    }

    public static MemorySegment indent_str(MemorySegment struct) {
        return struct.get(indent_str$LAYOUT, 8L);
    }

    public static void indent_str(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(indent_str$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt indent_level$layout() {
        return indent_level$LAYOUT;
    }

    public static final long indent_level$offset() {
        return 16L;
    }

    public static int indent_level(MemorySegment struct) {
        return struct.get(indent_level$LAYOUT, 16L);
    }

    public static void indent_level(MemorySegment struct, int fieldValue) {
        struct.set(indent_level$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfBoolean compact$layout() {
        return compact$LAYOUT;
    }

    public static final long compact$offset() {
        return 20L;
    }

    public static boolean compact(MemorySegment struct) {
        return struct.get(compact$LAYOUT, 20L);
    }

    public static void compact(MemorySegment struct, boolean fieldValue) {
        struct.set(compact$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfBoolean skip_names$layout() {
        return skip_names$LAYOUT;
    }

    public static final long skip_names$offset() {
        return 21L;
    }

    public static boolean skip_names(MemorySegment struct) {
        return struct.get(skip_names$LAYOUT, 21L);
    }

    public static void skip_names(MemorySegment struct, boolean fieldValue) {
        struct.set(skip_names$LAYOUT, 21L, fieldValue);
    }

    public static final ValueLayout.OfBoolean emit_zeroes$layout() {
        return emit_zeroes$LAYOUT;
    }

    public static final long emit_zeroes$offset() {
        return 22L;
    }

    public static boolean emit_zeroes(MemorySegment struct) {
        return struct.get(emit_zeroes$LAYOUT, 22L);
    }

    public static void emit_zeroes(MemorySegment struct, boolean fieldValue) {
        struct.set(emit_zeroes$LAYOUT, 22L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(btf_dump_type_data_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return btf_dump_type_data_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)btf_dump_type_data_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)btf_dump_type_data_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return btf_dump_type_data_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(btf_dump_type_data_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

