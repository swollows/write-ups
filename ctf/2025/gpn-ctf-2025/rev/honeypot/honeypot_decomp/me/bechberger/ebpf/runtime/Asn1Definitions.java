/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Asn1Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="asn1_ber_decoder((const struct asn1_decoder*)$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int asn1_ber_decoder(Ptr<asn1_decoder> decoder, Ptr<?> context2, String data, @Unsigned long datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asn1_encode_boolean($arg1, (const u8*)$arg2, $arg3)")
    public static String asn1_encode_boolean(String data, String end_data, boolean val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asn1_encode_integer($arg1, (const u8*)$arg2, $arg3)")
    public static String asn1_encode_integer(String data, String end_data, long integer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int asn1_encode_length(Ptr<String> data, Ptr<Integer> data_len, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asn1_encode_octet_string($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static String asn1_encode_octet_string(String data, String end_data, String string, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asn1_encode_oid($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static String asn1_encode_oid(String data, String end_data, Ptr<@Unsigned Integer> oid, int oid_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asn1_encode_sequence($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static String asn1_encode_sequence(String data, String end_data, String seq, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="asn1_encode_tag($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static String asn1_encode_tag(String data, String end_data, @Unsigned int tag, String string, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum asn1_opcode")
    public static enum asn1_opcode implements Enum<asn1_opcode>,
    TypedEnum<asn1_opcode, Integer>
    {
        ASN1_OP_MATCH,
        ASN1_OP_MATCH_OR_SKIP,
        ASN1_OP_MATCH_ACT,
        ASN1_OP_MATCH_ACT_OR_SKIP,
        ASN1_OP_MATCH_JUMP,
        ASN1_OP_MATCH_JUMP_OR_SKIP,
        ASN1_OP_MATCH_ANY,
        ASN1_OP_MATCH_ANY_OR_SKIP,
        ASN1_OP_MATCH_ANY_ACT,
        ASN1_OP_MATCH_ANY_ACT_OR_SKIP,
        ASN1_OP_COND_MATCH_OR_SKIP,
        ASN1_OP_COND_MATCH_ACT_OR_SKIP,
        ASN1_OP_COND_MATCH_JUMP_OR_SKIP,
        ASN1_OP_COND_MATCH_ANY,
        ASN1_OP_COND_MATCH_ANY_OR_SKIP,
        ASN1_OP_COND_MATCH_ANY_ACT,
        ASN1_OP_COND_MATCH_ANY_ACT_OR_SKIP,
        ASN1_OP_COND_FAIL,
        ASN1_OP_COMPLETE,
        ASN1_OP_ACT,
        ASN1_OP_MAYBE_ACT,
        ASN1_OP_END_SEQ,
        ASN1_OP_END_SET,
        ASN1_OP_END_SEQ_OF,
        ASN1_OP_END_SET_OF,
        ASN1_OP_END_SEQ_ACT,
        ASN1_OP_END_SET_ACT,
        ASN1_OP_END_SEQ_OF_ACT,
        ASN1_OP_END_SET_OF_ACT,
        ASN1_OP_RETURN,
        ASN1_OP__NR;

    }

    @Type(noCCodeGeneration=true, cType="struct asn1_decoder")
    @NotUsableInJava
    public static class asn1_decoder
    extends Struct {
        public String machine;
        public @Unsigned long machlen;
        public Ptr<@OriginalName(value="asn1_action_t") Ptr<?>> actions;
    }

    @Type(noCCodeGeneration=true, cType="enum asn1_tag")
    public static enum asn1_tag implements Enum<asn1_tag>,
    TypedEnum<asn1_tag, Integer>
    {
        ASN1_EOC,
        ASN1_BOOL,
        ASN1_INT,
        ASN1_BTS,
        ASN1_OTS,
        ASN1_NULL,
        ASN1_OID,
        ASN1_ODE,
        ASN1_EXT,
        ASN1_REAL,
        ASN1_ENUM,
        ASN1_EPDV,
        ASN1_UTF8STR,
        ASN1_RELOID,
        ASN1_SEQ,
        ASN1_SET,
        ASN1_NUMSTR,
        ASN1_PRNSTR,
        ASN1_TEXSTR,
        ASN1_VIDSTR,
        ASN1_IA5STR,
        ASN1_UNITIM,
        ASN1_GENTIM,
        ASN1_GRASTR,
        ASN1_VISSTR,
        ASN1_GENSTR,
        ASN1_UNISTR,
        ASN1_CHRSTR,
        ASN1_BMPSTR,
        ASN1_LONG_TAG;

    }

    @Type(noCCodeGeneration=true, cType="enum asn1_method")
    public static enum asn1_method implements Enum<asn1_method>,
    TypedEnum<asn1_method, Integer>
    {
        ASN1_PRIM,
        ASN1_CONS;

    }

    @Type(noCCodeGeneration=true, cType="enum asn1_class")
    public static enum asn1_class implements Enum<asn1_class>,
    TypedEnum<asn1_class, Integer>
    {
        ASN1_UNIV,
        ASN1_APPL,
        ASN1_CONT,
        ASN1_PRIV;

    }
}

