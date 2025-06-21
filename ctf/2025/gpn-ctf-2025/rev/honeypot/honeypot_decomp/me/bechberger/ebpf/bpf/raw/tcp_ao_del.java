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
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfShort
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.__kernel_sockaddr_storage;

public class tcp_ao_del {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{__kernel_sockaddr_storage.layout().withName("addr"), Lib.C_INT.withName("ifindex"), MemoryLayout.paddingLayout((long)4L), Lib.C_SHORT.withName("reserved2"), Lib.C_CHAR.withName("prefix"), Lib.C_CHAR.withName("sndid"), Lib.C_CHAR.withName("rcvid"), Lib.C_CHAR.withName("current_key"), Lib.C_CHAR.withName("rnext"), Lib.C_CHAR.withName("keyflags")}).withName("tcp_ao_del");
    private static final GroupLayout addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addr")});
    private static final long addr$OFFSET = 0L;
    private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
    private static final long ifindex$OFFSET = 128L;
    private static final ValueLayout.OfShort reserved2$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reserved2")});
    private static final long reserved2$OFFSET = 136L;
    private static final ValueLayout.OfByte prefix$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prefix")});
    private static final long prefix$OFFSET = 138L;
    private static final ValueLayout.OfByte sndid$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sndid")});
    private static final long sndid$OFFSET = 139L;
    private static final ValueLayout.OfByte rcvid$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rcvid")});
    private static final long rcvid$OFFSET = 140L;
    private static final ValueLayout.OfByte current_key$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"current_key")});
    private static final long current_key$OFFSET = 141L;
    private static final ValueLayout.OfByte rnext$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rnext")});
    private static final long rnext$OFFSET = 142L;
    private static final ValueLayout.OfByte keyflags$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"keyflags")});
    private static final long keyflags$OFFSET = 143L;

    tcp_ao_del() {
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

    public static final ValueLayout.OfInt ifindex$layout() {
        return ifindex$LAYOUT;
    }

    public static final long ifindex$offset() {
        return 128L;
    }

    public static int ifindex(MemorySegment struct) {
        return struct.get(ifindex$LAYOUT, 128L);
    }

    public static void ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ifindex$LAYOUT, 128L, fieldValue);
    }

    public static final ValueLayout.OfShort reserved2$layout() {
        return reserved2$LAYOUT;
    }

    public static final long reserved2$offset() {
        return 136L;
    }

    public static short reserved2(MemorySegment struct) {
        return struct.get(reserved2$LAYOUT, 136L);
    }

    public static void reserved2(MemorySegment struct, short fieldValue) {
        struct.set(reserved2$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfByte prefix$layout() {
        return prefix$LAYOUT;
    }

    public static final long prefix$offset() {
        return 138L;
    }

    public static byte prefix(MemorySegment struct) {
        return struct.get(prefix$LAYOUT, 138L);
    }

    public static void prefix(MemorySegment struct, byte fieldValue) {
        struct.set(prefix$LAYOUT, 138L, fieldValue);
    }

    public static final ValueLayout.OfByte sndid$layout() {
        return sndid$LAYOUT;
    }

    public static final long sndid$offset() {
        return 139L;
    }

    public static byte sndid(MemorySegment struct) {
        return struct.get(sndid$LAYOUT, 139L);
    }

    public static void sndid(MemorySegment struct, byte fieldValue) {
        struct.set(sndid$LAYOUT, 139L, fieldValue);
    }

    public static final ValueLayout.OfByte rcvid$layout() {
        return rcvid$LAYOUT;
    }

    public static final long rcvid$offset() {
        return 140L;
    }

    public static byte rcvid(MemorySegment struct) {
        return struct.get(rcvid$LAYOUT, 140L);
    }

    public static void rcvid(MemorySegment struct, byte fieldValue) {
        struct.set(rcvid$LAYOUT, 140L, fieldValue);
    }

    public static final ValueLayout.OfByte current_key$layout() {
        return current_key$LAYOUT;
    }

    public static final long current_key$offset() {
        return 141L;
    }

    public static byte current_key(MemorySegment struct) {
        return struct.get(current_key$LAYOUT, 141L);
    }

    public static void current_key(MemorySegment struct, byte fieldValue) {
        struct.set(current_key$LAYOUT, 141L, fieldValue);
    }

    public static final ValueLayout.OfByte rnext$layout() {
        return rnext$LAYOUT;
    }

    public static final long rnext$offset() {
        return 142L;
    }

    public static byte rnext(MemorySegment struct) {
        return struct.get(rnext$LAYOUT, 142L);
    }

    public static void rnext(MemorySegment struct, byte fieldValue) {
        struct.set(rnext$LAYOUT, 142L, fieldValue);
    }

    public static final ValueLayout.OfByte keyflags$layout() {
        return keyflags$LAYOUT;
    }

    public static final long keyflags$offset() {
        return 143L;
    }

    public static byte keyflags(MemorySegment struct) {
        return struct.get(keyflags$LAYOUT, 143L);
    }

    public static void keyflags(MemorySegment struct, byte fieldValue) {
        struct.set(keyflags$LAYOUT, 143L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_ao_del.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_ao_del.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_ao_del.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_ao_del.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_ao_del.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_ao_del.layout().byteSize() * elementCount, arena, cleanup);
    }
}

