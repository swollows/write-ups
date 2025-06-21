/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.FunctionDescriptor
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.ValueLayout
 */
package me.bechberger.ebpf.shared;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.file.Path;
import me.bechberger.ebpf.shared.PanamaUtil;

public class LibC {
    private static final PanamaUtil.HandlerWithErrno<Integer> OPEN_HANDLE = new PanamaUtil.HandlerWithErrno("open", FunctionDescriptor.of((MemoryLayout)ValueLayout.JAVA_INT, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER, ValueLayout.JAVA_INT}));
    private static final PanamaUtil.HandlerWithErrno<Void> CLOSE_HANDLE = new PanamaUtil.HandlerWithErrno("close", FunctionDescriptor.of((MemoryLayout)ValueLayout.JAVA_INT, (MemoryLayout[])new MemoryLayout[]{ValueLayout.JAVA_INT}));
    private static final GroupLayout RLIMIT_LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{ValueLayout.JAVA_LONG.withName("rlim_cur"), ValueLayout.JAVA_LONG.withName("rlim_max")});
    public static final int RLIMIT_MEMLOCK = 8;
    private static final PanamaUtil.HandlerWithErrno<Void> SET_RLIMIT_HANDLER = new PanamaUtil.HandlerWithErrno("setrlimit", FunctionDescriptor.of((MemoryLayout)ValueLayout.JAVA_INT, (MemoryLayout[])new MemoryLayout[]{ValueLayout.JAVA_INT, PanamaUtil.POINTER}));

    public static PanamaUtil.ResultAndErr<Integer> open(Path path2, int flags) {
        try (Arena arena = Arena.ofConfined();){
            PanamaUtil.ResultAndErr<Integer> resultAndErr = OPEN_HANDLE.call(arena.allocateFrom(path2.toString()), flags);
            return resultAndErr;
        }
    }

    public static PanamaUtil.ResultAndErr<Void> close(int fd2) {
        return CLOSE_HANDLE.call(fd2);
    }

    public static PanamaUtil.ResultAndErr<Void> setrlimit(int resource2, long softLimit, long hardLimit) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment rlimit2 = arena.allocate((MemoryLayout)RLIMIT_LAYOUT);
            rlimit2.set(ValueLayout.JAVA_LONG, RLIMIT_LAYOUT.byteOffset(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rlim_cur")}), softLimit);
            rlimit2.set(ValueLayout.JAVA_LONG, RLIMIT_LAYOUT.byteOffset(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rlim_max")}), hardLimit);
            PanamaUtil.ResultAndErr<Void> resultAndErr = SET_RLIMIT_HANDLER.call(resource2, rlimit2);
            return resultAndErr;
        }
    }

    public static PanamaUtil.ResultAndErr<Void> setRlimitMemlockToInfinity() {
        return LibC.setrlimit(8, -1L, -1L);
    }
}

