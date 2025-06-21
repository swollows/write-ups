/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.type;

import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import org.jetbrains.annotations.Nullable;

public class Ptr<T> {
    @BuiltinBPFFunction(value="(*($this))")
    @NotUsableInJava
    public T val() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="&($arg1)")
    @NotUsableInJava
    public static <T> Ptr<T> of(@Nullable T value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="((void*)0)")
    @NotUsableInJava
    public static Ptr<?> ofNull() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="(($T1*)$this)")
    @NotUsableInJava
    public <S> Ptr<S> cast() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="(($T1*)*$this)")
    @NotUsableInJava
    public <S> Ptr<S> castValPtr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($this + $arg1)")
    @NotUsableInJava
    public Ptr<T> add(long increment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($this[$arg1])")
    @NotUsableInJava
    public T get(int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($this)[$arg1] = $arg2")
    @NotUsableInJava
    public void set(int index2, T value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="*($this) = $arg1")
    @NotUsableInJava
    public void set(T value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static <T> Ptr<T> of(T[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static Ptr<Integer> of(int[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static Ptr<Long> of(long[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static Ptr<Short> of(short[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static Ptr<Byte> of(byte[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="$arg1")
    @NotUsableInJava
    public static Ptr<Character> of(String value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static Ptr<Character> of(char[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static Ptr<Float> of(float[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static Ptr<Double> of(double[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1)")
    @NotUsableInJava
    public static Ptr<Boolean> of(boolean[] value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="((void*)(u64)$arg1)")
    @NotUsableInJava
    public static Ptr<?> voidPointer(long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="((void*)$this)")
    @NotUsableInJava
    public Ptr<?> asVoidPointer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="(long)($this)")
    @NotUsableInJava
    public long asLong() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="$this < $arg1")
    @NotUsableInJava
    public boolean lessThan(Ptr<?> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="$this <= $arg1")
    @NotUsableInJava
    public boolean lessOrEqual(Ptr<?> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="((void*)$this) > ((void*)$arg1)")
    @NotUsableInJava
    public boolean greaterThan(Ptr<?> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="$this >= $arg1")
    @NotUsableInJava
    public boolean greaterOrEqual(Ptr<?> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="((void*)$arg1)")
    @NotUsableInJava
    public static Ptr<?> asVoidPointer(Object value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($T1*)($arg1)")
    @NotUsableInJava
    public static <T> Ptr<T> asPtr(long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="(u8*)($this)")
    @NotUsableInJava
    public String asString() {
        throw new MethodIsBPFRelatedFunction();
    }
}

