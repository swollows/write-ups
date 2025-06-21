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
import me.bechberger.ebpf.bpf.raw.__pthread_internal_list;

public class __pthread_mutex_s {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("__lock"), Lib.C_INT.withName("__count"), Lib.C_INT.withName("__owner"), Lib.C_INT.withName("__nusers"), Lib.C_INT.withName("__kind"), Lib.C_SHORT.withName("__spins"), Lib.C_SHORT.withName("__elision"), __pthread_internal_list.layout().withName("__list")}).withName("__pthread_mutex_s");
    private static final ValueLayout.OfInt __lock$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__lock")});
    private static final long __lock$OFFSET = 0L;
    private static final ValueLayout.OfInt __count$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__count")});
    private static final long __count$OFFSET = 4L;
    private static final ValueLayout.OfInt __owner$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__owner")});
    private static final long __owner$OFFSET = 8L;
    private static final ValueLayout.OfInt __nusers$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__nusers")});
    private static final long __nusers$OFFSET = 12L;
    private static final ValueLayout.OfInt __kind$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__kind")});
    private static final long __kind$OFFSET = 16L;
    private static final ValueLayout.OfShort __spins$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__spins")});
    private static final long __spins$OFFSET = 20L;
    private static final ValueLayout.OfShort __elision$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__elision")});
    private static final long __elision$OFFSET = 22L;
    private static final GroupLayout __list$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__list")});
    private static final long __list$OFFSET = 24L;

    __pthread_mutex_s() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt __lock$layout() {
        return __lock$LAYOUT;
    }

    public static final long __lock$offset() {
        return 0L;
    }

    public static int __lock(MemorySegment struct) {
        return struct.get(__lock$LAYOUT, 0L);
    }

    public static void __lock(MemorySegment struct, int fieldValue) {
        struct.set(__lock$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt __count$layout() {
        return __count$LAYOUT;
    }

    public static final long __count$offset() {
        return 4L;
    }

    public static int __count(MemorySegment struct) {
        return struct.get(__count$LAYOUT, 4L);
    }

    public static void __count(MemorySegment struct, int fieldValue) {
        struct.set(__count$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt __owner$layout() {
        return __owner$LAYOUT;
    }

    public static final long __owner$offset() {
        return 8L;
    }

    public static int __owner(MemorySegment struct) {
        return struct.get(__owner$LAYOUT, 8L);
    }

    public static void __owner(MemorySegment struct, int fieldValue) {
        struct.set(__owner$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt __nusers$layout() {
        return __nusers$LAYOUT;
    }

    public static final long __nusers$offset() {
        return 12L;
    }

    public static int __nusers(MemorySegment struct) {
        return struct.get(__nusers$LAYOUT, 12L);
    }

    public static void __nusers(MemorySegment struct, int fieldValue) {
        struct.set(__nusers$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt __kind$layout() {
        return __kind$LAYOUT;
    }

    public static final long __kind$offset() {
        return 16L;
    }

    public static int __kind(MemorySegment struct) {
        return struct.get(__kind$LAYOUT, 16L);
    }

    public static void __kind(MemorySegment struct, int fieldValue) {
        struct.set(__kind$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfShort __spins$layout() {
        return __spins$LAYOUT;
    }

    public static final long __spins$offset() {
        return 20L;
    }

    public static short __spins(MemorySegment struct) {
        return struct.get(__spins$LAYOUT, 20L);
    }

    public static void __spins(MemorySegment struct, short fieldValue) {
        struct.set(__spins$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfShort __elision$layout() {
        return __elision$LAYOUT;
    }

    public static final long __elision$offset() {
        return 22L;
    }

    public static short __elision(MemorySegment struct) {
        return struct.get(__elision$LAYOUT, 22L);
    }

    public static void __elision(MemorySegment struct, short fieldValue) {
        struct.set(__elision$LAYOUT, 22L, fieldValue);
    }

    public static final GroupLayout __list$layout() {
        return __list$LAYOUT;
    }

    public static final long __list$offset() {
        return 24L;
    }

    public static MemorySegment __list(MemorySegment struct) {
        return struct.asSlice(24L, __list$LAYOUT.byteSize());
    }

    public static void __list(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)24L, (long)__list$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__pthread_mutex_s.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __pthread_mutex_s.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__pthread_mutex_s.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__pthread_mutex_s.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __pthread_mutex_s.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__pthread_mutex_s.layout().byteSize() * elementCount, arena, cleanup);
    }
}

