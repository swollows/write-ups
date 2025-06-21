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
import me.bechberger.ebpf.bpf.raw.in_addr;

public class ip_mreqn {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in_addr.layout().withName("imr_multiaddr"), in_addr.layout().withName("imr_address"), Lib.C_INT.withName("imr_ifindex")}).withName("ip_mreqn");
    private static final GroupLayout imr_multiaddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imr_multiaddr")});
    private static final long imr_multiaddr$OFFSET = 0L;
    private static final GroupLayout imr_address$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imr_address")});
    private static final long imr_address$OFFSET = 4L;
    private static final ValueLayout.OfInt imr_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imr_ifindex")});
    private static final long imr_ifindex$OFFSET = 8L;

    ip_mreqn() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout imr_multiaddr$layout() {
        return imr_multiaddr$LAYOUT;
    }

    public static final long imr_multiaddr$offset() {
        return 0L;
    }

    public static MemorySegment imr_multiaddr(MemorySegment struct) {
        return struct.asSlice(0L, imr_multiaddr$LAYOUT.byteSize());
    }

    public static void imr_multiaddr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)imr_multiaddr$LAYOUT.byteSize());
    }

    public static final GroupLayout imr_address$layout() {
        return imr_address$LAYOUT;
    }

    public static final long imr_address$offset() {
        return 4L;
    }

    public static MemorySegment imr_address(MemorySegment struct) {
        return struct.asSlice(4L, imr_address$LAYOUT.byteSize());
    }

    public static void imr_address(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)imr_address$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt imr_ifindex$layout() {
        return imr_ifindex$LAYOUT;
    }

    public static final long imr_ifindex$offset() {
        return 8L;
    }

    public static int imr_ifindex(MemorySegment struct) {
        return struct.get(imr_ifindex$LAYOUT, 8L);
    }

    public static void imr_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(imr_ifindex$LAYOUT, 8L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ip_mreqn.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ip_mreqn.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ip_mreqn.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip_mreqn.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ip_mreqn.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ip_mreqn.layout().byteSize() * elementCount, arena, cleanup);
    }
}

