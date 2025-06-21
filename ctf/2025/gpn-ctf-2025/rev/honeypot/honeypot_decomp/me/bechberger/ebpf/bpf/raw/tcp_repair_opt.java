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

public class tcp_repair_opt {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("opt_code"), Lib.C_INT.withName("opt_val")}).withName("tcp_repair_opt");
    private static final ValueLayout.OfInt opt_code$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"opt_code")});
    private static final long opt_code$OFFSET = 0L;
    private static final ValueLayout.OfInt opt_val$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"opt_val")});
    private static final long opt_val$OFFSET = 4L;

    tcp_repair_opt() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt opt_code$layout() {
        return opt_code$LAYOUT;
    }

    public static final long opt_code$offset() {
        return 0L;
    }

    public static int opt_code(MemorySegment struct) {
        return struct.get(opt_code$LAYOUT, 0L);
    }

    public static void opt_code(MemorySegment struct, int fieldValue) {
        struct.set(opt_code$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt opt_val$layout() {
        return opt_val$LAYOUT;
    }

    public static final long opt_val$offset() {
        return 4L;
    }

    public static int opt_val(MemorySegment struct) {
        return struct.get(opt_val$LAYOUT, 4L);
    }

    public static void opt_val(MemorySegment struct, int fieldValue) {
        struct.set(opt_val$LAYOUT, 4L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_repair_opt.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_repair_opt.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_repair_opt.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_repair_opt.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_repair_opt.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_repair_opt.layout().byteSize() * elementCount, arena, cleanup);
    }
}

