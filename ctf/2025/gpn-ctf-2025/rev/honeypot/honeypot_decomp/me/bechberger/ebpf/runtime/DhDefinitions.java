/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DhDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="dh_data_from_key($arg1, (const void**)$arg2)")
    public static @OriginalName(value="ssize_t") long dh_data_from_key(@OriginalName(value="key_serial_t") int keyid, Ptr<Ptr<?>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dh_safe_prime_create($arg1, $arg2, (const struct dh_safe_prime*)$arg3)")
    public static int __dh_safe_prime_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb, Ptr<dh_safe_prime> safe_prime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dh_clear_ctx(Ptr<dh_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_compute_value(Ptr<misc.kpp_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dh_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dh_exit_tfm(Ptr<CryptoDefinitions.crypto_kpp> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_ffdhe2048_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_ffdhe3072_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_ffdhe4096_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_ffdhe6144_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_ffdhe8192_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dh_max_size(Ptr<CryptoDefinitions.crypto_kpp> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dh_safe_prime_complete_req(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_safe_prime_compute_shared_secret(Ptr<misc.kpp_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dh_safe_prime_exit_tfm(Ptr<CryptoDefinitions.crypto_kpp> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dh_safe_prime_free_instance(Ptr<misc.kpp_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dh_safe_prime_gen_privkey((const struct dh_safe_prime*)$arg1, $arg2)")
    public static Ptr<?> dh_safe_prime_gen_privkey(Ptr<dh_safe_prime> safe_prime, Ptr<@Unsigned Integer> key_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_safe_prime_generate_public_key(Ptr<misc.kpp_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dh_safe_prime_init_tfm(Ptr<CryptoDefinitions.crypto_kpp> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dh_safe_prime_max_size(Ptr<CryptoDefinitions.crypto_kpp> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dh_safe_prime_set_secret($arg1, (const void*)$arg2, $arg3)")
    public static int dh_safe_prime_set_secret(Ptr<CryptoDefinitions.crypto_kpp> tfm, Ptr<?> buffer, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dh_set_secret($arg1, (const void*)$arg2, $arg3)")
    public static int dh_set_secret(Ptr<CryptoDefinitions.crypto_kpp> tfm, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dh_unpack_data($arg1, (const void*)$arg2, $arg3))")
    public static Ptr<Character> dh_unpack_data(Ptr<?> dst, Ptr<?> src, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dh_safe_prime_tfm_ctx")
    @NotUsableInJava
    public static class dh_safe_prime_tfm_ctx
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_kpp> dh_tfm;
    }

    @Type(noCCodeGeneration=true, cType="struct dh_safe_prime_instance_ctx")
    @NotUsableInJava
    public static class dh_safe_prime_instance_ctx
    extends Struct {
        public CryptoDefinitions.crypto_kpp_spawn dh_spawn;
        public Ptr<dh_safe_prime> safe_prime;
    }

    @Type(noCCodeGeneration=true, cType="struct dh_safe_prime")
    @NotUsableInJava
    public static class dh_safe_prime
    extends Struct {
        public @Unsigned int max_strength;
        public @Unsigned int p_size;
        public String p;
    }

    @Type(noCCodeGeneration=true, cType="struct dh_ctx")
    @NotUsableInJava
    public static class dh_ctx
    extends Struct {
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> p;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> g;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> xa;
    }
}

