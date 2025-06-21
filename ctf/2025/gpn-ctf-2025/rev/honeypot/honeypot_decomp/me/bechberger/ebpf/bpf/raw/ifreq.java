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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfShort
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
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
import me.bechberger.ebpf.bpf.raw.if_settings;
import me.bechberger.ebpf.bpf.raw.ifmap;
import me.bechberger.ebpf.bpf.raw.sockaddr;

public class ifreq {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{ifr_ifrn.layout().withName("ifr_ifrn"), ifr_ifru.layout().withName("ifr_ifru")}).withName("ifreq");
    private static final GroupLayout ifr_ifrn$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifr_ifrn")});
    private static final long ifr_ifrn$OFFSET = 0L;
    private static final GroupLayout ifr_ifru$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifr_ifru")});
    private static final long ifr_ifru$OFFSET = 16L;

    ifreq() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout ifr_ifrn$layout() {
        return ifr_ifrn$LAYOUT;
    }

    public static final long ifr_ifrn$offset() {
        return 0L;
    }

    public static MemorySegment ifr_ifrn(MemorySegment struct) {
        return struct.asSlice(0L, ifr_ifrn$LAYOUT.byteSize());
    }

    public static void ifr_ifrn(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)ifr_ifrn$LAYOUT.byteSize());
    }

    public static final GroupLayout ifr_ifru$layout() {
        return ifr_ifru$LAYOUT;
    }

    public static final long ifr_ifru$offset() {
        return 16L;
    }

    public static MemorySegment ifr_ifru(MemorySegment struct) {
        return struct.asSlice(16L, ifr_ifru$LAYOUT.byteSize());
    }

    public static void ifr_ifru(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)ifr_ifru$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(ifreq.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return ifreq.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)ifreq.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ifreq.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return ifreq.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(ifreq.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class ifr_ifrn {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("ifrn_name")}).withName("$anon$234:2");
        private static final SequenceLayout ifrn_name$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifrn_name")});
        private static final long ifrn_name$OFFSET = 0L;
        private static long[] ifrn_name$DIMS = new long[]{16L};
        private static final VarHandle ifrn_name$ELEM_HANDLE = ifrn_name$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

        ifr_ifrn() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final SequenceLayout ifrn_name$layout() {
            return ifrn_name$LAYOUT;
        }

        public static final long ifrn_name$offset() {
            return 0L;
        }

        public static MemorySegment ifrn_name(MemorySegment union) {
            return union.asSlice(0L, ifrn_name$LAYOUT.byteSize());
        }

        public static void ifrn_name(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifrn_name$LAYOUT.byteSize());
        }

        public static long[] ifrn_name$dimensions() {
            return ifrn_name$DIMS;
        }

        public static byte ifrn_name(MemorySegment union, long index0) {
            return ifrn_name$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void ifrn_name(MemorySegment union, long index0, byte fieldValue) {
            ifrn_name$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(ifr_ifrn.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return ifr_ifrn.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)ifr_ifrn.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ifr_ifrn.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return ifr_ifrn.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(ifr_ifrn.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class ifr_ifru {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{sockaddr.layout().withName("ifru_addr"), sockaddr.layout().withName("ifru_dstaddr"), sockaddr.layout().withName("ifru_broadaddr"), sockaddr.layout().withName("ifru_netmask"), sockaddr.layout().withName("ifru_hwaddr"), Lib.C_SHORT.withName("ifru_flags"), Lib.C_INT.withName("ifru_ivalue"), Lib.C_INT.withName("ifru_mtu"), ifmap.layout().withName("ifru_map"), MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("ifru_slave"), MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("ifru_newname"), Lib.C_POINTER.withName("ifru_data"), if_settings.layout().withName("ifru_settings")}).withName("$anon$239:2");
        private static final GroupLayout ifru_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_addr")});
        private static final long ifru_addr$OFFSET = 0L;
        private static final GroupLayout ifru_dstaddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_dstaddr")});
        private static final long ifru_dstaddr$OFFSET = 0L;
        private static final GroupLayout ifru_broadaddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_broadaddr")});
        private static final long ifru_broadaddr$OFFSET = 0L;
        private static final GroupLayout ifru_netmask$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_netmask")});
        private static final long ifru_netmask$OFFSET = 0L;
        private static final GroupLayout ifru_hwaddr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_hwaddr")});
        private static final long ifru_hwaddr$OFFSET = 0L;
        private static final ValueLayout.OfShort ifru_flags$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_flags")});
        private static final long ifru_flags$OFFSET = 0L;
        private static final ValueLayout.OfInt ifru_ivalue$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_ivalue")});
        private static final long ifru_ivalue$OFFSET = 0L;
        private static final ValueLayout.OfInt ifru_mtu$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_mtu")});
        private static final long ifru_mtu$OFFSET = 0L;
        private static final GroupLayout ifru_map$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_map")});
        private static final long ifru_map$OFFSET = 0L;
        private static final SequenceLayout ifru_slave$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_slave")});
        private static final long ifru_slave$OFFSET = 0L;
        private static long[] ifru_slave$DIMS = new long[]{16L};
        private static final VarHandle ifru_slave$ELEM_HANDLE = ifru_slave$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final SequenceLayout ifru_newname$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_newname")});
        private static final long ifru_newname$OFFSET = 0L;
        private static long[] ifru_newname$DIMS = new long[]{16L};
        private static final VarHandle ifru_newname$ELEM_HANDLE = ifru_newname$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final AddressLayout ifru_data$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_data")});
        private static final long ifru_data$OFFSET = 0L;
        private static final GroupLayout ifru_settings$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifru_settings")});
        private static final long ifru_settings$OFFSET = 0L;

        ifr_ifru() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final GroupLayout ifru_addr$layout() {
            return ifru_addr$LAYOUT;
        }

        public static final long ifru_addr$offset() {
            return 0L;
        }

        public static MemorySegment ifru_addr(MemorySegment union) {
            return union.asSlice(0L, ifru_addr$LAYOUT.byteSize());
        }

        public static void ifru_addr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_addr$LAYOUT.byteSize());
        }

        public static final GroupLayout ifru_dstaddr$layout() {
            return ifru_dstaddr$LAYOUT;
        }

        public static final long ifru_dstaddr$offset() {
            return 0L;
        }

        public static MemorySegment ifru_dstaddr(MemorySegment union) {
            return union.asSlice(0L, ifru_dstaddr$LAYOUT.byteSize());
        }

        public static void ifru_dstaddr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_dstaddr$LAYOUT.byteSize());
        }

        public static final GroupLayout ifru_broadaddr$layout() {
            return ifru_broadaddr$LAYOUT;
        }

        public static final long ifru_broadaddr$offset() {
            return 0L;
        }

        public static MemorySegment ifru_broadaddr(MemorySegment union) {
            return union.asSlice(0L, ifru_broadaddr$LAYOUT.byteSize());
        }

        public static void ifru_broadaddr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_broadaddr$LAYOUT.byteSize());
        }

        public static final GroupLayout ifru_netmask$layout() {
            return ifru_netmask$LAYOUT;
        }

        public static final long ifru_netmask$offset() {
            return 0L;
        }

        public static MemorySegment ifru_netmask(MemorySegment union) {
            return union.asSlice(0L, ifru_netmask$LAYOUT.byteSize());
        }

        public static void ifru_netmask(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_netmask$LAYOUT.byteSize());
        }

        public static final GroupLayout ifru_hwaddr$layout() {
            return ifru_hwaddr$LAYOUT;
        }

        public static final long ifru_hwaddr$offset() {
            return 0L;
        }

        public static MemorySegment ifru_hwaddr(MemorySegment union) {
            return union.asSlice(0L, ifru_hwaddr$LAYOUT.byteSize());
        }

        public static void ifru_hwaddr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_hwaddr$LAYOUT.byteSize());
        }

        public static final ValueLayout.OfShort ifru_flags$layout() {
            return ifru_flags$LAYOUT;
        }

        public static final long ifru_flags$offset() {
            return 0L;
        }

        public static short ifru_flags(MemorySegment union) {
            return union.get(ifru_flags$LAYOUT, 0L);
        }

        public static void ifru_flags(MemorySegment union, short fieldValue) {
            union.set(ifru_flags$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt ifru_ivalue$layout() {
            return ifru_ivalue$LAYOUT;
        }

        public static final long ifru_ivalue$offset() {
            return 0L;
        }

        public static int ifru_ivalue(MemorySegment union) {
            return union.get(ifru_ivalue$LAYOUT, 0L);
        }

        public static void ifru_ivalue(MemorySegment union, int fieldValue) {
            union.set(ifru_ivalue$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt ifru_mtu$layout() {
            return ifru_mtu$LAYOUT;
        }

        public static final long ifru_mtu$offset() {
            return 0L;
        }

        public static int ifru_mtu(MemorySegment union) {
            return union.get(ifru_mtu$LAYOUT, 0L);
        }

        public static void ifru_mtu(MemorySegment union, int fieldValue) {
            union.set(ifru_mtu$LAYOUT, 0L, fieldValue);
        }

        public static final GroupLayout ifru_map$layout() {
            return ifru_map$LAYOUT;
        }

        public static final long ifru_map$offset() {
            return 0L;
        }

        public static MemorySegment ifru_map(MemorySegment union) {
            return union.asSlice(0L, ifru_map$LAYOUT.byteSize());
        }

        public static void ifru_map(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_map$LAYOUT.byteSize());
        }

        public static final SequenceLayout ifru_slave$layout() {
            return ifru_slave$LAYOUT;
        }

        public static final long ifru_slave$offset() {
            return 0L;
        }

        public static MemorySegment ifru_slave(MemorySegment union) {
            return union.asSlice(0L, ifru_slave$LAYOUT.byteSize());
        }

        public static void ifru_slave(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_slave$LAYOUT.byteSize());
        }

        public static long[] ifru_slave$dimensions() {
            return ifru_slave$DIMS;
        }

        public static byte ifru_slave(MemorySegment union, long index0) {
            return ifru_slave$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void ifru_slave(MemorySegment union, long index0, byte fieldValue) {
            ifru_slave$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static final SequenceLayout ifru_newname$layout() {
            return ifru_newname$LAYOUT;
        }

        public static final long ifru_newname$offset() {
            return 0L;
        }

        public static MemorySegment ifru_newname(MemorySegment union) {
            return union.asSlice(0L, ifru_newname$LAYOUT.byteSize());
        }

        public static void ifru_newname(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_newname$LAYOUT.byteSize());
        }

        public static long[] ifru_newname$dimensions() {
            return ifru_newname$DIMS;
        }

        public static byte ifru_newname(MemorySegment union, long index0) {
            return ifru_newname$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void ifru_newname(MemorySegment union, long index0, byte fieldValue) {
            ifru_newname$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static final AddressLayout ifru_data$layout() {
            return ifru_data$LAYOUT;
        }

        public static final long ifru_data$offset() {
            return 0L;
        }

        public static MemorySegment ifru_data(MemorySegment union) {
            return union.get(ifru_data$LAYOUT, 0L);
        }

        public static void ifru_data(MemorySegment union, MemorySegment fieldValue) {
            union.set(ifru_data$LAYOUT, 0L, fieldValue);
        }

        public static final GroupLayout ifru_settings$layout() {
            return ifru_settings$LAYOUT;
        }

        public static final long ifru_settings$offset() {
            return 0L;
        }

        public static MemorySegment ifru_settings(MemorySegment union) {
            return union.asSlice(0L, ifru_settings$LAYOUT.byteSize());
        }

        public static void ifru_settings(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ifru_settings$LAYOUT.byteSize());
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(ifr_ifru.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return ifr_ifru.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)ifr_ifru.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ifr_ifru.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return ifr_ifru.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(ifr_ifru.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

