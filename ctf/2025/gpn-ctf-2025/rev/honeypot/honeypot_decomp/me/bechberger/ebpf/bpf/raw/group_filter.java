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
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.__kernel_sockaddr_storage;

public class group_filter {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("gf_interface_aux"), MemoryLayout.paddingLayout((long)4L), __kernel_sockaddr_storage.layout().withName("gf_group_aux"), Lib.C_INT.withName("gf_fmode_aux"), Lib.C_INT.withName("gf_numsrc_aux"), MemoryLayout.sequenceLayout((long)1L, (MemoryLayout)__kernel_sockaddr_storage.layout()).withName("gf_slist")}).withName("$anon$227:3"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("gf_interface"), MemoryLayout.paddingLayout((long)4L), __kernel_sockaddr_storage.layout().withName("gf_group"), Lib.C_INT.withName("gf_fmode"), Lib.C_INT.withName("gf_numsrc"), MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)__kernel_sockaddr_storage.layout()).withName("gf_slist_flex")}).withName("$anon$234:3")}).withName("$anon$226:2")}).withName("group_filter");
    private static final ValueLayout.OfInt gf_interface_aux$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$227:3"), MemoryLayout.PathElement.groupElement((String)"gf_interface_aux")});
    private static final long gf_interface_aux$OFFSET = 0L;
    private static final GroupLayout gf_group_aux$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$227:3"), MemoryLayout.PathElement.groupElement((String)"gf_group_aux")});
    private static final long gf_group_aux$OFFSET = 8L;
    private static final ValueLayout.OfInt gf_fmode_aux$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$227:3"), MemoryLayout.PathElement.groupElement((String)"gf_fmode_aux")});
    private static final long gf_fmode_aux$OFFSET = 136L;
    private static final ValueLayout.OfInt gf_numsrc_aux$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$227:3"), MemoryLayout.PathElement.groupElement((String)"gf_numsrc_aux")});
    private static final long gf_numsrc_aux$OFFSET = 140L;
    private static final SequenceLayout gf_slist$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$227:3"), MemoryLayout.PathElement.groupElement((String)"gf_slist")});
    private static final long gf_slist$OFFSET = 144L;
    private static long[] gf_slist$DIMS = new long[]{1L};
    private static final MethodHandle gf_slist$ELEM_HANDLE = gf_slist$LAYOUT.sliceHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt gf_interface$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$234:3"), MemoryLayout.PathElement.groupElement((String)"gf_interface")});
    private static final long gf_interface$OFFSET = 0L;
    private static final GroupLayout gf_group$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$234:3"), MemoryLayout.PathElement.groupElement((String)"gf_group")});
    private static final long gf_group$OFFSET = 8L;
    private static final ValueLayout.OfInt gf_fmode$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$234:3"), MemoryLayout.PathElement.groupElement((String)"gf_fmode")});
    private static final long gf_fmode$OFFSET = 136L;
    private static final ValueLayout.OfInt gf_numsrc$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$234:3"), MemoryLayout.PathElement.groupElement((String)"gf_numsrc")});
    private static final long gf_numsrc$OFFSET = 140L;
    private static final SequenceLayout gf_slist_flex$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$226:2"), MemoryLayout.PathElement.groupElement((String)"$anon$234:3"), MemoryLayout.PathElement.groupElement((String)"gf_slist_flex")});
    private static final long gf_slist_flex$OFFSET = 144L;

    group_filter() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt gf_interface_aux$layout() {
        return gf_interface_aux$LAYOUT;
    }

    public static final long gf_interface_aux$offset() {
        return 0L;
    }

    public static int gf_interface_aux(MemorySegment struct) {
        return struct.get(gf_interface_aux$LAYOUT, 0L);
    }

    public static void gf_interface_aux(MemorySegment struct, int fieldValue) {
        struct.set(gf_interface_aux$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout gf_group_aux$layout() {
        return gf_group_aux$LAYOUT;
    }

    public static final long gf_group_aux$offset() {
        return 8L;
    }

    public static MemorySegment gf_group_aux(MemorySegment struct) {
        return struct.asSlice(8L, gf_group_aux$LAYOUT.byteSize());
    }

    public static void gf_group_aux(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)gf_group_aux$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt gf_fmode_aux$layout() {
        return gf_fmode_aux$LAYOUT;
    }

    public static final long gf_fmode_aux$offset() {
        return 136L;
    }

    public static int gf_fmode_aux(MemorySegment struct) {
        return struct.get(gf_fmode_aux$LAYOUT, 136L);
    }

    public static void gf_fmode_aux(MemorySegment struct, int fieldValue) {
        struct.set(gf_fmode_aux$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfInt gf_numsrc_aux$layout() {
        return gf_numsrc_aux$LAYOUT;
    }

    public static final long gf_numsrc_aux$offset() {
        return 140L;
    }

    public static int gf_numsrc_aux(MemorySegment struct) {
        return struct.get(gf_numsrc_aux$LAYOUT, 140L);
    }

    public static void gf_numsrc_aux(MemorySegment struct, int fieldValue) {
        struct.set(gf_numsrc_aux$LAYOUT, 140L, fieldValue);
    }

    public static final SequenceLayout gf_slist$layout() {
        return gf_slist$LAYOUT;
    }

    public static final long gf_slist$offset() {
        return 144L;
    }

    public static MemorySegment gf_slist(MemorySegment struct) {
        return struct.asSlice(144L, gf_slist$LAYOUT.byteSize());
    }

    public static void gf_slist(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)144L, (long)gf_slist$LAYOUT.byteSize());
    }

    public static long[] gf_slist$dimensions() {
        return gf_slist$DIMS;
    }

    public static MemorySegment gf_slist(MemorySegment struct, long index0) {
        try {
            return gf_slist$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static void gf_slist(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)group_filter.gf_slist(struct, index0), (long)0L, (long)__kernel_sockaddr_storage.layout().byteSize());
    }

    public static final ValueLayout.OfInt gf_interface$layout() {
        return gf_interface$LAYOUT;
    }

    public static final long gf_interface$offset() {
        return 0L;
    }

    public static int gf_interface(MemorySegment struct) {
        return struct.get(gf_interface$LAYOUT, 0L);
    }

    public static void gf_interface(MemorySegment struct, int fieldValue) {
        struct.set(gf_interface$LAYOUT, 0L, fieldValue);
    }

    public static final GroupLayout gf_group$layout() {
        return gf_group$LAYOUT;
    }

    public static final long gf_group$offset() {
        return 8L;
    }

    public static MemorySegment gf_group(MemorySegment struct) {
        return struct.asSlice(8L, gf_group$LAYOUT.byteSize());
    }

    public static void gf_group(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)gf_group$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt gf_fmode$layout() {
        return gf_fmode$LAYOUT;
    }

    public static final long gf_fmode$offset() {
        return 136L;
    }

    public static int gf_fmode(MemorySegment struct) {
        return struct.get(gf_fmode$LAYOUT, 136L);
    }

    public static void gf_fmode(MemorySegment struct, int fieldValue) {
        struct.set(gf_fmode$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfInt gf_numsrc$layout() {
        return gf_numsrc$LAYOUT;
    }

    public static final long gf_numsrc$offset() {
        return 140L;
    }

    public static int gf_numsrc(MemorySegment struct) {
        return struct.get(gf_numsrc$LAYOUT, 140L);
    }

    public static void gf_numsrc(MemorySegment struct, int fieldValue) {
        struct.set(gf_numsrc$LAYOUT, 140L, fieldValue);
    }

    public static final SequenceLayout gf_slist_flex$layout() {
        return gf_slist_flex$LAYOUT;
    }

    public static final long gf_slist_flex$offset() {
        return 144L;
    }

    public static MemorySegment gf_slist_flex(MemorySegment struct) {
        return struct.asSlice(144L, gf_slist_flex$LAYOUT.byteSize());
    }

    public static void gf_slist_flex(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)144L, (long)gf_slist_flex$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(group_filter.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return group_filter.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)group_filter.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)group_filter.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return group_filter.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(group_filter.layout().byteSize() * elementCount, arena, cleanup);
    }
}

