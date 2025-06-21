/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.AddressLayout
 *  java.lang.foreign.Arena
 *  java.lang.foreign.FunctionDescriptor
 *  java.lang.foreign.Linker
 *  java.lang.foreign.Linker$Option
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.StructLayout
 *  java.lang.foreign.SymbolLookup
 *  java.lang.foreign.ValueLayout
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.shared;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.NoSuchElementException;
import java.util.function.Supplier;
import org.jetbrains.annotations.Nullable;

public class PanamaUtil {
    public static final char O_RDONLY = '\u0000';
    public static final char O_WRONLY = '\u0001';
    public static final char O_RDWR = '\u0002';
    public static final AddressLayout POINTER = ValueLayout.ADDRESS.withTargetLayout((MemoryLayout)MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)ValueLayout.JAVA_BYTE));
    public static final int ERRNO_ENOENT = 2;
    public static final int ERRNO_PERM_ERROR = 1;
    public static final int ERRNO_EAGAIN = 11;
    public static final int ERRNO_EINVAL = 22;

    public static String toString(MemorySegment segment) {
        if (segment == MemorySegment.NULL) {
            return null;
        }
        return segment.getString(0L);
    }

    public static MemorySegment lookup(String symbol) {
        return (MemorySegment)Linker.nativeLinker().defaultLookup().find(symbol).or(() -> SymbolLookup.loaderLookup().find(symbol)).orElseThrow(() -> new NoSuchElementException("Symbol not found: " + symbol));
    }

    public static MemorySegment allocateNullOrString(Arena arena, @Nullable String string) {
        if (string == null) {
            return MemorySegment.NULL;
        }
        return arena.allocateFrom(string);
    }

    public static long padSize(long size) {
        return size + 7L & 0xFFFFFFFFFFFFFFF8L;
    }

    public static long padSize(long size, long alignment) {
        return size + alignment - 1L & -alignment;
    }

    public static MemorySegment allocateIntRef(Arena arena, int value) {
        MemorySegment ref = arena.allocate((MemoryLayout)ValueLayout.JAVA_INT);
        ref.set(ValueLayout.JAVA_INT, 0L, value);
        return ref;
    }

    public static class HandlerWithErrno<R> {
        private MethodHandle handle = null;
        private final Supplier<MethodHandle> handleSupplier = () -> Linker.nativeLinker().downcallHandle(PanamaUtil.lookup(symbol), descriptor, new Linker.Option[]{Linker.Option.captureCallState((String[])new String[]{"errno"})});

        public HandlerWithErrno(String symbol, FunctionDescriptor descriptor) {
        }

        private MethodHandle getHandle() {
            if (this.handle == null) {
                this.handle = this.handleSupplier.get();
            }
            return this.handle;
        }

        public ResultAndErr<R> call(Arena arena, Object ... args) {
            StructLayout capturedStateLayout = Linker.Option.captureStateLayout();
            VarHandle errnoHandle = capturedStateLayout.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"errno")});
            MemorySegment capturedState = arena.allocate((MemoryLayout)capturedStateLayout);
            try {
                int errno;
                Object[] argsWithState = new Object[args.length + 1];
                argsWithState[0] = capturedState;
                System.arraycopy(args, 0, argsWithState, 1, args.length);
                Object result = this.getHandle().invokeWithArguments(argsWithState);
                try {
                    errno = errnoHandle.get(capturedState);
                } catch (Throwable throwable) {
                    errno = capturedState.get(ValueLayout.JAVA_INT, 0L);
                }
                return new ResultAndErr<Object>(result, errno);
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        }

        public ResultAndErr<R> call(Object ... args) {
            try (Arena arena = Arena.ofConfined();){
                ResultAndErr<R> resultAndErr = this.call(arena, args);
                return resultAndErr;
            }
        }
    }

    public record ResultAndErr<R>(R result, int err) {
        public boolean hasError() {
            return this.err != 0;
        }
    }
}

