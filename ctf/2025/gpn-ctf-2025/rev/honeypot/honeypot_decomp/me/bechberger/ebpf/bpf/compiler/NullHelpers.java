/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.compiler;

import java.util.function.BiFunction;
import java.util.function.Function;
import org.jetbrains.annotations.Nullable;

public class NullHelpers {
    static <T, R> R callIfNonNull(@Nullable T t, Function<T, R> function) {
        return t == null ? null : (R)function.apply(t);
    }

    static <T, S, R> R callIfNonNull(@Nullable T t, @Nullable S s2, BiFunction<T, S, R> function) {
        return t == null ? null : (s2 == null ? null : function.apply(t, s2));
    }
}

