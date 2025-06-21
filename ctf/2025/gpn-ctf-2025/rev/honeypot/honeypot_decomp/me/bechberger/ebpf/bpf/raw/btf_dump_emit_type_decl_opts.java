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

public class btf_dump_emit_type_decl_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("field_name"), Lib.C_INT.withName("indent_level"), Lib.C_BOOL.withName("strip_mods"), MemoryLayout.paddingLayout((long)3L)}).withName("btf_dump_emit_type_decl_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout field_name$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"field_name")});
    private static final long field_name$OFFSET = 8L;
    private static final ValueLayout.OfInt indent_level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"indent_level")});
    private static final long indent_level$OFFSET = 16L;
    private static final ValueLayout.OfBoolean strip_mods$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"strip_mods")});
    private static final long strip_mods$OFFSET = 20L;

    btf_dump_emit_type_decl_opts() {
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

    public static final AddressLayout field_name$layout() {
        return field_name$LAYOUT;
    }

    public static final long field_name$offset() {
        return 8L;
    }

    public static MemorySegment field_name(MemorySegment struct) {
        return struct.get(field_name$LAYOUT, 8L);
    }

    public static void field_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(field_name$LAYOUT, 8L, fieldValue);
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

    public static final ValueLayout.OfBoolean strip_mods$layout() {
        return strip_mods$LAYOUT;
    }

    public static final long strip_mods$offset() {
        return 20L;
    }

    public static boolean strip_mods(MemorySegment struct) {
        return struct.get(strip_mods$LAYOUT, 20L);
    }

    public static void strip_mods(MemorySegment struct, boolean fieldValue) {
        struct.set(strip_mods$LAYOUT, 20L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(btf_dump_emit_type_decl_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return btf_dump_emit_type_decl_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)btf_dump_emit_type_decl_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)btf_dump_emit_type_decl_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return btf_dump_emit_type_decl_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(btf_dump_emit_type_decl_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

