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
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ShashDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="shash_default_digest($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int shash_default_digest(Ptr<shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shash_default_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int shash_default_finup(Ptr<shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shash_desc_zero(Ptr<shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shash_free_singlespawn_instance(Ptr<shash_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="shash_no_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int shash_no_setkey(Ptr<CryptoDefinitions.crypto_shash> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shash_prepare_alg(Ptr<shash_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shash_register_instance(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<shash_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shash_ahash_digest(Ptr<misc.ahash_request> req2, Ptr<shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shash_ahash_finup(Ptr<misc.ahash_request> req2, Ptr<shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shash_ahash_update(Ptr<misc.ahash_request> req2, Ptr<shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct shash_instance")
    @NotUsableInJava
    public static class shash_instance
    extends Struct {
        public Ptr<?> free;
        @InlineUnion(value=30681)
        public  @InlineUnion(value=30681) SDefinitions.s_of_anon_member_of_shash_instance s;
        @InlineUnion(value=30681)
        public @InlineUnion(value=30681) shash_alg alg;
    }

    @Type(noCCodeGeneration=true, cType="struct shash_alg")
    @NotUsableInJava
    public static class shash_alg
    extends Struct {
        public Ptr<?> init;
        public Ptr<?> update;
        public Ptr<?> _final;
        public Ptr<?> finup;
        public Ptr<?> digest;
        public Ptr<?> export;
        public Ptr<?> _import;
        public Ptr<?> setkey;
        public Ptr<?> init_tfm;
        public Ptr<?> exit_tfm;
        public Ptr<?> clone_tfm;
        public @Unsigned int descsize;
        @InlineUnion(value=5372)
        public  @InlineUnion(value=5372) AnonDefinitions.anon_member_of_anon_member_of_shash_alg anon12$0;
        @InlineUnion(value=5372)
        public  @InlineUnion(value=5372) HashDefinitions.hash_alg_common halg;
    }

    @Type(noCCodeGeneration=true, cType="struct shash_desc")
    @NotUsableInJava
    public static class shash_desc
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_shash> tfm;
        public Ptr<?> @Size(value=0) [] __ctx;
    }
}

