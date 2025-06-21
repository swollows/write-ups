/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AeadDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aead_register_instance(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<aead_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aead_exit_geniv(Ptr<CryptoDefinitions.crypto_aead> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aead_instance> aead_geniv_alloc(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aead_geniv_free(Ptr<aead_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aead_geniv_setauthsize(Ptr<CryptoDefinitions.crypto_aead> tfm, @Unsigned int authsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aead_geniv_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int aead_geniv_setkey(Ptr<CryptoDefinitions.crypto_aead> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aead_init_geniv(Ptr<CryptoDefinitions.crypto_aead> aead) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct aead_geniv_ctx")
    @NotUsableInJava
    public static class aead_geniv_ctx
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<CryptoDefinitions.crypto_aead> child;
        public Ptr<CryptoDefinitions.crypto_sync_skcipher> sknull;
        public char @Size(value=0) [] salt;
    }

    @Type(noCCodeGeneration=true, cType="struct aead_instance")
    @NotUsableInJava
    public static class aead_instance
    extends Struct {
        public Ptr<?> free;
        @InlineUnion(value=13773)
        public  @InlineUnion(value=13773) SDefinitions.s_of_anon_member_of_aead_instance_and_s_of_anon_member_of_lskcipher_instance s;
        @InlineUnion(value=13773)
        public @InlineUnion(value=13773) aead_alg alg;
    }

    @Type(noCCodeGeneration=true, cType="struct aead_alg")
    @NotUsableInJava
    public static class aead_alg
    extends Struct {
        public Ptr<?> setkey;
        public Ptr<?> setauthsize;
        public Ptr<?> encrypt;
        public Ptr<?> decrypt;
        public Ptr<?> init;
        public Ptr<?> exit;
        public @Unsigned int ivsize;
        public @Unsigned int maxauthsize;
        public @Unsigned int chunksize;
        public CryptoDefinitions.crypto_alg base;
    }

    @Type(noCCodeGeneration=true, cType="struct aead_request")
    @NotUsableInJava
    public static class aead_request
    extends Struct {
        public CryptoDefinitions.crypto_async_request base;
        public @Unsigned int assoclen;
        public @Unsigned int cryptlen;
        public Ptr<Character> iv;
        public Ptr<runtime.scatterlist> src;
        public Ptr<runtime.scatterlist> dst;
        public Ptr<?> @Size(value=0) [] __ctx;
    }
}

