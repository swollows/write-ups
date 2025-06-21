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
 *  java.lang.foreign.ValueLayout$OfLong
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

public class __atomic_wide_counter {
    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("__value64"), __value32.layout().withName("__value32")}).withName("$anon$25:9");
    private static final ValueLayout.OfLong __value64$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__value64")});
    private static final long __value64$OFFSET = 0L;
    private static final GroupLayout __value32$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__value32")});
    private static final long __value32$OFFSET = 0L;

    __atomic_wide_counter() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong __value64$layout() {
        return __value64$LAYOUT;
    }

    public static final long __value64$offset() {
        return 0L;
    }

    public static long __value64(MemorySegment union) {
        return union.get(__value64$LAYOUT, 0L);
    }

    public static void __value64(MemorySegment union, long fieldValue) {
        union.set(__value64$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout __value32$layout() {
        return __value32$LAYOUT;
    }

    public static final long __value32$offset() {
        return 0L;
    }

    public static MemorySegment __value32(MemorySegment union) {
        return union.asSlice(0L, __value32$LAYOUT.byteSize());
    }

    public static void __value32(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)__value32$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__atomic_wide_counter.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __atomic_wide_counter.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__atomic_wide_counter.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__atomic_wide_counter.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __atomic_wide_counter.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__atomic_wide_counter.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class __value32 {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("__low"), Lib.C_INT.withName("__high")}).withName("$anon$28:3");
        private static final ValueLayout.OfInt __low$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__low")});
        private static final long __low$OFFSET = 0L;
        private static final ValueLayout.OfInt __high$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__high")});
        private static final long __high$OFFSET = 4L;

        __value32() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt __low$layout() {
            return __low$LAYOUT;
        }

        public static final long __low$offset() {
            return 0L;
        }

        public static int __low(MemorySegment struct) {
            return struct.get(__low$LAYOUT, 0L);
        }

        public static void __low(MemorySegment struct, int fieldValue) {
            struct.set(__low$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt __high$layout() {
            return __high$LAYOUT;
        }

        public static final long __high$offset() {
            return 4L;
        }

        public static int __high(MemorySegment struct) {
            return struct.get(__high$LAYOUT, 4L);
        }

        public static void __high(MemorySegment struct, int fieldValue) {
            struct.set(__high$LAYOUT, 4L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(__value32.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return __value32.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)__value32.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__value32.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return __value32.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(__value32.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

