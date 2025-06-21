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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class __mbstate_t {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("__count"), __value.layout().withName("__value")}).withName("$anon$13:9");
    private static final ValueLayout.OfInt __count$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__count")});
    private static final long __count$OFFSET = 0L;
    private static final GroupLayout __value$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__value")});
    private static final long __value$OFFSET = 4L;

    __mbstate_t() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt __count$layout() {
        return __count$LAYOUT;
    }

    public static final long __count$offset() {
        return 0L;
    }

    public static int __count(MemorySegment struct) {
        return struct.get(__count$LAYOUT, 0L);
    }

    public static void __count(MemorySegment struct, int fieldValue) {
        struct.set(__count$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout __value$layout() {
        return __value$LAYOUT;
    }

    public static final long __value$offset() {
        return 4L;
    }

    public static MemorySegment __value(MemorySegment struct) {
        return struct.asSlice(4L, __value$LAYOUT.byteSize());
    }

    public static void __value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)__value$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__mbstate_t.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __mbstate_t.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__mbstate_t.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__mbstate_t.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __mbstate_t.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__mbstate_t.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class __value {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("__wch"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_CHAR).withName("__wchb")}).withName("$anon$16:3");
        private static final ValueLayout.OfInt __wch$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__wch")});
        private static final long __wch$OFFSET = 0L;
        private static final SequenceLayout __wchb$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__wchb")});
        private static final long __wchb$OFFSET = 0L;
        private static long[] __wchb$DIMS = new long[]{4L};
        private static final VarHandle __wchb$ELEM_HANDLE = __wchb$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

        __value() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt __wch$layout() {
            return __wch$LAYOUT;
        }

        public static final long __wch$offset() {
            return 0L;
        }

        public static int __wch(MemorySegment union) {
            return union.get(__wch$LAYOUT, 0L);
        }

        public static void __wch(MemorySegment union, int fieldValue) {
            union.set(__wch$LAYOUT, 0L, fieldValue);
        }

        public static final SequenceLayout __wchb$layout() {
            return __wchb$LAYOUT;
        }

        public static final long __wchb$offset() {
            return 0L;
        }

        public static MemorySegment __wchb(MemorySegment union) {
            return union.asSlice(0L, __wchb$LAYOUT.byteSize());
        }

        public static void __wchb(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)__wchb$LAYOUT.byteSize());
        }

        public static long[] __wchb$dimensions() {
            return __wchb$DIMS;
        }

        public static byte __wchb(MemorySegment union, long index0) {
            return __wchb$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void __wchb(MemorySegment union, long index0, byte fieldValue) {
            __wchb$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(__value.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return __value.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)__value.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__value.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return __value.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(__value.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

