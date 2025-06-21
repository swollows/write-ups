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

public class bpf_iter_link_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{map.layout().withName("map"), cgroup.layout().withName("cgroup"), task.layout().withName("task")}).withName("bpf_iter_link_info");
    private static final GroupLayout map$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map")});
    private static final long map$OFFSET = 0L;
    private static final GroupLayout cgroup$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cgroup")});
    private static final long cgroup$OFFSET = 0L;
    private static final GroupLayout task$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"task")});
    private static final long task$OFFSET = 0L;

    bpf_iter_link_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout map$layout() {
        return map$LAYOUT;
    }

    public static final long map$offset() {
        return 0L;
    }

    public static MemorySegment map(MemorySegment union) {
        return union.asSlice(0L, map$LAYOUT.byteSize());
    }

    public static void map(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)map$LAYOUT.byteSize());
    }

    public static final GroupLayout cgroup$layout() {
        return cgroup$LAYOUT;
    }

    public static final long cgroup$offset() {
        return 0L;
    }

    public static MemorySegment cgroup(MemorySegment union) {
        return union.asSlice(0L, cgroup$LAYOUT.byteSize());
    }

    public static void cgroup(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)cgroup$LAYOUT.byteSize());
    }

    public static final GroupLayout task$layout() {
        return task$LAYOUT;
    }

    public static final long task$offset() {
        return 0L;
    }

    public static MemorySegment task(MemorySegment union) {
        return union.asSlice(0L, task$LAYOUT.byteSize());
    }

    public static void task(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)task$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_iter_link_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_iter_link_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_iter_link_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_iter_link_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_iter_link_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_iter_link_info.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class map {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("map_fd")}).withName("$anon$122:2");
        private static final ValueLayout.OfInt map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_fd")});
        private static final long map_fd$OFFSET = 0L;

        map() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt map_fd$layout() {
            return map_fd$LAYOUT;
        }

        public static final long map_fd$offset() {
            return 0L;
        }

        public static int map_fd(MemorySegment struct) {
            return struct.get(map_fd$LAYOUT, 0L);
        }

        public static void map_fd(MemorySegment struct, int fieldValue) {
            struct.set(map_fd$LAYOUT, 0L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(map.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return map.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)map.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)map.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return map.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(map.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class cgroup {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("order"), Lib.C_INT.withName("cgroup_fd"), Lib.C_LONG_LONG.withName("cgroup_id")}).withName("$anon$125:2");
        private static final ValueLayout.OfInt order$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"order")});
        private static final long order$OFFSET = 0L;
        private static final ValueLayout.OfInt cgroup_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cgroup_fd")});
        private static final long cgroup_fd$OFFSET = 4L;
        private static final ValueLayout.OfLong cgroup_id$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cgroup_id")});
        private static final long cgroup_id$OFFSET = 8L;

        cgroup() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt order$layout() {
            return order$LAYOUT;
        }

        public static final long order$offset() {
            return 0L;
        }

        public static int order(MemorySegment struct) {
            return struct.get(order$LAYOUT, 0L);
        }

        public static void order(MemorySegment struct, int fieldValue) {
            struct.set(order$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt cgroup_fd$layout() {
            return cgroup_fd$LAYOUT;
        }

        public static final long cgroup_fd$offset() {
            return 4L;
        }

        public static int cgroup_fd(MemorySegment struct) {
            return struct.get(cgroup_fd$LAYOUT, 4L);
        }

        public static void cgroup_fd(MemorySegment struct, int fieldValue) {
            struct.set(cgroup_fd$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfLong cgroup_id$layout() {
            return cgroup_id$LAYOUT;
        }

        public static final long cgroup_id$offset() {
            return 8L;
        }

        public static long cgroup_id(MemorySegment struct) {
            return struct.get(cgroup_id$LAYOUT, 8L);
        }

        public static void cgroup_id(MemorySegment struct, long fieldValue) {
            struct.set(cgroup_id$LAYOUT, 8L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(cgroup.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return cgroup.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)cgroup.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)cgroup.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return cgroup.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(cgroup.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class task {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("tid"), Lib.C_INT.withName("pid"), Lib.C_INT.withName("pid_fd")}).withName("$anon$137:2");
        private static final ValueLayout.OfInt tid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tid")});
        private static final long tid$OFFSET = 0L;
        private static final ValueLayout.OfInt pid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pid")});
        private static final long pid$OFFSET = 4L;
        private static final ValueLayout.OfInt pid_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pid_fd")});
        private static final long pid_fd$OFFSET = 8L;

        task() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt tid$layout() {
            return tid$LAYOUT;
        }

        public static final long tid$offset() {
            return 0L;
        }

        public static int tid(MemorySegment struct) {
            return struct.get(tid$LAYOUT, 0L);
        }

        public static void tid(MemorySegment struct, int fieldValue) {
            struct.set(tid$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt pid$layout() {
            return pid$LAYOUT;
        }

        public static final long pid$offset() {
            return 4L;
        }

        public static int pid(MemorySegment struct) {
            return struct.get(pid$LAYOUT, 4L);
        }

        public static void pid(MemorySegment struct, int fieldValue) {
            struct.set(pid$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt pid_fd$layout() {
            return pid_fd$LAYOUT;
        }

        public static final long pid_fd$offset() {
            return 8L;
        }

        public static int pid_fd(MemorySegment struct) {
            return struct.get(pid_fd$LAYOUT, 8L);
        }

        public static void pid_fd(MemorySegment struct, int fieldValue) {
            struct.set(pid_fd$LAYOUT, 8L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(task.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return task.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)task.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)task.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return task.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(task.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

