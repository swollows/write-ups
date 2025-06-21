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

public class ip_msfilter {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("imsf_multiaddr"), Lib.C_INT.withName("imsf_interface"), Lib.C_INT.withName("imsf_fmode"), Lib.C_INT.withName("imsf_numsrc"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)1L, (MemoryLayout)Lib.C_INT).withName("imsf_slist"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{__empty_imsf_slist_flex.layout().withName("__empty_imsf_slist_flex"), MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)Lib.C_INT).withName("imsf_slist_flex")}).withName("$anon$206:3")}).withName("$anon$204:2")}).withName("ip_msfilter");
    private static final ValueLayout.OfInt imsf_multiaddr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imsf_multiaddr")});
    private static final long imsf_multiaddr$OFFSET = 0L;
    private static final ValueLayout.OfInt imsf_interface$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imsf_interface")});
    private static final long imsf_interface$OFFSET = 4L;
    private static final ValueLayout.OfInt imsf_fmode$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imsf_fmode")});
    private static final long imsf_fmode$OFFSET = 8L;
    private static final ValueLayout.OfInt imsf_numsrc$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"imsf_numsrc")});
    private static final long imsf_numsrc$OFFSET = 12L;
    private static final SequenceLayout imsf_slist$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$204:2"), MemoryLayout.PathElement.groupElement((String)"imsf_slist")});
    private static final long imsf_slist$OFFSET = 16L;
    private static long[] imsf_slist$DIMS = new long[]{1L};
    private static final VarHandle imsf_slist$ELEM_HANDLE = imsf_slist$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final GroupLayout __empty_imsf_slist_flex$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$204:2"), MemoryLayout.PathElement.groupElement((String)"$anon$206:3"), MemoryLayout.PathElement.groupElement((String)"__empty_imsf_slist_flex")});
    private static final long __empty_imsf_slist_flex$OFFSET = 16L;
    private static final SequenceLayout imsf_slist_flex$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$204:2"), MemoryLayout.PathElement.groupElement((String)"$anon$206:3"), MemoryLayout.PathElement.groupElement((String)"imsf_slist_flex")});
    private static final long imsf_slist_flex$OFFSET = 16L;

    ip_msfilter() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt imsf_multiaddr$layout() {
        return imsf_multiaddr$LAYOUT;
    }

    public static final long imsf_multiaddr$offset() {
        return 0L;
    }

    public static int imsf_multiaddr(MemorySegment struct) {
        return struct.get(imsf_multiaddr$LAYOUT, 0L);
    }

    public static void imsf_multiaddr(MemorySegment struct, int fieldValue) {
        struct.set(imsf_multiaddr$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt imsf_interface$layout() {
        return imsf_interface$LAYOUT;
    }

    public static final long imsf_interface$offset() {
        return 4L;
    }

    public static int imsf_interface(MemorySegment struct) {
        return struct.get(imsf_interface$LAYOUT, 4L);
    }

    public static void imsf_interface(MemorySegment struct, int fieldValue) {
        struct.set(imsf_interface$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt imsf_fmode$layout() {
        return imsf_fmode$LAYOUT;
    }

    public static final long imsf_fmode$offset() {
        return 8L;
    }

    public static int imsf_fmode(MemorySegment struct) {
        return struct.get(imsf_fmode$LAYOUT, 8L);
    }

    public static void imsf_fmode(MemorySegment struct, int fieldValue) {
        struct.set(imsf_fmode$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt imsf_numsrc$layout() {
        return imsf_numsrc$LAYOUT;
    }

    public static final long imsf_numsrc$offset() {
        return 12L;
    }

    public static int imsf_numsrc(MemorySegment struct) {
        return struct.get(imsf_numsrc$LAYOUT, 12L);
    }

    public static void imsf_numsrc(MemorySegment struct, int fieldValue) {
        struct.set(imsf_numsrc$LAYOUT, 12L, fieldValue);
    }

    public static final SequenceLayout imsf_slist$layout() {
        return imsf_slist$LAYOUT;
    }

    public static final long imsf_slist$offset() {
        return 16L;
    }

    public static MemorySegment imsf_slist(MemorySegment struct) {
        return struct.asSlice(16L, imsf_slist$LAYOUT.byteSize());
    }

    public static void imsf_slist(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)imsf_slist$LAYOUT.byteSize());
    }

    public static long[] imsf_slist$dimensions() {
        return imsf_slist$DIMS;
    }

    public static int imsf_slist(MemorySegment struct, long index0) {
        return imsf_slist$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void imsf_slist(MemorySegment struct, long index0, int fieldValue) {
        imsf_slist$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final GroupLayout __empty_imsf_slist_flex$layout() {
        return __empty_imsf_slist_flex$LAYOUT;
    }

    public static final long __empty_imsf_slist_flex$offset() {
        return 16L;
    }

    public static MemorySegment __empty_imsf_slist_flex(MemorySegment struct) {
        return struct.asSlice(16L, __empty_imsf_slist_flex$LAYOUT.byteSize());
    }

    public static void __empty_imsf_slist_flex(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)__empty_imsf_slist_flex$LAYOUT.byteSize());
    }

    public static final SequenceLayout imsf_slist_flex$layout() {
        return imsf_slist_flex$LAYOUT;
    }

    public static final long imsf_slist_flex$offset() {
        return 16L;
    }

    public static MemorySegment imsf_slist_flex(MemorySegment struct) {
        return struct.asSlice(16L, imsf_slist_flex$LAYOUT.byteSize());
    }

    public static void imsf_slist_flex(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)imsf_slist_flex$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ip_msfilter.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ip_msfilter.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ip_msfilter.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip_msfilter.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ip_msfilter.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ip_msfilter.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class __empty_imsf_slist_flex {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[0]).withName("$anon$206:3");

        __empty_imsf_slist_flex() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(__empty_imsf_slist_flex.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return __empty_imsf_slist_flex.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)__empty_imsf_slist_flex.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__empty_imsf_slist_flex.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return __empty_imsf_slist_flex.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(__empty_imsf_slist_flex.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

