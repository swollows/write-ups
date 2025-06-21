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
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.in_addr;

public class ip_mreq {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in_addr.layout().withName("imr_multiaddr"), in_addr.layout().withName("imr_interface")}).withName("ip_mreq");
    private static final GroupLayout imr_multiaddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imr_multiaddr")});
    private static final long imr_multiaddr$OFFSET = 0L;
    private static final GroupLayout imr_interface$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imr_interface")});
    private static final long imr_interface$OFFSET = 4L;

    ip_mreq() {
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

    public static final GroupLayout imr_interface$layout() {
        return imr_interface$LAYOUT;
    }

    public static final long imr_interface$offset() {
        return 4L;
    }

    public static MemorySegment imr_interface(MemorySegment struct) {
        return struct.asSlice(4L, imr_interface$LAYOUT.byteSize());
    }

    public static void imr_interface(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)imr_interface$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ip_mreq.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ip_mreq.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ip_mreq.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip_mreq.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ip_mreq.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ip_mreq.layout().byteSize() * elementCount, arena, cleanup);
    }
}

