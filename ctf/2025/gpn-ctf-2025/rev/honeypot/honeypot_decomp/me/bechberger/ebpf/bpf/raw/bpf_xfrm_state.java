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

public class bpf_xfrm_state {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("reqid"), Lib.C_INT.withName("spi"), Lib.C_SHORT.withName("family"), Lib.C_SHORT.withName("ext"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("remote_ipv4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("remote_ipv6")}).withName("$anon$6308:2")}).withName("bpf_xfrm_state");
    private static final ValueLayout.OfInt reqid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reqid")});
    private static final long reqid$OFFSET = 0L;
    private static final ValueLayout.OfInt spi$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"spi")});
    private static final long spi$OFFSET = 4L;
    private static final ValueLayout.OfShort family$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"family")});
    private static final long family$OFFSET = 8L;
    private static final ValueLayout.OfShort ext$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ext")});
    private static final long ext$OFFSET = 10L;
    private static final ValueLayout.OfInt remote_ipv4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6308:2"), MemoryLayout.PathElement.groupElement((String)"remote_ipv4")});
    private static final long remote_ipv4$OFFSET = 12L;
    private static final SequenceLayout remote_ipv6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6308:2"), MemoryLayout.PathElement.groupElement((String)"remote_ipv6")});
    private static final long remote_ipv6$OFFSET = 12L;
    private static long[] remote_ipv6$DIMS = new long[]{4L};
    private static final VarHandle remote_ipv6$ELEM_HANDLE = remote_ipv6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    bpf_xfrm_state() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt reqid$layout() {
        return reqid$LAYOUT;
    }

    public static final long reqid$offset() {
        return 0L;
    }

    public static int reqid(MemorySegment struct) {
        return struct.get(reqid$LAYOUT, 0L);
    }

    public static void reqid(MemorySegment struct, int fieldValue) {
        struct.set(reqid$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt spi$layout() {
        return spi$LAYOUT;
    }

    public static final long spi$offset() {
        return 4L;
    }

    public static int spi(MemorySegment struct) {
        return struct.get(spi$LAYOUT, 4L);
    }

    public static void spi(MemorySegment struct, int fieldValue) {
        struct.set(spi$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfShort family$layout() {
        return family$LAYOUT;
    }

    public static final long family$offset() {
        return 8L;
    }

    public static short family(MemorySegment struct) {
        return struct.get(family$LAYOUT, 8L);
    }

    public static void family(MemorySegment struct, short fieldValue) {
        struct.set(family$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfShort ext$layout() {
        return ext$LAYOUT;
    }

    public static final long ext$offset() {
        return 10L;
    }

    public static short ext(MemorySegment struct) {
        return struct.get(ext$LAYOUT, 10L);
    }

    public static void ext(MemorySegment struct, short fieldValue) {
        struct.set(ext$LAYOUT, 10L, fieldValue);
    }

    public static final ValueLayout.OfInt remote_ipv4$layout() {
        return remote_ipv4$LAYOUT;
    }

    public static final long remote_ipv4$offset() {
        return 12L;
    }

    public static int remote_ipv4(MemorySegment struct) {
        return struct.get(remote_ipv4$LAYOUT, 12L);
    }

    public static void remote_ipv4(MemorySegment struct, int fieldValue) {
        struct.set(remote_ipv4$LAYOUT, 12L, fieldValue);
    }

    public static final SequenceLayout remote_ipv6$layout() {
        return remote_ipv6$LAYOUT;
    }

    public static final long remote_ipv6$offset() {
        return 12L;
    }

    public static MemorySegment remote_ipv6(MemorySegment struct) {
        return struct.asSlice(12L, remote_ipv6$LAYOUT.byteSize());
    }

    public static void remote_ipv6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)12L, (long)remote_ipv6$LAYOUT.byteSize());
    }

    public static long[] remote_ipv6$dimensions() {
        return remote_ipv6$DIMS;
    }

    public static int remote_ipv6(MemorySegment struct, long index0) {
        return remote_ipv6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void remote_ipv6(MemorySegment struct, long index0, int fieldValue) {
        remote_ipv6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_xfrm_state.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_xfrm_state.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_xfrm_state.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_xfrm_state.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_xfrm_state.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_xfrm_state.layout().byteSize() * elementCount, arena, cleanup);
    }
}

