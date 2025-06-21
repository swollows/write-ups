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

public class tcp_ao_repair {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("snt_isn"), Lib.C_INT.withName("rcv_isn"), Lib.C_INT.withName("snd_sne"), Lib.C_INT.withName("rcv_sne")}).withName("tcp_ao_repair");
    private static final ValueLayout.OfInt snt_isn$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snt_isn")});
    private static final long snt_isn$OFFSET = 0L;
    private static final ValueLayout.OfInt rcv_isn$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rcv_isn")});
    private static final long rcv_isn$OFFSET = 4L;
    private static final ValueLayout.OfInt snd_sne$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_sne")});
    private static final long snd_sne$OFFSET = 8L;
    private static final ValueLayout.OfInt rcv_sne$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rcv_sne")});
    private static final long rcv_sne$OFFSET = 12L;

    tcp_ao_repair() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt snt_isn$layout() {
        return snt_isn$LAYOUT;
    }

    public static final long snt_isn$offset() {
        return 0L;
    }

    public static int snt_isn(MemorySegment struct) {
        return struct.get(snt_isn$LAYOUT, 0L);
    }

    public static void snt_isn(MemorySegment struct, int fieldValue) {
        struct.set(snt_isn$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt rcv_isn$layout() {
        return rcv_isn$LAYOUT;
    }

    public static final long rcv_isn$offset() {
        return 4L;
    }

    public static int rcv_isn(MemorySegment struct) {
        return struct.get(rcv_isn$LAYOUT, 4L);
    }

    public static void rcv_isn(MemorySegment struct, int fieldValue) {
        struct.set(rcv_isn$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_sne$layout() {
        return snd_sne$LAYOUT;
    }

    public static final long snd_sne$offset() {
        return 8L;
    }

    public static int snd_sne(MemorySegment struct) {
        return struct.get(snd_sne$LAYOUT, 8L);
    }

    public static void snd_sne(MemorySegment struct, int fieldValue) {
        struct.set(snd_sne$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt rcv_sne$layout() {
        return rcv_sne$LAYOUT;
    }

    public static final long rcv_sne$offset() {
        return 12L;
    }

    public static int rcv_sne(MemorySegment struct) {
        return struct.get(rcv_sne$LAYOUT, 12L);
    }

    public static void rcv_sne(MemorySegment struct, int fieldValue) {
        struct.set(rcv_sne$LAYOUT, 12L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_ao_repair.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_ao_repair.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_ao_repair.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_ao_repair.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_ao_repair.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_ao_repair.layout().byteSize() * elementCount, arena, cleanup);
    }
}

