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

public class bpf_flow_keys {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("nhoff"), Lib.C_SHORT.withName("thoff"), Lib.C_SHORT.withName("addr_proto"), Lib.C_CHAR.withName("is_frag"), Lib.C_CHAR.withName("is_first_frag"), Lib.C_CHAR.withName("is_encap"), Lib.C_CHAR.withName("ip_proto"), Lib.C_SHORT.withName("n_proto"), Lib.C_SHORT.withName("sport"), Lib.C_SHORT.withName("dport"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ipv4_src"), Lib.C_INT.withName("ipv4_dst")}).withName("$anon$7294:3"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("ipv6_src"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("ipv6_dst")}).withName("$anon$7298:3")}).withName("$anon$7293:2"), Lib.C_INT.withName("flags"), Lib.C_INT.withName("flow_label")}).withName("bpf_flow_keys");
    private static final ValueLayout.OfShort nhoff$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nhoff")});
    private static final long nhoff$OFFSET = 0L;
    private static final ValueLayout.OfShort thoff$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"thoff")});
    private static final long thoff$OFFSET = 2L;
    private static final ValueLayout.OfShort addr_proto$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addr_proto")});
    private static final long addr_proto$OFFSET = 4L;
    private static final ValueLayout.OfByte is_frag$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"is_frag")});
    private static final long is_frag$OFFSET = 6L;
    private static final ValueLayout.OfByte is_first_frag$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"is_first_frag")});
    private static final long is_first_frag$OFFSET = 7L;
    private static final ValueLayout.OfByte is_encap$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"is_encap")});
    private static final long is_encap$OFFSET = 8L;
    private static final ValueLayout.OfByte ip_proto$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ip_proto")});
    private static final long ip_proto$OFFSET = 9L;
    private static final ValueLayout.OfShort n_proto$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"n_proto")});
    private static final long n_proto$OFFSET = 10L;
    private static final ValueLayout.OfShort sport$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sport")});
    private static final long sport$OFFSET = 12L;
    private static final ValueLayout.OfShort dport$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dport")});
    private static final long dport$OFFSET = 14L;
    private static final ValueLayout.OfInt ipv4_src$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7293:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7294:3"), MemoryLayout.PathElement.groupElement((String)"ipv4_src")});
    private static final long ipv4_src$OFFSET = 16L;
    private static final ValueLayout.OfInt ipv4_dst$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7293:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7294:3"), MemoryLayout.PathElement.groupElement((String)"ipv4_dst")});
    private static final long ipv4_dst$OFFSET = 20L;
    private static final SequenceLayout ipv6_src$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7293:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7298:3"), MemoryLayout.PathElement.groupElement((String)"ipv6_src")});
    private static final long ipv6_src$OFFSET = 16L;
    private static long[] ipv6_src$DIMS = new long[]{4L};
    private static final VarHandle ipv6_src$ELEM_HANDLE = ipv6_src$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final SequenceLayout ipv6_dst$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7293:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7298:3"), MemoryLayout.PathElement.groupElement((String)"ipv6_dst")});
    private static final long ipv6_dst$OFFSET = 32L;
    private static long[] ipv6_dst$DIMS = new long[]{4L};
    private static final VarHandle ipv6_dst$ELEM_HANDLE = ipv6_dst$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 48L;
    private static final ValueLayout.OfInt flow_label$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flow_label")});
    private static final long flow_label$OFFSET = 52L;

    bpf_flow_keys() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfShort nhoff$layout() {
        return nhoff$LAYOUT;
    }

    public static final long nhoff$offset() {
        return 0L;
    }

    public static short nhoff(MemorySegment struct) {
        return struct.get(nhoff$LAYOUT, 0L);
    }

    public static void nhoff(MemorySegment struct, short fieldValue) {
        struct.set(nhoff$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfShort thoff$layout() {
        return thoff$LAYOUT;
    }

    public static final long thoff$offset() {
        return 2L;
    }

    public static short thoff(MemorySegment struct) {
        return struct.get(thoff$LAYOUT, 2L);
    }

    public static void thoff(MemorySegment struct, short fieldValue) {
        struct.set(thoff$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfShort addr_proto$layout() {
        return addr_proto$LAYOUT;
    }

    public static final long addr_proto$offset() {
        return 4L;
    }

    public static short addr_proto(MemorySegment struct) {
        return struct.get(addr_proto$LAYOUT, 4L);
    }

    public static void addr_proto(MemorySegment struct, short fieldValue) {
        struct.set(addr_proto$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfByte is_frag$layout() {
        return is_frag$LAYOUT;
    }

    public static final long is_frag$offset() {
        return 6L;
    }

    public static byte is_frag(MemorySegment struct) {
        return struct.get(is_frag$LAYOUT, 6L);
    }

    public static void is_frag(MemorySegment struct, byte fieldValue) {
        struct.set(is_frag$LAYOUT, 6L, fieldValue);
    }

    public static final ValueLayout.OfByte is_first_frag$layout() {
        return is_first_frag$LAYOUT;
    }

    public static final long is_first_frag$offset() {
        return 7L;
    }

    public static byte is_first_frag(MemorySegment struct) {
        return struct.get(is_first_frag$LAYOUT, 7L);
    }

    public static void is_first_frag(MemorySegment struct, byte fieldValue) {
        struct.set(is_first_frag$LAYOUT, 7L, fieldValue);
    }

    public static final ValueLayout.OfByte is_encap$layout() {
        return is_encap$LAYOUT;
    }

    public static final long is_encap$offset() {
        return 8L;
    }

    public static byte is_encap(MemorySegment struct) {
        return struct.get(is_encap$LAYOUT, 8L);
    }

    public static void is_encap(MemorySegment struct, byte fieldValue) {
        struct.set(is_encap$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfByte ip_proto$layout() {
        return ip_proto$LAYOUT;
    }

    public static final long ip_proto$offset() {
        return 9L;
    }

    public static byte ip_proto(MemorySegment struct) {
        return struct.get(ip_proto$LAYOUT, 9L);
    }

    public static void ip_proto(MemorySegment struct, byte fieldValue) {
        struct.set(ip_proto$LAYOUT, 9L, fieldValue);
    }

    public static final ValueLayout.OfShort n_proto$layout() {
        return n_proto$LAYOUT;
    }

    public static final long n_proto$offset() {
        return 10L;
    }

    public static short n_proto(MemorySegment struct) {
        return struct.get(n_proto$LAYOUT, 10L);
    }

    public static void n_proto(MemorySegment struct, short fieldValue) {
        struct.set(n_proto$LAYOUT, 10L, fieldValue);
    }

    public static final ValueLayout.OfShort sport$layout() {
        return sport$LAYOUT;
    }

    public static final long sport$offset() {
        return 12L;
    }

    public static short sport(MemorySegment struct) {
        return struct.get(sport$LAYOUT, 12L);
    }

    public static void sport(MemorySegment struct, short fieldValue) {
        struct.set(sport$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfShort dport$layout() {
        return dport$LAYOUT;
    }

    public static final long dport$offset() {
        return 14L;
    }

    public static short dport(MemorySegment struct) {
        return struct.get(dport$LAYOUT, 14L);
    }

    public static void dport(MemorySegment struct, short fieldValue) {
        struct.set(dport$LAYOUT, 14L, fieldValue);
    }

    public static final ValueLayout.OfInt ipv4_src$layout() {
        return ipv4_src$LAYOUT;
    }

    public static final long ipv4_src$offset() {
        return 16L;
    }

    public static int ipv4_src(MemorySegment struct) {
        return struct.get(ipv4_src$LAYOUT, 16L);
    }

    public static void ipv4_src(MemorySegment struct, int fieldValue) {
        struct.set(ipv4_src$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt ipv4_dst$layout() {
        return ipv4_dst$LAYOUT;
    }

    public static final long ipv4_dst$offset() {
        return 20L;
    }

    public static int ipv4_dst(MemorySegment struct) {
        return struct.get(ipv4_dst$LAYOUT, 20L);
    }

    public static void ipv4_dst(MemorySegment struct, int fieldValue) {
        struct.set(ipv4_dst$LAYOUT, 20L, fieldValue);
    }

    public static final SequenceLayout ipv6_src$layout() {
        return ipv6_src$LAYOUT;
    }

    public static final long ipv6_src$offset() {
        return 16L;
    }

    public static MemorySegment ipv6_src(MemorySegment struct) {
        return struct.asSlice(16L, ipv6_src$LAYOUT.byteSize());
    }

    public static void ipv6_src(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)ipv6_src$LAYOUT.byteSize());
    }

    public static long[] ipv6_src$dimensions() {
        return ipv6_src$DIMS;
    }

    public static int ipv6_src(MemorySegment struct, long index0) {
        return ipv6_src$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void ipv6_src(MemorySegment struct, long index0, int fieldValue) {
        ipv6_src$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final SequenceLayout ipv6_dst$layout() {
        return ipv6_dst$LAYOUT;
    }

    public static final long ipv6_dst$offset() {
        return 32L;
    }

    public static MemorySegment ipv6_dst(MemorySegment struct) {
        return struct.asSlice(32L, ipv6_dst$LAYOUT.byteSize());
    }

    public static void ipv6_dst(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)ipv6_dst$LAYOUT.byteSize());
    }

    public static long[] ipv6_dst$dimensions() {
        return ipv6_dst$DIMS;
    }

    public static int ipv6_dst(MemorySegment struct, long index0) {
        return ipv6_dst$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void ipv6_dst(MemorySegment struct, long index0, int fieldValue) {
        ipv6_dst$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 48L;
    }

    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, 48L);
    }

    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt flow_label$layout() {
        return flow_label$LAYOUT;
    }

    public static final long flow_label$offset() {
        return 52L;
    }

    public static int flow_label(MemorySegment struct) {
        return struct.get(flow_label$LAYOUT, 52L);
    }

    public static void flow_label(MemorySegment struct, int fieldValue) {
        struct.set(flow_label$LAYOUT, 52L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_flow_keys.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_flow_keys.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_flow_keys.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_flow_keys.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_flow_keys.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_flow_keys.layout().byteSize() * elementCount, arena, cleanup);
    }
}

