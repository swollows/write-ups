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
import me.bechberger.ebpf.bpf.raw.icmp_ext_echo_ctype3_hdr;
import me.bechberger.ebpf.bpf.raw.icmp_extobj_hdr;
import me.bechberger.ebpf.bpf.raw.in6_addr;

public class icmp_ext_echo_iio {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{icmp_extobj_hdr.layout().withName("extobj_hdr"), ident.layout().withName("ident")}).withName("icmp_ext_echo_iio");
    private static final GroupLayout extobj_hdr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"extobj_hdr")});
    private static final long extobj_hdr$OFFSET = 0L;
    private static final GroupLayout ident$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ident")});
    private static final long ident$OFFSET = 4L;

    icmp_ext_echo_iio() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final GroupLayout extobj_hdr$layout() {
        return extobj_hdr$LAYOUT;
    }

    public static final long extobj_hdr$offset() {
        return 0L;
    }

    public static MemorySegment extobj_hdr(MemorySegment struct) {
        return struct.asSlice(0L, extobj_hdr$LAYOUT.byteSize());
    }

    public static void extobj_hdr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)extobj_hdr$LAYOUT.byteSize());
    }

    public static final GroupLayout ident$layout() {
        return ident$LAYOUT;
    }

    public static final long ident$offset() {
        return 4L;
    }

    public static MemorySegment ident(MemorySegment struct) {
        return struct.asSlice(4L, ident$LAYOUT.byteSize());
    }

    public static void ident(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)ident$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(icmp_ext_echo_iio.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return icmp_ext_echo_iio.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)icmp_ext_echo_iio.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmp_ext_echo_iio.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return icmp_ext_echo_iio.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(icmp_ext_echo_iio.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class ident {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("name"), Lib.C_INT.withName("ifindex"), addr.layout().withName("addr")}).withName("$anon$150:2");
        private static final SequenceLayout name$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name")});
        private static final long name$OFFSET = 0L;
        private static long[] name$DIMS = new long[]{16L};
        private static final VarHandle name$ELEM_HANDLE = name$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
        private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
        private static final long ifindex$OFFSET = 0L;
        private static final GroupLayout addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addr")});
        private static final long addr$OFFSET = 0L;

        ident() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final SequenceLayout name$layout() {
            return name$LAYOUT;
        }

        public static final long name$offset() {
            return 0L;
        }

        public static MemorySegment name(MemorySegment union) {
            return union.asSlice(0L, name$LAYOUT.byteSize());
        }

        public static void name(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)name$LAYOUT.byteSize());
        }

        public static long[] name$dimensions() {
            return name$DIMS;
        }

        public static byte name(MemorySegment union, long index0) {
            return name$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void name(MemorySegment union, long index0, byte fieldValue) {
            name$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static final ValueLayout.OfInt ifindex$layout() {
            return ifindex$LAYOUT;
        }

        public static final long ifindex$offset() {
            return 0L;
        }

        public static int ifindex(MemorySegment union) {
            return union.get(ifindex$LAYOUT, 0L);
        }

        public static void ifindex(MemorySegment union, int fieldValue) {
            union.set(ifindex$LAYOUT, 0L, fieldValue);
        }

        public static final GroupLayout addr$layout() {
            return addr$LAYOUT;
        }

        public static final long addr$offset() {
            return 0L;
        }

        public static MemorySegment addr(MemorySegment union) {
            return union.asSlice(0L, addr$LAYOUT.byteSize());
        }

        public static void addr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)addr$LAYOUT.byteSize());
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(ident.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return ident.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)ident.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ident.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return ident.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(ident.layout().byteSize() * elementCount, arena, cleanup);
        }

        public static class addr {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{icmp_ext_echo_ctype3_hdr.layout().withName("ctype3_hdr"), ip_addr.layout().withName("ip_addr")}).withName("$anon$153:3");
            private static final GroupLayout ctype3_hdr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctype3_hdr")});
            private static final long ctype3_hdr$OFFSET = 0L;
            private static final GroupLayout ip_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ip_addr")});
            private static final long ip_addr$OFFSET = 4L;

            addr() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final GroupLayout ctype3_hdr$layout() {
                return ctype3_hdr$LAYOUT;
            }

            public static final long ctype3_hdr$offset() {
                return 0L;
            }

            public static MemorySegment ctype3_hdr(MemorySegment struct) {
                return struct.asSlice(0L, ctype3_hdr$LAYOUT.byteSize());
            }

            public static void ctype3_hdr(MemorySegment struct, MemorySegment fieldValue) {
                MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)0L, (long)ctype3_hdr$LAYOUT.byteSize());
            }

            public static final GroupLayout ip_addr$layout() {
                return ip_addr$LAYOUT;
            }

            public static final long ip_addr$offset() {
                return 4L;
            }

            public static MemorySegment ip_addr(MemorySegment struct) {
                return struct.asSlice(4L, ip_addr$LAYOUT.byteSize());
            }

            public static void ip_addr(MemorySegment struct, MemorySegment fieldValue) {
                MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)ip_addr$LAYOUT.byteSize());
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(addr.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return addr.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)addr.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)addr.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(addr.layout().byteSize() * elementCount, arena, cleanup);
            }

            public static class ip_addr {
                private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("ipv4_addr"), in6_addr.layout().withName("ipv6_addr")}).withName("$anon$155:4");
                private static final ValueLayout.OfInt ipv4_addr$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipv4_addr")});
                private static final long ipv4_addr$OFFSET = 0L;
                private static final GroupLayout ipv6_addr$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ipv6_addr")});
                private static final long ipv6_addr$OFFSET = 0L;

                ip_addr() {
                }

                public static final GroupLayout layout() {
                    return $LAYOUT;
                }

                public static final ValueLayout.OfInt ipv4_addr$layout() {
                    return ipv4_addr$LAYOUT;
                }

                public static final long ipv4_addr$offset() {
                    return 0L;
                }

                public static int ipv4_addr(MemorySegment union) {
                    return union.get(ipv4_addr$LAYOUT, 0L);
                }

                public static void ipv4_addr(MemorySegment union, int fieldValue) {
                    union.set(ipv4_addr$LAYOUT, 0L, fieldValue);
                }

                public static final GroupLayout ipv6_addr$layout() {
                    return ipv6_addr$LAYOUT;
                }

                public static final long ipv6_addr$offset() {
                    return 0L;
                }

                public static MemorySegment ipv6_addr(MemorySegment union) {
                    return union.asSlice(0L, ipv6_addr$LAYOUT.byteSize());
                }

                public static void ipv6_addr(MemorySegment union, MemorySegment fieldValue) {
                    MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)ipv6_addr$LAYOUT.byteSize());
                }

                public static MemorySegment asSlice(MemorySegment array, long index2) {
                    return array.asSlice(ip_addr.layout().byteSize() * index2);
                }

                public static long sizeof() {
                    return ip_addr.layout().byteSize();
                }

                public static MemorySegment allocate(SegmentAllocator allocator) {
                    return allocator.allocate((MemoryLayout)ip_addr.layout());
                }

                public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                    return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)ip_addr.layout()));
                }

                public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                    return ip_addr.reinterpret(addr2, 1L, arena, cleanup);
                }

                public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                    return addr2.reinterpret(ip_addr.layout().byteSize() * elementCount, arena, cleanup);
                }
            }
        }
    }
}

