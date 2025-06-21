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

public class bpf_link_create_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("flags"), MemoryLayout.paddingLayout((long)4L), Lib.C_POINTER.withName("iter_info"), Lib.C_INT.withName("iter_info_len"), Lib.C_INT.withName("target_btf_id"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{perf_event.layout().withName("perf_event"), kprobe_multi.layout().withName("kprobe_multi"), uprobe_multi.layout().withName("uprobe_multi"), tracing.layout().withName("tracing"), netfilter.layout().withName("netfilter"), tcx.layout().withName("tcx"), netkit.layout().withName("netkit")}).withName("$anon$399:2")}).withName("bpf_link_create_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 8L;
    private static final AddressLayout iter_info$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"iter_info")});
    private static final long iter_info$OFFSET = 16L;
    private static final ValueLayout.OfInt iter_info_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"iter_info_len")});
    private static final long iter_info_len$OFFSET = 24L;
    private static final ValueLayout.OfInt target_btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"target_btf_id")});
    private static final long target_btf_id$OFFSET = 28L;
    private static final GroupLayout perf_event$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$399:2"), MemoryLayout.PathElement.groupElement((String)"perf_event")});
    private static final long perf_event$OFFSET = 32L;
    private static final GroupLayout kprobe_multi$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$399:2"), MemoryLayout.PathElement.groupElement((String)"kprobe_multi")});
    private static final long kprobe_multi$OFFSET = 32L;
    private static final GroupLayout uprobe_multi$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$399:2"), MemoryLayout.PathElement.groupElement((String)"uprobe_multi")});
    private static final long uprobe_multi$OFFSET = 32L;
    private static final GroupLayout tracing$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$399:2"), MemoryLayout.PathElement.groupElement((String)"tracing")});
    private static final long tracing$OFFSET = 32L;
    private static final GroupLayout netfilter$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$399:2"), MemoryLayout.PathElement.groupElement((String)"netfilter")});
    private static final long netfilter$OFFSET = 32L;
    private static final GroupLayout tcx$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$399:2"), MemoryLayout.PathElement.groupElement((String)"tcx")});
    private static final long tcx$OFFSET = 32L;
    private static final GroupLayout netkit$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$399:2"), MemoryLayout.PathElement.groupElement((String)"netkit")});
    private static final long netkit$OFFSET = 32L;

    bpf_link_create_opts() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong sz$layout() {
        return sz$LAYOUT;
    }

    public static final long sz$offset() {
        return 0L;
    }

    public static long sz(MemorySegment struct) {
        return struct.get(sz$LAYOUT, 0L);
    }

    public static void sz(MemorySegment struct, long fieldValue) {
        struct.set(sz$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 8L;
    }

    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 8L);
    }

    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout iter_info$layout() {
        return iter_info$LAYOUT;
    }

    public static final long iter_info$offset() {
        return 16L;
    }

    public static MemorySegment iter_info(MemorySegment struct) {
        return struct.get(iter_info$LAYOUT, 16L);
    }

    public static void iter_info(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(iter_info$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt iter_info_len$layout() {
        return iter_info_len$LAYOUT;
    }

    public static final long iter_info_len$offset() {
        return 24L;
    }

    public static int iter_info_len(MemorySegment struct) {
        return struct.get(iter_info_len$LAYOUT, 24L);
    }

    public static void iter_info_len(MemorySegment struct, int fieldValue) {
        struct.set(iter_info_len$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt target_btf_id$layout() {
        return target_btf_id$LAYOUT;
    }

    public static final long target_btf_id$offset() {
        return 28L;
    }

    public static int target_btf_id(MemorySegment struct) {
        return struct.get(target_btf_id$LAYOUT, 28L);
    }

    public static void target_btf_id(MemorySegment struct, int fieldValue) {
        struct.set(target_btf_id$LAYOUT, 28L, fieldValue);
    }

    public static final GroupLayout perf_event$layout() {
        return perf_event$LAYOUT;
    }

    public static final long perf_event$offset() {
        return 32L;
    }

    public static MemorySegment perf_event(MemorySegment struct) {
        return struct.asSlice(32L, perf_event$LAYOUT.byteSize());
    }

    public static void perf_event(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)perf_event$LAYOUT.byteSize());
    }

    public static final GroupLayout kprobe_multi$layout() {
        return kprobe_multi$LAYOUT;
    }

    public static final long kprobe_multi$offset() {
        return 32L;
    }

    public static MemorySegment kprobe_multi(MemorySegment struct) {
        return struct.asSlice(32L, kprobe_multi$LAYOUT.byteSize());
    }

    public static void kprobe_multi(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)kprobe_multi$LAYOUT.byteSize());
    }

    public static final GroupLayout uprobe_multi$layout() {
        return uprobe_multi$LAYOUT;
    }

    public static final long uprobe_multi$offset() {
        return 32L;
    }

    public static MemorySegment uprobe_multi(MemorySegment struct) {
        return struct.asSlice(32L, uprobe_multi$LAYOUT.byteSize());
    }

    public static void uprobe_multi(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)uprobe_multi$LAYOUT.byteSize());
    }

    public static final GroupLayout tracing$layout() {
        return tracing$LAYOUT;
    }

    public static final long tracing$offset() {
        return 32L;
    }

    public static MemorySegment tracing(MemorySegment struct) {
        return struct.asSlice(32L, tracing$LAYOUT.byteSize());
    }

    public static void tracing(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)tracing$LAYOUT.byteSize());
    }

    public static final GroupLayout netfilter$layout() {
        return netfilter$LAYOUT;
    }

    public static final long netfilter$offset() {
        return 32L;
    }

    public static MemorySegment netfilter(MemorySegment struct) {
        return struct.asSlice(32L, netfilter$LAYOUT.byteSize());
    }

    public static void netfilter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)netfilter$LAYOUT.byteSize());
    }

    public static final GroupLayout tcx$layout() {
        return tcx$LAYOUT;
    }

    public static final long tcx$offset() {
        return 32L;
    }

    public static MemorySegment tcx(MemorySegment struct) {
        return struct.asSlice(32L, tcx$LAYOUT.byteSize());
    }

    public static void tcx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)tcx$LAYOUT.byteSize());
    }

    public static final GroupLayout netkit$layout() {
        return netkit$LAYOUT;
    }

    public static final long netkit$offset() {
        return 32L;
    }

    public static MemorySegment netkit(MemorySegment struct) {
        return struct.asSlice(32L, netkit$LAYOUT.byteSize());
    }

    public static void netkit(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)netkit$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_link_create_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_link_create_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_link_create_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_link_create_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_link_create_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_link_create_opts.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class perf_event {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("bpf_cookie")}).withName("$anon$400:3");
        private static final ValueLayout.OfLong bpf_cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bpf_cookie")});
        private static final long bpf_cookie$OFFSET = 0L;

        perf_event() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong bpf_cookie$layout() {
            return bpf_cookie$LAYOUT;
        }

        public static final long bpf_cookie$offset() {
            return 0L;
        }

        public static long bpf_cookie(MemorySegment struct) {
            return struct.get(bpf_cookie$LAYOUT, 0L);
        }

        public static void bpf_cookie(MemorySegment struct, long fieldValue) {
            struct.set(bpf_cookie$LAYOUT, 0L, fieldValue);
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
    }

    public static class kprobe_multi {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("flags"), Lib.C_INT.withName("cnt"), Lib.C_POINTER.withName("syms"), Lib.C_POINTER.withName("addrs"), Lib.C_POINTER.withName("cookies")}).withName("$anon$403:3");
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 0L;
        private static final ValueLayout.OfInt cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cnt")});
        private static final long cnt$OFFSET = 4L;
        private static final AddressLayout syms$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"syms")});
        private static final long syms$OFFSET = 8L;
        private static final AddressLayout addrs$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addrs")});
        private static final long addrs$OFFSET = 16L;
        private static final AddressLayout cookies$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookies")});
        private static final long cookies$OFFSET = 24L;

        kprobe_multi() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 0L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 0L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt cnt$layout() {
            return cnt$LAYOUT;
        }

        public static final long cnt$offset() {
            return 4L;
        }

        public static int cnt(MemorySegment struct) {
            return struct.get(cnt$LAYOUT, 4L);
        }

        public static void cnt(MemorySegment struct, int fieldValue) {
            struct.set(cnt$LAYOUT, 4L, fieldValue);
        }

        public static final AddressLayout syms$layout() {
            return syms$LAYOUT;
        }

        public static final long syms$offset() {
            return 8L;
        }

        public static MemorySegment syms(MemorySegment struct) {
            return struct.get(syms$LAYOUT, 8L);
        }

        public static void syms(MemorySegment struct, MemorySegment fieldValue) {
            struct.set(syms$LAYOUT, 8L, fieldValue);
        }

        public static final AddressLayout addrs$layout() {
            return addrs$LAYOUT;
        }

        public static final long addrs$offset() {
            return 16L;
        }

        public static MemorySegment addrs(MemorySegment struct) {
            return struct.get(addrs$LAYOUT, 16L);
        }

        public static void addrs(MemorySegment struct, MemorySegment fieldValue) {
            struct.set(addrs$LAYOUT, 16L, fieldValue);
        }

        public static final AddressLayout cookies$layout() {
            return cookies$LAYOUT;
        }

        public static final long cookies$offset() {
            return 24L;
        }

        public static MemorySegment cookies(MemorySegment struct) {
            return struct.get(cookies$LAYOUT, 24L);
        }

        public static void cookies(MemorySegment struct, MemorySegment fieldValue) {
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
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("flags"), Lib.C_INT.withName("cnt"), Lib.C_POINTER.withName("path"), Lib.C_POINTER.withName("offsets"), Lib.C_POINTER.withName("ref_ctr_offsets"), Lib.C_POINTER.withName("cookies"), Lib.C_INT.withName("pid"), MemoryLayout.paddingLayout((long)4L)}).withName("$anon$410:3");
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 0L;
        private static final ValueLayout.OfInt cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cnt")});
        private static final long cnt$OFFSET = 4L;
        private static final AddressLayout path$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"path")});
        private static final long path$OFFSET = 8L;
        private static final AddressLayout offsets$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"offsets")});
        private static final long offsets$OFFSET = 16L;
        private static final AddressLayout ref_ctr_offsets$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ref_ctr_offsets")});
        private static final long ref_ctr_offsets$OFFSET = 24L;
        private static final AddressLayout cookies$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookies")});
        private static final long cookies$OFFSET = 32L;
        private static final ValueLayout.OfInt pid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pid")});
        private static final long pid$OFFSET = 40L;

        uprobe_multi() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 0L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 0L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt cnt$layout() {
            return cnt$LAYOUT;
        }

        public static final long cnt$offset() {
            return 4L;
        }

        public static int cnt(MemorySegment struct) {
            return struct.get(cnt$LAYOUT, 4L);
        }

        public static void cnt(MemorySegment struct, int fieldValue) {
            struct.set(cnt$LAYOUT, 4L, fieldValue);
        }

        public static final AddressLayout path$layout() {
            return path$LAYOUT;
        }

        public static final long path$offset() {
            return 8L;
        }

        public static MemorySegment path(MemorySegment struct) {
            return struct.get(path$LAYOUT, 8L);
        }

        public static void path(MemorySegment struct, MemorySegment fieldValue) {
            struct.set(path$LAYOUT, 8L, fieldValue);
        }

        public static final AddressLayout offsets$layout() {
            return offsets$LAYOUT;
        }

        public static final long offsets$offset() {
            return 16L;
        }

        public static MemorySegment offsets(MemorySegment struct) {
            return struct.get(offsets$LAYOUT, 16L);
        }

        public static void offsets(MemorySegment struct, MemorySegment fieldValue) {
            struct.set(offsets$LAYOUT, 16L, fieldValue);
        }

        public static final AddressLayout ref_ctr_offsets$layout() {
            return ref_ctr_offsets$LAYOUT;
        }

        public static final long ref_ctr_offsets$offset() {
            return 24L;
        }

        public static MemorySegment ref_ctr_offsets(MemorySegment struct) {
            return struct.get(ref_ctr_offsets$LAYOUT, 24L);
        }

        public static void ref_ctr_offsets(MemorySegment struct, MemorySegment fieldValue) {
            struct.set(ref_ctr_offsets$LAYOUT, 24L, fieldValue);
        }

        public static final AddressLayout cookies$layout() {
            return cookies$LAYOUT;
        }

        public static final long cookies$offset() {
            return 32L;
        }

        public static MemorySegment cookies(MemorySegment struct) {
            return struct.get(cookies$LAYOUT, 32L);
        }

        public static void cookies(MemorySegment struct, MemorySegment fieldValue) {
            struct.set(cookies$LAYOUT, 32L, fieldValue);
        }

        public static final ValueLayout.OfInt pid$layout() {
            return pid$LAYOUT;
        }

        public static final long pid$offset() {
            return 40L;
        }

        public static int pid(MemorySegment struct) {
            return struct.get(pid$LAYOUT, 40L);
        }

        public static void pid(MemorySegment struct, int fieldValue) {
            struct.set(pid$LAYOUT, 40L, fieldValue);
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

    public static class tracing {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("cookie")}).withName("$anon$419:3");
        private static final ValueLayout.OfLong cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookie")});
        private static final long cookie$OFFSET = 0L;

        tracing() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong cookie$layout() {
            return cookie$LAYOUT;
        }

        public static final long cookie$offset() {
            return 0L;
        }

        public static long cookie(MemorySegment struct) {
            return struct.get(cookie$LAYOUT, 0L);
        }

        public static void cookie(MemorySegment struct, long fieldValue) {
            struct.set(cookie$LAYOUT, 0L, fieldValue);
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

    public static class netfilter {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("pf"), Lib.C_INT.withName("hooknum"), Lib.C_INT.withName("priority"), Lib.C_INT.withName("flags")}).withName("$anon$422:3");
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

    public static class tcx {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("relative_fd"), Lib.C_INT.withName("relative_id"), Lib.C_LONG_LONG.withName("expected_revision")}).withName("$anon$428:3");
        private static final ValueLayout.OfInt relative_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"relative_fd")});
        private static final long relative_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt relative_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"relative_id")});
        private static final long relative_id$OFFSET = 4L;
        private static final ValueLayout.OfLong expected_revision$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"expected_revision")});
        private static final long expected_revision$OFFSET = 8L;

        tcx() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt relative_fd$layout() {
            return relative_fd$LAYOUT;
        }

        public static final long relative_fd$offset() {
            return 0L;
        }

        public static int relative_fd(MemorySegment struct) {
            return struct.get(relative_fd$LAYOUT, 0L);
        }

        public static void relative_fd(MemorySegment struct, int fieldValue) {
            struct.set(relative_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt relative_id$layout() {
            return relative_id$LAYOUT;
        }

        public static final long relative_id$offset() {
            return 4L;
        }

        public static int relative_id(MemorySegment struct) {
            return struct.get(relative_id$LAYOUT, 4L);
        }

        public static void relative_id(MemorySegment struct, int fieldValue) {
            struct.set(relative_id$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfLong expected_revision$layout() {
            return expected_revision$LAYOUT;
        }

        public static final long expected_revision$offset() {
            return 8L;
        }

        public static long expected_revision(MemorySegment struct) {
            return struct.get(expected_revision$LAYOUT, 8L);
        }

        public static void expected_revision(MemorySegment struct, long fieldValue) {
            struct.set(expected_revision$LAYOUT, 8L, fieldValue);
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
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("relative_fd"), Lib.C_INT.withName("relative_id"), Lib.C_LONG_LONG.withName("expected_revision")}).withName("$anon$433:3");
        private static final ValueLayout.OfInt relative_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"relative_fd")});
        private static final long relative_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt relative_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"relative_id")});
        private static final long relative_id$OFFSET = 4L;
        private static final ValueLayout.OfLong expected_revision$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"expected_revision")});
        private static final long expected_revision$OFFSET = 8L;

        netkit() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt relative_fd$layout() {
            return relative_fd$LAYOUT;
        }

        public static final long relative_fd$offset() {
            return 0L;
        }

        public static int relative_fd(MemorySegment struct) {
            return struct.get(relative_fd$LAYOUT, 0L);
        }

        public static void relative_fd(MemorySegment struct, int fieldValue) {
            struct.set(relative_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt relative_id$layout() {
            return relative_id$LAYOUT;
        }

        public static final long relative_id$offset() {
            return 4L;
        }

        public static int relative_id(MemorySegment struct) {
            return struct.get(relative_id$LAYOUT, 4L);
        }

        public static void relative_id(MemorySegment struct, int fieldValue) {
            struct.set(relative_id$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfLong expected_revision$layout() {
            return expected_revision$LAYOUT;
        }

        public static final long expected_revision$offset() {
            return 8L;
        }

        public static long expected_revision(MemorySegment struct) {
            return struct.get(expected_revision$LAYOUT, 8L);
        }

        public static void expected_revision(MemorySegment struct, long fieldValue) {
            struct.set(expected_revision$LAYOUT, 8L, fieldValue);
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
}

