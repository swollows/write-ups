/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LzorleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> lzorle_alloc_ctx(Ptr<CryptoDefinitions.crypto_scomp> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lzorle_compress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int lzorle_compress(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lzorle_decompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int lzorle_decompress(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lzorle_exit(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lzorle_free_ctx(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lzorle_init(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lzorle_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lzorle_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lzorle_scompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int lzorle_scompress(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lzorle_sdecompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int lzorle_sdecompress(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct lzorle_ctx")
    @NotUsableInJava
    public static class lzorle_ctx
    extends Struct {
        public Ptr<?> lzorle_comp_mem;
    }
}

