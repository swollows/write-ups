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

public class bpf_link_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("type"), Lib.C_INT.withName("id"), Lib.C_INT.withName("prog_id"), MemoryLayout.paddingLayout((long)4L), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{raw_tracepoint.layout().withName("raw_tracepoint"), tracing.layout().withName("tracing"), cgroup.layout().withName("cgroup"), iter.layout().withName("iter"), netns.layout().withName("netns"), xdp.layout().withName("xdp"), struct_ops.layout().withName("struct_ops"), netfilter.layout().withName("netfilter"), kprobe_multi.layout().withName("kprobe_multi"), uprobe_multi.layout().withName("uprobe_multi"), perf_event.layout().withName("perf_event"), tcx.layout().withName("tcx"), netkit.layout().withName("netkit"), sockmap.layout().withName("sockmap")}).withName("$anon$6635:2")}).withName("bpf_link_info");
    private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 0L;
    private static final ValueLayout.OfInt id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"id")});
    private static final long id$OFFSET = 4L;
    private static final ValueLayout.OfInt prog_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_id")});
    private static final long prog_id$OFFSET = 8L;
    private static final GroupLayout raw_tracepoint$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"raw_tracepoint")});
    private static final long raw_tracepoint$OFFSET = 16L;
    private static final GroupLayout tracing$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"tracing")});
    private static final long tracing$OFFSET = 16L;
    private static final GroupLayout cgroup$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"cgroup")});
    private static final long cgroup$OFFSET = 16L;
    private static final GroupLayout iter$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"iter")});
    private static final long iter$OFFSET = 16L;
    private static final GroupLayout netns$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"netns")});
    private static final long netns$OFFSET = 16L;
    private static final GroupLayout xdp$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"xdp")});
    private static final long xdp$OFFSET = 16L;
    private static final GroupLayout struct_ops$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"struct_ops")});
    private static final long struct_ops$OFFSET = 16L;
    private static final GroupLayout netfilter$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"netfilter")});
    private static final long netfilter$OFFSET = 16L;
    private static final GroupLayout kprobe_multi$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"kprobe_multi")});
    private static final long kprobe_multi$OFFSET = 16L;
    private static final GroupLayout uprobe_multi$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"uprobe_multi")});
    private static final long uprobe_multi$OFFSET = 16L;
    private static final GroupLayout perf_event$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"perf_event")});
    private static final long perf_event$OFFSET = 16L;
    private static final GroupLayout tcx$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"tcx")});
    private static final long tcx$OFFSET = 16L;
    private static final GroupLayout netkit$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"netkit")});
    private static final long netkit$OFFSET = 16L;
    private static final GroupLayout sockmap$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6635:2"), MemoryLayout.PathElement.groupElement((String)"sockmap")});
    private static final long sockmap$OFFSET = 16L;

    bpf_link_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 0L;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 0L);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt id$layout() {
        return id$LAYOUT;
    }

    public static final long id$offset() {
        return 4L;
    }

    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, 4L);
    }

    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_id$layout() {
        return prog_id$LAYOUT;
    }

    public static final long prog_id$offset() {
        return 8L;
    }

    public static int prog_id(MemorySegment struct) {
        return struct.get(prog_id$LAYOUT, 8L);
    }

    public static void prog_id(MemorySegment struct, int fieldValue) {
        struct.set(prog_id$LAYOUT, 8L, fieldValue);
    }

    public static final GroupLayout raw_tracepoint$layout() {
        return raw_tracepoint$LAYOUT;
    }

    public static final long raw_tracepoint$offset() {
        return 16L;
    }

    public static MemorySegment raw_tracepoint(MemorySegment struct) {
        return struct.asSlice(16L, raw_tracepoint$LAYOUT.byteSize());
    }

    public static void raw_tracepoint(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)raw_tracepoint$LAYOUT.byteSize());
    }

    public static final GroupLayout tracing$layout() {
        return tracing$LAYOUT;
    }

    public static final long tracing$offset() {
        return 16L;
    }

    public static MemorySegment tracing(MemorySegment struct) {
        return struct.asSlice(16L, tracing$LAYOUT.byteSize());
    }

    public static void tracing(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)tracing$LAYOUT.byteSize());
    }

    public static final GroupLayout cgroup$layout() {
        return cgroup$LAYOUT;
    }

    public static final long cgroup$offset() {
        return 16L;
    }

    public static MemorySegment cgroup(MemorySegment struct) {
        return struct.asSlice(16L, cgroup$LAYOUT.byteSize());
    }

    public static void cgroup(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)cgroup$LAYOUT.byteSize());
    }

    public static final GroupLayout iter$layout() {
        return iter$LAYOUT;
    }

    public static final long iter$offset() {
        return 16L;
    }

    public static MemorySegment iter(MemorySegment struct) {
        return struct.asSlice(16L, iter$LAYOUT.byteSize());
    }

    public static void iter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)iter$LAYOUT.byteSize());
    }

    public static final GroupLayout netns$layout() {
        return netns$LAYOUT;
    }

    public static final long netns$offset() {
        return 16L;
    }

    public static MemorySegment netns(MemorySegment struct) {
        return struct.asSlice(16L, netns$LAYOUT.byteSize());
    }

    public static void netns(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)netns$LAYOUT.byteSize());
    }

    public static final GroupLayout xdp$layout() {
        return xdp$LAYOUT;
    }

    public static final long xdp$offset() {
        return 16L;
    }

    public static MemorySegment xdp(MemorySegment struct) {
        return struct.asSlice(16L, xdp$LAYOUT.byteSize());
    }

    public static void xdp(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)xdp$LAYOUT.byteSize());
    }

    public static final GroupLayout struct_ops$layout() {
        return struct_ops$LAYOUT;
    }

    public static final long struct_ops$offset() {
        return 16L;
    }

    public static MemorySegment struct_ops(MemorySegment struct) {
        return struct.asSlice(16L, struct_ops$LAYOUT.byteSize());
    }

    public static void struct_ops(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)struct_ops$LAYOUT.byteSize());
    }

    public static final GroupLayout netfilter$layout() {
        return netfilter$LAYOUT;
    }

    public static final long netfilter$offset() {
        return 16L;
    }

    public static MemorySegment netfilter(MemorySegment struct) {
        return struct.asSlice(16L, netfilter$LAYOUT.byteSize());
    }

    public static void netfilter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)netfilter$LAYOUT.byteSize());
    }

    public static final GroupLayout kprobe_multi$layout() {
        return kprobe_multi$LAYOUT;
    }

    public static final long kprobe_multi$offset() {
        return 16L;
    }

    public static MemorySegment kprobe_multi(MemorySegment struct) {
        return struct.asSlice(16L, kprobe_multi$LAYOUT.byteSize());
    }

    public static void kprobe_multi(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)kprobe_multi$LAYOUT.byteSize());
    }

    public static final GroupLayout uprobe_multi$layout() {
        return uprobe_multi$LAYOUT;
    }

    public static final long uprobe_multi$offset() {
        return 16L;
    }

    public static MemorySegment uprobe_multi(MemorySegment struct) {
        return struct.asSlice(16L, uprobe_multi$LAYOUT.byteSize());
    }

    public static void uprobe_multi(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)uprobe_multi$LAYOUT.byteSize());
    }

    public static final GroupLayout perf_event$layout() {
        return perf_event$LAYOUT;
    }

    public static final long perf_event$offset() {
        return 16L;
    }

    public static MemorySegment perf_event(MemorySegment struct) {
        return struct.asSlice(16L, perf_event$LAYOUT.byteSize());
    }

    public static void perf_event(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)perf_event$LAYOUT.byteSize());
    }

    public static final GroupLayout tcx$layout() {
        return tcx$LAYOUT;
    }

    public static final long tcx$offset() {
        return 16L;
    }

    public static MemorySegment tcx(MemorySegment struct) {
        return struct.asSlice(16L, tcx$LAYOUT.byteSize());
    }

    public static void tcx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)tcx$LAYOUT.byteSize());
    }

    public static final GroupLayout netkit$layout() {
        return netkit$LAYOUT;
    }

    public static final long netkit$offset() {
        return 16L;
    }

    public static MemorySegment netkit(MemorySegment struct) {
        return struct.asSlice(16L, netkit$LAYOUT.byteSize());
    }

    public static void netkit(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)netkit$LAYOUT.byteSize());
    }

    public static final GroupLayout sockmap$layout() {
        return sockmap$LAYOUT;
    }

    public static final long sockmap$offset() {
        return 16L;
    }

    public static MemorySegment sockmap(MemorySegment struct) {
        return struct.asSlice(16L, sockmap$LAYOUT.byteSize());
    }

    public static void sockmap(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)sockmap$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_link_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_link_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_link_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_link_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_link_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_link_info.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class raw_tracepoint {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("tp_name"), Lib.C_INT.withName("tp_name_len"), MemoryLayout.paddingLayout((long)4L)}).withName("$anon$6636:3");
        private static final ValueLayout.OfLong tp_name$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_name")});
        private static final long tp_name$OFFSET = 0L;
        private static final ValueLayout.OfInt tp_name_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_name_len")});
        private static final long tp_name_len$OFFSET = 8L;

        raw_tracepoint() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong tp_name$layout() {
            return tp_name$LAYOUT;
        }

        public static final long tp_name$offset() {
            return 0L;
        }

        public static long tp_name(MemorySegment struct) {
            return struct.get(tp_name$LAYOUT, 0L);
        }

        public static void tp_name(MemorySegment struct, long fieldValue) {
            struct.set(tp_name$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt tp_name_len$layout() {
            return tp_name_len$LAYOUT;
        }

        public static final long tp_name_len$offset() {
            return 8L;
        }

        public static int tp_name_len(MemorySegment struct) {
            return struct.get(tp_name_len$LAYOUT, 8L);
        }

        public static void tp_name_len(MemorySegment struct, int fieldValue) {
            struct.set(tp_name_len$LAYOUT, 8L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(raw_tracepoint.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return raw_tracepoint.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)raw_tracepoint.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)raw_tracepoint.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return raw_tracepoint.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(raw_tracepoint.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class tracing {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("attach_type"), Lib.C_INT.withName("target_obj_id"), Lib.C_INT.withName("target_btf_id")}).withName("$anon$6640:3");
        private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
        private static final long attach_type$OFFSET = 0L;
        private static final ValueLayout.OfInt target_obj_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"target_obj_id")});
        private static final long target_obj_id$OFFSET = 4L;
        private static final ValueLayout.OfInt target_btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"target_btf_id")});
        private static final long target_btf_id$OFFSET = 8L;

        tracing() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt attach_type$layout() {
            return attach_type$LAYOUT;
        }

        public static final long attach_type$offset() {
            return 0L;
        }

        public static int attach_type(MemorySegment struct) {
            return struct.get(attach_type$LAYOUT, 0L);
        }

        public static void attach_type(MemorySegment struct, int fieldValue) {
            struct.set(attach_type$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt target_obj_id$layout() {
            return target_obj_id$LAYOUT;
        }

        public static final long target_obj_id$offset() {
            return 4L;
        }

        public static int target_obj_id(MemorySegment struct) {
            return struct.get(target_obj_id$LAYOUT, 4L);
        }

        public static void target_obj_id(MemorySegment struct, int fieldValue) {
            struct.set(target_obj_id$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt target_btf_id$layout() {
            return target_btf_id$LAYOUT;
        }

        public static final long target_btf_id$offset() {
            return 8L;
        }

        public static int target_btf_id(MemorySegment struct) {
            return struct.get(target_btf_id$LAYOUT, 8L);
        }

        public static void target_btf_id(MemorySegment struct, int fieldValue) {
            struct.set(target_btf_id$LAYOUT, 8L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(tracing.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return tracing.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)tracing.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tracing.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return tracing.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(tracing.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class cgroup {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("cgroup_id"), Lib.C_INT.withName("attach_type"), MemoryLayout.paddingLayout((long)4L)}).withName("$anon$6645:3");
        private static final ValueLayout.OfLong cgroup_id$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cgroup_id")});
        private static final long cgroup_id$OFFSET = 0L;
        private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
        private static final long attach_type$OFFSET = 8L;

        cgroup() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong cgroup_id$layout() {
            return cgroup_id$LAYOUT;
        }

        public static final long cgroup_id$offset() {
            return 0L;
        }

        public static long cgroup_id(MemorySegment struct) {
            return struct.get(cgroup_id$LAYOUT, 0L);
        }

        public static void cgroup_id(MemorySegment struct, long fieldValue) {
            struct.set(cgroup_id$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt attach_type$layout() {
            return attach_type$LAYOUT;
        }

        public static final long attach_type$offset() {
            return 8L;
        }

        public static int attach_type(MemorySegment struct) {
            return struct.get(attach_type$LAYOUT, 8L);
        }

        public static void attach_type(MemorySegment struct, int fieldValue) {
            struct.set(attach_type$LAYOUT, 8L, fieldValue);
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

    public static class iter {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("target_name"), Lib.C_INT.withName("target_name_len"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{map.layout().withName("map")}).withName("$anon$6657:4"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{cgroup.layout().withName("cgroup"), task.layout().withName("task")}).withName("$anon$6662:4")}).withName("$anon$6649:3");
        private static final ValueLayout.OfLong target_name$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"target_name")});
        private static final long target_name$OFFSET = 0L;
        private static final ValueLayout.OfInt target_name_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"target_name_len")});
        private static final long target_name_len$OFFSET = 8L;
        private static final GroupLayout map$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6657:4"), MemoryLayout.PathElement.groupElement((String)"map")});
        private static final long map$OFFSET = 12L;
        private static final GroupLayout cgroup$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6662:4"), MemoryLayout.PathElement.groupElement((String)"cgroup")});
        private static final long cgroup$OFFSET = 16L;
        private static final GroupLayout task$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6662:4"), MemoryLayout.PathElement.groupElement((String)"task")});
        private static final long task$OFFSET = 16L;

        iter() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong target_name$layout() {
            return target_name$LAYOUT;
        }

        public static final long target_name$offset() {
            return 0L;
        }

        public static long target_name(MemorySegment struct) {
            return struct.get(target_name$LAYOUT, 0L);
        }

        public static void target_name(MemorySegment struct, long fieldValue) {
            struct.set(target_name$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt target_name_len$layout() {
            return target_name_len$LAYOUT;
        }

        public static final long target_name_len$offset() {
            return 8L;
        }

        public static int target_name_len(MemorySegment struct) {
            return struct.get(target_name_len$LAYOUT, 8L);
        }

        public static void target_name_len(MemorySegment struct, int fieldValue) {
            struct.set(target_name_len$LAYOUT, 8L, fieldValue);
        }

        public static final GroupLayout map$layout() {
            return map$LAYOUT;
        }

        public static final long map$offset() {
            return 12L;
        }

        public static MemorySegment map(MemorySegment struct) {
            return struct.asSlice(12L, map$LAYOUT.byteSize());
        }

        public static void map(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)12L, (long)map$LAYOUT.byteSize());
        }

        public static final GroupLayout cgroup$layout() {
            return cgroup$LAYOUT;
        }

        public static final long cgroup$offset() {
            return 16L;
        }

        public static MemorySegment cgroup(MemorySegment struct) {
            return struct.asSlice(16L, cgroup$LAYOUT.byteSize());
        }

        public static void cgroup(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)cgroup$LAYOUT.byteSize());
        }

        public static final GroupLayout task$layout() {
            return task$LAYOUT;
        }

        public static final long task$offset() {
            return 16L;
        }

        public static MemorySegment task(MemorySegment struct) {
            return struct.asSlice(16L, task$LAYOUT.byteSize());
        }

        public static void task(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)task$LAYOUT.byteSize());
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(iter.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return iter.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)iter.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)iter.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return iter.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(iter.layout().byteSize() * elementCount, arena, cleanup);
        }

        public static class map {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("map_id")}).withName("$anon$6658:5");
            private static final ValueLayout.OfInt map_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_id")});
            private static final long map_id$OFFSET = 0L;

            map() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfInt map_id$layout() {
                return map_id$LAYOUT;
            }

            public static final long map_id$offset() {
                return 0L;
            }

            public static int map_id(MemorySegment struct) {
                return struct.get(map_id$LAYOUT, 0L);
            }

            public static void map_id(MemorySegment struct, int fieldValue) {
                struct.set(map_id$LAYOUT, 0L, fieldValue);
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
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("cgroup_id"), Lib.C_INT.withName("order"), MemoryLayout.paddingLayout((long)4L)}).withName("$anon$6663:5");
            private static final ValueLayout.OfLong cgroup_id$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cgroup_id")});
            private static final long cgroup_id$OFFSET = 0L;
            private static final ValueLayout.OfInt order$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"order")});
            private static final long order$OFFSET = 8L;

            cgroup() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfLong cgroup_id$layout() {
                return cgroup_id$LAYOUT;
            }

            public static final long cgroup_id$offset() {
                return 0L;
            }

            public static long cgroup_id(MemorySegment struct) {
                return struct.get(cgroup_id$LAYOUT, 0L);
            }

            public static void cgroup_id(MemorySegment struct, long fieldValue) {
                struct.set(cgroup_id$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt order$layout() {
                return order$LAYOUT;
            }

            public static final long order$offset() {
                return 8L;
            }

            public static int order(MemorySegment struct) {
                return struct.get(order$LAYOUT, 8L);
            }

            public static void order(MemorySegment struct, int fieldValue) {
                struct.set(order$LAYOUT, 8L, fieldValue);
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
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("tid"), Lib.C_INT.withName("pid")}).withName("$anon$6667:5");
            private static final ValueLayout.OfInt tid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tid")});
            private static final long tid$OFFSET = 0L;
            private static final ValueLayout.OfInt pid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pid")});
            private static final long pid$OFFSET = 4L;

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

    public static class netns {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("netns_ino"), Lib.C_INT.withName("attach_type")}).withName("$anon$6673:3");
        private static final ValueLayout.OfInt netns_ino$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"netns_ino")});
        private static final long netns_ino$OFFSET = 0L;
        private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
        private static final long attach_type$OFFSET = 4L;

        netns() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt netns_ino$layout() {
            return netns_ino$LAYOUT;
        }

        public static final long netns_ino$offset() {
            return 0L;
        }

        public static int netns_ino(MemorySegment struct) {
            return struct.get(netns_ino$LAYOUT, 0L);
        }

        public static void netns_ino(MemorySegment struct, int fieldValue) {
            struct.set(netns_ino$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt attach_type$layout() {
            return attach_type$LAYOUT;
        }

        public static final long attach_type$offset() {
            return 4L;
        }

        public static int attach_type(MemorySegment struct) {
            return struct.get(attach_type$LAYOUT, 4L);
        }

        public static void attach_type(MemorySegment struct, int fieldValue) {
            struct.set(attach_type$LAYOUT, 4L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(netns.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return netns.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)netns.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)netns.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return netns.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(netns.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class xdp {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ifindex")}).withName("$anon$6677:3");
        private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
        private static final long ifindex$OFFSET = 0L;

        xdp() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt ifindex$layout() {
            return ifindex$LAYOUT;
        }

        public static final long ifindex$offset() {
            return 0L;
        }

        public static int ifindex(MemorySegment struct) {
            return struct.get(ifindex$LAYOUT, 0L);
        }

        public static void ifindex(MemorySegment struct, int fieldValue) {
            struct.set(ifindex$LAYOUT, 0L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(xdp.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return xdp.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)xdp.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)xdp.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return xdp.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(xdp.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class struct_ops {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("map_id")}).withName("$anon$6680:3");
        private static final ValueLayout.OfInt map_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_id")});
        private static final long map_id$OFFSET = 0L;

        struct_ops() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt map_id$layout() {
            return map_id$LAYOUT;
        }

        public static final long map_id$offset() {
            return 0L;
        }

        public static int map_id(MemorySegment struct) {
            return struct.get(map_id$LAYOUT, 0L);
        }

        public static void map_id(MemorySegment struct, int fieldValue) {
            struct.set(map_id$LAYOUT, 0L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(struct_ops.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return struct_ops.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)struct_ops.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)struct_ops.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return struct_ops.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(struct_ops.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class netfilter {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("pf"), Lib.C_INT.withName("hooknum"), Lib.C_INT.withName("priority"), Lib.C_INT.withName("flags")}).withName("$anon$6683:3");
        private static final ValueLayout.OfInt pf$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pf")});
        private static final long pf$OFFSET = 0L;
        private static final ValueLayout.OfInt hooknum$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hooknum")});
        private static final long hooknum$OFFSET = 4L;
        private static final ValueLayout.OfInt priority$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"priority")});
        private static final long priority$OFFSET = 8L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 12L;

        netfilter() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt pf$layout() {
            return pf$LAYOUT;
        }

        public static final long pf$offset() {
            return 0L;
        }

        public static int pf(MemorySegment struct) {
            return struct.get(pf$LAYOUT, 0L);
        }

        public static void pf(MemorySegment struct, int fieldValue) {
            struct.set(pf$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt hooknum$layout() {
            return hooknum$LAYOUT;
        }

        public static final long hooknum$offset() {
            return 4L;
        }

        public static int hooknum(MemorySegment struct) {
            return struct.get(hooknum$LAYOUT, 4L);
        }

        public static void hooknum(MemorySegment struct, int fieldValue) {
            struct.set(hooknum$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt priority$layout() {
            return priority$LAYOUT;
        }

        public static final long priority$offset() {
            return 8L;
        }

        public static int priority(MemorySegment struct) {
            return struct.get(priority$LAYOUT, 8L);
        }

        public static void priority(MemorySegment struct, int fieldValue) {
            struct.set(priority$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 12L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 12L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 12L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(netfilter.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return netfilter.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)netfilter.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)netfilter.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return netfilter.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(netfilter.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class kprobe_multi {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("addrs"), Lib.C_INT.withName("count"), Lib.C_INT.withName("flags"), Lib.C_LONG_LONG.withName("missed"), Lib.C_LONG_LONG.withName("cookies")}).withName("$anon$6689:3");
        private static final ValueLayout.OfLong addrs$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addrs")});
        private static final long addrs$OFFSET = 0L;
        private static final ValueLayout.OfInt count$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"count")});
        private static final long count$OFFSET = 8L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 12L;
        private static final ValueLayout.OfLong missed$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"missed")});
        private static final long missed$OFFSET = 16L;
        private static final ValueLayout.OfLong cookies$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookies")});
        private static final long cookies$OFFSET = 24L;

        kprobe_multi() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong addrs$layout() {
            return addrs$LAYOUT;
        }

        public static final long addrs$offset() {
            return 0L;
        }

        public static long addrs(MemorySegment struct) {
            return struct.get(addrs$LAYOUT, 0L);
        }

        public static void addrs(MemorySegment struct, long fieldValue) {
            struct.set(addrs$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt count$layout() {
            return count$LAYOUT;
        }

        public static final long count$offset() {
            return 8L;
        }

        public static int count(MemorySegment struct) {
            return struct.get(count$LAYOUT, 8L);
        }

        public static void count(MemorySegment struct, int fieldValue) {
            struct.set(count$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 12L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 12L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 12L, fieldValue);
        }

        public static final ValueLayout.OfLong missed$layout() {
            return missed$LAYOUT;
        }

        public static final long missed$offset() {
            return 16L;
        }

        public static long missed(MemorySegment struct) {
            return struct.get(missed$LAYOUT, 16L);
        }

        public static void missed(MemorySegment struct, long fieldValue) {
            struct.set(missed$LAYOUT, 16L, fieldValue);
        }

        public static final ValueLayout.OfLong cookies$layout() {
            return cookies$LAYOUT;
        }

        public static final long cookies$offset() {
            return 24L;
        }

        public static long cookies(MemorySegment struct) {
            return struct.get(cookies$LAYOUT, 24L);
        }

        public static void cookies(MemorySegment struct, long fieldValue) {
            struct.set(cookies$LAYOUT, 24L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(kprobe_multi.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return kprobe_multi.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)kprobe_multi.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)kprobe_multi.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return kprobe_multi.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(kprobe_multi.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class uprobe_multi {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("path"), Lib.C_LONG_LONG.withName("offsets"), Lib.C_LONG_LONG.withName("ref_ctr_offsets"), Lib.C_LONG_LONG.withName("cookies"), Lib.C_INT.withName("path_size"), Lib.C_INT.withName("count"), Lib.C_INT.withName("flags"), Lib.C_INT.withName("pid")}).withName("$anon$6696:3");
        private static final ValueLayout.OfLong path$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"path")});
        private static final long path$OFFSET = 0L;
        private static final ValueLayout.OfLong offsets$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"offsets")});
        private static final long offsets$OFFSET = 8L;
        private static final ValueLayout.OfLong ref_ctr_offsets$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ref_ctr_offsets")});
        private static final long ref_ctr_offsets$OFFSET = 16L;
        private static final ValueLayout.OfLong cookies$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookies")});
        private static final long cookies$OFFSET = 24L;
        private static final ValueLayout.OfInt path_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"path_size")});
        private static final long path_size$OFFSET = 32L;
        private static final ValueLayout.OfInt count$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"count")});
        private static final long count$OFFSET = 36L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 40L;
        private static final ValueLayout.OfInt pid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pid")});
        private static final long pid$OFFSET = 44L;

        uprobe_multi() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong path$layout() {
            return path$LAYOUT;
        }

        public static final long path$offset() {
            return 0L;
        }

        public static long path(MemorySegment struct) {
            return struct.get(path$LAYOUT, 0L);
        }

        public static void path(MemorySegment struct, long fieldValue) {
            struct.set(path$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfLong offsets$layout() {
            return offsets$LAYOUT;
        }

        public static final long offsets$offset() {
            return 8L;
        }

        public static long offsets(MemorySegment struct) {
            return struct.get(offsets$LAYOUT, 8L);
        }

        public static void offsets(MemorySegment struct, long fieldValue) {
            struct.set(offsets$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfLong ref_ctr_offsets$layout() {
            return ref_ctr_offsets$LAYOUT;
        }

        public static final long ref_ctr_offsets$offset() {
            return 16L;
        }

        public static long ref_ctr_offsets(MemorySegment struct) {
            return struct.get(ref_ctr_offsets$LAYOUT, 16L);
        }

        public static void ref_ctr_offsets(MemorySegment struct, long fieldValue) {
            struct.set(ref_ctr_offsets$LAYOUT, 16L, fieldValue);
        }

        public static final ValueLayout.OfLong cookies$layout() {
            return cookies$LAYOUT;
        }

        public static final long cookies$offset() {
            return 24L;
        }

        public static long cookies(MemorySegment struct) {
            return struct.get(cookies$LAYOUT, 24L);
        }

        public static void cookies(MemorySegment struct, long fieldValue) {
            struct.set(cookies$LAYOUT, 24L, fieldValue);
        }

        public static final ValueLayout.OfInt path_size$layout() {
            return path_size$LAYOUT;
        }

        public static final long path_size$offset() {
            return 32L;
        }

        public static int path_size(MemorySegment struct) {
            return struct.get(path_size$LAYOUT, 32L);
        }

        public static void path_size(MemorySegment struct, int fieldValue) {
            struct.set(path_size$LAYOUT, 32L, fieldValue);
        }

        public static final ValueLayout.OfInt count$layout() {
            return count$LAYOUT;
        }

        public static final long count$offset() {
            return 36L;
        }

        public static int count(MemorySegment struct) {
            return struct.get(count$LAYOUT, 36L);
        }

        public static void count(MemorySegment struct, int fieldValue) {
            struct.set(count$LAYOUT, 36L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 40L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 40L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 40L, fieldValue);
        }

        public static final ValueLayout.OfInt pid$layout() {
            return pid$LAYOUT;
        }

        public static final long pid$offset() {
            return 44L;
        }

        public static int pid(MemorySegment struct) {
            return struct.get(pid$LAYOUT, 44L);
        }

        public static void pid(MemorySegment struct, int fieldValue) {
            struct.set(pid$LAYOUT, 44L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(uprobe_multi.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return uprobe_multi.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)uprobe_multi.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)uprobe_multi.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return uprobe_multi.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(uprobe_multi.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class perf_event {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("type"), MemoryLayout.paddingLayout((long)4L), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{uprobe.layout().withName("uprobe"), kprobe.layout().withName("kprobe"), tracepoint.layout().withName("tracepoint"), event.layout().withName("event")}).withName("$anon$6709:4")}).withName("$anon$6706:3");
        private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
        private static final long type$OFFSET = 0L;
        private static final GroupLayout uprobe$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6709:4"), MemoryLayout.PathElement.groupElement((String)"uprobe")});
        private static final long uprobe$OFFSET = 8L;
        private static final GroupLayout kprobe$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6709:4"), MemoryLayout.PathElement.groupElement((String)"kprobe")});
        private static final long kprobe$OFFSET = 8L;
        private static final GroupLayout tracepoint$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6709:4"), MemoryLayout.PathElement.groupElement((String)"tracepoint")});
        private static final long tracepoint$OFFSET = 8L;
        private static final GroupLayout event$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6709:4"), MemoryLayout.PathElement.groupElement((String)"event")});
        private static final long event$OFFSET = 8L;

        perf_event() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt type$layout() {
            return type$LAYOUT;
        }

        public static final long type$offset() {
            return 0L;
        }

        public static int type(MemorySegment struct) {
            return struct.get(type$LAYOUT, 0L);
        }

        public static void type(MemorySegment struct, int fieldValue) {
            struct.set(type$LAYOUT, 0L, fieldValue);
        }

        public static final GroupLayout uprobe$layout() {
            return uprobe$LAYOUT;
        }

        public static final long uprobe$offset() {
            return 8L;
        }

        public static MemorySegment uprobe(MemorySegment struct) {
            return struct.asSlice(8L, uprobe$LAYOUT.byteSize());
        }

        public static void uprobe(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)uprobe$LAYOUT.byteSize());
        }

        public static final GroupLayout kprobe$layout() {
            return kprobe$LAYOUT;
        }

        public static final long kprobe$offset() {
            return 8L;
        }

        public static MemorySegment kprobe(MemorySegment struct) {
            return struct.asSlice(8L, kprobe$LAYOUT.byteSize());
        }

        public static void kprobe(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)kprobe$LAYOUT.byteSize());
        }

        public static final GroupLayout tracepoint$layout() {
            return tracepoint$LAYOUT;
        }

        public static final long tracepoint$offset() {
            return 8L;
        }

        public static MemorySegment tracepoint(MemorySegment struct) {
            return struct.asSlice(8L, tracepoint$LAYOUT.byteSize());
        }

        public static void tracepoint(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)tracepoint$LAYOUT.byteSize());
        }

        public static final GroupLayout event$layout() {
            return event$LAYOUT;
        }

        public static final long event$offset() {
            return 8L;
        }

        public static MemorySegment event(MemorySegment struct) {
            return struct.asSlice(8L, event$LAYOUT.byteSize());
        }

        public static void event(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)event$LAYOUT.byteSize());
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(perf_event.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return perf_event.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)perf_event.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)perf_event.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return perf_event.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(perf_event.layout().byteSize() * elementCount, arena, cleanup);
        }

        public static class uprobe {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("file_name"), Lib.C_INT.withName("name_len"), Lib.C_INT.withName("offset"), Lib.C_LONG_LONG.withName("cookie")}).withName("$anon$6710:5");
            private static final ValueLayout.OfLong file_name$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"file_name")});
            private static final long file_name$OFFSET = 0L;
            private static final ValueLayout.OfInt name_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name_len")});
            private static final long name_len$OFFSET = 8L;
            private static final ValueLayout.OfInt offset$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"offset")});
            private static final long offset$OFFSET = 12L;
            private static final ValueLayout.OfLong cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookie")});
            private static final long cookie$OFFSET = 16L;

            uprobe() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfLong file_name$layout() {
                return file_name$LAYOUT;
            }

            public static final long file_name$offset() {
                return 0L;
            }

            public static long file_name(MemorySegment struct) {
                return struct.get(file_name$LAYOUT, 0L);
            }

            public static void file_name(MemorySegment struct, long fieldValue) {
                struct.set(file_name$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt name_len$layout() {
                return name_len$LAYOUT;
            }

            public static final long name_len$offset() {
                return 8L;
            }

            public static int name_len(MemorySegment struct) {
                return struct.get(name_len$LAYOUT, 8L);
            }

            public static void name_len(MemorySegment struct, int fieldValue) {
                struct.set(name_len$LAYOUT, 8L, fieldValue);
            }

            public static final ValueLayout.OfInt offset$layout() {
                return offset$LAYOUT;
            }

            public static final long offset$offset() {
                return 12L;
            }

            public static int offset(MemorySegment struct) {
                return struct.get(offset$LAYOUT, 12L);
            }

            public static void offset(MemorySegment struct, int fieldValue) {
                struct.set(offset$LAYOUT, 12L, fieldValue);
            }

            public static final ValueLayout.OfLong cookie$layout() {
                return cookie$LAYOUT;
            }

            public static final long cookie$offset() {
                return 16L;
            }

            public static long cookie(MemorySegment struct) {
                return struct.get(cookie$LAYOUT, 16L);
            }

            public static void cookie(MemorySegment struct, long fieldValue) {
                struct.set(cookie$LAYOUT, 16L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(uprobe.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return uprobe.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)uprobe.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)uprobe.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return uprobe.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(uprobe.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class kprobe {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("func_name"), Lib.C_INT.withName("name_len"), Lib.C_INT.withName("offset"), Lib.C_LONG_LONG.withName("addr"), Lib.C_LONG_LONG.withName("missed"), Lib.C_LONG_LONG.withName("cookie")}).withName("$anon$6716:5");
            private static final ValueLayout.OfLong func_name$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"func_name")});
            private static final long func_name$OFFSET = 0L;
            private static final ValueLayout.OfInt name_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name_len")});
            private static final long name_len$OFFSET = 8L;
            private static final ValueLayout.OfInt offset$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"offset")});
            private static final long offset$OFFSET = 12L;
            private static final ValueLayout.OfLong addr$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addr")});
            private static final long addr$OFFSET = 16L;
            private static final ValueLayout.OfLong missed$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"missed")});
            private static final long missed$OFFSET = 24L;
            private static final ValueLayout.OfLong cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookie")});
            private static final long cookie$OFFSET = 32L;

            kprobe() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfLong func_name$layout() {
                return func_name$LAYOUT;
            }

            public static final long func_name$offset() {
                return 0L;
            }

            public static long func_name(MemorySegment struct) {
                return struct.get(func_name$LAYOUT, 0L);
            }

            public static void func_name(MemorySegment struct, long fieldValue) {
                struct.set(func_name$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt name_len$layout() {
                return name_len$LAYOUT;
            }

            public static final long name_len$offset() {
                return 8L;
            }

            public static int name_len(MemorySegment struct) {
                return struct.get(name_len$LAYOUT, 8L);
            }

            public static void name_len(MemorySegment struct, int fieldValue) {
                struct.set(name_len$LAYOUT, 8L, fieldValue);
            }

            public static final ValueLayout.OfInt offset$layout() {
                return offset$LAYOUT;
            }

            public static final long offset$offset() {
                return 12L;
            }

            public static int offset(MemorySegment struct) {
                return struct.get(offset$LAYOUT, 12L);
            }

            public static void offset(MemorySegment struct, int fieldValue) {
                struct.set(offset$LAYOUT, 12L, fieldValue);
            }

            public static final ValueLayout.OfLong addr$layout() {
                return addr$LAYOUT;
            }

            public static final long addr$offset() {
                return 16L;
            }

            public static long addr(MemorySegment struct) {
                return struct.get(addr$LAYOUT, 16L);
            }

            public static void addr(MemorySegment struct, long fieldValue) {
                struct.set(addr$LAYOUT, 16L, fieldValue);
            }

            public static final ValueLayout.OfLong missed$layout() {
                return missed$LAYOUT;
            }

            public static final long missed$offset() {
                return 24L;
            }

            public static long missed(MemorySegment struct) {
                return struct.get(missed$LAYOUT, 24L);
            }

            public static void missed(MemorySegment struct, long fieldValue) {
                struct.set(missed$LAYOUT, 24L, fieldValue);
            }

            public static final ValueLayout.OfLong cookie$layout() {
                return cookie$LAYOUT;
            }

            public static final long cookie$offset() {
                return 32L;
            }

            public static long cookie(MemorySegment struct) {
                return struct.get(cookie$LAYOUT, 32L);
            }

            public static void cookie(MemorySegment struct, long fieldValue) {
                struct.set(cookie$LAYOUT, 32L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(kprobe.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return kprobe.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)kprobe.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)kprobe.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return kprobe.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(kprobe.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class tracepoint {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("tp_name"), Lib.C_INT.withName("name_len"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("cookie")}).withName("$anon$6724:5");
            private static final ValueLayout.OfLong tp_name$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tp_name")});
            private static final long tp_name$OFFSET = 0L;
            private static final ValueLayout.OfInt name_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name_len")});
            private static final long name_len$OFFSET = 8L;
            private static final ValueLayout.OfLong cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookie")});
            private static final long cookie$OFFSET = 16L;

            tracepoint() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfLong tp_name$layout() {
                return tp_name$LAYOUT;
            }

            public static final long tp_name$offset() {
                return 0L;
            }

            public static long tp_name(MemorySegment struct) {
                return struct.get(tp_name$LAYOUT, 0L);
            }

            public static void tp_name(MemorySegment struct, long fieldValue) {
                struct.set(tp_name$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt name_len$layout() {
                return name_len$LAYOUT;
            }

            public static final long name_len$offset() {
                return 8L;
            }

            public static int name_len(MemorySegment struct) {
                return struct.get(name_len$LAYOUT, 8L);
            }

            public static void name_len(MemorySegment struct, int fieldValue) {
                struct.set(name_len$LAYOUT, 8L, fieldValue);
            }

            public static final ValueLayout.OfLong cookie$layout() {
                return cookie$LAYOUT;
            }

            public static final long cookie$offset() {
                return 16L;
            }

            public static long cookie(MemorySegment struct) {
                return struct.get(cookie$LAYOUT, 16L);
            }

            public static void cookie(MemorySegment struct, long fieldValue) {
                struct.set(cookie$LAYOUT, 16L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(tracepoint.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return tracepoint.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)tracepoint.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tracepoint.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return tracepoint.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(tracepoint.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class event {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("config"), Lib.C_INT.withName("type"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("cookie")}).withName("$anon$6730:5");
            private static final ValueLayout.OfLong config$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"config")});
            private static final long config$OFFSET = 0L;
            private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
            private static final long type$OFFSET = 8L;
            private static final ValueLayout.OfLong cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookie")});
            private static final long cookie$OFFSET = 16L;

            event() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfLong config$layout() {
                return config$LAYOUT;
            }

            public static final long config$offset() {
                return 0L;
            }

            public static long config(MemorySegment struct) {
                return struct.get(config$LAYOUT, 0L);
            }

            public static void config(MemorySegment struct, long fieldValue) {
                struct.set(config$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt type$layout() {
                return type$LAYOUT;
            }

            public static final long type$offset() {
                return 8L;
            }

            public static int type(MemorySegment struct) {
                return struct.get(type$LAYOUT, 8L);
            }

            public static void type(MemorySegment struct, int fieldValue) {
                struct.set(type$LAYOUT, 8L, fieldValue);
            }

            public static final ValueLayout.OfLong cookie$layout() {
                return cookie$LAYOUT;
            }

            public static final long cookie$offset() {
                return 16L;
            }

            public static long cookie(MemorySegment struct) {
                return struct.get(cookie$LAYOUT, 16L);
            }

            public static void cookie(MemorySegment struct, long fieldValue) {
                struct.set(cookie$LAYOUT, 16L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(event.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return event.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)event.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)event.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return event.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(event.layout().byteSize() * elementCount, arena, cleanup);
            }
        }
    }

    public static class tcx {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ifindex"), Lib.C_INT.withName("attach_type")}).withName("$anon$6738:3");
        private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
        private static final long ifindex$OFFSET = 0L;
        private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
        private static final long attach_type$OFFSET = 4L;

        tcx() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt ifindex$layout() {
            return ifindex$LAYOUT;
        }

        public static final long ifindex$offset() {
            return 0L;
        }

        public static int ifindex(MemorySegment struct) {
            return struct.get(ifindex$LAYOUT, 0L);
        }

        public static void ifindex(MemorySegment struct, int fieldValue) {
            struct.set(ifindex$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt attach_type$layout() {
            return attach_type$LAYOUT;
        }

        public static final long attach_type$offset() {
            return 4L;
        }

        public static int attach_type(MemorySegment struct) {
            return struct.get(attach_type$LAYOUT, 4L);
        }

        public static void attach_type(MemorySegment struct, int fieldValue) {
            struct.set(attach_type$LAYOUT, 4L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(tcx.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return tcx.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)tcx.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcx.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return tcx.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(tcx.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class netkit {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ifindex"), Lib.C_INT.withName("attach_type")}).withName("$anon$6742:3");
        private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
        private static final long ifindex$OFFSET = 0L;
        private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
        private static final long attach_type$OFFSET = 4L;

        netkit() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt ifindex$layout() {
            return ifindex$LAYOUT;
        }

        public static final long ifindex$offset() {
            return 0L;
        }

        public static int ifindex(MemorySegment struct) {
            return struct.get(ifindex$LAYOUT, 0L);
        }

        public static void ifindex(MemorySegment struct, int fieldValue) {
            struct.set(ifindex$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt attach_type$layout() {
            return attach_type$LAYOUT;
        }

        public static final long attach_type$offset() {
            return 4L;
        }

        public static int attach_type(MemorySegment struct) {
            return struct.get(attach_type$LAYOUT, 4L);
        }

        public static void attach_type(MemorySegment struct, int fieldValue) {
            struct.set(attach_type$LAYOUT, 4L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(netkit.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return netkit.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)netkit.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)netkit.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return netkit.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(netkit.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class sockmap {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("map_id"), Lib.C_INT.withName("attach_type")}).withName("$anon$6746:3");
        private static final ValueLayout.OfInt map_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_id")});
        private static final long map_id$OFFSET = 0L;
        private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
        private static final long attach_type$OFFSET = 4L;

        sockmap() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt map_id$layout() {
            return map_id$LAYOUT;
        }

        public static final long map_id$offset() {
            return 0L;
        }

        public static int map_id(MemorySegment struct) {
            return struct.get(map_id$LAYOUT, 0L);
        }

        public static void map_id(MemorySegment struct, int fieldValue) {
            struct.set(map_id$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt attach_type$layout() {
            return attach_type$LAYOUT;
        }

        public static final long attach_type$offset() {
            return 4L;
        }

        public static int attach_type(MemorySegment struct) {
            return struct.get(attach_type$LAYOUT, 4L);
        }

        public static void attach_type(MemorySegment struct, int fieldValue) {
            struct.set(attach_type$LAYOUT, 4L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(sockmap.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return sockmap.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)sockmap.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sockmap.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return sockmap.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(sockmap.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

