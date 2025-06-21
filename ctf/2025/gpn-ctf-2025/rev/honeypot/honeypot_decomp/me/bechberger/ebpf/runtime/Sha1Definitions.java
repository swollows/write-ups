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

public final class Sha1Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sha1_init(Ptr<@Unsigned Integer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha1_transform($arg1, (const u8*)$arg2, $arg3)")
    public static void sha1_transform(Ptr<@Unsigned Integer> digest, String data, Ptr<@Unsigned Integer> array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha1_base_do_finalize(Ptr<ShashDefinitions.shash_desc> desc, Ptr<?> block_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha1_base_do_update($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int sha1_base_do_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<?> block_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha1_base_init(Ptr<ShashDefinitions.shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha1_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sha1_generic_block_fn($arg1, (const u8*)$arg2, $arg3)")
    public static void sha1_generic_block_fn(Ptr<sha1_state> sst, Ptr<Character> src, int blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sha1_generic_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sha1_generic_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sha1_state")
    @NotUsableInJava
    public static class sha1_state
    extends Struct {
        public @Unsigned int @Size(value=5) [] state;
        public @Unsigned long count;
        public char @Size(value=64) [] buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 unused; u8 type; }")
    @NotUsableInJava
    public static class sha1_of_xattr_of_anon_member_of_anon_member_of_ima_digest_data_and_xattr_of_ima_digest_data_hdr
    extends Struct {
        public char unused;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct sha1_hash")
    @NotUsableInJava
    public static class sha1_hash
    extends Struct {
        public char @Size(value=20) [] hash;
    }
}

