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

public class sk_msg_md {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("data")}).withName("$anon$6505:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("data_end")}).withName("$anon$6506:2"), Lib.C_INT.withName("family"), Lib.C_INT.withName("remote_ip4"), Lib.C_INT.withName("local_ip4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("remote_ip6"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("local_ip6"), Lib.C_INT.withName("remote_port"), Lib.C_INT.withName("local_port"), Lib.C_INT.withName("size"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("sk")}).withName("$anon$6517:2")}).withName("sk_msg_md");
    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6505:2"), MemoryLayout.PathElement.groupElement((String)"data")});
    private static final long data$OFFSET = 0L;
    private static final AddressLayout data_end$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6506:2"), MemoryLayout.PathElement.groupElement((String)"data_end")});
    private static final long data_end$OFFSET = 8L;
    private static final ValueLayout.OfInt family$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"family")});
    private static final long family$OFFSET = 16L;
    private static final ValueLayout.OfInt remote_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_ip4")});
    private static final long remote_ip4$OFFSET = 20L;
    private static final ValueLayout.OfInt local_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_ip4")});
    private static final long local_ip4$OFFSET = 24L;
    private static final SequenceLayout remote_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_ip6")});
    private static final long remote_ip6$OFFSET = 28L;
    private static long[] remote_ip6$DIMS = new long[]{4L};
    private static final VarHandle remote_ip6$ELEM_HANDLE = remote_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final SequenceLayout local_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_ip6")});
    private static final long local_ip6$OFFSET = 44L;
    private static long[] local_ip6$DIMS = new long[]{4L};
    private static final VarHandle local_ip6$ELEM_HANDLE = local_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt remote_port$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_port")});
    private static final long remote_port$OFFSET = 60L;
    private static final ValueLayout.OfInt local_port$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_port")});
    private static final long local_port$OFFSET = 64L;
    private static final ValueLayout.OfInt size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"size")});
    private static final long size$OFFSET = 68L;
    private static final AddressLayout sk$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6517:2"), MemoryLayout.PathElement.groupElement((String)"sk")});
    private static final long sk$OFFSET = 72L;

    sk_msg_md() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    public static final long data$offset() {
        return 0L;
    }

    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, 0L);
    }

    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, 0L, fieldValue);
    }

    public static final AddressLayout data_end$layout() {
        return data_end$LAYOUT;
    }

    public static final long data_end$offset() {
        return 8L;
    }

    public static MemorySegment data_end(MemorySegment struct) {
        return struct.get(data_end$LAYOUT, 8L);
    }

    public static void data_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data_end$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt family$layout() {
        return family$LAYOUT;
    }

    public static final long family$offset() {
        return 16L;
    }

    public static int family(MemorySegment struct) {
        return struct.get(family$LAYOUT, 16L);
    }

    public static void family(MemorySegment struct, int fieldValue) {
        struct.set(family$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt remote_ip4$layout() {
        return remote_ip4$LAYOUT;
    }

    public static final long remote_ip4$offset() {
        return 20L;
    }

    public static int remote_ip4(MemorySegment struct) {
        return struct.get(remote_ip4$LAYOUT, 20L);
    }

    public static void remote_ip4(MemorySegment struct, int fieldValue) {
        struct.set(remote_ip4$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt local_ip4$layout() {
        return local_ip4$LAYOUT;
    }

    public static final long local_ip4$offset() {
        return 24L;
    }

    public static int local_ip4(MemorySegment struct) {
        return struct.get(local_ip4$LAYOUT, 24L);
    }

    public static void local_ip4(MemorySegment struct, int fieldValue) {
        struct.set(local_ip4$LAYOUT, 24L, fieldValue);
    }

    public static final SequenceLayout remote_ip6$layout() {
        return remote_ip6$LAYOUT;
    }

    public static final long remote_ip6$offset() {
        return 28L;
    }

    public static MemorySegment remote_ip6(MemorySegment struct) {
        return struct.asSlice(28L, remote_ip6$LAYOUT.byteSize());
    }

    public static void remote_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)28L, (long)remote_ip6$LAYOUT.byteSize());
    }

    public static long[] remote_ip6$dimensions() {
        return remote_ip6$DIMS;
    }

    public static int remote_ip6(MemorySegment struct, long index0) {
        return remote_ip6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void remote_ip6(MemorySegment struct, long index0, int fieldValue) {
        remote_ip6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final SequenceLayout local_ip6$layout() {
        return local_ip6$LAYOUT;
    }

    public static final long local_ip6$offset() {
        return 44L;
    }

    public static MemorySegment local_ip6(MemorySegment struct) {
        return struct.asSlice(44L, local_ip6$LAYOUT.byteSize());
    }

    public static void local_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)44L, (long)local_ip6$LAYOUT.byteSize());
    }

    public static long[] local_ip6$dimensions() {
        return local_ip6$DIMS;
    }

    public static int local_ip6(MemorySegment struct, long index0) {
        return local_ip6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void local_ip6(MemorySegment struct, long index0, int fieldValue) {
        local_ip6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt remote_port$layout() {
        return remote_port$LAYOUT;
    }

    public static final long remote_port$offset() {
        return 60L;
    }

    public static int remote_port(MemorySegment struct) {
        return struct.get(remote_port$LAYOUT, 60L);
    }

    public static void remote_port(MemorySegment struct, int fieldValue) {
        struct.set(remote_port$LAYOUT, 60L, fieldValue);
    }

    public static final ValueLayout.OfInt local_port$layout() {
        return local_port$LAYOUT;
    }

    public static final long local_port$offset() {
        return 64L;
    }

    public static int local_port(MemorySegment struct) {
        return struct.get(local_port$LAYOUT, 64L);
    }

    public static void local_port(MemorySegment struct, int fieldValue) {
        struct.set(local_port$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt size$layout() {
        return size$LAYOUT;
    }

    public static final long size$offset() {
        return 68L;
    }

    public static int size(MemorySegment struct) {
        return struct.get(size$LAYOUT, 68L);
    }

    public static void size(MemorySegment struct, int fieldValue) {
        struct.set(size$LAYOUT, 68L, fieldValue);
    }

    public static final AddressLayout sk$layout() {
        return sk$LAYOUT;
    }

    public static final long sk$offset() {
        return 72L;
    }

    public static MemorySegment sk(MemorySegment struct) {
        return struct.get(sk$LAYOUT, 72L);
    }

    public static void sk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sk$LAYOUT, 72L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(sk_msg_md.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return sk_msg_md.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)sk_msg_md.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sk_msg_md.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return sk_msg_md.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(sk_msg_md.layout().byteSize() * elementCount, arena, cleanup);
    }
}

