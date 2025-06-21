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

public class bpf_tunnel_key {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("tunnel_id"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("remote_ipv4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("remote_ipv6")}).withName("$anon$6283:2"), Lib.C_CHAR.withName("tunnel_tos"), Lib.C_CHAR.withName("tunnel_ttl"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("tunnel_ext"), Lib.C_SHORT.withName("tunnel_flags")}).withName("$anon$6289:2"), Lib.C_INT.withName("tunnel_label"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("local_ipv4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("local_ipv6")}).withName("$anon$6294:2")}).withName("bpf_tunnel_key");
    private static final ValueLayout.OfInt tunnel_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tunnel_id")});
    private static final long tunnel_id$OFFSET = 0L;
    private static final ValueLayout.OfInt remote_ipv4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6283:2"), MemoryLayout.PathElement.groupElement((String)"remote_ipv4")});
    private static final long remote_ipv4$OFFSET = 4L;
    private static final SequenceLayout remote_ipv6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6283:2"), MemoryLayout.PathElement.groupElement((String)"remote_ipv6")});
    private static final long remote_ipv6$OFFSET = 4L;
    private static long[] remote_ipv6$DIMS = new long[]{4L};
    private static final VarHandle remote_ipv6$ELEM_HANDLE = remote_ipv6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfByte tunnel_tos$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tunnel_tos")});
    private static final long tunnel_tos$OFFSET = 20L;
    private static final ValueLayout.OfByte tunnel_ttl$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tunnel_ttl")});
    private static final long tunnel_ttl$OFFSET = 21L;
    private static final ValueLayout.OfShort tunnel_ext$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6289:2"), MemoryLayout.PathElement.groupElement((String)"tunnel_ext")});
    private static final long tunnel_ext$OFFSET = 22L;
    private static final ValueLayout.OfShort tunnel_flags$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6289:2"), MemoryLayout.PathElement.groupElement((String)"tunnel_flags")});
    private static final long tunnel_flags$OFFSET = 22L;
    private static final ValueLayout.OfInt tunnel_label$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tunnel_label")});
    private static final long tunnel_label$OFFSET = 24L;
    private static final ValueLayout.OfInt local_ipv4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6294:2"), MemoryLayout.PathElement.groupElement((String)"local_ipv4")});
    private static final long local_ipv4$OFFSET = 28L;
    private static final SequenceLayout local_ipv6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6294:2"), MemoryLayout.PathElement.groupElement((String)"local_ipv6")});
    private static final long local_ipv6$OFFSET = 28L;
    private static long[] local_ipv6$DIMS = new long[]{4L};
    private static final VarHandle local_ipv6$ELEM_HANDLE = local_ipv6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    bpf_tunnel_key() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt tunnel_id$layout() {
        return tunnel_id$LAYOUT;
    }

    public static final long tunnel_id$offset() {
        return 0L;
    }

    public static int tunnel_id(MemorySegment struct) {
        return struct.get(tunnel_id$LAYOUT, 0L);
    }

    public static void tunnel_id(MemorySegment struct, int fieldValue) {
        struct.set(tunnel_id$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt remote_ipv4$layout() {
        return remote_ipv4$LAYOUT;
    }

    public static final long remote_ipv4$offset() {
        return 4L;
    }

    public static int remote_ipv4(MemorySegment struct) {
        return struct.get(remote_ipv4$LAYOUT, 4L);
    }

    public static void remote_ipv4(MemorySegment struct, int fieldValue) {
        struct.set(remote_ipv4$LAYOUT, 4L, fieldValue);
    }

    public static final SequenceLayout remote_ipv6$layout() {
        return remote_ipv6$LAYOUT;
    }

    public static final long remote_ipv6$offset() {
        return 4L;
    }

    public static MemorySegment remote_ipv6(MemorySegment struct) {
        return struct.asSlice(4L, remote_ipv6$LAYOUT.byteSize());
    }

    public static void remote_ipv6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)remote_ipv6$LAYOUT.byteSize());
    }

    public static long[] remote_ipv6$dimensions() {
        return remote_ipv6$DIMS;
    }

    public static int remote_ipv6(MemorySegment struct, long index0) {
        return remote_ipv6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void remote_ipv6(MemorySegment struct, long index0, int fieldValue) {
        remote_ipv6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfByte tunnel_tos$layout() {
        return tunnel_tos$LAYOUT;
    }

    public static final long tunnel_tos$offset() {
        return 20L;
    }

    public static byte tunnel_tos(MemorySegment struct) {
        return struct.get(tunnel_tos$LAYOUT, 20L);
    }

    public static void tunnel_tos(MemorySegment struct, byte fieldValue) {
        struct.set(tunnel_tos$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfByte tunnel_ttl$layout() {
        return tunnel_ttl$LAYOUT;
    }

    public static final long tunnel_ttl$offset() {
        return 21L;
    }

    public static byte tunnel_ttl(MemorySegment struct) {
        return struct.get(tunnel_ttl$LAYOUT, 21L);
    }

    public static void tunnel_ttl(MemorySegment struct, byte fieldValue) {
        struct.set(tunnel_ttl$LAYOUT, 21L, fieldValue);
    }

    public static final ValueLayout.OfShort tunnel_ext$layout() {
        return tunnel_ext$LAYOUT;
    }

    public static final long tunnel_ext$offset() {
        return 22L;
    }

    public static short tunnel_ext(MemorySegment struct) {
        return struct.get(tunnel_ext$LAYOUT, 22L);
    }

    public static void tunnel_ext(MemorySegment struct, short fieldValue) {
        struct.set(tunnel_ext$LAYOUT, 22L, fieldValue);
    }

    public static final ValueLayout.OfShort tunnel_flags$layout() {
        return tunnel_flags$LAYOUT;
    }

    public static final long tunnel_flags$offset() {
        return 22L;
    }

    public static short tunnel_flags(MemorySegment struct) {
        return struct.get(tunnel_flags$LAYOUT, 22L);
    }

    public static void tunnel_flags(MemorySegment struct, short fieldValue) {
        struct.set(tunnel_flags$LAYOUT, 22L, fieldValue);
    }

    public static final ValueLayout.OfInt tunnel_label$layout() {
        return tunnel_label$LAYOUT;
    }

    public static final long tunnel_label$offset() {
        return 24L;
    }

    public static int tunnel_label(MemorySegment struct) {
        return struct.get(tunnel_label$LAYOUT, 24L);
    }

    public static void tunnel_label(MemorySegment struct, int fieldValue) {
        struct.set(tunnel_label$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt local_ipv4$layout() {
        return local_ipv4$LAYOUT;
    }

    public static final long local_ipv4$offset() {
        return 28L;
    }

    public static int local_ipv4(MemorySegment struct) {
        return struct.get(local_ipv4$LAYOUT, 28L);
    }

    public static void local_ipv4(MemorySegment struct, int fieldValue) {
        struct.set(local_ipv4$LAYOUT, 28L, fieldValue);
    }

    public static final SequenceLayout local_ipv6$layout() {
        return local_ipv6$LAYOUT;
    }

    public static final long local_ipv6$offset() {
        return 28L;
    }

    public static MemorySegment local_ipv6(MemorySegment struct) {
        return struct.asSlice(28L, local_ipv6$LAYOUT.byteSize());
    }

    public static void local_ipv6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)28L, (long)local_ipv6$LAYOUT.byteSize());
    }

    public static long[] local_ipv6$dimensions() {
        return local_ipv6$DIMS;
    }

    public static int local_ipv6(MemorySegment struct, long index0) {
        return local_ipv6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void local_ipv6(MemorySegment struct, long index0, int fieldValue) {
        local_ipv6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_tunnel_key.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_tunnel_key.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_tunnel_key.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_tunnel_key.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_tunnel_key.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_tunnel_key.layout().byteSize() * elementCount, arena, cleanup);
    }
}

