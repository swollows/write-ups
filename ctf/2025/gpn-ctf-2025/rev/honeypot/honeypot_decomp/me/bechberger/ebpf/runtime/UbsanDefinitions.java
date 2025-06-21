/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.TypeDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class UbsanDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_add_overflow(Ptr<?> data, Ptr<?> lhs, Ptr<?> rhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_alignment_assumption(Ptr<?> _data, @Unsigned long ptr, @Unsigned long align, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_builtin_unreachable(Ptr<?> _data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_divrem_overflow(Ptr<?> _data, Ptr<?> lhs, Ptr<?> rhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_load_invalid_value(Ptr<?> _data, Ptr<?> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_mul_overflow(Ptr<?> data, Ptr<?> lhs, Ptr<?> rhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_negate_overflow(Ptr<?> _data, Ptr<?> old_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_out_of_bounds(Ptr<?> _data, Ptr<?> index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_shift_out_of_bounds(Ptr<?> _data, Ptr<?> lhs, Ptr<?> rhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_sub_overflow(Ptr<?> data, Ptr<?> lhs, Ptr<?> rhs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_type_mismatch(Ptr<TypeDefinitions.type_mismatch_data> data, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ubsan_handle_type_mismatch_v1(Ptr<?> _data, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ubsan_epilogue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ubsan_prologue($arg1, (const u8*)$arg2)")
    public static void ubsan_prologue(Ptr<misc.source_location> loc, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ubsan_type_mismatch_common(Ptr<TypeDefinitions.type_mismatch_data_common> data, @Unsigned long ptr) {
        throw new MethodIsBPFRelatedFunction();
    }
}

