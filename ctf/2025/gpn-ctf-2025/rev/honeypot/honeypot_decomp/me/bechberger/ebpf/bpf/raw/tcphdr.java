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

public class tcphdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("source"), Lib.C_SHORT.withName("dest"), Lib.C_INT.withName("seq"), Lib.C_INT.withName("ack_seq"), MemoryLayout.paddingLayout((long)2L), Lib.C_SHORT.withName("window"), Lib.C_SHORT.withName("check"), Lib.C_SHORT.withName("urg_ptr")}).withName("tcphdr");
    private static final ValueLayout.OfShort source$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"source")});
    private static final long source$OFFSET = 0L;
    private static final ValueLayout.OfShort dest$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dest")});
    private static final long dest$OFFSET = 2L;
    private static final ValueLayout.OfInt seq$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"seq")});
    private static final long seq$OFFSET = 4L;
    private static final ValueLayout.OfInt ack_seq$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ack_seq")});
    private static final long ack_seq$OFFSET = 8L;
    private static final ValueLayout.OfShort window$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"window")});
    private static final long window$OFFSET = 14L;
    private static final ValueLayout.OfShort check$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"check")});
    private static final long check$OFFSET = 16L;
    private static final ValueLayout.OfShort urg_ptr$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"urg_ptr")});
    private static final long urg_ptr$OFFSET = 18L;

    tcphdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort source$layout() {
        return source$LAYOUT;
    }

    public static final long source$offset() {
        return 0L;
    }

    public static short source(MemorySegment struct) {
        return struct.get(source$LAYOUT, 0L);
    }

    public static void source(MemorySegment struct, short fieldValue) {
        struct.set(source$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort dest$layout() {
        return dest$LAYOUT;
    }

    public static final long dest$offset() {
        return 2L;
    }

    public static short dest(MemorySegment struct) {
        return struct.get(dest$LAYOUT, 2L);
    }

    public static void dest(MemorySegment struct, short fieldValue) {
        struct.set(dest$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfInt seq$layout() {
        return seq$LAYOUT;
    }

    public static final long seq$offset() {
        return 4L;
    }

    public static int seq(MemorySegment struct) {
        return struct.get(seq$LAYOUT, 4L);
    }

    public static void seq(MemorySegment struct, int fieldValue) {
        struct.set(seq$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt ack_seq$layout() {
        return ack_seq$LAYOUT;
    }

    public static final long ack_seq$offset() {
        return 8L;
    }

    public static int ack_seq(MemorySegment struct) {
        return struct.get(ack_seq$LAYOUT, 8L);
    }

    public static void ack_seq(MemorySegment struct, int fieldValue) {
        struct.set(ack_seq$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfShort window$layout() {
        return window$LAYOUT;
    }

    public static final long window$offset() {
        return 14L;
    }

    public static short window(MemorySegment struct) {
        return struct.get(window$LAYOUT, 14L);
    }

    public static void window(MemorySegment struct, short fieldValue) {
        struct.set(window$LAYOUT, 14L, fieldValue);
    }

    public static final ValueLayout.OfShort check$layout() {
        return check$LAYOUT;
    }

    public static final long check$offset() {
        return 16L;
    }

    public static short check(MemorySegment struct) {
        return struct.get(check$LAYOUT, 16L);
    }

    public static void check(MemorySegment struct, short fieldValue) {
        struct.set(check$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfShort urg_ptr$layout() {
        return urg_ptr$LAYOUT;
    }

    public static final long urg_ptr$offset() {
        return 18L;
    }

    public static short urg_ptr(MemorySegment struct) {
        return struct.get(urg_ptr$LAYOUT, 18L);
    }

    public static void urg_ptr(MemorySegment struct, short fieldValue) {
        struct.set(urg_ptr$LAYOUT, 18L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcphdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcphdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcphdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcphdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcphdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcphdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

