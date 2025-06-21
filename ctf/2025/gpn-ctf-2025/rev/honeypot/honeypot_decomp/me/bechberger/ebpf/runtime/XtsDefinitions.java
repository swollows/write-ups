/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.SkcipherDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class XtsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xts_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xts_cts_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xts_cts_final($arg1, (int (*)(struct skcipher_request*))$arg2)")
    public static int xts_cts_final(Ptr<SkcipherDefinitions.skcipher_request> req2, Ptr<?> crypt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xts_decrypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xts_decrypt_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xts_encrypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xts_encrypt_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xts_exit_tfm(Ptr<CryptoDefinitions.crypto_skcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xts_free_instance(Ptr<SkcipherDefinitions.skcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xts_init_tfm(Ptr<CryptoDefinitions.crypto_skcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xts_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xts_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xts_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int xts_setkey(Ptr<CryptoDefinitions.crypto_skcipher> parent, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xts_xor_tweak(Ptr<SkcipherDefinitions.skcipher_request> req2, boolean second_pass, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xts_request_ctx")
    @NotUsableInJava
    public static class xts_request_ctx
    extends Struct {
        public runtime.le128 t;
        public Ptr<runtime.scatterlist> tail;
        public runtime.scatterlist @Size(value=2) [] sg;
        public SkcipherDefinitions.skcipher_request subreq;
    }

    @Type(noCCodeGeneration=true, cType="struct xts_instance_ctx")
    @NotUsableInJava
    public static class xts_instance_ctx
    extends Struct {
        public CryptoDefinitions.crypto_skcipher_spawn spawn;
        public CryptoDefinitions.crypto_cipher_spawn tweak_spawn;
    }

    @Type(noCCodeGeneration=true, cType="struct xts_tfm_ctx")
    @NotUsableInJava
    public static class xts_tfm_ctx
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_skcipher> child;
        public Ptr<CryptoDefinitions.crypto_cipher> tweak;
    }
}

