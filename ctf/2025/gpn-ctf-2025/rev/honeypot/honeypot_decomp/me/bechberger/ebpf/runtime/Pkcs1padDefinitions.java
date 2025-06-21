/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.RsaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Pkcs1padDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_decrypt(Ptr<misc.akcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_decrypt_complete(Ptr<misc.akcipher_request> req2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pkcs1pad_decrypt_complete_cb(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_encrypt(Ptr<misc.akcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_encrypt_sign_complete(Ptr<misc.akcipher_request> req2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pkcs1pad_encrypt_sign_complete_cb(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pkcs1pad_exit_tfm(Ptr<CryptoDefinitions.crypto_akcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pkcs1pad_free(Ptr<misc.akcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pkcs1pad_get_max_size(Ptr<CryptoDefinitions.crypto_akcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_init_tfm(Ptr<CryptoDefinitions.crypto_akcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs1pad_set_priv_key($arg1, (const void*)$arg2, $arg3)")
    public static int pkcs1pad_set_priv_key(Ptr<CryptoDefinitions.crypto_akcipher> tfm, Ptr<?> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs1pad_set_pub_key($arg1, (const void*)$arg2, $arg3)")
    public static int pkcs1pad_set_pub_key(Ptr<CryptoDefinitions.crypto_akcipher> tfm, Ptr<?> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pkcs1pad_sg_set_buf(Ptr<runtime.scatterlist> sg2, Ptr<?> buf, @Unsigned long len, Ptr<runtime.scatterlist> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_sign(Ptr<misc.akcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_verify(Ptr<misc.akcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs1pad_verify_complete(Ptr<misc.akcipher_request> req2, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pkcs1pad_verify_complete_cb(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pkcs1pad_request")
    @NotUsableInJava
    public static class pkcs1pad_request
    extends Struct {
        public runtime.scatterlist @Size(value=2) [] in_sg;
        public runtime.scatterlist @Size(value=1) [] out_sg;
        public Ptr<@OriginalName(value="uint8_t") Character> in_buf;
        public Ptr<@OriginalName(value="uint8_t") Character> out_buf;
        public misc.akcipher_request child_req;
    }

    @Type(noCCodeGeneration=true, cType="struct pkcs1pad_inst_ctx")
    @NotUsableInJava
    public static class pkcs1pad_inst_ctx
    extends Struct {
        public CryptoDefinitions.crypto_akcipher_spawn spawn;
        public Ptr<RsaDefinitions.rsa_asn1_template> digest_info;
    }

    @Type(noCCodeGeneration=true, cType="struct pkcs1pad_ctx")
    @NotUsableInJava
    public static class pkcs1pad_ctx
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_akcipher> child;
        public @Unsigned int key_size;
    }
}

