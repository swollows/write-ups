/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.ShashDefinitions;
import me.bechberger.ebpf.runtime.SkcipherDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class NullDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long null_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="null_compress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int null_compress(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="null_crypt($arg1, $arg2, (const u8*)$arg3)")
    public static void null_crypt(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> dst, Ptr<Character> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="null_digest($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int null_digest(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int null_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="null_hash_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int null_hash_setkey(Ptr<CryptoDefinitions.crypto_shash> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int null_init(Ptr<ShashDefinitions.shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long null_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="null_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int null_setkey(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int null_skcipher_crypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="null_skcipher_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int null_skcipher_setkey(Ptr<CryptoDefinitions.crypto_skcipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="null_update($arg1, (const u8*)$arg2, $arg3)")
    public static int null_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }
}

