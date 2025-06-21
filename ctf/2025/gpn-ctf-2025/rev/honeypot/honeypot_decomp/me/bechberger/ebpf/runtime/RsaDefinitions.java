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
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RsaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_get_d($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int rsa_get_d(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_get_dp($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int rsa_get_dp(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_get_dq($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int rsa_get_dq(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_get_e($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int rsa_get_e(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_get_n($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int rsa_get_n(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_get_p($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int rsa_get_p(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_get_q($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int rsa_get_q(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_get_qinv($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int rsa_get_qinv(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_parse_priv_key($arg1, (const void*)$arg2, $arg3)")
    public static int rsa_parse_priv_key(Ptr<rsa_key> rsa_key2, Ptr<?> key2, @Unsigned int key_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_parse_pub_key($arg1, (const void*)$arg2, $arg3)")
    public static int rsa_parse_pub_key(Ptr<rsa_key> rsa_key2, Ptr<?> key2, @Unsigned int key_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rsa_check_payload(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> x, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rsa_dec(Ptr<misc.akcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rsa_enc(Ptr<misc.akcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rsa_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rsa_exit_tfm(Ptr<CryptoDefinitions.crypto_akcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rsa_free_mpi_key(Ptr<rsa_mpi_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rsa_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int rsa_max_size(Ptr<CryptoDefinitions.crypto_akcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_set_priv_key($arg1, (const void*)$arg2, $arg3)")
    public static int rsa_set_priv_key(Ptr<CryptoDefinitions.crypto_akcipher> tfm, Ptr<?> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rsa_set_pub_key($arg1, (const void*)$arg2, $arg3)")
    public static int rsa_set_pub_key(Ptr<CryptoDefinitions.crypto_akcipher> tfm, Ptr<?> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rsa_asn1_template")
    @NotUsableInJava
    public static class rsa_asn1_template
    extends Struct {
        public String name;
        public Ptr<Character> data;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct rsa_mpi_key")
    @NotUsableInJava
    public static class rsa_mpi_key
    extends Struct {
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> n;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> e;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> d;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> p;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> q;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> dp;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> dq;
        public @OriginalName(value="MPI") Ptr<misc.gcry_mpi> qinv;
    }

    @Type(noCCodeGeneration=true, cType="struct rsa_key")
    @NotUsableInJava
    public static class rsa_key
    extends Struct {
        public Ptr<Character> n;
        public Ptr<Character> e;
        public Ptr<Character> d;
        public Ptr<Character> p;
        public Ptr<Character> q;
        public Ptr<Character> dp;
        public Ptr<Character> dq;
        public Ptr<Character> qinv;
        public @Unsigned long n_sz;
        public @Unsigned long e_sz;
        public @Unsigned long d_sz;
        public @Unsigned long p_sz;
        public @Unsigned long q_sz;
        public @Unsigned long dp_sz;
        public @Unsigned long dq_sz;
        public @Unsigned long qinv_sz;
    }
}

