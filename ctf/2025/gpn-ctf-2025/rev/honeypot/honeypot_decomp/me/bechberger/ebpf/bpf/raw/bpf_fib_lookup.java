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

public class bpf_fib_lookup {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("family"), Lib.C_CHAR.withName("l4_protocol"), Lib.C_SHORT.withName("sport"), Lib.C_SHORT.withName("dport"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("tot_len"), Lib.C_SHORT.withName("mtu_result")}).withName("$anon$7180:2"), Lib.C_INT.withName("ifindex"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("tos"), Lib.C_INT.withName("flowinfo"), Lib.C_INT.withName("rt_metric")}).withName("$anon$7192:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ipv4_src"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("ipv6_src")}).withName("$anon$7204:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ipv4_dst"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("ipv6_dst")}).withName("$anon$7213:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("h_vlan_proto"), Lib.C_SHORT.withName("h_vlan_TCI")}).withName("$anon$7219:3"), Lib.C_INT.withName("tbid")}).withName("$anon$7218:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("mark")}).withName("$anon$7233:3"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)6L, (MemoryLayout)Lib.C_CHAR).withName("smac"), MemoryLayout.sequenceLayout((long)6L, (MemoryLayout)Lib.C_CHAR).withName("dmac")}).withName("$anon$7239:3")}).withName("$anon$7231:2")}).withName("bpf_fib_lookup");
    private static final ValueLayout.OfByte family$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"family")});
    private static final long family$OFFSET = 0L;
    private static final ValueLayout.OfByte l4_protocol$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"l4_protocol")});
    private static final long l4_protocol$OFFSET = 1L;
    private static final ValueLayout.OfShort sport$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sport")});
    private static final long sport$OFFSET = 2L;
    private static final ValueLayout.OfShort dport$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dport")});
    private static final long dport$OFFSET = 4L;
    private static final ValueLayout.OfShort tot_len$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7180:2"), MemoryLayout.PathElement.groupElement((String)"tot_len")});
    private static final long tot_len$OFFSET = 6L;
    private static final ValueLayout.OfShort mtu_result$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7180:2"), MemoryLayout.PathElement.groupElement((String)"mtu_result")});
    private static final long mtu_result$OFFSET = 6L;
    private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
    private static final long ifindex$OFFSET = 8L;
    private static final ValueLayout.OfByte tos$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7192:2"), MemoryLayout.PathElement.groupElement((String)"tos")});
    private static final long tos$OFFSET = 12L;
    private static final ValueLayout.OfInt flowinfo$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7192:2"), MemoryLayout.PathElement.groupElement((String)"flowinfo")});
    private static final long flowinfo$OFFSET = 12L;
    private static final ValueLayout.OfInt rt_metric$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7192:2"), MemoryLayout.PathElement.groupElement((String)"rt_metric")});
    private static final long rt_metric$OFFSET = 12L;
    private static final ValueLayout.OfInt ipv4_src$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7204:2"), MemoryLayout.PathElement.groupElement((String)"ipv4_src")});
    private static final long ipv4_src$OFFSET = 16L;
    private static final SequenceLayout ipv6_src$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7204:2"), MemoryLayout.PathElement.groupElement((String)"ipv6_src")});
    private static final long ipv6_src$OFFSET = 16L;
    private static long[] ipv6_src$DIMS = new long[]{4L};
    private static final VarHandle ipv6_src$ELEM_HANDLE = ipv6_src$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt ipv4_dst$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7213:2"), MemoryLayout.PathElement.groupElement((String)"ipv4_dst")});
    private static final long ipv4_dst$OFFSET = 32L;
    private static final SequenceLayout ipv6_dst$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7213:2"), MemoryLayout.PathElement.groupElement((String)"ipv6_dst")});
    private static final long ipv6_dst$OFFSET = 32L;
    private static long[] ipv6_dst$DIMS = new long[]{4L};
    private static final VarHandle ipv6_dst$ELEM_HANDLE = ipv6_dst$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfShort h_vlan_proto$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7218:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7219:3"), MemoryLayout.PathElement.groupElement((String)"h_vlan_proto")});
    private static final long h_vlan_proto$OFFSET = 48L;
    private static final ValueLayout.OfShort h_vlan_TCI$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7218:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7219:3"), MemoryLayout.PathElement.groupElement((String)"h_vlan_TCI")});
    private static final long h_vlan_TCI$OFFSET = 50L;
    private static final ValueLayout.OfInt tbid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7218:2"), MemoryLayout.PathElement.groupElement((String)"tbid")});
    private static final long tbid$OFFSET = 48L;
    private static final ValueLayout.OfInt mark$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7231:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7233:3"), MemoryLayout.PathElement.groupElement((String)"mark")});
    private static final long mark$OFFSET = 52L;
    private static final SequenceLayout smac$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7231:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7239:3"), MemoryLayout.PathElement.groupElement((String)"smac")});
    private static final long smac$OFFSET = 52L;
    private static long[] smac$DIMS = new long[]{6L};
    private static final VarHandle smac$ELEM_HANDLE = smac$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final SequenceLayout dmac$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$7231:2"), MemoryLayout.PathElement.groupElement((String)"$anon$7239:3"), MemoryLayout.PathElement.groupElement((String)"dmac")});
    private static final long dmac$OFFSET = 58L;
    private static long[] dmac$DIMS = new long[]{6L};
    private static final VarHandle dmac$ELEM_HANDLE = dmac$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    bpf_fib_lookup() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte family$layout() {
        return family$LAYOUT;
    }

    public static final long family$offset() {
        return 0L;
    }

    public static byte family(MemorySegment struct) {
        return struct.get(family$LAYOUT, 0L);
    }

    public static void family(MemorySegment struct, byte fieldValue) {
        struct.set(family$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte l4_protocol$layout() {
        return l4_protocol$LAYOUT;
    }

    public static final long l4_protocol$offset() {
        return 1L;
    }

    public static byte l4_protocol(MemorySegment struct) {
        return struct.get(l4_protocol$LAYOUT, 1L);
    }

    public static void l4_protocol(MemorySegment struct, byte fieldValue) {
        struct.set(l4_protocol$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfShort sport$layout() {
        return sport$LAYOUT;
    }

    public static final long sport$offset() {
        return 2L;
    }

    public static short sport(MemorySegment struct) {
        return struct.get(sport$LAYOUT, 2L);
    }

    public static void sport(MemorySegment struct, short fieldValue) {
        struct.set(sport$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfShort dport$layout() {
        return dport$LAYOUT;
    }

    public static final long dport$offset() {
        return 4L;
    }

    public static short dport(MemorySegment struct) {
        return struct.get(dport$LAYOUT, 4L);
    }

    public static void dport(MemorySegment struct, short fieldValue) {
        struct.set(dport$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfShort tot_len$layout() {
        return tot_len$LAYOUT;
    }

    public static final long tot_len$offset() {
        return 6L;
    }

    public static short tot_len(MemorySegment struct) {
        return struct.get(tot_len$LAYOUT, 6L);
    }

    public static void tot_len(MemorySegment struct, short fieldValue) {
        struct.set(tot_len$LAYOUT, 6L, fieldValue);
    }

    public static final ValueLayout.OfShort mtu_result$layout() {
        return mtu_result$LAYOUT;
    }

    public static final long mtu_result$offset() {
        return 6L;
    }

    public static short mtu_result(MemorySegment struct) {
        return struct.get(mtu_result$LAYOUT, 6L);
    }

    public static void mtu_result(MemorySegment struct, short fieldValue) {
        struct.set(mtu_result$LAYOUT, 6L, fieldValue);
    }

    public static final ValueLayout.OfInt ifindex$layout() {
        return ifindex$LAYOUT;
    }

    public static final long ifindex$offset() {
        return 8L;
    }

    public static int ifindex(MemorySegment struct) {
        return struct.get(ifindex$LAYOUT, 8L);
    }

    public static void ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ifindex$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfByte tos$layout() {
        return tos$LAYOUT;
    }

    public static final long tos$offset() {
        return 12L;
    }

    public static byte tos(MemorySegment struct) {
        return struct.get(tos$LAYOUT, 12L);
    }

    public static void tos(MemorySegment struct, byte fieldValue) {
        struct.set(tos$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt flowinfo$layout() {
        return flowinfo$LAYOUT;
    }

    public static final long flowinfo$offset() {
        return 12L;
    }

    public static int flowinfo(MemorySegment struct) {
        return struct.get(flowinfo$LAYOUT, 12L);
    }

    public static void flowinfo(MemorySegment struct, int fieldValue) {
        struct.set(flowinfo$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt rt_metric$layout() {
        return rt_metric$LAYOUT;
    }

    public static final long rt_metric$offset() {
        return 12L;
    }

    public static int rt_metric(MemorySegment struct) {
        return struct.get(rt_metric$LAYOUT, 12L);
    }

    public static void rt_metric(MemorySegment struct, int fieldValue) {
        struct.set(rt_metric$LAYOUT, 12L, fieldValue);
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

    public static final ValueLayout.OfInt ipv4_dst$layout() {
        return ipv4_dst$LAYOUT;
    }

    public static final long ipv4_dst$offset() {
        return 32L;
    }

    public static int ipv4_dst(MemorySegment struct) {
        return struct.get(ipv4_dst$LAYOUT, 32L);
    }

    public static void ipv4_dst(MemorySegment struct, int fieldValue) {
        struct.set(ipv4_dst$LAYOUT, 32L, fieldValue);
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

    public static final ValueLayout.OfShort h_vlan_proto$layout() {
        return h_vlan_proto$LAYOUT;
    }

    public static final long h_vlan_proto$offset() {
        return 48L;
    }

    public static short h_vlan_proto(MemorySegment struct) {
        return struct.get(h_vlan_proto$LAYOUT, 48L);
    }

    public static void h_vlan_proto(MemorySegment struct, short fieldValue) {
        struct.set(h_vlan_proto$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfShort h_vlan_TCI$layout() {
        return h_vlan_TCI$LAYOUT;
    }

    public static final long h_vlan_TCI$offset() {
        return 50L;
    }

    public static short h_vlan_TCI(MemorySegment struct) {
        return struct.get(h_vlan_TCI$LAYOUT, 50L);
    }

    public static void h_vlan_TCI(MemorySegment struct, short fieldValue) {
        struct.set(h_vlan_TCI$LAYOUT, 50L, fieldValue);
    }

    public static final ValueLayout.OfInt tbid$layout() {
        return tbid$LAYOUT;
    }

    public static final long tbid$offset() {
        return 48L;
    }

    public static int tbid(MemorySegment struct) {
        return struct.get(tbid$LAYOUT, 48L);
    }

    public static void tbid(MemorySegment struct, int fieldValue) {
        struct.set(tbid$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt mark$layout() {
        return mark$LAYOUT;
    }

    public static final long mark$offset() {
        return 52L;
    }

    public static int mark(MemorySegment struct) {
        return struct.get(mark$LAYOUT, 52L);
    }

    public static void mark(MemorySegment struct, int fieldValue) {
        struct.set(mark$LAYOUT, 52L, fieldValue);
    }

    public static final SequenceLayout smac$layout() {
        return smac$LAYOUT;
    }

    public static final long smac$offset() {
        return 52L;
    }

    public static MemorySegment smac(MemorySegment struct) {
        return struct.asSlice(52L, smac$LAYOUT.byteSize());
    }

    public static void smac(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)52L, (long)smac$LAYOUT.byteSize());
    }

    public static long[] smac$dimensions() {
        return smac$DIMS;
    }

    public static byte smac(MemorySegment struct, long index0) {
        return smac$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void smac(MemorySegment struct, long index0, byte fieldValue) {
        smac$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final SequenceLayout dmac$layout() {
        return dmac$LAYOUT;
    }

    public static final long dmac$offset() {
        return 58L;
    }

    public static MemorySegment dmac(MemorySegment struct) {
        return struct.asSlice(58L, dmac$LAYOUT.byteSize());
    }

    public static void dmac(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)58L, (long)dmac$LAYOUT.byteSize());
    }

    public static long[] dmac$dimensions() {
        return dmac$DIMS;
    }

    public static byte dmac(MemorySegment struct, long index0) {
        return dmac$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void dmac(MemorySegment struct, long index0, byte fieldValue) {
        dmac$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_fib_lookup.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_fib_lookup.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_fib_lookup.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_fib_lookup.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_fib_lookup.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_fib_lookup.layout().byteSize() * elementCount, arena, cleanup);
    }
}

