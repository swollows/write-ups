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

public class iphdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.paddingLayout((long)1L), Lib.C_CHAR.withName("tos"), Lib.C_SHORT.withName("tot_len"), Lib.C_SHORT.withName("id"), Lib.C_SHORT.withName("frag_off"), Lib.C_CHAR.withName("ttl"), Lib.C_CHAR.withName("protocol"), Lib.C_SHORT.withName("check"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("saddr"), Lib.C_INT.withName("daddr")}).withName("$anon$104:2"), addrs.layout().withName("addrs")}).withName("$anon$104:2")}).withName("iphdr");
    private static final ValueLayout.OfByte tos$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tos")});
    private static final long tos$OFFSET = 1L;
    private static final ValueLayout.OfShort tot_len$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tot_len")});
    private static final long tot_len$OFFSET = 2L;
    private static final ValueLayout.OfShort id$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"id")});
    private static final long id$OFFSET = 4L;
    private static final ValueLayout.OfShort frag_off$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"frag_off")});
    private static final long frag_off$OFFSET = 6L;
    private static final ValueLayout.OfByte ttl$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ttl")});
    private static final long ttl$OFFSET = 8L;
    private static final ValueLayout.OfByte protocol$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"protocol")});
    private static final long protocol$OFFSET = 9L;
    private static final ValueLayout.OfShort check$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"check")});
    private static final long check$OFFSET = 10L;
    private static final ValueLayout.OfInt saddr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$104:2"), MemoryLayout.PathElement.groupElement((String)"$anon$104:2"), MemoryLayout.PathElement.groupElement((String)"saddr")});
    private static final long saddr$OFFSET = 12L;
    private static final ValueLayout.OfInt daddr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$104:2"), MemoryLayout.PathElement.groupElement((String)"$anon$104:2"), MemoryLayout.PathElement.groupElement((String)"daddr")});
    private static final long daddr$OFFSET = 16L;
    private static final GroupLayout addrs$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$104:2"), MemoryLayout.PathElement.groupElement((String)"addrs")});
    private static final long addrs$OFFSET = 12L;

    iphdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte tos$layout() {
        return tos$LAYOUT;
    }

    public static final long tos$offset() {
        return 1L;
    }

    public static byte tos(MemorySegment struct) {
        return struct.get(tos$LAYOUT, 1L);
    }

    public static void tos(MemorySegment struct, byte fieldValue) {
        struct.set(tos$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfShort tot_len$layout() {
        return tot_len$LAYOUT;
    }

    public static final long tot_len$offset() {
        return 2L;
    }

    public static short tot_len(MemorySegment struct) {
        return struct.get(tot_len$LAYOUT, 2L);
    }

    public static void tot_len(MemorySegment struct, short fieldValue) {
        struct.set(tot_len$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfShort id$layout() {
        return id$LAYOUT;
    }

    public static final long id$offset() {
        return 4L;
    }

    public static short id(MemorySegment struct) {
        return struct.get(id$LAYOUT, 4L);
    }

    public static void id(MemorySegment struct, short fieldValue) {
        struct.set(id$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfShort frag_off$layout() {
        return frag_off$LAYOUT;
    }

    public static final long frag_off$offset() {
        return 6L;
    }

    public static short frag_off(MemorySegment struct) {
        return struct.get(frag_off$LAYOUT, 6L);
    }

    public static void frag_off(MemorySegment struct, short fieldValue) {
        struct.set(frag_off$LAYOUT, 6L, fieldValue);
    }

    public static final ValueLayout.OfByte ttl$layout() {
        return ttl$LAYOUT;
    }

    public static final long ttl$offset() {
        return 8L;
    }

    public static byte ttl(MemorySegment struct) {
        return struct.get(ttl$LAYOUT, 8L);
    }

    public static void ttl(MemorySegment struct, byte fieldValue) {
        struct.set(ttl$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfByte protocol$layout() {
        return protocol$LAYOUT;
    }

    public static final long protocol$offset() {
        return 9L;
    }

    public static byte protocol(MemorySegment struct) {
        return struct.get(protocol$LAYOUT, 9L);
    }

    public static void protocol(MemorySegment struct, byte fieldValue) {
        struct.set(protocol$LAYOUT, 9L, fieldValue);
    }

    public static final ValueLayout.OfShort check$layout() {
        return check$LAYOUT;
    }

    public static final long check$offset() {
        return 10L;
    }

    public static short check(MemorySegment struct) {
        return struct.get(check$LAYOUT, 10L);
    }

    public static void check(MemorySegment struct, short fieldValue) {
        struct.set(check$LAYOUT, 10L, fieldValue);
    }

    public static final ValueLayout.OfInt saddr$layout() {
        return saddr$LAYOUT;
    }

    public static final long saddr$offset() {
        return 12L;
    }

    public static int saddr(MemorySegment struct) {
        return struct.get(saddr$LAYOUT, 12L);
    }

    public static void saddr(MemorySegment struct, int fieldValue) {
        struct.set(saddr$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt daddr$layout() {
        return daddr$LAYOUT;
    }

    public static final long daddr$offset() {
        return 16L;
    }

    public static int daddr(MemorySegment struct) {
        return struct.get(daddr$LAYOUT, 16L);
    }

    public static void daddr(MemorySegment struct, int fieldValue) {
        struct.set(daddr$LAYOUT, 16L, fieldValue);
    }

    public static final GroupLayout addrs$layout() {
        return addrs$LAYOUT;
    }

    public static final long addrs$offset() {
        return 12L;
    }

    public static MemorySegment addrs(MemorySegment struct) {
        return struct.asSlice(12L, addrs$LAYOUT.byteSize());
    }

    public static void addrs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)12L, (long)addrs$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(iphdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return iphdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)iphdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)iphdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return iphdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(iphdr.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class addrs {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("saddr"), Lib.C_INT.withName("daddr")}).withName("$anon$104:2");
        private static final ValueLayout.OfInt saddr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"saddr")});
        private static final long saddr$OFFSET = 0L;
        private static final ValueLayout.OfInt daddr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"daddr")});
        private static final long daddr$OFFSET = 4L;

        addrs() {
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

