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

public class bpf_sockopt {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("sk")}).withName("$anon$7368:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("optval")}).withName("$anon$7369:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("optval_end")}).withName("$anon$7370:2"), Lib.C_INT.withName("level"), Lib.C_INT.withName("optname"), Lib.C_INT.withName("optlen"), Lib.C_INT.withName("retval")}).withName("bpf_sockopt");
    private static final AddressLayout sk$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7368:2"), MemoryLayout.PathElement.groupElement((String)"sk")});
    private static final long sk$OFFSET = 0L;
    private static final AddressLayout optval$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7369:2"), MemoryLayout.PathElement.groupElement((String)"optval")});
    private static final long optval$OFFSET = 8L;
    private static final AddressLayout optval_end$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7370:2"), MemoryLayout.PathElement.groupElement((String)"optval_end")});
    private static final long optval_end$OFFSET = 16L;
    private static final ValueLayout.OfInt level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"level")});
    private static final long level$OFFSET = 24L;
    private static final ValueLayout.OfInt optname$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"optname")});
    private static final long optname$OFFSET = 28L;
    private static final ValueLayout.OfInt optlen$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"optlen")});
    private static final long optlen$OFFSET = 32L;
    private static final ValueLayout.OfInt retval$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"retval")});
    private static final long retval$OFFSET = 36L;

    bpf_sockopt() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final AddressLayout sk$layout() {
        return sk$LAYOUT;
    }

    public static final long sk$offset() {
        return 0L;
    }

    public static MemorySegment sk(MemorySegment struct) {
        return struct.get(sk$LAYOUT, 0L);
    }

    public static void sk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sk$LAYOUT, 0L, fieldValue);
    }

    public static final AddressLayout optval$layout() {
        return optval$LAYOUT;
    }

    public static final long optval$offset() {
        return 8L;
    }

    public static MemorySegment optval(MemorySegment struct) {
        return struct.get(optval$LAYOUT, 8L);
    }

    public static void optval(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(optval$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout optval_end$layout() {
        return optval_end$LAYOUT;
    }

    public static final long optval_end$offset() {
        return 16L;
    }

    public static MemorySegment optval_end(MemorySegment struct) {
        return struct.get(optval_end$LAYOUT, 16L);
    }

    public static void optval_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(optval_end$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt level$layout() {
        return level$LAYOUT;
    }

    public static final long level$offset() {
        return 24L;
    }

    public static int level(MemorySegment struct) {
        return struct.get(level$LAYOUT, 24L);
    }

    public static void level(MemorySegment struct, int fieldValue) {
        struct.set(level$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt optname$layout() {
        return optname$LAYOUT;
    }

    public static final long optname$offset() {
        return 28L;
    }

    public static int optname(MemorySegment struct) {
        return struct.get(optname$LAYOUT, 28L);
    }

    public static void optname(MemorySegment struct, int fieldValue) {
        struct.set(optname$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt optlen$layout() {
        return optlen$LAYOUT;
    }

    public static final long optlen$offset() {
        return 32L;
    }

    public static int optlen(MemorySegment struct) {
        return struct.get(optlen$LAYOUT, 32L);
    }

    public static void optlen(MemorySegment struct, int fieldValue) {
        struct.set(optlen$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt retval$layout() {
        return retval$LAYOUT;
    }

    public static final long retval$offset() {
        return 36L;
    }

    public static int retval(MemorySegment struct) {
        return struct.get(retval$LAYOUT, 36L);
    }

    public static void retval(MemorySegment struct, int fieldValue) {
        struct.set(retval$LAYOUT, 36L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_sockopt.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_sockopt.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_sockopt.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_sockopt.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_sockopt.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_sockopt.layout().byteSize() * elementCount, arena, cleanup);
    }
}

