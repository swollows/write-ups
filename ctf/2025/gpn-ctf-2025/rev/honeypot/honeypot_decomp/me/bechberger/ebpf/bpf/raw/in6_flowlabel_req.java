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
import me.bechberger.ebpf.bpf.raw.in6_addr;

public class in6_flowlabel_req {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in6_addr.layout().withName("flr_dst"), Lib.C_INT.withName("flr_label"), Lib.C_CHAR.withName("flr_action"), Lib.C_CHAR.withName("flr_share"), Lib.C_SHORT.withName("flr_flags"), Lib.C_SHORT.withName("flr_expires"), Lib.C_SHORT.withName("flr_linger"), Lib.C_INT.withName("__flr_pad")}).withName("in6_flowlabel_req");
    private static final GroupLayout flr_dst$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flr_dst")});
    private static final long flr_dst$OFFSET = 0L;
    private static final ValueLayout.OfInt flr_label$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flr_label")});
    private static final long flr_label$OFFSET = 16L;
    private static final ValueLayout.OfByte flr_action$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flr_action")});
    private static final long flr_action$OFFSET = 20L;
    private static final ValueLayout.OfByte flr_share$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flr_share")});
    private static final long flr_share$OFFSET = 21L;
    private static final ValueLayout.OfShort flr_flags$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flr_flags")});
    private static final long flr_flags$OFFSET = 22L;
    private static final ValueLayout.OfShort flr_expires$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flr_expires")});
    private static final long flr_expires$OFFSET = 24L;
    private static final ValueLayout.OfShort flr_linger$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flr_linger")});
    private static final long flr_linger$OFFSET = 26L;
    private static final ValueLayout.OfInt __flr_pad$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__flr_pad")});
    private static final long __flr_pad$OFFSET = 28L;

    in6_flowlabel_req() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout flr_dst$layout() {
        return flr_dst$LAYOUT;
    }

    public static final long flr_dst$offset() {
        return 0L;
    }

    public static MemorySegment flr_dst(MemorySegment struct) {
        return struct.asSlice(0L, flr_dst$LAYOUT.byteSize());
    }

    public static void flr_dst(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)flr_dst$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt flr_label$layout() {
        return flr_label$LAYOUT;
    }

    public static final long flr_label$offset() {
        return 16L;
    }

    public static int flr_label(MemorySegment struct) {
        return struct.get(flr_label$LAYOUT, 16L);
    }

    public static void flr_label(MemorySegment struct, int fieldValue) {
        struct.set(flr_label$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfByte flr_action$layout() {
        return flr_action$LAYOUT;
    }

    public static final long flr_action$offset() {
        return 20L;
    }

    public static byte flr_action(MemorySegment struct) {
        return struct.get(flr_action$LAYOUT, 20L);
    }

    public static void flr_action(MemorySegment struct, byte fieldValue) {
        struct.set(flr_action$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfByte flr_share$layout() {
        return flr_share$LAYOUT;
    }

    public static final long flr_share$offset() {
        return 21L;
    }

    public static byte flr_share(MemorySegment struct) {
        return struct.get(flr_share$LAYOUT, 21L);
    }

    public static void flr_share(MemorySegment struct, byte fieldValue) {
        struct.set(flr_share$LAYOUT, 21L, fieldValue);
    }

    public static final ValueLayout.OfShort flr_flags$layout() {
        return flr_flags$LAYOUT;
    }

    public static final long flr_flags$offset() {
        return 22L;
    }

    public static short flr_flags(MemorySegment struct) {
        return struct.get(flr_flags$LAYOUT, 22L);
    }

    public static void flr_flags(MemorySegment struct, short fieldValue) {
        struct.set(flr_flags$LAYOUT, 22L, fieldValue);
    }

    public static final ValueLayout.OfShort flr_expires$layout() {
        return flr_expires$LAYOUT;
    }

    public static final long flr_expires$offset() {
        return 24L;
    }

    public static short flr_expires(MemorySegment struct) {
        return struct.get(flr_expires$LAYOUT, 24L);
    }

    public static void flr_expires(MemorySegment struct, short fieldValue) {
        struct.set(flr_expires$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfShort flr_linger$layout() {
        return flr_linger$LAYOUT;
    }

    public static final long flr_linger$offset() {
        return 26L;
    }

    public static short flr_linger(MemorySegment struct) {
        return struct.get(flr_linger$LAYOUT, 26L);
    }

    public static void flr_linger(MemorySegment struct, short fieldValue) {
        struct.set(flr_linger$LAYOUT, 26L, fieldValue);
    }

    public static final ValueLayout.OfInt __flr_pad$layout() {
        return __flr_pad$LAYOUT;
    }

    public static final long __flr_pad$offset() {
        return 28L;
    }

    public static int __flr_pad(MemorySegment struct) {
        return struct.get(__flr_pad$LAYOUT, 28L);
    }

    public static void __flr_pad(MemorySegment struct, int fieldValue) {
        struct.set(__flr_pad$LAYOUT, 28L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(in6_flowlabel_req.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return in6_flowlabel_req.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)in6_flowlabel_req.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)in6_flowlabel_req.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return in6_flowlabel_req.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(in6_flowlabel_req.layout().byteSize() * elementCount, arena, cleanup);
    }
}

