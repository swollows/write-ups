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

public class icmp6hdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("icmp6_type"), Lib.C_CHAR.withName("icmp6_code"), Lib.C_SHORT.withName("icmp6_cksum"), icmp6_dataun.layout().withName("icmp6_dataun")}).withName("icmp6hdr");
    private static final ValueLayout.OfByte icmp6_type$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"icmp6_type")});
    private static final long icmp6_type$OFFSET = 0L;
    private static final ValueLayout.OfByte icmp6_code$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"icmp6_code")});
    private static final long icmp6_code$OFFSET = 1L;
    private static final ValueLayout.OfShort icmp6_cksum$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"icmp6_cksum")});
    private static final long icmp6_cksum$OFFSET = 2L;
    private static final GroupLayout icmp6_dataun$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"icmp6_dataun")});
    private static final long icmp6_dataun$OFFSET = 4L;

    icmp6hdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte icmp6_type$layout() {
        return icmp6_type$LAYOUT;
    }

    public static final long icmp6_type$offset() {
        return 0L;
    }

    public static byte icmp6_type(MemorySegment struct) {
        return struct.get(icmp6_type$LAYOUT, 0L);
    }

    public static void icmp6_type(MemorySegment struct, byte fieldValue) {
        struct.set(icmp6_type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte icmp6_code$layout() {
        return icmp6_code$LAYOUT;
    }

    public static final long icmp6_code$offset() {
        return 1L;
    }

    public static byte icmp6_code(MemorySegment struct) {
        return struct.get(icmp6_code$LAYOUT, 1L);
    }

    public static void icmp6_code(MemorySegment struct, byte fieldValue) {
        struct.set(icmp6_code$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfShort icmp6_cksum$layout() {
        return icmp6_cksum$LAYOUT;
    }

    public static final long icmp6_cksum$offset() {
        return 2L;
    }

    public static short icmp6_cksum(MemorySegment struct) {
        return struct.get(icmp6_cksum$LAYOUT, 2L);
    }

    public static void icmp6_cksum(MemorySegment struct, short fieldValue) {
        struct.set(icmp6_cksum$LAYOUT, 2L, fieldValue);
    }

    public static final GroupLayout icmp6_dataun$layout() {
        return icmp6_dataun$LAYOUT;
    }

    public static final long icmp6_dataun$offset() {
        return 4L;
    }

    public static MemorySegment icmp6_dataun(MemorySegment struct) {
        return struct.asSlice(4L, icmp6_dataun$LAYOUT.byteSize());
    }

    public static void icmp6_dataun(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)icmp6_dataun$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(icmp6hdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return icmp6hdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)icmp6hdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmp6hdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return icmp6hdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(icmp6hdr.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class icmp6_dataun {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)1L, (MemoryLayout)Lib.C_INT).withName("un_data32"), MemoryLayout.sequenceLayout((long)2L, (MemoryLayout)Lib.C_SHORT).withName("un_data16"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_CHAR).withName("un_data8"), icmpv6_echo.layout().withName("u_echo"), icmpv6_nd_advt.layout().withName("u_nd_advt"), icmpv6_nd_ra.layout().withName("u_nd_ra")}).withName("$anon$15:2");
        private static final SequenceLayout un_data32$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"un_data32")});
        private static final long un_data32$OFFSET = 0L;
        private static long[] un_data32$DIMS = new long[]{1L};
        private static final VarHandle un_data32$ELEM_HANDLE = un_data32$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final SequenceLayout un_data16$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"un_data16")});
        private static final long un_data16$OFFSET = 0L;
        private static long[] un_data16$DIMS = new long[]{2L};
        private static final VarHandle un_data16$ELEM_HANDLE = un_data16$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final SequenceLayout un_data8$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"un_data8")});
        private static final long un_data8$OFFSET = 0L;
        private static long[] un_data8$DIMS = new long[]{4L};
        private static final VarHandle un_data8$ELEM_HANDLE = un_data8$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final GroupLayout u_echo$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"u_echo")});
        private static final long u_echo$OFFSET = 0L;
        private static final GroupLayout u_nd_advt$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"u_nd_advt")});
        private static final long u_nd_advt$OFFSET = 0L;
        private static final GroupLayout u_nd_ra$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"u_nd_ra")});
        private static final long u_nd_ra$OFFSET = 0L;

        icmp6_dataun() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final SequenceLayout un_data32$layout() {
            return un_data32$LAYOUT;
        }

        public static final long un_data32$offset() {
            return 0L;
        }

        public static MemorySegment un_data32(MemorySegment union) {
            return union.asSlice(0L, un_data32$LAYOUT.byteSize());
        }

        public static void un_data32(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)un_data32$LAYOUT.byteSize());
        }

        public static long[] un_data32$dimensions() {
            return un_data32$DIMS;
        }

        public static int un_data32(MemorySegment union, long index0) {
            return un_data32$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void un_data32(MemorySegment union, long index0, int fieldValue) {
            un_data32$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static final SequenceLayout un_data16$layout() {
            return un_data16$LAYOUT;
        }

        public static final long un_data16$offset() {
            return 0L;
        }

        public static MemorySegment un_data16(MemorySegment union) {
            return union.asSlice(0L, un_data16$LAYOUT.byteSize());
        }

        public static void un_data16(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)un_data16$LAYOUT.byteSize());
        }

        public static long[] un_data16$dimensions() {
            return un_data16$DIMS;
        }

        public static short un_data16(MemorySegment union, long index0) {
            return un_data16$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void un_data16(MemorySegment union, long index0, short fieldValue) {
            un_data16$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static final SequenceLayout un_data8$layout() {
            return un_data8$LAYOUT;
        }

        public static final long un_data8$offset() {
            return 0L;
        }

        public static MemorySegment un_data8(MemorySegment union) {
            return union.asSlice(0L, un_data8$LAYOUT.byteSize());
        }

        public static void un_data8(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)un_data8$LAYOUT.byteSize());
        }

        public static long[] un_data8$dimensions() {
            return un_data8$DIMS;
        }

        public static byte un_data8(MemorySegment union, long index0) {
            return un_data8$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void un_data8(MemorySegment union, long index0, byte fieldValue) {
            un_data8$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static final GroupLayout u_echo$layout() {
            return u_echo$LAYOUT;
        }

        public static final long u_echo$offset() {
            return 0L;
        }

        public static MemorySegment u_echo(MemorySegment union) {
            return union.asSlice(0L, u_echo$LAYOUT.byteSize());
        }

        public static void u_echo(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)u_echo$LAYOUT.byteSize());
        }

        public static final GroupLayout u_nd_advt$layout() {
            return u_nd_advt$LAYOUT;
        }

        public static final long u_nd_advt$offset() {
            return 0L;
        }

        public static MemorySegment u_nd_advt(MemorySegment union) {
            return union.asSlice(0L, u_nd_advt$LAYOUT.byteSize());
        }

        public static void u_nd_advt(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)u_nd_advt$LAYOUT.byteSize());
        }

        public static final GroupLayout u_nd_ra$layout() {
            return u_nd_ra$LAYOUT;
        }

        public static final long u_nd_ra$offset() {
            return 0L;
        }

        public static MemorySegment u_nd_ra(MemorySegment union) {
            return union.asSlice(0L, u_nd_ra$LAYOUT.byteSize());
        }

        public static void u_nd_ra(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)u_nd_ra$LAYOUT.byteSize());
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(icmp6_dataun.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return icmp6_dataun.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)icmp6_dataun.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmp6_dataun.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return icmp6_dataun.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(icmp6_dataun.layout().byteSize() * elementCount, arena, cleanup);
        }

        public static class icmpv6_echo {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("identifier"), Lib.C_SHORT.withName("sequence")}).withName("icmpv6_echo");
            private static final ValueLayout.OfShort identifier$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"identifier")});
            private static final long identifier$OFFSET = 0L;
            private static final ValueLayout.OfShort sequence$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sequence")});
            private static final long sequence$OFFSET = 2L;

            icmpv6_echo() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfShort identifier$layout() {
                return identifier$LAYOUT;
            }

            public static final long identifier$offset() {
                return 0L;
            }

            public static short identifier(MemorySegment struct) {
                return struct.get(identifier$LAYOUT, 0L);
            }

            public static void identifier(MemorySegment struct, short fieldValue) {
                struct.set(identifier$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfShort sequence$layout() {
                return sequence$LAYOUT;
            }

            public static final long sequence$offset() {
                return 2L;
            }

            public static short sequence(MemorySegment struct) {
                return struct.get(sequence$LAYOUT, 2L);
            }

            public static void sequence(MemorySegment struct, short fieldValue) {
                struct.set(sequence$LAYOUT, 2L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(icmpv6_echo.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return icmpv6_echo.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)icmpv6_echo.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmpv6_echo.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return icmpv6_echo.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(icmpv6_echo.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class icmpv6_nd_advt {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.paddingLayout((long)4L)}).withName("icmpv6_nd_advt");

            icmpv6_nd_advt() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(icmpv6_nd_advt.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return icmpv6_nd_advt.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)icmpv6_nd_advt.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmpv6_nd_advt.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return icmpv6_nd_advt.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(icmpv6_nd_advt.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class icmpv6_nd_ra {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("hop_limit"), MemoryLayout.paddingLayout((long)1L), Lib.C_SHORT.withName("rt_lifetime")}).withName("icmpv6_nd_ra");
            private static final ValueLayout.OfByte hop_limit$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hop_limit")});
            private static final long hop_limit$OFFSET = 0L;
            private static final ValueLayout.OfShort rt_lifetime$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rt_lifetime")});
            private static final long rt_lifetime$OFFSET = 2L;

            icmpv6_nd_ra() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfByte hop_limit$layout() {
                return hop_limit$LAYOUT;
            }

            public static final long hop_limit$offset() {
                return 0L;
            }

            public static byte hop_limit(MemorySegment struct) {
                return struct.get(hop_limit$LAYOUT, 0L);
            }

            public static void hop_limit(MemorySegment struct, byte fieldValue) {
                struct.set(hop_limit$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfShort rt_lifetime$layout() {
                return rt_lifetime$LAYOUT;
            }

            public static final long rt_lifetime$offset() {
                return 2L;
            }

            public static short rt_lifetime(MemorySegment struct) {
                return struct.get(rt_lifetime$LAYOUT, 2L);
            }

            public static void rt_lifetime(MemorySegment struct, short fieldValue) {
                struct.set(rt_lifetime$LAYOUT, 2L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(icmpv6_nd_ra.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return icmpv6_nd_ra.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)icmpv6_nd_ra.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmpv6_nd_ra.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return icmpv6_nd_ra.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(icmpv6_nd_ra.layout().byteSize() * elementCount, arena, cleanup);
            }
        }
    }
}

