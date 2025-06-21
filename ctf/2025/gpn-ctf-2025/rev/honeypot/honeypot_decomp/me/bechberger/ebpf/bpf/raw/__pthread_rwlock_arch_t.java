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
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class __pthread_rwlock_arch_t {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("__readers"), Lib.C_INT.withName("__writers"), Lib.C_INT.withName("__wrphase_futex"), Lib.C_INT.withName("__writers_futex"), Lib.C_INT.withName("__pad3"), Lib.C_INT.withName("__pad4"), Lib.C_INT.withName("__cur_writer"), Lib.C_INT.withName("__shared"), Lib.C_CHAR.withName("__rwelision"), MemoryLayout.sequenceLayout((long)7L, (MemoryLayout)Lib.C_CHAR).withName("__pad1"), Lib.C_LONG.withName("__pad2"), Lib.C_INT.withName("__flags"), MemoryLayout.paddingLayout((long)4L)}).withName("__pthread_rwlock_arch_t");
    private static final ValueLayout.OfInt __readers$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__readers")});
    private static final long __readers$OFFSET = 0L;
    private static final ValueLayout.OfInt __writers$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__writers")});
    private static final long __writers$OFFSET = 4L;
    private static final ValueLayout.OfInt __wrphase_futex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__wrphase_futex")});
    private static final long __wrphase_futex$OFFSET = 8L;
    private static final ValueLayout.OfInt __writers_futex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__writers_futex")});
    private static final long __writers_futex$OFFSET = 12L;
    private static final ValueLayout.OfInt __pad3$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__pad3")});
    private static final long __pad3$OFFSET = 16L;
    private static final ValueLayout.OfInt __pad4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__pad4")});
    private static final long __pad4$OFFSET = 20L;
    private static final ValueLayout.OfInt __cur_writer$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__cur_writer")});
    private static final long __cur_writer$OFFSET = 24L;
    private static final ValueLayout.OfInt __shared$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__shared")});
    private static final long __shared$OFFSET = 28L;
    private static final ValueLayout.OfByte __rwelision$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__rwelision")});
    private static final long __rwelision$OFFSET = 32L;
    private static final SequenceLayout __pad1$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__pad1")});
    private static final long __pad1$OFFSET = 33L;
    private static long[] __pad1$DIMS = new long[]{7L};
    private static final VarHandle __pad1$ELEM_HANDLE = __pad1$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfLong __pad2$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__pad2")});
    private static final long __pad2$OFFSET = 40L;
    private static final ValueLayout.OfInt __flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__flags")});
    private static final long __flags$OFFSET = 48L;

    __pthread_rwlock_arch_t() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt __readers$layout() {
        return __readers$LAYOUT;
    }

    public static final long __readers$offset() {
        return 0L;
    }

    public static int __readers(MemorySegment struct) {
        return struct.get(__readers$LAYOUT, 0L);
    }

    public static void __readers(MemorySegment struct, int fieldValue) {
        struct.set(__readers$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt __writers$layout() {
        return __writers$LAYOUT;
    }

    public static final long __writers$offset() {
        return 4L;
    }

    public static int __writers(MemorySegment struct) {
        return struct.get(__writers$LAYOUT, 4L);
    }

    public static void __writers(MemorySegment struct, int fieldValue) {
        struct.set(__writers$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt __wrphase_futex$layout() {
        return __wrphase_futex$LAYOUT;
    }

    public static final long __wrphase_futex$offset() {
        return 8L;
    }

    public static int __wrphase_futex(MemorySegment struct) {
        return struct.get(__wrphase_futex$LAYOUT, 8L);
    }

    public static void __wrphase_futex(MemorySegment struct, int fieldValue) {
        struct.set(__wrphase_futex$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt __writers_futex$layout() {
        return __writers_futex$LAYOUT;
    }

    public static final long __writers_futex$offset() {
        return 12L;
    }

    public static int __writers_futex(MemorySegment struct) {
        return struct.get(__writers_futex$LAYOUT, 12L);
    }

    public static void __writers_futex(MemorySegment struct, int fieldValue) {
        struct.set(__writers_futex$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt __pad3$layout() {
        return __pad3$LAYOUT;
    }

    public static final long __pad3$offset() {
        return 16L;
    }

    public static int __pad3(MemorySegment struct) {
        return struct.get(__pad3$LAYOUT, 16L);
    }

    public static void __pad3(MemorySegment struct, int fieldValue) {
        struct.set(__pad3$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt __pad4$layout() {
        return __pad4$LAYOUT;
    }

    public static final long __pad4$offset() {
        return 20L;
    }

    public static int __pad4(MemorySegment struct) {
        return struct.get(__pad4$LAYOUT, 20L);
    }

    public static void __pad4(MemorySegment struct, int fieldValue) {
        struct.set(__pad4$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt __cur_writer$layout() {
        return __cur_writer$LAYOUT;
    }

    public static final long __cur_writer$offset() {
        return 24L;
    }

    public static int __cur_writer(MemorySegment struct) {
        return struct.get(__cur_writer$LAYOUT, 24L);
    }

    public static void __cur_writer(MemorySegment struct, int fieldValue) {
        struct.set(__cur_writer$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt __shared$layout() {
        return __shared$LAYOUT;
    }

    public static final long __shared$offset() {
        return 28L;
    }

    public static int __shared(MemorySegment struct) {
        return struct.get(__shared$LAYOUT, 28L);
    }

    public static void __shared(MemorySegment struct, int fieldValue) {
        struct.set(__shared$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfByte __rwelision$layout() {
        return __rwelision$LAYOUT;
    }

    public static final long __rwelision$offset() {
        return 32L;
    }

    public static byte __rwelision(MemorySegment struct) {
        return struct.get(__rwelision$LAYOUT, 32L);
    }

    public static void __rwelision(MemorySegment struct, byte fieldValue) {
        struct.set(__rwelision$LAYOUT, 32L, fieldValue);
    }

    public static final SequenceLayout __pad1$layout() {
        return __pad1$LAYOUT;
    }

    public static final long __pad1$offset() {
        return 33L;
    }

    public static MemorySegment __pad1(MemorySegment struct) {
        return struct.asSlice(33L, __pad1$LAYOUT.byteSize());
    }

    public static void __pad1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)33L, (long)__pad1$LAYOUT.byteSize());
    }

    public static long[] __pad1$dimensions() {
        return __pad1$DIMS;
    }

    public static byte __pad1(MemorySegment struct, long index0) {
        return __pad1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __pad1(MemorySegment struct, long index0, byte fieldValue) {
        __pad1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfLong __pad2$layout() {
        return __pad2$LAYOUT;
    }

    public static final long __pad2$offset() {
        return 40L;
    }

    public static long __pad2(MemorySegment struct) {
        return struct.get(__pad2$LAYOUT, 40L);
    }

    public static void __pad2(MemorySegment struct, long fieldValue) {
        struct.set(__pad2$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt __flags$layout() {
        return __flags$LAYOUT;
    }

    public static final long __flags$offset() {
        return 48L;
    }

    public static int __flags(MemorySegment struct) {
        return struct.get(__flags$LAYOUT, 48L);
    }

    public static void __flags(MemorySegment struct, int fieldValue) {
        struct.set(__flags$LAYOUT, 48L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__pthread_rwlock_arch_t.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __pthread_rwlock_arch_t.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__pthread_rwlock_arch_t.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__pthread_rwlock_arch_t.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __pthread_rwlock_arch_t.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__pthread_rwlock_arch_t.layout().byteSize() * elementCount, arena, cleanup);
    }
}

