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

public class icmphdr {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("type"), Lib.C_CHAR.withName("code"), Lib.C_SHORT.withName("checksum"), un.layout().withName("un")}).withName("icmphdr");
    private static final ValueLayout.OfByte type$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 0L;
    private static final ValueLayout.OfByte code$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"code")});
    private static final long code$OFFSET = 1L;
    private static final ValueLayout.OfShort checksum$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"checksum")});
    private static final long checksum$OFFSET = 2L;
    private static final GroupLayout un$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"un")});
    private static final long un$OFFSET = 4L;

    icmphdr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 0L;
    }

    public static byte type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 0L);
    }

    public static void type(MemorySegment struct, byte fieldValue) {
        struct.set(type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte code$layout() {
        return code$LAYOUT;
    }

    public static final long code$offset() {
        return 1L;
    }

    public static byte code(MemorySegment struct) {
        return struct.get(code$LAYOUT, 1L);
    }

    public static void code(MemorySegment struct, byte fieldValue) {
        struct.set(code$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfShort checksum$layout() {
        return checksum$LAYOUT;
    }

    public static final long checksum$offset() {
        return 2L;
    }

    public static short checksum(MemorySegment struct) {
        return struct.get(checksum$LAYOUT, 2L);
    }

    public static void checksum(MemorySegment struct, short fieldValue) {
        struct.set(checksum$LAYOUT, 2L, fieldValue);
    }

    public static final GroupLayout un$layout() {
        return un$LAYOUT;
    }

    public static final long un$offset() {
        return 4L;
    }

    public static MemorySegment un(MemorySegment struct) {
        return struct.asSlice(4L, un$LAYOUT.byteSize());
    }

    public static void un(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)un$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(icmphdr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return icmphdr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)icmphdr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)icmphdr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return icmphdr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(icmphdr.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class un {
        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{echo.layout().withName("echo"), Lib.C_INT.withName("gateway"), frag.layout().withName("frag"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_CHAR).withName("reserved")}).withName("$anon$93:3");
        private static final GroupLayout echo$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"echo")});
        private static final long echo$OFFSET = 0L;
        private static final ValueLayout.OfInt gateway$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"gateway")});
        private static final long gateway$OFFSET = 0L;
        private static final GroupLayout frag$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"frag")});
        private static final long frag$OFFSET = 0L;
        private static final SequenceLayout reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"reserved")});
        private static final long reserved$OFFSET = 0L;
        private static long[] reserved$DIMS = new long[]{4L};
        private static final VarHandle reserved$ELEM_HANDLE = reserved$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

        un() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final GroupLayout echo$layout() {
            return echo$LAYOUT;
        }

        public static final long echo$offset() {
            return 0L;
        }

        public static MemorySegment echo(MemorySegment union) {
            return union.asSlice(0L, echo$LAYOUT.byteSize());
        }

        public static void echo(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)echo$LAYOUT.byteSize());
        }

        public static final ValueLayout.OfInt gateway$layout() {
            return gateway$LAYOUT;
        }

        public static final long gateway$offset() {
            return 0L;
        }

        public static int gateway(MemorySegment union) {
            return union.get(gateway$LAYOUT, 0L);
        }

        public static void gateway(MemorySegment union, int fieldValue) {
            union.set(gateway$LAYOUT, 0L, fieldValue);
        }

        public static final GroupLayout frag$layout() {
            return frag$LAYOUT;
        }

        public static final long frag$offset() {
            return 0L;
        }

        public static MemorySegment frag(MemorySegment union) {
            return union.asSlice(0L, frag$LAYOUT.byteSize());
        }

        public static void frag(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)frag$LAYOUT.byteSize());
        }

        public static final SequenceLayout reserved$layout() {
            return reserved$LAYOUT;
        }

        public static final long reserved$offset() {
            return 0L;
        }

        public static MemorySegment reserved(MemorySegment union) {
            return union.asSlice(0L, reserved$LAYOUT.byteSize());
        }

        public static void reserved(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)reserved$LAYOUT.byteSize());
        }

        public static long[] reserved$dimensions() {
            return reserved$DIMS;
        }

        public static byte reserved(MemorySegment union, long index0) {
            return reserved$ELEM_HANDLE.get(union, 0L, index0);
        }

        public static void reserved(MemorySegment union, long index0, byte fieldValue) {
            reserved$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(un.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return un.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)un.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)un.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return un.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(un.layout().byteSize() * elementCount, arena, cleanup);
        }

        public static class echo {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("id"), Lib.C_SHORT.withName("sequence")}).withName("$anon$94:2");
            private static final ValueLayout.OfShort id$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"id")});
            private static final long id$OFFSET = 0L;
            private static final ValueLayout.OfShort sequence$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sequence")});
            private static final long sequence$OFFSET = 2L;

            echo() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfShort id$layout() {
                return id$LAYOUT;
            }

            public static final long id$offset() {
                return 0L;
            }

            public static short id(MemorySegment struct) {
                return struct.get(id$LAYOUT, 0L);
            }

            public static void id(MemorySegment struct, short fieldValue) {
                struct.set(id$LAYOUT, 0L, fieldValue);
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
                return array.asSlice(echo.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return echo.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)echo.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)echo.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return echo.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(echo.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class frag {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_SHORT.withName("__unused"), Lib.C_SHORT.withName("mtu")}).withName("$anon$99:2");
            private static final ValueLayout.OfShort __unused$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"__unused")});
            private static final long __unused$OFFSET = 0L;
            private static final ValueLayout.OfShort mtu$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mtu")});
            private static final long mtu$OFFSET = 2L;

            frag() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfShort __unused$layout() {
                return __unused$LAYOUT;
            }

            public static final long __unused$offset() {
                return 0L;
            }

            public static short __unused(MemorySegment struct) {
                return struct.get(__unused$LAYOUT, 0L);
            }

            public static void __unused(MemorySegment struct, short fieldValue) {
                struct.set(__unused$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfShort mtu$layout() {
                return mtu$LAYOUT;
            }

            public static final long mtu$offset() {
                return 2L;
            }

            public static short mtu(MemorySegment struct) {
                return struct.get(mtu$LAYOUT, 2L);
            }

            public static void mtu(MemorySegment struct, short fieldValue) {
                struct.set(mtu$LAYOUT, 2L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(frag.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return frag.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)frag.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)frag.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return frag.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(frag.layout().byteSize() * elementCount, arena, cleanup);
            }
        }
    }
}

