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
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
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

public class tcp_zerocopy_receive {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("address"), Lib.C_INT.withName("length"), Lib.C_INT.withName("recv_skip_hint"), Lib.C_INT.withName("inq"), Lib.C_INT.withName("err"), Lib.C_LONG_LONG.withName("copybuf_address"), Lib.C_INT.withName("copybuf_len"), Lib.C_INT.withName("flags"), Lib.C_LONG_LONG.withName("msg_control"), Lib.C_LONG_LONG.withName("msg_controllen"), Lib.C_INT.withName("msg_flags"), Lib.C_INT.withName("reserved")}).withName("tcp_zerocopy_receive");
    private static final ValueLayout.OfLong address$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"address")});
    private static final long address$OFFSET = 0L;
    private static final ValueLayout.OfInt length$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"length")});
    private static final long length$OFFSET = 8L;
    private static final ValueLayout.OfInt recv_skip_hint$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"recv_skip_hint")});
    private static final long recv_skip_hint$OFFSET = 12L;
    private static final ValueLayout.OfInt inq$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"inq")});
    private static final long inq$OFFSET = 16L;
    private static final ValueLayout.OfInt err$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"err")});
    private static final long err$OFFSET = 20L;
    private static final ValueLayout.OfLong copybuf_address$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"copybuf_address")});
    private static final long copybuf_address$OFFSET = 24L;
    private static final ValueLayout.OfInt copybuf_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"copybuf_len")});
    private static final long copybuf_len$OFFSET = 32L;
    private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 36L;
    private static final ValueLayout.OfLong msg_control$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_control")});
    private static final long msg_control$OFFSET = 40L;
    private static final ValueLayout.OfLong msg_controllen$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_controllen")});
    private static final long msg_controllen$OFFSET = 48L;
    private static final ValueLayout.OfInt msg_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_flags")});
    private static final long msg_flags$OFFSET = 56L;
    private static final ValueLayout.OfInt reserved$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reserved")});
    private static final long reserved$OFFSET = 60L;

    tcp_zerocopy_receive() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong address$layout() {
        return address$LAYOUT;
    }

    public static final long address$offset() {
        return 0L;
    }

    public static long address(MemorySegment struct) {
        return struct.get(address$LAYOUT, 0L);
    }

    public static void address(MemorySegment struct, long fieldValue) {
        struct.set(address$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt length$layout() {
        return length$LAYOUT;
    }

    public static final long length$offset() {
        return 8L;
    }

    public static int length(MemorySegment struct) {
        return struct.get(length$LAYOUT, 8L);
    }

    public static void length(MemorySegment struct, int fieldValue) {
        struct.set(length$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt recv_skip_hint$layout() {
        return recv_skip_hint$LAYOUT;
    }

    public static final long recv_skip_hint$offset() {
        return 12L;
    }

    public static int recv_skip_hint(MemorySegment struct) {
        return struct.get(recv_skip_hint$LAYOUT, 12L);
    }

    public static void recv_skip_hint(MemorySegment struct, int fieldValue) {
        struct.set(recv_skip_hint$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt inq$layout() {
        return inq$LAYOUT;
    }

    public static final long inq$offset() {
        return 16L;
    }

    public static int inq(MemorySegment struct) {
        return struct.get(inq$LAYOUT, 16L);
    }

    public static void inq(MemorySegment struct, int fieldValue) {
        struct.set(inq$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt err$layout() {
        return err$LAYOUT;
    }

    public static final long err$offset() {
        return 20L;
    }

    public static int err(MemorySegment struct) {
        return struct.get(err$LAYOUT, 20L);
    }

    public static void err(MemorySegment struct, int fieldValue) {
        struct.set(err$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfLong copybuf_address$layout() {
        return copybuf_address$LAYOUT;
    }

    public static final long copybuf_address$offset() {
        return 24L;
    }

    public static long copybuf_address(MemorySegment struct) {
        return struct.get(copybuf_address$LAYOUT, 24L);
    }

    public static void copybuf_address(MemorySegment struct, long fieldValue) {
        struct.set(copybuf_address$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt copybuf_len$layout() {
        return copybuf_len$LAYOUT;
    }

    public static final long copybuf_len$offset() {
        return 32L;
    }

    public static int copybuf_len(MemorySegment struct) {
        return struct.get(copybuf_len$LAYOUT, 32L);
    }

    public static void copybuf_len(MemorySegment struct, int fieldValue) {
        struct.set(copybuf_len$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 36L;
    }

    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 36L);
    }

    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, 36L, fieldValue);
    }

    public static final ValueLayout.OfLong msg_control$layout() {
        return msg_control$LAYOUT;
    }

    public static final long msg_control$offset() {
        return 40L;
    }

    public static long msg_control(MemorySegment struct) {
        return struct.get(msg_control$LAYOUT, 40L);
    }

    public static void msg_control(MemorySegment struct, long fieldValue) {
        struct.set(msg_control$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfLong msg_controllen$layout() {
        return msg_controllen$LAYOUT;
    }

    public static final long msg_controllen$offset() {
        return 48L;
    }

    public static long msg_controllen(MemorySegment struct) {
        return struct.get(msg_controllen$LAYOUT, 48L);
    }

    public static void msg_controllen(MemorySegment struct, long fieldValue) {
        struct.set(msg_controllen$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt msg_flags$layout() {
        return msg_flags$LAYOUT;
    }

    public static final long msg_flags$offset() {
        return 56L;
    }

    public static int msg_flags(MemorySegment struct) {
        return struct.get(msg_flags$LAYOUT, 56L);
    }

    public static void msg_flags(MemorySegment struct, int fieldValue) {
        struct.set(msg_flags$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfInt reserved$layout() {
        return reserved$LAYOUT;
    }

    public static final long reserved$offset() {
        return 60L;
    }

    public static int reserved(MemorySegment struct) {
        return struct.get(reserved$LAYOUT, 60L);
    }

    public static void reserved(MemorySegment struct, int fieldValue) {
        struct.set(reserved$LAYOUT, 60L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_zerocopy_receive.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_zerocopy_receive.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_zerocopy_receive.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_zerocopy_receive.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_zerocopy_receive.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_zerocopy_receive.layout().byteSize() * elementCount, arena, cleanup);
    }
}

