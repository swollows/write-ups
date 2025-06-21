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

public class tcp_repair_window {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("snd_wl1"), Lib.C_INT.withName("snd_wnd"), Lib.C_INT.withName("max_window"), Lib.C_INT.withName("rcv_wnd"), Lib.C_INT.withName("rcv_wup")}).withName("tcp_repair_window");
    private static final ValueLayout.OfInt snd_wl1$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_wl1")});
    private static final long snd_wl1$OFFSET = 0L;
    private static final ValueLayout.OfInt snd_wnd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_wnd")});
    private static final long snd_wnd$OFFSET = 4L;
    private static final ValueLayout.OfInt max_window$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"max_window")});
    private static final long max_window$OFFSET = 8L;
    private static final ValueLayout.OfInt rcv_wnd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rcv_wnd")});
    private static final long rcv_wnd$OFFSET = 12L;
    private static final ValueLayout.OfInt rcv_wup$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rcv_wup")});
    private static final long rcv_wup$OFFSET = 16L;

    tcp_repair_window() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt snd_wl1$layout() {
        return snd_wl1$LAYOUT;
    }

    public static final long snd_wl1$offset() {
        return 0L;
    }

    public static int snd_wl1(MemorySegment struct) {
        return struct.get(snd_wl1$LAYOUT, 0L);
    }

    public static void snd_wl1(MemorySegment struct, int fieldValue) {
        struct.set(snd_wl1$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_wnd$layout() {
        return snd_wnd$LAYOUT;
    }

    public static final long snd_wnd$offset() {
        return 4L;
    }

    public static int snd_wnd(MemorySegment struct) {
        return struct.get(snd_wnd$LAYOUT, 4L);
    }

    public static void snd_wnd(MemorySegment struct, int fieldValue) {
        struct.set(snd_wnd$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt max_window$layout() {
        return max_window$LAYOUT;
    }

    public static final long max_window$offset() {
        return 8L;
    }

    public static int max_window(MemorySegment struct) {
        return struct.get(max_window$LAYOUT, 8L);
    }

    public static void max_window(MemorySegment struct, int fieldValue) {
        struct.set(max_window$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt rcv_wnd$layout() {
        return rcv_wnd$LAYOUT;
    }

    public static final long rcv_wnd$offset() {
        return 12L;
    }

    public static int rcv_wnd(MemorySegment struct) {
        return struct.get(rcv_wnd$LAYOUT, 12L);
    }

    public static void rcv_wnd(MemorySegment struct, int fieldValue) {
        struct.set(rcv_wnd$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt rcv_wup$layout() {
        return rcv_wup$LAYOUT;
    }

    public static final long rcv_wup$offset() {
        return 16L;
    }

    public static int rcv_wup(MemorySegment struct) {
        return struct.get(rcv_wup$LAYOUT, 16L);
    }

    public static void rcv_wup(MemorySegment struct, int fieldValue) {
        struct.set(rcv_wup$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_repair_window.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_repair_window.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_repair_window.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_repair_window.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_repair_window.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_repair_window.layout().byteSize() * elementCount, arena, cleanup);
    }
}

