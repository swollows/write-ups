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
 *  java.lang.foreign.ValueLayout$OfBoolean
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

public class bpf_kprobe_multi_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("syms"), Lib.C_POINTER.withName("addrs"), Lib.C_POINTER.withName("cookies"), Lib.C_LONG.withName("cnt"), Lib.C_BOOL.withName("retprobe"), Lib.C_BOOL.withName("session"), MemoryLayout.paddingLayout((long)6L)}).withName("bpf_kprobe_multi_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout syms$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"syms")});
    private static final long syms$OFFSET = 8L;
    private static final AddressLayout addrs$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addrs")});
    private static final long addrs$OFFSET = 16L;
    private static final AddressLayout cookies$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookies")});
    private static final long cookies$OFFSET = 24L;
    private static final ValueLayout.OfLong cnt$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cnt")});
    private static final long cnt$OFFSET = 32L;
    private static final ValueLayout.OfBoolean retprobe$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"retprobe")});
    private static final long retprobe$OFFSET = 40L;
    private static final ValueLayout.OfBoolean session$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"session")});
    private static final long session$OFFSET = 41L;

    bpf_kprobe_multi_opts() {
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

    public static final ValueLayout.OfLong cnt$layout() {
        return cnt$LAYOUT;
    }

    public static final long cnt$offset() {
        return 32L;
    }

    public static long cnt(MemorySegment struct) {
        return struct.get(cnt$LAYOUT, 32L);
    }

    public static void cnt(MemorySegment struct, long fieldValue) {
        struct.set(cnt$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfBoolean retprobe$layout() {
        return retprobe$LAYOUT;
    }

    public static final long retprobe$offset() {
        return 40L;
    }

    public static boolean retprobe(MemorySegment struct) {
        return struct.get(retprobe$LAYOUT, 40L);
    }

    public static void retprobe(MemorySegment struct, boolean fieldValue) {
        struct.set(retprobe$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfBoolean session$layout() {
        return session$LAYOUT;
    }

    public static final long session$offset() {
        return 41L;
    }

    public static boolean session(MemorySegment struct) {
        return struct.get(session$LAYOUT, 41L);
    }

    public static void session(MemorySegment struct, boolean fieldValue) {
        struct.set(session$LAYOUT, 41L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_kprobe_multi_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_kprobe_multi_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_kprobe_multi_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_kprobe_multi_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_kprobe_multi_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_kprobe_multi_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

