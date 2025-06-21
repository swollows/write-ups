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
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class _IO_cookie_io_functions_t {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("read"), Lib.C_POINTER.withName("write"), Lib.C_POINTER.withName("seek"), Lib.C_POINTER.withName("close")}).withName("_IO_cookie_io_functions_t");
    private static final AddressLayout read$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"read")});
    private static final long read$OFFSET = 0L;
    private static final AddressLayout write$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"write")});
    private static final long write$OFFSET = 8L;
    private static final AddressLayout seek$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"seek")});
    private static final long seek$OFFSET = 16L;
    private static final AddressLayout close$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"close")});
    private static final long close$OFFSET = 24L;

    _IO_cookie_io_functions_t() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final AddressLayout read$layout() {
        return read$LAYOUT;
    }

    public static final long read$offset() {
        return 0L;
    }

    public static MemorySegment read(MemorySegment struct) {
        return struct.get(read$LAYOUT, 0L);
    }

    public static void read(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(read$LAYOUT, 0L, fieldValue);
    }

    public static final AddressLayout write$layout() {
        return write$LAYOUT;
    }

    public static final long write$offset() {
        return 8L;
    }

    public static MemorySegment write(MemorySegment struct) {
        return struct.get(write$LAYOUT, 8L);
    }

    public static void write(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(write$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout seek$layout() {
        return seek$LAYOUT;
    }

    public static final long seek$offset() {
        return 16L;
    }

    public static MemorySegment seek(MemorySegment struct) {
        return struct.get(seek$LAYOUT, 16L);
    }

    public static void seek(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(seek$LAYOUT, 16L, fieldValue);
    }

    public static final AddressLayout close$layout() {
        return close$LAYOUT;
    }

    public static final long close$offset() {
        return 24L;
    }

    public static MemorySegment close(MemorySegment struct) {
        return struct.get(close$LAYOUT, 24L);
    }

    public static void close(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(close$LAYOUT, 24L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(_IO_cookie_io_functions_t.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return _IO_cookie_io_functions_t.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)_IO_cookie_io_functions_t.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)_IO_cookie_io_functions_t.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return _IO_cookie_io_functions_t.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(_IO_cookie_io_functions_t.layout().byteSize() * elementCount, arena, cleanup);
    }
}

