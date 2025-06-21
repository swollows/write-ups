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

public class ifconf {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ifc_len"), MemoryLayout.paddingLayout((long)4L), ifc_ifcu.layout().withName("ifc_ifcu")}).withName("ifconf");
    private static final ValueLayout.OfInt ifc_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifc_len")});
    private static final long ifc_len$OFFSET = 0L;
    private static final GroupLayout ifc_ifcu$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifc_ifcu")});
    private static final long ifc_ifcu$OFFSET = 8L;

    ifconf() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt ifc_len$layout() {
        return ifc_len$LAYOUT;
    }

    public static final long ifc_len$offset() {
        return 0L;
    }

    public static int ifc_len(MemorySegment struct) {
        return struct.get(ifc_len$LAYOUT, 0L);
    }

    public static void ifc_len(MemorySegment struct, int fieldValue) {
        struct.set(ifc_len$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout ifc_ifcu$layout() {
        return ifc_ifcu$LAYOUT;
    }

    public static final long ifc_ifcu$offset() {
        return 8L;
    }

    public static MemorySegment ifc_ifcu(MemorySegment struct) {
        return struct.asSlice(8L, ifc_ifcu$LAYOUT.byteSize());
    }

    public static void ifc_ifcu(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)ifc_ifcu$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ifconf.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ifconf.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ifconf.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ifconf.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ifconf.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ifconf.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class ifc_ifcu {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("ifcu_buf"), Lib.C_POINTER.withName("ifcu_req")}).withName("$anon$286:2");
        private static final AddressLayout ifcu_buf$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifcu_buf")});
        private static final long ifcu_buf$OFFSET = 0L;
        private static final AddressLayout ifcu_req$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifcu_req")});
        private static final long ifcu_req$OFFSET = 0L;

        ifc_ifcu() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final AddressLayout ifcu_buf$layout() {
            return ifcu_buf$LAYOUT;
        }

        public static final long ifcu_buf$offset() {
            return 0L;
        }

        public static MemorySegment ifcu_buf(MemorySegment union) {
            return union.get(ifcu_buf$LAYOUT, 0L);
        }

        public static void ifcu_buf(MemorySegment union, MemorySegment fieldValue) {
            union.set(ifcu_buf$LAYOUT, 0L, fieldValue);
        }

        public static final AddressLayout ifcu_req$layout() {
            return ifcu_req$LAYOUT;
        }

        public static final long ifcu_req$offset() {
            return 0L;
        }

        public static MemorySegment ifcu_req(MemorySegment union) {
            return union.get(ifcu_req$LAYOUT, 0L);
        }

        public static void ifcu_req(MemorySegment union, MemorySegment fieldValue) {
            union.set(ifcu_req$LAYOUT, 0L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(ifc_ifcu.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return ifc_ifcu.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)ifc_ifcu.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ifc_ifcu.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return ifc_ifcu.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(ifc_ifcu.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

