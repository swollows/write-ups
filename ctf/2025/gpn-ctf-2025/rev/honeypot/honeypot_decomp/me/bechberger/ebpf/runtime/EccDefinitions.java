/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EccDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__ecc_is_key_valid((const struct ecc_curve*)$arg1, (const long long unsigned int*)$arg2, $arg3)")
    public static int __ecc_is_key_valid(Ptr<ecc_curve> curve, Ptr<@Unsigned Long> private_key, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> ecc_alloc_digits_space(@Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ecc_point> ecc_alloc_point(@Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_digits_from_bytes((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void ecc_digits_from_bytes(Ptr<Character> in, @Unsigned int nbytes, Ptr<@Unsigned Long> out, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecc_free_point(Ptr<ecc_point> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecc_gen_privkey(@Unsigned int curve_id, @Unsigned int ndigits, Ptr<@Unsigned Long> private_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct ecc_curve*)ecc_get_curve($arg1))")
    public static Ptr<ecc_curve> ecc_get_curve(@Unsigned int curve_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct ecc_curve*)ecc_get_curve25519())")
    public static Ptr<ecc_curve> ecc_get_curve25519() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_is_key_valid($arg1, $arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static int ecc_is_key_valid(@Unsigned int curve_id, @Unsigned int ndigits, Ptr<@Unsigned Long> private_key, @Unsigned int private_key_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_is_pubkey_valid_full((const struct ecc_curve*)$arg1, $arg2)")
    public static int ecc_is_pubkey_valid_full(Ptr<ecc_curve> curve, Ptr<ecc_point> pk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_is_pubkey_valid_partial((const struct ecc_curve*)$arg1, $arg2)")
    public static int ecc_is_pubkey_valid_partial(Ptr<ecc_curve> curve, Ptr<ecc_point> pk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_make_pub_key($arg1, $arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static int ecc_make_pub_key(@Unsigned int curve_id, @Unsigned int ndigits, Ptr<@Unsigned Long> private_key, Ptr<@Unsigned Long> public_key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_point_add((const struct ecc_point*)$arg1, (const struct ecc_point*)$arg2, (const struct ecc_point*)$arg3, (const struct ecc_curve*)$arg4)")
    public static void ecc_point_add(Ptr<ecc_point> result, Ptr<ecc_point> p, Ptr<ecc_point> q, Ptr<ecc_curve> curve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_point_double_jacobian($arg1, $arg2, $arg3, (const struct ecc_curve*)$arg4)")
    public static void ecc_point_double_jacobian(Ptr<@Unsigned Long> x1, Ptr<@Unsigned Long> y1, Ptr<@Unsigned Long> z1, Ptr<ecc_curve> curve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_point_is_zero((const struct ecc_point*)$arg1)")
    public static boolean ecc_point_is_zero(Ptr<ecc_point> point) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_point_mult($arg1, (const struct ecc_point*)$arg2, (const long long unsigned int*)$arg3, $arg4, (const struct ecc_curve*)$arg5, $arg6)")
    public static void ecc_point_mult(Ptr<ecc_point> result, Ptr<ecc_point> point, Ptr<@Unsigned Long> scalar, Ptr<@Unsigned Long> initial_z, Ptr<ecc_curve> curve, @Unsigned int ndigits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecc_point_mult_shamir((const struct ecc_point*)$arg1, (const long long unsigned int*)$arg2, (const struct ecc_point*)$arg3, (const long long unsigned int*)$arg4, (const struct ecc_point*)$arg5, (const struct ecc_curve*)$arg6)")
    public static void ecc_point_mult_shamir(Ptr<ecc_point> result, Ptr<@Unsigned Long> u1, Ptr<ecc_point> p, Ptr<@Unsigned Long> u2, Ptr<ecc_point> q, Ptr<ecc_curve> curve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ecc_curve")
    @NotUsableInJava
    public static class ecc_curve
    extends Struct {
        public String name;
        public @Unsigned int nbits;
        public ecc_point g;
        public Ptr<@Unsigned Long> p;
        public Ptr<@Unsigned Long> n;
        public Ptr<@Unsigned Long> a;
        public Ptr<@Unsigned Long> b;
    }

    @Type(noCCodeGeneration=true, cType="struct ecc_point")
    @NotUsableInJava
    public static class ecc_point
    extends Struct {
        public Ptr<@Unsigned Long> x;
        public Ptr<@Unsigned Long> y;
        public char ndigits;
    }
}

