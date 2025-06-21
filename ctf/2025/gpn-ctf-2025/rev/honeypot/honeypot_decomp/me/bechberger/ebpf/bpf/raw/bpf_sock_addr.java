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
 *  java.lang.foreign.ValueLayout$OfInt
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
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_sock_addr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("user_family"), Lib.C_INT.withName("user_ip4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("user_ip6"), Lib.C_INT.withName("user_port"), Lib.C_INT.withName("family"), Lib.C_INT.withName("type"), Lib.C_INT.withName("protocol"), Lib.C_INT.withName("msg_src_ip4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("msg_src_ip6"), MemoryLayout.paddingLayout((long)4L), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("sk")}).withName("$anon$6777:2")}).withName("bpf_sock_addr");
    private static final ValueLayout.OfInt user_family$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"user_family")});
    private static final long user_family$OFFSET = 0L;
    private static final ValueLayout.OfInt user_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"user_ip4")});
    private static final long user_ip4$OFFSET = 4L;
    private static final SequenceLayout user_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"user_ip6")});
    private static final long user_ip6$OFFSET = 8L;
    private static long[] user_ip6$DIMS = new long[]{4L};
    private static final VarHandle user_ip6$ELEM_HANDLE = user_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt user_port$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"user_port")});
    private static final long user_port$OFFSET = 24L;
    private static final ValueLayout.OfInt family$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"family")});
    private static final long family$OFFSET = 28L;
    private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 32L;
    private static final ValueLayout.OfInt protocol$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"protocol")});
    private static final long protocol$OFFSET = 36L;
    private static final ValueLayout.OfInt msg_src_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_src_ip4")});
    private static final long msg_src_ip4$OFFSET = 40L;
    private static final SequenceLayout msg_src_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"msg_src_ip6")});
    private static final long msg_src_ip6$OFFSET = 44L;
    private static long[] msg_src_ip6$DIMS = new long[]{4L};
    private static final VarHandle msg_src_ip6$ELEM_HANDLE = msg_src_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final AddressLayout sk$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6777:2"), MemoryLayout.PathElement.groupElement((String)"sk")});
    private static final long sk$OFFSET = 64L;

    bpf_sock_addr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt user_family$layout() {
        return user_family$LAYOUT;
    }

    public static final long user_family$offset() {
        return 0L;
    }

    public static int user_family(MemorySegment struct) {
        return struct.get(user_family$LAYOUT, 0L);
    }

    public static void user_family(MemorySegment struct, int fieldValue) {
        struct.set(user_family$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt user_ip4$layout() {
        return user_ip4$LAYOUT;
    }

    public static final long user_ip4$offset() {
        return 4L;
    }

    public static int user_ip4(MemorySegment struct) {
        return struct.get(user_ip4$LAYOUT, 4L);
    }

    public static void user_ip4(MemorySegment struct, int fieldValue) {
        struct.set(user_ip4$LAYOUT, 4L, fieldValue);
    }

    public static final SequenceLayout user_ip6$layout() {
        return user_ip6$LAYOUT;
    }

    public static final long user_ip6$offset() {
        return 8L;
    }

    public static MemorySegment user_ip6(MemorySegment struct) {
        return struct.asSlice(8L, user_ip6$LAYOUT.byteSize());
    }

    public static void user_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)user_ip6$LAYOUT.byteSize());
    }

    public static long[] user_ip6$dimensions() {
        return user_ip6$DIMS;
    }

    public static int user_ip6(MemorySegment struct, long index0) {
        return user_ip6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void user_ip6(MemorySegment struct, long index0, int fieldValue) {
        user_ip6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt user_port$layout() {
        return user_port$LAYOUT;
    }

    public static final long user_port$offset() {
        return 24L;
    }

    public static int user_port(MemorySegment struct) {
        return struct.get(user_port$LAYOUT, 24L);
    }

    public static void user_port(MemorySegment struct, int fieldValue) {
        struct.set(user_port$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt family$layout() {
        return family$LAYOUT;
    }

    public static final long family$offset() {
        return 28L;
    }

    public static int family(MemorySegment struct) {
        return struct.get(family$LAYOUT, 28L);
    }

    public static void family(MemorySegment struct, int fieldValue) {
        struct.set(family$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 32L;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 32L);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt protocol$layout() {
        return protocol$LAYOUT;
    }

    public static final long protocol$offset() {
        return 36L;
    }

    public static int protocol(MemorySegment struct) {
        return struct.get(protocol$LAYOUT, 36L);
    }

    public static void protocol(MemorySegment struct, int fieldValue) {
        struct.set(protocol$LAYOUT, 36L, fieldValue);
    }

    public static final ValueLayout.OfInt msg_src_ip4$layout() {
        return msg_src_ip4$LAYOUT;
    }

    public static final long msg_src_ip4$offset() {
        return 40L;
    }

    public static int msg_src_ip4(MemorySegment struct) {
        return struct.get(msg_src_ip4$LAYOUT, 40L);
    }

    public static void msg_src_ip4(MemorySegment struct, int fieldValue) {
        struct.set(msg_src_ip4$LAYOUT, 40L, fieldValue);
    }

    public static final SequenceLayout msg_src_ip6$layout() {
        return msg_src_ip6$LAYOUT;
    }

    public static final long msg_src_ip6$offset() {
        return 44L;
    }

    public static MemorySegment msg_src_ip6(MemorySegment struct) {
        return struct.asSlice(44L, msg_src_ip6$LAYOUT.byteSize());
    }

    public static void msg_src_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)44L, (long)msg_src_ip6$LAYOUT.byteSize());
    }

    public static long[] msg_src_ip6$dimensions() {
        return msg_src_ip6$DIMS;
    }

    public static int msg_src_ip6(MemorySegment struct, long index0) {
        return msg_src_ip6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void msg_src_ip6(MemorySegment struct, long index0, int fieldValue) {
        msg_src_ip6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final AddressLayout sk$layout() {
        return sk$LAYOUT;
    }

    public static final long sk$offset() {
        return 64L;
    }

    public static MemorySegment sk(MemorySegment struct) {
        return struct.get(sk$LAYOUT, 64L);
    }

    public static void sk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sk$LAYOUT, 64L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_sock_addr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_sock_addr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_sock_addr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_sock_addr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_sock_addr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_sock_addr.layout().byteSize() * elementCount, arena, cleanup);
    }
}

