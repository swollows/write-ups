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

public class btf_dump_printf_fn_t {
    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER, Lib.C_POINTER, Lib.C_POINTER});
    private static final MethodHandle UP$MH = Lib.upcallHandle(Function.class, "apply", $DESC);
    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC, new Linker.Option[0]);

    btf_dump_printf_fn_t() {
    }

    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    public static MemorySegment allocate(Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena, new Linker.Option[0]);
    }

    public static void invoke(MemorySegment funcPtr, MemorySegment ctx, MemorySegment fmt, MemorySegment args) {
        try {
            DOWN$MH.invokeExact(funcPtr, ctx, fmt, args);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static interface Function {
        public void apply(MemorySegment var1, MemorySegment var2, MemorySegment var3);
    }
}

