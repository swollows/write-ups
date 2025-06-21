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
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfShort
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

public class btf_header {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("magic"), Lib.C_CHAR.withName("version"), Lib.C_CHAR.withName("flags"), Lib.C_INT.withName("hdr_len"), Lib.C_INT.withName("type_off"), Lib.C_INT.withName("type_len"), Lib.C_INT.withName("str_off"), Lib.C_INT.withName("str_len")}).withName("btf_header");
    private static final ValueLayout.OfShort magic$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"magic")});
    private static final long magic$OFFSET = 0L;
    private static final ValueLayout.OfByte version$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"version")});
    private static final long version$OFFSET = 2L;
    private static final ValueLayout.OfByte flags$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 3L;
    private static final ValueLayout.OfInt hdr_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hdr_len")});
    private static final long hdr_len$OFFSET = 4L;
    private static final ValueLayout.OfInt type_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type_off")});
    private static final long type_off$OFFSET = 8L;
    private static final ValueLayout.OfInt type_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type_len")});
    private static final long type_len$OFFSET = 12L;
    private static final ValueLayout.OfInt str_off$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"str_off")});
    private static final long str_off$OFFSET = 16L;
    private static final ValueLayout.OfInt str_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"str_len")});
    private static final long str_len$OFFSET = 20L;

    btf_header() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort magic$layout() {
        return magic$LAYOUT;
    }

    public static final long magic$offset() {
        return 0L;
    }

    public static short magic(MemorySegment struct) {
        return struct.get(magic$LAYOUT, 0L);
    }

    public static void magic(MemorySegment struct, short fieldValue) {
        struct.set(magic$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte version$layout() {
        return version$LAYOUT;
    }

    public static final long version$offset() {
        return 2L;
    }

    public static byte version(MemorySegment struct) {
        return struct.get(version$LAYOUT, 2L);
    }

    public static void version(MemorySegment struct, byte fieldValue) {
        struct.set(version$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfByte flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 3L;
    }

    public static byte flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 3L);
    }

    public static void flags(MemorySegment struct, byte fieldValue) {
        struct.set(flags$LAYOUT, 3L, fieldValue);
    }

    public static final ValueLayout.OfInt hdr_len$layout() {
        return hdr_len$LAYOUT;
    }

    public static final long hdr_len$offset() {
        return 4L;
    }

    public static int hdr_len(MemorySegment struct) {
        return struct.get(hdr_len$LAYOUT, 4L);
    }

    public static void hdr_len(MemorySegment struct, int fieldValue) {
        struct.set(hdr_len$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt type_off$layout() {
        return type_off$LAYOUT;
    }

    public static final long type_off$offset() {
        return 8L;
    }

    public static int type_off(MemorySegment struct) {
        return struct.get(type_off$LAYOUT, 8L);
    }

    public static void type_off(MemorySegment struct, int fieldValue) {
        struct.set(type_off$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt type_len$layout() {
        return type_len$LAYOUT;
    }

    public static final long type_len$offset() {
        return 12L;
    }

    public static int type_len(MemorySegment struct) {
        return struct.get(type_len$LAYOUT, 12L);
    }

    public static void type_len(MemorySegment struct, int fieldValue) {
        struct.set(type_len$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt str_off$layout() {
        return str_off$LAYOUT;
    }

    public static final long str_off$offset() {
        return 16L;
    }

    public static int str_off(MemorySegment struct) {
        return struct.get(str_off$LAYOUT, 16L);
    }

    public static void str_off(MemorySegment struct, int fieldValue) {
        struct.set(str_off$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt str_len$layout() {
        return str_len$LAYOUT;
    }

    public static final long str_len$offset() {
        return 20L;
    }

    public static int str_len(MemorySegment struct) {
        return struct.get(str_len$LAYOUT, 20L);
    }

    public static void str_len(MemorySegment struct, int fieldValue) {
        struct.set(str_len$LAYOUT, 20L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(btf_header.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return btf_header.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)btf_header.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)btf_header.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return btf_header.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(btf_header.layout().byteSize() * elementCount, arena, cleanup);
    }
}

