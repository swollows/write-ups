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
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Blake2sDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__blake2s_init($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void __blake2s_init(Ptr<blake2s_state> state2, @Unsigned long outlen, Ptr<?> key2, @Unsigned long keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blake2s_compress_generic($arg1, (const u8*)$arg2, $arg3, (const unsigned int)$arg4)")
    public static void blake2s_compress_generic(Ptr<blake2s_state> state2, Ptr<Character> block, @Unsigned long nblocks, @Unsigned int inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blake2s_final(Ptr<blake2s_state> state2, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blake2s_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blake2s_update($arg1, (const u8*)$arg2, $arg3)")
    public static void blake2s_update(Ptr<blake2s_state> state2, Ptr<Character> in, @Unsigned long inlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blake2s_compress($arg1, (const u8*)$arg2, $arg3, (const unsigned int)$arg4)")
    public static void blake2s_compress(Ptr<blake2s_state> state2, Ptr<Character> block, @Unsigned long nblocks, @Unsigned int inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blake2s_compress_avx512() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blake2s_compress_ssse3() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum blake2s_iv")
    public static enum blake2s_iv implements Enum<blake2s_iv>,
    TypedEnum<blake2s_iv, Integer>
    {
        BLAKE2S_IV0,
        BLAKE2S_IV1,
        BLAKE2S_IV2,
        BLAKE2S_IV3,
        BLAKE2S_IV4,
        BLAKE2S_IV5,
        BLAKE2S_IV6,
        BLAKE2S_IV7;

    }

    @Type(noCCodeGeneration=true, cType="struct blake2s_state")
    @NotUsableInJava
    public static class blake2s_state
    extends Struct {
        public @Unsigned int @Size(value=8) [] h;
        public @Unsigned int @Size(value=2) [] t;
        public @Unsigned int @Size(value=2) [] f;
        public char @Size(value=64) [] buf;
        public @Unsigned int buflen;
        public @Unsigned int outlen;
    }

    @Type(noCCodeGeneration=true, cType="enum blake2s_lengths")
    public static enum blake2s_lengths implements Enum<blake2s_lengths>,
    TypedEnum<blake2s_lengths, Integer>
    {
        BLAKE2S_BLOCK_SIZE,
        BLAKE2S_HASH_SIZE,
        BLAKE2S_KEY_SIZE,
        BLAKE2S_128_HASH_SIZE,
        BLAKE2S_160_HASH_SIZE,
        BLAKE2S_224_HASH_SIZE,
        BLAKE2S_256_HASH_SIZE;

    }
}

