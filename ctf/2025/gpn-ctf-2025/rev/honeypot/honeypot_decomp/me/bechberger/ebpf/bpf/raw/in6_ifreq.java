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

public class in6_ifreq {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in6_addr.layout().withName("ifr6_addr"), Lib.C_INT.withName("ifr6_prefixlen"), Lib.C_INT.withName("ifr6_ifindex")}).withName("in6_ifreq");
    private static final GroupLayout ifr6_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifr6_addr")});
    private static final long ifr6_addr$OFFSET = 0L;
    private static final ValueLayout.OfInt ifr6_prefixlen$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifr6_prefixlen")});
    private static final long ifr6_prefixlen$OFFSET = 16L;
    private static final ValueLayout.OfInt ifr6_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifr6_ifindex")});
    private static final long ifr6_ifindex$OFFSET = 20L;

    in6_ifreq() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout ifr6_addr$layout() {
        return ifr6_addr$LAYOUT;
    }

    public static final long ifr6_addr$offset() {
        return 0L;
    }

    public static MemorySegment ifr6_addr(MemorySegment struct) {
        return struct.asSlice(0L, ifr6_addr$LAYOUT.byteSize());
    }

    public static void ifr6_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)ifr6_addr$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt ifr6_prefixlen$layout() {
        return ifr6_prefixlen$LAYOUT;
    }

    public static final long ifr6_prefixlen$offset() {
        return 16L;
    }

    public static int ifr6_prefixlen(MemorySegment struct) {
        return struct.get(ifr6_prefixlen$LAYOUT, 16L);
    }

    public static void ifr6_prefixlen(MemorySegment struct, int fieldValue) {
        struct.set(ifr6_prefixlen$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt ifr6_ifindex$layout() {
        return ifr6_ifindex$LAYOUT;
    }

    public static final long ifr6_ifindex$offset() {
        return 20L;
    }

    public static int ifr6_ifindex(MemorySegment struct) {
        return struct.get(ifr6_ifindex$LAYOUT, 20L);
    }

    public static void ifr6_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ifr6_ifindex$LAYOUT, 20L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(in6_ifreq.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return in6_ifreq.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)in6_ifreq.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)in6_ifreq.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return in6_ifreq.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(in6_ifreq.layout().byteSize() * elementCount, arena, cleanup);
    }
}

