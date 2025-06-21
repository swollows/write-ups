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

public class x25_hdlc_proto {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("dce"), MemoryLayout.paddingLayout((long)2L), Lib.C_INT.withName("modulo"), Lib.C_INT.withName("window"), Lib.C_INT.withName("t1"), Lib.C_INT.withName("t2"), Lib.C_INT.withName("n2")}).withName("$anon$82:9");
    private static final ValueLayout.OfShort dce$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dce")});
    private static final long dce$OFFSET = 0L;
    private static final ValueLayout.OfInt modulo$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"modulo")});
    private static final long modulo$OFFSET = 4L;
    private static final ValueLayout.OfInt window$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"window")});
    private static final long window$OFFSET = 8L;
    private static final ValueLayout.OfInt t1$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"t1")});
    private static final long t1$OFFSET = 12L;
    private static final ValueLayout.OfInt t2$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"t2")});
    private static final long t2$OFFSET = 16L;
    private static final ValueLayout.OfInt n2$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"n2")});
    private static final long n2$OFFSET = 20L;

    x25_hdlc_proto() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort dce$layout() {
        return dce$LAYOUT;
    }

    public static final long dce$offset() {
        return 0L;
    }

    public static short dce(MemorySegment struct) {
        return struct.get(dce$LAYOUT, 0L);
    }

    public static void dce(MemorySegment struct, short fieldValue) {
        struct.set(dce$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt modulo$layout() {
        return modulo$LAYOUT;
    }

    public static final long modulo$offset() {
        return 4L;
    }

    public static int modulo(MemorySegment struct) {
        return struct.get(modulo$LAYOUT, 4L);
    }

    public static void modulo(MemorySegment struct, int fieldValue) {
        struct.set(modulo$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt window$layout() {
        return window$LAYOUT;
    }

    public static final long window$offset() {
        return 8L;
    }

    public static int window(MemorySegment struct) {
        return struct.get(window$LAYOUT, 8L);
    }

    public static void window(MemorySegment struct, int fieldValue) {
        struct.set(window$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt t1$layout() {
        return t1$LAYOUT;
    }

    public static final long t1$offset() {
        return 12L;
    }

    public static int t1(MemorySegment struct) {
        return struct.get(t1$LAYOUT, 12L);
    }

    public static void t1(MemorySegment struct, int fieldValue) {
        struct.set(t1$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt t2$layout() {
        return t2$LAYOUT;
    }

    public static final long t2$offset() {
        return 16L;
    }

    public static int t2(MemorySegment struct) {
        return struct.get(t2$LAYOUT, 16L);
    }

    public static void t2(MemorySegment struct, int fieldValue) {
        struct.set(t2$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt n2$layout() {
        return n2$LAYOUT;
    }

    public static final long n2$offset() {
        return 20L;
    }

    public static int n2(MemorySegment struct) {
        return struct.get(n2$LAYOUT, 20L);
    }

    public static void n2(MemorySegment struct, int fieldValue) {
        struct.set(n2$LAYOUT, 20L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(x25_hdlc_proto.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return x25_hdlc_proto.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)x25_hdlc_proto.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)x25_hdlc_proto.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return x25_hdlc_proto.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(x25_hdlc_proto.layout().byteSize() * elementCount, arena, cleanup);
    }
}

