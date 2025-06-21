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
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class in6_addr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in6_u.layout().withName("in6_u")}).withName("in6_addr");
    private static final GroupLayout in6_u$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"in6_u")});
    private static final long in6_u$OFFSET = 0L;

    in6_addr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout in6_u$layout() {
        return in6_u$LAYOUT;
    }

    public static final long in6_u$offset() {
        return 0L;
    }

    public static MemorySegment in6_u(MemorySegment struct) {
        return struct.asSlice(0L, in6_u$LAYOUT.byteSize());
    }

    public static void in6_u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)in6_u$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(in6_addr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return in6_addr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)in6_addr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)in6_addr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return in6_addr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(in6_addr.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class in6_u {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("u6_addr8"), MemoryLayout.sequenceLayout((long)8L, (MemoryLayout)Lib.C_SHORT).withName("u6_addr16"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("u6_addr32")}).withName("$anon$34:2");
        private static final SequenceLayout u6_addr8$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"u6_addr8")});
        private static final long u6_addr8$OFFSET = 0L;
        private static long[] u6_addr8$DIMS = new long[]{16L};
        private static final VarHandle u6_addr8$ELEM_HANDLE = u6_addr8$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final SequenceLayout u6_addr16$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"u6_addr16")});
        private static final long u6_addr16$OFFSET = 0L;
        private static long[] u6_addr16$DIMS = new long[]{8L};
        private static final VarHandle u6_addr16$ELEM_HANDLE = u6_addr16$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final SequenceLayout u6_addr32$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"u6_addr32")});
        private static final long u6_addr32$OFFSET = 0L;
        private static long[] u6_addr32$DIMS = new long[]{4L};
        private static final VarHandle u6_addr32$ELEM_HANDLE = u6_addr32$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

        in6_u() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final SequenceLayout u6_addr8$layout() {
            return u6_addr8$LAYOUT;
        }

        public static final long u6_addr8$offset() {
            return 0L;
        }

        public static MemorySegment u6_addr8(MemorySegment union) {
            return union.asSlice(0L, u6_addr8$LAYOUT.byteSize());
        }

        public static void u6_addr8(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)u6_addr8$LAYOUT.byteSize());
        }

        public static long[] u6_addr8$dimensions() {
            return u6_addr8$DIMS;
        }

        public static byte u6_addr8(MemorySegment union, long index0) {
            return u6_addr8$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void u6_addr8(MemorySegment union, long index0, byte fieldValue) {
            u6_addr8$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static final SequenceLayout u6_addr16$layout() {
            return u6_addr16$LAYOUT;
        }

        public static final long u6_addr16$offset() {
            return 0L;
        }

        public static MemorySegment u6_addr16(MemorySegment union) {
            return union.asSlice(0L, u6_addr16$LAYOUT.byteSize());
        }

        public static void u6_addr16(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)u6_addr16$LAYOUT.byteSize());
        }

        public static long[] u6_addr16$dimensions() {
            return u6_addr16$DIMS;
        }

        public static short u6_addr16(MemorySegment union, long index0) {
            return u6_addr16$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void u6_addr16(MemorySegment union, long index0, short fieldValue) {
            u6_addr16$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static final SequenceLayout u6_addr32$layout() {
            return u6_addr32$LAYOUT;
        }

        public static final long u6_addr32$offset() {
            return 0L;
        }

        public static MemorySegment u6_addr32(MemorySegment union) {
            return union.asSlice(0L, u6_addr32$LAYOUT.byteSize());
        }

        public static void u6_addr32(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)u6_addr32$LAYOUT.byteSize());
        }

        public static long[] u6_addr32$dimensions() {
            return u6_addr32$DIMS;
        }

        public static int u6_addr32(MemorySegment union, long index0) {
            return u6_addr32$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void u6_addr32(MemorySegment union, long index0, int fieldValue) {
            u6_addr32$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(in6_u.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return in6_u.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)in6_u.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)in6_u.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return in6_u.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(in6_u.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

