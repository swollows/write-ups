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
import me.bechberger.ebpf.bpf.raw.sockaddr_in6;

public class ip6_mtuinfo {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{sockaddr_in6.layout().withName("ip6m_addr"), Lib.C_INT.withName("ip6m_mtu")}).withName("ip6_mtuinfo");
    private static final GroupLayout ip6m_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ip6m_addr")});
    private static final long ip6m_addr$OFFSET = 0L;
    private static final ValueLayout.OfInt ip6m_mtu$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ip6m_mtu")});
    private static final long ip6m_mtu$OFFSET = 28L;

    ip6_mtuinfo() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout ip6m_addr$layout() {
        return ip6m_addr$LAYOUT;
    }

    public static final long ip6m_addr$offset() {
        return 0L;
    }

    public static MemorySegment ip6m_addr(MemorySegment struct) {
        return struct.asSlice(0L, ip6m_addr$LAYOUT.byteSize());
    }

    public static void ip6m_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)ip6m_addr$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt ip6m_mtu$layout() {
        return ip6m_mtu$LAYOUT;
    }

    public static final long ip6m_mtu$offset() {
        return 28L;
    }

    public static int ip6m_mtu(MemorySegment struct) {
        return struct.get(ip6m_mtu$LAYOUT, 28L);
    }

    public static void ip6m_mtu(MemorySegment struct, int fieldValue) {
        struct.set(ip6m_mtu$LAYOUT, 28L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ip6_mtuinfo.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ip6_mtuinfo.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ip6_mtuinfo.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip6_mtuinfo.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ip6_mtuinfo.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ip6_mtuinfo.layout().byteSize() * elementCount, arena, cleanup);
    }
}

