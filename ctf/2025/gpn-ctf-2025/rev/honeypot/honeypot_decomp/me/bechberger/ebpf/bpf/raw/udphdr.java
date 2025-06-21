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

public class udphdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("source"), Lib.C_SHORT.withName("dest"), Lib.C_SHORT.withName("len"), Lib.C_SHORT.withName("check")}).withName("udphdr");
    private static final ValueLayout.OfShort source$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"source")});
    private static final long source$OFFSET = 0L;
    private static final ValueLayout.OfShort dest$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dest")});
    private static final long dest$OFFSET = 2L;
    private static final ValueLayout.OfShort len$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"len")});
    private static final long len$OFFSET = 4L;
    private static final ValueLayout.OfShort check$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"check")});
    private static final long check$OFFSET = 6L;

    udphdr() {
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

    public static final ValueLayout.OfShort len$layout() {
        return len$LAYOUT;
    }

    public static final long len$offset() {
        return 4L;
    }

    public static short len(MemorySegment struct) {
        return struct.get(len$LAYOUT, 4L);
    }

    public static void len(MemorySegment struct, short fieldValue) {
        struct.set(len$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfShort check$layout() {
        return check$LAYOUT;
    }

    public static final long check$offset() {
        return 6L;
    }

    public static short check(MemorySegment struct) {
        return struct.get(check$LAYOUT, 6L);
    }

    public static void check(MemorySegment struct, short fieldValue) {
        struct.set(check$LAYOUT, 6L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(udphdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return udphdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)udphdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)udphdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return udphdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(udphdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

