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

public class libbpf_prog_handler_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_LONG.withName("cookie"), Lib.C_POINTER.withName("prog_setup_fn"), Lib.C_POINTER.withName("prog_prepare_load_fn"), Lib.C_POINTER.withName("prog_attach_fn")}).withName("libbpf_prog_handler_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfLong cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookie")});
    private static final long cookie$OFFSET = 8L;
    private static final AddressLayout prog_setup_fn$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_setup_fn")});
    private static final long prog_setup_fn$OFFSET = 16L;
    private static final AddressLayout prog_prepare_load_fn$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_prepare_load_fn")});
    private static final long prog_prepare_load_fn$OFFSET = 24L;
    private static final AddressLayout prog_attach_fn$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_attach_fn")});
    private static final long prog_attach_fn$OFFSET = 32L;

    libbpf_prog_handler_opts() {
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

    public static final ValueLayout.OfLong cookie$layout() {
        return cookie$LAYOUT;
    }

    public static final long cookie$offset() {
        return 8L;
    }

    public static long cookie(MemorySegment struct) {
        return struct.get(cookie$LAYOUT, 8L);
    }

    public static void cookie(MemorySegment struct, long fieldValue) {
        struct.set(cookie$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout prog_setup_fn$layout() {
        return prog_setup_fn$LAYOUT;
    }

    public static final long prog_setup_fn$offset() {
        return 16L;
    }

    public static MemorySegment prog_setup_fn(MemorySegment struct) {
        return struct.get(prog_setup_fn$LAYOUT, 16L);
    }

    public static void prog_setup_fn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prog_setup_fn$LAYOUT, 16L, fieldValue);
    }

    public static final AddressLayout prog_prepare_load_fn$layout() {
        return prog_prepare_load_fn$LAYOUT;
    }

    public static final long prog_prepare_load_fn$offset() {
        return 24L;
    }

    public static MemorySegment prog_prepare_load_fn(MemorySegment struct) {
        return struct.get(prog_prepare_load_fn$LAYOUT, 24L);
    }

    public static void prog_prepare_load_fn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prog_prepare_load_fn$LAYOUT, 24L, fieldValue);
    }

    public static final AddressLayout prog_attach_fn$layout() {
        return prog_attach_fn$LAYOUT;
    }

    public static final long prog_attach_fn$offset() {
        return 32L;
    }

    public static MemorySegment prog_attach_fn(MemorySegment struct) {
        return struct.get(prog_attach_fn$LAYOUT, 32L);
    }

    public static void prog_attach_fn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prog_attach_fn$LAYOUT, 32L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(libbpf_prog_handler_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return libbpf_prog_handler_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)libbpf_prog_handler_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)libbpf_prog_handler_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return libbpf_prog_handler_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(libbpf_prog_handler_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

