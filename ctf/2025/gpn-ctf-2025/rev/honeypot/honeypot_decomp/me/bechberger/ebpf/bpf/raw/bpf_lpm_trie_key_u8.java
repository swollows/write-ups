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
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.bpf_lpm_trie_key_hdr;

public class bpf_lpm_trie_key_u8 {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{bpf_lpm_trie_key_hdr.layout().withName("hdr"), Lib.C_INT.withName("prefixlen")}).withName("$anon$101:2"), MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)Lib.C_CHAR).withName("data")}).withName("bpf_lpm_trie_key_u8");
    private static final GroupLayout hdr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$101:2"), MemoryLayout.PathElement.groupElement((String)"hdr")});
    private static final long hdr$OFFSET = 0L;
    private static final ValueLayout.OfInt prefixlen$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$101:2"), MemoryLayout.PathElement.groupElement((String)"prefixlen")});
    private static final long prefixlen$OFFSET = 0L;
    private static final SequenceLayout data$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data")});
    private static final long data$OFFSET = 4L;

    bpf_lpm_trie_key_u8() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout hdr$layout() {
        return hdr$LAYOUT;
    }

    public static final long hdr$offset() {
        return 0L;
    }

    public static MemorySegment hdr(MemorySegment struct) {
        return struct.asSlice(0L, hdr$LAYOUT.byteSize());
    }

    public static void hdr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)hdr$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt prefixlen$layout() {
        return prefixlen$LAYOUT;
    }

    public static final long prefixlen$offset() {
        return 0L;
    }

    public static int prefixlen(MemorySegment struct) {
        return struct.get(prefixlen$LAYOUT, 0L);
    }

    public static void prefixlen(MemorySegment struct, int fieldValue) {
        struct.set(prefixlen$LAYOUT, 0L, fieldValue);
    }

    public static final SequenceLayout data$layout() {
        return data$LAYOUT;
    }

    public static final long data$offset() {
        return 4L;
    }

    public static MemorySegment data(MemorySegment struct) {
        return struct.asSlice(4L, data$LAYOUT.byteSize());
    }

    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)data$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_lpm_trie_key_u8.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_lpm_trie_key_u8.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_lpm_trie_key_u8.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_lpm_trie_key_u8.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_lpm_trie_key_u8.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_lpm_trie_key_u8.layout().byteSize() * elementCount, arena, cleanup);
    }
}

