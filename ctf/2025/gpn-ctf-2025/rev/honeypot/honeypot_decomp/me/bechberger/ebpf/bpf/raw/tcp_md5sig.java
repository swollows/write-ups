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
import me.bechberger.ebpf.bpf.raw.__kernel_sockaddr_storage;

public class tcp_md5sig {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{__kernel_sockaddr_storage.layout().withName("tcpm_addr"), Lib.C_CHAR.withName("tcpm_flags"), Lib.C_CHAR.withName("tcpm_prefixlen"), Lib.C_SHORT.withName("tcpm_keylen"), Lib.C_INT.withName("tcpm_ifindex"), MemoryLayout.sequenceLayout((long)80L, (MemoryLayout)Lib.C_CHAR).withName("tcpm_key")}).withName("tcp_md5sig");
    private static final GroupLayout tcpm_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_addr")});
    private static final long tcpm_addr$OFFSET = 0L;
    private static final ValueLayout.OfByte tcpm_flags$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_flags")});
    private static final long tcpm_flags$OFFSET = 128L;
    private static final ValueLayout.OfByte tcpm_prefixlen$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_prefixlen")});
    private static final long tcpm_prefixlen$OFFSET = 129L;
    private static final ValueLayout.OfShort tcpm_keylen$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_keylen")});
    private static final long tcpm_keylen$OFFSET = 130L;
    private static final ValueLayout.OfInt tcpm_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_ifindex")});
    private static final long tcpm_ifindex$OFFSET = 132L;
    private static final SequenceLayout tcpm_key$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpm_key")});
    private static final long tcpm_key$OFFSET = 136L;
    private static long[] tcpm_key$DIMS = new long[]{80L};
    private static final VarHandle tcpm_key$ELEM_HANDLE = tcpm_key$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    tcp_md5sig() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout tcpm_addr$layout() {
        return tcpm_addr$LAYOUT;
    }

    public static final long tcpm_addr$offset() {
        return 0L;
    }

    public static MemorySegment tcpm_addr(MemorySegment struct) {
        return struct.asSlice(0L, tcpm_addr$LAYOUT.byteSize());
    }

    public static void tcpm_addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)tcpm_addr$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfByte tcpm_flags$layout() {
        return tcpm_flags$LAYOUT;
    }

    public static final long tcpm_flags$offset() {
        return 128L;
    }

    public static byte tcpm_flags(MemorySegment struct) {
        return struct.get(tcpm_flags$LAYOUT, 128L);
    }

    public static void tcpm_flags(MemorySegment struct, byte fieldValue) {
        struct.set(tcpm_flags$LAYOUT, 128L, fieldValue);
    }

    public static final ValueLayout.OfByte tcpm_prefixlen$layout() {
        return tcpm_prefixlen$LAYOUT;
    }

    public static final long tcpm_prefixlen$offset() {
        return 129L;
    }

    public static byte tcpm_prefixlen(MemorySegment struct) {
        return struct.get(tcpm_prefixlen$LAYOUT, 129L);
    }

    public static void tcpm_prefixlen(MemorySegment struct, byte fieldValue) {
        struct.set(tcpm_prefixlen$LAYOUT, 129L, fieldValue);
    }

    public static final ValueLayout.OfShort tcpm_keylen$layout() {
        return tcpm_keylen$LAYOUT;
    }

    public static final long tcpm_keylen$offset() {
        return 130L;
    }

    public static short tcpm_keylen(MemorySegment struct) {
        return struct.get(tcpm_keylen$LAYOUT, 130L);
    }

    public static void tcpm_keylen(MemorySegment struct, short fieldValue) {
        struct.set(tcpm_keylen$LAYOUT, 130L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpm_ifindex$layout() {
        return tcpm_ifindex$LAYOUT;
    }

    public static final long tcpm_ifindex$offset() {
        return 132L;
    }

    public static int tcpm_ifindex(MemorySegment struct) {
        return struct.get(tcpm_ifindex$LAYOUT, 132L);
    }

    public static void tcpm_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(tcpm_ifindex$LAYOUT, 132L, fieldValue);
    }

    public static final SequenceLayout tcpm_key$layout() {
        return tcpm_key$LAYOUT;
    }

    public static final long tcpm_key$offset() {
        return 136L;
    }

    public static MemorySegment tcpm_key(MemorySegment struct) {
        return struct.asSlice(136L, tcpm_key$LAYOUT.byteSize());
    }

    public static void tcpm_key(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)136L, (long)tcpm_key$LAYOUT.byteSize());
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
        return array.asSlice(tcp_md5sig.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_md5sig.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_md5sig.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_md5sig.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_md5sig.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_md5sig.layout().byteSize() * elementCount, arena, cleanup);
    }
}

