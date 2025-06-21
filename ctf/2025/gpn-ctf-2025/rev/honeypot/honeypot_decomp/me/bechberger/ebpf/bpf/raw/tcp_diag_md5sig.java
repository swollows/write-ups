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
 *  java.lang.foreign.ValueLayout$OfShort
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

public class tcp_diag_md5sig {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("tcpm_family"), Lib.C_CHAR.withName("tcpm_prefixlen"), Lib.C_SHORT.withName("tcpm_keylen"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("tcpm_addr"), MemoryLayout.sequenceLayout((long)80L, (MemoryLayout)Lib.C_CHAR).withName("tcpm_key")}).withName("tcp_diag_md5sig");
    private static final ValueLayout.OfByte tcpm_family$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_family")});
    private static final long tcpm_family$OFFSET = 0L;
    private static final ValueLayout.OfByte tcpm_prefixlen$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_prefixlen")});
    private static final long tcpm_prefixlen$OFFSET = 1L;
    private static final ValueLayout.OfShort tcpm_keylen$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_keylen")});
    private static final long tcpm_keylen$OFFSET = 2L;
    private static final SequenceLayout tcpm_addr$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_addr")});
    private static final long tcpm_addr$OFFSET = 4L;
    private static long[] tcpm_addr$DIMS = new long[]{4L};
    private static final VarHandle tcpm_addr$ELEM_HANDLE = tcpm_addr$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final SequenceLayout tcpm_key$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_key")});
    private static final long tcpm_key$OFFSET = 20L;
    private static long[] tcpm_key$DIMS = new long[]{80L};
    private static final VarHandle tcpm_key$ELEM_HANDLE = tcpm_key$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    tcp_diag_md5sig() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte tcpm_family$layout() {
        return tcpm_family$LAYOUT;
    }

    public static final long tcpm_family$offset() {
        return 0L;
    }

    public static byte tcpm_family(MemorySegment struct) {
        return struct.get(tcpm_family$LAYOUT, 0L);
    }

    public static void tcpm_family(MemorySegment struct, byte fieldValue) {
        struct.set(tcpm_family$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte tcpm_prefixlen$layout() {
        return tcpm_prefixlen$LAYOUT;
    }

    public static final long tcpm_prefixlen$offset() {
        return 1L;
    }

    public static byte tcpm_prefixlen(MemorySegment struct) {
        return struct.get(tcpm_prefixlen$LAYOUT, 1L);
    }

    public static void tcpm_prefixlen(MemorySegment struct, byte fieldValue) {
        struct.set(tcpm_prefixlen$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfShort tcpm_keylen$layout() {
        return tcpm_keylen$LAYOUT;
    }

    public static final long tcpm_keylen$offset() {
        return 2L;
    }

    public static short tcpm_keylen(MemorySegment struct) {
        return struct.get(tcpm_keylen$LAYOUT, 2L);
    }

    public static void tcpm_keylen(MemorySegment struct, short fieldValue) {
        struct.set(tcpm_keylen$LAYOUT, 2L, fieldValue);
    }

    public static final SequenceLayout tcpm_addr$layout() {
        return tcpm_addr$LAYOUT;
    }

    public static final long tcpm_addr$offset() {
        return 4L;
    }

    public static MemorySegment tcpm_addr(MemorySegment struct) {
        return struct.asSlice(4L, tcpm_addr$LAYOUT.byteSize());
    }

    public static void tcpm_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)tcpm_addr$LAYOUT.byteSize());
    }

    public static long[] tcpm_addr$dimensions() {
        return tcpm_addr$DIMS;
    }

    public static int tcpm_addr(MemorySegment struct, long index0) {
        return tcpm_addr$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void tcpm_addr(MemorySegment struct, long index0, int fieldValue) {
        tcpm_addr$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final SequenceLayout tcpm_key$layout() {
        return tcpm_key$LAYOUT;
    }

    public static final long tcpm_key$offset() {
        return 20L;
    }

    public static MemorySegment tcpm_key(MemorySegment struct) {
        return struct.asSlice(20L, tcpm_key$LAYOUT.byteSize());
    }

    public static void tcpm_key(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)20L, (long)tcpm_key$LAYOUT.byteSize());
    }

    public static long[] tcpm_key$dimensions() {
        return tcpm_key$DIMS;
    }

    public static byte tcpm_key(MemorySegment struct, long index0) {
        return tcpm_key$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void tcpm_key(MemorySegment struct, long index0, byte fieldValue) {
        tcpm_key$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_diag_md5sig.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_diag_md5sig.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_diag_md5sig.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_diag_md5sig.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_diag_md5sig.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_diag_md5sig.layout().byteSize() * elementCount, arena, cleanup);
    }
}

