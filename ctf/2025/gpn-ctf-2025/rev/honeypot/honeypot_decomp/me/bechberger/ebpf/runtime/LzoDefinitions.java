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
import me.bechberger.ebpf.runtime.SquashfsDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LzoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> lzo_alloc_ctx(Ptr<CryptoDefinitions.crypto_scomp> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lzo_compress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int lzo_compress(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lzo_decompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int lzo_decompress(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lzo_exit(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lzo_free_ctx(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lzo_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lzo_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lzo_scompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int lzo_scompress(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lzo_sdecompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int lzo_sdecompress(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lzo_free(Ptr<?> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lzo_uncompress(Ptr<SquashfsDefinitions.squashfs_sb_info> msblk, Ptr<?> strm, Ptr<runtime.bio> bio2, int offset, int length, Ptr<SquashfsDefinitions.squashfs_page_actor> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct lzo_ctx")
    @NotUsableInJava
    public static class lzo_ctx
    extends Struct {
        public Ptr<?> lzo_comp_mem;
    }
}

