/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AeadDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class GcmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_dec_hash_continue(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gcm_decrypt_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_enc_copy_hash(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_encrypt_continue(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gcm_encrypt_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_hash(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_hash_assoc_continue(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gcm_hash_assoc_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_hash_assoc_remain_continue(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gcm_hash_assoc_remain_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_hash_crypt_continue(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gcm_hash_crypt_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_hash_crypt_remain_continue(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gcm_hash_crypt_remain_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_hash_init_continue(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gcm_hash_init_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gcm_hash_len(Ptr<AeadDefinitions.aead_request> req2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gcm_hash_len_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct gcm_instance_ctx")
    @NotUsableInJava
    public static class gcm_instance_ctx
    extends Struct {
        public CryptoDefinitions.crypto_skcipher_spawn ctr;
        public CryptoDefinitions.crypto_ahash_spawn ghash;
    }
}

