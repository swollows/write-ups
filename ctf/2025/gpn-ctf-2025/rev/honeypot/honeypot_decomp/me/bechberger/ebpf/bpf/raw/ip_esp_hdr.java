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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfInt
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class ip_esp_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("spi"), Lib.C_INT.withName("seq_no"), MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)Lib.C_CHAR).withName("enc_data")}).withName("ip_esp_hdr");
    private static final ValueLayout.OfInt spi$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"spi")});
    private static final long spi$OFFSET = 0L;
    private static final ValueLayout.OfInt seq_no$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"seq_no")});
    private static final long seq_no$OFFSET = 4L;
    private static final SequenceLayout enc_data$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"enc_data")});
    private static final long enc_data$OFFSET = 8L;

    ip_esp_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt spi$layout() {
        return spi$LAYOUT;
    }

    public static final long spi$offset() {
        return 0L;
    }

    public static int spi(MemorySegment struct) {
        return struct.get(spi$LAYOUT, 0L);
    }

    public static void spi(MemorySegment struct, int fieldValue) {
        struct.set(spi$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt seq_no$layout() {
        return seq_no$LAYOUT;
    }

    public static final long seq_no$offset() {
        return 4L;
    }

    public static int seq_no(MemorySegment struct) {
        return struct.get(seq_no$LAYOUT, 4L);
    }

    public static void seq_no(MemorySegment struct, int fieldValue) {
        struct.set(seq_no$LAYOUT, 4L, fieldValue);
    }

    public static final SequenceLayout enc_data$layout() {
        return enc_data$LAYOUT;
    }

    public static final long enc_data$offset() {
        return 8L;
    }

    public static MemorySegment enc_data(MemorySegment struct) {
        return struct.asSlice(8L, enc_data$LAYOUT.byteSize());
    }

    public static void enc_data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)enc_data$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ip_esp_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ip_esp_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ip_esp_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip_esp_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ip_esp_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ip_esp_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

