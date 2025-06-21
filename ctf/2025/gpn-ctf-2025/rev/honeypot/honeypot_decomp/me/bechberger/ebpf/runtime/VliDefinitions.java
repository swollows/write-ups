/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.EccDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class VliDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_cmp((const long long unsigned int*)$arg1, (const long long unsigned int*)$arg2, $arg3)")
    public static int vli_cmp(Ptr<@Unsigned Long> left, Ptr<@Unsigned Long> right, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_from_be64($arg1, (const void*)$arg2, $arg3)")
    public static void vli_from_be64(Ptr<@Unsigned Long> dest, Ptr<?> src, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_from_le64($arg1, (const void*)$arg2, $arg3)")
    public static void vli_from_le64(Ptr<@Unsigned Long> dest, Ptr<?> src, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_is_zero((const long long unsigned int*)$arg1, $arg2)")
    public static boolean vli_is_zero(Ptr<@Unsigned Long> vli, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mmod_barrett($arg1, $arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void vli_mmod_barrett(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> product, Ptr<@Unsigned Long> mod, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mmod_fast($arg1, $arg2, (const struct ecc_curve*)$arg3)")
    public static boolean vli_mmod_fast(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> product, Ptr<EccDefinitions.ecc_curve> curve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mmod_fast_256($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void vli_mmod_fast_256(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> product, Ptr<@Unsigned Long> curve_prime, Ptr<@Unsigned Long> tmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mmod_fast_384($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void vli_mmod_fast_384(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> product, Ptr<@Unsigned Long> curve_prime, Ptr<@Unsigned Long> tmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mmod_slow($arg1, $arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void vli_mmod_slow(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> product, Ptr<@Unsigned Long> mod, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mmod_special($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void vli_mmod_special(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> product, Ptr<@Unsigned Long> mod, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mmod_special2($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void vli_mmod_special2(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> product, Ptr<@Unsigned Long> mod, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mod_add($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, (const long long unsigned int*)$arg4, $arg5)")
    public static void vli_mod_add(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> left, Ptr<@Unsigned Long> right, Ptr<@Unsigned Long> mod, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mod_inv($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void vli_mod_inv(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> input, Ptr<@Unsigned Long> mod, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mod_mult_fast($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, (const struct ecc_curve*)$arg4)")
    public static void vli_mod_mult_fast(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> left, Ptr<@Unsigned Long> right, Ptr<EccDefinitions.ecc_curve> curve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mod_mult_slow($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, (const long long unsigned int*)$arg4, $arg5)")
    public static void vli_mod_mult_slow(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> left, Ptr<@Unsigned Long> right, Ptr<@Unsigned Long> mod, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mod_square_fast($arg1, (const long long unsigned int*)$arg2, (const struct ecc_curve*)$arg3)")
    public static void vli_mod_square_fast(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> left, Ptr<EccDefinitions.ecc_curve> curve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mod_sub($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, (const long long unsigned int*)$arg4, $arg5)")
    public static void vli_mod_sub(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> left, Ptr<@Unsigned Long> right, Ptr<@Unsigned Long> mod, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_mult($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void vli_mult(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> left, Ptr<@Unsigned Long> right, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_num_bits((const long long unsigned int*)$arg1, $arg2)")
    public static @Unsigned int vli_num_bits(Ptr<@Unsigned Long> vli, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_sub($arg1, (const long long unsigned int*)$arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static @Unsigned long vli_sub(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> left, Ptr<@Unsigned Long> right, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vli_umult($arg1, (const long long unsigned int*)$arg2, $arg3, $arg4)")
    public static void vli_umult(Ptr<@Unsigned Long> result, Ptr<@Unsigned Long> left, @Unsigned int right, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }
}

