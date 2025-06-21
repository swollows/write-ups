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

public class tcp_ao_info_opt {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.paddingLayout((long)4L), Lib.C_SHORT.withName("reserved2"), Lib.C_CHAR.withName("current_key"), Lib.C_CHAR.withName("rnext"), Lib.C_LONG_LONG.withName("pkt_good"), Lib.C_LONG_LONG.withName("pkt_bad"), Lib.C_LONG_LONG.withName("pkt_key_not_found"), Lib.C_LONG_LONG.withName("pkt_ao_required"), Lib.C_LONG_LONG.withName("pkt_dropped_icmp")}).withName("tcp_ao_info_opt");
    private static final ValueLayout.OfShort reserved2$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reserved2")});
    private static final long reserved2$OFFSET = 4L;
    private static final ValueLayout.OfByte current_key$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"current_key")});
    private static final long current_key$OFFSET = 6L;
    private static final ValueLayout.OfByte rnext$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rnext")});
    private static final long rnext$OFFSET = 7L;
    private static final ValueLayout.OfLong pkt_good$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pkt_good")});
    private static final long pkt_good$OFFSET = 8L;
    private static final ValueLayout.OfLong pkt_bad$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pkt_bad")});
    private static final long pkt_bad$OFFSET = 16L;
    private static final ValueLayout.OfLong pkt_key_not_found$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pkt_key_not_found")});
    private static final long pkt_key_not_found$OFFSET = 24L;
    private static final ValueLayout.OfLong pkt_ao_required$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pkt_ao_required")});
    private static final long pkt_ao_required$OFFSET = 32L;
    private static final ValueLayout.OfLong pkt_dropped_icmp$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pkt_dropped_icmp")});
    private static final long pkt_dropped_icmp$OFFSET = 40L;

    tcp_ao_info_opt() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort reserved2$layout() {
        return reserved2$LAYOUT;
    }

    public static final long reserved2$offset() {
        return 4L;
    }

    public static short reserved2(MemorySegment struct) {
        return struct.get(reserved2$LAYOUT, 4L);
    }

    public static void reserved2(MemorySegment struct, short fieldValue) {
        struct.set(reserved2$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfByte current_key$layout() {
        return current_key$LAYOUT;
    }

    public static final long current_key$offset() {
        return 6L;
    }

    public static byte current_key(MemorySegment struct) {
        return struct.get(current_key$LAYOUT, 6L);
    }

    public static void current_key(MemorySegment struct, byte fieldValue) {
        struct.set(current_key$LAYOUT, 6L, fieldValue);
    }

    public static final ValueLayout.OfByte rnext$layout() {
        return rnext$LAYOUT;
    }

    public static final long rnext$offset() {
        return 7L;
    }

    public static byte rnext(MemorySegment struct) {
        return struct.get(rnext$LAYOUT, 7L);
    }

    public static void rnext(MemorySegment struct, byte fieldValue) {
        struct.set(rnext$LAYOUT, 7L, fieldValue);
    }

    public static final ValueLayout.OfLong pkt_good$layout() {
        return pkt_good$LAYOUT;
    }

    public static final long pkt_good$offset() {
        return 8L;
    }

    public static long pkt_good(MemorySegment struct) {
        return struct.get(pkt_good$LAYOUT, 8L);
    }

    public static void pkt_good(MemorySegment struct, long fieldValue) {
        struct.set(pkt_good$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfLong pkt_bad$layout() {
        return pkt_bad$LAYOUT;
    }

    public static final long pkt_bad$offset() {
        return 16L;
    }

    public static long pkt_bad(MemorySegment struct) {
        return struct.get(pkt_bad$LAYOUT, 16L);
    }

    public static void pkt_bad(MemorySegment struct, long fieldValue) {
        struct.set(pkt_bad$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfLong pkt_key_not_found$layout() {
        return pkt_key_not_found$LAYOUT;
    }

    public static final long pkt_key_not_found$offset() {
        return 24L;
    }

    public static long pkt_key_not_found(MemorySegment struct) {
        return struct.get(pkt_key_not_found$LAYOUT, 24L);
    }

    public static void pkt_key_not_found(MemorySegment struct, long fieldValue) {
        struct.set(pkt_key_not_found$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfLong pkt_ao_required$layout() {
        return pkt_ao_required$LAYOUT;
    }

    public static final long pkt_ao_required$offset() {
        return 32L;
    }

    public static long pkt_ao_required(MemorySegment struct) {
        return struct.get(pkt_ao_required$LAYOUT, 32L);
    }

    public static void pkt_ao_required(MemorySegment struct, long fieldValue) {
        struct.set(pkt_ao_required$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfLong pkt_dropped_icmp$layout() {
        return pkt_dropped_icmp$LAYOUT;
    }

    public static final long pkt_dropped_icmp$offset() {
        return 40L;
    }

    public static long pkt_dropped_icmp(MemorySegment struct) {
        return struct.get(pkt_dropped_icmp$LAYOUT, 40L);
    }

    public static void pkt_dropped_icmp(MemorySegment struct, long fieldValue) {
        struct.set(pkt_dropped_icmp$LAYOUT, 40L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_ao_info_opt.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_ao_info_opt.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_ao_info_opt.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_ao_info_opt.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_ao_info_opt.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_ao_info_opt.layout().byteSize() * elementCount, arena, cleanup);
    }
}

