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
import me.bechberger.ebpf.bpf.raw.timespec;

public class stat {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("st_dev"), Lib.C_LONG.withName("st_ino"), Lib.C_LONG.withName("st_nlink"), Lib.C_INT.withName("st_mode"), Lib.C_INT.withName("st_uid"), Lib.C_INT.withName("st_gid"), Lib.C_INT.withName("__pad0"), Lib.C_LONG.withName("st_rdev"), Lib.C_LONG.withName("st_size"), Lib.C_LONG.withName("st_blksize"), Lib.C_LONG.withName("st_blocks"), timespec.layout().withName("st_atim"), timespec.layout().withName("st_mtim"), timespec.layout().withName("st_ctim"), MemoryLayout.sequenceLayout((long)3L, (MemoryLayout)Lib.C_LONG).withName("__glibc_reserved")}).withName("stat");
    private static final ValueLayout.OfLong st_dev$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_dev")});
    private static final long st_dev$OFFSET = 0L;
    private static final ValueLayout.OfLong st_ino$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_ino")});
    private static final long st_ino$OFFSET = 8L;
    private static final ValueLayout.OfLong st_nlink$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_nlink")});
    private static final long st_nlink$OFFSET = 16L;
    private static final ValueLayout.OfInt st_mode$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_mode")});
    private static final long st_mode$OFFSET = 24L;
    private static final ValueLayout.OfInt st_uid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_uid")});
    private static final long st_uid$OFFSET = 28L;
    private static final ValueLayout.OfInt st_gid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_gid")});
    private static final long st_gid$OFFSET = 32L;
    private static final ValueLayout.OfInt __pad0$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__pad0")});
    private static final long __pad0$OFFSET = 36L;
    private static final ValueLayout.OfLong st_rdev$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_rdev")});
    private static final long st_rdev$OFFSET = 40L;
    private static final ValueLayout.OfLong st_size$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_size")});
    private static final long st_size$OFFSET = 48L;
    private static final ValueLayout.OfLong st_blksize$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_blksize")});
    private static final long st_blksize$OFFSET = 56L;
    private static final ValueLayout.OfLong st_blocks$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_blocks")});
    private static final long st_blocks$OFFSET = 64L;
    private static final GroupLayout st_atim$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_atim")});
    private static final long st_atim$OFFSET = 72L;
    private static final GroupLayout st_mtim$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_mtim")});
    private static final long st_mtim$OFFSET = 88L;
    private static final GroupLayout st_ctim$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"st_ctim")});
    private static final long st_ctim$OFFSET = 104L;
    private static final SequenceLayout __glibc_reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__glibc_reserved")});
    private static final long __glibc_reserved$OFFSET = 120L;
    private static long[] __glibc_reserved$DIMS = new long[]{3L};
    private static final VarHandle __glibc_reserved$ELEM_HANDLE = __glibc_reserved$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    stat() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong st_dev$layout() {
        return st_dev$LAYOUT;
    }

    public static final long st_dev$offset() {
        return 0L;
    }

    public static long st_dev(MemorySegment struct) {
        return struct.get(st_dev$LAYOUT, 0L);
    }

    public static void st_dev(MemorySegment struct, long fieldValue) {
        struct.set(st_dev$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfLong st_ino$layout() {
        return st_ino$LAYOUT;
    }

    public static final long st_ino$offset() {
        return 8L;
    }

    public static long st_ino(MemorySegment struct) {
        return struct.get(st_ino$LAYOUT, 8L);
    }

    public static void st_ino(MemorySegment struct, long fieldValue) {
        struct.set(st_ino$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfLong st_nlink$layout() {
        return st_nlink$LAYOUT;
    }

    public static final long st_nlink$offset() {
        return 16L;
    }

    public static long st_nlink(MemorySegment struct) {
        return struct.get(st_nlink$LAYOUT, 16L);
    }

    public static void st_nlink(MemorySegment struct, long fieldValue) {
        struct.set(st_nlink$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt st_mode$layout() {
        return st_mode$LAYOUT;
    }

    public static final long st_mode$offset() {
        return 24L;
    }

    public static int st_mode(MemorySegment struct) {
        return struct.get(st_mode$LAYOUT, 24L);
    }

    public static void st_mode(MemorySegment struct, int fieldValue) {
        struct.set(st_mode$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt st_uid$layout() {
        return st_uid$LAYOUT;
    }

    public static final long st_uid$offset() {
        return 28L;
    }

    public static int st_uid(MemorySegment struct) {
        return struct.get(st_uid$LAYOUT, 28L);
    }

    public static void st_uid(MemorySegment struct, int fieldValue) {
        struct.set(st_uid$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt st_gid$layout() {
        return st_gid$LAYOUT;
    }

    public static final long st_gid$offset() {
        return 32L;
    }

    public static int st_gid(MemorySegment struct) {
        return struct.get(st_gid$LAYOUT, 32L);
    }

    public static void st_gid(MemorySegment struct, int fieldValue) {
        struct.set(st_gid$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt __pad0$layout() {
        return __pad0$LAYOUT;
    }

    public static final long __pad0$offset() {
        return 36L;
    }

    public static int __pad0(MemorySegment struct) {
        return struct.get(__pad0$LAYOUT, 36L);
    }

    public static void __pad0(MemorySegment struct, int fieldValue) {
        struct.set(__pad0$LAYOUT, 36L, fieldValue);
    }

    public static final ValueLayout.OfLong st_rdev$layout() {
        return st_rdev$LAYOUT;
    }

    public static final long st_rdev$offset() {
        return 40L;
    }

    public static long st_rdev(MemorySegment struct) {
        return struct.get(st_rdev$LAYOUT, 40L);
    }

    public static void st_rdev(MemorySegment struct, long fieldValue) {
        struct.set(st_rdev$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfLong st_size$layout() {
        return st_size$LAYOUT;
    }

    public static final long st_size$offset() {
        return 48L;
    }

    public static long st_size(MemorySegment struct) {
        return struct.get(st_size$LAYOUT, 48L);
    }

    public static void st_size(MemorySegment struct, long fieldValue) {
        struct.set(st_size$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfLong st_blksize$layout() {
        return st_blksize$LAYOUT;
    }

    public static final long st_blksize$offset() {
        return 56L;
    }

    public static long st_blksize(MemorySegment struct) {
        return struct.get(st_blksize$LAYOUT, 56L);
    }

    public static void st_blksize(MemorySegment struct, long fieldValue) {
        struct.set(st_blksize$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfLong st_blocks$layout() {
        return st_blocks$LAYOUT;
    }

    public static final long st_blocks$offset() {
        return 64L;
    }

    public static long st_blocks(MemorySegment struct) {
        return struct.get(st_blocks$LAYOUT, 64L);
    }

    public static void st_blocks(MemorySegment struct, long fieldValue) {
        struct.set(st_blocks$LAYOUT, 64L, fieldValue);
    }

    public static final GroupLayout st_atim$layout() {
        return st_atim$LAYOUT;
    }

    public static final long st_atim$offset() {
        return 72L;
    }

    public static MemorySegment st_atim(MemorySegment struct) {
        return struct.asSlice(72L, st_atim$LAYOUT.byteSize());
    }

    public static void st_atim(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)72L, (long)st_atim$LAYOUT.byteSize());
    }

    public static final GroupLayout st_mtim$layout() {
        return st_mtim$LAYOUT;
    }

    public static final long st_mtim$offset() {
        return 88L;
    }

    public static MemorySegment st_mtim(MemorySegment struct) {
        return struct.asSlice(88L, st_mtim$LAYOUT.byteSize());
    }

    public static void st_mtim(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)88L, (long)st_mtim$LAYOUT.byteSize());
    }

    public static final GroupLayout st_ctim$layout() {
        return st_ctim$LAYOUT;
    }

    public static final long st_ctim$offset() {
        return 104L;
    }

    public static MemorySegment st_ctim(MemorySegment struct) {
        return struct.asSlice(104L, st_ctim$LAYOUT.byteSize());
    }

    public static void st_ctim(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)104L, (long)st_ctim$LAYOUT.byteSize());
    }

    public static final SequenceLayout __glibc_reserved$layout() {
        return __glibc_reserved$LAYOUT;
    }

    public static final long __glibc_reserved$offset() {
        return 120L;
    }

    public static MemorySegment __glibc_reserved(MemorySegment struct) {
        return struct.asSlice(120L, __glibc_reserved$LAYOUT.byteSize());
    }

    public static void __glibc_reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)120L, (long)__glibc_reserved$LAYOUT.byteSize());
    }

    public static long[] __glibc_reserved$dimensions() {
        return __glibc_reserved$DIMS;
    }

    public static long __glibc_reserved(MemorySegment struct, long index0) {
        return __glibc_reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void __glibc_reserved(MemorySegment struct, long index0, long fieldValue) {
        __glibc_reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(stat.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return stat.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)stat.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)stat.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return stat.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(stat.layout().byteSize() * elementCount, arena, cleanup);
    }
}

