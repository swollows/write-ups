/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
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

public final class LskcipherDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<lskcipher_instance> lskcipher_alloc_instance_simple(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lskcipher_exit_tfm_simple(Ptr<CryptoDefinitions.crypto_lskcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lskcipher_free_instance_simple(Ptr<lskcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lskcipher_init_tfm_simple(Ptr<CryptoDefinitions.crypto_lskcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lskcipher_register_instance(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<lskcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lskcipher_setkey_simple($arg1, (const u8*)$arg2, $arg3)")
    public static int lskcipher_setkey_simple(Ptr<CryptoDefinitions.crypto_lskcipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lskcipher_setkey_unaligned($arg1, (const u8*)$arg2, $arg3)")
    public static int lskcipher_setkey_unaligned(Ptr<CryptoDefinitions.crypto_lskcipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<lskcipher_instance> lskcipher_alloc_instance_simple2(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lskcipher_exit_tfm_simple2(Ptr<CryptoDefinitions.crypto_lskcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lskcipher_free_instance_simple2(Ptr<lskcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lskcipher_init_tfm_simple2(Ptr<CryptoDefinitions.crypto_lskcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lskcipher_setkey_simple2($arg1, (const u8*)$arg2, $arg3)")
    public static int lskcipher_setkey_simple2(Ptr<CryptoDefinitions.crypto_lskcipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct lskcipher_instance")
    @NotUsableInJava
    public static class lskcipher_instance
    extends Struct {
        public Ptr<?> free;
        @InlineUnion(value=13886)
        public  @InlineUnion(value=13886) SDefinitions.s_of_anon_member_of_aead_instance_and_s_of_anon_member_of_lskcipher_instance s;
        @InlineUnion(value=13886)
        public @InlineUnion(value=13886) lskcipher_alg alg;
    }

    @Type(noCCodeGeneration=true, cType="struct lskcipher_alg")
    @NotUsableInJava
    public static class lskcipher_alg
    extends Struct {
        public Ptr<?> setkey;
        public Ptr<?> encrypt;
        public Ptr<?> decrypt;
        public Ptr<?> init;
        public Ptr<?> exit;
        public SkcipherDefinitions.skcipher_alg_common co;
    }
}

