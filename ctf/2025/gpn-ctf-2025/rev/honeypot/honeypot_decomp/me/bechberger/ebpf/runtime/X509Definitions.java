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
import me.bechberger.ebpf.runtime.AsymmetricDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class X509Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_akid_note_kid($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_akid_note_kid(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_akid_note_name($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_akid_note_name(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_akid_note_serial($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_akid_note_serial(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_cert_parse((const void*)$arg1, $arg2)")
    public static Ptr<x509_certificate> x509_cert_parse(Ptr<?> data, @Unsigned long datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_decode_time($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int x509_decode_time(Ptr<@OriginalName(value="time64_t") Long> _t, @Unsigned long hdrlen, char tag, String value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_extract_key_data($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_extract_key_data(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_extract_name_segment($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_extract_name_segment(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x509_free_certificate(Ptr<x509_certificate> cert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_OID($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_OID(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_issuer($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_issuer(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_not_after($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_not_after(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_not_before($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_not_before(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_params($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_params(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_serial($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_serial(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_sig_algo($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_sig_algo(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_signature($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_signature(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_subject($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_subject(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_note_tbs_certificate($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_note_tbs_certificate(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_process_extension($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int x509_process_extension(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x509_check_for_self_signed(Ptr<x509_certificate> cert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x509_get_sig_params(Ptr<x509_certificate> cert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x509_key_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x509_key_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x509_key_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x509_load_certificate_list((const u8*)$arg1, (const long unsigned int)$arg2, (const struct key*)$arg3)")
    public static int x509_load_certificate_list(Ptr<Character> cert_list, @Unsigned long list_size, Ptr<runtime.key> keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct x509_parse_context")
    @NotUsableInJava
    public static class x509_parse_context
    extends Struct {
        public Ptr<x509_certificate> cert;
        public @Unsigned long data;
        public Ptr<?> key;
        public @Unsigned long key_size;
        public Ptr<?> params;
        public @Unsigned long params_size;
        public runtime.OID key_algo;
        public runtime.OID last_oid;
        public runtime.OID sig_algo;
        public char o_size;
        public char cn_size;
        public char email_size;
        public @Unsigned short o_offset;
        public @Unsigned short cn_offset;
        public @Unsigned short email_offset;
        public @Unsigned int raw_akid_size;
        public Ptr<?> raw_akid;
        public Ptr<?> akid_raw_issuer;
        public @Unsigned int akid_raw_issuer_size;
    }

    @Type(noCCodeGeneration=true, cType="enum x509_akid_actions")
    public static enum x509_akid_actions implements Enum<x509_akid_actions>,
    TypedEnum<x509_akid_actions, Integer>
    {
        ACT_x509_akid_note_kid,
        ACT_x509_akid_note_name,
        ACT_x509_akid_note_serial,
        ACT_x509_extract_name_segment,
        ACT_x509_note_OID,
        NR__x509_akid_actions;

    }

    @Type(noCCodeGeneration=true, cType="enum x509_actions")
    public static enum x509_actions implements Enum<x509_actions>,
    TypedEnum<x509_actions, Integer>
    {
        ACT_x509_extract_key_data,
        ACT_x509_extract_name_segment,
        ACT_x509_note_OID,
        ACT_x509_note_issuer,
        ACT_x509_note_not_after,
        ACT_x509_note_not_before,
        ACT_x509_note_params,
        ACT_x509_note_serial,
        ACT_x509_note_sig_algo,
        ACT_x509_note_signature,
        ACT_x509_note_subject,
        ACT_x509_note_tbs_certificate,
        ACT_x509_process_extension,
        NR__x509_actions;

    }

    @Type(noCCodeGeneration=true, cType="struct x509_certificate")
    @NotUsableInJava
    public static class x509_certificate
    extends Struct {
        public Ptr<x509_certificate> next;
        public Ptr<x509_certificate> signer;
        public Ptr<misc.public_key> pub;
        public Ptr<misc.public_key_signature> sig;
        public String issuer;
        public String subject;
        public Ptr<AsymmetricDefinitions.asymmetric_key_id> id;
        public Ptr<AsymmetricDefinitions.asymmetric_key_id> skid;
        public @OriginalName(value="time64_t") long valid_from;
        public @OriginalName(value="time64_t") long valid_to;
        public Ptr<?> tbs;
        public @Unsigned int tbs_size;
        public @Unsigned int raw_sig_size;
        public Ptr<?> raw_sig;
        public Ptr<?> raw_serial;
        public @Unsigned int raw_serial_size;
        public @Unsigned int raw_issuer_size;
        public Ptr<?> raw_issuer;
        public Ptr<?> raw_subject;
        public @Unsigned int raw_subject_size;
        public @Unsigned int raw_skid_size;
        public Ptr<?> raw_skid;
        public @Unsigned int index;
        public boolean seen;
        public boolean verified;
        public boolean self_signed;
        public boolean unsupported_sig;
        public boolean blacklisted;
    }
}

