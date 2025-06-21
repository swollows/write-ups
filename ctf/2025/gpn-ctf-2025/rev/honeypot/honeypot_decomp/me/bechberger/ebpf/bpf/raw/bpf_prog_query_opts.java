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

public class bpf_prog_query_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("query_flags"), Lib.C_INT.withName("attach_flags"), Lib.C_POINTER.withName("prog_ids"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("prog_cnt"), Lib.C_INT.withName("count")}).withName("$anon$590:2"), MemoryLayout.paddingLayout((long)4L), Lib.C_POINTER.withName("prog_attach_flags"), Lib.C_POINTER.withName("link_ids"), Lib.C_POINTER.withName("link_attach_flags"), Lib.C_LONG_LONG.withName("revision")}).withName("bpf_prog_query_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt query_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"query_flags")});
    private static final long query_flags$OFFSET = 8L;
    private static final ValueLayout.OfInt attach_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_flags")});
    private static final long attach_flags$OFFSET = 12L;
    private static final AddressLayout prog_ids$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_ids")});
    private static final long prog_ids$OFFSET = 16L;
    private static final ValueLayout.OfInt prog_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$590:2"), MemoryLayout.PathElement.groupElement((String)"prog_cnt")});
    private static final long prog_cnt$OFFSET = 24L;
    private static final ValueLayout.OfInt count$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$590:2"), MemoryLayout.PathElement.groupElement((String)"count")});
    private static final long count$OFFSET = 24L;
    private static final AddressLayout prog_attach_flags$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_attach_flags")});
    private static final long prog_attach_flags$OFFSET = 32L;
    private static final AddressLayout link_ids$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_ids")});
    private static final long link_ids$OFFSET = 40L;
    private static final AddressLayout link_attach_flags$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_attach_flags")});
    private static final long link_attach_flags$OFFSET = 48L;
    private static final ValueLayout.OfLong revision$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"revision")});
    private static final long revision$OFFSET = 56L;

    bpf_prog_query_opts() {
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

    public static final ValueLayout.OfInt query_flags$layout() {
        return query_flags$LAYOUT;
    }

    public static final long query_flags$offset() {
        return 8L;
    }

    public static int query_flags(MemorySegment struct) {
        return struct.get(query_flags$LAYOUT, 8L);
    }

    public static void query_flags(MemorySegment struct, int fieldValue) {
        struct.set(query_flags$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_flags$layout() {
        return attach_flags$LAYOUT;
    }

    public static final long attach_flags$offset() {
        return 12L;
    }

    public static int attach_flags(MemorySegment struct) {
        return struct.get(attach_flags$LAYOUT, 12L);
    }

    public static void attach_flags(MemorySegment struct, int fieldValue) {
        struct.set(attach_flags$LAYOUT, 12L, fieldValue);
    }

    public static final AddressLayout prog_ids$layout() {
        return prog_ids$LAYOUT;
    }

    public static final long prog_ids$offset() {
        return 16L;
    }

    public static MemorySegment prog_ids(MemorySegment struct) {
        return struct.get(prog_ids$LAYOUT, 16L);
    }

    public static void prog_ids(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prog_ids$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_cnt$layout() {
        return prog_cnt$LAYOUT;
    }

    public static final long prog_cnt$offset() {
        return 24L;
    }

    public static int prog_cnt(MemorySegment struct) {
        return struct.get(prog_cnt$LAYOUT, 24L);
    }

    public static void prog_cnt(MemorySegment struct, int fieldValue) {
        struct.set(prog_cnt$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt count$layout() {
        return count$LAYOUT;
    }

    public static final long count$offset() {
        return 24L;
    }

    public static int count(MemorySegment struct) {
        return struct.get(count$LAYOUT, 24L);
    }

    public static void count(MemorySegment struct, int fieldValue) {
        struct.set(count$LAYOUT, 24L, fieldValue);
    }

    public static final AddressLayout prog_attach_flags$layout() {
        return prog_attach_flags$LAYOUT;
    }

    public static final long prog_attach_flags$offset() {
        return 32L;
    }

    public static MemorySegment prog_attach_flags(MemorySegment struct) {
        return struct.get(prog_attach_flags$LAYOUT, 32L);
    }

    public static void prog_attach_flags(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prog_attach_flags$LAYOUT, 32L, fieldValue);
    }

    public static final AddressLayout link_ids$layout() {
        return link_ids$LAYOUT;
    }

    public static final long link_ids$offset() {
        return 40L;
    }

    public static MemorySegment link_ids(MemorySegment struct) {
        return struct.get(link_ids$LAYOUT, 40L);
    }

    public static void link_ids(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(link_ids$LAYOUT, 40L, fieldValue);
    }

    public static final AddressLayout link_attach_flags$layout() {
        return link_attach_flags$LAYOUT;
    }

    public static final long link_attach_flags$offset() {
        return 48L;
    }

    public static MemorySegment link_attach_flags(MemorySegment struct) {
        return struct.get(link_attach_flags$LAYOUT, 48L);
    }

    public static void link_attach_flags(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(link_attach_flags$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfLong revision$layout() {
        return revision$LAYOUT;
    }

    public static final long revision$offset() {
        return 56L;
    }

    public static long revision(MemorySegment struct) {
        return struct.get(revision$LAYOUT, 56L);
    }

    public static void revision(MemorySegment struct, long fieldValue) {
        struct.set(revision$LAYOUT, 56L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_prog_query_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_prog_query_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_prog_query_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_prog_query_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_prog_query_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_prog_query_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

