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

public class btf_dedup_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("btf_ext"), Lib.C_BOOL.withName("force_collisions"), MemoryLayout.paddingLayout((long)7L)}).withName("btf_dedup_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout btf_ext$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_ext")});
    private static final long btf_ext$OFFSET = 8L;
    private static final ValueLayout.OfBoolean force_collisions$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"force_collisions")});
    private static final long force_collisions$OFFSET = 16L;

    btf_dedup_opts() {
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

    public static final AddressLayout btf_ext$layout() {
        return btf_ext$LAYOUT;
    }

    public static final long btf_ext$offset() {
        return 8L;
    }

    public static MemorySegment btf_ext(MemorySegment struct) {
        return struct.get(btf_ext$LAYOUT, 8L);
    }

    public static void btf_ext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(btf_ext$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfBoolean force_collisions$layout() {
        return force_collisions$LAYOUT;
    }

    public static final long force_collisions$offset() {
        return 16L;
    }

    public static boolean force_collisions(MemorySegment struct) {
        return struct.get(force_collisions$LAYOUT, 16L);
    }

    public static void force_collisions(MemorySegment struct, boolean fieldValue) {
        struct.set(force_collisions$LAYOUT, 16L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(btf_dedup_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return btf_dedup_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)btf_dedup_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)btf_dedup_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return btf_dedup_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(btf_dedup_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

