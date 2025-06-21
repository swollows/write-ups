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
 *  java.lang.foreign.ValueLayout$OfLong
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

public class ip_iptfs_cc_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("subtype"), Lib.C_CHAR.withName("flags"), Lib.C_SHORT.withName("block_offset"), Lib.C_INT.withName("loss_rate"), Lib.C_LONG_LONG.withName("rtt_adelay_xdelay"), Lib.C_INT.withName("tval"), Lib.C_INT.withName("techo")}).withName("ip_iptfs_cc_hdr");
    private static final ValueLayout.OfByte subtype$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"subtype")});
    private static final long subtype$OFFSET = 0L;
    private static final ValueLayout.OfByte flags$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 1L;
    private static final ValueLayout.OfShort block_offset$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"block_offset")});
    private static final long block_offset$OFFSET = 2L;
    private static final ValueLayout.OfInt loss_rate$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"loss_rate")});
    private static final long loss_rate$OFFSET = 4L;
    private static final ValueLayout.OfLong rtt_adelay_xdelay$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rtt_adelay_xdelay")});
    private static final long rtt_adelay_xdelay$OFFSET = 8L;
    private static final ValueLayout.OfInt tval$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tval")});
    private static final long tval$OFFSET = 16L;
    private static final ValueLayout.OfInt techo$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"techo")});
    private static final long techo$OFFSET = 20L;

    ip_iptfs_cc_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte subtype$layout() {
        return subtype$LAYOUT;
    }

    public static final long subtype$offset() {
        return 0L;
    }

    public static byte subtype(MemorySegment struct) {
        return struct.get(subtype$LAYOUT, 0L);
    }

    public static void subtype(MemorySegment struct, byte fieldValue) {
        struct.set(subtype$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 1L;
    }

    public static byte flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 1L);
    }

    public static void flags(MemorySegment struct, byte fieldValue) {
        struct.set(flags$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfShort block_offset$layout() {
        return block_offset$LAYOUT;
    }

    public static final long block_offset$offset() {
        return 2L;
    }

    public static short block_offset(MemorySegment struct) {
        return struct.get(block_offset$LAYOUT, 2L);
    }

    public static void block_offset(MemorySegment struct, short fieldValue) {
        struct.set(block_offset$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfInt loss_rate$layout() {
        return loss_rate$LAYOUT;
    }

    public static final long loss_rate$offset() {
        return 4L;
    }

    public static int loss_rate(MemorySegment struct) {
        return struct.get(loss_rate$LAYOUT, 4L);
    }

    public static void loss_rate(MemorySegment struct, int fieldValue) {
        struct.set(loss_rate$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfLong rtt_adelay_xdelay$layout() {
        return rtt_adelay_xdelay$LAYOUT;
    }

    public static final long rtt_adelay_xdelay$offset() {
        return 8L;
    }

    public static long rtt_adelay_xdelay(MemorySegment struct) {
        return struct.get(rtt_adelay_xdelay$LAYOUT, 8L);
    }

    public static void rtt_adelay_xdelay(MemorySegment struct, long fieldValue) {
        struct.set(rtt_adelay_xdelay$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt tval$layout() {
        return tval$LAYOUT;
    }

    public static final long tval$offset() {
        return 16L;
    }

    public static int tval(MemorySegment struct) {
        return struct.get(tval$LAYOUT, 16L);
    }

    public static void tval(MemorySegment struct, int fieldValue) {
        struct.set(tval$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt techo$layout() {
        return techo$LAYOUT;
    }

    public static final long techo$offset() {
        return 20L;
    }

    public static int techo(MemorySegment struct) {
        return struct.get(techo$LAYOUT, 20L);
    }

    public static void techo(MemorySegment struct, int fieldValue) {
        struct.set(techo$LAYOUT, 20L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ip_iptfs_cc_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ip_iptfs_cc_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ip_iptfs_cc_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip_iptfs_cc_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ip_iptfs_cc_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ip_iptfs_cc_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

