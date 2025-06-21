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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class __locale_struct {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)13L, (MemoryLayout)Lib.C_POINTER).withName("__locales"), Lib.C_POINTER.withName("__ctype_b"), Lib.C_POINTER.withName("__ctype_tolower"), Lib.C_POINTER.withName("__ctype_toupper"), MemoryLayout.sequenceLayout((long)13L, (MemoryLayout)Lib.C_POINTER).withName("__names")}).withName("__locale_struct");
    private static final SequenceLayout __locales$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__locales")});
    private static final long __locales$OFFSET = 0L;
    private static long[] __locales$DIMS = new long[]{13L};
    private static final VarHandle __locales$ELEM_HANDLE = __locales$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final AddressLayout __ctype_b$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__ctype_b")});
    private static final long __ctype_b$OFFSET = 104L;
    private static final AddressLayout __ctype_tolower$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__ctype_tolower")});
    private static final long __ctype_tolower$OFFSET = 112L;
    private static final AddressLayout __ctype_toupper$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__ctype_toupper")});
    private static final long __ctype_toupper$OFFSET = 120L;
    private static final SequenceLayout __names$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__names")});
    private static final long __names$OFFSET = 128L;
    private static long[] __names$DIMS = new long[]{13L};
    private static final VarHandle __names$ELEM_HANDLE = __names$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    __locale_struct() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout __locales$layout() {
        return __locales$LAYOUT;
    }

    public static final long __locales$offset() {
        return 0L;
    }

    public static MemorySegment __locales(MemorySegment struct) {
        return struct.asSlice(0L, __locales$LAYOUT.byteSize());
    }

    public static void __locales(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)__locales$LAYOUT.byteSize());
    }

    public static long[] __locales$dimensions() {
        return __locales$DIMS;
    }

    public static MemorySegment __locales(MemorySegment struct, long index0) {
        return __locales$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __locales(MemorySegment struct, long index0, MemorySegment fieldValue) {
        __locales$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final AddressLayout __ctype_b$layout() {
        return __ctype_b$LAYOUT;
    }

    public static final long __ctype_b$offset() {
        return 104L;
    }

    public static MemorySegment __ctype_b(MemorySegment struct) {
        return struct.get(__ctype_b$LAYOUT, 104L);
    }

    public static void __ctype_b(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__ctype_b$LAYOUT, 104L, fieldValue);
    }

    public static final AddressLayout __ctype_tolower$layout() {
        return __ctype_tolower$LAYOUT;
    }

    public static final long __ctype_tolower$offset() {
        return 112L;
    }

    public static MemorySegment __ctype_tolower(MemorySegment struct) {
        return struct.get(__ctype_tolower$LAYOUT, 112L);
    }

    public static void __ctype_tolower(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__ctype_tolower$LAYOUT, 112L, fieldValue);
    }

    public static final AddressLayout __ctype_toupper$layout() {
        return __ctype_toupper$LAYOUT;
    }

    public static final long __ctype_toupper$offset() {
        return 120L;
    }

    public static MemorySegment __ctype_toupper(MemorySegment struct) {
        return struct.get(__ctype_toupper$LAYOUT, 120L);
    }

    public static void __ctype_toupper(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__ctype_toupper$LAYOUT, 120L, fieldValue);
    }

    public static final SequenceLayout __names$layout() {
        return __names$LAYOUT;
    }

    public static final long __names$offset() {
        return 128L;
    }

    public static MemorySegment __names(MemorySegment struct) {
        return struct.asSlice(128L, __names$LAYOUT.byteSize());
    }

    public static void __names(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)128L, (long)__names$LAYOUT.byteSize());
    }

    public static long[] __names$dimensions() {
        return __names$DIMS;
    }

    public static MemorySegment __names(MemorySegment struct, long index0) {
        return __names$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __names(MemorySegment struct, long index0, MemorySegment fieldValue) {
        __names$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__locale_struct.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __locale_struct.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__locale_struct.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__locale_struct.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __locale_struct.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__locale_struct.layout().byteSize() * elementCount, arena, cleanup);
    }
}

