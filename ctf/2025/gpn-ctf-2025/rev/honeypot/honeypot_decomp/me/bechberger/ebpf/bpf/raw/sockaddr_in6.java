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
 *  java.lang.foreign.ValueLayout$OfShort
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

public class sockaddr_in6 {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("sin6_family"), Lib.C_SHORT.withName("sin6_port"), Lib.C_INT.withName("sin6_flowinfo"), in6_addr.layout().withName("sin6_addr"), Lib.C_INT.withName("sin6_scope_id")}).withName("sockaddr_in6");
    private static final ValueLayout.OfShort sin6_family$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sin6_family")});
    private static final long sin6_family$OFFSET = 0L;
    private static final ValueLayout.OfShort sin6_port$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sin6_port")});
    private static final long sin6_port$OFFSET = 2L;
    private static final ValueLayout.OfInt sin6_flowinfo$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sin6_flowinfo")});
    private static final long sin6_flowinfo$OFFSET = 4L;
    private static final GroupLayout sin6_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sin6_addr")});
    private static final long sin6_addr$OFFSET = 8L;
    private static final ValueLayout.OfInt sin6_scope_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sin6_scope_id")});
    private static final long sin6_scope_id$OFFSET = 24L;

    sockaddr_in6() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort sin6_family$layout() {
        return sin6_family$LAYOUT;
    }

    public static final long sin6_family$offset() {
        return 0L;
    }

    public static short sin6_family(MemorySegment struct) {
        return struct.get(sin6_family$LAYOUT, 0L);
    }

    public static void sin6_family(MemorySegment struct, short fieldValue) {
        struct.set(sin6_family$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort sin6_port$layout() {
        return sin6_port$LAYOUT;
    }

    public static final long sin6_port$offset() {
        return 2L;
    }

    public static short sin6_port(MemorySegment struct) {
        return struct.get(sin6_port$LAYOUT, 2L);
    }

    public static void sin6_port(MemorySegment struct, short fieldValue) {
        struct.set(sin6_port$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfInt sin6_flowinfo$layout() {
        return sin6_flowinfo$LAYOUT;
    }

    public static final long sin6_flowinfo$offset() {
        return 4L;
    }

    public static int sin6_flowinfo(MemorySegment struct) {
        return struct.get(sin6_flowinfo$LAYOUT, 4L);
    }

    public static void sin6_flowinfo(MemorySegment struct, int fieldValue) {
        struct.set(sin6_flowinfo$LAYOUT, 4L, fieldValue);
    }

    public static final GroupLayout sin6_addr$layout() {
        return sin6_addr$LAYOUT;
    }

    public static final long sin6_addr$offset() {
        return 8L;
    }

    public static MemorySegment sin6_addr(MemorySegment struct) {
        return struct.asSlice(8L, sin6_addr$LAYOUT.byteSize());
    }

    public static void sin6_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)sin6_addr$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt sin6_scope_id$layout() {
        return sin6_scope_id$LAYOUT;
    }

    public static final long sin6_scope_id$offset() {
        return 24L;
    }

    public static int sin6_scope_id(MemorySegment struct) {
        return struct.get(sin6_scope_id$LAYOUT, 24L);
    }

    public static void sin6_scope_id(MemorySegment struct, int fieldValue) {
        struct.set(sin6_scope_id$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(sockaddr_in6.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return sockaddr_in6.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)sockaddr_in6.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sockaddr_in6.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return sockaddr_in6.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(sockaddr_in6.layout().byteSize() * elementCount, arena, cleanup);
    }
}

