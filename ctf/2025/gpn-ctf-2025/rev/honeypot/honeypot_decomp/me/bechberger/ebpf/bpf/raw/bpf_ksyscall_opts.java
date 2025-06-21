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
 *  java.lang.foreign.ValueLayout$OfBoolean
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

public class bpf_ksyscall_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_LONG_LONG.withName("bpf_cookie"), Lib.C_BOOL.withName("retprobe"), MemoryLayout.paddingLayout((long)7L)}).withName("bpf_ksyscall_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfLong bpf_cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bpf_cookie")});
    private static final long bpf_cookie$OFFSET = 8L;
    private static final ValueLayout.OfBoolean retprobe$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"retprobe")});
    private static final long retprobe$OFFSET = 16L;

    bpf_ksyscall_opts() {
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

    public static final ValueLayout.OfLong bpf_cookie$layout() {
        return bpf_cookie$LAYOUT;
    }

    public static final long bpf_cookie$offset() {
        return 8L;
    }

    public static long bpf_cookie(MemorySegment struct) {
        return struct.get(bpf_cookie$LAYOUT, 8L);
    }

    public static void bpf_cookie(MemorySegment struct, long fieldValue) {
        struct.set(bpf_cookie$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfBoolean retprobe$layout() {
        return retprobe$LAYOUT;
    }

    public static final long retprobe$offset() {
        return 16L;
    }

    public static boolean retprobe(MemorySegment struct) {
        return struct.get(retprobe$LAYOUT, 16L);
    }

    public static void retprobe(MemorySegment struct, boolean fieldValue) {
        struct.set(retprobe$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_ksyscall_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_ksyscall_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_ksyscall_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_ksyscall_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_ksyscall_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_ksyscall_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

