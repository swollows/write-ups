/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class JentDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_apt_init(Ptr<misc.rand_data> ec, @Unsigned int osr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_apt_insert(Ptr<misc.rand_data> ec, @Unsigned int delta_masked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_apt_reset(Ptr<misc.rand_data> ec, @Unsigned int delta_masked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_condition_data(Ptr<misc.rand_data> ec, @Unsigned long time, int stuck) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long jent_delta(@Unsigned long prev, @Unsigned long next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.rand_data> jent_entropy_collector_alloc(@Unsigned int osr, @Unsigned int flags, Ptr<?> hash_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_entropy_collector_free(Ptr<misc.rand_data> entropy_collector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_entropy_init(@Unsigned int osr, @Unsigned int flags, Ptr<?> hash_state, Ptr<misc.rand_data> p_ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_gen_entropy(Ptr<misc.rand_data> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_get_nstime(Ptr<@Unsigned Long> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_hash_time(Ptr<?> hash_state, @Unsigned long time, Ptr<Character> addtl, @Unsigned int addtl_len, @Unsigned long hash_loop_cnt, @Unsigned int stuck) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int jent_health_failure(Ptr<misc.rand_data> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_kcapi_cleanup(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_kcapi_init(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="jent_kcapi_random($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int jent_kcapi_random(Ptr<CryptoDefinitions.crypto_rng> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> rdata, @Unsigned int dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="jent_kcapi_reset($arg1, (const u8*)$arg2, $arg3)")
    public static int jent_kcapi_reset(Ptr<CryptoDefinitions.crypto_rng> tfm, Ptr<Character> seed, @Unsigned int slen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> jent_kvzalloc(@Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_kvzfree(Ptr<?> ptr, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long jent_loop_shuffle(@Unsigned int bits, @Unsigned int min) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_measure_jitter(Ptr<misc.rand_data> ec, Ptr<@Unsigned Long> ret_current_delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_memaccess(Ptr<misc.rand_data> ec, @Unsigned long loop_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_mod_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_rct_insert(Ptr<misc.rand_data> ec, int stuck) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_read_entropy(Ptr<misc.rand_data> ec, String data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_read_random_block(Ptr<?> hash_state, String dst, @Unsigned int dst_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jent_stuck(Ptr<misc.rand_data> ec, @Unsigned long current_delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> jent_zalloc(@Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jent_zfree(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }
}

