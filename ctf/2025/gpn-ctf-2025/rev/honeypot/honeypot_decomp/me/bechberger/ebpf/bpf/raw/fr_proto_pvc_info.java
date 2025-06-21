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

public class fr_proto_pvc_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("dlci"), MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("master")}).withName("$anon$72:9");
    private static final ValueLayout.OfInt dlci$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dlci")});
    private static final long dlci$OFFSET = 0L;
    private static final SequenceLayout master$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"master")});
    private static final long master$OFFSET = 4L;
    private static long[] master$DIMS = new long[]{16L};
    private static final VarHandle master$ELEM_HANDLE = master$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    fr_proto_pvc_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt dlci$layout() {
        return dlci$LAYOUT;
    }

    public static final long dlci$offset() {
        return 0L;
    }

    public static int dlci(MemorySegment struct) {
        return struct.get(dlci$LAYOUT, 0L);
    }

    public static void dlci(MemorySegment struct, int fieldValue) {
        struct.set(dlci$LAYOUT, 0L, fieldValue);
    }

    public static final SequenceLayout master$layout() {
        return master$LAYOUT;
    }

    public static final long master$offset() {
        return 4L;
    }

    public static MemorySegment master(MemorySegment struct) {
        return struct.asSlice(4L, master$LAYOUT.byteSize());
    }

    public static void master(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)master$LAYOUT.byteSize());
    }

    public static long[] master$dimensions() {
        return master$DIMS;
    }

    public static byte master(MemorySegment struct, long index0) {
        return master$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void master(MemorySegment struct, long index0, byte fieldValue) {
        master$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(fr_proto_pvc_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return fr_proto_pvc_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)fr_proto_pvc_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)fr_proto_pvc_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return fr_proto_pvc_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(fr_proto_pvc_info.layout().byteSize() * elementCount, arena, cleanup);
    }
}

