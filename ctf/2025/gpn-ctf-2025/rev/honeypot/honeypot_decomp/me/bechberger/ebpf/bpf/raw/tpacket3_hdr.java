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
 *  java.lang.foreign.ValueLayout$OfShort
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.tpacket_hdr_variant1;

public class tpacket3_hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("tp_next_offset"), Lib.C_INT.withName("tp_sec"), Lib.C_INT.withName("tp_nsec"), Lib.C_INT.withName("tp_snaplen"), Lib.C_INT.withName("tp_len"), Lib.C_INT.withName("tp_status"), Lib.C_SHORT.withName("tp_mac"), Lib.C_SHORT.withName("tp_net"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{tpacket_hdr_variant1.layout().withName("hv1")}).withName("$anon$179:2"), MemoryLayout.sequenceLayout((long)8L, (MemoryLayout)Lib.C_CHAR).withName("tp_padding")}).withName("tpacket3_hdr");
    private static final ValueLayout.OfInt tp_next_offset$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_next_offset")});
    private static final long tp_next_offset$OFFSET = 0L;
    private static final ValueLayout.OfInt tp_sec$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_sec")});
    private static final long tp_sec$OFFSET = 4L;
    private static final ValueLayout.OfInt tp_nsec$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_nsec")});
    private static final long tp_nsec$OFFSET = 8L;
    private static final ValueLayout.OfInt tp_snaplen$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_snaplen")});
    private static final long tp_snaplen$OFFSET = 12L;
    private static final ValueLayout.OfInt tp_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_len")});
    private static final long tp_len$OFFSET = 16L;
    private static final ValueLayout.OfInt tp_status$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_status")});
    private static final long tp_status$OFFSET = 20L;
    private static final ValueLayout.OfShort tp_mac$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_mac")});
    private static final long tp_mac$OFFSET = 24L;
    private static final ValueLayout.OfShort tp_net$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_net")});
    private static final long tp_net$OFFSET = 26L;
    private static final GroupLayout hv1$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$179:2"), MemoryLayout.PathElement.groupElement((String)"hv1")});
    private static final long hv1$OFFSET = 28L;
    private static final SequenceLayout tp_padding$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_padding")});
    private static final long tp_padding$OFFSET = 40L;
    private static long[] tp_padding$DIMS = new long[]{8L};
    private static final VarHandle tp_padding$ELEM_HANDLE = tp_padding$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    tpacket3_hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt tp_next_offset$layout() {
        return tp_next_offset$LAYOUT;
    }

    public static final long tp_next_offset$offset() {
        return 0L;
    }

    public static int tp_next_offset(MemorySegment struct) {
        return struct.get(tp_next_offset$LAYOUT, 0L);
    }

    public static void tp_next_offset(MemorySegment struct, int fieldValue) {
        struct.set(tp_next_offset$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_sec$layout() {
        return tp_sec$LAYOUT;
    }

    public static final long tp_sec$offset() {
        return 4L;
    }

    public static int tp_sec(MemorySegment struct) {
        return struct.get(tp_sec$LAYOUT, 4L);
    }

    public static void tp_sec(MemorySegment struct, int fieldValue) {
        struct.set(tp_sec$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_nsec$layout() {
        return tp_nsec$LAYOUT;
    }

    public static final long tp_nsec$offset() {
        return 8L;
    }

    public static int tp_nsec(MemorySegment struct) {
        return struct.get(tp_nsec$LAYOUT, 8L);
    }

    public static void tp_nsec(MemorySegment struct, int fieldValue) {
        struct.set(tp_nsec$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_snaplen$layout() {
        return tp_snaplen$LAYOUT;
    }

    public static final long tp_snaplen$offset() {
        return 12L;
    }

    public static int tp_snaplen(MemorySegment struct) {
        return struct.get(tp_snaplen$LAYOUT, 12L);
    }

    public static void tp_snaplen(MemorySegment struct, int fieldValue) {
        struct.set(tp_snaplen$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_len$layout() {
        return tp_len$LAYOUT;
    }

    public static final long tp_len$offset() {
        return 16L;
    }

    public static int tp_len(MemorySegment struct) {
        return struct.get(tp_len$LAYOUT, 16L);
    }

    public static void tp_len(MemorySegment struct, int fieldValue) {
        struct.set(tp_len$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_status$layout() {
        return tp_status$LAYOUT;
    }

    public static final long tp_status$offset() {
        return 20L;
    }

    public static int tp_status(MemorySegment struct) {
        return struct.get(tp_status$LAYOUT, 20L);
    }

    public static void tp_status(MemorySegment struct, int fieldValue) {
        struct.set(tp_status$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfShort tp_mac$layout() {
        return tp_mac$LAYOUT;
    }

    public static final long tp_mac$offset() {
        return 24L;
    }

    public static short tp_mac(MemorySegment struct) {
        return struct.get(tp_mac$LAYOUT, 24L);
    }

    public static void tp_mac(MemorySegment struct, short fieldValue) {
        struct.set(tp_mac$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfShort tp_net$layout() {
        return tp_net$LAYOUT;
    }

    public static final long tp_net$offset() {
        return 26L;
    }

    public static short tp_net(MemorySegment struct) {
        return struct.get(tp_net$LAYOUT, 26L);
    }

    public static void tp_net(MemorySegment struct, short fieldValue) {
        struct.set(tp_net$LAYOUT, 26L, fieldValue);
    }

    public static final GroupLayout hv1$layout() {
        return hv1$LAYOUT;
    }

    public static final long hv1$offset() {
        return 28L;
    }

    public static MemorySegment hv1(MemorySegment struct) {
        return struct.asSlice(28L, hv1$LAYOUT.byteSize());
    }

    public static void hv1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)28L, (long)hv1$LAYOUT.byteSize());
    }

    public static final SequenceLayout tp_padding$layout() {
        return tp_padding$LAYOUT;
    }

    public static final long tp_padding$offset() {
        return 40L;
    }

    public static MemorySegment tp_padding(MemorySegment struct) {
        return struct.asSlice(40L, tp_padding$LAYOUT.byteSize());
    }

    public static void tp_padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)40L, (long)tp_padding$LAYOUT.byteSize());
    }

    public static long[] tp_padding$dimensions() {
        return tp_padding$DIMS;
    }

    public static byte tp_padding(MemorySegment struct, long index0) {
        return tp_padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void tp_padding(MemorySegment struct, long index0, byte fieldValue) {
        tp_padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket3_hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket3_hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket3_hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket3_hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket3_hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket3_hdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

