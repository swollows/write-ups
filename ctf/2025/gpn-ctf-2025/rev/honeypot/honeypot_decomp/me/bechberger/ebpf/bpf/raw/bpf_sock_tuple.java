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

public class bpf_sock_tuple {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{ipv4.layout().withName("ipv4"), ipv6.layout().withName("ipv6")}).withName("$anon$6408:2")}).withName("bpf_sock_tuple");
    private static final GroupLayout ipv4$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6408:2"), MemoryLayout.PathElement.groupElement((String)"ipv4")});
    private static final long ipv4$OFFSET = 0L;
    private static final GroupLayout ipv6$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6408:2"), MemoryLayout.PathElement.groupElement((String)"ipv6")});
    private static final long ipv6$OFFSET = 0L;

    bpf_sock_tuple() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout ipv4$layout() {
        return ipv4$LAYOUT;
    }

    public static final long ipv4$offset() {
        return 0L;
    }

    public static MemorySegment ipv4(MemorySegment struct) {
        return struct.asSlice(0L, ipv4$LAYOUT.byteSize());
    }

    public static void ipv4(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)ipv4$LAYOUT.byteSize());
    }

    public static final GroupLayout ipv6$layout() {
        return ipv6$LAYOUT;
    }

    public static final long ipv6$offset() {
        return 0L;
    }

    public static MemorySegment ipv6(MemorySegment struct) {
        return struct.asSlice(0L, ipv6$LAYOUT.byteSize());
    }

    public static void ipv6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)ipv6$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_sock_tuple.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_sock_tuple.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_sock_tuple.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_sock_tuple.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_sock_tuple.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_sock_tuple.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class ipv4 {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("saddr"), Lib.C_INT.withName("daddr"), Lib.C_SHORT.withName("sport"), Lib.C_SHORT.withName("dport")}).withName("$anon$6409:3");
        private static final ValueLayout.OfInt saddr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"saddr")});
        private static final long saddr$OFFSET = 0L;
        private static final ValueLayout.OfInt daddr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"daddr")});
        private static final long daddr$OFFSET = 4L;
        private static final ValueLayout.OfShort sport$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sport")});
        private static final long sport$OFFSET = 8L;
        private static final ValueLayout.OfShort dport$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dport")});
        private static final long dport$OFFSET = 10L;

        ipv4() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt saddr$layout() {
            return saddr$LAYOUT;
        }

        public static final long saddr$offset() {
            return 0L;
        }

        public static int saddr(MemorySegment struct) {
            return struct.get(saddr$LAYOUT, 0L);
        }

        public static void saddr(MemorySegment struct, int fieldValue) {
            struct.set(saddr$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt daddr$layout() {
            return daddr$LAYOUT;
        }

        public static final long daddr$offset() {
            return 4L;
        }

        public static int daddr(MemorySegment struct) {
            return struct.get(daddr$LAYOUT, 4L);
        }

        public static void daddr(MemorySegment struct, int fieldValue) {
            struct.set(daddr$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfShort sport$layout() {
            return sport$LAYOUT;
        }

        public static final long sport$offset() {
            return 8L;
        }

        public static short sport(MemorySegment struct) {
            return struct.get(sport$LAYOUT, 8L);
        }

        public static void sport(MemorySegment struct, short fieldValue) {
            struct.set(sport$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfShort dport$layout() {
            return dport$LAYOUT;
        }

        public static final long dport$offset() {
            return 10L;
        }

        public static short dport(MemorySegment struct) {
            return struct.get(dport$LAYOUT, 10L);
        }

        public static void dport(MemorySegment struct, short fieldValue) {
            struct.set(dport$LAYOUT, 10L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(ipv4.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return ipv4.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)ipv4.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ipv4.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return ipv4.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(ipv4.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class ipv6 {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("saddr"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("daddr"), Lib.C_SHORT.withName("sport"), Lib.C_SHORT.withName("dport")}).withName("$anon$6415:3");
        private static final SequenceLayout saddr$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"saddr")});
        private static final long saddr$OFFSET = 0L;
        private static long[] saddr$DIMS = new long[]{4L};
        private static final VarHandle saddr$ELEM_HANDLE = saddr$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final SequenceLayout daddr$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"daddr")});
        private static final long daddr$OFFSET = 16L;
        private static long[] daddr$DIMS = new long[]{4L};
        private static final VarHandle daddr$ELEM_HANDLE = daddr$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final ValueLayout.OfShort sport$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sport")});
        private static final long sport$OFFSET = 32L;
        private static final ValueLayout.OfShort dport$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dport")});
        private static final long dport$OFFSET = 34L;

        ipv6() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final SequenceLayout saddr$layout() {
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

        public static long[] saddr$dimensions() {
            return saddr$DIMS;
        }

        public static int saddr(MemorySegment struct, long index0) {
            return saddr$ELEM_HANDLE.get(struct, 0L, index0);
        }

        public static void saddr(MemorySegment struct, long index0, int fieldValue) {
            saddr$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
        }

        public static final SequenceLayout daddr$layout() {
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

        public static long[] daddr$dimensions() {
            return daddr$DIMS;
        }

        public static int daddr(MemorySegment struct, long index0) {
            return daddr$ELEM_HANDLE.get(struct, 0L, index0);
        }

        public static void daddr(MemorySegment struct, long index0, int fieldValue) {
            daddr$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
        }

        public static final ValueLayout.OfShort sport$layout() {
            return sport$LAYOUT;
        }

        public static final long sport$offset() {
            return 32L;
        }

        public static short sport(MemorySegment struct) {
            return struct.get(sport$LAYOUT, 32L);
        }

        public static void sport(MemorySegment struct, short fieldValue) {
            struct.set(sport$LAYOUT, 32L, fieldValue);
        }

        public static final ValueLayout.OfShort dport$layout() {
            return dport$LAYOUT;
        }

        public static final long dport$offset() {
            return 34L;
        }

        public static short dport(MemorySegment struct) {
            return struct.get(dport$LAYOUT, 34L);
        }

        public static void dport(MemorySegment struct, short fieldValue) {
            struct.set(dport$LAYOUT, 34L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(ipv6.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return ipv6.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)ipv6.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ipv6.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return ipv6.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(ipv6.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

