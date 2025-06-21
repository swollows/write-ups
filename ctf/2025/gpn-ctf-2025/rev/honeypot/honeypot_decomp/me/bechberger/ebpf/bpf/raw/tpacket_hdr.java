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

public class tpacket_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("tp_status"), Lib.C_INT.withName("tp_len"), Lib.C_INT.withName("tp_snaplen"), Lib.C_SHORT.withName("tp_mac"), Lib.C_SHORT.withName("tp_net"), Lib.C_INT.withName("tp_sec"), Lib.C_INT.withName("tp_usec"), MemoryLayout.paddingLayout((long)4L)}).withName("tpacket_hdr");
    private static final ValueLayout.OfLong tp_status$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_status")});
    private static final long tp_status$OFFSET = 0L;
    private static final ValueLayout.OfInt tp_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_len")});
    private static final long tp_len$OFFSET = 8L;
    private static final ValueLayout.OfInt tp_snaplen$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_snaplen")});
    private static final long tp_snaplen$OFFSET = 12L;
    private static final ValueLayout.OfShort tp_mac$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_mac")});
    private static final long tp_mac$OFFSET = 16L;
    private static final ValueLayout.OfShort tp_net$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_net")});
    private static final long tp_net$OFFSET = 18L;
    private static final ValueLayout.OfInt tp_sec$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_sec")});
    private static final long tp_sec$OFFSET = 20L;
    private static final ValueLayout.OfInt tp_usec$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_usec")});
    private static final long tp_usec$OFFSET = 24L;

    tpacket_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong tp_status$layout() {
        return tp_status$LAYOUT;
    }

    public static final long tp_status$offset() {
        return 0L;
    }

    public static long tp_status(MemorySegment struct) {
        return struct.get(tp_status$LAYOUT, 0L);
    }

    public static void tp_status(MemorySegment struct, long fieldValue) {
        struct.set(tp_status$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_len$layout() {
        return tp_len$LAYOUT;
    }

    public static final long tp_len$offset() {
        return 8L;
    }

    public static int tp_len(MemorySegment struct) {
        return struct.get(tp_len$LAYOUT, 8L);
    }

    public static void tp_len(MemorySegment struct, int fieldValue) {
        struct.set(tp_len$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_snaplen$layout() {
        return tp_snaplen$LAYOUT;
    }

    public static final long tp_snaplen$offset() {
        return 12L;
    }

    public static int tp_snaplen(MemorySegment struct) {
        return struct.get(tp_snaplen$LAYOUT, 12L);
    }

    public static void tp_snaplen(MemorySegment struct, int fieldValue) {
        struct.set(tp_snaplen$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfShort tp_mac$layout() {
        return tp_mac$LAYOUT;
    }

    public static final long tp_mac$offset() {
        return 16L;
    }

    public static short tp_mac(MemorySegment struct) {
        return struct.get(tp_mac$LAYOUT, 16L);
    }

    public static void tp_mac(MemorySegment struct, short fieldValue) {
        struct.set(tp_mac$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfShort tp_net$layout() {
        return tp_net$LAYOUT;
    }

    public static final long tp_net$offset() {
        return 18L;
    }

    public static short tp_net(MemorySegment struct) {
        return struct.get(tp_net$LAYOUT, 18L);
    }

    public static void tp_net(MemorySegment struct, short fieldValue) {
        struct.set(tp_net$LAYOUT, 18L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_sec$layout() {
        return tp_sec$LAYOUT;
    }

    public static final long tp_sec$offset() {
        return 20L;
    }

    public static int tp_sec(MemorySegment struct) {
        return struct.get(tp_sec$LAYOUT, 20L);
    }

    public static void tp_sec(MemorySegment struct, int fieldValue) {
        struct.set(tp_sec$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_usec$layout() {
        return tp_usec$LAYOUT;
    }

    public static final long tp_usec$offset() {
        return 24L;
    }

    public static int tp_usec(MemorySegment struct) {
        return struct.get(tp_usec$LAYOUT, 24L);
    }

    public static void tp_usec(MemorySegment struct, int fieldValue) {
        struct.set(tp_usec$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

