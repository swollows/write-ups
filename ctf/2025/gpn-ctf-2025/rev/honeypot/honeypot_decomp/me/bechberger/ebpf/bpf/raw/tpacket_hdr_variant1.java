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

public class tpacket_hdr_variant1 {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("tp_rxhash"), Lib.C_INT.withName("tp_vlan_tci"), Lib.C_SHORT.withName("tp_vlan_tpid"), Lib.C_SHORT.withName("tp_padding")}).withName("tpacket_hdr_variant1");
    private static final ValueLayout.OfInt tp_rxhash$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_rxhash")});
    private static final long tp_rxhash$OFFSET = 0L;
    private static final ValueLayout.OfInt tp_vlan_tci$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_vlan_tci")});
    private static final long tp_vlan_tci$OFFSET = 4L;
    private static final ValueLayout.OfShort tp_vlan_tpid$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_vlan_tpid")});
    private static final long tp_vlan_tpid$OFFSET = 8L;
    private static final ValueLayout.OfShort tp_padding$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_padding")});
    private static final long tp_padding$OFFSET = 10L;

    tpacket_hdr_variant1() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt tp_rxhash$layout() {
        return tp_rxhash$LAYOUT;
    }

    public static final long tp_rxhash$offset() {
        return 0L;
    }

    public static int tp_rxhash(MemorySegment struct) {
        return struct.get(tp_rxhash$LAYOUT, 0L);
    }

    public static void tp_rxhash(MemorySegment struct, int fieldValue) {
        struct.set(tp_rxhash$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt tp_vlan_tci$layout() {
        return tp_vlan_tci$LAYOUT;
    }

    public static final long tp_vlan_tci$offset() {
        return 4L;
    }

    public static int tp_vlan_tci(MemorySegment struct) {
        return struct.get(tp_vlan_tci$LAYOUT, 4L);
    }

    public static void tp_vlan_tci(MemorySegment struct, int fieldValue) {
        struct.set(tp_vlan_tci$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfShort tp_vlan_tpid$layout() {
        return tp_vlan_tpid$LAYOUT;
    }

    public static final long tp_vlan_tpid$offset() {
        return 8L;
    }

    public static short tp_vlan_tpid(MemorySegment struct) {
        return struct.get(tp_vlan_tpid$LAYOUT, 8L);
    }

    public static void tp_vlan_tpid(MemorySegment struct, short fieldValue) {
        struct.set(tp_vlan_tpid$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfShort tp_padding$layout() {
        return tp_padding$LAYOUT;
    }

    public static final long tp_padding$offset() {
        return 10L;
    }

    public static short tp_padding(MemorySegment struct) {
        return struct.get(tp_padding$LAYOUT, 10L);
    }

    public static void tp_padding(MemorySegment struct, short fieldValue) {
        struct.set(tp_padding$LAYOUT, 10L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_hdr_variant1.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_hdr_variant1.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_hdr_variant1.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_hdr_variant1.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_hdr_variant1.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_hdr_variant1.layout().byteSize() * elementCount, arena, cleanup);
    }
}

