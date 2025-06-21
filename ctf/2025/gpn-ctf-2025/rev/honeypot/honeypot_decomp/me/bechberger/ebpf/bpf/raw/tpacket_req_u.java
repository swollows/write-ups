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
import me.bechberger.ebpf.bpf.raw.tpacket_req;
import me.bechberger.ebpf.bpf.raw.tpacket_req3;

public class tpacket_req_u {
    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{tpacket_req.layout().withName("req"), tpacket_req3.layout().withName("req3")}).withName("tpacket_req_u");
    private static final GroupLayout req$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"req")});
    private static final long req$OFFSET = 0L;
    private static final GroupLayout req3$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"req3")});
    private static final long req3$OFFSET = 0L;

    tpacket_req_u() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout req$layout() {
        return req$LAYOUT;
    }

    public static final long req$offset() {
        return 0L;
    }

    public static MemorySegment req(MemorySegment union) {
        return union.asSlice(0L, req$LAYOUT.byteSize());
    }

    public static void req(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)req$LAYOUT.byteSize());
    }

    public static final GroupLayout req3$layout() {
        return req3$LAYOUT;
    }

    public static final long req3$offset() {
        return 0L;
    }

    public static MemorySegment req3(MemorySegment union) {
        return union.asSlice(0L, req3$LAYOUT.byteSize());
    }

    public static void req3(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)req3$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tpacket_req_u.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tpacket_req_u.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tpacket_req_u.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tpacket_req_u.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tpacket_req_u.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tpacket_req_u.layout().byteSize() * elementCount, arena, cleanup);
    }
}

