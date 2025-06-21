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

public class bpf_sock {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("bound_dev_if"), Lib.C_INT.withName("family"), Lib.C_INT.withName("type"), Lib.C_INT.withName("protocol"), Lib.C_INT.withName("mark"), Lib.C_INT.withName("priority"), Lib.C_INT.withName("src_ip4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("src_ip6"), Lib.C_INT.withName("src_port"), Lib.C_SHORT.withName("dst_port"), MemoryLayout.paddingLayout((long)2L), Lib.C_INT.withName("dst_ip4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("dst_ip6"), Lib.C_INT.withName("state"), Lib.C_INT.withName("rx_queue_mapping")}).withName("bpf_sock");
    private static final ValueLayout.OfInt bound_dev_if$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bound_dev_if")});
    private static final long bound_dev_if$OFFSET = 0L;
    private static final ValueLayout.OfInt family$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"family")});
    private static final long family$OFFSET = 4L;
    private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 8L;
    private static final ValueLayout.OfInt protocol$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"protocol")});
    private static final long protocol$OFFSET = 12L;
    private static final ValueLayout.OfInt mark$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mark")});
    private static final long mark$OFFSET = 16L;
    private static final ValueLayout.OfInt priority$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"priority")});
    private static final long priority$OFFSET = 20L;
    private static final ValueLayout.OfInt src_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"src_ip4")});
    private static final long src_ip4$OFFSET = 24L;
    private static final SequenceLayout src_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"src_ip6")});
    private static final long src_ip6$OFFSET = 28L;
    private static long[] src_ip6$DIMS = new long[]{4L};
    private static final VarHandle src_ip6$ELEM_HANDLE = src_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt src_port$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"src_port")});
    private static final long src_port$OFFSET = 44L;
    private static final ValueLayout.OfShort dst_port$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dst_port")});
    private static final long dst_port$OFFSET = 48L;
    private static final ValueLayout.OfInt dst_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dst_ip4")});
    private static final long dst_ip4$OFFSET = 52L;
    private static final SequenceLayout dst_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dst_ip6")});
    private static final long dst_ip6$OFFSET = 56L;
    private static long[] dst_ip6$DIMS = new long[]{4L};
    private static final VarHandle dst_ip6$ELEM_HANDLE = dst_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt state$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"state")});
    private static final long state$OFFSET = 72L;
    private static final ValueLayout.OfInt rx_queue_mapping$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rx_queue_mapping")});
    private static final long rx_queue_mapping$OFFSET = 76L;

    bpf_sock() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt bound_dev_if$layout() {
        return bound_dev_if$LAYOUT;
    }

    public static final long bound_dev_if$offset() {
        return 0L;
    }

    public static int bound_dev_if(MemorySegment struct) {
        return struct.get(bound_dev_if$LAYOUT, 0L);
    }

    public static void bound_dev_if(MemorySegment struct, int fieldValue) {
        struct.set(bound_dev_if$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt family$layout() {
        return family$LAYOUT;
    }

    public static final long family$offset() {
        return 4L;
    }

    public static int family(MemorySegment struct) {
        return struct.get(family$LAYOUT, 4L);
    }

    public static void family(MemorySegment struct, int fieldValue) {
        struct.set(family$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 8L;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 8L);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt protocol$layout() {
        return protocol$LAYOUT;
    }

    public static final long protocol$offset() {
        return 12L;
    }

    public static int protocol(MemorySegment struct) {
        return struct.get(protocol$LAYOUT, 12L);
    }

    public static void protocol(MemorySegment struct, int fieldValue) {
        struct.set(protocol$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt mark$layout() {
        return mark$LAYOUT;
    }

    public static final long mark$offset() {
        return 16L;
    }

    public static int mark(MemorySegment struct) {
        return struct.get(mark$LAYOUT, 16L);
    }

    public static void mark(MemorySegment struct, int fieldValue) {
        struct.set(mark$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt priority$layout() {
        return priority$LAYOUT;
    }

    public static final long priority$offset() {
        return 20L;
    }

    public static int priority(MemorySegment struct) {
        return struct.get(priority$LAYOUT, 20L);
    }

    public static void priority(MemorySegment struct, int fieldValue) {
        struct.set(priority$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt src_ip4$layout() {
        return src_ip4$LAYOUT;
    }

    public static final long src_ip4$offset() {
        return 24L;
    }

    public static int src_ip4(MemorySegment struct) {
        return struct.get(src_ip4$LAYOUT, 24L);
    }

    public static void src_ip4(MemorySegment struct, int fieldValue) {
        struct.set(src_ip4$LAYOUT, 24L, fieldValue);
    }

    public static final SequenceLayout src_ip6$layout() {
        return src_ip6$LAYOUT;
    }

    public static final long src_ip6$offset() {
        return 28L;
    }

    public static MemorySegment src_ip6(MemorySegment struct) {
        return struct.asSlice(28L, src_ip6$LAYOUT.byteSize());
    }

    public static void src_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)28L, (long)src_ip6$LAYOUT.byteSize());
    }

    public static long[] src_ip6$dimensions() {
        return src_ip6$DIMS;
    }

    public static int src_ip6(MemorySegment struct, long index0) {
        return src_ip6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void src_ip6(MemorySegment struct, long index0, int fieldValue) {
        src_ip6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt src_port$layout() {
        return src_port$LAYOUT;
    }

    public static final long src_port$offset() {
        return 44L;
    }

    public static int src_port(MemorySegment struct) {
        return struct.get(src_port$LAYOUT, 44L);
    }

    public static void src_port(MemorySegment struct, int fieldValue) {
        struct.set(src_port$LAYOUT, 44L, fieldValue);
    }

    public static final ValueLayout.OfShort dst_port$layout() {
        return dst_port$LAYOUT;
    }

    public static final long dst_port$offset() {
        return 48L;
    }

    public static short dst_port(MemorySegment struct) {
        return struct.get(dst_port$LAYOUT, 48L);
    }

    public static void dst_port(MemorySegment struct, short fieldValue) {
        struct.set(dst_port$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt dst_ip4$layout() {
        return dst_ip4$LAYOUT;
    }

    public static final long dst_ip4$offset() {
        return 52L;
    }

    public static int dst_ip4(MemorySegment struct) {
        return struct.get(dst_ip4$LAYOUT, 52L);
    }

    public static void dst_ip4(MemorySegment struct, int fieldValue) {
        struct.set(dst_ip4$LAYOUT, 52L, fieldValue);
    }

    public static final SequenceLayout dst_ip6$layout() {
        return dst_ip6$LAYOUT;
    }

    public static final long dst_ip6$offset() {
        return 56L;
    }

    public static MemorySegment dst_ip6(MemorySegment struct) {
        return struct.asSlice(56L, dst_ip6$LAYOUT.byteSize());
    }

    public static void dst_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)56L, (long)dst_ip6$LAYOUT.byteSize());
    }

    public static long[] dst_ip6$dimensions() {
        return dst_ip6$DIMS;
    }

    public static int dst_ip6(MemorySegment struct, long index0) {
        return dst_ip6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void dst_ip6(MemorySegment struct, long index0, int fieldValue) {
        dst_ip6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt state$layout() {
        return state$LAYOUT;
    }

    public static final long state$offset() {
        return 72L;
    }

    public static int state(MemorySegment struct) {
        return struct.get(state$LAYOUT, 72L);
    }

    public static void state(MemorySegment struct, int fieldValue) {
        struct.set(state$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt rx_queue_mapping$layout() {
        return rx_queue_mapping$LAYOUT;
    }

    public static final long rx_queue_mapping$offset() {
        return 76L;
    }

    public static int rx_queue_mapping(MemorySegment struct) {
        return struct.get(rx_queue_mapping$LAYOUT, 76L);
    }

    public static void rx_queue_mapping(MemorySegment struct, int fieldValue) {
        struct.set(rx_queue_mapping$LAYOUT, 76L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_sock.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_sock.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_sock.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_sock.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_sock.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_sock.layout().byteSize() * elementCount, arena, cleanup);
    }
}

