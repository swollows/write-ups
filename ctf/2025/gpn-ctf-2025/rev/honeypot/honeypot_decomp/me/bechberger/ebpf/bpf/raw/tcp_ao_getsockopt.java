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
import me.bechberger.ebpf.bpf.raw.__kernel_sockaddr_storage;

public class tcp_ao_getsockopt {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{__kernel_sockaddr_storage.layout().withName("addr"), MemoryLayout.sequenceLayout((long)64L, (MemoryLayout)Lib.C_CHAR).withName("alg_name"), MemoryLayout.sequenceLayout((long)80L, (MemoryLayout)Lib.C_CHAR).withName("key"), Lib.C_INT.withName("nkeys"), MemoryLayout.paddingLayout((long)2L), Lib.C_CHAR.withName("sndid"), Lib.C_CHAR.withName("rcvid"), Lib.C_CHAR.withName("prefix"), Lib.C_CHAR.withName("maclen"), Lib.C_CHAR.withName("keyflags"), Lib.C_CHAR.withName("keylen"), Lib.C_INT.withName("ifindex"), Lib.C_LONG_LONG.withName("pkt_good"), Lib.C_LONG_LONG.withName("pkt_bad")}).withName("tcp_ao_getsockopt");
    private static final GroupLayout addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addr")});
    private static final long addr$OFFSET = 0L;
    private static final SequenceLayout alg_name$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"alg_name")});
    private static final long alg_name$OFFSET = 128L;
    private static long[] alg_name$DIMS = new long[]{64L};
    private static final VarHandle alg_name$ELEM_HANDLE = alg_name$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final SequenceLayout key$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"key")});
    private static final long key$OFFSET = 192L;
    private static long[] key$DIMS = new long[]{80L};
    private static final VarHandle key$ELEM_HANDLE = key$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt nkeys$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nkeys")});
    private static final long nkeys$OFFSET = 272L;
    private static final ValueLayout.OfByte sndid$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sndid")});
    private static final long sndid$OFFSET = 278L;
    private static final ValueLayout.OfByte rcvid$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rcvid")});
    private static final long rcvid$OFFSET = 279L;
    private static final ValueLayout.OfByte prefix$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prefix")});
    private static final long prefix$OFFSET = 280L;
    private static final ValueLayout.OfByte maclen$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"maclen")});
    private static final long maclen$OFFSET = 281L;
    private static final ValueLayout.OfByte keyflags$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"keyflags")});
    private static final long keyflags$OFFSET = 282L;
    private static final ValueLayout.OfByte keylen$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"keylen")});
    private static final long keylen$OFFSET = 283L;
    private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
    private static final long ifindex$OFFSET = 284L;
    private static final ValueLayout.OfLong pkt_good$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pkt_good")});
    private static final long pkt_good$OFFSET = 288L;
    private static final ValueLayout.OfLong pkt_bad$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pkt_bad")});
    private static final long pkt_bad$OFFSET = 296L;

    tcp_ao_getsockopt() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout addr$layout() {
        return addr$LAYOUT;
    }

    public static final long addr$offset() {
        return 0L;
    }

    public static MemorySegment addr(MemorySegment struct) {
        return struct.asSlice(0L, addr$LAYOUT.byteSize());
    }

    public static void addr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)addr$LAYOUT.byteSize());
    }

    public static final SequenceLayout alg_name$layout() {
        return alg_name$LAYOUT;
    }

    public static final long alg_name$offset() {
        return 128L;
    }

    public static MemorySegment alg_name(MemorySegment struct) {
        return struct.asSlice(128L, alg_name$LAYOUT.byteSize());
    }

    public static void alg_name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)128L, (long)alg_name$LAYOUT.byteSize());
    }

    public static long[] alg_name$dimensions() {
        return alg_name$DIMS;
    }

    public static byte alg_name(MemorySegment struct, long index0) {
        return alg_name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void alg_name(MemorySegment struct, long index0, byte fieldValue) {
        alg_name$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final SequenceLayout key$layout() {
        return key$LAYOUT;
    }

    public static final long key$offset() {
        return 192L;
    }

    public static MemorySegment key(MemorySegment struct) {
        return struct.asSlice(192L, key$LAYOUT.byteSize());
    }

    public static void key(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)192L, (long)key$LAYOUT.byteSize());
    }

    public static long[] key$dimensions() {
        return key$DIMS;
    }

    public static byte key(MemorySegment struct, long index0) {
        return key$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void key(MemorySegment struct, long index0, byte fieldValue) {
        key$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt nkeys$layout() {
        return nkeys$LAYOUT;
    }

    public static final long nkeys$offset() {
        return 272L;
    }

    public static int nkeys(MemorySegment struct) {
        return struct.get(nkeys$LAYOUT, 272L);
    }

    public static void nkeys(MemorySegment struct, int fieldValue) {
        struct.set(nkeys$LAYOUT, 272L, fieldValue);
    }

    public static final ValueLayout.OfByte sndid$layout() {
        return sndid$LAYOUT;
    }

    public static final long sndid$offset() {
        return 278L;
    }

    public static byte sndid(MemorySegment struct) {
        return struct.get(sndid$LAYOUT, 278L);
    }

    public static void sndid(MemorySegment struct, byte fieldValue) {
        struct.set(sndid$LAYOUT, 278L, fieldValue);
    }

    public static final ValueLayout.OfByte rcvid$layout() {
        return rcvid$LAYOUT;
    }

    public static final long rcvid$offset() {
        return 279L;
    }

    public static byte rcvid(MemorySegment struct) {
        return struct.get(rcvid$LAYOUT, 279L);
    }

    public static void rcvid(MemorySegment struct, byte fieldValue) {
        struct.set(rcvid$LAYOUT, 279L, fieldValue);
    }

    public static final ValueLayout.OfByte prefix$layout() {
        return prefix$LAYOUT;
    }

    public static final long prefix$offset() {
        return 280L;
    }

    public static byte prefix(MemorySegment struct) {
        return struct.get(prefix$LAYOUT, 280L);
    }

    public static void prefix(MemorySegment struct, byte fieldValue) {
        struct.set(prefix$LAYOUT, 280L, fieldValue);
    }

    public static final ValueLayout.OfByte maclen$layout() {
        return maclen$LAYOUT;
    }

    public static final long maclen$offset() {
        return 281L;
    }

    public static byte maclen(MemorySegment struct) {
        return struct.get(maclen$LAYOUT, 281L);
    }

    public static void maclen(MemorySegment struct, byte fieldValue) {
        struct.set(maclen$LAYOUT, 281L, fieldValue);
    }

    public static final ValueLayout.OfByte keyflags$layout() {
        return keyflags$LAYOUT;
    }

    public static final long keyflags$offset() {
        return 282L;
    }

    public static byte keyflags(MemorySegment struct) {
        return struct.get(keyflags$LAYOUT, 282L);
    }

    public static void keyflags(MemorySegment struct, byte fieldValue) {
        struct.set(keyflags$LAYOUT, 282L, fieldValue);
    }

    public static final ValueLayout.OfByte keylen$layout() {
        return keylen$LAYOUT;
    }

    public static final long keylen$offset() {
        return 283L;
    }

    public static byte keylen(MemorySegment struct) {
        return struct.get(keylen$LAYOUT, 283L);
    }

    public static void keylen(MemorySegment struct, byte fieldValue) {
        struct.set(keylen$LAYOUT, 283L, fieldValue);
    }

    public static final ValueLayout.OfInt ifindex$layout() {
        return ifindex$LAYOUT;
    }

    public static final long ifindex$offset() {
        return 284L;
    }

    public static int ifindex(MemorySegment struct) {
        return struct.get(ifindex$LAYOUT, 284L);
    }

    public static void ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ifindex$LAYOUT, 284L, fieldValue);
    }

    public static final ValueLayout.OfLong pkt_good$layout() {
        return pkt_good$LAYOUT;
    }

    public static final long pkt_good$offset() {
        return 288L;
    }

    public static long pkt_good(MemorySegment struct) {
        return struct.get(pkt_good$LAYOUT, 288L);
    }

    public static void pkt_good(MemorySegment struct, long fieldValue) {
        struct.set(pkt_good$LAYOUT, 288L, fieldValue);
    }

    public static final ValueLayout.OfLong pkt_bad$layout() {
        return pkt_bad$LAYOUT;
    }

    public static final long pkt_bad$offset() {
        return 296L;
    }

    public static long pkt_bad(MemorySegment struct) {
        return struct.get(pkt_bad$LAYOUT, 296L);
    }

    public static void pkt_bad(MemorySegment struct, long fieldValue) {
        struct.set(pkt_bad$LAYOUT, 296L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_ao_getsockopt.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_ao_getsockopt.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_ao_getsockopt.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_ao_getsockopt.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_ao_getsockopt.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_ao_getsockopt.layout().byteSize() * elementCount, arena, cleanup);
    }
}

