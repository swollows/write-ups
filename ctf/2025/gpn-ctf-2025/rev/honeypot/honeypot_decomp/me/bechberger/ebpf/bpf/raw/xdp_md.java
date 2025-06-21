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

public class xdp_md {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("data"), Lib.C_INT.withName("data_end"), Lib.C_INT.withName("data_meta"), Lib.C_INT.withName("ingress_ifindex"), Lib.C_INT.withName("rx_queue_index"), Lib.C_INT.withName("egress_ifindex")}).withName("xdp_md");
    private static final ValueLayout.OfInt data$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data")});
    private static final long data$OFFSET = 0L;
    private static final ValueLayout.OfInt data_end$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_end")});
    private static final long data_end$OFFSET = 4L;
    private static final ValueLayout.OfInt data_meta$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_meta")});
    private static final long data_meta$OFFSET = 8L;
    private static final ValueLayout.OfInt ingress_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ingress_ifindex")});
    private static final long ingress_ifindex$OFFSET = 12L;
    private static final ValueLayout.OfInt rx_queue_index$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rx_queue_index")});
    private static final long rx_queue_index$OFFSET = 16L;
    private static final ValueLayout.OfInt egress_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"egress_ifindex")});
    private static final long egress_ifindex$OFFSET = 20L;

    xdp_md() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt data$layout() {
        return data$LAYOUT;
    }

    public static final long data$offset() {
        return 0L;
    }

    public static int data(MemorySegment struct) {
        return struct.get(data$LAYOUT, 0L);
    }

    public static void data(MemorySegment struct, int fieldValue) {
        struct.set(data$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt data_end$layout() {
        return data_end$LAYOUT;
    }

    public static final long data_end$offset() {
        return 4L;
    }

    public static int data_end(MemorySegment struct) {
        return struct.get(data_end$LAYOUT, 4L);
    }

    public static void data_end(MemorySegment struct, int fieldValue) {
        struct.set(data_end$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt data_meta$layout() {
        return data_meta$LAYOUT;
    }

    public static final long data_meta$offset() {
        return 8L;
    }

    public static int data_meta(MemorySegment struct) {
        return struct.get(data_meta$LAYOUT, 8L);
    }

    public static void data_meta(MemorySegment struct, int fieldValue) {
        struct.set(data_meta$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt ingress_ifindex$layout() {
        return ingress_ifindex$LAYOUT;
    }

    public static final long ingress_ifindex$offset() {
        return 12L;
    }

    public static int ingress_ifindex(MemorySegment struct) {
        return struct.get(ingress_ifindex$LAYOUT, 12L);
    }

    public static void ingress_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ingress_ifindex$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt rx_queue_index$layout() {
        return rx_queue_index$LAYOUT;
    }

    public static final long rx_queue_index$offset() {
        return 16L;
    }

    public static int rx_queue_index(MemorySegment struct) {
        return struct.get(rx_queue_index$LAYOUT, 16L);
    }

    public static void rx_queue_index(MemorySegment struct, int fieldValue) {
        struct.set(rx_queue_index$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt egress_ifindex$layout() {
        return egress_ifindex$LAYOUT;
    }

    public static final long egress_ifindex$offset() {
        return 20L;
    }

    public static int egress_ifindex(MemorySegment struct) {
        return struct.get(egress_ifindex$LAYOUT, 20L);
    }

    public static void egress_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(egress_ifindex$LAYOUT, 20L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(xdp_md.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return xdp_md.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)xdp_md.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)xdp_md.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return xdp_md.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(xdp_md.layout().byteSize() * elementCount, arena, cleanup);
    }
}

