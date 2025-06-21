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

public class ifmap {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("mem_start"), Lib.C_LONG.withName("mem_end"), Lib.C_SHORT.withName("base_addr"), Lib.C_CHAR.withName("irq"), Lib.C_CHAR.withName("dma"), Lib.C_CHAR.withName("port"), MemoryLayout.paddingLayout((long)3L)}).withName("ifmap");
    private static final ValueLayout.OfLong mem_start$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mem_start")});
    private static final long mem_start$OFFSET = 0L;
    private static final ValueLayout.OfLong mem_end$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mem_end")});
    private static final long mem_end$OFFSET = 8L;
    private static final ValueLayout.OfShort base_addr$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"base_addr")});
    private static final long base_addr$OFFSET = 16L;
    private static final ValueLayout.OfByte irq$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"irq")});
    private static final long irq$OFFSET = 18L;
    private static final ValueLayout.OfByte dma$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dma")});
    private static final long dma$OFFSET = 19L;
    private static final ValueLayout.OfByte port$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"port")});
    private static final long port$OFFSET = 20L;

    ifmap() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong mem_start$layout() {
        return mem_start$LAYOUT;
    }

    public static final long mem_start$offset() {
        return 0L;
    }

    public static long mem_start(MemorySegment struct) {
        return struct.get(mem_start$LAYOUT, 0L);
    }

    public static void mem_start(MemorySegment struct, long fieldValue) {
        struct.set(mem_start$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfLong mem_end$layout() {
        return mem_end$LAYOUT;
    }

    public static final long mem_end$offset() {
        return 8L;
    }

    public static long mem_end(MemorySegment struct) {
        return struct.get(mem_end$LAYOUT, 8L);
    }

    public static void mem_end(MemorySegment struct, long fieldValue) {
        struct.set(mem_end$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfShort base_addr$layout() {
        return base_addr$LAYOUT;
    }

    public static final long base_addr$offset() {
        return 16L;
    }

    public static short base_addr(MemorySegment struct) {
        return struct.get(base_addr$LAYOUT, 16L);
    }

    public static void base_addr(MemorySegment struct, short fieldValue) {
        struct.set(base_addr$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfByte irq$layout() {
        return irq$LAYOUT;
    }

    public static final long irq$offset() {
        return 18L;
    }

    public static byte irq(MemorySegment struct) {
        return struct.get(irq$LAYOUT, 18L);
    }

    public static void irq(MemorySegment struct, byte fieldValue) {
        struct.set(irq$LAYOUT, 18L, fieldValue);
    }

    public static final ValueLayout.OfByte dma$layout() {
        return dma$LAYOUT;
    }

    public static final long dma$offset() {
        return 19L;
    }

    public static byte dma(MemorySegment struct) {
        return struct.get(dma$LAYOUT, 19L);
    }

    public static void dma(MemorySegment struct, byte fieldValue) {
        struct.set(dma$LAYOUT, 19L, fieldValue);
    }

    public static final ValueLayout.OfByte port$layout() {
        return port$LAYOUT;
    }

    public static final long port$offset() {
        return 20L;
    }

    public static byte port(MemorySegment struct) {
        return struct.get(port$LAYOUT, 20L);
    }

    public static void port(MemorySegment struct, byte fieldValue) {
        struct.set(port$LAYOUT, 20L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ifmap.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ifmap.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ifmap.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ifmap.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ifmap.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ifmap.layout().byteSize() * elementCount, arena, cleanup);
    }
}

