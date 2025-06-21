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

public class bpf_cpumap_val {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("qsize"), bpf_prog.layout().withName("bpf_prog")}).withName("bpf_cpumap_val");
    private static final ValueLayout.OfInt qsize$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"qsize")});
    private static final long qsize$OFFSET = 0L;
    private static final GroupLayout bpf_prog$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bpf_prog")});
    private static final long bpf_prog$OFFSET = 4L;

    bpf_cpumap_val() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt qsize$layout() {
        return qsize$LAYOUT;
    }

    public static final long qsize$offset() {
        return 0L;
    }

    public static int qsize(MemorySegment struct) {
        return struct.get(qsize$LAYOUT, 0L);
    }

    public static void qsize(MemorySegment struct, int fieldValue) {
        struct.set(qsize$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout bpf_prog$layout() {
        return bpf_prog$LAYOUT;
    }

    public static final long bpf_prog$offset() {
        return 4L;
    }

    public static MemorySegment bpf_prog(MemorySegment struct) {
        return struct.asSlice(4L, bpf_prog$LAYOUT.byteSize());
    }

    public static void bpf_prog(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)bpf_prog$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_cpumap_val.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_cpumap_val.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_cpumap_val.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_cpumap_val.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_cpumap_val.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_cpumap_val.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class bpf_prog {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("fd"), Lib.C_INT.withName("id")}).withName("$anon$6490:2");
        private static final ValueLayout.OfInt fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"fd")});
        private static final long fd$OFFSET = 0L;
        private static final ValueLayout.OfInt id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"id")});
        private static final long id$OFFSET = 0L;

        bpf_prog() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt fd$layout() {
            return fd$LAYOUT;
        }

        public static final long fd$offset() {
            return 0L;
        }

        public static int fd(MemorySegment union) {
            return union.get(fd$LAYOUT, 0L);
        }

        public static void fd(MemorySegment union, int fieldValue) {
            union.set(fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt id$layout() {
            return id$LAYOUT;
        }

        public static final long id$offset() {
            return 0L;
        }

        public static int id(MemorySegment union) {
            return union.get(id$LAYOUT, 0L);
        }

        public static void id(MemorySegment union, int fieldValue) {
            union.set(id$LAYOUT, 0L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(bpf_prog.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return bpf_prog.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)bpf_prog.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_prog.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return bpf_prog.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(bpf_prog.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

