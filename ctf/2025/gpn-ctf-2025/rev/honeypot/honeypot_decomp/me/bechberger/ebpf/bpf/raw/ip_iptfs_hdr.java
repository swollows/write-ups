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

public class ip_iptfs_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("subtype"), Lib.C_CHAR.withName("flags"), Lib.C_SHORT.withName("block_offset")}).withName("ip_iptfs_hdr");
    private static final ValueLayout.OfByte subtype$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"subtype")});
    private static final long subtype$OFFSET = 0L;
    private static final ValueLayout.OfByte flags$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 1L;
    private static final ValueLayout.OfShort block_offset$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"block_offset")});
    private static final long block_offset$OFFSET = 2L;

    ip_iptfs_hdr() {
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

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ip_iptfs_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ip_iptfs_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ip_iptfs_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip_iptfs_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ip_iptfs_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ip_iptfs_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

