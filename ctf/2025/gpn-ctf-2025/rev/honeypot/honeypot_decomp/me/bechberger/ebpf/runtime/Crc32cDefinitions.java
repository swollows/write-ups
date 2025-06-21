/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.ShashDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class Crc32cDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__crc32c_le($arg1, (const u8*)$arg2, $arg3)")
    public static @Unsigned int __crc32c_le(@Unsigned int crc, String p, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __crc32c_le_shift(@Unsigned int crc, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc32c_intel_cra_init(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc32c_intel_digest($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crc32c_intel_digest(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc32c_intel_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc32c_intel_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crc32c_intel_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc32c_intel_init(Ptr<ShashDefinitions.shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crc32c_intel_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc32c_intel_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc32c_intel_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crc32c_intel_setkey(Ptr<CryptoDefinitions.crypto_shash> hash2, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc32c_intel_update($arg1, (const u8*)$arg2, $arg3)")
    public static int crc32c_intel_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc32c_pcl_intel_digest($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crc32c_pcl_intel_digest(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc32c_pcl_intel_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crc32c_pcl_intel_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc32c_pcl_intel_update($arg1, (const u8*)$arg2, $arg3)")
    public static int crc32c_pcl_intel_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc32c_cra_init(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crc32c_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc32c_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }
}

