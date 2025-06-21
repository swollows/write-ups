/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
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

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_map_create_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("btf_fd"), Lib.C_INT.withName("btf_key_type_id"), Lib.C_INT.withName("btf_value_type_id"), Lib.C_INT.withName("btf_vmlinux_value_type_id"), Lib.C_INT.withName("inner_map_fd"), Lib.C_INT.withName("map_flags"), Lib.C_LONG_LONG.withName("map_extra"), Lib.C_INT.withName("numa_node"), Lib.C_INT.withName("map_ifindex"), Lib.C_INT.withName("value_type_btf_obj_fd"), Lib.C_INT.withName("token_fd")}).withName("bpf_map_create_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt btf_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_fd")});
    private static final long btf_fd$OFFSET = 8L;
    private static final ValueLayout.OfInt btf_key_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_key_type_id")});
    private static final long btf_key_type_id$OFFSET = 12L;
    private static final ValueLayout.OfInt btf_value_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_value_type_id")});
    private static final long btf_value_type_id$OFFSET = 16L;
    private static final ValueLayout.OfInt btf_vmlinux_value_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_vmlinux_value_type_id")});
    private static final long btf_vmlinux_value_type_id$OFFSET = 20L;
    private static final ValueLayout.OfInt inner_map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"inner_map_fd")});
    private static final long inner_map_fd$OFFSET = 24L;
    private static final ValueLayout.OfInt map_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_flags")});
    private static final long map_flags$OFFSET = 28L;
    private static final ValueLayout.OfLong map_extra$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_extra")});
    private static final long map_extra$OFFSET = 32L;
    private static final ValueLayout.OfInt numa_node$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"numa_node")});
    private static final long numa_node$OFFSET = 40L;
    private static final ValueLayout.OfInt map_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_ifindex")});
    private static final long map_ifindex$OFFSET = 44L;
    private static final ValueLayout.OfInt value_type_btf_obj_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"value_type_btf_obj_fd")});
    private static final long value_type_btf_obj_fd$OFFSET = 48L;
    private static final ValueLayout.OfInt token_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"token_fd")});
    private static final long token_fd$OFFSET = 52L;

    bpf_map_create_opts() {
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

    public static final ValueLayout.OfInt btf_fd$layout() {
        return btf_fd$LAYOUT;
    }

    public static final long btf_fd$offset() {
        return 8L;
    }

    public static int btf_fd(MemorySegment struct) {
        return struct.get(btf_fd$LAYOUT, 8L);
    }

    public static void btf_fd(MemorySegment struct, int fieldValue) {
        struct.set(btf_fd$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_key_type_id$layout() {
        return btf_key_type_id$LAYOUT;
    }

    public static final long btf_key_type_id$offset() {
        return 12L;
    }

    public static int btf_key_type_id(MemorySegment struct) {
        return struct.get(btf_key_type_id$LAYOUT, 12L);
    }

    public static void btf_key_type_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_key_type_id$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_value_type_id$layout() {
        return btf_value_type_id$LAYOUT;
    }

    public static final long btf_value_type_id$offset() {
        return 16L;
    }

    public static int btf_value_type_id(MemorySegment struct) {
        return struct.get(btf_value_type_id$LAYOUT, 16L);
    }

    public static void btf_value_type_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_value_type_id$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_vmlinux_value_type_id$layout() {
        return btf_vmlinux_value_type_id$LAYOUT;
    }

    public static final long btf_vmlinux_value_type_id$offset() {
        return 20L;
    }

    public static int btf_vmlinux_value_type_id(MemorySegment struct) {
        return struct.get(btf_vmlinux_value_type_id$LAYOUT, 20L);
    }

    public static void btf_vmlinux_value_type_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_vmlinux_value_type_id$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt inner_map_fd$layout() {
        return inner_map_fd$LAYOUT;
    }

    public static final long inner_map_fd$offset() {
        return 24L;
    }

    public static int inner_map_fd(MemorySegment struct) {
        return struct.get(inner_map_fd$LAYOUT, 24L);
    }

    public static void inner_map_fd(MemorySegment struct, int fieldValue) {
        struct.set(inner_map_fd$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt map_flags$layout() {
        return map_flags$LAYOUT;
    }

    public static final long map_flags$offset() {
        return 28L;
    }

    public static int map_flags(MemorySegment struct) {
        return struct.get(map_flags$LAYOUT, 28L);
    }

    public static void map_flags(MemorySegment struct, int fieldValue) {
        struct.set(map_flags$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfLong map_extra$layout() {
        return map_extra$LAYOUT;
    }

    public static final long map_extra$offset() {
        return 32L;
    }

    public static long map_extra(MemorySegment struct) {
        return struct.get(map_extra$LAYOUT, 32L);
    }

    public static void map_extra(MemorySegment struct, long fieldValue) {
        struct.set(map_extra$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt numa_node$layout() {
        return numa_node$LAYOUT;
    }

    public static final long numa_node$offset() {
        return 40L;
    }

    public static int numa_node(MemorySegment struct) {
        return struct.get(numa_node$LAYOUT, 40L);
    }

    public static void numa_node(MemorySegment struct, int fieldValue) {
        struct.set(numa_node$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt map_ifindex$layout() {
        return map_ifindex$LAYOUT;
    }

    public static final long map_ifindex$offset() {
        return 44L;
    }

    public static int map_ifindex(MemorySegment struct) {
        return struct.get(map_ifindex$LAYOUT, 44L);
    }

    public static void map_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(map_ifindex$LAYOUT, 44L, fieldValue);
    }

    public static final ValueLayout.OfInt value_type_btf_obj_fd$layout() {
        return value_type_btf_obj_fd$LAYOUT;
    }

    public static final long value_type_btf_obj_fd$offset() {
        return 48L;
    }

    public static int value_type_btf_obj_fd(MemorySegment struct) {
        return struct.get(value_type_btf_obj_fd$LAYOUT, 48L);
    }

    public static void value_type_btf_obj_fd(MemorySegment struct, int fieldValue) {
        struct.set(value_type_btf_obj_fd$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt token_fd$layout() {
        return token_fd$LAYOUT;
    }

    public static final long token_fd$offset() {
        return 52L;
    }

    public static int token_fd(MemorySegment struct) {
        return struct.get(token_fd$LAYOUT, 52L);
    }

    public static void token_fd(MemorySegment struct, int fieldValue) {
        struct.set(token_fd$LAYOUT, 52L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_map_create_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_map_create_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_map_create_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_map_create_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_map_create_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_map_create_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

