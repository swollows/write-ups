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

public class bpf_netfilter_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("pf"), Lib.C_INT.withName("hooknum"), Lib.C_INT.withName("priority"), Lib.C_INT.withName("flags")}).withName("bpf_netfilter_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt pf$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pf")});
    private static final long pf$OFFSET = 8L;
    private static final ValueLayout.OfInt hooknum$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hooknum")});
    private static final long hooknum$OFFSET = 12L;
    private static final ValueLayout.OfInt priority$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"priority")});
    private static final long priority$OFFSET = 16L;
    private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 20L;

    bpf_netfilter_opts() {
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

    public static final ValueLayout.OfInt pf$layout() {
        return pf$LAYOUT;
    }

    public static final long pf$offset() {
        return 8L;
    }

    public static int pf(MemorySegment struct) {
        return struct.get(pf$LAYOUT, 8L);
    }

    public static void pf(MemorySegment struct, int fieldValue) {
        struct.set(pf$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt hooknum$layout() {
        return hooknum$LAYOUT;
    }

    public static final long hooknum$offset() {
        return 12L;
    }

    public static int hooknum(MemorySegment struct) {
        return struct.get(hooknum$LAYOUT, 12L);
    }

    public static void hooknum(MemorySegment struct, int fieldValue) {
        struct.set(hooknum$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt priority$layout() {
        return priority$LAYOUT;
    }

    public static final long priority$offset() {
        return 16L;
    }

    public static int priority(MemorySegment struct) {
        return struct.get(priority$LAYOUT, 16L);
    }

    public static void priority(MemorySegment struct, int fieldValue) {
        struct.set(priority$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 20L;
    }

    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 20L);
    }

    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, 20L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_netfilter_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_netfilter_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_netfilter_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_netfilter_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_netfilter_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_netfilter_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

