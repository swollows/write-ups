/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.FunctionDescriptor
 *  java.lang.foreign.Linker
 *  java.lang.foreign.Linker$Option
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemorySegment
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import me.bechberger.ebpf.bpf.raw.Lib;

public class cookie_close_function_t {
    private static final FunctionDescriptor $DESC = FunctionDescriptor.of((MemoryLayout)Lib.C_INT, (MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER});
    private static final MethodHandle UP$MH = Lib.upcallHandle(Function.class, "apply", $DESC);
    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC, new Linker.Option[0]);

    cookie_close_function_t() {
    }

    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    public static MemorySegment allocate(Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena, new Linker.Option[0]);
    }

    public static int invoke(MemorySegment funcPtr, MemorySegment __cookie) {
        try {
            return DOWN$MH.invokeExact(funcPtr, __cookie);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static interface Function {
        public int apply(MemorySegment var1);
    }
}

