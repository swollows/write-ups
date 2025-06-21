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

public class raw_hdlc_proto {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("encoding"), Lib.C_SHORT.withName("parity")}).withName("$anon$53:9");
    private static final ValueLayout.OfShort encoding$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"encoding")});
    private static final long encoding$OFFSET = 0L;
    private static final ValueLayout.OfShort parity$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"parity")});
    private static final long parity$OFFSET = 2L;

    raw_hdlc_proto() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort encoding$layout() {
        return encoding$LAYOUT;
    }

    public static final long encoding$offset() {
        return 0L;
    }

    public static short encoding(MemorySegment struct) {
        return struct.get(encoding$LAYOUT, 0L);
    }

    public static void encoding(MemorySegment struct, short fieldValue) {
        struct.set(encoding$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort parity$layout() {
        return parity$LAYOUT;
    }

    public static final long parity$offset() {
        return 2L;
    }

    public static short parity(MemorySegment struct) {
        return struct.get(parity$LAYOUT, 2L);
    }

    public static void parity(MemorySegment struct, short fieldValue) {
        struct.set(parity$LAYOUT, 2L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(raw_hdlc_proto.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return raw_hdlc_proto.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)raw_hdlc_proto.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)raw_hdlc_proto.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return raw_hdlc_proto.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(raw_hdlc_proto.layout().byteSize() * elementCount, arena, cleanup);
    }
}

