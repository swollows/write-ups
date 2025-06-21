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
import me.bechberger.ebpf.bpf.raw.tpacket_bd_header_u;

public class tpacket_block_desc {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("version"), Lib.C_INT.withName("offset_to_priv"), tpacket_bd_header_u.layout().withName("hdr")}).withName("tpacket_block_desc");
    private static final ValueLayout.OfInt version$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"version")});
    private static final long version$OFFSET = 0L;
    private static final ValueLayout.OfInt offset_to_priv$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"offset_to_priv")});
    private static final long offset_to_priv$OFFSET = 4L;
    private static final GroupLayout hdr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hdr")});
    private static final long hdr$OFFSET = 8L;

    tpacket_block_desc() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt version$layout() {
        return version$LAYOUT;
    }

    public static final long version$offset() {
        return 0L;
    }

    public static int version(MemorySegment struct) {
        return struct.get(version$LAYOUT, 0L);
    }

    public static void version(MemorySegment struct, int fieldValue) {
        struct.set(version$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt offset_to_priv$layout() {
        return offset_to_priv$LAYOUT;
    }

    public static final long offset_to_priv$offset() {
        return 4L;
    }

    public static int offset_to_priv(MemorySegment struct) {
        return struct.get(offset_to_priv$LAYOUT, 4L);
    }

    public static void offset_to_priv(MemorySegment struct, int fieldValue) {
        struct.set(offset_to_priv$LAYOUT, 4L, fieldValue);
    }

    public static final GroupLayout hdr$layout() {
        return hdr$LAYOUT;
    }

    public static final long hdr$offset() {
        return 8L;
    }

    public static MemorySegment hdr(MemorySegment struct) {
        return struct.asSlice(8L, hdr$LAYOUT.byteSize());
    }

    public static void hdr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)hdr$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_block_desc.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_block_desc.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_block_desc.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_block_desc.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_block_desc.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_block_desc.layout().byteSize() * elementCount, arena, cleanup);
    }
}

