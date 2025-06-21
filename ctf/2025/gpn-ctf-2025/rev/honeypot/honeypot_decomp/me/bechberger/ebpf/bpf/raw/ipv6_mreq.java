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
import me.bechberger.ebpf.bpf.raw.in6_addr;

public class ipv6_mreq {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in6_addr.layout().withName("ipv6mr_multiaddr"), Lib.C_INT.withName("ipv6mr_ifindex")}).withName("ipv6_mreq");
    private static final GroupLayout ipv6mr_multiaddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipv6mr_multiaddr")});
    private static final long ipv6mr_multiaddr$OFFSET = 0L;
    private static final ValueLayout.OfInt ipv6mr_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipv6mr_ifindex")});
    private static final long ipv6mr_ifindex$OFFSET = 16L;

    ipv6_mreq() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout ipv6mr_multiaddr$layout() {
        return ipv6mr_multiaddr$LAYOUT;
    }

    public static final long ipv6mr_multiaddr$offset() {
        return 0L;
    }

    public static MemorySegment ipv6mr_multiaddr(MemorySegment struct) {
        return struct.asSlice(0L, ipv6mr_multiaddr$LAYOUT.byteSize());
    }

    public static void ipv6mr_multiaddr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)ipv6mr_multiaddr$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt ipv6mr_ifindex$layout() {
        return ipv6mr_ifindex$LAYOUT;
    }

    public static final long ipv6mr_ifindex$offset() {
        return 16L;
    }

    public static int ipv6mr_ifindex(MemorySegment struct) {
        return struct.get(ipv6mr_ifindex$LAYOUT, 16L);
    }

    public static void ipv6mr_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ipv6mr_ifindex$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ipv6_mreq.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ipv6_mreq.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ipv6_mreq.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ipv6_mreq.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ipv6_mreq.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ipv6_mreq.layout().byteSize() * elementCount, arena, cleanup);
    }
}

