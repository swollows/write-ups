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

public class bpf_redir_neigh {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("nh_family"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ipv4_nh"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("ipv6_nh")}).withName("$anon$7250:2")}).withName("bpf_redir_neigh");
    private static final ValueLayout.OfInt nh_family$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nh_family")});
    private static final long nh_family$OFFSET = 0L;
    private static final ValueLayout.OfInt ipv4_nh$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7250:2"), MemoryLayout.PathElement.groupElement((String)"ipv4_nh")});
    private static final long ipv4_nh$OFFSET = 4L;
    private static final SequenceLayout ipv6_nh$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7250:2"), MemoryLayout.PathElement.groupElement((String)"ipv6_nh")});
    private static final long ipv6_nh$OFFSET = 4L;
    private static long[] ipv6_nh$DIMS = new long[]{4L};
    private static final VarHandle ipv6_nh$ELEM_HANDLE = ipv6_nh$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    bpf_redir_neigh() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt nh_family$layout() {
        return nh_family$LAYOUT;
    }

    public static final long nh_family$offset() {
        return 0L;
    }

    public static int nh_family(MemorySegment struct) {
        return struct.get(nh_family$LAYOUT, 0L);
    }

    public static void nh_family(MemorySegment struct, int fieldValue) {
        struct.set(nh_family$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt ipv4_nh$layout() {
        return ipv4_nh$LAYOUT;
    }

    public static final long ipv4_nh$offset() {
        return 4L;
    }

    public static int ipv4_nh(MemorySegment struct) {
        return struct.get(ipv4_nh$LAYOUT, 4L);
    }

    public static void ipv4_nh(MemorySegment struct, int fieldValue) {
        struct.set(ipv4_nh$LAYOUT, 4L, fieldValue);
    }

    public static final SequenceLayout ipv6_nh$layout() {
        return ipv6_nh$LAYOUT;
    }

    public static final long ipv6_nh$offset() {
        return 4L;
    }

    public static MemorySegment ipv6_nh(MemorySegment struct) {
        return struct.asSlice(4L, ipv6_nh$LAYOUT.byteSize());
    }

    public static void ipv6_nh(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)ipv6_nh$LAYOUT.byteSize());
    }

    public static long[] ipv6_nh$dimensions() {
        return ipv6_nh$DIMS;
    }

    public static int ipv6_nh(MemorySegment struct, long index0) {
        return ipv6_nh$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void ipv6_nh(MemorySegment struct, long index0, int fieldValue) {
        ipv6_nh$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_redir_neigh.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_redir_neigh.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_redir_neigh.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_redir_neigh.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_redir_neigh.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_redir_neigh.layout().byteSize() * elementCount, arena, cleanup);
    }
}

