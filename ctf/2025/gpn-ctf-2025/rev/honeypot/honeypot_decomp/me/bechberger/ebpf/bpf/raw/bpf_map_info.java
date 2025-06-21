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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_map_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("type"), Lib.C_INT.withName("id"), Lib.C_INT.withName("key_size"), Lib.C_INT.withName("value_size"), Lib.C_INT.withName("max_entries"), Lib.C_INT.withName("map_flags"), MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("name"), Lib.C_INT.withName("ifindex"), Lib.C_INT.withName("btf_vmlinux_value_type_id"), Lib.C_LONG_LONG.withName("netns_dev"), Lib.C_LONG_LONG.withName("netns_ino"), Lib.C_INT.withName("btf_id"), Lib.C_INT.withName("btf_key_type_id"), Lib.C_INT.withName("btf_value_type_id"), Lib.C_INT.withName("btf_vmlinux_id"), Lib.C_LONG_LONG.withName("map_extra")}).withName("bpf_map_info");
    private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 0L;
    private static final ValueLayout.OfInt id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"id")});
    private static final long id$OFFSET = 4L;
    private static final ValueLayout.OfInt key_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"key_size")});
    private static final long key_size$OFFSET = 8L;
    private static final ValueLayout.OfInt value_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"value_size")});
    private static final long value_size$OFFSET = 12L;
    private static final ValueLayout.OfInt max_entries$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"max_entries")});
    private static final long max_entries$OFFSET = 16L;
    private static final ValueLayout.OfInt map_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_flags")});
    private static final long map_flags$OFFSET = 20L;
    private static final SequenceLayout name$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name")});
    private static final long name$OFFSET = 24L;
    private static long[] name$DIMS = new long[]{16L};
    private static final VarHandle name$ELEM_HANDLE = name$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
    private static final long ifindex$OFFSET = 40L;
    private static final ValueLayout.OfInt btf_vmlinux_value_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_vmlinux_value_type_id")});
    private static final long btf_vmlinux_value_type_id$OFFSET = 44L;
    private static final ValueLayout.OfLong netns_dev$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"netns_dev")});
    private static final long netns_dev$OFFSET = 48L;
    private static final ValueLayout.OfLong netns_ino$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"netns_ino")});
    private static final long netns_ino$OFFSET = 56L;
    private static final ValueLayout.OfInt btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_id")});
    private static final long btf_id$OFFSET = 64L;
    private static final ValueLayout.OfInt btf_key_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_key_type_id")});
    private static final long btf_key_type_id$OFFSET = 68L;
    private static final ValueLayout.OfInt btf_value_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_value_type_id")});
    private static final long btf_value_type_id$OFFSET = 72L;
    private static final ValueLayout.OfInt btf_vmlinux_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_vmlinux_id")});
    private static final long btf_vmlinux_id$OFFSET = 76L;
    private static final ValueLayout.OfLong map_extra$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_extra")});
    private static final long map_extra$OFFSET = 80L;

    bpf_map_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 0L;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 0L);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt id$layout() {
        return id$LAYOUT;
    }

    public static final long id$offset() {
        return 4L;
    }

    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, 4L);
    }

    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt key_size$layout() {
        return key_size$LAYOUT;
    }

    public static final long key_size$offset() {
        return 8L;
    }

    public static int key_size(MemorySegment struct) {
        return struct.get(key_size$LAYOUT, 8L);
    }

    public static void key_size(MemorySegment struct, int fieldValue) {
        struct.set(key_size$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt value_size$layout() {
        return value_size$LAYOUT;
    }

    public static final long value_size$offset() {
        return 12L;
    }

    public static int value_size(MemorySegment struct) {
        return struct.get(value_size$LAYOUT, 12L);
    }

    public static void value_size(MemorySegment struct, int fieldValue) {
        struct.set(value_size$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt max_entries$layout() {
        return max_entries$LAYOUT;
    }

    public static final long max_entries$offset() {
        return 16L;
    }

    public static int max_entries(MemorySegment struct) {
        return struct.get(max_entries$LAYOUT, 16L);
    }

    public static void max_entries(MemorySegment struct, int fieldValue) {
        struct.set(max_entries$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt map_flags$layout() {
        return map_flags$LAYOUT;
    }

    public static final long map_flags$offset() {
        return 20L;
    }

    public static int map_flags(MemorySegment struct) {
        return struct.get(map_flags$LAYOUT, 20L);
    }

    public static void map_flags(MemorySegment struct, int fieldValue) {
        struct.set(map_flags$LAYOUT, 20L, fieldValue);
    }

    public static final SequenceLayout name$layout() {
        return name$LAYOUT;
    }

    public static final long name$offset() {
        return 24L;
    }

    public static MemorySegment name(MemorySegment struct) {
        return struct.asSlice(24L, name$LAYOUT.byteSize());
    }

    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)24L, (long)name$LAYOUT.byteSize());
    }

    public static long[] name$dimensions() {
        return name$DIMS;
    }

    public static byte name(MemorySegment struct, long index0) {
        return name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void name(MemorySegment struct, long index0, byte fieldValue) {
        name$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt ifindex$layout() {
        return ifindex$LAYOUT;
    }

    public static final long ifindex$offset() {
        return 40L;
    }

    public static int ifindex(MemorySegment struct) {
        return struct.get(ifindex$LAYOUT, 40L);
    }

    public static void ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ifindex$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_vmlinux_value_type_id$layout() {
        return btf_vmlinux_value_type_id$LAYOUT;
    }

    public static final long btf_vmlinux_value_type_id$offset() {
        return 44L;
    }

    public static int btf_vmlinux_value_type_id(MemorySegment struct) {
        return struct.get(btf_vmlinux_value_type_id$LAYOUT, 44L);
    }

    public static void btf_vmlinux_value_type_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_vmlinux_value_type_id$LAYOUT, 44L, fieldValue);
    }

    public static final ValueLayout.OfLong netns_dev$layout() {
        return netns_dev$LAYOUT;
    }

    public static final long netns_dev$offset() {
        return 48L;
    }

    public static long netns_dev(MemorySegment struct) {
        return struct.get(netns_dev$LAYOUT, 48L);
    }

    public static void netns_dev(MemorySegment struct, long fieldValue) {
        struct.set(netns_dev$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfLong netns_ino$layout() {
        return netns_ino$LAYOUT;
    }

    public static final long netns_ino$offset() {
        return 56L;
    }

    public static long netns_ino(MemorySegment struct) {
        return struct.get(netns_ino$LAYOUT, 56L);
    }

    public static void netns_ino(MemorySegment struct, long fieldValue) {
        struct.set(netns_ino$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_id$layout() {
        return btf_id$LAYOUT;
    }

    public static final long btf_id$offset() {
        return 64L;
    }

    public static int btf_id(MemorySegment struct) {
        return struct.get(btf_id$LAYOUT, 64L);
    }

    public static void btf_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_id$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_key_type_id$layout() {
        return btf_key_type_id$LAYOUT;
    }

    public static final long btf_key_type_id$offset() {
        return 68L;
    }

    public static int btf_key_type_id(MemorySegment struct) {
        return struct.get(btf_key_type_id$LAYOUT, 68L);
    }

    public static void btf_key_type_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_key_type_id$LAYOUT, 68L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_value_type_id$layout() {
        return btf_value_type_id$LAYOUT;
    }

    public static final long btf_value_type_id$offset() {
        return 72L;
    }

    public static int btf_value_type_id(MemorySegment struct) {
        return struct.get(btf_value_type_id$LAYOUT, 72L);
    }

    public static void btf_value_type_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_value_type_id$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_vmlinux_id$layout() {
        return btf_vmlinux_id$LAYOUT;
    }

    public static final long btf_vmlinux_id$offset() {
        return 76L;
    }

    public static int btf_vmlinux_id(MemorySegment struct) {
        return struct.get(btf_vmlinux_id$LAYOUT, 76L);
    }

    public static void btf_vmlinux_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_vmlinux_id$LAYOUT, 76L, fieldValue);
    }

    public static final ValueLayout.OfLong map_extra$layout() {
        return map_extra$LAYOUT;
    }

    public static final long map_extra$offset() {
        return 80L;
    }

    public static long map_extra(MemorySegment struct) {
        return struct.get(map_extra$LAYOUT, 80L);
    }

    public static void map_extra(MemorySegment struct, long fieldValue) {
        struct.set(map_extra$LAYOUT, 80L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_map_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_map_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_map_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_map_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_map_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_map_info.layout().byteSize() * elementCount, arena, cleanup);
    }
}

