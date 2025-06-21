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
 *  java.lang.foreign.ValueLayout$OfInt
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class if_settings {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("type"), Lib.C_INT.withName("size"), ifs_ifsu.layout().withName("ifs_ifsu")}).withName("if_settings");
    private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 0L;
    private static final ValueLayout.OfInt size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"size")});
    private static final long size$OFFSET = 4L;
    private static final GroupLayout ifs_ifsu$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifs_ifsu")});
    private static final long ifs_ifsu$OFFSET = 8L;

    if_settings() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 0L;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 0L);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt size$layout() {
        return size$LAYOUT;
    }

    public static final long size$offset() {
        return 4L;
    }

    public static int size(MemorySegment struct) {
        return struct.get(size$LAYOUT, 4L);
    }

    public static void size(MemorySegment struct, int fieldValue) {
        struct.set(size$LAYOUT, 4L, fieldValue);
    }

    public static final GroupLayout ifs_ifsu$layout() {
        return ifs_ifsu$LAYOUT;
    }

    public static final long ifs_ifsu$offset() {
        return 8L;
    }

    public static MemorySegment ifs_ifsu(MemorySegment struct) {
        return struct.asSlice(8L, ifs_ifsu$LAYOUT.byteSize());
    }

    public static void ifs_ifsu(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)ifs_ifsu$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(if_settings.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return if_settings.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)if_settings.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)if_settings.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return if_settings.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(if_settings.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class ifs_ifsu {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("raw_hdlc"), Lib.C_POINTER.withName("cisco"), Lib.C_POINTER.withName("fr"), Lib.C_POINTER.withName("fr_pvc"), Lib.C_POINTER.withName("fr_pvc_info"), Lib.C_POINTER.withName("x25"), Lib.C_POINTER.withName("sync"), Lib.C_POINTER.withName("te1")}).withName("$anon$208:2");
        private static final AddressLayout raw_hdlc$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"raw_hdlc")});
        private static final long raw_hdlc$OFFSET = 0L;
        private static final AddressLayout cisco$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cisco")});
        private static final long cisco$OFFSET = 0L;
        private static final AddressLayout fr$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"fr")});
        private static final long fr$OFFSET = 0L;
        private static final AddressLayout fr_pvc$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"fr_pvc")});
        private static final long fr_pvc$OFFSET = 0L;
        private static final AddressLayout fr_pvc_info$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"fr_pvc_info")});
        private static final long fr_pvc_info$OFFSET = 0L;
        private static final AddressLayout x25$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"x25")});
        private static final long x25$OFFSET = 0L;
        private static final AddressLayout sync$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sync")});
        private static final long sync$OFFSET = 0L;
        private static final AddressLayout te1$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"te1")});
        private static final long te1$OFFSET = 0L;

        ifs_ifsu() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final AddressLayout raw_hdlc$layout() {
            return raw_hdlc$LAYOUT;
        }

        public static final long raw_hdlc$offset() {
            return 0L;
        }

        public static MemorySegment raw_hdlc(MemorySegment union) {
            return union.get(raw_hdlc$LAYOUT, 0L);
        }

        public static void raw_hdlc(MemorySegment union, MemorySegment fieldValue) {
            union.set(raw_hdlc$LAYOUT, 0L, fieldValue);
        }

        public static final AddressLayout cisco$layout() {
            return cisco$LAYOUT;
        }

        public static final long cisco$offset() {
            return 0L;
        }

        public static MemorySegment cisco(MemorySegment union) {
            return union.get(cisco$LAYOUT, 0L);
        }

        public static void cisco(MemorySegment union, MemorySegment fieldValue) {
            union.set(cisco$LAYOUT, 0L, fieldValue);
        }

        public static final AddressLayout fr$layout() {
            return fr$LAYOUT;
        }

        public static final long fr$offset() {
            return 0L;
        }

        public static MemorySegment fr(MemorySegment union) {
            return union.get(fr$LAYOUT, 0L);
        }

        public static void fr(MemorySegment union, MemorySegment fieldValue) {
            union.set(fr$LAYOUT, 0L, fieldValue);
        }

        public static final AddressLayout fr_pvc$layout() {
            return fr_pvc$LAYOUT;
        }

        public static final long fr_pvc$offset() {
            return 0L;
        }

        public static MemorySegment fr_pvc(MemorySegment union) {
            return union.get(fr_pvc$LAYOUT, 0L);
        }

        public static void fr_pvc(MemorySegment union, MemorySegment fieldValue) {
            union.set(fr_pvc$LAYOUT, 0L, fieldValue);
        }

        public static final AddressLayout fr_pvc_info$layout() {
            return fr_pvc_info$LAYOUT;
        }

        public static final long fr_pvc_info$offset() {
            return 0L;
        }

        public static MemorySegment fr_pvc_info(MemorySegment union) {
            return union.get(fr_pvc_info$LAYOUT, 0L);
        }

        public static void fr_pvc_info(MemorySegment union, MemorySegment fieldValue) {
            union.set(fr_pvc_info$LAYOUT, 0L, fieldValue);
        }

        public static final AddressLayout x25$layout() {
            return x25$LAYOUT;
        }

        public static final long x25$offset() {
            return 0L;
        }

        public static MemorySegment x25(MemorySegment union) {
            return union.get(x25$LAYOUT, 0L);
        }

        public static void x25(MemorySegment union, MemorySegment fieldValue) {
            union.set(x25$LAYOUT, 0L, fieldValue);
        }

        public static final AddressLayout sync$layout() {
            return sync$LAYOUT;
        }

        public static final long sync$offset() {
            return 0L;
        }

        public static MemorySegment sync(MemorySegment union) {
            return union.get(sync$LAYOUT, 0L);
        }

        public static void sync(MemorySegment union, MemorySegment fieldValue) {
            union.set(sync$LAYOUT, 0L, fieldValue);
        }

        public static final AddressLayout te1$layout() {
            return te1$LAYOUT;
        }

        public static final long te1$offset() {
            return 0L;
        }

        public static MemorySegment te1(MemorySegment union) {
            return union.get(te1$LAYOUT, 0L);
        }

        public static void te1(MemorySegment union, MemorySegment fieldValue) {
            union.set(te1$LAYOUT, 0L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(ifs_ifsu.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return ifs_ifsu.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)ifs_ifsu.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ifs_ifsu.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return ifs_ifsu.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(ifs_ifsu.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

