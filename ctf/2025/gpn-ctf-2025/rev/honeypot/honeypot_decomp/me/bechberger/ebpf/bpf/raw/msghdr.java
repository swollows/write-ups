/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.AddressLayout
 *  java.lang.foreign.Arena
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class msghdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("msg_name"), Lib.C_INT.withName("msg_namelen"), MemoryLayout.paddingLayout((long)4L), Lib.C_POINTER.withName("msg_iov"), Lib.C_LONG.withName("msg_iovlen"), Lib.C_POINTER.withName("msg_control"), Lib.C_LONG.withName("msg_controllen"), Lib.C_INT.withName("msg_flags"), MemoryLayout.paddingLayout((long)4L)}).withName("msghdr");
    private static final AddressLayout msg_name$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_name")});
    private static final long msg_name$OFFSET = 0L;
    private static final ValueLayout.OfInt msg_namelen$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_namelen")});
    private static final long msg_namelen$OFFSET = 8L;
    private static final AddressLayout msg_iov$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_iov")});
    private static final long msg_iov$OFFSET = 16L;
    private static final ValueLayout.OfLong msg_iovlen$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_iovlen")});
    private static final long msg_iovlen$OFFSET = 24L;
    private static final AddressLayout msg_control$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_control")});
    private static final long msg_control$OFFSET = 32L;
    private static final ValueLayout.OfLong msg_controllen$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_controllen")});
    private static final long msg_controllen$OFFSET = 40L;
    private static final ValueLayout.OfInt msg_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_flags")});
    private static final long msg_flags$OFFSET = 48L;

    msghdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final AddressLayout msg_name$layout() {
        return msg_name$LAYOUT;
    }

    public static final long msg_name$offset() {
        return 0L;
    }

    public static MemorySegment msg_name(MemorySegment struct) {
        return struct.get(msg_name$LAYOUT, 0L);
    }

    public static void msg_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(msg_name$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt msg_namelen$layout() {
        return msg_namelen$LAYOUT;
    }

    public static final long msg_namelen$offset() {
        return 8L;
    }

    public static int msg_namelen(MemorySegment struct) {
        return struct.get(msg_namelen$LAYOUT, 8L);
    }

    public static void msg_namelen(MemorySegment struct, int fieldValue) {
        struct.set(msg_namelen$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout msg_iov$layout() {
        return msg_iov$LAYOUT;
    }

    public static final long msg_iov$offset() {
        return 16L;
    }

    public static MemorySegment msg_iov(MemorySegment struct) {
        return struct.get(msg_iov$LAYOUT, 16L);
    }

    public static void msg_iov(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(msg_iov$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfLong msg_iovlen$layout() {
        return msg_iovlen$LAYOUT;
    }

    public static final long msg_iovlen$offset() {
        return 24L;
    }

    public static long msg_iovlen(MemorySegment struct) {
        return struct.get(msg_iovlen$LAYOUT, 24L);
    }

    public static void msg_iovlen(MemorySegment struct, long fieldValue) {
        struct.set(msg_iovlen$LAYOUT, 24L, fieldValue);
    }

    public static final AddressLayout msg_control$layout() {
        return msg_control$LAYOUT;
    }

    public static final long msg_control$offset() {
        return 32L;
    }

    public static MemorySegment msg_control(MemorySegment struct) {
        return struct.get(msg_control$LAYOUT, 32L);
    }

    public static void msg_control(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(msg_control$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfLong msg_controllen$layout() {
        return msg_controllen$LAYOUT;
    }

    public static final long msg_controllen$offset() {
        return 40L;
    }

    public static long msg_controllen(MemorySegment struct) {
        return struct.get(msg_controllen$LAYOUT, 40L);
    }

    public static void msg_controllen(MemorySegment struct, long fieldValue) {
        struct.set(msg_controllen$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt msg_flags$layout() {
        return msg_flags$LAYOUT;
    }

    public static final long msg_flags$offset() {
        return 48L;
    }

    public static int msg_flags(MemorySegment struct) {
        return struct.get(msg_flags$LAYOUT, 48L);
    }

    public static void msg_flags(MemorySegment struct, int fieldValue) {
        struct.set(msg_flags$LAYOUT, 48L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(msghdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return msghdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)msghdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)msghdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return msghdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(msghdr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

