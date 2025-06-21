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
import me.bechberger.ebpf.bpf.raw.in6_addr;

public class ipv6hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.paddingLayout((long)1L), MemoryLayout.sequenceLayout((long)3L, (MemoryLayout)Lib.C_CHAR).withName("flow_lbl"), Lib.C_SHORT.withName("payload_len"), Lib.C_CHAR.withName("nexthdr"), Lib.C_CHAR.withName("hop_limit"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in6_addr.layout().withName("saddr"), in6_addr.layout().withName("daddr")}).withName("$anon$134:2"), addrs.layout().withName("addrs")}).withName("$anon$134:2")}).withName("ipv6hdr");
    private static final SequenceLayout flow_lbl$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flow_lbl")});
    private static final long flow_lbl$OFFSET = 1L;
    private static long[] flow_lbl$DIMS = new long[]{3L};
    private static final VarHandle flow_lbl$ELEM_HANDLE = flow_lbl$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfShort payload_len$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"payload_len")});
    private static final long payload_len$OFFSET = 4L;
    private static final ValueLayout.OfByte nexthdr$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nexthdr")});
    private static final long nexthdr$OFFSET = 6L;
    private static final ValueLayout.OfByte hop_limit$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hop_limit")});
    private static final long hop_limit$OFFSET = 7L;
    private static final GroupLayout saddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$134:2"), MemoryLayout.PathElement.groupElement((String)"$anon$134:2"), MemoryLayout.PathElement.groupElement((String)"saddr")});
    private static final long saddr$OFFSET = 8L;
    private static final GroupLayout daddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$134:2"), MemoryLayout.PathElement.groupElement((String)"$anon$134:2"), MemoryLayout.PathElement.groupElement((String)"daddr")});
    private static final long daddr$OFFSET = 24L;
    private static final GroupLayout addrs$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$134:2"), MemoryLayout.PathElement.groupElement((String)"addrs")});
    private static final long addrs$OFFSET = 8L;

    ipv6hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final SequenceLayout flow_lbl$layout() {
        return flow_lbl$LAYOUT;
    }

    public static final long flow_lbl$offset() {
        return 1L;
    }

    public static MemorySegment flow_lbl(MemorySegment struct) {
        return struct.asSlice(1L, flow_lbl$LAYOUT.byteSize());
    }

    public static void flow_lbl(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)1L, (long)flow_lbl$LAYOUT.byteSize());
    }

    public static long[] flow_lbl$dimensions() {
        return flow_lbl$DIMS;
    }

    public static byte flow_lbl(MemorySegment struct, long index0) {
        return flow_lbl$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void flow_lbl(MemorySegment struct, long index0, byte fieldValue) {
        flow_lbl$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfShort payload_len$layout() {
        return payload_len$LAYOUT;
    }

    public static final long payload_len$offset() {
        return 4L;
    }

    public static short payload_len(MemorySegment struct) {
        return struct.get(payload_len$LAYOUT, 4L);
    }

    public static void payload_len(MemorySegment struct, short fieldValue) {
        struct.set(payload_len$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfByte nexthdr$layout() {
        return nexthdr$LAYOUT;
    }

    public static final long nexthdr$offset() {
        return 6L;
    }

    public static byte nexthdr(MemorySegment struct) {
        return struct.get(nexthdr$LAYOUT, 6L);
    }

    public static void nexthdr(MemorySegment struct, byte fieldValue) {
        struct.set(nexthdr$LAYOUT, 6L, fieldValue);
    }

    public static final ValueLayout.OfByte hop_limit$layout() {
        return hop_limit$LAYOUT;
    }

    public static final long hop_limit$offset() {
        return 7L;
    }

    public static byte hop_limit(MemorySegment struct) {
        return struct.get(hop_limit$LAYOUT, 7L);
    }

    public static void hop_limit(MemorySegment struct, byte fieldValue) {
        struct.set(hop_limit$LAYOUT, 7L, fieldValue);
    }

    public static final GroupLayout saddr$layout() {
        return saddr$LAYOUT;
    }

    public static final long saddr$offset() {
        return 8L;
    }

    public static MemorySegment saddr(MemorySegment struct) {
        return struct.asSlice(8L, saddr$LAYOUT.byteSize());
    }

    public static void saddr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)saddr$LAYOUT.byteSize());
    }

    public static final GroupLayout daddr$layout() {
        return daddr$LAYOUT;
    }

    public static final long daddr$offset() {
        return 24L;
    }

    public static MemorySegment daddr(MemorySegment struct) {
        return struct.asSlice(24L, daddr$LAYOUT.byteSize());
    }

    public static void daddr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)24L, (long)daddr$LAYOUT.byteSize());
    }

    public static final GroupLayout addrs$layout() {
        return addrs$LAYOUT;
    }

    public static final long addrs$offset() {
        return 8L;
    }

    public static MemorySegment addrs(MemorySegment struct) {
        return struct.asSlice(8L, addrs$LAYOUT.byteSize());
    }

    public static void addrs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)addrs$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ipv6hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ipv6hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ipv6hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ipv6hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ipv6hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ipv6hdr.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class addrs {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{in6_addr.layout().withName("saddr"), in6_addr.layout().withName("daddr")}).withName("$anon$134:2");
        private static final GroupLayout saddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"saddr")});
        private static final long saddr$OFFSET = 0L;
        private static final GroupLayout daddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"daddr")});
        private static final long daddr$OFFSET = 16L;

        addrs() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final GroupLayout saddr$layout() {
            return saddr$LAYOUT;
        }

        public static final long saddr$offset() {
            return 0L;
        }

        public static MemorySegment saddr(MemorySegment struct) {
            return struct.asSlice(0L, saddr$LAYOUT.byteSize());
        }

        public static void saddr(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)saddr$LAYOUT.byteSize());
        }

        public static final GroupLayout daddr$layout() {
            return daddr$LAYOUT;
        }

        public static final long daddr$offset() {
            return 16L;
        }

        public static MemorySegment daddr(MemorySegment struct) {
            return struct.asSlice(16L, daddr$LAYOUT.byteSize());
        }

        public static void daddr(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)daddr$LAYOUT.byteSize());
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(addrs.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return addrs.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)addrs.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)addrs.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return addrs.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(addrs.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

