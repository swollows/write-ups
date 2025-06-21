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
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class AsymmetricDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__asymmetric_key_hex_to_key_id((const u8*)$arg1, $arg2, $arg3)")
    public static int __asymmetric_key_hex_to_key_id(String id, Ptr<asymmetric_key_id> match_id, @Unsigned long hexlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void asymmetric_key_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_cmp((const struct key*)$arg1, (const struct key_match_data*)$arg2)")
    public static boolean asymmetric_key_cmp(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_cmp_name((const struct key*)$arg1, (const struct key_match_data*)$arg2)")
    public static boolean asymmetric_key_cmp_name(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_cmp_partial((const struct key*)$arg1, (const struct key_match_data*)$arg2)")
    public static boolean asymmetric_key_cmp_partial(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_describe((const struct key*)$arg1, $arg2)")
    public static void asymmetric_key_describe(Ptr<runtime.key> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void asymmetric_key_destroy(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_eds_op($arg1, (const void*)$arg2, $arg3)")
    public static int asymmetric_key_eds_op(Ptr<KernelDefinitions.kernel_pkey_params> params, Ptr<?> in, Ptr<?> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void asymmetric_key_free_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_generate_id((const void*)$arg1, $arg2, (const void*)$arg3, $arg4)")
    public static Ptr<asymmetric_key_id> asymmetric_key_generate_id(Ptr<?> val_1, @Unsigned long len_1, Ptr<?> val_2, @Unsigned long len_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_hex_to_key_id((const u8*)$arg1)")
    public static Ptr<asymmetric_key_id> asymmetric_key_hex_to_key_id(String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_id_partial((const struct asymmetric_key_id*)$arg1, (const struct asymmetric_key_id*)$arg2)")
    public static boolean asymmetric_key_id_partial(Ptr<asymmetric_key_id> kid1, Ptr<asymmetric_key_id> kid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_id_same((const struct asymmetric_key_id*)$arg1, (const struct asymmetric_key_id*)$arg2)")
    public static boolean asymmetric_key_id_same(Ptr<asymmetric_key_id> kid1, Ptr<asymmetric_key_id> kid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int asymmetric_key_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void asymmetric_key_match_free(Ptr<KeyDefinitions.key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int asymmetric_key_match_preparse(Ptr<KeyDefinitions.key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int asymmetric_key_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_key_verify_signature($arg1, (const void*)$arg2, (const void*)$arg3)")
    public static int asymmetric_key_verify_signature(Ptr<KernelDefinitions.kernel_pkey_params> params, Ptr<?> in, Ptr<?> in2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_lookup_restriction((const u8*)$arg1)")
    public static Ptr<KeyDefinitions.key_restriction> asymmetric_lookup_restriction(String restriction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asymmetric_verify($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int asymmetric_verify(Ptr<runtime.key> keyring, String sig, int siglen, String data, int datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct asymmetric_key_parser")
    @NotUsableInJava
    public static class asymmetric_key_parser
    extends Struct {
        public ListDefinitions.list_head link;
        public Ptr<runtime.module> owner;
        public String name;
        public Ptr<?> parse;
    }

    @Type(noCCodeGeneration=true, cType="struct asymmetric_key_subtype")
    @NotUsableInJava
    public static class asymmetric_key_subtype
    extends Struct {
        public Ptr<runtime.module> owner;
        public String name;
        public @Unsigned short name_len;
        public Ptr<?> describe;
        public Ptr<?> destroy;
        public Ptr<?> query;
        public Ptr<?> eds_op;
        public Ptr<?> verify_signature;
    }

    @Type(noCCodeGeneration=true, cType="struct asymmetric_key_ids")
    @NotUsableInJava
    public static class asymmetric_key_ids
    extends Struct {
        public Ptr<?> @Size(value=3) [] id;
    }

    @Type(noCCodeGeneration=true, cType="enum asymmetric_payload_bits")
    public static enum asymmetric_payload_bits implements Enum<asymmetric_payload_bits>,
    TypedEnum<asymmetric_payload_bits, Integer>
    {
        asym_crypto,
        asym_subtype,
        asym_key_ids,
        asym_auth;

    }

    @Type(noCCodeGeneration=true, cType="struct asymmetric_key_id")
    @NotUsableInJava
    public static class asymmetric_key_id
    extends Struct {
        public @Unsigned short len;
        public char @Size(value=0) [] data;
    }
}

