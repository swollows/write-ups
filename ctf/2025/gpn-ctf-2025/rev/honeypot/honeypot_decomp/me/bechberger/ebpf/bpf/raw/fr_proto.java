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

public class fr_proto {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("t391"), Lib.C_INT.withName("t392"), Lib.C_INT.withName("n391"), Lib.C_INT.withName("n392"), Lib.C_INT.withName("n393"), Lib.C_SHORT.withName("lmi"), Lib.C_SHORT.withName("dce")}).withName("$anon$58:9");
    private static final ValueLayout.OfInt t391$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"t391")});
    private static final long t391$OFFSET = 0L;
    private static final ValueLayout.OfInt t392$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"t392")});
    private static final long t392$OFFSET = 4L;
    private static final ValueLayout.OfInt n391$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"n391")});
    private static final long n391$OFFSET = 8L;
    private static final ValueLayout.OfInt n392$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"n392")});
    private static final long n392$OFFSET = 12L;
    private static final ValueLayout.OfInt n393$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"n393")});
    private static final long n393$OFFSET = 16L;
    private static final ValueLayout.OfShort lmi$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"lmi")});
    private static final long lmi$OFFSET = 20L;
    private static final ValueLayout.OfShort dce$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dce")});
    private static final long dce$OFFSET = 22L;

    fr_proto() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt t391$layout() {
        return t391$LAYOUT;
    }

    public static final long t391$offset() {
        return 0L;
    }

    public static int t391(MemorySegment struct) {
        return struct.get(t391$LAYOUT, 0L);
    }

    public static void t391(MemorySegment struct, int fieldValue) {
        struct.set(t391$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt t392$layout() {
        return t392$LAYOUT;
    }

    public static final long t392$offset() {
        return 4L;
    }

    public static int t392(MemorySegment struct) {
        return struct.get(t392$LAYOUT, 4L);
    }

    public static void t392(MemorySegment struct, int fieldValue) {
        struct.set(t392$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt n391$layout() {
        return n391$LAYOUT;
    }

    public static final long n391$offset() {
        return 8L;
    }

    public static int n391(MemorySegment struct) {
        return struct.get(n391$LAYOUT, 8L);
    }

    public static void n391(MemorySegment struct, int fieldValue) {
        struct.set(n391$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt n392$layout() {
        return n392$LAYOUT;
    }

    public static final long n392$offset() {
        return 12L;
    }

    public static int n392(MemorySegment struct) {
        return struct.get(n392$LAYOUT, 12L);
    }

    public static void n392(MemorySegment struct, int fieldValue) {
        struct.set(n392$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt n393$layout() {
        return n393$LAYOUT;
    }

    public static final long n393$offset() {
        return 16L;
    }

    public static int n393(MemorySegment struct) {
        return struct.get(n393$LAYOUT, 16L);
    }

    public static void n393(MemorySegment struct, int fieldValue) {
        struct.set(n393$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfShort lmi$layout() {
        return lmi$LAYOUT;
    }

    public static final long lmi$offset() {
        return 20L;
    }

    public static short lmi(MemorySegment struct) {
        return struct.get(lmi$LAYOUT, 20L);
    }

    public static void lmi(MemorySegment struct, short fieldValue) {
        struct.set(lmi$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfShort dce$layout() {
        return dce$LAYOUT;
    }

    public static final long dce$offset() {
        return 22L;
    }

    public static short dce(MemorySegment struct) {
        return struct.get(dce$LAYOUT, 22L);
    }

    public static void dce(MemorySegment struct, short fieldValue) {
        struct.set(dce$LAYOUT, 22L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(fr_proto.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return fr_proto.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)fr_proto.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)fr_proto.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return fr_proto.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(fr_proto.layout().byteSize() * elementCount, arena, cleanup);
    }
}

