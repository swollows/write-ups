/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AeadDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SkcipherDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<skcipher_instance> skcipher_alloc_instance_simple(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_copy_iv(Ptr<skcipher_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skcipher_exit_tfm_simple(Ptr<CryptoDefinitions.crypto_skcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skcipher_free_instance_simple(Ptr<skcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_init_tfm_simple(Ptr<CryptoDefinitions.crypto_skcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_next_copy(Ptr<skcipher_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_next_slow(Ptr<skcipher_walk> walk, @Unsigned int bsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_noexport(Ptr<skcipher_request> req2, Ptr<?> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skcipher_noimport($arg1, (const void*)$arg2)")
    public static int skcipher_noimport(Ptr<skcipher_request> req2, Ptr<?> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_prepare_alg(Ptr<skcipher_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_prepare_alg_common(Ptr<skcipher_alg_common> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_register_instance(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<skcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skcipher_setkey_simple($arg1, (const u8*)$arg2, $arg3)")
    public static int skcipher_setkey_simple(Ptr<CryptoDefinitions.crypto_skcipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skcipher_setkey_unaligned($arg1, (const u8*)$arg2, $arg3)")
    public static int skcipher_setkey_unaligned(Ptr<CryptoDefinitions.crypto_skcipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_aead_common(Ptr<skcipher_walk> walk, Ptr<AeadDefinitions.aead_request> req2, boolean atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_aead_decrypt(Ptr<skcipher_walk> walk, Ptr<AeadDefinitions.aead_request> req2, boolean atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_aead_encrypt(Ptr<skcipher_walk> walk, Ptr<AeadDefinitions.aead_request> req2, boolean atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_async(Ptr<skcipher_walk> walk, Ptr<skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skcipher_walk_complete(Ptr<skcipher_walk> walk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_done(Ptr<skcipher_walk> walk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_first(Ptr<skcipher_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_next(Ptr<skcipher_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_skcipher(Ptr<skcipher_walk> walk, Ptr<skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skcipher_walk_virt(Ptr<skcipher_walk> walk, Ptr<skcipher_request> req2, boolean atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct skcipher_walk_buffer")
    @NotUsableInJava
    public static class skcipher_walk_buffer
    extends Struct {
        public ListDefinitions.list_head entry;
        public misc.scatter_walk dst;
        public @Unsigned int len;
        public Ptr<Character> data;
        public char @Size(value=0) [] buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct skcipher_ctx_simple")
    @NotUsableInJava
    public static class skcipher_ctx_simple
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_cipher> cipher;
    }

    @Type(noCCodeGeneration=true, cType="struct skcipher_walk")
    @NotUsableInJava
    public static class skcipher_walk
    extends Struct {
        public DstDefinitions.dst_of_skcipher_walk_and_src_of_skcipher_walk src;
        public DstDefinitions.dst_of_skcipher_walk_and_src_of_skcipher_walk dst;
        public misc.scatter_walk in;
        public @Unsigned int nbytes;
        public misc.scatter_walk out;
        public @Unsigned int total;
        public ListDefinitions.list_head buffers;
        public Ptr<Character> page;
        public Ptr<Character> buffer;
        public Ptr<Character> oiv;
        public Ptr<?> iv;
        public @Unsigned int ivsize;
        public int flags;
        public @Unsigned int blocksize;
        public @Unsigned int stride;
        public @Unsigned int alignmask;
    }

    @Type(noCCodeGeneration=true, cType="struct skcipher_instance")
    @NotUsableInJava
    public static class skcipher_instance
    extends Struct {
        public Ptr<?> free;
        @InlineUnion(value=13916)
        public  @InlineUnion(value=13916) SDefinitions.s_of_anon_member_of_skcipher_instance s;
        @InlineUnion(value=13916)
        public @InlineUnion(value=13916) skcipher_alg alg;
    }

    @Type(noCCodeGeneration=true, cType="struct skcipher_alg")
    @NotUsableInJava
    public static class skcipher_alg
    extends Struct {
        public Ptr<?> setkey;
        public Ptr<?> encrypt;
        public Ptr<?> decrypt;
        public Ptr<?> export;
        public Ptr<?> _import;
        public Ptr<?> init;
        public Ptr<?> exit;
        public @Unsigned int walksize;
        @InlineUnion(value=13900)
        public  @InlineUnion(value=13900) AnonDefinitions.anon_member_of_anon_member_of_skcipher_alg anon8$0;
        @InlineUnion(value=13900)
        public @InlineUnion(value=13900) skcipher_alg_common co;
    }

    @Type(noCCodeGeneration=true, cType="struct skcipher_alg_common")
    @NotUsableInJava
    public static class skcipher_alg_common
    extends Struct {
        public @Unsigned int min_keysize;
        public @Unsigned int max_keysize;
        public @Unsigned int ivsize;
        public @Unsigned int chunksize;
        public @Unsigned int statesize;
        public CryptoDefinitions.crypto_alg base;
    }

    @Type(noCCodeGeneration=true, cType="struct skcipher_request")
    @NotUsableInJava
    public static class skcipher_request
    extends Struct {
        public @Unsigned int cryptlen;
        public Ptr<Character> iv;
        public Ptr<runtime.scatterlist> src;
        public Ptr<runtime.scatterlist> dst;
        public CryptoDefinitions.crypto_async_request base;
        public Ptr<?> @Size(value=0) [] __ctx;
    }
}

