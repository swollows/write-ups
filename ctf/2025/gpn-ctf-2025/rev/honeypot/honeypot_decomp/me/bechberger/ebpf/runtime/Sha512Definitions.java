/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ShashDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Sha512Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha512_base_do_finalize(Ptr<ShashDefinitions.shash_desc> desc, Ptr<?> block_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_base_do_update($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int sha512_base_do_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<?> block_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha512_base_init(Ptr<ShashDefinitions.shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha512_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_generic_block_fn($arg1, (const u8*)$arg2, $arg3)")
    public static void sha512_generic_block_fn(Ptr<sha512_state> sst, Ptr<Character> src, int blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sha512_generic_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha512_generic_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_transform($arg1, (const u8*)$arg2)")
    public static void sha512_transform(Ptr<@Unsigned Long> state2, Ptr<Character> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha512_avx2_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_avx2_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int sha512_avx2_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_avx2_update($arg1, (const u8*)$arg2, $arg3)")
    public static int sha512_avx2_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha512_avx_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_avx_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int sha512_avx_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_avx_update($arg1, (const u8*)$arg2, $arg3)")
    public static int sha512_avx_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_finup($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int sha512_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out, Ptr<?> sha512_xform) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha512_ssse3_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_ssse3_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int sha512_ssse3_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sha512_ssse3_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha512_ssse3_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_ssse3_update($arg1, (const u8*)$arg2, $arg3)")
    public static int sha512_ssse3_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sha512_transform_avx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sha512_transform_rorx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sha512_transform_ssse3() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha512_update($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int sha512_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<?> sha512_xform) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sha512_state")
    @NotUsableInJava
    public static class sha512_state
    extends Struct {
        public @Unsigned long @Size(value=8) [] state;
        public @Unsigned long @Size(value=2) [] count;
        public char @Size(value=128) [] buf;
    }
}

