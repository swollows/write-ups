/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.type;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;

@Type
public class Box<T> {
    private T value;

    @BuiltinBPFFunction(value="$arg1")
    public Box(T value) {
        this.value = value;
    }

    @BuiltinBPFFunction(value="$arg1")
    public static <T> Box<T> of(T value) {
        return new Box<T>(value);
    }

    @BuiltinBPFFunction(value="$this")
    public T val() {
        return this.value;
    }

    @BuiltinBPFFunction(value="$this = $arg1")
    public void set(T value) {
        this.value = value;
    }
}

